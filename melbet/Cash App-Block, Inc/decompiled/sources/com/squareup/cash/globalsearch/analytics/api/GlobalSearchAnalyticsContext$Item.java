package com.squareup.cash.globalsearch.analytics.api;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class GlobalSearchAnalyticsContext$Item {
    public final int absoluteItemIndex;
    public final int itemIndex;
    public final String key;
    public final int sectionIndex;

    public GlobalSearchAnalyticsContext$Item(String str, int i, int i2, int i3) {
        str.getClass();
        this.key = str;
        this.absoluteItemIndex = i;
        this.itemIndex = i2;
        this.sectionIndex = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GlobalSearchAnalyticsContext$Item)) {
            return false;
        }
        GlobalSearchAnalyticsContext$Item globalSearchAnalyticsContext$Item = (GlobalSearchAnalyticsContext$Item) obj;
        return Intrinsics.areEqual(this.key, globalSearchAnalyticsContext$Item.key) && this.absoluteItemIndex == globalSearchAnalyticsContext$Item.absoluteItemIndex && this.itemIndex == globalSearchAnalyticsContext$Item.itemIndex && this.sectionIndex == globalSearchAnalyticsContext$Item.sectionIndex;
    }

    public final int hashCode() {
        return Integer.hashCode(this.sectionIndex) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.itemIndex, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.absoluteItemIndex, this.key.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline1.m(this.itemIndex, this.sectionIndex, ", sectionIndex=", ")", Recorder$$ExternalSyntheticOutline2.m("Item(key=", this.absoluteItemIndex, this.key, ", absoluteItemIndex=", ", itemIndex="));
    }
}
