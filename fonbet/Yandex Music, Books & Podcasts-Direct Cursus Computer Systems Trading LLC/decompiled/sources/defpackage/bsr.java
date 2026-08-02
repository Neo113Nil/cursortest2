package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.e;

/* loaded from: classes5.dex */
public final class bsr {
    public final jyr a;
    public final jyr b;
    public final jyr c;
    public final x0q d;
    public final tf6 e;
    public final AtomicBoolean f;
    public final jyr g;

    public bsr() {
        bdt I = hag.I(fos.class);
        l18 l18Var = l18.b;
        jyr b = l18Var.b(I, true);
        this.a = b;
        this.b = l18Var.b(hag.I(srr.class), true);
        this.c = l18Var.b(hag.I(z66.class), true);
        x0q a = y0q.a(1, 0, oi3.b);
        this.d = a;
        tf6 e = gld.e(e.c(a4g.n(), dm6.b()));
        this.e = e;
        this.f = new AtomicBoolean(false);
        this.g = btf.b(new eyq(17, this));
        ox6.B(new clc(((fos) b.getValue()).b, new urr(0, this, null), 3), e, new ryp(20, this));
        d().a(new g5r(29));
        ssg.a(4, "ChatCenter", "invalidateUnreadCount", null);
        a.a(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(nh4 nh4Var, String str, cg6 cg6Var) {
        vrr vrrVar;
        int i;
        if (cg6Var instanceof vrr) {
            vrrVar = (vrr) cg6Var;
            int i2 = vrrVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vrrVar.n = i2 - Integer.MIN_VALUE;
                Object obj = vrrVar.l;
                Object obj2 = nm6.a;
                i = vrrVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    vrrVar.j = nh4Var;
                    vrrVar.k = str;
                    vrrVar.n = 1;
                    if (e(vrrVar) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = vrrVar.k;
                    nh4Var = vrrVar.j;
                    qgg.h0(obj);
                }
                return d().d(nh4Var, str);
            }
        }
        vrrVar = new vrr(this, cg6Var);
        Object obj3 = vrrVar.l;
        Object obj22 = nm6.a;
        i = vrrVar.n;
        if (i != 0) {
        }
        return d().d(nh4Var, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(qh4 qh4Var, esr esrVar, String str, cg6 cg6Var) {
        wrr wrrVar;
        int i;
        if (cg6Var instanceof wrr) {
            wrrVar = (wrr) cg6Var;
            int i2 = wrrVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wrrVar.o = i2 - Integer.MIN_VALUE;
                Object obj = wrrVar.m;
                Object obj2 = nm6.a;
                i = wrrVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    wrrVar.j = qh4Var;
                    wrrVar.k = esrVar;
                    wrrVar.l = str;
                    wrrVar.o = 1;
                    if (e(wrrVar) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = wrrVar.l;
                    esrVar = wrrVar.k;
                    qh4Var = wrrVar.j;
                    qgg.h0(obj);
                }
                return d().g(qh4Var, esrVar == null ? esrVar.a : null, str);
            }
        }
        wrrVar = new wrr(this, cg6Var);
        Object obj3 = wrrVar.m;
        Object obj22 = nm6.a;
        i = wrrVar.o;
        if (i != 0) {
        }
        return d().g(qh4Var, esrVar == null ? esrVar.a : null, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(cg6 cg6Var) {
        xrr xrrVar;
        int i;
        if (cg6Var instanceof xrr) {
            xrrVar = (xrr) cg6Var;
            int i2 = xrrVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xrrVar.l = i2 - Integer.MIN_VALUE;
                Object obj = xrrVar.j;
                Object obj2 = nm6.a;
                i = xrrVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    xrrVar.l = 1;
                    if (e(xrrVar) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return d().f();
            }
        }
        xrrVar = new xrr(this, cg6Var);
        Object obj3 = xrrVar.j;
        Object obj22 = nm6.a;
        i = xrrVar.l;
        if (i != 0) {
        }
        return d().f();
    }

    public final srr d() {
        return (srr) this.b.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(cg6 cg6Var) {
        yrr yrrVar;
        int i;
        bsr bsrVar;
        mns mnsVar;
        if (cg6Var instanceof yrr) {
            yrrVar = (yrr) cg6Var;
            int i2 = yrrVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yrrVar.m = i2 - Integer.MIN_VALUE;
                Object obj = yrrVar.k;
                nm6 nm6Var = nm6.a;
                i = yrrVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    this.f.compareAndSet(false, true);
                    fos fosVar = (fos) this.a.getValue();
                    yrrVar.j = this;
                    yrrVar.m = 1;
                    obj = fosVar.a(yrrVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    bsrVar = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bsrVar = yrrVar.j;
                    qgg.h0(obj);
                }
                mnsVar = (mns) obj;
                if (mnsVar == null) {
                    bsrVar.d().e(mnsVar);
                } else {
                    bsrVar.d().c();
                }
                return Unit.a;
            }
        }
        yrrVar = new yrr(this, cg6Var);
        Object obj2 = yrrVar.k;
        nm6 nm6Var2 = nm6.a;
        i = yrrVar.m;
        if (i != 0) {
        }
        mnsVar = (mns) obj2;
        if (mnsVar == null) {
        }
        return Unit.a;
    }
}
