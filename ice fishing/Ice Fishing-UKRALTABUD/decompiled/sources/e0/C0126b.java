package e0;

import android.content.res.AssetManager;
import android.os.Trace;
import android.util.Log;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
import m0.C0211i;
import m0.InterfaceC0206d;
import m0.InterfaceC0207e;
import m0.InterfaceC0208f;
import s0.AbstractC0257a;

/* renamed from: e0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0126b implements InterfaceC0208f {

    /* renamed from: f, reason: collision with root package name */
    public final FlutterJNI f1839f;

    /* renamed from: g, reason: collision with root package name */
    public final AssetManager f1840g;

    /* renamed from: h, reason: collision with root package name */
    public final long f1841h;

    /* renamed from: i, reason: collision with root package name */
    public final C0133i f1842i;

    /* renamed from: j, reason: collision with root package name */
    public final A.j f1843j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1844k;

    public C0126b(FlutterJNI flutterJNI, AssetManager assetManager, long j2) {
        this.f1844k = false;
        A.j jVar = new A.j(16, this);
        this.f1839f = flutterJNI;
        this.f1840g = assetManager;
        this.f1841h = j2;
        C0133i c0133i = new C0133i(flutterJNI);
        this.f1842i = c0133i;
        c0133i.g("flutter/isolate", jVar, null);
        this.f1843j = new A.j(17, c0133i);
        if (flutterJNI.isAttached()) {
            this.f1844k = true;
        }
    }

    public final void a(C0125a c0125a, List list) {
        if (this.f1844k) {
            Log.w("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        AbstractC0257a.b("DartExecutor#executeDartEntrypoint");
        try {
            Objects.toString(c0125a);
            this.f1839f.runBundleAndSnapshotFromLibrary(c0125a.f1836a, c0125a.f1838c, c0125a.f1837b, this.f1840g, list, this.f1841h);
            this.f1844k = true;
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

    @Override // m0.InterfaceC0208f
    public final E.a d(C0211i c0211i) {
        return ((C0133i) this.f1843j.f30g).d(c0211i);
    }

    @Override // m0.InterfaceC0208f
    public final void f(String str, InterfaceC0206d interfaceC0206d) {
        this.f1843j.f(str, interfaceC0206d);
    }

    @Override // m0.InterfaceC0208f
    public final void g(String str, InterfaceC0206d interfaceC0206d, E.a aVar) {
        this.f1843j.g(str, interfaceC0206d, aVar);
    }

    @Override // m0.InterfaceC0208f
    public final void l(String str, ByteBuffer byteBuffer, InterfaceC0207e interfaceC0207e) {
        this.f1843j.l(str, byteBuffer, interfaceC0207e);
    }
}
