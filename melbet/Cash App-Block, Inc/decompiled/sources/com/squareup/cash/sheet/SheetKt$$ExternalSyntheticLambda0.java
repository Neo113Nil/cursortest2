package com.squareup.cash.sheet;

import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DatePickerFormatterImpl;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DatePickerStateImpl;
import androidx.compose.material3.MenuKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import app.cash.versioned.Versioned;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.input.InputFieldKt;
import com.squareup.cash.arcade.components.internal.InputState;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.viewmodels.SetNameViewModel;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.payments.views.MainPaymentView$Content$2$1;
import com.squareup.cash.payments.views.NoteInputViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.payments.views.NoteInputViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.payments.views.QuickPayViewKt;
import com.squareup.cash.payments.views.UtilKt$$ExternalSyntheticLambda0;
import com.squareup.cash.securitysignals.ui.TouchRecorder;
import com.squareup.util.Strings;
import com.squareup.util.compose.SharedViewEventsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class SheetKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ boolean f$6;
    public final /* synthetic */ Object f$7;

    public /* synthetic */ SheetKt$$ExternalSyntheticLambda0(DatePickerStateImpl datePickerStateImpl, Modifier modifier, DatePickerFormatterImpl datePickerFormatterImpl, DatePickerColors datePickerColors, Function2 function2, Function2 function22, boolean z, FocusRequester focusRequester, int i) {
        this.f$0 = datePickerStateImpl;
        this.f$1 = modifier;
        this.f$2 = datePickerFormatterImpl;
        this.f$3 = datePickerColors;
        this.f$4 = function2;
        this.f$5 = function22;
        this.f$6 = z;
        this.f$7 = focusRequester;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j;
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj3 = this.f$7;
        Object obj4 = this.f$5;
        Object obj5 = this.f$4;
        Object obj6 = this.f$3;
        Object obj7 = this.f$2;
        Object obj8 = this.f$0;
        Object obj9 = this.f$1;
        switch (i) {
            case 0:
                boolean z = false;
                Function0 function0 = (Function0) obj8;
                Modifier modifier = (Modifier) obj9;
                RealSheetState realSheetState = (RealSheetState) obj7;
                SheetPeekPosition$FixedHeight sheetPeekPosition$FixedHeight = (SheetPeekPosition$FixedHeight) obj6;
                String str = (String) obj5;
                SheetTopCornerBehavior sheetTopCornerBehavior = (SheetTopCornerBehavior) obj4;
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                }
                int i2 = intValue & 1;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(i2, z)) {
                    SheetKt.TheSheet(function0, modifier, realSheetState, sheetPeekPosition$FixedHeight, str, sheetTopCornerBehavior, this.f$6, composableLambdaImpl, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                DatePickerKt.DatePicker((DatePickerStateImpl) obj8, (Modifier) obj9, (DatePickerFormatterImpl) obj7, (DatePickerColors) obj6, (Function2) obj5, (Function2) obj4, this.f$6, (FocusRequester) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 2:
                Shaker shaker = (Shaker) obj8;
                SetNameViewModel setNameViewModel = (SetNameViewModel) obj9;
                AnimatedContentScopeImpl animatedContentScopeImpl = (AnimatedContentScopeImpl) obj7;
                Function1 function1 = (Function1) obj6;
                MutableState mutableState = (MutableState) obj5;
                TouchRecorder touchRecorder = (TouchRecorder) obj4;
                InputState inputState = (InputState) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Modifier focusRequester = FocusTraversalKt.focusRequester(SharedViewEventsKt.shakeWith(SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, 16.0f, RecyclerView.DECELERATION_RATE, 2), shaker), DBUtil.rememberFocusRequesterAndRequestFocus(gapComposer2));
                    TextFieldValue textFieldValue = (TextFieldValue) mutableState.getValue();
                    String str2 = setNameViewModel.nameInputProperties.hint;
                    KeyboardOptions keyboardOptions = new KeyboardOptions(0, 2, false, 116);
                    boolean changedInstance = gapComposer2.changedInstance(animatedContentScopeImpl);
                    boolean z2 = this.f$6;
                    boolean changed = changedInstance | gapComposer2.changed(z2) | gapComposer2.changed(function1) | gapComposer2.changed(mutableState) | gapComposer2.changedInstance(touchRecorder);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new MenuKt$$ExternalSyntheticLambda0(animatedContentScopeImpl, z2, function1, touchRecorder, mutableState);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    Function1 function12 = (Function1) rememberedValue;
                    KeyboardActions keyboardActions = new KeyboardActions(function12, function12, function12, function12, function12, function12);
                    boolean changed2 = gapComposer2.changed(mutableState) | gapComposer2.changedInstance(setNameViewModel);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new BadgeQueries$$ExternalSyntheticLambda0(28, setNameViewModel, mutableState);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    InputFieldKt.InputField(textFieldValue, (Function1) rememberedValue2, focusRequester, inputState, (Function2) null, (Function2) null, (Function2) null, (Function3) null, str2, keyboardOptions, keyboardActions, (VisualTransformation) null, gapComposer2, 805306368, 0, 2288);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Modifier modifier2 = (Modifier) obj9;
                Versioned versioned = (Versioned) obj8;
                FocusRequester focusRequester2 = (FocusRequester) obj7;
                FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) obj6;
                String str3 = (String) obj5;
                Function1 function13 = (Function1) obj4;
                String str4 = (String) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer3, 54);
                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, modifier2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer3.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    boolean z3 = this.f$6;
                    if (z3) {
                        gapComposer3.startReplaceGroup(-725311267);
                        gapComposer3.end(false);
                        j = Color.Unspecified;
                    } else {
                        gapComposer3.startReplaceGroup(-725265883);
                        Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                        } else {
                            gapComposer3.startReplaceGroup(-1762997739);
                            gapComposer3.end(false);
                        }
                        j = colors.semantic.text.disabled;
                        gapComposer3.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, j, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer3, R.string.send_payment_note_label), (Map) null, (Function1) null, false);
                    Modifier focusRequester3 = FocusTraversalKt.focusRequester(new LayoutWeightElement(1.0f, true), focusRequester2);
                    SolidColor solidColor = new SolidColor(Strings.getColors(gapComposer3).component.input.cursor);
                    TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer3).input, Strings.getColors(gapComposer3).component.input.text.f195default, 0L, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777214);
                    KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, (Boolean) null, 0, 7, (Boolean) null, 119);
                    boolean changedInstance2 = gapComposer3.changedInstance(focusOwnerImpl);
                    Object rememberedValue3 = gapComposer3.rememberedValue();
                    if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new NoteInputViewKt$$ExternalSyntheticLambda2(focusOwnerImpl, 0);
                        gapComposer3.updateRememberedValue(rememberedValue3);
                    }
                    KeyboardActions keyboardActions2 = new KeyboardActions((Function1) rememberedValue3, null, null, 62);
                    boolean changed3 = gapComposer3.changed(function13) | gapComposer3.changed(50);
                    Object rememberedValue4 = gapComposer3.rememberedValue();
                    if (changed3 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new UtilKt$$ExternalSyntheticLambda0(15, function13);
                        gapComposer3.updateRememberedValue(rememberedValue4);
                    }
                    BasicTextFieldKt.BasicTextField(str3, (Function1) rememberedValue4, focusRequester3, z3, false, m994copyp1EtxEg$default, keyboardOptions2, keyboardActions2, false, 0, 0, null, null, null, solidColor, Expect_jvmKt.rememberComposableLambda(-1613536581, new NoteInputViewKt$$ExternalSyntheticLambda4(str3, str4, 0), gapComposer3), gapComposer3, 1572864, 196608, 16144);
                    gapComposer3.end(true);
                    boolean changedInstance3 = gapComposer3.changedInstance(versioned);
                    Object rememberedValue5 = gapComposer3.rememberedValue();
                    if (changedInstance3 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new MainPaymentView$Content$2$1(versioned, focusRequester2, null, 23);
                        gapComposer3.updateRememberedValue(rememberedValue5);
                    }
                    Updater.LaunchedEffect(gapComposer3, versioned, (Function2) rememberedValue5);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                QuickPayViewKt.RecipientList((Modifier) obj9, (List) obj8, (Map) obj7, (Function1) obj6, (Function1) obj5, (Function1) obj4, (Function2) obj3, this.f$6, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ SheetKt$$ExternalSyntheticLambda0(Modifier modifier, Versioned versioned, boolean z, FocusRequester focusRequester, FocusOwnerImpl focusOwnerImpl, String str, Function1 function1, String str2) {
        this.f$1 = modifier;
        this.f$0 = versioned;
        this.f$6 = z;
        this.f$2 = focusRequester;
        this.f$3 = focusOwnerImpl;
        this.f$4 = str;
        this.f$5 = function1;
        this.f$7 = str2;
    }

    public /* synthetic */ SheetKt$$ExternalSyntheticLambda0(Modifier modifier, List list, Map map, Function1 function1, Function1 function12, Function1 function13, Function2 function2, boolean z, int i) {
        this.f$1 = modifier;
        this.f$0 = list;
        this.f$2 = map;
        this.f$3 = function1;
        this.f$4 = function12;
        this.f$5 = function13;
        this.f$7 = function2;
        this.f$6 = z;
    }

    public /* synthetic */ SheetKt$$ExternalSyntheticLambda0(Shaker shaker, SetNameViewModel setNameViewModel, AnimatedContentScopeImpl animatedContentScopeImpl, boolean z, Function1 function1, MutableState mutableState, TouchRecorder touchRecorder, InputState inputState) {
        this.f$0 = shaker;
        this.f$1 = setNameViewModel;
        this.f$2 = animatedContentScopeImpl;
        this.f$6 = z;
        this.f$3 = function1;
        this.f$4 = mutableState;
        this.f$5 = touchRecorder;
        this.f$7 = inputState;
    }

    public /* synthetic */ SheetKt$$ExternalSyntheticLambda0(Function0 function0, Modifier modifier, RealSheetState realSheetState, SheetPeekPosition$FixedHeight sheetPeekPosition$FixedHeight, String str, SheetTopCornerBehavior sheetTopCornerBehavior, boolean z, ComposableLambdaImpl composableLambdaImpl) {
        this.f$0 = function0;
        this.f$1 = modifier;
        this.f$2 = realSheetState;
        this.f$3 = sheetPeekPosition$FixedHeight;
        this.f$4 = str;
        this.f$5 = sheetTopCornerBehavior;
        this.f$6 = z;
        this.f$7 = composableLambdaImpl;
    }
}
