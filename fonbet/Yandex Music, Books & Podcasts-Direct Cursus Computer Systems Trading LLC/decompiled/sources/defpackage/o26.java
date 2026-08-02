package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public final class o26 extends orn {
    public static final Pattern d = Pattern.compile("yandexmusic://concert/([^/\\?]+)/?");
    public static final Pattern e = Pattern.compile("https://music\\.(?:yandex|ya)\\.(?:by|ru|ua|kz|com|uz)/concert/([^/\\?]+)/?");

    public o26(Pattern pattern) {
        super(pattern, new p20(13));
    }
}
