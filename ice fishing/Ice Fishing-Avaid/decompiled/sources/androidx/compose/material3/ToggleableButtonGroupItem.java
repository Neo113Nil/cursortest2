package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt;

/* compiled from: ButtonGroup.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B^\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n\u0012\u0013\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f¢\u0006\u0002\b\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0006H\u0017¢\u0006\u0002\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0018H\u0017¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f¢\u0006\u0002\b\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u000e\u0010\u000e\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Landroidx/compose/material3/ToggleableButtonGroupItem;", "Landroidx/compose/material3/ButtonGroupItem;", "checked", "", "onCheckedChange", "Lkotlin/Function1;", "", "weight", "", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "icon", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "enabled", "label", "", "<init>", "(ZLkotlin/jvm/functions/Function1;FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function2;ZLjava/lang/String;)V", "Lkotlin/jvm/functions/Function2;", "ButtonGroupContent", "(Landroidx/compose/runtime/Composer;I)V", "MenuContent", "state", "Landroidx/compose/material3/ButtonGroupMenuState;", "(Landroidx/compose/material3/ButtonGroupMenuState;Landroidx/compose/runtime/Composer;I)V", "material3"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class ToggleableButtonGroupItem implements ButtonGroupItem {
    public static final int $stable = 8;
    private final AnimationSpec<Float> animationSpec;
    private final boolean checked;
    private final boolean enabled;
    private final Function2<Composer, Integer, Unit> icon;
    private final String label;
    private final Function1<Boolean, Unit> onCheckedChange;
    private final float weight;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ButtonGroupContent$lambda$2(ToggleableButtonGroupItem toggleableButtonGroupItem, int i, Composer composer, int i2) {
        toggleableButtonGroupItem.ButtonGroupContent(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MenuContent$lambda$2(ToggleableButtonGroupItem toggleableButtonGroupItem, ButtonGroupMenuState buttonGroupMenuState, int i, Composer composer, int i2) {
        toggleableButtonGroupItem.MenuContent(buttonGroupMenuState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ToggleableButtonGroupItem(boolean z, Function1<? super Boolean, Unit> function1, float f, AnimationSpec<Float> animationSpec, Function2<? super Composer, ? super Integer, Unit> function2, boolean z2, String str) {
        this.checked = z;
        this.onCheckedChange = function1;
        this.weight = f;
        this.animationSpec = animationSpec;
        this.icon = function2;
        this.enabled = z2;
        this.label = str;
    }

    @Override // androidx.compose.material3.ButtonGroupItem
    public void ButtonGroupContent(Composer composer, final int i) {
        int i2;
        Modifier.Companion companion;
        Composer startRestartGroup = composer.startRestartGroup(803301594);
        ComposerKt.sourceInformation(startRestartGroup, "C(ButtonGroupContent)1228@53560L39,1250@54326L167,1244@54109L384:ButtonGroup.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(803301594, i2, -1, "androidx.compose.material3.ToggleableButtonGroupItem.ButtonGroupContent (ButtonGroup.kt:1227)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1121279519, "CC(remember):ButtonGroup.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier then = Modifier.INSTANCE.then(new EnlargeOnPressElement(mutableInteractionSource, this.animationSpec));
            if (!Float.isNaN(this.weight)) {
                companion = new ButtonGroupElement(RangesKt.coerceAtMost(this.weight, Float.MAX_VALUE));
            } else {
                companion = Modifier.INSTANCE;
            }
            ToggleButtonKt.ToggleButton(this.checked, this.onCheckedChange, then.then(companion), this.enabled, null, null, null, null, null, mutableInteractionSource, ComposableLambdaKt.rememberComposableLambda(1213163004, true, new Function3() { // from class: androidx.compose.material3.ToggleableButtonGroupItem$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit ButtonGroupContent$lambda$1;
                    ButtonGroupContent$lambda$1 = ToggleableButtonGroupItem.ButtonGroupContent$lambda$1(ToggleableButtonGroupItem.this, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return ButtonGroupContent$lambda$1;
                }
            }, startRestartGroup, 54), startRestartGroup, 805306368, 6, 496);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ToggleableButtonGroupItem$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ButtonGroupContent$lambda$2;
                    ButtonGroupContent$lambda$2 = ToggleableButtonGroupItem.ButtonGroupContent$lambda$2(ToggleableButtonGroupItem.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return ButtonGroupContent$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ButtonGroupContent$lambda$1(ToggleableButtonGroupItem toggleableButtonGroupItem, RowScope rowScope, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1255@54472L11:ButtonGroup.kt#uh7d8r");
        if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1213163004, i, -1, "androidx.compose.material3.ToggleableButtonGroupItem.ButtonGroupContent.<anonymous> (ButtonGroup.kt:1251)");
            }
            Function2<Composer, Integer, Unit> function2 = toggleableButtonGroupItem.icon;
            if (function2 != null) {
                composer.startReplaceGroup(-810720331);
                ComposerKt.sourceInformation(composer, "*1252@54371L8,1253@54396L49");
                function2.invoke(composer, 0);
                SpacerKt.Spacer(SizeKt.m1271size3ABfNKs(Modifier.INSTANCE, ButtonDefaults.INSTANCE.m2604getIconSpacingD9Ej5fM()), composer, 6);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-810720332);
                composer.endReplaceGroup();
            }
            TextKt.m4292TextNvy7gAk(toggleableButtonGroupItem.label, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.material3.ButtonGroupItem
    public void MenuContent(final ButtonGroupMenuState buttonGroupMenuState, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1089012595);
        ComposerKt.sourceInformation(startRestartGroup, "C(MenuContent)N(state)1264@54685L15,1265@54724L89,1261@54585L239:ButtonGroup.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(buttonGroupMenuState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1089012595, i2, -1, "androidx.compose.material3.ToggleableButtonGroupItem.MenuContent (ButtonGroup.kt:1260)");
            }
            boolean z = this.enabled;
            Function2<Composer, Integer, Unit> function2 = this.icon;
            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(572205757, true, new Function2() { // from class: androidx.compose.material3.ToggleableButtonGroupItem$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MenuContent$lambda$0;
                    MenuContent$lambda$0 = ToggleableButtonGroupItem.MenuContent$lambda$0(ToggleableButtonGroupItem.this, (Composer) obj, ((Integer) obj2).intValue());
                    return MenuContent$lambda$0;
                }
            }, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1430922726, "CC(remember):ButtonGroup.kt#9igjgp");
            boolean changedInstance = startRestartGroup.changedInstance(this) | startRestartGroup.changedInstance(buttonGroupMenuState);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: androidx.compose.material3.ToggleableButtonGroupItem$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit MenuContent$lambda$1$0;
                        MenuContent$lambda$1$0 = ToggleableButtonGroupItem.MenuContent$lambda$1$0(ToggleableButtonGroupItem.this, buttonGroupMenuState);
                        return MenuContent$lambda$1$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            AndroidMenu_androidKt.DropdownMenuItem(rememberComposableLambda, (Function0) rememberedValue, null, function2, null, z, null, null, null, startRestartGroup, 6, 468);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ToggleableButtonGroupItem$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MenuContent$lambda$2;
                    MenuContent$lambda$2 = ToggleableButtonGroupItem.MenuContent$lambda$2(ToggleableButtonGroupItem.this, buttonGroupMenuState, i, (Composer) obj, ((Integer) obj2).intValue());
                    return MenuContent$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MenuContent$lambda$0(ToggleableButtonGroupItem toggleableButtonGroupItem, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1264@54687L11:ButtonGroup.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(572205757, i, -1, "androidx.compose.material3.ToggleableButtonGroupItem.MenuContent.<anonymous> (ButtonGroup.kt:1264)");
            }
            TextKt.m4292TextNvy7gAk(toggleableButtonGroupItem.label, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MenuContent$lambda$1$0(ToggleableButtonGroupItem toggleableButtonGroupItem, ButtonGroupMenuState buttonGroupMenuState) {
        toggleableButtonGroupItem.onCheckedChange.invoke(Boolean.valueOf(!toggleableButtonGroupItem.checked));
        buttonGroupMenuState.dismiss();
        return Unit.INSTANCE;
    }
}
