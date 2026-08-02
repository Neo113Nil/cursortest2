package com.squareup.cash.boost.db;

import androidx.compose.ui.node.NodeChain;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.driver.android.AndroidSqliteDriver;
import com.google.android.gms.internal.measurement.zzlj;
import com.squareup.cash.db2.ExpressivePaymentsStickerConfig;
import com.squareup.cash.db2.contacts.Alias$Adapter;
import com.squareup.cash.db2.profile.ScenarioPlan;
import com.squareup.cash.investing.db.categories.Category$Adapter;

/* loaded from: classes.dex */
public final class RewardSlotQueries extends TransacterImpl {
    public final Object rewardAdapter;
    public final Object rewardSlotAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardSlotQueries(AndroidSqliteDriver androidSqliteDriver, ScenarioPlan.Adapter adapter, Category$Adapter category$Adapter) {
        super(androidSqliteDriver);
        adapter.getClass();
        category$Adapter.getClass();
        this.rewardSlotAdapter = adapter;
        this.rewardAdapter = category$Adapter;
    }

    public /* synthetic */ RewardSlotQueries(AndroidSqliteDriver androidSqliteDriver, Object obj, Object obj2) {
        super(androidSqliteDriver);
        this.rewardSlotAdapter = obj;
        this.rewardAdapter = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardSlotQueries(AndroidSqliteDriver androidSqliteDriver, NodeChain nodeChain, zzlj zzljVar) {
        super(androidSqliteDriver);
        zzljVar.getClass();
        this.rewardSlotAdapter = nodeChain;
        this.rewardAdapter = zzljVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardSlotQueries(AndroidSqliteDriver androidSqliteDriver, Alias$Adapter alias$Adapter, Reward$Adapter reward$Adapter) {
        super(androidSqliteDriver);
        alias$Adapter.getClass();
        reward$Adapter.getClass();
        this.rewardSlotAdapter = alias$Adapter;
        this.rewardAdapter = reward$Adapter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardSlotQueries(AndroidSqliteDriver androidSqliteDriver, Category$Adapter category$Adapter, ExpressivePaymentsStickerConfig.Adapter adapter) {
        super(androidSqliteDriver);
        category$Adapter.getClass();
        adapter.getClass();
        this.rewardSlotAdapter = category$Adapter;
        this.rewardAdapter = adapter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardSlotQueries(AndroidSqliteDriver androidSqliteDriver, ExpressivePaymentsStickerConfig.Adapter adapter, zzlj zzljVar) {
        super(androidSqliteDriver);
        adapter.getClass();
        zzljVar.getClass();
        this.rewardSlotAdapter = adapter;
        this.rewardAdapter = zzljVar;
    }
}
