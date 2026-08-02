package androidx.compose.runtime;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.composer.gapbuffer.GapAnchor;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class RecomposeScopeImpl {
    public GapAnchor anchor;
    public Function2 block;
    public int currentToken;
    public int flags;
    public CompositionImpl owner;
    public MutableScatterMap trackedDependencies;
    public MutableObjectIntMap trackedInstances;

    public RecomposeScopeImpl(CompositionImpl compositionImpl) {
        this.owner = compositionImpl;
    }

    public final boolean getValid() {
        if (this.owner != null) {
            GapAnchor gapAnchor = this.anchor;
            if (gapAnchor != null ? gapAnchor.getValid() : false) {
                return true;
            }
        }
        return false;
    }

    public final InvalidationResult invalidateForResult(Object obj) {
        InvalidationResult invalidate;
        CompositionImpl compositionImpl = this.owner;
        return (compositionImpl == null || (invalidate = compositionImpl.invalidate(this, obj)) == null) ? InvalidationResult.IGNORED : invalidate;
    }

    public final void release() {
        CompositionImpl compositionImpl = this.owner;
        if (compositionImpl != null) {
            compositionImpl.pendingInvalidScopes = true;
            compositionImpl.observerHolder.current();
        }
        this.owner = null;
        this.trackedInstances = null;
        this.trackedDependencies = null;
        this.block = null;
    }

    public final void setRereading(boolean z) {
        int i = this.flags;
        this.flags = z ? i | 32 : i & (-33);
    }

    public final void updateScope(Function2 function2) {
        this.block = function2;
    }
}
