package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class kr3 extends aur implements pyc {
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kr3(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.j = i2;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.j) {
            case 0:
                return new kr3(3, 0, (Continuation) obj3).invokeSuspend(Unit.a);
            case 1:
                long j = ((enj) obj2).a;
                return new kr3(3, 1, (Continuation) obj3).invokeSuspend(Unit.a);
            case 2:
                ((Number) obj2).floatValue();
                return new kr3(3, 2, (Continuation) obj3).invokeSuspend(Unit.a);
            case 3:
                ((Number) obj).intValue();
                new kr3(3, 3, (Continuation) obj3).invokeSuspend(Unit.a);
                return Boolean.FALSE;
            case 4:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                new kr3(3, 4, (Continuation) obj3).invokeSuspend(Unit.a);
                throw null;
            default:
                long j2 = ((enj) obj2).a;
                return new kr3(3, 5, (Continuation) obj3).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                return Unit.a;
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                return Unit.a;
            case 2:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                return Unit.a;
            case 3:
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                return Boolean.FALSE;
            case 4:
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                throw null;
            default:
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                return Unit.a;
        }
    }
}
