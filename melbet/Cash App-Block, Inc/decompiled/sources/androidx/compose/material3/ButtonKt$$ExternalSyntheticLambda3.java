package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class ButtonKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function0 f$0;
    public final /* synthetic */ Modifier f$1;
    public final /* synthetic */ int f$10;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ Shape f$3;
    public final /* synthetic */ ButtonColors f$4;
    public final /* synthetic */ ButtonElevation f$5;
    public final /* synthetic */ PaddingValues f$7;
    public final /* synthetic */ ComposableLambdaImpl f$9;

    public /* synthetic */ ButtonKt$$ExternalSyntheticLambda3(Function0 function0, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, PaddingValues paddingValues, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = function0;
        this.f$1 = modifier;
        this.f$2 = z;
        this.f$3 = shape;
        this.f$4 = buttonColors;
        this.f$5 = buttonElevation;
        this.f$7 = paddingValues;
        this.f$9 = composableLambdaImpl;
        this.f$10 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$10;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                MenuKt.ElevatedButton(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$7, this.f$9, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                MenuKt.FilledTonalButton(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$7, this.f$9, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
