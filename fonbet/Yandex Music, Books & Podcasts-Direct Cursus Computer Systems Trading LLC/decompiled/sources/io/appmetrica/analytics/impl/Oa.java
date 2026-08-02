package io.appmetrica.analytics.impl;

import kotlin.text.Charsets;

/* loaded from: classes5.dex */
public abstract class Oa {
    public static final Ia a(int i, String str) {
        byte[] bArr;
        Ia ia = new Ia();
        ia.a = i;
        if (str == null || (bArr = str.getBytes(Charsets.UTF_8)) == null) {
            bArr = ia.b;
        }
        ia.b = bArr;
        return ia;
    }
}
