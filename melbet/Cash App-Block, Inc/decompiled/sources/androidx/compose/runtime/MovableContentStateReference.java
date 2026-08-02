package androidx.compose.runtime;

import androidx.compose.runtime.composer.gapbuffer.GapAnchor;
import androidx.compose.runtime.composer.gapbuffer.SlotTable;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class MovableContentStateReference {
    public abstract GapAnchor getAnchor$runtime();

    public abstract CompositionImpl getComposition$runtime();

    public abstract List getInvalidations$runtime();

    public abstract SlotTable getSlotStorage$runtime();
}
