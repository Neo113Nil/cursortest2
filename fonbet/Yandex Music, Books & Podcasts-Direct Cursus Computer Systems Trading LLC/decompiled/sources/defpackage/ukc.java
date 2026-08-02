package defpackage;

import com.yandex.passport.api.exception.t;
import com.yandex.passport.api.impl.b;
import com.yandex.passport.api.n;
import com.yandex.passport.common.core.f;
import com.yandex.passport.internal.entities.k;
import com.yandex.passport.internal.filter.a;
import com.yandex.passport.internal.filter.g;
import com.yandex.passport.internal.flags.i;
import com.yandex.passport.internal.flags.o;
import com.yandex.passport.internal.network.d;
import com.yandex.passport.internal.network.h;
import com.yandex.passport.internal.properties.l;
import com.yandex.passport.internal.ui.bouncer.model.c0;
import com.yandex.passport.internal.ui.bouncer.model.f1;
import com.yandex.passport.internal.ui.bouncer.model.g0;
import com.yandex.passport.internal.ui.bouncer.model.i0;
import com.yandex.passport.internal.ui.bouncer.model.j1;
import com.yandex.passport.internal.ui.bouncer.model.l1;
import com.yandex.passport.internal.ui.bouncer.model.middleware.v1;
import com.yandex.passport.internal.ui.bouncer.model.q;
import com.yandex.passport.internal.ui.bouncer.model.s;
import com.yandex.passport.internal.ui.domik.w;
import com.yandex.passport.sloth.data.m;
import com.yandex.passport.sloth.data.z;
import java.util.EnumSet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ukc extends aur implements pyc {
    public final /* synthetic */ int j = 3;
    public int k;
    public Object l;
    public Object m;
    public Object n;
    public /* synthetic */ Object o;
    public /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ukc(Continuation continuation, kpm kpmVar, wgh wghVar, ime imeVar, rn5 rn5Var) {
        super(3, continuation);
        this.n = kpmVar;
        this.o = wghVar;
        this.p = imeVar;
        this.q = rn5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x007b, code lost:
    
        if (r5 == r4) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(i2l i2lVar, t1f t1fVar, cg6 cg6Var) {
        l2l l2lVar;
        nm6 nm6Var;
        int i;
        mwk mwkVar;
        Object f;
        Object a;
        mwk mwkVar2;
        t1f t1fVar2;
        i2l i2lVar2;
        long j;
        Object b;
        Long l;
        i2l i2lVar3;
        i2l i2lVar4 = i2lVar;
        t1f t1fVar3 = t1fVar;
        if (cg6Var instanceof l2l) {
            l2lVar = (l2l) cg6Var;
            int i2 = l2lVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l2lVar.p = i2 - Integer.MIN_VALUE;
                Object obj = l2lVar.o;
                nm6Var = nm6.a;
                i = l2lVar.p;
                if (i != 0) {
                    qgg.h0(obj);
                    mwkVar = i2lVar4.b;
                    uol uolVar = (uol) t1fVar3.c;
                    l2lVar.j = i2lVar4;
                    l2lVar.k = t1fVar3;
                    l2lVar.l = mwkVar;
                    l2lVar.p = 1;
                    f = uolVar.f(l2lVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            j = l2lVar.n;
                            Long l2 = l2lVar.m;
                            mwkVar2 = l2lVar.l;
                            i2lVar3 = l2lVar.j;
                            qgg.h0(obj);
                            l = l2;
                            return new nvm(mwkVar2, j, l, (Long) (((Number) obj).longValue() > 0 ? obj : null), i2lVar3.a == v0l.d, i2lVar3.d);
                        }
                        j = l2lVar.n;
                        mwkVar2 = l2lVar.l;
                        t1fVar2 = l2lVar.k;
                        i2lVar2 = l2lVar.j;
                        qgg.h0(obj);
                        if (((Number) obj).longValue() <= 0) {
                            obj = null;
                        }
                        Long l3 = (Long) obj;
                        uol uolVar2 = (uol) t1fVar2.c;
                        l2lVar.j = i2lVar2;
                        l2lVar.k = null;
                        l2lVar.l = mwkVar2;
                        l2lVar.m = l3;
                        l2lVar.n = j;
                        l2lVar.p = 3;
                        b = uolVar2.b(l2lVar);
                        if (b != nm6Var) {
                            l = l3;
                            obj = b;
                            i2lVar3 = i2lVar2;
                            return new nvm(mwkVar2, j, l, (Long) (((Number) obj).longValue() > 0 ? obj : null), i2lVar3.a == v0l.d, i2lVar3.d);
                        }
                        return nm6Var;
                    }
                    mwk mwkVar3 = l2lVar.l;
                    t1fVar3 = l2lVar.k;
                    i2l i2lVar5 = l2lVar.j;
                    qgg.h0(obj);
                    mwkVar = mwkVar3;
                    i2lVar4 = i2lVar5;
                    f = obj;
                }
                long longValue = ((Number) f).longValue();
                uol uolVar3 = (uol) t1fVar3.c;
                l2lVar.j = i2lVar4;
                l2lVar.k = t1fVar3;
                l2lVar.l = mwkVar;
                l2lVar.n = longValue;
                l2lVar.p = 2;
                a = uolVar3.a(l2lVar);
                if (a != nm6Var) {
                    mwkVar2 = mwkVar;
                    obj = a;
                    t1fVar2 = t1fVar3;
                    i2lVar2 = i2lVar4;
                    j = longValue;
                    if (((Number) obj).longValue() <= 0) {
                    }
                    Long l32 = (Long) obj;
                    uol uolVar22 = (uol) t1fVar2.c;
                    l2lVar.j = i2lVar2;
                    l2lVar.k = null;
                    l2lVar.l = mwkVar2;
                    l2lVar.m = l32;
                    l2lVar.n = j;
                    l2lVar.p = 3;
                    b = uolVar22.b(l2lVar);
                    if (b != nm6Var) {
                    }
                }
                return nm6Var;
            }
        }
        l2lVar = new l2l(cg6Var);
        Object obj2 = l2lVar.o;
        nm6Var = nm6.a;
        i = l2lVar.p;
        if (i != 0) {
        }
        long longValue2 = ((Number) f).longValue();
        uol uolVar32 = (uol) t1fVar3.c;
        l2lVar.j = i2lVar4;
        l2lVar.k = t1fVar3;
        l2lVar.l = mwkVar;
        l2lVar.n = longValue2;
        l2lVar.p = 2;
        a = uolVar32.a(l2lVar);
        if (a != nm6Var) {
        }
        return nm6Var;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.j) {
            case 0:
                ukc ukcVar = new ukc((Function1) this.p, (pjc) this.q, (Continuation) obj3);
                ukcVar.l = (mm6) obj;
                ukcVar.o = (rjc) obj2;
                return ukcVar.invokeSuspend(Unit.a);
            case 1:
                ukc ukcVar2 = new ukc((Continuation) obj3, (kpm) this.n, (wgh) this.o, (ime) this.p, (rn5) this.q);
                ukcVar2.m = (rjc) obj;
                ukcVar2.l = obj2;
                return ukcVar2.invokeSuspend(Unit.a);
            case 2:
                ukc ukcVar3 = new ukc((t1f) this.o, (eno) this.p, (u0q) this.q, (Continuation) obj3);
                ukcVar3.n = (rjc) obj;
                ukcVar3.l = (i2l) obj2;
                return ukcVar3.invokeSuspend(Unit.a);
            default:
                ukc ukcVar4 = new ukc((v1) this.q, (Continuation) obj3);
                ukcVar4.o = (i0) obj;
                ukcVar4.p = (l1) obj2;
                return ukcVar4.invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:231:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02ab  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:212:0x0547 -> B:186:0x0482). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        rjc rjcVar;
        xqn xqnVar;
        qln qlnVar;
        wqn wqnVar;
        xqn xqnVar2;
        qln qlnVar2;
        rjc rjcVar2;
        acp acpVar;
        wqn wqnVar2;
        Object obj2;
        pjc pjcVar;
        Object k;
        Object k2;
        rjc rjcVar3;
        Object collect;
        l lVar;
        com.yandex.passport.internal.l lVar2;
        com.yandex.passport.internal.ui.bouncer.model.l lVar3;
        i0 i0Var;
        nm6 nm6Var;
        boolean z;
        Object b;
        v1 v1Var;
        s sVar;
        g gVar;
        a aVar;
        boolean z2;
        switch (this.j) {
            case 0:
                nm6 nm6Var2 = nm6.a;
                int i = this.k;
                Continuation continuation = null;
                if (i == 0) {
                    qgg.h0(obj);
                    mm6 mm6Var = (mm6) this.l;
                    rjc rjcVar4 = (rjc) this.o;
                    ktm M = y7g.M(mm6Var, 0, new tkc((pjc) this.q, continuation, 0), 3);
                    rjcVar = rjcVar4;
                    xqnVar = new xqn();
                    qlnVar = M;
                    obj2 = xqnVar.a;
                    if (obj2 == ugj.c) {
                    }
                } else if (i == 1) {
                    wqnVar2 = (wqn) this.n;
                    xqnVar = (xqn) this.m;
                    qlnVar = (qln) this.o;
                    rjcVar = (rjc) this.l;
                    qgg.h0(obj);
                    xqnVar.a = null;
                    wqnVar = wqnVar2;
                    xqnVar2 = xqnVar;
                    qlnVar2 = qlnVar;
                    rjcVar2 = rjcVar;
                    acpVar = new acp(getContext());
                    if (xqnVar2.a != null) {
                    }
                    acpVar.g(qlnVar2.i(), new d57(xqnVar2, rjcVar2, continuation, 11));
                    this.l = rjcVar2;
                    this.o = qlnVar2;
                    this.m = xqnVar2;
                    this.n = null;
                    this.k = 2;
                    if (acpVar.d(this) == nm6Var2) {
                    }
                    rjcVar = rjcVar2;
                    qlnVar = qlnVar2;
                    xqnVar = xqnVar2;
                    obj2 = xqnVar.a;
                    if (obj2 == ugj.c) {
                    }
                } else {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xqnVar2 = (xqn) this.m;
                    qlnVar2 = (qln) this.o;
                    rjcVar2 = (rjc) this.l;
                    qgg.h0(obj);
                    rjcVar = rjcVar2;
                    qlnVar = qlnVar2;
                    xqnVar = xqnVar2;
                    obj2 = xqnVar.a;
                    if (obj2 == ugj.c) {
                        wqnVar = new wqn();
                        if (obj2 != null) {
                            Function1 function1 = (Function1) this.p;
                            js3 js3Var = ugj.a;
                            if (obj2 == js3Var) {
                                obj2 = null;
                            }
                            long longValue = ((Number) function1.invoke(obj2)).longValue();
                            wqnVar.a = longValue;
                            if (longValue < 0) {
                                xq0.x("Debounce timeout should not be negative");
                                return null;
                            }
                            if (longValue == 0) {
                                Object obj3 = xqnVar.a;
                                if (obj3 == js3Var) {
                                    obj3 = null;
                                }
                                this.l = rjcVar;
                                this.o = qlnVar;
                                this.m = xqnVar;
                                this.n = wqnVar;
                                this.k = 1;
                                if (rjcVar.emit(obj3, this) == nm6Var2) {
                                    return nm6Var2;
                                }
                                wqnVar2 = wqnVar;
                                xqnVar.a = null;
                                wqnVar = wqnVar2;
                            }
                        }
                        xqnVar2 = xqnVar;
                        qlnVar2 = qlnVar;
                        rjcVar2 = rjcVar;
                        acpVar = new acp(getContext());
                        if (xqnVar2.a != null) {
                            rzf.K(acpVar, wqnVar.a, new w90(rjcVar2, xqnVar2, null, 5));
                        }
                        acpVar.g(qlnVar2.i(), new d57(xqnVar2, rjcVar2, continuation, 11));
                        this.l = rjcVar2;
                        this.o = qlnVar2;
                        this.m = xqnVar2;
                        this.n = null;
                        this.k = 2;
                        if (acpVar.d(this) == nm6Var2) {
                            return nm6Var2;
                        }
                        rjcVar = rjcVar2;
                        qlnVar = qlnVar2;
                        xqnVar = xqnVar2;
                        obj2 = xqnVar.a;
                        if (obj2 == ugj.c) {
                            return Unit.a;
                        }
                    }
                }
            case 1:
                kpm kpmVar = (kpm) this.n;
                nm6 nm6Var3 = nm6.a;
                int i2 = this.k;
                if (i2 != 0) {
                    if (i2 == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                rjc rjcVar5 = (rjc) this.m;
                ugh ughVar = (ugh) this.l;
                if (ughVar instanceof sgh) {
                    kpmVar.K();
                    pjcVar = new fs(15, new qgh(((sgh) ughVar).a));
                } else if (Intrinsics.d(ughVar, tgh.a) || Intrinsics.d(ughVar, tgh.b)) {
                    kpmVar.K();
                    pjcVar = wgh.g;
                } else {
                    if (!Intrinsics.d(ughVar, tgh.c)) {
                        b6e.s();
                        return null;
                    }
                    pjcVar = zsd.C(zsd.M0(((wgh) this.o).c.c, new vgh(null, kpmVar, (ime) this.p, (rn5) this.q)), 0);
                }
                this.m = null;
                this.l = null;
                this.k = 1;
                if (zsd.e0(rjcVar5, pjcVar, this) == nm6Var3) {
                    return nm6Var3;
                }
                return Unit.a;
            case 2:
                pjc pjcVar2 = (eno) this.p;
                t1f t1fVar = (t1f) this.o;
                rjc rjcVar6 = (rjc) this.n;
                i2l i2lVar = (i2l) this.l;
                nm6 nm6Var4 = nm6.a;
                switch (this.k) {
                    case 0:
                        qgg.h0(obj);
                        if (i2lVar.c) {
                            return Unit.a;
                        }
                        if (((Boolean) ((p9w) ((mka) t1fVar.d).a).invoke()).booleanValue()) {
                            this.n = rjcVar6;
                            this.l = i2lVar;
                            this.m = rjcVar6;
                            this.k = 1;
                            k2 = k(i2lVar, t1fVar, this);
                            if (k2 == nm6Var4) {
                                return nm6Var4;
                            }
                            rjcVar3 = rjcVar6;
                            this.n = rjcVar6;
                            this.l = i2lVar;
                            this.m = null;
                            this.k = 2;
                            if (rjcVar3.emit(k2, this) == nm6Var4) {
                                return nm6Var4;
                            }
                            if (!i2lVar.d) {
                                pjcVar2 = (u0q) this.q;
                            }
                            this.n = null;
                            this.l = null;
                            this.m = null;
                            this.k = 3;
                            zsd.f0(rjcVar6);
                            collect = pjcVar2.collect(new n2l(rjcVar6, i2lVar, t1fVar, 0), this);
                            if (collect != nm6Var4) {
                                collect = Unit.a;
                            }
                            if (collect != nm6Var4) {
                                collect = Unit.a;
                            }
                            if (collect == nm6Var4) {
                                return nm6Var4;
                            }
                            return Unit.a;
                        }
                        int ordinal = i2lVar.a.ordinal();
                        if (ordinal == 0 || ordinal == 1) {
                            this.n = null;
                            this.l = null;
                            this.m = rjcVar6;
                            this.k = 4;
                            k = k(i2lVar, t1fVar, this);
                            if (k == nm6Var4) {
                                return nm6Var4;
                            }
                            this.n = null;
                            this.l = null;
                            this.m = null;
                            this.k = 5;
                            if (rjcVar6.emit(k, this) == nm6Var4) {
                                return nm6Var4;
                            }
                            return Unit.a;
                        }
                        if (ordinal != 2 && ordinal != 3) {
                            b6e.s();
                            return null;
                        }
                        this.n = null;
                        this.l = null;
                        this.k = 6;
                        zsd.f0(rjcVar6);
                        Object collect2 = pjcVar2.collect(new n2l(rjcVar6, i2lVar, t1fVar, 1), this);
                        if (collect2 != nm6Var4) {
                            collect2 = Unit.a;
                        }
                        if (collect2 != nm6Var4) {
                            collect2 = Unit.a;
                        }
                        if (collect2 == nm6Var4) {
                            return nm6Var4;
                        }
                        return Unit.a;
                    case 1:
                        rjc rjcVar7 = (rjc) this.m;
                        qgg.h0(obj);
                        rjcVar3 = rjcVar7;
                        k2 = obj;
                        this.n = rjcVar6;
                        this.l = i2lVar;
                        this.m = null;
                        this.k = 2;
                        if (rjcVar3.emit(k2, this) == nm6Var4) {
                        }
                        if (!i2lVar.d) {
                        }
                        this.n = null;
                        this.l = null;
                        this.m = null;
                        this.k = 3;
                        zsd.f0(rjcVar6);
                        collect = pjcVar2.collect(new n2l(rjcVar6, i2lVar, t1fVar, 0), this);
                        if (collect != nm6Var4) {
                        }
                        if (collect != nm6Var4) {
                        }
                        if (collect == nm6Var4) {
                        }
                        return Unit.a;
                    case 2:
                        qgg.h0(obj);
                        if (!i2lVar.d) {
                        }
                        this.n = null;
                        this.l = null;
                        this.m = null;
                        this.k = 3;
                        zsd.f0(rjcVar6);
                        collect = pjcVar2.collect(new n2l(rjcVar6, i2lVar, t1fVar, 0), this);
                        if (collect != nm6Var4) {
                        }
                        if (collect != nm6Var4) {
                        }
                        if (collect == nm6Var4) {
                        }
                        return Unit.a;
                    case 3:
                        qgg.h0(obj);
                        return Unit.a;
                    case 4:
                        rjcVar6 = (rjc) this.m;
                        qgg.h0(obj);
                        k = obj;
                        this.n = null;
                        this.l = null;
                        this.m = null;
                        this.k = 5;
                        if (rjcVar6.emit(k, this) == nm6Var4) {
                        }
                        return Unit.a;
                    case 5:
                    case 6:
                        qgg.h0(obj);
                        return Unit.a;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            default:
                com.yandex.passport.internal.ui.bouncer.model.l lVar4 = com.yandex.passport.internal.ui.bouncer.model.l.a;
                i0 i0Var2 = (i0) this.o;
                l1 l1Var = (l1) this.p;
                nm6 nm6Var5 = nm6.a;
                int i3 = this.k;
                if (i3 != 0) {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        sVar = null;
                        return sVar;
                    }
                    com.yandex.passport.internal.l lVar5 = (com.yandex.passport.internal.l) this.l;
                    lVar = (l) this.n;
                    v1Var = (v1) this.m;
                    qgg.h0(obj);
                    lVar3 = lVar4;
                    lVar2 = lVar5;
                    z = true;
                    b = obj;
                    gVar = (g) b;
                    v1Var.getClass();
                    aVar = a.a;
                    if (!Intrinsics.d(gVar, aVar) && lVar2.f() == n.CHILDISH) {
                        f fVar = lVar2.b;
                        l lVar6 = l1Var.c;
                        if (lVar6 == null) {
                            xq0.q("loginProperties is missing");
                            return null;
                        }
                        b bVar = lVar6.d.a;
                        d dVar = v1Var.b;
                        com.yandex.passport.common.core.b L = com.yandex.plus.core.network.api.utils.a.L(bVar);
                        dVar.getClass();
                        return new g0(new m(new z(fVar, com.yandex.plus.core.network.api.utils.a.S(lVar6.e), ((h) dVar).m(L, null)), com.yandex.plus.core.network.api.utils.a.L(bVar), com.yandex.plus.core.network.api.utils.a.J(lVar6.u, ((Boolean) v1Var.a.b(o.y)).booleanValue()), 4));
                    }
                    if (!Intrinsics.d(gVar, com.yandex.passport.internal.filter.b.a) && !Intrinsics.d(gVar, aVar)) {
                        if (!Intrinsics.d(gVar, com.yandex.passport.internal.filter.d.a)) {
                            return new s(new f1(new t("partition.not_matched")));
                        }
                        if (Intrinsics.d(gVar, com.yandex.passport.internal.filter.f.a)) {
                            if (lVar.v) {
                                com.yandex.passport.internal.l a = v1Var.c.a();
                                if (!Intrinsics.d(a != null ? a.b : null, lVar2.b)) {
                                    z2 = z;
                                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "should set as current " + z2, 8);
                                    }
                                    return !z2 ? new com.yandex.passport.internal.ui.bouncer.model.z(i0Var2.a) : new s(i0Var2.a);
                                }
                            }
                            z2 = false;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            }
                            if (!z2) {
                            }
                        }
                    }
                    return lVar3;
                }
                qgg.h0(obj);
                lVar = l1Var.c;
                if (lVar == null) {
                    return new com.yandex.passport.internal.ui.bouncer.model.o("VerifyResultActor", "No login properties in current state", null);
                }
                k kVar = lVar.d;
                v1 v1Var2 = (v1) this.q;
                j1 j1Var = i0Var2.a;
                lVar2 = j1Var.a;
                EnumSet enumSet = j1Var.f;
                if (j1Var.f.contains(w.e)) {
                    sVar = new s(j1Var);
                    return sVar;
                }
                i iVar = v1Var2.a;
                boolean contains = enumSet.contains(w.b);
                boolean z3 = lVar2.e.h == 6;
                boolean a2 = kVar.a(n.SOCIAL);
                boolean z4 = !a2;
                lVar3 = lVar4;
                boolean z5 = !contains && z3 && (!a2 || ((Boolean) iVar.b(o.g)).booleanValue());
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    nm6Var = nm6Var5;
                    i0Var = i0Var2;
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, v3w.g(eta.j("isSocialRegistrationRequired: ", z5, "; shouldSkipSocialRegistration = ", contains, ", isSocial = "), z3, ", isSocialExcluded = ", z4, ", isExperimentForAllowedSocialEnabled = $ isExperimentForAllowedSocialEnabled"), 8);
                } else {
                    i0Var = i0Var2;
                    nm6Var = nm6Var5;
                }
                if (!z5) {
                    boolean contains2 = enumSet.contains(w.c);
                    boolean z6 = lVar2.e.h == 5;
                    boolean a3 = kVar.a(n.LITE);
                    boolean z7 = !a3;
                    boolean z8 = (contains2 || !z6 || a3) ? false : true;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.b bVar2 = com.yandex.passport.common.logger.b.b;
                        StringBuilder j = eta.j("isLiteFinishRegistrationRequired: ", z8, "; shouldSkipLiteRegistration = ", contains2, ", isLite = ");
                        j.append(z6);
                        j.append(", isLiteExcluded = ");
                        j.append(z7);
                        com.yandex.passport.common.logger.a.c(bVar2, null, j.toString(), 8);
                    }
                    if (!z8) {
                        boolean z9 = enumSet.contains(w.d) || lVar2.m() == com.yandex.passport.api.o.c;
                        boolean z10 = !z9 && com.yandex.plus.core.locale.b.p(lVar2.m()) && ((Boolean) iVar.b(o.x)).booleanValue();
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.b bVar3 = com.yandex.passport.common.logger.b.b;
                            StringBuilder j2 = eta.j("isUpgradeByStatusRequired: ", z10, "; shouldSkipForceRegistration = ", z9, ", shouldAccountBeUpgraded = ");
                            j2.append(com.yandex.plus.core.locale.b.p(lVar2.m()));
                            j2.append(", upgradeStatus = ");
                            j2.append(lVar2.m());
                            com.yandex.passport.common.logger.a.c(bVar3, null, j2.toString(), 8);
                        }
                        if (!z10) {
                            if (!enumSet.contains(w.a) && lVar.q != null && l1Var.f == null && j1Var.e == null) {
                                return new c0(l1Var.c, null, null, null, false, false, null, null, 254);
                            }
                            com.yandex.passport.internal.filter.l lVar7 = v1Var2.d;
                            i0Var2 = i0Var;
                            this.o = i0Var2;
                            this.p = l1Var;
                            this.m = v1Var2;
                            this.n = lVar;
                            this.l = lVar2;
                            z = true;
                            this.k = 1;
                            b = lVar7.b(lVar2, kVar, this);
                            nm6 nm6Var6 = nm6Var;
                            if (b == nm6Var6) {
                                return nm6Var6;
                            }
                            v1Var = v1Var2;
                            gVar = (g) b;
                            v1Var.getClass();
                            aVar = a.a;
                            if (!Intrinsics.d(gVar, aVar)) {
                            }
                            if (!Intrinsics.d(gVar, com.yandex.passport.internal.filter.b.a)) {
                                if (!Intrinsics.d(gVar, com.yandex.passport.internal.filter.d.a)) {
                                }
                            }
                            return lVar3;
                        }
                    }
                }
                return new q(j1Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ukc(v1 v1Var, Continuation continuation) {
        super(3, continuation);
        this.q = v1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ukc(t1f t1fVar, eno enoVar, u0q u0qVar, Continuation continuation) {
        super(3, continuation);
        this.o = t1fVar;
        this.p = enoVar;
        this.q = u0qVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ukc(Function1 function1, pjc pjcVar, Continuation continuation) {
        super(3, continuation);
        this.p = function1;
        this.q = pjcVar;
    }
}
