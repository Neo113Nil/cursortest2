package K0;

import S0.s;
import androidx.work.impl.WorkDatabase;
import g1.C4523c;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1494a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1495b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1496c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1497d;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i) {
        this.f1494a = i;
        this.f1495b = obj;
        this.f1496c = obj2;
        this.f1497d = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f1494a) {
            case 0:
                WorkDatabase workDatabase = ((f) this.f1495b).f1508x;
                s u7 = workDatabase.u();
                String str = (String) this.f1497d;
                ((ArrayList) this.f1496c).addAll(u7.f(str));
                return workDatabase.t().h(str);
            default:
                O3.f fVar = (O3.f) this.f1495b;
                int i = 8;
                return fVar.f2511n.submit(new D5.b(i, (Callable) this.f1496c, (C4523c) this.f1497d));
        }
    }
}
