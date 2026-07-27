package d0;

import L.C0051b;
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
import l0.n;
import n0.C0220a;
import p0.C0225a;
import s0.InterfaceC0258b;

/* renamed from: d0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0113c implements InterfaceC0258b {

    /* renamed from: y, reason: collision with root package name */
    public static long f1774y = 1;

    /* renamed from: z, reason: collision with root package name */
    public static final HashMap f1775z = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f1776a;

    /* renamed from: b, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.h f1777b;

    /* renamed from: c, reason: collision with root package name */
    public final C0126b f1778c;

    /* renamed from: d, reason: collision with root package name */
    public final J.b f1779d;

    /* renamed from: e, reason: collision with root package name */
    public final C0220a f1780e;

    /* renamed from: f, reason: collision with root package name */
    public final C0051b f1781f;

    /* renamed from: g, reason: collision with root package name */
    public final C0201d f1782g;

    /* renamed from: h, reason: collision with root package name */
    public final C0200c f1783h;

    /* renamed from: i, reason: collision with root package name */
    public final C0198a f1784i;

    /* renamed from: j, reason: collision with root package name */
    public final C0198a f1785j;

    /* renamed from: k, reason: collision with root package name */
    public final l0.l f1786k;

    /* renamed from: l, reason: collision with root package name */
    public final Q f1787l;

    /* renamed from: m, reason: collision with root package name */
    public final C0200c f1788m;

    /* renamed from: n, reason: collision with root package name */
    public final C0200c f1789n;

    /* renamed from: o, reason: collision with root package name */
    public final n f1790o;

    /* renamed from: p, reason: collision with root package name */
    public final C0200c f1791p;

    /* renamed from: q, reason: collision with root package name */
    public final C0199b f1792q;
    public final Q r;

    /* renamed from: s, reason: collision with root package name */
    public final io.flutter.plugin.platform.k f1793s;

    /* renamed from: t, reason: collision with root package name */
    public final io.flutter.plugin.platform.j f1794t;

    /* renamed from: u, reason: collision with root package name */
    public final Q f1795u;

    /* renamed from: w, reason: collision with root package name */
    public final long f1797w;

    /* renamed from: v, reason: collision with root package name */
    public final HashSet f1796v = new HashSet();

    /* renamed from: x, reason: collision with root package name */
    public final C0111a f1798x = new C0111a(this);

    public C0113c(AbstractActivityC0104f abstractActivityC0104f, FlutterJNI flutterJNI, io.flutter.plugin.platform.k kVar, boolean z2, boolean z3) {
        AssetManager assets;
        long j2 = f1774y;
        f1774y = 1 + j2;
        this.f1797w = j2;
        f1775z.put(Long.valueOf(j2), this);
        try {
            assets = abstractActivityC0104f.createPackageContext(abstractActivityC0104f.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = abstractActivityC0104f.getAssets();
        }
        C0051b C2 = C0051b.C();
        if (flutterJNI == null) {
            ((E.a) C2.f602g).getClass();
            flutterJNI = new FlutterJNI();
        }
        this.f1776a = flutterJNI;
        C0126b c0126b = new C0126b(flutterJNI, assets, this.f1797w);
        this.f1778c = c0126b;
        flutterJNI.setPlatformMessageHandler(c0126b.f1842i);
        C0051b.C().getClass();
        this.f1781f = new C0051b(c0126b, flutterJNI);
        new E.a(c0126b);
        this.f1782g = new C0201d(c0126b);
        Q q2 = new Q(c0126b, 15);
        this.f1783h = new C0200c(c0126b, 3);
        this.f1784i = new C0198a(c0126b, 1);
        this.f1785j = new C0198a(c0126b, 0);
        this.f1787l = new Q(c0126b, 16);
        Q q3 = new Q(c0126b, abstractActivityC0104f.getPackageManager());
        this.f1786k = new l0.l(c0126b, z3);
        this.f1788m = new C0200c(c0126b, 12);
        this.f1789n = new C0200c(c0126b, 14);
        n nVar = new n(c0126b);
        this.f1790o = nVar;
        this.f1791p = new C0200c(c0126b, 16);
        this.f1792q = new C0199b(c0126b);
        this.r = new Q(c0126b, 19);
        C0220a c0220a = new C0220a(abstractActivityC0104f, q2);
        this.f1780e = c0220a;
        h0.d dVar = (h0.d) C2.f603h;
        if (!flutterJNI.isAttached()) {
            dVar.d(abstractActivityC0104f.getApplicationContext());
            dVar.a(abstractActivityC0104f, null);
        }
        io.flutter.plugin.platform.j jVar = new io.flutter.plugin.platform.j();
        jVar.f2452f = kVar.f2465f;
        jVar.f2455i = flutterJNI;
        kVar.f2468i = flutterJNI;
        flutterJNI.addEngineLifecycleListener(this.f1798x);
        flutterJNI.setPlatformViewsController(kVar);
        flutterJNI.setPlatformViewsController2(jVar);
        flutterJNI.setLocalizationPlugin(c0220a);
        C2.getClass();
        flutterJNI.setDeferredComponentManager(null);
        flutterJNI.setSettingsChannel(nVar);
        if (!flutterJNI.isAttached()) {
            flutterJNI.attachToNative();
            if (!flutterJNI.isAttached()) {
                throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
            }
        }
        this.f1777b = new io.flutter.embedding.engine.renderer.h(flutterJNI);
        this.f1793s = kVar;
        this.f1794t = jVar;
        Q q4 = new Q(12, false);
        q4.f597g = kVar;
        q4.f598h = jVar;
        this.f1795u = q4;
        J.b bVar = new J.b(abstractActivityC0104f.getApplicationContext(), this, dVar);
        this.f1779d = bVar;
        c0220a.b(abstractActivityC0104f.getResources().getConfiguration());
        if (z2 && dVar.f2328e.f2319e) {
            AbstractC0069a.C(this);
        }
        o.g.b(abstractActivityC0104f, this);
        bVar.a(new C0225a(q3));
    }
}
