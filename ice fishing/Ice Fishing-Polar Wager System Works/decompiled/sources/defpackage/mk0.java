package defpackage;

/* loaded from: classes.dex */
public final class mk0 extends android.os.RemoteCallbackList {
    public final /* synthetic */ androidx.room.MultiInstanceInvalidationService IHQe1A4L2xu;

    public mk0(androidx.room.MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.IHQe1A4L2xu = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(android.os.IInterface iInterface, java.lang.Object obj) {
        ((defpackage.p40) iInterface).getClass();
        obj.getClass();
        this.IHQe1A4L2xu.xiZrDbcSW0.remove((java.lang.Integer) obj);
    }
}
