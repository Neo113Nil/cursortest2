package P0;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: P0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0075h {

    /* renamed from: a, reason: collision with root package name */
    public AbstractActivityC0072e f1417a;

    /* renamed from: b, reason: collision with root package name */
    public FlutterEngine f1418b;

    /* renamed from: c, reason: collision with root package name */
    public t f1419c;

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.plugin.platform.e f1420d;

    /* renamed from: e, reason: collision with root package name */
    public O1.h f1421e;

    /* renamed from: f, reason: collision with root package name */
    public ViewTreeObserverOnPreDrawListenerC0074g f1422f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1423g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1424h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1426j;

    /* renamed from: k, reason: collision with root package name */
    public Integer f1427k;

    /* renamed from: l, reason: collision with root package name */
    public final C0073f f1428l = new C0073f(0, this);

    /* renamed from: i, reason: collision with root package name */
    public boolean f1425i = false;

    public C0075h(AbstractActivityC0072e abstractActivityC0072e) {
        this.f1417a = abstractActivityC0072e;
    }

    public final void a(Q0.g gVar) {
        String c2 = this.f1417a.c();
        if (c2 == null || c2.isEmpty()) {
            c2 = (String) ((U0.c) I0.b.F().f721b).f1822e.f1169c;
        }
        R0.a aVar = new R0.a(c2, this.f1417a.f());
        String g2 = this.f1417a.g();
        if (g2 == null) {
            AbstractActivityC0072e abstractActivityC0072e = this.f1417a;
            abstractActivityC0072e.getClass();
            g2 = d(abstractActivityC0072e.getIntent());
            if (g2 == null) {
                g2 = "/";
            }
        }
        gVar.f1544b = aVar;
        gVar.f1545c = g2;
        gVar.f1546d = (List) this.f1417a.getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    public final void b() {
        if (this.f1417a.j()) {
            throw new AssertionError("The internal FlutterEngine created by " + this.f1417a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
        }
        AbstractActivityC0072e abstractActivityC0072e = this.f1417a;
        abstractActivityC0072e.getClass();
        Log.w("FlutterActivity", "FlutterActivity " + abstractActivityC0072e + " connection to the engine " + abstractActivityC0072e.f1410b.f1418b + " evicted by another attaching activity");
        C0075h c0075h = abstractActivityC0072e.f1410b;
        if (c0075h != null) {
            c0075h.e();
            abstractActivityC0072e.f1410b.f();
        }
    }

    public final void c() {
        if (this.f1417a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    public final String d(Intent intent) {
        boolean z2;
        Uri data;
        AbstractActivityC0072e abstractActivityC0072e = this.f1417a;
        abstractActivityC0072e.getClass();
        try {
            Bundle h2 = abstractActivityC0072e.h();
            z2 = (h2 == null || !h2.containsKey("flutter_deeplinking_enabled")) ? true : h2.getBoolean("flutter_deeplinking_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            z2 = false;
        }
        if (!z2 || (data = intent.getData()) == null) {
            return null;
        }
        return data.toString();
    }

    public final void e() {
        c();
        if (this.f1422f != null) {
            this.f1419c.getViewTreeObserver().removeOnPreDrawListener(this.f1422f);
            this.f1422f = null;
        }
        t tVar = this.f1419c;
        if (tVar != null) {
            tVar.a();
            t tVar2 = this.f1419c;
            tVar2.f1462g.remove(this.f1428l);
        }
    }

    public final void f() {
        if (this.f1426j) {
            c();
            this.f1417a.getClass();
            this.f1417a.getClass();
            AbstractActivityC0072e abstractActivityC0072e = this.f1417a;
            abstractActivityC0072e.getClass();
            if (abstractActivityC0072e.isChangingConfigurations()) {
                N.a aVar = this.f1418b.f7709d;
                if (aVar.f()) {
                    g1.a.b("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
                    try {
                        aVar.f1105a = true;
                        Iterator it = ((HashMap) aVar.f1110f).values().iterator();
                        while (it.hasNext()) {
                            ((X0.a) it.next()).onDetachedFromActivityForConfigChanges();
                        }
                        aVar.d();
                        Trace.endSection();
                    } finally {
                    }
                } else {
                    Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
                }
            } else {
                this.f1418b.f7709d.c();
            }
            io.flutter.plugin.platform.e eVar = this.f1420d;
            if (eVar != null) {
                eVar.f7838b.f8531c = null;
                this.f1420d = null;
            }
            O1.h hVar = this.f1421e;
            if (hVar != null) {
                ((Z0.i) hVar.f1250d).f1992b = null;
                hVar.f1249c = null;
                this.f1421e = null;
            }
            this.f1417a.getClass();
            FlutterEngine flutterEngine = this.f1418b;
            if (flutterEngine != null) {
                Z0.c cVar = flutterEngine.f7712g;
                cVar.a(1, cVar.f1956c);
            }
            if (this.f1417a.j()) {
                FlutterEngine flutterEngine2 = this.f1418b;
                Iterator it2 = flutterEngine2.f7726v.iterator();
                while (it2.hasNext()) {
                    ((Q0.b) it2.next()).b();
                }
                N.a aVar2 = flutterEngine2.f7709d;
                aVar2.e();
                HashMap hashMap = (HashMap) aVar2.f1106b;
                Iterator it3 = new HashSet(hashMap.keySet()).iterator();
                while (it3.hasNext()) {
                    Class cls = (Class) it3.next();
                    W0.b bVar = (W0.b) hashMap.get(cls);
                    if (bVar != null) {
                        g1.a.b("FlutterEngineConnectionRegistry#remove ".concat(cls.getSimpleName()));
                        try {
                            if (bVar instanceof X0.a) {
                                if (aVar2.f()) {
                                    ((X0.a) bVar).onDetachedFromActivity();
                                }
                                ((HashMap) aVar2.f1110f).remove(cls);
                            }
                            bVar.onDetachedFromEngine((W0.a) aVar2.f1109e);
                            hashMap.remove(cls);
                            Trace.endSection();
                        } finally {
                        }
                    }
                }
                hashMap.clear();
                while (true) {
                    io.flutter.plugin.platform.k kVar = flutterEngine2.f7724s;
                    SparseArray sparseArray = kVar.f7867k;
                    if (sparseArray.size() <= 0) {
                        break;
                    }
                    kVar.f7876u.k(sparseArray.keyAt(0));
                }
                while (true) {
                    io.flutter.plugin.platform.j jVar = flutterEngine2.t;
                    SparseArray sparseArray2 = jVar.f7849g;
                    if (sparseArray2.size() <= 0) {
                        break;
                    }
                    jVar.f7856n.k(sparseArray2.keyAt(0));
                }
                flutterEngine2.f7708c.f1707a.setPlatformMessageHandler(null);
                FlutterJNI flutterJNI = flutterEngine2.f7706a;
                flutterJNI.removeEngineLifecycleListener(flutterEngine2.f7728x);
                flutterJNI.setDeferredComponentManager(null);
                flutterJNI.detachFromNativeAndReleaseResources();
                I0.b.F().getClass();
                FlutterEngine.f7705z.remove(Long.valueOf(flutterEngine2.f7727w));
                if (this.f1417a.e() != null) {
                    if (Q0.i.f1551c == null) {
                        Q0.i.f1551c = new Q0.i(1);
                    }
                    Q0.i iVar = Q0.i.f1551c;
                    iVar.f1552a.remove(this.f1417a.e());
                }
                this.f1418b = null;
            }
            this.f1426j = false;
        }
    }
}
