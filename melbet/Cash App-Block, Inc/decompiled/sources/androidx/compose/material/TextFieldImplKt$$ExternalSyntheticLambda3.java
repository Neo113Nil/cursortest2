package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.text.TextStyle;
import com.stripe.android.uicore.elements.compat.CompatTextFieldKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class TextFieldImplKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ long f$0;
    public final /* synthetic */ TextStyle f$1;
    public final /* synthetic */ Function2 f$3;
    public final /* synthetic */ int f$4;
    public final /* synthetic */ int f$5;

    public /* synthetic */ TextFieldImplKt$$ExternalSyntheticLambda3(long j, TextStyle textStyle, Function2 function2, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = j;
        this.f$1 = textStyle;
        this.f$3 = function2;
        this.f$4 = i;
        this.f$5 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                CardKt.m467DecorationeuL9pac(this.f$0, this.f$1, this.f$3, (Composer) obj, Updater.updateChangedFlags(this.f$4 | 1), this.f$5);
                break;
            default:
                ((Integer) obj2).getClass();
                CompatTextFieldKt.m4074DecorationeuL9pac(this.f$0, this.f$1, this.f$3, (Composer) obj, Updater.updateChangedFlags(this.f$4 | 1), this.f$5);
                break;
        }
        return Unit.INSTANCE;
    }
}
