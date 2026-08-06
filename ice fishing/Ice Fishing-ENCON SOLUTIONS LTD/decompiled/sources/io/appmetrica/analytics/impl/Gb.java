package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class Gb implements InterfaceC0498j2 {

    /* renamed from: a, reason: collision with root package name */
    public final C0578m4 f4415a;

    public Gb(C0578m4 c0578m4) {
        this.f4415a = c0578m4;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0498j2
    public final C0417fo a(Cdo cdo, C0417fo c0417fo) {
        int i2 = cdo.f5849b;
        int i3 = this.f4415a.f6479a;
        if (i2 == i3) {
            if (((C0417fo) ((HashMap) cdo.f5848a.get(c0417fo.f6036b)).get(new String(c0417fo.f6035a))) != null) {
                ((HashMap) cdo.f5848a.get(c0417fo.f6036b)).put(new String(c0417fo.f6035a), c0417fo);
            }
        } else if (i2 < i3) {
            ((HashMap) cdo.f5848a.get(c0417fo.f6036b)).put(new String(c0417fo.f6035a), c0417fo);
            cdo.f5849b++;
        }
        return c0417fo;
    }
}
