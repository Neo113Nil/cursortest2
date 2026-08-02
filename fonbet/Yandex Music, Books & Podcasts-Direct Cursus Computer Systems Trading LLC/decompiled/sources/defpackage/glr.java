package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public class glr {
    public static void a(Appendable appendable, CharSequence... charSequenceArr) {
        appendable.getClass();
        for (CharSequence charSequence : charSequenceArr) {
            appendable.append(charSequence);
        }
    }

    public static void b(StringBuilder sb, Object obj, Function1 function1) {
        if (function1 != null) {
            sb.append((CharSequence) function1.invoke(obj));
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
