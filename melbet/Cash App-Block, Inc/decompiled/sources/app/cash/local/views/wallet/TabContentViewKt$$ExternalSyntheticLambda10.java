package app.cash.local.views.wallet;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.charting.components.BarChartKt;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class TabContentViewKt$$ExternalSyntheticLambda10 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ List f$1;
    public final /* synthetic */ float f$2;
    public final /* synthetic */ long f$3;
    public final /* synthetic */ Function f$4;
    public final /* synthetic */ int f$5;
    public final /* synthetic */ int f$6;

    public /* synthetic */ TabContentViewKt$$ExternalSyntheticLambda10(Modifier modifier, float f, List list, long j, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.f$0 = modifier;
        this.f$2 = f;
        this.f$1 = list;
        this.f$3 = j;
        this.f$4 = composableLambdaImpl;
        this.f$5 = i;
        this.f$6 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function function = this.f$4;
        int i2 = this.f$5;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                LocalHomeViewKt.m1337WalletWidgetList_UE9MAk((Modifier) obj3, this.f$1, this.f$2, this.f$3, (Function1) function, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$6);
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                BarChartKt.m3447ChartWithYAxisLyZNIlQ((Modifier) obj3, this.f$2, this.f$1, this.f$3, (ComposableLambdaImpl) function, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$6);
                return Unit.INSTANCE;
            default:
                SubcomposeMeasureScope subcomposeMeasureScope = (SubcomposeMeasureScope) obj3;
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) function;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, this.f$3, ColorKt.RectangleShape), RecyclerView.DECELERATION_RATE, subcomposeMeasureScope.mo233toDpu2uoSUM(i2), RecyclerView.DECELERATION_RATE, subcomposeMeasureScope.mo233toDpu2uoSUM(this.f$6), 5);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 0);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    composableLambdaImpl.invoke((Object) RowScopeInstance.INSTANCE, (Object) gapComposer, (Object) 6);
                    BarChartKt.m3450YAxisziNgDLE(this.f$1, this.f$2, gapComposer, 0);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ TabContentViewKt$$ExternalSyntheticLambda10(Modifier modifier, List list, float f, long j, Function1 function1, int i, int i2) {
        this.f$0 = modifier;
        this.f$1 = list;
        this.f$2 = f;
        this.f$3 = j;
        this.f$4 = function1;
        this.f$5 = i;
        this.f$6 = i2;
    }

    public /* synthetic */ TabContentViewKt$$ExternalSyntheticLambda10(SubcomposeMeasureScope subcomposeMeasureScope, long j, int i, int i2, ComposableLambdaImpl composableLambdaImpl, List list, float f) {
        this.f$0 = subcomposeMeasureScope;
        this.f$3 = j;
        this.f$5 = i;
        this.f$6 = i2;
        this.f$4 = composableLambdaImpl;
        this.f$1 = list;
        this.f$2 = f;
    }
}
