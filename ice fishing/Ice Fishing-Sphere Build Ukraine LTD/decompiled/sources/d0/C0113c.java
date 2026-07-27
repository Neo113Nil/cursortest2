package d0;

import L.C0026b;
import L.Q;
import a.AbstractC0069a;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import c0.AbstractActivityC0104f;
import e0.C0126b;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.HashMap;
import java.util.HashSet;
import l0.C0198a;
import l0.C0199b;
import l0.C0200c;
import l0.C0201d;
import l0.C0209l;
import l0.C0211n;
import n0.C0221a;
import p0.C0226a;
import s0.InterfaceC0245b;

/* renamed from: d0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0113c implements InterfaceC0245b {

    /* renamed from: y, reason: collision with root package name */
    public static long f1782y = 1;

    /* renamed from: z, reason: collision with root package name */
    public static final HashMap f1783z = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f1784a;

    /* renamed from: b, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.h f1785b;

    /* renamed from: c, reason: collision with root package name */
    public final C0126b f1786c;

    /* renamed from: d, reason: collision with root package name */
    public final J.b f1787d;

    /* renamed from: e, reason: collision with root package name */
    public final C0221a f1788e;

    /* renamed from: f, reason: collision with root package name */
    public final C0026b f1789f;

    /* renamed from: g, reason: collision with root package name */
    public final C0201d f1790g;

    /* renamed from: h, reason: collision with root package name */
    public final C0200c f1791h;

    /* renamed from: i, reason: collision with root package name */
    public final C0198a f1792i;

    /* renamed from: j, reason: collision with root package name */
    public final C0198a f1793j;

    /* renamed from: k, reason: collision with root package name */
    public final C0209l f1794k;

    /* renamed from: l, reason: collision with root package name */
    public final Q f1795l;

    /* renamed from: m, reason: collision with root package name */
    public final C0200c f1796m;

    /* renamed from: n, reason: collision with root package name */
    public final C0200c f1797n;

    /* renamed from: o, reason: collision with root package name */
    public final C0211n f1798o;

    /* renamed from: p, reason: collision with root package name */
    public final C0200c f1799p;

    /* renamed from: q, reason: collision with root package name */
    public final C0199b f1800q;
    public final Q r;

    /* renamed from: s, reason: collision with root package name */
    public final io.flutter.plugin.platform.k f1801s;

    /* renamed from: t, reason: collision with root package name */
    public final io.flutter.plugin.platform.j f1802t;

    /* renamed from: u, reason: collision with root package name */
    public final Q f1803u;

    /* renamed from: w, reason: collision with root package name */
    public final long f1805w;

    /* renamed from: v, reason: collision with root package name */
    public final HashSet f1804v = new HashSet();

    /* renamed from: x, reason: collision with root package name */
    public final C0111a f1806x = new C0111a(this);

    public C0113c(AbstractActivityC0104f abstractActivityC0104f, FlutterJNI flutterJNI, io.flutter.plugin.platform.k kVar, boolean z2, boolean z3) {
        AssetManager assets;
        long j2 = f1782y;
        f1782y = 1 + j2;
        this.f1805w = j2;
        f1783z.put(Long.valueOf(j2), this);
        try {
            assets = abstractActivityC0104f.createPackageContext(abstractActivityC0104f.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = abstractActivityC0104f.getAssets();
        }
        C0026b C2 = C0026b.C();
        if (flutterJNI == null) {
            ((E.a) C2.f524f).getClass();
            flutterJNI = new FlutterJNI();
        }
        this.f1784a = flutterJNI;
        C0126b c0126b = new C0126b(flutterJNI, assets, this.f1805w);
        this.f1786c = c0126b;
        flutterJNI.setPlatformMessageHandler(c0126b.f1850h);
        C0026b.C().getClass();
        this.f1789f = new C0026b(c0126b, flutterJNI);
        new E.a(c0126b);
        this.f1790g = new C0201d(c0126b);
        Q q2 = new Q(c0126b, 15);
        this.f1791h = new C0200c(c0126b, 3);
        this.f1792i = new C0198a(c0126b, 1);
        this.f1793j = new C0198a(c0126b, 0);
        this.f1795l = new Q(c0126b, 16);
        Q q3 = new Q(c0126b, abstractActivityC0104f.getPackageManager());
        this.f1794k = new C0209l(c0126b, z3);
        this.f1796m = new C0200c(c0126b, 12);
        this.f1797n = new C0200c(c0126b, 14);
        C0211n c0211n = new C0211n(c0126b);
        this.f1798o = c0211n;
        this.f1799p = new C0200c(c0126b, 16);
        this.f1800q = new C0199b(c0126b);
        this.r = new Q(c0126b, 19);
        C0221a c0221a = new C0221a(abstractActivityC0104f, q2);
        this.f1788e = c0221a;
        h0.d dVar = (h0.d) C2.f525g;
        if (!flutterJNI.isAttached()) {
            dVar.d(abstractActivityC0104f.getApplicationContext());
            dVar.a(abstractActivityC0104f, null);
        }
        io.flutter.plugin.platform.j jVar = new io.flutter.plugin.platform.j();
        jVar.f2460e = kVar.f2473e;
        jVar.f2463h = flutterJNI;
        kVar.f2476h = flutterJNI;
        flutterJNI.addEngineLifecycleListener(this.f1806x);
        flutterJNI.setPlatformViewsController(kVar);
        flutterJNI.setPlatformViewsController2(jVar);
        flutterJNI.setLocalizationPlugin(c0221a);
        C2.getClass();
        flutterJNI.setDeferredComponentManager(null);
        flutterJNI.setSettingsChannel(c0211n);
        if (!flutterJNI.isAttached()) {
            flutterJNI.attachToNative();
            if (!flutterJNI.isAttached()) {
                throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
            }
        }
        this.f1785b = new io.flutter.embedding.engine.renderer.h(flutterJNI);
        this.f1801s = kVar;
        this.f1802t = jVar;
        Q q4 = new Q(12, false);
        q4.f519f = kVar;
        q4.f520g = jVar;
        this.f1803u = q4;
        J.b bVar = new J.b(abstractActivityC0104f.getApplicationContext(), this, dVar);
        this.f1787d = bVar;
        c0221a.b(abstractActivityC0104f.getResources().getConfiguration());
        if (z2 && dVar.f2336e.f2327e) {
            AbstractC0069a.C(this);
        }
        o.g.b(abstractActivityC0104f, this);
        bVar.a(new C0226a(q3));
    }
}
