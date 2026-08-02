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
public final class wfn {
    public static final wfn b;
    public static final wfn c;
    public static final /* synthetic */ wfn[] d;
    public final Pattern a;

    static {
        Pattern compile = Pattern.compile("yandexmusic://(metatags/([^/]*?)|genres/?)");
        compile.getClass();
        wfn wfnVar = new wfn("YANDEXMUSIC", 0, compile);
        b = wfnVar;
        Pattern compile2 = Pattern.compile("https://music\\.(?:yandex|ya)\\.(?:by|ru|ua|kz|com|uz)/((genres)|(music/((genre)|(activity)|(mood)|(epoch))))");
        compile2.getClass();
        wfn wfnVar2 = new wfn("HTTPS_MUSIC", 1, compile2);
        c = wfnVar2;
        d = new wfn[]{wfnVar, wfnVar2};
    }

    public wfn(String str, int i, Pattern pattern) {
        this.a = pattern;
    }

    public static wfn valueOf(String str) {
        return (wfn) Enum.valueOf(wfn.class, str);
    }

    public static wfn[] values() {
        return (wfn[]) d.clone();
    }
}
