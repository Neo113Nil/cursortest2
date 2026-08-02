package defpackage;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class xdi0 extends wsx0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xdi0(ydi0 ydi0Var) {
        super(oyr.t(new StringBuilder(), ydi0Var.n, " writer"), true);
        this.f = ydi0Var;
    }

    @Override // defpackage.wsx0
    public final long a() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                ydi0 ydi0Var = (ydi0) obj;
                try {
                } catch (IOException e) {
                    ydi0.e(ydi0Var, e, null, 2);
                }
                return ydi0Var.i() ? 0L : -1L;
            default:
                return ((Number) ((sls) obj).invoke()).longValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xdi0(sls slsVar, String str) {
        super(str, true);
        this.f = slsVar;
    }
}
