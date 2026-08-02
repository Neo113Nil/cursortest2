package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.material.SnackbarHostKt$$ExternalSyntheticLambda2;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextRange;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkLauncherImpl;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes3.dex */
public final class TextFieldScrollerPosition {
    public static final WorkLauncherImpl Saver = ListSaverKt.listSaver(new SnackbarHostKt$$ExternalSyntheticLambda2(6), new BasicTextKt$$ExternalSyntheticLambda14(23));
    public final ParcelableSnapshotMutableFloatState offset$delegate;
    public final ParcelableSnapshotMutableState orientation$delegate;
    public final ParcelableSnapshotMutableFloatState maximum$delegate = new ParcelableSnapshotMutableFloatState(RecyclerView.DECELERATION_RATE);
    public final ParcelableSnapshotMutableIntState viewportSize$delegate = new ParcelableSnapshotMutableIntState(0);
    public Rect previousCursorRect = Rect.Zero;
    public long previousSelection = TextRange.Zero;

    public TextFieldScrollerPosition(Orientation orientation, float f) {
        this.offset$delegate = new ParcelableSnapshotMutableFloatState(f);
        this.orientation$delegate = new ParcelableSnapshotMutableState(orientation, NeverEqualPolicy.INSTANCE$3);
    }

    public final void update(Orientation orientation, Rect rect, int i, int i2) {
        float f = i2 - i;
        this.maximum$delegate.setFloatValue(f);
        float f2 = rect.left;
        float f3 = rect.top;
        Rect rect2 = this.previousCursorRect;
        float f4 = rect2.left;
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = this.offset$delegate;
        if (f2 != f4 || f3 != rect2.top) {
            boolean z = orientation == Orientation.Vertical;
            if (z) {
                f2 = f3;
            }
            float f5 = z ? rect.bottom : rect.right;
            float floatValue = parcelableSnapshotMutableFloatState.getFloatValue();
            float f6 = i;
            float f7 = floatValue + f6;
            parcelableSnapshotMutableFloatState.setFloatValue(parcelableSnapshotMutableFloatState.getFloatValue() + ((f5 <= f7 && (f2 >= floatValue || f5 - f2 <= f6)) ? (f2 >= floatValue || f5 - f2 > f6) ? 0.0f : f2 - floatValue : f5 - f7));
            this.previousCursorRect = rect;
        }
        parcelableSnapshotMutableFloatState.setFloatValue(RangesKt___RangesKt.coerceIn(parcelableSnapshotMutableFloatState.getFloatValue(), RecyclerView.DECELERATION_RATE, f));
        this.viewportSize$delegate.setIntValue(i);
    }
}
