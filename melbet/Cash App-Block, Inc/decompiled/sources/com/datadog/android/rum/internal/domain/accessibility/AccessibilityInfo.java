package com.datadog.android.rum.internal.domain.accessibility;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.rum.internal.domain.InfoData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class AccessibilityInfo implements InfoData {
    public final String textSize = null;
    public final Boolean isScreenReaderEnabled = null;
    public final Boolean isColorInversionEnabled = null;
    public final Boolean isClosedCaptioningEnabled = null;
    public final Boolean isReducedAnimationsEnabled = null;
    public final Boolean isScreenPinningEnabled = null;
    public final Boolean isRtlEnabled = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityInfo)) {
            return false;
        }
        AccessibilityInfo accessibilityInfo = (AccessibilityInfo) obj;
        return Intrinsics.areEqual(this.textSize, accessibilityInfo.textSize) && Intrinsics.areEqual(this.isScreenReaderEnabled, accessibilityInfo.isScreenReaderEnabled) && Intrinsics.areEqual(this.isColorInversionEnabled, accessibilityInfo.isColorInversionEnabled) && Intrinsics.areEqual(this.isClosedCaptioningEnabled, accessibilityInfo.isClosedCaptioningEnabled) && Intrinsics.areEqual(this.isReducedAnimationsEnabled, accessibilityInfo.isReducedAnimationsEnabled) && Intrinsics.areEqual(this.isScreenPinningEnabled, accessibilityInfo.isScreenPinningEnabled) && Intrinsics.areEqual(this.isRtlEnabled, accessibilityInfo.isRtlEnabled);
    }

    public final int hashCode() {
        String str = this.textSize;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isScreenReaderEnabled;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isColorInversionEnabled;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isClosedCaptioningEnabled;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isReducedAnimationsEnabled;
        int hashCode5 = (hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isScreenPinningEnabled;
        int hashCode6 = (hashCode5 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.isRtlEnabled;
        return hashCode6 + (bool6 != null ? bool6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = Thread$State$EnumUnboxingLocalUtility.m(this.isScreenReaderEnabled, "AccessibilityInfo(textSize=", this.textSize, ", isScreenReaderEnabled=", ", isColorInversionEnabled=");
        Thread$State$EnumUnboxingLocalUtility.m(m, this.isColorInversionEnabled, ", isClosedCaptioningEnabled=", this.isClosedCaptioningEnabled, ", isReducedAnimationsEnabled=");
        Thread$State$EnumUnboxingLocalUtility.m(m, this.isReducedAnimationsEnabled, ", isScreenPinningEnabled=", this.isScreenPinningEnabled, ", isRtlEnabled=");
        return Thread$State$EnumUnboxingLocalUtility.m(m, this.isRtlEnabled, ")");
    }
}
