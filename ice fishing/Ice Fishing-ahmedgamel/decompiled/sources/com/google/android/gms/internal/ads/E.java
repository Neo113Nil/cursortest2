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
    public final /* synthetic */ C4274ze f24509A;

    /* renamed from: n, reason: collision with root package name */
    public final C4269zQ f24510n;

    /* renamed from: u, reason: collision with root package name */
    public CQ f24511u;

    /* renamed from: v, reason: collision with root package name */
    public IOException f24512v;

    /* renamed from: w, reason: collision with root package name */
    public int f24513w;

    /* renamed from: x, reason: collision with root package name */
    public Thread f24514x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f24515y;

    /* renamed from: z, reason: collision with root package name */
    public volatile boolean f24516z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(C4274ze c4274ze, Looper looper, C4269zQ c4269zQ, CQ cq, long j6) {
        super(looper);
        Objects.requireNonNull(c4274ze);
        this.f24509A = c4274ze;
        this.f24510n = c4269zQ;
        this.f24511u = cq;
    }

    public final void a(boolean z3) {
        this.f24516z = z3;
        this.f24512v = null;
        if (hasMessages(1)) {
            this.f24515y = true;
            removeMessages(1);
            if (!z3) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f24515y = true;
                    this.f24510n.f35338g = true;
                    Thread thread = this.f24514x;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z3) {
            this.f24509A.f35361v = null;
            SystemClock.elapsedRealtime();
            CQ cq = this.f24511u;
            cq.getClass();
            cq.g(this.f24510n, true);
            this.f24511u = null;
        }
    }

    public final void b() {
        C3246gQ c3246gQ;
        SystemClock.elapsedRealtime();
        CQ cq = this.f24511u;
        cq.getClass();
        int i = this.f24513w;
        C4269zQ c4269zQ = this.f24510n;
        C2991bm c2991bm = c4269zQ.f35333b;
        if (i == 0) {
            Uri uri = c4269zQ.f35340j.f29279a;
            Map map = Collections.EMPTY_MAP;
            c3246gQ = new C3246gQ();
        } else {
            Object obj = c2991bm.f29324v;
            c3246gQ = new C3246gQ();
        }
        C3514lQ c3514lQ = new C3514lQ(-1, null, AbstractC3159eu.t(c4269zQ.i), AbstractC3159eu.t(cq.f24136T));
        AP ap = cq.f24152w;
        ap.a(new R5(ap, c3246gQ, c3514lQ, i));
        this.f24512v = null;
        C4274ze c4274ze = this.f24509A;
        E e9 = (E) c4274ze.f35361v;
        e9.getClass();
        ((J) c4274ze.f35360u).execute(e9);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        long min;
        D d2;
        InterfaceC3113e1 interfaceC3113e1;
        boolean z3 = true;
        if (this.f24516z) {
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
        C4274ze c4274ze = this.f24509A;
        c4274ze.f35361v = null;
        SystemClock.elapsedRealtime();
        CQ cq = this.f24511u;
        cq.getClass();
        if (this.f24515y) {
            cq.g(this.f24510n, false);
            return;
        }
        int i6 = message.what;
        if (i6 == 2) {
            try {
                cq.j(this.f24510n);
                return;
            } catch (RuntimeException e9) {
                AbstractC2968bG.J("LoadTask", "Unexpected exception handling load completed", e9);
                this.f24509A.f35362w = new G(e9);
                return;
            }
        }
        if (i6 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f24512v = iOException;
        int i9 = this.f24513w;
        this.f24513w = i9 + 1;
        C4269zQ c4269zQ = this.f24510n;
        Object obj = c4269zQ.f35333b.f29324v;
        C3246gQ c3246gQ = new C3246gQ();
        String str = AbstractC3159eu.f29993a;
        for (Throwable th = iOException; th != null; th = th.getCause()) {
            if ((th instanceof U4) || (th instanceof FileNotFoundException) || (th instanceof C3133eL) || (th instanceof G) || ((th instanceof NH) && ((NH) th).f26478n == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min(i9 * 1000, 5000);
        if (min == com.anythink.basead.exoplayer.b.f6382b) {
            d2 = C4274ze.f35358z;
        } else {
            int t6 = cq.t();
            int i10 = t6 > cq.f24147r0 ? 1 : 0;
            if (cq.f24143n0 || !((interfaceC3113e1 = cq.f24135S) == null || interfaceC3113e1.c() == com.anythink.basead.exoplayer.b.f6382b)) {
                cq.f24147r0 = t6;
            } else {
                boolean z6 = cq.f24131O;
                if (!z6 || cq.n()) {
                    cq.f24140X = z6;
                    cq.f24144o0 = 0L;
                    cq.f24147r0 = 0;
                    HQ[] hqArr = cq.f24128L;
                    int length = hqArr.length;
                    int i11 = 0;
                    while (i11 < length) {
                        hqArr[i11].k(false);
                        i11++;
                        z3 = z3;
                    }
                    c4269zQ.f35337f.f27844n = 0L;
                    c4269zQ.i = 0L;
                    c4269zQ.f35339h = z3;
                    c4269zQ.f35342l = false;
                } else {
                    cq.f24146q0 = true;
                    d2 = C4274ze.f35357y;
                }
            }
            d2 = new D(i10, min);
        }
        int i12 = d2.f24288a;
        boolean z9 = i12 == 0 || i12 == 1;
        C3514lQ c3514lQ = new C3514lQ(-1, null, AbstractC3159eu.t(c4269zQ.i), AbstractC3159eu.t(cq.f24136T));
        AP ap = cq.f24152w;
        ap.a(new Xw(ap, c3246gQ, c3514lQ, iOException, !z9));
        int i13 = d2.f24288a;
        if (i13 == 3) {
            c4274ze.f35362w = this.f24512v;
            return;
        }
        if (i13 != 2) {
            if (i13 == 1) {
                this.f24513w = 1;
            }
            long j6 = d2.f24289b;
            if (j6 == com.anythink.basead.exoplayer.b.f6382b) {
                j6 = Math.min((this.f24513w - 1) * 1000, 5000);
            }
            C4274ze c4274ze2 = this.f24509A;
            AbstractC2772Sd.H(((E) c4274ze2.f35361v) == null);
            c4274ze2.f35361v = this;
            if (j6 > 0) {
                sendEmptyMessageDelayed(1, j6);
            } else {
                b();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3;
        try {
            synchronized (this) {
                z3 = this.f24515y;
                this.f24514x = Thread.currentThread();
            }
            if (!z3) {
                C4269zQ c4269zQ = this.f24510n;
                String simpleName = c4269zQ.getClass().getSimpleName();
                StringBuilder sb = new StringBuilder(simpleName.length() + 5);
                sb.append("load:");
                sb.append(simpleName);
                Trace.beginSection(sb.toString());
                try {
                    c4269zQ.a();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f24514x = null;
                Thread.interrupted();
            }
            if (this.f24516z) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e9) {
            if (this.f24516z) {
                return;
            }
            obtainMessage(3, e9).sendToTarget();
        } catch (Exception e10) {
            if (this.f24516z) {
                return;
            }
            AbstractC2968bG.J("LoadTask", "Unexpected exception loading stream", e10);
            obtainMessage(3, new G(e10)).sendToTarget();
        } catch (OutOfMemoryError e11) {
            if (this.f24516z) {
                return;
            }
            AbstractC2968bG.J("LoadTask", "OutOfMemory error loading stream", e11);
            obtainMessage(3, new G(e11)).sendToTarget();
        } catch (Error e12) {
            if (!this.f24516z) {
                AbstractC2968bG.J("LoadTask", "Unexpected error loading stream", e12);
                obtainMessage(4, e12).sendToTarget();
            }
            throw e12;
        }
    }
}
