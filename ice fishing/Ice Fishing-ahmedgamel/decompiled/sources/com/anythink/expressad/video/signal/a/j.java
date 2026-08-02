package com.anythink.expressad.video.signal.a;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.d.t;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.foundation.h.x;
import com.anythink.expressad.video.signal.a.c;
import com.anythink.expressad.video.signal.c;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class j extends c {

    /* renamed from: u, reason: collision with root package name */
    private static final String f22598u = "j";

    /* renamed from: z, reason: collision with root package name */
    private static final String f22599z = "camp_position";

    /* renamed from: A, reason: collision with root package name */
    private com.anythink.expressad.foundation.d.d f22600A;

    /* renamed from: B, reason: collision with root package name */
    private List<com.anythink.expressad.foundation.d.d> f22601B;

    /* renamed from: C, reason: collision with root package name */
    private int f22602C;

    /* renamed from: D, reason: collision with root package name */
    private String f22603D = "";

    /* renamed from: E, reason: collision with root package name */
    private String f22604E = "";

    /* renamed from: F, reason: collision with root package name */
    private boolean f22605F = false;

    /* renamed from: G, reason: collision with root package name */
    private boolean f22606G = false;

    /* renamed from: H, reason: collision with root package name */
    private boolean f22607H = true;

    /* renamed from: v, reason: collision with root package name */
    private Activity f22608v;

    /* renamed from: w, reason: collision with root package name */
    private String f22609w;

    /* renamed from: x, reason: collision with root package name */
    private String f22610x;

    /* renamed from: y, reason: collision with root package name */
    private Context f22611y;

    public j(Activity activity, com.anythink.expressad.foundation.d.d dVar) {
        this.f22608v = activity;
        this.f22600A = dVar;
    }

    private static JSONObject A() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device", new com.anythink.expressad.foundation.h.c(t.b().g()).a());
            return jSONObject;
        } catch (JSONException e9) {
            e9.printStackTrace();
            return jSONObject;
        }
    }

    private JSONObject B() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("playVideoMute", this.f22581t);
            jSONObject2.put("instanceId", this.f22603D);
            jSONObject.put("sdkSetting", jSONObject2);
            return jSONObject;
        } catch (JSONException e9) {
            e9.printStackTrace();
            return jSONObject;
        }
    }

    private JSONObject C() {
        JSONObject jSONObject = new JSONObject();
        com.anythink.expressad.videocommon.e.d dVar = this.f22577p;
        return dVar != null ? dVar.R() : jSONObject;
    }

    private static JSONObject D() {
        JSONObject jSONObject = new JSONObject();
        com.anythink.expressad.videocommon.e.a b9 = com.anythink.expressad.videocommon.e.c.a().b();
        return b9 != null ? b9.j() : jSONObject;
    }

    private static boolean E() {
        return false;
    }

    private void c(boolean z6) {
        this.f22607H = z6;
    }

    private void e(String str) {
        List<com.anythink.expressad.foundation.d.d> list;
        if (this.f22600A == null || (list = this.f22601B) == null || list.size() == 0) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(f22599z)) {
                this.f22600A = this.f22601B.get(jSONObject.getInt(f22599z));
            }
        } catch (JSONException e9) {
            e9.printStackTrace();
        }
    }

    private boolean s() {
        return this.f22607H;
    }

    private String t() {
        JSONObject jSONObject = new JSONObject();
        com.anythink.expressad.foundation.h.c cVar = new com.anythink.expressad.foundation.h.c(t.b().g());
        try {
            jSONObject.put("unit_id", this.f22576o);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("instanceId", this.f22603D);
            jSONObject2.put("rootViewInstanceId", this.f22604E);
            jSONObject2.put("isRootTemplateWebView", this.f22605F);
            jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.SDK_INFO, com.anythink.expressad.out.b.f20809a + ",3.0.1");
            jSONObject2.put("playVideoMute", this.f22581t);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put("device", cVar.a());
            JSONArray jSONArray = new JSONArray();
            List<com.anythink.expressad.foundation.d.d> list = this.f22601B;
            if (list == null || list.size() <= 0) {
                jSONArray.put(com.anythink.expressad.foundation.d.d.a(this.f22600A));
            } else {
                for (com.anythink.expressad.foundation.d.d dVar : this.f22601B) {
                    jSONArray.put(com.anythink.expressad.foundation.d.d.a(dVar, dVar.av(), c(dVar)));
                }
            }
            jSONObject.put("campaignList", jSONArray);
            jSONObject.put("unitSetting", C());
            String f2 = com.anythink.expressad.foundation.b.a.c().f();
            com.anythink.expressad.f.b.a();
            String a9 = com.anythink.expressad.f.b.a(f2);
            if (!TextUtils.isEmpty(a9)) {
                JSONObject jSONObject3 = new JSONObject(a9);
                a(jSONObject3);
                com.anythink.expressad.f.b.a();
                String b9 = com.anythink.expressad.f.b.b(this.f22576o);
                if (!TextUtils.isEmpty(b9)) {
                    jSONObject3.put("ivreward", new JSONObject(b9));
                }
                jSONObject.put("appSetting", jSONObject3);
            }
            jSONObject.put("rewardSetting", D());
            if (!TextUtils.isEmpty(this.f22576o)) {
                jSONObject.put("unit_id", this.f22576o);
            }
            jSONObject.put("rw_plus", this.f22606G ? "1" : "0");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject.toString();
    }

    private com.anythink.expressad.b.a u() {
        if (this.f22579r == null) {
            this.f22579r = new com.anythink.expressad.b.a(t.b().g(), this.f22576o);
        }
        return this.f22579r;
    }

    private JSONObject v() {
        JSONObject jSONObject = new JSONObject();
        com.anythink.expressad.foundation.h.c cVar = new com.anythink.expressad.foundation.h.c(t.b().g());
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("playVideoMute", this.f22581t);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put("device", cVar.a());
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(com.anythink.expressad.foundation.d.d.a(this.f22600A));
            jSONObject.put("campaignList", jSONArray);
            jSONObject.put("unitSetting", C());
            String f2 = com.anythink.expressad.foundation.b.a.c().f();
            com.anythink.expressad.f.b.a();
            String a9 = com.anythink.expressad.f.b.a(f2);
            if (!TextUtils.isEmpty(a9)) {
                JSONObject jSONObject3 = new JSONObject(a9);
                a(jSONObject3);
                com.anythink.expressad.f.b.a();
                String b9 = com.anythink.expressad.f.b.b(this.f22576o);
                if (!TextUtils.isEmpty(b9)) {
                    jSONObject3.put("ivreward", b9);
                }
                jSONObject.put("appSetting", jSONObject3.toString());
            }
            jSONObject.put("rewardSetting", D());
            return jSONObject;
        } catch (Throwable th) {
            th.printStackTrace();
            return jSONObject;
        }
    }

    private static JSONObject w() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.SDK_INFO, com.anythink.expressad.out.b.f20809a + ",3.0.1");
            return jSONObject;
        } catch (JSONException e9) {
            e9.printStackTrace();
            return jSONObject;
        }
    }

    private JSONObject x() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f22576o)) {
                jSONObject.put("unit_id", this.f22576o);
                return jSONObject;
            }
        } catch (JSONException e9) {
            e9.printStackTrace();
        }
        return jSONObject;
    }

    private static JSONObject y() {
        JSONObject jSONObject = new JSONObject();
        try {
            String f2 = com.anythink.expressad.foundation.b.a.c().f();
            com.anythink.expressad.f.b.a();
            String a9 = com.anythink.expressad.f.b.a(f2);
            if (!TextUtils.isEmpty(a9)) {
                jSONObject.put("appSetting", new JSONObject(a9));
                return jSONObject;
            }
        } catch (JSONException e9) {
            e9.printStackTrace();
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private JSONObject z() {
        JSONObject jSONObject = new JSONObject();
        try {
            com.anythink.expressad.videocommon.e.d dVar = this.f22577p;
            if (dVar != null) {
                jSONObject.put("unitSetting", dVar.R());
                return jSONObject;
            }
        } catch (JSONException e9) {
            e9.printStackTrace();
        }
        return jSONObject;
    }

    public final void a(com.anythink.expressad.foundation.d.d dVar) {
        this.f22600A = dVar;
    }

    public final void b(boolean z6) {
        this.f22606G = z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cc  */
    @Override // com.anythink.expressad.video.signal.a.c, com.anythink.expressad.video.signal.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void click(int i, String str) {
        int i4;
        String queryParameter;
        com.anythink.expressad.e.a.c a9;
        List<com.anythink.expressad.foundation.d.d> list;
        int p9;
        List<com.anythink.expressad.foundation.d.d> list2;
        super.click(i, str);
        com.anythink.expressad.foundation.d.d dVar = this.f22600A;
        if (dVar != null && dVar.k() == 5 && this.f22600A != null && (list2 = this.f22601B) != null && list2.size() != 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has(f22599z)) {
                    this.f22600A = this.f22601B.get(jSONObject.getInt(f22599z));
                }
            } catch (JSONException e9) {
                e9.printStackTrace();
            }
        }
        boolean z6 = true;
        try {
            if (i != 1) {
                if (i != 3) {
                    return;
                }
                com.anythink.expressad.foundation.d.d dVar2 = this.f22600A;
                if (dVar2 == null || dVar2.f() <= -2) {
                    com.anythink.expressad.videocommon.e.d dVar3 = this.f22577p;
                    p9 = dVar3 != null ? dVar3.p() : 1;
                } else {
                    p9 = this.f22600A.f();
                }
                if (p9 == -1) {
                    a(new c.b(this, this.f22580s));
                }
                click(1, str);
                return;
            }
            if (this.f22600A == null && (list = this.f22601B) != null && list.size() > 0) {
                this.f22600A = this.f22601B.get(0);
            }
            com.anythink.expressad.foundation.d.d dVar4 = this.f22600A;
            if (dVar4 == null) {
                return;
            }
            com.anythink.expressad.foundation.d.d a10 = a(str, dVar4);
            if (a10 != null && (a9 = com.anythink.expressad.e.a.a.a().a(a10)) != null) {
                a9.a(true);
                com.anythink.expressad.e.a.a.a().a(a9, a10);
            }
            try {
                queryParameter = Uri.parse(a10.aj()).getQueryParameter(com.anythink.expressad.foundation.g.a.cj);
            } catch (Throwable unused) {
            }
            if (!TextUtils.isEmpty(queryParameter)) {
                i4 = Integer.parseInt(queryParameter);
                c.a aVar = this.f22580s;
                if (i4 == 2) {
                    z6 = false;
                }
                aVar.a(a10, z6);
                u().a(this.f22580s);
                u();
            }
            i4 = 0;
            c.a aVar2 = this.f22580s;
            if (i4 == 2) {
            }
            aVar2.a(a10, z6);
            u().a(this.f22580s);
            u();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public final void d(String str) {
        this.f22604E = str;
    }

    @Override // com.anythink.expressad.video.signal.a.c, com.anythink.expressad.video.signal.c
    public final String h(int i) {
        switch (i) {
            case 1:
                return w().toString();
            case 2:
                return x().toString();
            case 3:
                return y().toString();
            case 4:
                return z().toString();
            case 5:
                return A().toString();
            case 6:
                return B().toString();
            default:
                return v().toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.c, com.anythink.expressad.video.signal.d
    public void handlerH5Exception(int i, String str) {
        super.handlerH5Exception(i, str);
        try {
            this.f22580s.a(i, str);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.c, com.anythink.expressad.video.signal.c
    public final String i() {
        this.f22580s.a();
        this.f22568f = true;
        if (TextUtils.isEmpty(this.f22609w)) {
            this.f22609w = t();
        } else {
            String str = this.f22609w;
            StringBuilder sb = new StringBuilder();
            sb.append(com.anythink.expressad.foundation.h.n.k());
            this.f22609w = v.b(str, "tun", sb.toString());
        }
        return this.f22609w;
    }

    public final void j(int i) {
        this.f22602C = i;
    }

    @Override // com.anythink.expressad.video.signal.a.c, com.anythink.expressad.video.signal.c
    public final void l() {
        super.l();
        c.a aVar = this.f22580s;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.c, com.anythink.expressad.video.signal.c
    public final String o() {
        return this.f22610x;
    }

    public final void p() {
        this.f22605F = true;
    }

    public final void q() {
        this.f22609w = "";
    }

    public final int r() {
        return this.f22602C;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void b(com.anythink.expressad.foundation.d.d dVar) {
        int i;
        String queryParameter;
        try {
            queryParameter = Uri.parse(dVar.aj()).getQueryParameter(com.anythink.expressad.foundation.g.a.cj);
        } catch (Throwable unused) {
        }
        if (!TextUtils.isEmpty(queryParameter)) {
            i = Integer.parseInt(queryParameter);
            this.f22580s.a(dVar, i == 2);
            u().a(this.f22580s);
            u();
        }
        i = 0;
        this.f22580s.a(dVar, i == 2);
        u().a(this.f22580s);
        u();
    }

    public final void a(List<com.anythink.expressad.foundation.d.d> list) {
        this.f22601B = list;
    }

    public final void c(String str) {
        this.f22603D = str;
    }

    @Override // com.anythink.expressad.video.signal.a.c, com.anythink.expressad.video.signal.c
    public final void j() {
        super.j();
        try {
            Activity activity = this.f22608v;
            if (activity != null) {
                activity.finish();
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private void a(JSONObject jSONObject) {
        try {
            Context e9 = com.anythink.expressad.foundation.b.a.c().e();
            String obj = x.b(e9, "Anythink_ConfirmTitle" + this.f22576o, "").toString();
            String obj2 = x.b(e9, "Anythink_ConfirmContent" + this.f22576o, "").toString();
            String obj3 = x.b(e9, "Anythink_CancelText" + this.f22576o, "").toString();
            String obj4 = x.b(e9, "Anythink_ConfirmText" + this.f22576o, "").toString();
            if (!TextUtils.isEmpty(obj)) {
                jSONObject.put(com.anythink.expressad.f.a.b.cu, obj);
            }
            if (!TextUtils.isEmpty(obj2)) {
                jSONObject.put(com.anythink.expressad.f.a.b.cv, obj2);
            }
            if (!TextUtils.isEmpty(obj3)) {
                jSONObject.put(com.anythink.expressad.f.a.b.cw, obj3);
            }
            if (!TextUtils.isEmpty(obj4)) {
                jSONObject.put(com.anythink.expressad.f.a.b.cy, obj4);
            }
            if (TextUtils.isEmpty(obj4)) {
                return;
            }
            jSONObject.put(com.anythink.expressad.f.a.b.cx, obj4);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032 A[Catch: Exception -> 0x0037, TRY_LEAVE, TryCatch #0 {Exception -> 0x0037, blocks: (B:2:0x0000, B:4:0x0010, B:6:0x0019, B:7:0x0022, B:9:0x002c, B:11:0x0032), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:2:0x0000, B:4:0x0010, B:6:0x0019, B:7:0x0022, B:9:0x002c, B:11:0x0032), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean c(com.anythink.expressad.foundation.d.d dVar) {
        long j6;
        try {
            if (!TextUtils.isEmpty(com.anythink.expressad.foundation.b.a.c().f())) {
                com.anythink.expressad.f.b.a();
                com.anythink.expressad.f.a b9 = com.anythink.expressad.f.b.b();
                if (b9 != null) {
                    j6 = b9.l() * 1000;
                    com.anythink.expressad.videocommon.e.a b10 = com.anythink.expressad.videocommon.e.c.a().b();
                    long c9 = b10 != null ? b10.c() : 0L;
                    if (dVar == null) {
                        return dVar.a(c9, j6);
                    }
                    return false;
                }
            }
            j6 = 0;
            com.anythink.expressad.videocommon.e.a b102 = com.anythink.expressad.videocommon.e.c.a().b();
            if (b102 != null) {
            }
            if (dVar == null) {
            }
        } catch (Exception unused) {
            return false;
        }
    }

    public j(Activity activity, com.anythink.expressad.foundation.d.d dVar, List<com.anythink.expressad.foundation.d.d> list) {
        this.f22608v = activity;
        this.f22600A = dVar;
        this.f22601B = list;
    }

    @Override // com.anythink.expressad.video.signal.a.c, com.anythink.expressad.video.signal.c
    public final void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f22610x = str;
    }

    private com.anythink.expressad.foundation.d.d a(String str, com.anythink.expressad.foundation.d.d dVar) {
        if (TextUtils.isEmpty(str)) {
            return dVar;
        }
        if (TextUtils.isEmpty(str) && dVar == null) {
            return null;
        }
        if (!str.contains("notice")) {
            try {
                JSONObject a9 = com.anythink.expressad.foundation.d.d.a(dVar);
                com.anythink.expressad.foundation.d.d b9 = com.anythink.expressad.foundation.d.d.b(a9);
                if (b9 == null) {
                    b9 = dVar;
                }
                if (!TextUtils.isEmpty(str)) {
                    a(a9, b9);
                    JSONObject optJSONObject = new JSONObject(str).optJSONObject(com.anythink.expressad.foundation.g.a.ci);
                    if (optJSONObject != null) {
                        String.valueOf(v.b(this.f22608v, Integer.valueOf(optJSONObject.getString(com.anythink.expressad.foundation.g.a.cg)).intValue()));
                        String.valueOf(v.b(this.f22608v, Integer.valueOf(optJSONObject.getString(com.anythink.expressad.foundation.g.a.ch)).intValue()));
                    }
                    b9.p(b9.af());
                    String aj = b9.aj();
                    if (optJSONObject != null) {
                        Iterator<String> keys = optJSONObject.keys();
                        StringBuilder sb = new StringBuilder();
                        while (keys.hasNext()) {
                            sb.append("&");
                            String next = keys.next();
                            String optString = optJSONObject.optString(next);
                            if (com.anythink.expressad.foundation.g.a.cg.equals(next) || com.anythink.expressad.foundation.g.a.ch.equals(next)) {
                                optString = String.valueOf(v.b(this.f22608v, Integer.valueOf(optString).intValue()));
                            }
                            sb.append(next);
                            sb.append("=");
                            sb.append(optString);
                        }
                        b9.r(aj + ((Object) sb));
                    }
                }
                return b9;
            } catch (JSONException e9) {
                e9.printStackTrace();
                return dVar;
            } catch (Throwable th) {
                th.printStackTrace();
                return dVar;
            }
        }
        try {
            JSONObject a10 = com.anythink.expressad.foundation.d.d.a(dVar);
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.opt(com.anythink.expressad.foundation.d.j.cK) == null) {
                jSONObject.put(com.anythink.expressad.foundation.d.j.cK, "");
            }
            try {
                if (!jSONObject.has(com.anythink.expressad.foundation.d.d.f19359U)) {
                    a10.put(com.anythink.expressad.foundation.d.d.f19359U, "");
                }
            } catch (Exception unused) {
            }
            Iterator<String> keys2 = jSONObject.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                a10.put(next2, jSONObject.getString(next2));
            }
            com.anythink.expressad.foundation.d.d b10 = com.anythink.expressad.foundation.d.d.b(a10);
            a(a10, b10);
            return b10;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return dVar;
        }
    }

    private static void a(JSONObject jSONObject, com.anythink.expressad.foundation.d.d dVar) {
        try {
            String optString = jSONObject.optString("unitId");
            if (TextUtils.isEmpty(optString)) {
                return;
            }
            dVar.l(optString);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.c, com.anythink.expressad.video.signal.c
    public final void a(int i, String str) {
        super.a(i, str);
        if (i != 2) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("event", "event");
            String optString2 = jSONObject.optString("template", "-1");
            String optString3 = jSONObject.optString("layout", "-1");
            String optString4 = jSONObject.optString("unit_id", this.f22576o);
            this.f22608v.getApplication();
            int b9 = com.anythink.expressad.foundation.h.n.b();
            new com.anythink.expressad.foundation.d.t(com.anythink.expressad.foundation.d.t.f19708j, optString, optString2, optString3, optString4, this.f22600A.bh(), b9, com.anythink.expressad.foundation.h.n.a(this.f22608v.getApplication(), b9));
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.c, com.anythink.expressad.video.signal.c
    public final void a(Activity activity) {
        this.f22608v = activity;
    }

    @Override // com.anythink.expressad.video.signal.a.c, com.anythink.expressad.video.signal.c
    public final void a(Context context) {
        this.f22611y = context;
    }
}
