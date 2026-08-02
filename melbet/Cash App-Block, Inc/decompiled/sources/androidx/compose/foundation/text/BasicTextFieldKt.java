package androidx.compose.foundation.text;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableElement;
import androidx.compose.foundation.interaction.FocusInteractionKt$collectIsFocusedAsState$1$1;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGesturesModifierKt;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode;
import androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequesterImpl;
import androidx.compose.foundation.text.handwriting.StylusHandwritingKt;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.SingleLineCodepointTransformation;
import androidx.compose.foundation.text.input.internal.TextFieldCoreModifier;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifier;
import androidx.compose.foundation.text.input.internal.TextFieldTextLayoutModifier;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviors_androidKt;
import androidx.compose.foundation.text.selection.SelectedTextType;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidClipboard;
import androidx.compose.ui.platform.AndroidTextToolbar;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.LazyWindowInfo;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.intl.PlatformLocaleKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.os.BundleKt;
import app.cash.molecule.MoleculeKt$$ExternalSyntheticLambda2;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.CashApp$$ExternalSyntheticLambda2;
import com.squareup.cash.common.ui.ColorModelsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.moneybot.widgets.ComposerKt$$ExternalSyntheticLambda9;
import com.squareup.util.cash.Countries;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes.dex */
public abstract class BasicTextFieldKt {
    public static final long MinTouchTargetSizeForHandles = BundleKt.m1091DpSizeYgX7TsA(40.0f, 40.0f);

    /* JADX WARN: Removed duplicated region for block: B:214:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0525  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicTextField(final TextFieldState textFieldState, final Modifier modifier, final boolean z, final boolean z2, final InputTransformation inputTransformation, final TextStyle textStyle, final KeyboardOptions keyboardOptions, final KeyboardActionHandler keyboardActionHandler, final TextFieldLineLimits textFieldLineLimits, final MutableInteractionSourceImpl mutableInteractionSourceImpl, final Brush brush, final OutputTransformation outputTransformation, final TextFieldDecorator textFieldDecorator, final ScrollState scrollState, Composer composer, final int i, final int i2) {
        int i3;
        boolean z3;
        int i4;
        final boolean z4;
        GapComposer gapComposer;
        int i5;
        MutableInteractionSourceImpl mutableInteractionSourceImpl2;
        int i6;
        boolean z5;
        MutableInteractionSourceImpl mutableInteractionSourceImpl3;
        boolean z6;
        Object textFieldSelectionState;
        Object obj;
        int i7;
        Density density;
        int i8;
        boolean z7;
        boolean z8;
        final AndroidClipboard androidClipboard;
        MutableSharedFlow mutableSharedFlow;
        TextLayoutState textLayoutState;
        final ToolbarRequesterImpl toolbarRequesterImpl;
        Object obj2;
        Object obj3;
        final TextFieldSelectionState textFieldSelectionState2;
        boolean z9;
        ScrollState scrollState2;
        MutableInteractionSourceImpl mutableInteractionSourceImpl4;
        Orientation orientation;
        boolean z10;
        Modifier then;
        Modifier then2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(965149429);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changed(textFieldState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            z3 = z2;
            i3 |= gapComposer2.changed(z3) ? 2048 : 1024;
        } else {
            z3 = z2;
        }
        int i9 = i & 24576;
        int i10 = PKIFailureInfo.certRevoked;
        if (i9 == 0) {
            i3 |= gapComposer2.changed(inputTransformation) ? 16384 : 8192;
        }
        int i11 = i & 196608;
        int i12 = PKIFailureInfo.unsupportedVersion;
        if (i11 == 0) {
            i3 |= gapComposer2.changed(textStyle) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= gapComposer2.changed(keyboardOptions) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i & 12582912) == 0) {
            i3 |= gapComposer2.changed(keyboardActionHandler) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= gapComposer2.changed(textFieldLineLimits) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= gapComposer2.changedInstance(null) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (gapComposer2.changed(mutableInteractionSourceImpl) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= gapComposer2.changed(brush) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer2.changed((Object) null) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= gapComposer2.changed(outputTransformation) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            if ((32768 & i2) == 0 ? gapComposer2.changed(textFieldDecorator) : gapComposer2.changedInstance(textFieldDecorator)) {
                i10 = 16384;
            }
            i4 |= i10;
        }
        if ((i2 & 196608) == 0) {
            if (!gapComposer2.changed(scrollState)) {
                i12 = 65536;
            }
            i4 |= i12;
        }
        int i13 = i4 | 1572864;
        if (gapComposer2.shouldExecute(i3 & 1, ((i3 & 306783379) == 306783378 && (599187 & i13) == 599186) ? false : true)) {
            gapComposer2.startDefaults();
            if ((i & 1) != 0 && !gapComposer2.getDefaultsInvalid()) {
                gapComposer2.skipToGroupEnd();
            }
            gapComposer2.endDefaults();
            Density density2 = (Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity);
            LayoutDirection layoutDirection = (LayoutDirection) gapComposer2.consume(CompositionLocalsKt.LocalLayoutDirection);
            final boolean areEqual = Intrinsics.areEqual(textFieldLineLimits, TextFieldLineLimits.SingleLine.INSTANCE);
            Object obj4 = Composer.Companion.Empty;
            if (mutableInteractionSourceImpl == null) {
                gapComposer2.startReplaceGroup(-2038132442);
                Object rememberedValue = gapComposer2.rememberedValue();
                if (rememberedValue == obj4) {
                    rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
                }
                MutableInteractionSourceImpl mutableInteractionSourceImpl5 = (MutableInteractionSourceImpl) rememberedValue;
                i5 = 0;
                gapComposer2.end(false);
                mutableInteractionSourceImpl2 = mutableInteractionSourceImpl5;
            } else {
                i5 = 0;
                gapComposer2.startReplaceGroup(-204294191);
                gapComposer2.end(false);
                mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
            }
            Orientation orientation2 = areEqual ? Orientation.Horizontal : Orientation.Vertical;
            boolean booleanValue = ((Boolean) Countries.collectIsFocusedAsState(mutableInteractionSourceImpl2, gapComposer2, i5).getValue()).booleanValue();
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == obj4) {
                rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState = (MutableState) rememberedValue2;
            boolean changed = gapComposer2.changed(mutableInteractionSourceImpl2);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changed || rememberedValue3 == obj4) {
                rememberedValue3 = new FocusInteractionKt$collectIsFocusedAsState$1$1(mutableInteractionSourceImpl2, mutableState, null, 2);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            Updater.LaunchedEffect(gapComposer2, mutableInteractionSourceImpl2, (Function2) rememberedValue3);
            final boolean booleanValue2 = ((Boolean) mutableState.getValue()).booleanValue();
            if (booleanValue) {
                gapComposer2.startReplaceGroup(-204276188);
                boolean isWindowFocused = ((LazyWindowInfo) ((WindowInfo) gapComposer2.consume(CompositionLocalsKt.LocalWindowInfo))).isWindowFocused();
                i6 = 0;
                gapComposer2.end(false);
                z5 = isWindowFocused;
            } else {
                i6 = 0;
                gapComposer2.startReplaceGroup(-2037593295);
                gapComposer2.end(false);
                z5 = false;
            }
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (rememberedValue4 == obj4) {
                mutableInteractionSourceImpl3 = mutableInteractionSourceImpl2;
                z6 = true;
                rememberedValue4 = FlowKt.MutableSharedFlow$default(1, i6, BufferOverflow.DROP_LATEST, 2);
                gapComposer2.updateRememberedValue(rememberedValue4);
            } else {
                mutableInteractionSourceImpl3 = mutableInteractionSourceImpl2;
                z6 = true;
            }
            MutableSharedFlow mutableSharedFlow2 = (MutableSharedFlow) rememberedValue4;
            boolean z11 = ((i3 & 14) == 4 ? z6 : false) | ((i13 & 896) == 256) | ((i13 & 7168) == 2048);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (z11 || rememberedValue5 == obj4) {
                rememberedValue5 = new TransformedTextFieldState(textFieldState, inputTransformation, areEqual ? SingleLineCodepointTransformation.INSTANCE : null, outputTransformation);
                gapComposer2.updateRememberedValue(rememberedValue5);
            }
            final TransformedTextFieldState transformedTextFieldState = (TransformedTextFieldState) rememberedValue5;
            boolean changed2 = gapComposer2.changed(transformedTextFieldState);
            Object rememberedValue6 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue6 == obj4) {
                rememberedValue6 = new TextLayoutState();
                gapComposer2.updateRememberedValue(rememberedValue6);
            }
            TextLayoutState textLayoutState2 = (TextLayoutState) rememberedValue6;
            final KeyboardOptions fillUnspecifiedValuesWith$foundation = keyboardOptions.fillUnspecifiedValuesWith$foundation(inputTransformation != null ? inputTransformation.getKeyboardOptions() : null);
            Object rememberedValue7 = gapComposer2.rememberedValue();
            if (rememberedValue7 == obj4) {
                rememberedValue7 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer2);
                gapComposer2.updateRememberedValue(rememberedValue7);
            }
            CoroutineScope coroutineScope = (CoroutineScope) rememberedValue7;
            gapComposer2.startReplaceGroup(-2035821392);
            LocaleList localeList = textStyle.spanStyle.localeList;
            if (localeList == null) {
                LocaleList localeList2 = LocaleList.Empty;
                localeList = PlatformLocaleKt.platformLocaleDelegate.getCurrent();
            }
            final PlatformSelectionBehaviorsImpl rememberPlatformSelectionBehaviors = PlatformSelectionBehaviors_androidKt.rememberPlatformSelectionBehaviors(SelectedTextType.EditableText, localeList, gapComposer2, 6);
            gapComposer2.end(false);
            Object rememberedValue8 = gapComposer2.rememberedValue();
            if (rememberedValue8 == obj4) {
                rememberedValue8 = new ToolbarRequesterImpl();
                gapComposer2.updateRememberedValue(rememberedValue8);
            }
            ToolbarRequesterImpl toolbarRequesterImpl2 = (ToolbarRequesterImpl) rememberedValue8;
            AndroidClipboard androidClipboard2 = (AndroidClipboard) gapComposer2.consume(CompositionLocalsKt.LocalClipboard);
            boolean changed3 = gapComposer2.changed(transformedTextFieldState);
            Object rememberedValue9 = gapComposer2.rememberedValue();
            if (changed3 || rememberedValue9 == obj4) {
                gapComposer = gapComposer2;
                obj = obj4;
                i7 = i3;
                density = density2;
                i8 = 256;
                z7 = false;
                boolean z12 = z5;
                textFieldSelectionState = new TextFieldSelectionState(transformedTextFieldState, textLayoutState2, density, z, z3, z12, toolbarRequesterImpl2, coroutineScope, rememberPlatformSelectionBehaviors, androidClipboard2);
                z8 = z12;
                androidClipboard = androidClipboard2;
                mutableSharedFlow = mutableSharedFlow2;
                textLayoutState = textLayoutState2;
                toolbarRequesterImpl = toolbarRequesterImpl2;
                obj2 = coroutineScope;
                gapComposer.updateRememberedValue(textFieldSelectionState);
            } else {
                toolbarRequesterImpl = toolbarRequesterImpl2;
                mutableSharedFlow = mutableSharedFlow2;
                textLayoutState = textLayoutState2;
                obj2 = coroutineScope;
                gapComposer = gapComposer2;
                density = density2;
                i8 = 256;
                z7 = false;
                textFieldSelectionState = rememberedValue9;
                obj = obj4;
                z8 = z5;
                androidClipboard = androidClipboard2;
                i7 = i3;
            }
            TextFieldSelectionState textFieldSelectionState3 = (TextFieldSelectionState) textFieldSelectionState;
            final PlatformHapticFeedback platformHapticFeedback = (PlatformHapticFeedback) gapComposer.consume(CompositionLocalsKt.LocalHapticFeedback);
            boolean changed4 = gapComposer.changed((AndroidTextToolbar) gapComposer.consume(CompositionLocalsKt.LocalTextToolbar)) | gapComposer.changed(obj2);
            Object rememberedValue10 = gapComposer.rememberedValue();
            if (changed4 || rememberedValue10 == obj) {
                rememberedValue10 = new BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1();
                gapComposer.updateRememberedValue(rememberedValue10);
            }
            final BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1 basicTextFieldKt$BasicTextField$textToolbarHandler$1$1 = (BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1) rememberedValue10;
            boolean changed5 = gapComposer.changed(transformedTextFieldState) | ((57344 & i7) == 16384 ? true : z7) | gapComposer.changedInstance(textFieldSelectionState3) | gapComposer.changedInstance(platformHapticFeedback) | gapComposer.changedInstance(androidClipboard) | gapComposer.changed(basicTextFieldKt$BasicTextField$textToolbarHandler$1$1) | gapComposer.changed(density) | ((i7 & 896) == i8 ? true : z7) | ((i7 & 7168) == 2048 ? true : z7) | ((i13 & 3670016) == 1048576 ? true : z7);
            Object rememberedValue11 = gapComposer.rememberedValue();
            if (changed5 || rememberedValue11 == obj) {
                obj3 = obj2;
                final Density density3 = density;
                textFieldSelectionState2 = textFieldSelectionState3;
                Object obj5 = new Function0(inputTransformation, textFieldSelectionState2, platformHapticFeedback, androidClipboard, basicTextFieldKt$BasicTextField$textToolbarHandler$1$1, density3, z, z2) { // from class: androidx.compose.foundation.text.BasicTextFieldKt$$ExternalSyntheticLambda8
                    public final /* synthetic */ InputTransformation f$1;
                    public final /* synthetic */ TextFieldSelectionState f$2;
                    public final /* synthetic */ PlatformHapticFeedback f$3;
                    public final /* synthetic */ AndroidClipboard f$4;
                    public final /* synthetic */ Density f$6;
                    public final /* synthetic */ boolean f$7;
                    public final /* synthetic */ boolean f$8;

