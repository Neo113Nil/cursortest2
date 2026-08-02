package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class tjc extends huo {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tjc(CoroutineContext coroutineContext, Continuation continuation, int i) {
        super(continuation, coroutineContext);
        this.e = i;
    }

    @Override // defpackage.h3f
    public final boolean x(Throwable th) {
        switch (this.e) {
            case 0:
                if (th instanceof fj4) {
                    return true;
                }
                return t(th);
            default:
                return false;
        }
    }
}
