package com.icefishing.icefishinglive2;

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
import h.AbstractActivityC4551k;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o4.C4799l;

/* loaded from: classes2.dex */
public class IntroActivity extends AbstractActivityC4551k {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f36774y = 0;

    /* renamed from: n, reason: collision with root package name */
    public ImageView[] f36775n = null;

    /* renamed from: u, reason: collision with root package name */
    public final IntroActivity f36776u = this;

    /* renamed from: v, reason: collision with root package name */
    public ViewPager f36777v;

    /* renamed from: w, reason: collision with root package name */
    public TextView f36778w;

    /* renamed from: x, reason: collision with root package name */
    public Intent f36779x;

    public final void e(int i) {
        for (int i6 = 0; i6 < 3; i6++) {
            if (i6 == i) {
                this.f36775n[i6].setImageResource(C5275R.drawable.ic_dot_select);
            } else {
                this.f36775n[i6].setImageResource(C5275R.drawable.ic_dot_not_select);
                this.f36778w.setText("NEXT");
            }
            if (i == 2) {
                this.f36778w.setText("DONE");
            }
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC0480x, androidx.activity.p, D.AbstractActivityC0295n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i = 0;
        super.onCreate(bundle);
        setContentView(C5275R.layout.activity_intro);
        View findViewById = findViewById(C5275R.id.main);
        B1.x xVar = new B1.x(26);
        WeakHashMap weakHashMap = X.f2054a;
        L.u(findViewById, xVar);
        this.f36777v = (ViewPager) findViewById(C5275R.id.viewPager);
        C4799l.i(this.f36776u, C4799l.f39623s, C4799l.f39615k, C4799l.f39596H, C4799l.f39599L, (ViewGroup) findViewById(C5275R.id.banner_container));
        this.f36778w = (TextView) findViewById(C5275R.id.txtNext);
        this.f36775n = new ImageView[]{(ImageView) findViewById(C5275R.id.view_1), (ImageView) findViewById(C5275R.id.view_2), (ImageView) findViewById(C5275R.id.view_3)};
        ViewPager viewPager = this.f36777v;
        n4.e eVar = new n4.e();
        eVar.f39489b = new int[]{C5275R.drawable.intro1, C5275R.drawable.intro2, C5275R.drawable.intro3};
        eVar.f39490c = new int[]{C5275R.string.app_name, C5275R.string.intro2, C5275R.string.intro3};
        eVar.f39491d = new int[]{C5275R.string.intro1_dec, C5275R.string.intro2_dec, C5275R.string.intro3_dec};
        eVar.f39488a = this;
        viewPager.setAdapter(eVar);
        ViewPager viewPager2 = this.f36777v;
        n nVar = new n(this, 0);
        if (viewPager2.f5354z0 == null) {
            viewPager2.f5354z0 = new ArrayList();
        }
        viewPager2.f5354z0.add(nVar);
        this.f36778w.setOnClickListener(new o(this, i));
        findViewById(C5275R.id.skip).setOnClickListener(new o(this, 1));
    }

    @Override // androidx.fragment.app.AbstractActivityC0480x, android.app.Activity
    public final void onResume() {
        super.onResume();
        E0 h9 = Build.VERSION.SDK_INT >= 30 ? X.h(getWindow().getDecorView()) : new E0(getWindow(), null);
        if (h9 != null) {
            com.bumptech.glide.f fVar = h9.f2039a;
            fVar.y();
            fVar.j();
            getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new p(this));
        }
    }

    @Override // h.AbstractActivityC4551k, androidx.fragment.app.AbstractActivityC0480x, android.app.Activity
    public final void onStart() {
        super.onStart();
        e(this.f36777v.getCurrentItem());
    }
}
