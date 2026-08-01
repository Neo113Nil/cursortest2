package com.anythink.core.common.h;

import com.anythink.core.c.b.e;
import com.anythink.core.mg.api.MgComparedResult;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ab {

    /* renamed from: a, reason: collision with root package name */
    private int f13361a;

    /* renamed from: b, reason: collision with root package name */
    private int f13362b;

    /* renamed from: c, reason: collision with root package name */
    private int f13363c;

    /* renamed from: d, reason: collision with root package name */
    private double f13364d;

    /* renamed from: e, reason: collision with root package name */
    private String f13365e;

    /* renamed from: f, reason: collision with root package name */
    private int f13366f;

    /* renamed from: g, reason: collision with root package name */
    private long f13367g;

    /* renamed from: h, reason: collision with root package name */
    private int f13368h;
    private String i;

    private ab() {
    }

    public static ab a(cd cdVar) {
        ab abVar = new ab();
        abVar.f13361a = 1;
        abVar.f13362b = cdVar.x();
        abVar.f13363c = cdVar.A();
        abVar.f13364d = cdVar.p();
        abVar.i = cdVar.g();
        a(abVar, cdVar.C());
        return abVar;
    }

    public static ab a(aw awVar) {
        ab abVar = new ab();
        abVar.f13361a = 2;
        abVar.f13362b = awVar.w();
        abVar.f13363c = awVar.r();
        abVar.f13364d = awVar.x();
        abVar.f13365e = awVar.y();
        abVar.f13366f = awVar.E();
        a(abVar, awVar.F());
        return abVar;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", this.f13361a);
            jSONObject.put("post_t", this.f13362b);
            jSONObject.put(e.a.f12068h, String.valueOf(this.f13364d));
            long j6 = this.f13367g;
            if (j6 > 0) {
                jSONObject.put("real_wait_price_t", j6);
            }
            int i = this.f13368h;
            if (i > 0) {
                jSONObject.put("bp_from", i);
            }
            if (this.f13361a == 2) {
                jSONObject.put("reason", this.f13365e);
                jSONObject.put("winner_firm_id", this.f13366f);
            }
            if (this.f13361a == 1) {
                jSONObject.put("h_code", this.i);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private static void a(ab abVar, MgComparedResult mgComparedResult) {
        abVar.f13367g = mgComparedResult != null ? mgComparedResult.getCpCostTime() : 0L;
        int i = 0;
        if (mgComparedResult != null && mgComparedResult.isCompared()) {
            i = mgComparedResult.isMgWin() ? 2 : 1;
        }
        abVar.f13368h = i;
    }
}
