package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.common.media.context.c;

/* loaded from: classes5.dex */
public final class kjf extends aur implements Function1 {
    public final /* synthetic */ int j;
    public final /* synthetic */ c k;
    public final /* synthetic */ String l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kjf(c cVar, Object obj, Object obj2, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.j = i;
        this.k = cVar;
        this.m = obj;
        this.n = obj2;
        this.l = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new kjf(this.k, (mqs) this.m, (ljf) this.n, this.l, continuation, 0);
            default:
                return new kjf(this.k, (List) this.m, (cr) this.n, this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((kjf) create(continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        String str = this.l;
        Object obj2 = this.n;
        Object obj3 = this.m;
        c cVar = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                mqs mqsVar = (mqs) obj3;
                qe5 h = l3l.h(cVar, t75.c(mqsVar), ((ljf) obj2).c.a(str));
                h.g = mqsVar;
                h.e = 0;
                return h.b();
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                return l3l.h(cVar, (List) obj3, ((kxi) ((cr) obj2).d).a(str)).b();
        }
    }
}
