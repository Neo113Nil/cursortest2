package app.cash.local.views.toolbar;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import app.cash.local.viewmodels.ToolbarModel;
import com.squareup.cash.arcade.components.list.ListUnorderedKt;
import com.squareup.cash.arcade.components.list.ListUnorderedProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedSize;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.blockers.views.SsnViewKt;
import com.squareup.cash.investing.components.custom.order.CustomOrderGraphKt;
import com.squareup.cash.investing.components.custom.order.GraphState;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.collections.immutable.ImmutableList;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalToolbarKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ float f$5;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ int f$7;
    public final /* synthetic */ int f$8;

    public /* synthetic */ LocalToolbarKt$$ExternalSyntheticLambda1(PaddingValues paddingValues, NavigationType navigationType, Function0 function0, float f, Function2 function2, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.$r8$classId = 3;
        this.f$0 = paddingValues;
        this.f$2 = navigationType;
        this.f$4 = function0;
        this.f$5 = f;
        this.f$1 = function2;
        this.f$6 = composableLambdaImpl;
        this.f$7 = i;
        this.f$8 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$7;
        Object obj3 = this.f$0;
        Object obj4 = this.f$6;
        Object obj5 = this.f$4;
        Object obj6 = this.f$2;
        Object obj7 = this.f$1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                LocalToolbarKt.m1333LocalToolbarflo8M7A((Modifier) obj3, (ToolbarModel) obj7, (NavigationType) obj6, (Function0) obj5, this.f$5, (Function3) obj4, (Composer) obj, updateChangedFlags, this.f$8);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                ListUnorderedKt.ListUnordered((Modifier) obj3, (ListUnorderedState) obj7, (ListUnorderedProminence) obj6, (ListUnorderedSize) obj5, this.f$5, (ComposableLambdaImpl) obj4, (Composer) obj, updateChangedFlags2, this.f$8);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(i2 | 1);
                ListUnorderedKt.ListUnordered((ImmutableList) obj7, (Modifier) obj3, (ListUnorderedState) obj6, (ListUnorderedProminence) obj5, (ListUnorderedSize) obj4, this.f$5, (Composer) obj, updateChangedFlags3, this.f$8);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int updateChangedFlags4 = Updater.updateChangedFlags(i2 | 1);
                SsnViewKt.BlockerSheetScaffold((PaddingValues) obj3, (NavigationType) obj6, (Function0) obj5, this.f$5, (Function2) obj7, (ComposableLambdaImpl) obj4, (Composer) obj, updateChangedFlags4, this.f$8);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags5 = Updater.updateChangedFlags(i2 | 1);
                CustomOrderGraphKt.CustomOrderGraph((GraphState) obj7, (InvestingGraphContentModel) obj6, this.f$5, (String) obj5, (String) obj4, (Modifier) obj3, (Composer) obj, updateChangedFlags5, this.f$8);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ LocalToolbarKt$$ExternalSyntheticLambda1(Modifier modifier, Object obj, Enum r3, Object obj2, float f, Function3 function3, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = modifier;
        this.f$1 = obj;
        this.f$2 = r3;
        this.f$4 = obj2;
        this.f$5 = f;
        this.f$6 = function3;
        this.f$7 = i;
        this.f$8 = i2;
    }

    public /* synthetic */ LocalToolbarKt$$ExternalSyntheticLambda1(GraphState graphState, InvestingGraphContentModel investingGraphContentModel, float f, String str, String str2, Modifier modifier, int i, int i2) {
        this.$r8$classId = 4;
        this.f$1 = graphState;
        this.f$2 = investingGraphContentModel;
        this.f$5 = f;
        this.f$4 = str;
        this.f$6 = str2;
        this.f$0 = modifier;
        this.f$7 = i;
        this.f$8 = i2;
    }

    public /* synthetic */ LocalToolbarKt$$ExternalSyntheticLambda1(ImmutableList immutableList, Modifier modifier, ListUnorderedState listUnorderedState, ListUnorderedProminence listUnorderedProminence, ListUnorderedSize listUnorderedSize, float f, int i, int i2) {
        this.$r8$classId = 2;
        this.f$1 = immutableList;
        this.f$0 = modifier;
        this.f$2 = listUnorderedState;
        this.f$4 = listUnorderedProminence;
        this.f$6 = listUnorderedSize;
        this.f$5 = f;
        this.f$7 = i;
        this.f$8 = i2;
    }
}
