package androidx.compose.ui.graphics.vector;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;
import coil3.Extras;
import com.squareup.contour.ContourLayout$geometry$1;
import com.squareup.wire.GrpcMethod;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class VectorPainter extends Painter {
    public float currentAlpha;
    public ColorFilter currentColorFilter;
    public final ParcelableSnapshotMutableState drawInvalidation$delegate;
    public final VectorComponent vector;
    public final ParcelableSnapshotMutableState size$delegate = Updater.mutableStateOf$default(new Size(0));
    public final ParcelableSnapshotMutableState autoMirror$delegate = Updater.mutableStateOf$default(Boolean.FALSE);

    public VectorPainter(GroupComponent groupComponent) {
        VectorComponent vectorComponent = new VectorComponent(groupComponent);
        vectorComponent.invalidateCallback = new ContourLayout$geometry$1(this, 2);
        this.vector = vectorComponent;
        this.drawInvalidation$delegate = new ParcelableSnapshotMutableState(Unit.INSTANCE, NeverEqualPolicy.INSTANCE);
        this.currentAlpha = 1.0f;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyAlpha(float f) {
        this.currentAlpha = f;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyColorFilter(ColorFilter colorFilter) {
        this.currentColorFilter = colorFilter;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long mo759getIntrinsicSizeNHjbRc() {
        return ((Size) this.size$delegate.getValue()).packedValue;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void onDraw(DrawScope drawScope) {
        ColorFilter colorFilter = this.currentColorFilter;
        VectorComponent vectorComponent = this.vector;
        if (colorFilter == null) {
            colorFilter = (ColorFilter) vectorComponent.intrinsicColorFilter$delegate.getValue();
        }
        if (((Boolean) this.autoMirror$delegate.getValue()).booleanValue() && drawScope.getLayoutDirection() == LayoutDirection.Rtl) {
            long mo752getCenterF1C5BW0 = drawScope.mo752getCenterF1C5BW0();
            GrpcMethod drawContext = drawScope.getDrawContext();
            long m3999getSizeNHjbRc = drawContext.m3999getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                ((Extras.Key) drawContext.path).m1437scale0AR0LA0(-1.0f, 1.0f, mo752getCenterF1C5BW0);
                vectorComponent.draw(drawScope, this.currentAlpha, colorFilter);
            } finally {
                Recorder$$ExternalSyntheticOutline2.m(drawContext, m3999getSizeNHjbRc);
            }
        } else {
            vectorComponent.draw(drawScope, this.currentAlpha, colorFilter);
        }
        this.drawInvalidation$delegate.getValue();
    }
}
