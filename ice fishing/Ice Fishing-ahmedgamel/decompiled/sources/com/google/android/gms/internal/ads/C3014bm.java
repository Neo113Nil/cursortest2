package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.bm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3014bm implements InterfaceC2611Hj {

    /* renamed from: a, reason: collision with root package name */
    public final Map f30111a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f30112b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f30113c;

    /* renamed from: d, reason: collision with root package name */
    public final C3266gN f30114d;

    /* renamed from: e, reason: collision with root package name */
    public final C2495Am f30115e;

    public C3014bm(Map map, Map map2, Map map3, C3266gN c3266gN, C2495Am c2495Am) {
        this.f30111a = map;
        this.f30112b = map2;
        this.f30113c = map3;
        this.f30114d = c3266gN;
        this.f30115e = c2495Am;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2611Hj
    public final InterfaceC3340hq a(int i, String str) {
        InterfaceC3340hq a9;
        InterfaceC3340hq interfaceC3340hq = (InterfaceC3340hq) this.f30111a.get(str);
        if (interfaceC3340hq != null) {
            return interfaceC3340hq;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            C2720Nq c2720Nq = (C2720Nq) this.f30113c.get(str);
            if (c2720Nq != null) {
                return new C3393iq(c2720Nq, L2.f26826g);
            }
            a9 = (InterfaceC3340hq) this.f30112b.get(str);
            if (a9 == null) {
                return null;
            }
        } else if (this.f30115e.f24513d == null || (a9 = ((InterfaceC2611Hj) this.f30114d.f()).a(i, str)) == null) {
            return null;
        }
        return new C3393iq(a9, L2.f26825f);
    }
}
