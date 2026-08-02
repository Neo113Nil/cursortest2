package defpackage;

import java.util.regex.Pattern;
import kotlin.text.Regex;

/* loaded from: classes5.dex */
public enum a30 {
    YANDEXMUSIC(new Regex("yandexmusic://chart/([^/]*)/?").a),
    HTTPS(new Regex("https://music\\.(?:yandex|ya)\\.(?:by|ru|ua|kz|com|uz)/chart/([^/]*)/?").a);

    public final Pattern a;

    a30(Pattern pattern) {
        this.a = pattern;
    }
}
