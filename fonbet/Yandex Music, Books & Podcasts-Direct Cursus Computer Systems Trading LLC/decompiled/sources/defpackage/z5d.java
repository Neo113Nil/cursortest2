package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public enum z5d {
    YANDEXMUSIC(Pattern.compile("yandexmusic://genre(?:/([^/?]+)(?:/([^/?]*))?)?/?")),
    HTTPS(Pattern.compile("https://music\\.(?:yandex|ya)\\.(?:by|ru|ua|kz|com|uz)/genre(?:/([^/?]+)(?:/([^/?]*))?)?/?"));

    public final Pattern a;

    z5d(Pattern pattern) {
        this.a = pattern;
    }
}
