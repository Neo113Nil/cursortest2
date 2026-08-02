package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class DatePickerDialog_androidKt$DatePickerDialog$1$1$1$2$1 implements Function2 {
    public final /* synthetic */ ComposableLambdaImpl $confirmButton;
    public final /* synthetic */ Function2 $dismissButton;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ DatePickerDialog_androidKt$DatePickerDialog$1$1$1$2$1(Function2 function2, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.$r8$classId = i;
        this.$dismissButton = function2;
        this.$confirmButton = composableLambdaImpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        ComposableLambdaImpl composableLambdaImpl = this.$confirmButton;
        Function2 function2 = this.$dismissButton;
        int i2 = 1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Number) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    AlertDialogKt.m515AlertDialogFlowRowixp7dh8(DatePickerDialog_androidKt.DialogButtonsMainAxisSpacing, DatePickerDialog_androidKt.DialogButtonsCrossAxisSpacing, Expect_jvmKt.rememberComposableLambda(-1980163584, new DatePickerDialog_androidKt$DatePickerDialog$1$1$1$2$1(function2, composableLambdaImpl, i2), gapComposer), gapComposer, 438);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Number) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (function2 == null) {
                        gapComposer2.startReplaceGroup(322524505);
                    } else {
                        gapComposer2.startReplaceGroup(-266690648);
                        function2.invoke(gapComposer2, 0);
                    }
                    gapComposer2.end(false);
                    composableLambdaImpl.invoke((Object) gapComposer2, (Object) 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
