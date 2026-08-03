package n6;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i extends UnsupportedOperationException {

    /* renamed from: g, reason: collision with root package name */
    public final m6.d f5077g;

    public i(m6.d dVar) {
        this.f5077g = dVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f5077g));
    }
}
