package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class sws extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ nnk k;
    public final /* synthetic */ mqs l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sws(nnk nnkVar, mqs mqsVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = nnkVar;
        this.l = mqsVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new sws(this.k, this.l, continuation, 0);
            default:
                return new sws(this.k, this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((sws) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        mqs mqsVar = this.l;
        nnk nnkVar = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                psd psdVar = new psd(2);
                psdVar.b = "Downloading";
                psdVar.a("Track full update required");
                return nnkVar.C(mqsVar, psdVar);
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                psd psdVar2 = new psd(2);
                psdVar2.b = "Downloading";
                psdVar2.a("Track is still not fully updated");
                return nnkVar.C(mqsVar, psdVar2);
        }
    }
}
