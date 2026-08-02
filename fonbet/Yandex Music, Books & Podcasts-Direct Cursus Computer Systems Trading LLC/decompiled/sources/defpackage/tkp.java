package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class tkp extends aur implements Function1 {
    public final /* synthetic */ int j;
    public final /* synthetic */ wkp k;
    public final /* synthetic */ mwk l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tkp(wkp wkpVar, mwk mwkVar, Continuation continuation, int i) {
        super(1, continuation);
        this.j = i;
        this.k = wkpVar;
        this.l = mwkVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new tkp(this.k, this.l, continuation, 0);
            case 1:
                return new tkp(this.k, this.l, continuation, 1);
            case 2:
                return new tkp(this.k, this.l, continuation, 2);
            default:
                return new tkp(this.k, this.l, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((tkp) create(continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        mwk mwkVar = this.l;
        wkp wkpVar = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                ((t3g) wkpVar.a.a.getValue()).a(mwkVar);
                wkpVar.e.h(true);
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                ((t3g) wkpVar.a.a.getValue()).z(mwkVar);
                wkpVar.e.h(false);
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                ((t3g) wkpVar.a.a.getValue()).s(mwkVar);
                wkpVar.e.i(true);
                break;
            default:
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                ((t3g) wkpVar.a.a.getValue()).z(mwkVar);
                wkpVar.e.i(false);
                break;
        }
        return Unit.a;
    }
}
