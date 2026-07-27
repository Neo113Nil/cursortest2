package u0;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* renamed from: u0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RemoteCallbackListC5096g extends RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f41027a;

    public RemoteCallbackListC5096g(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f41027a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object cookie) {
        C5093d callback = (C5093d) iInterface;
        kotlin.jvm.internal.h.e(callback, "callback");
        kotlin.jvm.internal.h.e(cookie, "cookie");
        this.f41027a.f5410u.remove((Integer) cookie);
    }
}
