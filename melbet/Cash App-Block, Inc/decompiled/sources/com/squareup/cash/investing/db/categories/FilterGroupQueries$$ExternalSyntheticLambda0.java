package com.squareup.cash.investing.db.categories;

import app.cash.sqldelight.driver.android.AndroidCursor;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.db2.ExpressivePaymentsStickerConfig;
import com.squareup.cash.investing.primitives.CategoryToken;
import com.squareup.cash.investing.primitives.FilterToken;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.common.SyncInvestmentCategory;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class FilterGroupQueries$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RewardSlotQueries f$0;

    public /* synthetic */ FilterGroupQueries$$ExternalSyntheticLambda0(RewardSlotQueries rewardSlotQueries, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                FilterGroupQueries$filterGroupForToken$2 filterGroupQueries$filterGroupForToken$2 = FilterGroupQueries$filterGroupForToken$2.INSTANCE;
                break;
            case 2:
                int i2 = FilterGroupQueries$mapForToken$2.$r8$clinit;
                break;
        }
        this.f$0 = rewardSlotQueries;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v4, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v1, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v8, types: [byte[], java.io.Serializable] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CategoryToken categoryToken;
        int i = this.$r8$classId;
        RewardSlotQueries rewardSlotQueries = this.f$0;
        switch (i) {
            case 0:
                AndroidCursor androidCursor = (AndroidCursor) obj;
                androidCursor.getClass();
                ((ExpressivePaymentsStickerConfig.Adapter) rewardSlotQueries.rewardAdapter).getClass();
                String string2 = androidCursor.getString(0);
                string2.getClass();
                return new FilterToken(string2);
            case 1:
                FilterGroupQueries$filterGroupForToken$2 filterGroupQueries$filterGroupForToken$2 = FilterGroupQueries$filterGroupForToken$2.INSTANCE;
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                androidCursor2.getClass();
                ExpressivePaymentsStickerConfig.Adapter adapter = (ExpressivePaymentsStickerConfig.Adapter) rewardSlotQueries.rewardAdapter;
                Category$Adapter category$Adapter = (Category$Adapter) rewardSlotQueries.rewardSlotAdapter;
                adapter.getClass();
                String string3 = androidCursor2.getString(0);
                string3.getClass();
                FilterToken filterToken = new FilterToken(string3);
                String string4 = androidCursor2.getString(1);
                string4.getClass();
                ?? bytes = androidCursor2.getBytes(2);
                List list = bytes != 0 ? (List) adapter.effectsAdapter.decode(bytes) : null;
                ?? bytes2 = androidCursor2.getBytes(3);
                List list2 = bytes2 != 0 ? (List) adapter.tagsAdapter.decode(bytes2) : null;
                Long l = androidCursor2.getLong(4);
                String string5 = androidCursor2.getString(5);
                String string6 = androidCursor2.getString(6);
                if (string6 != null) {
                    category$Adapter.getClass();
                    categoryToken = new CategoryToken(string6);
                } else {
                    categoryToken = null;
                }
                String string7 = androidCursor2.getString(7);
                ?? bytes3 = androidCursor2.getBytes(8);
                Color color = bytes3 != 0 ? (Color) category$Adapter.category_colorAdapter.decode(bytes3) : null;
                String string8 = androidCursor2.getString(9);
                SyncInvestmentCategory.CategoryType categoryType = string8 != null ? (SyncInvestmentCategory.CategoryType) category$Adapter.typeAdapter.decode(string8) : null;
                String string9 = androidCursor2.getString(10);
                String string10 = androidCursor2.getString(11);
                String string11 = androidCursor2.getString(12);
                SyncInvestmentCategory.PrefixIcon prefixIcon = string11 != null ? (SyncInvestmentCategory.PrefixIcon) category$Adapter.prefix_iconAdapter.decode(string11) : null;
                String string12 = androidCursor2.getString(13);
                List list3 = list;
                List list4 = list2;
                string4.getClass();
                return new FilterGroupForToken(filterToken, string4, list3, list4, l, string5, categoryToken, string7, color, categoryType, string9, string10, prefixIcon, string12);
            default:
                int i2 = FilterGroupQueries$mapForToken$2.$r8$clinit;
                AndroidCursor androidCursor3 = (AndroidCursor) obj;
                androidCursor3.getClass();
                ?? bytes4 = androidCursor3.getBytes(0);
                return new MapForToken(bytes4 != 0 ? (List) ((ExpressivePaymentsStickerConfig.Adapter) rewardSlotQueries.rewardAdapter).tagsAdapter.decode(bytes4) : null);
        }
    }
}
