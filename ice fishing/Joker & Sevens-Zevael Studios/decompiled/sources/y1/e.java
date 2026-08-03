package y1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e extends b {

    /* renamed from: c, reason: collision with root package name */
    public static e f8504c;

    @Override // y1.b
    public final int[] a(int i10) {
        int length = c().length();
        if (length <= 0 || i10 >= length) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        while (i10 < length && c().charAt(i10) == '\n' && (c().charAt(i10) == '\n' || (i10 != 0 && c().charAt(i10 - 1) != '\n'))) {
            i10++;
        }
        if (i10 >= length) {
            return null;
        }
        int i11 = i10 + 1;
        while (i11 < length && !e(i11)) {
            i11++;
        }
        return b(i10, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        return null;
     */
    @Override // y1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] d(int i10) {
        int length = c().length();
        if (length <= 0 || i10 <= 0) {
            return null;
        }
        if (i10 > length) {
            i10 = length;
        }
        while (i10 > 0 && c().charAt(i10 - 1) == '\n' && !e(i10)) {
            i10--;
        }
        int i11 = i10 - 1;
        while (i11 > 0 && (c().charAt(i11) == '\n' || (i11 != 0 && c().charAt(i11 - 1) != '\n'))) {
            i11--;
        }
        return b(i11, i10);
    }

    public final boolean e(int i10) {
        if (i10 <= 0 || c().charAt(i10 - 1) == '\n') {
            return false;
        }
        return i10 == c().length() || c().charAt(i10) == '\n';
    }
}
