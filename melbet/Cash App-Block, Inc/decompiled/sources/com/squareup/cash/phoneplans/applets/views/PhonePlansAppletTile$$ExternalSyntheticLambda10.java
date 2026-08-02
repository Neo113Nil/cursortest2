package com.squareup.cash.phoneplans.applets.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.phoneplans.applets.viewmodels.PhonePlansAppletTileModel;
import com.squareup.cash.tax.applet.views.TaxesAppletTile;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class PhonePlansAppletTile$$ExternalSyntheticLambda10 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TaxesAppletTile f$0;
    public final /* synthetic */ PhonePlansAppletTileModel.Installed f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ PhonePlansAppletTile$$ExternalSyntheticLambda10(TaxesAppletTile taxesAppletTile, PhonePlansAppletTileModel.Installed installed, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = taxesAppletTile;
        this.f$1 = installed;
        this.f$2 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$2;
        PhonePlansAppletTileModel.Installed installed = this.f$1;
        TaxesAppletTile taxesAppletTile = this.f$0;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                taxesAppletTile.InstalledUIRedesign(installed, composer, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                taxesAppletTile.InstalledUILegacy(installed, composer, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
