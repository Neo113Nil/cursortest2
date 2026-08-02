package defpackage;

import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class f7e extends aur implements pyc {
    public final /* synthetic */ int j;
    public /* synthetic */ Throwable k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f7e(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.j = i2;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Throwable th = (Throwable) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.j) {
            case 0:
                f7e f7eVar = new f7e(3, 0, continuation);
                f7eVar.k = th;
                f7eVar.invokeSuspend(Unit.a);
                throw null;
            case 1:
                f7e f7eVar2 = new f7e(3, 1, continuation);
                f7eVar2.k = th;
                f7eVar2.invokeSuspend(Unit.a);
                throw null;
            default:
                f7e f7eVar3 = new f7e(3, 2, continuation);
                f7eVar3.k = th;
                return f7eVar3.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                Throwable th = this.k;
                if (th instanceof ep0) {
                    throw ((ep0) th);
                }
                throw new ip0("Failed to parse GraphQL http network response", th);
            case 1:
                Throwable th2 = this.k;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                ssg.a(6, "Relay:Service", "streamStateUpdates() exception", new Exception(th2));
                throw th2;
            default:
                Throwable th3 = this.k;
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                Assertions.throwOrSkip("SyncTriggersListener", new FailedAssertionException("Sync trigger failed", th3));
                return Unit.a;
        }
    }
}
