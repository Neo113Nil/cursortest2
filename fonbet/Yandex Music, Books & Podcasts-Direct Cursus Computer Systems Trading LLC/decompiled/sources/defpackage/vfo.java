package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class vfo extends aur implements Function1 {
    public int j;
    public final /* synthetic */ qzc k;
    public final /* synthetic */ v4v l;
    public final /* synthetic */ List m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ String o;
    public final /* synthetic */ List p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vfo(qzc qzcVar, v4v v4vVar, List list, boolean z, String str, List list2, Continuation continuation) {
        super(1, continuation);
        this.k = qzcVar;
        this.l = v4vVar;
        this.m = list;
        this.n = z;
        this.o = str;
        this.p = list2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        return new vfo(this.k, this.l, this.m, this.n, this.o, this.p, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((vfo) create((Continuation) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.j;
        if (i == 0) {
            qgg.h0(obj);
            this.j = 1;
            Object a = qzc.a(this.k, this.l, this.m, this.n, this.o, this.p, this);
            return a == nm6Var ? nm6Var : a;
        }
        if (i == 1) {
            qgg.h0(obj);
            return obj;
        }
        xq0.q("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
