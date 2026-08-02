package androidx.compose.ui.layout;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.OwnedLayer;

/* loaded from: classes3.dex */
public final class ModifierInfo {
    public final NodeCoordinator coordinates;
    public final Object extra;
    public final Modifier modifier;

    public ModifierInfo(Modifier modifier, NodeCoordinator nodeCoordinator, OwnedLayer ownedLayer) {
        this.modifier = modifier;
        this.coordinates = nodeCoordinator;
        this.extra = ownedLayer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ModifierInfo(");
        sb.append(this.modifier);
        sb.append(", ");
        sb.append(this.coordinates);
        sb.append(", ");
        return Recorder$$ExternalSyntheticOutline1.m(sb, this.extra, ')');
    }
}
