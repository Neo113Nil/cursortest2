package defpackage;

import com.yandex.go.network_metrics.Status;
import java.util.Map;

/* loaded from: classes8.dex */
public final /* synthetic */ class u2j0 implements tls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ u2j0(long j, w2j0 w2j0Var, sqo sqoVar) {
        this.b = j;
        this.c = w2j0Var;
        this.w = sqoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [bku0] */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        long j = this.b;
        Object obj2 = this.w;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                w2j0 w2j0Var = (w2j0) obj3;
                sqo sqoVar = (sqo) obj2;
                Map.Entry entry = (Map.Entry) obj;
                boolean z = j > ((ek7) entry.getValue()).b;
                if (z && ((ek7) entry.getValue()).a == Status.ResponseReceived) {
                    w2j0Var.e(sqoVar, (ek7) entry.getValue(), "Network.Success", eho.b((ek7) entry.getValue()));
                }
                return Boolean.valueOf(z);
            default:
                String str = (String) obj3;
                String str2 = (String) obj2;
                ull0 T0 = ((oll0) obj).T0("SELECT * FROM stored_experiments WHERE source = ? AND name = ? AND last_update > ?");
                try {
                    T0.g1(1, str);
                    T0.g1(2, str2);
                    T0.b(3, j);
                    int r = eja1.r(T0, "source");
                    int r2 = eja1.r(T0, "name");
                    int r3 = eja1.r(T0, "version");
                    int r4 = eja1.r(T0, "value");
                    int r5 = eja1.r(T0, "last_update");
                    if (T0.q()) {
                        r5 = new bku0(T0.Y1(r), T0.Y1(r2), T0.isNull(r3) ? null : T0.Y1(r3), T0.Y1(r4), T0.getLong(r5));
                    }
                    return r5;
                } finally {
                    T0.close();
                }
        }
    }

    public /* synthetic */ u2j0(String str, String str2, long j) {
        this.c = str;
        this.w = str2;
        this.b = j;
    }
}
