package com.squareup.cash.payments.views;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtilsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
public final class QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$4 extends Lambda implements Function1 {
    public final /* synthetic */ Measurer2 $measurer;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$4(Measurer2 measurer2, int i) {
        super(1);
        this.$r8$classId = i;
        this.$measurer = measurer2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Measurer2 measurer2 = this.$measurer;
        switch (i) {
            case 0:
                ToolingUtilsKt.setDesignInfoProvider((SemanticsPropertyReceiver) obj, measurer2);
                break;
            case 1:
                ToolingUtilsKt.setDesignInfoProvider((SemanticsPropertyReceiver) obj, measurer2);
                break;
            case 2:
                ToolingUtilsKt.setDesignInfoProvider((SemanticsPropertyReceiver) obj, measurer2);
                break;
            case 3:
                ToolingUtilsKt.setDesignInfoProvider((SemanticsPropertyReceiver) obj, measurer2);
                break;
            case 4:
                ToolingUtilsKt.setDesignInfoProvider((SemanticsPropertyReceiver) obj, measurer2);
                break;
            case 5:
                ToolingUtilsKt.setDesignInfoProvider((SemanticsPropertyReceiver) obj, measurer2);
                break;
            case 6:
                ToolingUtilsKt.setDesignInfoProvider((SemanticsPropertyReceiver) obj, measurer2);
                break;
            case 7:
                ToolingUtilsKt.setDesignInfoProvider((SemanticsPropertyReceiver) obj, measurer2);
                break;
            case 8:
                ToolingUtilsKt.setDesignInfoProvider((SemanticsPropertyReceiver) obj, measurer2);
                break;
            default:
                ToolingUtilsKt.setDesignInfoProvider((SemanticsPropertyReceiver) obj, measurer2);
                break;
        }
        return Unit.INSTANCE;
    }
}
