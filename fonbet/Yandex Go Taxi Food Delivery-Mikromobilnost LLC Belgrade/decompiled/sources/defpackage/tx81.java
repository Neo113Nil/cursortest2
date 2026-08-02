package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes11.dex */
public final class tx81 extends gy81 {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tx81(ux81 ux81Var, ux81 ux81Var2) {
        super(ux81Var2);
        this.c = ux81Var;
    }

    @Override // defpackage.gy81
    public final void a() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((ux81) obj).j(1);
                break;
            default:
                ((b25) obj).a(new ConnectionResult(16, null));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tx81(fy81 fy81Var, b25 b25Var) {
        super(fy81Var);
        this.c = b25Var;
    }
}
