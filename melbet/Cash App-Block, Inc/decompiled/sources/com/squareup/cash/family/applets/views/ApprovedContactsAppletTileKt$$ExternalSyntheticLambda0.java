package com.squareup.cash.family.applets.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.family.applets.viewmodels.ApprovedContactsAppletTileViewModel$Uninstalled;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class ApprovedContactsAppletTileKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ApprovedContactsAppletTileViewModel$Uninstalled f$0;
    public final /* synthetic */ TaxesAppletViewsModule$$ExternalSyntheticLambda1 f$1;

    public /* synthetic */ ApprovedContactsAppletTileKt$$ExternalSyntheticLambda0(ApprovedContactsAppletTileViewModel$Uninstalled approvedContactsAppletTileViewModel$Uninstalled, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = approvedContactsAppletTileViewModel$Uninstalled;
        this.f$1 = taxesAppletViewsModule$$ExternalSyntheticLambda1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1 = this.f$1;
        ApprovedContactsAppletTileViewModel$Uninstalled approvedContactsAppletTileViewModel$Uninstalled = this.f$0;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                FamilyAppletTileKt.UI(approvedContactsAppletTileViewModel$Uninstalled, taxesAppletViewsModule$$ExternalSyntheticLambda1, composer, Updater.updateChangedFlags(1));
                break;
            default:
                FamilyAppletTileKt.UninstalledUI(approvedContactsAppletTileViewModel$Uninstalled, taxesAppletViewsModule$$ExternalSyntheticLambda1, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
