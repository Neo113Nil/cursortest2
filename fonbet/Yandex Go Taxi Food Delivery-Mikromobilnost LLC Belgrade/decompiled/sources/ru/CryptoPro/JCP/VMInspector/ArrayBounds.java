package ru.CryptoPro.JCP.VMInspector;

import defpackage.d7g0;

/* loaded from: classes4.dex */
public class ArrayBounds {
    private ArrayBounds() {
    }

    public static void main(String[] strArr) throws Exception {
        try {
            byte[] bArr = new byte[2];
            bArr[3] = (byte) (bArr[3] + 1);
            d7g0.i();
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
    }
}
