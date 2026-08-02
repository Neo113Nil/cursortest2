package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class o1f extends ArrayList implements List, p1f {
    private static final long serialVersionUID = 3957988303675231981L;

    public static String n(List list) {
        if (list == null) {
            return "null";
        }
        StringBuffer stringBuffer = new StringBuffer("[");
        boolean z = true;
        for (Object obj : list) {
            if (z) {
                z = false;
            } else {
                stringBuffer.append(',');
            }
            if (obj == null) {
                stringBuffer.append("null");
            } else {
                stringBuffer.append(lxe.H(obj));
            }
        }
        stringBuffer.append(']');
        return stringBuffer.toString();
    }
}
