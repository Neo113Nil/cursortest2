package N1;

import F.C0038n;
import J1.s;
import J1.v;
import J1.y;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class i implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final s f1183a;

    /* renamed from: b, reason: collision with root package name */
    public final v f1184b;

    /* renamed from: c, reason: collision with root package name */
    public final l f1185c;

    /* renamed from: d, reason: collision with root package name */
    public final h f1186d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f1187e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1188f;

    /* renamed from: g, reason: collision with root package name */
    public f f1189g;

    /* renamed from: h, reason: collision with root package name */
    public k f1190h;

    /* renamed from: i, reason: collision with root package name */
    public e f1191i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1192j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1193k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1194l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f1195m;

    /* renamed from: n, reason: collision with root package name */
    public volatile e f1196n;

    /* renamed from: o, reason: collision with root package name */
    public volatile k f1197o;

    public i(s client, v originalRequest) {
        kotlin.jvm.internal.i.e(client, "client");
        kotlin.jvm.internal.i.e(originalRequest, "originalRequest");
        this.f1183a = client;
        this.f1184b = originalRequest;
        this.f1185c = (l) client.f940b.f124b;
        client.f943e.getClass();
        h hVar = new h(this);
        hVar.g(0, TimeUnit.MILLISECONDS);
        this.f1186d = hVar;
        this.f1187e = new AtomicBoolean();
        this.f1194l = true;
    }

    public final void a(k kVar) {
        byte[] bArr = K1.b.f1051a;
        if (this.f1190h != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f1190h = kVar;
        kVar.f1213p.add(new g(this, this.f1188f));
    }

    public final IOException b(IOException iOException) {
        IOException interruptedIOException;
        Socket h2;
        byte[] bArr = K1.b.f1051a;
        k kVar = this.f1190h;
        if (kVar != null) {
            synchronized (kVar) {
                h2 = h();
            }
            if (this.f1190h == null) {
                if (h2 != null) {
                    K1.b.e(h2);
                }
            } else if (h2 != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (this.f1186d.i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            kotlin.jvm.internal.i.b(interruptedIOException);
        }
        return interruptedIOException;
    }

    public final y c() {
        if (!this.f1187e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f1186d.h();
        R1.n nVar = R1.n.f1772a;
        this.f1188f = R1.n.f1772a.g();
        try {
            C0038n c0038n = this.f1183a.f939a;
            synchronized (c0038n) {
                ((ArrayDeque) c0038n.f535d).add(this);
            }
            return e();
        } finally {
            this.f1183a.f939a.c(this);
        }
    }

    public final Object clone() {
        return new i(this.f1183a, this.f1184b);
    }

    public final void d(boolean z2) {
        e eVar;
        synchronized (this) {
            if (!this.f1194l) {
                throw new IllegalStateException("released");
            }
        }
        if (z2 && (eVar = this.f1196n) != null) {
            ((O1.e) eVar.f1170d).cancel();
            ((i) eVar.f1168b).f(eVar, true, true, null);
        }
        this.f1191i = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final y e() {
        ArrayList arrayList = new ArrayList();
        List elements = this.f1183a.f941c;
        kotlin.jvm.internal.i.e(elements, "elements");
        arrayList.addAll(elements);
        arrayList.add(new O1.a(this.f1183a));
        arrayList.add(new O1.a(this.f1183a.f948j));
        this.f1183a.getClass();
        arrayList.add(new L1.b());
        arrayList.add(a.f1149a);
        List elements2 = this.f1183a.f942d;
        kotlin.jvm.internal.i.e(elements2, "elements");
        arrayList.addAll(elements2);
        arrayList.add(new O1.b());
        v vVar = this.f1184b;
        s sVar = this.f1183a;
        boolean z2 = false;
        try {
            y b2 = new O1.g(this, arrayList, 0, null, vVar, sVar.f959v, sVar.f960w, sVar.f961x).b(this.f1184b);
            if (this.f1195m) {
                K1.b.d(b2);
                throw new IOException("Canceled");
            }
            g(null);
            return b2;
        } catch (IOException e2) {
            try {
                IOException g2 = g(e2);
                if (g2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                }
                throw g2;
            } catch (Throwable th) {
                th = th;
                z2 = true;
                if (!z2) {
                    g(null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (!z2) {
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:50:0x0013, B:12:0x0022, B:14:0x0026, B:15:0x0028, B:17:0x002c, B:21:0x0035, B:23:0x0039, B:9:0x001c), top: B:49:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:50:0x0013, B:12:0x0022, B:14:0x0026, B:15:0x0028, B:17:0x002c, B:21:0x0035, B:23:0x0039, B:9:0x001c), top: B:49:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IOException f(e exchange, boolean z2, boolean z3, IOException iOException) {
        boolean z4;
        boolean z5;
        boolean z6;
        kotlin.jvm.internal.i.e(exchange, "exchange");
        if (!exchange.equals(this.f1196n)) {
            return iOException;
        }
        synchronized (this) {
            z4 = false;
            if (z2) {
                try {
                    if (!this.f1192j) {
                    }
                    if (z2) {
                        this.f1192j = false;
                    }
                    if (z3) {
                        this.f1193k = false;
                    }
                    z6 = this.f1192j;
                    boolean z7 = z6 && !this.f1193k;
                    if (!z6 && !this.f1193k) {
                        if (!this.f1194l) {
                            z4 = true;
                        }
                    }
                    z5 = z4;
                    z4 = z7;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z3 || !this.f1193k) {
                z5 = false;
            }
            if (z2) {
            }
            if (z3) {
            }
            z6 = this.f1192j;
            if (z6) {
            }
            if (!z6) {
                if (!this.f1194l) {
                }
            }
            z5 = z4;
            z4 = z7;
        }
        if (z4) {
            this.f1196n = null;
            k kVar = this.f1190h;
            if (kVar != null) {
                synchronized (kVar) {
                    kVar.f1210m++;
                }
            }
        }
        return z5 ? b(iOException) : iOException;
    }

    public final IOException g(IOException iOException) {
        boolean z2;
        synchronized (this) {
            z2 = false;
            if (this.f1194l) {
                this.f1194l = false;
                if (!this.f1192j) {
                    if (!this.f1193k) {
                        z2 = true;
                    }
                }
            }
        }
        return z2 ? b(iOException) : iOException;
    }

    public final Socket h() {
        k kVar = this.f1190h;
        kotlin.jvm.internal.i.b(kVar);
        byte[] bArr = K1.b.f1051a;
        ArrayList arrayList = kVar.f1213p;
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (kotlin.jvm.internal.i.a(((Reference) it.next()).get(), this)) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i2);
        this.f1190h = null;
        if (arrayList.isEmpty()) {
            kVar.f1214q = System.nanoTime();
            l lVar = this.f1185c;
            lVar.getClass();
            byte[] bArr2 = K1.b.f1051a;
            boolean z2 = kVar.f1207j;
            M1.c cVar = (M1.c) lVar.f1218b;
            if (z2) {
                kVar.f1207j = true;
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) lVar.f1220d;
                concurrentLinkedQueue.remove(kVar);
                if (concurrentLinkedQueue.isEmpty()) {
                    cVar.a();
                }
                Socket socket = kVar.f1201d;
                kotlin.jvm.internal.i.b(socket);
                return socket;
            }
            cVar.c((M1.b) lVar.f1219c, 0L);
        }
        return null;
    }
}
