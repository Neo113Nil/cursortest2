package defpackage;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class hs0 implements Runnable {
    public final /* synthetic */ Context EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ hs0(Context context, int i) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.OOA6hdeuvCS;
        Context context = this.EljAMC1QTz;
        switch (i) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new hs0(context, 1));
                break;
            default:
                qj.J3Xc8BaqpN8(context, new es0(), qj.WIEu4Ya2g8, false);
                break;
        }
    }
}
