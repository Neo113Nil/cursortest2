package y1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public String f8473a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f8474b = new int[2];

    public abstract int[] a(int i10);

    public final int[] b(int i10, int i11) {
        if (i10 < 0 || i11 < 0 || i10 == i11) {
            return null;
        }
        int[] iArr = this.f8474b;
        iArr[0] = i10;
        iArr[1] = i11;
        return iArr;
    }

    public final String c() {
        String str = this.f8473a;
        if (str != null) {
            return str;
        }
        pc.j.k("text");
        throw null;
    }

    public abstract int[] d(int i10);
}
