package com.squareup.cash.money.applets.common.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class LoadingBalanceAppletTileKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LoadingAppletTileLayoutConfig f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ LoadingBalanceAppletTileKt$$ExternalSyntheticLambda3(LoadingAppletTileLayoutConfig loadingAppletTileLayoutConfig, boolean z, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = loadingAppletTileLayoutConfig;
        this.f$1 = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        boolean z = this.f$1;
        LoadingAppletTileLayoutConfig loadingAppletTileLayoutConfig = this.f$0;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                SharedUIKt.LoadingBalanceAppletTileContent(loadingAppletTileLayoutConfig, z, composer, Updater.updateChangedFlags(1));
                break;
            default:
                SharedUIKt.LoadingServiceAppletTileContent(loadingAppletTileLayoutConfig, z, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
