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
public final class pg4 {
    public static final pg4 c;
    public static final pg4 d;
    public static final pg4 e;
    public static final pg4 f;
    public static final /* synthetic */ pg4[] g;
    public final Pattern a;
    public final String b;

    static {
        Pattern compile = Pattern.compile("yandexmusic://chart/?");
        compile.getClass();
        pg4 pg4Var = new pg4("YANDEXMUSIC", 0, compile, "yandexmusic://chart");
        c = pg4Var;
        Pattern compile2 = Pattern.compile("yandexmusic://chart/tracks/?");
        compile2.getClass();
        pg4 pg4Var2 = new pg4("YANDEXMUSIC_NEW", 1, compile2, "yandexmusic://chart/tracks");
        d = pg4Var2;
        Pattern compile3 = Pattern.compile("https://music\\.(?:yandex|ya)\\.(?:by|ru|ua|kz|com|uz)/chart/?");
        compile3.getClass();
        pg4 pg4Var3 = new pg4("HTTPS", 2, compile3, "https://music.yandex.ru/chart");
        e = pg4Var3;
        Pattern compile4 = Pattern.compile("https://music\\.(?:yandex|ya)\\.(?:by|ru|ua|kz|com|uz)/chart/tracks/?");
        compile4.getClass();
        pg4 pg4Var4 = new pg4("HTTPS_NEW", 3, compile4, "https://music.yandex.ru/chart/tracks");
        f = pg4Var4;
        g = new pg4[]{pg4Var, pg4Var2, pg4Var3, pg4Var4};
    }

    public pg4(String str, int i, Pattern pattern, String str2) {
        this.a = pattern;
        this.b = str2;
    }

    public static pg4 valueOf(String str) {
        return (pg4) Enum.valueOf(pg4.class, str);
    }

    public static pg4[] values() {
        return (pg4[]) g.clone();
    }
}
