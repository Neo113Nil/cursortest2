package defpackage;

import android.os.Handler;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final /* synthetic */ class tac implements g18 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tac(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.g18
    public final void cancel() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((d1k) obj).dispose();
                break;
            case 1:
                ((pzt0) obj).a(null);
                break;
            case 2:
                ((l8x) ((AtomicReference) obj).get()).a(null);
                break;
            default:
                ((Handler) qyy0.a.getValue()).removeCallbacks((Runnable) obj);
                break;
        }
    }
}
