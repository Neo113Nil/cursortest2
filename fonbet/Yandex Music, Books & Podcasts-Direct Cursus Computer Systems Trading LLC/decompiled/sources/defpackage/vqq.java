package defpackage;

import java.util.regex.Pattern;
import kotlin.text.Regex;

/* loaded from: classes6.dex */
public enum vqq {
    YANDEXMUSIC(new Regex("yandexmusic://landing/([^/\\?]+)/?").a, "yandexmusic://landing/%s"),
    HTTPS(new Regex("https://music\\.(?:yandex|ya)\\.(?:by|ru|ua|kz|com|uz)/landing/([^/\\?]+)/?").a, "https://music\\.(?:yandex|ya)\\.(?:by|ru|ua|kz|com|uz)/landing/%s");

    public final Pattern a;
    public final String b;

    vqq(Pattern pattern, String str) {
        this.a = pattern;
        this.b = str;
    }
}
