package J1;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class f implements Comparator {
    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return -1;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        String a2 = (String) obj;
        String b2 = (String) obj2;
        kotlin.jvm.internal.i.e(a2, "a");
        kotlin.jvm.internal.i.e(b2, "b");
        int min = Math.min(a2.length(), b2.length());
        int i2 = 4;
        while (true) {
            if (i2 < min) {
                char charAt = a2.charAt(i2);
                char charAt2 = b2.charAt(i2);
                if (charAt == charAt2) {
                    i2++;
                } else if (kotlin.jvm.internal.i.f(charAt, charAt2) >= 0) {
                    return 1;
                }
            } else {
                int length = a2.length();
                int length2 = b2.length();
                if (length == length2) {
                    return 0;
                }
                if (length >= length2) {
                    return 1;
                }
            }
        }
    }
}
