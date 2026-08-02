package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class v22 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ v22(long j, int i) {
        this.a = i;
        this.b = j;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                jho.a.getClass();
                long a = o450.a() - this.b;
                lhn lhnVar = new lhn((Map) new LinkedHashMap());
                lhnVar.b(a, "timespan");
                return lhnVar;
            default:
                jho.a.getClass();
                long a2 = o450.a() - this.b;
                lhn lhnVar2 = new lhn((Map) new LinkedHashMap());
                lhnVar2.b(a2, "timespan");
                return lhnVar2;
        }
    }
}
