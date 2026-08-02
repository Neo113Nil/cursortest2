package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.room.util.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.b;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class w08 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ w08(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                WorkDatabase workDatabase = bVar.c;
                workDatabase.P0(new gtg(5, new iy2(3, workDatabase, bVar)));
                break;
            default:
                WorkDatabase workDatabase2 = bVar.c;
                Context context = bVar.a;
                String str = k3x0.y;
                if (Build.VERSION.SDK_INT >= 34) {
                    v8x.a(context).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                ArrayList e = k3x0.e(context, jobScheduler);
                if (e != null && !e.isEmpty()) {
                    Iterator it = e.iterator();
                    while (it.hasNext()) {
                        k3x0.d(jobScheduler, ((JobInfo) it.next()).getId());
                    }
                }
                ((Number) a.b(workDatabase2.X0().a, false, true, new u431(19))).intValue();
                pom0.b(bVar.b, workDatabase2, bVar.e);
                break;
        }
        return zy11Var;
    }
}
