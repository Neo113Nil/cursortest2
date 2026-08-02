package ru.yandex.taxi.am.internal;

import android.net.Uri;
import defpackage.ep90;
import defpackage.evu0;
import defpackage.kj;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.u02;
import defpackage.vqy;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.am.k;

/* loaded from: classes9.dex */
public final class e {
    public final ep90 a;
    public final k b;
    public final u02 c;

    public e(u02 u02Var, ep90 ep90Var, k kVar) {
        this.a = ep90Var;
        this.b = kVar;
        this.c = u02Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        PassportAuthorizationUrlInteractor$wrapToAuthorizationUrl$1 passportAuthorizationUrlInteractor$wrapToAuthorizationUrl$1;
        int i;
        List W;
        if (continuationImpl instanceof PassportAuthorizationUrlInteractor$wrapToAuthorizationUrl$1) {
            passportAuthorizationUrlInteractor$wrapToAuthorizationUrl$1 = (PassportAuthorizationUrlInteractor$wrapToAuthorizationUrl$1) continuationImpl;
            int i2 = passportAuthorizationUrlInteractor$wrapToAuthorizationUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passportAuthorizationUrlInteractor$wrapToAuthorizationUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = passportAuthorizationUrlInteractor$wrapToAuthorizationUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passportAuthorizationUrlInteractor$wrapToAuthorizationUrl$1.label;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                kotlin.b.b(obj);
                kj Ig = this.b.Ig();
                if (Ig == null || Ig.m) {
                    return new Result.Failure(new IllegalArgumentException("not authorized with Yandex account"));
                }
                String host = Uri.parse(str).getHost();
                if (host == null || host.length() == 0) {
                    return new Result.Failure(new IllegalArgumentException(oyr.p("Can't examine host for return url '", str, "'")));
                }
                W = evu0.W(host, new String[]{Extension.DOT_CHAR}, (r2 & 4) != 0 ? 0 : 2);
                String[] strArr = (String[]) W.toArray(new String[0]);
                String str2 = strArr[strArr.length - 1];
                com.yandex.passport.api.b a = this.a.a();
                vqy vqyVar = new vqy(this, Ig, str, str2, 12);
                passportAuthorizationUrlInteractor$wrapToAuthorizationUrl$1.L$0 = null;
                passportAuthorizationUrlInteractor$wrapToAuthorizationUrl$1.L$1 = null;
                passportAuthorizationUrlInteractor$wrapToAuthorizationUrl$1.L$2 = null;
                passportAuthorizationUrlInteractor$wrapToAuthorizationUrl$1.L$3 = null;
                passportAuthorizationUrlInteractor$wrapToAuthorizationUrl$1.L$4 = null;
                passportAuthorizationUrlInteractor$wrapToAuthorizationUrl$1.label = 1;
                Object p = a.p(vqyVar, passportAuthorizationUrlInteractor$wrapToAuthorizationUrl$1);
                return p == coroutineSingletons ? coroutineSingletons : p;
            }
        }
        passportAuthorizationUrlInteractor$wrapToAuthorizationUrl$1 = new PassportAuthorizationUrlInteractor$wrapToAuthorizationUrl$1(this, continuationImpl);
        Object obj2 = passportAuthorizationUrlInteractor$wrapToAuthorizationUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passportAuthorizationUrlInteractor$wrapToAuthorizationUrl$1.label;
        if (i == 0) {
        }
    }
}
