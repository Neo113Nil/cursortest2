package ru.yandex.taxi.plus.purchase;

import defpackage.ad5;
import defpackage.d59;
import defpackage.l0v0;
import defpackage.oy80;
import defpackage.rid0;
import defpackage.sid0;
import defpackage.tzf0;
import defpackage.u0v0;
import defpackage.vfc0;
import defpackage.znp0;
import ru.yandex.taxi.plus.api.dto.menu.button.ButtonAction;
import ru.yandex.taxi.plus.purchase.domain.PurchaseStatus;
import ru.yandex.taxi.plus.purchase.domain.UpgradeStatus;
import ru.yandex.taxi.plus.sdk.home.config.OpenPlusSubscriptionAction;

/* loaded from: classes6.dex */
public final class d extends ad5 {
    public final com.yandex.go.payments.plus.domain.c A;
    public final tzf0 B;
    public final oy80 C;
    public final rid0 D;
    public final String E;
    public u0v0 F;
    public final d59 x;
    public final ru.yandex.taxi.plus.repository.c y;
    public final ru.yandex.taxi.plus.purchase.domain.a z;

    public d(d59 d59Var, ru.yandex.taxi.plus.repository.c cVar, ru.yandex.taxi.plus.purchase.domain.a aVar, com.yandex.go.payments.plus.domain.c cVar2, tzf0 tzf0Var, oy80 oy80Var, rid0 rid0Var, String str) {
        super(sid0.class);
        this.x = d59Var;
        this.y = cVar;
        this.z = aVar;
        this.A = cVar2;
        this.B = tzf0Var;
        this.C = oy80Var;
        this.D = rid0Var;
        this.E = str;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        OpenPlusSubscriptionAction openPlusSubscriptionAction = OpenPlusSubscriptionAction.NONE;
        tzf0 tzf0Var = this.B;
        tzf0Var.b = openPlusSubscriptionAction;
        vfc0 vfc0Var = tzf0Var.a;
        if (vfc0Var != null) {
            vfc0Var.f();
        }
        super.Cg();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if ((r0 != null ? defpackage.fib1.d(r0.d) : false) == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Kg() {
        znp0 znp0Var;
        if (this.B.b == OpenPlusSubscriptionAction.BUY_SUBSCRIPTION) {
            znp0 znp0Var2 = this.z.a.a.a;
        }
        if (this.B.b != OpenPlusSubscriptionAction.UPGRADE_SUBSCRIPTION || (znp0Var = this.z.a.a.a) == null) {
            return;
        }
        l0v0 l0v0Var = znp0Var.d;
        UpgradeStatus upgradeStatus = l0v0Var.d;
        if (upgradeStatus == UpgradeStatus.UPGRADE_AVAILABLE || upgradeStatus == UpgradeStatus.NETWORK_OR_SERVER_ERROR) {
            PurchaseStatus purchaseStatus = l0v0Var.c;
            ButtonAction buttonAction = l0v0Var.a;
            if (purchaseStatus != PurchaseStatus.PURCHASED || buttonAction != ButtonAction.PLUS_UPGRADE) {
                return;
            }
            com.yandex.go.coroutines.b.g(Jg(), null, null, new PlusPurchasePresenter$subscribeActionClicked$1(false, this, null), 3);
        }
    }
}
