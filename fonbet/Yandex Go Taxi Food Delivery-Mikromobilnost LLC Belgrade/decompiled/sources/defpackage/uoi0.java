package defpackage;

/* loaded from: classes9.dex */
public class uoi0 {
    public static String a(lms lmsVar) {
        String obj = lmsVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}
