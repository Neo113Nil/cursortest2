package c0;

import L.C0051b;
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
import p0.C0225a;
import s0.AbstractC0257a;

/* renamed from: c0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0107i {

    /* renamed from: a, reason: collision with root package name */
    public AbstractActivityC0104f f1690a;

    /* renamed from: b, reason: collision with root package name */
    public C0113c f1691b;

    /* renamed from: c, reason: collision with root package name */
    public r f1692c;

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.plugin.platform.e f1693d;

    /* renamed from: e, reason: collision with root package name */
    public q0.a f1694e;

    /* renamed from: f, reason: collision with root package name */
    public ViewTreeObserverOnPreDrawListenerC0106h f1695f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1696g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1697h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1699j;

    /* renamed from: k, reason: collision with root package name */
    public Integer f1700k;

    /* renamed from: l, reason: collision with root package name */
    public final C0105g f1701l = new C0105g(0, this);

    /* renamed from: i, reason: collision with root package name */
    public boolean f1698i = false;

    public C0107i(AbstractActivityC0104f abstractActivityC0104f) {
        this.f1690a = abstractActivityC0104f;
    }

    public final void a(C0118h c0118h) {
        String b2 = this.f1690a.b();
        if (b2 == null || b2.isEmpty()) {
            b2 = ((h0.d) C0051b.C().f603h).f2328e.f2316b;
        }
        C0125a c0125a = new C0125a(b2, this.f1690a.e());
        String f2 = this.f1690a.f();
        if (f2 == null) {
            AbstractActivityC0104f abstractActivityC0104f = this.f1690a;
            abstractActivityC0104f.getClass();
            f2 = d(abstractActivityC0104f.getIntent());
            if (f2 == null) {
                f2 = "/";
            }
        }
        c0118h.f1825b = c0125a;
        c0118h.f1826c = f2;
        c0118h.f1827d = (List) this.f1690a.getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    public final void b() {
        if (this.f1690a.i()) {
            throw new AssertionError("The internal FlutterEngine created by " + this.f1690a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
        }
        AbstractActivityC0104f abstractActivityC0104f = this.f1690a;
        abstractActivityC0104f.getClass();
        Log.w("FlutterActivity", "FlutterActivity " + abstractActivityC0104f + " connection to the engine " + abstractActivityC0104f.f1683g.f1691b + " evicted by another attaching activity");
        C0107i c0107i = abstractActivityC0104f.f1683g;
        if (c0107i != null) {
            c0107i.e();
            abstractActivityC0104f.f1683g.f();
        }
    }

    public final void c() {
        if (this.f1690a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    public final String d(Intent intent) {
        boolean z2;
        Uri data;
        AbstractActivityC0104f abstractActivityC0104f = this.f1690a;
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
        if (this.f1695f != null) {
            this.f1692c.getViewTreeObserver().removeOnPreDrawListener(this.f1695f);
            this.f1695f = null;
        }
        r rVar = this.f1692c;
        if (rVar != null) {
            rVar.a();
            r rVar2 = this.f1692c;
            rVar2.f1738l.remove(this.f1701l);
        }
    }

    public final void f() {
        if (this.f1699j) {
            c();
            this.f1690a.getClass();
            this.f1690a.getClass();
            AbstractActivityC0104f abstractActivityC0104f = this.f1690a;
            abstractActivityC0104f.getClass();
            if (abstractActivityC0104f.isChangingConfigurations()) {
                J.b bVar = this.f1691b.f1779d;
                if (bVar.f()) {
                    AbstractC0257a.b("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
                    try {
                        bVar.f412a = true;
                        for (C0225a c0225a : ((HashMap) bVar.f417f).values()) {
                            ((HashSet) c0225a.f2816g.f1801c).remove(c0225a);
                            c0225a.f2816g = null;
                        }
                        bVar.d();
                        Trace.endSection();
                    } finally {
                    }
                } else {
                    Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
                }
            } else {
                this.f1691b.f1779d.c();
            }
            io.flutter.plugin.platform.e eVar = this.f1693d;
            if (eVar != null) {
                eVar.f2447b.f598h = null;
                this.f1693d = null;
            }
            q0.a aVar = this.f1694e;
            if (aVar != null) {
                aVar.f2821c.f2689g = null;
                aVar.f2819a = null;
                this.f1694e = null;
            }
            this.f1690a.getClass();
            C0113c c0113c = this.f1691b;
            if (c0113c != null) {
                C0201d c0201d = c0113c.f1782g;
                c0201d.a(1, c0201d.f2692c);
            }
            if (this.f1690a.i()) {
                C0113c c0113c2 = this.f1691b;
                Iterator it = c0113c2.f1796v.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0112b) it.next()).b();
                }
                J.b bVar2 = c0113c2.f1779d;
                bVar2.e();
                HashMap hashMap = (HashMap) bVar2.f413b;
                Iterator it2 = new HashSet(hashMap.keySet()).iterator();
                while (it2.hasNext()) {
                    Class cls = (Class) it2.next();
                    InterfaceC0188a interfaceC0188a = (InterfaceC0188a) hashMap.get(cls);
                    if (interfaceC0188a != null) {
                        AbstractC0257a.b("FlutterEngineConnectionRegistry#remove ".concat(cls.getSimpleName()));
                        try {
                            if (interfaceC0188a instanceof C0225a) {
                                if (bVar2.f()) {
                                    C0225a c0225a2 = (C0225a) interfaceC0188a;
                                    ((HashSet) c0225a2.f2816g.f1801c).remove(c0225a2);
                                    c0225a2.f2816g = null;
                                }
                                ((HashMap) bVar2.f417f).remove(cls);
                            }
                            interfaceC0188a.c((Q) bVar2.f416e);
                            hashMap.remove(cls);
                            Trace.endSection();
                        } finally {
                        }
                    }
                }
                hashMap.clear();
                while (true) {
                    io.flutter.plugin.platform.k kVar = c0113c2.f1793s;
                    SparseArray sparseArray = kVar.f2475p;
                    if (sparseArray.size() <= 0) {
                        break;
                    }
                    kVar.f2484z.v(sparseArray.keyAt(0));
                }
                while (true) {
                    io.flutter.plugin.platform.j jVar = c0113c2.f1794t;
                    SparseArray sparseArray2 = jVar.f2458l;
                    if (sparseArray2.size() <= 0) {
                        break;
                    }
                    jVar.f2464s.v(sparseArray2.keyAt(0));
                }
                c0113c2.f1778c.f1839f.setPlatformMessageHandler(null);
                FlutterJNI flutterJNI = c0113c2.f1776a;
                flutterJNI.removeEngineLifecycleListener(c0113c2.f1798x);
                flutterJNI.setDeferredComponentManager(null);
                flutterJNI.detachFromNativeAndReleaseResources();
                C0051b.C().getClass();
                C0113c.f1775z.remove(Long.valueOf(c0113c2.f1797w));
                if (this.f1690a.d() != null) {
                    if (C0120j.f1832c == null) {
                        C0120j.f1832c = new C0120j(1);
                    }
                    C0120j c0120j = C0120j.f1832c;
                    c0120j.f1833a.remove(this.f1690a.d());
                }
                this.f1691b = null;
            }
            this.f1699j = false;
        }
    }
}
