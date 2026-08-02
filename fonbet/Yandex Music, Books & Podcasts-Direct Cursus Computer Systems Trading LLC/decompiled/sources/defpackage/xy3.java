package defpackage;

import java.util.regex.Pattern;
import kotlin.text.Regex;

/* loaded from: classes3.dex */
public enum xy3 {
    YANDEXMUSIC(new Regex("yandexmusic://cards/promo/(.+)").a),
    HTTPS(new Regex("https://music\\.(?:yandex|ya)\\.(?:by|ru|ua|kz|com|uz)/cards/promo/(.+)").a);

    public final Pattern a;

    xy3(Pattern pattern) {
        this.a = pattern;
    }
}
