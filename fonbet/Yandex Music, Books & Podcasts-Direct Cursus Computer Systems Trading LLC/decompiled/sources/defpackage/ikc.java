package defpackage;

import com.yandex.music.shared.utils.TimeoutException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class ikc extends aur implements Function1 {
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ikc(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.j = i2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new ikc(1, 0, continuation);
            case 1:
                return new ikc(1, 1, continuation);
            case 2:
                return new ikc(1, 2, continuation);
            case 3:
                return new ikc(1, 3, continuation);
            case 4:
                return new ikc(1, 4, continuation);
            case 5:
                return new ikc(1, 5, continuation);
            case 6:
                return new ikc(1, 6, continuation);
            case 7:
                return new ikc(1, 7, continuation);
            case 8:
                return new ikc(1, 8, continuation);
            case 9:
                return new ikc(1, 9, continuation);
            case 10:
                return new ikc(1, 10, continuation);
            case 11:
                return new ikc(1, 11, continuation);
            case 12:
                return new ikc(1, 12, continuation);
            case 13:
                return new ikc(1, 13, continuation);
            case 14:
                return new ikc(1, 14, continuation);
            default:
                return new ikc(1, 15, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
            case 0:
                ((ikc) create(continuation)).invokeSuspend(Unit.a);
                throw null;
            case 1:
                ((ikc) create(continuation)).invokeSuspend(Unit.a);
                return h5b.a;
            case 2:
                return ((ikc) create(continuation)).invokeSuspend(Unit.a);
            case 3:
                return ((ikc) create(continuation)).invokeSuspend(Unit.a);
            case 4:
                return ((ikc) create(continuation)).invokeSuspend(Unit.a);
            case 5:
                return ((ikc) create(continuation)).invokeSuspend(Unit.a);
            case 6:
                return ((ikc) create(continuation)).invokeSuspend(Unit.a);
            case 7:
                ((ikc) create(continuation)).invokeSuspend(Unit.a);
                return dzu.a;
            case 8:
                ((ikc) create(continuation)).invokeSuspend(Unit.a);
                return Boolean.FALSE;
            case 9:
                return ((ikc) create(continuation)).invokeSuspend(Unit.a);
            case 10:
                ((ikc) create(continuation)).invokeSuspend(Unit.a);
                return null;
            case 11:
                ((ikc) create(continuation)).invokeSuspend(Unit.a);
                return Boolean.FALSE;
            case 12:
                ((ikc) create(continuation)).invokeSuspend(Unit.a);
                return Boolean.TRUE;
            case 13:
                ((ikc) create(continuation)).invokeSuspend(Unit.a);
                return h5b.a;
            case 14:
                ((ikc) create(continuation)).invokeSuspend(Unit.a);
                return h5b.a;
            default:
                ((ikc) create(continuation)).invokeSuspend(Unit.a);
                return h5b.a;
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        h5b h5bVar = h5b.a;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                throw new TimeoutException("Timed out waiting for emission");
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                return h5bVar;
            case 2:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                return new mgd(null, null);
            case 3:
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                return Unit.a;
            case 4:
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                return Unit.a;
            case 5:
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                return Unit.a;
            case 6:
                nm6 nm6Var7 = nm6.a;
                qgg.h0(obj);
                return Unit.a;
            case 7:
                nm6 nm6Var8 = nm6.a;
                qgg.h0(obj);
                return dzu.a;
            case 8:
                nm6 nm6Var9 = nm6.a;
                qgg.h0(obj);
                return Boolean.FALSE;
            case 9:
                nm6 nm6Var10 = nm6.a;
                qgg.h0(obj);
                return Unit.a;
            case 10:
                nm6 nm6Var11 = nm6.a;
                qgg.h0(obj);
                return null;
            case 11:
                nm6 nm6Var12 = nm6.a;
                qgg.h0(obj);
                return Boolean.FALSE;
            case 12:
                nm6 nm6Var13 = nm6.a;
                qgg.h0(obj);
                return Boolean.TRUE;
            case 13:
                nm6 nm6Var14 = nm6.a;
                qgg.h0(obj);
                return h5bVar;
            case 14:
                nm6 nm6Var15 = nm6.a;
                qgg.h0(obj);
                return h5bVar;
            default:
                nm6 nm6Var16 = nm6.a;
                qgg.h0(obj);
                return h5bVar;
        }
    }
}
