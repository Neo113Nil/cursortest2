package defpackage;

import com.yandex.go.payments.api.shared.model.BusinessAccountMenuItemPosition;
import com.yandex.go.payments.shared.a;
import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;
import ru.yandex.taxi.gopayments.business.SharedAccountMenuViewModel;
import ru.yandex.taxi.gopayments.dto.SharedAccountType;
import ru.yandex.taxi.settings.main.f;
import ru.yandex.taxi.settings.support.g;

/* loaded from: classes6.dex */
public final class q500 {
    public final zuj0 a;
    public final g b;
    public final qw6 c;
    public final a d;

    public q500(zuj0 zuj0Var, g gVar, qw6 qw6Var, a aVar) {
        this.a = zuj0Var;
        this.b = gVar;
        this.c = qw6Var;
        this.d = aVar;
    }

    public final SharedAccountMenuViewModel a(String str, String str2, BusinessAccountMenuItemPosition businessAccountMenuItemPosition, snr0 snr0Var, f fVar, boolean z) {
        a aVar = this.d;
        cw6 cw6Var = aVar.c;
        if (!cw6Var.a.get() && snr0Var.c == SharedAccountType.BUSINESS) {
            cw6Var.a.set(true);
            aVar.a.d(SharedPaymentsOpenReason.MENU, true);
        }
        String h = snr0Var.e ? snr0Var.d : ((avj0) this.a).h(kyh0.shared_payment_inactive_default_error);
        return new SharedAccountMenuViewModel(str2, h, !snr0Var.e, z ? SharedAccountMenuViewModel.BadgeType.PROTECTION : SharedAccountMenuViewModel.BadgeType.NONE, new p7h(27, snr0Var, h, fVar), businessAccountMenuItemPosition, str);
    }
}
