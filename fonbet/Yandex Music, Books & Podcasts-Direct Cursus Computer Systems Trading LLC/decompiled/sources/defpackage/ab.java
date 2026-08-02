package defpackage;

/* loaded from: classes.dex */
public final class ab extends b6 {
    public static ab d;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        return null;
     */
    @Override // defpackage.b6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] G(int i) {
        int length = t().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && t().charAt(i - 1) == '\n' && !O(i)) {
            i--;
        }
        int i2 = i - 1;
        while (i2 > 0 && (t().charAt(i2) == '\n' || (i2 != 0 && t().charAt(i2 - 1) != '\n'))) {
            i2--;
        }
        return s(i2, i);
    }

    public final boolean O(int i) {
        if (i <= 0 || t().charAt(i - 1) == '\n') {
            return false;
        }
        return i == t().length() || t().charAt(i) == '\n';
    }

    @Override // defpackage.b6
    public final int[] o(int i) {
        int length = t().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && t().charAt(i) == '\n' && (t().charAt(i) == '\n' || (i != 0 && t().charAt(i - 1) != '\n'))) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !O(i2)) {
            i2++;
        }
        return s(i, i2);
    }
}
