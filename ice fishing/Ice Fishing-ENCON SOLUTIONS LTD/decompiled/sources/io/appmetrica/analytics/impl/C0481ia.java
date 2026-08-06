package io.appmetrica.analytics.impl;

import i1.AbstractC0253j;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.ia, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0481ia implements N9 {

    /* renamed from: a, reason: collision with root package name */
    public final J8 f6184a = new J8();

    public final C0325c9[] a(byte[] bArr) {
        int i2 = 0;
        if (bArr == null) {
            return new C0325c9[0];
        }
        Map<String, byte[]> model = this.f6184a.toModel(bArr);
        C0325c9[] c0325c9Arr = new C0325c9[model.size()];
        for (Object obj : model.entrySet()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC0253j.D();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            C0325c9 c0325c9 = new C0325c9();
            c0325c9.f5732a = ((String) entry.getKey()).getBytes(z1.a.f8620a);
            c0325c9.f5733b = (byte[]) entry.getValue();
            c0325c9Arr[i2] = c0325c9;
            i2 = i3;
        }
        return c0325c9Arr;
    }
}
