package com.yandex.passport.internal.ui.sloth.ebs;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ParcelFormatException;
import com.yandex.passport.api.r1;
import com.yandex.passport.api.s1;
import com.yandex.passport.api.t1;
import com.yandex.passport.api.y1;
import com.yandex.passport.api.z1;
import com.yandex.passport.internal.ui.sloth.plusdevices.ManagingPlusDevicesActivity;
import com.yandex.passport.internal.ui.sloth.plusdevices.ManagingPlusDevicesHelperActivity;
import com.yandex.passport.internal.ui.sloth.plusdevices.ManagingPlusDevicesSlothActivity;
import com.yandex.passport.internal.ui.sloth.webauthn.RegisterWebAuthNActivity;
import com.yandex.passport.internal.ui.sloth.webcard.WebCardComposeActivity;
import com.yandex.passport.internal.ui.sloth.webcard.WebCardSlothActivity;
import defpackage.cxb;
import defpackage.uh;
import defpackage.vq2;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.Serializable;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class n1 extends uh {
    public final /* synthetic */ int a;

    public /* synthetic */ n1(int i) {
        this.a = i;
    }

    @Override // defpackage.uh
    public final Intent createIntent(Context context, Object obj) {
        switch (this.a) {
            case 0:
                context.getClass();
                ((com.yandex.passport.common.ebs.a) obj).getClass();
                return new Intent(context, (Class<?>) StubBiometricActivity.class);
            case 1:
                context.getClass();
                ((com.yandex.passport.common.ebs.g) obj).getClass();
                return new Intent(context, (Class<?>) StubBiometricActivity.class);
            case 2:
                com.yandex.passport.api.e1 e1Var = (com.yandex.passport.api.e1) obj;
                context.getClass();
                e1Var.getClass();
                Intent intent = new Intent(context, (Class<?>) ManagingPlusDevicesActivity.class);
                intent.putExtras(cxb.K(new Pair("key_managing_plus_devices_properties", com.yandex.passport.internal.ui.a.E(e1Var))));
                return intent;
            case 3:
                com.yandex.passport.api.e1 e1Var2 = (com.yandex.passport.api.e1) obj;
                context.getClass();
                e1Var2.getClass();
                Intent intent2 = new Intent(context, (Class<?>) ManagingPlusDevicesHelperActivity.class);
                intent2.putExtras(cxb.K(new Pair("key_managing_plus_devices_properties", com.yandex.passport.internal.ui.a.E(e1Var2))));
                return intent2;
            case 4:
                com.yandex.passport.sloth.data.m mVar = (com.yandex.passport.sloth.data.m) obj;
                context.getClass();
                mVar.getClass();
                Bundle[] bundleArr = {mVar.t()};
                Bundle bundle = new Bundle();
                bundle.putAll(bundleArr[0]);
                return vq2.A(context, ManagingPlusDevicesSlothActivity.class, bundle);
            case 5:
                com.yandex.passport.internal.properties.z zVar = (com.yandex.passport.internal.properties.z) obj;
                context.getClass();
                zVar.getClass();
                Intent intent3 = new Intent(context, (Class<?>) RegisterWebAuthNActivity.class);
                y1 y1Var = zVar.a;
                z1 D = com.yandex.passport.internal.ui.a.D(zVar.b);
                y1Var.getClass();
                intent3.putExtras(cxb.K(new Pair("register_webauthn_props", new com.yandex.passport.internal.ui.sloth.webauthn.f(com.yandex.plus.pay.ui.core.b.L(D), com.yandex.plus.pay.ui.core.b.G(y1Var)))));
                return intent3;
            case 6:
                com.yandex.passport.sloth.data.m mVar2 = (com.yandex.passport.sloth.data.m) obj;
                context.getClass();
                mVar2.getClass();
                Bundle[] bundleArr2 = {mVar2.t()};
                Bundle bundle2 = new Bundle();
                bundle2.putAll(bundleArr2[0]);
                return vq2.A(context, WebCardComposeActivity.class, bundle2);
            default:
                com.yandex.passport.sloth.data.m mVar3 = (com.yandex.passport.sloth.data.m) obj;
                context.getClass();
                mVar3.getClass();
                Bundle[] bundleArr3 = {mVar3.t()};
                Bundle bundle3 = new Bundle();
                bundle3.putAll(bundleArr3[0]);
                return vq2.A(context, WebCardSlothActivity.class, bundle3);
        }
    }

    @Override // defpackage.uh
    public final Object parseResult(int i, Intent intent) {
        Bundle extras;
        com.yandex.passport.api.exception.j tVar;
        Bundle extras2;
        Bundle extras3;
        String string;
        switch (this.a) {
            case 0:
                return com.yandex.passport.common.ebs.d.a;
            case 1:
                return com.yandex.passport.common.ebs.i.a;
            case 2:
                return i != -1 ? i != 0 ? i != 401 ? i != 1111 ? new com.yandex.passport.api.g1(new com.yandex.passport.api.exception.t("Unexpected error")) : new com.yandex.passport.api.g1(new com.yandex.passport.api.exception.i(0)) : new com.yandex.passport.api.g1(new com.yandex.passport.api.exception.a()) : com.yandex.passport.api.f1.a : com.yandex.passport.api.f1.b;
            case 3:
                return i != -1 ? i != 0 ? i != 401 ? i != 1111 ? new com.yandex.passport.api.g1(new com.yandex.passport.api.exception.t("Unexpected error")) : new com.yandex.passport.api.g1(new com.yandex.passport.api.exception.i(0)) : new com.yandex.passport.api.g1(new com.yandex.passport.api.exception.a()) : com.yandex.passport.api.f1.a : com.yandex.passport.api.f1.b;
            case 4:
                return Integer.valueOf(i);
            case 5:
                if (i == -1) {
                    return t1.a;
                }
                if (i == 0) {
                    return r1.a;
                }
                Exception exc = null;
                exc = null;
                if (i == 13) {
                    if (intent != null && (extras = intent.getExtras()) != null) {
                        Serializable serializable = extras.getSerializable(Constants.KEY_EXCEPTION);
                        exc = (Exception) (serializable instanceof Exception ? serializable : null);
                    }
                    return new s1(exc != null ? new com.yandex.passport.api.exception.t(exc) : new com.yandex.passport.api.exception.t("Unknown error"));
                }
                if (i == 401) {
                    return new s1(new com.yandex.passport.api.exception.a());
                }
                if (i != 501) {
                    if (i != 601) {
                        return new s1(new com.yandex.passport.api.exception.t("Unexpected error"));
                    }
                    return new s1((intent == null || (extras3 = intent.getExtras()) == null || (string = extras3.getString("webauthn_errors", null)) == null) ? new com.yandex.passport.api.exception.t("Unknown error") : new com.yandex.passport.api.exception.i(string));
                }
                if (intent == null || (extras2 = intent.getExtras()) == null) {
                    tVar = new com.yandex.passport.api.exception.t("Account with uid not found");
                } else {
                    z1 z1Var = (z1) com.appsflyer.internal.k.h(extras2, com.yandex.passport.internal.util.p.class, "passport-uid");
                    if (z1Var == null) {
                        throw new ParcelFormatException("Invalid parcelable " + z1.class.getSimpleName() + " in the bundle");
                    }
                    tVar = new com.yandex.passport.api.exception.b(z1Var);
                }
                return new s1(tVar);
            case 6:
                return com.yandex.passport.internal.ui.sloth.webcard.w.b(i, intent);
            default:
                return com.yandex.passport.internal.ui.sloth.webcard.w.b(i, intent);
        }
    }
}
