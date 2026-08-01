package Q4;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.h;
import v7.AbstractC5130k;

/* loaded from: classes2.dex */
public final class a {
    public static final a INSTANCE = new a();
    private static final List<String> PREFERRED_VARIANT_ORDER = AbstractC5130k.v(com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID, "app", "all");

    private a() {
    }

    public final String variantIdForMessage(com.onesignal.inAppMessages.internal.a message, F4.a languageContext) {
        h.e(message, "message");
        h.e(languageContext, "languageContext");
        String language = languageContext.getLanguage();
        for (String str : PREFERRED_VARIANT_ORDER) {
            if (message.getVariants().containsKey(str)) {
                Map<String, String> map = message.getVariants().get(str);
                h.b(map);
                Map<String, String> map2 = map;
                if (!map2.containsKey(language)) {
                    language = com.anythink.core.express.b.a.f17530f;
                }
                return map2.get(language);
            }
        }
        return null;
    }
}
