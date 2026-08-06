package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class ci0 {
    public static java.lang.String ZpBGe2uQfcn8(java.util.List list, java.lang.String str, defpackage.y10 y10Var, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        java.lang.String str2 = (i & 2) != 0 ? "" : "[\n\t";
        java.lang.String str3 = (i & 4) == 0 ? "\n]" : "";
        if ((i & 32) != 0) {
            y10Var = null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.CharSequence) str2);
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            java.lang.Object obj = list.get(i3);
            i2++;
            if (i2 > 1) {
                sb.append((java.lang.CharSequence) str);
            }
            if (y10Var != null) {
                sb.append((java.lang.CharSequence) y10Var.P05cfTpS5W5L(obj));
            } else if (obj != null ? obj instanceof java.lang.CharSequence : true) {
                sb.append((java.lang.CharSequence) obj);
            } else if (obj instanceof java.lang.Character) {
                sb.append(((java.lang.Character) obj).charValue());
            } else {
                sb.append((java.lang.CharSequence) obj.toString());
            }
        }
        sb.append((java.lang.CharSequence) str3);
        return sb.toString();
    }

    public static final void fWTAfUmVKrZq(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException(str);
    }

    public static final java.lang.Void giKS3J6vZuNy(java.lang.String str) {
        throw new java.util.NoSuchElementException(str);
    }
}
