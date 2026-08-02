package defpackage;

/* loaded from: classes5.dex */
public class frn {
    public static String a(bzc bzcVar) {
        String obj = bzcVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}
