package com.squareup.cash.money.analytics;

import dev.zacsweers.metro.internal.Factory;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;

/* loaded from: classes6.dex */
public final class RealMoneyAnalyticsContext {
    public LinkedHashMap itemIdsByIndexes;
    public Map itemsByIds;
    public List sectionIds;
    public List sectionItemOffsets;
    public List sectionTotals;

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new RealMoneyAnalyticsContext();
        }
    }

    public RealMoneyAnalyticsContext() {
        EmptyList emptyList = EmptyList.INSTANCE;
        this.sectionIds = emptyList;
        this.sectionItemOffsets = emptyList;
        this.sectionTotals = emptyList;
        this.itemIdsByIndexes = new LinkedHashMap();
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        this.itemsByIds = emptyMap;
    }
}
