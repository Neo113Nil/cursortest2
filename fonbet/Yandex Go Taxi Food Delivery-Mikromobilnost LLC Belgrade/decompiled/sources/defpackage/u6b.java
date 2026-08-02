package defpackage;

import com.yandex.messaging.ui.timeline.ChatOpenTarget;

/* loaded from: classes15.dex */
public final class u6b {
    public static ChatOpenTarget a(String str) {
        ChatOpenTarget chatOpenTarget = ChatOpenTarget.IMAGE_PICKER;
        if (jl40.l(str, chatOpenTarget.getValue())) {
            return chatOpenTarget;
        }
        return null;
    }
}
