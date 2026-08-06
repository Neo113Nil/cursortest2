package defpackage;

import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class xa0 {
    public static String GWasM1elztuh(List list, String str, bCsSzSHkbaQ bcsszshkbaq, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        if ((i & 32) != 0) {
            bcsszshkbaq = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            if (bcsszshkbaq != null) {
                sb.append((CharSequence) bcsszshkbaq.mOu10nynGul(obj));
            } else if (obj != null ? obj instanceof CharSequence : true) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) obj.toString());
            }
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static final void X1lG3V04pd(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static final Void Yi7zF1RB1(String str) {
        throw new NoSuchElementException(str);
    }
}
