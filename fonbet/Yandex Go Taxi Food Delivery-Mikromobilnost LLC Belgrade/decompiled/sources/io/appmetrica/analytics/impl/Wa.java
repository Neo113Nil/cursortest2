package io.appmetrica.analytics.impl;

import defpackage.uza;

/* loaded from: classes4.dex */
public abstract class Wa {
    public static final Qa a(int i, String str) {
        byte[] bArr;
        Qa qa = new Qa();
        qa.a = i;
        if (str == null || (bArr = str.getBytes(uza.a)) == null) {
            bArr = qa.b;
        }
        qa.b = bArr;
        return qa;
    }
}
