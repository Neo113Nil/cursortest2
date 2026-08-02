package T0;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import com.airbnb.lottie.LottieAnimationView;
import i1.C4586c;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3121a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3122b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3123c;

    public /* synthetic */ f(Object obj, int i, int i4) {
        this.f3121a = i4;
        this.f3123c = obj;
        this.f3122b = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f3121a) {
            case 0:
                C4586c this$0 = (C4586c) this.f3123c;
                kotlin.jvm.internal.h.e(this$0, "this$0");
                WorkDatabase workDatabase = (WorkDatabase) this$0.f38154u;
                Long y7 = workDatabase.l().y("next_job_scheduler_id");
                int i = 0;
                int longValue = y7 != null ? (int) y7.longValue() : 0;
                workDatabase.l().B(new S0.d("next_job_scheduler_id", Long.valueOf(longValue == Integer.MAX_VALUE ? 0 : longValue + 1)));
                if (longValue < 0 || longValue > this.f3122b) {
                    workDatabase.l().B(new S0.d("next_job_scheduler_id", Long.valueOf(1)));
                } else {
                    i = longValue;
                }
                return Integer.valueOf(i);
            default:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f3123c;
                boolean z6 = lottieAnimationView.f6446F;
                int i4 = this.f3122b;
                if (!z6) {
                    return Z0.m.f(lottieAnimationView.getContext(), null, i4);
                }
                Context context = lottieAnimationView.getContext();
                return Z0.m.f(context, Z0.m.k(context, i4), i4);
        }
    }
}
