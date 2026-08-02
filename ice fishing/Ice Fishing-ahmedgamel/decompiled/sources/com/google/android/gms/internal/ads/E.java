package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class E extends Handler implements Runnable {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ C4297ze f25270A;

    /* renamed from: n, reason: collision with root package name */
    public final CQ f25271n;

    /* renamed from: u, reason: collision with root package name */
    public FQ f25272u;

    /* renamed from: v, reason: collision with root package name */
    public IOException f25273v;

    /* renamed from: w, reason: collision with root package name */
    public int f25274w;

    /* renamed from: x, reason: collision with root package name */
    public Thread f25275x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f25276y;

    /* renamed from: z, reason: collision with root package name */
    public volatile boolean f25277z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(C4297ze c4297ze, Looper looper, CQ cq, FQ fq, long j6) {
        super(looper);
        Objects.requireNonNull(c4297ze);
        this.f25270A = c4297ze;
        this.f25271n = cq;
        this.f25272u = fq;
    }

    public final void a(boolean z6) {
        this.f25277z = z6;
        this.f25273v = null;
        if (hasMessages(1)) {
            this.f25276y = true;
            removeMessages(1);
            if (!z6) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f25276y = true;
                    this.f25271n.f24885g = true;
                    Thread thread = this.f25275x;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z6) {
            this.f25270A.f36134v = null;
            SystemClock.elapsedRealtime();
            FQ fq = this.f25272u;
            fq.getClass();
            fq.g(this.f25271n, true);
            this.f25272u = null;
        }
    }

    public final void b() {
        C3429jQ c3429jQ;
        SystemClock.elapsedRealtime();
        FQ fq = this.f25272u;
        fq.getClass();
        int i = this.f25274w;
        CQ cq = this.f25271n;
        C3067cm c3067cm = cq.f24880b;
        if (i == 0) {
            Uri uri = cq.f24887j.f30067a;
            Map map = Collections.EMPTY_MAP;
            c3429jQ = new C3429jQ();
        } else {
            Object obj = c3067cm.f30366v;
            c3429jQ = new C3429jQ();
        }
        C3699oQ c3699oQ = new C3699oQ(-1, null, AbstractC3182eu.t(cq.i), AbstractC3182eu.t(fq.f25575T));
        AP ap = fq.f25590w;
        ap.a(new R5(ap, c3429jQ, c3699oQ, i));
        this.f25273v = null;
        C4297ze c4297ze = this.f25270A;
        E e9 = (E) c4297ze.f36134v;
        e9.getClass();
        ((J) c4297ze.f36133u).execute(e9);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        long min;
        D d9;
        InterfaceC3136e1 interfaceC3136e1;
        boolean z6 = true;
        if (this.f25277z) {
            return;
        }
        int i = message.what;
        if (i == 1) {
            b();
            return;
        }
        if (i == 4) {
            throw ((Error) message.obj);
        }
        C4297ze c4297ze = this.f25270A;
        c4297ze.f36134v = null;
        SystemClock.elapsedRealtime();
        FQ fq = this.f25272u;
        fq.getClass();
        if (this.f25276y) {
            fq.g(this.f25271n, false);
            return;
        }
        int i4 = message.what;
        if (i4 == 2) {
            try {
                fq.j(this.f25271n);
                return;
            } catch (RuntimeException e9) {
                AbstractC2991bG.J("LoadTask", "Unexpected exception handling load completed", e9);
                this.f25270A.f36135w = new G(e9);
                return;
            }
        }
        if (i4 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f25273v = iOException;
        int i6 = this.f25274w;
        this.f25274w = i6 + 1;
        CQ cq = this.f25271n;
        Object obj = cq.f24880b.f30366v;
        C3429jQ c3429jQ = new C3429jQ();
        String str = AbstractC3182eu.f30782a;
        for (Throwable th = iOException; th != null; th = th.getCause()) {
            if ((th instanceof U4) || (th instanceof FileNotFoundException) || (th instanceof C3156eL) || (th instanceof G) || ((th instanceof NH) && ((NH) th).f27262n == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min(i6 * 1000, 5000);
        if (min == com.anythink.basead.exoplayer.b.f7168b) {
            d9 = C4297ze.f36131z;
        } else {
            int t6 = fq.t();
            int i9 = t6 > fq.m0 ? 1 : 0;
            if (fq.f25581i0 || !((interfaceC3136e1 = fq.f25574S) == null || interfaceC3136e1.c() == com.anythink.basead.exoplayer.b.f7168b)) {
                fq.m0 = t6;
            } else {
                boolean z9 = fq.f25570O;
                if (!z9 || fq.n()) {
                    fq.f25579X = z9;
                    fq.f25582j0 = 0L;
                    fq.m0 = 0;
                    KQ[] kqArr = fq.f25567L;
                    int length = kqArr.length;
                    int i10 = 0;
                    while (i10 < length) {
                        kqArr[i10].k(false);
                        i10++;
                        z6 = z6;
                    }
                    cq.f24884f.f28641n = 0L;
                    cq.i = 0L;
                    cq.f24886h = z6;
                    cq.f24889l = false;
                } else {
                    fq.f25584l0 = true;
                    d9 = C4297ze.f36130y;
                }
            }
            d9 = new D(i9, min);
        }
        int i11 = d9.f25033a;
        boolean z10 = i11 == 0 || i11 == 1;
        C3699oQ c3699oQ = new C3699oQ(-1, null, AbstractC3182eu.t(cq.i), AbstractC3182eu.t(fq.f25575T));
        AP ap = fq.f25590w;
        ap.a(new Xw(ap, c3429jQ, c3699oQ, iOException, !z10));
        int i12 = d9.f25033a;
        if (i12 == 3) {
            c4297ze.f36135w = this.f25273v;
            return;
        }
        if (i12 != 2) {
            if (i12 == 1) {
                this.f25274w = 1;
            }
            long j6 = d9.f25034b;
            if (j6 == com.anythink.basead.exoplayer.b.f7168b) {
                j6 = Math.min((this.f25274w - 1) * 1000, 5000);
            }
            C4297ze c4297ze2 = this.f25270A;
            AbstractC2792Sd.H(((E) c4297ze2.f36134v) == null);
            c4297ze2.f36134v = this;
            if (j6 > 0) {
                sendEmptyMessageDelayed(1, j6);
            } else {
                b();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z6;
        try {
            synchronized (this) {
                z6 = this.f25276y;
                this.f25275x = Thread.currentThread();
            }
            if (!z6) {
                CQ cq = this.f25271n;
                String simpleName = cq.getClass().getSimpleName();
                StringBuilder sb = new StringBuilder(simpleName.length() + 5);
                sb.append("load:");
                sb.append(simpleName);
                Trace.beginSection(sb.toString());
                try {
                    cq.a();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f25275x = null;
                Thread.interrupted();
            }
            if (this.f25277z) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e9) {
            if (this.f25277z) {
                return;
            }
            obtainMessage(3, e9).sendToTarget();
        } catch (Exception e10) {
            if (this.f25277z) {
                return;
            }
            AbstractC2991bG.J("LoadTask", "Unexpected exception loading stream", e10);
            obtainMessage(3, new G(e10)).sendToTarget();
        } catch (OutOfMemoryError e11) {
            if (this.f25277z) {
                return;
            }
            AbstractC2991bG.J("LoadTask", "OutOfMemory error loading stream", e11);
            obtainMessage(3, new G(e11)).sendToTarget();
        } catch (Error e12) {
            if (!this.f25277z) {
                AbstractC2991bG.J("LoadTask", "Unexpected error loading stream", e12);
                obtainMessage(4, e12).sendToTarget();
            }
            throw e12;
        }
    }
}
