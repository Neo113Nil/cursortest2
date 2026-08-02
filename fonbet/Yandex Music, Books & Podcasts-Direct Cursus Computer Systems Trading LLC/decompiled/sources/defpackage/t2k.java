package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class t2k extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ o3k l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t2k(int i, o3k o3kVar, Continuation continuation) {
        super(2, continuation);
        this.j = i;
        this.l = o3kVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new t2k(0, this.l, continuation);
            case 1:
                return new t2k(1, this.l, continuation);
            default:
                return new t2k(2, this.l, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((t2k) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        int i = this.j;
        o3k o3kVar = this.l;
        switch (i) {
            case 0:
                Object obj4 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    float f = r3k.a;
                    if (o3kVar.j() - 1 >= 0) {
                        obj2 = o3k.g(o3kVar, o3kVar.j() - 1, null, this, 6);
                        if (obj2 != obj4) {
                            obj2 = Unit.a;
                        }
                    } else {
                        obj2 = Unit.a;
                    }
                    if (obj2 == obj4) {
                        break;
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 1:
                Object obj5 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    float f2 = r3k.a;
                    if (o3kVar.j() + 1 < o3kVar.n()) {
                        obj3 = o3k.g(o3kVar, o3kVar.j() + 1, null, this, 6);
                        if (obj3 != obj5) {
                            obj3 = Unit.a;
                        }
                    } else {
                        obj3 = Unit.a;
                    }
                    if (obj3 == obj5) {
                        break;
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Object a = o3kVar.a(hqi.a, new db(2, 14, null), this);
                    if (a != nm6Var) {
                        a = Unit.a;
                    }
                    if (a == nm6Var) {
                        break;
                    }
                } else if (i4 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
        }
        return Unit.a;
    }
}
