package c0;

import L.C0026b;
import L.Q;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import d0.C0113c;
import d0.C0118h;
import d0.C0120j;
import d0.InterfaceC0112b;
import e0.C0125a;
import io.flutter.embedding.engine.FlutterJNI;
import j0.InterfaceC0188a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import l0.C0201d;
import p0.C0226a;
import q0.C0228a;
import s0.AbstractC0244a;

/* renamed from: c0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0107i {

    /* renamed from: a, reason: collision with root package name */
    public AbstractActivityC0104f f1698a;

    /* renamed from: b, reason: collision with root package name */
    public C0113c f1699b;

    /* renamed from: c, reason: collision with root package name */
    public r f1700c;

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.plugin.platform.e f1701d;

    /* renamed from: e, reason: collision with root package name */
    public C0228a f1702e;

    /* renamed from: f, reason: collision with root package name */
    public ViewTreeObserverOnPreDrawListenerC0106h f1703f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1704g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1705h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1707j;

    /* renamed from: k, reason: collision with root package name */
    public Integer f1708k;

    /* renamed from: l, reason: collision with root package name */
    public final C0105g f1709l = new C0105g(0, this);

    /* renamed from: i, reason: collision with root package name */
    public boolean f1706i = false;

    public C0107i(AbstractActivityC0104f abstractActivityC0104f) {
        this.f1698a = abstractActivityC0104f;
    }

    public final void a(C0118h c0118h) {
        String b2 = this.f1698a.b();
        if (b2 == null || b2.isEmpty()) {
            b2 = ((h0.d) C0026b.C().f525g).f2336e.f2324b;
        }
        C0125a c0125a = new C0125a(b2, this.f1698a.e());
        String f2 = this.f1698a.f();
        if (f2 == null) {
            AbstractActivityC0104f abstractActivityC0104f = this.f1698a;
            abstractActivityC0104f.getClass();
            f2 = d(abstractActivityC0104f.getIntent());
            if (f2 == null) {
                f2 = "/";
            }
        }
        c0118h.f1833b = c0125a;
        c0118h.f1834c = f2;
        c0118h.f1835d = (List) this.f1698a.getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    public final void b() {
        if (this.f1698a.i()) {
            throw new AssertionError("The internal FlutterEngine created by " + this.f1698a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
        }
        AbstractActivityC0104f abstractActivityC0104f = this.f1698a;
        abstractActivityC0104f.getClass();
        Log.w("FlutterActivity", "FlutterActivity " + abstractActivityC0104f + " connection to the engine " + abstractActivityC0104f.f1691f.f1699b + " evicted by another attaching activity");
        C0107i c0107i = abstractActivityC0104f.f1691f;
        if (c0107i != null) {
            c0107i.e();
            abstractActivityC0104f.f1691f.f();
        }
    }

    public final void c() {
        if (this.f1698a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    public final String d(Intent intent) {
        boolean z2;
        Uri data;
        AbstractActivityC0104f abstractActivityC0104f = this.f1698a;
        abstractActivityC0104f.getClass();
        try {
            Bundle g2 = abstractActivityC0104f.g();
            z2 = (g2 == null || !g2.containsKey("flutter_deeplinking_enabled")) ? true : g2.getBoolean("flutter_deeplinking_enabled");
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
        if (this.f1703f != null) {
            this.f1700c.getViewTreeObserver().removeOnPreDrawListener(this.f1703f);
            this.f1703f = null;
        }
        r rVar = this.f1700c;
        if (rVar != null) {
            rVar.a();
            r rVar2 = this.f1700c;
            rVar2.f1745k.remove(this.f1709l);
        }
    }

    public final void f() {
        if (this.f1707j) {
            c();
            this.f1698a.getClass();
            this.f1698a.getClass();
            AbstractActivityC0104f abstractActivityC0104f = this.f1698a;
            abstractActivityC0104f.getClass();
            if (abstractActivityC0104f.isChangingConfigurations()) {
                J.b bVar = this.f1699b.f1787d;
                if (bVar.f()) {
                    AbstractC0244a.b("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
                    try {
                        bVar.f418a = true;
                        for (C0226a c0226a : ((HashMap) bVar.f423f).values()) {
                            ((HashSet) c0226a.f2824f.f1809c).remove(c0226a);
                            c0226a.f2824f = null;
                        }
                        bVar.d();
                        Trace.endSection();
                    } finally {
                    }
                } else {
                    Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
                }
            } else {
                this.f1699b.f1787d.c();
            }
            io.flutter.plugin.platform.e eVar = this.f1701d;
            if (eVar != null) {
                eVar.f2455b.f520g = null;
                this.f1701d = null;
            }
            C0228a c0228a = this.f1702e;
            if (c0228a != null) {
                c0228a.f2829c.f2697f = null;
                c0228a.f2827a = null;
                this.f1702e = null;
            }
            this.f1698a.getClass();
            C0113c c0113c = this.f1699b;
            if (c0113c != null) {
                C0201d c0201d = c0113c.f1790g;
                c0201d.a(1, c0201d.f2700c);
            }
            if (this.f1698a.i()) {
                C0113c c0113c2 = this.f1699b;
                Iterator it = c0113c2.f1804v.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0112b) it.next()).b();
                }
                J.b bVar2 = c0113c2.f1787d;
                bVar2.e();
                HashMap hashMap = (HashMap) bVar2.f419b;
                Iterator it2 = new HashSet(hashMap.keySet()).iterator();
                while (it2.hasNext()) {
                    Class cls = (Class) it2.next();
                    InterfaceC0188a interfaceC0188a = (InterfaceC0188a) hashMap.get(cls);
                    if (interfaceC0188a != null) {
                        AbstractC0244a.b("FlutterEngineConnectionRegistry#remove ".concat(cls.getSimpleName()));
                        try {
                            if (interfaceC0188a instanceof C0226a) {
                                if (bVar2.f()) {
                                    C0226a c0226a2 = (C0226a) interfaceC0188a;
                                    ((HashSet) c0226a2.f2824f.f1809c).remove(c0226a2);
                                    c0226a2.f2824f = null;
                                }
                                ((HashMap) bVar2.f423f).remove(cls);
                            }
                            interfaceC0188a.c((Q) bVar2.f422e);
                            hashMap.remove(cls);
                            Trace.endSection();
                        } finally {
                        }
                    }
                }
                hashMap.clear();
                while (true) {
                    io.flutter.plugin.platform.k kVar = c0113c2.f1801s;
                    SparseArray sparseArray = kVar.f2483o;
                    if (sparseArray.size() <= 0) {
                        break;
                    }
                    kVar.f2492y.v(sparseArray.keyAt(0));
                }
                while (true) {
                    io.flutter.plugin.platform.j jVar = c0113c2.f1802t;
                    SparseArray sparseArray2 = jVar.f2466k;
                    if (sparseArray2.size() <= 0) {
                        break;
                    }
                    jVar.r.v(sparseArray2.keyAt(0));
                }
                c0113c2.f1786c.f1847e.setPlatformMessageHandler(null);
                FlutterJNI flutterJNI = c0113c2.f1784a;
                flutterJNI.removeEngineLifecycleListener(c0113c2.f1806x);
                flutterJNI.setDeferredComponentManager(null);
                flutterJNI.detachFromNativeAndReleaseResources();
                C0026b.C().getClass();
                C0113c.f1783z.remove(Long.valueOf(c0113c2.f1805w));
                if (this.f1698a.d() != null) {
                    if (C0120j.f1840c == null) {
                        C0120j.f1840c = new C0120j(1);
                    }
                    C0120j c0120j = C0120j.f1840c;
                    c0120j.f1841a.remove(this.f1698a.d());
                }
                this.f1699b = null;
            }
            this.f1707j = false;
        }
    }
}
