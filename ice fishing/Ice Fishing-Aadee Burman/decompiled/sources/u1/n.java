package u1;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final J1.f f41125a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f41126b;

    public n(J1.f fVar, Executor executor) {
        this.f41125a = fVar;
        this.f41126b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f41125a.equals(((n) obj).f41125a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41125a.hashCode();
    }
}
