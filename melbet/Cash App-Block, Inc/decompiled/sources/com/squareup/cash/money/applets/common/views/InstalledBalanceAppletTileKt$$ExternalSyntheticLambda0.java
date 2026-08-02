package com.squareup.cash.money.applets.common.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.money.viewmodels.InstalledBalanceAppletTileContentModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class InstalledBalanceAppletTileKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InstalledBalanceAppletTileContentModel f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ InstalledBalanceAppletTileLayoutConfig f$2;

    public /* synthetic */ InstalledBalanceAppletTileKt$$ExternalSyntheticLambda0(InstalledBalanceAppletTileContentModel installedBalanceAppletTileContentModel, boolean z, InstalledBalanceAppletTileLayoutConfig installedBalanceAppletTileLayoutConfig, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = installedBalanceAppletTileContentModel;
        this.f$1 = z;
        this.f$2 = installedBalanceAppletTileLayoutConfig;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        InstalledBalanceAppletTileLayoutConfig installedBalanceAppletTileLayoutConfig = this.f$2;
        boolean z = this.f$1;
        InstalledBalanceAppletTileContentModel installedBalanceAppletTileContentModel = this.f$0;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                SharedUIKt.InstalledBalanceAppletTileContent(installedBalanceAppletTileContentModel, z, installedBalanceAppletTileLayoutConfig, composer, Updater.updateChangedFlags(9));
                break;
            case 1:
                SharedUIKt.RedesignedBalanceLayout(installedBalanceAppletTileContentModel, z, installedBalanceAppletTileLayoutConfig, composer, Updater.updateChangedFlags(9));
                break;
            case 2:
                SharedUIKt.DefaultBalanceLayout(installedBalanceAppletTileContentModel, z, installedBalanceAppletTileLayoutConfig, composer, Updater.updateChangedFlags(9));
                break;
            default:
                SharedUIKt.InstalledBalanceAppletTileContentInner(installedBalanceAppletTileContentModel, z, installedBalanceAppletTileLayoutConfig, composer, Updater.updateChangedFlags(9));
                break;
        }
        return Unit.INSTANCE;
    }
}
