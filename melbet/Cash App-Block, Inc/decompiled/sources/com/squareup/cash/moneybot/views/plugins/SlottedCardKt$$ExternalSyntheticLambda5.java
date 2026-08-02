package com.squareup.cash.moneybot.views.plugins;

import androidx.compose.foundation.layout.AndroidWindowInsets;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import coil3.size.DimensionKt;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda0;
import com.squareup.cash.formview.components.FormViewCtaButtons;
import com.squareup.cash.moneybot.viewmodels.plugins.SlotContentViewModel;
import com.squareup.cash.payments.views.MainPaymentViewKt$$ExternalSyntheticLambda27;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class SlottedCardKt$$ExternalSyntheticLambda5 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ SlottedCardKt$$ExternalSyntheticLambda5(boolean z, boolean z2, SlotContentViewModel slotContentViewModel) {
        this.$r8$classId = 0;
        this.f$0 = z;
        this.f$1 = z2;
        this.f$2 = slotContentViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v18 */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        ?? r0;
        int i = this.$r8$classId;
        ComposableLambdaImpl composableLambdaImpl = null;
        boolean z2 = this.f$1;
        boolean z3 = this.f$0;
        Object obj3 = this.f$2;
        int i2 = 1;
        switch (i) {
            case 0:
                SlotContentViewModel slotContentViewModel = (SlotContentViewModel) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (!gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    gapComposer.skipToGroupEnd();
                } else if (!z3 || z2) {
                    gapComposer.startReplaceGroup(-1635518003);
                    SlottedCardKt.SlotContent(slotContentViewModel, SizeKt.m279heightInVpY3zN4$default(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), 252.0f, RecyclerView.DECELERATION_RATE, 2), gapComposer, 48);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1635372892);
                    gapComposer.end(false);
                }
                return Unit.INSTANCE;
            case 1:
                FormViewCtaButtons formViewCtaButtons = (FormViewCtaButtons) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i3 = FormViewCtaButtons.$r8$clinit;
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    String str = (String) formViewCtaButtons.disclaimer.text$delegate.getValue();
                    if (str == null) {
                        gapComposer2.startReplaceGroup(-193643120);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-193643119);
                        composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(727764490, new ArcadeModal2Kt$$ExternalSyntheticLambda0(26, str, formViewCtaButtons), gapComposer2);
                        gapComposer2.end(false);
                    }
                    DimensionKt.ButtonCtaGroup(null, false, null, composableLambdaImpl, Expect_jvmKt.rememberComposableLambda(161999997, new MainPaymentViewKt$$ExternalSyntheticLambda27(i2, formViewCtaButtons, z3, z2), gapComposer2), gapComposer2, 24576, 7);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Function2 function2 = (Function2) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                boolean shouldExecute = gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2);
                Applier applier = gapComposer3.applier;
                if (shouldExecute) {
                    BiasAlignment biasAlignment = Alignment.Companion.BottomCenter;
                    WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                    AndroidWindowInsets androidWindowInsets = Arrangement$End$1.current(gapComposer3).navigationBars;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier windowInsetsPadding = OffsetKt.windowInsetsPadding(companion, androidWindowInsets);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, windowInsetsPadding);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m574initimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    if (function2 == null) {
                        gapComposer3.startReplaceGroup(-258140314);
                        gapComposer3.end(false);
                        r0 = 0;
                        z = z2;
                    } else {
                        gapComposer3.startReplaceGroup(-258140313);
                        Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(companion, 24.0f, 16.0f, 24.0f, 24.0f);
                        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
                        z = z2;
                        int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, m301paddingqDBjuR0);
                        gapComposer3.startReusableNode();
                        if (gapComposer3.inserting) {
                            gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer3.useNode();
                        }
                        Updater.m576setimpl(gapComposer3, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                        SVG$Unit$EnumUnboxingLocalUtility.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                        function2.invoke(gapComposer3, 0);
                        SpacerKt.Spacer(gapComposer3, OffsetKt.windowInsetsBottomHeight(Arrangement$End$1.current(gapComposer3).navigationBars));
                        gapComposer3.end(true);
                        r0 = 0;
                        gapComposer3.end(false);
                    }
                    if (z3) {
                        gapComposer3.startReplaceGroup(-257594744);
                        ListItemKt.LoadingPillContainer(48, r0, gapComposer3, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 24.0f, 7), z);
                    } else {
                        gapComposer3.startReplaceGroup(-266013941);
                    }
                    gapComposer3.end(r0);
                    gapComposer3.end(true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ SlottedCardKt$$ExternalSyntheticLambda5(int i, Object obj, boolean z, boolean z2) {
        this.$r8$classId = i;
        this.f$2 = obj;
        this.f$0 = z;
        this.f$1 = z2;
    }
}
