package com.squareup.cash.formview.components.arcade;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.ui.compose.ComposeUiViewKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.card.onboarding.CardModelView$textures$$inlined$combine$1;
import com.squareup.cash.card.onboarding.InteractiveCardView$flingTo$1;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda5;
import com.squareup.cash.formview.components.FormCashtag;
import com.squareup.cash.formview.components.IndividualFormRequirementProvider;
import com.squareup.cash.formview.components.arcade.MultilineTextInputValidator$Result;
import com.squareup.cash.formview.viewmodels.FormTextInputIconViewModel;
import com.squareup.cash.google.pay.RealGooglePayer$$ExternalSyntheticLambda0;
import com.squareup.cash.graphics.swampgl.components.Transform$special$$inlined$map$1;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.money.views.MoneyUiFactory$$ExternalSyntheticLambda1;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter$models$6$1;
import com.squareup.protos.franklin.api.FormBlocker;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes6.dex */
public final class ArcadeFormTextInputGroupView extends AbstractComposeView implements IndividualFormRequirementProvider {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final SharedFlowImpl focusRequestFlow;
    public final String formElementId;
    public final List inputFields;
    public final ArrayList multilineValidationResults;
    public final Function1 onEvent;
    public final Function0 onSubmit;
    public final String securityText;
    public final ArrayList textChangesForValidations;

    public final class InputFieldModel {
        public final FormBlocker.Element.TextInputElement.InputField.AutofillContentType autofillType;
        public final FormTextInputIconViewModel icon;
        public final List inputTransformations;
        public final List invalidInputs;
        public final boolean isEnabled;
        public final boolean isRequired;
        public final boolean isSingleLine;
        public final FormBlocker.Element.TextInputElement.InputField.CapitalizationType keyboardCapitalizationType;
        public final FormBlocker.Element.TextInputElement.KeyboardType keyboardType;
        public final String labelText;
        public final Integer maxCharacterCount;
        public final Integer minCharacterCount;
        public final String placeholderText;
        public final String preFilledText;
        public final FormBlocker.Element.TextInputElement.Security security;
        public final List validations;

