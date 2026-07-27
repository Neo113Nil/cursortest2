package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Im, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2610Im {

    /* renamed from: a, reason: collision with root package name */
    public final C2628Jn f25588a;

    /* renamed from: b, reason: collision with root package name */
    public final C4026un f25589b;

    /* renamed from: c, reason: collision with root package name */
    public final C2997bj f25590c;

    /* renamed from: d, reason: collision with root package name */
    public final C3109dm f25591d;

    public C2610Im(C2628Jn c2628Jn, C4026un c4026un, C2997bj c2997bj, C3109dm c3109dm) {
        this.f25588a = c2628Jn;
        this.f25589b = c4026un;
        this.f25590c = c2997bj;
        this.f25591d = c3109dm;
    }

    public final View a() {
        InterfaceC3858rh a9 = this.f25588a.a(q2.g1.a(), null, null);
        a9.b0().setVisibility(8);
        final int i = 4;
        a9.N0("/sendMessageToSdk", new InterfaceC2990bc(this) { // from class: com.google.android.gms.internal.ads.Gm

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ C2610Im f25206u;

            {
                this.f25206u = this;
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC2990bc
            public final void g(Object obj, Map map) {
                C2610Im c2610Im = this.f25206u;
                InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) obj;
                switch (i) {
                    case 0:
                        c2610Im.f25591d.C();
                        break;
                    case 1:
                        interfaceC3858rh.j0().f25412z = new C2593Hm(0, c2610Im, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            interfaceC3858rh.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            break;
                        } else {
                            interfaceC3858rh.loadData(str, "text/html", "UTF-8");
                            break;
                        }
                    case 2:
                        c2610Im.getClass();
                        int i4 = t2.C.f40822b;
                        u2.i.e("Showing native ads overlay.");
                        interfaceC3858rh.b0().setVisibility(0);
                        c2610Im.f25590c.f29557y = true;
                        break;
                    case 3:
                        c2610Im.getClass();
                        int i9 = t2.C.f40822b;
                        u2.i.e("Hiding native ads overlay.");
                        interfaceC3858rh.b0().setVisibility(8);
                        c2610Im.f25590c.f29557y = false;
                        break;
                    default:
                        c2610Im.f25589b.d(map);
                        break;
                }
            }
        });
        final int i4 = 0;
        a9.N0("/adMuted", new InterfaceC2990bc(this) { // from class: com.google.android.gms.internal.ads.Gm

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ C2610Im f25206u;

            {
                this.f25206u = this;
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC2990bc
            public final void g(Object obj, Map map) {
                C2610Im c2610Im = this.f25206u;
                InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) obj;
                switch (i4) {
                    case 0:
                        c2610Im.f25591d.C();
                        break;
                    case 1:
                        interfaceC3858rh.j0().f25412z = new C2593Hm(0, c2610Im, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            interfaceC3858rh.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            break;
                        } else {
                            interfaceC3858rh.loadData(str, "text/html", "UTF-8");
                            break;
                        }
                    case 2:
                        c2610Im.getClass();
                        int i42 = t2.C.f40822b;
                        u2.i.e("Showing native ads overlay.");
                        interfaceC3858rh.b0().setVisibility(0);
                        c2610Im.f25590c.f29557y = true;
                        break;
                    case 3:
                        c2610Im.getClass();
                        int i9 = t2.C.f40822b;
                        u2.i.e("Hiding native ads overlay.");
                        interfaceC3858rh.b0().setVisibility(8);
                        c2610Im.f25590c.f29557y = false;
                        break;
                    default:
                        c2610Im.f25589b.d(map);
                        break;
                }
            }
        });
        WeakReference weakReference = new WeakReference(a9);
        final int i9 = 1;
        InterfaceC2990bc interfaceC2990bc = new InterfaceC2990bc(this) { // from class: com.google.android.gms.internal.ads.Gm

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ C2610Im f25206u;

            {
                this.f25206u = this;
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC2990bc
            public final void g(Object obj, Map map) {
                C2610Im c2610Im = this.f25206u;
                InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) obj;
                switch (i9) {
                    case 0:
                        c2610Im.f25591d.C();
                        break;
                    case 1:
                        interfaceC3858rh.j0().f25412z = new C2593Hm(0, c2610Im, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            interfaceC3858rh.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            break;
                        } else {
                            interfaceC3858rh.loadData(str, "text/html", "UTF-8");
                            break;
                        }
                    case 2:
                        c2610Im.getClass();
                        int i42 = t2.C.f40822b;
                        u2.i.e("Showing native ads overlay.");
                        interfaceC3858rh.b0().setVisibility(0);
                        c2610Im.f25590c.f29557y = true;
                        break;
                    case 3:
                        c2610Im.getClass();
                        int i92 = t2.C.f40822b;
                        u2.i.e("Hiding native ads overlay.");
                        interfaceC3858rh.b0().setVisibility(8);
                        c2610Im.f25590c.f29557y = false;
                        break;
                    default:
                        c2610Im.f25589b.d(map);
                        break;
                }
            }
        };
        C4026un c4026un = this.f25589b;
        c4026un.b("/loadHtml", new C3054cm(c4026un, weakReference, "/loadHtml", interfaceC2990bc));
        final int i10 = 2;
        c4026un.b("/showOverlay", new C3054cm(c4026un, new WeakReference(a9), "/showOverlay", new InterfaceC2990bc(this) { // from class: com.google.android.gms.internal.ads.Gm

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ C2610Im f25206u;

            {
                this.f25206u = this;
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC2990bc
            public final void g(Object obj, Map map) {
                C2610Im c2610Im = this.f25206u;
                InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) obj;
                switch (i10) {
                    case 0:
                        c2610Im.f25591d.C();
                        break;
                    case 1:
                        interfaceC3858rh.j0().f25412z = new C2593Hm(0, c2610Im, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            interfaceC3858rh.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            break;
                        } else {
                            interfaceC3858rh.loadData(str, "text/html", "UTF-8");
                            break;
                        }
                    case 2:
                        c2610Im.getClass();
                        int i42 = t2.C.f40822b;
                        u2.i.e("Showing native ads overlay.");
                        interfaceC3858rh.b0().setVisibility(0);
                        c2610Im.f25590c.f29557y = true;
                        break;
                    case 3:
                        c2610Im.getClass();
                        int i92 = t2.C.f40822b;
                        u2.i.e("Hiding native ads overlay.");
                        interfaceC3858rh.b0().setVisibility(8);
                        c2610Im.f25590c.f29557y = false;
                        break;
                    default:
                        c2610Im.f25589b.d(map);
                        break;
                }
            }
        }));
        final int i11 = 3;
        c4026un.b("/hideOverlay", new C3054cm(c4026un, new WeakReference(a9), "/hideOverlay", new InterfaceC2990bc(this) { // from class: com.google.android.gms.internal.ads.Gm

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ C2610Im f25206u;

            {
                this.f25206u = this;
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC2990bc
            public final void g(Object obj, Map map) {
                C2610Im c2610Im = this.f25206u;
                InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) obj;
                switch (i11) {
                    case 0:
                        c2610Im.f25591d.C();
                        break;
                    case 1:
                        interfaceC3858rh.j0().f25412z = new C2593Hm(0, c2610Im, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            interfaceC3858rh.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            break;
                        } else {
                            interfaceC3858rh.loadData(str, "text/html", "UTF-8");
                            break;
                        }
                    case 2:
                        c2610Im.getClass();
                        int i42 = t2.C.f40822b;
                        u2.i.e("Showing native ads overlay.");
                        interfaceC3858rh.b0().setVisibility(0);
                        c2610Im.f25590c.f29557y = true;
                        break;
                    case 3:
                        c2610Im.getClass();
                        int i92 = t2.C.f40822b;
                        u2.i.e("Hiding native ads overlay.");
                        interfaceC3858rh.b0().setVisibility(8);
                        c2610Im.f25590c.f29557y = false;
                        break;
                    default:
                        c2610Im.f25589b.d(map);
                        break;
                }
            }
        }));
        return a9.b0();
    }
}
