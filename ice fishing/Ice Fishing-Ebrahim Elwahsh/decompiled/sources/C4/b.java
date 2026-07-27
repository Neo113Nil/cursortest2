package C4;

import java.util.Locale;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class b {
    private static final String CHINESE = "zh";
    public static final a Companion = new a(null);
    private static final String HEBREW_CORRECTED = "he";
    private static final String HEBREW_INCORRECT = "iw";
    private static final String INDONESIAN_CORRECTED = "id";
    private static final String INDONESIAN_INCORRECT = "in";
    private static final String YIDDISH_CORRECTED = "yi";
    private static final String YIDDISH_INCORRECT = "ji";

    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        private a() {
        }
    }

    public final String getLanguage() {
        String language = Locale.getDefault().getLanguage();
        if (language != null) {
            int hashCode = language.hashCode();
            if (hashCode != 3365) {
                if (hashCode != 3374) {
                    if (hashCode != 3391) {
                        if (hashCode == 3886 && language.equals("zh")) {
                            return language + '-' + Locale.getDefault().getCountry();
                        }
                    } else if (language.equals(YIDDISH_INCORRECT)) {
                        return YIDDISH_CORRECTED;
                    }
                } else if (language.equals(HEBREW_INCORRECT)) {
                    return HEBREW_CORRECTED;
                }
            } else if (language.equals(INDONESIAN_INCORRECT)) {
                return "id";
            }
        }
        h.b(language);
        return language;
    }
}
