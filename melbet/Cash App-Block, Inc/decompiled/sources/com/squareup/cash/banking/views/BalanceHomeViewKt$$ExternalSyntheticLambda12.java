package com.squareup.cash.banking.views;

import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.room.Room;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda6;
import app.cash.molecule.PlatformKt;
import coil3.size.DimensionKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletRetroOrderSelectionViewEvent;
import com.squareup.cash.arcade.bindings.component.ArcadeComponentEvent;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.button.ButtonCtaGroupOrientation;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.banking.viewmodels.BalanceHomeViewEvent;
import com.squareup.cash.banking.viewmodels.BenefitDetailsViewEvent;
import com.squareup.cash.banking.viewmodels.BenefitsExplanationViewEvent;
import com.squareup.cash.banking.viewmodels.BenefitsLeafletViewEvent;
import com.squareup.cash.benefits.viewmodels.BankingBenefitsBookletViewEvent;
import com.squareup.cash.benefits.viewmodels.BenefitsHomeViewEvent;
import com.squareup.cash.benefits.viewmodels.BenefitsHubViewEvent;
import com.squareup.cash.benefits.views.BenefitsHubViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.billssubscriptions.views.BillsSubscriptionsMerchantListViewKt;
import com.squareup.cash.bitcoin.viewmodels.applet.disclosure.BitcoinHomeDisclosureWidgetViewEvent$ViewDisclosure;
import com.squareup.cash.bitcoin.viewmodels.performance.details.BitcoinPerformanceDetailsViewEvent;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinOnboardingViewEvent;
import com.squareup.cash.bitcoin.views.BitcoinInvoiceEntryViewKt;
import com.squareup.cash.bitcoin.views.map.BitcoinMapViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.bitcoin.views.roundups.BitcoinRoundUpsCardUpsellViewKt;
import com.squareup.cash.blockers.actions.viewevents.BlockerActionConfirmSheetViewEvent;
import com.squareup.cash.blockers.viewmodels.EarnerEnrollmentBlockerViewEvent;
import com.squareup.cash.blockers.views.AmountBlockerViewKt;
import com.squareup.cash.booklet.ui.BookletGridKt$$ExternalSyntheticLambda1;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.util.cash.Countries;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final /* synthetic */ class BalanceHomeViewKt$$ExternalSyntheticLambda12 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ BalanceHomeViewKt$$ExternalSyntheticLambda12(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i2 = 3;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                ((String) obj2).getClass();
                function1.invoke(new BalanceHomeViewEvent.DisclosureUrlClicked(str));
                return Unit.INSTANCE;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                function1.invoke(new AfterpayAppletRetroOrderSelectionViewEvent.RetroItemTapped(str2, (List) obj2));
                return Unit.INSTANCE;
            case 2:
                String str3 = (String) obj;
                str3.getClass();
                function1.invoke(new AfterpayAppletRetroOrderSelectionViewEvent.RetroAccessoryTapped(str3, (List) obj2));
                return Unit.INSTANCE;
            case 3:
                String str4 = (String) obj;
                str4.getClass();
                ((String) obj2).getClass();
                function1.invoke(new ArcadeComponentEvent.Url(str4));
                return Unit.INSTANCE;
            case 4:
                String str5 = (String) obj;
                str5.getClass();
                ((String) obj2).getClass();
                function1.invoke(new ArcadeComponentEvent.Url(str5));
                return Unit.INSTANCE;
            case 5:
                String str6 = (String) obj;
                str6.getClass();
                ((String) obj2).getClass();
                function1.invoke(new ArcadeComponentEvent.Url(str6));
                return Unit.INSTANCE;
            case 6:
                String str7 = (String) obj;
                str7.getClass();
                ((String) obj2).getClass();
                function1.invoke(new ArcadeComponentEvent.Url(str7));
                return Unit.INSTANCE;
            case 7:
                String str8 = (String) obj;
                str8.getClass();
                ((String) obj2).getClass();
                function1.invoke(new ArcadeComponentEvent.Url(str8));
                return Unit.INSTANCE;
            case 8:
                String str9 = (String) obj;
                str9.getClass();
                ((String) obj2).getClass();
                function1.invoke(new BenefitsLeafletViewEvent.UrlClicked(str9));
                return Unit.INSTANCE;
            case 9:
                String str10 = (String) obj;
                str10.getClass();
                ((String) obj2).getClass();
                function1.invoke(new BenefitsLeafletViewEvent.UrlClicked(str10));
                return Unit.INSTANCE;
            case 10:
                String str11 = (String) obj;
                str11.getClass();
                ((String) obj2).getClass();
                function1.invoke(new BenefitsLeafletViewEvent.UrlClicked(str11));
                return Unit.INSTANCE;
            case 11:
                String str12 = (String) obj;
                str12.getClass();
                ((String) obj2).getClass();
                function1.invoke(new BankingBenefitsBookletViewEvent.UrlClick(str12));
                return Unit.INSTANCE;
            case 12:
                String str13 = (String) obj;
                str13.getClass();
                ((String) obj2).getClass();
                function1.invoke(new BenefitDetailsViewEvent.UrlClicked(str13));
                return Unit.INSTANCE;
            case 13:
                String str14 = (String) obj;
                str14.getClass();
                ((String) obj2).getClass();
                function1.invoke(new BenefitDetailsViewEvent.UrlClicked(str14));
                return Unit.INSTANCE;
            case 14:
                String str15 = (String) obj;
                str15.getClass();
                ((String) obj2).getClass();
                function1.invoke(new BenefitsExplanationViewEvent.UrlClicked(str15));
                return Unit.INSTANCE;
            case 15:
                String str16 = (String) obj;
                str16.getClass();
                ((String) obj2).getClass();
                function1.invoke(new BenefitsHomeViewEvent.UrlTapped(str16));
                return Unit.INSTANCE;
            case 16:
                String str17 = (String) obj;
                str17.getClass();
                ((String) obj2).getClass();
                function1.invoke(new BenefitsHubViewEvent.UrlClicked(str17));
                return Unit.INSTANCE;
            case 17:
                String str18 = (String) obj;
                str18.getClass();
                ((String) obj2).getClass();
                function1.invoke(new BenefitsHubViewEvent.UrlClicked(str18));
                return Unit.INSTANCE;
            case 18:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new BenefitsHubViewKt$$ExternalSyntheticLambda4(15, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    BillsSubscriptionsMerchantListViewKt.DoneFooter((Function0) rememberedValue, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    boolean changed2 = gapComposer2.changed(function1);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new BenefitsHubViewKt$$ExternalSyntheticLambda4(17, function1);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    SheetKt.Sheet((Function0) rememberedValue2, SizeKt.fillMaxWidth(companion, 1.0f), null, null, null, false, null, BitcoinInvoiceEntryViewKt.f252lambda$729931589, gapComposer2, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    boolean changed3 = gapComposer3.changed(function1);
                    Object rememberedValue3 = gapComposer3.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new BenefitsHubViewKt$$ExternalSyntheticLambda4(18, function1);
                        gapComposer3.updateRememberedValue(rememberedValue3);
                    }
                    SheetKt.Sheet((Function0) rememberedValue3, SizeKt.fillMaxWidth(companion, 1.0f), null, null, null, false, null, BitcoinInvoiceEntryViewKt.lambda$1041490708, gapComposer3, 100663344, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                String str19 = (String) obj;
                str19.getClass();
                ((String) obj2).getClass();
                function1.invoke(new BitcoinHomeDisclosureWidgetViewEvent$ViewDisclosure(str19));
                return Unit.INSTANCE;
            case 22:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    DimensionKt.ButtonCtaGroup(SizeKt.fillMaxWidth(companion, 1.0f), false, ButtonCtaGroupOrientation.AUTOMATIC, null, Expect_jvmKt.rememberComposableLambda(-1803176022, new BrandSheetViewKt$$ExternalSyntheticLambda6(26, function1), gapComposer4), gapComposer4, 24966, 10);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                String str20 = (String) obj;
                str20.getClass();
                ((String) obj2).getClass();
                function1.invoke(new BitcoinPerformanceDetailsViewEvent.UrlClicked(str20));
                return Unit.INSTANCE;
            case 24:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    String stringResource = Room.stringResource(gapComposer5, R.string.bitcoin_views_round_ups_card_upsell_title);
                    String stringResource2 = Room.stringResource(gapComposer5, R.string.bitcoin_views_round_ups_card_upsell_body);
                    Painter painterResource = Countries.painterResource(2131233214, 0, gapComposer5);
                    NavigationType navigationType = NavigationType.CLOSE;
                    boolean changed4 = gapComposer5.changed(function1);
                    Object rememberedValue4 = gapComposer5.rememberedValue();
                    if (changed4 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new BitcoinMapViewKt$$ExternalSyntheticLambda6(14, function1);
                        gapComposer5.updateRememberedValue(rememberedValue4);
                    }
                    VisibleKt.m3492InfoUpsellvCkY0N0(stringResource, painterResource, null, null, stringResource2, navigationType, (Function0) rememberedValue4, Expect_jvmKt.rememberComposableLambda(600399180, new BrandSheetViewKt$$ExternalSyntheticLambda6(28, function1), gapComposer5), BitcoinRoundUpsCardUpsellViewKt.f272lambda$1664319486, gapComposer5, (Painter.$stable << 3) | 113442816, 12);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                String str21 = (String) obj;
                str21.getClass();
                ((String) obj2).getClass();
                function1.invoke(new StablecoinOnboardingViewEvent.ViewDisclosure(str21));
                return Unit.INSTANCE;
            case 26:
                String str22 = (String) obj;
                str22.getClass();
                ((String) obj2).getClass();
                function1.invoke(new BlockerActionConfirmSheetViewEvent.UrlClicked(str22));
                return Unit.INSTANCE;
            case 27:
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    ModalKt.Modal(Modifier.Companion.$$INSTANCE, AmountBlockerViewKt.f308lambda$993416860, AmountBlockerViewKt.lambda$1260875331, Expect_jvmKt.rememberComposableLambda(-1573850641, new BookletGridKt$$ExternalSyntheticLambda1(i2, function1), gapComposer6), (Function3) null, AmountBlockerViewKt.f302lambda$566182688, gapComposer6, 200112, 16);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                String str23 = (String) obj;
                String str24 = (String) obj2;
                str23.getClass();
                str24.getClass();
                function1.invoke(new EarnerEnrollmentBlockerViewEvent.LegalLinkClicked(str23, str24));
                return Unit.INSTANCE;
            default:
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer7, 0);
                    int hashCode = Long.hashCode(gapComposer7.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer7.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer7, fillMaxWidth);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer7.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer7.startReusableNode();
                    if (gapComposer7.inserting) {
                        gapComposer7.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer7.useNode();
                    }
                    Updater.m576setimpl(gapComposer7, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer7, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer7, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer7, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer7, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-108412835, new BookletGridKt$$ExternalSyntheticLambda1(8, function1), gapComposer7), gapComposer7, 24576, 15);
                    gapComposer7.end(true);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ BalanceHomeViewKt$$ExternalSyntheticLambda12(Function1 function1, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }
}
