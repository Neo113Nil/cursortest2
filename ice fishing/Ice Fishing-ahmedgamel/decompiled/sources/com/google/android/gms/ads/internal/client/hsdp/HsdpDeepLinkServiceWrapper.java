package com.google.android.gms.ads.internal.client.hsdp;

import C2.y;
import L3.E;
import L3.InterfaceC0316b;
import L3.p;
import L3.z;
import W2.a;
import W2.b;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.bumptech.glide.e;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.C2501Ce;
import com.google.android.gms.internal.ads.InterfaceC2518De;
import com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory;
import g1.C4522b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import l.C4648e;
import q2.r;
import r2.AbstractBinderC4949b;
import r2.g;
import v2.i;

/* loaded from: classes.dex */
public class HsdpDeepLinkServiceWrapper extends AbstractBinderC4949b {

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC2518De f23555n;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC2518De f23556u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC0316b f23557v;

    public HsdpDeepLinkServiceWrapper() {
        super("com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper");
    }

    public final void U3(Context context, Throwable th, String str) {
        if (context == null) {
            i.d("Context is null, unable to report exception for method: ".concat(str), th);
            return;
        }
        if (((Boolean) r.f40207e.f40210c.a(AbstractC3569ma.te)).booleanValue()) {
            if (this.f23556u == null) {
                this.f23556u = C2501Ce.c(context);
            }
            this.f23556u.e("HsdpDeepLinkServiceWrapperUnsampled.".concat(str), th);
        } else {
            if (this.f23555n == null) {
                this.f23555n = C2501Ce.a(context);
            }
            this.f23555n.e("HsdpDeepLinkServiceWrapper.".concat(str), th);
        }
    }

    @Override // r2.InterfaceC4950c
    public void endSession(a aVar, String str) {
        Throwable th;
        Context context;
        try {
            context = (Context) b.F0(aVar);
            if (context != null) {
                try {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    if (this.f23557v == null) {
                        this.f23557v = HsdpDeepLinkServiceFactory.create(context);
                    }
                    ((p) this.f23557v).a(str);
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

    @Override // r2.InterfaceC4950c
    public void open(a aVar, String str, String str2, Bundle bundle, boolean z3, g gVar) {
        Throwable th;
        Context context;
        try {
            context = (Context) b.F0(aVar);
            if (context != null) {
                try {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    if (this.f23557v == null) {
                        this.f23557v = HsdpDeepLinkServiceFactory.create(context);
                    }
                    InterfaceC0316b interfaceC0316b = this.f23557v;
                    HashMap k9 = e.k(bundle);
                    if (str2 == null) {
                        str2 = "";
                    }
                    ((p) interfaceC0316b).b(str, str2, new C4522b(this, gVar), k9, z3);
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

    @Override // r2.InterfaceC4950c
    public void prewarm(a aVar, List<Bundle> list, r2.e eVar) {
        Throwable th;
        Context context = null;
        try {
            Context context2 = (Context) b.F0(aVar);
            if (context2 == null) {
                return;
            }
            try {
                if (this.f23557v == null) {
                    this.f23557v = HsdpDeepLinkServiceFactory.create(context2);
                }
                InterfaceC0316b interfaceC0316b = this.f23557v;
                ArrayList arrayList = new ArrayList();
                if (list != null) {
                    for (Bundle bundle : list) {
                        String string = bundle.getString("targetPackage");
                        if (!TextUtils.isEmpty(string)) {
                            IBinder binder = bundle.getBinder("window_token");
                            String string2 = bundle.getString("referrer");
                            HashMap k9 = e.k(bundle.getBundle("extra_query_params"));
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
                            arrayList.add(new z(string, string2, k9, binder));
                        }
                    }
                }
                C4648e c4648e = new C4648e(this, eVar);
                L3.g gVar = (L3.g) ((E) ((p) interfaceC0316b).f1723c.c());
                gVar.getClass();
                gVar.f1693b.a(new y(7, gVar, arrayList, c4648e));
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
