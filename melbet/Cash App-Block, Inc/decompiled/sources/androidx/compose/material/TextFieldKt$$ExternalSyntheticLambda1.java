package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import com.squareup.cash.fidesmo.views.ScanningHeartPulseKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final /* synthetic */ class TextFieldKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ Function2 f$1;
    public final /* synthetic */ Function2 f$2;
    public final /* synthetic */ Function3 f$3;
    public final /* synthetic */ Function2 f$4;
    public final /* synthetic */ Function2 f$5;
    public final /* synthetic */ boolean f$6;
    public final /* synthetic */ float f$7;
    public final /* synthetic */ PaddingValues f$8;
    public final /* synthetic */ int f$9;

    public /* synthetic */ TextFieldKt$$ExternalSyntheticLambda1(Modifier modifier, ComposableLambdaImpl composableLambdaImpl, Function2 function2, Function3 function3, Function2 function22, Function2 function23, boolean z, float f, PaddingValuesImpl paddingValuesImpl, int i) {
        this.f$0 = modifier;
        this.f$5 = composableLambdaImpl;
        this.f$1 = function2;
        this.f$3 = function3;
        this.f$2 = function22;
        this.f$4 = function23;
        this.f$6 = z;
        this.f$7 = f;
        this.f$8 = paddingValuesImpl;
        this.f$9 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$9;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                CardKt.TextFieldLayout(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ScanningHeartPulseKt.TextFieldLayout(this.f$0, (ComposableLambdaImpl) this.f$5, this.f$1, this.f$3, this.f$2, this.f$4, this.f$6, this.f$7, (PaddingValuesImpl) this.f$8, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ TextFieldKt$$ExternalSyntheticLambda1(Modifier modifier, Function2 function2, Function2 function22, Function3 function3, Function2 function23, Function2 function24, boolean z, float f, PaddingValues paddingValues, int i) {
        this.f$0 = modifier;
        this.f$1 = function2;
        this.f$2 = function22;
        this.f$3 = function3;
        this.f$4 = function23;
        this.f$5 = function24;
        this.f$6 = z;
        this.f$7 = f;
        this.f$8 = paddingValues;
        this.f$9 = i;
    }
}
