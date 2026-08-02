package com.squareup.cash.directdeposit.views.directdeposit;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.inputfieldtext.InputFieldText;
import app.cash.inputfieldtext.composeui.TextFieldStateInputFieldText;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.input.InputFieldKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.treehouse.InputFieldBinding$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.views.SetPinViewKt$SetPin$3$1$1$1;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda3;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositSingleInputViewModel;
import com.squareup.cash.directdeposit.views.directdeposit.tranformation.CurrencyInputTransformation;
import com.squareup.cash.directdeposit.views.directdeposit.tranformation.PercentInputTransformation;
import com.squareup.cash.globalsearch.views.GlobalSearchFeedKt$$ExternalSyntheticLambda17;
import com.squareup.cash.taptopay.views.TapToPayInitiatorNotesKt$$ExternalSyntheticLambda2;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final /* synthetic */ class DirectDepositSingleInputKt$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DirectDepositSingleInputViewModel f$0;
    public final /* synthetic */ FocusRequester f$1;
    public final /* synthetic */ DelegatingSoftwareKeyboardController f$2;
    public final /* synthetic */ Function1 f$3;

    public /* synthetic */ DirectDepositSingleInputKt$$ExternalSyntheticLambda0(DirectDepositSingleInputViewModel directDepositSingleInputViewModel, Function1 function1, FocusRequester focusRequester, DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController) {
        this.$r8$classId = 1;
        this.f$0 = directDepositSingleInputViewModel;
        this.f$3 = function1;
        this.f$1 = focusRequester;
        this.f$2 = delegatingSoftwareKeyboardController;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e8  */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        NavigationType navigationType;
        TextFieldState m382rememberTextFieldStateLepunE;
        KeyboardOptions keyboardOptions;
        InputTransformation inputTransformation;
        InputTransformation inputTransformation2;
        String str;
        ComposableLambdaImpl composableLambdaImpl;
        boolean changed;
        Object rememberedValue;
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj4 = Composer.Companion.Empty;
        Function1 function1 = this.f$3;
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = this.f$2;
        FocusRequester focusRequester = this.f$1;
        DirectDepositSingleInputViewModel directDepositSingleInputViewModel = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    int ordinal = directDepositSingleInputViewModel.navigationType.ordinal();
                    if (ordinal == 0) {
                        navigationType = NavigationType.BACK;
                    } else if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        navigationType = NavigationType.CLOSE;
                    }
                    NavigationType navigationType2 = navigationType;
                    boolean changed2 = gapComposer.changed(focusRequester) | gapComposer.changed(delegatingSoftwareKeyboardController) | gapComposer.changed(function1);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue2 == obj4) {
                        rememberedValue2 = new TapToPayInitiatorNotesKt$$ExternalSyntheticLambda2(function1, focusRequester, delegatingSoftwareKeyboardController, 2);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    DBUtil.TitleBarSub((String) null, navigationType2, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue2, (Modifier) null, (Function3) null, gapComposer, 6, 108);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    String str2 = directDepositSingleInputViewModel.title;
                    DirectDepositSingleInputViewModel.Type type2 = directDepositSingleInputViewModel.inputType;
                    Countries.PageHeader(str2, (Modifier) null, (Function2) null, directDepositSingleInputViewModel.description, gapComposer2, 0, 6);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
                    InputFieldText inputFieldText = directDepositSingleInputViewModel.inputFieldText;
                    if (inputFieldText instanceof TextFieldStateInputFieldText) {
                        gapComposer2.startReplaceGroup(-1849626681);
                        gapComposer2.end(false);
                        m382rememberTextFieldStateLepunE = ((TextFieldStateInputFieldText) inputFieldText).textFieldState;
                    } else {
                        gapComposer2.startReplaceGroup(-1507906999);
                        gapComposer2.startMovableGroup(-1849625560, inputFieldText);
                        m382rememberTextFieldStateLepunE = TextFieldStateKt.m382rememberTextFieldStateLepunE(inputFieldText.getValue().toString(), 0L, gapComposer2, 0, 2);
                        gapComposer2.end(false);
                        gapComposer2.end(false);
                    }
                    CharSequence charSequence = m382rememberTextFieldStateLepunE.getValue$foundation().text;
                    boolean changed3 = gapComposer2.changed(m382rememberTextFieldStateLepunE) | gapComposer2.changed(function1);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (changed3 || rememberedValue3 == obj4) {
                        rememberedValue3 = new SetPinViewKt$SetPin$3$1$1$1(m382rememberTextFieldStateLepunE, function1, null, 5);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    }
                    Updater.LaunchedEffect(gapComposer2, charSequence, (Function2) rememberedValue3);
                    boolean z = type2 instanceof DirectDepositSingleInputViewModel.Type.PaycheckCurrencyAmount;
                    ComposableLambdaImpl composableLambdaImpl2 = z ? DirectDepositFormErrorKt.f385lambda$1885625225 : null;
                    ComposableLambdaImpl composableLambdaImpl3 = type2 instanceof DirectDepositSingleInputViewModel.Type.PaycheckPercentage ? DirectDepositFormErrorKt.f386lambda$1919445179 : null;
                    DirectDepositSingleInputViewModel.Type.CompanyName companyName = DirectDepositSingleInputViewModel.Type.CompanyName.INSTANCE;
                    DirectDepositSingleInputViewModel.Type.Name name = DirectDepositSingleInputViewModel.Type.Name.INSTANCE;
                    DirectDepositSingleInputViewModel.Type.PaycheckPercentage paycheckPercentage = DirectDepositSingleInputViewModel.Type.PaycheckPercentage.INSTANCE;
                    if (!z && !Intrinsics.areEqual(type2, paycheckPercentage)) {
                        if (!Intrinsics.areEqual(type2, name) && !Intrinsics.areEqual(type2, companyName)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            keyboardOptions = new KeyboardOptions(0, Boolean.FALSE, 1, 0, (Boolean) null, 121);
                        }
                    } else {
                        keyboardOptions = new KeyboardOptions(0, (Boolean) null, 3, 0, (Boolean) null, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                    }
                    if (!z) {
                        if (!Intrinsics.areEqual(type2, paycheckPercentage)) {
                            if (!Intrinsics.areEqual(type2, name) && !Intrinsics.areEqual(type2, companyName)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                inputTransformation = null;
                                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                                ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
                                DefaultSizes.spacing.getClass();
                                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                                String str3 = directDepositSingleInputViewModel.inputHint;
                                str = directDepositSingleInputViewModel.inputHelp;
                                if (str != null) {
                                    gapComposer2.startReplaceGroup(-1502092268);
                                    gapComposer2.end(false);
                                    composableLambdaImpl = null;
                                } else {
                                    gapComposer2.startReplaceGroup(-1502092267);
                                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(344026458, new GlobalSearchFeedKt$$ExternalSyntheticLambda17(str, 4), gapComposer2);
                                    gapComposer2.end(false);
                                    composableLambdaImpl = rememberComposableLambda;
                                }
                                changed = gapComposer2.changed(focusRequester) | gapComposer2.changed(delegatingSoftwareKeyboardController);
                                rememberedValue = gapComposer2.rememberedValue();
                                if (!changed || rememberedValue == obj4) {
                                    rememberedValue = new InputFieldBinding$$ExternalSyntheticLambda0(1, focusRequester, delegatingSoftwareKeyboardController);
                                    gapComposer2.updateRememberedValue(rememberedValue);
                                }
                                InputFieldKt.InputField(m382rememberTextFieldStateLepunE, m300paddingVpY3zN4$default, false, false, false, null, composableLambdaImpl2, composableLambdaImpl3, composableLambdaImpl, str3, keyboardOptions, (KeyboardActionHandler) rememberedValue, inputTransformation, null, null, null, gapComposer2, 0, 0, 57404);
                            }
                        } else {
                            inputTransformation2 = PercentInputTransformation.INSTANCE;
                        }
                    } else {
                        inputTransformation2 = CurrencyInputTransformation.INSTANCE;
                    }
                    inputTransformation = inputTransformation2;
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                    ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth2, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    String str32 = directDepositSingleInputViewModel.inputHint;
                    str = directDepositSingleInputViewModel.inputHelp;
                    if (str != null) {
                    }
                    changed = gapComposer2.changed(focusRequester) | gapComposer2.changed(delegatingSoftwareKeyboardController);
                    rememberedValue = gapComposer2.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = new InputFieldBinding$$ExternalSyntheticLambda0(1, focusRequester, delegatingSoftwareKeyboardController);
                    gapComposer2.updateRememberedValue(rememberedValue);
                    InputFieldKt.InputField(m382rememberTextFieldStateLepunE, m300paddingVpY3zN4$default2, false, false, false, null, composableLambdaImpl2, composableLambdaImpl3, composableLambdaImpl, str32, keyboardOptions, (KeyboardActionHandler) rememberedValue, inputTransformation, null, null, null, gapComposer2, 0, 0, 57404);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            default:
                AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                adaptiveStackScope.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((GapComposer) composer3).changed(adaptiveStackScope) ? 4 : 2;
                }
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    Modifier horizontalWeight = adaptiveStackScope.horizontalWeight(companion, 1.0f);
                    boolean z2 = directDepositSingleInputViewModel.buttonEnabled;
                    boolean changed4 = gapComposer3.changed(focusRequester) | gapComposer3.changed(delegatingSoftwareKeyboardController) | gapComposer3.changed(function1);
                    Object rememberedValue4 = gapComposer3.rememberedValue();
                    if (changed4 || rememberedValue4 == obj4) {
                        rememberedValue4 = new TapToPayInitiatorNotesKt$$ExternalSyntheticLambda2(function1, focusRequester, delegatingSoftwareKeyboardController, 1);
                        gapComposer3.updateRememberedValue(rememberedValue4);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue4, horizontalWeight, buttonProminence, false, z2, null, Expect_jvmKt.rememberComposableLambda(1398273085, new ArcadeModal$$ExternalSyntheticLambda3(directDepositSingleInputViewModel, 5), gapComposer3), gapComposer3, 1573248, 40);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ DirectDepositSingleInputKt$$ExternalSyntheticLambda0(DirectDepositSingleInputViewModel directDepositSingleInputViewModel, FocusRequester focusRequester, DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = directDepositSingleInputViewModel;
        this.f$1 = focusRequester;
        this.f$2 = delegatingSoftwareKeyboardController;
        this.f$3 = function1;
    }
}
