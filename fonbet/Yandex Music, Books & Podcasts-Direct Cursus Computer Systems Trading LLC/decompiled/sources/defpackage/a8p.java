package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public enum a8p {
    YANDEXMUSIC(Pattern.compile("yandexmusic://search/?"), "yandexmusic://search/"),
    HTTPS(Pattern.compile("https://music\\.(?:yandex|ya)\\.(?:by|ru|ua|kz|com|uz)/search/?"), "https://music.yandex.ru/search/");

    public final Pattern a;
    public final String b;

    a8p(Pattern pattern, String str) {
        this.a = pattern;
        this.b = str;
    }
}
