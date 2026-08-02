package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.LinkedList;
import s2.InterfaceC4919a;

/* renamed from: com.google.android.gms.internal.ads.Sj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2798Sj implements InterfaceC2663Kk, InterfaceC4919a, InterfaceC3013bl, InterfaceC2544Dk, InterfaceC4033uk, InterfaceC3603ml {

    /* renamed from: n, reason: collision with root package name */
    public final V2.a f28331n;

    /* renamed from: u, reason: collision with root package name */
    public final C2893Yf f28332u;

    public C2798Sj(V2.a aVar, C2893Yf c2893Yf) {
        this.f28331n = aVar;
        this.f28332u = c2893Yf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3603ml
    public final void A(H9 h9) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033uk
    public final void B() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3013bl
    public final void O(Yt yt) {
        V2.a aVar = this.f28331n;
        C2893Yf c2893Yf = this.f28332u;
        aVar.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (c2893Yf.f29474d) {
            try {
                c2893Yf.f29480k = elapsedRealtime;
                if (elapsedRealtime != -1) {
                    c2893Yf.f29472b.a(c2893Yf);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3603ml
    public final void a(H9 h9) {
        C2893Yf c2893Yf = this.f28332u;
        synchronized (c2893Yf.f29474d) {
            C3222fg c3222fg = c2893Yf.f29472b;
            synchronized (c3222fg.f31068n) {
                c3222fg.f31071w.b();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033uk
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033uk
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2663Kk
    public final void h() {
        C2893Yf c2893Yf = this.f28332u;
        synchronized (c2893Yf.f29474d) {
            try {
                if (c2893Yf.f29480k != -1) {
                    c2893Yf.f29471a.getClass();
                    c2893Yf.f29478h = SystemClock.elapsedRealtime();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3013bl
    public final void i(C2759Qe c2759Qe) {
    }

    @Override // s2.InterfaceC4919a
    public final void onAdClicked() {
        C2893Yf c2893Yf = this.f28332u;
        synchronized (c2893Yf.f29474d) {
            if (c2893Yf.f29480k != -1) {
                C2877Xf c2877Xf = new C2877Xf(c2893Yf);
                c2877Xf.f29317c.f29471a.getClass();
                c2877Xf.f29315a = SystemClock.elapsedRealtime();
                c2893Yf.f29473c.add(c2877Xf);
                c2893Yf.i++;
                C3222fg c3222fg = c2893Yf.f29472b;
                synchronized (c3222fg.f31068n) {
                    C3115dg c3115dg = c3222fg.f31071w;
                    synchronized (c3115dg.f30569f) {
                        c3115dg.f30572j++;
                    }
                }
                c3222fg.a(c2893Yf);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3603ml
    public final void s(boolean z6) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2544Dk
    public final void v() {
        C2893Yf c2893Yf = this.f28332u;
        synchronized (c2893Yf.f29474d) {
            try {
                if (c2893Yf.f29480k != -1 && c2893Yf.f29477g == -1) {
                    c2893Yf.f29471a.getClass();
                    c2893Yf.f29477g = SystemClock.elapsedRealtime();
                    c2893Yf.f29472b.a(c2893Yf);
                }
                C3222fg c3222fg = c2893Yf.f29472b;
                synchronized (c3222fg.f31068n) {
                    C3115dg c3115dg = c3222fg.f31071w;
                    synchronized (c3115dg.f30569f) {
                        c3115dg.f30573k++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3603ml
    public final void w(boolean z6) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3603ml
    public final void x(H9 h9) {
        C2893Yf c2893Yf = this.f28332u;
        synchronized (c2893Yf.f29474d) {
            C3222fg c3222fg = c2893Yf.f29472b;
            synchronized (c3222fg.f31068n) {
                c3222fg.f31071w.b();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033uk
    public final void y() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033uk
    public final void z() {
        C2893Yf c2893Yf = this.f28332u;
        synchronized (c2893Yf.f29474d) {
            try {
                if (c2893Yf.f29480k != -1) {
                    LinkedList linkedList = c2893Yf.f29473c;
                    if (!linkedList.isEmpty()) {
                        C2877Xf c2877Xf = (C2877Xf) linkedList.getLast();
                        if (c2877Xf.f29316b == -1) {
                            c2877Xf.f29317c.f29471a.getClass();
                            c2877Xf.f29316b = SystemClock.elapsedRealtime();
                            c2893Yf.f29472b.a(c2893Yf);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3603ml
    public final void E() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033uk
    public final void t(BinderC2844Ve binderC2844Ve, String str, String str2) {
    }
}
