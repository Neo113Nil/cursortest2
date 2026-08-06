package N;

import P0.AbstractActivityC0072e;
import P0.C0075h;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import io.appmetrica.analytics.impl.C0376e9;
import io.flutter.embedding.engine.FlutterEngine;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1105a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1106b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1107c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1108d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1109e;

    /* renamed from: f, reason: collision with root package name */
    public final Serializable f1110f;

    /* renamed from: g, reason: collision with root package name */
    public Object f1111g;

    /* renamed from: h, reason: collision with root package name */
    public Object f1112h;

    public a(Context context, FlutterEngine flutterEngine, U0.c cVar) {
        this.f1106b = new HashMap();
        this.f1110f = new HashMap();
        this.f1105a = false;
        new HashMap();
        new HashMap();
        new HashMap();
        this.f1107c = flutterEngine;
        this.f1108d = cVar;
        R0.b bVar = flutterEngine.f7708c;
        Q0.i iVar = flutterEngine.f7724s.f7857a;
        this.f1109e = new W0.a(context, bVar);
    }

    public void a(W0.b bVar) {
        g1.a.b("FlutterEngineConnectionRegistry#add ".concat(bVar.getClass().getSimpleName()));
        try {
            Class<?> cls = bVar.getClass();
            HashMap hashMap = (HashMap) this.f1106b;
            if (hashMap.containsKey(cls)) {
                Log.w("FlutterEngineCxnRegstry", "Attempted to register plugin (" + bVar + ") but it was already registered with this FlutterEngine (" + ((FlutterEngine) this.f1107c) + ").");
                Trace.endSection();
                return;
            }
            bVar.toString();
            hashMap.put(bVar.getClass(), bVar);
            bVar.onAttachedToEngine((W0.a) this.f1109e);
            if (bVar instanceof X0.a) {
                X0.a aVar = (X0.a) bVar;
                ((HashMap) this.f1110f).put(bVar.getClass(), aVar);
                if (f()) {
                    aVar.onAttachedToActivity((Q0.c) this.f1112h);
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

    public void b(AbstractActivityC0072e abstractActivityC0072e, androidx.lifecycle.l lVar) {
        this.f1112h = new Q0.c(abstractActivityC0072e, lVar);
        Intent intent = abstractActivityC0072e.getIntent();
        if (intent != null ? intent.getBooleanExtra("enable-software-rendering", false) : false) {
            String str = Q0.e.f1534h.f1525b;
        } else {
            boolean z2 = ((U0.c) this.f1108d).f1818a;
        }
        FlutterEngine flutterEngine = (FlutterEngine) this.f1107c;
        flutterEngine.f7724s.getClass();
        x0.e eVar = flutterEngine.f7725u;
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) eVar.f8530b;
        if (kVar.f7858b != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        kVar.f7858b = abstractActivityC0072e;
        kVar.f7861e = flutterEngine.f7707b;
        R0.b bVar = flutterEngine.f7708c;
        kVar.f7863g = new Z0.i(bVar, 2);
        io.flutter.plugin.platform.j jVar = (io.flutter.plugin.platform.j) eVar.f8531c;
        if (jVar.f7844b != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        jVar.f7844b = abstractActivityC0072e;
        Z0.i iVar = new Z0.i(bVar, 1);
        jVar.f7847e = iVar;
        iVar.f1992b = jVar.f7856n;
        kVar.f7863g.f1992b = eVar;
        for (X0.a aVar : ((HashMap) this.f1110f).values()) {
            if (this.f1105a) {
                aVar.onReattachedToActivityForConfigChanges((Q0.c) this.f1112h);
            } else {
                aVar.onAttachedToActivity((Q0.c) this.f1112h);
            }
        }
        this.f1105a = false;
    }

    public void c() {
        if (!f()) {
            Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        g1.a.b("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            Iterator it = ((HashMap) this.f1110f).values().iterator();
            while (it.hasNext()) {
                ((X0.a) it.next()).onDetachedFromActivity();
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
        FlutterEngine flutterEngine = (FlutterEngine) this.f1107c;
        io.flutter.plugin.platform.k kVar = flutterEngine.f7724s;
        Z0.i iVar = kVar.f7863g;
        if (iVar != null) {
            iVar.f1992b = null;
        }
        kVar.e();
        kVar.f7863g = null;
        kVar.f7858b = null;
        kVar.f7861e = null;
        io.flutter.plugin.platform.j jVar = flutterEngine.t;
        Z0.i iVar2 = jVar.f7847e;
        if (iVar2 != null) {
            iVar2.f1992b = null;
        }
        Surface surface = jVar.f7853k;
        if (surface != null) {
            surface.release();
            jVar.f7853k = null;
            jVar.f7854l = null;
        }
        jVar.f7847e = null;
        jVar.f7844b = null;
        this.f1111g = null;
        this.f1112h = null;
    }

    public void e() {
        if (f()) {
            c();
        }
    }

    public boolean f() {
        return ((C0075h) this.f1111g) != null;
    }

    public FileInputStream g(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message != null && message.contains("compressed")) {
                ((d) this.f1107c).d();
            }
            return null;
        }
    }

    public void h(int i2, Serializable serializable) {
        ((Executor) this.f1106b).execute(new F0.d(this, i2, serializable, 1));
    }

    public a(AssetManager assetManager, Executor executor, d dVar, String str, File file) {
        this.f1105a = false;
        this.f1106b = executor;
        this.f1107c = dVar;
        this.f1111g = str;
        this.f1110f = file;
        int i2 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i2 <= 34) {
            switch (i2) {
                case C0376e9.f5885F /* 25 */:
                    bArr = e.f1129h;
                    break;
                case C0376e9.G /* 26 */:
                    bArr = e.f1128g;
                    break;
                case C0376e9.f5886H /* 27 */:
                    bArr = e.f1127f;
                    break;
                case 28:
                case C0376e9.f5887I /* 29 */:
                case 30:
                    bArr = e.f1126e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = e.f1125d;
                    break;
            }
        }
        this.f1108d = bArr;
    }
}
