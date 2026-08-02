package defpackage;

import com.yandex.music.core.ui.compose.draggable.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class gll extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ na0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gll(na0 na0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = na0Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new gll(this.l, continuation, 0);
            case 1:
                return new gll(this.l, continuation, 1);
            case 2:
                return new gll(this.l, continuation, 2);
            default:
                return new gll(this.l, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((gll) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    ja0 ja0Var = this.l.e;
                    lf3 lf3Var = lf3.b;
                    this.k = 1;
                    if (a.i(ja0Var, lf3Var, this) == nm6Var) {
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
                    ja0 ja0Var2 = this.l.e;
                    lf3 lf3Var2 = lf3.a;
                    this.k = 1;
                    if (a.i(ja0Var2, lf3Var2, this) == nm6Var2) {
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
                    ja0 ja0Var3 = this.l.e;
                    lf3 lf3Var3 = lf3.b;
                    this.k = 1;
                    if (a.i(ja0Var3, lf3Var3, this) == nm6Var3) {
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
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    ja0 ja0Var4 = this.l.e;
                    lf3 lf3Var4 = lf3.a;
                    this.k = 1;
                    if (a.i(ja0Var4, lf3Var4, this) == nm6Var4) {
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
