package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class j5q extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ n5q l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j5q(n5q n5qVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = n5qVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new j5q(this.l, continuation, 0);
            case 1:
                return new j5q(this.l, continuation, 1);
            case 2:
                return new j5q(this.l, continuation, 2);
            case 3:
                return new j5q(this.l, continuation, 3);
            case 4:
                return new j5q(this.l, continuation, 4);
            case 5:
                return new j5q(this.l, continuation, 5);
            case 6:
                return new j5q(this.l, continuation, 6);
            case 7:
                return new j5q(this.l, continuation, 7);
            case 8:
                return new j5q(this.l, continuation, 8);
            case 9:
                return new j5q(this.l, continuation, 9);
            case 10:
                return new j5q(this.l, continuation, 10);
            default:
                return new j5q(this.l, continuation, 11);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((j5q) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        long longValue;
        switch (this.j) {
            case 0:
                Object obj2 = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    a7q a7qVar = this.l.a;
                    this.k = 1;
                    a7qVar.getClass();
                    Object V = x97.V(mal.b(), new x6q(a7qVar, null, 0), this);
                    if (V != obj2) {
                        V = Unit.a;
                    }
                    if (V == obj2) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 1:
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    a7q a7qVar2 = this.l.a;
                    this.k = 1;
                    a7qVar2.getClass();
                    Object V2 = x97.V(mal.b(), new x6q(a7qVar2, null, 1), this);
                    if (V2 == nm6Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                break;
            case 2:
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    a7q a7qVar3 = this.l.a;
                    this.k = 1;
                    a7qVar3.getClass();
                    Object V3 = x97.V(mal.b(), new x6q(a7qVar3, null, 2), this);
                    if (V3 == nm6Var2) {
                        break;
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                break;
            case 3:
                nm6 nm6Var3 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    a7q a7qVar4 = this.l.a;
                    this.k = 1;
                    a7qVar4.getClass();
                    obj = x97.V(mal.b(), new x6q(a7qVar4, null, 3), this);
                    if (obj == nm6Var3) {
                    }
                } else if (i4 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 4:
                nm6 nm6Var4 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    a7q a7qVar5 = this.l.a;
                    this.k = 1;
                    a7qVar5.getClass();
                    obj = x97.V(mal.b(), new x6q(a7qVar5, null, 4), this);
                    if (obj == nm6Var4) {
                    }
                } else if (i5 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 5:
                Object obj3 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    a7q a7qVar6 = this.l.a;
                    this.k = 1;
                    a7qVar6.getClass();
                    Object V4 = x97.V(mal.b(), new x6q(a7qVar6, null, 5), this);
                    if (V4 != obj3) {
                        V4 = Unit.a;
                    }
                    if (V4 == obj3) {
                    }
                } else if (i6 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 6:
                Object obj4 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    a7q a7qVar7 = this.l.a;
                    this.k = 1;
                    a7qVar7.getClass();
                    Object V5 = x97.V(mal.b(), new x6q(a7qVar7, null, 6), this);
                    if (V5 != obj4) {
                        V5 = Unit.a;
                    }
                    if (V5 == obj4) {
                    }
                } else if (i7 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 7:
                Object obj5 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    a7q a7qVar8 = this.l.a;
                    this.k = 1;
                    a7qVar8.getClass();
                    Object V6 = x97.V(mal.b(), new x6q(a7qVar8, null, 7), this);
                    if (V6 != obj5) {
                        V6 = Unit.a;
                    }
                    if (V6 == obj5) {
                    }
                } else if (i8 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 8:
                nm6 nm6Var5 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    n5q n5qVar = this.l;
                    Long l = n5qVar.g;
                    if (l != null) {
                        longValue = l.longValue();
                        break;
                    } else {
                        a7q a7qVar9 = n5qVar.a;
                        this.k = 1;
                        a7qVar9.getClass();
                        obj = x97.V(mal.b(), new x6q(a7qVar9, null, 8), this);
                        if (obj == nm6Var5) {
                        }
                    }
                } else if (i9 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                longValue = ((Number) obj).longValue();
                break;
            case 9:
                nm6 nm6Var6 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (this.l.o(0L, this) == nm6Var6) {
                    }
                } else if (i10 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 10:
                Object obj6 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    n5q n5qVar2 = this.l;
                    n5qVar2.f.getClass();
                    n5qVar2.f = new i5q(null);
                    a7q a7qVar10 = n5qVar2.a;
                    this.k = 1;
                    a7qVar10.getClass();
                    Object V7 = x97.V(mal.b(), new x6q(a7qVar10, null, 10), this);
                    if (V7 != obj6) {
                        V7 = Unit.a;
                    }
                    if (V7 == obj6) {
                    }
                } else if (i11 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                Object obj7 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    a7q a7qVar11 = this.l.a;
                    this.k = 1;
                    a7qVar11.getClass();
                    Object V8 = x97.V(mal.b(), new x6q(a7qVar11, null, 11), this);
                    if (V8 != obj7) {
                        V8 = Unit.a;
                    }
                    if (V8 == obj7) {
                    }
                } else if (i12 != 1) {
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
