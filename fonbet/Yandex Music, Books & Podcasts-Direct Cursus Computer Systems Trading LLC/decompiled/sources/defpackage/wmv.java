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
public final class wmv {
    public static final wmv b;
    public static final wmv c;
    public static final /* synthetic */ wmv[] d;
    public final Pattern a;

    static {
        Pattern compile = Pattern.compile("yandexmusic://widget/install");
        compile.getClass();
        wmv wmvVar = new wmv("YANDEXMUSIC", 0, compile);
        b = wmvVar;
        Pattern compile2 = Pattern.compile("https://music\\.(?:yandex|ya)\\.(?:by|ru|ua|kz|com|uz)/widget/install");
        compile2.getClass();
        wmv wmvVar2 = new wmv("HTTPS_MUSIC", 1, compile2);
        c = wmvVar2;
        d = new wmv[]{wmvVar, wmvVar2};
    }

    public wmv(String str, int i, Pattern pattern) {
        this.a = pattern;
    }

    public static wmv valueOf(String str) {
        return (wmv) Enum.valueOf(wmv.class, str);
    }

    public static wmv[] values() {
        return (wmv[]) d.clone();
    }
}
