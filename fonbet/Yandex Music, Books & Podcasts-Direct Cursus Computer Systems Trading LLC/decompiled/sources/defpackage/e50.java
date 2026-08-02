package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class e50 extends aur implements Function1 {
    public final /* synthetic */ int j;
    public final /* synthetic */ List k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e50(List list, Continuation continuation, int i) {
        super(1, continuation);
        this.j = i;
        this.k = list;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new e50(this.k, continuation, 0);
            case 1:
                return new e50(this.k, continuation, 1);
            case 2:
                return new e50(this.k, continuation, 2);
            case 3:
                return new e50(this.k, continuation, 3);
            case 4:
                return new e50(this.k, continuation, 4);
            case 5:
                return new e50(this.k, continuation, 5);
            case 6:
                return new e50(this.k, continuation, 6);
            case 7:
                return new e50(this.k, continuation, 7);
            case 8:
                return new e50(this.k, continuation, 8);
            case 9:
                return new e50(this.k, continuation, 9);
            case 10:
                return new e50(this.k, continuation, 10);
            default:
                return new e50(this.k, continuation, 11);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((e50) create(continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        List list = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                break;
            case 3:
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                break;
            case 4:
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                break;
            case 5:
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                break;
            case 6:
                nm6 nm6Var7 = nm6.a;
                qgg.h0(obj);
                break;
            case 7:
                nm6 nm6Var8 = nm6.a;
                qgg.h0(obj);
                break;
            case 8:
                nm6 nm6Var9 = nm6.a;
                qgg.h0(obj);
                break;
            case 9:
                nm6 nm6Var10 = nm6.a;
                qgg.h0(obj);
                break;
            case 10:
                nm6 nm6Var11 = nm6.a;
                qgg.h0(obj);
                break;
            default:
                nm6 nm6Var12 = nm6.a;
                qgg.h0(obj);
                break;
        }
        return list;
    }
}
