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
public final class unq {
    public static final unq b;
    public static final unq c;
    public static final /* synthetic */ unq[] d;
    public final Pattern a;

    static {
        Pattern compile = Pattern.compile("yandexmusic://home(?:/([^/]+)/?|/?)");
        compile.getClass();
        unq unqVar = new unq("YANDEXMUSIC", 0, compile);
        b = unqVar;
        Pattern compile2 = Pattern.compile("https://music\\.(?:yandex|ya)\\.(?:by|ru|ua|kz|com|uz)/home(?:/([^/]+)/?|/?)");
        compile2.getClass();
        unq unqVar2 = new unq("HTTPS", 1, compile2);
        c = unqVar2;
        d = new unq[]{unqVar, unqVar2};
    }

    public unq(String str, int i, Pattern pattern) {
        this.a = pattern;
    }

    public static unq valueOf(String str) {
        return (unq) Enum.valueOf(unq.class, str);
    }

    public static unq[] values() {
        return (unq[]) d.clone();
    }
}
