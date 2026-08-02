package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public enum kim {
    YANDEXMUSIC(Pattern.compile("yandexmusic://post/([^/\\?]*)/?")),
    HTTPS(Pattern.compile("https://music\\.(?:yandex|ya)\\.(?:by|ru|ua|kz|com|uz)/post/([^/\\?]*)/?"));

    public final Pattern a;

    kim(Pattern pattern) {
        this.a = pattern;
    }
}
