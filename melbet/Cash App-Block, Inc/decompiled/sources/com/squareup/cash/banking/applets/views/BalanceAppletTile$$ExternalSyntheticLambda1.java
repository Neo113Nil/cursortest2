package com.squareup.cash.banking.applets.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class BalanceAppletTile$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BalanceAppletTile f$0;
    public final /* synthetic */ AppletTile.AppletTileAppearance f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ BalanceAppletTile$$ExternalSyntheticLambda1(BalanceAppletTile balanceAppletTile, AppletTile.AppletTileAppearance appletTileAppearance, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = balanceAppletTile;
        this.f$1 = appletTileAppearance;
        this.f$2 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$2;
        AppletTile.AppletTileAppearance appletTileAppearance = this.f$1;
        BalanceAppletTile balanceAppletTile = this.f$0;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                balanceAppletTile.UninstalledRowUI(appletTileAppearance, composer, Updater.updateChangedFlags(i2 | 1));
                break;
            case 1:
                balanceAppletTile.UninstalledRowUI(appletTileAppearance, composer, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                balanceAppletTile.UI(appletTileAppearance, composer, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
