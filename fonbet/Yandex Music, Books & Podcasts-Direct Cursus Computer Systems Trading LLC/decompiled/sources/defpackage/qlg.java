package defpackage;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class qlg extends aur implements Function1 {
    public int j;
    public final /* synthetic */ xlg k;
    public final /* synthetic */ String l;
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qlg(xlg xlgVar, String str, int i, Continuation continuation) {
        super(1, continuation);
        this.k = xlgVar;
        this.l = str;
        this.m = i;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        return new qlg(this.k, this.l, this.m, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((qlg) create((Continuation) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.j;
        if (i != 0) {
            if (i == 1) {
                qgg.h0(obj);
                return obj;
            }
            xq0.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        qgg.h0(obj);
        rtl rtlVar = this.k.a;
        this.j = 1;
        Serializable g = rtlVar.g(this.l, this.m, this);
        return g == nm6Var ? nm6Var : g;
    }
}
