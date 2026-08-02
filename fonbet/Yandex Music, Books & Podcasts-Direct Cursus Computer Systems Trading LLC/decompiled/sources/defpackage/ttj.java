package defpackage;

import com.yandex.passport.sloth.ui.dependencies.m;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ttj extends s17 {
    public static final ttj e;
    public static final ttj f;
    public static final ttj g;
    public static final ttj h;
    public final /* synthetic */ int d;

    static {
        int i = 1;
        e = new ttj(i, 2, 0);
        int i2 = 1;
        f = new ttj(i2, i2, 1);
        g = new ttj(i, 2, 2);
        int i3 = 1;
        h = new ttj(i3, i3, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ttj(int i, int i2, int i3) {
        super(i, i2, 1, (byte) 0);
        this.d = i3;
    }

    @Override // defpackage.s17
    public final void a(n8n n8nVar, nw0 nw0Var, oxq oxqVar, m mVar) {
        int i;
        int i2;
        switch (this.d) {
            case 0:
                Object invoke = ((Function0) n8nVar.j(0)).invoke();
                w80 w80Var = (w80) n8nVar.j(1);
                int i3 = n8nVar.i(0);
                w80Var.getClass();
                oxqVar.V(oxqVar.c(w80Var), invoke);
                nw0Var.e(i3, invoke);
                nw0Var.i(invoke);
                break;
            case 1:
                w80 w80Var2 = (w80) n8nVar.j(0);
                int i4 = n8nVar.i(0);
                nw0Var.l();
                w80Var2.getClass();
                nw0Var.h(i4, oxqVar.C(oxqVar.c(w80Var2)));
                break;
            case 2:
                Object j = n8nVar.j(0);
                w80 w80Var3 = (w80) n8nVar.j(1);
                int i5 = n8nVar.i(0);
                if (j instanceof fun) {
                    ((eqi) mVar.d).d((fun) j);
                }
                int c = oxqVar.c(w80Var3);
                int g2 = oxqVar.g(oxqVar.N(c, i5));
                Object[] objArr = oxqVar.c;
                Object obj = objArr[g2];
                objArr[g2] = j;
                if (!(obj instanceof fun)) {
                    if (obj instanceof xmn) {
                        ((xmn) obj).c();
                        break;
                    }
                } else {
                    int o = oxqVar.o() - oxqVar.N(c, i5);
                    fun funVar = (fun) obj;
                    w80 w80Var4 = funVar.b;
                    if (w80Var4 == null || !w80Var4.a()) {
                        i = -1;
                        i2 = -1;
                    } else {
                        i = oxqVar.c(w80Var4);
                        i2 = oxqVar.o() - oxqVar.O(i);
                    }
                    mVar.D(o, i, funVar, i2);
                    break;
                }
                break;
            default:
                Object j2 = n8nVar.j(0);
                int i6 = n8nVar.i(0);
                if (j2 instanceof fun) {
                    ((eqi) mVar.d).d((fun) j2);
                }
                int g3 = oxqVar.g(oxqVar.N(oxqVar.t, i6));
                Object[] objArr2 = oxqVar.c;
                Object obj2 = objArr2[g3];
                objArr2[g3] = j2;
                if (!(obj2 instanceof fun)) {
                    if (obj2 instanceof xmn) {
                        ((xmn) obj2).c();
                        break;
                    }
                } else {
                    mVar.D(oxqVar.o() - oxqVar.N(oxqVar.t, i6), -1, (fun) obj2, -1);
                    break;
                }
                break;
        }
    }
}
