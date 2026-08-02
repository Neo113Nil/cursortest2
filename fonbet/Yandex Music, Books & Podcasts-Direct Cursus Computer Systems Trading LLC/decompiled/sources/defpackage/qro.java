package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class qro extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ rro s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qro(rro rroVar, int i) {
        super(0);
        this.r = i;
        this.s = rroVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [arf, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.r;
        rro rroVar = this.s;
        switch (i) {
            case 0:
                rroVar.K(new mro(R.string.paymentsdk_sbp_payment_waiting_title, true, Integer.valueOf(R.string.paymentsdk_sbp_waiting_info)));
                break;
            default:
                rroVar.K(new mro(R.string.paymentsdk_sbp_payment_waiting_title, true, Integer.valueOf(R.string.paymentsdk_sbp_waiting_info)));
                ((fjs) rroVar.u.getValue()).c(5L, new qro(rroVar, 0));
                break;
        }
        return Unit.a;
    }
}
