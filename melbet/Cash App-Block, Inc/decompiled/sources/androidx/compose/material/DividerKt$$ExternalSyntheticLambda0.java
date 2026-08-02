package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.retro.views.PaymentPlanSummaryViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class DividerKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ float f$2;
    public final /* synthetic */ int f$5;

    public /* synthetic */ DividerKt$$ExternalSyntheticLambda0(float f, Modifier modifier, long j, int i) {
        this.f$2 = f;
        this.f$1 = j;
        this.f$0 = modifier;
        this.f$5 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(385);
                CardKt.m468DivideroMI9zvI(this.f$0, this.f$1, this.f$2, (Composer) obj, updateChangedFlags, this.f$5);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(this.f$5 | 1);
                PaymentPlanSummaryViewKt.m3735ProgressBar3IgeMak(this.f$2, updateChangedFlags2, this.f$1, (Composer) obj, this.f$0);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ DividerKt$$ExternalSyntheticLambda0(Modifier modifier, long j, float f, int i, int i2) {
        this.f$0 = modifier;
        this.f$1 = j;
        this.f$2 = f;
        this.f$5 = i2;
    }
}
