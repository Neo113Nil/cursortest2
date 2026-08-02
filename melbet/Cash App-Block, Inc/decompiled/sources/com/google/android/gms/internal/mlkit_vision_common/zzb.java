package com.google.android.gms.internal.mlkit_vision_common;

import android.os.Build;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.relocation.BringIntoViewRequesterImpl;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.DefaultTextFieldColors;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda17;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusOwnerImplKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import androidx.tracing.Trace;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.payments.views.NoteInputViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.retro.views.PaymentPlanSummaryKt$$ExternalSyntheticLambda37;
import com.squareup.cash.support.views.home.SupportHomeViewKt$$ExternalSyntheticLambda2;
import com.stripe.android.uicore.FormInsets;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.elements.FieldDisplayState;
import com.stripe.android.uicore.elements.FieldValidationMessage$Error;
import com.stripe.android.uicore.elements.OTPElementUIKt;
import com.stripe.android.uicore.elements.PhoneNumberController;
import com.stripe.android.uicore.elements.PhoneNumberElementUIKt$$ExternalSyntheticLambda0;
import com.stripe.android.uicore.elements.SectionUIKt;
import com.stripe.android.uicore.elements.TextFieldUIKt;
import com.stripe.android.uicore.elements.compat.CompatTextFieldKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda1;
import com.stripe.hcaptcha.HCaptchaHtmlKt$$ExternalSyntheticLambda0;
import com.stripe.hcaptcha.encode.EncodeKt$$ExternalSyntheticLambda0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public abstract class zzb {
    public static final void DisconnectedAlertIcon(float f, int i, Composer composer, Modifier modifier) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(777695128);
        int i2 = 2;
        int i3 = (gapComposer.changed(f) ? 4 : 2) | i | (gapComposer.changed(modifier) ? 32 : 16);
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else if (Build.VERSION.SDK_INT >= 33) {
            gapComposer.startReplaceGroup(1262086665);
            OTPElementUIKt.DisconnectedAlertIconAgsl(f, i3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, gapComposer, modifier);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(1262197118);
            Icons icons = Icons.AlertFill32;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Trace.m1191Iconww6aTOc(icons, (String) null, SizeKt.m285size3ABfNKs(modifier, 96.0f), colors.semantic.icon.standard, gapComposer, 54, 0);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PaymentPlanSummaryKt$$ExternalSyntheticLambda37(f, modifier, i, i2);
        }
    }

    /* renamed from: PhoneNumberCollectionSection-fhH9uAM, reason: not valid java name */
    public static final void m2024PhoneNumberCollectionSectionfhH9uAM(PhoneNumberController phoneNumberController, Modifier modifier, ComposableLambdaImpl composableLambdaImpl, boolean z, FocusRequester focusRequester, int i, Composer composer, int i2) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1253532877);
        int i3 = i2 | (gapComposer2.changedInstance(phoneNumberController) ? 32 : 16) | (gapComposer2.changed(modifier) ? 256 : 128) | (gapComposer2.changed(z) ? 16384 : PKIFailureInfo.certRevoked) | 14352384 | (gapComposer2.changed(focusRequester) ? 67108864 : 33554432);
        if (gapComposer2.shouldExecute(i3 & 1, (306783379 & i3) != 306783378)) {
            gapComposer = gapComposer2;
            SectionUIKt.Section(null, (FieldValidationMessage$Error) StateFlowsComposeKt.collectAsState(phoneNumberController.validationMessage, gapComposer2).getValue(), SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 8.0f, 1), z, Expect_jvmKt.rememberComposableLambda(-247884311, new PhoneNumberElementUIKt$$ExternalSyntheticLambda0(phoneNumberController, modifier, composableLambdaImpl, focusRequester, i), gapComposer2), gapComposer, ((i3 >> 3) & 7168) | 24960);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda17(phoneNumberController, modifier, composableLambdaImpl, z, focusRequester, i, i2);
        }
    }

    /* renamed from: PhoneNumberElementUI-Rts_TWA, reason: not valid java name */
    public static final void m2025PhoneNumberElementUIRts_TWA(final PhoneNumberController phoneNumberController, final Modifier modifier, final ComposableLambdaImpl composableLambdaImpl, final FocusRequester focusRequester, final int i, Composer composer, int i2) {
        FieldDisplayState fieldDisplayState;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(63118860);
        int i3 = i2 | (gapComposer.changed(true) ? 4 : 2) | (gapComposer.changedInstance(phoneNumberController) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128) | (gapComposer.changedInstance(composableLambdaImpl) ? 2048 : 1024) | (gapComposer.changed(false) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changed(false) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changed(focusRequester) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | 12582912 | (gapComposer.changed(i) ? 67108864 : 33554432);
        if (gapComposer.shouldExecute(1 & i3, (38347923 & i3) != 38347922)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new BringIntoViewRequesterImpl();
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            final BringIntoViewRequesterImpl bringIntoViewRequesterImpl = (BringIntoViewRequesterImpl) rememberedValue2;
            final FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) gapComposer.consume(CompositionLocalsKt.LocalFocusManager);
            final MutableState collectAsState = StateFlowsComposeKt.collectAsState(phoneNumberController.fieldValue, gapComposer);
            StateFlowsComposeKt.collectAsState(phoneNumberController.isComplete, gapComposer);
            final MutableState collectAsState2 = StateFlowsComposeKt.collectAsState(phoneNumberController.validationMessage, gapComposer);
            final MutableState collectAsState3 = StateFlowsComposeKt.collectAsState(phoneNumberController.label, gapComposer);
            final MutableState collectAsState4 = StateFlowsComposeKt.collectAsState(phoneNumberController.placeholder, gapComposer);
            final MutableState collectAsState5 = StateFlowsComposeKt.collectAsState(phoneNumberController.visualTransformation, gapComposer);
            FieldValidationMessage$Error fieldValidationMessage$Error = (FieldValidationMessage$Error) collectAsState2.getValue();
            if (fieldValidationMessage$Error instanceof FieldValidationMessage$Error) {
                fieldDisplayState = FieldDisplayState.ERROR;
            } else {
                if (fieldValidationMessage$Error != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                fieldDisplayState = FieldDisplayState.NORMAL;
            }
            final DefaultTextFieldColors m4073TextFieldColorszf8z9n0 = TextFieldUIKt.m4073TextFieldColorszf8z9n0(fieldDisplayState, 0L, 0L, 0L, gapComposer, 0, 30);
            Object[] objArr = new Object[0];
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new HCaptchaHtmlKt$$ExternalSyntheticLambda0(22);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            final MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue3, gapComposer, 48);
            final FormInsets formInsets = (FormInsets) gapComposer.consume(StripeThemeKt.LocalTextFieldInsets);
            gapComposer.startReplaceGroup(-825856010);
            gapComposer.end(false);
            ProvidedValue defaultProvidedValue$runtime = CompositionLocalsKt.LocalLayoutDirection.defaultProvidedValue$runtime(LayoutDirection.Ltr);
            Function2 function2 = new Function2() { // from class: com.stripe.android.uicore.elements.PhoneNumberElementUIKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    NeverEqualPolicy neverEqualPolicy2;
                    Composer composer2 = (Composer) obj;
                    int intValue = ((Integer) obj2).intValue();
                    GapComposer gapComposer2 = (GapComposer) composer2;
                    if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                        String str = (String) collectAsState.getValue();
                        PhoneNumberController phoneNumberController2 = PhoneNumberController.this;
                        boolean changedInstance = gapComposer2.changedInstance(phoneNumberController2);
                        Object rememberedValue4 = gapComposer2.rememberedValue();
                        NeverEqualPolicy neverEqualPolicy3 = Composer.Companion.Empty;
                        if (changedInstance || rememberedValue4 == neverEqualPolicy3) {
                            neverEqualPolicy2 = neverEqualPolicy3;
                            TextFieldUIKt$TextField$4$1 textFieldUIKt$TextField$4$1 = new TextFieldUIKt$TextField$4$1(1, phoneNumberController2, PhoneNumberController.class, "onValueChange", "onValueChange(Ljava/lang/String;)V", 0, 21);
                            gapComposer2.updateRememberedValue(textFieldUIKt$TextField$4$1);
                            rememberedValue4 = textFieldUIKt$TextField$4$1;
                        } else {
                            neverEqualPolicy2 = neverEqualPolicy3;
                        }
                        KFunction kFunction = (KFunction) rememberedValue4;
                        Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
                        BringIntoViewRequesterImpl bringIntoViewRequesterImpl2 = bringIntoViewRequesterImpl;
                        Modifier focusRequester2 = FocusTraversalKt.focusRequester(BringIntoViewRequesterKt.bringIntoViewRequester(fillMaxWidth, bringIntoViewRequesterImpl2), focusRequester);
                        Object rememberedValue5 = gapComposer2.rememberedValue();
                        if (rememberedValue5 == neverEqualPolicy2) {
                            rememberedValue5 = new EncodeKt$$ExternalSyntheticLambda0(6);
                            gapComposer2.updateRememberedValue(rememberedValue5);
                        }
                        Modifier semantics = SemanticsModifierKt.semantics(focusRequester2, false, (Function1) rememberedValue5);
                        CoroutineScope coroutineScope2 = coroutineScope;
                        boolean changedInstance2 = gapComposer2.changedInstance(coroutineScope2) | gapComposer2.changedInstance(bringIntoViewRequesterImpl2);
                        Object rememberedValue6 = gapComposer2.rememberedValue();
                        if (changedInstance2 || rememberedValue6 == neverEqualPolicy2) {
                            rememberedValue6 = new HCaptcha$$ExternalSyntheticLambda1(3, coroutineScope2, bringIntoViewRequesterImpl2);
                            gapComposer2.updateRememberedValue(rememberedValue6);
                        }
                        Modifier onFocusEvent = FocusOwnerImplKt.onFocusEvent(semantics, (Function1) rememberedValue6);
                        MutableState mutableState2 = mutableState;
                        boolean changed = gapComposer2.changed(mutableState2) | gapComposer2.changedInstance(phoneNumberController2);
                        Object rememberedValue7 = gapComposer2.rememberedValue();
                        if (changed || rememberedValue7 == neverEqualPolicy2) {
                            rememberedValue7 = new HCaptcha$$ExternalSyntheticLambda1(4, phoneNumberController2, mutableState2);
                            gapComposer2.updateRememberedValue(rememberedValue7);
                        }
                        Modifier testTag = TestTagKt.testTag(FocusOwnerImplKt.onFocusChanged(onFocusEvent, (Function1) rememberedValue7), "PhoneNumberTextField");
                        boolean z = ((FieldValidationMessage$Error) collectAsState2.getValue()) != null;
                        VisualTransformation visualTransformation = (VisualTransformation) collectAsState5.getValue();
                        KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, 4, i, (Boolean) null, 115);
                        FocusOwnerImpl focusOwnerImpl2 = focusOwnerImpl;
                        boolean changedInstance3 = gapComposer2.changedInstance(focusOwnerImpl2);
                        Object rememberedValue8 = gapComposer2.rememberedValue();
                        if (changedInstance3 || rememberedValue8 == neverEqualPolicy2) {
                            rememberedValue8 = new NoteInputViewKt$$ExternalSyntheticLambda2(focusOwnerImpl2, 4);
                            gapComposer2.updateRememberedValue(rememberedValue8);
                        }
                        Function1 function1 = (Function1) rememberedValue8;
                        boolean changedInstance4 = gapComposer2.changedInstance(focusOwnerImpl2);
                        Object rememberedValue9 = gapComposer2.rememberedValue();
                        if (changedInstance4 || rememberedValue9 == neverEqualPolicy2) {
                            rememberedValue9 = new NoteInputViewKt$$ExternalSyntheticLambda2(focusOwnerImpl2, 5);
                            gapComposer2.updateRememberedValue(rememberedValue9);
                        }
                        KeyboardActions keyboardActions = new KeyboardActions(function1, (Function1) rememberedValue9, null, 58);
                        FormInsets formInsets2 = formInsets;
                        CompatTextFieldKt.CompatTextField(str, (Function1) kFunction, testTag, null, Expect_jvmKt.rememberComposableLambda(1503889606, new SupportHomeViewKt$$ExternalSyntheticLambda2(phoneNumberController2, collectAsState3), gapComposer2), Expect_jvmKt.rememberComposableLambda(-140059163, new SupportHomeViewKt$$ExternalSyntheticLambda2(collectAsState4, 2), gapComposer2), composableLambdaImpl, z, visualTransformation, keyboardOptions, keyboardActions, true, 0, 0, null, null, m4073TextFieldColorszf8z9n0, new PaddingValuesImpl(formInsets2.start, formInsets2.top, formInsets2.end, formInsets2.bottom), gapComposer2, 14155776);
                    } else {
                        gapComposer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            };
            gapComposer = gapComposer;
            Updater.CompositionLocalProvider(defaultProvidedValue$runtime, Expect_jvmKt.rememberComposableLambda(1206588108, function2, gapComposer), gapComposer, 56);
            gapComposer.startReplaceGroup(-825856010);
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PhoneNumberElementUIKt$$ExternalSyntheticLambda0(phoneNumberController, modifier, composableLambdaImpl, focusRequester, i, i2);
        }
    }

    public static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
