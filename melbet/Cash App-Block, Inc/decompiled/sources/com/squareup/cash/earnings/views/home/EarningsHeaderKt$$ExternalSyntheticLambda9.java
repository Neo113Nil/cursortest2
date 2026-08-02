package com.squareup.cash.earnings.views.home;

import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import bo.app.y0$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.components.cell.RealCellSearchResultAccessoryScope;
import com.squareup.cash.charting.viewmodels.EarningsBarViewModel;
import com.squareup.cash.favorites.components.AddFavoritesViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class EarningsHeaderKt$$ExternalSyntheticLambda9 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Function0 f$1;

    public /* synthetic */ EarningsHeaderKt$$ExternalSyntheticLambda9(Function0 function0, boolean z) {
        this.$r8$classId = 2;
        this.f$1 = function0;
        this.f$0 = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        boolean z = this.f$0;
        Function0 function0 = this.f$1;
        switch (i) {
            case 0:
                ((EarningsBarViewModel) obj).getClass();
                if (z) {
                    function0.invoke();
                }
                break;
            case 1:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                if (z) {
                    semanticsPropertyReceiver.set(SemanticsActions.Collapse, new AccessibilityAction(null, new y0$$ExternalSyntheticLambda0(5, function0)));
                } else {
                    semanticsPropertyReceiver.set(SemanticsActions.Expand, new AccessibilityAction(null, new y0$$ExternalSyntheticLambda0(6, function0)));
                }
                break;
            default:
                RealCellSearchResultAccessoryScope realCellSearchResultAccessoryScope = (RealCellSearchResultAccessoryScope) obj;
                realCellSearchResultAccessoryScope.getClass();
                RealCellSearchResultAccessoryScope.buttonCompact$default(realCellSearchResultAccessoryScope, function0, !z, AddFavoritesViewKt.f419lambda$1294107366, 2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ EarningsHeaderKt$$ExternalSyntheticLambda9(boolean z, Function0 function0, int i) {
        this.$r8$classId = i;
        this.f$0 = z;
        this.f$1 = function0;
    }
}
