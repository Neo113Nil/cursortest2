package defpackage;

import defpackage.owx;

/* loaded from: classes10.dex */
public final class xjw0 implements hwx {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ xjw0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.j35
    public final String getName() {
        switch (this.a) {
            case 0:
                return "SUPPORT_MESSAGES";
            default:
                return "UZ_DATA_STORE_DELEGATE";
        }
    }

    @Override // defpackage.hwx
    public final void k(owx owxVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                zjw0 zjw0Var = (zjw0) obj;
                owx.a aVar = owxVar.s;
                String str = aVar != null ? aVar.b : null;
                if (str != null && !evu0.J(str)) {
                    owx.a aVar2 = owxVar.s;
                    zjw0Var.a(aVar2 != null ? aVar2.a : 0, str);
                    break;
                } else {
                    zjw0Var.b(0);
                    break;
                }
                break;
            default:
                iy21 iy21Var = (iy21) owxVar.c(iy21.class);
                if (iy21Var != null) {
                    ((jy21) ((h3y) obj).get()).a(iy21Var.c);
                    break;
                }
                break;
        }
    }
}
