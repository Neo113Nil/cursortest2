package defpackage;

import com.yandex.go.promocodes.referral.api.net.dto.ReferralCode;
import com.yandex.go.promocodes.referral.api.net.dto.ReferralOverrides;
import com.yandex.go.promocodes.referral.api.net.dto.ReferralService;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class wni0 implements vpr {
    public final /* synthetic */ xni0 a;

    public wni0(xni0 xni0Var) {
        this.a = xni0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        ReferralCode referralCode = (ReferralCode) obj;
        ReferralService referralService = referralCode.i;
        xni0 xni0Var = this.a;
        xni0Var.C = referralService;
        ReferralOverrides.Map map = referralCode.h.d;
        xni0Var.D = map != null ? map.a : null;
        return zy11.a;
    }
}
