package g5;

import f5.InterfaceC4515a;
import kotlin.jvm.internal.h;

/* renamed from: g5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4530b implements InterfaceC4515a {
    @Override // f5.InterfaceC4515a
    public void trackOpenedEvent(String notificationId, String campaign) {
        h.e(notificationId, "notificationId");
        h.e(campaign, "campaign");
    }

    @Override // f5.InterfaceC4515a
    public void trackReceivedEvent(String notificationId, String campaign) {
        h.e(notificationId, "notificationId");
        h.e(campaign, "campaign");
    }

    @Override // f5.InterfaceC4515a
    public void trackInfluenceOpenEvent() {
    }
}
