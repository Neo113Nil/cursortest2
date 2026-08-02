package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class vst extends aur implements Function2 {
    public final /* synthetic */ int j;
    public si3 k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ mmo n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vst(mmo mmoVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.n = mmoVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                vst vstVar = new vst(this.n, continuation, 0);
                vstVar.m = obj;
                return vstVar;
            default:
                vst vstVar2 = new vst(this.n, continuation, 1);
                vstVar2.m = obj;
                return vstVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        oi oiVar = (oi) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((vst) create(oiVar, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r9 != r1) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b2, code lost:
    
        if (r9 != r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ff  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00d1 -> B:29:0x00b2). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        si3 si3Var;
        si3 si3Var2;
        switch (this.j) {
            case 0:
                oi oiVar = (oi) this.m;
                nm6 nm6Var = nm6.a;
                int i = this.l;
                if (i == 0) {
                    qgg.h0(obj);
                    oiVar.getClass();
                    zi3 zi3Var = oiVar.d;
                    zi3Var.getClass();
                    si3Var = new si3(zi3Var);
                } else if (i == 1) {
                    si3Var = this.k;
                    qgg.h0(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        break;
                    } else if (!((Boolean) si3Var.d()).booleanValue()) {
                        hjp hjpVar = (hjp) this.n.b;
                        this.m = null;
                        this.k = si3Var;
                        this.l = 2;
                        Object V = x97.V(dm6.b, new zts((dtt) hjpVar.b, null, 12), this);
                        nm6 nm6Var2 = nm6.a;
                        if (V != nm6Var2) {
                            V = Unit.a;
                        }
                        if (V != nm6Var2) {
                        }
                        if (Unit.a == nm6Var) {
                        }
                    }
                } else if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    si3Var = this.k;
                    qgg.h0(obj);
                }
                this.m = null;
                this.k = si3Var;
                this.l = 1;
                obj = si3Var.c(this);
                if (obj == nm6Var) {
                }
                if (!((Boolean) obj).booleanValue()) {
                }
                break;
            default:
                oi oiVar2 = (oi) this.m;
                nm6 nm6Var3 = nm6.a;
                int i2 = this.l;
                Continuation continuation = null;
                if (i2 == 0) {
                    qgg.h0(obj);
                    oiVar2.getClass();
                    zi3 zi3Var2 = oiVar2.d;
                    zi3Var2.getClass();
                    si3Var2 = new si3(zi3Var2);
                } else if (i2 == 1) {
                    si3Var2 = this.k;
                    qgg.h0(obj);
                    if (((Boolean) obj).booleanValue()) {
                        break;
                    } else {
                        si3Var2.d();
                        Unit unit = Unit.a;
                        hjp hjpVar2 = (hjp) this.n.b;
                        this.m = null;
                        this.k = si3Var2;
                        this.l = 2;
                        Object V2 = x97.V(dm6.b, new btt((dtt) hjpVar2.b, continuation, 1), this);
                        nm6 nm6Var4 = nm6.a;
                        if (V2 != nm6Var4) {
                            V2 = unit;
                        }
                        if (V2 == nm6Var4) {
                        }
                        if (V2 == nm6Var3) {
                        }
                    }
                } else if (i2 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    si3Var2 = this.k;
                    qgg.h0(obj);
                }
                this.m = null;
                this.k = si3Var2;
                this.l = 1;
                obj = si3Var2.c(this);
                if (obj == nm6Var3) {
                }
                if (((Boolean) obj).booleanValue()) {
                }
                break;
        }
        return Unit.a;
    }
}
