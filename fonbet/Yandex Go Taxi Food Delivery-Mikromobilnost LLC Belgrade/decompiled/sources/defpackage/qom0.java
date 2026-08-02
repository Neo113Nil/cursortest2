package defpackage;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class qom0 implements yvf0 {
    public final /* synthetic */ int a;
    public final yvf0 b;
    public final yvf0 c;
    public final yvf0 d;
    public final yvf0 e;

    public /* synthetic */ qom0(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, int i) {
        this.a = i;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.e = yvf0Var3;
        this.d = yvf0Var4;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        yvf0 yvf0Var = this.d;
        yvf0 yvf0Var2 = this.e;
        yvf0 yvf0Var3 = this.c;
        yvf0 yvf0Var4 = this.b;
        switch (i) {
            case 0:
                Context context = (Context) yvf0Var4.get();
                ugo ugoVar = (ugo) yvf0Var3.get();
                SchedulerConfig schedulerConfig = (SchedulerConfig) ((xgo) yvf0Var2).get();
                return new am2(context, ugoVar, schedulerConfig);
            default:
                return new ofa0((Executor) yvf0Var4.get(), (ugo) yvf0Var3.get(), (am2) ((qom0) yvf0Var2).get(), (w0x0) yvf0Var.get());
        }
    }
}
