package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class vfe extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ u0q l;
    public final /* synthetic */ Context m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vfe(u0q u0qVar, Context context, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = u0qVar;
        this.m = context;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new vfe(this.l, this.m, continuation, 0);
            default:
                return new vfe(this.l, this.m, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
            case 0:
                ((vfe) create(mm6Var, continuation)).invokeSuspend(Unit.a);
                break;
            default:
                ((vfe) create(mm6Var, continuation)).invokeSuspend(Unit.a);
                break;
        }
        return nm6.a;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    tg6 tg6Var = new tg6(this.m, 2);
                    this.k = 1;
                    if (this.l.collect(tg6Var, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj7.f();
                return null;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    tg6 tg6Var2 = new tg6(this.m, 3);
                    this.k = 1;
                    if (this.l.collect(tg6Var2, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj7.f();
                return null;
        }
    }
}
