package com.google.android.gms.internal.consent_sdk;

import a.AbstractC0426a;
import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.view.Window;
import com.google.android.gms.internal.ads.C2524Ch;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import s2.C4945n;

/* renamed from: com.google.android.gms.internal.consent_sdk.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4359k {

    /* renamed from: a, reason: collision with root package name */
    public final Application f36464a;

    /* renamed from: b, reason: collision with root package name */
    public final r f36465b;

    /* renamed from: c, reason: collision with root package name */
    public final C4343g f36466c;

    /* renamed from: d, reason: collision with root package name */
    public final C4375o f36467d;

    /* renamed from: e, reason: collision with root package name */
    public final C4367m f36468e;

    /* renamed from: f, reason: collision with root package name */
    public final C4410x f36469f;

    /* renamed from: g, reason: collision with root package name */
    public Dialog f36470g;

    /* renamed from: h, reason: collision with root package name */
    public C4383q f36471h;
    public final AtomicBoolean i = new AtomicBoolean();

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReference f36472j = new AtomicReference();

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReference f36473k = new AtomicReference();

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReference f36474l = new AtomicReference();

    /* renamed from: m, reason: collision with root package name */
    public boolean f36475m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f36476n = false;

    public C4359k(Application application, r rVar, C4343g c4343g, C4375o c4375o, C4367m c4367m, C4410x c4410x) {
        this.f36464a = application;
        this.f36465b = rVar;
        this.f36466c = c4343g;
        this.f36467d = c4375o;
        this.f36468e = c4367m;
        this.f36469f = c4410x;
    }

    public final void a(Activity activity, O3.b bVar) {
        C.a();
        ((Queue) this.f36469f.f36558h.get()).add(Long.valueOf(System.currentTimeMillis()));
        if (!this.i.compareAndSet(false, true)) {
            C4364l0 c4364l0 = new C4364l0(3, true != this.f36475m ? "ConsentForm#show can only be invoked once." : "Privacy options form is being loading. Please try again later.");
            d(c4364l0);
            bVar.onConsentFormDismissed(c4364l0.a());
            return;
        }
        C4383q c4383q = this.f36471h;
        C2524Ch c2524Ch = c4383q.f36507u;
        Objects.requireNonNull(c2524Ch);
        c4383q.f36506n.post(new RunnableC4379p(c2524Ch, 0));
        C4351i c4351i = new C4351i(this, activity);
        this.f36464a.registerActivityLifecycleCallbacks(c4351i);
        this.f36474l.set(c4351i);
        this.f36465b.f36511a = activity;
        Dialog dialog = new Dialog(activity, R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(this.f36471h);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            C4364l0 c4364l02 = new C4364l0(3, "Activity with null windows is passed in.");
            d(c4364l02);
            bVar.onConsentFormDismissed(c4364l02.a());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setFlags(com.anythink.basead.exoplayer.b.bc, com.anythink.basead.exoplayer.b.bc);
        AbstractC0426a.n(window, false);
        this.f36473k.set(bVar);
        dialog.show();
        this.f36470g = dialog;
        this.f36471h.a("UMP_messagePresented", "");
        d(null);
    }

    public final void b(O3.h hVar, O3.g gVar) {
        C4367m c4367m = this.f36468e;
        r rVar = (r) ((Z2) c4367m.f36485n).f();
        Handler handler = C.f36261a;
        E.c(handler);
        this.f36471h = new C4383q(rVar, handler, ((C4945n) c4367m.f36486u).f());
        boolean z6 = this.f36475m;
        C4410x c4410x = this.f36469f;
        if (!z6) {
            ((Queue) c4410x.f36559j.get()).add(Long.valueOf(System.currentTimeMillis()));
        }
        C4383q c4383q = this.f36471h;
        c4383q.setBackgroundColor(0);
        c4383q.getSettings().setJavaScriptEnabled(true);
        c4383q.getSettings().setAllowFileAccess(false);
        c4383q.getSettings().setAllowContentAccess(false);
        c4383q.setWebViewClient(new com.IceFishing.LiveIceFishing.t(c4383q));
        if (!this.f36475m) {
            c4410x.a((Queue) c4410x.f36559j.get(), 3, 2, null);
        }
        this.f36472j.set(new C4355j(hVar, gVar));
        C4383q c4383q2 = this.f36471h;
        C4375o c4375o = this.f36467d;
        c4383q2.loadDataWithBaseURL(c4375o.f36497a, c4375o.f36498b, "text/html", "UTF-8", null);
        handler.postDelayed(new RunnableC4347h(0, this), 10000L);
    }

    public final void c(C4364l0 c4364l0) {
        C4355j c4355j = (C4355j) this.f36472j.getAndSet(null);
        if (c4355j == null) {
            return;
        }
        if (!this.f36475m) {
            String message = c4364l0.getMessage();
            boolean z6 = this.f36476n;
            C4410x c4410x = this.f36469f;
            if (z6) {
                c4410x.a((Queue) c4410x.i.get(), 10, 11, message);
            } else {
                c4410x.a((Queue) c4410x.f36557g.get(), 4, 5, message);
            }
        }
        c4355j.b(c4364l0.a());
    }

    public final void d(C4364l0 c4364l0) {
        if (this.f36475m) {
            return;
        }
        String message = c4364l0 == null ? null : c4364l0.getMessage();
        boolean z6 = this.f36476n;
        C4410x c4410x = this.f36469f;
        if (z6) {
            c4410x.a((Queue) c4410x.i.get(), 10, 11, message);
        } else {
            c4410x.a((Queue) c4410x.f36558h.get(), 6, 7, message);
        }
    }
}
