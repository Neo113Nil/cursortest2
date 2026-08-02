package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* loaded from: classes5.dex */
public final class mkn implements es3 {
    public final OkHttpClient a;
    public final d0o b;
    public final boolean c;
    public final fpa d;
    public final jib e;
    public final lkn f;
    public final AtomicBoolean g;
    public Object h;
    public job i;
    public okn j;
    public boolean k;
    public evj l;
    public boolean m;
    public boolean n;
    public boolean o;
    public volatile boolean p;
    public volatile evj q;
    public volatile okn r;

    public mkn(OkHttpClient okHttpClient, d0o d0oVar, boolean z) {
        okHttpClient.getClass();
        d0oVar.getClass();
        this.a = okHttpClient;
        this.b = d0oVar;
        this.c = z;
        this.d = (fpa) okHttpClient.b.b;
        this.e = okHttpClient.e.a(this);
        lkn lknVar = new lkn(this);
        lknVar.g(okHttpClient.w, TimeUnit.MILLISECONDS);
        this.f = lknVar;
        this.g = new AtomicBoolean();
        this.o = true;
    }

    public static final String b(mkn mknVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(mknVar.p ? "canceled " : "");
        sb.append(mknVar.c ? "web socket" : "call");
        sb.append(" to ");
        sb.append(mknVar.b.a.i());
        return sb.toString();
    }

    @Override // defpackage.es3
    public final d0o a() {
        return this.b;
    }

    public final void c(okn oknVar) {
        byte[] bArr = cvt.a;
        if (this.j != null) {
            xq0.q("Check failed.");
        } else {
            this.j = oknVar;
            oknVar.p.add(new kkn(this, this.h));
        }
    }

    @Override // defpackage.es3
    public final void cancel() {
        Socket socket;
        if (this.p) {
            return;
        }
        this.p = true;
        evj evjVar = this.q;
        if (evjVar != null) {
            ((iob) evjVar.e).cancel();
        }
        okn oknVar = this.r;
        if (oknVar != null && (socket = oknVar.c) != null) {
            cvt.e(socket);
        }
        this.e.getClass();
    }

    @Override // defpackage.es3
    public final es3 clone() {
        return new mkn(this.a, this.b, this.c);
    }

    public final IOException d(IOException iOException) {
        IOException iOException2;
        Socket i;
        byte[] bArr = cvt.a;
        okn oknVar = this.j;
        if (oknVar != null) {
            synchronized (oknVar) {
                i = i();
            }
            if (this.j == null) {
                if (i != null) {
                    cvt.e(i);
                }
                this.e.h(this, oknVar);
            } else if (i != null) {
                xq0.q("Check failed.");
                return null;
            }
        }
        if (!this.k && this.f.j()) {
            iOException2 = new InterruptedIOException("timeout");
            if (iOException != null) {
                iOException2.initCause(iOException);
            }
        } else {
            iOException2 = iOException;
        }
        jib jibVar = this.e;
        if (iOException == null) {
            jibVar.a(this);
            return iOException2;
        }
        iOException2.getClass();
        jibVar.b(this, iOException2);
        return iOException2;
    }

    public final void e(boolean z) {
        evj evjVar;
        synchronized (this) {
            if (!this.o) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (evjVar = this.q) != null) {
            ((iob) evjVar.e).cancel();
            ((mkn) evjVar.c).g(evjVar, true, true, null);
        }
        this.l = null;
    }

    @Override // defpackage.es3
    public final l3o execute() {
        if (!this.g.compareAndSet(false, true)) {
            xq0.q("Already Executed");
            return null;
        }
        this.f.i();
        otk otkVar = otk.a;
        this.h = otk.a.g();
        this.e.c(this);
        try {
            z98 z98Var = this.a.a;
            synchronized (z98Var) {
                ((ArrayDeque) z98Var.f).add(this);
            }
            return f();
        } finally {
            z98 z98Var2 = this.a.a;
            z98Var2.getClass();
            z98Var2.d((ArrayDeque) z98Var2.f, this);
        }
    }

