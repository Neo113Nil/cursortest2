package com.google.android.gms.internal.fido;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.util.ArrayDeque;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzhs implements Closeable {
    public final ByteArrayInputStream zza;
    public zzhr zzb;
    public final byte[] zzc = new byte[8];
    public final zzaq zzd = new zzaq();

    public zzhs(ByteArrayInputStream byteArrayInputStream) {
        this.zza = byteArrayInputStream;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.zza.close();
        this.zzd.zzb();
    }

    public final long zza() {
        zzj(Byte.MIN_VALUE);
        zzi();
        long zzh = zzh();
        if (zzh < 0) {
            a$$ExternalSyntheticBUOutline0.m("the maximum supported array length is 9223372036854775807");
            return 0L;
        }
        if (zzh > 0) {
            ((ArrayDeque) this.zzd.zze).push(Long.valueOf(zzh));
        }
        return zzh;
    }

    public final long zzb() {
        boolean z;
        zzd();
        byte b = this.zzb.zza;
        if (b == 0) {
            z = true;
        } else {
            if (b != 32) {
                a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((b >> 5) & 7, "expected major type 0 or 1 but found "));
                return 0L;
            }
            z = false;
        }
        long zzh = zzh();
        if (zzh >= 0) {
            return z ? zzh : ~zzh;
        }
        a$$ExternalSyntheticBUOutline0.m("the maximum supported unsigned/negative integer is 9223372036854775807");
        return 0L;
    }

    public final long zzc() {
        zzj((byte) -96);
        zzi();
        long zzh = zzh();
        if (zzh < 0 || zzh > 4611686018427387903L) {
            a$$ExternalSyntheticBUOutline0.m("the maximum supported map length is 4611686018427387903L");
            return 0L;
        }
        if (zzh > 0) {
            ((ArrayDeque) this.zzd.zze).push(Long.valueOf(zzh + zzh));
        }
        return zzh;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x008d, code lost:
    
        if (r0 != (-2)) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzhr zzd() {
        if (this.zzb == null) {
            int read = this.zza.read();
            zzaq zzaqVar = this.zzd;
            if (read == -1) {
                zzaqVar.zzb();
                return null;
            }
            zzhr zzhrVar = new zzhr(read);
            this.zzb = zzhrVar;
            long j = -2;
            byte b = zzhrVar.zza;
            if (b != Byte.MIN_VALUE && b != -96 && b != -64) {
                if (b != -32) {
                    if (b != 0 && b != 32) {
                        if (b == 64) {
                            zzaqVar.zze(-1L);
                        } else {
                            if (b != 96) {
                                a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((b >> 5) & 7, "invalid major type: "));
                                return null;
                            }
                            zzaqVar.zze(-2L);
                        }
                        long zzh = zzaqVar.zzh();
                        ArrayDeque arrayDeque = (ArrayDeque) zzaqVar.zze;
                        if (zzh == 1) {
                            arrayDeque.pop();
                        } else if (zzh > 1) {
                            arrayDeque.pop();
                            arrayDeque.push(Long.valueOf(zzh - 1));
                        } else if (zzh == -4) {
                            arrayDeque.pop();
                            arrayDeque.push(-5L);
                        } else if (zzh == -5) {
                            arrayDeque.pop();
                            arrayDeque.push(-4L);
                        }
                    }
                } else if (zzhrVar.zzb == 31) {
                    long zzh2 = zzaqVar.zzh();
                    if (zzh2 >= 0) {
                        a$$ExternalSyntheticBUOutline0.m$4(Recorder$$ExternalSyntheticOutline2.m(zzh2, "expected indefinite length scope but found "));
                        return null;
                    }
                    if (zzh2 == -5) {
                        a$$ExternalSyntheticBUOutline0.m$4("expected a value for dangling key in indefinite-length map");
                        return null;
                    }
                    ((ArrayDeque) zzaqVar.zze).pop();
                }
            }
            long zzh3 = zzaqVar.zzh();
            if (zzh3 == -1) {
                j = zzh3;
            }
            a$$ExternalSyntheticBUOutline0.m$4(Recorder$$ExternalSyntheticOutline2.m(j, "expected non-string scope but found "));
            return null;
        }
        return this.zzb;
    }

    public final boolean zzf() {
        zzj((byte) -32);
        if (this.zzb.zzb > 24) {
            a$$ExternalSyntheticBUOutline0.m$1("expected simple value");
            return false;
        }
        int zzh = (int) zzh();
        if (zzh == 20) {
            return false;
        }
        if (zzh == 21) {
            return true;
        }
        a$$ExternalSyntheticBUOutline0.m$1("expected FALSE or TRUE");
        return false;
    }

    public final long zzh() {
        zzhr zzhrVar = this.zzb;
        byte b = zzhrVar.zzb;
        if (b < 24) {
            long j = b;
            this.zzb = null;
            return j;
        }
        if (b == 24) {
            int read = this.zza.read();
            if (read != -1) {
                this.zzb = null;
                return read & 255;
            }
            Path$$ExternalSyntheticBUOutline0.m$1();
            return 0L;
        }
        byte[] bArr = this.zzc;
        if (b == 25) {
            zzk(2, bArr);
            return ((bArr[0] & 255) << 8) | (bArr[1] & 255);
        }
        if (b == 26) {
            zzk(4, bArr);
            return ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        if (b != 27) {
            a$$ExternalSyntheticBUOutline0.m$4(Recorder$$ExternalSyntheticOutline2.m("invalid additional information ", b, (zzhrVar.zza >> 5) & 7, " for major type "));
            return 0L;
        }
        zzk(8, bArr);
        long j2 = bArr[0];
        long j3 = bArr[1];
        long j4 = bArr[2];
        long j5 = bArr[3];
        return (bArr[7] & 255) | ((j3 & 255) << 48) | ((j2 & 255) << 56) | ((j4 & 255) << 40) | ((j5 & 255) << 32) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8);
    }

    public final void zzi() {
        zzd();
        byte b = this.zzb.zzb;
        if (b != 31) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(b, "expected definite length but found "));
    }

    public final void zzj(byte b) {
        zzd();
        byte b2 = this.zzb.zza;
        if (b2 == b) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1(Recorder$$ExternalSyntheticOutline2.m("expected major type ", (b >> 5) & 7, (b2 >> 5) & 7, " but found "));
    }

    public final void zzk(int i, byte[] bArr) {
        int i2 = 0;
        while (i2 != i) {
            int read = this.zza.read(bArr, i2, i - i2);
            if (read == -1) {
                Path$$ExternalSyntheticBUOutline0.m$1();
                return;
            }
            i2 += read;
        }
        this.zzb = null;
    }

    public final byte[] zzl() {
        zzi();
        long zzh = zzh();
        if (zzh < 0 || zzh > 2147483647L) {
            a$$ExternalSyntheticBUOutline0.m("the maximum supported byte/text string length is 2147483647 bytes");
            return null;
        }
        if (this.zza.available() < zzh) {
            Path$$ExternalSyntheticBUOutline0.m$1();
            return null;
        }
        int i = (int) zzh;
        byte[] bArr = new byte[i];
        zzk(i, bArr);
        return bArr;
    }
}
