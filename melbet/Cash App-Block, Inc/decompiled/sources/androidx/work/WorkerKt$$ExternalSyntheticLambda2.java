package androidx.work;

import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class WorkerKt$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AtomicBoolean f$0;
    public final /* synthetic */ CallbackToFutureAdapter$Completer f$1;
    public final /* synthetic */ Function0 f$2;

    public /* synthetic */ WorkerKt$$ExternalSyntheticLambda2(AtomicBoolean atomicBoolean, CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer, Function0 function0, int i) {
        this.$r8$classId = i;
        this.f$0 = atomicBoolean;
        this.f$1 = callbackToFutureAdapter$Completer;
        this.f$2 = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Function0 function0 = this.f$2;
        CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = this.f$1;
        AtomicBoolean atomicBoolean = this.f$0;
        switch (i) {
            case 0:
                if (!atomicBoolean.get()) {
                    try {
                        callbackToFutureAdapter$Completer.set(function0.invoke());
                        break;
                    } catch (Throwable th) {
                        callbackToFutureAdapter$Completer.setException(th);
                        return;
                    }
                }
                break;
            default:
                if (!atomicBoolean.get()) {
                    try {
                        callbackToFutureAdapter$Completer.set(function0.invoke());
                        break;
                    } catch (Throwable th2) {
                        callbackToFutureAdapter$Completer.setException(th2);
                    }
                }
                break;
        }
    }
}
