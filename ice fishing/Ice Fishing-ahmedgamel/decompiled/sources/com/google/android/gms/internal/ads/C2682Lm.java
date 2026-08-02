package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Lm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2682Lm {

    /* renamed from: a, reason: collision with root package name */
    public final C2649Jn f26963a;

    /* renamed from: b, reason: collision with root package name */
    public final C4036un f26964b;

    /* renamed from: c, reason: collision with root package name */
    public final C3118dj f26965c;

    /* renamed from: d, reason: collision with root package name */
    public final C3282gm f26966d;

    public C2682Lm(C2649Jn c2649Jn, C4036un c4036un, C3118dj c3118dj, C3282gm c3282gm) {
        this.f26963a = c2649Jn;
        this.f26964b = c4036un;
        this.f26965c = c3118dj;
        this.f26966d = c3282gm;
    }

    public final View a() {
        InterfaceC4084vh a9 = this.f26963a.a(s2.f1.a(), null, null);
        a9.V().setVisibility(8);
        final int i = 4;
        a9.Z0("/sendMessageToSdk", new InterfaceC3272gc(this) { // from class: com.google.android.gms.internal.ads.Jm

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ C2682Lm f26490u;

            {
                this.f26490u = this;
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC3272gc
            public final void e(Object obj, Map map) {
                C2682Lm c2682Lm = this.f26490u;
                switch (i) {
                    case 0:
                        c2682Lm.f26966d.D();
                        break;
                    case 1:
                        InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) obj;
                        interfaceC4084vh.h0().f26956z = new S0.e(18, c2682Lm, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            interfaceC4084vh.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            break;
                        } else {
                            interfaceC4084vh.loadData(str, "text/html", "UTF-8");
                            break;
                        }
                    case 2:
                        c2682Lm.getClass();
                        int i4 = w2.z.f41712b;
                        x2.i.e("Showing native ads overlay.");
                        ((InterfaceC4084vh) obj).V().setVisibility(0);
                        c2682Lm.f26965c.f30601y = true;
                        break;
                    case 3:
                        c2682Lm.getClass();
                        int i6 = w2.z.f41712b;
                        x2.i.e("Hiding native ads overlay.");
                        ((InterfaceC4084vh) obj).V().setVisibility(8);
                        c2682Lm.f26965c.f30601y = false;
                        break;
                    default:
                        c2682Lm.f26964b.d(map);
                        break;
                }
            }
        });
        final int i4 = 0;
        a9.Z0("/adMuted", new InterfaceC3272gc(this) { // from class: com.google.android.gms.internal.ads.Jm

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ C2682Lm f26490u;

            {
                this.f26490u = this;
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC3272gc
            public final void e(Object obj, Map map) {
                C2682Lm c2682Lm = this.f26490u;
                switch (i4) {
                    case 0:
                        c2682Lm.f26966d.D();
                        break;
                    case 1:
                        InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) obj;
                        interfaceC4084vh.h0().f26956z = new S0.e(18, c2682Lm, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            interfaceC4084vh.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            break;
                        } else {
                            interfaceC4084vh.loadData(str, "text/html", "UTF-8");
                            break;
                        }
                    case 2:
                        c2682Lm.getClass();
                        int i42 = w2.z.f41712b;
                        x2.i.e("Showing native ads overlay.");
                        ((InterfaceC4084vh) obj).V().setVisibility(0);
                        c2682Lm.f26965c.f30601y = true;
                        break;
                    case 3:
                        c2682Lm.getClass();
                        int i6 = w2.z.f41712b;
                        x2.i.e("Hiding native ads overlay.");
                        ((InterfaceC4084vh) obj).V().setVisibility(8);
                        c2682Lm.f26965c.f30601y = false;
                        break;
                    default:
                        c2682Lm.f26964b.d(map);
                        break;
                }
            }
        });
        WeakReference weakReference = new WeakReference(a9);
        final int i6 = 1;
        InterfaceC3272gc interfaceC3272gc = new InterfaceC3272gc(this) { // from class: com.google.android.gms.internal.ads.Jm

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ C2682Lm f26490u;

            {
                this.f26490u = this;
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC3272gc
            public final void e(Object obj, Map map) {
                C2682Lm c2682Lm = this.f26490u;
                switch (i6) {
                    case 0:
                        c2682Lm.f26966d.D();
                        break;
                    case 1:
                        InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) obj;
                        interfaceC4084vh.h0().f26956z = new S0.e(18, c2682Lm, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            interfaceC4084vh.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            break;
                        } else {
                            interfaceC4084vh.loadData(str, "text/html", "UTF-8");
                            break;
                        }
                    case 2:
                        c2682Lm.getClass();
                        int i42 = w2.z.f41712b;
                        x2.i.e("Showing native ads overlay.");
                        ((InterfaceC4084vh) obj).V().setVisibility(0);
                        c2682Lm.f26965c.f30601y = true;
                        break;
                    case 3:
                        c2682Lm.getClass();
                        int i62 = w2.z.f41712b;
                        x2.i.e("Hiding native ads overlay.");
                        ((InterfaceC4084vh) obj).V().setVisibility(8);
                        c2682Lm.f26965c.f30601y = false;
                        break;
                    default:
                        c2682Lm.f26964b.d(map);
                        break;
                }
            }
        };
        C4036un c4036un = this.f26964b;
        c4036un.b("/loadHtml", new C3228fm(c4036un, weakReference, "/loadHtml", interfaceC3272gc));
        final int i9 = 2;
        c4036un.b("/showOverlay", new C3228fm(c4036un, new WeakReference(a9), "/showOverlay", new InterfaceC3272gc(this) { // from class: com.google.android.gms.internal.ads.Jm

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ C2682Lm f26490u;

            {
                this.f26490u = this;
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC3272gc
            public final void e(Object obj, Map map) {
                C2682Lm c2682Lm = this.f26490u;
                switch (i9) {
                    case 0:
                        c2682Lm.f26966d.D();
                        break;
                    case 1:
                        InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) obj;
                        interfaceC4084vh.h0().f26956z = new S0.e(18, c2682Lm, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            interfaceC4084vh.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            break;
                        } else {
                            interfaceC4084vh.loadData(str, "text/html", "UTF-8");
                            break;
                        }
                    case 2:
                        c2682Lm.getClass();
                        int i42 = w2.z.f41712b;
                        x2.i.e("Showing native ads overlay.");
                        ((InterfaceC4084vh) obj).V().setVisibility(0);
                        c2682Lm.f26965c.f30601y = true;
                        break;
                    case 3:
                        c2682Lm.getClass();
                        int i62 = w2.z.f41712b;
                        x2.i.e("Hiding native ads overlay.");
                        ((InterfaceC4084vh) obj).V().setVisibility(8);
                        c2682Lm.f26965c.f30601y = false;
                        break;
                    default:
                        c2682Lm.f26964b.d(map);
                        break;
                }
            }
        }));
        final int i10 = 3;
        c4036un.b("/hideOverlay", new C3228fm(c4036un, new WeakReference(a9), "/hideOverlay", new InterfaceC3272gc(this) { // from class: com.google.android.gms.internal.ads.Jm

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ C2682Lm f26490u;

            {
                this.f26490u = this;
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC3272gc
            public final void e(Object obj, Map map) {
                C2682Lm c2682Lm = this.f26490u;
                switch (i10) {
                    case 0:
                        c2682Lm.f26966d.D();
                        break;
                    case 1:
                        InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) obj;
                        interfaceC4084vh.h0().f26956z = new S0.e(18, c2682Lm, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            interfaceC4084vh.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            break;
                        } else {
                            interfaceC4084vh.loadData(str, "text/html", "UTF-8");
                            break;
                        }
                    case 2:
                        c2682Lm.getClass();
                        int i42 = w2.z.f41712b;
                        x2.i.e("Showing native ads overlay.");
                        ((InterfaceC4084vh) obj).V().setVisibility(0);
                        c2682Lm.f26965c.f30601y = true;
                        break;
                    case 3:
                        c2682Lm.getClass();
                        int i62 = w2.z.f41712b;
                        x2.i.e("Hiding native ads overlay.");
                        ((InterfaceC4084vh) obj).V().setVisibility(8);
                        c2682Lm.f26965c.f30601y = false;
                        break;
                    default:
                        c2682Lm.f26964b.d(map);
                        break;
                }
            }
        }));
        return a9.V();
    }
}
