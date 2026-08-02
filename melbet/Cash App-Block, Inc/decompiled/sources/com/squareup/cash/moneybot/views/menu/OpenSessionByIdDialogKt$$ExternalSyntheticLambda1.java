package com.squareup.cash.moneybot.views.menu;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.activity.views.compact.CompactActivityAccessoryScope$AccessoryButtonScope$AccessoryButton;
import com.squareup.cash.activity.views.compact.RealCompactActivityAccessoryButtonScope;
import com.squareup.cash.arcade.components.cell.CellActivityAccessoryScope$AccessoryButtonScope$AccessoryButton;
import com.squareup.cash.arcade.components.cell.RealCellActivityAccessoryButtonScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class OpenSessionByIdDialogKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ Function0 f$1;

    public /* synthetic */ OpenSessionByIdDialogKt$$ExternalSyntheticLambda1(int i, Function0 function0, Function1 function1) {
        this.$r8$classId = 0;
        this.f$0 = function1;
        this.f$1 = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function0 function0 = this.f$1;
        Function1 function1 = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                ExpandableContentKt.OpenSessionByIdDialog(function1, function0, composer, Updater.updateChangedFlags(1));
                break;
            case 1:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ((CompactActivityAccessoryScope$AccessoryButtonScope$AccessoryButton) function1.invoke(RealCompactActivityAccessoryButtonScope.INSTANCE)).content.invoke((Object) function0, (Object) gapComposer, (Object) 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                int intValue2 = num.intValue();
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ((CellActivityAccessoryScope$AccessoryButtonScope$AccessoryButton) function1.invoke(RealCellActivityAccessoryButtonScope.INSTANCE)).content.invoke((Object) function0, (Object) gapComposer2, (Object) 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ OpenSessionByIdDialogKt$$ExternalSyntheticLambda1(Function1 function1, Function0 function0, int i, byte b) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = function0;
    }
}
