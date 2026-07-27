package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Xl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2864Xl implements InterfaceC2573Gj {

    /* renamed from: a, reason: collision with root package name */
    public final Map f28687a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f28688b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f28689c;

    /* renamed from: d, reason: collision with root package name */
    public final C4009uN f28690d;

    /* renamed from: e, reason: collision with root package name */
    public final C4133wm f28691e;

    public C2864Xl(Map map, Map map2, Map map3, C4009uN c4009uN, C4133wm c4133wm) {
        this.f28687a = map;
        this.f28688b = map2;
        this.f28689c = map3;
        this.f28690d = c4009uN;
        this.f28691e = c4133wm;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2573Gj
    public final InterfaceC3436jq a(int i, String str) {
        InterfaceC3436jq a9;
        InterfaceC3436jq interfaceC3436jq = (InterfaceC3436jq) this.f28687a.get(str);
        if (interfaceC3436jq != null) {
            return interfaceC3436jq;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            C2750Qq c2750Qq = (C2750Qq) this.f28689c.get(str);
            if (c2750Qq != null) {
                return new C3490kq(c2750Qq, J2.f25696g);
            }
            a9 = (InterfaceC3436jq) this.f28688b.get(str);
            if (a9 == null) {
                return null;
            }
        } else if (this.f28691e.f35064d == null || (a9 = ((InterfaceC2573Gj) this.f28690d.d()).a(i, str)) == null) {
            return null;
        }
        return new C3490kq(a9, J2.f25695f);
    }
}
