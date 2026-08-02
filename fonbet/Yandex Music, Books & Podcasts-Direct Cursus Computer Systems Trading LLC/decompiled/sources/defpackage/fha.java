package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class fha extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ gha l;
    public final /* synthetic */ vbc m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fha(gha ghaVar, vbc vbcVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = ghaVar;
        this.m = vbcVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new fha(this.l, this.m, continuation, 0);
            default:
                return new fha(this.l, this.m, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((fha) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                Object obj2 = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    gha ghaVar = this.l;
                    ghaVar.H().getClass();
                    tga a = hha.a(this.m);
                    gha.a(ghaVar, a);
                    dha dhaVar = (dha) ghaVar.o.getValue();
                    this.k = 1;
                    Object a2 = lmm.a(((v55) dhaVar.c.getValue()).r(), new k55(a, null), this);
                    if (a2 != obj2) {
                        a2 = Unit.a;
                    }
                    if (a2 != obj2) {
                        a2 = Unit.a;
                    }
                    if (a2 == obj2) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                Object obj3 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    gha ghaVar2 = this.l;
                    ghaVar2.H().getClass();
                    tga a3 = hha.a(this.m);
                    gha.G(ghaVar2, a3);
                    dha dhaVar2 = (dha) ghaVar2.o.getValue();
                    this.k = 1;
                    Object a4 = lmm.a(((v55) dhaVar2.c.getValue()).r(), new l55(a3, null), this);
                    if (a4 != obj3) {
                        a4 = Unit.a;
                    }
                    if (a4 != obj3) {
                        a4 = Unit.a;
                    }
                    if (a4 == obj3) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
        }
        return Unit.a;
    }
}
