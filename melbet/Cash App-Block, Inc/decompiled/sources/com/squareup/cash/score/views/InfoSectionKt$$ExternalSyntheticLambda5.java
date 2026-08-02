package com.squareup.cash.score.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.google.android.gms.dynamite.zzb;
import com.squareup.cash.arcade.components.list.ListOrderedKt;
import com.squareup.cash.banking.views.BenefitsLeafletViewKt;
import com.squareup.cash.benefits.views.BenefitDetailsViewKt;
import com.squareup.cash.moneybot.views.menu.ExpandableContentKt;
import com.squareup.cash.payments.views.personalization.AlphaKt;
import com.squareup.cash.taptopay.views.components.TapToPayButtonKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class InfoSectionKt$$ExternalSyntheticLambda5 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ List f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ Modifier f$2;

    public /* synthetic */ InfoSectionKt$$ExternalSyntheticLambda5(Modifier modifier, Function1 function1, List list, int i) {
        this.$r8$classId = 6;
        this.f$2 = modifier;
        this.f$1 = function1;
        this.f$0 = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        Modifier modifier = this.f$2;
        List list = this.f$0;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                CalloutKt.CollapsingItemColumn(Updater.updateChangedFlags(1), composer, modifier, list, function1);
                break;
            case 1:
                BenefitsLeafletViewKt.LeafletContent(Updater.updateChangedFlags(1), composer, modifier, list, function1);
                break;
            case 2:
                BenefitDetailsViewKt.Disclaimer(Updater.updateChangedFlags(1), composer, modifier, list, function1);
                break;
            case 3:
                zzb.DynamicGroupingLimitList(Updater.updateChangedFlags(1), composer, modifier, list, function1);
                break;
            case 4:
                ListOrderedKt.SlashCommandMenu(Updater.updateChangedFlags(1), composer, modifier, list, function1);
                break;
            case 5:
                ExpandableContentKt.MainDebugToolsContent(Updater.updateChangedFlags(1), composer, modifier, list, function1);
                break;
            case 6:
                AlphaKt.ViewOnlyPersonalization(Updater.updateChangedFlags(1), composer, modifier, list, function1);
                break;
            default:
                TapToPayButtonKt.DescriptionSuggestions(Updater.updateChangedFlags(1), composer, modifier, list, function1);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ InfoSectionKt$$ExternalSyntheticLambda5(List list, Modifier modifier, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = list;
        this.f$2 = modifier;
        this.f$1 = function1;
    }

    public /* synthetic */ InfoSectionKt$$ExternalSyntheticLambda5(List list, Function1 function1, Modifier modifier, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = list;
        this.f$1 = function1;
        this.f$2 = modifier;
    }
}
