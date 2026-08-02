package com.yandex.passport.internal.analytics;

import android.util.Log;
import com.connectsdk.service.airplay.PListParser;
import defpackage.czf;
import defpackage.e5b;
import defpackage.eqj;
import defpackage.kyf;
import defpackage.q0v;
import defpackage.xy0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class n0 implements czf {
    public final w a;
    public boolean b;
    public com.yandex.passport.internal.ui.domik.z c;
    public String d;
    public m0 e;
    public String f;
    public boolean g;
    public final q0v h;

    public n0(w wVar) {
        wVar.getClass();
        this.a = wVar;
        this.e = m0.NONE;
        this.h = new q0v(19, this);
        f();
    }

    public final HashMap a(Map map) {
        HashMap hashMap = new HashMap(map);
        hashMap.put("session_hash", this.d);
        hashMap.put("from", this.b ? "sdk" : "app");
        hashMap.put("conditions_met", PListParser.TAG_TRUE);
        if (this.g) {
            hashMap.put("prefer_phonish_auth", PListParser.TAG_TRUE);
        }
        com.yandex.passport.internal.ui.domik.z zVar = this.c;
        if (zVar != null) {
            String obj = zVar.toString();
            Locale locale = Locale.ROOT;
            locale.getClass();
            String lowerCase = obj.toLowerCase(locale);
            lowerCase.getClass();
            hashMap.put("reg_origin", lowerCase);
        }
        hashMap.put("source", this.f);
        return hashMap;
    }

    public final void b(com.yandex.passport.internal.ui.f fVar) {
        fVar.getClass();
        xy0 xy0Var = new xy0(0);
        xy0Var.put("error_code", fVar.a);
        Throwable th = fVar.b;
        xy0Var.put(Constants.KEY_MESSAGE, th.getMessage());
        if (!(th instanceof IOException)) {
            xy0Var.put("error", Log.getStackTraceString(th));
        }
        this.a.b(m.o, xy0Var);
    }

    public final void c(m0 m0Var, l0 l0Var, Map map) {
        m0Var.getClass();
        map.getClass();
        this.a.c(String.format(Locale.US, "domik.reportWebAmEvent%s.%s", Arrays.copyOf(new Object[]{m0Var.a, l0Var.a}, 2)), a(map));
    }

    public final void d() {
        m0 m0Var = this.e;
        l0 l0Var = l0.NEXT_PRESSED;
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        c(m0Var, l0Var, e5bVar);
    }

    public final void e(k0 k0Var) {
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.KEY_MESSAGE, k0Var.toString());
        c(this.e, l0.SCREEN_SUCCESS, hashMap);
    }

    public final void f() {
        this.e = m0.NONE;
        this.b = false;
        this.c = null;
        this.d = UUID.randomUUID().toString();
    }

    @eqj(kyf.ON_CREATE)
    public final void onCreate() {
        w wVar = this.a;
        wVar.getClass();
        q0v q0vVar = this.h;
        q0vVar.getClass();
        wVar.b.add(q0vVar);
    }

    @eqj(kyf.ON_DESTROY)
    public final void onDestroy() {
        w wVar = this.a;
        wVar.getClass();
        q0v q0vVar = this.h;
        q0vVar.getClass();
        wVar.b.remove(q0vVar);
    }
}
