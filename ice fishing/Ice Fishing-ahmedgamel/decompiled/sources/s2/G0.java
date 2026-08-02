package s2;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.AbstractC2704Na;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.BinderC3487kd;
import com.google.android.gms.internal.ads.BinderC4166x8;
import com.google.android.gms.internal.ads.RunnableC3214fP;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import n2.InterfaceC4769d;

/* loaded from: classes.dex */
public final class G0 {

    /* renamed from: a, reason: collision with root package name */
    public final BinderC3487kd f40336a;

    /* renamed from: b, reason: collision with root package name */
    public final e1 f40337b;

    /* renamed from: c, reason: collision with root package name */
    public final m2.v f40338c;

    /* renamed from: d, reason: collision with root package name */
    public final Y0.m f40339d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC4919a f40340e;

    /* renamed from: f, reason: collision with root package name */
    public m2.c f40341f;

    /* renamed from: g, reason: collision with root package name */
    public m2.h[] f40342g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC4769d f40343h;
    public K i;

    /* renamed from: j, reason: collision with root package name */
    public m2.w f40344j;

    /* renamed from: k, reason: collision with root package name */
    public String f40345k;

    /* renamed from: l, reason: collision with root package name */
    public final m2.l f40346l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f40347m;

    /* renamed from: n, reason: collision with root package name */
    public m2.p f40348n;

    /* renamed from: o, reason: collision with root package name */
    public final AtomicLong f40349o;

    public G0(m2.l lVar) {
        e1 e1Var = e1.f40429a;
        this.f40336a = new BinderC3487kd();
        this.f40338c = new m2.v();
        this.f40339d = new Y0.m(this);
        this.f40349o = new AtomicLong();
        this.f40346l = lVar;
        this.f40337b = e1Var;
        this.i = null;
        new AtomicBoolean(false);
    }

