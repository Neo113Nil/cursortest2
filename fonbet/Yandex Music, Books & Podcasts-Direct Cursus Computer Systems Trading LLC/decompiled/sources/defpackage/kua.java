package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class kua extends aur implements tyc {
    public final /* synthetic */ int j;
    public /* synthetic */ long k;
    public /* synthetic */ long l;
    public /* synthetic */ long m;
    public /* synthetic */ ai3 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kua(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.j = i2;
    }

    @Override // defpackage.tyc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        d85 d85Var = (d85) obj;
        switch (this.j) {
            case 0:
                long j = d85Var.a;
                long j2 = ((d85) obj2).a;
                long j3 = ((d85) obj3).a;
                kua kuaVar = new kua(5, 0, (Continuation) obj5);
                kuaVar.k = j;
                kuaVar.l = j2;
                kuaVar.m = j3;
                kuaVar.n = (ai3) obj4;
                return kuaVar.invokeSuspend(Unit.a);
            default:
                long j4 = d85Var.a;
                long j5 = ((d85) obj2).a;
                long j6 = ((d85) obj3).a;
                kua kuaVar2 = new kua(5, 1, (Continuation) obj5);
                kuaVar2.k = j4;
                kuaVar2.l = j5;
                kuaVar2.m = j6;
                kuaVar2.n = (ai3) obj4;
                return kuaVar2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                long j = this.k;
                long j2 = this.l;
                long j3 = this.m;
                ai3 ai3Var = this.n;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                ylu yluVar = zlu.b;
                ai3Var.getClass();
                return new ylu(zlu.a, ai3Var, j, j2, j3);
            default:
                long j4 = this.k;
                long j5 = this.l;
                long j6 = this.m;
                ai3 ai3Var2 = this.n;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                ylu yluVar2 = zlu.b;
                ai3Var2.getClass();
                return new ylu(zlu.a, ai3Var2, j4, j5, j6);
        }
    }
}
