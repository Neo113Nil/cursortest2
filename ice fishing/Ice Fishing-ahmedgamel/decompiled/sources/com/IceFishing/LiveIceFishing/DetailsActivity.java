package com.IceFishing.LiveIceFishing;

import O.L;
import O.X;
import android.content.ActivityNotFoundException;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import h.AbstractActivityC4555k;
import i1.C4586c;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class DetailsActivity extends AbstractActivityC4555k {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f5876x = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f5877n = 0;

    /* renamed from: u, reason: collision with root package name */
    public TextView f5878u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f5879v;

    /* renamed from: w, reason: collision with root package name */
    public DetailsActivity f5880w;

    @Override // androidx.activity.p, android.app.Activity
    public final void onBackPressed() {
        try {
            Y0.p.e(this.f5880w).j(this, Y0.p.f3890t, Y0.p.f3882l, Y0.p.f3863I, new C4586c(15, this));
        } catch (ActivityNotFoundException e9) {
            e9.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC0484x, androidx.activity.p, D.AbstractActivityC0283m, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i = 7;
        super.onCreate(bundle);
        setContentView(C5248R.layout.activity_details);
        View findViewById = findViewById(C5248R.id.main);
        D0.n nVar = new D0.n(24);
        WeakHashMap weakHashMap = X.f2142a;
        L.u(findViewById, nVar);
        this.f5880w = this;
        this.f5879v = (TextView) findViewById(C5248R.id.tvtitle);
        this.f5878u = (TextView) findViewById(C5248R.id.tvData);
        Y0.p.i(this.f5880w, Y0.p.f3889s, Y0.p.f3881k, Y0.p.f3862H, Y0.p.f3865L, (ViewGroup) findViewById(C5248R.id.banner_container));
        Y0.p.k(this.f5880w, Y0.p.f3891u, Y0.p.f3883m, Y0.p.f3864K, (ViewGroup) findViewById(C5248R.id.native_ad_container));
        this.f5877n = getIntent().getIntExtra("discription", 0);
        this.f5879v.setSelected(true);
        int i4 = this.f5877n;
        if (i4 == 0) {
            this.f5878u.setText(C5248R.string.aa);
            this.f5879v.setText(C5248R.string.a);
        } else if (i4 == 1) {
            this.f5878u.setText(C5248R.string.bb);
            this.f5879v.setText(C5248R.string.b);
        } else if (i4 == 2) {
            this.f5878u.setText(C5248R.string.cc);
            this.f5879v.setText(C5248R.string.c);
        } else if (i4 == 3) {
            this.f5878u.setText(C5248R.string.dd);
            this.f5879v.setText(C5248R.string.d);
        } else if (i4 == 4) {
            this.f5878u.setText(C5248R.string.ee);
            this.f5879v.setText(C5248R.string.e);
        } else if (i4 == 5) {
            this.f5878u.setText(C5248R.string.ff);
            this.f5879v.setText(C5248R.string.f);
        } else if (i4 == 6) {
            this.f5878u.setText(C5248R.string.gg);
            this.f5879v.setText(C5248R.string.g);
        } else if (i4 == 7) {
            this.f5878u.setText(C5248R.string.hh);
            this.f5879v.setText(C5248R.string.h);
        }
        findViewById(C5248R.id.imgBack).setOnClickListener(new N3.n(i, this));
    }
}
