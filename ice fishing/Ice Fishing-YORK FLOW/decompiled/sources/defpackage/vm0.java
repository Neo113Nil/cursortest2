package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class vm0 extends android.os.RemoteCallbackList {
    public final /* synthetic */ androidx.room.MultiInstanceInvalidationService ZpBGe2uQfcn8;

    public vm0(androidx.room.MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.ZpBGe2uQfcn8 = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(android.os.IInterface iInterface, java.lang.Object obj) {
        ((defpackage.c60) iInterface).getClass();
        obj.getClass();
        this.ZpBGe2uQfcn8.oh71FJcDz6S2.remove((java.lang.Integer) obj);
    }
}
