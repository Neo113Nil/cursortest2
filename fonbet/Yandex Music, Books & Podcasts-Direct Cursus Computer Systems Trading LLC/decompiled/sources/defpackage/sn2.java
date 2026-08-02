package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class sn2 extends aur implements pyc {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ rjc l;
    public /* synthetic */ Object[] m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sn2(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.j = i2;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        rjc rjcVar = (rjc) obj;
        Object[] objArr = (Object[]) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.j) {
            case 0:
                sn2 sn2Var = new sn2(3, 0, continuation);
                sn2Var.l = rjcVar;
                sn2Var.m = objArr;
                return sn2Var.invokeSuspend(Unit.a);
            case 1:
                sn2 sn2Var2 = new sn2(3, 1, continuation);
                sn2Var2.l = rjcVar;
                sn2Var2.m = objArr;
                return sn2Var2.invokeSuspend(Unit.a);
            case 2:
                sn2 sn2Var3 = new sn2(3, 2, continuation);
                sn2Var3.l = rjcVar;
                sn2Var3.m = objArr;
                return sn2Var3.invokeSuspend(Unit.a);
            default:
                sn2 sn2Var4 = new sn2(3, 3, continuation);
                sn2Var4.l = rjcVar;
                sn2Var4.m = objArr;
                return sn2Var4.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        na6 na6Var;
        na6 na6Var2;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    rjc rjcVar = this.l;
                    Object obj2 = (pn2) CollectionsKt.firstOrNull(xz0.w((pn2[]) this.m));
                    if (obj2 == null) {
                        obj2 = on2.a;
                    }
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (rjcVar.emit(obj2, this) == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar2 = this.l;
                    List X = xz0.X((Boolean[]) this.m);
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (rjcVar2.emit(X, this) == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar3 = this.l;
                    na6[] na6VarArr = (na6[]) this.m;
                    int length = na6VarArr.length;
                    int i4 = 0;
                    while (true) {
                        na6Var = la6.a;
                        if (i4 < length) {
                            na6Var2 = na6VarArr[i4];
                            if (Intrinsics.d(na6Var2, na6Var)) {
                                i4++;
                            }
                        } else {
                            na6Var2 = null;
                        }
                    }
                    if (na6Var2 != null) {
                        na6Var = na6Var2;
                    }
                    this.k = 1;
                    if (rjcVar3.emit(na6Var, this) == nm6Var3) {
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var4 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar4 = this.l;
                    Boolean[] boolArr = (Boolean[]) this.m;
                    int length2 = boolArr.length;
                    boolean z = false;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= length2) {
                            z = true;
                        } else if (boolArr[i6].booleanValue()) {
                            i6++;
                        }
                    }
                    Boolean valueOf = Boolean.valueOf(z);
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (rjcVar4.emit(valueOf, this) == nm6Var4) {
                    }
                } else if (i5 != 1) {
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
