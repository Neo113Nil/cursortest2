package com.google.common.io;

import androidx.tracing.Trace;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public abstract class ByteStreams {
    static {
        new AnonymousClass1(0);
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

    public static byte[] toByteArray(InputStream inputStream) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(PKIFailureInfo.certRevoked, Math.max(128, Integer.highestOneBit(0) * 2));
        int i = 0;
        while (i < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i2 = 0;
            while (i2 < min2) {
                int read = inputStream.read(bArr, i2, min2 - i2);
                if (read == -1) {
                    return combineBuffers(arrayDeque, i);
                }
                i2 += read;
                i += read;
            }
            min = CompositeException.WrappedPrintStream.saturatedCast(min * (min < 4096 ? 4 : 2));
        }
        if (inputStream.read() == -1) {
            return combineBuffers(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* renamed from: com.google.common.io.ByteStreams$1, reason: invalid class name */
    public final class AnonymousClass1 extends OutputStream {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ AnonymousClass1(int i) {
            this.$r8$classId = i;
        }

        private final void write$com$google$common$io$ByteStreams$1(int i) {
        }

        private final void write$com$jakewharton$disklrucache$DiskLruCache$2(int i) {
        }

        public String toString() {
            switch (this.$r8$classId) {
                case 0:
                    return "ByteStreams.nullOutputStream()";
                default:
                    return super.toString();
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    bArr.getClass();
                    Trace.checkPositionIndexes(i, i2 + i, bArr.length);
                    break;
                default:
                    super.write(bArr, i, i2);
                    break;
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            switch (this.$r8$classId) {
                case 0:
                    bArr.getClass();
                    break;
                default:
                    super.write(bArr);
                    break;
            }
        }

        @Override // java.io.OutputStream
        public final void write(int i) {
            int i2 = this.$r8$classId;
        }
    }
}
