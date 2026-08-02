package defpackage;

import androidx.work.impl.WorkDatabase;
import com.airbnb.lottie.LottieAnimationView;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class sae implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sae(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                WorkDatabase workDatabase = ((tae) this.c).a;
                Long a = workDatabase.w().a("next_job_scheduler_id");
                int i = 0;
                int longValue = a != null ? (int) a.longValue() : 0;
                int i2 = longValue == Integer.MAX_VALUE ? 0 : longValue + 1;
                xlm w = workDatabase.w();
                up6.F(w.a, false, true, new avi(29, w, new wlm("next_job_scheduler_id", Long.valueOf(i2))));
                if (longValue < 0 || longValue > this.b) {
                    xlm w2 = workDatabase.w();
                    up6.F(w2.a, false, true, new avi(29, w2, new wlm("next_job_scheduler_id", Long.valueOf(1))));
                } else {
                    i = longValue;
                }
                return Integer.valueOf(i);
            default:
                return LottieAnimationView.n((LottieAnimationView) this.c, this.b);
        }
    }
}
