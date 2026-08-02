package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import java.util.Iterator;
import org.json.JSONObject;
import r2.C4906k;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.eq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3178eq {

    /* renamed from: a, reason: collision with root package name */
    public final Context f30769a;

    /* renamed from: b, reason: collision with root package name */
    public final C5189a f30770b;

    /* renamed from: c, reason: collision with root package name */
    public final St f30771c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC4084vh f30772d;

    /* renamed from: e, reason: collision with root package name */
    public final C3230fo f30773e;

    /* renamed from: f, reason: collision with root package name */
    public Zv f30774f;

    public C3178eq(Context context, C5189a c5189a, St st, InterfaceC4084vh interfaceC4084vh, C3230fo c3230fo) {
        this.f30769a = context;
        this.f30770b = c5189a;
        this.f30771c = st;
        this.f30772d = interfaceC4084vh;
        this.f30773e = c3230fo;
    }

    public final synchronized boolean a() {
        InterfaceC4084vh interfaceC4084vh;
        St st = this.f30771c;
        if (st.f28383T) {
            C3324ha c3324ha = AbstractC3592ma.f33046h6;
            s2.r rVar = s2.r.f40506e;
            if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                if (((Boolean) rVar.f40509c.a(AbstractC3592ma.f33072k6)).booleanValue() && (interfaceC4084vh = this.f30772d) != null) {
                    if (this.f30774f != null) {
                        int i = w2.z.f41712b;
                        x2.i.f("Omid javascript session service already started for ad.");
                        return false;
                    }
                    Context context = this.f30769a;
                    C4906k c4906k = C4906k.f40186C;
                    c4906k.f40211x.getClass();
                    if (!C3495kl.e(context)) {
                        int i4 = w2.z.f41712b;
                        x2.i.f("Unable to initialize omid.");
                        return false;
                    }
                    C3128du c3128du = st.f28385V;
                    c3128du.getClass();
                    if (((JSONObject) c3128du.f30647u).optBoolean((String) rVar.f40509c.a(AbstractC3592ma.f33091m6), true)) {
                        C5189a c5189a = this.f30770b;
                        C3495kl c3495kl = c4906k.f40211x;
                        WebView q8 = interfaceC4084vh.q();
                        c3495kl.getClass();
                        Zv zv = (Zv) C3495kl.o(new S0.s(19, c5189a, q8));
                        if (((Boolean) rVar.f40509c.a(AbstractC3592ma.f33082l6)).booleanValue()) {
                            C3230fo c3230fo = this.f30773e;
                            String str = zv != null ? "1" : "0";
                            S0.e a9 = c3230fo.a();
                            a9.M("omid_js_session_success", str);
                            a9.N();
                        }
                        if (zv == null) {
                            int i6 = w2.z.f41712b;
                            x2.i.f("Unable to create javascript session service.");
                            return false;
                        }
                        int i9 = w2.z.f41712b;
                        x2.i.e("Created omid javascript session service.");
                        this.f30774f = zv;
                        interfaceC4084vh.L0(this);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final synchronized void b() {
        InterfaceC4084vh interfaceC4084vh;
        try {
            Zv zv = this.f30774f;
            if (zv == null || (interfaceC4084vh = this.f30772d) == null) {
                return;
            }
            Iterator it = interfaceC4084vh.P().iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                C4906k.f40186C.f40211x.getClass();
                C3495kl.p(new RunnableC3071cq(1, zv, view));
            }
            interfaceC4084vh.d("onSdkLoaded", C3793qC.f33993z);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        InterfaceC4084vh interfaceC4084vh;
        if (this.f30774f == null || (interfaceC4084vh = this.f30772d) == null) {
            return;
        }
        interfaceC4084vh.d("onSdkImpression", C3793qC.f33993z);
    }
}
