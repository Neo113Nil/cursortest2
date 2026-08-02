package u0;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* renamed from: u0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RemoteCallbackListC5058g extends RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f40975a;

    public RemoteCallbackListC5058g(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f40975a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object cookie) {
        C5055d callback = (C5055d) iInterface;
        kotlin.jvm.internal.h.e(callback, "callback");
        kotlin.jvm.internal.h.e(cookie, "cookie");
        this.f40975a.f5264u.remove((Integer) cookie);
    }
}
