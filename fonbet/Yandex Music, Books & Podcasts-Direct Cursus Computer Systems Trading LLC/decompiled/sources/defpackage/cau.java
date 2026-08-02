package defpackage;

import java.util.regex.Pattern;
import kotlin.text.Regex;

/* loaded from: classes6.dex */
public enum cau {
    YANDEXMUSIC(new Regex("yandexmusic://video/?").a),
    HTTPS(new Regex("https://music\\.(?:yandex|ya)\\.(?:by|ru|ua|kz|com|uz)/video/?").a);

    public final Pattern a;

    cau(Pattern pattern) {
        this.a = pattern;
    }
}
