package ru.yandex.taxi.analytics;

import com.yandex.auth.LegacyAccountType;
import defpackage.h3y;
import defpackage.hst;
import defpackage.jst;
import defpackage.kj;
import io.appmetrica.analytics.UserInfo;

/* loaded from: classes9.dex */
public final class s {
    public final h3y a;
    public final q b;

    public s(h3y h3yVar, q qVar) {
        this.a = h3yVar;
        this.b = qVar;
    }

    public static final void a(s sVar) {
        q qVar = sVar.b;
        kj Ig = ((ru.yandex.taxi.am.g) sVar.a.get()).a.Ig();
        if (Ig == null) {
            qVar.getClass();
            qVar.a(new MetricaWrapper$updateUserInfo$1(null, null));
            jst.e.getClass();
            return;
        }
        UserInfo userInfo = new UserInfo(String.valueOf(Ig.a));
        userInfo.setType(Ig.j ? LegacyAccountType.STRING_TEAM : Ig.n ? LegacyAccountType.STRING_LOGIN : Ig.o ? LegacyAccountType.STRING_SOCIAL : Ig.m ? "phone" : Ig.p ? "lite" : "");
        qVar.getClass();
        qVar.a(new MetricaWrapper$updateUserInfo$1(userInfo, null));
        hst hstVar = jst.e;
        userInfo.getUserId();
        userInfo.getType();
        hstVar.getClass();
    }
}
