package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class ng2 extends aur implements pyc {
    public final /* synthetic */ int j;
    public /* synthetic */ String k;
    public /* synthetic */ boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ng2(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.j = i2;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.j;
        String str = (String) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        Continuation continuation = (Continuation) obj3;
        switch (i) {
            case 0:
                ng2 ng2Var = new ng2(3, 0, continuation);
                ng2Var.k = str;
                ng2Var.l = booleanValue;
                return ng2Var.invokeSuspend(Unit.a);
            default:
                ng2 ng2Var2 = new ng2(3, 1, continuation);
                ng2Var2.k = str;
                ng2Var2.l = booleanValue;
                return ng2Var2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                String str = this.k;
                boolean z = this.l;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                return new qg2(str, z);
            default:
                String str2 = this.k;
                boolean z2 = this.l;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                if (z2) {
                    return str2;
                }
                return null;
        }
    }
}
