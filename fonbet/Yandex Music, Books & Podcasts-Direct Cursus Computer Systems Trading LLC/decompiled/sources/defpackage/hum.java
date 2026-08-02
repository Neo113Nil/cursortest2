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
public final class hum {
    public static final hum b;
    public static final /* synthetic */ hum[] c;
    public final Pattern a;

    static {
        Pattern compile = Pattern.compile("yandexmusic://profile/?");
        compile.getClass();
        hum humVar = new hum(compile);
        b = humVar;
        c = new hum[]{humVar};
    }

    public hum(Pattern pattern) {
        this.a = pattern;
    }

    public static hum valueOf(String str) {
        return (hum) Enum.valueOf(hum.class, str);
    }

    public static hum[] values() {
        return (hum[]) c.clone();
    }
}
