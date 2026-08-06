package R0;

import R1.l;
import a1.C0093i;
import a1.InterfaceC0088d;
import a1.InterfaceC0089e;
import a1.InterfaceC0090f;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class i implements InterfaceC0090f, j {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f1730a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1731b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f1732c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1733d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f1734e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f1735f;

    /* renamed from: g, reason: collision with root package name */
    public int f1736g;

    /* renamed from: h, reason: collision with root package name */
    public final k f1737h;

    /* renamed from: i, reason: collision with root package name */
    public final WeakHashMap f1738i;

    /* renamed from: j, reason: collision with root package name */
    public final C.j f1739j;

    public i(FlutterJNI flutterJNI) {
        C.j jVar = new C.j(20);
        jVar.f124b = (ExecutorService) I0.b.F().f723d;
        this.f1731b = new HashMap();
        this.f1732c = new HashMap();
        this.f1733d = new Object();
        this.f1734e = new AtomicBoolean(false);
        this.f1735f = new HashMap();
        this.f1736g = 1;
        this.f1737h = new k();
        this.f1738i = new WeakHashMap();
        this.f1730a = flutterJNI;
        this.f1739j = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [R0.c] */
    public final void a(final String str, final f fVar, final ByteBuffer byteBuffer, final int i2, final long j2) {
        e eVar = fVar != null ? fVar.f1723b : null;
        String a2 = g1.a.a("PlatformChannel ScheduleHandler on " + str);
        if (Build.VERSION.SDK_INT >= 29) {
            S.a.a(i2, l.G(a2));
        } else {
            String G = l.G(a2);
            try {
                if (l.f1764c == null) {
                    l.f1764c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                }
                l.f1764c.invoke(null, Long.valueOf(l.f1762a), G, Integer.valueOf(i2));
            } catch (Exception e2) {
                l.r("asyncTraceBegin", e2);
            }
        }
        ?? r02 = new Runnable() { // from class: R0.c
            @Override // java.lang.Runnable
            public final void run() {
                long j3 = j2;
                FlutterJNI flutterJNI = i.this.f1730a;
                StringBuilder sb = new StringBuilder("PlatformChannel ScheduleHandler on ");
                String str2 = str;
                sb.append(str2);
                String a3 = g1.a.a(sb.toString());
                int i3 = Build.VERSION.SDK_INT;
                int i4 = i2;
                if (i3 >= 29) {
                    S.a.b(i4, l.G(a3));
                } else {
                    String G2 = l.G(a3);
                    try {
                        if (l.f1765d == null) {
                            l.f1765d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                        }
                        l.f1765d.invoke(null, Long.valueOf(l.f1762a), G2, Integer.valueOf(i4));
                    } catch (Exception e3) {
                        l.r("asyncTraceEnd", e3);
                    }
                }
                try {
                    g1.a.b("DartMessenger#handleMessageFromDart on " + str2);
                    f fVar2 = fVar;
                    ByteBuffer byteBuffer2 = byteBuffer;
                    try {
                        if (fVar2 != null) {
                            try {
                                try {
                                    fVar2.f1722a.b(byteBuffer2, new g(flutterJNI, i4));
                                } catch (Exception e4) {
                                    Log.e("DartMessenger", "Uncaught exception in binary message listener", e4);
                                    flutterJNI.invokePlatformMessageEmptyResponseCallback(i4);
                                }
                            } catch (Error e5) {
                                Thread currentThread = Thread.currentThread();
                                if (currentThread.getUncaughtExceptionHandler() == null) {
                                    throw e5;
                                }
                                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e5);
                            }
                        } else {
                            flutterJNI.invokePlatformMessageEmptyResponseCallback(i4);
                        }
                        if (byteBuffer2 != null && byteBuffer2.isDirect()) {
                            byteBuffer2.limit(0);
                        }
                        Trace.endSection();
                    } finally {
                    }
                } finally {
                    flutterJNI.cleanupMessageData(j3);
                }
            }
        };
        e eVar2 = eVar;
        if (eVar == null) {
            eVar2 = this.f1737h;
        }
        eVar2.a(r02);
    }

    @Override // a1.InterfaceC0090f
    public final void c(String str, ByteBuffer byteBuffer, InterfaceC0089e interfaceC0089e) {
        g1.a.b("DartMessenger#send on " + str);
        try {
            int i2 = this.f1736g;
            this.f1736g = i2 + 1;
            if (interfaceC0089e != null) {
                this.f1735f.put(Integer.valueOf(i2), interfaceC0089e);
            }
            FlutterJNI flutterJNI = this.f1730a;
            if (byteBuffer == null) {
                flutterJNI.dispatchEmptyPlatformMessage(str, i2);
            } else {
                flutterJNI.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i2);
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

    @Override // a1.InterfaceC0090f
    public final m0.j e(C0093i c0093i) {
        C.j jVar = this.f1739j;
        jVar.getClass();
        h hVar = new h((ExecutorService) jVar.f124b);
        m0.j jVar2 = new m0.j(19, false);
        this.f1738i.put(jVar2, hVar);
        return jVar2;
    }

    @Override // a1.InterfaceC0090f
    public final void f(String str, InterfaceC0088d interfaceC0088d) {
        h(str, interfaceC0088d, null);
    }

    @Override // a1.InterfaceC0090f
    public final void h(String str, InterfaceC0088d interfaceC0088d, m0.j jVar) {
        e eVar;
        if (interfaceC0088d == null) {
            synchronized (this.f1733d) {
                this.f1731b.remove(str);
            }
            return;
        }
        if (jVar != null) {
            eVar = (e) this.f1738i.get(jVar);
            if (eVar == null) {
                throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        } else {
            eVar = null;
        }
        synchronized (this.f1733d) {
            try {
                this.f1731b.put(str, new f(interfaceC0088d, eVar));
                List<d> list = (List) this.f1732c.remove(str);
                if (list == null) {
                    return;
                }
                for (d dVar : list) {
                    a(str, (f) this.f1731b.get(str), dVar.f1719a, dVar.f1720b, dVar.f1721c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
