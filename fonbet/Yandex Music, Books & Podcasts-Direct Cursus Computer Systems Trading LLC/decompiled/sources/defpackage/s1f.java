package defpackage;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class s1f extends HashMap implements Map, p1f {
    private static final long serialVersionUID = -503443796854799292L;

    public static String b(Map map) {
        if (map == null) {
            return "null";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('{');
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (z) {
                z = false;
            } else {
                stringBuffer.append(',');
            }
            String valueOf = String.valueOf(entry.getKey());
            Object value = entry.getValue();
            stringBuffer.append('\"');
            lxe.k(valueOf, stringBuffer);
            stringBuffer.append('\"');
            stringBuffer.append(':');
            stringBuffer.append(lxe.H(value));
        }
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
