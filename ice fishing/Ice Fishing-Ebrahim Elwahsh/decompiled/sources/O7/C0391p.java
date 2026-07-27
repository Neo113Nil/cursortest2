package O7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: O7.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0391p {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2618b = AtomicIntegerFieldUpdater.newUpdater(C0391p.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f2619a;

    public C0391p(Throwable th, boolean z8) {
        this.f2619a = th;
        this._handled$volatile = z8 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f2619a + ']';
    }
}
