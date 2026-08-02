package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public enum wmk {
    YANDEXMUSIC(Pattern.compile("yandexmusic://playlist/([^/\\?]+)/?")),
    HTTPS(Pattern.compile("https://music\\.(?:yandex|ya)\\.(?:by|ru|ua|kz|com|uz)/playlist/([^/\\?]+)/?"));

    public final Pattern a;

    wmk(Pattern pattern) {
        this.a = pattern;
    }
}
