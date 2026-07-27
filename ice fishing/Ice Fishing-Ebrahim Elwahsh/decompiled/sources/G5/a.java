package G5;

import java.util.List;

/* loaded from: classes2.dex */
public interface a {
    List<b> getInfluences();

    void onDirectInfluenceFromIAM(String str);

    void onDirectInfluenceFromNotification(String str);

    void onInAppMessageDismissed();

    void onInAppMessageDisplayed(String str);

    void onNotificationReceived(String str);
}
