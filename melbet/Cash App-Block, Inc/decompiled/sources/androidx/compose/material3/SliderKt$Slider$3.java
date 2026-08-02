package androidx.compose.material3;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.internal.Icons$Filled;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathNode;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final class SliderKt$Slider$3 implements Function3 {
    public final /* synthetic */ Object $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ int $r8$classId = 1;

    public SliderKt$Slider$3(ComposableLambdaImpl composableLambdaImpl, boolean z) {
        this.$colors = composableLambdaImpl;
        this.$enabled = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String m568getString2EP1pXo;
        int i = this.$r8$classId;
        Object obj4 = this.$colors;
        switch (i) {
            case 0:
                int intValue = ((Number) obj3).intValue();
                SliderDefaults.INSTANCE.m552Track4EFweAY((SliderState) obj, null, this.$enabled, (SliderColors) obj4, null, null, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, (Composer) obj2, (intValue & 14) | 100663296);
                break;
            default:
                Composer composer = (Composer) obj2;
                int intValue2 = ((Number) obj3).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    ((ComposableLambdaImpl) obj4).invoke((Object) gapComposer, (Object) 0);
                    float f = ButtonDefaults.IconSpacing;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion, f));
                    ImageVector imageVector = Icons$Filled._arrowDropDown;
                    if (imageVector == null) {
                        ImageVector.Builder builder = new ImageVector.Builder("Filled.ArrowDropDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                        EmptyList emptyList = VectorKt.EmptyPath;
                        SolidColor solidColor = new SolidColor(Color.Black);
                        ArrayList arrayList = new ArrayList(32);
                        arrayList.add(new PathNode.MoveTo(7.0f, 10.0f));
                        arrayList.add(new PathNode.RelativeLineTo(5.0f, 5.0f));
                        arrayList.add(new PathNode.RelativeLineTo(5.0f, -5.0f));
                        arrayList.add(PathNode.Close.INSTANCE);
                        ImageVector.Builder.m766addPathoIyEayM$default(builder, arrayList, solidColor);
                        imageVector = builder.build();
                        Icons$Filled._arrowDropDown = imageVector;
                    }
                    ImageVector imageVector2 = imageVector;
                    boolean z = this.$enabled;
                    if (z) {
                        gapComposer.startReplaceGroup(1509384391);
                        m568getString2EP1pXo = Icons$Filled.m568getString2EP1pXo(gapComposer, R.string.m3c_date_picker_switch_to_day_selection);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(1509478662);
                        m568getString2EP1pXo = Icons$Filled.m568getString2EP1pXo(gapComposer, R.string.m3c_date_picker_switch_to_year_selection);
                        gapComposer.end(false);
                    }
                    IconKt.m534Iconww6aTOc(imageVector2, m568getString2EP1pXo, RotateKt.rotate(companion, z ? 180.0f : RecyclerView.DECELERATION_RATE), 0L, gapComposer, 0, 8);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public SliderKt$Slider$3(boolean z, SliderColors sliderColors) {
        this.$enabled = z;
        this.$colors = sliderColors;
    }
}
