package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class tmj extends aur implements pyc {
    public final /* synthetic */ int j;
    public /* synthetic */ Pair k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tmj(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.j = i2;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Pair pair = (Pair) obj;
        Continuation continuation = (Continuation) obj3;
        switch (this.j) {
            case 0:
                tmj tmjVar = new tmj(3, 0, continuation);
                tmjVar.k = pair;
                return tmjVar.invokeSuspend(Unit.a);
            default:
                tmj tmjVar2 = new tmj(3, 1, continuation);
                tmjVar2.k = pair;
                return tmjVar2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                Pair pair = this.k;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                return pair;
            default:
                Pair pair2 = this.k;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                return pair2;
        }
    }
}