    public static f1 a(Context context, m2.h[] hVarArr) {
        for (m2.h hVar : hVarArr) {
            if (hVar.equals(m2.h.f39379o)) {
                return new f1("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false, false);
            }
        }
        f1 f1Var = new f1(context, hVarArr);
        f1Var.f40434C = false;
        return f1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049 A[Catch: RemoteException -> 0x0015, TryCatch #1 {RemoteException -> 0x0015, blocks: (B:3:0x0002, B:6:0x000c, B:8:0x0010, B:11:0x001b, B:13:0x0049, B:14:0x0053, B:16:0x0057, B:17:0x0061, B:19:0x0065, B:20:0x006f, B:35:0x00c6, B:37:0x00ca, B:38:0x00d1, B:40:0x00d2, B:42:0x00d8, B:44:0x00e4, B:45:0x00eb, B:48:0x00fd, B:23:0x0087, B:25:0x008d, B:27:0x009b, B:29:0x00ad, B:30:0x00bc), top: B:2:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057 A[Catch: RemoteException -> 0x0015, TryCatch #1 {RemoteException -> 0x0015, blocks: (B:3:0x0002, B:6:0x000c, B:8:0x0010, B:11:0x001b, B:13:0x0049, B:14:0x0053, B:16:0x0057, B:17:0x0061, B:19:0x0065, B:20:0x006f, B:35:0x00c6, B:37:0x00ca, B:38:0x00d1, B:40:0x00d2, B:42:0x00d8, B:44:0x00e4, B:45:0x00eb, B:48:0x00fd, B:23:0x0087, B:25:0x008d, B:27:0x009b, B:29:0x00ad, B:30:0x00bc), top: B:2:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065 A[Catch: RemoteException -> 0x0015, TryCatch #1 {RemoteException -> 0x0015, blocks: (B:3:0x0002, B:6:0x000c, B:8:0x0010, B:11:0x001b, B:13:0x0049, B:14:0x0053, B:16:0x0057, B:17:0x0061, B:19:0x0065, B:20:0x006f, B:35:0x00c6, B:37:0x00ca, B:38:0x00d1, B:40:0x00d2, B:42:0x00d8, B:44:0x00e4, B:45:0x00eb, B:48:0x00fd, B:23:0x0087, B:25:0x008d, B:27:0x009b, B:29:0x00ad, B:30:0x00bc), top: B:2:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(F0 f02) {
        InterfaceC4919a interfaceC4919a;
        InterfaceC4769d interfaceC4769d;
        m2.w wVar;
        K k9;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            K k10 = this.i;
            m2.l lVar = this.f40346l;
            if (k10 == null) {
                if (this.f40342g != null) {
                    if (this.f40345k == null) {
                    }
                    Context context = lVar.getContext();
                    K k11 = (K) new C4931g(C4949p.f40498g.f40500b, context, a(context, this.f40342g), this.f40345k, this.f40336a).d(context, false);
                    this.i = k11;
                    k11.H1(new a1(this.f40339d));
                    interfaceC4919a = this.f40340e;
                    if (interfaceC4919a != null) {
                        this.i.p3(new BinderC4951q(interfaceC4919a));
                    }
                    interfaceC4769d = this.f40343h;
                    if (interfaceC4769d != null) {
                        this.i.o0(new BinderC4166x8(interfaceC4769d));
                    }
                    wVar = this.f40344j;
                    if (wVar != null) {
                        this.i.o2(new Z0(wVar));
                    }
                    this.i.M3(new U0(this.f40348n));
                    this.i.c2(this.f40347m);
                    k9 = this.i;
                    if (k9 != null) {
                        try {
                            Y2.a c9 = k9.c();
                            if (c9 != null) {
                                if (((Boolean) AbstractC2704Na.f27281f.r()).booleanValue()) {
                                    if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.Cc)).booleanValue()) {
                                        x2.d.f41852b.post(new RunnableC3214fP(19, this, c9));
                                    }
                                }
                                lVar.addView((View) Y2.b.D0(c9));
                            }
                        } catch (RemoteException e9) {
                            x2.i.i("#007 Could not call remote method.", e9);
                        }
                    }
                }
                if (k10 == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context2 = lVar.getContext();
                K k112 = (K) new C4931g(C4949p.f40498g.f40500b, context2, a(context2, this.f40342g), this.f40345k, this.f40336a).d(context2, false);
                this.i = k112;
                k112.H1(new a1(this.f40339d));
                interfaceC4919a = this.f40340e;
                if (interfaceC4919a != null) {
                }
                interfaceC4769d = this.f40343h;
                if (interfaceC4769d != null) {
                }
                wVar = this.f40344j;
                if (wVar != null) {
                }
                this.i.M3(new U0(this.f40348n));
                this.i.c2(this.f40347m);
                k9 = this.i;
                if (k9 != null) {
                }
            }
            f02.f40335n = currentTimeMillis;
            K k12 = this.i;
            if (k12 == null) {
                throw null;
            }
            AtomicLong atomicLong = this.f40349o;
            if (atomicLong.get() != 0) {
                k12.w0(atomicLong.get());
            }
            e1 e1Var = this.f40337b;
            Context context3 = lVar.getContext();
            e1Var.getClass();
            k12.D3(e1.a(context3, f02));
        } catch (RemoteException e10) {
            x2.i.i("#007 Could not call remote method.", e10);
        }
    }

    public final void c(InterfaceC4919a interfaceC4919a) {
        try {
            this.f40340e = interfaceC4919a;
            K k9 = this.i;
            if (k9 != null) {
                k9.p3(interfaceC4919a != null ? new BinderC4951q(interfaceC4919a) : null);
            }
        } catch (RemoteException e9) {
            x2.i.i("#007 Could not call remote method.", e9);
        }
    }

    public final void d(m2.h... hVarArr) {
        m2.l lVar = this.f40346l;
        this.f40342g = hVarArr;
        try {
            K k9 = this.i;
            if (k9 != null) {
                k9.F2(a(lVar.getContext(), this.f40342g));
            }
        } catch (RemoteException e9) {
            x2.i.i("#007 Could not call remote method.", e9);
        }
        lVar.requestLayout();
    }

    public final void e(InterfaceC4769d interfaceC4769d) {
        try {
            this.f40343h = interfaceC4769d;
            K k9 = this.i;
            if (k9 != null) {
                k9.o0(interfaceC4769d != null ? new BinderC4166x8(interfaceC4769d) : null);
            }
        } catch (RemoteException e9) {
            x2.i.i("#007 Could not call remote method.", e9);
        }
    }
}
