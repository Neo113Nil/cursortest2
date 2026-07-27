package com.icefishing.icefishingliveapp;

import O.L;
import O.X;
import android.app.AlertDialog;
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
import androidx.activity.H;
import androidx.activity.I;
import com.google.android.gms.internal.ads.C3614n5;
import com.google.android.gms.internal.consent_sdk.C4313b;
import com.google.android.gms.internal.consent_sdk.W0;
import com.google.android.gms.internal.consent_sdk.Z2;
import com.icefishing.icefishingliveapp.adscode.ApplinkActivity;
import java.util.HashSet;
import java.util.WeakHashMap;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import l1.C4685b;
import m1.C4776c;

/* loaded from: classes2.dex */
public class SplashActivity extends ApplinkActivity {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f37047A = 0;

    /* renamed from: v, reason: collision with root package name */
    public Intent f37048v;

    /* renamed from: x, reason: collision with root package name */
    public A f37050x;

    /* renamed from: y, reason: collision with root package name */
    public W0 f37051y;

    /* renamed from: w, reason: collision with root package name */
    public final SplashActivity f37049w = this;

    /* renamed from: z, reason: collision with root package name */
    public final Handler f37052z = new Handler(Looper.getMainLooper());

    public final void e() {
        h4.c cVar = new h4.c(24, this);
        k4.m.f38788d = getSharedPreferences("MyPref", 0);
        S0.q qVar = new S0.q(new C3614n5(new S0.e(getApplicationContext(), 15)), new S0.s(new L2.i(20)));
        C4685b c4685b = (C4685b) qVar.i;
        if (c4685b != null) {
            c4685b.f39028x = true;
            c4685b.interrupt();
        }
        for (l1.e eVar : (l1.e[]) qVar.f2946h) {
            if (eVar != null) {
                eVar.f39036x = true;
                eVar.interrupt();
            }
        }
        C4685b c4685b2 = new C4685b((PriorityBlockingQueue) qVar.f2941c, (PriorityBlockingQueue) qVar.f2942d, (C3614n5) qVar.f2943e, (i8.m) qVar.f2945g);
        qVar.i = c4685b2;
        c4685b2.start();
        for (int i = 0; i < ((l1.e[]) qVar.f2946h).length; i++) {
            l1.e eVar2 = new l1.e((PriorityBlockingQueue) qVar.f2942d, (S0.s) qVar.f2944f, (C3614n5) qVar.f2943e, (i8.m) qVar.f2945g);
            ((l1.e[]) qVar.f2946h)[i] = eVar2;
            eVar2.start();
        }
        C4776c c4776c = new C4776c(this.f37063n, new S0.i(this, cVar, this, cVar), new i8.m(cVar));
        c4776c.f39555A = false;
        c4776c.f39568z = qVar;
        synchronized (((HashSet) qVar.f2940b)) {
            ((HashSet) qVar.f2940b).add(c4776c);
        }
        c4776c.f39567y = Integer.valueOf(((AtomicInteger) qVar.f2939a).incrementAndGet());
        c4776c.a("add-to-queue");
        qVar.j();
        if (c4776c.f39555A) {
            ((PriorityBlockingQueue) qVar.f2941c).add(c4776c);
        } else {
            ((PriorityBlockingQueue) qVar.f2942d).add(c4776c);
        }
    }

    public final boolean f() {
        return (isFinishing() || isDestroyed()) ? false : true;
    }

    public final void g() {
        I0.j jVar = new I0.j(new h4.c(6));
        W0 w02 = (W0) ((Z2) C4313b.b(this).f35818h).d();
        this.f37051y = w02;
        w02.b(this, jVar, new B(this), new B(this));
    }

    @Override // com.icefishing.icefishingliveapp.adscode.ApplinkActivity, androidx.fragment.app.AbstractActivityC0490x, androidx.activity.p, D.AbstractActivityC0294n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i = 0;
        super.onCreate(bundle);
        setContentView(C5284R.layout.activity_splash);
        int i4 = androidx.activity.r.f4579a;
        H h9 = H.f4545n;
        I i9 = new I(0, 0, h9);
        I i10 = new I(androidx.activity.r.f4579a, androidx.activity.r.f4580b, h9);
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.h.d(decorView, "window.decorView");
        Resources resources = decorView.getResources();
        kotlin.jvm.internal.h.d(resources, "view.resources");
        boolean booleanValue = ((Boolean) h9.invoke(resources)).booleanValue();
        Resources resources2 = decorView.getResources();
        kotlin.jvm.internal.h.d(resources2, "view.resources");
        boolean booleanValue2 = ((Boolean) h9.invoke(resources2)).booleanValue();
        int i11 = Build.VERSION.SDK_INT;
        com.bumptech.glide.h wVar = i11 >= 30 ? new androidx.activity.w() : i11 >= 29 ? new androidx.activity.v() : i11 >= 28 ? new androidx.activity.u() : i11 >= 26 ? new androidx.activity.t() : new androidx.activity.s();
        Window window = getWindow();
        kotlin.jvm.internal.h.d(window, "window");
        wVar.A(i9, i10, window, decorView, booleanValue, booleanValue2);
        Window window2 = getWindow();
        kotlin.jvm.internal.h.d(window2, "window");
        wVar.a(window2);
        View findViewById = findViewById(C5284R.id.main);
        com.anythink.core.common.n.b.A a9 = new com.anythink.core.common.n.b.A(5);
        WeakHashMap weakHashMap = X.f2240a;
        L.u(findViewById, a9);
        this.f37050x = new A(this);
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
        if (connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnected()) {
            g();
            return;
        }
        try {
            AlertDialog create = new AlertDialog.Builder(this).create();
            create.setTitle("Internet");
            create.setMessage("Internet not available, Cross check your internet connectivity and try again");
            create.setIcon(C5284R.drawable.logo);
            create.setCanceledOnTouchOutside(false);
            create.setButton("OK", new D(i, this));
            create.show();
        } catch (Exception e6) {
            Log.d("", "Show Dialog: " + e6.getMessage());
        }
    }

    @Override // h.AbstractActivityC4553l, androidx.fragment.app.AbstractActivityC0490x, android.app.Activity
    public final void onDestroy() {
        this.f37052z.removeCallbacksAndMessages(null);
        super.onDestroy();
    }
}
