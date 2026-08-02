package com.yandex.passport.internal.sloth.performers;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.DeviceService;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.he;
import com.yandex.passport.internal.report.ie;
import com.yandex.passport.internal.report.je;
import com.yandex.passport.internal.report.pe;
import com.yandex.passport.internal.report.qe;
import com.yandex.passport.internal.report.re;
import com.yandex.passport.internal.report.reporters.p1;
import com.yandex.passport.internal.report.ue;
import com.yandex.passport.sloth.command.t;
import defpackage.cg6;
import defpackage.irf;
import defpackage.l2b;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import defpackage.z7o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class p implements t {
    public final /* synthetic */ int a;
    public final com.yandex.passport.internal.sloth.webauthn.e b;
    public final p1 c;

    public p(com.yandex.passport.internal.sloth.webauthn.e eVar, p1 p1Var, int i) {
        this.a = i;
        switch (i) {
            case 1:
                eVar.getClass();
                p1Var.getClass();
                this.b = eVar;
                this.c = p1Var;
                break;
            default:
                eVar.getClass();
                p1Var.getClass();
                this.b = eVar;
                this.c = p1Var;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, cg6 cg6Var) {
        o oVar;
        int i;
        Object a;
        Throwable a2;
        r rVar;
        int i2;
        Object b;
        Throwable a3;
        int i3 = this.a;
        String str2 = "";
        com.yandex.passport.internal.sloth.webauthn.e eVar = this.b;
        p1 p1Var = this.c;
        switch (i3) {
            case 0:
                if (cg6Var instanceof o) {
                    oVar = (o) cg6Var;
                    int i4 = oVar.l;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        oVar.l = i4 - Integer.MIN_VALUE;
                        Object obj = oVar.j;
                        nm6 nm6Var = nm6.a;
                        i = oVar.l;
                        if (i != 0) {
                            qgg.h0(obj);
                            p1Var.getClass();
                            p1Var.p(pe.d);
                            oVar.l = 1;
                            a = eVar.a(str, oVar);
                            if (a == nm6Var) {
                                return nm6Var;
                            }
                        } else {
                            if (i != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj);
                            a = ((z7o) obj).a;
                        }
                        a2 = z7o.a(a);
                        if (a2 == null) {
                            p1Var.getClass();
                            p1Var.n(qe.d, new ff(a2), new ue(a2));
                            String message = a2.getMessage();
                            JSONObject jSONObject = new JSONObject();
                            irf.G(jSONObject, "status", "error");
                            jSONObject.put(DeviceService.KEY_DESC, message == null ? "null" : message);
                            return new l2b(new com.yandex.passport.sloth.command.b(jSONObject));
                        }
                        String str3 = (String) a;
                        str3.getClass();
                        try {
                            str2 = new JSONObject(str3).getString(ConnectableDevice.KEY_ID);
                        } catch (JSONException unused) {
                        }
                        str2.getClass();
                        p1Var.getClass();
                        p1Var.n(re.d, new com.yandex.passport.internal.report.f(str2, 14));
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("status", "ok");
                        jSONObject2.put("data", str3);
                        return new l2b(new com.yandex.passport.sloth.command.b(jSONObject2));
                    }
                }
                oVar = new o(this, cg6Var);
                Object obj2 = oVar.j;
                nm6 nm6Var2 = nm6.a;
                i = oVar.l;
                if (i != 0) {
                }
                a2 = z7o.a(a);
                if (a2 == null) {
                }
            default:
                if (cg6Var instanceof r) {
                    rVar = (r) cg6Var;
                    int i5 = rVar.l;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        rVar.l = i5 - Integer.MIN_VALUE;
                        Object obj3 = rVar.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = rVar.l;
                        if (i2 != 0) {
                            qgg.h0(obj3);
                            p1Var.getClass();
                            p1Var.p(he.d);
                            rVar.l = 1;
                            b = eVar.b(str, rVar);
                            if (b == nm6Var3) {
                                return nm6Var3;
                            }
                        } else {
                            if (i2 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj3);
                            b = ((z7o) obj3).a;
                        }
                        a3 = z7o.a(b);
                        if (a3 == null) {
                            p1Var.getClass();
                            p1Var.n(ie.d, new ff(a3), new ue(a3));
                            String message2 = a3.getMessage();
                            JSONObject jSONObject3 = new JSONObject();
                            irf.G(jSONObject3, "status", "error");
                            jSONObject3.put(DeviceService.KEY_DESC, message2 == null ? "null" : message2);
                            return new l2b(new com.yandex.passport.sloth.command.b(jSONObject3));
                        }
                        String str4 = (String) b;
                        str4.getClass();
                        try {
                            str2 = new JSONObject(str4).getString(ConnectableDevice.KEY_ID);
                        } catch (JSONException unused2) {
                        }
                        str2.getClass();
                        p1Var.getClass();
                        p1Var.n(je.d, new com.yandex.passport.internal.report.f(str2, 14));
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("status", "ok");
                        jSONObject4.put("data", str4);
                        return new l2b(new com.yandex.passport.sloth.command.b(jSONObject4));
                    }
                }
                rVar = new r(this, cg6Var);
                Object obj32 = rVar.j;
                nm6 nm6Var32 = nm6.a;
                i2 = rVar.l;
                if (i2 != 0) {
                }
                a3 = z7o.a(b);
                if (a3 == null) {
                }
        }
    }

    @Override // com.yandex.passport.sloth.command.t
    public final /* bridge */ /* synthetic */ Object q(com.yandex.passport.sloth.data.m mVar, Object obj, com.yandex.passport.sloth.command.f fVar) {
        switch (this.a) {
        }
        return a((String) obj, fVar);
    }
}
