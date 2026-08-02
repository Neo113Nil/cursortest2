package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import com.yandex.passport.api.z1;
import defpackage.b6e;
import defpackage.bfu;
import defpackage.c5b;
import defpackage.cg6;
import defpackage.ern;
import defpackage.nm6;
import defpackage.nme;
import defpackage.ot0;
import defpackage.p97;
import defpackage.qgg;
import defpackage.r1w;
import defpackage.v75;
import defpackage.x0q;
import defpackage.x97;
import defpackage.xq0;
import defpackage.y0q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class q0 extends bfu {
    public static final nme r;
    public final com.yandex.passport.internal.core.accounts.e k;
    public final com.yandex.passport.internal.core.accounts.s l;
    public final com.yandex.passport.internal.properties.x m;
    public final com.yandex.passport.internal.flags.i n;
    public final x0q o;
    public com.yandex.passport.internal.properties.u p;
    public final x0q q;

    static {
        p97 p97Var = new p97(1);
        p97Var.a(ern.a(q0.class), new com.yandex.passport.internal.storage.d(8));
        r = p97Var.d();
    }

    public q0(com.yandex.passport.internal.core.accounts.e eVar, com.yandex.passport.internal.core.accounts.s sVar, com.yandex.passport.internal.properties.x xVar, com.yandex.passport.internal.flags.i iVar) {
        eVar.getClass();
        sVar.getClass();
        xVar.getClass();
        iVar.getClass();
        this.k = eVar;
        this.l = sVar;
        this.m = xVar;
        this.n = iVar;
        this.o = y0q.b(0, 0, null, 7);
        this.q = y0q.b(1, 0, null, 6);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:18)(1:(1:12)(2:16|17)))(3:19|20|(14:22|(2:25|23)|26|27|(1:29)(1:68)|(3:31|(4:34|(3:36|37|38)(1:40)|39|32)|41)(1:67)|42|43|(3:45|(1:47)(1:65)|(3:53|54|(2:61|(2:63|64))(2:57|(2:59|60))))|66|54|(0)|61|(0))(2:69|70))|13|14))|75|6|7|(0)(0)|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0042, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0121, code lost:
    
        r1 = new com.yandex.passport.internal.ui.challenge.logout.bottomsheet.k0(r0);
        r4.l = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x012c, code lost:
    
        if (r3.emit(r1, r4) == r5) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r11v5, types: [c5b] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(q0 q0Var, com.yandex.passport.internal.properties.u uVar, cg6 cg6Var) {
        o0 o0Var;
        int i;
        ?? r11;
        boolean z;
        boolean z2;
        x0q x0qVar;
        n0 n0Var;
        com.yandex.passport.common.core.b bVar;
        x0q x0qVar2 = q0Var.o;
        if (cg6Var instanceof o0) {
            o0Var = (o0) cg6Var;
            int i2 = o0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o0Var.l = i2 - Integer.MIN_VALUE;
                Object obj = o0Var.j;
                nm6 nm6Var = nm6.a;
                i = o0Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.d a = q0Var.k.a();
                    z1 z1Var = uVar.a;
                    com.yandex.passport.internal.l e = a.e(com.yandex.plus.pay.ui.core.b.L(z1Var));
                    if (e == null) {
                        throw new com.yandex.passport.api.exception.b(z1Var);
                    }
                    ArrayList g = a.g();
                    ArrayList arrayList = new ArrayList(v75.o(g, 10));
                    Iterator it = g.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((com.yandex.passport.internal.l) it.next()).b);
                    }
                    com.yandex.passport.common.core.f fVar = e.c;
                    if (!((Boolean) q0Var.n.b(com.yandex.passport.internal.flags.o.q0)).booleanValue()) {
                        fVar = null;
                    }
                    if (fVar != null) {
                        ArrayList c = q0Var.l.c(fVar, a);
                        r11 = new ArrayList();
                        Iterator it2 = c.iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            if (arrayList.contains(((com.yandex.passport.internal.entities.n) next).a)) {
                                r11.add(next);
                            }
                        }
                    } else {
                        r11 = c5b.a;
                    }
                    List list = r11;
                    if (!e.n()) {
                        if (!(e.e.h == 7) && (bVar = e.b.a) != com.yandex.passport.common.core.b.d && bVar != com.yandex.passport.common.core.b.f) {
                            z = true;
                            z2 = uVar.d;
                            if (!z2 || z) {
                                x0qVar = q0Var.q;
                                n0Var = new n0(com.yandex.plus.pay.ui.core.b.L(z1Var), e.c, !q0Var.m.x, z, z2, list);
                                o0Var.l = 2;
                                if (x0qVar.emit(n0Var, o0Var) == nm6Var) {
                                    return nm6Var;
                                }
                            } else {
                                l0 l0Var = new l0(uVar, com.yandex.passport.internal.ui.challenge.logout.d.b);
                                o0Var.l = 1;
                                if (x0qVar2.emit(l0Var, o0Var) == nm6Var) {
                                    return nm6Var;
                                }
                            }
                        }
                    }
                    z = false;
                    z2 = uVar.d;
                    if (z2) {
                    }
                    x0qVar = q0Var.q;
                    n0Var = new n0(com.yandex.plus.pay.ui.core.b.L(z1Var), e.c, !q0Var.m.x, z, z2, list);
                    o0Var.l = 2;
                    if (x0qVar.emit(n0Var, o0Var) == nm6Var) {
                    }
                } else if (i == 1 || i == 2) {
                    qgg.h0(obj);
                } else {
                    if (i != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            }
        }
        o0Var = new o0(q0Var, cg6Var);
        Object obj2 = o0Var.j;
        nm6 nm6Var2 = nm6.a;
        i = o0Var.l;
        if (i != 0) {
        }
        return Unit.a;
    }

    public final void G(r0 r0Var) {
        r0Var.getClass();
        int ordinal = r0Var.ordinal();
        Continuation continuation = null;
        x0q x0qVar = this.o;
        if (ordinal == 0 || ordinal == 1) {
            x97.y(ot0.F(this), null, null, new r1w(x0qVar, continuation, 25), 3);
            return;
        }
        if (ordinal == 2) {
            x97.y(ot0.F(this), null, null, new p0(x0qVar, continuation, this, 0), 3);
            return;
        }
        if (ordinal == 3) {
            x97.y(ot0.F(this), null, null, new p0(x0qVar, continuation, this, 1), 3);
        } else if (ordinal == 4) {
            x97.y(ot0.F(this), null, null, new p0(x0qVar, continuation, this, 2), 3);
        } else {
            b6e.s();
        }
    }
}
