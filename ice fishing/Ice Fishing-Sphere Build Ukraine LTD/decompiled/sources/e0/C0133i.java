package e0;

import L.C0026b;
import a.AbstractC0069a;
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
import m0.InterfaceC0219d;
import s0.AbstractC0244a;

/* renamed from: e0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0133i implements m0.f, InterfaceC0134j {

    /* renamed from: e, reason: collision with root package name */
    public final FlutterJNI f1870e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f1871f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f1872g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f1873h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f1874i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f1875j;

    /* renamed from: k, reason: collision with root package name */
    public int f1876k;

    /* renamed from: l, reason: collision with root package name */
    public final C0135k f1877l;

    /* renamed from: m, reason: collision with root package name */
    public final WeakHashMap f1878m;

    /* renamed from: n, reason: collision with root package name */
    public final A.j f1879n;

    public C0133i(FlutterJNI flutterJNI) {
        A.j jVar = new A.j(18, false);
        jVar.f30f = (ExecutorService) C0026b.C().f526h;
        this.f1871f = new HashMap();
        this.f1872g = new HashMap();
        this.f1873h = new Object();
        this.f1874i = new AtomicBoolean(false);
        this.f1875j = new HashMap();
        this.f1876k = 1;
        this.f1877l = new C0135k();
        this.f1878m = new WeakHashMap();
        this.f1870e = flutterJNI;
        this.f1879n = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [e0.c] */
    public final void a(final String str, final C0130f c0130f, final ByteBuffer byteBuffer, final int i2, final long j2) {
        InterfaceC0129e interfaceC0129e = c0130f != null ? c0130f.f1863b : null;
        String a2 = AbstractC0244a.a("PlatformChannel ScheduleHandler on " + str);
        if (Build.VERSION.SDK_INT >= 29) {
            N.a.a(AbstractC0069a.K(a2), i2);
        } else {
            String K2 = AbstractC0069a.K(a2);
            try {
                if (AbstractC0069a.f1083g == null) {
                    AbstractC0069a.f1083g = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                }
                AbstractC0069a.f1083g.invoke(null, Long.valueOf(AbstractC0069a.f1081e), K2, Integer.valueOf(i2));
            } catch (Exception e2) {
                AbstractC0069a.r("asyncTraceBegin", e2);
            }
        }
        ?? r02 = new Runnable() { // from class: e0.c
            @Override // java.lang.Runnable
            public final void run() {
                long j3 = j2;
                FlutterJNI flutterJNI = C0133i.this.f1870e;
                StringBuilder sb = new StringBuilder("PlatformChannel ScheduleHandler on ");
                String str2 = str;
                sb.append(str2);
                String a3 = AbstractC0244a.a(sb.toString());
                int i3 = Build.VERSION.SDK_INT;
                int i4 = i2;
                if (i3 >= 29) {
                    N.a.b(AbstractC0069a.K(a3), i4);
                } else {
                    String K3 = AbstractC0069a.K(a3);
                    try {
                        if (AbstractC0069a.f1084h == null) {
                            AbstractC0069a.f1084h = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                        }
                        AbstractC0069a.f1084h.invoke(null, Long.valueOf(AbstractC0069a.f1081e), K3, Integer.valueOf(i4));
                    } catch (Exception e3) {
                        AbstractC0069a.r("asyncTraceEnd", e3);
                    }
                }
                try {
                    AbstractC0244a.b("DartMessenger#handleMessageFromDart on " + str2);
                    C0130f c0130f2 = c0130f;
                    ByteBuffer byteBuffer2 = byteBuffer;
                    try {
                        if (c0130f2 != null) {
                            try {
                                try {
                                    c0130f2.f1862a.p(byteBuffer2, new C0131g(flutterJNI, i4));
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
        InterfaceC0129e interfaceC0129e2 = interfaceC0129e;
        if (interfaceC0129e == null) {
            interfaceC0129e2 = this.f1877l;
        }
        interfaceC0129e2.a(r02);
    }

    @Override // m0.f
    public final E.a d(m0.i iVar) {
        A.j jVar = this.f1879n;
        jVar.getClass();
        C0132h c0132h = new C0132h((ExecutorService) jVar.f30f);
        E.a aVar = new E.a(16);
        this.f1878m.put(aVar, c0132h);
        return aVar;
    }

    @Override // m0.f
    public final void f(String str, InterfaceC0219d interfaceC0219d) {
        g(str, interfaceC0219d, null);
    }

    @Override // m0.f
    public final void g(String str, InterfaceC0219d interfaceC0219d, E.a aVar) {
        InterfaceC0129e interfaceC0129e;
        if (interfaceC0219d == null) {
            synchronized (this.f1873h) {
                this.f1871f.remove(str);
            }
            return;
        }
        if (aVar != null) {
            interfaceC0129e = (InterfaceC0129e) this.f1878m.get(aVar);
            if (interfaceC0129e == null) {
                throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        } else {
            interfaceC0129e = null;
        }
        synchronized (this.f1873h) {
            try {
                this.f1871f.put(str, new C0130f(interfaceC0219d, interfaceC0129e));
                List<C0128d> list = (List) this.f1872g.remove(str);
                if (list == null) {
                    return;
                }
                for (C0128d c0128d : list) {
                    a(str, (C0130f) this.f1871f.get(str), c0128d.f1859a, c0128d.f1860b, c0128d.f1861c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // m0.f
    public final void m(String str, ByteBuffer byteBuffer, m0.e eVar) {
        AbstractC0244a.b("DartMessenger#send on " + str);
        try {
            int i2 = this.f1876k;
            this.f1876k = i2 + 1;
            if (eVar != null) {
                this.f1875j.put(Integer.valueOf(i2), eVar);
            }
            FlutterJNI flutterJNI = this.f1870e;
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
}
