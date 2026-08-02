package app.cash.local.views.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import com.google.android.gms.internal.mlkit_vision_barcode.zztc;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class SavableLaunchedEffectKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object[] f$0;
    public final /* synthetic */ Function2 f$1;

    public /* synthetic */ SavableLaunchedEffectKt$$ExternalSyntheticLambda1(Object[] objArr, Function2 function2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = objArr;
        this.f$1 = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function2 function2 = this.f$1;
        Object[] objArr = this.f$0;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ProgressBarKt.LaunchedEffectSaveable(objArr, function2, composer, Updater.updateChangedFlags(1));
                break;
            default:
                zztc.LaunchedEffectSaveable(objArr, function2, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
