package com.anythink.core.common.v;

/* loaded from: classes.dex */
final class x {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f17054a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f17055b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private x() {
    }

    private static char[] a(byte[] bArr, boolean z8) {
        return a(bArr, z8 ? f17055b : f17054a);
    }

    private static char[] b(byte[] bArr) {
        return a(bArr, false);
    }

    private static char[] a(byte[] bArr, char[] cArr) {
        char[] cArr2 = new char[bArr.length << 1];
        int i = 0;
        for (byte b9 : bArr) {
            int i4 = i + 1;
            cArr2[i] = cArr[(b9 & 240) >>> 4];
            i += 2;
            cArr2[i4] = cArr[b9 & 15];
        }
        return cArr2;
    }

    public static String a(byte[] bArr) {
        return new String(a(bArr, true));
    }
}
