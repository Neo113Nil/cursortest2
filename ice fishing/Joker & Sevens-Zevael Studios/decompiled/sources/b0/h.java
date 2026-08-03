package b0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f825a;

    /* renamed from: b, reason: collision with root package name */
    public final int f826b;

    /* renamed from: c, reason: collision with root package name */
    public final x4.c f827c;

    public h(int i10, int i11, x4.c cVar) {
        this.f825a = i10;
        this.f826b = i11;
        this.f827c = cVar;
        if (i10 < 0) {
            throw new IllegalArgumentException(a4.d.g("startIndex should be >= 0, but was ", i10).toString());
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException(a4.d.g("size should be >0, but was ", i11).toString());
        }
    }
}
