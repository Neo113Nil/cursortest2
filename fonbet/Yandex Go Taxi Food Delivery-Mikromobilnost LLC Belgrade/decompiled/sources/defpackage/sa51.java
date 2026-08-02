package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class sa51 {
    public final u0e a;
    public final t951 b;
    public final t2s c;
    public final WorkDatabase d;
    public final fa51 e;
    public final ArrayList f;
    public final Context g;
    public WorkerParameters.a h = new WorkerParameters.a();

    public sa51(Context context, u0e u0eVar, t951 t951Var, t2s t2sVar, WorkDatabase workDatabase, fa51 fa51Var, ArrayList arrayList) {
        this.a = u0eVar;
        this.b = t951Var;
        this.c = t2sVar;
        this.d = workDatabase;
        this.e = fa51Var;
        this.f = arrayList;
        this.g = context.getApplicationContext();
    }
}
