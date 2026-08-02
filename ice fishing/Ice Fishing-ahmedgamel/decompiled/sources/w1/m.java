package w1;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final L1.f f41511a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f41512b;

    public m(L1.f fVar, Executor executor) {
        this.f41511a = fVar;
        this.f41512b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.f41511a.equals(((m) obj).f41511a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41511a.hashCode();
    }
}
