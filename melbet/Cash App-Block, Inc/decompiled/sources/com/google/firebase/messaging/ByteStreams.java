package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.stats.WakeLock;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public abstract class ByteStreams {
    public static final Object syncObject = new Object();
    public static WakeLock wakeLock;

    public static void checkAndInitWakeLock(Context context) {
        if (wakeLock == null) {
            WakeLock wakeLock2 = new WakeLock(context);
            wakeLock = wakeLock2;
            synchronized (wakeLock2.zzf) {
                wakeLock2.zzl = true;
            }
        }
    }

    public static byte[] combineBuffers(ArrayDeque arrayDeque, int i) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static void completeWakefulIntent(Intent intent) {
        synchronized (syncObject) {
            try {
                if (wakeLock != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    wakeLock.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ComponentName startWakefulService(Context context, Intent intent) {
        synchronized (syncObject) {
            try {
                checkAndInitWakeLock(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    wakeLock.acquire();
                }
                return startService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static byte[] toByteArray(LimitedInputStream limitedInputStream) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(PKIFailureInfo.certRevoked, Math.max(128, Integer.highestOneBit(0) * 2));
        int i = 0;
        while (i < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i2 = 0;
            while (i2 < min2) {
                int read = limitedInputStream.read(bArr, i2, min2 - i2);
                if (read == -1) {
                    return combineBuffers(arrayDeque, i);
                }
                i2 += read;
                i += read;
            }
            long j = min * (min < 4096 ? 4 : 2);
            min = j > 2147483647L ? Integer.MAX_VALUE : j < -2147483648L ? PKIFailureInfo.systemUnavail : (int) j;
        }
        if (limitedInputStream.read() == -1) {
            return combineBuffers(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public final class LimitedInputStream extends FilterInputStream {
        public final /* synthetic */ int $r8$classId = 1;
        public long left;
        public long mark;

        public LimitedInputStream(InputStream inputStream) {
            super(inputStream);
            this.mark = -1L;
            this.left = 1048577L;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() {
            switch (this.$r8$classId) {
                case 0:
                    return (int) Math.min(((FilterInputStream) this).in.available(), this.left);
                default:
                    return super.available();
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i) {
            switch (this.$r8$classId) {
                case 0:
                    synchronized (this) {
                        ((FilterInputStream) this).in.mark(i);
                        this.mark = this.left;
                    }
                    return;
                default:
                    super.mark(i);
                    return;
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    long j = this.left;
                    if (j == 0) {
                        return -1;
                    }
                    int read = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i2, j));
                    if (read != -1) {
                        this.left -= read;
                    }
                    return read;
                default:
                    int read2 = super.read(bArr, i, i2);
                    if (read2 != -1) {
                        this.mark += read2;
                    }
                    return read2;
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() {
            switch (this.$r8$classId) {
                case 0:
                    synchronized (this) {
                        if (!((FilterInputStream) this).in.markSupported()) {
                            throw new IOException("Mark not supported");
                        }
                        if (this.mark == -1) {
                            throw new IOException("Mark not set");
                        }
                        ((FilterInputStream) this).in.reset();
                        this.left = this.mark;
                    }
                    return;
                default:
                    super.reset();
                    return;
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j) {
            switch (this.$r8$classId) {
                case 0:
                    long skip = ((FilterInputStream) this).in.skip(Math.min(j, this.left));
                    this.left -= skip;
                    return skip;
                default:
                    return super.skip(j);
            }
        }

        public LimitedInputStream(BufferedInputStream bufferedInputStream, long j) {
            super(bufferedInputStream);
            this.left = j;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read() {
            switch (this.$r8$classId) {
                case 0:
                    if (this.left == 0) {
                        return -1;
                    }
                    int read = ((FilterInputStream) this).in.read();
                    if (read != -1) {
                        this.left--;
                    }
                    return read;
                default:
                    int read2 = super.read();
                    if (read2 != -1) {
                        this.mark++;
                    }
                    return read2;
            }
        }
    }
}
