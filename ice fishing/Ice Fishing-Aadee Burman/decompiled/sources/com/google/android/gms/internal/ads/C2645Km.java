package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Km, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2645Km {

    /* renamed from: a, reason: collision with root package name */
    public final C2612In f25966a;

    /* renamed from: b, reason: collision with root package name */
    public final C3959tn f25967b;

    /* renamed from: c, reason: collision with root package name */
    public final C3095dj f25968c;

    /* renamed from: d, reason: collision with root package name */
    public final C3205fm f25969d;

    public C2645Km(C2612In c2612In, C3959tn c3959tn, C3095dj c3095dj, C3205fm c3205fm) {
        this.f25966a = c2612In;
        this.f25967b = c3959tn;
        this.f25968c = c3095dj;
        this.f25969d = c3205fm;
    }

    public final View a() {
        InterfaceC4061vh a9 = this.f25966a.a(q2.f1.a(), null, null);
        a9.V().setVisibility(8);
        final int i = 4;
        a9.a1("/sendMessageToSdk", new InterfaceC3249gc(this) { // from class: com.google.android.gms.internal.ads.Im

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ C2645Km f25566u;

            {
                this.f25566u = this;
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC3249gc
            public final void e(Object obj, Map map) {
                C2645Km c2645Km = this.f25566u;
                switch (i) {
                    case 0:
                        c2645Km.f25969d.D();
                        break;
                    case 1:
                        InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) obj;
                        interfaceC4061vh.g0().f26159z = new S0.e(15, c2645Km, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            interfaceC4061vh.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            break;
                        } else {
                            interfaceC4061vh.loadData(str, "text/html", "UTF-8");
                            break;
                        }
                    case 2:
                        c2645Km.getClass();
                        int i6 = u2.z.f41319b;
                        v2.i.e("Showing native ads overlay.");
                        ((InterfaceC4061vh) obj).V().setVisibility(0);
                        c2645Km.f25968c.f29828y = true;
                        break;
                    case 3:
                        c2645Km.getClass();
                        int i9 = u2.z.f41319b;
                        v2.i.e("Hiding native ads overlay.");
                        ((InterfaceC4061vh) obj).V().setVisibility(8);
                        c2645Km.f25968c.f29828y = false;
                        break;
                    default:
                        c2645Km.f25967b.d(map);
                        break;
                }
            }
        });
        final int i6 = 0;
        a9.a1("/adMuted", new InterfaceC3249gc(this) { // from class: com.google.android.gms.internal.ads.Im

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ C2645Km f25566u;

            {
                this.f25566u = this;
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC3249gc
            public final void e(Object obj, Map map) {
                C2645Km c2645Km = this.f25566u;
                switch (i6) {
                    case 0:
                        c2645Km.f25969d.D();
                        break;
                    case 1:
                        InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) obj;
                        interfaceC4061vh.g0().f26159z = new S0.e(15, c2645Km, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            interfaceC4061vh.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            break;
                        } else {
                            interfaceC4061vh.loadData(str, "text/html", "UTF-8");
                            break;
                        }
                    case 2:
                        c2645Km.getClass();
                        int i62 = u2.z.f41319b;
                        v2.i.e("Showing native ads overlay.");
                        ((InterfaceC4061vh) obj).V().setVisibility(0);
                        c2645Km.f25968c.f29828y = true;
                        break;
                    case 3:
                        c2645Km.getClass();
                        int i9 = u2.z.f41319b;
                        v2.i.e("Hiding native ads overlay.");
                        ((InterfaceC4061vh) obj).V().setVisibility(8);
                        c2645Km.f25968c.f29828y = false;
                        break;
                    default:
                        c2645Km.f25967b.d(map);
                        break;
                }
            }
        });
        WeakReference weakReference = new WeakReference(a9);
        final int i9 = 1;
        InterfaceC3249gc interfaceC3249gc = new InterfaceC3249gc(this) { // from class: com.google.android.gms.internal.ads.Im

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ C2645Km f25566u;

            {
                this.f25566u = this;
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC3249gc
            public final void e(Object obj, Map map) {
                C2645Km c2645Km = this.f25566u;
                switch (i9) {
                    case 0:
                        c2645Km.f25969d.D();
                        break;
                    case 1:
                        InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) obj;
                        interfaceC4061vh.g0().f26159z = new S0.e(15, c2645Km, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            interfaceC4061vh.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            break;
                        } else {
                            interfaceC4061vh.loadData(str, "text/html", "UTF-8");
                            break;
                        }
                    case 2:
                        c2645Km.getClass();
                        int i62 = u2.z.f41319b;
                        v2.i.e("Showing native ads overlay.");
                        ((InterfaceC4061vh) obj).V().setVisibility(0);
                        c2645Km.f25968c.f29828y = true;
                        break;
                    case 3:
                        c2645Km.getClass();
                        int i92 = u2.z.f41319b;
                        v2.i.e("Hiding native ads overlay.");
                        ((InterfaceC4061vh) obj).V().setVisibility(8);
                        c2645Km.f25968c.f29828y = false;
                        break;
                    default:
                        c2645Km.f25967b.d(map);
                        break;
                }
            }
        };
        C3959tn c3959tn = this.f25967b;
        c3959tn.b("/loadHtml", new C3151em(c3959tn, weakReference, "/loadHtml", interfaceC3249gc));
        final int i10 = 2;
        c3959tn.b("/showOverlay", new C3151em(c3959tn, new WeakReference(a9), "/showOverlay", new InterfaceC3249gc(this) { // from class: com.google.android.gms.internal.ads.Im

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ C2645Km f25566u;

            {
                this.f25566u = this;
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC3249gc
            public final void e(Object obj, Map map) {
                C2645Km c2645Km = this.f25566u;
                switch (i10) {
                    case 0:
                        c2645Km.f25969d.D();
                        break;
                    case 1:
                        InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) obj;
                        interfaceC4061vh.g0().f26159z = new S0.e(15, c2645Km, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            interfaceC4061vh.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            break;
                        } else {
                            interfaceC4061vh.loadData(str, "text/html", "UTF-8");
                            break;
                        }
                    case 2:
                        c2645Km.getClass();
                        int i62 = u2.z.f41319b;
                        v2.i.e("Showing native ads overlay.");
                        ((InterfaceC4061vh) obj).V().setVisibility(0);
                        c2645Km.f25968c.f29828y = true;
                        break;
                    case 3:
                        c2645Km.getClass();
                        int i92 = u2.z.f41319b;
                        v2.i.e("Hiding native ads overlay.");
                        ((InterfaceC4061vh) obj).V().setVisibility(8);
                        c2645Km.f25968c.f29828y = false;
                        break;
                    default:
                        c2645Km.f25967b.d(map);
                        break;
                }
            }
        }));
        final int i11 = 3;
        c3959tn.b("/hideOverlay", new C3151em(c3959tn, new WeakReference(a9), "/hideOverlay", new InterfaceC3249gc(this) { // from class: com.google.android.gms.internal.ads.Im

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ C2645Km f25566u;

            {
                this.f25566u = this;
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC3249gc
            public final void e(Object obj, Map map) {
                C2645Km c2645Km = this.f25566u;
                switch (i11) {
                    case 0:
                        c2645Km.f25969d.D();
                        break;
                    case 1:
                        InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) obj;
                        interfaceC4061vh.g0().f26159z = new S0.e(15, c2645Km, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            interfaceC4061vh.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            break;
                        } else {
                            interfaceC4061vh.loadData(str, "text/html", "UTF-8");
                            break;
                        }
                    case 2:
                        c2645Km.getClass();
                        int i62 = u2.z.f41319b;
                        v2.i.e("Showing native ads overlay.");
                        ((InterfaceC4061vh) obj).V().setVisibility(0);
                        c2645Km.f25968c.f29828y = true;
                        break;
                    case 3:
                        c2645Km.getClass();
                        int i92 = u2.z.f41319b;
                        v2.i.e("Hiding native ads overlay.");
                        ((InterfaceC4061vh) obj).V().setVisibility(8);
                        c2645Km.f25968c.f29828y = false;
                        break;
                    default:
                        c2645Km.f25967b.d(map);
                        break;
                }
            }
        }));
        return a9.V();
    }
}
