package e0;

import L.C0051b;
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
import m0.C0211i;
import m0.InterfaceC0206d;
import m0.InterfaceC0207e;
import m0.InterfaceC0208f;
import s0.AbstractC0257a;

/* renamed from: e0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0133i implements InterfaceC0208f, InterfaceC0134j {

    /* renamed from: f, reason: collision with root package name */
    public final FlutterJNI f1862f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f1863g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f1864h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f1865i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f1866j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f1867k;

    /* renamed from: l, reason: collision with root package name */
    public int f1868l;

    /* renamed from: m, reason: collision with root package name */
    public final C0135k f1869m;

    /* renamed from: n, reason: collision with root package name */
    public final WeakHashMap f1870n;

    /* renamed from: o, reason: collision with root package name */
    public final A.j f1871o;

    public C0133i(FlutterJNI flutterJNI) {
        A.j jVar = new A.j(18, false);
        jVar.f30g = (ExecutorService) C0051b.C().f604i;
        this.f1863g = new HashMap();
        this.f1864h = new HashMap();
        this.f1865i = new Object();
        this.f1866j = new AtomicBoolean(false);
        this.f1867k = new HashMap();
        this.f1868l = 1;
        this.f1869m = new C0135k();
        this.f1870n = new WeakHashMap();
        this.f1862f = flutterJNI;
        this.f1871o = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [e0.c] */
    public final void a(final String str, final C0130f c0130f, final ByteBuffer byteBuffer, final int i2, final long j2) {
        InterfaceC0129e interfaceC0129e = c0130f != null ? c0130f.f1855b : null;
        String a2 = AbstractC0257a.a("PlatformChannel ScheduleHandler on " + str);
        if (Build.VERSION.SDK_INT >= 29) {
            N.a.a(AbstractC0069a.K(a2), i2);
        } else {
            String K2 = AbstractC0069a.K(a2);
            try {
                if (AbstractC0069a.f1075h == null) {
                    AbstractC0069a.f1075h = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                }
                AbstractC0069a.f1075h.invoke(null, Long.valueOf(AbstractC0069a.f1073f), K2, Integer.valueOf(i2));
            } catch (Exception e2) {
                AbstractC0069a.r("asyncTraceBegin", e2);
            }
        }
        ?? r02 = new Runnable() { // from class: e0.c
            @Override // java.lang.Runnable
            public final void run() {
                long j3 = j2;
                FlutterJNI flutterJNI = C0133i.this.f1862f;
                StringBuilder sb = new StringBuilder("PlatformChannel ScheduleHandler on ");
                String str2 = str;
                sb.append(str2);
                String a3 = AbstractC0257a.a(sb.toString());
                int i3 = Build.VERSION.SDK_INT;
                int i4 = i2;
                if (i3 >= 29) {
                    N.a.b(AbstractC0069a.K(a3), i4);
                } else {
                    String K3 = AbstractC0069a.K(a3);
                    try {
                        if (AbstractC0069a.f1076i == null) {
                            AbstractC0069a.f1076i = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                        }
                        AbstractC0069a.f1076i.invoke(null, Long.valueOf(AbstractC0069a.f1073f), K3, Integer.valueOf(i4));
                    } catch (Exception e3) {
                        AbstractC0069a.r("asyncTraceEnd", e3);
                    }
                }
                try {
                    AbstractC0257a.b("DartMessenger#handleMessageFromDart on " + str2);
                    C0130f c0130f2 = c0130f;
                    ByteBuffer byteBuffer2 = byteBuffer;
                    try {
                        if (c0130f2 != null) {
                            try {
                                try {
                                    c0130f2.f1854a.p(byteBuffer2, new C0131g(flutterJNI, i4));
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
            interfaceC0129e2 = this.f1869m;
        }
        interfaceC0129e2.a(r02);
    }

    @Override // m0.InterfaceC0208f
    public final E.a d(C0211i c0211i) {
        A.j jVar = this.f1871o;
        jVar.getClass();
        C0132h c0132h = new C0132h((ExecutorService) jVar.f30g);
        E.a aVar = new E.a(16);
        this.f1870n.put(aVar, c0132h);
        return aVar;
    }

    @Override // m0.InterfaceC0208f
    public final void f(String str, InterfaceC0206d interfaceC0206d) {
        g(str, interfaceC0206d, null);
    }

    @Override // m0.InterfaceC0208f
    public final void g(String str, InterfaceC0206d interfaceC0206d, E.a aVar) {
        InterfaceC0129e interfaceC0129e;
        if (interfaceC0206d == null) {
            synchronized (this.f1865i) {
                this.f1863g.remove(str);
            }
            return;
        }
        if (aVar != null) {
            interfaceC0129e = (InterfaceC0129e) this.f1870n.get(aVar);
            if (interfaceC0129e == null) {
                throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        } else {
            interfaceC0129e = null;
        }
        synchronized (this.f1865i) {
            try {
                this.f1863g.put(str, new C0130f(interfaceC0206d, interfaceC0129e));
                List<C0128d> list = (List) this.f1864h.remove(str);
                if (list == null) {
                    return;
                }
                for (C0128d c0128d : list) {
                    a(str, (C0130f) this.f1863g.get(str), c0128d.f1851a, c0128d.f1852b, c0128d.f1853c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // m0.InterfaceC0208f
    public final void l(String str, ByteBuffer byteBuffer, InterfaceC0207e interfaceC0207e) {
        AbstractC0257a.b("DartMessenger#send on " + str);
        try {
            int i2 = this.f1868l;
            this.f1868l = i2 + 1;
            if (interfaceC0207e != null) {
                this.f1867k.put(Integer.valueOf(i2), interfaceC0207e);
            }
            FlutterJNI flutterJNI = this.f1862f;
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
