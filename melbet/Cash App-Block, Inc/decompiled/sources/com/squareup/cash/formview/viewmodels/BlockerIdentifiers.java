package com.squareup.cash.formview.viewmodels;

import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class BlockerIdentifiers {
    public final String blockerId;
    public final BlockersData.Flow flow;
    public final Flow$Type flowType;

    public BlockerIdentifiers(BlockersData.Flow flow, Flow$Type flow$Type, String str) {
        flow.getClass();
        this.flow = flow;
        this.flowType = flow$Type;
        this.blockerId = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockerIdentifiers)) {
            return false;
        }
        BlockerIdentifiers blockerIdentifiers = (BlockerIdentifiers) obj;
        return this.flow == blockerIdentifiers.flow && this.flowType == blockerIdentifiers.flowType && Intrinsics.areEqual(this.blockerId, blockerIdentifiers.blockerId);
    }

    public final int hashCode() {
        int hashCode = this.flow.hashCode() * 31;
        Flow$Type flow$Type = this.flowType;
        int hashCode2 = (hashCode + (flow$Type == null ? 0 : flow$Type.hashCode())) * 31;
        String str = this.blockerId;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlockerIdentifiers(flow=");
        sb.append(this.flow);
        sb.append(", flowType=");
        sb.append(this.flowType);
        sb.append(", blockerId=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.blockerId, ")");
    }
}
