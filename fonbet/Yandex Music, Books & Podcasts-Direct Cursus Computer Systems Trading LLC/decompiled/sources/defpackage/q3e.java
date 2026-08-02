package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class q3e extends aur implements Function1 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ u3e l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q3e(u3e u3eVar, Continuation continuation, int i) {
        super(1, continuation);
        this.j = i;
        this.l = u3eVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new q3e(this.l, continuation, 0);
            default:
                return new q3e(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((q3e) create(continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    u3e u3eVar = this.l;
                    List list = u3eVar.b;
                    if (list != null) {
                        return list;
                    }
                    g6c g6cVar = u3eVar.f;
                    this.k = 1;
                    Object value = g6cVar.o.getValue();
                    if (((List) value).isEmpty()) {
                        value = null;
                    }
                    List list2 = (List) value;
                    obj = list2 == null ? zsd.g0(new bca(((u5c) g6cVar.j.getValue()).a.b(null), 18), this) : list2;
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
                return (List) obj;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    u3e u3eVar2 = this.l;
                    List list3 = u3eVar2.b;
                    if (list3 != null) {
                        return list3;
                    }
                    g6c g6cVar2 = u3eVar2.f;
                    this.k = 1;
                    Object value2 = g6cVar2.o.getValue();
                    if (((List) value2).isEmpty()) {
                        value2 = null;
                    }
                    List list4 = (List) value2;
                    obj = list4 == null ? zsd.g0(new bca(((u5c) g6cVar2.j.getValue()).a.b(null), 18), this) : list4;
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
                return (List) obj;
        }
    }
}
