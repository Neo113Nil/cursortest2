package io.appmetrica.analytics.impl;

import defpackage.scc;
import defpackage.uza;
import java.util.Map;

/* loaded from: classes9.dex */
public final class Bb implements InterfaceC0273db {
    public final Y9 a = new Y9();

    public final C0675ra[] a(byte[] bArr) {
        int i = 0;
        if (bArr == null) {
            return new C0675ra[0];
        }
        Map<String, byte[]> model = this.a.toModel(bArr);
        C0675ra[] c0675raArr = new C0675ra[model.size()];
        for (Object obj : model.entrySet()) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            C0675ra c0675ra = new C0675ra();
            c0675ra.a = ((String) entry.getKey()).getBytes(uza.a);
            c0675ra.b = (byte[]) entry.getValue();
            c0675raArr[i] = c0675ra;
            i = i2;
        }
        return c0675raArr;
    }
}
