package defpackage;

import com.ybsdk.core.common.data.network.dto.CurrentPaymentMethodDto;
import com.ybsdk.core.common.data.network.dto.Me2MeInfo;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.data.network.dto.SavingsAccountInfo;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.common.data.network.dto.YandexAccountInfo;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.text.Text;
import java.util.Collections;

/* loaded from: classes15.dex */
public abstract class qgf {
    public static final h5a0 a(CurrentPaymentMethodDto currentPaymentMethodDto, w530 w530Var, boolean z) {
        lrp0 lrp0Var = lrp0.b;
        if (z) {
            Themes<String> logo = currentPaymentMethodDto.getLogo();
            if ((logo != null ? logo.getDark() : null) == null) {
                Themes<String> logo2 = currentPaymentMethodDto.getLogo();
                if ((logo2 != null ? logo2.getLight() : null) == null) {
                    x4c.g("Error getting the logo. Logo is required", null, currentPaymentMethodDto.getTitle(), null, 10);
                }
            }
        }
        switch (pgf.a[currentPaymentMethodDto.getInfo().getPaymentType().ordinal()]) {
            case 1:
                Me2MeInfo me2meInfo = currentPaymentMethodDto.getInfo().getMe2meInfo();
                if (me2meInfo != null && (r12 = me2meInfo.getPartnerId()) != null) {
                    Text.Constant i = g8e.i(Text.Companion, currentPaymentMethodDto.getTitle());
                    d5a0 d5a0Var = new d5a0(qxy0.c(currentPaymentMethodDto.getLogo(), null), false);
                    Themes<String> secondLogo = currentPaymentMethodDto.getSecondLogo();
                    ThemedImageUrlEntity c = secondLogo != null ? qxy0.c(secondLogo, null) : null;
                    d5a0 d5a0Var2 = new d5a0(qxy0.c(currentPaymentMethodDto.getLogo(), null), true);
                    String legalText = currentPaymentMethodDto.getLegalText();
                    Money money = currentPaymentMethodDto.getMoney();
                    break;
                } else {
                    x4c.g("There is no me2me info in auto topup method", null, currentPaymentMethodDto, Collections.singletonList(lrp0Var), 2);
                    break;
                }
            case 2:
                SavingsAccountInfo savingsAccountInfo = currentPaymentMethodDto.getInfo().getSavingsAccountInfo();
                if (savingsAccountInfo != null && (r13 = savingsAccountInfo.getAgreementId()) != null) {
                    Text.Constant i2 = g8e.i(Text.Companion, currentPaymentMethodDto.getTitle());
                    String subtitle = currentPaymentMethodDto.getSubtitle();
                    ThemedImageUrlEntity c2 = qxy0.c(currentPaymentMethodDto.getLogo(), null);
                    Themes<String> secondLogo2 = currentPaymentMethodDto.getSecondLogo();
                    ThemedImageUrlEntity c3 = secondLogo2 != null ? qxy0.c(secondLogo2, null) : null;
                    String legalText2 = currentPaymentMethodDto.getLegalText();
                    String selectedMethodDescription = currentPaymentMethodDto.getSelectedMethodDescription();
                    Money money2 = currentPaymentMethodDto.getMoney();
                    break;
                } else {
                    x4c.g("There is no savings account info in auto topup method", null, currentPaymentMethodDto, Collections.singletonList(lrp0Var), 2);
                    break;
                }
                break;
            case 3:
                YandexAccountInfo yandexAccountInfo = currentPaymentMethodDto.getInfo().getYandexAccountInfo();
                if (yandexAccountInfo != null && (r15 = yandexAccountInfo.getAgreementId()) != null) {
                    Text.Constant i3 = g8e.i(Text.Companion, currentPaymentMethodDto.getTitle());
                    String subtitle2 = currentPaymentMethodDto.getSubtitle();
                    ThemedImageUrlEntity c4 = qxy0.c(currentPaymentMethodDto.getLogo(), null);
                    Themes<String> secondLogo3 = currentPaymentMethodDto.getSecondLogo();
                    ThemedImageUrlEntity c5 = secondLogo3 != null ? qxy0.c(secondLogo3, null) : null;
                    String legalText3 = currentPaymentMethodDto.getLegalText();
                    Money money3 = currentPaymentMethodDto.getMoney();
                    break;
                } else {
                    x4c.g("There is no yandex account info in auto topup method", null, currentPaymentMethodDto, Collections.singletonList(lrp0Var), 2);
                    break;
                }
            case 4:
            case 5:
            case 6:
            case 7:
                x4c.g("Unsupported auto topup method", null, currentPaymentMethodDto, Collections.singletonList(lrp0Var), 2);
                break;
            default:
                w511.b();
                break;
        }
        return null;
    }
}
