package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.stripe.android.uicore.elements.compat.TextFieldTransitionScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final /* synthetic */ class TextFieldTransitionScope$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Enum f$1;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ long f$3;
    public final /* synthetic */ Function3 f$4;
    public final /* synthetic */ boolean f$5;
    public final /* synthetic */ ComposableLambdaImpl f$6;

    public /* synthetic */ TextFieldTransitionScope$$ExternalSyntheticLambda1(Object obj, Enum r2, long j, long j2, Function3 function3, boolean z, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = r2;
        this.f$2 = j;
        this.f$3 = j2;
        this.f$4 = function3;
        this.f$5 = z;
        this.f$6 = composableLambdaImpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function3 function3 = this.f$4;
        Enum r4 = this.f$1;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(1769473);
                ((TextFieldDefaults) obj3).m508TransitionDTcfvLk((InputPhase) r4, this.f$2, this.f$3, (TextFieldImplKt$CommonDecorationBox$labelColor$1) function3, this.f$5, this.f$6, (Composer) obj, updateChangedFlags);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(1769473);
                ((TextFieldTransitionScope) obj3).m4075TransitionDTcfvLk((com.stripe.android.uicore.elements.compat.InputPhase) r4, this.f$2, this.f$3, (TextFieldImplKt$CommonDecorationBox$labelColor$1) function3, this.f$5, this.f$6, (Composer) obj, updateChangedFlags2);
                break;
        }
        return Unit.INSTANCE;
    }
}
