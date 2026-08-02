package com.squareup.cash.paychecks.presenters;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda5;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* loaded from: classes7.dex */
public final class AllocationGroupWithPercentage {
    public final List allocations;
    public final KClass destinationType;
    public final List distributionIndicesLookup;
    public final Lazy percentageBps$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new MoneyTabUIKt$$ExternalSyntheticLambda5(this, 19));

    public AllocationGroupWithPercentage(KClass kClass, List list, List list2) {
        this.destinationType = kClass;
        this.allocations = list;
        this.distributionIndicesLookup = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllocationGroupWithPercentage)) {
            return false;
        }
        AllocationGroupWithPercentage allocationGroupWithPercentage = (AllocationGroupWithPercentage) obj;
        return Intrinsics.areEqual(this.destinationType, allocationGroupWithPercentage.destinationType) && this.allocations.equals(allocationGroupWithPercentage.allocations) && this.distributionIndicesLookup.equals(allocationGroupWithPercentage.distributionIndicesLookup);
    }

    public final long getPercentageBps() {
        return ((Number) this.percentageBps$delegate.getValue()).longValue();
    }

    public final int hashCode() {
        return this.distributionIndicesLookup.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.destinationType.hashCode() * 31, 31, this.allocations);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AllocationGroupWithPercentage(destinationType=");
        sb.append(this.destinationType);
        sb.append(", allocations=");
        sb.append(this.allocations);
        sb.append(", distributionIndicesLookup=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.distributionIndicesLookup, ")");
    }
}
