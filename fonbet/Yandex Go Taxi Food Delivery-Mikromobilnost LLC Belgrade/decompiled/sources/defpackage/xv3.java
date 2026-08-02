package defpackage;

import com.ybsdk.core.common.data.network.dto.HmacDto;
import com.ybsdk.core.common.data.network.dto.Me2MeInfo;
import com.ybsdk.core.common.data.network.dto.PaymentMethodInfoDto;
import com.ybsdk.core.common.data.network.dto.SavingsAccountInfo;
import com.ybsdk.core.common.data.network.dto.YandexAccountInfo;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.feature.autotopup.api.AutoTopupSwitchStatus;
import com.ybsdk.feature.autotopup.api.AutoTopupType;
import com.ybsdk.feature.autotopup.internal.data.AutoTopupHmacHelper$RegularAutotopupHmacType;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Locale;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class xv3 implements wv3 {
    public final mf1 a;

    public xv3(mf1 mf1Var) {
        this.a = mf1Var;
    }

    public final HmacDto a(yv3 yv3Var, String str, String str2, String str3, String str4) {
        BigDecimal bigDecimal;
        lr3 lr3Var = yv3Var.f;
        q5a0 q5a0Var = yv3Var.c;
        String str5 = this.a.b;
        String str6 = null;
        if (str5 == null) {
            ny61.g("Failed requirement.");
            return null;
        }
        String str7 = str2 == null ? "" : str2;
        BigDecimal bigDecimal2 = yv3Var.a;
        String a = bigDecimal2 != null ? tm60.a(bigDecimal2) : null;
        if (a == null) {
            a = "";
        }
        BigDecimal bigDecimal3 = yv3Var.b;
        String a2 = bigDecimal3 != null ? tm60.a(bigDecimal3) : null;
        if (a2 == null) {
            a2 = "";
        }
        String name = q5a0Var.d.name();
        String str8 = q5a0Var.a;
        if (str8 == null) {
            str8 = "";
        }
        String str9 = q5a0Var.b;
        if (str9 == null) {
            str9 = "";
        }
        String str10 = q5a0Var.c;
        if (str10 == null) {
            str10 = "";
        }
        AutoTopupType autoTopupType = yv3Var.d;
        String name2 = autoTopupType != null ? autoTopupType.name() : null;
        if (name2 == null) {
            name2 = "";
        }
        AutoTopupSwitchStatus autoTopupSwitchStatus = yv3Var.e;
        String name3 = autoTopupSwitchStatus != null ? autoTopupSwitchStatus.name() : null;
        if (name3 == null) {
            name3 = "";
        }
        String bool = lr3Var != null ? Boolean.valueOf(lr3Var.a).toString() : null;
        if (bool == null) {
            bool = "";
        }
        if (lr3Var != null && (bigDecimal = lr3Var.b) != null) {
            str6 = tm60.a(bigDecimal);
        }
        if (str6 == null) {
            str6 = "";
        }
        String str11 = str4 == null ? "" : str4;
        StringBuilder w = oyr.w(str3, str, str7, a, a2);
        g8e.D(w, name, str8, str9, str10);
        g8e.D(w, name2, name3, bool, str6);
        w.append(str11);
        String lowerCase = w.toString().toLowerCase(Locale.ROOT);
        Mac mac = Mac.getInstance("HmacSHA256");
        Charset charset = uza.a;
        mac.init(new SecretKeySpec(str5.getBytes(charset), "HmacSHA256"));
        return new HmacDto(j73.K(mac.doFinal(lowerCase.getBytes(charset)), "", new a5f(5), 30), HmacDto.Version.ONE);
    }

    public final HmacDto b(Integer num, MoneyEntity moneyEntity, boolean z, zri0 zri0Var, String str, AutoTopupHmacHelper$RegularAutotopupHmacType autoTopupHmacHelper$RegularAutotopupHmacType) {
        String str2 = this.a.b;
        if (str2 == null) {
            ny61.g("Failed requirement.");
            return null;
        }
        PaymentMethodInfoDto e = qb91.e(zri0Var.d);
        YandexAccountInfo yandexAccountInfo = e.getYandexAccountInfo();
        String agreementId = yandexAccountInfo != null ? yandexAccountInfo.getAgreementId() : null;
        if (agreementId == null) {
            agreementId = "";
        }
        SavingsAccountInfo savingsAccountInfo = e.getSavingsAccountInfo();
        String agreementId2 = savingsAccountInfo != null ? savingsAccountInfo.getAgreementId() : null;
        if (agreementId2 == null) {
            agreementId2 = "";
        }
        Me2MeInfo me2meInfo = e.getMe2meInfo();
        String partnerId = me2meInfo != null ? me2meInfo.getPartnerId() : null;
        if (partnerId == null) {
            partnerId = "";
        }
        String str3 = zri0Var.b;
        String name = zri0Var.a.name();
        String a = tm60.a(moneyEntity.getAmount());
        String currency = moneyEntity.getCurrency();
        String name2 = autoTopupHmacHelper$RegularAutotopupHmacType.name();
        List h = scc.h(num);
        StringBuilder w = oyr.w(str, agreementId, agreementId2, partnerId, str3);
        g8e.D(w, name, "PERIODIC", a, currency);
        w.append(name2);
        w.append(h);
        w.append(z);
        String lowerCase = w.toString().toLowerCase(Locale.ROOT);
        Mac mac = Mac.getInstance("HmacSHA256");
        Charset charset = uza.a;
        mac.init(new SecretKeySpec(str2.getBytes(charset), "HmacSHA256"));
        return new HmacDto(j73.K(mac.doFinal(lowerCase.getBytes(charset)), "", new a5f(5), 30), HmacDto.Version.ONE);
    }

    public final HmacDto c(String str, String str2, String str3, String str4) {
        String str5 = this.a.b;
        if (str5 == null) {
            ny61.g("Failed requirement.");
            return null;
        }
        String lowerCase = unr0.o(str4, str, str2, str3).toLowerCase(Locale.ROOT);
        Mac mac = Mac.getInstance("HmacSHA256");
        Charset charset = uza.a;
        mac.init(new SecretKeySpec(str5.getBytes(charset), "HmacSHA256"));
        return new HmacDto(j73.K(mac.doFinal(lowerCase.getBytes(charset)), "", new a5f(5), 30), HmacDto.Version.ONE);
    }
}
