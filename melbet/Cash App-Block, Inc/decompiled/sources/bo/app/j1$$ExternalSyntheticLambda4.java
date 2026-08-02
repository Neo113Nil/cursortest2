package bo.app;

import com.braze.Braze;
import com.braze.models.outgoing.BrazeProperties;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class j1$$ExternalSyntheticLambda4 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ BrazeProperties f$1;

    public /* synthetic */ j1$$ExternalSyntheticLambda4(String str, BrazeProperties brazeProperties, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = brazeProperties;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String logCustomEvent$lambda$1$0;
        String logCustomEvent$lambda$1$3;
        switch (this.$r8$classId) {
            case 0:
                return j1.b(this.f$0, this.f$1);
            case 1:
                logCustomEvent$lambda$1$0 = Braze.logCustomEvent$lambda$1$0(this.f$0, this.f$1);
                return logCustomEvent$lambda$1$0;
            default:
                logCustomEvent$lambda$1$3 = Braze.logCustomEvent$lambda$1$3(this.f$0, this.f$1);
                return logCustomEvent$lambda$1$3;
        }
    }
}
