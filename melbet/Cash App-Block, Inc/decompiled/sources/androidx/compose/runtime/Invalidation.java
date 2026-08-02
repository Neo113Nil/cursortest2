package androidx.compose.runtime;

/* loaded from: classes.dex */
public final class Invalidation {
    public Object instances;
    public int location;
    public final RecomposeScopeImpl scope;

    public Invalidation(RecomposeScopeImpl recomposeScopeImpl, int i, Object obj) {
        this.scope = recomposeScopeImpl;
        this.location = i;
        this.instances = obj;
    }
}
