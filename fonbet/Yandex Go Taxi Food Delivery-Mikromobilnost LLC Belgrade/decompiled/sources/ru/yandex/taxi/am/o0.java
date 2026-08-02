package ru.yandex.taxi.am;

import com.yandex.passport.api.PushPlatform;
import defpackage.jo90;
import defpackage.tje;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes9.dex */
public final class o0 implements com.yandex.passport.api.i0 {
    public final /* synthetic */ jo90 a;

    public o0(jo90 jo90Var) {
        this.a = jo90Var;
    }

    @Override // com.yandex.passport.api.i0
    public final PushPlatform a() {
        return PushPlatform.HMS;
    }

    @Override // com.yandex.passport.api.i0
    public final String getToken() {
        return (String) tje.Y(EmptyCoroutineContext.a, new PassportInitializer$waitWithTimeout$1(new PassportInitializer$init$1$2$1(this.a, null), SupportedPushPlatform.HMS, null));
    }
}
