package com.IceFishing.LiveIceFishing;

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
import h.AbstractActivityC4555k;
import h.C4548d;
import h.InterfaceC4546b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Timer;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class MainActivity extends AbstractActivityC4555k {

    /* renamed from: V0, reason: collision with root package name */
    public static final /* synthetic */ int f6299V0 = 0;

    /* renamed from: A, reason: collision with root package name */
    public LinearLayout f6300A;

    /* renamed from: A0, reason: collision with root package name */
    public ImageView f6301A0;

    /* renamed from: B, reason: collision with root package name */
    public LinearLayout f6302B;

    /* renamed from: B0, reason: collision with root package name */
    public ImageView f6303B0;

    /* renamed from: C, reason: collision with root package name */
    public ImageView f6304C;
    public LinearLayout C0;

    /* renamed from: D, reason: collision with root package name */
    public ImageView f6305D;

    /* renamed from: D0, reason: collision with root package name */
    public LinearLayout f6306D0;

    /* renamed from: E, reason: collision with root package name */
    public ImageView f6307E;

    /* renamed from: E0, reason: collision with root package name */
    public LinearLayout f6308E0;

    /* renamed from: F, reason: collision with root package name */
    public ImageView f6309F;

    /* renamed from: F0, reason: collision with root package name */
    public LinearLayout f6310F0;

    /* renamed from: G, reason: collision with root package name */
    public ImageView f6311G;

    /* renamed from: G0, reason: collision with root package name */
    public LinearLayout f6312G0;

    /* renamed from: H, reason: collision with root package name */
    public ImageView f6313H;

    /* renamed from: H0, reason: collision with root package name */
    public LinearLayout f6314H0;

    /* renamed from: I, reason: collision with root package name */
    public ImageView f6315I;

    /* renamed from: I0, reason: collision with root package name */
    public LinearLayout f6316I0;
    public ImageView J;

    /* renamed from: J0, reason: collision with root package name */
    public LinearLayout f6317J0;

    /* renamed from: K, reason: collision with root package name */
    public ImageView f6318K;

    /* renamed from: K0, reason: collision with root package name */
    public LinearLayout f6319K0;

    /* renamed from: L, reason: collision with root package name */
    public Intent f6320L;

    /* renamed from: L0, reason: collision with root package name */
    public LinearLayout f6321L0;

    /* renamed from: M0, reason: collision with root package name */
    public LinearLayout f6323M0;

    /* renamed from: N, reason: collision with root package name */
    public ViewPager f6324N;

    /* renamed from: N0, reason: collision with root package name */
    public LinearLayout f6325N0;

    /* renamed from: O0, reason: collision with root package name */
    public LinearLayout f6327O0;

    /* renamed from: P0, reason: collision with root package name */
    public LinearLayout f6329P0;

    /* renamed from: Q0, reason: collision with root package name */
    public LinearLayout f6331Q0;

    /* renamed from: R0, reason: collision with root package name */
    public LinearLayout f6333R0;

    /* renamed from: S0, reason: collision with root package name */
    public DrawerLayout f6335S0;

    /* renamed from: T0, reason: collision with root package name */
    public Toolbar f6337T0;

    /* renamed from: W, reason: collision with root package name */
    public LinearLayout f6341W;

    /* renamed from: X, reason: collision with root package name */
    public RecyclerView f6342X;
    public ArrayList Y;

    /* renamed from: Z, reason: collision with root package name */
    public LinearLayout f6343Z;

    /* renamed from: i0, reason: collision with root package name */
    public LinearLayout f6344i0;

    /* renamed from: j0, reason: collision with root package name */
    public LinearLayout f6345j0;

    /* renamed from: l0, reason: collision with root package name */
    public LinearLayout f6347l0;
    public ImageView m0;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f6348n;

    /* renamed from: n0, reason: collision with root package name */
    public ImageView f6349n0;

    /* renamed from: o0, reason: collision with root package name */
    public ImageView f6350o0;

    /* renamed from: p0, reason: collision with root package name */
    public ImageView f6351p0;

    /* renamed from: q0, reason: collision with root package name */
    public ImageView f6352q0;

    /* renamed from: r0, reason: collision with root package name */
    public ImageView f6353r0;

    /* renamed from: s0, reason: collision with root package name */
    public ImageView f6354s0;

    /* renamed from: t0, reason: collision with root package name */
    public ImageView f6355t0;

    /* renamed from: u, reason: collision with root package name */
    public LinearLayout f6356u;

    /* renamed from: u0, reason: collision with root package name */
    public ImageView f6357u0;

    /* renamed from: v, reason: collision with root package name */
    public LinearLayout f6358v;

    /* renamed from: v0, reason: collision with root package name */
    public ImageView f6359v0;

    /* renamed from: w, reason: collision with root package name */
    public LinearLayout f6360w;

    /* renamed from: w0, reason: collision with root package name */
    public ImageView f6361w0;

    /* renamed from: x, reason: collision with root package name */
    public LinearLayout f6362x;

    /* renamed from: x0, reason: collision with root package name */
    public ImageView f6363x0;

    /* renamed from: y, reason: collision with root package name */
    public LinearLayout f6364y;

    /* renamed from: y0, reason: collision with root package name */
    public ImageView f6365y0;

    /* renamed from: z, reason: collision with root package name */
    public LinearLayout f6366z;

    /* renamed from: z0, reason: collision with root package name */
    public ImageView f6367z0;

    /* renamed from: M, reason: collision with root package name */
    public final MainActivity f6322M = this;

    /* renamed from: O, reason: collision with root package name */
    public final Intent f6326O = new Intent();

    /* renamed from: P, reason: collision with root package name */
    public final ArrayList f6328P = new ArrayList();

    /* renamed from: Q, reason: collision with root package name */
    public final Intent f6330Q = new Intent();

    /* renamed from: R, reason: collision with root package name */
    public final Intent f6332R = new Intent();

    /* renamed from: S, reason: collision with root package name */
    public final Intent f6334S = new Intent();

    /* renamed from: T, reason: collision with root package name */
    public final Intent f6336T = new Intent();

    /* renamed from: U, reason: collision with root package name */
    public double f6338U = 0.0d;

    /* renamed from: V, reason: collision with root package name */
    public final Intent f6340V = new Intent();

    /* renamed from: k0, reason: collision with root package name */
    public final Timer f6346k0 = new Timer();

    /* renamed from: U0, reason: collision with root package name */
    public final String f6339U0 = "1. What is ice fishing?\nIce fishing is a winter activity where people catch fish through a hole drilled in a frozen lake or river.\n\n2. Why do people go ice fishing?\nPeople enjoy ice fishing for recreation, relaxation, and the challenge of catching fish in cold conditions.\n\n3. What equipment is used in ice fishing?\nCommon equipment includes an ice auger, fishing rod, bait, fishing line, and a shelter.\n\n4. How is a hole made in the ice?\nAn ice auger is used to drill a hole through the frozen surface of the lake.\n\n5. What kinds of fish can be caught while ice fishing?\nPopular catches include perch, trout, pike, walleye, and crappie.\n\n6. Is ice fishing safe?\nIce fishing can be safe when the ice is thick enough and proper safety precautions are followed.\n\n7. What is an ice fishing shelter?\nIt is a portable tent or small hut that protects anglers from wind, snow, and cold temperatures.\n\n8. When is the best time for ice fishing?\nIce fishing is usually done during winter when lakes and rivers are frozen.\n\n9. Can beginners try ice fishing?\nYes, beginners can enjoy ice fishing with basic equipment and guidance from experienced anglers.\n\n10. What makes ice fishing fun?\nThe excitement of catching fish, spending time outdoors, and enjoying winter scenery makes ice fishing enjoyable.";

    public static void e(MainActivity mainActivity, Intent intent) {
        mainActivity.getClass();
        try {
            Y0.p.e(mainActivity.f6322M).j(mainActivity, Y0.p.f3890t, Y0.p.f3882l, Y0.p.f3863I, new S0.l(mainActivity, intent, 9, false));
        } catch (ActivityNotFoundException e9) {
            e9.printStackTrace();
        }
    }

    @Override // androidx.activity.p, android.app.Activity
    public final void onBackPressed() {
        View e9 = this.f6335S0.e(8388611);
        if (e9 != null ? DrawerLayout.n(e9) : false) {
            this.f6335S0.c();
        } else {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC0484x, androidx.activity.p, D.AbstractActivityC0283m, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i = 4;
        int i4 = 3;
        int i6 = 2;
        int i9 = 0;
        int i10 = 8;
        int i11 = 1;
        super.onCreate(bundle);
        setContentView(C5248R.layout.activity_main);
        View findViewById = findViewById(C5248R.id._drawer);
        D0.n nVar = new D0.n(26);
        WeakHashMap weakHashMap = X.f2142a;
        L.u(findViewById, nVar);
        int[] iArr = {C5248R.drawable.ic_one, C5248R.drawable.ic_two, C5248R.drawable.ic_three, C5248R.drawable.ic_four, C5248R.drawable.ic_five, C5248R.drawable.ic_six, C5248R.drawable.ic_seven, C5248R.drawable.ic_eight};
        String[] strArr = {getResources().getString(C5248R.string.a), getResources().getString(C5248R.string.b), getResources().getString(C5248R.string.c), getResources().getString(C5248R.string.d), getResources().getString(C5248R.string.e), getResources().getString(C5248R.string.f), getResources().getString(C5248R.string.g), getResources().getString(C5248R.string.h)};
        String[] strArr2 = {getResources().getString(C5248R.string.aa), getResources().getString(C5248R.string.bb), getResources().getString(C5248R.string.cc), getResources().getString(C5248R.string.dd), getResources().getString(C5248R.string.ee), getResources().getString(C5248R.string.ff), getResources().getString(C5248R.string.gg), getResources().getString(C5248R.string.hh)};
        int[] iArr2 = {getResources().getColor(C5248R.color.c1), getResources().getColor(C5248R.color.c2), getResources().getColor(C5248R.color.c3), getResources().getColor(C5248R.color.c4), getResources().getColor(C5248R.color.c1), getResources().getColor(C5248R.color.c2), getResources().getColor(C5248R.color.c3), getResources().getColor(C5248R.color.c4)};
        this.f6342X = (RecyclerView) findViewById(C5248R.id.recyclerView);
        this.Y = new ArrayList();
        for (int i12 = 0; i12 < 8; i12++) {
            X0.d dVar = new X0.d();
            dVar.f3748b = iArr[i12];
            dVar.f3749c = strArr[i12];
            dVar.f3747a = strArr2[i12];
            int i13 = iArr2[i12];
            this.Y.add(dVar);
        }
        Context applicationContext = getApplicationContext();
        ArrayList arrayList = this.Y;
        X0.c cVar = new X0.c();
        cVar.f3745c = applicationContext;
        X0.c.f3744e = arrayList;
        cVar.f3746d = this;
        RecyclerView recyclerView = this.f6342X;
        MainActivity mainActivity = this.f6322M;
        recyclerView.setLayoutManager(new LinearLayoutManager(0));
        this.f6342X.setAdapter(cVar);
        Y0.p.i(mainActivity, Y0.p.f3889s, Y0.p.f3881k, Y0.p.f3862H, Y0.p.f3865L, (ViewGroup) findViewById(C5248R.id.banner_container));
        Y0.p.k(mainActivity, Y0.p.f3891u, Y0.p.f3883m, Y0.p.f3864K, (ViewGroup) findViewById(C5248R.id.native_ad_container));
        Toolbar toolbar = (Toolbar) findViewById(C5248R.id._toolbar);
        this.f6337T0 = toolbar;
        setSupportActionBar(toolbar);
        getSupportActionBar().m(true);
        getSupportActionBar().p();
        this.f6337T0.setNavigationOnClickListener(new v(this, 10));
        this.f6335S0 = (DrawerLayout) findViewById(C5248R.id._drawer);
        ((ImageView) findViewById(C5248R.id.imageview_drawer)).setOnClickListener(new v(this, 21));
        C4548d c4548d = new C4548d(this, this.f6335S0, this.f6337T0);
        DrawerLayout drawerLayout = this.f6335S0;
        if (drawerLayout.f4711M == null) {
            drawerLayout.f4711M = new ArrayList();
        }
        drawerLayout.f4711M.add(c4548d);
        DrawerLayout drawerLayout2 = c4548d.f37892b;
        View e9 = drawerLayout2.e(8388611);
        if (e9 != null ? DrawerLayout.n(e9) : false) {
            c4548d.a(1.0f);
        } else {
            c4548d.a(0.0f);
        }
        View e10 = drawerLayout2.e(8388611);
        int i14 = e10 != null ? DrawerLayout.n(e10) : false ? c4548d.f37895e : c4548d.f37894d;
        boolean z6 = c4548d.f37896f;
        InterfaceC4546b interfaceC4546b = c4548d.f37891a;
        if (!z6 && !interfaceC4546b.a()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            c4548d.f37896f = true;
        }
        interfaceC4546b.t(c4548d.f37893c, i14);
        this.f6366z = (LinearLayout) findViewById(C5248R.id.first);
        this.f6300A = (LinearLayout) findViewById(C5248R.id.two);
        this.f6302B = (LinearLayout) findViewById(C5248R.id.third);
        this.f6315I = (ImageView) findViewById(C5248R.id.img_thumbnail1);
        this.J = (ImageView) findViewById(C5248R.id.img_thumbnail2);
        this.f6318K = (ImageView) findViewById(C5248R.id.img_thumbnail3);
        ((com.bumptech.glide.n) D.x.f("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhCCUkqT5_VqTwk1yuIAVcdHQczbUjpUg3yKmZTpN_s43aF0zK3Na6gzbG2iTgY0tYQ_NAiGspyhyd2PXs11V9s9ja9eUkAI6LGwHiyj3hxFz_-IKCfa2TCrl99YsFi0RUwnVgIJxsqZEfO1Iyaj0dx5QNqhRY5ZPvOKfsM--dpE8Td3hvA5axdznj-M2Ld/s320/Screenshot_7.png", k.n((com.bumptech.glide.n) D.x.f("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgz6u_keAbU1ARZoaZsnuVQ76eORUpwChcazd6vmvS6iLAMF1i-V8y7zWKyq3TcbwSw_qRrVzH80OREfZZ_5uBM5r4UR5x2F_9TpalbrhHrDh-POtQLd0O2qC8oIFMiKzW5UKPHwKd_kS1WzMIKMPG04e7Bj88IsQ3IWgu-4M-oZOgNti0xMR1yx6Fx51Cr/s320/Screenshot_6.png", k.n((com.bumptech.glide.n) D.x.f("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiWkn20kBu3bWIoejHYz4sGjoyDvsZNePmBYt9zlR2h-Zt8autmBuhiOVqnzJ2q-GTziq4owdt0wt7o3MRxVAOw1IcYyLvcyH0GfvqH0BsdSJY7Gmh_BvwXLXs71rbb7uLct8WPlZqYLowF6A_Bbrn6lCWtIPTFDUd7bWNAeCz8mW46KRmRJVAg3V7-51oM/s320/Screenshot_14.png", com.bumptech.glide.c.c(getApplicationContext())), this.f6315I, this)), this.J, this))).E(this.f6318K);
        this.f6366z.setOnClickListener(new w(this, i11));
        this.f6300A.setOnClickListener(new w(this, i6));
        this.f6302B.setOnClickListener(new w(this, i4));
        findViewById(C5248R.id.intro).setOnClickListener(new w(this, i));
        this.f6341W = (LinearLayout) findViewById(C5248R.id.dot1);
        this.f6343Z = (LinearLayout) findViewById(C5248R.id.dot2);
        this.f6344i0 = (LinearLayout) findViewById(C5248R.id.dot3);
        this.f6345j0 = (LinearLayout) findViewById(C5248R.id.dot4);
        this.f6347l0 = (LinearLayout) findViewById(C5248R.id.dot5);
        ViewPager viewPager = (ViewPager) findViewById(C5248R.id.viewpager1);
        this.f6324N = viewPager;
        n nVar2 = new n(this, i11);
        if (viewPager.f5309u0 == null) {
            viewPager.f5309u0 = new ArrayList();
        }
        viewPager.f5309u0.add(nVar2);
        HashMap hashMap = new HashMap();
        hashMap.put("a", "b");
        ArrayList arrayList2 = this.f6328P;
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
        this.f6324N.setPageMargin(-30);
        this.f6324N.setOffscreenPageLimit(2);
        this.f6324N.v(new G3.e(16));
        this.f6324N.setAdapter(new z(this, arrayList2));
        this.f6346k0.scheduleAtFixedRate(new x(this), 4000L, 4000L);
        this.f6348n = (LinearLayout) findViewById(C5248R.id.linear_newest_1);
        this.f6356u = (LinearLayout) findViewById(C5248R.id.linear_newest_2);
        this.f6358v = (LinearLayout) findViewById(C5248R.id.linear_newest_3);
        this.f6360w = (LinearLayout) findViewById(C5248R.id.linear_newest_4);
        this.f6362x = (LinearLayout) findViewById(C5248R.id.linear_newest_5);
        this.f6364y = (LinearLayout) findViewById(C5248R.id.linear_newest_6);
        this.f6304C = (ImageView) findViewById(C5248R.id.imageview_newest_1);
        this.f6305D = (ImageView) findViewById(C5248R.id.imageview_newest_2);
        this.f6307E = (ImageView) findViewById(C5248R.id.imageview_newest_3);
        this.f6309F = (ImageView) findViewById(C5248R.id.imageview_newest_4);
        this.f6311G = (ImageView) findViewById(C5248R.id.imageview_newest_5);
        this.f6313H = (ImageView) findViewById(C5248R.id.imageview_newest_6);
        this.m0 = (ImageView) findViewById(C5248R.id.image_toprated_1);
        this.f6349n0 = (ImageView) findViewById(C5248R.id.image_toprated_2);
        this.f6350o0 = (ImageView) findViewById(C5248R.id.image_toprated_3);
        this.f6351p0 = (ImageView) findViewById(C5248R.id.image_toprated_4);
        this.f6352q0 = (ImageView) findViewById(C5248R.id.image_toprated_5);
        this.f6353r0 = (ImageView) findViewById(C5248R.id.image_toprated_6);
        this.f6354s0 = (ImageView) findViewById(C5248R.id.image_toprated_7);
        this.f6355t0 = (ImageView) findViewById(C5248R.id.image_toprated_8);
        this.f6357u0 = (ImageView) findViewById(C5248R.id.image_toprated_9);
        this.f6359v0 = (ImageView) findViewById(C5248R.id.image_toprated_10);
        this.f6361w0 = (ImageView) findViewById(C5248R.id.image_toprated_11);
        this.f6363x0 = (ImageView) findViewById(C5248R.id.image_toprated_12);
        this.f6365y0 = (ImageView) findViewById(C5248R.id.image_toprated_13);
        this.f6367z0 = (ImageView) findViewById(C5248R.id.image_toprated_14);
        this.f6301A0 = (ImageView) findViewById(C5248R.id.image_toprated_15);
        this.f6303B0 = (ImageView) findViewById(C5248R.id.image_toprated_16);
        this.C0 = (LinearLayout) findViewById(C5248R.id.top1);
        this.f6306D0 = (LinearLayout) findViewById(C5248R.id.top2);
        this.f6308E0 = (LinearLayout) findViewById(C5248R.id.top3);
        this.f6310F0 = (LinearLayout) findViewById(C5248R.id.top4);
        this.f6312G0 = (LinearLayout) findViewById(C5248R.id.top5);
        this.f6314H0 = (LinearLayout) findViewById(C5248R.id.top6);
        this.f6316I0 = (LinearLayout) findViewById(C5248R.id.top7);
        this.f6317J0 = (LinearLayout) findViewById(C5248R.id.top8);
        this.f6319K0 = (LinearLayout) findViewById(C5248R.id.top9);
        this.f6321L0 = (LinearLayout) findViewById(C5248R.id.top10);
        this.f6323M0 = (LinearLayout) findViewById(C5248R.id.top11);
        this.f6325N0 = (LinearLayout) findViewById(C5248R.id.top12);
        this.f6327O0 = (LinearLayout) findViewById(C5248R.id.top13);
        this.f6329P0 = (LinearLayout) findViewById(C5248R.id.top14);
        this.f6331Q0 = (LinearLayout) findViewById(C5248R.id.top15);
        this.f6333R0 = (LinearLayout) findViewById(C5248R.id.top16);
        ((com.bumptech.glide.n) D.x.f("https://static.gamezop.com/r10-NLT86bx/cover.jpg", k.n((com.bumptech.glide.n) D.x.f("https://static.gamezop.com/H1IEpMJP917/cover.jpg", k.n((com.bumptech.glide.n) D.x.f("https://static.gamezop.com/B1gBpzJwqJQ/cover.jpg", k.n((com.bumptech.glide.n) D.x.f("https://static.gamezop.com/rkYbNLTIT-x/cover.jpg", k.n((com.bumptech.glide.n) D.x.f("https://static.gamezop.com/H1PJn6mqAr/cover.jpg", k.n((com.bumptech.glide.n) D.x.f("https://static.gamezop.com/r1z13aXqAB/cover.jpg", k.n((com.bumptech.glide.n) D.x.f("https://static.gamezop.com/SyfxJ3a75Cr/cover.jpg", k.n((com.bumptech.glide.n) D.x.f("https://static.gamezop.com/rJ57aMJDcJm/cover.jpg", k.n((com.bumptech.glide.n) D.x.f("https://static.gamezop.com/BkdJhTX50B/cover.jpg", k.n((com.bumptech.glide.n) D.x.f("https://static.gamezop.com/S1Wrpf1v5ym/cover.jpg", k.n((com.bumptech.glide.n) D.x.f("https://static.gamezop.com/SkhljT2fdgb/cover.jpg", k.n((com.bumptech.glide.n) D.x.f("https://static.gamezop.com/B1fSpMkP51m/cover.jpg", k.n((com.bumptech.glide.n) D.x.f("https://static.gamezop.com/H1Tz6z1Dqym/cover.jpg", k.n((com.bumptech.glide.n) D.x.f("https://static.gamezop.com/HJP4afkvqJQ/cover.jpg", k.n((com.bumptech.glide.n) D.x.f("https://static.gamezop.com/Skz4pzkDqyX/cover.jpg", k.n((com.bumptech.glide.n) D.x.f("https://static.gamezop.com/H1AN6fkwqJ7/cover.jpg", k.n((com.bumptech.glide.n) D.x.f("https://static.gamezop.com/SklmW1ad_/cover.jpg", k.n((com.bumptech.glide.n) D.x.f("https://static.gamezop.com/4kZgf_1z-9l/cover.jpg", k.n((com.bumptech.glide.n) D.x.f("https://static.gamezop.com/ryJGkhT7qAB/cover.jpg", k.n((com.bumptech.glide.n) D.x.f("https://static.gamezop.com/wMm3YDfJC/cover.jpg", k.n((com.bumptech.glide.n) D.x.f("https://static.gamezop.com/Bk4ML6470x/cover.jpg", k.n((com.bumptech.glide.n) D.x.f("https://static.gamezop.com/Cg8EBuMp7/cover.jpg", com.bumptech.glide.c.c(getApplicationContext())), this.f6304C, this)), this.f6305D, this)), this.f6307E, this)), this.f6309F, this)), this.f6311G, this)), this.f6313H, this)), this.m0, this)), this.f6349n0, this)), this.f6350o0, this)), this.f6351p0, this)), this.f6352q0, this)), this.f6353r0, this)), this.f6354s0, this)), this.f6355t0, this)), this.f6357u0, this)), this.f6359v0, this)), this.f6361w0, this)), this.f6363x0, this)), this.f6365y0, this)), this.f6367z0, this)), this.f6301A0, this))).E(this.f6303B0);
        findViewById(C5248R.id.actionmenu).setOnClickListener(new w(this, 5));
        findViewById(C5248R.id.adventuremenu).setOnClickListener(new w(this, 6));
        findViewById(C5248R.id.arcademenu).setOnClickListener(new v(this, i9));
        findViewById(C5248R.id.puzzlemenu).setOnClickListener(new v(this, i11));
        findViewById(C5248R.id.sportsmenu).setOnClickListener(new v(this, i6));
        findViewById(C5248R.id.strategymenu).setOnClickListener(new v(this, i4));
        this.f6348n.setOnClickListener(new v(this, i));
        this.f6356u.setOnClickListener(new v(this, 5));
        this.f6358v.setOnClickListener(new v(this, 6));
        this.f6360w.setOnClickListener(new v(this, 7));
        this.f6362x.setOnClickListener(new v(this, i10));
        this.f6364y.setOnClickListener(new v(this, 9));
        this.C0.setOnClickListener(new v(this, 11));
        this.f6306D0.setOnClickListener(new v(this, 12));
        this.f6308E0.setOnClickListener(new v(this, 13));
        this.f6310F0.setOnClickListener(new v(this, 14));
        this.f6312G0.setOnClickListener(new v(this, 15));
        this.f6314H0.setOnClickListener(new v(this, 16));
        this.f6316I0.setOnClickListener(new v(this, 17));
        this.f6317J0.setOnClickListener(new v(this, 18));
        this.f6319K0.setOnClickListener(new v(this, 19));
        this.f6321L0.setOnClickListener(new v(this, 20));
        this.f6323M0.setOnClickListener(new v(this, 22));
        this.f6325N0.setOnClickListener(new v(this, 23));
        this.f6327O0.setOnClickListener(new v(this, 24));
        this.f6329P0.setOnClickListener(new v(this, 25));
        this.f6331Q0.setOnClickListener(new v(this, 26));
        this.f6333R0.setOnClickListener(new v(this, 27));
        findViewById(C5248R.id.sharemenu).setOnClickListener(new v(this, 28));
        findViewById(C5248R.id.privacymenu).setOnClickListener(new v(this, 29));
        findViewById(C5248R.id.ratemenu).setOnClickListener(new w(this, i9));
    }
}
