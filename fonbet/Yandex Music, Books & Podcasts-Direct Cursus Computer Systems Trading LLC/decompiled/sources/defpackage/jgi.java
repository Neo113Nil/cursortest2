package defpackage;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: classes.dex */
public final class jgi extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService a;

    public jgi(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        ((i9e) iInterface).getClass();
        obj.getClass();
        this.a.b.remove((Integer) obj);
    }
}
