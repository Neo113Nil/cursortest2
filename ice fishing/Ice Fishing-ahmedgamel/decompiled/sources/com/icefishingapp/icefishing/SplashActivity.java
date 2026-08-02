package com.icefishingapp.icefishing;

import O.L;
import O.X;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.Window;
import androidx.activity.I;
import com.google.android.gms.internal.ads.C3709p5;
import com.google.android.gms.internal.consent_sdk.C4300b;
import com.google.android.gms.internal.consent_sdk.W0;
import com.google.android.gms.internal.consent_sdk.Z2;
import com.icefishingapp.icefishing.adscode.ApplinkActivity;
import g1.C4522b;
import g1.C4523c;
import java.util.HashSet;
import java.util.WeakHashMap;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import l1.C4656b;
import m1.C4726a;
import m1.C4729d;

/* loaded from: classes2.dex */
public class SplashActivity extends ApplinkActivity {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f36886A = 0;

    /* renamed from: v, reason: collision with root package name */
    public Intent f36887v;

    /* renamed from: x, reason: collision with root package name */
    public C4522b f36889x;

    /* renamed from: y, reason: collision with root package name */
    public W0 f36890y;

    /* renamed from: w, reason: collision with root package name */
    public final SplashActivity f36888w = this;

    /* renamed from: z, reason: collision with root package name */
    public final Handler f36891z = new Handler(Looper.getMainLooper());

    public final void e() {
        F1.a aVar = new F1.a(16, this);
        o4.m.f39612d = getSharedPreferences("MyPref", 0);
        C4726a c4726a = new C4726a(new a4.e());
        Context applicationContext = getApplicationContext();
        m1.e eVar = new m1.e();
        eVar.f39301n = applicationContext;
        eVar.f39302u = null;
        S0.q qVar = new S0.q(new C3709p5(eVar), c4726a);
        C4656b c4656b = (C4656b) qVar.i;
        if (c4656b != null) {
            c4656b.f38886x = true;
            c4656b.interrupt();
        }
        for (l1.e eVar2 : (l1.e[]) qVar.f2834h) {
            if (eVar2 != null) {
                eVar2.f38894x = true;
                eVar2.interrupt();
            }
        }
        C4656b c4656b2 = new C4656b((PriorityBlockingQueue) qVar.f2829c, (PriorityBlockingQueue) qVar.f2830d, (C3709p5) qVar.f2831e, (C4523c) qVar.f2833g);
        qVar.i = c4656b2;
        c4656b2.start();
        for (int i = 0; i < ((l1.e[]) qVar.f2834h).length; i++) {
            l1.e eVar3 = new l1.e((PriorityBlockingQueue) qVar.f2830d, (C4726a) qVar.f2832f, (C3709p5) qVar.f2831e, (C4523c) qVar.f2833g);
            ((l1.e[]) qVar.f2834h)[i] = eVar3;
            eVar3.start();
        }
        String str = this.f36902n;
        j4.q qVar2 = new j4.q();
        qVar2.f38436w = this;
        qVar2.f38433n = aVar;
        qVar2.f38434u = this;
        qVar2.f38435v = aVar;
        C4729d c4729d = new C4729d(str, qVar2, new F(aVar));
        c4729d.f39287A = false;
        c4729d.f39300z = qVar;
        synchronized (((HashSet) qVar.f2828b)) {
            ((HashSet) qVar.f2828b).add(c4729d);
        }
        c4729d.f39299y = Integer.valueOf(((AtomicInteger) qVar.f2827a).incrementAndGet());
        c4729d.a("add-to-queue");
        qVar.j();
        if (c4729d.f39287A) {
            ((PriorityBlockingQueue) qVar.f2829c).add(c4729d);
        } else {
            ((PriorityBlockingQueue) qVar.f2830d).add(c4729d);
        }
    }

    public final boolean f() {
        return (isFinishing() || isDestroyed()) ? false : true;
    }

    public final void g() {
        I0.j jVar = new I0.j(new F1.a(3, false));
        W0 w02 = (W0) ((Z2) C4300b.b(this).f35655h).f();
        this.f36890y = w02;
        w02.b(this, jVar, new B(this), new B(this));
    }

    @Override // com.icefishingapp.icefishing.adscode.ApplinkActivity, androidx.fragment.app.AbstractActivityC0480x, androidx.activity.p, D.AbstractActivityC0295n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i = 0;
        super.onCreate(bundle);
        setContentView(C5275R.layout.activity_splash);
        int i6 = androidx.activity.r.f4464a;
        androidx.activity.H h9 = androidx.activity.H.f4430n;
        I i9 = new I(0, 0, h9);
        I i10 = new I(androidx.activity.r.f4464a, androidx.activity.r.f4465b, h9);
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.h.d(decorView, "window.decorView");
        Resources resources = decorView.getResources();
        kotlin.jvm.internal.h.d(resources, "view.resources");
        boolean booleanValue = ((Boolean) h9.invoke(resources)).booleanValue();
        Resources resources2 = decorView.getResources();
        kotlin.jvm.internal.h.d(resources2, "view.resources");
        boolean booleanValue2 = ((Boolean) h9.invoke(resources2)).booleanValue();
        int i11 = Build.VERSION.SDK_INT;
        com.bumptech.glide.f wVar = i11 >= 30 ? new androidx.activity.w() : i11 >= 29 ? new androidx.activity.v() : i11 >= 28 ? new androidx.activity.u() : i11 >= 26 ? new androidx.activity.t() : new androidx.activity.s();
        Window window = getWindow();
        kotlin.jvm.internal.h.d(window, "window");
        wVar.z(i9, i10, window, decorView, booleanValue, booleanValue2);
        Window window2 = getWindow();
        kotlin.jvm.internal.h.d(window2, "window");
        wVar.a(window2);
        View findViewById = findViewById(C5275R.id.main);
        B1.x xVar = new B1.x(28);
        WeakHashMap weakHashMap = X.f2054a;
        L.u(findViewById, xVar);
        this.f36889x = new C4522b(this);
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
        if (connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnected()) {
            g();
            return;
        }
        try {
            AlertDialog create = new AlertDialog.Builder(this).create();
            create.setTitle("Internet");
            create.setMessage("Internet not available, Cross check your internet connectivity and try again");
            create.setIcon(C5275R.drawable.logo);
            create.setCanceledOnTouchOutside(false);
            create.setButton("OK", new D(i, this));
            create.show();
        } catch (Exception e9) {
            Log.d("", "Show Dialog: " + e9.getMessage());
        }
    }

    @Override // h.AbstractActivityC4551k, androidx.fragment.app.AbstractActivityC0480x, android.app.Activity
    public final void onDestroy() {
        this.f36891z.removeCallbacksAndMessages(null);
        super.onDestroy();
    }
}
