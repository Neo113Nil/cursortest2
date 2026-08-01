package T0;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import com.airbnb.lottie.LottieAnimationView;
import g1.C4522b;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3038a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3039b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3040c;

    public /* synthetic */ f(Object obj, int i, int i6) {
        this.f3038a = i6;
        this.f3040c = obj;
        this.f3039b = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f3038a) {
            case 0:
                C4522b this$0 = (C4522b) this.f3040c;
                kotlin.jvm.internal.h.e(this$0, "this$0");
                WorkDatabase workDatabase = (WorkDatabase) this$0.f37625u;
                Long j6 = workDatabase.l().j("next_job_scheduler_id");
                int i = 0;
                int longValue = j6 != null ? (int) j6.longValue() : 0;
                workDatabase.l().k(new S0.d("next_job_scheduler_id", Long.valueOf(longValue == Integer.MAX_VALUE ? 0 : longValue + 1)));
                if (longValue < 0 || longValue > this.f3039b) {
                    workDatabase.l().k(new S0.d("next_job_scheduler_id", Long.valueOf(1)));
                } else {
                    i = longValue;
                }
                return Integer.valueOf(i);
            default:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f3040c;
                boolean z3 = lottieAnimationView.f5660F;
                int i6 = this.f3039b;
                if (!z3) {
                    return X0.m.f(lottieAnimationView.getContext(), null, i6);
                }
                Context context = lottieAnimationView.getContext();
                return X0.m.f(context, X0.m.k(context, i6), i6);
        }
    }
}
