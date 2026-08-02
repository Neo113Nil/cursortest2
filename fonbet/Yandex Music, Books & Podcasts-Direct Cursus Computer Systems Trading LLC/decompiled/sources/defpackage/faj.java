package defpackage;

import java.util.regex.Pattern;
import kotlin.text.Regex;

/* loaded from: classes5.dex */
public enum faj {
    YANDEXMUSIC(new Regex("yandexmusic://chart/podcasts/category/([^/]*)/?").a),
    HTTPS(new Regex("https://music\\.(?:yandex|ya)\\.(?:by|ru|ua|kz|com|uz)/chart/podcasts/category/([^/]*)/?").a);

    public final Pattern a;

    faj(Pattern pattern) {
        this.a = pattern;
    }
}
