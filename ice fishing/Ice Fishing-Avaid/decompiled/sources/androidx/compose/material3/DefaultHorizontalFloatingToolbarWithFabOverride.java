package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: FloatingToolbar.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0017¢\u0006\u0002\u0010\u0007¨\u0006\b²\u0006\n\u0010\t\u001a\u00020\nX\u008a\u0084\u0002²\u0006\n\u0010\u000b\u001a\u00020\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/material3/DefaultHorizontalFloatingToolbarWithFabOverride;", "Landroidx/compose/material3/HorizontalFloatingToolbarWithFabOverride;", "<init>", "()V", "HorizontalFloatingToolbarWithFab", "", "Landroidx/compose/material3/HorizontalFloatingToolbarWithFabOverrideScope;", "(Landroidx/compose/material3/HorizontalFloatingToolbarWithFabOverrideScope;Landroidx/compose/runtime/Composer;I)V", "material3", "touchExplorationServiceEnabled", "", "forceCollapse"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class DefaultHorizontalFloatingToolbarWithFabOverride implements HorizontalFloatingToolbarWithFabOverride {
    public static final int $stable = 0;
    public static final DefaultHorizontalFloatingToolbarWithFabOverride INSTANCE = new DefaultHorizontalFloatingToolbarWithFabOverride();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HorizontalFloatingToolbarWithFab$lambda$5(DefaultHorizontalFloatingToolbarWithFabOverride defaultHorizontalFloatingToolbarWithFabOverride, HorizontalFloatingToolbarWithFabOverrideScope horizontalFloatingToolbarWithFabOverrideScope, int i, Composer composer, int i2) {
        defaultHorizontalFloatingToolbarWithFabOverride.HorizontalFloatingToolbarWithFab(horizontalFloatingToolbarWithFabOverrideScope, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private DefaultHorizontalFloatingToolbarWithFabOverride() {
    }

    @Override // androidx.compose.material3.HorizontalFloatingToolbarWithFabOverride
    public void HorizontalFloatingToolbarWithFab(final HorizontalFloatingToolbarWithFabOverrideScope horizontalFloatingToolbarWithFabOverrideScope, Composer composer, final int i) {
        int i2;
        Composer composer2;
        State rememberTouchExplorationService;
        Composer startRestartGroup = composer.startRestartGroup(-1911077011);
        ComposerKt.sourceInformation(startRestartGroup, "C(HorizontalFloatingToolbarWithFab)345@18862L33,346@18942L25,346@18925L42,350@19172L34,347@18976L817:FloatingToolbar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(horizontalFloatingToolbarWithFabOverrideScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        boolean z = true;
        if (startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1911077011, i2, -1, "androidx.compose.material3.DefaultHorizontalFloatingToolbarWithFabOverride.HorizontalFloatingToolbarWithFab (FloatingToolbar.kt:344)");
            }
            rememberTouchExplorationService = FloatingToolbarKt.rememberTouchExplorationService(startRestartGroup, 0);
            Object[] objArr = new Object[0];
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1701001958, "CC(remember):FloatingToolbar.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: androidx.compose.material3.DefaultHorizontalFloatingToolbarWithFabOverride$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState HorizontalFloatingToolbarWithFab$lambda$1$0;
                        HorizontalFloatingToolbarWithFab$lambda$1$0 = DefaultHorizontalFloatingToolbarWithFabOverride.HorizontalFloatingToolbarWithFab$lambda$1$0();
                        return HorizontalFloatingToolbarWithFab$lambda$1$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final MutableState mutableState = (MutableState) RememberSaveableKt.rememberSaveable(objArr, (Function0) rememberedValue, startRestartGroup, 48);
            Modifier modifier = horizontalFloatingToolbarWithFabOverrideScope.getModifier();
            if (HorizontalFloatingToolbarWithFab$lambda$2(mutableState) || (!HorizontalFloatingToolbarWithFab$lambda$0(rememberTouchExplorationService) && !horizontalFloatingToolbarWithFabOverrideScope.getIsExpanded())) {
                z = false;
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1701009327, "CC(remember):FloatingToolbar.kt#9igjgp");
            boolean changed = startRestartGroup.changed(mutableState);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: androidx.compose.material3.DefaultHorizontalFloatingToolbarWithFabOverride$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit HorizontalFloatingToolbarWithFab$lambda$4$0;
                        HorizontalFloatingToolbarWithFab$lambda$4$0 = DefaultHorizontalFloatingToolbarWithFabOverride.HorizontalFloatingToolbarWithFab$lambda$4$0(MutableState.this, ((Boolean) obj).booleanValue());
                        return HorizontalFloatingToolbarWithFab$lambda$4$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            Function1 function1 = (Function1) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            composer2 = startRestartGroup;
            FloatingToolbarKt.m3253HorizontalFloatingToolbarWithFabLayoutz3vpotQ(modifier, z, function1, horizontalFloatingToolbarWithFabOverrideScope.getColors(), FloatingToolbarDefaults.INSTANCE.m3206getToolbarToFabGapD9Ej5fM$material3(), horizontalFloatingToolbarWithFabOverrideScope.getContentPadding(), !HorizontalFloatingToolbarWithFab$lambda$0(rememberTouchExplorationService) ? horizontalFloatingToolbarWithFabOverrideScope.getScrollBehavior() : null, horizontalFloatingToolbarWithFabOverrideScope.getShape(), horizontalFloatingToolbarWithFabOverrideScope.getAnimationSpec(), horizontalFloatingToolbarWithFabOverrideScope.getFloatingActionButton(), horizontalFloatingToolbarWithFabOverrideScope.getFloatingActionButtonPosition(), horizontalFloatingToolbarWithFabOverrideScope.getExpandedShadowElevation(), horizontalFloatingToolbarWithFabOverrideScope.getCollapsedShadowElevation(), horizontalFloatingToolbarWithFabOverrideScope.getContent(), composer2, 24576, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.DefaultHorizontalFloatingToolbarWithFabOverride$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HorizontalFloatingToolbarWithFab$lambda$5;
                    HorizontalFloatingToolbarWithFab$lambda$5 = DefaultHorizontalFloatingToolbarWithFabOverride.HorizontalFloatingToolbarWithFab$lambda$5(DefaultHorizontalFloatingToolbarWithFabOverride.this, horizontalFloatingToolbarWithFabOverrideScope, i, (Composer) obj, ((Integer) obj2).intValue());
                    return HorizontalFloatingToolbarWithFab$lambda$5;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState HorizontalFloatingToolbarWithFab$lambda$1$0() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    private static final boolean HorizontalFloatingToolbarWithFab$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void HorizontalFloatingToolbarWithFab$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HorizontalFloatingToolbarWithFab$lambda$4$0(MutableState mutableState, boolean z) {
        HorizontalFloatingToolbarWithFab$lambda$3(mutableState, z);
        return Unit.INSTANCE;
    }

    private static final boolean HorizontalFloatingToolbarWithFab$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