        public InputFieldModel(FormTextInputIconViewModel formTextInputIconViewModel, String str, String str2, String str3, Integer num, Integer num2, FormBlocker.Element.TextInputElement.KeyboardType keyboardType, FormBlocker.Element.TextInputElement.Security security, List list, boolean z, boolean z2, List list2, boolean z3, FormBlocker.Element.TextInputElement.InputField.AutofillContentType autofillContentType, FormBlocker.Element.TextInputElement.InputField.CapitalizationType capitalizationType, List list3) {
            this.icon = formTextInputIconViewModel;
            this.preFilledText = str;
            this.placeholderText = str2;
            this.labelText = str3;
            this.minCharacterCount = num;
            this.maxCharacterCount = num2;
            this.keyboardType = keyboardType;
            this.security = security;
            this.validations = list;
            this.isSingleLine = z;
            this.isRequired = z2;
            this.inputTransformations = list2;
            this.isEnabled = z3;
            this.autofillType = autofillContentType;
            this.keyboardCapitalizationType = capitalizationType;
            this.invalidInputs = list3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InputFieldModel)) {
                return false;
            }
            InputFieldModel inputFieldModel = (InputFieldModel) obj;
            return this.icon == inputFieldModel.icon && Intrinsics.areEqual(this.preFilledText, inputFieldModel.preFilledText) && Intrinsics.areEqual(this.placeholderText, inputFieldModel.placeholderText) && Intrinsics.areEqual(this.labelText, inputFieldModel.labelText) && Intrinsics.areEqual(this.minCharacterCount, inputFieldModel.minCharacterCount) && Intrinsics.areEqual(this.maxCharacterCount, inputFieldModel.maxCharacterCount) && this.keyboardType == inputFieldModel.keyboardType && this.security == inputFieldModel.security && Intrinsics.areEqual(this.validations, inputFieldModel.validations) && this.isSingleLine == inputFieldModel.isSingleLine && this.isRequired == inputFieldModel.isRequired && Intrinsics.areEqual(this.inputTransformations, inputFieldModel.inputTransformations) && this.isEnabled == inputFieldModel.isEnabled && this.autofillType == inputFieldModel.autofillType && this.keyboardCapitalizationType == inputFieldModel.keyboardCapitalizationType && Intrinsics.areEqual(this.invalidInputs, inputFieldModel.invalidInputs);
        }

        public final int hashCode() {
            FormTextInputIconViewModel formTextInputIconViewModel = this.icon;
            int hashCode = (formTextInputIconViewModel == null ? 0 : formTextInputIconViewModel.hashCode()) * 31;
            String str = this.preFilledText;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.placeholderText;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.labelText;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.minCharacterCount;
            int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.maxCharacterCount;
            int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
            FormBlocker.Element.TextInputElement.KeyboardType keyboardType = this.keyboardType;
            int hashCode7 = (hashCode6 + (keyboardType == null ? 0 : keyboardType.hashCode())) * 31;
            FormBlocker.Element.TextInputElement.Security security = this.security;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m((hashCode7 + (security == null ? 0 : security.hashCode())) * 31, 31, this.validations), 31, this.isSingleLine), 31, this.isRequired), 31, this.inputTransformations), 31, this.isEnabled);
            FormBlocker.Element.TextInputElement.InputField.AutofillContentType autofillContentType = this.autofillType;
            int hashCode8 = (m + (autofillContentType == null ? 0 : autofillContentType.hashCode())) * 31;
            FormBlocker.Element.TextInputElement.InputField.CapitalizationType capitalizationType = this.keyboardCapitalizationType;
            return this.invalidInputs.hashCode() + ((hashCode8 + (capitalizationType != null ? capitalizationType.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InputFieldModel(icon=");
            sb.append(this.icon);
            sb.append(", preFilledText=");
            sb.append(this.preFilledText);
            sb.append(", placeholderText=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.placeholderText, ", labelText=", this.labelText, ", minCharacterCount=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.minCharacterCount, ", maxCharacterCount=", this.maxCharacterCount, ", keyboardType=");
            sb.append(this.keyboardType);
            sb.append(", security=");
            sb.append(this.security);
            sb.append(", validations=");
            sb.append(this.validations);
            sb.append(", isSingleLine=");
            sb.append(this.isSingleLine);
            sb.append(", isRequired=");
            sb.append(this.isRequired);
            sb.append(", inputTransformations=");
            sb.append(this.inputTransformations);
            sb.append(", isEnabled=");
            sb.append(this.isEnabled);
            sb.append(", autofillType=");
            sb.append(this.autofillType);
            sb.append(", keyboardCapitalizationType=");
            sb.append(this.keyboardCapitalizationType);
            sb.append(", invalidInputs=");
            sb.append(this.invalidInputs);
            sb.append(")");
            return sb.toString();
        }
    }

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[FormTextInputIconViewModel.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                FormTextInputIconViewModel formTextInputIconViewModel = FormTextInputIconViewModel.LOCK;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                FormTextInputIconViewModel formTextInputIconViewModel2 = FormTextInputIconViewModel.LOCK;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[FormBlocker.Element.TextInputElement.Security.values().length];
            try {
                iArr2[FormBlocker.Element.TextInputElement.Security.SECURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[FormBlocker.Element.TextInputElement.Security.CLEAR_TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[FormBlocker.Element.TextInputElement.KeyboardType.values().length];
            try {
                iArr3[FormBlocker.Element.TextInputElement.KeyboardType.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[FormBlocker.Element.TextInputElement.KeyboardType.NUMBER_PAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[FormBlocker.Element.TextInputElement.KeyboardType.NUMBER_PAD_WITH_ABC.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[FormBlocker.Element.TextInputElement.KeyboardType.NUMBER_PAD_WITH_DECIMAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[FormBlocker.Element.TextInputElement.KeyboardType.EMAIL.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[FormBlocker.Element.TextInputElement.InputField.AutofillContentType.values().length];
            try {
                iArr4[FormBlocker.Element.TextInputElement.InputField.AutofillContentType.FIRST_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[FormBlocker.Element.TextInputElement.InputField.AutofillContentType.LAST_NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[FormBlocker.Element.TextInputElement.InputField.AutofillContentType.FULL_ADDRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[FormBlocker.Element.TextInputElement.InputField.AutofillContentType.STREET_ADDRESS_LINE_1.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[FormBlocker.Element.TextInputElement.InputField.AutofillContentType.STREET_ADDRESS_LINE_2.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[FormBlocker.Element.TextInputElement.InputField.AutofillContentType.CITY.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[FormBlocker.Element.TextInputElement.InputField.AutofillContentType.STATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[FormBlocker.Element.TextInputElement.InputField.AutofillContentType.POSTAL_CODE.ordinal()] = 8;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[FormBlocker.Element.TextInputElement.InputField.AutofillContentType.BIRTH_DATE.ordinal()] = 9;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[FormBlocker.Element.TextInputElement.InputField.AutofillContentType.PHONE_NUMBER.ordinal()] = 10;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[FormBlocker.Element.TextInputElement.InputField.AutofillContentType.EMAIL.ordinal()] = 11;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr4[FormBlocker.Element.TextInputElement.InputField.AutofillContentType.DISABLED.ordinal()] = 12;
            } catch (NoSuchFieldError unused22) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[FormBlocker.Element.TextInputElement.InputField.CapitalizationType.values().length];
            try {
                iArr5[FormBlocker.Element.TextInputElement.InputField.CapitalizationType.NO_CAPITALIZATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr5[FormBlocker.Element.TextInputElement.InputField.CapitalizationType.WORDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr5[FormBlocker.Element.TextInputElement.InputField.CapitalizationType.SENTENCES.ordinal()] = 3;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr5[FormBlocker.Element.TextInputElement.InputField.CapitalizationType.ALL_CHARACTERS.ordinal()] = 4;
            } catch (NoSuchFieldError unused26) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArcadeFormTextInputGroupView(Context context, List list, String str, Function1 function1, Function0 function0, String str2) {
        super(context, null, 6, 0);
        context.getClass();
        list.getClass();
        this.inputFields = list;
        this.securityText = str;
        this.onEvent = function1;
        this.onSubmit = function0;
        this.formElementId = str2;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(FlowKt.MutableStateFlow(""));
        }
        this.textChangesForValidations = arrayList;
        int size2 = this.inputFields.size();
        ArrayList arrayList2 = new ArrayList(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList2.add(FlowKt.MutableStateFlow(MultilineTextInputValidator$Result.NotApplicable.INSTANCE));
        }
        this.multilineValidationResults = arrayList2;
        this.focusRequestFlow = FlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_OLDEST, 1);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        ArcadeFormTextInputGroupView arcadeFormTextInputGroupView;
        GapComposer gapComposer;
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController;
        List list;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-2117954812);
        int i2 = (gapComposer2.changedInstance(this) ? 4 : 2) | i;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Object[] objArr = {this.inputFields};
            boolean changedInstance = gapComposer2.changedInstance(this);
            Object rememberedValue = gapComposer2.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == obj) {
                rememberedValue = new RealGooglePayer$$ExternalSyntheticLambda0(this, 5);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            List list2 = (List) SaverKt.m581rememberSaveable(objArr, (Saver) TextFieldStateListSaver.INSTANCE, (Function0) rememberedValue, (Composer) gapComposer2, 48);
            gapComposer2.startReplaceGroup(459945605);
            int size = list2.size();
            int i3 = 0;
            while (i3 < size) {
                TextFieldState textFieldState = (TextFieldState) list2.get(i3);
                CharSequence charSequence = textFieldState.getValue$foundation().text;
                boolean changedInstance2 = gapComposer2.changedInstance(this) | gapComposer2.changed(i3) | gapComposer2.changed(textFieldState) | gapComposer2.changedInstance(list2);
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (changedInstance2 || rememberedValue2 == obj) {
                    List list3 = list2;
                    AnimationsKt$takeUntil$1$1.AnonymousClass1 anonymousClass1 = new AnimationsKt$takeUntil$1$1.AnonymousClass1(this, i3, textFieldState, list3, null, 14);
                    list = list3;
                    gapComposer2.updateRememberedValue(anonymousClass1);
                    rememberedValue2 = anonymousClass1;
                } else {
                    list = list2;
                }
                Updater.LaunchedEffect(this, charSequence, (Function2) rememberedValue2, gapComposer2);
                i3++;
                list2 = list;
            }
            List list4 = list2;
            gapComposer2.end(false);
            boolean changedInstance3 = gapComposer2.changedInstance(list4) | gapComposer2.changedInstance(this);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changedInstance3 || rememberedValue3 == obj) {
                rememberedValue3 = new FormCashtag.AnonymousClass8.AnonymousClass2(list4, this, null, 20);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            Updater.LaunchedEffect(gapComposer2, this, (Function2) rememberedValue3);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (rememberedValue4 == obj) {
                rememberedValue4 = Recorder$$ExternalSyntheticOutline2.m106m(gapComposer2);
            }
            FocusRequester focusRequester = (FocusRequester) rememberedValue4;
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController2 = (DelegatingSoftwareKeyboardController) gapComposer2.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) gapComposer2.consume(CompositionLocalsKt.LocalFocusManager);
            Boolean bool = (Boolean) gapComposer2.consume(ComposeUiViewKt.LocalOverlayActive);
            boolean booleanValue = bool.booleanValue();
            boolean changed = gapComposer2.changed(booleanValue) | gapComposer2.changedInstance(focusOwnerImpl) | gapComposer2.changed(delegatingSoftwareKeyboardController2);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (changed || rememberedValue5 == obj) {
                delegatingSoftwareKeyboardController = delegatingSoftwareKeyboardController2;
                ArcadeFormDateInputView$Content$7$1 arcadeFormDateInputView$Content$7$1 = new ArcadeFormDateInputView$Content$7$1(booleanValue, focusOwnerImpl, delegatingSoftwareKeyboardController, focusRequester, (Continuation) null, 3);
                gapComposer2.updateRememberedValue(arcadeFormDateInputView$Content$7$1);
                rememberedValue5 = arcadeFormDateInputView$Content$7$1;
            } else {
                delegatingSoftwareKeyboardController = delegatingSoftwareKeyboardController2;
            }
            Updater.LaunchedEffect(gapComposer2, bool, (Function2) rememberedValue5);
            MutableState rememberUpdatedState = Updater.rememberUpdatedState(bool, gapComposer2);
            SharedFlowImpl sharedFlowImpl = this.focusRequestFlow;
            Updater.LaunchedEffect(gapComposer2, sharedFlowImpl, new MoneybotChatPresenter$models$6$1(sharedFlowImpl, (Continuation) null, rememberUpdatedState, this, focusRequester, delegatingSoftwareKeyboardController));
            arcadeFormTextInputGroupView = this;
            gapComposer = gapComposer2;
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1295750567, new MoneyUiFactory$$ExternalSyntheticLambda1(this, delegatingSoftwareKeyboardController, list4, focusRequester, 6), gapComposer2), gapComposer, 3072, 7);
        } else {
            arcadeFormTextInputGroupView = this;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal$$ExternalSyntheticLambda5(arcadeFormTextInputGroupView, i, 21);
        }
    }

    @Override // com.squareup.cash.formview.components.IndividualFormRequirementProvider
    public final Flow isRequirementFulfilled() {
        List list = this.inputFields;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            int i2 = 3;
            if (!it.hasNext()) {
                CardModelView$textures$$inlined$combine$1 cardModelView$textures$$inlined$combine$1 = new CardModelView$textures$$inlined$combine$1((Flow[]) CollectionsKt.toList(arrayList).toArray(new Flow[0]), i2);
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                return FlowKt.distinctUntilChanged(FlowKt.flowOn(cardModelView$textures$$inlined$combine$1, DefaultIoScheduler.INSTANCE));
            }
            Object next = it.next();
            int i3 = i + 1;
            Continuation continuation = null;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            TextInputValidator textInputValidator = new TextInputValidator(((InputFieldModel) next).validations);
            Flow flow = (Flow) this.textChangesForValidations.get(i);
            flow.getClass();
            Transform$special$$inlined$map$1 transform$special$$inlined$map$1 = new Transform$special$$inlined$map$1(flow, textInputValidator, 11);
            DefaultScheduler defaultScheduler2 = Dispatchers.Default;
            arrayList.add(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(FlowKt.distinctUntilChanged(FlowKt.flowOn(transform$special$$inlined$map$1, DefaultIoScheduler.INSTANCE)), (Flow) this.multilineValidationResults.get(i), new InteractiveCardView$flingTo$1.AnonymousClass1(i2, continuation, 2), 0));
            i = i3;
        }
    }
}
