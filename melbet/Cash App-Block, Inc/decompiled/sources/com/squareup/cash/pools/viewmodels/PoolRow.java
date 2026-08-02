package com.squareup.cash.pools.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;

/* loaded from: classes6.dex */
public final class PoolRow {
    public final float goalProgressPercent;
    public final ImmutableList participants;
    public final String poolToken;
    public final String rowEndLabel;
    public final String secondaryLabel;
    public final String tertiaryLabel;
    public final String title;

    public PoolRow(String str, String str2, String str3, String str4, String str5, float f, AbstractPersistentList abstractPersistentList) {
        str.getClass();
        str3.getClass();
        abstractPersistentList.getClass();
        this.poolToken = str;
        this.title = str2;
        this.secondaryLabel = str3;
        this.tertiaryLabel = str4;
        this.rowEndLabel = str5;
        this.goalProgressPercent = f;
        this.participants = abstractPersistentList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoolRow)) {
            return false;
        }
        PoolRow poolRow = (PoolRow) obj;
        return Intrinsics.areEqual(this.poolToken, poolRow.poolToken) && this.title.equals(poolRow.title) && Intrinsics.areEqual(this.secondaryLabel, poolRow.secondaryLabel) && this.tertiaryLabel.equals(poolRow.tertiaryLabel) && this.rowEndLabel.equals(poolRow.rowEndLabel) && Float.compare(this.goalProgressPercent, poolRow.goalProgressPercent) == 0 && Intrinsics.areEqual(this.participants, poolRow.participants);
    }

    public final int hashCode() {
        return this.participants.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.goalProgressPercent, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.poolToken.hashCode() * 31, 31, this.title), 31, this.secondaryLabel), 31, this.tertiaryLabel), 31, this.rowEndLabel), 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PoolRow(poolToken=", this.poolToken, ", title=", this.title, ", secondaryLabel=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.secondaryLabel, ", tertiaryLabel=", this.tertiaryLabel, ", rowEndLabel=");
        m.append(this.rowEndLabel);
        m.append(", goalProgressPercent=");
        m.append(this.goalProgressPercent);
        m.append(", participants=");
        m.append(this.participants);
        m.append(")");
        return m.toString();
    }
}