                    {
                        this.f$6 = density3;
                        this.f$7 = z;
                        this.f$8 = z2;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        TextContextMenuToolbarHandlerNode textContextMenuToolbarHandlerNode;
                        StandaloneCoroutine standaloneCoroutine;
                        TransformedTextFieldState.this.inputTransformation = this.f$1;
                        TextFieldSelectionState textFieldSelectionState4 = this.f$2;
                        boolean z13 = this.f$7;
                        if (!z13 && (textContextMenuToolbarHandlerNode = textFieldSelectionState4.toolbarRequester.toolbarHandlerNode) != null && (standaloneCoroutine = textContextMenuToolbarHandlerNode.textToolbarJob) != null) {
                            standaloneCoroutine.cancel(null);
                            textContextMenuToolbarHandlerNode.textToolbarJob = null;
                        }
                        textFieldSelectionState4.hapticFeedBack = this.f$3;
                        textFieldSelectionState4.clipboard = this.f$4;
                        textFieldSelectionState4.density = this.f$6;
                        textFieldSelectionState4.enabled = z13;
                        textFieldSelectionState4.readOnly = this.f$8;
                        return Unit.INSTANCE;
                    }
                };
                z9 = z;
                gapComposer.updateRememberedValue(obj5);
                rememberedValue11 = obj5;
            } else {
                z9 = z;
                obj3 = obj2;
                textFieldSelectionState2 = textFieldSelectionState3;
            }
            Updater.SideEffect((Function0) rememberedValue11, gapComposer);
            boolean changedInstance = gapComposer.changedInstance(textFieldSelectionState2);
            Object rememberedValue12 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue12 == obj) {
                rememberedValue12 = new CashApp$$ExternalSyntheticLambda2(textFieldSelectionState2, 6);
                gapComposer.updateRememberedValue(rememberedValue12);
            }
            Updater.DisposableEffect(textFieldSelectionState2, (Function1) rememberedValue12, gapComposer);
            int i14 = keyboardOptions.keyboardType;
            boolean z13 = (i14 == 7 || i14 == 8) ? z7 : true;
            MutableSharedFlow mutableSharedFlow3 = mutableSharedFlow;
            boolean changed6 = gapComposer.changed(z13) | gapComposer.changedInstance(mutableSharedFlow3);
            Object rememberedValue13 = gapComposer.rememberedValue();
            if (changed6 || rememberedValue13 == obj) {
                rememberedValue13 = new BasicTextFieldKt$$ExternalSyntheticLambda10(z13, mutableSharedFlow3);
                gapComposer.updateRememberedValue(rememberedValue13);
            }
            final TextLayoutState textLayoutState3 = textLayoutState;
            final TextFieldSelectionState textFieldSelectionState4 = textFieldSelectionState2;
            final boolean z14 = z8;
            Modifier then3 = StylusHandwritingKt.stylusHandwriting(modifier, z9, z13, (Function0) rememberedValue13).then(new TextFieldDecoratorModifier(transformedTextFieldState, textLayoutState3, textFieldSelectionState2, inputTransformation, z9, z2, fillUnspecifiedValuesWith$foundation, keyboardActionHandler, areEqual, mutableInteractionSourceImpl3, mutableSharedFlow3));
            boolean z15 = (z && ((TextFieldSelectionState.InputType) textFieldSelectionState4.directDragGestureInitiator$delegate.getValue()) == TextFieldSelectionState.InputType.None) ? true : z7;
            if (layoutDirection == LayoutDirection.Rtl) {
                orientation = orientation2;
                if (orientation != Orientation.Vertical) {
                    scrollState2 = scrollState;
                    mutableInteractionSourceImpl4 = mutableInteractionSourceImpl3;
                    z10 = z7;
                    then = then3.then(new ScrollableElement(scrollState2, orientation, z15, z10, mutableInteractionSourceImpl4));
                    PointerIcon.Companion.getClass();
                    then2 = then.then(new PointerHoverIconModifierElement(PointerId.pointerIconText));
                    Modifier addTextContextMenuComponentsWithContext = TextContextMenuGesturesModifierKt.addTextContextMenuComponentsWithContext(then2, new MoleculeKt$$ExternalSyntheticLambda2(1, textFieldSelectionState4, obj3));
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, true);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, addTextContextMenuComponentsWithContext);
                    ComposeUiNode.Companion.getClass();
                    Function0 function0 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer.applier != null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(function0);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    final Orientation orientation3 = orientation;
                    z4 = z;
                    BasicTextKt.ContextMenuArea(textFieldSelectionState4, z4, Expect_jvmKt.rememberComposableLambda(-673241599, new Function2() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj6, Object obj7) {
                            Composer composer2 = (Composer) obj6;
                            int intValue = ((Integer) obj7).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                TextFieldDecorator textFieldDecorator2 = TextFieldDecorator.this;
                                if (textFieldDecorator2 == null) {
                                    textFieldDecorator2 = BasicTextFieldKt$DefaultTextFieldDecorator$1.INSTANCE;
                                }
                                final TextFieldLineLimits textFieldLineLimits2 = textFieldLineLimits;
                                final TextLayoutState textLayoutState4 = textLayoutState3;
                                final TextStyle textStyle2 = textStyle;
                                final boolean z16 = z14;
                                final boolean z17 = booleanValue2;
                                final TransformedTextFieldState transformedTextFieldState2 = transformedTextFieldState;
                                final TextFieldSelectionState textFieldSelectionState5 = textFieldSelectionState4;
                                final Brush brush2 = brush;
                                final boolean z18 = z;
                                final boolean z19 = z2;
                                final ScrollState scrollState3 = scrollState;
                                final Orientation orientation4 = orientation3;
                                final ToolbarRequesterImpl toolbarRequesterImpl3 = toolbarRequesterImpl;
                                final PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl = rememberPlatformSelectionBehaviors;
                                final boolean z20 = areEqual;
                                final KeyboardOptions keyboardOptions2 = fillUnspecifiedValuesWith$foundation;
                                textFieldDecorator2.Decoration(Expect_jvmKt.rememberComposableLambda(1969169726, new Function2() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$$ExternalSyntheticLambda13
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj8, Object obj9) {
                                        int i15;
                                        int i16;
                                        Composer composer3 = (Composer) obj8;
                                        int intValue2 = ((Integer) obj9).intValue();
                                        int i17 = 1;
                                        GapComposer gapComposer4 = (GapComposer) composer3;
                                        if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                            TextFieldLineLimits textFieldLineLimits3 = TextFieldLineLimits.this;
                                            if (textFieldLineLimits3 instanceof TextFieldLineLimits.MultiLine) {
                                                TextFieldLineLimits.MultiLine multiLine = (TextFieldLineLimits.MultiLine) textFieldLineLimits3;
                                                i16 = multiLine.minHeightInLines;
                                                i15 = multiLine.maxHeightInLines;
                                            } else {
                                                i15 = 1;
                                                i16 = 1;
                                            }
                                            TextLayoutState textLayoutState5 = textLayoutState4;
                                            Modifier layout = ValueInsets.layout(Modifier.Companion.$$INSTANCE, new ColorModelsKt$$ExternalSyntheticLambda0(textLayoutState5, i17));
                                            BasicTextKt.validateMinMaxLines(i16, i15);
                                            TextStyle textStyle3 = textStyle2;
                                            if (i16 != 1 || i15 != Integer.MAX_VALUE) {
                                                layout = layout.then(new HeightInLinesElement(textStyle3, i16, i15));
                                            }
                                            Modifier clipToBounds = ClipKt.clipToBounds(layout.then(new TextFieldSizeElement(textStyle3)));
                                            boolean z21 = z18;
                                            boolean z22 = z19;
                                            boolean z23 = z21 && !z22;
                                            boolean z24 = z16;
                                            boolean z25 = z17;
                                            TransformedTextFieldState transformedTextFieldState3 = transformedTextFieldState2;
                                            TextFieldSelectionState textFieldSelectionState6 = textFieldSelectionState5;
                                            Modifier then4 = clipToBounds.then(new TextFieldCoreModifier(z24, z25, textLayoutState5, transformedTextFieldState3, textFieldSelectionState6, brush2, z23, scrollState3, orientation4, toolbarRequesterImpl3, platformSelectionBehaviorsImpl));
                                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, true);
                                            int hashCode2 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                                            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer4.currentCompositionLocalScope();
                                            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer4, then4);
                                            ComposeUiNode.Companion.getClass();
                                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                            if (gapComposer4.applier == null) {
                                                Updater.invalidApplier();
                                                throw null;
                                            }
                                            gapComposer4.startReusableNode();
                                            if (gapComposer4.inserting) {
                                                gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                                            } else {
                                                gapComposer4.useNode();
                                            }
                                            Updater.m576setimpl(gapComposer4, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                                            Updater.m576setimpl(gapComposer4, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                            Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                                            Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                            Updater.m576setimpl(gapComposer4, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                                            BoxKt.Box(new TextFieldTextLayoutModifier(textLayoutState5, transformedTextFieldState3, textStyle3, z20, keyboardOptions2), gapComposer4, 0);
                                            if (z21 && z24 && ((Boolean) textFieldSelectionState6.isInTouchMode$delegate.getValue()).booleanValue()) {
                                                gapComposer4.startReplaceGroup(-810654004);
                                                BasicTextFieldKt.TextFieldSelectionHandles(textFieldSelectionState6, gapComposer4, 0);
                                                if (z22) {
                                                    gapComposer4.startReplaceGroup(-810412514);
                                                    gapComposer4.end(false);
                                                } else {
                                                    gapComposer4.startReplaceGroup(-810526873);
                                                    BasicTextFieldKt.TextFieldCursorHandle(textFieldSelectionState6, gapComposer4, 0);
                                                    gapComposer4.end(false);
                                                }
                                                gapComposer4.end(false);
                                            } else {
                                                gapComposer4.startReplaceGroup(-810390690);
                                                gapComposer4.end(false);
                                            }
                                            gapComposer4.end(true);
                                        } else {
                                            gapComposer4.skipToGroupEnd();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, gapComposer3), gapComposer3, 6);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer), gapComposer, ((i7 >> 3) & 112) | MLKEMEngine.KyberPolyBytes);
                    gapComposer.end(true);
                } else {
                    scrollState2 = scrollState;
                    mutableInteractionSourceImpl4 = mutableInteractionSourceImpl3;
                }
            } else {
                scrollState2 = scrollState;
                mutableInteractionSourceImpl4 = mutableInteractionSourceImpl3;
                orientation = orientation2;
            }
            z10 = true;
            then = then3.then(new ScrollableElement(scrollState2, orientation, z15, z10, mutableInteractionSourceImpl4));
            PointerIcon.Companion.getClass();
            then2 = then.then(new PointerHoverIconModifierElement(PointerId.pointerIconText));
            Modifier addTextContextMenuComponentsWithContext2 = TextContextMenuGesturesModifierKt.addTextContextMenuComponentsWithContext(then2, new MoleculeKt$$ExternalSyntheticLambda2(1, textFieldSelectionState4, obj3));
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, true);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, addTextContextMenuComponentsWithContext2);
            ComposeUiNode.Companion.getClass();
            Function0 function02 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier != null) {
            }
        } else {
            z4 = z;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj6, Object obj7) {
                    ((Integer) obj7).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(i | 1);
                    int updateChangedFlags2 = Updater.updateChangedFlags(i2);
                    BasicTextFieldKt.BasicTextField(TextFieldState.this, modifier, z4, z2, inputTransformation, textStyle, keyboardOptions, keyboardActionHandler, textFieldLineLimits, mutableInteractionSourceImpl, brush, outputTransformation, textFieldDecorator, scrollState, (Composer) obj6, updateChangedFlags, updateChangedFlags2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void TextFieldCursorHandle(TextFieldSelectionState textFieldSelectionState, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1991581797);
        int i2 = 2;
        int i3 = (gapComposer.changedInstance(textFieldSelectionState) ? 4 : 2) | i;
        int i4 = 0;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            boolean changed = gapComposer.changed(textFieldSelectionState);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.derivedStateOf(new BasicTextFieldKt$$ExternalSyntheticLambda15(textFieldSelectionState, i2));
                gapComposer.updateRememberedValue(rememberedValue);
            }
            if (((Boolean) ((State) rememberedValue).getValue()).booleanValue()) {
                gapComposer.startReplaceGroup(535437134);
                boolean changedInstance = gapComposer.changedInstance(textFieldSelectionState);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new BasicTextFieldKt$TextFieldCursorHandle$1$1(textFieldSelectionState, 0);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                OffsetProvider offsetProvider = (OffsetProvider) rememberedValue2;
                boolean changedInstance2 = gapComposer.changedInstance(textFieldSelectionState);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new BasicTextFieldKt$TextFieldCursorHandle$2$1(textFieldSelectionState, i4);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                AndroidCursorHandle_androidKt.m343CursorHandleUSBMPiE(offsetProvider, SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion.$$INSTANCE, textFieldSelectionState, (PointerInputEventHandler) rememberedValue3), MinTouchTargetSizeForHandles, gapComposer, MLKEMEngine.KyberPolyBytes, 0);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(535820573);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicTextFieldKt$$ExternalSyntheticLambda17(textFieldSelectionState, i, 1);
        }
    }

    public static final void TextFieldSelectionHandles(TextFieldSelectionState textFieldSelectionState, Composer composer, int i) {
        NeverEqualPolicy neverEqualPolicy;
        Modifier.Companion companion;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2025287684);
        int i2 = (gapComposer.changedInstance(textFieldSelectionState) ? 4 : 2) | i;
        int i3 = 1;
        int i4 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            boolean changed = gapComposer.changed(textFieldSelectionState);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy2) {
                rememberedValue = Updater.derivedStateOf(new BasicTextFieldKt$$ExternalSyntheticLambda15(textFieldSelectionState, i4));
                gapComposer.updateRememberedValue(rememberedValue);
            }
            TextFieldHandleState textFieldHandleState = (TextFieldHandleState) ((State) rememberedValue).getValue();
            boolean z = textFieldHandleState.visible;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            if (z) {
                gapComposer.startReplaceGroup(-354609545);
                boolean changedInstance = gapComposer.changedInstance(textFieldSelectionState);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue2 == neverEqualPolicy2) {
                    rememberedValue2 = new BasicTextFieldKt$TextFieldCursorHandle$1$1(textFieldSelectionState, 1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                OffsetProvider offsetProvider = (OffsetProvider) rememberedValue2;
                ResolvedTextDirection resolvedTextDirection = textFieldHandleState.direction;
                boolean z2 = textFieldHandleState.handlesCrossed;
                boolean changedInstance2 = gapComposer.changedInstance(textFieldSelectionState);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changedInstance2 || rememberedValue3 == neverEqualPolicy2) {
                    rememberedValue3 = new BasicTextFieldKt$TextFieldCursorHandle$2$1(textFieldSelectionState, i3);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                companion = companion2;
                neverEqualPolicy = neverEqualPolicy2;
                SimpleLayoutKt.m447SelectionHandlewLIcFTc(offsetProvider, true, resolvedTextDirection, z2, MinTouchTargetSizeForHandles, textFieldHandleState.lineHeight, SuspendingPointerInputFilterKt.pointerInput(companion2, textFieldSelectionState, (PointerInputEventHandler) rememberedValue3), gapComposer, 24624, 0);
                gapComposer.end(false);
            } else {
                neverEqualPolicy = neverEqualPolicy2;
                companion = companion2;
                gapComposer.startReplaceGroup(-353981826);
                gapComposer.end(false);
            }
            boolean changed2 = gapComposer.changed(textFieldSelectionState);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = Updater.derivedStateOf(new BasicTextFieldKt$$ExternalSyntheticLambda15(textFieldSelectionState, i3));
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            TextFieldHandleState textFieldHandleState2 = (TextFieldHandleState) ((State) rememberedValue4).getValue();
            if (textFieldHandleState2.visible) {
                gapComposer.startReplaceGroup(-353488678);
                boolean changedInstance3 = gapComposer.changedInstance(textFieldSelectionState);
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (changedInstance3 || rememberedValue5 == neverEqualPolicy) {
                    rememberedValue5 = new BasicTextFieldKt$TextFieldCursorHandle$1$1(textFieldSelectionState, 2);
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                OffsetProvider offsetProvider2 = (OffsetProvider) rememberedValue5;
                ResolvedTextDirection resolvedTextDirection2 = textFieldHandleState2.direction;
                boolean z3 = textFieldHandleState2.handlesCrossed;
                boolean changedInstance4 = gapComposer.changedInstance(textFieldSelectionState);
                Object rememberedValue6 = gapComposer.rememberedValue();
                if (changedInstance4 || rememberedValue6 == neverEqualPolicy) {
                    rememberedValue6 = new BasicTextFieldKt$TextFieldCursorHandle$2$1(textFieldSelectionState, 2);
                    gapComposer.updateRememberedValue(rememberedValue6);
                }
                SimpleLayoutKt.m447SelectionHandlewLIcFTc(offsetProvider2, false, resolvedTextDirection2, z3, MinTouchTargetSizeForHandles, textFieldHandleState2.lineHeight, SuspendingPointerInputFilterKt.pointerInput(companion, textFieldSelectionState, (PointerInputEventHandler) rememberedValue6), gapComposer, 24624, 0);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-352863842);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicTextFieldKt$$ExternalSyntheticLambda17(textFieldSelectionState, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicTextField(final TextFieldState textFieldState, final Modifier modifier, boolean z, boolean z2, InputTransformation inputTransformation, TextStyle textStyle, final KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, TextFieldLineLimits textFieldLineLimits, MutableInteractionSourceImpl mutableInteractionSourceImpl, Brush brush, OutputTransformation outputTransformation, final TextFieldDecorator textFieldDecorator, ScrollState scrollState, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        boolean z3;
        int i5;
        final boolean z4;
        int i6;
        final InputTransformation inputTransformation2;
        int i7;
        TextStyle textStyle2;
        int i8;
        KeyboardActionHandler keyboardActionHandler2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        final TextFieldLineLimits textFieldLineLimits2;
        final MutableInteractionSourceImpl mutableInteractionSourceImpl2;
        final Brush brush2;
        final OutputTransformation outputTransformation2;
        final TextStyle textStyle3;
        final KeyboardActionHandler keyboardActionHandler3;
        GapComposer gapComposer;
        final boolean z5;
        final ScrollState scrollState2;
        RecomposeScopeImpl endRestartGroup;
        TextFieldLineLimits textFieldLineLimits3;
        TextStyle textStyle4;
        InputTransformation inputTransformation3;
        MutableInteractionSourceImpl mutableInteractionSourceImpl3;
        Brush brush3;
        KeyboardActionHandler keyboardActionHandler4;
        boolean z6;
        ScrollState scrollState3;
        OutputTransformation outputTransformation3;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(469439921);
        if ((i & 6) == 0) {
            i4 = (gapComposer2.changed(textFieldState) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= gapComposer2.changed(modifier) ? 32 : 16;
        }
        int i20 = i3 & 4;
        if (i20 != 0) {
            i4 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            z3 = z;
            i4 |= gapComposer2.changed(z3) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                z4 = z2;
                i4 |= gapComposer2.changed(z4) ? 2048 : 1024;
                i6 = i3 & 16;
                int i21 = PKIFailureInfo.certRevoked;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    inputTransformation2 = inputTransformation;
                    i4 |= gapComposer2.changed(inputTransformation2) ? 16384 : 8192;
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= 196608;
                        textStyle2 = textStyle;
                    } else {
                        textStyle2 = textStyle;
                        if ((i & 196608) == 0) {
                            i4 |= gapComposer2.changed(textStyle2) ? PKIFailureInfo.unsupportedVersion : 65536;
                        }
                    }
                    if ((i & 1572864) == 0) {
                        i4 |= gapComposer2.changed(keyboardOptions) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                    }
                    i8 = i3 & 128;
                    if (i8 == 0) {
                        i4 |= 12582912;
                        keyboardActionHandler2 = keyboardActionHandler;
                    } else {
                        keyboardActionHandler2 = keyboardActionHandler;
                        if ((i & 12582912) == 0) {
                            i4 |= gapComposer2.changed(keyboardActionHandler2) ? 8388608 : 4194304;
                        }
                    }
                    i9 = i3 & 256;
                    if (i9 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i10 = i9;
                        i4 |= gapComposer2.changed(textFieldLineLimits) ? 67108864 : 33554432;
                        i11 = i4 | 805306368;
                        i12 = i3 & 1024;
                        if (i12 != 0) {
                            i14 = i2 | 6;
                            i13 = i12;
                        } else if ((i2 & 6) == 0) {
                            i13 = i12;
                            i14 = i2 | (gapComposer2.changed(mutableInteractionSourceImpl) ? 4 : 2);
                        } else {
                            i13 = i12;
                            i14 = i2;
                        }
                        i15 = i3 & 2048;
                        if (i15 != 0) {
                            i14 |= 48;
                            i16 = i15;
                        } else if ((i2 & 48) == 0) {
                            i16 = i15;
                            i14 |= gapComposer2.changed(brush) ? 32 : 16;
                        } else {
                            i16 = i15;
                        }
                        int i22 = i14;
                        i17 = i3 & 4096;
                        if (i17 != 0) {
                            i18 = i22 | MLKEMEngine.KyberPolyBytes;
                        } else {
                            i18 = i22;
                            if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
                                i18 |= gapComposer2.changed(outputTransformation) ? 256 : 128;
                                if ((i2 & 3072) == 0) {
                                    i18 |= (i2 & 4096) == 0 ? gapComposer2.changed(textFieldDecorator) : gapComposer2.changedInstance(textFieldDecorator) ? 2048 : 1024;
                                }
                                if ((i2 & 24576) == 0) {
                                    if ((i3 & 16384) == 0 && gapComposer2.changed(scrollState)) {
                                        i21 = 16384;
                                    }
                                    i18 |= i21;
                                }
                                i19 = i18;
                                if (!gapComposer2.shouldExecute(i11 & 1, (i11 & 306783379) == 306783378 || (i19 & 9363) != 9362)) {
                                    gapComposer2.startDefaults();
                                    if ((i & 1) != 0 && !gapComposer2.getDefaultsInvalid()) {
                                        gapComposer2.skipToGroupEnd();
                                        if ((i3 & 16384) != 0) {
                                            i19 &= -57345;
                                        }
                                        mutableInteractionSourceImpl3 = mutableInteractionSourceImpl;
                                        brush3 = brush;
                                        outputTransformation3 = outputTransformation;
                                        z6 = z4;
                                        inputTransformation3 = inputTransformation2;
                                        textStyle4 = textStyle2;
                                        keyboardActionHandler4 = keyboardActionHandler2;
                                        textFieldLineLimits3 = textFieldLineLimits;
                                        scrollState3 = scrollState;
                                    } else {
                                        if (i20 != 0) {
                                            z3 = true;
                                        }
                                        boolean z7 = i5 == 0 ? z4 : false;
                                        if (i6 != 0) {
                                            inputTransformation2 = null;
                                        }
                                        TextStyle textStyle5 = i7 != 0 ? TextStyle.Default : textStyle2;
                                        if (i8 != 0) {
                                            keyboardActionHandler2 = null;
                                        }
                                        if (i10 != 0) {
                                            TextFieldLineLimits.Companion.getClass();
                                            textFieldLineLimits3 = TextFieldLineLimits.Companion.getDefault();
                                        } else {
                                            textFieldLineLimits3 = textFieldLineLimits;
                                        }
                                        MutableInteractionSourceImpl mutableInteractionSourceImpl4 = i13 != 0 ? null : mutableInteractionSourceImpl;
                                        Brush cursorBrush = i16 != 0 ? BasicTextFieldDefaults.getCursorBrush() : brush;
                                        OutputTransformation outputTransformation4 = i17 == 0 ? outputTransformation : null;
                                        if ((i3 & 16384) != 0) {
                                            i19 &= -57345;
                                            InputTransformation inputTransformation4 = inputTransformation2;
                                            textStyle4 = textStyle5;
                                            inputTransformation3 = inputTransformation4;
                                            mutableInteractionSourceImpl3 = mutableInteractionSourceImpl4;
                                            brush3 = cursorBrush;
                                            keyboardActionHandler4 = keyboardActionHandler2;
                                            outputTransformation3 = outputTransformation4;
                                            scrollState3 = ImageKt.rememberScrollState(gapComposer2);
                                            z6 = z7;
                                        } else {
                                            InputTransformation inputTransformation5 = inputTransformation2;
                                            textStyle4 = textStyle5;
                                            inputTransformation3 = inputTransformation5;
                                            mutableInteractionSourceImpl3 = mutableInteractionSourceImpl4;
                                            brush3 = cursorBrush;
                                            keyboardActionHandler4 = keyboardActionHandler2;
                                            z6 = z7;
                                            scrollState3 = scrollState;
                                            outputTransformation3 = outputTransformation4;
                                        }
                                    }
                                    gapComposer2.endDefaults();
                                    int i23 = 2147483646 & i11;
                                    int i24 = (i19 & 14) | MLKEMEngine.KyberPolyBytes | (i19 & 112);
                                    int i25 = i19 << 3;
                                    boolean z8 = z3;
                                    BasicTextField(textFieldState, modifier, z8, z6, inputTransformation3, textStyle4, keyboardOptions, keyboardActionHandler4, textFieldLineLimits3, mutableInteractionSourceImpl3, brush3, outputTransformation3, textFieldDecorator, scrollState3, gapComposer2, i23, (i25 & 7168) | i24 | (57344 & i25) | (i25 & 458752));
                                    textStyle3 = textStyle4;
                                    outputTransformation2 = outputTransformation3;
                                    gapComposer = gapComposer2;
                                    inputTransformation2 = inputTransformation3;
                                    brush2 = brush3;
                                    scrollState2 = scrollState3;
                                    z4 = z6;
                                    mutableInteractionSourceImpl2 = mutableInteractionSourceImpl3;
                                    z5 = z8;
                                    textFieldLineLimits2 = textFieldLineLimits3;
                                    keyboardActionHandler3 = keyboardActionHandler4;
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                    textFieldLineLimits2 = textFieldLineLimits;
                                    mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
                                    brush2 = brush;
                                    outputTransformation2 = outputTransformation;
                                    textStyle3 = textStyle2;
                                    keyboardActionHandler3 = keyboardActionHandler2;
                                    gapComposer = gapComposer2;
                                    z5 = z3;
                                    scrollState2 = scrollState;
                                }
                                endRestartGroup = gapComposer.endRestartGroup();
                                if (endRestartGroup == null) {
                                    endRestartGroup.block = new Function2() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            ((Integer) obj2).getClass();
                                            int updateChangedFlags = Updater.updateChangedFlags(i | 1);
                                            int updateChangedFlags2 = Updater.updateChangedFlags(i2);
                                            BasicTextFieldKt.BasicTextField(TextFieldState.this, modifier, z5, z4, inputTransformation2, textStyle3, keyboardOptions, keyboardActionHandler3, textFieldLineLimits2, mutableInteractionSourceImpl2, brush2, outputTransformation2, textFieldDecorator, scrollState2, (Composer) obj, updateChangedFlags, updateChangedFlags2, i3);
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    return;
                                }
                                return;
                            }
                        }
                        if ((i2 & 3072) == 0) {
                        }
                        if ((i2 & 24576) == 0) {
                        }
                        i19 = i18;
                        if (!gapComposer2.shouldExecute(i11 & 1, (i11 & 306783379) == 306783378 || (i19 & 9363) != 9362)) {
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i10 = i9;
                    i11 = i4 | 805306368;
                    i12 = i3 & 1024;
                    if (i12 != 0) {
                    }
                    i15 = i3 & 2048;
                    if (i15 != 0) {
                    }
                    int i222 = i14;
                    i17 = i3 & 4096;
                    if (i17 != 0) {
                    }
                    if ((i2 & 3072) == 0) {
                    }
                    if ((i2 & 24576) == 0) {
                    }
                    i19 = i18;
                    if (!gapComposer2.shouldExecute(i11 & 1, (i11 & 306783379) == 306783378 || (i19 & 9363) != 9362)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                inputTransformation2 = inputTransformation;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                if ((i & 1572864) == 0) {
                }
                i8 = i3 & 128;
                if (i8 == 0) {
                }
                i9 = i3 & 256;
                if (i9 == 0) {
                }
                i10 = i9;
                i11 = i4 | 805306368;
                i12 = i3 & 1024;
                if (i12 != 0) {
                }
                i15 = i3 & 2048;
                if (i15 != 0) {
                }
                int i2222 = i14;
                i17 = i3 & 4096;
                if (i17 != 0) {
                }
                if ((i2 & 3072) == 0) {
                }
                if ((i2 & 24576) == 0) {
                }
                i19 = i18;
                if (!gapComposer2.shouldExecute(i11 & 1, (i11 & 306783379) == 306783378 || (i19 & 9363) != 9362)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z4 = z2;
            i6 = i3 & 16;
            int i212 = PKIFailureInfo.certRevoked;
            if (i6 != 0) {
            }
            inputTransformation2 = inputTransformation;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            if ((i & 1572864) == 0) {
            }
            i8 = i3 & 128;
            if (i8 == 0) {
            }
            i9 = i3 & 256;
            if (i9 == 0) {
            }
            i10 = i9;
            i11 = i4 | 805306368;
            i12 = i3 & 1024;
            if (i12 != 0) {
            }
            i15 = i3 & 2048;
            if (i15 != 0) {
            }
            int i22222 = i14;
            i17 = i3 & 4096;
            if (i17 != 0) {
            }
            if ((i2 & 3072) == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            i19 = i18;
            if (!gapComposer2.shouldExecute(i11 & 1, (i11 & 306783379) == 306783378 || (i19 & 9363) != 9362)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        z3 = z;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z4 = z2;
        i6 = i3 & 16;
        int i2122 = PKIFailureInfo.certRevoked;
        if (i6 != 0) {
        }
        inputTransformation2 = inputTransformation;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i8 = i3 & 128;
        if (i8 == 0) {
        }
        i9 = i3 & 256;
        if (i9 == 0) {
        }
        i10 = i9;
        i11 = i4 | 805306368;
        i12 = i3 & 1024;
        if (i12 != 0) {
        }
        i15 = i3 & 2048;
        if (i15 != 0) {
        }
        int i222222 = i14;
        i17 = i3 & 4096;
        if (i17 != 0) {
        }
        if ((i2 & 3072) == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        i19 = i18;
        if (!gapComposer2.shouldExecute(i11 & 1, (i11 & 306783379) == 306783378 || (i19 & 9363) != 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicTextField(final String str, final Function1 function1, final Modifier modifier, boolean z, boolean z2, final TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, int i2, VisualTransformation visualTransformation, Function1 function12, MutableInteractionSourceImpl mutableInteractionSourceImpl, Brush brush, Function3 function3, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        boolean z4;
        int i7;
        boolean z5;
        int i8;
        KeyboardOptions keyboardOptions2;
        int i9;
        KeyboardActions keyboardActions2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        GapComposer gapComposer;
        final boolean z6;
        final int i22;
        final VisualTransformation visualTransformation2;
        final MutableInteractionSourceImpl mutableInteractionSourceImpl2;
        Brush brush2;
        final Function3 function32;
        final boolean z7;
        final KeyboardActions keyboardActions3;
        final KeyboardOptions keyboardOptions3;
        final int i23;
        final Function1 function13;
        RecomposeScopeImpl endRestartGroup;
        KeyboardActions keyboardActions4;
        int i24;
        int i25;
        KeyboardActions keyboardActions5;
        MutableInteractionSourceImpl mutableInteractionSourceImpl3;
        boolean z8;
        Brush brush3;
        Function1 function14;
        boolean z9;
        Function3 function33;
        boolean z10;
        int i26;
        int i27;
        int i28;
        boolean z11;
        VisualTransformation visualTransformation3;
        int i29;
        KeyboardActions keyboardActions6;
        MutableInteractionSourceImpl mutableInteractionSourceImpl4;
        Brush brush4;
        KeyboardOptions keyboardOptions4;
        int i30;
        VisualTransformation visualTransformation4;
        long j;
        int i31;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(2026950908);
        if ((i3 & 6) == 0) {
            i6 = (gapComposer2.changed(str) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        if ((i3 & MLKEMEngine.KyberPolyBytes) == 0) {
            i6 |= gapComposer2.changed(modifier) ? 256 : 128;
        }
        int i32 = i5 & 8;
        if (i32 != 0) {
            i6 |= 3072;
        } else if ((i3 & 3072) == 0) {
            z4 = z;
            i6 |= gapComposer2.changed(z4) ? 2048 : 1024;
            i7 = i5 & 16;
            int i33 = PKIFailureInfo.certRevoked;
            if (i7 == 0) {
                i6 |= 24576;
            } else if ((i3 & 24576) == 0) {
                z5 = z2;
                i6 |= gapComposer2.changed(z5) ? 16384 : 8192;
                if ((i3 & 196608) == 0) {
                    i6 |= gapComposer2.changed(textStyle) ? 131072 : 65536;
                }
                i8 = i5 & 64;
                if (i8 != 0) {
                    i6 |= 1572864;
                    keyboardOptions2 = keyboardOptions;
                } else {
                    keyboardOptions2 = keyboardOptions;
                    if ((i3 & 1572864) == 0) {
                        i6 |= gapComposer2.changed(keyboardOptions2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                    }
                }
                i9 = i5 & 128;
                if (i9 != 0) {
                    i6 |= 12582912;
                    keyboardActions2 = keyboardActions;
                } else {
                    keyboardActions2 = keyboardActions;
                    if ((i3 & 12582912) == 0) {
                        i6 |= gapComposer2.changed(keyboardActions2) ? 8388608 : 4194304;
                    }
                }
                i10 = i5 & 256;
                if (i10 != 0) {
                    i6 |= 100663296;
                } else if ((i3 & 100663296) == 0) {
                    i6 |= gapComposer2.changed(z3) ? 67108864 : 33554432;
                }
                if ((i3 & 805306368) == 0) {
                    if ((i5 & 512) == 0 && gapComposer2.changed(i)) {
                        i31 = PKIFailureInfo.duplicateCertReq;
                        i6 |= i31;
                    }
                    i31 = 268435456;
                    i6 |= i31;
                }
                i11 = i5 & 1024;
                if (i11 != 0) {
                    i13 = i4 | 6;
                    i12 = i11;
                } else if ((i4 & 6) == 0) {
                    i12 = i11;
                    i13 = i4 | (gapComposer2.changed(i2) ? 4 : 2);
                } else {
                    i12 = i11;
                    i13 = i4;
                }
                i14 = i5 & 2048;
                if (i14 != 0) {
                    i13 |= 48;
                    i15 = i14;
                } else if ((i4 & 48) == 0) {
                    i15 = i14;
                    i13 |= gapComposer2.changed(visualTransformation) ? 32 : 16;
                } else {
                    i15 = i14;
                }
                int i34 = i13;
                i16 = i6;
                int i35 = i34 | MLKEMEngine.KyberPolyBytes;
                i17 = i5 & PKIFailureInfo.certRevoked;
                if (i17 != 0) {
                    i18 = i34 | 3456;
                } else {
                    if ((i4 & 3072) == 0) {
                        i35 |= gapComposer2.changed(mutableInteractionSourceImpl) ? 2048 : 1024;
                    }
                    i18 = i35;
                }
                i19 = i5 & 16384;
                if (i19 != 0) {
                    i20 = i18 | 24576;
                } else {
                    int i36 = i18;
                    if ((i4 & 24576) == 0) {
                        if (gapComposer2.changed(brush)) {
                            i33 = 16384;
                        }
                        i20 = i36 | i33;
                    } else {
                        i20 = i36;
                    }
                }
                i21 = i5 & 32768;
                if (i21 != 0) {
                    i20 |= 196608;
                } else if ((i4 & 196608) == 0) {
                    i20 |= gapComposer2.changedInstance(function3) ? 131072 : 65536;
                }
                if (gapComposer2.shouldExecute(i16 & 1, (i16 & 306783379) == 306783378 || (i20 & 74899) != 74898)) {
                    gapComposer2.startDefaults();
                    int i37 = i3 & 1;
                    Object obj = Composer.Companion.Empty;
                    if (i37 != 0 && !gapComposer2.getDefaultsInvalid()) {
                        gapComposer2.skipToGroupEnd();
                        if ((i5 & 512) != 0) {
                            z10 = z3;
                            i26 = i;
                            i28 = i2;
                            visualTransformation3 = visualTransformation;
                            function14 = function12;
                            brush4 = brush;
                            function33 = function3;
                            z9 = z5;
                            z11 = z4;
                            i29 = i20;
                            i27 = i16 & (-1879048193);
                            keyboardActions6 = keyboardActions2;
                            keyboardOptions4 = keyboardOptions2;
                        } else {
                            z10 = z3;
                            i26 = i;
                            i28 = i2;
                            visualTransformation3 = visualTransformation;
                            function14 = function12;
                            brush4 = brush;
                            function33 = function3;
                            z9 = z5;
                            keyboardOptions4 = keyboardOptions2;
                            z11 = z4;
                            i29 = i20;
                            i27 = i16;
                            keyboardActions6 = keyboardActions2;
                        }
                        mutableInteractionSourceImpl4 = mutableInteractionSourceImpl;
                    } else {
                        if (i32 != 0) {
                            z4 = true;
                        }
                        if (i7 != 0) {
                            z5 = false;
                        }
                        if (i8 != 0) {
                            keyboardOptions2 = KeyboardOptions.Default;
                        }
                        if (i9 != 0) {
                            KeyboardActions keyboardActions7 = KeyboardActions.Default;
                            KeyMappingKt.getDefault();
                            keyboardActions4 = KeyboardActions.Default;
                        } else {
                            keyboardActions4 = keyboardActions2;
                        }
                        boolean z12 = i10 != 0 ? false : z3;
                        if ((i5 & 512) != 0) {
                            i24 = z12 ? 1 : Integer.MAX_VALUE;
                            i25 = i16 & (-1879048193);
                        } else {
                            i24 = i;
                            i25 = i16;
                        }
                        int i38 = i12 != 0 ? 1 : i2;
                        VisualTransformation visualTransformation5 = i15 != 0 ? VisualTransformation.Companion.None : visualTransformation;
                        Object rememberedValue = gapComposer2.rememberedValue();
                        if (rememberedValue == obj) {
                            keyboardActions5 = keyboardActions4;
                            rememberedValue = new BasicTextKt$$ExternalSyntheticLambda14(13);
                            gapComposer2.updateRememberedValue(rememberedValue);
                        } else {
                            keyboardActions5 = keyboardActions4;
                        }
                        Function1 function15 = (Function1) rememberedValue;
                        MutableInteractionSourceImpl mutableInteractionSourceImpl5 = i17 != 0 ? null : mutableInteractionSourceImpl;
                        if (i19 != 0) {
                            mutableInteractionSourceImpl3 = mutableInteractionSourceImpl5;
                            z8 = z5;
                            brush3 = new SolidColor(Color.Black);
                        } else {
                            mutableInteractionSourceImpl3 = mutableInteractionSourceImpl5;
                            z8 = z5;
                            brush3 = brush;
                        }
                        if (i21 != 0) {
                            function14 = function15;
                            z9 = z8;
                            function33 = KeyMappingKt.lambda$759698998;
                        } else {
                            function14 = function15;
                            z9 = z8;
                            function33 = function3;
                        }
                        z10 = z12;
                        i26 = i24;
                        i27 = i25;
                        i28 = i38;
                        z11 = z4;
                        visualTransformation3 = visualTransformation5;
                        i29 = i20;
                        keyboardActions6 = keyboardActions5;
                        mutableInteractionSourceImpl4 = mutableInteractionSourceImpl3;
                        brush4 = brush3;
                        keyboardOptions4 = keyboardOptions2;
                    }
                    gapComposer2.endDefaults();
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (rememberedValue2 == obj) {
                        i30 = i29;
                        visualTransformation4 = visualTransformation3;
                        j = 0;
                        rememberedValue2 = Updater.mutableStateOf$default(new TextFieldValue(str, 0L, 6));
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    } else {
                        i30 = i29;
                        visualTransformation4 = visualTransformation3;
                        j = 0;
                    }
                    MutableState mutableState = (MutableState) rememberedValue2;
                    TextFieldValue m1002copy3r_uNRQ$default = TextFieldValue.m1002copy3r_uNRQ$default((TextFieldValue) mutableState.getValue(), str, j, 6);
                    boolean changed = gapComposer2.changed(m1002copy3r_uNRQ$default);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (changed || rememberedValue3 == obj) {
                        rememberedValue3 = new BasicTextFieldKt$$ExternalSyntheticLambda1(m1002copy3r_uNRQ$default, mutableState, 0);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    }
                    Updater.SideEffect((Function0) rememberedValue3, gapComposer2);
                    boolean z13 = (i27 & 14) == 4;
                    Object rememberedValue4 = gapComposer2.rememberedValue();
                    if (z13 || rememberedValue4 == obj) {
                        rememberedValue4 = Updater.mutableStateOf$default(str);
                        gapComposer2.updateRememberedValue(rememberedValue4);
                    }
                    MutableState mutableState2 = (MutableState) rememberedValue4;
                    ImeOptions imeOptions$foundation = keyboardOptions4.toImeOptions$foundation(z10);
                    boolean z14 = !z10;
                    int i39 = z10 ? 1 : i28;
                    int i40 = z10 ? 1 : i26;
                    KeyboardOptions keyboardOptions5 = keyboardOptions4;
                    boolean changed2 = gapComposer2.changed(mutableState2) | ((i27 & 112) == 32);
                    Object rememberedValue5 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue5 == obj) {
                        rememberedValue5 = new BasicTextFieldKt$$ExternalSyntheticLambda2(0, mutableState, mutableState2, function1);
                        gapComposer2.updateRememberedValue(rememberedValue5);
                    }
                    int i41 = i30 << 9;
                    gapComposer = gapComposer2;
                    VisualTransformation visualTransformation6 = visualTransformation4;
                    KeyMappingKt.CoreTextField(m1002copy3r_uNRQ$default, (Function1) rememberedValue5, modifier, textStyle, visualTransformation6, function14, mutableInteractionSourceImpl4, brush4, z14, i40, i39, imeOptions$foundation, keyboardActions6, z11, z9, function33, gapComposer, (i27 & 896) | ((i27 >> 6) & 7168) | (i41 & 57344) | (i41 & 458752) | (i41 & 3670016) | (i41 & 29360128), ((i27 >> 15) & 896) | (i27 & 7168) | (i27 & 57344) | (i30 & 458752));
                    z6 = z10;
                    brush2 = brush4;
                    visualTransformation2 = visualTransformation6;
                    function13 = function14;
                    mutableInteractionSourceImpl2 = mutableInteractionSourceImpl4;
                    keyboardActions3 = keyboardActions6;
                    z4 = z11;
                    z7 = z9;
                    function32 = function33;
                    i22 = i26;
                    i23 = i28;
                    keyboardOptions3 = keyboardOptions5;
                } else {
                    gapComposer = gapComposer2;
                    gapComposer.skipToGroupEnd();
                    z6 = z3;
                    i22 = i;
                    visualTransformation2 = visualTransformation;
                    mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
                    brush2 = brush;
                    function32 = function3;
                    z7 = z5;
                    keyboardActions3 = keyboardActions2;
                    keyboardOptions3 = keyboardOptions2;
                    i23 = i2;
                    function13 = function12;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final boolean z15 = z4;
                    final Brush brush5 = brush2;
                    endRestartGroup.block = new Function2() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            int updateChangedFlags = Updater.updateChangedFlags(i3 | 1);
                            int updateChangedFlags2 = Updater.updateChangedFlags(i4);
                            BasicTextFieldKt.BasicTextField(str, function1, modifier, z15, z7, textStyle, keyboardOptions3, keyboardActions3, z6, i22, i23, visualTransformation2, function13, mutableInteractionSourceImpl2, brush5, function32, (Composer) obj2, updateChangedFlags, updateChangedFlags2, i5);
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            z5 = z2;
            if ((i3 & 196608) == 0) {
            }
            i8 = i5 & 64;
            if (i8 != 0) {
            }
            i9 = i5 & 128;
            if (i9 != 0) {
            }
            i10 = i5 & 256;
            if (i10 != 0) {
            }
            if ((i3 & 805306368) == 0) {
            }
            i11 = i5 & 1024;
            if (i11 != 0) {
            }
            i14 = i5 & 2048;
            if (i14 != 0) {
            }
            int i342 = i13;
            i16 = i6;
            int i352 = i342 | MLKEMEngine.KyberPolyBytes;
            i17 = i5 & PKIFailureInfo.certRevoked;
            if (i17 != 0) {
            }
            i19 = i5 & 16384;
            if (i19 != 0) {
            }
            i21 = i5 & 32768;
            if (i21 != 0) {
            }
            if (gapComposer2.shouldExecute(i16 & 1, (i16 & 306783379) == 306783378 || (i20 & 74899) != 74898)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        z4 = z;
        i7 = i5 & 16;
        int i332 = PKIFailureInfo.certRevoked;
        if (i7 == 0) {
        }
        z5 = z2;
        if ((i3 & 196608) == 0) {
        }
        i8 = i5 & 64;
        if (i8 != 0) {
        }
        i9 = i5 & 128;
        if (i9 != 0) {
        }
        i10 = i5 & 256;
        if (i10 != 0) {
        }
        if ((i3 & 805306368) == 0) {
        }
        i11 = i5 & 1024;
        if (i11 != 0) {
        }
        i14 = i5 & 2048;
        if (i14 != 0) {
        }
        int i3422 = i13;
        i16 = i6;
        int i3522 = i3422 | MLKEMEngine.KyberPolyBytes;
        i17 = i5 & PKIFailureInfo.certRevoked;
        if (i17 != 0) {
        }
        i19 = i5 & 16384;
        if (i19 != 0) {
        }
        i21 = i5 & 32768;
        if (i21 != 0) {
        }
        if (gapComposer2.shouldExecute(i16 & 1, (i16 & 306783379) == 306783378 || (i20 & 74899) != 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicTextField(final TextFieldValue textFieldValue, final Function1 function1, final Modifier modifier, boolean z, TextStyle textStyle, final KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z2, int i, int i2, VisualTransformation visualTransformation, Function1 function12, MutableInteractionSourceImpl mutableInteractionSourceImpl, Brush brush, Function3 function3, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        boolean z3;
        int i7;
        int i8;
        TextStyle textStyle2;
        int i9;
        KeyboardActions keyboardActions2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        GapComposer gapComposer;
        final int i22;
        final int i23;
        final MutableInteractionSourceImpl mutableInteractionSourceImpl2;
        final Brush brush2;
        final Function3 function32;
        final boolean z4;
        final TextStyle textStyle3;
        final KeyboardActions keyboardActions3;
        final boolean z5;
        final VisualTransformation visualTransformation2;
        final Function1 function13;
        RecomposeScopeImpl endRestartGroup;
        KeyboardActions keyboardActions4;
        int i24;
        int i25;
        VisualTransformation visualTransformation3;
        TextStyle textStyle4;
        MutableInteractionSourceImpl mutableInteractionSourceImpl3;
        boolean z6;
        Brush brush3;
        Function1 function14;
        MutableInteractionSourceImpl mutableInteractionSourceImpl4;
        boolean z7;
        int i26;
        int i27;
        Brush brush4;
        int i28;
        TextStyle textStyle5;
        boolean z8;
        Function3 function33;
        Brush brush5;
        int i29;
        boolean z9;
        Object rememberedValue;
        int i30;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-971111025);
        if ((i3 & 6) == 0) {
            i6 = (gapComposer2.changed(textFieldValue) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        if ((i3 & MLKEMEngine.KyberPolyBytes) == 0) {
            i6 |= gapComposer2.changed(modifier) ? 256 : 128;
        }
        int i31 = i5 & 8;
        if (i31 != 0) {
            i6 |= 3072;
        } else if ((i3 & 3072) == 0) {
            z3 = z;
            i6 |= gapComposer2.changed(z3) ? 2048 : 1024;
            i7 = i5 & 16;
            int i32 = PKIFailureInfo.certRevoked;
            if (i7 == 0) {
                i6 |= 24576;
            } else if ((i3 & 24576) == 0) {
                i6 |= gapComposer2.changed(false) ? 16384 : 8192;
            }
            i8 = i5 & 32;
            if (i8 == 0) {
                i6 |= 196608;
                textStyle2 = textStyle;
            } else {
                textStyle2 = textStyle;
                if ((i3 & 196608) == 0) {
                    i6 |= gapComposer2.changed(textStyle2) ? 131072 : 65536;
                }
            }
            if ((i3 & 1572864) == 0) {
                i6 |= gapComposer2.changed(keyboardOptions) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
            }
            i9 = i5 & 128;
            if (i9 == 0) {
                i6 |= 12582912;
                keyboardActions2 = keyboardActions;
            } else {
                keyboardActions2 = keyboardActions;
                if ((i3 & 12582912) == 0) {
                    i6 |= gapComposer2.changed(keyboardActions2) ? 8388608 : 4194304;
                }
            }
            i10 = i5 & 256;
            if (i10 == 0) {
                i6 |= 100663296;
            } else if ((i3 & 100663296) == 0) {
                i6 |= gapComposer2.changed(z2) ? 67108864 : 33554432;
            }
            if ((i3 & 805306368) == 0) {
                if ((i5 & 512) == 0 && gapComposer2.changed(i)) {
                    i30 = PKIFailureInfo.duplicateCertReq;
                    i6 |= i30;
                }
                i30 = 268435456;
                i6 |= i30;
            }
            i11 = i5 & 1024;
            if (i11 == 0) {
                i13 = i4 | 6;
                i12 = i11;
            } else if ((i4 & 6) == 0) {
                i12 = i11;
                i13 = i4 | (gapComposer2.changed(i2) ? 4 : 2);
            } else {
                i12 = i11;
                i13 = i4;
            }
            i14 = i5 & 2048;
            if (i14 == 0) {
                i13 |= 48;
                i15 = i14;
            } else if ((i4 & 48) == 0) {
                i15 = i14;
                i13 |= gapComposer2.changed(visualTransformation) ? 32 : 16;
            } else {
                i15 = i14;
            }
            int i33 = i13;
            i16 = i6;
            int i34 = i33 | MLKEMEngine.KyberPolyBytes;
            i17 = i5 & PKIFailureInfo.certRevoked;
            if (i17 == 0) {
                i18 = i33 | 3456;
            } else if ((i4 & 3072) == 0) {
                i18 = i34 | (gapComposer2.changed(mutableInteractionSourceImpl) ? 2048 : 1024);
            } else {
                i18 = i34;
            }
            i19 = i5 & 16384;
            if (i19 == 0) {
                i20 = i18 | 24576;
            } else {
                i20 = i18;
                if ((i4 & 24576) == 0) {
                    if (gapComposer2.changed(brush)) {
                        i32 = 16384;
                    }
                    i20 |= i32;
                    i21 = i5 & 32768;
                    if (i21 != 0) {
                        i20 |= 196608;
                    } else if ((i4 & 196608) == 0) {
                        i20 |= gapComposer2.changedInstance(function3) ? 131072 : 65536;
                    }
                    if (gapComposer2.shouldExecute(i16 & 1, (i16 & 306783379) == 306783378 || (i20 & 74899) != 74898)) {
                        gapComposer2.startDefaults();
                        int i35 = i3 & 1;
                        Object obj = Composer.Companion.Empty;
                        if (i35 != 0 && !gapComposer2.getDefaultsInvalid()) {
                            gapComposer2.skipToGroupEnd();
                            if ((i5 & 512) != 0) {
                                z7 = z2;
                                i26 = i;
                                i27 = i2;
                                visualTransformation3 = visualTransformation;
                                function14 = function12;
                                brush4 = brush;
                                i28 = i16 & (-1879048193);
                            } else {
                                z7 = z2;
                                i26 = i;
                                i27 = i2;
                                visualTransformation3 = visualTransformation;
                                function14 = function12;
                                brush4 = brush;
                                i28 = i16;
                            }
                            z8 = z3;
                            textStyle5 = textStyle2;
                            mutableInteractionSourceImpl4 = mutableInteractionSourceImpl;
                        } else {
                            if (i31 != 0) {
                                z3 = true;
                            }
                            TextStyle textStyle6 = i8 != 0 ? TextStyle.Default : textStyle2;
                            if (i9 != 0) {
                                KeyboardActions keyboardActions5 = KeyboardActions.Default;
                                KeyMappingKt.getDefault();
                                keyboardActions4 = KeyboardActions.Default;
                            } else {
                                keyboardActions4 = keyboardActions2;
                            }
                            boolean z10 = i10 != 0 ? false : z2;
                            if ((i5 & 512) != 0) {
                                i24 = z10 ? 1 : Integer.MAX_VALUE;
                                i25 = i16 & (-1879048193);
                            } else {
                                i24 = i;
                                i25 = i16;
                            }
                            int i36 = i12 != 0 ? 1 : i2;
                            visualTransformation3 = i15 != 0 ? VisualTransformation.Companion.None : visualTransformation;
                            Object rememberedValue2 = gapComposer2.rememberedValue();
                            if (rememberedValue2 == obj) {
                                textStyle4 = textStyle6;
                                rememberedValue2 = new BasicTextKt$$ExternalSyntheticLambda14(14);
                                gapComposer2.updateRememberedValue(rememberedValue2);
                            } else {
                                textStyle4 = textStyle6;
                            }
                            Function1 function15 = (Function1) rememberedValue2;
                            MutableInteractionSourceImpl mutableInteractionSourceImpl5 = i17 != 0 ? null : mutableInteractionSourceImpl;
                            if (i19 != 0) {
                                mutableInteractionSourceImpl3 = mutableInteractionSourceImpl5;
                                z6 = z3;
                                brush3 = new SolidColor(Color.Black);
                            } else {
                                mutableInteractionSourceImpl3 = mutableInteractionSourceImpl5;
                                z6 = z3;
                                brush3 = brush;
                            }
                            if (i21 != 0) {
                                function14 = function15;
                                mutableInteractionSourceImpl4 = mutableInteractionSourceImpl3;
                                i26 = i24;
                                i27 = i36;
                                keyboardActions2 = keyboardActions4;
                                i28 = i25;
                                z8 = z6;
                                function33 = KeyMappingKt.lambda$486633673;
                                z7 = z10;
                                brush4 = brush3;
                                textStyle5 = textStyle4;
                                gapComposer2.endDefaults();
                                VisualTransformation visualTransformation4 = visualTransformation3;
                                function32 = function33;
                                ImeOptions imeOptions$foundation = keyboardOptions.toImeOptions$foundation(z7);
                                MutableInteractionSourceImpl mutableInteractionSourceImpl6 = mutableInteractionSourceImpl4;
                                boolean z11 = !z7;
                                int i37 = !z7 ? 1 : i27;
                                boolean z12 = z7;
                                if (z7) {
                                    brush5 = brush4;
                                    i29 = i26;
                                } else {
                                    brush5 = brush4;
                                    i29 = 1;
                                }
                                TextStyle textStyle7 = textStyle5;
                                z9 = ((i28 & 14) != 4) | ((i28 & 112) != 32);
                                rememberedValue = gapComposer2.rememberedValue();
                                if (!z9 || rememberedValue == obj) {
                                    rememberedValue = new ComposerKt$$ExternalSyntheticLambda9(textFieldValue, function1, 1);
                                    gapComposer2.updateRememberedValue(rememberedValue);
                                }
                                int i38 = i20 << 9;
                                gapComposer = gapComposer2;
                                KeyMappingKt.CoreTextField(textFieldValue, (Function1) rememberedValue, modifier, textStyle7, visualTransformation4, function14, mutableInteractionSourceImpl6, brush5, z11, i29, i37, imeOptions$foundation, keyboardActions2, z8, false, function32, gapComposer, (i28 & 910) | ((i28 >> 6) & 7168) | (i38 & 57344) | (i38 & 458752) | (i38 & 3670016) | (i38 & 29360128), (i28 & 7168) | ((i28 >> 15) & 896) | (i28 & 57344) | (i20 & 458752));
                                visualTransformation2 = visualTransformation4;
                                brush2 = brush5;
                                keyboardActions3 = keyboardActions2;
                                z4 = z8;
                                mutableInteractionSourceImpl2 = mutableInteractionSourceImpl6;
                                i22 = i26;
                                i23 = i27;
                                z5 = z12;
                                function13 = function14;
                                textStyle3 = textStyle7;
                            } else {
                                function14 = function15;
                                mutableInteractionSourceImpl4 = mutableInteractionSourceImpl3;
                                z7 = z10;
                                i26 = i24;
                                i27 = i36;
                                brush4 = brush3;
                                keyboardActions2 = keyboardActions4;
                                i28 = i25;
                                textStyle5 = textStyle4;
                                z8 = z6;
                            }
                        }
                        function33 = function3;
                        gapComposer2.endDefaults();
                        VisualTransformation visualTransformation42 = visualTransformation3;
                        function32 = function33;
                        ImeOptions imeOptions$foundation2 = keyboardOptions.toImeOptions$foundation(z7);
                        MutableInteractionSourceImpl mutableInteractionSourceImpl62 = mutableInteractionSourceImpl4;
                        boolean z112 = !z7;
                        if (!z7) {
                        }
                        boolean z122 = z7;
                        if (z7) {
                        }
                        TextStyle textStyle72 = textStyle5;
                        z9 = ((i28 & 14) != 4) | ((i28 & 112) != 32);
                        rememberedValue = gapComposer2.rememberedValue();
                        if (!z9) {
                        }
                        rememberedValue = new ComposerKt$$ExternalSyntheticLambda9(textFieldValue, function1, 1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                        int i382 = i20 << 9;
                        gapComposer = gapComposer2;
                        KeyMappingKt.CoreTextField(textFieldValue, (Function1) rememberedValue, modifier, textStyle72, visualTransformation42, function14, mutableInteractionSourceImpl62, brush5, z112, i29, i37, imeOptions$foundation2, keyboardActions2, z8, false, function32, gapComposer, (i28 & 910) | ((i28 >> 6) & 7168) | (i382 & 57344) | (i382 & 458752) | (i382 & 3670016) | (i382 & 29360128), (i28 & 7168) | ((i28 >> 15) & 896) | (i28 & 57344) | (i20 & 458752));
                        visualTransformation2 = visualTransformation42;
                        brush2 = brush5;
                        keyboardActions3 = keyboardActions2;
                        z4 = z8;
                        mutableInteractionSourceImpl2 = mutableInteractionSourceImpl62;
                        i22 = i26;
                        i23 = i27;
                        z5 = z122;
                        function13 = function14;
                        textStyle3 = textStyle72;
                    } else {
                        gapComposer = gapComposer2;
                        gapComposer.skipToGroupEnd();
                        i22 = i;
                        i23 = i2;
                        mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
                        brush2 = brush;
                        function32 = function3;
                        z4 = z3;
                        textStyle3 = textStyle2;
                        keyboardActions3 = keyboardActions2;
                        z5 = z2;
                        visualTransformation2 = visualTransformation;
                        function13 = function12;
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.block = new Function2() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                ((Integer) obj3).getClass();
                                int updateChangedFlags = Updater.updateChangedFlags(i3 | 1);
                                int updateChangedFlags2 = Updater.updateChangedFlags(i4);
                                BasicTextFieldKt.BasicTextField(TextFieldValue.this, function1, modifier, z4, textStyle3, keyboardOptions, keyboardActions3, z5, i22, i23, visualTransformation2, function13, mutableInteractionSourceImpl2, brush2, function32, (Composer) obj2, updateChangedFlags, updateChangedFlags2, i5);
                                return Unit.INSTANCE;
                            }
                        };
                        return;
                    }
                    return;
                }
            }
            i21 = i5 & 32768;
            if (i21 != 0) {
            }
            if (gapComposer2.shouldExecute(i16 & 1, (i16 & 306783379) == 306783378 || (i20 & 74899) != 74898)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        z3 = z;
        i7 = i5 & 16;
        int i322 = PKIFailureInfo.certRevoked;
        if (i7 == 0) {
        }
        i8 = i5 & 32;
        if (i8 == 0) {
        }
        if ((i3 & 1572864) == 0) {
        }
        i9 = i5 & 128;
        if (i9 == 0) {
        }
        i10 = i5 & 256;
        if (i10 == 0) {
        }
        if ((i3 & 805306368) == 0) {
        }
        i11 = i5 & 1024;
        if (i11 == 0) {
        }
        i14 = i5 & 2048;
        if (i14 == 0) {
        }
        int i332 = i13;
        i16 = i6;
        int i342 = i332 | MLKEMEngine.KyberPolyBytes;
        i17 = i5 & PKIFailureInfo.certRevoked;
        if (i17 == 0) {
        }
        i19 = i5 & 16384;
        if (i19 == 0) {
        }
        i21 = i5 & 32768;
        if (i21 != 0) {
        }
        if (gapComposer2.shouldExecute(i16 & 1, (i16 & 306783379) == 306783378 || (i20 & 74899) != 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
