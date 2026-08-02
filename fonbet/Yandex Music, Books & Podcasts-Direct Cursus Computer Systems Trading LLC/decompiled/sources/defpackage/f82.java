package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class f82 extends aur implements pyc {
    public final /* synthetic */ int j;
    public /* synthetic */ mqs k;
    public /* synthetic */ String l;
    public final /* synthetic */ h82 m;
    public final /* synthetic */ String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f82(h82 h82Var, String str, Continuation continuation, int i) {
        super(3, continuation);
        this.j = i;
        this.m = h82Var;
        this.n = str;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        mqs mqsVar = (mqs) obj;
        String str = (String) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.j) {
            case 0:
                f82 f82Var = new f82(this.m, this.n, continuation, 0);
                f82Var.k = mqsVar;
                f82Var.l = str;
                return f82Var.invokeSuspend(Unit.a);
            case 1:
                f82 f82Var2 = new f82(this.m, this.n, continuation, 1);
                f82Var2.k = mqsVar;
                f82Var2.l = str;
                return f82Var2.invokeSuspend(Unit.a);
            default:
                f82 f82Var3 = new f82(this.m, this.n, continuation, 2);
                f82Var3.k = mqsVar;
                f82Var3.l = str;
                return f82Var3.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        String str = this.n;
        h82 h82Var = this.m;
        switch (i) {
            case 0:
                mqs mqsVar = this.k;
                String str2 = this.l;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                return ((m82) h82Var.e.getValue()).e(mqsVar, str2, str, y02.a);
            case 1:
                mqs mqsVar2 = this.k;
                String str3 = this.l;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                return ((m82) h82Var.e.getValue()).e(mqsVar2, str3, str, y02.a);
            default:
                mqs mqsVar3 = this.k;
                String str4 = this.l;
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                return ((m82) h82Var.e.getValue()).e(mqsVar3, str4, str, y02.a);
        }
    }
}
