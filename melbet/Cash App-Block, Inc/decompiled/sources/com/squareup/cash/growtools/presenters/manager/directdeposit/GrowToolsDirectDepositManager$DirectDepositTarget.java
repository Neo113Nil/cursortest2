package com.squareup.cash.growtools.presenters.manager.directdeposit;

import com.squareup.cash.growtools.presenters.manager.state.OriginSpecificData;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsManagerViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class GrowToolsDirectDepositManager$DirectDepositTarget implements OriginSpecificData.TargetData {
    public final int allocationBps;
    public final String altDescription;
    public final GrowToolsManagerViewModel.Loaded.Header.Target target;

    public GrowToolsDirectDepositManager$DirectDepositTarget(int i, GrowToolsManagerViewModel.Loaded.Header.Target target, String str) {
        str.getClass();
        this.allocationBps = i;
        this.target = target;
        this.altDescription = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GrowToolsDirectDepositManager$DirectDepositTarget)) {
            return false;
        }
        GrowToolsDirectDepositManager$DirectDepositTarget growToolsDirectDepositManager$DirectDepositTarget = (GrowToolsDirectDepositManager$DirectDepositTarget) obj;
        return this.allocationBps == growToolsDirectDepositManager$DirectDepositTarget.allocationBps && this.target.equals(growToolsDirectDepositManager$DirectDepositTarget.target) && Intrinsics.areEqual(this.altDescription, growToolsDirectDepositManager$DirectDepositTarget.altDescription);
    }

    @Override // com.squareup.cash.growtools.presenters.manager.state.OriginSpecificData.TargetData
    public final String getAltDescription() {
        return this.altDescription;
    }

    @Override // com.squareup.cash.growtools.presenters.manager.state.OriginSpecificData.TargetData
    public final GrowToolsManagerViewModel.Loaded.Header.Target getTarget() {
        return this.target;
    }

    public final int hashCode() {
        return this.altDescription.hashCode() + ((this.target.hashCode() + (Integer.hashCode(this.allocationBps) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DirectDepositTarget(allocationBps=");
        sb.append(this.allocationBps);
        sb.append(", target=");
        sb.append(this.target);
        sb.append(", altDescription=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.altDescription, ")");
    }
}
