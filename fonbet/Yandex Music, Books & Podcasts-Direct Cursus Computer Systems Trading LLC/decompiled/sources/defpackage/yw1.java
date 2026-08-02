package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class yw1 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ cx1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yw1(cx1 cx1Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = cx1Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new yw1(this.k, continuation, 0);
            default:
                return new yw1(this.k, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((yw1) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        cx1 cx1Var = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                return new Integer(cx1Var.c().abandonAudioFocus(cx1Var.b));
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                return new Integer(cx1Var.c().requestAudioFocus(cx1Var.b, 3, cx1Var.a));
        }
    }
}
