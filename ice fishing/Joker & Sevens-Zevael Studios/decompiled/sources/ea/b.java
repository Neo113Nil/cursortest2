package ea;

import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b implements da.a {
    @Override // da.a
    public void trackOpenedEvent(String str, String str2) {
        j.e(str, "notificationId");
        j.e(str2, "campaign");
    }

    @Override // da.a
    public void trackReceivedEvent(String str, String str2) {
        j.e(str, "notificationId");
        j.e(str2, "campaign");
    }

    @Override // da.a
    public void trackInfluenceOpenEvent() {
    }
}
