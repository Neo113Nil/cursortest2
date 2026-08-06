package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class yc implements defpackage.ds0 {
    public final /* synthetic */ int ZpBGe2uQfcn8;
    public final java.lang.Object giKS3J6vZuNy;

    public /* synthetic */ yc(int i, java.lang.Object obj) {
        this.ZpBGe2uQfcn8 = i;
        this.giKS3J6vZuNy = obj;
    }

    public final java.lang.String toString() {
        int i = this.ZpBGe2uQfcn8;
        java.lang.Object obj = this.giKS3J6vZuNy;
        switch (i) {
            case 0:
                return "CancelFutureOnCancel[" + ((java.util.concurrent.ScheduledFuture) obj) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((defpackage.y10) obj).getClass().getSimpleName() + '@' + defpackage.nn.IJ0hOnjhPOri(this) + ']';
            default:
                return "DisposeOnCancel[" + ((defpackage.cr) obj) + ']';
        }
    }
}
