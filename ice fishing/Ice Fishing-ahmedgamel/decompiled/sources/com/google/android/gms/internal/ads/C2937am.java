package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.am, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2937am implements InterfaceC2591Hj {

    /* renamed from: a, reason: collision with root package name */
    public final Map f29117a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f29118b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f29119c;

    /* renamed from: d, reason: collision with root package name */
    public final C3243gN f29120d;

    /* renamed from: e, reason: collision with root package name */
    public final C4282zm f29121e;

    public C2937am(Map map, Map map2, Map map3, C3243gN c3243gN, C4282zm c4282zm) {
        this.f29117a = map;
        this.f29118b = map2;
        this.f29119c = map3;
        this.f29120d = c3243gN;
        this.f29121e = c4282zm;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2591Hj
    public final InterfaceC3317hq a(int i, String str) {
        InterfaceC3317hq a9;
        InterfaceC3317hq interfaceC3317hq = (InterfaceC3317hq) this.f29117a.get(str);
        if (interfaceC3317hq != null) {
            return interfaceC3317hq;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            C2700Nq c2700Nq = (C2700Nq) this.f29119c.get(str);
            if (c2700Nq != null) {
                return new C3370iq(c2700Nq, L2.f26026g);
            }
            a9 = (InterfaceC3317hq) this.f29118b.get(str);
            if (a9 == null) {
                return null;
            }
        } else if (this.f29121e.f35447d == null || (a9 = ((InterfaceC2591Hj) this.f29120d.f()).a(i, str)) == null) {
            return null;
        }
        return new C3370iq(a9, L2.f26025f);
    }
}
