package z0;

import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;

/* renamed from: z0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5249e extends RuntimeException {

    /* renamed from: n, reason: collision with root package name */
    public final int f42231n;

    /* renamed from: u, reason: collision with root package name */
    public final Throwable f42232u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5249e(int i, Throwable th) {
        super(th);
        AbstractC4404f.l(i, "callbackName");
        this.f42231n = i;
        this.f42232u = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f42232u;
    }
}
