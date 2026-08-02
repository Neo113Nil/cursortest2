package com.google.android.gms.ads.internal.client.hsdp;

import E2.x;
import N3.B;
import N3.InterfaceC0324b;
import N3.m;
import N3.w;
import Y2.a;
import Y2.b;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.bumptech.glide.d;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.C2521Ce;
import com.google.android.gms.internal.ads.InterfaceC2538De;
import com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory;
import h.C4543G;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import r2.C4900e;
import s2.r;
import t2.AbstractBinderC5033b;
import t2.e;
import t2.g;
import x2.i;

/* loaded from: classes.dex */
public class HsdpDeepLinkServiceWrapper extends AbstractBinderC5033b {

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC2538De f24335n;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC2538De f24336u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC0324b f24337v;

    public HsdpDeepLinkServiceWrapper() {
        super("com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper");
    }

    public final void U3(Context context, Throwable th, String str) {
        if (context == null) {
            i.d("Context is null, unable to report exception for method: ".concat(str), th);
            return;
        }
        if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.te)).booleanValue()) {
            if (this.f24336u == null) {
                this.f24336u = C2521Ce.c(context);
            }
            this.f24336u.e("HsdpDeepLinkServiceWrapperUnsampled.".concat(str), th);
        } else {
            if (this.f24335n == null) {
                this.f24335n = C2521Ce.a(context);
            }
            this.f24335n.e("HsdpDeepLinkServiceWrapper.".concat(str), th);
        }
    }

    @Override // t2.InterfaceC5034c
    public void endSession(a aVar, String str) {
        Throwable th;
        Context context;
        try {
            context = (Context) b.D0(aVar);
            if (context != null) {
                try {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    if (this.f24337v == null) {
                        this.f24337v = HsdpDeepLinkServiceFactory.create(context);
                    }
                    ((m) this.f24337v).a(str);
                } catch (Throwable th2) {
                    th = th2;
                    U3(context, th, "endSession");
                }
            }
        } catch (Throwable th3) {
            th = th3;
            context = null;
        }
    }

    @Override // t2.InterfaceC5034c
    public void open(a aVar, String str, String str2, Bundle bundle, boolean z6, g gVar) {
        Throwable th;
        Context context;
        try {
            context = (Context) b.D0(aVar);
            if (context != null) {
                try {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    if (this.f24337v == null) {
                        this.f24337v = HsdpDeepLinkServiceFactory.create(context);
                    }
                    InterfaceC0324b interfaceC0324b = this.f24337v;
                    HashMap P8 = d.P(bundle);
                    if (str2 == null) {
                        str2 = "";
                    }
                    C4543G c4543g = new C4543G();
                    c4543g.f37843n = gVar;
                    ((m) interfaceC0324b).b(str, str2, c4543g, P8, z6);
                } catch (Throwable th2) {
                    th = th2;
                    U3(context, th, "open");
                }
            }
        } catch (Throwable th3) {
            th = th3;
            context = null;
        }
    }

    @Override // t2.InterfaceC5034c
    public void prewarm(a aVar, List<Bundle> list, e eVar) {
        Throwable th;
        Context context = null;
        try {
            Context context2 = (Context) b.D0(aVar);
            if (context2 == null) {
                return;
            }
            try {
                if (this.f24337v == null) {
                    this.f24337v = HsdpDeepLinkServiceFactory.create(context2);
                }
                InterfaceC0324b interfaceC0324b = this.f24337v;
                ArrayList arrayList = new ArrayList();
                if (list != null) {
                    for (Bundle bundle : list) {
                        String string = bundle.getString("targetPackage");
                        if (!TextUtils.isEmpty(string)) {
                            IBinder binder = bundle.getBinder("window_token");
                            String string2 = bundle.getString("referrer");
                            HashMap P8 = d.P(bundle.getBundle("extra_query_params"));
                            if (Collections.EMPTY_MAP == null) {
                                throw new NullPointerException("Null extraQueryParams");
                            }
                            if (string == null) {
                                throw new NullPointerException("Null targetAppPackageName");
                            }
                            if (string2 == null) {
                                string2 = null;
                            }
                            if (binder == null) {
                                binder = null;
                            }
                            if (string2 == null) {
                                StringBuilder sb = new StringBuilder();
                                if (string2 == null) {
                                    sb.append(" referrer");
                                }
                                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                            }
                            arrayList.add(new w(string, string2, P8, binder));
                        }
                    }
                }
                C4900e c4900e = new C4900e(this, eVar);
                N3.g gVar = (N3.g) ((B) ((m) interfaceC0324b).f1996c.c());
                gVar.getClass();
                gVar.f1972b.a(new x(8, gVar, arrayList, c4900e));
            } catch (Throwable th2) {
                th = th2;
                context = context2;
                U3(context, th, "prewarm");
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
