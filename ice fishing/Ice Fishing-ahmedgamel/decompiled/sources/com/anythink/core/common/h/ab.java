package com.anythink.core.common.h;

import com.anythink.core.c.b.e;
import com.anythink.core.mg.api.MgComparedResult;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ab {

    /* renamed from: a, reason: collision with root package name */
    private int f14147a;

    /* renamed from: b, reason: collision with root package name */
    private int f14148b;

    /* renamed from: c, reason: collision with root package name */
    private int f14149c;

    /* renamed from: d, reason: collision with root package name */
    private double f14150d;

    /* renamed from: e, reason: collision with root package name */
    private String f14151e;

    /* renamed from: f, reason: collision with root package name */
    private int f14152f;

    /* renamed from: g, reason: collision with root package name */
    private long f14153g;

    /* renamed from: h, reason: collision with root package name */
    private int f14154h;
    private String i;

    private ab() {
    }

    public static ab a(cd cdVar) {
        ab abVar = new ab();
        abVar.f14147a = 1;
        abVar.f14148b = cdVar.x();
        abVar.f14149c = cdVar.A();
        abVar.f14150d = cdVar.p();
        abVar.i = cdVar.g();
        a(abVar, cdVar.C());
        return abVar;
    }

    public static ab a(aw awVar) {
        ab abVar = new ab();
        abVar.f14147a = 2;
        abVar.f14148b = awVar.w();
        abVar.f14149c = awVar.r();
        abVar.f14150d = awVar.x();
        abVar.f14151e = awVar.y();
        abVar.f14152f = awVar.E();
        a(abVar, awVar.F());
        return abVar;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", this.f14147a);
            jSONObject.put("post_t", this.f14148b);
            jSONObject.put(e.a.f12854h, String.valueOf(this.f14150d));
            long j6 = this.f14153g;
            if (j6 > 0) {
                jSONObject.put("real_wait_price_t", j6);
            }
            int i = this.f14154h;
            if (i > 0) {
                jSONObject.put("bp_from", i);
            }
            if (this.f14147a == 2) {
                jSONObject.put("reason", this.f14151e);
                jSONObject.put("winner_firm_id", this.f14152f);
            }
            if (this.f14147a == 1) {
                jSONObject.put("h_code", this.i);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private static void a(ab abVar, MgComparedResult mgComparedResult) {
        abVar.f14153g = mgComparedResult != null ? mgComparedResult.getCpCostTime() : 0L;
        int i = 0;
        if (mgComparedResult != null && mgComparedResult.isCompared()) {
            i = mgComparedResult.isMgWin() ? 2 : 1;
        }
        abVar.f14154h = i;
    }
}
