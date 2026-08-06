package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class Uxq83abb04 extends J3Xc8BaqpN8 {
    public static Uxq83abb04 X1lG3V04pd;

    @Override // defpackage.J3Xc8BaqpN8
    public final int[] GWasM1elztuh(int i) {
        int length = X1lG3V04pd().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && X1lG3V04pd().charAt(i) == '\n' && (X1lG3V04pd().charAt(i) == '\n' || (i != 0 && X1lG3V04pd().charAt(i - 1) != '\n'))) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !OOA6hdeuvCS(i2)) {
            i2++;
        }
        return Yi7zF1RB1(i, i2);
    }

    public final boolean OOA6hdeuvCS(int i) {
        if (i <= 0 || X1lG3V04pd().charAt(i - 1) == '\n') {
            return false;
        }
        return i == X1lG3V04pd().length() || X1lG3V04pd().charAt(i) == '\n';
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        return null;
     */
    @Override // defpackage.J3Xc8BaqpN8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] xqGvceK5x(int i) {
        int length = X1lG3V04pd().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && X1lG3V04pd().charAt(i - 1) == '\n' && !OOA6hdeuvCS(i)) {
            i--;
        }
        int i2 = i - 1;
        while (i2 > 0 && (X1lG3V04pd().charAt(i2) == '\n' || (i2 != 0 && X1lG3V04pd().charAt(i2 - 1) != '\n'))) {
            i2--;
        }
        return Yi7zF1RB1(i2, i);
    }
}
