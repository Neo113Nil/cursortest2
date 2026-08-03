package i4;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e extends RuntimeException {

    /* renamed from: g, reason: collision with root package name */
    public final int f3176g;

    /* renamed from: h, reason: collision with root package name */
    public final Throwable f3177h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i10, Throwable th) {
        super(th);
        a4.d.t("callbackName", i10);
        this.f3176g = i10;
        this.f3177h = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f3177h;
    }
}
