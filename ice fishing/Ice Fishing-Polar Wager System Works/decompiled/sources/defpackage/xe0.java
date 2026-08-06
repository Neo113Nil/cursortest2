package defpackage;

/* loaded from: classes.dex */
public abstract class xe0 {
    public static java.lang.String IHQe1A4L2xu(java.util.List list, java.lang.String str, defpackage.uc0 uc0Var, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        if ((i & 32) != 0) {
            uc0Var = null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.CharSequence) "");
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            java.lang.Object obj = list.get(i3);
            i2++;
            if (i2 > 1) {
                sb.append((java.lang.CharSequence) str);
            }
            if (uc0Var != null) {
                sb.append((java.lang.CharSequence) uc0Var.AARZUJiTa(obj));
            } else if (obj != null ? obj instanceof java.lang.CharSequence : true) {
                sb.append((java.lang.CharSequence) obj);
            } else if (obj instanceof java.lang.Character) {
                sb.append(((java.lang.Character) obj).charValue());
            } else {
                sb.append((java.lang.CharSequence) obj.toString());
            }
        }
        sb.append((java.lang.CharSequence) "");
        return sb.toString();
    }

    public static final java.lang.Void oh6vYeIP(java.lang.String str) {
        throw new java.util.NoSuchElementException(str);
    }

    public static final void r1MBDhnF(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException(str);
    }
}
