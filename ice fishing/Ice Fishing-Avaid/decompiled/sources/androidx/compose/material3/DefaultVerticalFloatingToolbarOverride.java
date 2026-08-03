package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: FloatingToolbar.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0017¢\u0006\u0002\u0010\u0007¨\u0006\b²\u0006\n\u0010\t\u001a\u00020\nX\u008a\u0084\u0002²\u0006\n\u0010\u000b\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010\f\u001a\u00020\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material3/DefaultVerticalFloatingToolbarOverride;", "Landroidx/compose/material3/VerticalFloatingToolbarOverride;", "<init>", "()V", "VerticalFloatingToolbar", "", "Landroidx/compose/material3/VerticalFloatingToolbarOverrideScope;", "(Landroidx/compose/material3/VerticalFloatingToolbarOverrideScope;Landroidx/compose/runtime/Composer;I)V", "material3", "touchExplorationServiceEnabled", "", "forceCollapse", "shouldFocus"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class DefaultVerticalFloatingToolbarOverride implements VerticalFloatingToolbarOverride {
    public static final int $stable = 0;
    public static final DefaultVerticalFloatingToolbarOverride INSTANCE = new DefaultVerticalFloatingToolbarOverride();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerticalFloatingToolbar$lambda$8(DefaultVerticalFloatingToolbarOverride defaultVerticalFloatingToolbarOverride, VerticalFloatingToolbarOverrideScope verticalFloatingToolbarOverrideScope, int i, Composer composer, int i2) {
        defaultVerticalFloatingToolbarOverride.VerticalFloatingToolbar(verticalFloatingToolbarOverrideScope, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private DefaultVerticalFloatingToolbarOverride() {
    }

    @Override // androidx.compose.material3.VerticalFloatingToolbarOverride
    public void VerticalFloatingToolbar(final VerticalFloatingToolbarOverrideScope verticalFloatingToolbarOverrideScope, Composer composer, final int i) {
        int i2;
        State rememberTouchExplorationService;
        Modifier.Companion focusProperties;
        Composer startRestartGroup = composer.startRestartGroup(1025494014);
        ComposerKt.sourceInformation(startRestartGroup, "C(VerticalFloatingToolbar)441@24076L33,442@24156L25,442@24139L42,443@24209L95,453@24723L34,446@24313L899:FloatingToolbar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(verticalFloatingToolbarOverrideScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        boolean z = true;
        if (startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1025494014, i2, -1, "androidx.compose.material3.DefaultVerticalFloatingToolbarOverride.VerticalFloatingToolbar (FloatingToolbar.kt:440)");
            }
            rememberTouchExplorationService = FloatingToolbarKt.rememberTouchExplorationService(startRestartGroup, 0);
            Object[] objArr = new Object[0];
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1952242935, "CC(remember):FloatingToolbar.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: androidx.compose.material3.DefaultVerticalFloatingToolbarOverride$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState VerticalFloatingToolbar$lambda$1$0;
                        VerticalFloatingToolbar$lambda$1$0 = DefaultVerticalFloatingToolbarOverride.VerticalFloatingToolbar$lambda$1$0();
                        return VerticalFloatingToolbar$lambda$1$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final MutableState mutableState = (MutableState) RememberSaveableKt.rememberSaveable(objArr, (Function0) rememberedValue, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1952244701, "CC(remember):FloatingToolbar.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: androidx.compose.material3.DefaultVerticalFloatingToolbarOverride$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        boolean VerticalFloatingToolbar$lambda$4$0;
                        VerticalFloatingToolbar$lambda$4$0 = DefaultVerticalFloatingToolbarOverride.VerticalFloatingToolbar$lambda$4$0(VerticalFloatingToolbarOverrideScope.this);
                        return Boolean.valueOf(VerticalFloatingToolbar$lambda$4$0);
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier modifier = verticalFloatingToolbarOverrideScope.getModifier();
            if (VerticalFloatingToolbar$lambda$5((State) rememberedValue2)) {
                startRestartGroup.startReplaceGroup(1952254598);
                startRestartGroup.endReplaceGroup();
                focusProperties = Modifier.INSTANCE;
            } else {
                startRestartGroup.startReplaceGroup(1952255362);
                ComposerKt.sourceInformation(startRestartGroup, "450@24560L20");
                Modifier.Companion companion = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1952255858, "CC(remember):FloatingToolbar.kt#9igjgp");
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new Function1() { // from class: androidx.compose.material3.DefaultVerticalFloatingToolbarOverride$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit VerticalFloatingToolbar$lambda$6$0;
                            VerticalFloatingToolbar$lambda$6$0 = DefaultVerticalFloatingToolbarOverride.VerticalFloatingToolbar$lambda$6$0((FocusProperties) obj);
                            return VerticalFloatingToolbar$lambda$6$0;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                focusProperties = FocusPropertiesKt.focusProperties(companion, (Function1) rememberedValue3);
                startRestartGroup.endReplaceGroup();
            }
            Modifier then = modifier.then(focusProperties);
            if (VerticalFloatingToolbar$lambda$2(mutableState) || (!VerticalFloatingToolbar$lambda$0(rememberTouchExplorationService) && !verticalFloatingToolbarOverrideScope.getIsExpanded())) {
                z = false;
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1952261088, "CC(remember):FloatingToolbar.kt#9igjgp");
            boolean changed = startRestartGroup.changed(mutableState);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new Function1() { // from class: androidx.compose.material3.DefaultVerticalFloatingToolbarOverride$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit VerticalFloatingToolbar$lambda$7$0;
                        VerticalFloatingToolbar$lambda$7$0 = DefaultVerticalFloatingToolbarOverride.VerticalFloatingToolbar$lambda$7$0(MutableState.this, ((Boolean) obj).booleanValue());
                        return VerticalFloatingToolbar$lambda$7$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            Function1 function1 = (Function1) rememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            FloatingToolbarKt.m3256VerticalFloatingToolbarLayoutyndP2WQ(then, z, function1, verticalFloatingToolbarOverrideScope.getColors(), verticalFloatingToolbarOverrideScope.getContentPadding(), !VerticalFloatingToolbar$lambda$0(rememberTouchExplorationService) ? verticalFloatingToolbarOverrideScope.getScrollBehavior() : null, verticalFloatingToolbarOverrideScope.getShape(), verticalFloatingToolbarOverrideScope.getLeadingContent(), verticalFloatingToolbarOverrideScope.getTrailingContent(), verticalFloatingToolbarOverrideScope.getExpandedShadowElevation(), verticalFloatingToolbarOverrideScope.getCollapsedShadowElevation(), verticalFloatingToolbarOverrideScope.getContent(), startRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.DefaultVerticalFloatingToolbarOverride$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit VerticalFloatingToolbar$lambda$8;
                    VerticalFloatingToolbar$lambda$8 = DefaultVerticalFloatingToolbarOverride.VerticalFloatingToolbar$lambda$8(DefaultVerticalFloatingToolbarOverride.this, verticalFloatingToolbarOverrideScope, i, (Composer) obj, ((Integer) obj2).intValue());
                    return VerticalFloatingToolbar$lambda$8;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState VerticalFloatingToolbar$lambda$1$0() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    private static final boolean VerticalFloatingToolbar$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void VerticalFloatingToolbar$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean VerticalFloatingToolbar$lambda$4$0(VerticalFloatingToolbarOverrideScope verticalFloatingToolbarOverrideScope) {
        FloatingToolbarState state;
        FloatingToolbarScrollBehavior scrollBehavior = verticalFloatingToolbarOverrideScope.getScrollBehavior();
        return ((scrollBehavior == null || (state = scrollBehavior.getState()) == null) ? 0.0f : state.getOffset()) == 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerticalFloatingToolbar$lambda$6$0(FocusProperties focusProperties) {
        focusProperties.setCanFocus(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerticalFloatingToolbar$lambda$7$0(MutableState mutableState, boolean z) {
        VerticalFloatingToolbar$lambda$3(mutableState, z);
        return Unit.INSTANCE;
    }

    private static final boolean VerticalFloatingToolbar$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean VerticalFloatingToolbar$lambda$5(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
