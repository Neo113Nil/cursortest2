package defpackage;

import com.yandex.go.chargers.partner_subscription.data.LoyaltyTermsLink$LoyaltyTermsLinkAction$OpenUrl;
import com.yandex.go.chargers.partner_subscription.data.m;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public final class vxz extends xqt {
    public static final vxz e = new vxz();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, m.INSTANCE.serializer(), qoi0.a(m.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("open_url", LoyaltyTermsLink$LoyaltyTermsLinkAction$OpenUrl.Companion.serializer(), qoi0.a(LoyaltyTermsLink$LoyaltyTermsLinkAction$OpenUrl.class)));
    }
}
