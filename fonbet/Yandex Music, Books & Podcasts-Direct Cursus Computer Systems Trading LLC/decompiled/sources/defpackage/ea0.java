package defpackage;

import android.os.Bundle;
import com.yandex.plus.core.network.interceptor.a;
import com.yandex.plus.core.network.interceptor.e;
import com.yandex.plus.home.internal.di.s;
import com.yandex.plus.home.payment.google.d;
import com.yandex.plus.home.t;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ea0 extends aur implements pyc {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Object l;
    public /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ea0(ga0 ga0Var, Function2 function2, Continuation continuation) {
        super(3, continuation);
        this.j = 0;
        this.m = ga0Var;
        this.l = (aur) function2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [aur, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r0v4, types: [aur, kotlin.jvm.functions.Function2] */
    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.j) {
            case 0:
                return new ea0((ga0) this.m, (Function2) this.l, (Continuation) obj3).invokeSuspend(Unit.a);
            case 1:
                return new ea0((ga0) this.m, (aur) this.l, (Continuation) obj3, (byte) 0).invokeSuspend(Unit.a);
            case 2:
                ea0 ea0Var = new ea0(3, (Continuation) obj3);
                ea0Var.m = (vgi) obj;
                ea0Var.l = (vgi) obj2;
                return ea0Var.invokeSuspend(Unit.a);
            case 3:
                ea0 ea0Var2 = new ea0((Bundle) this.l, (Continuation) obj3, 3);
                ea0Var2.m = (aw0) obj2;
                return ea0Var2.invokeSuspend(Unit.a);
            case 4:
                ea0 ea0Var3 = new ea0((String) this.l, (Continuation) obj3, 4);
                ea0Var3.m = (aw0) obj2;
                return ea0Var3.invokeSuspend(Unit.a);
            case 5:
                return new ea0((a) this.m, (e) this.l, (Continuation) obj3).invokeSuspend(Unit.a);
            default:
                ea0 ea0Var4 = new ea0((t) this.l, (Continuation) obj3, 6);
                ea0Var4.m = (com.yandex.plus.home.api.a) obj2;
                return ea0Var4.invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [aur, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r1v5, types: [aur, kotlin.jvm.functions.Function2] */
    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    fa0 fa0Var = ((ga0) this.m).b;
                    ?? r1 = (aur) this.l;
                    this.k = 1;
                    if (r1.invoke(fa0Var, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    fa0 fa0Var2 = ((ga0) this.m).b;
                    ?? r12 = (aur) this.l;
                    this.k = 1;
                    if (r12.invoke(fa0Var2, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 != 0) {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vgi vgiVar = (vgi) this.m;
                    qgg.h0(obj);
                    return vgiVar;
                }
                qgg.h0(obj);
                vgi vgiVar2 = (vgi) this.m;
                vgi vgiVar3 = (vgi) this.l;
                this.m = vgiVar3;
                this.k = 1;
                ((rar) vgiVar2.b.d).g(null);
                return Unit.a == nm6Var3 ? nm6Var3 : vgiVar3;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    aw0 aw0Var = (aw0) this.m;
                    Bundle bundle = (Bundle) this.l;
                    this.k = 1;
                    aw0Var.getClass();
                    Object e = aw0Var.e(new tv0(bundle), this);
                    if (e != nm6Var4) {
                        e = Unit.a;
                    }
                    if (e == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i4 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 4:
                nm6 nm6Var5 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    aw0 aw0Var2 = (aw0) this.m;
                    String str = (String) this.l;
                    this.k = 1;
                    aw0Var2.getClass();
                    Object e2 = aw0Var2.e(new sv0(str), this);
                    if (e2 != nm6Var5) {
                        e2 = Unit.a;
                    }
                    if (e2 == nm6Var5) {
                        return nm6Var5;
                    }
                } else {
                    if (i5 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i6 = this.k;
                if (i6 != 0) {
                    if (i6 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                a aVar = (a) this.m;
                e eVar = (e) this.l;
                this.k = 1;
                Object a = aVar.a(eVar, this);
                return a == nm6Var6 ? nm6Var6 : a;
            default:
                com.yandex.plus.home.api.a aVar2 = (com.yandex.plus.home.api.a) this.m;
                nm6 nm6Var7 = nm6.a;
                int i7 = this.k;
                if (i7 != 0) {
                    if (i7 == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                int ordinal = aVar2.ordinal();
                if (ordinal == 0) {
                    s.a(true);
                } else if (ordinal == 1) {
                    d dVar = (d) ((t) this.l).f.z.getValue();
                    this.m = null;
                    this.k = 1;
                    Object b = dVar.c.b(new com.yandex.plus.home.payment.google.a(dVar, null, 1), this);
                    if (b != nm6Var7) {
                        b = Unit.a;
                    }
                    if (b == nm6Var7) {
                        return nm6Var7;
                    }
                } else if (ordinal != 2) {
                    if (ordinal != 3) {
                        b6e.s();
                        return null;
                    }
                    s.a(false);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ea0(int i, Continuation continuation) {
        super(i, continuation);
        this.j = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ea0(ga0 ga0Var, Function2 function2, Continuation continuation, byte b) {
        super(3, continuation);
        this.j = 1;
        this.m = ga0Var;
        this.l = (aur) function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea0(a aVar, e eVar, Continuation continuation) {
        super(3, continuation);
        this.j = 5;
        this.m = aVar;
        this.l = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ea0(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.j = i;
        this.l = obj;
    }
}
