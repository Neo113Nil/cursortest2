package m8;

import com.google.android.gms.internal.ads.C3428jv;
import i8.C4594a;
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
import q2.C4896n;
import v7.AbstractC5129j;

/* loaded from: classes2.dex */
public final class q implements Cloneable {

    /* renamed from: A, reason: collision with root package name */
    public r f39378A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f39379B;

    /* renamed from: C, reason: collision with root package name */
    public C3428jv f39380C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f39381D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f39382E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f39383F;

    /* renamed from: G, reason: collision with root package name */
    public volatile boolean f39384G;

    /* renamed from: H, reason: collision with root package name */
    public volatile C3428jv f39385H;

    /* renamed from: I, reason: collision with root package name */
    public final CopyOnWriteArrayList f39386I;

    /* renamed from: n, reason: collision with root package name */
    public final i8.r f39387n;

    /* renamed from: u, reason: collision with root package name */
    public final C4896n f39388u;

    /* renamed from: v, reason: collision with root package name */
    public final s f39389v;

    /* renamed from: w, reason: collision with root package name */
    public final p f39390w;

    /* renamed from: x, reason: collision with root package name */
    public final AtomicBoolean f39391x;

    /* renamed from: y, reason: collision with root package name */
    public Object f39392y;

    /* renamed from: z, reason: collision with root package name */
    public j f39393z;

    public q(i8.r client, C4896n c4896n) {
        kotlin.jvm.internal.h.e(client, "client");
        this.f39387n = client;
        this.f39388u = c4896n;
        this.f39389v = (s) client.f38194B.f1264u;
        client.f38198d.getClass();
        p pVar = new p(this);
        long j6 = client.f38215v;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        pVar.g(j6);
        this.f39390w = pVar;
        this.f39391x = new AtomicBoolean();
        this.f39383F = true;
        this.f39386I = new CopyOnWriteArrayList();
    }

    public static final String a(q qVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(qVar.f39384G ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(((i8.n) qVar.f39388u.f40192u).f());
        return sb.toString();
    }

    public final IOException b(IOException iOException) {
        IOException iOException2;
        Socket m4;
        TimeZone timeZone = j8.d.f38483a;
        r rVar = this.f39378A;
        if (rVar != null) {
            synchronized (rVar) {
                m4 = m();
            }
            if (this.f39378A == null) {
                if (m4 != null) {
                    j8.d.c(m4);
                }
            } else if (m4 != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.f39379B && this.f39390w.i()) {
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
        return new q(this.f39387n, this.f39388u);
    }

    public final void h() {
        if (this.f39384G) {
            return;
        }
        this.f39384G = true;
        C3428jv c3428jv = this.f39385H;
        if (c3428jv != null) {
            ((n8.f) c3428jv.f31349x).cancel();
        }
        Iterator it = this.f39386I.iterator();
        kotlin.jvm.internal.h.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((w) it.next()).cancel();
        }
    }

    public final void i(boolean z3) {
        C3428jv c3428jv;
        synchronized (this) {
            if (!this.f39383F) {
                throw new IllegalStateException("released");
            }
        }
        if (z3 && (c3428jv = this.f39385H) != null) {
            ((n8.f) c3428jv.f31349x).cancel();
            ((q) c3428jv.f31347v).k(c3428jv, true, true, null);
        }
        this.f39380C = null;
    }

    public final i8.v j() {
        ArrayList arrayList = new ArrayList();
        AbstractC5129j.z(this.f39387n.f38196b, arrayList);
        arrayList.add(new n8.a(this.f39387n));
        arrayList.add(new n8.a(this.f39387n.f38203j));
        this.f39387n.getClass();
        arrayList.add(new k8.a());
        arrayList.add(b.f39322a);
        AbstractC5129j.z(this.f39387n.f38197c, arrayList);
        arrayList.add(n8.c.f39515a);
        C4896n c4896n = this.f39388u;
        i8.r rVar = this.f39387n;
        boolean z3 = false;
        try {
            try {
                i8.v b9 = new n8.h(this, arrayList, 0, null, c4896n, rVar.f38216w, rVar.f38217x, rVar.f38218y).b(this.f39388u);
                if (this.f39384G) {
                    j8.c.a(b9);
                    throw new IOException("Canceled");
                }
                l(null);
                return b9;
            } catch (IOException e9) {
                z3 = true;
                IOException l9 = l(e9);
                kotlin.jvm.internal.h.c(l9, "null cannot be cast to non-null type kotlin.Throwable");
                throw l9;
            }
        } catch (Throwable th) {
            if (!z3) {
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
    public final IOException k(C3428jv exchange, boolean z3, boolean z6, IOException iOException) {
        boolean z9;
        boolean z10;
        boolean z11;
        kotlin.jvm.internal.h.e(exchange, "exchange");
        if (exchange.equals(this.f39385H)) {
            synchronized (this) {
                z9 = false;
                if (z3) {
                    try {
                        if (!this.f39381D) {
                        }
                        if (z3) {
                            this.f39381D = false;
                        }
                        if (z6) {
                            this.f39382E = false;
                        }
                        z11 = this.f39381D;
                        boolean z12 = z11 && !this.f39382E;
                        if (!z11 && !this.f39382E) {
                            if (!this.f39383F) {
                                z9 = true;
                            }
                        }
                        z10 = z9;
                        z9 = z12;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (!z6 || !this.f39382E) {
                    z10 = false;
                }
                if (z3) {
                }
                if (z6) {
                }
                z11 = this.f39381D;
                if (z11) {
                }
                if (!z11) {
                    if (!this.f39383F) {
                    }
                }
                z10 = z9;
                z9 = z12;
            }
            if (z9) {
                this.f39385H = null;
                r rVar = this.f39378A;
                if (rVar != null) {
                    synchronized (rVar) {
                        rVar.f39406o++;
                    }
                }
            }
            if (z10) {
                return b(iOException);
            }
        }
        return iOException;
    }

    public final IOException l(IOException iOException) {
        boolean z3;
        synchronized (this) {
            z3 = false;
            if (this.f39383F) {
                this.f39383F = false;
                if (!this.f39381D) {
                    if (!this.f39382E) {
                        z3 = true;
                    }
                }
            }
        }
        return z3 ? b(iOException) : iOException;
    }

    public final Socket m() {
        r rVar = this.f39378A;
        kotlin.jvm.internal.h.b(rVar);
        TimeZone timeZone = j8.d.f38483a;
        ArrayList arrayList = rVar.f39409r;
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
        this.f39378A = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        rVar.f39410s = System.nanoTime();
        s sVar = this.f39389v;
        sVar.getClass();
        TimeZone timeZone2 = j8.d.f38483a;
        if (!rVar.f39403l) {
            sVar.f39414d.d(sVar.f39415e, 0L);
            return null;
        }
        rVar.f39403l = true;
        ConcurrentLinkedQueue concurrentLinkedQueue = sVar.f39416f;
        concurrentLinkedQueue.remove(rVar);
        if (concurrentLinkedQueue.isEmpty()) {
            sVar.f39414d.a();
        }
        C4594a address = rVar.f39396d.f38262a;
        kotlin.jvm.internal.h.e(address, "address");
        if (sVar.f39413c.get(address) == null) {
            return rVar.f39398f;
        }
        throw new ClassCastException();
    }
}
