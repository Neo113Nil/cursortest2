package com.yandex.passport.internal.sso.announcing;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.analytics.r;
import com.yandex.passport.internal.methods.z5;
import com.yandex.passport.internal.sso.SsoContentProvider;
import com.yandex.passport.internal.sso.g;
import com.yandex.passport.internal.sso.j;
import com.yandex.passport.internal.sso.l;
import com.yandex.passport.internal.sso.m;
import defpackage.b6e;
import defpackage.hrg;
import defpackage.wvs;
import defpackage.xy0;
import defpackage.zqf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
public final class e {
    public final Context a;
    public final g b;
    public final l c;
    public final o0 d;
    public final j e;
    public final zqf f;

    public e(Context context, g gVar, l lVar, o0 o0Var, j jVar, zqf zqfVar) {
        context.getClass();
        gVar.getClass();
        lVar.getClass();
        o0Var.getClass();
        jVar.getClass();
        zqfVar.getClass();
        this.a = context;
        this.b = gVar;
        this.c = lVar;
        this.d = o0Var;
        this.e = jVar;
        this.f = zqfVar;
    }

    public final void a(com.yandex.passport.internal.sso.d dVar, d dVar2, ArrayList arrayList) {
        int ordinal = dVar2.ordinal();
        o0 o0Var = this.d;
        if (ordinal == 0) {
            String str = dVar.a;
            o0Var.getClass();
            str.getClass();
            o0Var.i(str, r.g);
        } else {
            if (ordinal != 1) {
                b6e.s();
                return;
            }
            String str2 = dVar.a;
            o0Var.getClass();
            str2.getClass();
            o0Var.i(str2, r.h);
        }
        String str3 = dVar.a;
        j jVar = this.e;
        jVar.getClass();
        str3.getClass();
        Set set = com.yandex.passport.internal.sso.c.c;
        Bundle a = jVar.a(str3, SsoContentProvider.Method.InsertAccounts, com.yandex.plus.core.network.api.utils.a.w(arrayList));
        if (a == null) {
            wvs.p(hrg.q("Unable insert accounts to ", str3, " : result null"));
        } else if (a.containsKey("error-message")) {
            wvs.p(a.getString("error-message"));
        }
    }

    public final void b(d dVar) {
        if (!this.c.a()) {
            z5.d(new com.yandex.passport.internal.interaction.c(3, this, dVar));
        } else if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "SSO is turned off in experiments, skipping announces", 8);
        }
    }

    public final void c(d dVar, ArrayList arrayList) {
        Iterator it = this.b.a().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((m) it.next()).a.iterator();
            while (true) {
                if (it2.hasNext()) {
                    com.yandex.passport.internal.sso.d dVar2 = (com.yandex.passport.internal.sso.d) it2.next();
                    try {
                        a(dVar2, dVar, arrayList);
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "insertAccounts to " + dVar2.a + " success", 8);
                        }
                    } catch (Exception e) {
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.e, null, "Unable to insert accounts to " + dVar2.a, 8);
                        }
                        String str = dVar2.a;
                        o0 o0Var = this.d;
                        o0Var.getClass();
                        str.getClass();
                        xy0 xy0Var = new xy0(0);
                        xy0Var.put("remote_package_name", str);
                        xy0Var.put("error", Log.getStackTraceString(e));
                        o0Var.a.b(r.m, xy0Var);
                        int ordinal = dVar.ordinal();
                        if (ordinal == 0) {
                            str.getClass();
                            o0Var.i(str, r.e);
                        } else if (ordinal != 1) {
                            b6e.s();
                            return;
                        } else {
                            str.getClass();
                            o0Var.i(str, r.f);
                        }
                        Intent intent = new Intent("com.yandex.passport.ACTION_SSO_ANNOUNCEMENT");
                        intent.setPackage(str);
                        Context context = this.a;
                        intent.putExtra("com.yandex.passport.SOURCE_PACKAGE_NAME", context.getPackageName());
                        context.sendBroadcast(intent);
                    }
                }
            }
        }
    }
}
