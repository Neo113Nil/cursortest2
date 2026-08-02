package S7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: S7.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0402p {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3065b = AtomicIntegerFieldUpdater.newUpdater(C0402p.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f3066a;

    public C0402p(Throwable th, boolean z6) {
        this.f3066a = th;
        this._handled$volatile = z6 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f3066a + ']';
    }
}
