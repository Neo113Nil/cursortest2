package kotlin.text;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class h {
    public static final void a(StringBuilder sb, Object obj, Function1 function1) {
        CharSequence charSequenceValueOf;
        Intrinsics.checkNotNullParameter(sb, "<this>");
        if (function1 == null) {
            if (!(obj == null ? true : obj instanceof CharSequence)) {
                if (obj instanceof Character) {
                    sb.append(((Character) obj).charValue());
                    return;
                }
                charSequenceValueOf = String.valueOf(obj);
            }
            sb.append(charSequenceValueOf);
        }
        obj = function1.invoke(obj);
        charSequenceValueOf = (CharSequence) obj;
        sb.append(charSequenceValueOf);
    }
}
