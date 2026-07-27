package J;

import L.Q;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import c0.AbstractActivityC0104f;
import c0.C0107i;
import d0.AbstractC0116f;
import d0.C0113c;
import d0.C0114d;
import d0.C0120j;
import e0.C0126b;
import j0.InterfaceC0188a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executor;
import l0.C0200c;
import p0.C0225a;
import s0.AbstractC0257a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f412a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f413b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f414c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f415d;

    /* renamed from: e, reason: collision with root package name */
    public Object f416e;

    /* renamed from: f, reason: collision with root package name */
    public final Serializable f417f;

    /* renamed from: g, reason: collision with root package name */
    public Object f418g;

    /* renamed from: h, reason: collision with root package name */
    public Object f419h;

    public b(Context context, C0113c c0113c, h0.d dVar) {
        this.f413b = new HashMap();
        this.f417f = new HashMap();
        this.f412a = false;
        new HashMap();
        new HashMap();
        new HashMap();
        this.f414c = c0113c;
        this.f415d = dVar;
        C0126b c0126b = c0113c.f1778c;
        C0120j c0120j = c0113c.f1793s.f2465f;
        this.f416e = new Q(13, context, c0126b);
    }

    public void a(InterfaceC0188a interfaceC0188a) {
        AbstractC0257a.b("FlutterEngineConnectionRegistry#add ".concat(interfaceC0188a.getClass().getSimpleName()));
        try {
            Class<?> cls = interfaceC0188a.getClass();
            HashMap hashMap = (HashMap) this.f413b;
            if (hashMap.containsKey(cls)) {
                Log.w("FlutterEngineCxnRegstry", "Attempted to register plugin (" + interfaceC0188a + ") but it was already registered with this FlutterEngine (" + ((C0113c) this.f414c) + ").");
                Trace.endSection();
                return;
            }
            interfaceC0188a.toString();
            hashMap.put(interfaceC0188a.getClass(), interfaceC0188a);
            interfaceC0188a.n((Q) this.f416e);
            if (interfaceC0188a instanceof C0225a) {
                C0225a c0225a = (C0225a) interfaceC0188a;
                ((HashMap) this.f417f).put(interfaceC0188a.getClass(), c0225a);
                if (f()) {
                    C0114d c0114d = (C0114d) this.f419h;
                    c0225a.f2816g = c0114d;
                    ((HashSet) c0114d.f1801c).add(c0225a);
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void b(AbstractActivityC0104f abstractActivityC0104f, androidx.lifecycle.j jVar) {
        this.f419h = new C0114d(abstractActivityC0104f, jVar);
        Intent intent = abstractActivityC0104f.getIntent();
        if (intent != null ? intent.getBooleanExtra("enable-software-rendering", false) : false) {
            String str = AbstractC0116f.f1815h.f1806b;
        } else {
            boolean z2 = ((h0.d) this.f415d).f2324a;
        }
        C0113c c0113c = (C0113c) this.f414c;
        c0113c.f1793s.getClass();
        Q q2 = c0113c.f1795u;
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) q2.f597g;
        if (kVar.f2466g != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        kVar.f2466g = abstractActivityC0104f;
        kVar.f2469j = c0113c.f1777b;
        C0126b c0126b = c0113c.f1778c;
        kVar.f2471l = new C0200c(c0126b, 8);
        io.flutter.plugin.platform.j jVar2 = (io.flutter.plugin.platform.j) q2.f598h;
        if (jVar2.f2453g != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        jVar2.f2453g = abstractActivityC0104f;
        C0200c c0200c = new C0200c(c0126b, 7);
        jVar2.f2456j = c0200c;
        c0200c.f2689g = jVar2.f2464s;
        kVar.f2471l.f2689g = q2;
        for (C0225a c0225a : ((HashMap) this.f417f).values()) {
            if (this.f412a) {
                C0114d c0114d = (C0114d) this.f419h;
                c0225a.f2816g = c0114d;
                ((HashSet) c0114d.f1801c).add(c0225a);
            } else {
                C0114d c0114d2 = (C0114d) this.f419h;
                c0225a.f2816g = c0114d2;
                ((HashSet) c0114d2.f1801c).add(c0225a);
            }
        }
        this.f412a = false;
    }

    public void c() {
        if (!f()) {
            Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        AbstractC0257a.b("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            for (C0225a c0225a : ((HashMap) this.f417f).values()) {
                ((HashSet) c0225a.f2816g.f1801c).remove(c0225a);
                c0225a.f2816g = null;
            }
            d();
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void d() {
        C0113c c0113c = (C0113c) this.f414c;
        io.flutter.plugin.platform.k kVar = c0113c.f1793s;
        C0200c c0200c = kVar.f2471l;
        if (c0200c != null) {
            c0200c.f2689g = null;
        }
        kVar.c();
        kVar.f2471l = null;
        kVar.f2466g = null;
        kVar.f2469j = null;
        io.flutter.plugin.platform.j jVar = c0113c.f1794t;
        C0200c c0200c2 = jVar.f2456j;
        if (c0200c2 != null) {
            c0200c2.f2689g = null;
        }
        Surface surface = jVar.f2462p;
        if (surface != null) {
            surface.release();
            jVar.f2462p = null;
            jVar.f2463q = null;
        }
        jVar.f2456j = null;
        jVar.f2453g = null;
        this.f418g = null;
        this.f419h = null;
    }

    public void e() {
        if (f()) {
            c();
        }
    }

    public boolean f() {
        return ((C0107i) this.f418g) != null;
    }

    public FileInputStream g(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message != null && message.contains("compressed")) {
                ((e) this.f414c).i();
            }
            return null;
        }
    }

    public void h(final int i2, final Serializable serializable) {
        ((Executor) this.f413b).execute(new Runnable() { // from class: J.a
            @Override // java.lang.Runnable
            public final void run() {
                ((e) b.this.f414c).e(i2, serializable);
            }
        });
    }

    public b(AssetManager assetManager, Executor executor, e eVar, String str, File file) {
        this.f412a = false;
        this.f413b = executor;
        this.f414c = eVar;
        this.f418g = str;
        this.f417f = file;
        int i2 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i2 <= 34) {
            switch (i2) {
                case 25:
                    bArr = f.f436h;
                    break;
                case 26:
                    bArr = f.f435g;
                    break;
                case 27:
                    bArr = f.f434f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = f.f433e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = f.f432d;
                    break;
            }
        }
        this.f415d = bArr;
    }
}
