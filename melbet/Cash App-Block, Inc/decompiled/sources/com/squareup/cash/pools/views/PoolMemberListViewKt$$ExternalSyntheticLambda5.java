package com.squareup.cash.pools.views;

import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import coil3.size.SizeKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pools.viewmodels.PoolMemberListViewModel;
import com.squareup.protos.cash.ui.Image;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class PoolMemberListViewKt$$ExternalSyntheticLambda5 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PoolMemberListViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ PoolMemberListViewKt$$ExternalSyntheticLambda5(int i, PoolMemberListViewModel poolMemberListViewModel, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = poolMemberListViewModel;
        this.f$1 = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String m;
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Function1 function1 = this.f$1;
        final PoolMemberListViewModel poolMemberListViewModel = this.f$0;
        Object[] objArr = 0;
        final int i2 = 1;
        switch (i) {
            case 0:
                AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                adaptiveStackScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(adaptiveStackScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    Modifier horizontalWeight = adaptiveStackScope.horizontalWeight(companion, 1.0f);
                    boolean z = !poolMemberListViewModel.hasReachedMemberLimit;
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new PoolsListViewKt$$ExternalSyntheticLambda3(15, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue, horizontalWeight, buttonProminence, false, z, null, PoolToastKt.lambda$155371320, gapComposer, 1573248, 40);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                lazyItemScopeImpl.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(lazyItemScopeImpl) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    Image image = poolMemberListViewModel.poolOwner.photoImage;
                    Function0 function0 = null;
                    if (image == null) {
                        gapComposer2.startReplaceGroup(495809557);
                        gapComposer2.end(false);
                        m = null;
                    } else {
                        m = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer2, -676742804, image, gapComposer2, false);
                    }
                    Modifier animateItem$default = LazyItemScopeImpl.animateItem$default(lazyItemScopeImpl, companion);
                    if (poolMemberListViewModel.isOwnerRowTapEnabled) {
                        gapComposer2.startReplaceGroup(496014313);
                        boolean changed2 = gapComposer2.changed(function1);
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        if (changed2 || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new PoolsListViewKt$$ExternalSyntheticLambda3(16, function1);
                            gapComposer2.updateRememberedValue(rememberedValue2);
                        }
                        function0 = (Function0) rememberedValue2;
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(496077181);
                        gapComposer2.end(false);
                    }
                    Function0 function02 = function0;
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1841219169, new PdfPreviewViewKt$$ExternalSyntheticLambda0(25, poolMemberListViewModel, m), gapComposer2);
                    final Object[] objArr2 = objArr == true ? 1 : 0;
                    CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(rememberComposableLambda, Expect_jvmKt.rememberComposableLambda(-871396062, new Function2() { // from class: com.squareup.cash.pools.views.PoolMemberListViewKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            int i3 = objArr2;
                            PoolMemberListViewModel poolMemberListViewModel2 = poolMemberListViewModel;
                            switch (i3) {
                                case 0:
                                    Composer composer3 = (Composer) obj4;
                                    int intValue3 = ((Integer) obj5).intValue();
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                        RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer3, 48);
                                        int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, Modifier.Companion.$$INSTANCE);
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
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer3, (Modifier) Request$Priority$EnumUnboxingLocalUtility.m(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier, 1.0f, false), (TextStyle) null, (TextLineBalancing) null, poolMemberListViewModel2.poolOwner.title, (Map) null, (Function1) null, false);
                                        gapComposer3.end(true);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    Composer composer4 = (Composer) obj4;
                                    int intValue4 = ((Integer) obj5).intValue();
                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                    if (gapComposer4.shouldExecute(1 & intValue4, (intValue4 & 3) != 2)) {
                                        String str = poolMemberListViewModel2.poolOwner.subtitle;
                                        gapComposer4.startReplaceGroup(1643150033);
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                        gapComposer4.end(false);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, gapComposer2), animateItem$default, function02, null, true, true, Expect_jvmKt.rememberComposableLambda(32781736, new Function2() { // from class: com.squareup.cash.pools.views.PoolMemberListViewKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            int i3 = i2;
                            PoolMemberListViewModel poolMemberListViewModel2 = poolMemberListViewModel;
                            switch (i3) {
                                case 0:
                                    Composer composer3 = (Composer) obj4;
                                    int intValue3 = ((Integer) obj5).intValue();
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                        RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer3, 48);
                                        int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, Modifier.Companion.$$INSTANCE);
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
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer3, (Modifier) Request$Priority$EnumUnboxingLocalUtility.m(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier, 1.0f, false), (TextStyle) null, (TextLineBalancing) null, poolMemberListViewModel2.poolOwner.title, (Map) null, (Function1) null, false);
                                        gapComposer3.end(true);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    Composer composer4 = (Composer) obj4;
                                    int intValue4 = ((Integer) obj5).intValue();
                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                    if (gapComposer4.shouldExecute(1 & intValue4, (intValue4 & 3) != 2)) {
                                        String str = poolMemberListViewModel2.poolOwner.subtitle;
                                        gapComposer4.startReplaceGroup(1643150033);
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                        gapComposer4.end(false);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, gapComposer2), null, null, 0L, null, gapComposer2, 14352438, 0, 3856);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
