package defpackage;

import java.util.regex.Pattern;
import kotlin.text.Regex;

/* loaded from: classes6.dex */
public enum f3w {
    YANDEXMUSIC(new Regex("yandexmusic://wizard/?").a),
    HTTPS(new Regex("https://music\\.(?:yandex|ya)\\.(?:by|ru|ua|kz|com|uz)/wizard/?").a);

    public final Pattern a;

    f3w(Pattern pattern) {
        this.a = pattern;
    }
}
