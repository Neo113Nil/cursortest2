package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ibi extends aur implements pyc {
    public final /* synthetic */ int j;
    public /* synthetic */ float k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ibi(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.j = i;
        this.l = obj;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.j;
        float floatValue = ((Number) obj2).floatValue();
        Continuation continuation = (Continuation) obj3;
        switch (i) {
            case 0:
                ibi ibiVar = new ibi((Function1) this.l, continuation, 0);
                ibiVar.k = floatValue;
                return ibiVar.invokeSuspend(Unit.a);
            default:
                ibi ibiVar2 = new ibi((aqi) this.l, continuation, 1);
                ibiVar2.k = floatValue;
                return ibiVar2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        Object obj2 = this.l;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                ((Function1) obj2).invoke(new Float(this.k));
                break;
            default:
                float f = this.k;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                ((Function1) ((aqi) obj2).getValue()).invoke(new Float(f));
                break;
        }
        return Unit.a;
    }
}
