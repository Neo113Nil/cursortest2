package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class f47 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ g47 s;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f47(g47 g47Var, int i, int i2) {
        super(0);
        this.r = i2;
        this.s = g47Var;
        this.t = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.r;
        int i2 = this.t;
        g47 g47Var = this.s;
        switch (i) {
            case 0:
                g47Var.q.getClass();
                g47Var.K(new y37(i2, true, Integer.valueOf(R.string.paymentsdk_divkit_sbp_waiting_info)));
                break;
            default:
                g47Var.K(new y37(i2, 4));
                g47Var.L();
                break;
        }
        return Unit.a;
    }
}
