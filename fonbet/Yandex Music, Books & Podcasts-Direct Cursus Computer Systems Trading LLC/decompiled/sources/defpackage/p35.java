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
public final class p35 {
    public static final p35 b;
    public static final /* synthetic */ p35[] c;
    public final Pattern a;

    static {
        Pattern compile = Pattern.compile("yandexmusic://mymusic/?");
        compile.getClass();
        p35 p35Var = new p35(compile);
        b = p35Var;
        c = new p35[]{p35Var};
    }

    public p35(Pattern pattern) {
        this.a = pattern;
    }

    public static p35 valueOf(String str) {
        return (p35) Enum.valueOf(p35.class, str);
    }

    public static p35[] values() {
        return (p35[]) c.clone();
    }
}
