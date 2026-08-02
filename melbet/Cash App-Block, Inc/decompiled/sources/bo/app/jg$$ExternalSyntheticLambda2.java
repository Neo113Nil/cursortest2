package bo.app;

import com.braze.Braze;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class jg$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ long f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ jg$$ExternalSyntheticLambda2(int i, long j, long j2) {
        this.$r8$classId = i;
        this.f$0 = j;
        this.f$1 = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String _init_$lambda$4;
        switch (this.$r8$classId) {
            case 0:
                return jg.a(this.f$0, this.f$1);
            default:
                _init_$lambda$4 = Braze._init_$lambda$4(this.f$0, this.f$1);
                return _init_$lambda$4;
        }
    }
}
