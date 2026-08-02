package com.squareup.cash.phoneplans.applets.views;

import com.squareup.cash.money.core.ids.ItemId;
import com.squareup.cash.score.applets.views.ScoreAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.tax.applet.views.TaxesAppletTile;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class PhonePlansAppletTile$$ExternalSyntheticLambda7 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TaxesAppletTile f$0;

    public /* synthetic */ PhonePlansAppletTile$$ExternalSyntheticLambda7(TaxesAppletTile taxesAppletTile, int i) {
        this.$r8$classId = i;
        this.f$0 = taxesAppletTile;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        ItemId.PHONE_PLANS phone_plans = ItemId.PHONE_PLANS.INSTANCE;
        TaxesAppletTile taxesAppletTile = this.f$0;
        switch (i) {
            case 0:
                ((ScoreAppletViewsModule$$ExternalSyntheticLambda1) taxesAppletTile.onClick).invoke(phone_plans);
                break;
            case 1:
                ((ScoreAppletViewsModule$$ExternalSyntheticLambda1) taxesAppletTile.onClick).invoke(phone_plans);
                break;
            default:
                ((ScoreAppletViewsModule$$ExternalSyntheticLambda1) taxesAppletTile.onClick).invoke(phone_plans);
                break;
        }
        return Unit.INSTANCE;
    }
}
