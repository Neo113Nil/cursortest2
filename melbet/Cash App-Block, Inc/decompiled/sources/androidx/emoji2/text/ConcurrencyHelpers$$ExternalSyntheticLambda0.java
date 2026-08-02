package androidx.emoji2.text;

import android.os.Handler;
import android.view.Choreographer;
import java.util.concurrent.Executor;
import papa.Choreographers$$ExternalSyntheticLambda3;

/* loaded from: classes.dex */
public final /* synthetic */ class ConcurrencyHelpers$$ExternalSyntheticLambda0 implements Executor {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ConcurrencyHelpers$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((Handler) obj).post(runnable);
                break;
            default:
                ((Choreographer) obj).postFrameCallback(new Choreographers$$ExternalSyntheticLambda3(runnable, 1));
                break;
        }
    }
}
