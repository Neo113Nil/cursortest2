package com.squareup.cash.nfc.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.button.ButtonCtaGroupOrientation;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.formview.viewevents.api.FormViewEvent;
import com.squareup.cash.history.views.ErrorView$$ExternalSyntheticLambda3;
import com.squareup.cash.history.views.InvestingRoundUpsFailedDialog;
import com.squareup.cash.history.views.InvestingRoundUpsSkippedDialog;
import com.squareup.cash.initialscreenloader.views.AppUpgradeViewKt;
import com.squareup.cash.investing.viewmodels.drip.DividendReinvestmentSettingViewEvent;
import com.squareup.cash.investing.viewmodels.drip.DividendReinvestmentWelcomeViewEvent;
import com.squareup.cash.investing.viewmodels.search.InvestingSearchViewEvent;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda21;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewEvent;
import com.squareup.cash.moneybot.views.home.MoneybotHomeViewKt;
import com.squareup.cash.moneybot.views.menu.ExpandableContentKt;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.offers.viewmodels.viewevents.OffersDetailsSheetViewEvent;
import com.squareup.cash.offers.viewmodels.viewevents.OffersDetailsSheetViewEventV2;
import com.squareup.cash.offers.viewmodels.viewevents.OffersGreenStatusViewEvent;
import com.squareup.cash.offers.viewmodels.viewevents.OffersHomeViewEvent;
import com.squareup.cash.passkeys.views.PasskeyUpsellViewKt;
import com.squareup.cash.paychecks.viewmodels.PaychecksHomeViewEvent;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class NfcNotAvailableKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ NfcNotAvailableKt$$ExternalSyntheticLambda0(int i, int i2, Function1 function1) {
        this.$r8$classId = i2;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = 29;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i3 = 2;
        int i4 = 1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(SpacerKt.navigationBarsPadding(companion), 1.0f);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    ComposableLambdaImpl composableLambdaImpl = NfcNotAvailableKt.lambda$489845711;
                    NavigationType navigationType = NavigationType.CLOSE;
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new MusicViewKt$$ExternalSyntheticLambda0(17, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    DBUtil.TitleBarSub(composableLambdaImpl, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 54, 108);
                    NfcNotAvailableKt.EnableNfc(gapComposer, 0);
                    SpacerKt.Spacer(gapComposer, new LayoutWeightElement(1.0f, true));
                    DimensionKt.ButtonCtaGroup(null, false, ButtonCtaGroupOrientation.AUTOMATIC, null, Expect_jvmKt.rememberComposableLambda(265637079, new MusicViewKt$$ExternalSyntheticLambda7(19, function1), gapComposer), gapComposer, 24960, 11);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                String str = (String) obj;
                str.getClass();
                ((String) obj2).getClass();
                function1.invoke(new FormViewEvent.FormUrlClicked(str));
                return Unit.INSTANCE;
            case 2:
                String str2 = (String) obj;
                str2.getClass();
                ((String) obj2).getClass();
                function1.invoke(new FormViewEvent.FormUrlClicked(str2));
                return Unit.INSTANCE;
            case 3:
                String str3 = (String) obj;
                str3.getClass();
                ((String) obj2).getClass();
                function1.invoke(new FormViewEvent.FormUrlClicked(str3));
                return Unit.INSTANCE;
            case 4:
                String str4 = (String) obj;
                str4.getClass();
                ((String) obj2).getClass();
                function1.invoke(new FormViewEvent.FormUrlClicked(str4));
                return Unit.INSTANCE;
            case 5:
                String str5 = (String) obj;
                str5.getClass();
                ((String) obj2).getClass();
                function1.invoke(new FormViewEvent.FormUrlClicked(str5));
                return Unit.INSTANCE;
            case 6:
                String str6 = (String) obj;
                str6.getClass();
                ((String) obj2).getClass();
                function1.invoke(new FormViewEvent.FormUrlClicked(str6));
                return Unit.INSTANCE;
            case 7:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i5 = InvestingRoundUpsFailedDialog.$r8$clinit;
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ModalKt.Modal((Modifier) null, Room.stringResource(gapComposer2, R.string.failed_roundups_alert_title), Room.stringResource(gapComposer2, R.string.failed_roundups_alert_message), Expect_jvmKt.rememberComposableLambda(-1847734603, new ErrorView$$ExternalSyntheticLambda3(23, function1), gapComposer2), (Function3) null, (Function3) null, gapComposer2, 3072, 49);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                int i6 = InvestingRoundUpsSkippedDialog.$r8$clinit;
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    ModalKt.Modal((Modifier) null, Room.stringResource(gapComposer3, R.string.skipped_roundups_alert_title), Room.stringResource(gapComposer3, R.string.skipped_roundups_alert_message), Expect_jvmKt.rememberComposableLambda(-153109749, new ErrorView$$ExternalSyntheticLambda3(24, function1), gapComposer3), (Function3) null, (Function3) null, gapComposer3, 3072, 49);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    ModalKt.Modal((Modifier) null, AppUpgradeViewKt.f436lambda$1415858489, AppUpgradeViewKt.lambda$776655304, Expect_jvmKt.rememberComposableLambda(-2029120612, new ErrorView$$ExternalSyntheticLambda3(i2, function1), gapComposer4), Expect_jvmKt.rememberComposableLambda(163393181, new MusicViewKt$$ExternalSyntheticLambda7(i4, function1), gapComposer4), (Function3) null, gapComposer4, 28080, 33);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    ModalKt.Modal((Modifier) null, AppUpgradeViewKt.f438lambda$2058599152, AppUpgradeViewKt.lambda$84885009, Expect_jvmKt.rememberComposableLambda(1708939237, new MusicViewKt$$ExternalSyntheticLambda7(i3, function1), gapComposer5), Expect_jvmKt.rememberComposableLambda(-442543898, new MusicViewKt$$ExternalSyntheticLambda7(3, function1), gapComposer5), (Function3) null, gapComposer5, 28080, 33);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    ModalKt.Modal((Modifier) null, AppUpgradeViewKt.lambda$1017673517, AppUpgradeViewKt.lambda$609649902, Expect_jvmKt.rememberComposableLambda(69242306, new MusicViewKt$$ExternalSyntheticLambda7(4, function1), gapComposer6), Expect_jvmKt.rememberComposableLambda(-338781309, new MusicViewKt$$ExternalSyntheticLambda7(5, function1), gapComposer6), (Function3) null, gapComposer6, 28080, 33);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                String str7 = (String) obj;
                str7.getClass();
                ((String) obj2).getClass();
                function1.invoke(str7);
                return Unit.INSTANCE;
            case 13:
                ((String) obj).getClass();
                ((String) obj2).getClass();
                function1.invoke(DividendReinvestmentSettingViewEvent.CtaClicked.INSTANCE);
                return Unit.INSTANCE;
            case 14:
                String str8 = (String) obj;
                str8.getClass();
                ((String) obj2).getClass();
                function1.invoke(new DividendReinvestmentSettingViewEvent.TermsOfServiceClicked(str8));
                return Unit.INSTANCE;
            case 15:
                ((String) obj).getClass();
                ((String) obj2).getClass();
                function1.invoke(DividendReinvestmentWelcomeViewEvent.LearnMoreClicked.INSTANCE);
                return Unit.INSTANCE;
            case 16:
                String str9 = (String) obj;
                str9.getClass();
                ((String) obj2).getClass();
                function1.invoke(new InvestingSearchViewEvent.DisclosureClicked(str9));
                return Unit.INSTANCE;
            case 17:
                String str10 = (String) obj;
                str10.getClass();
                ((String) obj2).getClass();
                function1.invoke(str10);
                return Unit.INSTANCE;
            case 18:
                String str11 = (String) obj;
                str11.getClass();
                ((String) obj2).getClass();
                function1.invoke(new MoneybotChatViewEvent.DisclosureUrlClick(str11));
                return Unit.INSTANCE;
            case 19:
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    MoneybotHomeViewKt.ChatInputWithOverlay(6, gapComposer7, SizeKt.fillMaxWidth(companion, 1.0f), function1);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    String stringResource = Room.stringResource(gapComposer8, R.string.moneybot_overflow_menu_recents_error);
                    TextStyle textStyle = ((Typography) gapComposer8.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                    Colors colors2 = (Colors) gapComposer8.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                    } else {
                        gapComposer8.startReplaceGroup(-1762997739);
                        gapComposer8.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, colors2.semantic.text.disabled, (Composer) gapComposer8, (Modifier) null, textStyle, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                    SpacerKt.Spacer(gapComposer8, SizeKt.m277height3ABfNKs(companion, 24.0f));
                    boolean changed2 = gapComposer8.changed(function1);
                    Object rememberedValue2 = gapComposer8.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new MoneyTabUIKt$$ExternalSyntheticLambda21(29, function1);
                        gapComposer8.updateRememberedValue(rememberedValue2);
                    }
                    coil3.size.SizeKt.ButtonCompact((Function0) rememberedValue2, null, null, false, false, null, ExpandableContentKt.f500lambda$337399857, gapComposer8, 1572864, 62);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                String str12 = (String) obj;
                str12.getClass();
                ((String) obj2).getClass();
                function1.invoke(new OffersGreenStatusViewEvent.UrlClicked(str12));
                return Unit.INSTANCE;
            case 22:
                String str13 = (String) obj;
                str13.getClass();
                ((String) obj2).getClass();
                function1.invoke(new OffersDetailsSheetViewEvent.TermsClicked(str13));
                return Unit.INSTANCE;
            case 23:
                String str14 = (String) obj;
                str14.getClass();
                ((String) obj2).getClass();
                function1.invoke(new OffersDetailsSheetViewEvent.FooterMarkdownClicked(str14));
                return Unit.INSTANCE;
            case 24:
                String str15 = (String) obj;
                str15.getClass();
                ((String) obj2).getClass();
                function1.invoke(new OffersDetailsSheetViewEventV2.UrlClicked(str15));
                return Unit.INSTANCE;
            case 25:
                String str16 = (String) obj;
                str16.getClass();
                ((String) obj2).getClass();
                function1.invoke(new OffersHomeViewEvent.LegalUrlClicked(str16));
                return Unit.INSTANCE;
            case 26:
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    PasskeyUpsellViewKt.PasskeyManagementFooter(function1, gapComposer9, 0);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                PasskeyUpsellViewKt.PasskeyManagementTitleBar(function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                PasskeyUpsellViewKt.PasskeyManagementFooter(function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                String str17 = (String) obj;
                str17.getClass();
                ((String) obj2).getClass();
                function1.invoke(new PaychecksHomeViewEvent.DisclosureUrlClicked(str17));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ NfcNotAvailableKt$$ExternalSyntheticLambda0(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }
}
