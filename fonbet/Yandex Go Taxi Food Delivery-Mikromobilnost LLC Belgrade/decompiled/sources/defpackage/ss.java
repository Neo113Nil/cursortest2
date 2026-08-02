package defpackage;

import androidx.compose.runtime.internal.a;
import java.util.List;

/* loaded from: classes6.dex */
public final /* synthetic */ class ss implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ tls c;

    public /* synthetic */ ss(List list, tls tlsVar, int i) {
        this.a = i;
        this.b = list;
        this.c = tlsVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.c;
        List list = this.b;
        int i2 = 1;
        u6y u6yVar = (u6y) obj;
        switch (i) {
            case 0:
                m6y m6yVar = (m6y) u6yVar;
                m6yVar.f(list.size(), null, new tj(i2, new p0(8), list), new a(802480018, new zx8(list, tlsVar, i2), true));
                break;
            case 1:
                m6y m6yVar2 = (m6y) u6yVar;
                m6yVar2.f(list.size(), null, new qc0(list, 17), new a(2039820996, new m3x(list, tlsVar, scc.f(list)), true));
                break;
            case 2:
                m6y m6yVar3 = (m6y) u6yVar;
                m6yVar3.f(list.size(), new qc0(list, 27, new z0l0(18)), new rc0(list, 12, fhl0.a), new a(802480018, new zx8(list, tlsVar, 9), true));
                break;
            default:
                m6y m6yVar4 = (m6y) u6yVar;
                m6yVar4.f(list.size(), null, new tj(21, new umm0(i2), list), new a(802480018, new zx8(list, tlsVar, 10), true));
                break;
        }
        return zy11Var;
    }
}
