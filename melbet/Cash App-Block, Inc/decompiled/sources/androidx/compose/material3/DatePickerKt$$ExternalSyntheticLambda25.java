package androidx.compose.material3;

import android.os.SystemClock;
import com.squareup.cash.onboarding.viewmodels.OnboardingLandingViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class DatePickerKt$$ExternalSyntheticLambda25 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda25(int i, long j, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        long j = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(Long.valueOf(j));
                break;
            default:
                function1.invoke(new OnboardingLandingViewEvent.GetStartedClicked(SystemClock.elapsedRealtime() - j));
                break;
        }
        return Unit.INSTANCE;
    }
}
