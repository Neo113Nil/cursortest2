package com.icefishing.icefishingbigwin;

import O.L;
import O.X;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import h.AbstractActivityC4551k;
import h.C4544d;
import h.InterfaceC4542b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Timer;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class MainActivity extends AbstractActivityC4551k {

    /* renamed from: a1, reason: collision with root package name */
    public static final /* synthetic */ int f36809a1 = 0;

    /* renamed from: A, reason: collision with root package name */
    public LinearLayout f36810A;

    /* renamed from: A0, reason: collision with root package name */
    public ImageView f36811A0;

    /* renamed from: B, reason: collision with root package name */
    public LinearLayout f36812B;

    /* renamed from: B0, reason: collision with root package name */
    public ImageView f36813B0;

    /* renamed from: C, reason: collision with root package name */
    public ImageView f36814C;
    public ImageView C0;

    /* renamed from: D, reason: collision with root package name */
    public ImageView f36815D;

    /* renamed from: D0, reason: collision with root package name */
    public ImageView f36816D0;

    /* renamed from: E, reason: collision with root package name */
    public ImageView f36817E;

    /* renamed from: E0, reason: collision with root package name */
    public ImageView f36818E0;

    /* renamed from: F, reason: collision with root package name */
    public ImageView f36819F;

    /* renamed from: F0, reason: collision with root package name */
    public ImageView f36820F0;

    /* renamed from: G, reason: collision with root package name */
    public ImageView f36821G;

    /* renamed from: G0, reason: collision with root package name */
    public ImageView f36822G0;

    /* renamed from: H, reason: collision with root package name */
    public ImageView f36823H;

    /* renamed from: H0, reason: collision with root package name */
    public LinearLayout f36824H0;

    /* renamed from: I, reason: collision with root package name */
    public ImageView f36825I;

    /* renamed from: I0, reason: collision with root package name */
    public LinearLayout f36826I0;
    public ImageView J;

    /* renamed from: J0, reason: collision with root package name */
    public LinearLayout f36827J0;

    /* renamed from: K, reason: collision with root package name */
    public ImageView f36828K;

    /* renamed from: K0, reason: collision with root package name */
    public LinearLayout f36829K0;

    /* renamed from: L, reason: collision with root package name */
    public Intent f36830L;

    /* renamed from: L0, reason: collision with root package name */
    public LinearLayout f36831L0;

    /* renamed from: M0, reason: collision with root package name */
    public LinearLayout f36833M0;

    /* renamed from: N, reason: collision with root package name */
    public ViewPager f36834N;

    /* renamed from: N0, reason: collision with root package name */
    public LinearLayout f36835N0;

    /* renamed from: O0, reason: collision with root package name */
    public LinearLayout f36837O0;

    /* renamed from: P0, reason: collision with root package name */
    public LinearLayout f36839P0;

    /* renamed from: Q0, reason: collision with root package name */
    public LinearLayout f36841Q0;

    /* renamed from: R0, reason: collision with root package name */
    public LinearLayout f36843R0;

    /* renamed from: S0, reason: collision with root package name */
    public LinearLayout f36845S0;

    /* renamed from: T0, reason: collision with root package name */
    public LinearLayout f36847T0;

    /* renamed from: U0, reason: collision with root package name */
    public LinearLayout f36849U0;

    /* renamed from: V0, reason: collision with root package name */
    public LinearLayout f36851V0;

    /* renamed from: W, reason: collision with root package name */
    public LinearLayout f36852W;

    /* renamed from: W0, reason: collision with root package name */
    public LinearLayout f36853W0;

    /* renamed from: X, reason: collision with root package name */
    public RecyclerView f36854X;

    /* renamed from: X0, reason: collision with root package name */
    public DrawerLayout f36855X0;
    public ArrayList Y;

    /* renamed from: Y0, reason: collision with root package name */
    public Toolbar f36856Y0;

    /* renamed from: Z, reason: collision with root package name */
    public LinearLayout f36857Z;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f36859n;

    /* renamed from: n0, reason: collision with root package name */
    public LinearLayout f36860n0;

    /* renamed from: o0, reason: collision with root package name */
    public LinearLayout f36861o0;

    /* renamed from: q0, reason: collision with root package name */
    public LinearLayout f36863q0;

    /* renamed from: r0, reason: collision with root package name */
    public ImageView f36864r0;

    /* renamed from: s0, reason: collision with root package name */
    public ImageView f36865s0;

    /* renamed from: t0, reason: collision with root package name */
    public ImageView f36866t0;

    /* renamed from: u, reason: collision with root package name */
    public LinearLayout f36867u;

    /* renamed from: u0, reason: collision with root package name */
    public ImageView f36868u0;

    /* renamed from: v, reason: collision with root package name */
    public LinearLayout f36869v;

    /* renamed from: v0, reason: collision with root package name */
    public ImageView f36870v0;

    /* renamed from: w, reason: collision with root package name */
    public LinearLayout f36871w;

    /* renamed from: w0, reason: collision with root package name */
    public ImageView f36872w0;

    /* renamed from: x, reason: collision with root package name */
    public LinearLayout f36873x;

    /* renamed from: x0, reason: collision with root package name */
    public ImageView f36874x0;

    /* renamed from: y, reason: collision with root package name */
    public LinearLayout f36875y;

    /* renamed from: y0, reason: collision with root package name */
    public ImageView f36876y0;

    /* renamed from: z, reason: collision with root package name */
    public LinearLayout f36877z;

    /* renamed from: z0, reason: collision with root package name */
    public ImageView f36878z0;

    /* renamed from: M, reason: collision with root package name */
    public final MainActivity f36832M = this;

    /* renamed from: O, reason: collision with root package name */
    public final Intent f36836O = new Intent();

    /* renamed from: P, reason: collision with root package name */
    public final ArrayList f36838P = new ArrayList();

    /* renamed from: Q, reason: collision with root package name */
    public final Intent f36840Q = new Intent();

    /* renamed from: R, reason: collision with root package name */
    public final Intent f36842R = new Intent();

    /* renamed from: S, reason: collision with root package name */
    public final Intent f36844S = new Intent();

    /* renamed from: T, reason: collision with root package name */
    public final Intent f36846T = new Intent();

    /* renamed from: U, reason: collision with root package name */
    public double f36848U = 0.0d;

    /* renamed from: V, reason: collision with root package name */
    public final Intent f36850V = new Intent();

    /* renamed from: p0, reason: collision with root package name */
    public final Timer f36862p0 = new Timer();

    /* renamed from: Z0, reason: collision with root package name */
    public final String f36858Z0 = "1. What is ice fishing?\nIce fishing is a winter activity where people catch fish through a hole drilled in a frozen lake or river.\n\n2. Why do people go ice fishing?\nPeople enjoy ice fishing for recreation, relaxation, and the challenge of catching fish in cold conditions.\n\n3. What equipment is used in ice fishing?\nCommon equipment includes an ice auger, fishing rod, bait, fishing line, and a shelter.\n\n4. How is a hole made in the ice?\nAn ice auger is used to drill a hole through the frozen surface of the lake.\n\n5. What kinds of fish can be caught while ice fishing?\nPopular catches include perch, trout, pike, walleye, and crappie.\n\n6. Is ice fishing safe?\nIce fishing can be safe when the ice is thick enough and proper safety precautions are followed.\n\n7. What is an ice fishing shelter?\nIt is a portable tent or small hut that protects anglers from wind, snow, and cold temperatures.\n\n8. When is the best time for ice fishing?\nIce fishing is usually done during winter when lakes and rivers are frozen.\n\n9. Can beginners try ice fishing?\nYes, beginners can enjoy ice fishing with basic equipment and guidance from experienced anglers.\n\n10. What makes ice fishing fun?\nThe excitement of catching fish, spending time outdoors, and enjoying winter scenery makes ice fishing enjoyable.";

    public static void e(MainActivity mainActivity, Intent intent) {
        mainActivity.getClass();
        try {
            o4.m.e(mainActivity.f36832M).j(mainActivity, o4.m.f39627t, o4.m.f39619l, o4.m.f39600I, new S0.c(mainActivity, intent, 29, false));
        } catch (ActivityNotFoundException e9) {
            e9.printStackTrace();
        }
    }

    @Override // androidx.activity.p, android.app.Activity
    public final void onBackPressed() {
        View e9 = this.f36855X0.e(8388611);
        if (e9 != null ? DrawerLayout.n(e9) : false) {
            this.f36855X0.c();
        } else {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC0480x, androidx.activity.p, D.AbstractActivityC0295n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i = 4;
        int i6 = 3;
        int i9 = 2;
        int i10 = 0;
        int i11 = 8;
        int i12 = 1;
        super.onCreate(bundle);
        setContentView(C5275R.layout.activity_main);
        View findViewById = findViewById(C5275R.id._drawer);
        B1.x xVar = new B1.x(27);
        WeakHashMap weakHashMap = X.f2054a;
        L.u(findViewById, xVar);
        int[] iArr = {C5275R.drawable.ic_one, C5275R.drawable.ic_two, C5275R.drawable.ic_three, C5275R.drawable.ic_four, C5275R.drawable.ic_five, C5275R.drawable.ic_six, C5275R.drawable.ic_seven, C5275R.drawable.ic_eight};
        String[] strArr = {getResources().getString(C5275R.string.a), getResources().getString(C5275R.string.b), getResources().getString(C5275R.string.c), getResources().getString(C5275R.string.d), getResources().getString(C5275R.string.e), getResources().getString(C5275R.string.f), getResources().getString(C5275R.string.g), getResources().getString(C5275R.string.h)};
        String[] strArr2 = {getResources().getString(C5275R.string.aa), getResources().getString(C5275R.string.bb), getResources().getString(C5275R.string.cc), getResources().getString(C5275R.string.dd), getResources().getString(C5275R.string.ee), getResources().getString(C5275R.string.ff), getResources().getString(C5275R.string.gg), getResources().getString(C5275R.string.hh)};
        int[] iArr2 = {getResources().getColor(C5275R.color.c1), getResources().getColor(C5275R.color.c2), getResources().getColor(C5275R.color.c3), getResources().getColor(C5275R.color.c4), getResources().getColor(C5275R.color.c1), getResources().getColor(C5275R.color.c2), getResources().getColor(C5275R.color.c3), getResources().getColor(C5275R.color.c4)};
        this.f36854X = (RecyclerView) findViewById(C5275R.id.recyclerView);
        this.Y = new ArrayList();
        for (int i13 = 0; i13 < 8; i13++) {
            n4.d dVar = new n4.d();
            dVar.f39486b = iArr[i13];
            dVar.f39487c = strArr[i13];
            dVar.f39485a = strArr2[i13];
            int i14 = iArr2[i13];
            this.Y.add(dVar);
        }
        Context applicationContext = getApplicationContext();
        ArrayList arrayList = this.Y;
        n4.c cVar = new n4.c();
        cVar.f39483c = applicationContext;
        n4.c.f39482e = arrayList;
        cVar.f39484d = this;
        RecyclerView recyclerView = this.f36854X;
        MainActivity mainActivity = this.f36832M;
        recyclerView.setLayoutManager(new LinearLayoutManager(0));
        this.f36854X.setAdapter(cVar);
        o4.m.i(mainActivity, o4.m.f39626s, o4.m.f39618k, o4.m.f39599H, o4.m.f39602L, (ViewGroup) findViewById(C5275R.id.banner_container));
        o4.m.k(mainActivity, o4.m.f39628u, o4.m.f39620m, o4.m.f39601K, (ViewGroup) findViewById(C5275R.id.native_ad_container));
        Toolbar toolbar = (Toolbar) findViewById(C5275R.id._toolbar);
        this.f36856Y0 = toolbar;
        setSupportActionBar(toolbar);
        getSupportActionBar().m(true);
        getSupportActionBar().p();
        this.f36856Y0.setNavigationOnClickListener(new u(this, 10));
        this.f36855X0 = (DrawerLayout) findViewById(C5275R.id._drawer);
        ((ImageView) findViewById(C5275R.id.imageview_drawer)).setOnClickListener(new u(this, 21));
        C4544d c4544d = new C4544d(this, this.f36855X0, this.f36856Y0);
        DrawerLayout drawerLayout = this.f36855X0;
        if (drawerLayout.f4743M == null) {
            drawerLayout.f4743M = new ArrayList();
        }
        drawerLayout.f4743M.add(c4544d);
        DrawerLayout drawerLayout2 = c4544d.f37866b;
        View e9 = drawerLayout2.e(8388611);
        if (e9 != null ? DrawerLayout.n(e9) : false) {
            c4544d.a(1.0f);
        } else {
            c4544d.a(0.0f);
        }
        View e10 = drawerLayout2.e(8388611);
        int i15 = e10 != null ? DrawerLayout.n(e10) : false ? c4544d.f37869e : c4544d.f37868d;
        boolean z3 = c4544d.f37870f;
        InterfaceC4542b interfaceC4542b = c4544d.f37865a;
        if (!z3 && !interfaceC4542b.d()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            c4544d.f37870f = true;
        }
        interfaceC4542b.x(c4544d.f37867c, i15);
        this.f36877z = (LinearLayout) findViewById(C5275R.id.first);
        this.f36810A = (LinearLayout) findViewById(C5275R.id.two);
        this.f36812B = (LinearLayout) findViewById(C5275R.id.third);
        this.f36825I = (ImageView) findViewById(C5275R.id.img_thumbnail1);
        this.J = (ImageView) findViewById(C5275R.id.img_thumbnail2);
        this.f36828K = (ImageView) findViewById(C5275R.id.img_thumbnail3);
        ((com.bumptech.glide.n) com.anythink.basead.exoplayer.f.f.h("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhCCUkqT5_VqTwk1yuIAVcdHQczbUjpUg3yKmZTpN_s43aF0zK3Na6gzbG2iTgY0tYQ_NAiGspyhyd2PXs11V9s9ja9eUkAI6LGwHiyj3hxFz_-IKCfa2TCrl99YsFi0RUwnVgIJxsqZEfO1Iyaj0dx5QNqhRY5ZPvOKfsM--dpE8Td3hvA5axdznj-M2Ld/s320/Screenshot_7.png", AbstractC4404f.d((com.bumptech.glide.n) com.anythink.basead.exoplayer.f.f.h("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgz6u_keAbU1ARZoaZsnuVQ76eORUpwChcazd6vmvS6iLAMF1i-V8y7zWKyq3TcbwSw_qRrVzH80OREfZZ_5uBM5r4UR5x2F_9TpalbrhHrDh-POtQLd0O2qC8oIFMiKzW5UKPHwKd_kS1WzMIKMPG04e7Bj88IsQ3IWgu-4M-oZOgNti0xMR1yx6Fx51Cr/s320/Screenshot_6.png", AbstractC4404f.d((com.bumptech.glide.n) com.anythink.basead.exoplayer.f.f.h("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiWkn20kBu3bWIoejHYz4sGjoyDvsZNePmBYt9zlR2h-Zt8autmBuhiOVqnzJ2q-GTziq4owdt0wt7o3MRxVAOw1IcYyLvcyH0GfvqH0BsdSJY7Gmh_BvwXLXs71rbb7uLct8WPlZqYLowF6A_Bbrn6lCWtIPTFDUd7bWNAeCz8mW46KRmRJVAg3V7-51oM/s320/Screenshot_14.png", com.bumptech.glide.c.c(getApplicationContext())), this.f36825I, this)), this.J, this))).E(this.f36828K);
        this.f36877z.setOnClickListener(new v(this, i12));
        this.f36810A.setOnClickListener(new v(this, i9));
        this.f36812B.setOnClickListener(new v(this, i6));
        findViewById(C5275R.id.intro).setOnClickListener(new v(this, i));
        this.f36852W = (LinearLayout) findViewById(C5275R.id.dot1);
        this.f36857Z = (LinearLayout) findViewById(C5275R.id.dot2);
        this.f36860n0 = (LinearLayout) findViewById(C5275R.id.dot3);
        this.f36861o0 = (LinearLayout) findViewById(C5275R.id.dot4);
        this.f36863q0 = (LinearLayout) findViewById(C5275R.id.dot5);
        ViewPager viewPager = (ViewPager) findViewById(C5275R.id.viewpager1);
        this.f36834N = viewPager;
        n nVar = new n(this, i12);
        if (viewPager.f5354z0 == null) {
            viewPager.f5354z0 = new ArrayList();
        }
        viewPager.f5354z0.add(nVar);
        HashMap hashMap = new HashMap();
        hashMap.put("a", "b");
        ArrayList arrayList2 = this.f36838P;
        arrayList2.add(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("c", "d");
        arrayList2.add(hashMap2);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("e", "f");
        arrayList2.add(hashMap3);
        HashMap hashMap4 = new HashMap();
        hashMap4.put("g", "h");
        arrayList2.add(hashMap4);
        HashMap hashMap5 = new HashMap();
        hashMap5.put("i", com.anythink.expressad.foundation.d.j.cD);
        arrayList2.add(hashMap5);
        HashMap hashMap6 = new HashMap();
        hashMap6.put("k", "l");
        arrayList2.add(hashMap6);
        this.f36834N.setPageMargin(-30);
        this.f36834N.setOffscreenPageLimit(2);
        this.f36834N.v(new a4.e());
        this.f36834N.setAdapter(new y(this, arrayList2));
        this.f36862p0.scheduleAtFixedRate(new w(this), 4000L, 4000L);
        this.f36859n = (LinearLayout) findViewById(C5275R.id.linear_newest_1);
        this.f36867u = (LinearLayout) findViewById(C5275R.id.linear_newest_2);
        this.f36869v = (LinearLayout) findViewById(C5275R.id.linear_newest_3);
        this.f36871w = (LinearLayout) findViewById(C5275R.id.linear_newest_4);
        this.f36873x = (LinearLayout) findViewById(C5275R.id.linear_newest_5);
        this.f36875y = (LinearLayout) findViewById(C5275R.id.linear_newest_6);
        this.f36814C = (ImageView) findViewById(C5275R.id.imageview_newest_1);
        this.f36815D = (ImageView) findViewById(C5275R.id.imageview_newest_2);
        this.f36817E = (ImageView) findViewById(C5275R.id.imageview_newest_3);
        this.f36819F = (ImageView) findViewById(C5275R.id.imageview_newest_4);
        this.f36821G = (ImageView) findViewById(C5275R.id.imageview_newest_5);
        this.f36823H = (ImageView) findViewById(C5275R.id.imageview_newest_6);
        this.f36864r0 = (ImageView) findViewById(C5275R.id.image_toprated_1);
        this.f36865s0 = (ImageView) findViewById(C5275R.id.image_toprated_2);
        this.f36866t0 = (ImageView) findViewById(C5275R.id.image_toprated_3);
        this.f36868u0 = (ImageView) findViewById(C5275R.id.image_toprated_4);
        this.f36870v0 = (ImageView) findViewById(C5275R.id.image_toprated_5);
        this.f36872w0 = (ImageView) findViewById(C5275R.id.image_toprated_6);
        this.f36874x0 = (ImageView) findViewById(C5275R.id.image_toprated_7);
        this.f36876y0 = (ImageView) findViewById(C5275R.id.image_toprated_8);
        this.f36878z0 = (ImageView) findViewById(C5275R.id.image_toprated_9);
        this.f36811A0 = (ImageView) findViewById(C5275R.id.image_toprated_10);
        this.f36813B0 = (ImageView) findViewById(C5275R.id.image_toprated_11);
        this.C0 = (ImageView) findViewById(C5275R.id.image_toprated_12);
        this.f36816D0 = (ImageView) findViewById(C5275R.id.image_toprated_13);
        this.f36818E0 = (ImageView) findViewById(C5275R.id.image_toprated_14);
        this.f36820F0 = (ImageView) findViewById(C5275R.id.image_toprated_15);
        this.f36822G0 = (ImageView) findViewById(C5275R.id.image_toprated_16);
        this.f36824H0 = (LinearLayout) findViewById(C5275R.id.top1);
        this.f36826I0 = (LinearLayout) findViewById(C5275R.id.top2);
        this.f36827J0 = (LinearLayout) findViewById(C5275R.id.top3);
        this.f36829K0 = (LinearLayout) findViewById(C5275R.id.top4);
        this.f36831L0 = (LinearLayout) findViewById(C5275R.id.top5);
        this.f36833M0 = (LinearLayout) findViewById(C5275R.id.top6);
        this.f36835N0 = (LinearLayout) findViewById(C5275R.id.top7);
        this.f36837O0 = (LinearLayout) findViewById(C5275R.id.top8);
        this.f36839P0 = (LinearLayout) findViewById(C5275R.id.top9);
        this.f36841Q0 = (LinearLayout) findViewById(C5275R.id.top10);
        this.f36843R0 = (LinearLayout) findViewById(C5275R.id.top11);
        this.f36845S0 = (LinearLayout) findViewById(C5275R.id.top12);
        this.f36847T0 = (LinearLayout) findViewById(C5275R.id.top13);
        this.f36849U0 = (LinearLayout) findViewById(C5275R.id.top14);
        this.f36851V0 = (LinearLayout) findViewById(C5275R.id.top15);
        this.f36853W0 = (LinearLayout) findViewById(C5275R.id.top16);
        ((com.bumptech.glide.n) com.anythink.basead.exoplayer.f.f.h("https://static.gamezop.com/r10-NLT86bx/cover.jpg", AbstractC4404f.d((com.bumptech.glide.n) com.anythink.basead.exoplayer.f.f.h("https://static.gamezop.com/H1IEpMJP917/cover.jpg", AbstractC4404f.d((com.bumptech.glide.n) com.anythink.basead.exoplayer.f.f.h("https://static.gamezop.com/B1gBpzJwqJQ/cover.jpg", AbstractC4404f.d((com.bumptech.glide.n) com.anythink.basead.exoplayer.f.f.h("https://static.gamezop.com/rkYbNLTIT-x/cover.jpg", AbstractC4404f.d((com.bumptech.glide.n) com.anythink.basead.exoplayer.f.f.h("https://static.gamezop.com/H1PJn6mqAr/cover.jpg", AbstractC4404f.d((com.bumptech.glide.n) com.anythink.basead.exoplayer.f.f.h("https://static.gamezop.com/r1z13aXqAB/cover.jpg", AbstractC4404f.d((com.bumptech.glide.n) com.anythink.basead.exoplayer.f.f.h("https://static.gamezop.com/SyfxJ3a75Cr/cover.jpg", AbstractC4404f.d((com.bumptech.glide.n) com.anythink.basead.exoplayer.f.f.h("https://static.gamezop.com/rJ57aMJDcJm/cover.jpg", AbstractC4404f.d((com.bumptech.glide.n) com.anythink.basead.exoplayer.f.f.h("https://static.gamezop.com/BkdJhTX50B/cover.jpg", AbstractC4404f.d((com.bumptech.glide.n) com.anythink.basead.exoplayer.f.f.h("https://static.gamezop.com/S1Wrpf1v5ym/cover.jpg", AbstractC4404f.d((com.bumptech.glide.n) com.anythink.basead.exoplayer.f.f.h("https://static.gamezop.com/SkhljT2fdgb/cover.jpg", AbstractC4404f.d((com.bumptech.glide.n) com.anythink.basead.exoplayer.f.f.h("https://static.gamezop.com/B1fSpMkP51m/cover.jpg", AbstractC4404f.d((com.bumptech.glide.n) com.anythink.basead.exoplayer.f.f.h("https://static.gamezop.com/H1Tz6z1Dqym/cover.jpg", AbstractC4404f.d((com.bumptech.glide.n) com.anythink.basead.exoplayer.f.f.h("https://static.gamezop.com/HJP4afkvqJQ/cover.jpg", AbstractC4404f.d((com.bumptech.glide.n) com.anythink.basead.exoplayer.f.f.h("https://static.gamezop.com/Skz4pzkDqyX/cover.jpg", AbstractC4404f.d((com.bumptech.glide.n) com.anythink.basead.exoplayer.f.f.h("https://static.gamezop.com/H1AN6fkwqJ7/cover.jpg", AbstractC4404f.d((com.bumptech.glide.n) com.anythink.basead.exoplayer.f.f.h("https://static.gamezop.com/SklmW1ad_/cover.jpg", AbstractC4404f.d((com.bumptech.glide.n) com.anythink.basead.exoplayer.f.f.h("https://static.gamezop.com/4kZgf_1z-9l/cover.jpg", AbstractC4404f.d((com.bumptech.glide.n) com.anythink.basead.exoplayer.f.f.h("https://static.gamezop.com/ryJGkhT7qAB/cover.jpg", AbstractC4404f.d((com.bumptech.glide.n) com.anythink.basead.exoplayer.f.f.h("https://static.gamezop.com/wMm3YDfJC/cover.jpg", AbstractC4404f.d((com.bumptech.glide.n) com.anythink.basead.exoplayer.f.f.h("https://static.gamezop.com/Bk4ML6470x/cover.jpg", AbstractC4404f.d((com.bumptech.glide.n) com.anythink.basead.exoplayer.f.f.h("https://static.gamezop.com/Cg8EBuMp7/cover.jpg", com.bumptech.glide.c.c(getApplicationContext())), this.f36814C, this)), this.f36815D, this)), this.f36817E, this)), this.f36819F, this)), this.f36821G, this)), this.f36823H, this)), this.f36864r0, this)), this.f36865s0, this)), this.f36866t0, this)), this.f36868u0, this)), this.f36870v0, this)), this.f36872w0, this)), this.f36874x0, this)), this.f36876y0, this)), this.f36878z0, this)), this.f36811A0, this)), this.f36813B0, this)), this.C0, this)), this.f36816D0, this)), this.f36818E0, this)), this.f36820F0, this))).E(this.f36822G0);
        findViewById(C5275R.id.actionmenu).setOnClickListener(new v(this, 5));
        findViewById(C5275R.id.adventuremenu).setOnClickListener(new v(this, 6));
        findViewById(C5275R.id.arcademenu).setOnClickListener(new u(this, i10));
        findViewById(C5275R.id.puzzlemenu).setOnClickListener(new u(this, i12));
        findViewById(C5275R.id.sportsmenu).setOnClickListener(new u(this, i9));
        findViewById(C5275R.id.strategymenu).setOnClickListener(new u(this, i6));
        this.f36859n.setOnClickListener(new u(this, i));
        this.f36867u.setOnClickListener(new u(this, 5));
        this.f36869v.setOnClickListener(new u(this, 6));
        this.f36871w.setOnClickListener(new u(this, 7));
        this.f36873x.setOnClickListener(new u(this, i11));
        this.f36875y.setOnClickListener(new u(this, 9));
        this.f36824H0.setOnClickListener(new u(this, 11));
        this.f36826I0.setOnClickListener(new u(this, 12));
        this.f36827J0.setOnClickListener(new u(this, 13));
        this.f36829K0.setOnClickListener(new u(this, 14));
        this.f36831L0.setOnClickListener(new u(this, 15));
        this.f36833M0.setOnClickListener(new u(this, 16));
        this.f36835N0.setOnClickListener(new u(this, 17));
        this.f36837O0.setOnClickListener(new u(this, 18));
        this.f36839P0.setOnClickListener(new u(this, 19));
        this.f36841Q0.setOnClickListener(new u(this, 20));
        this.f36843R0.setOnClickListener(new u(this, 22));
        this.f36845S0.setOnClickListener(new u(this, 23));
        this.f36847T0.setOnClickListener(new u(this, 24));
        this.f36849U0.setOnClickListener(new u(this, 25));
        this.f36851V0.setOnClickListener(new u(this, 26));
        this.f36853W0.setOnClickListener(new u(this, 27));
        findViewById(C5275R.id.sharemenu).setOnClickListener(new u(this, 28));
        findViewById(C5275R.id.privacymenu).setOnClickListener(new u(this, 29));
        findViewById(C5275R.id.ratemenu).setOnClickListener(new v(this, i10));
    }
}
