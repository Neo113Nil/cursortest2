package defpackage;

/* loaded from: classes9.dex */
public class uuu0 {
    public static void a(StringBuilder sb, Object obj, tls tlsVar) {
        if (tlsVar != null) {
            sb.append((CharSequence) tlsVar.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }
}
