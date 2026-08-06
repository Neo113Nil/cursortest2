package R0;

import a1.C0093i;
import a1.InterfaceC0088d;
import a1.InterfaceC0089e;
import a1.InterfaceC0090f;
import android.content.res.AssetManager;
import android.os.Trace;
import android.util.Log;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b implements InterfaceC0090f {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f1707a;

    /* renamed from: b, reason: collision with root package name */
    public final AssetManager f1708b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1709c;

    /* renamed from: d, reason: collision with root package name */
    public final i f1710d;

    /* renamed from: e, reason: collision with root package name */
    public final C.j f1711e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1712f;

    public b(FlutterJNI flutterJNI, AssetManager assetManager, long j2) {
        this.f1712f = false;
        C.j jVar = new C.j(18, this);
        this.f1707a = flutterJNI;
        this.f1708b = assetManager;
        this.f1709c = j2;
        i iVar = new i(flutterJNI);
        this.f1710d = iVar;
        iVar.h("flutter/isolate", jVar, null);
        this.f1711e = new C.j(19, iVar);
        if (flutterJNI.isAttached()) {
            this.f1712f = true;
        }
    }

    public final void a(a aVar, List list) {
        if (this.f1712f) {
            Log.w("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        g1.a.b("DartExecutor#executeDartEntrypoint");
        try {
            Objects.toString(aVar);
            this.f1707a.runBundleAndSnapshotFromLibrary(aVar.f1704a, aVar.f1706c, aVar.f1705b, this.f1708b, list, this.f1709c);
            this.f1712f = true;
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

    @Override // a1.InterfaceC0090f
    public final void c(String str, ByteBuffer byteBuffer, InterfaceC0089e interfaceC0089e) {
        this.f1711e.c(str, byteBuffer, interfaceC0089e);
    }

    @Override // a1.InterfaceC0090f
    public final m0.j e(C0093i c0093i) {
        return ((i) this.f1711e.f124b).e(c0093i);
    }

    @Override // a1.InterfaceC0090f
    public final void f(String str, InterfaceC0088d interfaceC0088d) {
        this.f1711e.f(str, interfaceC0088d);
    }

    @Override // a1.InterfaceC0090f
    public final void h(String str, InterfaceC0088d interfaceC0088d, m0.j jVar) {
        this.f1711e.h(str, interfaceC0088d, jVar);
    }
}
