package com.IceFishing.LiveIceFishing;

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
import com.IceFishing.LiveIceFishing.adscode.ApplinkActivity;
import com.google.android.gms.internal.ads.C3732p5;
import com.google.android.gms.internal.consent_sdk.C4323b;
import com.google.android.gms.internal.consent_sdk.W0;
import com.google.android.gms.internal.consent_sdk.Z2;
import i1.C4586c;
import java.util.HashSet;
import java.util.WeakHashMap;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import m.R0;
import n1.C4765b;
import o1.C4797a;
import o1.C4800d;

/* loaded from: classes.dex */
public class SplashActivity extends ApplinkActivity {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f6375A = 0;

    /* renamed from: v, reason: collision with root package name */
    public Intent f6376v;

    /* renamed from: x, reason: collision with root package name */
    public I0.j f6378x;

    /* renamed from: y, reason: collision with root package name */
    public W0 f6379y;

    /* renamed from: w, reason: collision with root package name */
    public final SplashActivity f6377w = this;

    /* renamed from: z, reason: collision with root package name */
    public final Handler f6380z = new Handler(Looper.getMainLooper());

    public final void e() {
        C4586c c4586c = new C4586c(19, this);
        Y0.p.f3875d = getSharedPreferences("MyPref", 0);
        C4797a c4797a = new C4797a(new G3.e(22));
        Context applicationContext = getApplicationContext();
        k8.b bVar = new k8.b();
        bVar.f38634u = applicationContext;
        bVar.f38633n = null;
        S0.q qVar = new S0.q(new C3732p5(bVar), c4797a);
        C4765b c4765b = (C4765b) qVar.i;
        if (c4765b != null) {
            c4765b.f39624x = true;
            c4765b.interrupt();
        }
        for (n1.e eVar : (n1.e[]) qVar.f2963h) {
            if (eVar != null) {
                eVar.f39632x = true;
                eVar.interrupt();
            }
        }
        C4765b c4765b2 = new C4765b((PriorityBlockingQueue) qVar.f2958c, (PriorityBlockingQueue) qVar.f2959d, (C3732p5) qVar.f2960e, (R0) qVar.f2962g);
        qVar.i = c4765b2;
        c4765b2.start();
        for (int i = 0; i < ((n1.e[]) qVar.f2963h).length; i++) {
            n1.e eVar2 = new n1.e((PriorityBlockingQueue) qVar.f2959d, (C4797a) qVar.f2961f, (C3732p5) qVar.f2960e, (R0) qVar.f2962g);
            ((n1.e[]) qVar.f2963h)[i] = eVar2;
            eVar2.start();
        }
        String str = this.f6391n;
        l4.q qVar2 = new l4.q();
        qVar2.f38948w = this;
        qVar2.f38945n = c4586c;
        qVar2.f38946u = this;
        qVar2.f38947v = c4586c;
        C4800d c4800d = new C4800d(str, qVar2, new I0.j(15, c4586c));
        c4800d.f39730A = false;
        c4800d.f39743z = qVar;
        synchronized (((HashSet) qVar.f2957b)) {
            ((HashSet) qVar.f2957b).add(c4800d);
        }
        c4800d.f39742y = Integer.valueOf(((AtomicInteger) qVar.f2956a).incrementAndGet());
        c4800d.a("add-to-queue");
        qVar.j();
        if (c4800d.f39730A) {
            ((PriorityBlockingQueue) qVar.f2958c).add(c4800d);
        } else {
            ((PriorityBlockingQueue) qVar.f2959d).add(c4800d);
        }
    }

    public final boolean f() {
        return (isFinishing() || isDestroyed()) ? false : true;
    }

    public final void g() {
        n4.c cVar = new n4.c(new C4586c(8, false));
        W0 w02 = (W0) ((Z2) C4323b.b(this).f36424h).f();
        this.f6379y = w02;
        w02.b(this, cVar, new C(this), new C(this));
    }

    @Override // com.IceFishing.LiveIceFishing.adscode.ApplinkActivity, androidx.fragment.app.AbstractActivityC0484x, androidx.activity.p, D.AbstractActivityC0283m, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i = 0;
        super.onCreate(bundle);
        setContentView(C5248R.layout.activity_splash);
        int i4 = androidx.activity.r.f4432a;
        androidx.activity.H h3 = androidx.activity.H.f4398n;
        I i6 = new I(0, 0, h3);
        I i9 = new I(androidx.activity.r.f4432a, androidx.activity.r.f4433b, h3);
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.h.d(decorView, "window.decorView");
        Resources resources = decorView.getResources();
        kotlin.jvm.internal.h.d(resources, "view.resources");
        boolean booleanValue = ((Boolean) h3.invoke(resources)).booleanValue();
        Resources resources2 = decorView.getResources();
        kotlin.jvm.internal.h.d(resources2, "view.resources");
        boolean booleanValue2 = ((Boolean) h3.invoke(resources2)).booleanValue();
        int i10 = Build.VERSION.SDK_INT;
        com.bumptech.glide.g wVar = i10 >= 30 ? new androidx.activity.w() : i10 >= 29 ? new androidx.activity.v() : i10 >= 28 ? new androidx.activity.u() : i10 >= 26 ? new androidx.activity.t() : new androidx.activity.s();
        Window window = getWindow();
        kotlin.jvm.internal.h.d(window, "window");
        wVar.z(i6, i9, window, decorView, booleanValue, booleanValue2);
        Window window2 = getWindow();
        kotlin.jvm.internal.h.d(window2, "window");
        wVar.a(window2);
        View findViewById = findViewById(C5248R.id.main);
        D0.n nVar = new D0.n(27);
        WeakHashMap weakHashMap = X.f2142a;
        L.u(findViewById, nVar);
        this.f6378x = new I0.j(this);
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
        if (connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnected()) {
            g();
            return;
        }
        try {
            AlertDialog create = new AlertDialog.Builder(this).create();
            create.setTitle("Internet");
            create.setMessage("Internet not available, Cross check your internet connectivity and try again");
            create.setIcon(C5248R.drawable.logo);
            create.setCanceledOnTouchOutside(false);
            create.setButton("OK", new E(i, this));
            create.show();
        } catch (Exception e9) {
            Log.d("", "Show Dialog: " + e9.getMessage());
        }
    }

    @Override // h.AbstractActivityC4555k, androidx.fragment.app.AbstractActivityC0484x, android.app.Activity
    public final void onDestroy() {
        this.f6380z.removeCallbacksAndMessages(null);
        super.onDestroy();
    }
}