    public final l3o f() {
        ArrayList arrayList = new ArrayList();
        z75.t(arrayList, this.a.c);
        arrayList.add(new up3(this.a));
        arrayList.add(new up3(this.a.j));
        arrayList.add(new up3(0, this.a.k));
        arrayList.add(n56.b);
        if (!this.c) {
            z75.t(arrayList, this.a.d);
        }
        arrayList.add(new ls3(this.c));
        d0o d0oVar = this.b;
        OkHttpClient okHttpClient = this.a;
        try {
            try {
                l3o f = new ukn(this, arrayList, 0, null, d0oVar, okHttpClient.x, okHttpClient.y, okHttpClient.z).f(this.b);
                if (this.p) {
                    cvt.d(f);
                    throw new IOException("Canceled");
                }
                h(null);
                return f;
            } catch (IOException e) {
                IOException h = h(e);
                h.getClass();
                throw h;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                h(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020 A[Catch: all -> 0x0016, TryCatch #1 {all -> 0x0016, blocks: (B:48:0x0011, B:10:0x0020, B:12:0x0024, B:13:0x0026, B:15:0x002a, B:19:0x0033, B:21:0x0037, B:7:0x001a), top: B:47:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0024 A[Catch: all -> 0x0016, TryCatch #1 {all -> 0x0016, blocks: (B:48:0x0011, B:10:0x0020, B:12:0x0024, B:13:0x0026, B:15:0x002a, B:19:0x0033, B:21:0x0037, B:7:0x001a), top: B:47:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IOException g(evj evjVar, boolean z, boolean z2, IOException iOException) {
        boolean z3;
        boolean z4;
        boolean z5;
        evjVar.getClass();
        if (evjVar.equals(this.q)) {
            synchronized (this) {
                z3 = false;
                if (z) {
                    try {
                        if (!this.m) {
                        }
                        if (z) {
                            this.m = false;
                        }
                        if (z2) {
                            this.n = false;
                        }
                        z5 = this.m;
                        boolean z6 = z5 && !this.n;
                        if (!z5 && !this.n) {
                            if (!this.o) {
                                z3 = true;
                            }
                        }
                        z4 = z3;
                        z3 = z6;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (!z2 || !this.n) {
                    z4 = false;
                }
                if (z) {
                }
                if (z2) {
                }
                z5 = this.m;
                if (z5) {
                }
                if (!z5) {
                    if (!this.o) {
                    }
                }
                z4 = z3;
                z3 = z6;
            }
            if (z3) {
                this.q = null;
                okn oknVar = this.j;
                if (oknVar != null) {
                    synchronized (oknVar) {
                        oknVar.m++;
                    }
                }
            }
            if (z4) {
                return d(iOException);
            }
        }
        return iOException;
    }

    public final IOException h(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.o) {
                this.o = false;
                if (!this.m) {
                    if (!this.n) {
                        z = true;
                    }
                }
            }
        }
        return z ? d(iOException) : iOException;
    }

    public final Socket i() {
        okn oknVar = this.j;
        oknVar.getClass();
        byte[] bArr = cvt.a;
        ArrayList arrayList = oknVar.p;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.d(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            xq0.q("Check failed.");
            return null;
        }
        arrayList.remove(i);
        this.j = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        oknVar.q = System.nanoTime();
        fpa fpaVar = this.d;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) fpaVar.e;
        l8s l8sVar = (l8s) fpaVar.c;
        byte[] bArr2 = cvt.a;
        if (!oknVar.j && fpaVar.a != 0) {
            l8sVar.c((h78) fpaVar.d, 0L);
            return null;
        }
        oknVar.j = true;
        concurrentLinkedQueue.remove(oknVar);
        if (concurrentLinkedQueue.isEmpty()) {
            l8sVar.a();
        }
        Socket socket = oknVar.d;
        socket.getClass();
        return socket;
    }

    @Override // defpackage.es3
    public final boolean o() {
        return this.p;
    }

    @Override // defpackage.es3
    public final void z(ps3 ps3Var) {
        jkn jknVar;
        if (!this.g.compareAndSet(false, true)) {
            xq0.q("Already Executed");
            return;
        }
        otk otkVar = otk.a;
        this.h = otk.a.g();
        this.e.c(this);
        z98 z98Var = this.a.a;
        jkn jknVar2 = new jkn(this, ps3Var);
        z98Var.getClass();
        synchronized (z98Var) {
            ((ArrayDeque) z98Var.d).add(jknVar2);
            if (!this.c) {
                String str = this.b.a.d;
                Iterator it = ((ArrayDeque) z98Var.e).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Iterator it2 = ((ArrayDeque) z98Var.d).iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                jknVar = null;
                                break;
                            } else {
                                jknVar = (jkn) it2.next();
                                if (Intrinsics.d(jknVar.c.b.a.d, str)) {
                                    break;
                                }
                            }
                        }
                    } else {
                        jknVar = (jkn) it.next();
                        if (Intrinsics.d(jknVar.c.b.a.d, str)) {
                            break;
                        }
                    }
                }
                if (jknVar != null) {
                    jknVar2.b = jknVar.b;
                }
            }
        }
        z98Var.k();
    }

    /* renamed from: clone, reason: collision with other method in class */
    public final Object m29clone() {
        return new mkn(this.a, this.b, this.c);
    }
}
