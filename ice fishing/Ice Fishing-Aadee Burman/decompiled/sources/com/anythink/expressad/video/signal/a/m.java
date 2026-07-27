package com.anythink.expressad.video.signal.a;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.expressad.foundation.h.x;
import com.anythink.expressad.video.module.AnythinkContainerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class m extends f {

    /* renamed from: b, reason: collision with root package name */
    private Activity f21834b;

    /* renamed from: c, reason: collision with root package name */
    private AnythinkContainerView f21835c;

    public m(Activity activity, AnythinkContainerView anythinkContainerView) {
        this.f21834b = activity;
        this.f21835c = anythinkContainerView;
    }

    private static com.anythink.expressad.videocommon.e.d c(String str) {
        if (com.anythink.expressad.videocommon.e.c.a() == null) {
            return null;
        }
        return com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), str);
    }

    @Override // com.anythink.expressad.video.signal.a.f, com.anythink.expressad.video.signal.i
    public final String a() {
        if (this.f21835c == null) {
            super.a();
        } else {
            try {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f21835c.getCampaign());
                String unitID = this.f21835c.getUnitID();
                String str = com.anythink.expressad.out.b.f20022a + ",3.0.1";
                com.anythink.expressad.videocommon.e.d a9 = com.anythink.expressad.videocommon.e.c.a() == null ? null : com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), unitID);
                JSONObject jSONObject = new JSONObject();
                if (a9 != null) {
                    jSONObject = a9.R();
                }
                Objects.toString(this.f21835c.getCampaign());
                return a(arrayList, unitID, str, jSONObject);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return super.a();
    }

    @Override // com.anythink.expressad.video.signal.a.f, com.anythink.expressad.video.signal.i
    public final void b(String str) {
        super.b(str);
        try {
            if (this.f21834b == null || TextUtils.isEmpty(str)) {
                return;
            }
            if (str.equals("landscape")) {
                this.f21834b.setRequestedOrientation(0);
            } else if (str.equals("portrait")) {
                this.f21834b.setRequestedOrientation(1);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.f, com.anythink.expressad.video.signal.i, com.anythink.expressad.video.signal.h
    public final void handlerPlayableException(String str) {
        AnythinkContainerView anythinkContainerView;
        super.handlerPlayableException(str);
        try {
            if (this.f21834b == null || TextUtils.isEmpty(str) || (anythinkContainerView = this.f21835c) == null) {
                return;
            }
            anythinkContainerView.handlerPlayableException(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.f, com.anythink.expressad.video.signal.h
    public final void install(com.anythink.expressad.foundation.d.d dVar) {
        super.install(dVar);
        AnythinkContainerView anythinkContainerView = this.f21835c;
        if (anythinkContainerView != null) {
            anythinkContainerView.install(dVar);
        }
    }

    @Override // com.anythink.expressad.video.signal.a.f, com.anythink.expressad.video.signal.h
    public final void notifyCloseBtn(int i) {
        super.notifyCloseBtn(i);
        AnythinkContainerView anythinkContainerView = this.f21835c;
        if (anythinkContainerView != null) {
            anythinkContainerView.notifyCloseBtn(i);
        }
    }

    @Override // com.anythink.expressad.video.signal.a.f, com.anythink.expressad.video.signal.h
    public final void orientation(Configuration configuration) {
        super.orientation(configuration);
        try {
            AnythinkContainerView anythinkContainerView = this.f21835c;
            if (anythinkContainerView != null) {
                anythinkContainerView.orientation(configuration);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.f, com.anythink.expressad.video.signal.h
    public final void toggleCloseBtn(int i) {
        super.toggleCloseBtn(i);
        AnythinkContainerView anythinkContainerView = this.f21835c;
        if (anythinkContainerView != null) {
            anythinkContainerView.toggleCloseBtn(i);
        }
    }

    @Override // com.anythink.expressad.video.signal.a.f, com.anythink.expressad.video.signal.h
    public final void webviewshow() {
        super.webviewshow();
        try {
            AnythinkContainerView anythinkContainerView = this.f21835c;
            if (anythinkContainerView != null) {
                anythinkContainerView.webviewshow();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.f, com.anythink.expressad.video.signal.i
    public final void a(String str) {
        AnythinkContainerView anythinkContainerView;
        super.a(str);
        try {
            if (this.f21834b == null || TextUtils.isEmpty(str) || !str.equals("click") || (anythinkContainerView = this.f21835c) == null) {
                return;
            }
            anythinkContainerView.triggerCloseBtn(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static String a(List<com.anythink.expressad.foundation.d.d> list, String str, String str2, JSONObject jSONObject) {
        try {
            if (list.size() <= 0) {
                return null;
            }
            com.anythink.expressad.foundation.h.b bVar = new com.anythink.expressad.foundation.h.b(com.anythink.expressad.foundation.b.a.c().e());
            Object b9 = com.anythink.expressad.foundation.d.d.b(list);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("campaignList", b9);
            jSONObject2.put("device", bVar.a());
            jSONObject2.put("unit_id", str);
            jSONObject2.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.SDK_INFO, str2);
            jSONObject2.put("unitSetting", jSONObject);
            if (com.anythink.expressad.f.b.a() != null) {
                com.anythink.expressad.f.b.a();
                String a9 = com.anythink.expressad.f.b.a(com.anythink.expressad.foundation.b.a.c().f());
                if (!TextUtils.isEmpty(a9)) {
                    JSONObject jSONObject3 = new JSONObject(a9);
                    try {
                        Context e9 = com.anythink.expressad.foundation.b.a.c().e();
                        String obj = x.b(e9, "Anythink_ConfirmTitle".concat(String.valueOf(str)), "").toString();
                        String obj2 = x.b(e9, "Anythink_ConfirmContent".concat(String.valueOf(str)), "").toString();
                        String obj3 = x.b(e9, "Anythink_CancelText".concat(String.valueOf(str)), "").toString();
                        String obj4 = x.b(e9, "Anythink_ConfirmText".concat(String.valueOf(str)), "").toString();
                        if (!TextUtils.isEmpty(obj)) {
                            jSONObject3.put(com.anythink.expressad.f.a.b.cu, obj);
                        }
                        if (!TextUtils.isEmpty(obj2)) {
                            jSONObject3.put(com.anythink.expressad.f.a.b.cv, obj2);
                        }
                        if (!TextUtils.isEmpty(obj3)) {
                            jSONObject3.put(com.anythink.expressad.f.a.b.cw, obj3);
                        }
                        if (!TextUtils.isEmpty(obj4)) {
                            jSONObject3.put(com.anythink.expressad.f.a.b.cy, obj4);
                        }
                        if (!TextUtils.isEmpty(obj4)) {
                            jSONObject3.put(com.anythink.expressad.f.a.b.cx, obj4);
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    com.anythink.expressad.f.b.a();
                    String b10 = com.anythink.expressad.f.b.b(str);
                    if (!TextUtils.isEmpty(b10)) {
                        jSONObject3.put("ivreward", new JSONObject(b10));
                    }
                    jSONObject2.put("appSetting", jSONObject3);
                }
            }
            return jSONObject2.toString();
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    private static void a(JSONObject jSONObject, String str) {
        try {
            Context e9 = com.anythink.expressad.foundation.b.a.c().e();
            String obj = x.b(e9, "Anythink_ConfirmTitle".concat(String.valueOf(str)), "").toString();
            String obj2 = x.b(e9, "Anythink_ConfirmContent".concat(String.valueOf(str)), "").toString();
            String obj3 = x.b(e9, "Anythink_CancelText".concat(String.valueOf(str)), "").toString();
            String obj4 = x.b(e9, "Anythink_ConfirmText".concat(String.valueOf(str)), "").toString();
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
}
