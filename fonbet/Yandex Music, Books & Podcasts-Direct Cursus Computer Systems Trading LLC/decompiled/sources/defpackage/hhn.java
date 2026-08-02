package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public enum hhn {
    YANDEXMUSIC(Pattern.compile("yandexmusic://radio/([^/?]*)(/([^/?]*))?/?")),
    YANDEXRADIO(Pattern.compile("yandexradio://([^/?]*)(/([^/?]*))?/?")),
    HTTPS_MUSIC(Pattern.compile("https://music\\.(?:yandex|ya)\\.(?:by|ru|ua|kz|com|uz)/radio/([^/?]*)(/([^/?]*))?/?")),
    HTTPS_RADIO(Pattern.compile("https://radio\\.yandex\\.(?:by|ru|ua|kz|com)/([^/?]*)(/([^/?]*))?/?"));

    public final Pattern a;

    hhn(Pattern pattern) {
        this.a = pattern;
    }
}
