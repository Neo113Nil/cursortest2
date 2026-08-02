package com.squareup.cash.account.components;

import android.graphics.Bitmap;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.media3.common.FileTypes;
import androidx.room.Room;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda2;
import com.squareup.cash.R;
import com.squareup.cash.account.settings.viewmodels.AccountAvatarViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.appmessages.db.CardMessageQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.RealCellActivityAccessoryScope;
import com.squareup.cash.arcade.components.input.InputAreaKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.borrow.views.ExpandedLoanHistoryListKt$$ExternalSyntheticLambda5;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.family.safetyhub.views.SafetyHubViewKt$$ExternalSyntheticLambda9;
import com.squareup.cash.globalsearch.views.GlobalSearchFeedKt$$ExternalSyntheticLambda17;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel$MessageViewModel$Status$Failed;
import com.squareup.cash.support.chat.views.ChatInputView$$ExternalSyntheticLambda2;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.features.exit.ExitModalKt;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton$Type$Secondary;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsColors;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTypography;
import com.stripe.android.financialconnections.ui.theme.ThemeKt;
import java.io.Serializable;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes7.dex */
public final /* synthetic */ class AccountUiViewKt$$ExternalSyntheticLambda14 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ AccountUiViewKt$$ExternalSyntheticLambda14(FocusRequester focusRequester, TextFieldState textFieldState, boolean z, String str) {
        this.$r8$classId = 1;
        this.f$0 = focusRequester;
        this.f$2 = textFieldState;
        this.f$1 = z;
        this.f$3 = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Function1 function1;
        long j;
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        int i2 = 18;
        boolean z = this.f$1;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj4 = this.f$3;
        Object obj5 = this.f$2;
        Object obj6 = this.f$0;
        switch (i) {
            case 0:
                Function1 function12 = (Function1) obj6;
                Bitmap bitmap = (Bitmap) obj5;
                AccountAvatarViewModel accountAvatarViewModel = (AccountAvatarViewModel) obj4;
                BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                boxWithConstraintsScopeImpl.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(boxWithConstraintsScopeImpl) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                    Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    int m694toArgb8_81llA = ColorKt.m694toArgb8_81llA(colors.semantic.background.f1047app);
                    Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    int m694toArgb8_81llA2 = ColorKt.m694toArgb8_81llA(colors2.semantic.icon.brand);
                    int mo236toPx0680j_4 = (int) ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo236toPx0680j_4(boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM());
                    Unit unit = Unit.INSTANCE;
                    boolean changed = gapComposer.changed(function12) | gapComposer.changed(m694toArgb8_81llA) | gapComposer.changed(m694toArgb8_81llA2) | gapComposer.changed(mo236toPx0680j_4);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        function1 = function12;
                        AccountUiViewKt$QrCode$1$1$1$1$1 accountUiViewKt$QrCode$1$1$1$1$1 = new AccountUiViewKt$QrCode$1$1$1$1$1(function1, m694toArgb8_81llA, m694toArgb8_81llA2, mo236toPx0680j_4, null, 0);
                        gapComposer.updateRememberedValue(accountUiViewKt$QrCode$1$1$1$1$1);
                        rememberedValue = accountUiViewKt$QrCode$1$1$1$1$1;
                    } else {
                        function1 = function12;
                    }
                    Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
                    if (z) {
                        gapComposer.startReplaceGroup(138574362);
                        boolean changed2 = gapComposer.changed(function1);
                        Object rememberedValue2 = gapComposer.rememberedValue();
                        if (changed2 || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new AccountToDoKt$$ExternalSyntheticLambda0(10, function1);
                            gapComposer.updateRememberedValue(rememberedValue2);
                        }
                        AccountToDoKt.QrCodeError(0, gapComposer, null, (Function0) rememberedValue2);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(138672539);
                        boolean z2 = bitmap == null;
                        Object rememberedValue3 = gapComposer.rememberedValue();
                        if (rememberedValue3 == neverEqualPolicy) {
                            rememberedValue3 = new MarkerKt$$ExternalSyntheticLambda2(21);
                            gapComposer.updateRememberedValue(rememberedValue3);
                        }
                        Strings.LoadableFullScreenContent(bitmap, z2, null, (Function1) rememberedValue3, null, AccountToDoKt.f103lambda$1702758716, gapComposer, 199680, 20);
                        AccountToDoKt.ProfileQrAvatar(accountAvatarViewModel, BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.Center), gapComposer, 0);
                        gapComposer.end(false);
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                FocusRequester focusRequester = (FocusRequester) obj6;
                TextFieldState textFieldState = (TextFieldState) obj5;
                String str = (String) obj4;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                Modifier focusRequester2 = FocusTraversalKt.focusRequester(SizeKt.fillMaxWidth(companion, 1.0f), focusRequester);
                TextFieldLineLimits.MultiLine multiLine = new TextFieldLineLimits.MultiLine(3, 3);
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, 0, 7, (Boolean) null, 119);
                GapComposer gapComposer2 = (GapComposer) ((Composer) obj2);
                Object rememberedValue4 = gapComposer2.rememberedValue();
                if (rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new ChatInputView$$ExternalSyntheticLambda2(focusRequester, 1);
                    gapComposer2.updateRememberedValue(rememberedValue4);
                }
                InputAreaKt.InputArea(textFieldState, focusRequester2, this.f$1, false, false, null, null, str, keyboardOptions, (KeyboardActionHandler) rememberedValue4, multiLine, null, null, null, null, gapComposer2, 905969664, 6, 30840);
                break;
            case 2:
                AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection.ToggleState toggleState = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection.ToggleState) obj5;
                AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection prepurchaseToggleSection = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection) obj4;
                Function1 function13 = (Function1) obj6;
                SharedTransitionScope sharedTransitionScope = (SharedTransitionScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                sharedTransitionScope.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(sharedTransitionScope) ? 4 : 2;
                }
                GapComposer gapComposer3 = (GapComposer) composer2;
                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    Object rememberedValue5 = gapComposer3.rememberedValue();
                    if (rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new CardMessageQueries$$ExternalSyntheticLambda1(i2);
                        gapComposer3.updateRememberedValue(rememberedValue5);
                    }
                    AnimatedContentKt.AnimatedContent(toggleState, null, (Function1) rememberedValue5, null, null, null, Expect_jvmKt.rememberComposableLambda(1764796880, new ExpandedLoanHistoryListKt$$ExternalSyntheticLambda5(prepurchaseToggleSection, z, function13, sharedTransitionScope), gapComposer3), gapComposer3, 1573248, 58);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 3:
                Function1 function14 = (Function1) obj6;
                MutableState mutableState = (MutableState) obj5;
                String str2 = (String) obj4;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer3;
                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    boolean z3 = !z || ((Boolean) mutableState.getValue()).booleanValue();
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed3 = gapComposer4.changed(function14);
                    Object rememberedValue6 = gapComposer4.rememberedValue();
                    if (changed3 || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new SafetyHubViewKt$$ExternalSyntheticLambda9(29, function14);
                        gapComposer4.updateRememberedValue(rememberedValue6);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue6, fillMaxWidth, buttonProminence, false, z3, null, Expect_jvmKt.rememberComposableLambda(-747286916, new GlobalSearchFeedKt$$ExternalSyntheticLambda17(str2, 14), gapComposer4), gapComposer4, 1573296, 40);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
            case 4:
                FormBlocker.Element.MerchantTransactionElement merchantTransactionElement = (FormBlocker.Element.MerchantTransactionElement) obj6;
                MoneyFormatter moneyFormatter = (MoneyFormatter) obj5;
                Function0 function0 = (Function0) obj4;
                RealCellActivityAccessoryScope realCellActivityAccessoryScope = (RealCellActivityAccessoryScope) obj;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                realCellActivityAccessoryScope.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((GapComposer) composer4).changed(realCellActivityAccessoryScope) ? 4 : 2;
                }
                GapComposer gapComposer5 = (GapComposer) composer4;
                if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 19) != 18)) {
                    realCellActivityAccessoryScope.amount(Expect_jvmKt.rememberComposableLambda(-1699029291, new LocalHomeViewKt$$ExternalSyntheticLambda0(merchantTransactionElement, moneyFormatter, function0, this.f$1, 18), gapComposer5));
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                break;
            case 5:
                String str3 = (String) obj6;
                FileTypes fileTypes = (FileTypes) obj5;
                String str4 = (String) obj4;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((FlowRowScope) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer5;
                if (gapComposer6.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    if (str3 == null || str3.length() == 0) {
                        gapComposer6.startReplaceGroup(2011032620);
                        gapComposer6.end(false);
                    } else {
                        gapComposer6.startReplaceGroup(2010749125);
                        TextStyle textStyle = Strings.getTypography(gapComposer6).bodyXSmall;
                        if (fileTypes instanceof ChatContentViewModel$MessageViewModel$Status$Failed) {
                            gapComposer6.startReplaceGroup(-2013341027);
                            j = Strings.getColors(gapComposer6).semantic.text.warning;
                            gapComposer6.end(false);
                        } else {
                            gapComposer6.startReplaceGroup(-2013339074);
                            j = Strings.getColors(gapComposer6).semantic.text.disabled;
                            gapComposer6.end(false);
                        }
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, j, (Composer) gapComposer6, (Modifier) null, textStyle, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                        gapComposer6.end(false);
                    }
                    if (str4 == null || str4.length() == 0 || !z) {
                        gapComposer6.startReplaceGroup(2011319308);
                        gapComposer6.end(false);
                    } else {
                        gapComposer6.startReplaceGroup(2011103083);
                        if (str3 != null && str3.length() != 0) {
                            str4 = " • ".concat(str4);
                        }
                        String str5 = str4;
                        TextStyle textStyle2 = ((Typography) gapComposer6.consume(ArcadeThemeKt.LocalTypography)).bodyXSmall;
                        Colors colors3 = (Colors) gapComposer6.consume(ArcadeThemeKt.LocalColors);
                        if (colors3 == null) {
                            colors3 = re$$ExternalSyntheticOutline0.m(gapComposer6, -1762997026, gapComposer6, false);
                        } else {
                            gapComposer6.startReplaceGroup(-1762997739);
                            gapComposer6.end(false);
                        }
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors3.semantic.text.disabled, (Composer) gapComposer6, (Modifier) null, textStyle2, (TextLineBalancing) null, str5, (Map) null, (Function1) null, false);
                        gapComposer6.end(false);
                    }
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                break;
            default:
                TextResource.StringId stringId = (TextResource.StringId) obj6;
                Function0 function02 = (Function0) obj5;
                Function0 function03 = (Function0) obj4;
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer7 = (GapComposer) composer6;
                if (gapComposer7.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    ListItemKt.ShapedIcon(Countries.painterResource(R.drawable.stripe_ic_panel_arrow_right, 0, gapComposer7), null, null, null, Room.stringResource(gapComposer7, R.string.stripe_exit_modal_title), gapComposer7, Painter.$stable, 14);
                    SpacerKt.Spacer(gapComposer7, SizeKt.m285size3ABfNKs(companion, 16.0f));
                    String stringResource = Room.stringResource(gapComposer7, R.string.stripe_exit_modal_title);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ThemeKt.LocalTypography;
                    TextStyle textStyle3 = ((FinancialConnectionsTypography) gapComposer7.consume(staticProvidableCompositionLocal2)).headingLarge;
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal3 = ThemeKt.LocalColors;
                    TextKt.m509Text4IGK_g(stringResource, null, ((FinancialConnectionsColors) gapComposer7.consume(staticProvidableCompositionLocal3)).textDefault, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle3, gapComposer7, 0, 0, 65530);
                    SpacerKt.Spacer(gapComposer7, SizeKt.m285size3ABfNKs(companion, 8.0f));
                    TextKt.m509Text4IGK_g(stringId.toText(gapComposer7, 0).toString(), null, ((FinancialConnectionsColors) gapComposer7.consume(staticProvidableCompositionLocal3)).textDefault, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((FinancialConnectionsTypography) gapComposer7.consume(staticProvidableCompositionLocal2)).bodyMedium, gapComposer7, 0, 0, 65530);
                    SpacerKt.Spacer(gapComposer7, SizeKt.m285size3ABfNKs(companion, 24.0f));
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean z4 = this.f$1;
                    boolean z5 = !z4;
                    com.stripe.android.financialconnections.ui.components.TextKt.FinancialConnectionsButton(function02, fillMaxWidth2, null, null, z5, false, ExitModalKt.lambda$2101475679, gapComposer7, 1572912, 44);
                    SpacerKt.Spacer(gapComposer7, SizeKt.m285size3ABfNKs(companion, 8.0f));
                    com.stripe.android.financialconnections.ui.components.TextKt.FinancialConnectionsButton(function03, SizeKt.fillMaxWidth(companion, 1.0f), FinancialConnectionsButton$Type$Secondary.INSTANCE, null, z5, z4, ExitModalKt.f803lambda$60472120, gapComposer7, 1573296, 8);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AccountUiViewKt$$ExternalSyntheticLambda14(AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection.ToggleState toggleState, AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection prepurchaseToggleSection, boolean z, Function1 function1) {
        this.$r8$classId = 2;
        this.f$2 = toggleState;
        this.f$3 = prepurchaseToggleSection;
        this.f$1 = z;
        this.f$0 = function1;
    }

    public /* synthetic */ AccountUiViewKt$$ExternalSyntheticLambda14(Serializable serializable, Object obj, Object obj2, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = serializable;
        this.f$2 = obj;
        this.f$3 = obj2;
        this.f$1 = z;
    }

    public /* synthetic */ AccountUiViewKt$$ExternalSyntheticLambda14(Object obj, boolean z, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
        this.f$2 = obj2;
        this.f$3 = obj3;
    }

    public /* synthetic */ AccountUiViewKt$$ExternalSyntheticLambda14(boolean z, Function1 function1, MutableState mutableState, String str) {
        this.$r8$classId = 3;
        this.f$1 = z;
        this.f$0 = function1;
        this.f$2 = mutableState;
        this.f$3 = str;
    }
}
