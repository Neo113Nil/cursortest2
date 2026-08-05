package defpackage;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class kt extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService qoPGr6Ce;

    public kt(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.qoPGr6Ce = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        ((nm) iInterface).getClass();
        obj.getClass();
        this.qoPGr6Ce.MdtA4re8.remove((Integer) obj);
    }
}
