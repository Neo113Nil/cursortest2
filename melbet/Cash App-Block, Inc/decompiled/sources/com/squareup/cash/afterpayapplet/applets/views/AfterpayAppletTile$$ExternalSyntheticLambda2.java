package com.squareup.cash.afterpayapplet.applets.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.afterpayapplet.applets.viewmodels.AfterpayAppletTileViewModel;
import com.squareup.cash.family.applets.views.FamilyAppletTile;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class AfterpayAppletTile$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FamilyAppletTile f$0;
    public final /* synthetic */ AfterpayAppletTileViewModel.Installed.V3Installed f$1;
    public final /* synthetic */ TaxesAppletViewsModule$$ExternalSyntheticLambda1 f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ AfterpayAppletTile$$ExternalSyntheticLambda2(FamilyAppletTile familyAppletTile, AfterpayAppletTileViewModel.Installed.V3Installed v3Installed, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = familyAppletTile;
        this.f$1 = v3Installed;
        this.f$2 = taxesAppletViewsModule$$ExternalSyntheticLambda1;
        this.f$3 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$3;
        TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1 = this.f$2;
        AfterpayAppletTileViewModel.Installed.V3Installed v3Installed = this.f$1;
        FamilyAppletTile familyAppletTile = this.f$0;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                familyAppletTile.V3InstalledLegacyContent(v3Installed, taxesAppletViewsModule$$ExternalSyntheticLambda1, composer, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                familyAppletTile.V3InstalledRedesignedContent(v3Installed, taxesAppletViewsModule$$ExternalSyntheticLambda1, composer, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
