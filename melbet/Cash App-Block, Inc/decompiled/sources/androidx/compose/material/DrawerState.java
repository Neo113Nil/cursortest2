package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import androidx.paging.CachedPageEventFlow$$ExternalSyntheticLambda0;
import androidx.work.Worker$$ExternalSyntheticLambda0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class DrawerState {
    public final AnchoredDraggableState anchoredDraggableState;

    public DrawerState(DrawerValue drawerValue, Function1 function1) {
        this.anchoredDraggableState = new AnchoredDraggableState(drawerValue, new CachedPageEventFlow$$ExternalSyntheticLambda0(this, 3), new Worker$$ExternalSyntheticLambda0(this, 2), DrawerKt.AnimationSpec, function1);
    }

    public final Density requireDensity() {
        throw new IllegalArgumentException(("The density on DrawerState (" + this + ") was not set. Did you use DrawerState with the Drawer composable?").toString());
    }
}
