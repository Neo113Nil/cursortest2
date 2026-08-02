package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;

/* loaded from: classes.dex */
public final /* synthetic */ class h4w extends ezc implements uyc {
    public static final h4w a = new h4w(6, i4w.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);

    @Override // defpackage.uyc
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Context context = (Context) obj;
        r46 r46Var = (r46) obj2;
        j4w j4wVar = (j4w) obj3;
        WorkDatabase workDatabase = (WorkDatabase) obj4;
        l2t l2tVar = (l2t) obj5;
        htm htmVar = (htm) obj6;
        context.getClass();
        r46Var.getClass();
        j4wVar.getClass();
        workDatabase.getClass();
        l2tVar.getClass();
        htmVar.getClass();
        String str = tto.a;
        lzr lzrVar = new lzr(context, workDatabase, r46Var);
        c0k.a(context, SystemJobService.class, true);
        jsg.j().e(tto.a, "Created SystemJobScheduler and enabled SystemJobService");
        return u75.h(lzrVar, new ipd(context, r46Var, l2tVar, htmVar, new y8p(htmVar, j4wVar), j4wVar));
    }
}
