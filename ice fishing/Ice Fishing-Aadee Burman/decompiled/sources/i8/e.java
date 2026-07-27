package i8;

import java.util.Comparator;

/* loaded from: classes2.dex */
public final class e implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String a9 = (String) obj;
        String b9 = (String) obj2;
        kotlin.jvm.internal.h.e(a9, "a");
        kotlin.jvm.internal.h.e(b9, "b");
        int min = Math.min(a9.length(), b9.length());
        for (int i = 4; i < min; i++) {
            char charAt = a9.charAt(i);
            char charAt2 = b9.charAt(i);
            if (charAt != charAt2) {
                return kotlin.jvm.internal.h.f(charAt, charAt2) < 0 ? -1 : 1;
            }
        }
        int length = a9.length();
        int length2 = b9.length();
        if (length != length2) {
            return length < length2 ? -1 : 1;
        }
        return 0;
    }
}
