package defpackage;

import java.util.regex.Pattern;
import kotlin.text.Regex;

/* loaded from: classes5.dex */
public enum udf {
    YANDEXMUSIC(new Regex("yandexmusic://kids/?").a),
    HTTPS(new Regex("https://music\\.(?:yandex|ya)\\.(?:by|ru|ua|kz|com|uz)/kids/?").a);

    public final Pattern a;

    udf(Pattern pattern) {
        this.a = pattern;
    }
}
