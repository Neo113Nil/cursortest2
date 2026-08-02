package defpackage;

import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class sx4 extends aur implements Function1 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sx4(Object obj, boolean z, Continuation continuation, int i) {
        super(1, continuation);
        this.j = i;
        this.m = obj;
        this.l = z;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new sx4((yx4) this.m, this.l, continuation, 0);
            case 1:
                return new sx4((gs4) this.m, this.l, continuation, 1);
            default:
                return new sx4((gs4) this.m, this.l, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((sx4) create(continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i != 0) {
                    if (i == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                yx4 yx4Var = (yx4) this.m;
                this.k = 1;
                yx4Var.getClass();
                List list = gys.MyMusicWithKids.a;
                list.getClass();
                Serializable l = yx4Var.l(new thn(list), Boolean.FALSE, null, null, this.l, this);
                return l == nm6Var ? nm6Var : l;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 != 0) {
                    if (i2 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                gs4 gs4Var = (gs4) this.m;
                this.k = 1;
                Object c = gs4.c(gs4Var, this.l, this);
                return c == nm6Var2 ? nm6Var2 : c;
            default:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 != 0) {
                    if (i3 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                gs4 gs4Var2 = (gs4) this.m;
                this.k = 1;
                Object d = gs4.d(gs4Var2, this.l, this);
                return d == nm6Var3 ? nm6Var3 : d;
        }
    }
}
