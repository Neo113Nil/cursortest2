package androidx.compose.material3;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
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
import java.util.UUID;
import kotlin.Metadata;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: ModalBottomSheet.android.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aF\u0010\u0000\u001a\u00020\u00012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\tH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\f\u0010\f\u001a\u00020\r*\u00020\u000eH\u0000\u001a\u0013\u0010\u000f\u001a\u00020\r*\u00020\u0005H\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012²\u0006\u0015\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\tX\u008a\u0084\u0002"}, d2 = {"ModalBottomSheetDialog", "", "onDismissRequest", "Lkotlin/Function0;", "contentColor", "Landroidx/compose/ui/graphics/Color;", "properties", "Landroidx/compose/material3/ModalBottomSheetProperties;", "content", "Landroidx/compose/runtime/Composable;", "ModalBottomSheetDialog-sW7UJKQ", "(Lkotlin/jvm/functions/Function0;JLandroidx/compose/material3/ModalBottomSheetProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "isFlagSecureEnabled", "", "Landroid/view/View;", "isDark", "isDark-8_81llA", "(J)Z", "material3", "currentContent"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class ModalBottomSheet_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModalBottomSheetDialog_sW7UJKQ$lambda$6(Function0 function0, long j, ModalBottomSheetProperties modalBottomSheetProperties, Function2 function2, int i, int i2, Composer composer, int i3) {
        m3583ModalBottomSheetDialogsW7UJKQ(function0, j, modalBottomSheetProperties, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0080  */
    /* renamed from: ModalBottomSheetDialog-sW7UJKQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3583ModalBottomSheetDialogsW7UJKQ(Function0<Unit> function0, long j, ModalBottomSheetProperties modalBottomSheetProperties, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        Function0<Unit> function02;
        int i3;
        long j2;
        ModalBottomSheetProperties modalBottomSheetProperties2;
        Function0<Unit> function03;
        final long j3;
        final ModalBottomSheetProperties modalBottomSheetProperties3;
        ScopeUpdateScope endRestartGroup;
        Function0<Unit> function04;
        ModalBottomSheetProperties modalBottomSheetProperties4;
        long j4;
        Object rememberedValue;
        boolean changed;
        long j5;
        Object obj;
        boolean changedInstance;
        Object rememberedValue2;
        boolean changed2;
        Object rememberedValue3;
        Composer startRestartGroup = composer.startRestartGroup(-85756322);
        ComposerKt.sourceInformation(startRestartGroup, "C(ModalBottomSheetDialog)N(onDismissRequest,contentColor:c#ui.graphics.Color,properties,content)230@10376L7,231@10415L7,232@10470L7,233@10500L28,234@10555L29,235@10621L21,235@10604L38,237@10668L515,254@11214L129,254@11189L154,263@11360L224,263@11349L235:ModalBottomSheet.android.kt#uh7d8r");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            function02 = function0;
        } else if ((i & 6) == 0) {
            function02 = function0;
            i3 = (startRestartGroup.changedInstance(function02) ? 4 : 2) | i;
        } else {
            function02 = function0;
            i3 = i;
        }
        if ((i & 48) == 0) {
            j2 = j;
            i3 |= ((i2 & 2) == 0 && startRestartGroup.changed(j2)) ? 32 : 16;
        } else {
            j2 = j;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modalBottomSheetProperties2 = modalBottomSheetProperties;
            i3 |= startRestartGroup.changed(modalBottomSheetProperties2) ? 256 : 128;
            if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
            }
            boolean z = true;
            if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.startDefaults();
                ComposerKt.sourceInformation(startRestartGroup, "290@12265L2,292@12331L14,290@12295L51");
                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    if (i4 != 0) {
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -807380064, "CC(remember):ModalBottomSheet.android.kt#9igjgp");
                        Object rememberedValue4 = startRestartGroup.rememberedValue();
                        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new Function0() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit unit;
                                    unit = Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        function04 = (Function0) rememberedValue4;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    } else {
                        function04 = function02;
                    }
                    if ((i2 & 2) != 0) {
                        j2 = ColorSchemeKt.m2784contentColorForek8zF_U(BottomSheetDefaults.INSTANCE.getContainerColor(startRestartGroup, 6), startRestartGroup, 0);
                        i3 &= -113;
                    }
                    if (i5 != 0) {
                        function03 = function04;
                        modalBottomSheetProperties4 = new ModalBottomSheetProperties(false, false, 3, null);
                        j4 = j2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-85756322, i3, -1, "androidx.compose.material3.ModalBottomSheetDialog (ModalBottomSheet.android.kt:229)");
                        }
                        ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(localView);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        View view = (View) consume;
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume2 = startRestartGroup.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Density density = (Density) consume2;
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume3 = startRestartGroup.consume(localLayoutDirection);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final LayoutDirection layoutDirection = (LayoutDirection) consume3;
                        CompositionContext rememberCompositionContext = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
                        final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function2, startRestartGroup, (i3 >> 9) & 14);
                        Object[] objArr = new Object[0];
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -807432653, "CC(remember):ModalBottomSheet.android.kt#9igjgp");
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new Function0() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$$ExternalSyntheticLambda1
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
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -807430655, "CC(remember):ModalBottomSheet.android.kt#9igjgp");
                        changed = startRestartGroup.changed(view) | startRestartGroup.changed(density);
                        Object rememberedValue5 = startRestartGroup.rememberedValue();
                        if (!changed || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper = new ModalBottomSheetDialogWrapper(function03, modalBottomSheetProperties4, j4, view, layoutDirection, density, uuid, null);
                            j5 = j4;
                            modalBottomSheetDialogWrapper.setContent(rememberCompositionContext, ComposableLambdaKt.composableLambdaInstance(1379699857, true, new Function2() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj2, Object obj3) {
                                    Unit ModalBottomSheetDialog_sW7UJKQ$lambda$3$0$0;
                                    ModalBottomSheetDialog_sW7UJKQ$lambda$3$0$0 = ModalBottomSheet_androidKt.ModalBottomSheetDialog_sW7UJKQ$lambda$3$0$0(State.this, (Composer) obj2, ((Integer) obj3).intValue());
                                    return ModalBottomSheetDialog_sW7UJKQ$lambda$3$0$0;
                                }
                            }));
                            startRestartGroup.updateRememberedValue(modalBottomSheetDialogWrapper);
                            obj = modalBottomSheetDialogWrapper;
                        } else {
                            j5 = j4;
                            obj = rememberedValue5;
                        }
                        final ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper2 = (ModalBottomSheetDialogWrapper) obj;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -807413569, "CC(remember):ModalBottomSheet.android.kt#9igjgp");
                        changedInstance = startRestartGroup.changedInstance(modalBottomSheetDialogWrapper2);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new Function1() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    DisposableEffectResult ModalBottomSheetDialog_sW7UJKQ$lambda$4$0;
                                    ModalBottomSheetDialog_sW7UJKQ$lambda$4$0 = ModalBottomSheet_androidKt.ModalBottomSheetDialog_sW7UJKQ$lambda$4$0(ModalBottomSheetDialogWrapper.this, (DisposableEffectScope) obj2);
                                    return ModalBottomSheetDialog_sW7UJKQ$lambda$4$0;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        EffectsKt.DisposableEffect(modalBottomSheetDialogWrapper2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue2, startRestartGroup, 0);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -807408802, "CC(remember):ModalBottomSheet.android.kt#9igjgp");
                        boolean changedInstance2 = startRestartGroup.changedInstance(modalBottomSheetDialogWrapper2) | ((i3 & 14) != 4) | ((i3 & 896) != 256);
                        if ((((i3 & 112) ^ 48) > 32 || !startRestartGroup.changed(j5)) && (i3 & 48) != 32) {
                            z = false;
                        }
                        changed2 = changedInstance2 | z | startRestartGroup.changed(layoutDirection.ordinal());
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            final long j6 = j5;
                            final ModalBottomSheetProperties modalBottomSheetProperties5 = modalBottomSheetProperties4;
                            final Function0<Unit> function05 = function03;
                            rememberedValue3 = new Function0() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit ModalBottomSheetDialog_sW7UJKQ$lambda$5$0;
                                    ModalBottomSheetDialog_sW7UJKQ$lambda$5$0 = ModalBottomSheet_androidKt.ModalBottomSheetDialog_sW7UJKQ$lambda$5$0(ModalBottomSheetDialogWrapper.this, function05, modalBottomSheetProperties5, j6, layoutDirection);
                                    return ModalBottomSheetDialog_sW7UJKQ$lambda$5$0;
                                }
                            };
                            function03 = function05;
                            modalBottomSheetProperties4 = modalBottomSheetProperties5;
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        EffectsKt.SideEffect((Function0) rememberedValue3, startRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j3 = j5;
                        modalBottomSheetProperties3 = modalBottomSheetProperties4;
                    } else {
                        function03 = function04;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    function03 = function02;
                }
                j4 = j2;
                modalBottomSheetProperties4 = modalBottomSheetProperties2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ProvidableCompositionLocal<View> localView2 = AndroidCompositionLocals_androidKt.getLocalView();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume4 = startRestartGroup.consume(localView2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                View view2 = (View) consume4;
                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume22 = startRestartGroup.consume(localDensity2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density2 = (Density) consume22;
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume32 = startRestartGroup.consume(localLayoutDirection2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final LayoutDirection layoutDirection2 = (LayoutDirection) consume32;
                CompositionContext rememberCompositionContext2 = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
                final State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function2, startRestartGroup, (i3 >> 9) & 14);
                Object[] objArr2 = new Object[0];
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -807432653, "CC(remember):ModalBottomSheet.android.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                UUID uuid2 = (UUID) RememberSaveableKt.rememberSaveable(objArr2, (Function0) rememberedValue, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -807430655, "CC(remember):ModalBottomSheet.android.kt#9igjgp");
                changed = startRestartGroup.changed(view2) | startRestartGroup.changed(density2);
                Object rememberedValue52 = startRestartGroup.rememberedValue();
                if (changed) {
                }
                ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper3 = new ModalBottomSheetDialogWrapper(function03, modalBottomSheetProperties4, j4, view2, layoutDirection2, density2, uuid2, null);
                j5 = j4;
                modalBottomSheetDialogWrapper3.setContent(rememberCompositionContext2, ComposableLambdaKt.composableLambdaInstance(1379699857, true, new Function2() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Unit ModalBottomSheetDialog_sW7UJKQ$lambda$3$0$0;
                        ModalBottomSheetDialog_sW7UJKQ$lambda$3$0$0 = ModalBottomSheet_androidKt.ModalBottomSheetDialog_sW7UJKQ$lambda$3$0$0(State.this, (Composer) obj2, ((Integer) obj3).intValue());
                        return ModalBottomSheetDialog_sW7UJKQ$lambda$3$0$0;
                    }
                }));
                startRestartGroup.updateRememberedValue(modalBottomSheetDialogWrapper3);
                obj = modalBottomSheetDialogWrapper3;
                final ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper22 = (ModalBottomSheetDialogWrapper) obj;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -807413569, "CC(remember):ModalBottomSheet.android.kt#9igjgp");
                changedInstance = startRestartGroup.changedInstance(modalBottomSheetDialogWrapper22);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue2 = new Function1() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        DisposableEffectResult ModalBottomSheetDialog_sW7UJKQ$lambda$4$0;
                        ModalBottomSheetDialog_sW7UJKQ$lambda$4$0 = ModalBottomSheet_androidKt.ModalBottomSheetDialog_sW7UJKQ$lambda$4$0(ModalBottomSheetDialogWrapper.this, (DisposableEffectScope) obj2);
                        return ModalBottomSheetDialog_sW7UJKQ$lambda$4$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                EffectsKt.DisposableEffect(modalBottomSheetDialogWrapper22, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue2, startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -807408802, "CC(remember):ModalBottomSheet.android.kt#9igjgp");
                boolean changedInstance22 = startRestartGroup.changedInstance(modalBottomSheetDialogWrapper22) | ((i3 & 14) != 4) | ((i3 & 896) != 256);
                if (((i3 & 112) ^ 48) > 32) {
                }
                z = false;
                changed2 = changedInstance22 | z | startRestartGroup.changed(layoutDirection2.ordinal());
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed2) {
                }
                final long j62 = j5;
                final ModalBottomSheetProperties modalBottomSheetProperties52 = modalBottomSheetProperties4;
                final Function0 function052 = function03;
                rememberedValue3 = new Function0() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit ModalBottomSheetDialog_sW7UJKQ$lambda$5$0;
                        ModalBottomSheetDialog_sW7UJKQ$lambda$5$0 = ModalBottomSheet_androidKt.ModalBottomSheetDialog_sW7UJKQ$lambda$5$0(ModalBottomSheetDialogWrapper.this, function052, modalBottomSheetProperties52, j62, layoutDirection2);
                        return ModalBottomSheetDialog_sW7UJKQ$lambda$5$0;
                    }
                };
                function03 = function052;
                modalBottomSheetProperties4 = modalBottomSheetProperties52;
                startRestartGroup.updateRememberedValue(rememberedValue3);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                EffectsKt.SideEffect((Function0) rememberedValue3, startRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                j3 = j5;
                modalBottomSheetProperties3 = modalBottomSheetProperties4;
            } else {
                startRestartGroup.skipToGroupEnd();
                function03 = function02;
                j3 = j2;
                modalBottomSheetProperties3 = modalBottomSheetProperties2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final Function0<Unit> function06 = function03;
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Unit ModalBottomSheetDialog_sW7UJKQ$lambda$6;
                        ModalBottomSheetDialog_sW7UJKQ$lambda$6 = ModalBottomSheet_androidKt.ModalBottomSheetDialog_sW7UJKQ$lambda$6(Function0.this, j3, modalBottomSheetProperties3, function2, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                        return ModalBottomSheetDialog_sW7UJKQ$lambda$6;
                    }
                });
                return;
            }
            return;
        }
        modalBottomSheetProperties2 = modalBottomSheetProperties;
        if ((i & 3072) == 0) {
        }
        boolean z2 = true;
        if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModalBottomSheetDialog_sW7UJKQ$lambda$3$0$0(State state, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C249@11099L12,249@11076L57:ModalBottomSheet.android.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1379699857, i, -1, "androidx.compose.material3.ModalBottomSheetDialog.<anonymous>.<anonymous>.<anonymous> (ModalBottomSheet.android.kt:249)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1253330307, "CC(remember):ModalBottomSheet.android.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit ModalBottomSheetDialog_sW7UJKQ$lambda$3$0$0$0$0;
                        ModalBottomSheetDialog_sW7UJKQ$lambda$3$0$0$0$0 = ModalBottomSheet_androidKt.ModalBottomSheetDialog_sW7UJKQ$lambda$3$0$0$0$0((SemanticsPropertyReceiver) obj);
                        return ModalBottomSheetDialog_sW7UJKQ$lambda$3$0$0$0$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            Modifier semantics$default = SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null);
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
            ComposerKt.sourceInformationMarkerStart(composer, 1287690172, "C249@11115L16:ModalBottomSheet.android.kt#uh7d8r");
            ModalBottomSheetDialog_sW7UJKQ$lambda$1(state).invoke(composer, 0);
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
    public static final Unit ModalBottomSheetDialog_sW7UJKQ$lambda$3$0$0$0$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.dialog(semanticsPropertyReceiver);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult ModalBottomSheetDialog_sW7UJKQ$lambda$4$0(final ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper, DisposableEffectScope disposableEffectScope) {
        modalBottomSheetDialogWrapper.show();
        return new DisposableEffectResult() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetDialog_sW7UJKQ$lambda$4$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                ModalBottomSheetDialogWrapper.this.dismiss();
                ModalBottomSheetDialogWrapper.this.disposeComposition();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModalBottomSheetDialog_sW7UJKQ$lambda$5$0(ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper, Function0 function0, ModalBottomSheetProperties modalBottomSheetProperties, long j, LayoutDirection layoutDirection) {
        modalBottomSheetDialogWrapper.m3572updateParameters9LQNqLg(function0, modalBottomSheetProperties, j, layoutDirection);
        return Unit.INSTANCE;
    }

    public static final boolean isFlagSecureEnabled(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }

    /* renamed from: isDark-8_81llA, reason: not valid java name */
    public static final boolean m3584isDark8_81llA(long j) {
        return !Color.m6787equalsimpl0(j, Color.INSTANCE.m6821getTransparent0d7_KjU()) && ((double) ColorKt.m6838luminance8_81llA(j)) <= 0.5d;
    }

    private static final Function2<Composer, Integer, Unit> ModalBottomSheetDialog_sW7UJKQ$lambda$1(State<? extends Function2<? super Composer, ? super Integer, Unit>> state) {
        return (Function2) state.getValue();
    }
}
