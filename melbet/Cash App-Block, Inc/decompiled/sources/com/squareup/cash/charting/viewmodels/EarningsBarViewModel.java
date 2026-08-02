package com.squareup.cash.charting.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class EarningsBarViewModel {
    public final Color color;
    public final String contentDescription;
    public final String displayLabel;
    public final String displayValue;
    public final boolean isLabelVisible;
    public final String label;
    public final long value;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Color {
        public static final /* synthetic */ EnumEntriesList $ENTRIES;
        public static final /* synthetic */ Color[] $VALUES;
        public static final Color ACTIVE;
        public static final Color DISABLED;
        public static final Color FUTURE;

        static {
            Color color = new Color("ACTIVE", 0);
            ACTIVE = color;
            Color color2 = new Color("DISABLED", 1);
            DISABLED = color2;
            Color color3 = new Color("FUTURE", 2);
            FUTURE = color3;
            Color[] colorArr = {color, color2, color3};
            $VALUES = colorArr;
            $ENTRIES = new EnumEntriesList(colorArr);
        }

        public static Color valueOf(String str) {
            return (Color) Enum.valueOf(Color.class, str);
        }

        public static Color[] values() {
            return (Color[]) $VALUES.clone();
        }
    }

    public /* synthetic */ EarningsBarViewModel(String str, boolean z, long j, Color color) {
        this(str, z, j, color, str, String.valueOf(j), str + ": " + j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarningsBarViewModel)) {
            return false;
        }
        EarningsBarViewModel earningsBarViewModel = (EarningsBarViewModel) obj;
        return Intrinsics.areEqual(this.label, earningsBarViewModel.label) && this.isLabelVisible == earningsBarViewModel.isLabelVisible && this.value == earningsBarViewModel.value && this.color == earningsBarViewModel.color && Intrinsics.areEqual(this.displayLabel, earningsBarViewModel.displayLabel) && Intrinsics.areEqual(this.displayValue, earningsBarViewModel.displayValue) && Intrinsics.areEqual(this.contentDescription, earningsBarViewModel.contentDescription);
    }

    public final int hashCode() {
        return this.contentDescription.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.color.hashCode() + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.label.hashCode() * 31, 31, this.isLabelVisible), 31, this.value)) * 31, 31, this.displayLabel), 31, this.displayValue);
    }

    public final String toString() {
        StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("EarningsBarViewModel(label=", this.label, ", isLabelVisible=", ", value=", this.isLabelVisible);
        m1540m.append(this.value);
        m1540m.append(", color=");
        m1540m.append(this.color);
        Boxes$$ExternalSyntheticOutline1.m(m1540m, ", displayLabel=", this.displayLabel, ", displayValue=", this.displayValue);
        return Recorder$$ExternalSyntheticOutline2.m(m1540m, ", contentDescription=", this.contentDescription, ")");
    }

    public EarningsBarViewModel(String str, boolean z, long j, Color color, String str2, String str3, String str4) {
        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str3, str4);
        this.label = str;
        this.isLabelVisible = z;
        this.value = j;
        this.color = color;
        this.displayLabel = str2;
        this.displayValue = str3;
        this.contentDescription = str4;
    }
}
