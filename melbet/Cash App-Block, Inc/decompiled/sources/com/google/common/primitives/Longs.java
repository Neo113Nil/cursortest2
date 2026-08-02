package com.google.common.primitives;

import androidx.tracing.Trace;
import java.util.Arrays;

/* loaded from: classes9.dex */
public abstract class Longs {

    public abstract class AsciiDigits {
        public static final byte[] asciiDigits;

        static {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i = 0; i < 10; i++) {
                bArr[i + 48] = (byte) i;
            }
            for (int i2 = 0; i2 < 26; i2++) {
                byte b = (byte) (i2 + 10);
                bArr[i2 + 65] = b;
                bArr[i2 + 97] = b;
            }
            asciiDigits = bArr;
        }
    }

    public static long[] concat(long[]... jArr) {
        long j = 0;
        for (long[] jArr2 : jArr) {
            j += jArr2.length;
        }
        int i = (int) j;
        Trace.checkArgument(j, "the total number of elements (%s) in the arrays must fit in an int", j == ((long) i));
        long[] jArr3 = new long[i];
        int i2 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, i2, jArr4.length);
            i2 += jArr4.length;
        }
        return jArr3;
    }

    public static void throwIfFatal(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}
