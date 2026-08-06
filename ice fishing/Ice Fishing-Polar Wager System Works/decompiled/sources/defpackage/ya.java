package defpackage;

/* loaded from: classes.dex */
public final class ya implements defpackage.rp0 {
    public final /* synthetic */ int IHQe1A4L2xu;
    public final java.lang.Object oh6vYeIP;

    public /* synthetic */ ya(int i, java.lang.Object obj) {
        this.IHQe1A4L2xu = i;
        this.oh6vYeIP = obj;
    }

    public final java.lang.String toString() {
        int i = this.IHQe1A4L2xu;
        java.lang.Object obj = this.oh6vYeIP;
        switch (i) {
            case 0:
                return "CancelFutureOnCancel[" + ((java.util.concurrent.ScheduledFuture) obj) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((defpackage.g00) obj).getClass().getSimpleName() + '@' + defpackage.fm.UsuH8pd5P(this) + ']';
            default:
                return "DisposeOnCancel[" + ((defpackage.kq) obj) + ']';
        }
    }
}
