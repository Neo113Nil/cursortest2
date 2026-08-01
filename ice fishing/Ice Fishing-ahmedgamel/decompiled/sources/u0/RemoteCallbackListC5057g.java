package u0;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* renamed from: u0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RemoteCallbackListC5057g extends RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f41013a;

    public RemoteCallbackListC5057g(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f41013a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object cookie) {
        C5054d callback = (C5054d) iInterface;
        kotlin.jvm.internal.h.e(callback, "callback");
        kotlin.jvm.internal.h.e(cookie, "cookie");
        this.f41013a.f5298u.remove((Integer) cookie);
    }
}
