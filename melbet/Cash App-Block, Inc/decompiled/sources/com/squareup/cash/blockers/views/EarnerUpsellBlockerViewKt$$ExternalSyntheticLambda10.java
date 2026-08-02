package com.squareup.cash.blockers.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.blockers.viewmodels.EarnerUpsellBlockerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class EarnerUpsellBlockerViewKt$$ExternalSyntheticLambda10 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ EarnerUpsellBlockerViewModel f$0;
    public final /* synthetic */ Modifier f$1;
    public final /* synthetic */ int f$3;

    public /* synthetic */ EarnerUpsellBlockerViewKt$$ExternalSyntheticLambda10(EarnerUpsellBlockerViewModel earnerUpsellBlockerViewModel, Modifier modifier, int i) {
        this.f$0 = earnerUpsellBlockerViewModel;
        this.f$1 = modifier;
        this.f$3 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                EarnerUpsellBlockerViewKt.EarnerUpsellContent(this.f$0, this.f$1, composer, Updater.updateChangedFlags(1), this.f$3);
                break;
            default:
                EarnerUpsellBlockerViewKt.EarnerUpsellSummary(this.f$0, this.f$1, composer, Updater.updateChangedFlags(this.f$3 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ EarnerUpsellBlockerViewKt$$ExternalSyntheticLambda10(EarnerUpsellBlockerViewModel earnerUpsellBlockerViewModel, Modifier modifier, int i, int i2) {
        this.f$0 = earnerUpsellBlockerViewModel;
        this.f$1 = modifier;
        this.f$3 = i2;
    }
}
