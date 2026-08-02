package com.squareup.cardcustomizations.stampview;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.IntSize;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.arcade.MotionKt$$ExternalSyntheticLambda0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes5.dex */
public final class PatternStampState {
    public final ParcelableSnapshotMutableState canvasSize$delegate;
    public final ParcelableSnapshotMutableState clip$delegate;
    public final ParcelableSnapshotMutableState clipPath$delegate;
    public final ArrayDeque customizationDeque;
    public final SnapshotStateList fadingStamps;
    public final ParcelableSnapshotMutableState hasTrashBin$delegate;
    public final ParcelableSnapshotMutableState invalidate$delegate;
    public final ParcelableSnapshotMutableState isEnabled$delegate;
    public final ParcelableSnapshotMutableState margin$delegate;
    public final int maxBoxes;
    public final ParcelableSnapshotMutableState movingStamps$delegate;
    public final ParcelableSnapshotMutableState offClipStrokeColor$delegate;
    public Function0 onStampsChanged;
    public final ParcelableSnapshotMutableState originalMinScales$delegate;
    public final ParcelableSnapshotMutableState originalStamps$delegate;
    public final ParcelableSnapshotMutableState stampSaveArea$delegate;
    public final ParcelableSnapshotMutableState stamps$delegate;
    public final ParcelableSnapshotMutableState strokeColor$delegate;
    public final ParcelableSnapshotMutableState strokeWidth$delegate;
    public final ParcelableSnapshotMutableState trashBinAtTop$delegate;
    public boolean trashBinDirectionResolved;
    public final ParcelableSnapshotMutableIntState boxWidth$delegate = new ParcelableSnapshotMutableIntState(0);
    public final ParcelableSnapshotMutableIntState boxHeight$delegate = new ParcelableSnapshotMutableIntState(0);

