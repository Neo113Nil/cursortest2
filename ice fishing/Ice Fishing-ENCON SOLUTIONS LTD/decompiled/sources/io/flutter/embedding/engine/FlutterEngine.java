package io.flutter.embedding.engine;

import C.j;
import N.a;
import P0.AbstractActivityC0072e;
import R1.l;
import Z0.c;
import Z0.i;
import Z0.k;
import Z0.m;
import a.AbstractC0083a;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import b1.C0130a;
import d1.C0144a;
import g1.b;
import io.flutter.embedding.engine.renderer.h;
import java.util.HashMap;
import java.util.HashSet;
import x0.e;

/* loaded from: classes.dex */
public class FlutterEngine implements b {

    /* renamed from: y, reason: collision with root package name */
    public static long f7704y = 1;

    /* renamed from: z, reason: collision with root package name */
    public static final HashMap f7705z = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f7706a;

    /* renamed from: b, reason: collision with root package name */
    public final h f7707b;

    /* renamed from: c, reason: collision with root package name */
    public final R0.b f7708c;

    /* renamed from: d, reason: collision with root package name */
    public final a f7709d;

    /* renamed from: e, reason: collision with root package name */
    public final C0130a f7710e;

    /* renamed from: f, reason: collision with root package name */
    public final I0.b f7711f;

    /* renamed from: g, reason: collision with root package name */
    public final c f7712g;

    /* renamed from: h, reason: collision with root package name */
    public final j f7713h;

    /* renamed from: i, reason: collision with root package name */
    public final Z0.a f7714i;

    /* renamed from: j, reason: collision with root package name */
    public final Z0.a f7715j;

    /* renamed from: k, reason: collision with root package name */
    public final k f7716k;

    /* renamed from: l, reason: collision with root package name */
    public final e f7717l;

    /* renamed from: m, reason: collision with root package name */
    public final i f7718m;

    /* renamed from: n, reason: collision with root package name */
    public final i f7719n;

    /* renamed from: o, reason: collision with root package name */
    public final m f7720o;

    /* renamed from: p, reason: collision with root package name */
    public final i f7721p;

    /* renamed from: q, reason: collision with root package name */
    public final Z0.b f7722q;

    /* renamed from: r, reason: collision with root package name */
    public final e f7723r;

    /* renamed from: s, reason: collision with root package name */
    public final io.flutter.plugin.platform.k f7724s;
    public final io.flutter.plugin.platform.j t;

    /* renamed from: u, reason: collision with root package name */
    public final e f7725u;

    /* renamed from: w, reason: collision with root package name */
    public final long f7727w;

    /* renamed from: v, reason: collision with root package name */
    public final HashSet f7726v = new HashSet();

    /* renamed from: x, reason: collision with root package name */
    public final Q0.a f7728x = new Q0.a(this);

    public FlutterEngine(AbstractActivityC0072e abstractActivityC0072e, FlutterJNI flutterJNI, io.flutter.plugin.platform.k kVar, boolean z2, boolean z3) {
        AssetManager assets;
        long j2 = f7704y;
        f7704y = 1 + j2;
        this.f7727w = j2;
        f7705z.put(Long.valueOf(j2), this);
        try {
            assets = abstractActivityC0072e.createPackageContext(abstractActivityC0072e.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = abstractActivityC0072e.getAssets();
        }
        I0.b F2 = I0.b.F();
        if (flutterJNI == null) {
            ((m0.j) F2.f722c).getClass();
            flutterJNI = new FlutterJNI();
        }
        this.f7706a = flutterJNI;
        R0.b bVar = new R0.b(flutterJNI, assets, this.f7727w);
        this.f7708c = bVar;
        flutterJNI.setPlatformMessageHandler(bVar.f1710d);
        I0.b.F().getClass();
        this.f7711f = new I0.b(bVar, flutterJNI);
        new m0.j(bVar);
        this.f7712g = new c(bVar);
        e eVar = new e(bVar, 12);
        this.f7713h = new j(bVar);
        this.f7714i = new Z0.a(bVar, 1);
        this.f7715j = new Z0.a(bVar, 0);
        this.f7717l = new e(bVar, 13);
        e eVar2 = new e(bVar, abstractActivityC0072e.getPackageManager());
        this.f7716k = new k(bVar, z3);
        this.f7718m = new i(bVar, 6);
        this.f7719n = new i(bVar, 8);
        m mVar = new m(bVar);
        this.f7720o = mVar;
        this.f7721p = new i(bVar, 10);
        this.f7722q = new Z0.b(bVar);
        this.f7723r = new e(bVar, 16);
        C0130a c0130a = new C0130a(abstractActivityC0072e, eVar);
        this.f7710e = c0130a;
        U0.c cVar = (U0.c) F2.f721b;
        if (!flutterJNI.isAttached()) {
            cVar.d(abstractActivityC0072e.getApplicationContext());
            cVar.a(abstractActivityC0072e, null);
        }
        io.flutter.plugin.platform.j jVar = new io.flutter.plugin.platform.j();
        jVar.f7843a = kVar.f7857a;
        jVar.f7846d = flutterJNI;
        kVar.f7860d = flutterJNI;
        flutterJNI.addEngineLifecycleListener(this.f7728x);
        flutterJNI.setPlatformViewsController(kVar);
        flutterJNI.setPlatformViewsController2(jVar);
        flutterJNI.setLocalizationPlugin(c0130a);
        F2.getClass();
        flutterJNI.setDeferredComponentManager(null);
        flutterJNI.setSettingsChannel(mVar);
        if (!flutterJNI.isAttached()) {
            flutterJNI.attachToNative();
            if (!flutterJNI.isAttached()) {
                throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
            }
        }
        this.f7707b = new h(flutterJNI);
        this.f7724s = kVar;
        this.t = jVar;
        e eVar3 = new e(27, false);
        eVar3.f8530b = kVar;
        eVar3.f8531c = jVar;
        this.f7725u = eVar3;
        a aVar = new a(abstractActivityC0072e.getApplicationContext(), this, cVar);
        this.f7709d = aVar;
        c0130a.b(abstractActivityC0072e.getResources().getConfiguration());
        if (z2 && cVar.f1822e.f1167a) {
            AbstractC0083a.p(this);
        }
        l.e(abstractActivityC0072e, this);
        aVar.a(new C0144a(eVar2));
    }
}
