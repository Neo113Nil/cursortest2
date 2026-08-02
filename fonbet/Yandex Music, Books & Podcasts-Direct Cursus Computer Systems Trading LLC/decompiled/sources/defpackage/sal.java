package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.player.a;

/* loaded from: classes6.dex */
public final class sal extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ nyf l;
    public final /* synthetic */ pjc m;
    public final /* synthetic */ a n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sal(nyf nyfVar, pjc pjcVar, Continuation continuation, a aVar, int i) {
        super(2, continuation);
        this.j = i;
        this.l = nyfVar;
        this.m = pjcVar;
        this.n = aVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new sal(this.l, this.m, continuation, this.n, 0);
            default:
                return new sal(this.l, this.m, continuation, this.n, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((sal) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    lyf lyfVar = lyf.d;
                    ral ralVar = new ral(this.m, null, this.n, 0);
                    this.k = 1;
                    if (o8g.J(this.l, lyfVar, ralVar, this) == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    lyf lyfVar2 = lyf.d;
                    ral ralVar2 = new ral(this.m, null, this.n, 1);
                    this.k = 1;
                    if (o8g.J(this.l, lyfVar2, ralVar2, this) == nm6Var2) {
                    }
                } else if (i2 != 1) {
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
