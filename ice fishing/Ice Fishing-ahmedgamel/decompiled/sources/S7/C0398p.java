package S7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: S7.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0398p {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2982b = AtomicIntegerFieldUpdater.newUpdater(C0398p.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f2983a;

    public C0398p(Throwable th, boolean z3) {
        this.f2983a = th;
        this._handled$volatile = z3 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f2983a + ']';
    }
}
