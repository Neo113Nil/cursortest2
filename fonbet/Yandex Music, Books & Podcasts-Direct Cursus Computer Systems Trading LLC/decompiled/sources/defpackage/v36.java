package defpackage;

import java.util.regex.Pattern;
import kotlin.text.Regex;

/* loaded from: classes6.dex */
public enum v36 {
    YANDEXMUSIC(new Regex("yandexmusic://concerts/?").a),
    HTTPS(new Regex("https://music\\.(?:yandex|ya)\\.(?:by|ru|ua|kz|com|uz)/concerts/?").a);

    public final Pattern a;

    v36(Pattern pattern) {
        this.a = pattern;
    }
}
