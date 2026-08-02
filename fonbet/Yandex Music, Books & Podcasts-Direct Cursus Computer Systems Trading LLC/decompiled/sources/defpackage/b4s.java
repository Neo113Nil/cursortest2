package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public enum b4s {
    YANDEXMUSIC(Pattern.compile("yandexmusic://tag/([^/\\?]+)")),
    HTTPS(Pattern.compile("https://music\\.(?:yandex|ya)\\.(?:by|ru|ua|kz|com|uz)/tag/([^/\\?]+)"));

    public final Pattern a;

    b4s(Pattern pattern) {
        this.a = pattern;
    }
}
