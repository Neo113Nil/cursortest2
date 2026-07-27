package u1;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final J1.f f41142a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f41143b;

    public m(J1.f fVar, Executor executor) {
        this.f41142a = fVar;
        this.f41143b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.f41142a.equals(((m) obj).f41142a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41142a.hashCode();
    }
}
