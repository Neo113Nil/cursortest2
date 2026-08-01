package K0;

import S0.s;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1497a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1498b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1499c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1500d;

    public /* synthetic */ e(int i, Object obj, Object obj2, Object obj3) {
        this.f1497a = i;
        this.f1498b = obj;
        this.f1499c = obj2;
        this.f1500d = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f1497a) {
            case 0:
                WorkDatabase workDatabase = ((f) this.f1498b).f1511x;
                s u3 = workDatabase.u();
                String str = (String) this.f1500d;
                ((ArrayList) this.f1499c).addAll(u3.k(str));
                return workDatabase.t().h(str);
            default:
                S3.f fVar = (S3.f) this.f1498b;
                int i = 9;
                return fVar.f2877n.submit(new F.n(i, (Callable) this.f1499c, (F1.a) this.f1500d));
        }
    }
}
