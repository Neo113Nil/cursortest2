package defpackage;

import java.util.regex.Pattern;
import kotlin.text.Regex;

/* loaded from: classes6.dex */
public enum sk5 {
    YANDEXMUSIC(new Regex("yandexmusic://communication/?").a),
    HTTPS(new Regex("https://music\\.(?:yandex|ya)\\.(?:by|ru|ua|kz|com|uz)/communication/?").a);

    public final Pattern a;

    sk5(Pattern pattern) {
        this.a = pattern;
    }
}
