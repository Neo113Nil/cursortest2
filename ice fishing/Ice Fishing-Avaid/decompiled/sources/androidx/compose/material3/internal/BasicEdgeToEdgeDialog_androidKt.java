package androidx.compose.material3.internal;

import android.view.View;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.DialogProperties;
import androidx.compose.ui.window.SecureFlagPolicy;
import androidx.profileinstaller.ProfileVerifier;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: BasicEdgeToEdgeDialog.android.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\\\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001a\u0014\u0010\u0010\u001a\u00020\t*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\tH\u0000¨\u0006\u0013²\u0006\u001b\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u000eX\u008a\u0084\u0002²\u0006\u0010\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003X\u008a\u0084\u0002²\u0006\n\u0010\u0016\u001a\u00020\tX\u008a\u0084\u0002"}, d2 = {"BasicEdgeToEdgeDialog", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "properties", "Landroidx/compose/ui/window/DialogProperties;", "lightStatusBars", "", "lightNavigationBars", "content", "Lkotlin/Function1;", "Landroidx/compose/material3/internal/PredictiveBackState;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/window/DialogProperties;ZZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "shouldApplySecureFlag", "Landroidx/compose/ui/window/SecureFlagPolicy;", "isSecureFlagSetOnParent", "material3", "currentContent", "currentOnDismissRequest", "currentDismissOnBackPress"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class BasicEdgeToEdgeDialog_androidKt {

    /* compiled from: BasicEdgeToEdgeDialog.android.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SecureFlagPolicy.values().length];
            try {
                iArr[SecureFlagPolicy.SecureOff.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SecureFlagPolicy.SecureOn.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SecureFlagPolicy.Inherit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BasicEdgeToEdgeDialog$lambda$7(Function0 function0, Modifier modifier, DialogProperties dialogProperties, boolean z, boolean z2, Function3 function3, int i, int i2, Composer composer, int i3) {
        BasicEdgeToEdgeDialog(function0, modifier, dialogProperties, z, z2, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicEdgeToEdgeDialog(final Function0<Unit> function0, Modifier modifier, DialogProperties dialogProperties, boolean z, boolean z2, final Function3<? super PredictiveBackState, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        DialogProperties dialogProperties2;
        boolean z3;
        boolean z4;
        final Modifier modifier3;
        final DialogProperties dialogProperties3;
        ScopeUpdateScope endRestartGroup;
        final Modifier modifier4;
        int i5;
        DialogProperties dialogProperties4;
        DialogProperties dialogProperties5;
        int i6;
        boolean z5;
        Object obj;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(814581409);
        ComposerKt.sourceInformation(startRestartGroup, "C(BasicEdgeToEdgeDialog)N(onDismissRequest,modifier,properties,lightStatusBars,lightNavigationBars,content)91@3820L7,92@3859L7,93@3914L7,94@3944L28,95@4009L21,95@3992L38,97@4058L29,98@4123L38,99@4199L51,102@4277L1031,128@5339L129,128@5314L154,137@5485L285,137@5474L296:BasicEdgeToEdgeDialog.android.kt#mqatfk");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                dialogProperties2 = dialogProperties;
                i3 |= startRestartGroup.changed(dialogProperties2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        z3 = z;
                        if (startRestartGroup.changed(z3)) {
                            i8 = 2048;
                            i3 |= i8;
                        }
                    } else {
                        z3 = z;
                    }
                    i8 = 1024;
                    i3 |= i8;
                } else {
                    z3 = z;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        z4 = z2;
                        if (startRestartGroup.changed(z4)) {
                            i7 = 16384;
                            i3 |= i7;
                        }
                    } else {
                        z4 = z2;
                    }
                    i7 = 8192;
                    i3 |= i7;
                } else {
                    z4 = z2;
                }
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i3 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
                }
                if (startRestartGroup.shouldExecute((i3 & 74899) != 74898, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "37@1426L7,39@1507L7");
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier.Companion companion = i9 != 0 ? Modifier.INSTANCE : modifier2;
                        DialogProperties dialogProperties6 = i4 != 0 ? new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null) : dialogProperties2;
                        if ((i2 & 8) != 0) {
                            ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                            Object consume = startRestartGroup.consume(localContentColor);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            i3 &= -7169;
                            z3 = ColorKt.m6838luminance8_81llA(((Color) consume).m6796unboximpl()) < 0.5f;
                        }
                        if ((i2 & 16) != 0) {
                            ProvidableCompositionLocal<Color> localContentColor2 = ContentColorKt.getLocalContentColor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                            Object consume2 = startRestartGroup.consume(localContentColor2);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            i3 &= -57345;
                            modifier4 = companion;
                            z4 = ColorKt.m6838luminance8_81llA(((Color) consume2).m6796unboximpl()) < 0.5f;
                        } else {
                            modifier4 = companion;
                        }
                        i5 = i3;
                        dialogProperties4 = dialogProperties6;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        i5 = i3;
                        modifier4 = modifier2;
                        dialogProperties4 = dialogProperties2;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(814581409, i5, -1, "androidx.compose.material3.internal.BasicEdgeToEdgeDialog (BasicEdgeToEdgeDialog.android.kt:90)");
                    }
                    ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume3 = startRestartGroup.consume(localView);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    View view = (View) consume3;
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume4 = startRestartGroup.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Density density = (Density) consume4;
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume5 = startRestartGroup.consume(localLayoutDirection);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final LayoutDirection layoutDirection = (LayoutDirection) consume5;
                    CompositionContext rememberCompositionContext = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
                    Object[] objArr = new Object[0];
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1128700822, "CC(remember):BasicEdgeToEdgeDialog.android.kt#9igjgp");
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    DialogProperties dialogProperties7 = dialogProperties4;
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function0() { // from class: androidx.compose.material3.internal.BasicEdgeToEdgeDialog_androidKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                UUID randomUUID;
                                randomUUID = UUID.randomUUID();
                                return randomUUID;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    UUID uuid = (UUID) RememberSaveableKt.rememberSaveable(objArr, (Function0) rememberedValue, startRestartGroup, 48);
                    final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function3, startRestartGroup, (i5 >> 15) & 14);
                    int i10 = i5 & 14;
                    final State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function0, startRestartGroup, i10);
                    final State rememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(dialogProperties7.getDismissOnBackPress()), startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1128710408, "CC(remember):BasicEdgeToEdgeDialog.android.kt#9igjgp");
                    boolean changed = startRestartGroup.changed(view) | startRestartGroup.changed(density);
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        dialogProperties5 = dialogProperties7;
                        i6 = i5;
                        DialogWrapper dialogWrapper = new DialogWrapper(function0, dialogProperties5, view, layoutDirection, density, uuid, z3, z4);
                        z5 = true;
                        dialogWrapper.setContent(rememberCompositionContext, ComposableLambdaKt.composableLambdaInstance(-635938462, true, new Function2() { // from class: androidx.compose.material3.internal.BasicEdgeToEdgeDialog_androidKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                Unit BasicEdgeToEdgeDialog$lambda$4$0$0;
                                BasicEdgeToEdgeDialog$lambda$4$0$0 = BasicEdgeToEdgeDialog_androidKt.BasicEdgeToEdgeDialog$lambda$4$0$0(Modifier.this, rememberUpdatedState3, rememberUpdatedState2, rememberUpdatedState, (Composer) obj2, ((Integer) obj3).intValue());
                                return BasicEdgeToEdgeDialog$lambda$4$0$0;
                            }
                        }));
                        startRestartGroup.updateRememberedValue(dialogWrapper);
                        obj = dialogWrapper;
                    } else {
                        dialogProperties5 = dialogProperties7;
                        i6 = i5;
                        z5 = true;
                        obj = rememberedValue2;
                    }
                    final DialogWrapper dialogWrapper2 = (DialogWrapper) obj;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1128743490, "CC(remember):BasicEdgeToEdgeDialog.android.kt#9igjgp");
                    boolean changedInstance = startRestartGroup.changedInstance(dialogWrapper2);
                    Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new Function1() { // from class: androidx.compose.material3.internal.BasicEdgeToEdgeDialog_androidKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                DisposableEffectResult BasicEdgeToEdgeDialog$lambda$5$0;
                                BasicEdgeToEdgeDialog$lambda$5$0 = BasicEdgeToEdgeDialog_androidKt.BasicEdgeToEdgeDialog$lambda$5$0(DialogWrapper.this, (DisposableEffectScope) obj2);
                                return BasicEdgeToEdgeDialog$lambda$5$0;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    EffectsKt.DisposableEffect(dialogWrapper2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue3, startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1128748318, "CC(remember):BasicEdgeToEdgeDialog.android.kt#9igjgp");
                    int i11 = i6;
                    boolean changedInstance2 = startRestartGroup.changedInstance(dialogWrapper2) | (i10 == 4 ? z5 : false) | ((i11 & 896) == 256 ? z5 : false) | startRestartGroup.changed(layoutDirection.ordinal()) | (((((i11 & 7168) ^ 3072) <= 2048 || !startRestartGroup.changed(z3)) && (i11 & 3072) != 2048) ? false : z5) | (((((57344 & i11) ^ 24576) <= 16384 || !startRestartGroup.changed(z4)) && (i11 & 24576) != 16384) ? false : z5);
                    Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (changedInstance2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        final DialogProperties dialogProperties8 = dialogProperties5;
                        final boolean z6 = z3;
                        final boolean z7 = z4;
                        Function0 function02 = new Function0() { // from class: androidx.compose.material3.internal.BasicEdgeToEdgeDialog_androidKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit BasicEdgeToEdgeDialog$lambda$6$0;
                                BasicEdgeToEdgeDialog$lambda$6$0 = BasicEdgeToEdgeDialog_androidKt.BasicEdgeToEdgeDialog$lambda$6$0(DialogWrapper.this, function0, dialogProperties8, layoutDirection, z6, z7);
                                return BasicEdgeToEdgeDialog$lambda$6$0;
                            }
                        };
                        dialogProperties5 = dialogProperties8;
                        startRestartGroup.updateRememberedValue(function02);
                        rememberedValue4 = function02;
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    EffectsKt.SideEffect((Function0) rememberedValue4, startRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    dialogProperties3 = dialogProperties5;
                    modifier3 = modifier4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    dialogProperties3 = dialogProperties2;
                }
                final boolean z8 = z3;
                final boolean z9 = z4;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.internal.BasicEdgeToEdgeDialog_androidKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            Unit BasicEdgeToEdgeDialog$lambda$7;
                            BasicEdgeToEdgeDialog$lambda$7 = BasicEdgeToEdgeDialog_androidKt.BasicEdgeToEdgeDialog$lambda$7(Function0.this, modifier3, dialogProperties3, z8, z9, function3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                            return BasicEdgeToEdgeDialog$lambda$7;
                        }
                    });
                    return;
                }
                return;
            }
            dialogProperties2 = dialogProperties;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 74899) != 74898, i3 & 1)) {
            }
            final boolean z82 = z3;
            final boolean z92 = z4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        dialogProperties2 = dialogProperties;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 74899) != 74898, i3 & 1)) {
        }
        final boolean z822 = z3;
        final boolean z922 = z4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BasicEdgeToEdgeDialog$lambda$4$0$0(Modifier modifier, State state, State state2, State state3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C115@4864L29,117@4919L237,123@5205L12,123@5182L76:BasicEdgeToEdgeDialog.android.kt#mqatfk");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-635938462, i, -1, "androidx.compose.material3.internal.BasicEdgeToEdgeDialog.<anonymous>.<anonymous>.<anonymous> (BasicEdgeToEdgeDialog.android.kt:115)");
            }
            PredictiveBackState rememberPredictiveBackState = BasicEdgeToEdgeDialogKt.rememberPredictiveBackState(composer, 0);
            BasicEdgeToEdgeDialogKt.PredictiveBackStateHandler(rememberPredictiveBackState, BasicEdgeToEdgeDialog$lambda$3(state), BasicEdgeToEdgeDialog$lambda$2(state2), composer, 0, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1251493362, "CC(remember):BasicEdgeToEdgeDialog.android.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material3.internal.BasicEdgeToEdgeDialog_androidKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit BasicEdgeToEdgeDialog$lambda$4$0$0$0$0;
                        BasicEdgeToEdgeDialog$lambda$4$0$0$0$0 = BasicEdgeToEdgeDialog_androidKt.BasicEdgeToEdgeDialog$lambda$4$0$0$0$0((SemanticsPropertyReceiver) obj);
                        return BasicEdgeToEdgeDialog$lambda$4$0$0$0$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            Modifier semantics$default = SemanticsModifierKt.semantics$default(modifier, false, (Function1) rememberedValue, 1, null);
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, semantics$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m5864constructorimpl = Updater.m5864constructorimpl(composer);
            Updater.m5872setimpl(m5864constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 213544984, "C123@5221L35:BasicEdgeToEdgeDialog.android.kt#mqatfk");
            BasicEdgeToEdgeDialog$lambda$1(state3).invoke(rememberPredictiveBackState, composer, 0);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BasicEdgeToEdgeDialog$lambda$4$0$0$0$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.dialog(semanticsPropertyReceiver);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult BasicEdgeToEdgeDialog$lambda$5$0(final DialogWrapper dialogWrapper, DisposableEffectScope disposableEffectScope) {
        dialogWrapper.show();
        return new DisposableEffectResult() { // from class: androidx.compose.material3.internal.BasicEdgeToEdgeDialog_androidKt$BasicEdgeToEdgeDialog$lambda$5$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                DialogWrapper.this.dismiss();
                DialogWrapper.this.disposeComposition();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BasicEdgeToEdgeDialog$lambda$6$0(DialogWrapper dialogWrapper, Function0 function0, DialogProperties dialogProperties, LayoutDirection layoutDirection, boolean z, boolean z2) {
        dialogWrapper.updateParameters(function0, dialogProperties, layoutDirection, z, z2);
        return Unit.INSTANCE;
    }

    public static final boolean shouldApplySecureFlag(SecureFlagPolicy secureFlagPolicy, boolean z) {
        int i = WhenMappings.$EnumSwitchMapping$0[secureFlagPolicy.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 3) {
            return z;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final Function3<PredictiveBackState, Composer, Integer, Unit> BasicEdgeToEdgeDialog$lambda$1(State<? extends Function3<? super PredictiveBackState, ? super Composer, ? super Integer, Unit>> state) {
        return (Function3) state.getValue();
    }

    private static final Function0<Unit> BasicEdgeToEdgeDialog$lambda$2(State<? extends Function0<Unit>> state) {
        return state.getValue();
    }

    private static final boolean BasicEdgeToEdgeDialog$lambda$3(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
