package defpackage;

import com.yandex.go.mob.HostMobSupportedApiNames;
import java.util.Arrays;

/* loaded from: classes9.dex */
public final class xl51 {
    public final ju6 a;
    public final String b;
    public final String c = "yandexgo_mobile_agreement";
    public final String d = "yandexgo_termsofuse";
    public final String e = "yandexgo_privacy_notice";

    public xl51(ju6 ju6Var, ko21 ko21Var) {
        this.a = ju6Var;
        this.b = ko21Var.a().a();
    }

    public final String a(String str) {
        String str2;
        not notVar = (not) this.a;
        notVar.getClass();
        HostMobSupportedApiNames hostMobSupportedApiNames = HostMobSupportedApiNames.LEGAL;
        String b = notVar.b(hostMobSupportedApiNames);
        if (b != null) {
            str2 = g8e.p(b, q5z.f0(hostMobSupportedApiNames, notVar.a), "/");
        } else {
            notVar.d.getClass();
            str2 = "https://yandexgo.com/legal/";
        }
        return String.format("%s%s/?lang=%s&amp;mode=html", Arrays.copyOf(new Object[]{str2, str, this.b}, 3));
    }
}
