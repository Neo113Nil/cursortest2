package defpackage;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class qk20 {
    public static final Object b = new Object();
    public static qk20 c;
    public n1d a;

    public static qk20 c() {
        qk20 qk20Var;
        synchronized (b) {
            cvw.n("MlKitContext has not been initialized", c != null);
            qk20Var = c;
            cvw.l(qk20Var);
        }
        return qk20Var;
    }

    public static qk20 d(Context context, Executor executor) {
        qk20 qk20Var;
        synchronized (b) {
            cvw.n("MlKitContext is already initialized", c == null);
            qk20 qk20Var2 = new qk20();
            c = qk20Var2;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList p = new lb7(18, context, new cot(13, MlKitComponentDiscoveryService.class)).p();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            dac dacVar = i1d.F1;
            arrayList.addAll(p);
            arrayList2.add(j0d.c(context, Context.class, new Class[0]));
            arrayList2.add(j0d.c(qk20Var2, qk20.class, new Class[0]));
            n1d n1dVar = new n1d(executor, arrayList, arrayList2, dacVar);
            qk20Var2.a = n1dVar;
            n1dVar.i(true);
            qk20Var = c;
        }
        return qk20Var;
    }

    public final Object a(Class cls) {
        cvw.n("MlKitContext has been deleted", c == this);
        cvw.l(this.a);
        return this.a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
