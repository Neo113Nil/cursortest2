package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import h.C4543G;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.fm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3228fm implements InterfaceC3272gc {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f31208n = 2;

    /* renamed from: u, reason: collision with root package name */
    public final Object f31209u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f31210v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f31211w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f31212x;

    public /* synthetic */ C3228fm(InterfaceC2579Fl interfaceC2579Fl, C2712Ni c2712Ni, C4260yv c4260yv, C2821Tp c2821Tp) {
        this.f31209u = interfaceC2579Fl;
        this.f31211w = c2712Ni;
        this.f31210v = c4260yv;
        this.f31212x = c2821Tp;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3272gc
    public final void e(Object obj, Map map) {
        Object obj2 = this.f31211w;
        Object obj3 = this.f31212x;
        Object obj4 = this.f31210v;
        Object obj5 = this.f31209u;
        switch (this.f31208n) {
            case 0:
                C3282gm c3282gm = (C3282gm) ((WeakReference) obj5).get();
                String str = (String) map.get("u");
                if (c3282gm != null && !TextUtils.isEmpty(str)) {
                    ((C4260yv) obj4).b(str, (C4543G) obj2, (Vu) obj3, c3282gm.f31414W);
                    break;
                }
                break;
            case 1:
                Object obj6 = ((WeakReference) obj5).get();
                if (obj6 != null) {
                    ((InterfaceC3272gc) obj2).e(obj6, map);
                    break;
                } else {
                    ((C4036un) obj3).c((String) obj4, this);
                    break;
                }
            default:
                InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) obj;
                AbstractC3218fc.b(map, (InterfaceC2579Fl) obj5);
                String str2 = (String) map.get("u");
                if (str2 != null) {
                    P3.a a9 = AbstractC3218fc.a(interfaceC4084vh, str2);
                    C2590Gf c2590Gf = new C2590Gf(interfaceC4084vh, (C2712Ni) obj2, (C4260yv) obj4, (C2821Tp) obj3, 22);
                    a9.a(new LD(0, a9, c2590Gf), AbstractC3436jg.f32055a);
                    break;
                } else {
                    int i = w2.z.f41712b;
                    x2.i.f("URL missing from click GMSG.");
                    break;
                }
        }
    }

    public /* synthetic */ C3228fm(C3282gm c3282gm, C4260yv c4260yv, C4543G c4543g, Vu vu) {
        this.f31209u = new WeakReference(c3282gm);
        this.f31210v = c4260yv;
        this.f31211w = c4543g;
        this.f31212x = vu;
    }

    public /* synthetic */ C3228fm(C4036un c4036un, WeakReference weakReference, String str, InterfaceC3272gc interfaceC3272gc) {
        Objects.requireNonNull(c4036un);
        this.f31212x = c4036un;
        this.f31209u = weakReference;
        this.f31210v = str;
        this.f31211w = interfaceC3272gc;
    }
}
