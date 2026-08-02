package defpackage;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class vvg extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ bwg l;
    public final /* synthetic */ kwg m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vvg(kwg kwgVar, bwg bwgVar, Continuation continuation) {
        super(2, continuation);
        this.j = 2;
        this.m = kwgVar;
        this.l = bwgVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new vvg(this.l, this.m, continuation, 0);
            case 1:
                return new vvg(this.l, this.m, continuation, 1);
            default:
                return new vvg(this.m, this.l, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((vvg) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0052, code lost:
    
        if (r8 == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006e, code lost:
    
        if (r8 == r0) goto L31;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                bwg bwgVar = this.l;
                if (i == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    obj = bwg.b(bwgVar, this.m, this);
                    if (obj == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                eca ecaVar = (eca) obj;
                if (ecaVar != null) {
                    ((taa) bwgVar.h).c(ecaVar);
                } else {
                    bwgVar.h(null);
                }
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                bwg bwgVar2 = this.l;
                if (i2 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    obj = bwg.b(bwgVar2, this.m, this);
                    if (obj == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                eca ecaVar2 = (eca) obj;
                if (ecaVar2 != null) {
                    ((taa) bwgVar2.h).e(ecaVar2);
                } else {
                    bwgVar2.h(null);
                }
                break;
            default:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    kwg kwgVar = this.m;
                    boolean z = kwgVar instanceof hwg;
                    bwg bwgVar3 = this.l;
                    if (!z) {
                        if (!(kwgVar instanceof iwg)) {
                            if (!(kwgVar instanceof jwg)) {
                                b6e.s();
                                break;
                            } else {
                                eul eulVar = ((jwg) kwgVar).a;
                                String str = eulVar.a;
                                String str2 = eulVar.b;
                                this.k = 3;
                                obj = bwgVar3.g(str, str2, false, this);
                                break;
                            }
                        } else {
                            String str3 = ((iwg) kwgVar).a.a;
                            this.k = 2;
                            obj = bwg.a(bwgVar3, str3, this);
                            break;
                        }
                    } else {
                        String str4 = ((hwg) kwgVar).a.a;
                        this.k = 1;
                        Serializable e = bwgVar3.e(str4, false, this);
                        if (e != nm6Var3) {
                        }
                    }
                    break;
                } else if (i3 == 1) {
                    qgg.h0(obj);
                    break;
                } else if (i3 == 2) {
                    qgg.h0(obj);
                    i21 i21Var = (i21) obj;
                    if (i21Var != null) {
                        break;
                    }
                } else if (i3 != 3) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    rrl rrlVar = (rrl) obj;
                    if (rrlVar != null) {
                        break;
                    }
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vvg(bwg bwgVar, kwg kwgVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = bwgVar;
        this.m = kwgVar;
    }
}
