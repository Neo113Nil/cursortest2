package com.IceFishing.LiveIceFishing;

import O.E0;
import O.L;
import O.X;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import h.AbstractActivityC4555k;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class IntroActivity extends AbstractActivityC4555k {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f6264y = 0;

    /* renamed from: n, reason: collision with root package name */
    public ImageView[] f6265n = null;

    /* renamed from: u, reason: collision with root package name */
    public final IntroActivity f6266u = this;

    /* renamed from: v, reason: collision with root package name */
    public ViewPager f6267v;

    /* renamed from: w, reason: collision with root package name */
    public TextView f6268w;

    /* renamed from: x, reason: collision with root package name */
    public Intent f6269x;

    public final void e(int i) {
        for (int i4 = 0; i4 < 3; i4++) {
            if (i4 == i) {
                this.f6265n[i4].setImageResource(C5248R.drawable.ic_dot_select);
            } else {
                this.f6265n[i4].setImageResource(C5248R.drawable.ic_dot_not_select);
                this.f6268w.setText("NEXT");
            }
            if (i == 2) {
                this.f6268w.setText("DONE");
            }
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC0484x, androidx.activity.p, D.AbstractActivityC0283m, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i = 0;
        super.onCreate(bundle);
        setContentView(C5248R.layout.activity_intro);
        View findViewById = findViewById(C5248R.id.main);
        D0.n nVar = new D0.n(25);
        WeakHashMap weakHashMap = X.f2142a;
        L.u(findViewById, nVar);
        this.f6267v = (ViewPager) findViewById(C5248R.id.viewPager);
        Y0.p.i(this.f6266u, Y0.p.f3889s, Y0.p.f3881k, Y0.p.f3862H, Y0.p.f3865L, (ViewGroup) findViewById(C5248R.id.banner_container));
        this.f6268w = (TextView) findViewById(C5248R.id.txtNext);
        this.f6265n = new ImageView[]{(ImageView) findViewById(C5248R.id.view_1), (ImageView) findViewById(C5248R.id.view_2), (ImageView) findViewById(C5248R.id.view_3)};
        ViewPager viewPager = this.f6267v;
        X0.e eVar = new X0.e();
        eVar.f3751b = new int[]{C5248R.drawable.intro1, C5248R.drawable.intro2, C5248R.drawable.intro3};
        eVar.f3752c = new int[]{C5248R.string.app_name, C5248R.string.intro2, C5248R.string.intro3};
        eVar.f3753d = new int[]{C5248R.string.intro1_dec, C5248R.string.intro2_dec, C5248R.string.intro3_dec};
        eVar.f3750a = this;
        viewPager.setAdapter(eVar);
        ViewPager viewPager2 = this.f6267v;
        n nVar2 = new n(this, 0);
        if (viewPager2.f5309u0 == null) {
            viewPager2.f5309u0 = new ArrayList();
        }
        viewPager2.f5309u0.add(nVar2);
        this.f6268w.setOnClickListener(new o(this, i));
        findViewById(C5248R.id.skip).setOnClickListener(new o(this, 1));
    }

    @Override // androidx.fragment.app.AbstractActivityC0484x, android.app.Activity
    public final void onResume() {
        super.onResume();
        E0 h3 = Build.VERSION.SDK_INT >= 30 ? X.h(getWindow().getDecorView()) : new E0(getWindow(), null);
        if (h3 != null) {
            com.bumptech.glide.e eVar = h3.f2127a;
            eVar.k();
            eVar.d();
            getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new p(this));
        }
    }

    @Override // h.AbstractActivityC4555k, androidx.fragment.app.AbstractActivityC0484x, android.app.Activity
    public final void onStart() {
        super.onStart();
        e(this.f6267v.getCurrentItem());
    }
}
