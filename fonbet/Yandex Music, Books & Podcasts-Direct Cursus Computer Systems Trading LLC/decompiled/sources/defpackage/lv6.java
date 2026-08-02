package defpackage;

import java.util.regex.Pattern;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'b' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes6.dex */
public final class lv6 {
    public static final lv6 b;
    public static final lv6 c;
    public static final /* synthetic */ lv6[] d;
    public final Pattern a;

    static {
        Pattern compile = Pattern.compile("yandexmusic://crowdtest/([^/?]*)(/([^/?]*))?/?");
        compile.getClass();
        lv6 lv6Var = new lv6("YANDEXMUSIC", 0, compile);
        b = lv6Var;
        Pattern compile2 = Pattern.compile("https://music\\.(?:yandex|ya)\\.(?:by|ru|ua|kz|com|uz)/crowdtest/([^/?]*)(/([^/?]*))?/?");
        compile2.getClass();
        lv6 lv6Var2 = new lv6("HTTPS", 1, compile2);
        c = lv6Var2;
        d = new lv6[]{lv6Var, lv6Var2};
    }

    public lv6(String str, int i, Pattern pattern) {
        this.a = pattern;
    }

    public static lv6 valueOf(String str) {
        return (lv6) Enum.valueOf(lv6.class, str);
    }

    public static lv6[] values() {
        return (lv6[]) d.clone();
    }
}
