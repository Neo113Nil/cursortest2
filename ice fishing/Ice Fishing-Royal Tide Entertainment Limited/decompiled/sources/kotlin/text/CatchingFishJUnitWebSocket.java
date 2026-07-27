package kotlin.text;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class CatchingFishJUnitWebSocket extends CatchingFishStripeAPIMVI {
    public static final /* synthetic */ AtomicIntegerFieldUpdater CatchingFishCoroutine = AtomicIntegerFieldUpdater.newUpdater(CatchingFishJUnitWebSocket.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatchingFishJUnitWebSocket(CatchingFishKtorMockk catchingFishKtorMockk, Throwable th, boolean z) {
        super(th, z);
        if (th == null) {
            th = new CancellationException("Continuation " + catchingFishKtorMockk + " was cancelled normally");
        }
        this._resumed$volatile = 0;
    }
}
