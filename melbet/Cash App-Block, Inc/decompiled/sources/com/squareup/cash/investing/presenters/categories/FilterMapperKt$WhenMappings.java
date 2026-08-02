package com.squareup.cash.investing.presenters.categories;

import com.squareup.protos.franklin.common.SyncInvestmentFilterGroup;
import com.squareup.protos.franklin.common.Trigger;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class FilterMapperKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[SyncInvestmentFilterGroup.Subfilter.SubfilterType.values().length];
        try {
            Trigger.Companion companion = SyncInvestmentFilterGroup.Subfilter.SubfilterType.Companion;
            iArr[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            Trigger.Companion companion2 = SyncInvestmentFilterGroup.Subfilter.SubfilterType.Companion;
            iArr[2] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            Trigger.Companion companion3 = SyncInvestmentFilterGroup.Subfilter.SubfilterType.Companion;
            iArr[0] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
