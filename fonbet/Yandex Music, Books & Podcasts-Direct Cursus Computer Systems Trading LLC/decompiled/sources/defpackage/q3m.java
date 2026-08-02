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
public final class q3m {
    public static final q3m b;
    public static final q3m c;
    public static final /* synthetic */ q3m[] d;
    public final Pattern a;

    static {
        Pattern compile = Pattern.compile("yandexmusic://playlists/([^/\\?]+)/?");
        compile.getClass();
        q3m q3mVar = new q3m("YANDEXMUSIC", 0, compile);
        b = q3mVar;
        Pattern compile2 = Pattern.compile("https://music\\.(?:yandex|ya)\\.(?:by|ru|ua|kz|com|uz)/playlists/([^/\\?]+)/?");
        compile2.getClass();
        q3m q3mVar2 = new q3m("HTTPS", 1, compile2);
        c = q3mVar2;
        d = new q3m[]{q3mVar, q3mVar2};
    }

    public q3m(String str, int i, Pattern pattern) {
        this.a = pattern;
    }

    public static q3m valueOf(String str) {
        return (q3m) Enum.valueOf(q3m.class, str);
    }

    public static q3m[] values() {
        return (q3m[]) d.clone();
    }
}
