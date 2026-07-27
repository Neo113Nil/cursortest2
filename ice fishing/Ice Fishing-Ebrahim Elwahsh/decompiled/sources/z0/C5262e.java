package z0;

import com.google.android.gms.internal.ads.CL;

/* renamed from: z0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5262e extends RuntimeException {

    /* renamed from: n, reason: collision with root package name */
    public final int f42113n;

    /* renamed from: u, reason: collision with root package name */
    public final Throwable f42114u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5262e(int i, Throwable th) {
        super(th);
        CL.o(i, "callbackName");
        this.f42113n = i;
        this.f42114u = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f42114u;
    }
}
