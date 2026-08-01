package x1;

import v1.i;
import v1.j;

/* loaded from: classes.dex */
public abstract class g extends a {
    public g(v1.d dVar) {
        super(dVar);
        if (dVar != null && dVar.h() != j.f4497a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // v1.d
    public final i h() {
        return j.f4497a;
    }
}
