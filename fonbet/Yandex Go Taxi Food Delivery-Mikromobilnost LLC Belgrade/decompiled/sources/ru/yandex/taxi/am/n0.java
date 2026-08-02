package ru.yandex.taxi.am;

import com.yandex.passport.api.PushPlatform;
import defpackage.jo90;
import defpackage.tje;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes9.dex */
public final class n0 implements com.yandex.passport.api.i0 {
    public final /* synthetic */ jo90 a;

    public n0(jo90 jo90Var) {
        this.a = jo90Var;
    }

    @Override // com.yandex.passport.api.i0
    public final PushPlatform a() {
        return PushPlatform.FCM;
    }

    public final String b(String str) {
        return (String) tje.Y(EmptyCoroutineContext.a, new PassportInitializer$waitWithTimeout$1(new PassportInitializer$init$1$1$1(this.a, str, null), SupportedPushPlatform.FCM, null));
    }

    @Override // com.yandex.passport.api.i0
    public final String getToken() {
        return b("1087931301371");
    }
}
