package com.squareup.cardcustomizations.stampview;

import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.IntSize;
import androidx.recyclerview.widget.RecyclerView;
import com.miteksystems.misnap.camera.a.b;
import com.squareup.cash.arcade.MotionKt$$ExternalSyntheticLambda0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class StampState {
    public final ParcelableSnapshotMutableState hasTrashBin$delegate;
    public final List initialState;
    public final ParcelableSnapshotMutableState isEnabled$delegate;
    public final ParcelableSnapshotMutableState movingStamp$delegate;
    public final ParcelableSnapshotMutableState trashBinAtTop$delegate;
    public boolean trashBinDirectionResolved;
    public Function0 onStampsChanged = new MotionKt$$ExternalSyntheticLambda0(6);
    public final ArrayDeque customizationDeque = new ArrayDeque();
    public final ParcelableSnapshotMutableState stamps$delegate = Updater.mutableStateOf$default(EmptyList.INSTANCE);
    public final SnapshotStateList fadingStamps = new SnapshotStateList();
    public final ParcelableSnapshotMutableState canvasSize$delegate = Updater.mutableStateOf$default(new IntSize(0));
    public final ParcelableSnapshotMutableState stampSaveArea$delegate = Updater.mutableStateOf$default(new RectF(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE));
    public final ParcelableSnapshotMutableState invalidate$delegate = Updater.mutableStateOf$default(0);
    public final ParcelableSnapshotMutableState clipPath$delegate = Updater.mutableStateOf$default(AndroidPath_androidKt.Path());
    public final ParcelableSnapshotMutableState strokeColor$delegate = Updater.mutableStateOf$default(new Color(Color.Red));
    public final ParcelableSnapshotMutableState offClipStrokeColor$delegate = Updater.mutableStateOf$default(new Color(Color.Blue));
    public final ParcelableSnapshotMutableState clip$delegate = Updater.mutableStateOf$default(RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f));
    public final ParcelableSnapshotMutableState margin$delegate = Updater.mutableStateOf$default(Float.valueOf(RecyclerView.DECELERATION_RATE));
    public final ParcelableSnapshotMutableState strokeWidth$delegate = Updater.mutableStateOf$default(Float.valueOf(4.0f));

    public StampState(List list) {
        this.initialState = list;
        Boolean bool = Boolean.FALSE;
        this.isEnabled$delegate = Updater.mutableStateOf$default(bool);
        this.movingStamp$delegate = Updater.mutableStateOf$default(null);
        this.hasTrashBin$delegate = Updater.mutableStateOf$default(bool);
        this.trashBinAtTop$delegate = Updater.mutableStateOf$default(bool);
    }

    public final void addStamp(Stamp stamp, RectF rectF, int i) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(stamp.getCanvasBounds(), rectF, Matrix.ScaleToFit.CENTER);
        ArrayList plus = CollectionsKt.plus((Collection) getStamps$customizations(), (Object) new TransformedStamp(stamp, matrix, i / 100.0f));
        this.customizationDeque.push(plus);
        this.stamps$delegate.setValue(plus);
        this.onStampsChanged.invoke();
    }

    public final boolean commitPatternStamp(PatternStampState patternStampState) {
        boolean z = !patternStampState.getStamps$customizations().isEmpty();
        for (TransformedStamp transformedStamp : patternStampState.getStamps$customizations()) {
            if (RectF.intersects((RectF) this.stampSaveArea$delegate.getValue(), transformedStamp.bounds())) {
                this.stamps$delegate.setValue(CollectionsKt.plus((Collection) getStamps$customizations(), (Object) transformedStamp));
            }
        }
        this.customizationDeque.push(getStamps$customizations());
        return z;
    }

    public final int getInvalidate$customizations() {
        return ((Number) this.invalidate$delegate.getValue()).intValue();
    }

    public final TransformedStamp getMovingStamp() {
        return (TransformedStamp) this.movingStamp$delegate.getValue();
    }

    public final b.a getSavedState() {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.canvasSize$delegate;
        long j = ((IntSize) parcelableSnapshotMutableState.getValue()).packedValue;
        long j2 = ((IntSize) parcelableSnapshotMutableState.getValue()).packedValue;
        ColorKt.m694toArgb8_81llA(((Color) this.strokeColor$delegate.getValue()).value);
        ((Number) this.strokeWidth$delegate.getValue()).floatValue();
        return new b.a(getStamps$customizations(), 2);
    }

    public final List getStamps$customizations() {
        return (List) this.stamps$delegate.getValue();
    }

    public final void setEnabled(boolean z) {
        this.isEnabled$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setStamps$customizations(List list) {
        list.getClass();
        this.stamps$delegate.setValue(list);
    }

    public final void undo() {
        ArrayDeque arrayDeque = this.customizationDeque;
        if (!arrayDeque.isEmpty()) {
            arrayDeque.pop();
        }
        List list = (List) arrayDeque.peek();
        if (list == null) {
            list = EmptyList.INSTANCE;
        }
        setStamps$customizations(list);
        this.invalidate$delegate.setValue(Integer.valueOf(getInvalidate$customizations() + 1));
    }
}
