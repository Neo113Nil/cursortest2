package defpackage;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class i3 implements jw {
    public final Object NCTxEWno;
    public final /* synthetic */ int qoPGr6Ce;

    public /* synthetic */ i3(int i, Object obj) {
        this.qoPGr6Ce = i;
        this.NCTxEWno = obj;
    }

    public final String toString() {
        int i = this.qoPGr6Ce;
        Object obj = this.NCTxEWno;
        switch (i) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) obj) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + cm.class.getSimpleName() + '@' + ra.I5GHvsYW(this) + ']';
            default:
                return "DisposeOnCancel[" + ((kd) obj) + ']';
        }
    }
}
