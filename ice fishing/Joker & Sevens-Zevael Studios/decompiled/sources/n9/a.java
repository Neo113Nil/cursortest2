package n9;

import com.onesignal.inAppMessages.internal.c;
import com.onesignal.inAppMessages.internal.g;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public interface a {
    void onMessageActionOccurredOnMessage(com.onesignal.inAppMessages.internal.a aVar, c cVar);

    void onMessageActionOccurredOnPreview(com.onesignal.inAppMessages.internal.a aVar, c cVar);

    void onMessagePageChanged(com.onesignal.inAppMessages.internal.a aVar, g gVar);

    void onMessageWasDismissed(com.onesignal.inAppMessages.internal.a aVar);

    void onMessageWasDisplayed(com.onesignal.inAppMessages.internal.a aVar);

    void onMessageWillDismiss(com.onesignal.inAppMessages.internal.a aVar);

    void onMessageWillDisplay(com.onesignal.inAppMessages.internal.a aVar);
}
