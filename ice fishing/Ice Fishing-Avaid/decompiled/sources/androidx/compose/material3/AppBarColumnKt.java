package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: AppBarColumn.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u001aU\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0019\b\u0002\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\fH\u0007¢\u0006\u0002\u0010\r\u001aS\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00072\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\fH\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002"}, d2 = {"AppBarColumn", "", "modifier", "Landroidx/compose/ui/Modifier;", "overflowIndicator", "Lkotlin/Function1;", "Landroidx/compose/material3/AppBarMenuState;", "Landroidx/compose/runtime/Composable;", "maxItemCount", "", "content", "Landroidx/compose/material3/AppBarColumnScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "material3", "scope", "Landroidx/compose/material3/AppBarColumnScopeImpl;"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class AppBarColumnKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppBarColumn$lambda$6(Modifier modifier, Function3 function3, int i, Function1 function1, int i2, int i3, Composer composer, int i4) {
        AppBarColumn(modifier, (Function3<? super AppBarMenuState, ? super Composer, ? super Integer, Unit>) function3, i, (Function1<? super AppBarColumnScope, Unit>) function1, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppBarColumn$lambda$7(Function3 function3, Modifier modifier, int i, Function1 function1, int i2, int i3, Composer composer, int i4) {
        AppBarColumn(function3, modifier, i, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AppBarColumn(Modifier modifier, Function3<? super AppBarMenuState, ? super Composer, ? super Integer, Unit> function3, int i, final Function1<? super AppBarColumnScope, Unit> function1, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        final Function3<? super AppBarMenuState, ? super Composer, ? super Integer, Unit> function32;
        int i5;
        int i6;
        Modifier.Companion companion;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1875457254);
        ComposerKt.sourceInformation(startRestartGroup, "C(AppBarColumn)N(modifier,overflowIndicator,maxItemCount,content)57@2764L29,58@2811L111,61@2943L30,62@2998L29,64@3060L131,71@3260L50,72@3328L679,68@3197L900:AppBarColumn.kt#uh7d8r");
        int i7 = i3 & 1;
        if (i7 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            function32 = function3;
            i4 |= startRestartGroup.changedInstance(function32) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                i6 = i;
                i4 |= startRestartGroup.changed(i6) ? 256 : 128;
                if ((i2 & 3072) == 0) {
                    i4 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
                }
                if (!startRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                } else {
                    companion = i7 != 0 ? Modifier.INSTANCE : modifier2;
                    if (i8 != 0) {
                        function32 = ComposableSingletons$AppBarColumnKt.INSTANCE.getLambda$479541071$material3();
                    }
                    if (i5 != 0) {
                        i6 = Integer.MAX_VALUE;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1875457254, i4, -1, "androidx.compose.material3.AppBarColumn (AppBarColumn.kt:56)");
                    }
                    final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, startRestartGroup, (i4 >> 9) & 14);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1571832299, "CC(remember):AppBarColumn.kt#9igjgp");
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: androidx.compose.material3.AppBarColumnKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                AppBarColumnScopeImpl AppBarColumn$lambda$0$0;
                                AppBarColumn$lambda$0$0 = AppBarColumnKt.AppBarColumn$lambda$0$0(State.this);
                                return AppBarColumn$lambda$0$0;
                            }
                        });
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    final State state = (State) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1571828156, "CC(remember):AppBarColumn.kt#9igjgp");
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new AppBarMenuState();
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    final AppBarMenuState appBarMenuState = (AppBarMenuState) rememberedValue2;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final AppBarOverflowState rememberAppBarOverflowState = AppBarDslKt.rememberAppBarOverflowState(startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1571824311, "CC(remember):AppBarColumn.kt#9igjgp");
                    boolean changed = ((i4 & 896) == 256) | startRestartGroup.changed(rememberAppBarOverflowState);
                    Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new OverflowMeasurePolicy(rememberAppBarOverflowState, i6, true);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    List listOf = CollectionsKt.listOf((Object[]) new Function2[]{ComposableLambdaKt.rememberComposableLambda(1370109943, true, new Function2() { // from class: androidx.compose.material3.AppBarColumnKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit AppBarColumn$lambda$4;
                            AppBarColumn$lambda$4 = AppBarColumnKt.AppBarColumn$lambda$4(State.this, (Composer) obj, ((Integer) obj2).intValue());
                            return AppBarColumn$lambda$4;
                        }
                    }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(2072044536, true, new Function2() { // from class: androidx.compose.material3.AppBarColumnKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit AppBarColumn$lambda$5;
                            AppBarColumn$lambda$5 = AppBarColumnKt.AppBarColumn$lambda$5(Function3.this, appBarMenuState, rememberAppBarOverflowState, state, (Composer) obj, ((Integer) obj2).intValue());
                            return AppBarColumn$lambda$5;
                        }
                    }, startRestartGroup, 54)});
                    OverflowMeasurePolicy overflowMeasurePolicy = (OverflowMeasurePolicy) rememberedValue3;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1399185516, "CC(Layout)N(contents,modifier,measurePolicy)172@7174L62,169@7060L183:Layout.kt#80mrfh");
                    Function2<Composer, Integer, Unit> combineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(listOf);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 292526026, "CC(remember):Layout.kt#9igjgp");
                    boolean changed2 = startRestartGroup.changed(overflowMeasurePolicy);
                    Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (changed2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = MultiContentMeasurePolicyKt.createMeasurePolicy(overflowMeasurePolicy);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue4;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                    int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor);
                    } else {
                        startRestartGroup.useNode();
                    }
                    Composer m5864constructorimpl = Updater.m5864constructorimpl(startRestartGroup);
                    Updater.m5872setimpl(m5864constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    combineAsVirtualLayouts.invoke(startRestartGroup, 0);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                final int i9 = i6;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final Modifier modifier3 = companion;
                    final Function3<? super AppBarMenuState, ? super Composer, ? super Integer, Unit> function33 = function32;
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.AppBarColumnKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit AppBarColumn$lambda$6;
                            AppBarColumn$lambda$6 = AppBarColumnKt.AppBarColumn$lambda$6(Modifier.this, function33, i9, function1, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            return AppBarColumn$lambda$6;
                        }
                    });
                    return;
                }
                return;
            }
            i6 = i;
            if ((i2 & 3072) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
            }
            final int i92 = i6;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function32 = function3;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        i6 = i;
        if ((i2 & 3072) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
        }
        final int i922 = i6;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppBarColumnScopeImpl AppBarColumn$lambda$0$0(State state) {
        AppBarColumnScopeImpl appBarColumnScopeImpl = new AppBarColumnScopeImpl(new AppBarScopeImpl());
        ((Function1) state.getValue()).invoke(appBarColumnScopeImpl);
        return appBarColumnScopeImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppBarColumn$lambda$4(State state, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C*71@3291L15:AppBarColumn.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1370109943, i, -1, "androidx.compose.material3.AppBarColumn.<anonymous> (AppBarColumn.kt:71)");
            }
            List<AppBarItem> items = AppBarColumn$lambda$1(state).getItems();
            int size = items.size();
            for (int i2 = 0; i2 < size; i2++) {
                items.get(i2).AppbarContent(composer, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppBarColumn$lambda$5(Function3 function3, final AppBarMenuState appBarMenuState, final AppBarOverflowState appBarOverflowState, final State state, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C73@3350L639:AppBarColumn.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2072044536, i, -1, "androidx.compose.material3.AppBarColumn.<anonymous> (AppBarColumn.kt:73)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
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
            ComposerKt.sourceInformationMarkerStart(composer, 1623888026, "C74@3380L28,77@3554L23,78@3605L362,75@3433L534:AppBarColumn.kt#uh7d8r");
            function3.invoke(appBarMenuState, composer, 0);
            boolean isExpanded = appBarMenuState.isExpanded();
            ComposerKt.sourceInformationMarkerStart(composer, 468030485, "CC(remember):AppBarColumn.kt#9igjgp");
            boolean changedInstance = composer.changedInstance(appBarMenuState);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: androidx.compose.material3.AppBarColumnKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit AppBarColumn$lambda$5$0$0$0;
                        AppBarColumn$lambda$5$0$0$0 = AppBarColumnKt.AppBarColumn$lambda$5$0$0$0(AppBarMenuState.this);
                        return AppBarColumn$lambda$5$0$0$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            AndroidMenu_androidKt.m2485DropdownMenuIlH_yew(isExpanded, (Function0) rememberedValue, null, 0L, null, null, null, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1094324771, true, new Function3() { // from class: androidx.compose.material3.AppBarColumnKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit AppBarColumn$lambda$5$0$1;
                    AppBarColumn$lambda$5$0$1 = AppBarColumnKt.AppBarColumn$lambda$5$0$1(AppBarOverflowState.this, state, appBarMenuState, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return AppBarColumn$lambda$5$0$1;
                }
            }, composer, 54), composer, 0, 48, 2044);
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
    public static final Unit AppBarColumn$lambda$5$0$0$0(AppBarMenuState appBarMenuState) {
        appBarMenuState.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppBarColumn$lambda$5$0$1(AppBarOverflowState appBarOverflowState, State state, AppBarMenuState appBarMenuState, ColumnScope columnScope, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C*84@3917L22:AppBarColumn.kt#uh7d8r");
        if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1094324771, i, -1, "androidx.compose.material3.AppBarColumn.<anonymous>.<anonymous>.<anonymous> (AppBarColumn.kt:79)");
            }
            List<AppBarItem> subList = AppBarColumn$lambda$1(state).getItems().subList(appBarOverflowState.getVisibleItemCount(), appBarOverflowState.getTotalItemCount());
            int size = subList.size();
            for (int i2 = 0; i2 < size; i2++) {
                subList.get(i2).MenuContent(appBarMenuState, composer, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility.")
    public static final /* synthetic */ void AppBarColumn(Function3 function3, Modifier modifier, int i, Function1 function1, Composer composer, final int i2, final int i3) {
        int i4;
        Function3 function32;
        final Function1 function12;
        final int i5;
        final Modifier modifier2;
        Composer startRestartGroup = composer.startRestartGroup(1484836710);
        ComposerKt.sourceInformation(startRestartGroup, "C(AppBarColumn)N(overflowIndicator,modifier,maxItemCount,content)102@4487L64:AppBarColumn.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(function3) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
            function32 = function3;
            function12 = function1;
            startRestartGroup.skipToGroupEnd();
            i5 = i;
            modifier2 = modifier;
        } else {
            if (i6 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (i7 != 0) {
                i = Integer.MAX_VALUE;
            }
            int i8 = i;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1484836710, i4, -1, "androidx.compose.material3.AppBarColumn (AppBarColumn.kt:102)");
            }
            function32 = function3;
            AppBarColumn(modifier3, (Function3<? super AppBarMenuState, ? super Composer, ? super Integer, Unit>) function32, i8, (Function1<? super AppBarColumnScope, Unit>) function1, startRestartGroup, ((i4 >> 3) & 14) | ((i4 << 3) & 112) | (i4 & 896) | (i4 & 7168), 0);
            function12 = function1;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            i5 = i8;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Function3 function33 = function32;
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.AppBarColumnKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AppBarColumn$lambda$7;
                    AppBarColumn$lambda$7 = AppBarColumnKt.AppBarColumn$lambda$7(Function3.this, modifier2, i5, function12, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    return AppBarColumn$lambda$7;
                }
            });
        }
    }

    private static final AppBarColumnScopeImpl AppBarColumn$lambda$1(State<AppBarColumnScopeImpl> state) {
        return state.getValue();
    }
}
