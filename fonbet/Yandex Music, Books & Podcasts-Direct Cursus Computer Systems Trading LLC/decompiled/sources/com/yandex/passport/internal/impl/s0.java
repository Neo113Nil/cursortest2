package com.yandex.passport.internal.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ParcelFormatException;
import android.os.Parcelable;
import com.yandex.passport.api.z1;
import com.yandex.payment.sdk.ui.bind.BindCardActivity;
import com.yandex.payment.sdk.ui.payment.sbp.BindSbpActivity;
import defpackage.bfk;
import defpackage.c5b;
import defpackage.dm2;
import defpackage.fg3;
import defpackage.ix3;
import defpackage.jg3;
import defpackage.l1j;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.uh;
import defpackage.vq1;
import defpackage.xo0;
import defpackage.xq0;
import defpackage.xzi;
import defpackage.ysn;
import defpackage.z7o;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class s0 extends uh {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public s0(ysn ysnVar, com.yandex.plus.paymentsdk.internal.common.a aVar) {
        ysnVar.getClass();
        aVar.getClass();
        this.b = ysnVar;
        this.c = aVar;
    }

    @Override // defpackage.uh
    public final Intent createIntent(Context context, Object obj) {
        switch (this.a) {
            case 0:
                context.getClass();
                if (obj == null) {
                    return ((com.yandex.passport.api.i) this.b).f(context);
                }
                l1j.f();
                return null;
            case 1:
                context.getClass();
                ((Unit) obj).getClass();
                ysn ysnVar = (ysn) this.b;
                ysnVar.getClass();
                Intent putExtra = ysnVar.a(BindCardActivity.class, true).putExtra("com.yandex.payment.sdk.ui.network.extra.PAYMENT_CONTEXT", false).putExtra("com.yandex.payment.sdk.ui.network.extra.EXTRA_CAMERA_CARD_SCANNER", (Parcelable) null);
                putExtra.getClass();
                ysnVar.c(new xzi(xo0.CARD_BIND));
                return putExtra;
            default:
                context.getClass();
                ((Unit) obj).getClass();
                ysn ysnVar2 = (ysn) this.b;
                String str = (String) this.c;
                ysnVar2.getClass();
                Intent putExtra2 = ysnVar2.a(BindSbpActivity.class, true).putExtra("com.yandex.payment.sdk.ui.network.extra.PAYMENT_CONTEXT", false).putExtra("com.yandex.payment.sdk.ui.network.extra.EMAIL", ysnVar2.b.b).putExtra("com.yandex.payment.sdk.ui.network.extra.REDIRECT_URL", str);
                ysnVar2.c(new xzi(xo0.BIND_SBP_TOKEN));
                putExtra2.getClass();
                return putExtra2;
        }
    }

    @Override // defpackage.uh
    public final Object parseResult(int i, Intent intent) {
        Object obj;
        com.yandex.plus.paymentsdk.internal.method.c cVar;
        bfk bfkVar;
        fg3 fg3Var;
        bfk bfkVar2;
        jg3 jg3Var;
        int i2 = this.a;
        Object obj2 = this.c;
        com.yandex.plus.paymentsdk.internal.method.a aVar = com.yandex.plus.paymentsdk.internal.method.a.a;
        switch (i2) {
            case 0:
                if (intent == null) {
                    r7o r7oVar = z7o.b;
                    obj = new t7o(new com.yandex.passport.api.exception.c());
                } else if (i == -1) {
                    r7o r7oVar2 = z7o.b;
                    ((t0) obj2).getClass();
                    Bundle extras = intent.getExtras();
                    if (extras == null) {
                        xq0.q("no extras in result intent");
                        return null;
                    }
                    obj = (z1) com.appsflyer.internal.k.h(extras, com.yandex.passport.internal.util.p.class, "passport-uid");
                    if (obj == null) {
                        throw new ParcelFormatException("Invalid parcelable " + z1.class.getSimpleName() + " in the bundle");
                    }
                } else if (i != 13) {
                    r7o r7oVar3 = z7o.b;
                    obj = new t7o(new com.yandex.passport.api.exception.c());
                } else {
                    Bundle extras2 = intent.getExtras();
                    if (extras2 != null) {
                        Object serializable = extras2.getSerializable(Constants.KEY_EXCEPTION);
                        Exception exc = (Exception) (serializable instanceof Exception ? serializable : null);
                        if (exc != null) {
                            r7o r7oVar4 = z7o.b;
                            obj = new t7o(exc);
                        }
                    }
                    r7o r7oVar5 = z7o.b;
                    obj = new t7o(new com.yandex.passport.api.exception.c());
                }
                return new z7o(obj);
            case 1:
                if (intent == null || (fg3Var = (fg3) ((Parcelable) vq1.W(intent, "DATA", fg3.class))) == null) {
                    cVar = null;
                } else {
                    String str = fg3Var.a;
                    str.getClass();
                    ix3 ix3Var = ix3.a;
                    dm2 dm2Var = dm2.a;
                    c5b.a.getClass();
                    ((com.yandex.plus.paymentsdk.internal.common.a) obj2).getClass();
                    cVar = new com.yandex.plus.paymentsdk.internal.method.c(new com.yandex.plus.core.data.pay.a(str));
                }
                if (cVar != null) {
                    return cVar;
                }
                if (intent != null && (bfkVar = (bfk) ((Parcelable) vq1.W(intent, "ERROR", bfk.class))) != null) {
                    r6 = new com.yandex.plus.paymentsdk.internal.method.b(bfkVar.c, bfkVar.e, bfkVar.d, bfkVar.a.name(), bfkVar.b.name());
                }
                return r6 != null ? r6 : aVar;
            default:
                com.yandex.plus.paymentsdk.internal.method.c cVar2 = (intent == null || (jg3Var = (jg3) ((Parcelable) vq1.W(intent, "DATA", jg3.class))) == null) ? null : new com.yandex.plus.paymentsdk.internal.method.c(new com.yandex.plus.core.data.pay.b(jg3Var.a, null));
                if (cVar2 != null) {
                    return cVar2;
                }
                if (intent != null && (bfkVar2 = (bfk) ((Parcelable) vq1.W(intent, "ERROR", bfk.class))) != null) {
                    r6 = new com.yandex.plus.paymentsdk.internal.method.b(bfkVar2.c, bfkVar2.e, bfkVar2.d, bfkVar2.a.name(), bfkVar2.b.name());
                }
                return r6 != null ? r6 : aVar;
        }
    }

    public s0(ysn ysnVar, String str) {
        ysnVar.getClass();
        this.b = ysnVar;
        this.c = str;
    }

    public s0(com.yandex.passport.api.i iVar, t0 t0Var) {
        this.b = iVar;
        this.c = t0Var;
    }
}
