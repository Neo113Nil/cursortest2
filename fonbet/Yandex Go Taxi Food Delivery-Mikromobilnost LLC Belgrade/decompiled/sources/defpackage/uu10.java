package defpackage;

import com.yandex.messaging.internal.entities.MessageData;

/* loaded from: classes15.dex */
public class uu10 {
    public static boolean a(MessageData messageData) {
        if (!messageData.hiddenByModeration) {
            return true;
        }
        Boolean bool = messageData.moderationUserChoice;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
