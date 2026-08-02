package com.squareup.cash.blockers.views;

import androidx.cardview.widget.CardViewApi21Impl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.moneybot.widgets.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.passkeys.views.PasskeyUpsellViewKt;
import com.squareup.cash.paychecks.views.HelpSheetViewKt;
import com.squareup.cash.support.views.home.SupportHomeViewKt;
import com.squareup.cash.transfers.views.AddMoneyViewKt;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.KTypesJvm;

/* loaded from: classes7.dex */
public final /* synthetic */ class SelectionViewKt$$ExternalSyntheticLambda6 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ List f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ SelectionViewKt$$ExternalSyntheticLambda6(List list, Function1 function1) {
        this.$r8$classId = 3;
        this.f$1 = list;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$2;
        List list = this.f$1;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                SelectionViewKt.OptionsSection(list, function1, composer, Updater.updateChangedFlags(7));
                break;
            case 1:
                num.getClass();
                SelectionViewKt.OptionsSection(list, function1, composer, Updater.updateChangedFlags(7));
                break;
            case 2:
                num.getClass();
                KTypesJvm.DetailRows(list, function1, composer, Updater.updateChangedFlags(1));
                break;
            case 3:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new UtilsKt$$ExternalSyntheticLambda0(19, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    CardViewApi21Impl.PendingAttachmentsRow(list, (Function1) rememberedValue, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 4:
                num.getClass();
                CardViewApi21Impl.PendingAttachmentsRow(list, function1, composer, Updater.updateChangedFlags(1));
                break;
            case 5:
                num.getClass();
                PasskeyUpsellViewKt.LoadedContent(list, function1, composer, Updater.updateChangedFlags(1));
                break;
            case 6:
                num.getClass();
                HelpSheetViewKt.TermsOfServiceDisclosures(list, function1, composer, Updater.updateChangedFlags(1));
                break;
            case 7:
                num.getClass();
                SupportHomeViewKt.BrowseCategories(list, function1, composer, Updater.updateChangedFlags(1));
                break;
            case 8:
                num.getClass();
                SupportHomeViewKt.BrowseCategories(list, function1, composer, Updater.updateChangedFlags(1));
                break;
            case 9:
                num.getClass();
                SupportHomeViewKt.ContactUs(list, function1, composer, Updater.updateChangedFlags(1));
                break;
            case 10:
                num.getClass();
                SupportHomeViewKt.ContactUs(list, function1, composer, Updater.updateChangedFlags(1));
                break;
            case 11:
                num.getClass();
                SupportHomeViewKt.SuggestedActions(list, function1, composer, Updater.updateChangedFlags(1));
                break;
            case 12:
                num.getClass();
                SupportHomeViewKt.SuggestedActions(list, function1, composer, Updater.updateChangedFlags(1));
                break;
            case 13:
                num.getClass();
                SupportHomeViewKt.SupportNotifications(list, function1, composer, Updater.updateChangedFlags(1));
                break;
            case 14:
                num.getClass();
                SupportHomeViewKt.SupportNotifications(list, function1, composer, Updater.updateChangedFlags(1));
                break;
            case 15:
                num.getClass();
                AddMoneyViewKt.StackedCardSection(list, function1, composer, Updater.updateChangedFlags(1));
                break;
            default:
                num.getClass();
                ListItemKt.Links(list, function1, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SelectionViewKt$$ExternalSyntheticLambda6(List list, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = list;
        this.f$2 = function1;
    }
}
