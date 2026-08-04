package com.gamericefishpro.space.td;

import com.gamericefishpro.space.ph.x;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final a INSTANCE = new a();
    private static final List<String> PREFERRED_VARIANT_ORDER = x.f("android", "app", "all");

    private a() {
    }

    public final String variantIdForMessage(com.gamericefishpro.space.qd.a message, com.gamericefishpro.space.zc.a languageContext) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(languageContext, "languageContext");
        String language = languageContext.getLanguage();
        for (String str : PREFERRED_VARIANT_ORDER) {
            if (message.getVariants().containsKey(str)) {
                Map<String, String> map = message.getVariants().get(str);
                Intrinsics.b(map);
                Map<String, String> map2 = map;
                if (!map2.containsKey(language)) {
                    language = "default";
                }
                return map2.get(language);
            }
        }
        return null;
    }
}
