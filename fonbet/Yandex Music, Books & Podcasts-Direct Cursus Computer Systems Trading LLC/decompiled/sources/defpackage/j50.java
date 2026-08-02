package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.yandex.quasar.glagol.impl.ConversationImpl;

/* loaded from: classes3.dex */
public final class j50 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ fvf l;
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j50(fvf fvfVar, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.j = 2;
        this.l = fvfVar;
        this.k = i;
        this.m = i2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new j50(this.l, this.m, continuation, 0);
            case 1:
                return new j50(this.l, this.m, continuation, 1);
            case 2:
                return new j50(this.l, this.k, this.m, continuation);
            case 3:
                return new j50(this.l, this.m, continuation, 3);
            default:
                return new j50(this.l, this.m, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((j50) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((j50) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((j50) create((rwo) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 3:
                ((j50) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                return nm6.a;
            default:
                return ((j50) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object a;
        int i = this.j;
        fvf fvfVar = this.l;
        int i2 = this.m;
        Object obj2 = null;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (ivf.x(fvfVar, i2, 0, weo.Q(0.0f, 0.0f, null, 7), this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (ivf.x(fvfVar, i2, 0, weo.Q(0.0f, 0.0f, null, 7), this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i4 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 2:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                fvfVar.n(this.k, i2, true);
                return Unit.a;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i5 = this.k;
                if (i5 != 0 && i5 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                do {
                    act S = weo.S(ConversationImpl.INCORRECT_TOKEN, 0, nya.d, 2);
                    this.k = 1;
                    a = fvfVar.a(hqi.c, new en0(i2, S, new uqn(), (Continuation) null), this);
                    if (a != nm6.a) {
                        a = Unit.a;
                    }
                } while (a != nm6Var4);
                return nm6Var4;
            default:
                nm6 nm6Var5 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    Iterator it = fvfVar.j().k.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (((cvf) next).a == i2) {
                                obj2 = next;
                            }
                        }
                    }
                    if (obj2 == null) {
                        this.k = 1;
                        if (fvfVar.f(i2, 0, this) == nm6Var5) {
                            return nm6Var5;
                        }
                    }
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j50(fvf fvfVar, int i, Continuation continuation, int i2) {
        super(2, continuation);
        this.j = i2;
        this.l = fvfVar;
        this.m = i;
    }
}
