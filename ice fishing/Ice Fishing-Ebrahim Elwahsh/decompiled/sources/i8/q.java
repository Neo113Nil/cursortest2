package i8;

import com.google.android.gms.internal.ads.C4088vv;
import e8.C4483a;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import q2.C4903n;
import r7.AbstractC4979j;

/* loaded from: classes2.dex */
public final class q implements Cloneable {

    /* renamed from: A, reason: collision with root package name */
    public r f38390A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f38391B;

    /* renamed from: C, reason: collision with root package name */
    public C4088vv f38392C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f38393D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f38394E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f38395F;

    /* renamed from: G, reason: collision with root package name */
    public volatile boolean f38396G;

    /* renamed from: H, reason: collision with root package name */
    public volatile C4088vv f38397H;

    /* renamed from: I, reason: collision with root package name */
    public final CopyOnWriteArrayList f38398I;

    /* renamed from: n, reason: collision with root package name */
    public final e8.s f38399n;

    /* renamed from: u, reason: collision with root package name */
    public final C4903n f38400u;

    /* renamed from: v, reason: collision with root package name */
    public final s f38401v;

    /* renamed from: w, reason: collision with root package name */
    public final p f38402w;

    /* renamed from: x, reason: collision with root package name */
    public final AtomicBoolean f38403x;

    /* renamed from: y, reason: collision with root package name */
    public Object f38404y;

    /* renamed from: z, reason: collision with root package name */
    public i f38405z;

    public q(e8.s client, C4903n c4903n) {
        kotlin.jvm.internal.h.e(client, "client");
        this.f38399n = client;
        this.f38400u = c4903n;
        this.f38401v = (s) client.f37472B.f38233u;
        client.f37476d.getClass();
        p pVar = new p(this);
        long j9 = client.f37493v;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        pVar.g(j9);
        this.f38402w = pVar;
        this.f38403x = new AtomicBoolean();
        this.f38395F = true;
        this.f38398I = new CopyOnWriteArrayList();
    }

