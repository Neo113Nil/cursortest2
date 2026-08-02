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
public final class afm {
    public static final afm b;
    public static final afm c;
    public static final /* synthetic */ afm[] d;
    public final Pattern a;

    static {
        Pattern compile = Pattern.compile("yandexmusic://non-music/?");
        compile.getClass();
        afm afmVar = new afm("YANDEXMUSIC", 0, compile);
        b = afmVar;
        Pattern compile2 = Pattern.compile("https://music\\.(?:yandex|ya)\\.(?:by|ru|ua|kz|com|uz)/non-music/?");
        compile2.getClass();
        afm afmVar2 = new afm("HTTPS", 1, compile2);
        c = afmVar2;
        d = new afm[]{afmVar, afmVar2};
    }

    public afm(String str, int i, Pattern pattern) {
        this.a = pattern;
    }

    public static afm valueOf(String str) {
        return (afm) Enum.valueOf(afm.class, str);
    }

    public static afm[] values() {
        return (afm[]) d.clone();
    }
}
