package e0;

import android.content.res.AssetManager;
import android.os.Trace;
import android.util.Log;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
import m0.InterfaceC0219d;
import s0.AbstractC0244a;

/* renamed from: e0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0126b implements m0.f {

    /* renamed from: e, reason: collision with root package name */
    public final FlutterJNI f1847e;

    /* renamed from: f, reason: collision with root package name */
    public final AssetManager f1848f;

    /* renamed from: g, reason: collision with root package name */
    public final long f1849g;

    /* renamed from: h, reason: collision with root package name */
    public final C0133i f1850h;

    /* renamed from: i, reason: collision with root package name */
    public final A.j f1851i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1852j;

    public C0126b(FlutterJNI flutterJNI, AssetManager assetManager, long j2) {
        this.f1852j = false;
        A.j jVar = new A.j(16, this);
        this.f1847e = flutterJNI;
        this.f1848f = assetManager;
        this.f1849g = j2;
        C0133i c0133i = new C0133i(flutterJNI);
        this.f1850h = c0133i;
        c0133i.g("flutter/isolate", jVar, null);
        this.f1851i = new A.j(17, c0133i);
        if (flutterJNI.isAttached()) {
            this.f1852j = true;
        }
    }

    public final void a(C0125a c0125a, List list) {
        if (this.f1852j) {
            Log.w("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        AbstractC0244a.b("DartExecutor#executeDartEntrypoint");
        try {
            Objects.toString(c0125a);
            this.f1847e.runBundleAndSnapshotFromLibrary(c0125a.f1844a, c0125a.f1846c, c0125a.f1845b, this.f1848f, list, this.f1849g);
            this.f1852j = true;
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

    @Override // m0.f
    public final E.a d(m0.i iVar) {
        return ((C0133i) this.f1851i.f30f).d(iVar);
    }

    @Override // m0.f
    public final void f(String str, InterfaceC0219d interfaceC0219d) {
        this.f1851i.f(str, interfaceC0219d);
    }

    @Override // m0.f
    public final void g(String str, InterfaceC0219d interfaceC0219d, E.a aVar) {
        this.f1851i.g(str, interfaceC0219d, aVar);
    }

    @Override // m0.f
    public final void m(String str, ByteBuffer byteBuffer, m0.e eVar) {
        this.f1851i.m(str, byteBuffer, eVar);
    }
}
