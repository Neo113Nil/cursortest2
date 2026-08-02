package defpackage;

import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.payment.tariffpaywall.TariffPaywallActivity;

/* loaded from: classes6.dex */
public final /* synthetic */ class w6s implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TariffPaywallActivity b;

    public /* synthetic */ w6s(TariffPaywallActivity tariffPaywallActivity, int i) {
        this.a = i;
        this.b = tariffPaywallActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        TariffPaywallActivity tariffPaywallActivity = this.b;
        switch (i) {
            case 0:
                int i2 = TariffPaywallActivity.z;
                return jik.class;
            case 1:
                int i3 = TariffPaywallActivity.z;
                lik likVar = (lik) tariffPaywallActivity.getIntent().getParcelableExtra("navigation_source_info");
                if (likVar != null) {
                    return likVar;
                }
                Assertions.throwOrSkip$default(new FailedAssertionException("invalid TariffPaywallActivity start param - PaywallNavigationSourceInfo"), null, 2, null);
                return new lik(vik.f, null, null);
            default:
                int i4 = TariffPaywallActivity.z;
                tariffPaywallActivity.y(null, null);
                return Unit.a;
        }
    }
}
