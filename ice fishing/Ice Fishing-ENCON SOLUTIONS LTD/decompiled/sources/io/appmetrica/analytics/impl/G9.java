package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public abstract class G9 {
    public static final A9 a(int i2, String str) {
        byte[] bArr;
        A9 a9 = new A9();
        a9.f4134a = i2;
        if (str == null || (bArr = str.getBytes(z1.a.f8620a)) == null) {
            bArr = a9.f4135b;
        }
        a9.f4135b = bArr;
        return a9;
    }
}
