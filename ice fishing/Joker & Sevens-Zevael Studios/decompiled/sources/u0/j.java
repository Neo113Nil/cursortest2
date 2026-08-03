package u0;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class j extends CancellationException {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6679g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, int i10) {
        super(str);
        this.f6679g = i10;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f6679g) {
            case 0:
                setStackTrace(e.f6669b);
                break;
            default:
                setStackTrace(u1.b.f6684a);
                break;
        }
        return this;
    }
}
