package com.squareup.cash.borrow.applets.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.borrow.applets.viewmodels.BorrowAppletTileModel;
import com.squareup.cash.tax.applet.views.TaxesAppletTile;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class BorrowAppletTile$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ TaxesAppletTile f$0;
    public final /* synthetic */ BorrowAppletTileModel.Visual f$1;
    public final /* synthetic */ float f$2;

    public /* synthetic */ BorrowAppletTile$$ExternalSyntheticLambda1(TaxesAppletTile taxesAppletTile, BorrowAppletTileModel.Visual visual, float f) {
        this.f$0 = taxesAppletTile;
        this.f$1 = visual;
        this.f$2 = f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        float f = this.f$2;
        BorrowAppletTileModel.Visual visual = this.f$1;
        TaxesAppletTile taxesAppletTile = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    taxesAppletTile.m3765RenderSharedVisualziNgDLE(visual, f, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                taxesAppletTile.m3765RenderSharedVisualziNgDLE(visual, f, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ BorrowAppletTile$$ExternalSyntheticLambda1(TaxesAppletTile taxesAppletTile, BorrowAppletTileModel.Visual visual, float f, int i) {
        this.f$0 = taxesAppletTile;
        this.f$1 = visual;
        this.f$2 = f;
    }
}
