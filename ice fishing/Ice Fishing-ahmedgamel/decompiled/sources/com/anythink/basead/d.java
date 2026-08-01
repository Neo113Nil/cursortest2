package com.anythink.basead;

import android.text.TextUtils;
import com.anythink.basead.d.j;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.d.t;
import com.anythink.core.common.e.g;
import com.anythink.core.common.h.ad;
import com.anythink.core.common.h.bj;
import com.anythink.core.common.h.bk;
import com.anythink.core.common.h.r;
import com.anythink.core.common.h.w;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class d {
    public static Map<String, Object> a(com.anythink.basead.f.c cVar) {
        if (cVar != null) {
            return a(cVar.d());
        }
        return null;
    }

    public static Map<String, Object> a(com.anythink.basead.h.c cVar) {
        if (cVar != null) {
            return a(cVar.e());
        }
        return null;
    }

    public static Map<String, Object> a(w wVar) {
        if (wVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("offer_id", wVar.v());
        hashMap.put("creative_id", wVar.w());
        hashMap.put(ATAdConst.NETWORK_CUSTOM_KEY.IS_DEEPLINK_OFFER, Integer.valueOf((TextUtils.isEmpty(wVar.u()) && TextUtils.isEmpty(wVar.G())) ? 0 : 1));
        if (wVar instanceof bj) {
            bj bjVar = (bj) wVar;
            hashMap.put("dsp_id", bjVar.aD());
            if (bjVar.r() instanceof bk) {
                hashMap.put(ATAdConst.NETWORK_CUSTOM_KEY.WS_IMP_SWITCH, Integer.valueOf(((bk) bjVar.r()).c()));
            }
            if (wVar instanceof r) {
                hashMap.put(ATAdConst.NETWORK_CUSTOM_KEY.WS_ACTION, new ad.a() { // from class: com.anythink.basead.d.1

                    /* renamed from: b, reason: collision with root package name */
                    private j f6107b;

                    {
                        this.f6107b = new j(w.this.q(), "");
                    }

                    @Override // com.anythink.core.common.h.ad.a
                    public final void a(Map<String, Object> map) {
                        j jVar = this.f6107b;
                        jVar.f6222r = map;
                        com.anythink.basead.b.b.a(10, w.this, jVar);
                        com.anythink.core.common.a.a.a();
                        com.anythink.core.common.a.a.c(t.b().g(), ((r) w.this).e());
                    }

                    @Override // com.anythink.core.common.h.ad.a
                    public final void b(Map<String, Object> map) {
                        j jVar = this.f6107b;
                        jVar.f6222r = map;
                        com.anythink.basead.b.b.a(36, w.this, jVar);
                    }
                });
                if (!wVar.L()) {
                    if (bjVar.r().ap() == 1) {
                        hashMap.put(ATAdConst.NETWORK_CUSTOM_KEY.RV_ANIM_TYPE, "6");
                    } else if (bjVar.r().aq() > 0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(bjVar.r().aq());
                        hashMap.put(ATAdConst.NETWORK_CUSTOM_KEY.RV_ANIM_TYPE, sb.toString());
                    }
                }
                r rVar = (r) wVar;
                hashMap.put("app_name", rVar.aL());
                hashMap.put("app_publisher", rVar.M());
                hashMap.put("app_version", rVar.N());
                hashMap.put("app_privacy", rVar.O());
                hashMap.put("app_permission", rVar.P());
                hashMap.put(g.a.f12959N, rVar.h());
                hashMap.put("app_url", rVar.H());
            }
        }
        return hashMap;
    }
}
