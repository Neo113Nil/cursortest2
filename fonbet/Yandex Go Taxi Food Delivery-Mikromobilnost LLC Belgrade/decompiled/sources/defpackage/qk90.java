package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.scooters.data.model.PurchaseStatus;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lqk90;", "", "Companion", "ok90", "pk90", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class qk90 {
    public static final pk90 Companion = new pk90();
    public static final i3y[] c = {a.b(LazyThreadSafetyMode.PUBLICATION, new aw80(29)), null};
    public final PurchaseStatus a;
    public final b0g0 b;

    public /* synthetic */ qk90(int i, PurchaseStatus purchaseStatus, b0g0 b0g0Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = purchaseStatus;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = b0g0Var;
        }
    }

    public qk90() {
        this.a = null;
        this.b = null;
    }
}
