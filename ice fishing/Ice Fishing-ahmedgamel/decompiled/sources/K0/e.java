package K0;

import S0.s;
import androidx.work.impl.WorkDatabase;
import i1.C4586c;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1606a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1607b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1608c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1609d;

    public /* synthetic */ e(int i, Object obj, Object obj2, Object obj3) {
        this.f1606a = i;
        this.f1607b = obj;
        this.f1608c = obj2;
        this.f1609d = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f1606a) {
            case 0:
                WorkDatabase workDatabase = ((f) this.f1607b).f1620x;
                s u6 = workDatabase.u();
                String str = (String) this.f1609d;
                ((ArrayList) this.f1608c).addAll(u6.i(str));
                return workDatabase.t().h(str);
            default:
                U3.f fVar = (U3.f) this.f1607b;
                int i = 10;
                return fVar.f3316n.submit(new F.n(i, (Callable) this.f1608c, (C4586c) this.f1609d));
        }
    }
}
