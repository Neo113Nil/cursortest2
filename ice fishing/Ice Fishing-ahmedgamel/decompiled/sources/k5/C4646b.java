package k5;

import j5.InterfaceC4621a;
import kotlin.jvm.internal.h;

/* renamed from: k5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4646b implements InterfaceC4621a {
    @Override // j5.InterfaceC4621a
    public void trackOpenedEvent(String notificationId, String campaign) {
        h.e(notificationId, "notificationId");
        h.e(campaign, "campaign");
    }

    @Override // j5.InterfaceC4621a
    public void trackReceivedEvent(String notificationId, String campaign) {
        h.e(notificationId, "notificationId");
        h.e(campaign, "campaign");
    }

    @Override // j5.InterfaceC4621a
    public void trackInfluenceOpenEvent() {
    }
}
