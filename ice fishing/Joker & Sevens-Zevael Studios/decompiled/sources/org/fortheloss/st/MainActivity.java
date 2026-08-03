package org.fortheloss.st;

import android.R;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.CookieManager;
import androidx.lifecycle.m0;
import androidx.lifecycle.v0;
import d.o;
import e.h;
import f.a;
import f1.d0;
import h3.b1;
import h3.c1;
import h3.d1;
import hd.c;
import hd.j;
import hd.m;
import m7.g;
import pc.t;
import ub.f;
import vb.d;
import x4.s;
import xb.b;
import y1.x0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class MainActivity extends o implements b {
    public final Object A = new Object();
    public boolean B = false;
    public boolean C;

    /* renamed from: y, reason: collision with root package name */
    public g f5392y;

    /* renamed from: z, reason: collision with root package name */
    public volatile vb.b f5393z;

    public MainActivity() {
        j jVar = new j(this);
        a aVar = this.f1511h;
        aVar.getClass();
        o oVar = aVar.f2171b;
        if (oVar != null) {
            jVar.a(oVar);
        }
        aVar.f2170a.add(jVar);
    }

    @Override // xb.b
    public final Object c() {
        return l().c();
    }

    @Override // androidx.lifecycle.k
    public final v0 d() {
        v0 v0Var = (v0) this.f1526w.getValue();
        c cVar = (c) ((ub.a) v6.a.E(this, ub.a.class));
        yb.b a6 = cVar.a();
        s sVar = new s(3, cVar.f2880a, cVar.f2881b);
        v0Var.getClass();
        return new f(a6, v0Var, sVar);
    }

    public final vb.b l() {
        if (this.f5393z == null) {
            synchronized (this.A) {
                try {
                    if (this.f5393z == null) {
                        this.f5393z = new vb.b(this, 0);
                    }
                } finally {
                }
            }
        }
        return this.f5393z;
    }

    public final void m(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof b) {
            vb.b bVar = (vb.b) l().f7308j;
            g gVar = ((d) vb.b.b(bVar.f7306h, (MainActivity) bVar.f7308j).b(t.a(d.class))).f7311c;
            this.f5392y = gVar;
            if (((x3.c) gVar.f4957h) == null) {
                gVar.f4957h = (x3.c) e();
            }
        }
    }

    @Override // d.o, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Intent intent;
        Intent intent2;
        String action;
        m(bundle);
        if (!isTaskRoot() && (intent = getIntent()) != null && intent.hasCategory("android.intent.category.LAUNCHER") && (intent2 = getIntent()) != null && (action = intent2.getAction()) != null && action.equals("android.intent.action.MAIN")) {
            finish();
            return;
        }
        Window window = getWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            a2.c.e(window);
        } else if (i10 >= 30) {
            a2.c.d(window);
        } else {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
        }
        getWindow().setStatusBarColor(d0.s(d0.c(3424525854L)));
        Window window2 = getWindow();
        getWindow().getDecorView();
        int i11 = Build.VERSION.SDK_INT;
        (i11 >= 35 ? new d1(window2) : i11 >= 30 ? new c1(window2) : new b1(window2)).R();
        u0.d dVar = new u0.d(1995448158, new m(0, this), true);
        ViewGroup.LayoutParams layoutParams = h.f1911a;
        View childAt = ((ViewGroup) getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        x0 x0Var = childAt instanceof x0 ? (x0) childAt : null;
        if (x0Var != null) {
            x0Var.setParentCompositionContext(null);
            x0Var.setContent(dVar);
            return;
        }
        x0 x0Var2 = new x0(this);
        x0Var2.setParentCompositionContext(null);
        x0Var2.setContent(dVar);
        View decorView2 = getWindow().getDecorView();
        if (m0.e(decorView2) == null) {
            decorView2.setTag(R.id.view_tree_lifecycle_owner, this);
        }
        if (m0.f(decorView2) == null) {
            decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        }
        if (v6.a.C(decorView2) == null) {
            decorView2.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
        setContentView(x0Var2, h.f1911a);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        g gVar = this.f5392y;
        if (gVar != null) {
            gVar.f4957h = null;
        }
    }

    @Override // d.o, android.app.Activity
    public final void onNewIntent(Intent intent) {
        pc.j.e(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        CookieManager.getInstance().flush();
        SharedPreferences sharedPreferences = getSharedPreferences("overthink", 0);
        pc.j.d(sharedPreferences, "getSharedPreferences(...)");
        if (sharedPreferences.getBoolean("soundless", false)) {
            this.C = true;
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        SharedPreferences sharedPreferences = getSharedPreferences("overthink", 0);
        pc.j.d(sharedPreferences, "getSharedPreferences(...)");
        boolean z10 = sharedPreferences.getBoolean("soundless", false);
        if (this.C && z10) {
            this.C = false;
            SharedPreferences sharedPreferences2 = getSharedPreferences("overthink", 0);
            pc.j.d(sharedPreferences2, "getSharedPreferences(...)");
            SharedPreferences.Editor edit = sharedPreferences2.edit();
            edit.putBoolean("soundless", false);
            edit.apply();
            finish();
        }
    }
}
