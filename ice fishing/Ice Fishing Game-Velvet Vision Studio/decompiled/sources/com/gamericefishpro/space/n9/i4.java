package com.gamericefishpro.space.n9;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i4 extends c4 {
    public static final boolean u(String str) {
        String str2 = (String) e0.t.a(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008e, code lost:
    
        if (java.lang.Math.abs(r7.hashCode() % 100) < r9.E().p()) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final h4 s(String str) {
        r1 r1Var = (r1) this.d;
        m4 m4Var = this.e;
        m mVar = m4Var.i;
        l1 l1Var = m4Var.d;
        m4.T(mVar);
        a1 a1VarT0 = mVar.t0(str);
        a3 a3Var = a3.GOOGLE_ANALYTICS;
        h4 h4Var = null;
        if (a1VarT0 == null || !a1VarT0.y()) {
            return new h4(t(str), Collections.EMPTY_MAP, a3Var, null);
        }
        com.gamericefishpro.space.i9.o3 o3VarQ = com.gamericefishpro.space.i9.p3.q();
        o3VarQ.b();
        ((com.gamericefishpro.space.i9.p3) o3VarQ.e).v(2);
        int iA = com.gamericefishpro.space.m5.a.a(a1VarT0.t());
        if (iA == 0) {
            throw new NullPointerException("null reference");
        }
        o3VarQ.h(iA);
        String strE = a1VarT0.E();
        m4.T(l1Var);
        com.gamericefishpro.space.i9.e2 e2VarD = l1Var.D(str);
        if (e2VarD != null) {
            m mVar2 = m4Var.i;
            m4.T(mVar2);
            a1 a1VarT1 = mVar2.t0(str);
            if (a1VarT1 != null) {
                if (!e2VarD.D() || e2VarD.E().p() != 100) {
                    r4 r4Var = r1Var.B;
                    r1.j(r4Var);
                    if (!r4Var.R(str, a1VarT1.C())) {
                        if (!TextUtils.isEmpty(strE)) {
                        }
                    }
                }
                String strD = a1VarT0.D();
                o3VarQ.b();
                ((com.gamericefishpro.space.i9.p3) o3VarQ.e).v(2);
                m4.T(l1Var);
                com.gamericefishpro.space.i9.e2 e2VarD2 = l1Var.D(a1VarT0.D());
                if (e2VarD2 == null || !e2VarD2.D()) {
                    v0 v0Var = r1Var.y;
                    r1.l(v0Var);
                    v0Var.G.b(strD, "[sgtm] Missing sgtm_setting in remote config. appId");
                    o3VarQ.b();
                    ((com.gamericefishpro.space.i9.p3) o3VarQ.e).w(4);
                } else {
                    HashMap map = new HashMap();
                    if (!TextUtils.isEmpty(a1VarT0.C())) {
                        map.put("x-gtm-server-preview", a1VarT0.C());
                    }
                    String strQ = e2VarD2.E().q();
                    int iA2 = com.gamericefishpro.space.m5.a.a(a1VarT0.t());
                    if (iA2 != 0 && iA2 != 2) {
                        o3VarQ.h(iA2);
                    } else if (u(a1VarT0.D())) {
                        o3VarQ.h(11);
                    } else if (TextUtils.isEmpty(strQ)) {
                        o3VarQ.h(12);
                    } else {
                        v0 v0Var2 = r1Var.y;
                        r1.l(v0Var2);
                        v0Var2.G.b(strD, "[sgtm] Eligible for client side upload. appId");
                        o3VarQ.b();
                        ((com.gamericefishpro.space.i9.p3) o3VarQ.e).v(3);
                        o3VarQ.h(2);
                        h4Var = new h4(strQ, map, a3.SGTM_CLIENT, (com.gamericefishpro.space.i9.p3) o3VarQ.e());
                    }
                    e2VarD2.E().getClass();
                    e2VarD2.E().getClass();
                    r1Var.getClass();
                    v0 v0Var3 = r1Var.y;
                    if (TextUtils.isEmpty(strQ)) {
                        o3VarQ.b();
                        ((com.gamericefishpro.space.i9.p3) o3VarQ.e).w(6);
                        r1.l(v0Var3);
                        v0Var3.G.b(a1VarT0.D(), "[sgtm] Local service, missing sgtm_server_url");
                    } else {
                        r1.l(v0Var3);
                        v0Var3.G.b(strD, "[sgtm] Eligible for local service direct upload. appId");
                        o3VarQ.b();
                        ((com.gamericefishpro.space.i9.p3) o3VarQ.e).v(5);
                        o3VarQ.b();
                        ((com.gamericefishpro.space.i9.p3) o3VarQ.e).w(2);
                        h4Var = new h4(strQ, map, a3.SGTM, (com.gamericefishpro.space.i9.p3) o3VarQ.e());
                    }
                }
                return h4Var != null ? h4Var : new h4(t(str), Collections.EMPTY_MAP, a3Var, (com.gamericefishpro.space.i9.p3) o3VarQ.e());
            }
        }
        o3VarQ.b();
        ((com.gamericefishpro.space.i9.p3) o3VarQ.e).w(3);
        return new h4(t(str), Collections.EMPTY_MAP, a3Var, (com.gamericefishpro.space.i9.p3) o3VarQ.e());
    }

    public final String t(String str) {
        l1 l1Var = this.e.d;
        m4.T(l1Var);
        String strE = l1Var.E(str);
        if (TextUtils.isEmpty(strE)) {
            return (String) e0.r.a(null);
        }
        Uri uri = Uri.parse((String) e0.r.a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        String authority = uri.getAuthority();
        StringBuilder sb = new StringBuilder(String.valueOf(strE).length() + 1 + String.valueOf(authority).length());
        sb.append(strE);
        sb.append(".");
        sb.append(authority);
        builderBuildUpon.authority(sb.toString());
        return builderBuildUpon.build().toString();
    }
}
