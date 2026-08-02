package bo.app;

import com.braze.models.Banner;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class q$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Banner f$0;

    public /* synthetic */ q$$ExternalSyntheticLambda0(Banner banner, int i) {
        this.$r8$classId = i;
        this.f$0 = banner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Banner banner = this.f$0;
        switch (i) {
            case 0:
                return q.b(banner);
            default:
                return d0.e(banner);
        }
    }
}
