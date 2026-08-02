package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class st3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4w b;

    public /* synthetic */ st3(g4w g4wVar, int i) {
        this.a = i;
        this.b = g4wVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        g4w g4wVar = this.b;
        switch (i) {
            case 0:
                WorkDatabase workDatabase = g4wVar.c;
                workDatabase.getClass();
                workDatabase.s(new b6n(25, new cy1(3, workDatabase, "PLUS_DAILY_WIDGET_WORKER_TAG", g4wVar)));
                tto.b(g4wVar.b, workDatabase, g4wVar.e);
                break;
            default:
                WorkDatabase workDatabase2 = g4wVar.c;
                Context context = g4wVar.a;
                String str = lzr.f;
                if (Build.VERSION.SDK_INT >= 34) {
                    z2f.b(context).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                ArrayList d = lzr.d(context, jobScheduler);
                if (d != null && !d.isEmpty()) {
                    Iterator it = d.iterator();
                    while (it.hasNext()) {
                        lzr.a(jobScheduler, ((JobInfo) it.next()).getId());
                    }
                }
                ((Number) up6.F(workDatabase2.A().a, false, true, new jwv(27))).intValue();
                tto.b(g4wVar.b, workDatabase2, g4wVar.e);
                break;
        }
        return Unit.a;
    }
}
