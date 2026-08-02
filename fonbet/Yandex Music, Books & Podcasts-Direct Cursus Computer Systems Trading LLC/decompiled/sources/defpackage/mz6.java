package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class mz6 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public q6t k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ ueo p;
    public final /* synthetic */ Function1 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mz6(boolean z, boolean z2, ueo ueoVar, Continuation continuation, Function1 function1, int i) {
        super(2, continuation);
        this.j = i;
        this.n = z;
        this.o = z2;
        this.p = ueoVar;
        this.q = function1;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                mz6 mz6Var = new mz6(this.n, this.o, this.p, continuation, this.q, 0);
                mz6Var.m = obj;
                return mz6Var;
            default:
                mz6 mz6Var2 = new mz6(this.n, this.o, this.p, continuation, this.q, 1);
                mz6Var2.m = obj;
                return mz6Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        r6t r6tVar = (r6t) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((mz6) create(r6tVar, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        q6t q6tVar;
        r6t r6tVar;
        q6t q6tVar2;
        r6t r6tVar2;
        r6t r6tVar3;
        Object obj2;
        q6t q6tVar3;
        r6t r6tVar4;
        q6t q6tVar4;
        r6t r6tVar5;
        r6t r6tVar6;
        Object obj3;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.l;
                Function1 function1 = this.q;
                ueo ueoVar = this.p;
                boolean z = this.o;
                if (i == 0) {
                    qgg.h0(obj);
                    r6t r6tVar7 = (r6t) this.m;
                    if (!this.n) {
                        r6tVar7.getClass();
                        return function1.invoke(((nin) r6tVar7).d());
                    }
                    q6tVar = z ? q6t.a : q6t.b;
                    if (z) {
                        q6t q6tVar5 = q6tVar;
                        r6tVar = r6tVar7;
                        q6tVar2 = q6tVar5;
                        lz6 lz6Var = new lz6((Continuation) null, function1, 0);
                        this.m = r6tVar;
                        this.k = null;
                        this.l = 3;
                        obj = r6tVar.a(q6tVar2, lz6Var, this);
                        if (obj == nm6Var) {
                        }
                        if (z) {
                        }
                    } else {
                        this.m = r6tVar7;
                        this.k = q6tVar;
                        this.l = 1;
                        Boolean c = r6tVar7.c(this);
                        if (c == nm6Var) {
                            return nm6Var;
                        }
                        r6tVar2 = r6tVar7;
                        obj = c;
                    }
                } else if (i == 1) {
                    q6tVar = this.k;
                    r6tVar2 = (r6t) this.m;
                    qgg.h0(obj);
                } else if (i == 2) {
                    q6tVar = this.k;
                    r6tVar3 = (r6t) this.m;
                    qgg.h0(obj);
                    q6tVar2 = q6tVar;
                    r6tVar = r6tVar3;
                    lz6 lz6Var2 = new lz6((Continuation) null, function1, 0);
                    this.m = r6tVar;
                    this.k = null;
                    this.l = 3;
                    obj = r6tVar.a(q6tVar2, lz6Var2, this);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    if (z) {
                    }
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj2 = this.m;
                        qgg.h0(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            return obj2;
                        }
                        iye i2 = ueoVar.i();
                        i2.b.e(i2.f, i2.g);
                        return obj2;
                    }
                    r6tVar = (r6t) this.m;
                    qgg.h0(obj);
                    if (z) {
                        return obj;
                    }
                    this.m = obj;
                    this.l = 4;
                    Boolean c2 = r6tVar.c(this);
                    if (c2 == nm6Var) {
                        return nm6Var;
                    }
                    obj2 = obj;
                    obj = c2;
                    if (!((Boolean) obj).booleanValue()) {
                    }
                }
                if (((Boolean) obj).booleanValue()) {
                    q6tVar2 = q6tVar;
                    r6tVar = r6tVar2;
                    lz6 lz6Var22 = new lz6((Continuation) null, function1, 0);
                    this.m = r6tVar;
                    this.k = null;
                    this.l = 3;
                    obj = r6tVar.a(q6tVar2, lz6Var22, this);
                    if (obj == nm6Var) {
                    }
                    if (z) {
                    }
                } else {
                    iye i3 = ueoVar.i();
                    this.m = r6tVar2;
                    this.k = q6tVar;
                    this.l = 2;
                    Object f = i3.b.f(this);
                    if (f != nm6Var) {
                        f = Unit.a;
                    }
                    if (f == nm6Var) {
                        return nm6Var;
                    }
                    r6tVar3 = r6tVar2;
                    q6tVar2 = q6tVar;
                    r6tVar = r6tVar3;
                    lz6 lz6Var222 = new lz6((Continuation) null, function1, 0);
                    this.m = r6tVar;
                    this.k = null;
                    this.l = 3;
                    obj = r6tVar.a(q6tVar2, lz6Var222, this);
                    if (obj == nm6Var) {
                    }
                    if (z) {
                    }
                }
            default:
                nm6 nm6Var2 = nm6.a;
                int i4 = this.l;
                Function1 function12 = this.q;
                ueo ueoVar2 = this.p;
                boolean z2 = this.o;
                if (i4 == 0) {
                    qgg.h0(obj);
                    r6t r6tVar8 = (r6t) this.m;
                    if (!this.n) {
                        r6tVar8.getClass();
                        return function12.invoke(((nin) r6tVar8).d());
                    }
                    q6tVar3 = z2 ? q6t.a : q6t.b;
                    if (z2) {
                        q6t q6tVar6 = q6tVar3;
                        r6tVar4 = r6tVar8;
                        q6tVar4 = q6tVar6;
                        lz6 lz6Var3 = new lz6((Continuation) null, function12, 1);
                        this.m = r6tVar4;
                        this.k = null;
                        this.l = 3;
                        obj = r6tVar4.a(q6tVar4, lz6Var3, this);
                        if (obj == nm6Var2) {
                        }
                        if (z2) {
                        }
                    } else {
                        this.m = r6tVar8;
                        this.k = q6tVar3;
                        this.l = 1;
                        Boolean c3 = r6tVar8.c(this);
                        if (c3 == nm6Var2) {
                            return nm6Var2;
                        }
                        r6tVar5 = r6tVar8;
                        obj = c3;
                    }
                } else if (i4 == 1) {
                    q6tVar3 = this.k;
                    r6tVar5 = (r6t) this.m;
                    qgg.h0(obj);
                } else if (i4 == 2) {
                    q6tVar3 = this.k;
                    r6tVar6 = (r6t) this.m;
                    qgg.h0(obj);
                    q6tVar4 = q6tVar3;
                    r6tVar4 = r6tVar6;
                    lz6 lz6Var32 = new lz6((Continuation) null, function12, 1);
                    this.m = r6tVar4;
                    this.k = null;
                    this.l = 3;
                    obj = r6tVar4.a(q6tVar4, lz6Var32, this);
                    if (obj == nm6Var2) {
                        return nm6Var2;
                    }
                    if (z2) {
                    }
                } else {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj3 = this.m;
                        qgg.h0(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            return obj3;
                        }
                        iye i5 = ueoVar2.i();
                        i5.b.e(i5.f, i5.g);
                        return obj3;
                    }
                    r6tVar4 = (r6t) this.m;
                    qgg.h0(obj);
                    if (z2) {
                        return obj;
                    }
                    this.m = obj;
                    this.l = 4;
                    Boolean c4 = r6tVar4.c(this);
                    if (c4 == nm6Var2) {
                        return nm6Var2;
                    }
                    obj3 = obj;
                    obj = c4;
                    if (!((Boolean) obj).booleanValue()) {
                    }
                }
                if (((Boolean) obj).booleanValue()) {
                    q6tVar4 = q6tVar3;
                    r6tVar4 = r6tVar5;
                    lz6 lz6Var322 = new lz6((Continuation) null, function12, 1);
                    this.m = r6tVar4;
                    this.k = null;
                    this.l = 3;
                    obj = r6tVar4.a(q6tVar4, lz6Var322, this);
                    if (obj == nm6Var2) {
                    }
                    if (z2) {
                    }
                } else {
                    iye i6 = ueoVar2.i();
                    this.m = r6tVar5;
                    this.k = q6tVar3;
                    this.l = 2;
                    Object f2 = i6.b.f(this);
                    if (f2 != nm6Var2) {
                        f2 = Unit.a;
                    }
                    if (f2 == nm6Var2) {
                        return nm6Var2;
                    }
                    r6tVar6 = r6tVar5;
                    q6tVar4 = q6tVar3;
                    r6tVar4 = r6tVar6;
                    lz6 lz6Var3222 = new lz6((Continuation) null, function12, 1);
                    this.m = r6tVar4;
                    this.k = null;
                    this.l = 3;
                    obj = r6tVar4.a(q6tVar4, lz6Var3222, this);
                    if (obj == nm6Var2) {
                    }
                    if (z2) {
                    }
                }
        }
    }
}
