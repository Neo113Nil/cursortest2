package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class GC {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f24951a = 0;

    static {
        new FC();
    }

    public static byte[] a(InputStream inputStream) {
        inputStream.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int highestOneBit = Integer.highestOneBit(0);
        int min = Math.min(8192, Math.max(128, highestOneBit + highestOneBit));
        int i = 0;
        while (i < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i6 = 0;
            while (i6 < min2) {
                int read = inputStream.read(bArr, i6, min2 - i6);
                if (read == -1) {
                    return b(arrayDeque, i);
                }
                i6 += read;
                i += read;
            }
            min = UC.h(min * (min < 4096 ? 4 : 2));
        }
        if (inputStream.read() == -1) {
            return b(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static byte[] b(ArrayDeque arrayDeque, int i) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        int length = bArr.length;
        if (length == i) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, i);
        int i6 = i - length;
        while (i6 > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(i6, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i - i6, min);
            i6 -= min;
        }
        return copyOf;
    }
}
