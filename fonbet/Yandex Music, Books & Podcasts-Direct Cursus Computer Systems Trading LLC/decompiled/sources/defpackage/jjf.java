package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.common.media.context.c;

/* loaded from: classes5.dex */
public final class jjf extends aur implements Function1 {
    public final /* synthetic */ int j = 1;
    public int k;
    public final /* synthetic */ String l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public jjf(Function1 function1, Function1 function12, g0l g0lVar, kcr kcrVar, String str, a6l a6lVar, Continuation continuation) {
        super(1, continuation);
        this.m = (aur) function1;
        this.n = function12;
        this.o = g0lVar;
        this.p = kcrVar;
        this.l = str;
        this.q = a6lVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [aur, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new jjf((Function2) this.m, (eul) this.n, (mqs) this.o, (c) this.p, (ljf) this.q, this.l, continuation);
            default:
                return new jjf((Function1) this.m, (Function1) this.n, (g0l) this.o, (kcr) this.p, this.l, (a6l) this.q, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((jjf) create(continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r7v9, types: [aur, kotlin.jvm.functions.Function1] */
    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                mqs mqsVar = (mqs) this.o;
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    eul eulVar = (eul) this.n;
                    this.k = 1;
                    obj = this.m.invoke(eulVar, this);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                List list = (List) obj;
                int indexOf = list.indexOf(mqsVar);
                qe5 h = l3l.h((c) this.p, list, ((ljf) this.q).c.a(this.l));
                h.g = mqsVar;
                h.e = indexOf;
                return h.b();
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    ?? r7 = (aur) this.m;
                    this.k = 1;
                    obj = r7.invoke(this);
                    if (obj == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                List list2 = (List) obj;
                r3q r3qVar = (r3q) ((Function1) this.n).invoke(list2);
                ezu ezuVar = new ezu((kcr) this.p, null);
                a6l a6lVar = (a6l) this.q;
                v80 v80Var = new v80(this.l, a6lVar.a, a6lVar.b);
                r3qVar.getClass();
                list2.getClass();
                return new fzu(ybl.h(new b6v(r3qVar), list2, v80Var, ezuVar, false));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjf(Function2 function2, eul eulVar, mqs mqsVar, c cVar, ljf ljfVar, String str, Continuation continuation) {
        super(1, continuation);
        this.m = function2;
        this.n = eulVar;
        this.o = mqsVar;
        this.p = cVar;
        this.q = ljfVar;
        this.l = str;
    }
}
