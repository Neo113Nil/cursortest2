package com.lumenpath.harispro.hrnavigator;

import D1.i;
import G.c;
import O.AbstractC0049z;
import O.B;
import O.InterfaceC0039o;
import O.K;
import O.j0;
import Y0.a;
import Y0.b;
import Z.AbstractComponentCallbacksC0070s;
import Z.C0074w;
import a.AbstractC0078a;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.navigation.fragment.NavHostFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.lumenpath.harispro.hrnavigator.databinding.ActivityMainBinding;
import com.lumenpath.harispro.hrnavigator.databinding.FragmentHomeBinding;
import com.lumenpath.harispro.hrnavigator.ui.home.HomeFragment;
import f0.C0141f;
import f0.w;
import f0.z;
import h.AbstractActivityC0168i;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import u1.e;
import u1.s;

/* loaded from: classes.dex */
public final class MainActivity extends AbstractActivityC0168i {

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f2774B = 0;

    /* renamed from: A, reason: collision with root package name */
    public final LinkedHashSet f2775A;

    /* renamed from: x, reason: collision with root package name */
    public ActivityMainBinding f2776x;

    /* renamed from: y, reason: collision with root package name */
    public z f2777y;

    /* renamed from: z, reason: collision with root package name */
    public c f2778z = c.e;

    public MainActivity() {
        Integer[] numArr = {Integer.valueOf(R.id.homeFragment), Integer.valueOf(R.id.knowledgeFragment), Integer.valueOf(R.id.toolsFragment), Integer.valueOf(R.id.servicesFragment), Integer.valueOf(R.id.companyFragment)};
        LinkedHashSet linkedHashSet = new LinkedHashSet(s.E(5));
        for (int i = 0; i < 5; i++) {
            linkedHashSet.add(numArr[i]);
        }
        this.f2775A = linkedHashSet;
    }

    @Override // h.AbstractActivityC0168i, b.AbstractActivityC0113i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i = 0;
        super.onCreate(bundle);
        ActivityMainBinding inflate = ActivityMainBinding.inflate(getLayoutInflater());
        this.f2776x = inflate;
        if (inflate == null) {
            i.i("binding");
            throw null;
        }
        setContentView(inflate.getRoot());
        ActivityMainBinding activityMainBinding = this.f2776x;
        if (activityMainBinding == null) {
            i.i("binding");
            throw null;
        }
        ConstraintLayout root = activityMainBinding.getRoot();
        i.d(root, "getRoot(...)");
        ActivityMainBinding activityMainBinding2 = this.f2776x;
        if (activityMainBinding2 == null) {
            i.i("binding");
            throw null;
        }
        final FragmentContainerView fragmentContainerView = activityMainBinding2.navHostFragment;
        i.d(fragmentContainerView, "navHostFragment");
        ActivityMainBinding activityMainBinding3 = this.f2776x;
        if (activityMainBinding3 == null) {
            i.i("binding");
            throw null;
        }
        final BottomNavigationView bottomNavigationView = activityMainBinding3.bottomNavigation;
        i.d(bottomNavigationView, "bottomNavigation");
        final a aVar = new a(i, this);
        AbstractC0078a.b0(getWindow(), false);
        InterfaceC0039o interfaceC0039o = new InterfaceC0039o() { // from class: s1.a
            @Override // O.InterfaceC0039o
            public final j0 s(View view, j0 j0Var) {
                i.e(view, "<unused var>");
                c f2 = j0Var.f819a.f(7);
                i.d(f2, "getInsets(...)");
                View view2 = fragmentContainerView;
                view2.setPadding(view2.getPaddingLeft(), f2.f262b, view2.getPaddingRight(), view2.getPaddingBottom());
                View view3 = bottomNavigationView;
                view3.setPadding(view3.getPaddingLeft(), view3.getPaddingTop(), view3.getPaddingRight(), f2.f264d);
                aVar.g(f2);
                return j0Var;
            }
        };
        WeakHashMap weakHashMap = K.f747a;
        B.l(root, interfaceC0039o);
        AbstractC0049z.c(root);
        AbstractComponentCallbacksC0070s A2 = ((C0074w) this.f3211r.f10b).f1631d.A(R.id.nav_host_fragment);
        i.c(A2, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        this.f2777y = ((NavHostFragment) A2).M();
        ActivityMainBinding activityMainBinding4 = this.f2776x;
        if (activityMainBinding4 == null) {
            i.i("binding");
            throw null;
        }
        activityMainBinding4.bottomNavigation.setOnItemSelectedListener(new Y0.c(this));
        ActivityMainBinding activityMainBinding5 = this.f2776x;
        if (activityMainBinding5 == null) {
            i.i("binding");
            throw null;
        }
        activityMainBinding5.bottomNavigation.setOnItemReselectedListener(new Y0.c(this));
        z zVar = this.f2777y;
        if (zVar == null) {
            i.i("navController");
            throw null;
        }
        b bVar = new b(this);
        zVar.f3017p.add(bVar);
        e eVar = zVar.f3010g;
        if (eVar.isEmpty()) {
            return;
        }
        C0141f c0141f = (C0141f) eVar.e();
        w wVar = c0141f.f2920b;
        c0141f.e();
        bVar.a(zVar, wVar);
    }

    public final void t(int i) {
        FragmentHomeBinding fragmentHomeBinding;
        ScrollView root;
        if (i != R.id.homeFragment) {
            return;
        }
        AbstractComponentCallbacksC0070s A2 = ((C0074w) this.f3211r.f10b).f1631d.A(R.id.nav_host_fragment);
        i.c(A2, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = ((NavHostFragment) A2).g().f1455x;
        if (!(abstractComponentCallbacksC0070s instanceof HomeFragment) || (fragmentHomeBinding = ((HomeFragment) abstractComponentCallbacksC0070s).f2802W) == null || (root = fragmentHomeBinding.getRoot()) == null) {
            return;
        }
        root.smoothScrollTo(0, 0);
    }

    public final void u(boolean z2) {
        ActivityMainBinding activityMainBinding = this.f2776x;
        if (activityMainBinding == null) {
            i.i("binding");
            throw null;
        }
        FragmentContainerView fragmentContainerView = activityMainBinding.navHostFragment;
        i.d(fragmentContainerView, "navHostFragment");
        c cVar = this.f2778z;
        i.e(cVar, "systemBars");
        fragmentContainerView.setPadding(fragmentContainerView.getPaddingLeft(), cVar.f262b, fragmentContainerView.getPaddingRight(), z2 ? 0 : cVar.f264d);
    }
}
