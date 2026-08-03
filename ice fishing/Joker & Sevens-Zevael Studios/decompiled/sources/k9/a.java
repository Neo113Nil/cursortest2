package k9;

import bc.n;
import java.util.List;
import java.util.Map;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {
    public static final a INSTANCE = new a();
    private static final List<String> PREFERRED_VARIANT_ORDER = n.L("android", "app", "all");

    private a() {
    }

    public final String variantIdForMessage(com.onesignal.inAppMessages.internal.a aVar, x8.a aVar2) {
        j.e(aVar, "message");
        j.e(aVar2, "languageContext");
        String language = aVar2.getLanguage();
        for (String str : PREFERRED_VARIANT_ORDER) {
            if (aVar.getVariants().containsKey(str)) {
                Map<String, String> map = aVar.getVariants().get(str);
                j.b(map);
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
