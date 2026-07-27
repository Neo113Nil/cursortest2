package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.LinkedList;
import q2.InterfaceC4870a;

/* renamed from: com.google.android.gms.internal.ads.Sj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2778Sj implements InterfaceC2643Kk, InterfaceC4870a, InterfaceC2990bl, InterfaceC2524Dk, InterfaceC4010uk, InterfaceC3580ml {

    /* renamed from: n, reason: collision with root package name */
    public final T2.a f27539n;

    /* renamed from: u, reason: collision with root package name */
    public final C2870Yf f27540u;

    public C2778Sj(T2.a aVar, C2870Yf c2870Yf) {
        this.f27539n = aVar;
        this.f27540u = c2870Yf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void A() {
        C2870Yf c2870Yf = this.f27540u;
        synchronized (c2870Yf.f28699d) {
            try {
                if (c2870Yf.f28705k != -1) {
                    LinkedList linkedList = c2870Yf.f28698c;
                    if (!linkedList.isEmpty()) {
                        C2854Xf c2854Xf = (C2854Xf) linkedList.getLast();
                        if (c2854Xf.f28544b == -1) {
                            c2854Xf.f28545c.f28696a.getClass();
                            c2854Xf.f28544b = SystemClock.elapsedRealtime();
                            c2870Yf.f28697b.a(c2870Yf);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3580ml
    public final void B(H9 h9) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void D() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2990bl
    public final void O(Yt yt) {
        T2.a aVar = this.f27539n;
        C2870Yf c2870Yf = this.f27540u;
        aVar.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (c2870Yf.f28699d) {
            try {
                c2870Yf.f28705k = elapsedRealtime;
                if (elapsedRealtime != -1) {
                    c2870Yf.f28697b.a(c2870Yf);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3580ml
    public final void a(H9 h9) {
        C2870Yf c2870Yf = this.f27540u;
        synchronized (c2870Yf.f28699d) {
            C3199fg c3199fg = c2870Yf.f28697b;
            synchronized (c3199fg.f30280n) {
                c3199fg.f30283w.b();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2643Kk
    public final void h() {
        C2870Yf c2870Yf = this.f27540u;
        synchronized (c2870Yf.f28699d) {
            try {
                if (c2870Yf.f28705k != -1) {
                    c2870Yf.f28696a.getClass();
                    c2870Yf.f28703h = SystemClock.elapsedRealtime();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2990bl
    public final void i(C2739Qe c2739Qe) {
    }

    @Override // q2.InterfaceC4870a
    public final void onAdClicked() {
        C2870Yf c2870Yf = this.f27540u;
        synchronized (c2870Yf.f28699d) {
            if (c2870Yf.f28705k != -1) {
                C2854Xf c2854Xf = new C2854Xf(c2870Yf);
                c2854Xf.f28545c.f28696a.getClass();
                c2854Xf.f28543a = SystemClock.elapsedRealtime();
                c2870Yf.f28698c.add(c2854Xf);
                c2870Yf.i++;
                C3199fg c3199fg = c2870Yf.f28697b;
                synchronized (c3199fg.f30280n) {
                    C3092dg c3092dg = c3199fg.f30283w;
                    synchronized (c3092dg.f29796f) {
                        c3092dg.f29799j++;
                    }
                }
                c3199fg.a(c2870Yf);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3580ml
    public final void s(boolean z3) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2524Dk
    public final void w() {
        C2870Yf c2870Yf = this.f27540u;
        synchronized (c2870Yf.f28699d) {
            try {
                if (c2870Yf.f28705k != -1 && c2870Yf.f28702g == -1) {
                    c2870Yf.f28696a.getClass();
                    c2870Yf.f28702g = SystemClock.elapsedRealtime();
                    c2870Yf.f28697b.a(c2870Yf);
                }
                C3199fg c3199fg = c2870Yf.f28697b;
                synchronized (c3199fg.f30280n) {
                    C3092dg c3092dg = c3199fg.f30283w;
                    synchronized (c3092dg.f29796f) {
                        c3092dg.f29800k++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3580ml
    public final void x(boolean z3) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3580ml
    public final void y(H9 h9) {
        C2870Yf c2870Yf = this.f27540u;
        synchronized (c2870Yf.f28699d) {
            C3199fg c3199fg = c2870Yf.f28697b;
            synchronized (c3199fg.f30280n) {
                c3199fg.f30283w.b();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void z() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3580ml
    public final void E() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void t(BinderC2821Ve binderC2821Ve, String str, String str2) {
    }
}
