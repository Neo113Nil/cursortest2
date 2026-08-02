package ru.yandex.video.m3.player.impl.utils;

import defpackage.i3y;
import defpackage.sls;
import defpackage.tw21;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lru/yandex/video/m3/player/impl/utils/LanguageTagIso1toIso3;", "", "()V", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LanguageTagIso1toIso3 {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final i3y languageTagIso1ToIso3$delegate = a.a(new sls() { // from class: ru.yandex.video.m3.player.impl.utils.LanguageTagIso1toIso3$Companion$languageTagIso1ToIso3$2
        @Override // defpackage.sls
        public final HashMap<String, String> invoke() {
            String[] iSOLanguages = Locale.getISOLanguages();
            HashMap<String, String> hashMap = new HashMap<>(iSOLanguages.length);
            for (String str : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str).getISO3Language();
                    if (iSO3Language.length() > 0) {
                        hashMap.put(str, iSO3Language);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            return hashMap;
        }
    });

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R'\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lru/yandex/video/m3/player/impl/utils/LanguageTagIso1toIso3$Companion;", "", "<init>", "()V", "", "normalizedTag", "convert", "(Ljava/lang/String;)Ljava/lang/String;", "", "languageTagIso1ToIso3$delegate", "Li3y;", "getLanguageTagIso1ToIso3", "()Ljava/util/Map;", "languageTagIso1ToIso3", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Map<String, String> getLanguageTagIso1ToIso3() {
            return (Map) LanguageTagIso1toIso3.languageTagIso1ToIso3$delegate.getValue();
        }

        public final String convert(String normalizedTag) {
            String str;
            if (normalizedTag == null) {
                return normalizedTag;
            }
            int i = tw21.a;
            String str2 = normalizedTag.split("-", 2)[0];
            return (str2.length() != 2 || (str = getLanguageTagIso1ToIso3().get(str2)) == null) ? normalizedTag : str.concat(normalizedTag.substring(2));
        }

        private Companion() {
        }
    }
}
