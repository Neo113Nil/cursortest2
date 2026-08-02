package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class r3e extends aur implements Function1 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ w3e l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r3e(w3e w3eVar, Continuation continuation, int i) {
        super(1, continuation);
        this.j = i;
        this.l = w3eVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new r3e(this.l, continuation, 0);
            default:
                return new r3e(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((r3e) create(continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                Object obj2 = nm6.a;
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
                cka ckaVar = this.l.d;
                this.k = 1;
                Object value = ckaVar.h.getValue();
                if (((List) value).isEmpty()) {
                    value = null;
                }
                Object obj3 = (List) value;
                Object b = obj3 == null ? ckaVar.b(this) : obj3;
                return b == obj2 ? obj2 : b;
            default:
                Object obj4 = nm6.a;
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
                cka ckaVar2 = this.l.d;
                this.k = 1;
                Object value2 = ckaVar2.h.getValue();
                if (((List) value2).isEmpty()) {
                    value2 = null;
                }
                Object obj5 = (List) value2;
                Object b2 = obj5 == null ? ckaVar2.b(this) : obj5;
                return b2 == obj4 ? obj4 : b2;
        }
    }
}
