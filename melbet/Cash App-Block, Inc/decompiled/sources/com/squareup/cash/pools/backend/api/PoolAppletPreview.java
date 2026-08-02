package com.squareup.cash.pools.backend.api;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/pools/backend/api/PoolAppletPreview;", "", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PoolAppletPreview {
    public final long balance;
    public final long goal;
    public final String name;
    public final List participants;
    public final float progressPercent;

    public PoolAppletPreview(String str, List list, float f, long j, long j2) {
        list.getClass();
        this.name = str;
        this.participants = list;
        this.progressPercent = f;
        this.balance = j;
        this.goal = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoolAppletPreview)) {
            return false;
        }
        PoolAppletPreview poolAppletPreview = (PoolAppletPreview) obj;
        return Intrinsics.areEqual(this.name, poolAppletPreview.name) && Intrinsics.areEqual(this.participants, poolAppletPreview.participants) && Float.compare(this.progressPercent, poolAppletPreview.progressPercent) == 0 && this.balance == poolAppletPreview.balance && this.goal == poolAppletPreview.goal;
    }

    public final int hashCode() {
        String str = this.name;
        return Long.hashCode(this.goal) + Recorder$$ExternalSyntheticOutline2.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.progressPercent, Recorder$$ExternalSyntheticOutline2.m((str == null ? 0 : str.hashCode()) * 31, 31, this.participants), 31), 31, this.balance);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("PoolAppletPreview(name=", this.name, ", participants=", ", progressPercent=", this.participants);
        m.append(this.progressPercent);
        m.append(", balance=");
        m.append(this.balance);
        return Boxes$$ExternalSyntheticOutline1.m(this.goal, ", goal=", ")", m);
    }
}
