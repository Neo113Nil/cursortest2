package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class mia extends aur implements Function2 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ wia l;
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mia(wia wiaVar, int i, Continuation continuation, int i2) {
        super(2, continuation);
        this.j = i2;
        this.l = wiaVar;
        this.m = i;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                mia miaVar = new mia(this.l, this.m, continuation, 0);
                miaVar.k = obj;
                return miaVar;
            case 1:
                mia miaVar2 = new mia(this.l, this.m, continuation, 1);
                miaVar2.k = obj;
                return miaVar2;
            case 2:
                mia miaVar3 = new mia(this.l, this.m, continuation, 2);
                miaVar3.k = obj;
                return miaVar3;
            case 3:
                mia miaVar4 = new mia(this.l, this.m, continuation, 3);
                miaVar4.k = obj;
                return miaVar4;
            default:
                mia miaVar5 = new mia(this.l, this.m, continuation, 4);
                miaVar5.k = obj;
                return miaVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((mia) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        int i2 = 0;
        int i3 = 1;
        int i4 = this.m;
        wia wiaVar = this.l;
        Continuation continuation = null;
        switch (i) {
            case 0:
                mm6 mm6Var = (mm6) this.k;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                return x97.p(mm6Var, null, null, new lia(wiaVar, i4, continuation, i2), 3);
            case 1:
                mm6 mm6Var2 = (mm6) this.k;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                return x97.p(mm6Var2, null, null, new nia(wiaVar, i4, continuation, i2), 3);
            case 2:
                mm6 mm6Var3 = (mm6) this.k;
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                return x97.p(mm6Var3, null, null, new nia(wiaVar, i4, continuation, i3), 3);
            case 3:
                mm6 mm6Var4 = (mm6) this.k;
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                return x97.p(mm6Var4, null, null, new lia(wiaVar, i4, continuation, i3), 3);
            default:
                mm6 mm6Var5 = (mm6) this.k;
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                return x97.p(mm6Var5, null, null, new nia(wiaVar, i4, continuation, 2), 3);
        }
    }
}
