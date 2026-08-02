package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public enum m5j {
    YANDEXMUSIC(Pattern.compile("yandexmusic://new-releases/?")),
    HTTPS(Pattern.compile("https://music\\.(?:yandex|ya)\\.(?:by|ru|ua|kz|com|uz)/new-releases/?"));

    public final Pattern a;

    m5j(Pattern pattern) {
        this.a = pattern;
    }
}
