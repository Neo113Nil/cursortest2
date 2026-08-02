package defpackage;

import java.util.regex.Pattern;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes6.dex */
public final class d2t {
    public static final d2t c;
    public static final d2t d;
    public static final /* synthetic */ d2t[] e;
    public final Pattern a;
    public final String b;

    static {
        Pattern compile = Pattern.compile("yandexmusic://track/([^/\\?]*)/?");
        compile.getClass();
        d2t d2tVar = new d2t("YANDEXMUSIC", 0, compile, "yandexmusic://track/%s/");
        c = d2tVar;
        Pattern compile2 = Pattern.compile("https://music\\.(?:yandex|ya)\\.(?:by|ru|ua|kz|com|uz)/track/([^/\\?]*)/?");
        compile2.getClass();
        d2t d2tVar2 = new d2t("HTTPS", 1, compile2, "https://music.yandex.ru/track/%s");
        d = d2tVar2;
        e = new d2t[]{d2tVar, d2tVar2};
    }

    public d2t(String str, int i, Pattern pattern, String str2) {
        this.a = pattern;
        this.b = str2;
    }

    public static d2t valueOf(String str) {
        return (d2t) Enum.valueOf(d2t.class, str);
    }

    public static d2t[] values() {
        return (d2t[]) e.clone();
    }
}
