package m7;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4950a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4951b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4952c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4953d;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i10) {
        this.f4950a = i10;
        this.f4951b = obj;
        this.f4952c = obj2;
        this.f4953d = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f4950a) {
            case 0:
                return ((f) this.f4951b).f4954g.submit(new a1.d(9, (Callable) this.f4952c, (g) this.f4953d));
            default:
                p4.e eVar = (p4.e) this.f4951b;
                ArrayList arrayList = (ArrayList) this.f4952c;
                String str = (String) this.f4953d;
                WorkDatabase workDatabase = eVar.f5467k;
                arrayList.addAll(workDatabase.u().e(str));
                return workDatabase.t().k(str);
        }
    }
}
