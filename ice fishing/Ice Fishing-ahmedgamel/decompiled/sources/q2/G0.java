package q2;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.AbstractC2684Na;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.BinderC3464kd;
import com.google.android.gms.internal.ads.BinderC4143x8;
import com.google.android.gms.internal.ads.C2815Uo;
import com.google.android.gms.internal.ads.RunnableC3191fP;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import l2.InterfaceC4660d;

/* loaded from: classes.dex */
public final class G0 {

    /* renamed from: a, reason: collision with root package name */
    public final BinderC3464kd f40037a;

    /* renamed from: b, reason: collision with root package name */
    public final e1 f40038b;

    /* renamed from: c, reason: collision with root package name */
    public final k2.v f40039c;

    /* renamed from: d, reason: collision with root package name */
    public final C2815Uo f40040d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC4870a f40041e;

    /* renamed from: f, reason: collision with root package name */
    public k2.c f40042f;

    /* renamed from: g, reason: collision with root package name */
    public k2.h[] f40043g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC4660d f40044h;
    public K i;

    /* renamed from: j, reason: collision with root package name */
    public k2.w f40045j;

    /* renamed from: k, reason: collision with root package name */
    public String f40046k;

    /* renamed from: l, reason: collision with root package name */
    public final k2.l f40047l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f40048m;

    /* renamed from: n, reason: collision with root package name */
    public k2.p f40049n;

    /* renamed from: o, reason: collision with root package name */
    public final AtomicLong f40050o;

    public G0(k2.l lVar) {
        e1 e1Var = e1.f40130a;
        this.f40037a = new BinderC3464kd();
        this.f40039c = new k2.v();
        this.f40040d = new C2815Uo(this);
        this.f40050o = new AtomicLong();
        this.f40047l = lVar;
        this.f40038b = e1Var;
        this.i = null;
        new AtomicBoolean(false);
    }

    public static f1 a(Context context, k2.h[] hVarArr) {
        for (k2.h hVar : hVarArr) {
            if (hVar.equals(k2.h.f38590o)) {
                return new f1("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false, false);
            }
        }
        f1 f1Var = new f1(context, hVarArr);
        f1Var.f40135C = false;
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
        InterfaceC4870a interfaceC4870a;
        InterfaceC4660d interfaceC4660d;
        k2.w wVar;
        K k9;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            K k10 = this.i;
            k2.l lVar = this.f40047l;
            if (k10 == null) {
                if (this.f40043g != null) {
                    if (this.f40046k == null) {
                    }
                    Context context = lVar.getContext();
                    K k11 = (K) new C4882g(C4900p.f40199g.f40201b, context, a(context, this.f40043g), this.f40046k, this.f40037a).d(context, false);
                    this.i = k11;
                    k11.Z2(new a1(this.f40040d));
                    interfaceC4870a = this.f40041e;
                    if (interfaceC4870a != null) {
                        this.i.B3(new BinderC4902q(interfaceC4870a));
                    }
                    interfaceC4660d = this.f40044h;
                    if (interfaceC4660d != null) {
                        this.i.x1(new BinderC4143x8(interfaceC4660d));
                    }
                    wVar = this.f40045j;
                    if (wVar != null) {
                        this.i.U0(new Z0(wVar));
                    }
                    this.i.s0(new U0(this.f40049n));
                    this.i.f2(this.f40048m);
                    k9 = this.i;
                    if (k9 != null) {
                        try {
                            W2.a c9 = k9.c();
                            if (c9 != null) {
                                if (((Boolean) AbstractC2684Na.f26498f.r()).booleanValue()) {
                                    if (((Boolean) r.f40207e.f40210c.a(AbstractC3569ma.Cc)).booleanValue()) {
                                        v2.d.f41398b.post(new RunnableC3191fP(19, this, c9));
                                    }
                                }
                                lVar.addView((View) W2.b.F0(c9));
                            }
                        } catch (RemoteException e9) {
                            v2.i.i("#007 Could not call remote method.", e9);
                        }
                    }
                }
                if (k10 == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context2 = lVar.getContext();
                K k112 = (K) new C4882g(C4900p.f40199g.f40201b, context2, a(context2, this.f40043g), this.f40046k, this.f40037a).d(context2, false);
                this.i = k112;
                k112.Z2(new a1(this.f40040d));
                interfaceC4870a = this.f40041e;
                if (interfaceC4870a != null) {
                }
                interfaceC4660d = this.f40044h;
                if (interfaceC4660d != null) {
                }
                wVar = this.f40045j;
                if (wVar != null) {
                }
                this.i.s0(new U0(this.f40049n));
                this.i.f2(this.f40048m);
                k9 = this.i;
                if (k9 != null) {
                }
            }
            f02.f40036n = currentTimeMillis;
            K k12 = this.i;
            if (k12 == null) {
                throw null;
            }
            AtomicLong atomicLong = this.f40050o;
            if (atomicLong.get() != 0) {
                k12.A0(atomicLong.get());
            }
            e1 e1Var = this.f40038b;
            Context context3 = lVar.getContext();
            e1Var.getClass();
            k12.d3(e1.a(context3, f02));
        } catch (RemoteException e10) {
            v2.i.i("#007 Could not call remote method.", e10);
        }
    }

    public final void c(InterfaceC4870a interfaceC4870a) {
        try {
            this.f40041e = interfaceC4870a;
            K k9 = this.i;
            if (k9 != null) {
                k9.B3(interfaceC4870a != null ? new BinderC4902q(interfaceC4870a) : null);
            }
        } catch (RemoteException e9) {
            v2.i.i("#007 Could not call remote method.", e9);
        }
    }

    public final void d(k2.h... hVarArr) {
        k2.l lVar = this.f40047l;
        this.f40043g = hVarArr;
        try {
            K k9 = this.i;
            if (k9 != null) {
                k9.U1(a(lVar.getContext(), this.f40043g));
            }
        } catch (RemoteException e9) {
            v2.i.i("#007 Could not call remote method.", e9);
        }
        lVar.requestLayout();
    }

    public final void e(InterfaceC4660d interfaceC4660d) {
        try {
            this.f40044h = interfaceC4660d;
            K k9 = this.i;
            if (k9 != null) {
                k9.x1(interfaceC4660d != null ? new BinderC4143x8(interfaceC4660d) : null);
            }
        } catch (RemoteException e9) {
            v2.i.i("#007 Could not call remote method.", e9);
        }
    }
}
