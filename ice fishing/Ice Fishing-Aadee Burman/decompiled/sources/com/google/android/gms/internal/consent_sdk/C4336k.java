package com.google.android.gms.internal.consent_sdk;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.view.Window;
import com.google.android.gms.internal.ads.C2504Ch;
import com.google.android.gms.internal.ads.C3753pw;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import q2.C4896n;

/* renamed from: com.google.android.gms.internal.consent_sdk.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4336k {

    /* renamed from: a, reason: collision with root package name */
    public final Application f35695a;

    /* renamed from: b, reason: collision with root package name */
    public final r f35696b;

    /* renamed from: c, reason: collision with root package name */
    public final C4320g f35697c;

    /* renamed from: d, reason: collision with root package name */
    public final C4352o f35698d;

    /* renamed from: e, reason: collision with root package name */
    public final C4344m f35699e;

    /* renamed from: f, reason: collision with root package name */
    public final C4387x f35700f;

    /* renamed from: g, reason: collision with root package name */
    public Dialog f35701g;

    /* renamed from: h, reason: collision with root package name */
    public C4360q f35702h;
    public final AtomicBoolean i = new AtomicBoolean();

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReference f35703j = new AtomicReference();

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReference f35704k = new AtomicReference();

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReference f35705l = new AtomicReference();

    /* renamed from: m, reason: collision with root package name */
    public boolean f35706m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f35707n = false;

    public C4336k(Application application, r rVar, C4320g c4320g, C4352o c4352o, C4344m c4344m, C4387x c4387x) {
        this.f35695a = application;
        this.f35696b = rVar;
        this.f35697c = c4320g;
        this.f35698d = c4352o;
        this.f35699e = c4344m;
        this.f35700f = c4387x;
    }

    public final void a(Activity activity, M3.b bVar) {
        C.a();
        ((Queue) this.f35700f.f35789h.get()).add(Long.valueOf(System.currentTimeMillis()));
        if (!this.i.compareAndSet(false, true)) {
            C4341l0 c4341l0 = new C4341l0(3, true != this.f35706m ? "ConsentForm#show can only be invoked once." : "Privacy options form is being loading. Please try again later.");
            d(c4341l0);
            bVar.onConsentFormDismissed(c4341l0.a());
            return;
        }
        C4360q c4360q = this.f35702h;
        C2504Ch c2504Ch = c4360q.f35738u;
        Objects.requireNonNull(c2504Ch);
        c4360q.f35737n.post(new RunnableC4356p(c2504Ch, 0));
        C4328i c4328i = new C4328i(this, activity);
        this.f35695a.registerActivityLifecycleCallbacks(c4328i);
        this.f35705l.set(c4328i);
        this.f35696b.f35742a = activity;
        Dialog dialog = new Dialog(activity, R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(this.f35702h);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            C4341l0 c4341l02 = new C4341l0(3, "Activity with null windows is passed in.");
            d(c4341l02);
            bVar.onConsentFormDismissed(c4341l02.a());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setFlags(com.anythink.basead.exoplayer.b.bc, com.anythink.basead.exoplayer.b.bc);
        com.bumptech.glide.d.j(window, false);
        this.f35704k.set(bVar);
        dialog.show();
        this.f35701g = dialog;
        this.f35702h.a("UMP_messagePresented", "");
        d(null);
    }

    public final void b(M3.h hVar, M3.g gVar) {
        C4344m c4344m = this.f35699e;
        r rVar = (r) ((Z2) c4344m.f35716n).f();
        Handler handler = C.f35492a;
        E.c(handler);
        this.f35702h = new C4360q(rVar, handler, ((C4896n) c4344m.f35717u).f());
        boolean z3 = this.f35706m;
        C4387x c4387x = this.f35700f;
        if (!z3) {
            ((Queue) c4387x.f35790j.get()).add(Long.valueOf(System.currentTimeMillis()));
        }
        C4360q c4360q = this.f35702h;
        c4360q.setBackgroundColor(0);
        c4360q.getSettings().setJavaScriptEnabled(true);
        c4360q.getSettings().setAllowFileAccess(false);
        c4360q.getSettings().setAllowContentAccess(false);
        c4360q.setWebViewClient(new C3753pw(c4360q));
        if (!this.f35706m) {
            c4387x.a((Queue) c4387x.f35790j.get(), 3, 2, null);
        }
        this.f35703j.set(new C4332j(hVar, gVar));
        C4360q c4360q2 = this.f35702h;
        C4352o c4352o = this.f35698d;
        c4360q2.loadDataWithBaseURL(c4352o.f35728a, c4352o.f35729b, "text/html", "UTF-8", null);
        handler.postDelayed(new RunnableC4324h(0, this), 10000L);
    }

    public final void c(C4341l0 c4341l0) {
        C4332j c4332j = (C4332j) this.f35703j.getAndSet(null);
        if (c4332j == null) {
            return;
        }
        if (!this.f35706m) {
            String message = c4341l0.getMessage();
            boolean z3 = this.f35707n;
            C4387x c4387x = this.f35700f;
            if (z3) {
                c4387x.a((Queue) c4387x.i.get(), 10, 11, message);
            } else {
                c4387x.a((Queue) c4387x.f35788g.get(), 4, 5, message);
            }
        }
        c4332j.b(c4341l0.a());
    }

    public final void d(C4341l0 c4341l0) {
        if (this.f35706m) {
            return;
        }
        String message = c4341l0 == null ? null : c4341l0.getMessage();
        boolean z3 = this.f35707n;
        C4387x c4387x = this.f35700f;
        if (z3) {
            c4387x.a((Queue) c4387x.i.get(), 10, 11, message);
        } else {
            c4387x.a((Queue) c4387x.f35789h.get(), 6, 7, message);
        }
    }
}
