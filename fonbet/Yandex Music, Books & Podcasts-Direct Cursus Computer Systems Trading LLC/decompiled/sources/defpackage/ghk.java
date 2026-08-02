package defpackage;

import java.util.regex.Pattern;
import kotlin.text.Regex;

/* loaded from: classes6.dex */
public enum ghk {
    YANDEXMUSIC(new Regex("yandexmusic://payment/?").a),
    HTTPS(new Regex("https://music\\.(?:yandex|ya)\\.(?:by|ru|ua|kz|com|uz)/payment/?").a);

    public final Pattern a;

    ghk(Pattern pattern) {
        this.a = pattern;
    }
}
