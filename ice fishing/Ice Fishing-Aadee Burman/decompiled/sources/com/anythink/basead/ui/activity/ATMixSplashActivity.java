package com.anythink.basead.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;
import com.anythink.basead.ui.BaseATActivity;
import com.anythink.core.basead.a;
import com.anythink.core.basead.b.c;
import com.anythink.core.common.d.t;
import com.anythink.core.common.l.f.a.a;

/* loaded from: classes.dex */
public class ATMixSplashActivity extends BaseATActivity {

    /* renamed from: o, reason: collision with root package name */
    private String f10429o;

    /* renamed from: p, reason: collision with root package name */
    private FrameLayout f10430p;

    public static void b(Activity activity, c cVar) {
        if (cVar == null) {
            return;
        }
        Context g4 = t.b().g();
        if (activity == null || activity.isFinishing()) {
            Log.i("anythink_BaseATActivity", "Activity is null");
        } else {
            g4 = activity;
        }
        Intent intent = new Intent(g4, (Class<?>) ATMixSplashActivity.class);
        intent.putExtra(a.C0072a.f11869d, cVar.f11920d);
        if (!(g4 instanceof Activity)) {
            intent.addFlags(268435456);
        }
        g4.startActivity(intent);
        if (activity == null || activity.isFinishing()) {
            return;
        }
        activity.overridePendingTransition(0, 0);
    }

    @Override // com.anythink.basead.ui.BaseATActivity
    public final void a(Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(this);
        this.f10430p = frameLayout;
        setContentView(frameLayout);
        try {
            this.f10429o = getIntent().getStringExtra(a.C0072a.f11869d);
            a.InterfaceC0084a c9 = com.anythink.basead.mixad.a.a().c(this.f10429o);
            if (c9 != null) {
                c9.a(this, this.f10430p);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.basead.ui.BaseATActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    private void a() {
        this.f10429o = getIntent().getStringExtra(a.C0072a.f11869d);
    }

    private void b() {
        a.InterfaceC0084a c9 = com.anythink.basead.mixad.a.a().c(this.f10429o);
        if (c9 != null) {
            c9.a(this, this.f10430p);
        }
    }
}
