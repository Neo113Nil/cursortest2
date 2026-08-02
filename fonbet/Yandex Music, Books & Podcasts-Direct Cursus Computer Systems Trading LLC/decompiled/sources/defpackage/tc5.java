package defpackage;

import java.util.regex.Pattern;
import kotlin.text.Regex;

/* loaded from: classes6.dex */
public enum tc5 {
    YANDEXMUSIC(new Regex("yandexmusic://(non-music|kids)/compilations/([^/]*?)/?").a),
    HTTPS(new Regex("https://music\\.(?:yandex|ya)\\.(?:by|ru|ua|kz|com|uz)/(non-music|kids)/compilations/([^/]*?)/?").a);

    public final Pattern a;

    tc5(Pattern pattern) {
        this.a = pattern;
    }
}
