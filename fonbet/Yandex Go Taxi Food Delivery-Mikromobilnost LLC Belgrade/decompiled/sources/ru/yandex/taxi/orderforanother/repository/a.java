package ru.yandex.taxi.orderforanother.repository;

import com.yandex.go.address.models.Address;
import com.yandex.go.route.interactor.c;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.avx;
import defpackage.bgb0;
import defpackage.bvf0;
import defpackage.evu0;
import defpackage.jl40;
import defpackage.jst;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.ov70;
import defpackage.pex0;
import defpackage.pft0;
import defpackage.po21;
import defpackage.pv70;
import defpackage.qoi0;
import defpackage.tv70;
import defpackage.wiq0;
import defpackage.xby;
import defpackage.xv70;
import defpackage.ydf;
import defpackage.yyq0;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.orderforanother.model.FormedFrom;
import ru.yandex.taxi.preorder.source.userposition.e;

/* loaded from: classes6.dex */
public final class a implements pft0 {
    public final wiq0 a;
    public final tv70 b;
    public final c c;
    public final po21 d;
    public final xv70 e;
    public final r0 f;
    public boolean g;
    public boolean h;
    public FormedFrom i;
    public zzs j;
    public mo21 k;

    public a(yyq0 yyq0Var, wiq0 wiq0Var, tv70 tv70Var, c cVar, po21 po21Var) {
        this.a = wiq0Var;
        this.b = tv70Var;
        this.c = cVar;
        this.d = po21Var;
        Object a = yyq0Var.a("OrderForAnotherRepository", new ydf(8));
        if (!(a instanceof xv70)) {
            xby.t(jst.e, "SESSION_STORAGE:FEATURE_DATA_TYPE_INCONSISTENCY", null, "Feature storage with id=OrderForAnotherRepository is expected to has type " + qoi0.e(xv70.class) + " but get " + (a != null ? a.getClass() : null), 6);
            a = new xv70();
        }
        this.e = (xv70) a;
        this.f = bvf0.c(null);
        this.i = FormedFrom.UNKNOWN;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
    
        if (g() == null) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        OrderForAnotherRepositoryImpl$canShowOrderForAnotherDialog$1 orderForAnotherRepositoryImpl$canShowOrderForAnotherDialog$1;
        int i;
        if (continuationImpl instanceof OrderForAnotherRepositoryImpl$canShowOrderForAnotherDialog$1) {
            orderForAnotherRepositoryImpl$canShowOrderForAnotherDialog$1 = (OrderForAnotherRepositoryImpl$canShowOrderForAnotherDialog$1) continuationImpl;
            int i2 = orderForAnotherRepositoryImpl$canShowOrderForAnotherDialog$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderForAnotherRepositoryImpl$canShowOrderForAnotherDialog$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderForAnotherRepositoryImpl$canShowOrderForAnotherDialog$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderForAnotherRepositoryImpl$canShowOrderForAnotherDialog$1.label;
                boolean z = true;
                if (i != 0) {
                    b.b(obj);
                    orderForAnotherRepositoryImpl$canShowOrderForAnotherDialog$1.label = 1;
                    if (j(orderForAnotherRepositoryImpl$canShowOrderForAnotherDialog$1) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                if (this.e.a || this.h) {
                    return Boolean.FALSE;
                }
                pex0 m = ((k) this.a).m();
                boolean z2 = (m == null || m.A) ? false : true;
                mo21 mo21Var = this.k;
                zzs a = mo21Var != null ? mo21Var.a() : null;
                zzs zzsVar = this.j;
                boolean z3 = this.g;
                if (zzsVar != null && a != null && z3) {
                    if (ru.yandex.taxi.map.utils.a.j(a, zzsVar) > ((avx) this.b).i + a.c) {
                        if (z2) {
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            }
        }
        orderForAnotherRepositoryImpl$canShowOrderForAnotherDialog$1 = new OrderForAnotherRepositoryImpl$canShowOrderForAnotherDialog$1(this, continuationImpl);
        Object obj3 = orderForAnotherRepositoryImpl$canShowOrderForAnotherDialog$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderForAnotherRepositoryImpl$canShowOrderForAnotherDialog$1.label;
        boolean z4 = true;
        if (i != 0) {
        }
        if (this.e.a) {
        }
        return Boolean.FALSE;
    }

    public final void f() {
        this.i = FormedFrom.UNKNOWN;
        this.f.l(null);
    }

    public final pv70 g() {
        return (pv70) this.f.getValue();
    }

    public final boolean h(pex0 pex0Var) {
        return pex0Var.A && g() != null;
    }

    public final void i(FormedFrom formedFrom) {
        this.i = formedFrom;
        r0 r0Var = this.f;
        pv70 pv70Var = (pv70) r0Var.getValue();
        if (pv70Var != null) {
            ov70 ov70Var = pv70.Companion;
            String d = pv70Var.d();
            String c = pv70Var.c();
            ov70Var.getClass();
            r0Var.l(new pv70(bgb0.e(d), c, formedFrom));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:19|20))(6:21|(1:23)(1:33)|24|(1:29)|30|(1:32))|12|(1:14)|16|17))|37|6|7|(0)(0)|12|(0)|16|17|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0088, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
    
        defpackage.jst.e.getClass();
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007c A[Catch: all -> 0x007f, CancellationException -> 0x0087, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0087, all -> 0x007f, blocks: (B:11:0x0028, B:12:0x0072, B:14:0x007c, B:30:0x0063), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(ContinuationImpl continuationImpl) {
        OrderForAnotherRepositoryImpl$updateLocationValuesIfNeeded$1 orderForAnotherRepositoryImpl$updateLocationValuesIfNeeded$1;
        int i;
        mo21 mo21Var;
        if (continuationImpl instanceof OrderForAnotherRepositoryImpl$updateLocationValuesIfNeeded$1) {
            orderForAnotherRepositoryImpl$updateLocationValuesIfNeeded$1 = (OrderForAnotherRepositoryImpl$updateLocationValuesIfNeeded$1) continuationImpl;
            int i2 = orderForAnotherRepositoryImpl$updateLocationValuesIfNeeded$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderForAnotherRepositoryImpl$updateLocationValuesIfNeeded$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderForAnotherRepositoryImpl$updateLocationValuesIfNeeded$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderForAnotherRepositoryImpl$updateLocationValuesIfNeeded$1.label;
                if (i != 0) {
                    b.b(obj);
                    Address g = this.c.g();
                    if (!jl40.l(g != null ? g.B() : null, this.j) && g != null && !jl40.l(g.B(), this.j)) {
                        this.g = true;
                        this.j = g.B();
                    }
                    po21 po21Var = this.d;
                    orderForAnotherRepositoryImpl$updateLocationValuesIfNeeded$1.L$0 = null;
                    orderForAnotherRepositoryImpl$updateLocationValuesIfNeeded$1.label = 1;
                    obj = ((e) po21Var).f(orderForAnotherRepositoryImpl$updateLocationValuesIfNeeded$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                mo21Var = (mo21) obj;
                if (!jl40.l(mo21Var, this.k)) {
                    this.k = mo21Var;
                }
                return zy11.a;
            }
        }
        orderForAnotherRepositoryImpl$updateLocationValuesIfNeeded$1 = new OrderForAnotherRepositoryImpl$updateLocationValuesIfNeeded$1(this, continuationImpl);
        Object obj2 = orderForAnotherRepositoryImpl$updateLocationValuesIfNeeded$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderForAnotherRepositoryImpl$updateLocationValuesIfNeeded$1.label;
        if (i != 0) {
        }
        mo21Var = (mo21) obj2;
        if (!jl40.l(mo21Var, this.k)) {
        }
        return zy11.a;
    }

    public final void k(String str, String str2) {
        ov70 ov70Var = pv70.Companion;
        if (evu0.J(str)) {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        FormedFrom formedFrom = this.i;
        ov70Var.getClass();
        this.f.l(new pv70(bgb0.e(str), str2, formedFrom));
    }
}
