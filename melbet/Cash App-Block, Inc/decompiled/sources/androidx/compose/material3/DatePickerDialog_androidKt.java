package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.window.DialogProperties;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public abstract class DatePickerDialog_androidKt {
    public static final PaddingValuesImpl DialogButtonsPadding = SpacerKt.m297PaddingValuesa9UjIt4$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 6.0f, 8.0f, 3);
    public static final float DialogButtonsMainAxisSpacing = 8.0f;
    public static final float DialogButtonsCrossAxisSpacing = 12.0f;

    /* renamed from: DatePickerDialog-GmEhDVc, reason: not valid java name */
    public static final void m524DatePickerDialogGmEhDVc(Function0 function0, ComposableLambdaImpl composableLambdaImpl, Modifier modifier, Function2 function2, Shape shape, DatePickerColors datePickerColors, DialogProperties dialogProperties, ComposableLambdaImpl composableLambdaImpl2, Composer composer, int i) {
        Modifier modifier2;
        Shape shape2;
        DatePickerColors datePickerColors2;
        DialogProperties dialogProperties2;
        Shape shape3;
        DatePickerColors colors;
        DialogProperties dialogProperties3;
        Modifier modifier3;
        Modifier wrapContentHeight;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(219718641);
        int i2 = i | 13312384;
        if (gapComposer.shouldExecute(i2 & 1, (38347923 & i2) != 38347922)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                DatePickerDefaults datePickerDefaults = DatePickerDefaults.INSTANCE;
                Shape value = ShapesKt.getValue(DatePickerModalTokens.ContainerShape, gapComposer);
                DatePickerDefaults datePickerDefaults2 = DatePickerDefaults.INSTANCE;
                shape3 = value;
                colors = DatePickerDefaults.colors(gapComposer);
                dialogProperties3 = new DialogProperties(3);
                modifier3 = Modifier.Companion.$$INSTANCE;
            } else {
                gapComposer.skipToGroupEnd();
                modifier3 = modifier;
                shape3 = shape;
                colors = datePickerColors;
                dialogProperties3 = dialogProperties;
            }
            gapComposer.endDefaults();
            wrapContentHeight = SizeKt.wrapContentHeight(modifier3, Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            AlertDialogKt.BasicAlertDialog(function0, wrapContentHeight, dialogProperties3, Expect_jvmKt.rememberComposableLambda(1108953335, new DatePickerKt$DatePicker$6(shape3, colors, composableLambdaImpl2, function2, composableLambdaImpl), gapComposer), gapComposer, 3462);
            dialogProperties2 = dialogProperties3;
            modifier2 = modifier3;
            shape2 = shape3;
            datePickerColors2 = colors;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            shape2 = shape;
            datePickerColors2 = datePickerColors;
            dialogProperties2 = dialogProperties;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DateInputKt$$ExternalSyntheticLambda1(function0, composableLambdaImpl, modifier2, function2, shape2, datePickerColors2, dialogProperties2, composableLambdaImpl2, i);
        }
    }
}
