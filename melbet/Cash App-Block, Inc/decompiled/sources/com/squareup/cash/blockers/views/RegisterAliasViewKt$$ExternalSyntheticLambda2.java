package com.squareup.cash.blockers.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.relocation.BringIntoViewRequesterImpl;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.PartialGapBuffer;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.Updater$$ExternalSyntheticLambda0;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.broadway.presenter.molecule.AnswerDispatcher;
import app.cash.broadway.presenter.molecule.AnswersKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt$asPresenter$1;
import app.cash.broadway.presenter.molecule.PresenterLifecycleOwner;
import app.cash.broadway.presenter.molecule.RenavigationDispatcher;
import app.cash.broadway.presenter.molecule.RenavigationKt;
import app.cash.broadway.presenter.molecule.SwipeCallbackDispatcher;
import app.cash.broadway.presenter.molecule.SwipeKt;
import app.cash.broadway.presenter.molecule.common.MoleculePresenterStateRegistry;
import app.cash.molecule.PlatformKt;
import bo.app.q2$$ExternalSyntheticLambda8;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import coil3.svg.SvgDecoder$$ExternalSyntheticLambda0;
import com.squareup.cash.CashApp$$ExternalSyntheticLambda4;
import com.squareup.cash.CashApp$onCreate$4$1$1;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.button.ButtonCtaGroupOrientation;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.input.InputFieldKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.viewmodels.RegisterAliasViewEvent;
import com.squareup.cash.blockers.viewmodels.RegisterAliasViewModel;
import com.squareup.cash.blockers.views.SwitchToEmailState;
import com.squareup.cash.braze.RealBrazeManager$$ExternalSyntheticLambda0;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.mooncake.resources.ImageResourcesKt;
import com.squareup.cash.scrubbing.InternationalPhoneNumberOutputTransformation;
import com.squareup.cash.securitysignals.ui.TouchRecorder;
import com.squareup.cash.util.lifecycle.MinimumLifecycleOwner;
import com.squareup.protos.common.countries.Country;
import com.squareup.util.Strings;
import com.squareup.util.android.PhoneNumbers;
import com.squareup.util.cash.Countries;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.ReadonlySharedFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.slf4j.Marker;

