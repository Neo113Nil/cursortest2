package com.squareup.cash.pools.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PoolSection {
    public final boolean isOwned;
    public final ArrayList poolsList;
    public final String title;

    public PoolSection(String str, ArrayList arrayList, boolean z) {
        str.getClass();
        this.title = str;
        this.isOwned = z;
        this.poolsList = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoolSection)) {
            return false;
        }
        PoolSection poolSection = (PoolSection) obj;
        return Intrinsics.areEqual(this.title, poolSection.title) && this.isOwned == poolSection.isOwned && this.poolsList.equals(poolSection.poolsList);
    }

    public final int hashCode() {
        return this.poolsList.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.isOwned);
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline1.m(")", Request$Priority$EnumUnboxingLocalUtility.m1540m("PoolSection(title=", this.title, ", isOwned=", ", poolsList=", this.isOwned), this.poolsList);
    }
}
