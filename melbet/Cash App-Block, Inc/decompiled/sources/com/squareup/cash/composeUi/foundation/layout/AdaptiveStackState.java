package com.squareup.cash.composeUi.foundation.layout;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class AdaptiveStackState {
    public final ParcelableSnapshotMutableState lastMeasuredOrientation$delegate = Updater.mutableStateOf$default(null);

    public interface MeasureResult {

        public final class PlaceHorizontally implements MeasureResult {
            public final int[] childWidths;
            public final int fixedSpace;
            public final int[] fixedSpaces;
            public final int weightChildrenCount;

            public PlaceHorizontally(int i, int i2, int[] iArr, int[] iArr2) {
                this.weightChildrenCount = i;
                this.fixedSpace = i2;
                this.fixedSpaces = iArr;
                this.childWidths = iArr2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PlaceHorizontally)) {
                    return false;
                }
                PlaceHorizontally placeHorizontally = (PlaceHorizontally) obj;
                return this.weightChildrenCount == placeHorizontally.weightChildrenCount && this.fixedSpace == placeHorizontally.fixedSpace && this.fixedSpaces.equals(placeHorizontally.fixedSpaces) && this.childWidths.equals(placeHorizontally.childWidths);
            }

            public final int hashCode() {
                return Arrays.hashCode(this.childWidths) + ((Arrays.hashCode(this.fixedSpaces) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.fixedSpace, Integer.hashCode(this.weightChildrenCount) * 31, 31)) * 31);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m107m(this.weightChildrenCount, this.fixedSpace, "PlaceHorizontally(weightChildrenCount=", ", fixedSpace=", ", fixedSpaces="), Arrays.toString(this.fixedSpaces), ", childWidths=", Arrays.toString(this.childWidths), ")");
            }
        }

        public final class PlaceVertically implements MeasureResult {
            public static final PlaceVertically INSTANCE = new PlaceVertically();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof PlaceVertically);
            }

            public final int hashCode() {
                return -761666581;
            }

            public final String toString() {
                return "PlaceVertically";
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class MeasuredOrientation {
        public static final /* synthetic */ MeasuredOrientation[] $VALUES;
        public static final MeasuredOrientation Horizontal;
        public static final MeasuredOrientation Vertical;

        static {
            MeasuredOrientation measuredOrientation = new MeasuredOrientation("Horizontal", 0);
            Horizontal = measuredOrientation;
            MeasuredOrientation measuredOrientation2 = new MeasuredOrientation("Vertical", 1);
            Vertical = measuredOrientation2;
            $VALUES = new MeasuredOrientation[]{measuredOrientation, measuredOrientation2};
        }

        public static MeasuredOrientation valueOf(String str) {
            return (MeasuredOrientation) Enum.valueOf(MeasuredOrientation.class, str);
        }

        public static MeasuredOrientation[] values() {
            return (MeasuredOrientation[]) $VALUES.clone();
        }
    }
}
