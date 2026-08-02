package defpackage;

import java.util.regex.Pattern;
import kotlin.text.Regex;

/* loaded from: classes6.dex */
public enum ftp {
    YANDEXMUSIC(new Regex("yandexmusic://settings(?:/([^/]+))?/?").a),
    HTTPS(new Regex("https://music\\.(?:yandex|ya)\\.(?:by|ru|ua|kz|com|uz)/settings(?:/([^/]+))?/?").a);

    public final Pattern a;

    ftp(Pattern pattern) {
        this.a = pattern;
    }
}
