package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Objects;
import l.C4648e;

/* renamed from: com.google.android.gms.internal.ads.em, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3151em implements InterfaceC3249gc {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29968n = 2;

    /* renamed from: u, reason: collision with root package name */
    public final Object f29969u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f29970v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f29971w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f29972x;

    public /* synthetic */ C3151em(InterfaceC2542El interfaceC2542El, C2692Ni c2692Ni, C4237yv c4237yv, C2800Tp c2800Tp) {
        this.f29969u = interfaceC2542El;
        this.f29971w = c2692Ni;
        this.f29970v = c4237yv;
        this.f29972x = c2800Tp;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3249gc
    public final void e(Object obj, Map map) {
        Object obj2 = this.f29971w;
        Object obj3 = this.f29972x;
        Object obj4 = this.f29970v;
        Object obj5 = this.f29969u;
        switch (this.f29968n) {
            case 0:
                C3205fm c3205fm = (C3205fm) ((WeakReference) obj5).get();
                String str = (String) map.get("u");
                if (c3205fm != null && !TextUtils.isEmpty(str)) {
                    ((C4237yv) obj4).b(str, (C4648e) obj2, (Vu) obj3, c3205fm.f30441W);
                    break;
                }
                break;
            case 1:
                Object obj6 = ((WeakReference) obj5).get();
                if (obj6 != null) {
                    ((InterfaceC3249gc) obj2).e(obj6, map);
                    break;
                } else {
                    ((C3959tn) obj3).c((String) obj4, this);
                    break;
                }
            default:
                InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) obj;
                AbstractC3195fc.b(map, (InterfaceC2542El) obj5);
                String str2 = (String) map.get("u");
                if (str2 != null) {
                    N3.a a9 = AbstractC3195fc.a(interfaceC4061vh, str2);
                    C2570Gf c2570Gf = new C2570Gf(interfaceC4061vh, (C2692Ni) obj2, (C4237yv) obj4, (C2800Tp) obj3, 22);
                    a9.a(new LD(0, a9, c2570Gf), AbstractC3413jg.f31268a);
                    break;
                } else {
                    int i = u2.z.f41322b;
                    v2.i.f("URL missing from click GMSG.");
                    break;
                }
        }
    }

    public /* synthetic */ C3151em(C3205fm c3205fm, C4237yv c4237yv, C4648e c4648e, Vu vu) {
        this.f29969u = new WeakReference(c3205fm);
        this.f29970v = c4237yv;
        this.f29971w = c4648e;
        this.f29972x = vu;
    }

    public /* synthetic */ C3151em(C3959tn c3959tn, WeakReference weakReference, String str, InterfaceC3249gc interfaceC3249gc) {
        Objects.requireNonNull(c3959tn);
        this.f29972x = c3959tn;
        this.f29969u = weakReference;
        this.f29970v = str;
        this.f29971w = interfaceC3249gc;
    }
}
