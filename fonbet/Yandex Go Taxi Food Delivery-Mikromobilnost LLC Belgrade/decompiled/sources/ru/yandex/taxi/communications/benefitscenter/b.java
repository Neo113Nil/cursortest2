package ru.yandex.taxi.communications.benefitscenter;

import android.content.Context;
import defpackage.fu4;
import defpackage.qn5;
import defpackage.tj60;
import defpackage.tje;
import defpackage.tse;

/* loaded from: classes9.dex */
public final class b {
    public final Context a;
    public final tse b;
    public final a c;
    public final tj60 d;

    public b(Context context, tse tseVar, a aVar, tj60 tj60Var) {
        this.a = context;
        this.b = tseVar;
        this.c = aVar;
        this.d = tj60Var;
    }

    public final BenefitsCenterNotification a(String str, String str2) {
        BenefitsCenterNotification benefitsCenterNotification = new BenefitsCenterNotification("benefits-center-notification", str, str2, this.a);
        benefitsCenterNotification.startExpiresTimer(5000L);
        benefitsCenterNotification.setExpiresListener(new qn5(0, this, benefitsCenterNotification));
        return benefitsCenterNotification;
    }

    public final void b(String str, String str2, fu4 fu4Var) {
        BenefitsCenterNotification a = a(str, str2);
        this.d.e(a);
        if (fu4Var != null) {
            a.showShimmer();
            tje.N(this.b, null, null, new BenefitsCenterNotificationManagerImpl$show$2(this, fu4Var, a, null), 3);
        }
    }

    public final void c(String str, String str2, String str3) {
        BenefitsCenterNotification a = a(str, str2);
        this.d.e(a);
        if (str3 != null) {
            a.showShimmer();
            tje.N(this.b, null, null, new BenefitsCenterNotificationManagerImpl$show$1(this, str3, a, null), 3);
        }
    }
}
