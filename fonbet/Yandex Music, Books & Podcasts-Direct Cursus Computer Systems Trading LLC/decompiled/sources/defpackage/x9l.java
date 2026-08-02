package defpackage;

import com.yandex.passport.internal.report.diary.f0;
import com.yandex.passport.internal.report.diary.g0;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class x9l implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;

    public /* synthetic */ x9l(int i, long j, long j2) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        cko D0;
        switch (this.a) {
            case 0:
                np3 np3Var = (np3) obj;
                np3Var.getClass();
                return np3Var.a(new g83(y9w.T(u75.h(new d85(this.b), new d85(this.c)), 0.0f, nmq.b(np3Var.a.e()), 8), 14));
            case 1:
                long j = this.b;
                long j2 = this.c;
                D0 = ((xjo) obj).D0("SELECT name, methodName, value, COUNT(*) as count FROM diary_parameter WHERE uploadId is null AND issuedAt >= ? AND issuedAt <= ? GROUP BY name");
                try {
                    D0.bindLong(1, j);
                    D0.bindLong(2, j2);
                    ArrayList arrayList = new ArrayList();
                    while (D0.q()) {
                        String str = null;
                        String x0 = D0.isNull(0) ? null : D0.x0(0);
                        String x02 = D0.isNull(1) ? null : D0.x0(1);
                        if (!D0.isNull(2)) {
                            str = D0.x0(2);
                        }
                        arrayList.add(new g0(x0, x02, str, (int) D0.getLong(3)));
                    }
                    return arrayList;
                } finally {
                }
            default:
                long j3 = this.b;
                long j4 = this.c;
                D0 = ((xjo) obj).D0("SELECT name, COUNT(name) as count FROM diary_method WHERE uploadId is null AND issuedAt >= ? AND issuedAt <= ? GROUP BY name");
                try {
                    D0.bindLong(1, j3);
                    D0.bindLong(2, j4);
                    ArrayList arrayList2 = new ArrayList();
                    while (D0.q()) {
                        arrayList2.add(new f0(D0.isNull(0) ? null : D0.x0(0), (int) D0.getLong(1)));
                    }
                    return arrayList2;
                } finally {
                }
        }
    }
}
