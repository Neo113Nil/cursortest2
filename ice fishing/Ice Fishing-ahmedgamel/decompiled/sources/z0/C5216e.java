package z0;

import com.google.android.gms.internal.ads.Wv;

/* renamed from: z0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5216e extends RuntimeException {

    /* renamed from: n, reason: collision with root package name */
    public final int f42202n;

    /* renamed from: u, reason: collision with root package name */
    public final Throwable f42203u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5216e(int i, Throwable th) {
        super(th);
        Wv.n(i, "callbackName");
        this.f42202n = i;
        this.f42203u = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f42203u;
    }
}
