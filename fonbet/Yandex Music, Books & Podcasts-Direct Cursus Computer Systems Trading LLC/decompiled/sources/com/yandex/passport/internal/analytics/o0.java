package com.yandex.passport.internal.analytics;

import android.util.Log;
import com.yandex.auth.LegacyAccountType;
import com.yandex.passport.internal.report.reporters.a1;
import com.yandex.passport.internal.report.w5;
import defpackage.e5b;
import defpackage.xy0;
import io.appmetrica.analytics.IReporterYandex;
import io.appmetrica.analytics.UserInfo;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class o0 {
    public final w a;

    public o0(w wVar) {
        this.a = wVar;
    }

    public final void a(long j, Exception exc) {
        xy0 xy0Var = new xy0(0);
        xy0Var.put("uid", Long.toString(j));
        xy0Var.put("error", Log.getStackTraceString(exc));
        this.a.b(l.m, xy0Var);
    }

    public final void b(com.yandex.passport.internal.ui.f fVar) {
        fVar.getClass();
        xy0 xy0Var = new xy0(0);
        xy0Var.put("uitype", "empty");
        xy0Var.put("error_code", fVar.a);
        xy0Var.put("error", Log.getStackTraceString(fVar.b));
        this.a.b(g.e, xy0Var);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.Map] */
    public final void c(com.yandex.passport.internal.l lVar, boolean z) {
        String str;
        lVar.getClass();
        xy0 xy0Var = new xy0(0);
        int i = lVar.e.h;
        if (i == 6) {
            str = (String) a1.d.get(lVar.k());
            if (str == null) {
                str = LegacyAccountType.STRING_SOCIAL;
            }
        } else if (i != 12) {
            str = LegacyAccountType.STRING_LOGIN;
        } else {
            str = (String) a1.e.get(lVar.k());
            if (str == null) {
                str = "mailish";
            }
        }
        xy0Var.put("fromLoginSDK", String.valueOf(z));
        xy0Var.put("subtype", str);
        xy0Var.put("uid", String.valueOf(lVar.b.b));
        this.a.b(g.c, xy0Var);
    }

    public final void d() {
        String str = (String) w5.d.c;
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        this.a.c(str, e5bVar);
    }

    public final void e(com.yandex.passport.internal.l lVar) {
        IReporterYandex iReporterYandex = this.a.a;
        if (lVar == null) {
            iReporterYandex.setUserInfo(new UserInfo());
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "clearMetricaUserInfo", 8);
                return;
            }
            return;
        }
        long j = lVar.b.b;
        String str = lVar.h;
        str.getClass();
        UserInfo userInfo = new UserInfo(String.valueOf(j));
        userInfo.setType(str);
        iReporterYandex.setUserInfo(userInfo);
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "setMetricaUserInfo: " + userInfo, 8);
        }
    }

    public final void f(int i, int i2, String str, String str2) {
        xy0 xy0Var = new xy0(0);
        xy0Var.put("authenticator", str);
        xy0Var.put("source", str2);
        xy0Var.put("old_account_count", String.valueOf(i));
        xy0Var.put("new_account_count", String.valueOf(i2));
        this.a.b(l.h, xy0Var);
    }

    public final void g(Throwable th) {
        xy0 xy0Var = new xy0(0);
        xy0Var.put("error", Log.getStackTraceString(th));
        this.a.b(f.f, xy0Var);
    }

    public final void h(long j, String str, String str2) {
        xy0 xy0Var = new xy0(0);
        xy0Var.put("from", str);
        xy0Var.put("uid", String.valueOf(j));
        xy0Var.put("account_action", str2);
        this.a.b(g.g, xy0Var);
    }

    public final void i(String str, r rVar) {
        xy0 xy0Var = new xy0(0);
        xy0Var.put("remote_package_name", str);
        this.a.b(rVar, xy0Var);
    }

    public final void j(String str, int i, ArrayList arrayList, ArrayList arrayList2) {
        str.getClass();
        xy0 xy0Var = new xy0(0);
        xy0Var.put("session_hash", str);
        xy0Var.put("accounts_num", Integer.toString(i));
        xy0Var.put("uid", CollectionsKt.X(arrayList, StringUtils.COMMA, "[", "]", null, 56));
        xy0Var.put(Constants.KEY_ACTION, CollectionsKt.X(arrayList2, StringUtils.COMMA, "[", "]", null, 56));
        this.a.b(r.n, xy0Var);
    }

    public final void k(Throwable th) {
        th.getClass();
        xy0 xy0Var = new xy0(0);
        if (!(th instanceof IOException)) {
            xy0Var.put("error", Log.getStackTraceString(th));
        }
        xy0Var.put(Constants.KEY_MESSAGE, th.getMessage());
        this.a.b(m.l, xy0Var);
    }

    public final void l(int i, String str) {
        str.getClass();
        xy0 xy0Var = new xy0(0);
        xy0Var.put("uri", str);
        xy0Var.put("error_code", Integer.toString(i));
        this.a.b(m.n, xy0Var);
    }

    public final void m(int i, String str) {
        str.getClass();
        xy0 xy0Var = new xy0(0);
        xy0Var.put("uri", str);
        xy0Var.put("error_code", Integer.toString(i));
        this.a.b(m.m, xy0Var);
    }
}
