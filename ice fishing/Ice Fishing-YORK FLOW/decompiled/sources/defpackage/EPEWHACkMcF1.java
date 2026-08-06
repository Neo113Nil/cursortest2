package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class EPEWHACkMcF1 extends defpackage.Jkfc0NcwyPL8 {
    public static defpackage.EPEWHACkMcF1 fWTAfUmVKrZq;

    public final boolean GE9mJIPrb8gP(int i) {
        if (i <= 0 || fWTAfUmVKrZq().charAt(i - 1) == '\n') {
            return false;
        }
        return i == fWTAfUmVKrZq().length() || fWTAfUmVKrZq().charAt(i) == '\n';
    }

    @Override // defpackage.Jkfc0NcwyPL8
    public final int[] ZpBGe2uQfcn8(int i) {
        int length = fWTAfUmVKrZq().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && fWTAfUmVKrZq().charAt(i) == '\n' && (fWTAfUmVKrZq().charAt(i) == '\n' || (i != 0 && fWTAfUmVKrZq().charAt(i - 1) != '\n'))) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !GE9mJIPrb8gP(i2)) {
            i2++;
        }
        return giKS3J6vZuNy(i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        return null;
     */
    @Override // defpackage.Jkfc0NcwyPL8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] e6mdH7fiFuta(int i) {
        int length = fWTAfUmVKrZq().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && fWTAfUmVKrZq().charAt(i - 1) == '\n' && !GE9mJIPrb8gP(i)) {
            i--;
        }
        int i2 = i - 1;
        while (i2 > 0 && (fWTAfUmVKrZq().charAt(i2) == '\n' || (i2 != 0 && fWTAfUmVKrZq().charAt(i2 - 1) != '\n'))) {
            i2--;
        }
        return giKS3J6vZuNy(i2, i);
    }
}
