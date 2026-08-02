package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import androidx.paging.CachedPagingDataKt$cachedIn$5;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public abstract class DraggableKt {
    public static final CachedPagingDataKt$cachedIn$5 NoOpOnDragStarted;
    public static final CachedPagingDataKt$cachedIn$5 NoOpOnDragStopped;

    static {
        int i = 3;
        Continuation continuation = null;
        NoOpOnDragStarted = new CachedPagingDataKt$cachedIn$5(i, continuation, 1);
        NoOpOnDragStopped = new CachedPagingDataKt$cachedIn$5(i, continuation, 2);
    }

    public static Modifier draggable$default(Modifier modifier, DraggableState draggableState, Orientation orientation, boolean z, MutableInteractionSourceImpl mutableInteractionSourceImpl, boolean z2, Function3 function3, Function3 function32, boolean z3, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            mutableInteractionSourceImpl = null;
        }
        return modifier.then(new DraggableElement(draggableState, orientation, z4, mutableInteractionSourceImpl, z2, (i & 32) != 0 ? NoOpOnDragStarted : function3, function32, (i & 128) != 0 ? false : z3));
    }

    /* renamed from: toValidVelocity-TH1AsA0, reason: not valid java name */
    public static final long m222toValidVelocityTH1AsA0(long j) {
        boolean isNaN = Float.isNaN(Velocity.m1067getXimpl(j));
        float f = RecyclerView.DECELERATION_RATE;
        float m1067getXimpl = isNaN ? 0.0f : Velocity.m1067getXimpl(j);
        if (!Float.isNaN(Velocity.m1068getYimpl(j))) {
            f = Velocity.m1068getYimpl(j);
        }
        return VelocityKt.Velocity(m1067getXimpl, f);
    }
}
