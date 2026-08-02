package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class gv5 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ fuw k;
    public final /* synthetic */ sdr l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gv5(fuw fuwVar, sdr sdrVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = fuwVar;
        this.l = sdrVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new gv5(this.k, this.l, continuation, 0);
            default:
                return new gv5(this.k, this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((gv5) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        sdr sdrVar = this.l;
        fuw fuwVar = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                if (fuwVar != null) {
                    Boolean bool = (Boolean) sdrVar.getValue();
                    bool.booleanValue();
                    fuwVar.h.setValue(bool);
                }
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                if (fuwVar != null) {
                    Boolean bool2 = (Boolean) sdrVar.getValue();
                    bool2.booleanValue();
                    fuwVar.h.setValue(bool2);
                }
                break;
        }
        return Unit.a;
    }
}
