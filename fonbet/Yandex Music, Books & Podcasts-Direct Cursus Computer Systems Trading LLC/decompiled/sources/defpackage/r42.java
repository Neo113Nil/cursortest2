package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class r42 extends aur implements pyc {
    public final /* synthetic */ int j;
    public /* synthetic */ oq k;
    public /* synthetic */ String l;
    public final /* synthetic */ w42 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r42(w42 w42Var, Continuation continuation, int i) {
        super(3, continuation);
        this.j = i;
        this.m = w42Var;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        oq oqVar = (oq) obj;
        String str = (String) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.j) {
            case 0:
                r42 r42Var = new r42(this.m, continuation, 0);
                r42Var.k = oqVar;
                r42Var.l = str;
                return r42Var.invokeSuspend(Unit.a);
            case 1:
                r42 r42Var2 = new r42(this.m, continuation, 1);
                r42Var2.k = oqVar;
                r42Var2.l = str;
                return r42Var2.invokeSuspend(Unit.a);
            default:
                r42 r42Var3 = new r42(this.m, continuation, 2);
                r42Var3.k = oqVar;
                r42Var3.l = str;
                return r42Var3.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        w42 w42Var = this.m;
        switch (i) {
            case 0:
                oq oqVar = this.k;
                String str = this.l;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                return ((m82) w42Var.e.getValue()).a(oqVar, str, false);
            case 1:
                oq oqVar2 = this.k;
                String str2 = this.l;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                return ((m82) w42Var.e.getValue()).a(oqVar2, str2, false);
            default:
                oq oqVar3 = this.k;
                String str3 = this.l;
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                return ((m82) w42Var.e.getValue()).a(oqVar3, str3, false);
        }
    }
}
