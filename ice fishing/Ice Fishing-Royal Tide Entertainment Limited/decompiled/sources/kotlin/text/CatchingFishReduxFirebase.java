package kotlin.text;

import java.util.List;

/* loaded from: classes.dex */
public abstract class CatchingFishReduxFirebase {
    public static String CatchingFishParcelableFAB(String str, List list) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            if (obj != null ? obj instanceof CharSequence : true) {
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

    public static final void CatchingFishSnackbar(String str) {
        throw new UnsupportedOperationException(str);
    }
}