    public static final String a(q qVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(qVar.f38396G ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(((e8.o) qVar.f38400u.f40101u).f());
        return sb.toString();
    }

    public final IOException b(IOException iOException) {
        IOException iOException2;
        Socket m8;
        TimeZone timeZone = f8.d.f37815a;
        r rVar = this.f38390A;
        if (rVar != null) {
            synchronized (rVar) {
                m8 = m();
            }
            if (this.f38390A == null) {
                if (m8 != null) {
                    f8.d.c(m8);
                }
            } else if (m8 != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.f38391B && this.f38402w.i()) {
            iOException2 = new InterruptedIOException("timeout");
            if (iOException != null) {
                iOException2.initCause(iOException);
            }
        } else {
            iOException2 = iOException;
        }
        if (iOException != null) {
            kotlin.jvm.internal.h.b(iOException2);
        }
        return iOException2;
    }

    public final Object clone() {
        return new q(this.f38399n, this.f38400u);
    }

    public final void h() {
        if (this.f38396G) {
            return;
        }
        this.f38396G = true;
        C4088vv c4088vv = this.f38397H;
        if (c4088vv != null) {
            ((j8.f) c4088vv.f34901x).cancel();
        }
        Iterator it = this.f38398I.iterator();
        kotlin.jvm.internal.h.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((w) it.next()).cancel();
        }
    }

    public final void i(boolean z8) {
        C4088vv c4088vv;
        synchronized (this) {
            if (!this.f38395F) {
                throw new IllegalStateException("released");
            }
        }
        if (z8 && (c4088vv = this.f38397H) != null) {
            ((j8.f) c4088vv.f34901x).cancel();
            ((q) c4088vv.f34899v).k(c4088vv, true, true, null);
        }
        this.f38392C = null;
    }

    public final e8.w j() {
        ArrayList arrayList = new ArrayList();
        AbstractC4979j.F(this.f38399n.f37474b, arrayList);
        arrayList.add(new j8.a(this.f38399n));
        arrayList.add(new j8.a(this.f38399n.f37481j));
        this.f38399n.getClass();
        arrayList.add(new g8.a());
        arrayList.add(b.f38335a);
        AbstractC4979j.F(this.f38399n.f37475c, arrayList);
        arrayList.add(j8.c.f38592a);
        C4903n c4903n = this.f38400u;
        e8.s sVar = this.f38399n;
        boolean z8 = false;
        try {
            try {
                e8.w b9 = new j8.h(this, arrayList, 0, null, c4903n, sVar.f37494w, sVar.f37495x, sVar.f37496y).b(this.f38400u);
                if (this.f38396G) {
                    f8.c.a(b9);
                    throw new IOException("Canceled");
                }
                l(null);
                return b9;
            } catch (IOException e6) {
                z8 = true;
                IOException l9 = l(e6);
                kotlin.jvm.internal.h.c(l9, "null cannot be cast to non-null type kotlin.Throwable");
                throw l9;
            }
        } catch (Throwable th) {
            if (!z8) {
                l(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:47:0x0013, B:10:0x0022, B:12:0x0026, B:13:0x0028, B:15:0x002c, B:19:0x0035, B:21:0x0039, B:7:0x001c), top: B:46:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:47:0x0013, B:10:0x0022, B:12:0x0026, B:13:0x0028, B:15:0x002c, B:19:0x0035, B:21:0x0039, B:7:0x001c), top: B:46:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IOException k(C4088vv exchange, boolean z8, boolean z9, IOException iOException) {
        boolean z10;
        boolean z11;
        boolean z12;
        kotlin.jvm.internal.h.e(exchange, "exchange");
        if (exchange.equals(this.f38397H)) {
            synchronized (this) {
                z10 = false;
                if (z8) {
                    try {
                        if (!this.f38393D) {
                        }
                        if (z8) {
                            this.f38393D = false;
                        }
                        if (z9) {
                            this.f38394E = false;
                        }
                        z12 = this.f38393D;
                        boolean z13 = z12 && !this.f38394E;
                        if (!z12 && !this.f38394E) {
                            if (!this.f38395F) {
                                z10 = true;
                            }
                        }
                        z11 = z10;
                        z10 = z13;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (!z9 || !this.f38394E) {
                    z11 = false;
                }
                if (z8) {
                }
                if (z9) {
                }
                z12 = this.f38393D;
                if (z12) {
                }
                if (!z12) {
                    if (!this.f38395F) {
                    }
                }
                z11 = z10;
                z10 = z13;
            }
            if (z10) {
                this.f38397H = null;
                r rVar = this.f38390A;
                if (rVar != null) {
                    synchronized (rVar) {
                        rVar.f38418o++;
                    }
                }
            }
            if (z11) {
                return b(iOException);
            }
        }
        return iOException;
    }

    public final IOException l(IOException iOException) {
        boolean z8;
        synchronized (this) {
            z8 = false;
            if (this.f38395F) {
                this.f38395F = false;
                if (!this.f38393D) {
                    if (!this.f38394E) {
                        z8 = true;
                    }
                }
            }
        }
        return z8 ? b(iOException) : iOException;
    }

    public final Socket m() {
        r rVar = this.f38390A;
        kotlin.jvm.internal.h.b(rVar);
        TimeZone timeZone = f8.d.f37815a;
        ArrayList arrayList = rVar.f38421r;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (kotlin.jvm.internal.h.a(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i);
        this.f38390A = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        rVar.f38422s = System.nanoTime();
        s sVar = this.f38401v;
        sVar.getClass();
        TimeZone timeZone2 = f8.d.f37815a;
        if (!rVar.f38415l) {
            sVar.f38426d.d(sVar.f38427e, 0L);
            return null;
        }
        rVar.f38415l = true;
        ConcurrentLinkedQueue concurrentLinkedQueue = sVar.f38428f;
        concurrentLinkedQueue.remove(rVar);
        if (concurrentLinkedQueue.isEmpty()) {
            sVar.f38426d.a();
        }
        C4483a address = rVar.f38408d.f37540a;
        kotlin.jvm.internal.h.e(address, "address");
        if (sVar.f38425c.get(address) == null) {
            return rVar.f38410f;
        }
        throw new ClassCastException();
    }
}
