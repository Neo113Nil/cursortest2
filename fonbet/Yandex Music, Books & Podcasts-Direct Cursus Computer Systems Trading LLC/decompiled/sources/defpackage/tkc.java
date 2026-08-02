package defpackage;

import com.yandex.passport.common.ui.compose.a;
import com.yandex.plus.bdui.ui.b;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class tkc extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ pjc m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tkc(pjc pjcVar, Function2 function2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = pjcVar;
        this.l = function2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                tkc tkcVar = new tkc(this.m, continuation, 0);
                tkcVar.l = obj;
                return tkcVar;
            case 1:
                tkc tkcVar2 = new tkc(this.m, continuation, 1);
                tkcVar2.l = obj;
                return tkcVar2;
            case 2:
                tkc tkcVar3 = new tkc(this.m, continuation, 2);
                tkcVar3.l = obj;
                return tkcVar3;
            case 3:
                return new tkc(this.m, this.l, continuation, 3);
            default:
                return new tkc(this.m, this.l, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
        }
        return ((tkc) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    wjc wjcVar = new wjc((ltm) this.l, 1);
                    this.k = 1;
                    if (this.m.collect(wjcVar, this) == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 1:
                rjc rjcVar = (rjc) this.l;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    o0o o0oVar = new o0o(rjcVar, 28);
                    this.l = null;
                    this.k = 1;
                    if (this.m.collect(o0oVar, this) == nm6Var2) {
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
                    bnu bnuVar = new bnu((rjc) this.l, 15);
                    this.l = null;
                    this.k = 1;
                    if (this.m.collect(bnuVar, this) == nm6Var3) {
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    a aVar = new a(17, this.l);
                    this.k = 1;
                    if (this.m.collect(aVar, this) == nm6Var4) {
                    }
                } else if (i4 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var5 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    b bVar = new b(this.l, (Continuation) null, 6);
                    this.k = 1;
                    if (zsd.O(this.m, bVar, this) == nm6Var5) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tkc(pjc pjcVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = pjcVar;
    }
}
