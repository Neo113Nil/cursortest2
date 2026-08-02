package defpackage;

import androidx.work.impl.WorkDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.b;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final /* synthetic */ class rjh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ rjh(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.x;
        Object obj2 = this.w;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                tjh tjhVar = (tjh) obj4;
                v111 v111Var = (v111) obj3;
                a911 a911Var = (a911) obj2;
                i64 i64Var = (i64) obj;
                tjhVar.getClass();
                Logger logger = tjh.f;
                try {
                    d011 a = tjhVar.c.a(v111Var.b());
                    if (a == null) {
                        String str = "Transport backend '" + v111Var.b() + "' is not registered";
                        logger.warning(str);
                        a911Var.c(new IllegalArgumentException(str));
                    } else {
                        ((b) tjhVar.e).n(new t26(5, tjhVar, v111Var, ((u59) a).a(i64Var)));
                        a911Var.c(null);
                    }
                    break;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    a911Var.c(e);
                    return;
                }
            default:
                List list = (List) obj4;
                n951 n951Var = (n951) obj3;
                u0e u0eVar = (u0e) obj2;
                WorkDatabase workDatabase = (WorkDatabase) obj;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((kom0) it.next()).c(n951Var.a);
                }
                pom0.b(u0eVar, workDatabase, list);
                break;
        }
    }
}