    public PatternStampState(int i) {
        this.maxBoxes = i;
        EmptyList emptyList = EmptyList.INSTANCE;
        this.originalStamps$delegate = Updater.mutableStateOf$default(emptyList);
        this.originalMinScales$delegate = Updater.mutableStateOf$default(emptyList);
        this.stamps$delegate = Updater.mutableStateOf$default(emptyList);
        this.fadingStamps = new SnapshotStateList();
        this.canvasSize$delegate = Updater.mutableStateOf$default(new IntSize(0L));
        this.stampSaveArea$delegate = Updater.mutableStateOf$default(new RectF(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE));
        this.invalidate$delegate = Updater.mutableStateOf$default(0);
        this.clipPath$delegate = Updater.mutableStateOf$default(AndroidPath_androidKt.Path());
        this.strokeColor$delegate = Updater.mutableStateOf$default(new Color(Color.Red));
        this.offClipStrokeColor$delegate = Updater.mutableStateOf$default(new Color(Color.Blue));
        this.clip$delegate = Updater.mutableStateOf$default(RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f));
        this.margin$delegate = Updater.mutableStateOf$default(Float.valueOf(RecyclerView.DECELERATION_RATE));
        this.strokeWidth$delegate = Updater.mutableStateOf$default(Float.valueOf(4.0f));
        Boolean bool = Boolean.FALSE;
        this.isEnabled$delegate = Updater.mutableStateOf$default(bool);
        this.movingStamps$delegate = Updater.mutableStateOf$default(emptyList);
        this.hasTrashBin$delegate = Updater.mutableStateOf$default(bool);
        this.trashBinAtTop$delegate = Updater.mutableStateOf$default(bool);
        this.onStampsChanged = new MotionKt$$ExternalSyntheticLambda0(5);
        this.customizationDeque = new ArrayDeque();
    }

    public final void generateStampsFromOriginals() {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState;
        Pair pair;
        int i;
        int i2;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = this.originalStamps$delegate;
        if (((List) parcelableSnapshotMutableState2.getValue()).isEmpty()) {
            return;
        }
        ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        int size = ((List) parcelableSnapshotMutableState2.getValue()).size();
        int i3 = this.maxBoxes;
        int i4 = i3 + 2;
        ListBuilder listBuilder = new ListBuilder(i4 * i4);
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = this.boxHeight$delegate;
        int i5 = i3 + 1;
        IntProgression step = RangesKt___RangesKt.step(parcelableSnapshotMutableIntState.getIntValue(), RangesKt___RangesKt.until(-parcelableSnapshotMutableIntState.getIntValue(), parcelableSnapshotMutableIntState.getIntValue() * i5));
        int i6 = step.first;
        int i7 = step.last;
        int i8 = step.step;
        if ((i8 > 0 && i6 <= i7) || (i8 < 0 && i7 <= i6)) {
            int i9 = 0;
            while (true) {
                boolean z = (i6 / parcelableSnapshotMutableIntState.getIntValue()) % 2 == 0;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = this.boxWidth$delegate;
                if (z) {
                    parcelableSnapshotMutableState = parcelableSnapshotMutableState2;
                    pair = new Pair(Integer.valueOf(-parcelableSnapshotMutableIntState2.getIntValue()), Integer.valueOf(parcelableSnapshotMutableIntState2.getIntValue() * i5));
                } else {
                    parcelableSnapshotMutableState = parcelableSnapshotMutableState2;
                    pair = new Pair(Integer.valueOf(-(parcelableSnapshotMutableIntState2.getIntValue() / 2)), Integer.valueOf(parcelableSnapshotMutableIntState2.getIntValue() * i3));
                }
                IntProgression step2 = RangesKt___RangesKt.step(parcelableSnapshotMutableIntState2.getIntValue(), RangesKt___RangesKt.until(((Number) pair.first).intValue(), ((Number) pair.second).intValue()));
                int i10 = step2.first;
                int i11 = step2.last;
                int i12 = step2.step;
                if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
                    int i13 = i9;
                    while (true) {
                        int i14 = i12;
                        i = size;
                        i2 = i3;
                        listBuilder.add(new Pair(Integer.valueOf(((i13 % size) + size) % size), new PointF((parcelableSnapshotMutableIntState2.getIntValue() / 2.0f) + i10, (parcelableSnapshotMutableIntState.getIntValue() / 2.0f) + i6)));
                        i13++;
                        if (i10 == i11) {
                            break;
                        }
                        i10 += i14;
                        i12 = i14;
                        size = i;
                        i3 = i2;
                    }
                } else {
                    i = size;
                    i2 = i3;
                }
                if (!z) {
                    i9--;
                }
                if (i6 == i7) {
                    break;
                }
                i6 += i8;
                parcelableSnapshotMutableState2 = parcelableSnapshotMutableState;
                size = i;
                i3 = i2;
            }
        } else {
            parcelableSnapshotMutableState = parcelableSnapshotMutableState2;
        }
        ListIterator listIterator = CollectionsKt__CollectionsJVMKt.build(listBuilder).listIterator(0);
        while (true) {
            ListBuilder.Itr itr = (ListBuilder.Itr) listIterator;
            if (!itr.hasNext()) {
                setStamps$customizations(CollectionsKt__CollectionsJVMKt.build(createListBuilder));
                this.customizationDeque.push(getStamps$customizations());
                this.onStampsChanged.invoke();
                return;
            }
            Pair pair2 = (Pair) itr.next();
            int intValue = ((Number) pair2.first).intValue();
            PointF pointF = (PointF) pair2.second;
            Matrix matrix = new Matrix();
            float intValue2 = parcelableSnapshotMutableIntState.getIntValue() * 0.4f;
            float f = pointF.x;
            float f2 = pointF.y;
            RectF rectF = new RectF(f - intValue2, f2 - intValue2, f + intValue2, f2 + intValue2);
            Stamp stamp = (Stamp) ((List) parcelableSnapshotMutableState.getValue()).get(intValue);
            matrix.setRectToRect(stamp.getCanvasBounds(), rectF, Matrix.ScaleToFit.CENTER);
            createListBuilder.add(new TransformedStamp(stamp, matrix, ((Number) ((List) this.originalMinScales$delegate.getValue()).get(intValue)).floatValue() / 100.0f));
        }
    }

    public final int getInvalidate$customizations() {
        return ((Number) this.invalidate$delegate.getValue()).intValue();
    }

    public final List getMovingStamps() {
        return (List) this.movingStamps$delegate.getValue();
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

    public final int uniqueStamps() {
        List stamps$customizations = getStamps$customizations();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : stamps$customizations) {
            if (hashSet.add(((TransformedStamp) obj).renderedStamp.name)) {
                arrayList.add(obj);
            }
        }
        return arrayList.size();
    }
}
