package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.common.media.control.QueuePreparationException;

/* loaded from: classes3.dex */
public final class tx4 extends aur implements Function1 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ aur l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public tx4(Function1 function1, Continuation continuation, int i) {
        super(1, continuation);
        this.j = i;
        switch (i) {
            case 1:
                this.l = (aur) function1;
                super(1, continuation);
                break;
            case 2:
                this.l = (aur) function1;
                super(1, continuation);
                break;
            default:
                this.l = (aur) function1;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [aur, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [aur, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v2, types: [aur, kotlin.jvm.functions.Function1] */
    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new tx4(this.l, continuation, 0);
            case 1:
                return new tx4(this.l, continuation, 1);
            default:
                return new tx4(this.l, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((tx4) create(continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [aur, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r6v1, types: [aur, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r6v11, types: [aur, kotlin.jvm.functions.Function1] */
    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Object invoke = this.l.invoke(this);
                    return invoke == nm6Var ? nm6Var : invoke;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
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
                x77 x77Var = new x77(this.l, null, 2);
                mn7 mn7Var = dm6.b;
                this.k = 1;
                Object V = x97.V(mn7Var, x77Var, this);
                return V == nm6Var2 ? nm6Var2 : V;
            default:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    obj = this.l.invoke(this);
                    if (obj == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                List list = (List) obj;
                if (list != null) {
                    return list;
                }
                throw new QueuePreparationException("Can`t load tracks");
        }
    }
}
