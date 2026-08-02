package androidx.compose.ui.node;

import androidx.compose.ui.unit.DensityImpl;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import coil3.size.SizeKt;

/* loaded from: classes.dex */
public abstract class LayoutNodeKt {
    public static final DensityImpl DefaultDensity = SizeKt.Density$default();

    public static final Owner requireOwner(LayoutNode layoutNode) {
        Owner owner = layoutNode.owner;
        if (owner != null) {
            return owner;
        }
        throw Boxes$$ExternalSyntheticOutline1.m1150m("LayoutNode should be attached to an owner");
    }
}
