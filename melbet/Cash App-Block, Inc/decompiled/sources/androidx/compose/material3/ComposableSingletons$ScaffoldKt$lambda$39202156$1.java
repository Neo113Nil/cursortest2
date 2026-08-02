package androidx.compose.material3;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.tooling.ComposableInvoker;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.material3.ComposableSingletons$ScaffoldKt$lambda$-39202156$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$ScaffoldKt$lambda$39202156$1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public static final ComposableSingletons$ScaffoldKt$lambda$39202156$1 INSTANCE$1 = new ComposableSingletons$ScaffoldKt$lambda$39202156$1(1);
    public static final ComposableSingletons$ScaffoldKt$lambda$39202156$1 INSTANCE = new ComposableSingletons$ScaffoldKt$lambda$39202156$1(0);
    public static final ComposableSingletons$ScaffoldKt$lambda$39202156$1 INSTANCE$2 = new ComposableSingletons$ScaffoldKt$lambda$39202156$1(2);
    public static final ComposableSingletons$ScaffoldKt$lambda$39202156$1 INSTANCE$3 = new ComposableSingletons$ScaffoldKt$lambda$39202156$1(3);

    public /* synthetic */ ComposableSingletons$ScaffoldKt$lambda$39202156$1(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Number) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (!gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Number) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (!gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Number) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (!gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Number) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (!gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Number) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.m289sizeInqDBjuR0$default(Modifier.Companion.$$INSTANCE, FloatingActionButtonKt.ExtendedFabMinimumWidth, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), FloatingActionButtonKt.ExtendedFabTextPadding, RecyclerView.DECELERATION_RATE, 2);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterVertically, gapComposer5, 54);
                    int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer5);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer5, m300paddingVpY3zN4$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer5.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer5.useNode();
                    }
                    Updater.m576setimpl(gapComposer5, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    if (gapComposer5.inserting || !Intrinsics.areEqual(gapComposer5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash, gapComposer5, currentCompositeKeyHash, composeUiNode$Companion$SetModifier$1);
                    }
                    Updater.m576setimpl(gapComposer5, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    ComposableInvoker.lambda$558638247.invoke((Object) RowScopeInstance.INSTANCE, (Object) gapComposer5, (Object) 6);
                    gapComposer5.end(true);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
