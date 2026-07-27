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
import p0.C0226a;
import s0.AbstractC0244a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f418a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f419b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f420c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f421d;

    /* renamed from: e, reason: collision with root package name */
    public Object f422e;

    /* renamed from: f, reason: collision with root package name */
    public final Serializable f423f;

    /* renamed from: g, reason: collision with root package name */
    public Object f424g;

    /* renamed from: h, reason: collision with root package name */
    public Object f425h;

    public b(Context context, C0113c c0113c, h0.d dVar) {
        this.f419b = new HashMap();
        this.f423f = new HashMap();
        this.f418a = false;
        new HashMap();
        new HashMap();
        new HashMap();
        this.f420c = c0113c;
        this.f421d = dVar;
        C0126b c0126b = c0113c.f1786c;
        C0120j c0120j = c0113c.f1801s.f2473e;
        this.f422e = new Q(13, context, c0126b);
    }

    public void a(InterfaceC0188a interfaceC0188a) {
        AbstractC0244a.b("FlutterEngineConnectionRegistry#add ".concat(interfaceC0188a.getClass().getSimpleName()));
        try {
            Class<?> cls = interfaceC0188a.getClass();
            HashMap hashMap = (HashMap) this.f419b;
            if (hashMap.containsKey(cls)) {
                Log.w("FlutterEngineCxnRegstry", "Attempted to register plugin (" + interfaceC0188a + ") but it was already registered with this FlutterEngine (" + ((C0113c) this.f420c) + ").");
                Trace.endSection();
                return;
            }
            interfaceC0188a.toString();
            hashMap.put(interfaceC0188a.getClass(), interfaceC0188a);
            interfaceC0188a.h((Q) this.f422e);
            if (interfaceC0188a instanceof C0226a) {
                C0226a c0226a = (C0226a) interfaceC0188a;
                ((HashMap) this.f423f).put(interfaceC0188a.getClass(), c0226a);
                if (f()) {
                    C0114d c0114d = (C0114d) this.f425h;
                    c0226a.f2824f = c0114d;
                    ((HashSet) c0114d.f1809c).add(c0226a);
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
        this.f425h = new C0114d(abstractActivityC0104f, jVar);
        Intent intent = abstractActivityC0104f.getIntent();
        if (intent != null ? intent.getBooleanExtra("enable-software-rendering", false) : false) {
            String str = AbstractC0116f.f1823h.f1814b;
        } else {
            boolean z2 = ((h0.d) this.f421d).f2332a;
        }
        C0113c c0113c = (C0113c) this.f420c;
        c0113c.f1801s.getClass();
        Q q2 = c0113c.f1803u;
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) q2.f519f;
        if (kVar.f2474f != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        kVar.f2474f = abstractActivityC0104f;
        kVar.f2477i = c0113c.f1785b;
        C0126b c0126b = c0113c.f1786c;
        kVar.f2479k = new C0200c(c0126b, 8);
        io.flutter.plugin.platform.j jVar2 = (io.flutter.plugin.platform.j) q2.f520g;
        if (jVar2.f2461f != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        jVar2.f2461f = abstractActivityC0104f;
        C0200c c0200c = new C0200c(c0126b, 7);
        jVar2.f2464i = c0200c;
        c0200c.f2697f = jVar2.r;
        kVar.f2479k.f2697f = q2;
        for (C0226a c0226a : ((HashMap) this.f423f).values()) {
            if (this.f418a) {
                C0114d c0114d = (C0114d) this.f425h;
                c0226a.f2824f = c0114d;
                ((HashSet) c0114d.f1809c).add(c0226a);
            } else {
                C0114d c0114d2 = (C0114d) this.f425h;
                c0226a.f2824f = c0114d2;
                ((HashSet) c0114d2.f1809c).add(c0226a);
            }
        }
        this.f418a = false;
    }

    public void c() {
        if (!f()) {
            Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        AbstractC0244a.b("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            for (C0226a c0226a : ((HashMap) this.f423f).values()) {
                ((HashSet) c0226a.f2824f.f1809c).remove(c0226a);
                c0226a.f2824f = null;
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
        C0113c c0113c = (C0113c) this.f420c;
        io.flutter.plugin.platform.k kVar = c0113c.f1801s;
        C0200c c0200c = kVar.f2479k;
        if (c0200c != null) {
            c0200c.f2697f = null;
        }
        kVar.c();
        kVar.f2479k = null;
        kVar.f2474f = null;
        kVar.f2477i = null;
        io.flutter.plugin.platform.j jVar = c0113c.f1802t;
        C0200c c0200c2 = jVar.f2464i;
        if (c0200c2 != null) {
            c0200c2.f2697f = null;
        }
        Surface surface = jVar.f2470o;
        if (surface != null) {
            surface.release();
            jVar.f2470o = null;
            jVar.f2471p = null;
        }
        jVar.f2464i = null;
        jVar.f2461f = null;
        this.f424g = null;
        this.f425h = null;
    }

    public void e() {
        if (f()) {
            c();
        }
    }

    public boolean f() {
        return ((C0107i) this.f424g) != null;
    }

    public FileInputStream g(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message != null && message.contains("compressed")) {
                ((e) this.f420c).j();
            }
            return null;
        }
    }

    public void h(final int i2, final Serializable serializable) {
        ((Executor) this.f419b).execute(new Runnable() { // from class: J.a
            @Override // java.lang.Runnable
            public final void run() {
                ((e) b.this.f420c).e(i2, serializable);
            }
        });
    }

    public b(AssetManager assetManager, Executor executor, e eVar, String str, File file) {
        this.f418a = false;
        this.f419b = executor;
        this.f420c = eVar;
        this.f424g = str;
        this.f423f = file;
        int i2 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i2 <= 34) {
            switch (i2) {
                case 25:
                    bArr = f.f442h;
                    break;
                case 26:
                    bArr = f.f441g;
                    break;
                case 27:
                    bArr = f.f440f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = f.f439e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = f.f438d;
                    break;
            }
        }
        this.f421d = bArr;
    }
}
