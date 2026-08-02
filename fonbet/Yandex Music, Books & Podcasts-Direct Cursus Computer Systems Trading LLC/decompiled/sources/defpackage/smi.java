package defpackage;

import java.util.regex.Pattern;
import kotlin.text.Regex;

/* loaded from: classes6.dex */
public enum smi {
    YANDEXMUSIC(new Regex("yandexmusic://music-history/?").a),
    HTTPS(new Regex("https://music\\.(?:yandex|ya)\\.(?:by|ru|ua|kz|com|uz)/music-history/?").a);

    public final Pattern a;

    smi(Pattern pattern) {
        this.a = pattern;
    }
}
