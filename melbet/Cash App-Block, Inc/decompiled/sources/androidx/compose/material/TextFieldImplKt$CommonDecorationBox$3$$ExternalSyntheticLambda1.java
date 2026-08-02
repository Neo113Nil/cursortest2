package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import com.stripe.android.uicore.elements.compat.CompatTextFieldKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class TextFieldImplKt$CommonDecorationBox$3$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ long f$0;
    public final /* synthetic */ Function2 f$1;

    public /* synthetic */ TextFieldImplKt$CommonDecorationBox$3$$ExternalSyntheticLambda1(long j, Function2 function2, int i) {
        this.$r8$classId = i;
        this.f$0 = j;
        this.f$1 = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    CardKt.m467DecorationeuL9pac(this.f$0, null, this.f$1, gapComposer, 0, 6);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    CardKt.m467DecorationeuL9pac(this.f$0, null, this.f$1, gapComposer2, 0, 6);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                GapComposer gapComposer3 = (GapComposer) composer;
                if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    CompatTextFieldKt.m4074DecorationeuL9pac(this.f$0, null, this.f$1, gapComposer3, 0, 6);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            default:
                GapComposer gapComposer4 = (GapComposer) composer;
                if (gapComposer4.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    CompatTextFieldKt.m4074DecorationeuL9pac(this.f$0, null, this.f$1, gapComposer4, 0, 6);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
