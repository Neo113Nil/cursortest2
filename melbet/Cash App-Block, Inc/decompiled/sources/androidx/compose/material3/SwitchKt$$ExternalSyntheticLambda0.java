package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import app.cash.local.viewmodels.internal.MenuSelectorOption;
import app.cash.local.views.internal.menus.LocalMenuSelectorKt;
import com.squareup.cash.arcade.components.input.InputChipKt;
import com.squareup.cash.arcade.components.input.SelectionCardStyle;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.pools.views.PoolToastKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class SwitchKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 2;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Modifier f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ boolean f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ int f$7;
    public final /* synthetic */ int f$8;

    public /* synthetic */ SwitchKt$$ExternalSyntheticLambda0(ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, boolean z, Modifier modifier, boolean z2, Function1 function1, int i, int i2) {
        SelectionCardStyle[] selectionCardStyleArr = SelectionCardStyle.$VALUES;
        this.f$3 = composableLambdaImpl;
        this.f$5 = composableLambdaImpl2;
        this.f$0 = z;
        this.f$2 = modifier;
        this.f$4 = z2;
        this.f$1 = function1;
        this.f$7 = i;
        this.f$8 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$7;
        Object obj3 = this.f$5;
        Object obj4 = this.f$3;
        Object obj5 = this.f$1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                SwitchKt.Switch(this.f$0, (Function1) obj5, this.f$2, (Function2) obj4, this.f$4, (SwitchColors) obj3, (Composer) obj, updateChangedFlags, this.f$8);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                LocalMenuSelectorKt.LocalMenuSelector(this.f$2, (MenuSelectorOption) obj5, (List) obj4, this.f$0, (Function0) obj3, this.f$4, (Composer) obj, updateChangedFlags2, this.f$8);
                break;
            case 2:
                SelectionCardStyle[] selectionCardStyleArr = SelectionCardStyle.$VALUES;
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(i2 | 1);
                InputChipKt.SelectionCard((ComposableLambdaImpl) obj4, (ComposableLambdaImpl) obj3, this.f$0, this.f$2, this.f$4, (Function1) obj5, (Composer) obj, updateChangedFlags3, this.f$8);
                break;
            case 3:
                String str = (String) obj4;
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj3;
                ((Integer) obj2).getClass();
                int updateChangedFlags4 = Updater.updateChangedFlags(i2 | 1);
                int i3 = this.f$8;
                VisibleKt.PullToRefresh(updateChangedFlags4, i3, (Composer) obj, composableLambdaImpl, this.f$2, str, (Function0) obj5, this.f$0, this.f$4);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags5 = Updater.updateChangedFlags(i2 | 1);
                PoolToastKt.BaseTitleBar((Function0) obj5, (Function0) obj4, (Function0) obj3, this.f$2, this.f$0, this.f$4, (Composer) obj, updateChangedFlags5, this.f$8);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SwitchKt$$ExternalSyntheticLambda0(Modifier modifier, MenuSelectorOption menuSelectorOption, List list, boolean z, Function0 function0, boolean z2, int i, int i2) {
        this.f$2 = modifier;
        this.f$1 = menuSelectorOption;
        this.f$3 = list;
        this.f$0 = z;
        this.f$5 = function0;
        this.f$4 = z2;
        this.f$7 = i;
        this.f$8 = i2;
    }

    public /* synthetic */ SwitchKt$$ExternalSyntheticLambda0(Function0 function0, Function0 function02, Function0 function03, Modifier modifier, boolean z, boolean z2, int i, int i2) {
        this.f$1 = function0;
        this.f$3 = function02;
        this.f$5 = function03;
        this.f$2 = modifier;
        this.f$0 = z;
        this.f$4 = z2;
        this.f$7 = i;
        this.f$8 = i2;
    }

    public /* synthetic */ SwitchKt$$ExternalSyntheticLambda0(Function0 function0, boolean z, Modifier modifier, boolean z2, String str, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.f$1 = function0;
        this.f$0 = z;
        this.f$2 = modifier;
        this.f$4 = z2;
        this.f$3 = str;
        this.f$5 = composableLambdaImpl;
        this.f$7 = i;
        this.f$8 = i2;
    }

    public /* synthetic */ SwitchKt$$ExternalSyntheticLambda0(boolean z, Function1 function1, Modifier modifier, Function2 function2, boolean z2, SwitchColors switchColors, int i, int i2) {
        this.f$0 = z;
        this.f$1 = function1;
        this.f$2 = modifier;
        this.f$3 = function2;
        this.f$4 = z2;
        this.f$5 = switchColors;
        this.f$7 = i;
        this.f$8 = i2;
    }
}
