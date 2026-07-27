package k5;

import j5.InterfaceC4611a;
import kotlin.jvm.internal.h;

/* renamed from: k5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4635b implements InterfaceC4611a {
    @Override // j5.InterfaceC4611a
    public void trackOpenedEvent(String notificationId, String campaign) {
        h.e(notificationId, "notificationId");
        h.e(campaign, "campaign");
    }

    @Override // j5.InterfaceC4611a
    public void trackReceivedEvent(String notificationId, String campaign) {
        h.e(notificationId, "notificationId");
        h.e(campaign, "campaign");
    }

    @Override // j5.InterfaceC4611a
    public void trackInfluenceOpenEvent() {
    }
}
