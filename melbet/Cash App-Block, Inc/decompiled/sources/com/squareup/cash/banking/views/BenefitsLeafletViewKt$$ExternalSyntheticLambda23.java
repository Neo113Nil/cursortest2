package com.squareup.cash.banking.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.arcade.bindings.component.ArcadeComponentProtoBindingKt;
import com.squareup.cash.deposits.physical.view.map.AtmPmdExplainerViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import squareup.cash.ui.arcade.elements.WithinSection;

/* loaded from: classes5.dex */
public final /* synthetic */ class BenefitsLeafletViewKt$$ExternalSyntheticLambda23 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ WithinSection f$0;

    public /* synthetic */ BenefitsLeafletViewKt$$ExternalSyntheticLambda23(WithinSection withinSection, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = withinSection;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        WithinSection withinSection = this.f$0;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                BenefitsLeafletViewKt.SpacerWithinSection(withinSection, composer, Updater.updateChangedFlags(1));
                break;
            case 1:
                ArcadeComponentProtoBindingKt.RenderWithinSection(withinSection, composer, Updater.updateChangedFlags(1));
                break;
            default:
                AtmPmdExplainerViewKt.SpacerWithinSection(withinSection, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
