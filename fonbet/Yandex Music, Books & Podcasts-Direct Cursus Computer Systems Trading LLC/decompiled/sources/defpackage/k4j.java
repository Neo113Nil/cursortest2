package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public enum k4j {
    YANDEXMUSIC(Pattern.compile("yandexmusic://new-playlists/?")),
    HTTPS(Pattern.compile("https://music\\.(?:yandex|ya)\\.(?:by|ru|ua|kz|com|uz)/new-playlists/?"));

    public final Pattern a;

    k4j(Pattern pattern) {
        this.a = pattern;
    }
}
