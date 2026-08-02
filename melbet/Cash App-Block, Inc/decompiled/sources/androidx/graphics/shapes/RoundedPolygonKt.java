package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.cdf.customersupport.ChatBotStatus;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.support.chat.backend.api.Conversation;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class RoundedPolygonKt {
    public static final ChatBotStatus access$toChatBotStatus(Conversation.BotStatus botStatus) {
        int ordinal = botStatus.ordinal();
        if (ordinal == 0) {
            return null;
        }
        if (ordinal == 1) {
            return ChatBotStatus.READY;
        }
        if (ordinal == 2) {
            return ChatBotStatus.ACTIVE;
        }
        if (ordinal == 3) {
            return ChatBotStatus.HANDED_OVER;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final long calculateCenter(float[] fArr) {
        float f = RecyclerView.DECELERATION_RATE;
        int i = 0;
        float f2 = 0.0f;
        while (i < fArr.length) {
            int i2 = i + 1;
            f += fArr[i];
            i += 2;
            f2 += fArr[i2];
        }
        return FloatFloatPair.m127constructorimpl(f / (fArr.length / 2), f2 / (fArr.length / 2));
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewActivitySearch.deepLinkSpecs;
    }
}
