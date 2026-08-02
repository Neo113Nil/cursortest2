package defpackage;

import java.util.regex.Pattern;
import kotlin.text.Regex;

/* loaded from: classes6.dex */
public enum hwk {
    YANDEXMUSIC(new Regex("yandexmusic://play-vibe/?(.[^&]*)*").a, "yandexmusic://play-vibe/%s"),
    HTTPS(new Regex("https://music\\.(?:yandex|ya)\\.(?:by|ru|ua|kz|com|uz)/play-vibe/?(.[^&]*)*").a, "https://music.yandex.ru/play-vibe/%s");

    public final Pattern a;
    public final String b;

    hwk(Pattern pattern, String str) {
        this.a = pattern;
        this.b = str;
    }
}
