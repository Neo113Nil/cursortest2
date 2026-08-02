package defpackage;

import java.util.regex.Pattern;
import kotlin.text.Regex;

/* loaded from: classes6.dex */
public enum c9i {
    YANDEXMUSIC(new Regex("yandexmusic://mixes/?").a),
    HTTPS(new Regex("https://music\\.(?:yandex|ya)\\.(?:by|ru|ua|kz|com|uz)/mixes/?").a);

    public final Pattern a;

    c9i(Pattern pattern) {
        this.a = pattern;
    }
}
