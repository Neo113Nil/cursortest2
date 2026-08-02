package defpackage;

import java.util.regex.Pattern;
import kotlin.text.Regex;

/* loaded from: classes6.dex */
public enum ekt {
    YANDEXMUSIC(new Regex("yandexmusic://entities/(tag/)?([^/]*)/([^/]*)").a),
    HTTPS(new Regex("https://music\\.(?:yandex|ya)\\.(?:by|ru|ua|kz|com|uz)/entities/(tag/)?([^/]*)/([^/]*)").a);

    public final Pattern a;

    ekt(Pattern pattern) {
        this.a = pattern;
    }
}
