package com.squareup.cash.globalsearch.analytics.real;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.globalsearch.analytics.api.GlobalSearchAnalyticsContext$Item;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.zacsweers.metro.internal.Factory;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class RealGlobalSearchAnalyticsContext {
    public Map itemsByKey;
    public List sectionItemOffsets = EmptyList.INSTANCE;

    public final class GlobalSearchAnalyticsItem {
        public final int itemIndex;
        public final String key;
        public final int sectionIndex;

        public GlobalSearchAnalyticsItem(String str, int i, int i2) {
            str.getClass();
            this.key = str;
            this.itemIndex = i;
            this.sectionIndex = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GlobalSearchAnalyticsItem)) {
                return false;
            }
            GlobalSearchAnalyticsItem globalSearchAnalyticsItem = (GlobalSearchAnalyticsItem) obj;
            return Intrinsics.areEqual(this.key, globalSearchAnalyticsItem.key) && this.itemIndex == globalSearchAnalyticsItem.itemIndex && this.sectionIndex == globalSearchAnalyticsItem.sectionIndex;
        }

        public final int hashCode() {
            return Integer.hashCode(this.sectionIndex) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.itemIndex, this.key.hashCode() * 31, 31);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.sectionIndex, ")", Recorder$$ExternalSyntheticOutline2.m("GlobalSearchAnalyticsItem(key=", this.itemIndex, this.key, ", itemIndex=", ", sectionIndex="));
        }
    }

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new RealGlobalSearchAnalyticsContext();
        }
    }

    public RealGlobalSearchAnalyticsContext() {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        this.itemsByKey = emptyMap;
    }

    public final synchronized GlobalSearchAnalyticsContext$Item getItem(String str) {
        GlobalSearchAnalyticsContext$Item globalSearchAnalyticsContext$Item;
        str.getClass();
        GlobalSearchAnalyticsItem globalSearchAnalyticsItem = (GlobalSearchAnalyticsItem) this.itemsByKey.get(str);
        if (globalSearchAnalyticsItem != null) {
            int intValue = ((Number) this.sectionItemOffsets.get(globalSearchAnalyticsItem.sectionIndex)).intValue();
            int i = globalSearchAnalyticsItem.itemIndex;
            globalSearchAnalyticsContext$Item = new GlobalSearchAnalyticsContext$Item(str, intValue + i, i, globalSearchAnalyticsItem.sectionIndex);
        } else {
            globalSearchAnalyticsContext$Item = null;
        }
        return globalSearchAnalyticsContext$Item;
    }
}
