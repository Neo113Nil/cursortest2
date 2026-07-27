package com.icefishing.icefishinglive2;

import O.L;
import O.X;
import android.content.ActivityNotFoundException;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import h.AbstractActivityC4551k;
import java.util.WeakHashMap;
import o4.C4799l;

/* loaded from: classes2.dex */
public class DetailsActivity extends AbstractActivityC4551k {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f36383x = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f36384n = 0;

    /* renamed from: u, reason: collision with root package name */
    public TextView f36385u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f36386v;

    /* renamed from: w, reason: collision with root package name */
    public DetailsActivity f36387w;

    @Override // androidx.activity.p, android.app.Activity
    public final void onBackPressed() {
        try {
            C4799l.e(this.f36387w).j(this, C4799l.f39624t, C4799l.f39616l, C4799l.f39597I, new F1.a(12, this));
        } catch (ActivityNotFoundException e9) {
            e9.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC0480x, androidx.activity.p, D.AbstractActivityC0295n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i = 2;
        super.onCreate(bundle);
        setContentView(C5275R.layout.activity_details);
        View findViewById = findViewById(C5275R.id.main);
        B1.x xVar = new B1.x(25);
        WeakHashMap weakHashMap = X.f2054a;
        L.u(findViewById, xVar);
        this.f36387w = this;
        this.f36386v = (TextView) findViewById(C5275R.id.tvtitle);
        this.f36385u = (TextView) findViewById(C5275R.id.tvData);
        C4799l.i(this.f36387w, C4799l.f39623s, C4799l.f39615k, C4799l.f39596H, C4799l.f39599L, (ViewGroup) findViewById(C5275R.id.banner_container));
        C4799l.k(this.f36387w, C4799l.f39625u, C4799l.f39617m, C4799l.f39598K, (ViewGroup) findViewById(C5275R.id.native_ad_container));
        this.f36384n = getIntent().getIntExtra("discription", 0);
        this.f36386v.setSelected(true);
        int i6 = this.f36384n;
        if (i6 == 0) {
            this.f36385u.setText(C5275R.string.aa);
            this.f36386v.setText(C5275R.string.a);
        } else if (i6 == 1) {
            this.f36385u.setText(C5275R.string.bb);
            this.f36386v.setText(C5275R.string.b);
        } else if (i6 == 2) {
            this.f36385u.setText(C5275R.string.cc);
            this.f36386v.setText(C5275R.string.c);
        } else if (i6 == 3) {
            this.f36385u.setText(C5275R.string.dd);
            this.f36386v.setText(C5275R.string.d);
        } else if (i6 == 4) {
            this.f36385u.setText(C5275R.string.ee);
            this.f36386v.setText(C5275R.string.e);
        } else if (i6 == 5) {
            this.f36385u.setText(C5275R.string.ff);
            this.f36386v.setText(C5275R.string.f);
        } else if (i6 == 6) {
            this.f36385u.setText(C5275R.string.gg);
            this.f36386v.setText(C5275R.string.g);
        } else if (i6 == 7) {
            this.f36385u.setText(C5275R.string.hh);
            this.f36386v.setText(C5275R.string.h);
        }
        findViewById(C5275R.id.imgBack).setOnClickListener(new L3.q(i, this));
    }
}
