package v2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b extends Throwable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7187g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, int i10) {
        super(str);
        this.f7187g = i10;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        int i10 = this.f7187g;
        synchronized (this) {
            switch (i10) {
            }
            return this;
        }
    }
}
