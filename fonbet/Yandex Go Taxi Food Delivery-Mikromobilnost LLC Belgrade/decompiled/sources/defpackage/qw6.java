package defpackage;

import com.yandex.go.payments.api.shared.model.EntryPoints;
import com.yandex.go.payments.api.shared.model.PaymentSummaryEntryPoints;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.gopayments.dto.SharedAccountType;

/* loaded from: classes8.dex */
public final class qw6 {
    public final znr0 a;

    public qw6(znr0 znr0Var) {
        this.a = znr0Var;
    }

    public final boolean a(tmr0 tmr0Var) {
        List list;
        PaymentSummaryEntryPoints paymentSummaryEntryPoints;
        if (tmr0Var.a() != SharedAccountType.BUSINESS) {
            return false;
        }
        EntryPoints entryPoints = tmr0Var.n;
        if (entryPoints == null || (paymentSummaryEntryPoints = entryPoints.b) == null || (list = paymentSummaryEntryPoints.b) == null) {
            list = EmptyList.a;
        }
        if (this.a.a(list)) {
            return true;
        }
        return !tmr0Var.l;
    }
}
