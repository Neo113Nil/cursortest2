package androidx.compose.material;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.MenuKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class ScaffoldKt$$ExternalSyntheticLambda8 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ Function2 f$2;
    public final /* synthetic */ ComposableLambdaImpl f$3;
    public final /* synthetic */ ComposableLambdaImpl f$4;
    public final /* synthetic */ Function2 f$5;
    public final /* synthetic */ WindowInsets f$6;
    public final /* synthetic */ Function2 f$7;

    public /* synthetic */ ScaffoldKt$$ExternalSyntheticLambda8(int i, Function2 function2, ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, Function2 function22, WindowInsets windowInsets, Function2 function23, int i2) {
        this.f$1 = i;
        this.f$2 = function2;
        this.f$3 = composableLambdaImpl;
        this.f$4 = composableLambdaImpl2;
        this.f$5 = function22;
        this.f$6 = windowInsets;
        this.f$7 = function23;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(24577);
                ScaffoldKt.m504ScaffoldLayouti1QSOvI(this.f$1, updateChangedFlags, this.f$6, (Composer) obj, this.f$3, this.f$4, this.f$2, this.f$5, this.f$7);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(1);
                MenuKt.m538ScaffoldLayoutFMILGgc(this.f$1, updateChangedFlags2, this.f$6, (Composer) obj, this.f$3, this.f$4, this.f$2, this.f$5, this.f$7);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ScaffoldKt$$ExternalSyntheticLambda8(int i, Function2 function2, ComposableLambdaImpl composableLambdaImpl, Function2 function22, ComposableLambdaImpl composableLambdaImpl2, WindowInsets windowInsets, Function2 function23, int i2) {
        this.f$1 = i;
        this.f$2 = function2;
        this.f$3 = composableLambdaImpl;
        this.f$5 = function22;
        this.f$4 = composableLambdaImpl2;
        this.f$6 = windowInsets;
        this.f$7 = function23;
    }
}
