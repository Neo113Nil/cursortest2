package defpackage;

import androidx.compose.ui.platform.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class rl3 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ rl3(boolean z, long j, long j2, m0s m0sVar) {
        this.a = 2;
        this.b = z;
        this.d = j;
        this.e = j2;
        this.c = m0sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                yci yciVar = (yci) obj3;
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                a0g.e(this.b, null, yciVar, this.d, this.e, b0g.c, hq5Var, 0, 2);
            case 1:
                yci yciVar2 = (yci) obj3;
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                a0g.e(this.b, null, yciVar2, this.d, this.e, b0g.c, hq5Var2, 196608, 2);
            default:
                m0s m0sVar = (m0s) obj3;
                hq5 hq5Var3 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var3;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                long j = this.b ? this.d : this.e;
                oq5 oq5Var4 = (oq5) hq5Var3;
                oq5Var4.Z(1398288511);
                oq5Var4.p(false);
                String title = m0sVar.getTitle();
                yci a = a.a(neg.D(), "tab_item_title");
                h6g h6gVar = nu0.a;
                h6g h6gVar2 = h6g.c;
                xcs.b(title, a, j, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.j(), hq5Var3, 0, 3120, 55288);
        }
        return Unit.a;
    }

    public /* synthetic */ rl3(boolean z, yci yciVar, long j, long j2, int i) {
        this.a = i;
        this.b = z;
        this.c = yciVar;
        this.d = j;
        this.e = j2;
    }
}
