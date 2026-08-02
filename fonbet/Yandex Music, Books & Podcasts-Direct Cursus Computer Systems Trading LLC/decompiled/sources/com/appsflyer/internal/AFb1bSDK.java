package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.google.android.gms.common.api.Status;
import defpackage.cuk;
import defpackage.cxb;
import defpackage.h8s;
import defpackage.i6c;
import defpackage.iu0;
import defpackage.j8s;
import defpackage.kpm;
import defpackage.lno;
import defpackage.onx;
import defpackage.q5i;
import defpackage.qo0;
import defpackage.y8p;
import defpackage.yix;
import defpackage.ywf;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFb1bSDK implements AFb1hSDK {

    @NotNull
    private final AFf1iSDK getCurrencyIso4217Code;

    @NotNull
    private final AFc1oSDK getMonetizationNetwork;

    @NotNull
    private final AFc1hSDK getRevenue;

    public AFb1bSDK(@NotNull AFc1oSDK aFc1oSDK, @NotNull AFc1hSDK aFc1hSDK, @NotNull AFf1iSDK aFf1iSDK) {
        aFc1oSDK.getClass();
        aFc1hSDK.getClass();
        aFf1iSDK.getClass();
        this.getMonetizationNetwork = aFc1oSDK;
        this.getRevenue = aFc1hSDK;
        this.getCurrencyIso4217Code = aFf1iSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCurrencyIso4217Code(AFb1bSDK aFb1bSDK, iu0 iu0Var) {
        aFb1bSDK.getClass();
        AFc1oSDK aFc1oSDK = aFb1bSDK.getMonetizationNetwork;
        int i = iu0Var.b;
        String str = iu0Var.a;
        str.getClass();
        aFc1oSDK.areAllFieldsValid = new AFb1cSDK(i, str);
    }

    @Override // com.appsflyer.internal.AFb1hSDK
    public final void getMediationNetwork() {
        onx v;
        Context context = this.getRevenue.getMonetizationNetwork;
        if (context != null) {
            try {
                y8p y8pVar = new y8p(context, 19);
                yix yixVar = (yix) y8pVar.b;
                if (yixVar.l.b(yixVar.k, 212800000) == 0) {
                    q5i a = h8s.a();
                    a.d = new i6c[]{cxb.r};
                    a.c = new cuk(yixVar);
                    a.a = false;
                    a.b = 27601;
                    v = yixVar.c(0, a.c());
                } else {
                    v = ywf.v(new qo0(new Status(17, null, null, null)));
                }
                kpm kpmVar = new kpm(28, y8pVar);
                v.getClass();
                lno lnoVar = j8s.a;
                ((onx) v.f(lnoVar, kpmVar)).d(lnoVar, new c(this));
            } catch (Throwable th) {
                AFg1gSDK.e$default(AFLogger.INSTANCE, AFh1zSDK.APP_SET_ID, "Error while trying to  fetch App set ID", th, false, false, false, false, 120, null);
            }
        }
    }

    @Override // com.appsflyer.internal.AFb1hSDK
    public final boolean getRevenue() {
        return !this.getCurrencyIso4217Code.getMediationNetwork() && AFj1nSDK.getRevenue(this.getRevenue.getMonetizationNetwork) && AFj1nSDK.AFAdRevenueData(this.getRevenue.getMonetizationNetwork);
    }
}
