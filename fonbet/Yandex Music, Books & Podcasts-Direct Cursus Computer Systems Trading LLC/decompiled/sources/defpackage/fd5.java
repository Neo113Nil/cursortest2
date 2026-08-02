package defpackage;

import java.util.regex.Pattern;
import kotlin.text.Regex;

/* loaded from: classes6.dex */
public enum fd5 {
    YANDEXMUSIC(new Regex("yandexmusic://(non-music|kids)/editorial/(album)/([^/]*?)/?").a),
    HTTPS(new Regex("https://music\\.(?:yandex|ya)\\.(?:by|ru|ua|kz|com|uz)/(non-music|kids)/editorial/(album)/([^/]*?)/?").a);

    public final Pattern a;

    fd5(Pattern pattern) {
        this.a = pattern;
    }
}