/* loaded from: classes.dex */
public final /* synthetic */ class RegisterAliasViewKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$10;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ Object f$7;
    public final /* synthetic */ Object f$8;
    public final /* synthetic */ Object f$9;

    public /* synthetic */ RegisterAliasViewKt$$ExternalSyntheticLambda2(BringIntoViewRequesterImpl bringIntoViewRequesterImpl, TextFieldState textFieldState, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController, RegisterAliasViewModel registerAliasViewModel, TouchRecorder touchRecorder, Function1 function1) {
        this.f$1 = registerAliasViewModel;
        this.f$2 = delegatingSoftwareKeyboardController;
        this.f$3 = function1;
        this.f$4 = touchRecorder;
        this.f$5 = bringIntoViewRequesterImpl;
        this.f$6 = textFieldState;
        this.f$7 = mutableState;
        this.f$8 = mutableState2;
        this.f$9 = mutableState3;
        this.f$10 = mutableState4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Function1 function1;
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj3 = this.f$10;
        Object obj4 = this.f$9;
        Object obj5 = this.f$8;
        Object obj6 = this.f$7;
        Object obj7 = this.f$6;
        Object obj8 = this.f$5;
        Object obj9 = this.f$4;
        Object obj10 = this.f$3;
        Object obj11 = this.f$2;
        Object obj12 = this.f$1;
        switch (i) {
            case 0:
                final RegisterAliasViewModel registerAliasViewModel = (RegisterAliasViewModel) obj12;
                final DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj11;
                final Function1 function12 = (Function1) obj10;
                final TouchRecorder touchRecorder = (TouchRecorder) obj9;
                final BringIntoViewRequesterImpl bringIntoViewRequesterImpl = (BringIntoViewRequesterImpl) obj8;
                final TextFieldState textFieldState = (TextFieldState) obj7;
                final MutableState mutableState = (MutableState) obj6;
                final MutableState mutableState2 = (MutableState) obj5;
                final MutableState mutableState3 = (MutableState) obj4;
                final MutableState mutableState4 = (MutableState) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    Modifier m = BalanceFeedKt$$ExternalSyntheticOutline0.m(Modifier.Companion.$$INSTANCE, colors.semantic.background.f1047app, ColorKt.RectangleShape, 1.0f);
                    boolean z = registerAliasViewModel.isLoading;
                    if (registerAliasViewModel.loadingDirection == RegisterAliasViewModel.LoadingDirection.BACKWARD) {
                        gapComposer.startReplaceGroup(1649015617);
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (rememberedValue == neverEqualPolicy) {
                            rememberedValue = new SvgDecoder$$ExternalSyntheticLambda0(26);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        function1 = (Function1) rememberedValue;
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(1649074114);
                        Object rememberedValue2 = gapComposer.rememberedValue();
                        if (rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new SvgDecoder$$ExternalSyntheticLambda0(27);
                            gapComposer.updateRememberedValue(rememberedValue2);
                        }
                        function1 = (Function1) rememberedValue2;
                        gapComposer.end(false);
                    }
                    Strings.LoadableFullScreenContent(registerAliasViewModel, z, m, function1, null, Expect_jvmKt.rememberComposableLambda(-1563982797, new Function4() { // from class: com.squareup.cash.blockers.views.RegisterAliasViewKt$$ExternalSyntheticLambda6
                        /* JADX WARN: Code restructure failed: missing block: B:28:0x01da, code lost:
                        
                            if (r12 == r5) goto L43;
                         */
                        @Override // kotlin.jvm.functions.Function4
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invoke(Object obj13, Object obj14, Object obj15, Object obj16) {
                            NeverEqualPolicy neverEqualPolicy2;
                            boolean z2;
                            final RegisterAliasViewModel registerAliasViewModel2 = (RegisterAliasViewModel) obj14;
                            ((Integer) obj16).getClass();
                            ((AnimatedContentScopeImpl) obj13).getClass();
                            registerAliasViewModel2.getClass();
                            RegisterAliasViewModel.Mode mode = registerAliasViewModel2.mode;
                            Country country = registerAliasViewModel2.customerCountry;
                            GapComposer gapComposer2 = (GapComposer) ((Composer) obj15);
                            boolean changed = gapComposer2.changed(mode.ordinal());
                            Applier applier = gapComposer2.applier;
                            boolean changed2 = changed | gapComposer2.changed(country.ordinal());
                            Object rememberedValue3 = gapComposer2.rememberedValue();
                            NeverEqualPolicy neverEqualPolicy3 = Composer.Companion.Empty;
                            if (changed2 || rememberedValue3 == neverEqualPolicy3) {
                                rememberedValue3 = mode == RegisterAliasViewModel.Mode.SMS ? new InternationalPhoneNumberOutputTransformation(country.name()) : null;
                                gapComposer2.updateRememberedValue(rememberedValue3);
                            }
                            InternationalPhoneNumberOutputTransformation internationalPhoneNumberOutputTransformation = (InternationalPhoneNumberOutputTransformation) rememberedValue3;
                            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
                            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxSize);
                            ComposeUiNode.Companion.getClass();
                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                            if (applier == null) {
                                Updater.invalidApplier();
                                throw null;
                            }
                            gapComposer2.startReusableNode();
                            if (gapComposer2.inserting) {
                                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                            } else {
                                gapComposer2.useNode();
                            }
                            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                            Integer valueOf = Integer.valueOf(hashCode);
                            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
                            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
                            boolean z3 = registerAliasViewModel2.showUpdatedTerms;
                            NavigationType navigationType = registerAliasViewModel2.showCloseButton ? NavigationType.CLOSE : NavigationType.NONE;
                            final DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController2 = delegatingSoftwareKeyboardController;
                            boolean changed3 = gapComposer2.changed(delegatingSoftwareKeyboardController2);
                            final Function1 function13 = function12;
                            boolean changed4 = changed3 | gapComposer2.changed(function13);
                            Object rememberedValue4 = gapComposer2.rememberedValue();
                            if (changed4 || rememberedValue4 == neverEqualPolicy3) {
                                rememberedValue4 = new RegisterAliasViewKt$$ExternalSyntheticLambda7(delegatingSoftwareKeyboardController2, function13);
                                gapComposer2.updateRememberedValue(rememberedValue4);
                            }
                            final TouchRecorder touchRecorder2 = touchRecorder;
                            DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue4, (Modifier) null, Expect_jvmKt.rememberComposableLambda(820720606, new Function3() { // from class: com.squareup.cash.blockers.views.RegisterAliasViewKt$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj17, Object obj18, Object obj19) {
                                    TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj17;
                                    Composer composer2 = (Composer) obj18;
                                    int intValue2 = ((Integer) obj19).intValue();
                                    titleBarActionScope.getClass();
                                    int i2 = 4;
                                    if ((intValue2 & 6) == 0) {
                                        intValue2 |= ((GapComposer) composer2).changed(titleBarActionScope) ? 4 : 2;
                                    }
                                    GapComposer gapComposer3 = (GapComposer) composer2;
                                    if (!gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                                        gapComposer3.skipToGroupEnd();
                                    } else if (RegisterAliasViewModel.this.helpButtonVisible) {
                                        gapComposer3.startReplaceGroup(-1161178300);
                                        Strings.TouchRecordingLayout(touchRecorder2, null, Expect_jvmKt.rememberComposableLambda(355357444, new CashApp$$ExternalSyntheticLambda4(i2, titleBarActionScope, function13, delegatingSoftwareKeyboardController2), gapComposer3), gapComposer3, 392, 2);
                                        gapComposer3.end(false);
                                    } else {
                                        gapComposer3.startReplaceGroup(-1160717020);
                                        gapComposer3.end(false);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, gapComposer2), gapComposer2, 1572870, 44);
                            if (1.0f <= 0.0d) {
                                InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                            }
                            Modifier verticalScroll$default = ImageKt.verticalScroll$default(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), ImageKt.rememberScrollState(gapComposer2), false, 14);
                            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
                            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, verticalScroll$default);
                            gapComposer2.startReusableNode();
                            if (gapComposer2.inserting) {
                                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                            } else {
                                gapComposer2.useNode();
                            }
                            Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
                            Countries.PageHeader(registerAliasViewModel2.title, (Modifier) null, (Function2) null, (String) null, gapComposer2, 0, 14);
                            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
                            Modifier focusRequester = FocusTraversalKt.focusRequester(BringIntoViewRequesterKt.bringIntoViewRequester(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), bringIntoViewRequesterImpl), DBUtil.rememberFocusRequesterAndRequestFocus(gapComposer2));
                            final RegisterAliasViewModel registerAliasViewModel3 = registerAliasViewModel;
                            final MutableState mutableState5 = mutableState;
                            InputTransformation inputTransformation = new InputTransformation() { // from class: com.squareup.cash.blockers.views.RegisterAliasViewKt$RegisterAlias$4$3$1$3$1
                                @Override // androidx.compose.foundation.text.input.InputTransformation
                                public final void transformInput(TextFieldBuffer textFieldBuffer) {
                                    RegisterAliasViewModel registerAliasViewModel4;
                                    PartialGapBuffer partialGapBuffer = textFieldBuffer.buffer;
                                    TextFieldCharSequence textFieldCharSequence = textFieldBuffer.originalValue;
                                    String partialGapBuffer2 = partialGapBuffer.toString();
                                    int i2 = 0;
                                    while (true) {
                                        int length = partialGapBuffer2.length();
                                        registerAliasViewModel4 = RegisterAliasViewModel.this;
                                        if (i2 >= length) {
                                            break;
                                        }
                                        if (!Character.isLetter(partialGapBuffer2.charAt(i2))) {
                                            i2++;
                                        } else if (registerAliasViewModel4.mode == RegisterAliasViewModel.Mode.SMS) {
                                            if (!registerAliasViewModel4.canSwitchMode) {
                                                textFieldBuffer.revertAllChanges();
                                                return;
                                            }
                                            mutableState5.setValue(new SwitchToEmailState.Unhandled(StringsKt.removePrefix(textFieldCharSequence.text, partialGapBuffer2)));
                                            textFieldBuffer.revertAllChanges();
                                            function13.invoke(RegisterAliasViewEvent.SwitchToEmail.INSTANCE);
                                            return;
                                        }
                                    }
                                    RegisterAliasViewModel.Mode mode2 = registerAliasViewModel4.mode;
                                    RegisterAliasViewModel.Mode mode3 = RegisterAliasViewModel.Mode.SMS;
                                    RegisterAliasViewModel registerAliasViewModel5 = registerAliasViewModel3;
                                    if (mode2 == mode3 && textFieldCharSequence.text.length() == 0 && partialGapBuffer2.length() == 1 && (registerAliasViewModel5.prefillCountryCode != null || PhoneNumbers.getCountryCallingCode(registerAliasViewModel4.customerCountry.name()) != null)) {
                                        ImageResourcesKt.insert(textFieldBuffer, 0, Marker.ANY_NON_NULL_MARKER + registerAliasViewModel5.prefillCountryCode);
                                        return;
                                    }
                                    if (registerAliasViewModel5.mode == mode3 && PhoneNumbers.normalize(textFieldCharSequence.text.toString()) != null) {
                                        if (partialGapBuffer2.length() > textFieldCharSequence.text.length()) {
                                            textFieldBuffer.revertAllChanges();
                                        }
                                    } else {
                                        if (registerAliasViewModel5.mode != mode3 || !StringsKt.contains(textFieldCharSequence.text, (CharSequence) Marker.ANY_NON_NULL_MARKER, false) || StringsKt.contains((CharSequence) partialGapBuffer2, (CharSequence) Marker.ANY_NON_NULL_MARKER, false) || StringsKt.isBlank(partialGapBuffer2)) {
                                            return;
                                        }
                                        ImageResourcesKt.insert(textFieldBuffer, 0, Marker.ANY_NON_NULL_MARKER + registerAliasViewModel5.prefillCountryCode);
                                    }
                                }
                            };
                            KeyboardOptions keyboardOptions = (KeyboardOptions) mutableState2.getValue();
                            boolean changed5 = gapComposer2.changed(function13);
                            final TextFieldState textFieldState2 = textFieldState;
                            boolean changed6 = changed5 | gapComposer2.changed(textFieldState2) | gapComposer2.changedInstance(touchRecorder2);
                            Object rememberedValue5 = gapComposer2.rememberedValue();
                            if (changed6) {
                                neverEqualPolicy2 = neverEqualPolicy3;
                            } else {
                                neverEqualPolicy2 = neverEqualPolicy3;
                            }
                            rememberedValue5 = new KeyboardActionHandler() { // from class: com.squareup.cash.blockers.views.RegisterAliasViewKt$$ExternalSyntheticLambda9
                                @Override // androidx.compose.foundation.text.input.KeyboardActionHandler
                                public final void onKeyboardAction(q2$$ExternalSyntheticLambda8 q2__externalsyntheticlambda8) {
                                    Function1.this.invoke(new RegisterAliasViewEvent.Submit(textFieldState2.getValue$foundation().text.toString(), touchRecorder2.getSignalsContext()));
                                }
                            };
                            gapComposer2.updateRememberedValue(rememberedValue5);
                            InputFieldKt.InputField(textFieldState2, focusRequester, false, false, false, null, null, null, null, registerAliasViewModel2.hint, keyboardOptions, (KeyboardActionHandler) rememberedValue5, inputTransformation, internationalPhoneNumberOutputTransformation, null, null, gapComposer2, 0, 0, 49660);
                            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.m299paddingVpY3zN4(companion, 16.0f, 20.0f), 1.0f);
                            boolean changed7 = gapComposer2.changed(function13);
                            Object rememberedValue6 = gapComposer2.rememberedValue();
                            if (changed7 || rememberedValue6 == neverEqualPolicy2) {
                                rememberedValue6 = new RealBrazeManager$$ExternalSyntheticLambda0(function13, 8);
                                gapComposer2.updateRememberedValue(rememberedValue6);
                            }
                            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(fillMaxWidth, false, null, null, (Function0) rememberedValue6, 15);
                            String stringResource = Room.stringResource(gapComposer2, R.string.blockers_account_recovery_help);
                            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
                            TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer2.consume(staticProvidableCompositionLocal)).bodyMedium, 0L, 0L, null, null, 0L, null, 0L, TextDecoration.Underline, null, null, 3, 0L, null, null, 0, 16740351);
                            Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                            if (colors2 == null) {
                                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                            } else {
                                gapComposer2.startReplaceGroup(-1762997739);
                                gapComposer2.end(false);
                            }
                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, colors2.semantic.text.standard, (Composer) gapComposer2, m183clickableoSLSa3U$default, m994copyp1EtxEg$default, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                            GapComposer gapComposer3 = gapComposer2;
                            if (1.0f <= 0.0d) {
                                InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                            }
                            SpacerKt.Spacer(gapComposer3, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                            String str = registerAliasViewModel2.terms;
                            if (str == null) {
                                gapComposer3.startReplaceGroup(376648308);
                                gapComposer3.end(false);
                                z2 = true;
                            } else {
                                gapComposer3.startReplaceGroup(376648309);
                                if (((Boolean) mutableState3.getValue()).booleanValue()) {
                                    gapComposer3.startReplaceGroup(-1608320277);
                                    Modifier testTag = TestTagKt.testTag(SpacerKt.m299paddingVpY3zN4(companion, 16.0f, 8.0f), "terms_text");
                                    TextStyle textStyle = ((Typography) gapComposer3.consume(staticProvidableCompositionLocal)).bodyMedium;
                                    boolean changed8 = gapComposer3.changed(function13);
                                    Object rememberedValue7 = gapComposer3.rememberedValue();
                                    if (changed8 || rememberedValue7 == neverEqualPolicy2) {
                                        rememberedValue7 = new Updater$$ExternalSyntheticLambda0(function13, 3, (byte) 0);
                                        gapComposer3.updateRememberedValue(rememberedValue7);
                                    }
                                    z2 = true;
                                    LazyDslKt.m304MarkdownTextpCuZGqc(str, (Function2) rememberedValue7, testTag, textStyle, 0L, null, null, null, 0, 0, 3, gapComposer3, MLKEMEngine.KyberPolyBytes, IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    gapComposer3 = gapComposer3;
                                    gapComposer3.end(false);
                                } else {
                                    z2 = true;
                                    gapComposer3.startReplaceGroup(-1607950819);
                                    gapComposer3.end(false);
                                }
                                gapComposer3.end(false);
                            }
                            gapComposer3.end(z2);
                            Modifier imePadding = SpacerKt.imePadding(SizeKt.fillMaxWidth(companion, 1.0f));
                            ButtonCtaGroupOrientation buttonCtaGroupOrientation = z3 ? ButtonCtaGroupOrientation.AUTOMATIC : ButtonCtaGroupOrientation.VERTICAL;
                            final MutableState mutableState6 = mutableState4;
                            GapComposer gapComposer4 = gapComposer3;
                            DimensionKt.ButtonCtaGroup(imePadding, false, buttonCtaGroupOrientation, null, Expect_jvmKt.rememberComposableLambda(-1078715461, new Function3() { // from class: com.squareup.cash.blockers.views.RegisterAliasViewKt$$ExternalSyntheticLambda12
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj17, Object obj18, Object obj19) {
                                    AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj17;
                                    Composer composer2 = (Composer) obj18;
                                    int intValue2 = ((Integer) obj19).intValue();
                                    adaptiveStackScope.getClass();
                                    if ((intValue2 & 6) == 0) {
                                        intValue2 |= ((GapComposer) composer2).changed(adaptiveStackScope) ? 4 : 2;
                                    }
                                    GapComposer gapComposer5 = (GapComposer) composer2;
                                    if (gapComposer5.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                                        final RegisterAliasViewModel registerAliasViewModel4 = registerAliasViewModel2;
                                        boolean z4 = registerAliasViewModel4.secondaryButtonVisible;
                                        Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                                        final TouchRecorder touchRecorder3 = touchRecorder2;
                                        final TextFieldState textFieldState3 = textFieldState2;
                                        final Function1 function14 = function13;
                                        if (z4) {
                                            gapComposer5.startReplaceGroup(-1066870162);
                                            Strings.TouchRecordingLayout(touchRecorder3, adaptiveStackScope.horizontalWeight(companion2, 1.0f), Expect_jvmKt.rememberComposableLambda(-1616115359, new CashApp$$ExternalSyntheticLambda4(3, registerAliasViewModel4, textFieldState3, function14), gapComposer5), gapComposer5, 392, 0);
                                            gapComposer5.end(false);
                                        } else {
                                            gapComposer5.startReplaceGroup(-1065204377);
                                            gapComposer5.end(false);
                                        }
                                        Modifier horizontalWeight = adaptiveStackScope.horizontalWeight(companion2, 1.0f);
                                        final MutableState mutableState7 = mutableState6;
                                        final DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController3 = delegatingSoftwareKeyboardController2;
                                        Strings.TouchRecordingLayout(touchRecorder3, horizontalWeight, Expect_jvmKt.rememberComposableLambda(-1102593722, new Function2() { // from class: com.squareup.cash.blockers.views.RegisterAliasViewKt$$ExternalSyntheticLambda14
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj20, Object obj21) {
                                                Composer composer3 = (Composer) obj20;
                                                int intValue3 = ((Integer) obj21).intValue();
                                                int i2 = 0;
                                                GapComposer gapComposer6 = (GapComposer) composer3;
                                                if (gapComposer6.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                                                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
                                                    boolean booleanValue = ((Boolean) mutableState7.getValue()).booleanValue();
                                                    DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController4 = delegatingSoftwareKeyboardController3;
                                                    boolean changed9 = gapComposer6.changed(delegatingSoftwareKeyboardController4);
                                                    Function1 function15 = function14;
                                                    boolean changed10 = changed9 | gapComposer6.changed(function15);
                                                    TextFieldState textFieldState4 = textFieldState3;
                                                    boolean changed11 = changed10 | gapComposer6.changed(textFieldState4);
                                                    TouchRecorder touchRecorder4 = touchRecorder3;
                                                    boolean changedInstance = changed11 | gapComposer6.changedInstance(touchRecorder4);
                                                    Object rememberedValue8 = gapComposer6.rememberedValue();
                                                    if (changedInstance || rememberedValue8 == Composer.Companion.Empty) {
                                                        RegisterAliasViewKt$$ExternalSyntheticLambda17 registerAliasViewKt$$ExternalSyntheticLambda17 = new RegisterAliasViewKt$$ExternalSyntheticLambda17(delegatingSoftwareKeyboardController4, function15, textFieldState4, touchRecorder4, 0);
                                                        gapComposer6.updateRememberedValue(registerAliasViewKt$$ExternalSyntheticLambda17);
                                                        rememberedValue8 = registerAliasViewKt$$ExternalSyntheticLambda17;
                                                    }
                                                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue8, fillMaxWidth2, buttonProminence, false, booleanValue, null, Expect_jvmKt.rememberComposableLambda(-367716309, new RegisterAliasViewKt$$ExternalSyntheticLambda18(registerAliasViewModel4, i2), gapComposer6), gapComposer6, 1573296, 40);
                                                } else {
                                                    gapComposer6.skipToGroupEnd();
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer5), gapComposer5, 392, 0);
                                    } else {
                                        gapComposer5.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, gapComposer3), gapComposer4, 24576, 10);
                            gapComposer4.end(z2);
                            return Unit.INSTANCE;
                        }
                    }, gapComposer), gapComposer, 196608, 16);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                AnswerDispatcher answerDispatcher = (AnswerDispatcher) obj12;
                StateFlowImpl stateFlowImpl = (StateFlowImpl) obj9;
                MinimumLifecycleOwner minimumLifecycleOwner = (MinimumLifecycleOwner) obj8;
                LifecycleOwner lifecycleOwner = (LifecycleOwner) obj7;
                PresenterLifecycleOwner presenterLifecycleOwner = (PresenterLifecycleOwner) obj6;
                SwipeCallbackDispatcher swipeCallbackDispatcher = (SwipeCallbackDispatcher) obj5;
                MoleculePresenter moleculePresenter = (MoleculePresenter) obj4;
                ReadonlySharedFlow readonlySharedFlow = (ReadonlySharedFlow) obj3;
                ((Integer) obj2).getClass();
                GapComposer gapComposer2 = (GapComposer) ((Composer) obj);
                gapComposer2.startReplaceGroup(1018867673);
                ProvidedValue defaultProvidedValue$runtime = AnswersKt.LocalAnswerDispatcher.defaultProvidedValue$runtime(answerDispatcher);
                ProvidedValue defaultProvidedValue$runtime2 = RenavigationKt.LocalRenavigationDispatcher.defaultProvidedValue$runtime((RenavigationDispatcher) obj11);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = SaveableStateRegistryKt.LocalSaveableStateRegistry;
                MoleculePresenterStateRegistry moleculePresenterStateRegistry = ((MoleculePresenterKt$asPresenter$1) obj10).stateRegistry;
                Continuation continuation = null;
                if (moleculePresenterStateRegistry == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("stateRegistry");
                    throw null;
                }
                gapComposer2.startProviders(new ProvidedValue[]{defaultProvidedValue$runtime, defaultProvidedValue$runtime2, staticProvidableCompositionLocal.defaultProvidedValue$runtime(moleculePresenterStateRegistry), MoleculePresenterKt.LocalPlacement.defaultProvidedValue$runtime(Updater.collectAsState(stateFlowImpl, null, gapComposer2, 1).getValue()), LocalLifecycleOwnerKt.LocalLifecycleOwner.defaultProvidedValue$runtime(minimumLifecycleOwner), MoleculePresenterKt.LocalActivityLifecycleOwner.defaultProvidedValue$runtime(lifecycleOwner), MoleculePresenterKt.LocalPresenterLifecycleOwner.defaultProvidedValue$runtime(presenterLifecycleOwner), SwipeKt.LocalSwipeCallbackDispatcher.defaultProvidedValue$runtime(swipeCallbackDispatcher)});
                gapComposer2.startReplaceGroup(255006094);
                Unit unit = Unit.INSTANCE;
                boolean changedInstance = gapComposer2.changedInstance(answerDispatcher);
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new CashApp$onCreate$4$1$1(answerDispatcher, continuation, 7);
                    gapComposer2.updateRememberedValue(rememberedValue3);
                }
                Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue3);
                Object models = moleculePresenter.models(readonlySharedFlow, gapComposer2, 0);
                Boxes$$ExternalSyntheticOutline1.m(gapComposer2, false, false, false);
                gapComposer2.providersInvalid = gapComposer2.providersInvalidStack.pop() != 0;
                gapComposer2.providerCache = null;
                gapComposer2.end(false);
                return models;
        }
    }

    public /* synthetic */ RegisterAliasViewKt$$ExternalSyntheticLambda2(AnswerDispatcher answerDispatcher, RenavigationDispatcher renavigationDispatcher, MoleculePresenterKt$asPresenter$1 moleculePresenterKt$asPresenter$1, StateFlowImpl stateFlowImpl, MinimumLifecycleOwner minimumLifecycleOwner, LifecycleOwner lifecycleOwner, PresenterLifecycleOwner presenterLifecycleOwner, SwipeCallbackDispatcher swipeCallbackDispatcher, MoleculePresenter moleculePresenter, ReadonlySharedFlow readonlySharedFlow) {
        this.f$1 = answerDispatcher;
        this.f$2 = renavigationDispatcher;
        this.f$3 = moleculePresenterKt$asPresenter$1;
        this.f$4 = stateFlowImpl;
        this.f$5 = minimumLifecycleOwner;
        this.f$6 = lifecycleOwner;
        this.f$7 = presenterLifecycleOwner;
        this.f$8 = swipeCallbackDispatcher;
        this.f$9 = moleculePresenter;
        this.f$10 = readonlySharedFlow;
    }
}
