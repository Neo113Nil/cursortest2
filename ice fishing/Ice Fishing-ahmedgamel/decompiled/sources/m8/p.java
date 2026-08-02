package m8;

import com.google.android.gms.internal.ads.C3451jv;
import i8.C4603a;
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
import s2.C4945n;
import v7.AbstractC5119j;

/* loaded from: classes2.dex */
public final class p implements Cloneable {

    /* renamed from: A, reason: collision with root package name */
    public q f39535A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f39536B;

    /* renamed from: C, reason: collision with root package name */
    public C3451jv f39537C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f39538D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f39539E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f39540F;

    /* renamed from: G, reason: collision with root package name */
    public volatile boolean f39541G;

    /* renamed from: H, reason: collision with root package name */
    public volatile C3451jv f39542H;

    /* renamed from: I, reason: collision with root package name */
    public final CopyOnWriteArrayList f39543I;

    /* renamed from: n, reason: collision with root package name */
    public final i8.r f39544n;

    /* renamed from: u, reason: collision with root package name */
    public final C4945n f39545u;

    /* renamed from: v, reason: collision with root package name */
    public final r f39546v;

    /* renamed from: w, reason: collision with root package name */
    public final o f39547w;

    /* renamed from: x, reason: collision with root package name */
    public final AtomicBoolean f39548x;

    /* renamed from: y, reason: collision with root package name */
    public Object f39549y;

    /* renamed from: z, reason: collision with root package name */
    public i f39550z;

    public p(i8.r client, C4945n c4945n) {
        kotlin.jvm.internal.h.e(client, "client");
        this.f39544n = client;
        this.f39545u = c4945n;
        this.f39546v = (r) client.f38313B.f38152u;
        client.f38317d.getClass();
        o oVar = new o(this);
        long j6 = client.f38334v;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        oVar.g(j6);
        this.f39547w = oVar;
        this.f39548x = new AtomicBoolean();
        this.f39540F = true;
        this.f39543I = new CopyOnWriteArrayList();
    }

    public static final String a(p pVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(pVar.f39541G ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(((i8.n) pVar.f39545u.f40491u).f());
        return sb.toString();
    }

    public final IOException b(IOException iOException) {
        IOException iOException2;
        Socket m9;
        TimeZone timeZone = j8.d.f38495a;
        q qVar = this.f39535A;
        if (qVar != null) {
            synchronized (qVar) {
                m9 = m();
            }
            if (this.f39535A == null) {
                if (m9 != null) {
                    j8.d.c(m9);
                }
            } else if (m9 != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.f39536B && this.f39547w.i()) {
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
        return new p(this.f39544n, this.f39545u);
    }

    public final void h() {
        if (this.f39541G) {
            return;
        }
        this.f39541G = true;
        C3451jv c3451jv = this.f39542H;
        if (c3451jv != null) {
            ((n8.f) c3451jv.f32128x).cancel();
        }
        Iterator it = this.f39543I.iterator();
        kotlin.jvm.internal.h.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((v) it.next()).cancel();
        }
    }

    public final void i(boolean z6) {
        C3451jv c3451jv;
        synchronized (this) {
            if (!this.f39540F) {
                throw new IllegalStateException("released");
            }
        }
        if (z6 && (c3451jv = this.f39542H) != null) {
            ((n8.f) c3451jv.f32128x).cancel();
            ((p) c3451jv.f32126v).k(c3451jv, true, true, null);
        }
        this.f39537C = null;
    }

    public final i8.v j() {
        ArrayList arrayList = new ArrayList();
        AbstractC5119j.x(this.f39544n.f38315b, arrayList);
        arrayList.add(new n8.a(this.f39544n));
        arrayList.add(new n8.a(this.f39544n.f38322j));
        this.f39544n.getClass();
        arrayList.add(new k8.a());
        arrayList.add(b.f39481a);
        AbstractC5119j.x(this.f39544n.f38316c, arrayList);
        arrayList.add(n8.c.f39682a);
        C4945n c4945n = this.f39545u;
        i8.r rVar = this.f39544n;
        boolean z6 = false;
        try {
            try {
                i8.v b9 = new n8.h(this, arrayList, 0, null, c4945n, rVar.f38335w, rVar.f38336x, rVar.f38337y).b(this.f39545u);
                if (this.f39541G) {
                    j8.c.a(b9);
                    throw new IOException("Canceled");
                }
                l(null);
                return b9;
            } catch (IOException e9) {
                z6 = true;
                IOException l9 = l(e9);
                kotlin.jvm.internal.h.c(l9, "null cannot be cast to non-null type kotlin.Throwable");
                throw l9;
            }
        } catch (Throwable th) {
            if (!z6) {
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
    public final IOException k(C3451jv exchange, boolean z6, boolean z9, IOException iOException) {
        boolean z10;
        boolean z11;
        boolean z12;
        kotlin.jvm.internal.h.e(exchange, "exchange");
        if (exchange.equals(this.f39542H)) {
            synchronized (this) {
                z10 = false;
                if (z6) {
                    try {
                        if (!this.f39538D) {
                        }
                        if (z6) {
                            this.f39538D = false;
                        }
                        if (z9) {
                            this.f39539E = false;
                        }
                        z12 = this.f39538D;
                        boolean z13 = z12 && !this.f39539E;
                        if (!z12 && !this.f39539E) {
                            if (!this.f39540F) {
                                z10 = true;
                            }
                        }
                        z11 = z10;
                        z10 = z13;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (!z9 || !this.f39539E) {
                    z11 = false;
                }
                if (z6) {
                }
                if (z9) {
                }
                z12 = this.f39538D;
                if (z12) {
                }
                if (!z12) {
                    if (!this.f39540F) {
                    }
                }
                z11 = z10;
                z10 = z13;
            }
            if (z10) {
                this.f39542H = null;
                q qVar = this.f39535A;
                if (qVar != null) {
                    synchronized (qVar) {
                        qVar.f39563o++;
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
        boolean z6;
        synchronized (this) {
            z6 = false;
            if (this.f39540F) {
                this.f39540F = false;
                if (!this.f39538D) {
                    if (!this.f39539E) {
                        z6 = true;
                    }
                }
            }
        }
        return z6 ? b(iOException) : iOException;
    }

    public final Socket m() {
        q qVar = this.f39535A;
        kotlin.jvm.internal.h.b(qVar);
        TimeZone timeZone = j8.d.f38495a;
        ArrayList arrayList = qVar.f39566r;
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
        this.f39535A = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        qVar.f39567s = System.nanoTime();
        r rVar = this.f39546v;
        rVar.getClass();
        TimeZone timeZone2 = j8.d.f38495a;
        if (!qVar.f39560l) {
            rVar.f39571d.d(rVar.f39572e, 0L);
            return null;
        }
        qVar.f39560l = true;
        ConcurrentLinkedQueue concurrentLinkedQueue = rVar.f39573f;
        concurrentLinkedQueue.remove(qVar);
        if (concurrentLinkedQueue.isEmpty()) {
            rVar.f39571d.a();
        }
        C4603a address = qVar.f39553d.f38381a;
        kotlin.jvm.internal.h.e(address, "address");
        if (rVar.f39570c.get(address) == null) {
            return qVar.f39555f;
        }
        throw new ClassCastException();
    }
}
