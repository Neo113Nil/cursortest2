package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class d82 extends aur implements pyc {
    public final /* synthetic */ int j;
    public /* synthetic */ oq k;
    public /* synthetic */ String l;
    public final /* synthetic */ h82 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d82(h82 h82Var, Continuation continuation, int i) {
        super(3, continuation);
        this.j = i;
        this.m = h82Var;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        oq oqVar = (oq) obj;
        String str = (String) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.j) {
            case 0:
                d82 d82Var = new d82(this.m, continuation, 0);
                d82Var.k = oqVar;
                d82Var.l = str;
                return d82Var.invokeSuspend(Unit.a);
            case 1:
                d82 d82Var2 = new d82(this.m, continuation, 1);
                d82Var2.k = oqVar;
                d82Var2.l = str;
                return d82Var2.invokeSuspend(Unit.a);
            default:
                d82 d82Var3 = new d82(this.m, continuation, 2);
                d82Var3.k = oqVar;
                d82Var3.l = str;
                return d82Var3.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        h82 h82Var = this.m;
        switch (i) {
            case 0:
                oq oqVar = this.k;
                String str = this.l;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                return ((m82) h82Var.e.getValue()).a(oqVar, str, true);
            case 1:
                oq oqVar2 = this.k;
                String str2 = this.l;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                return ((m82) h82Var.e.getValue()).a(oqVar2, str2, true);
            default:
                oq oqVar3 = this.k;
                String str3 = this.l;
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                return ((m82) h82Var.e.getValue()).a(oqVar3, str3, true);
        }
    }
}
