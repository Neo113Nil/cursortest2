package com.anythink.network.adx;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.c;
import com.anythink.basead.f.d.b;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBidRequestInfo;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.common.a.d;
import com.anythink.core.common.a.f;
import com.anythink.core.common.a.j;
import com.anythink.core.common.d.t;
import com.anythink.core.common.k;
import com.anythink.core.d.l;
import com.anythink.core.d.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AdxBidRequestInfo extends ATBidRequestInfo {

    /* renamed from: a, reason: collision with root package name */
    JSONObject f23206a;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
    
        if (r12 != 4) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AdxBidRequestInfo(Context context, String str, Map<String, Object> map, Map<String, Object> map2, int i) {
        int i4;
        int i9;
        JSONObject jSONObject = new JSONObject();
        this.f23206a = jSONObject;
        try {
            AdxATInitManager.getInstance();
            jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.SUPPORT_TEMPLATE_VERSION, AdxATInitManager.a() ? 1 : 0);
            l b9 = n.a(context).b(str);
            if (b9 != null) {
                int aO = b9.aO();
                if (aO > 0) {
                    List<j> a9 = d.a().a(aO);
                    if (a9.size() > 0) {
                        this.f23206a.put(l.a.f17555P, a(a9));
                    }
                }
                int aN = b9.aN();
                if (aN > 0) {
                    List<j> b10 = d.a().b(aN);
                    if (b10.size() > 0) {
                        this.f23206a.put(l.a.f17554O, a(b10));
                    }
                }
            }
            if (!TextUtils.isEmpty(b9.bp())) {
                try {
                    AdxATInitManager.getInstance();
                    JSONArray b11 = AdxATInitManager.b();
                    if (b11 != null && b11.length() > 0) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(b.f9099a, b11);
                        this.f23206a.put("ss_dsp_rt", jSONObject2);
                    }
                } catch (Throwable unused) {
                }
            }
            JSONObject jSONObject3 = this.f23206a;
            if (jSONObject3 != null) {
                try {
                    if (i != 0) {
                        if (i != 1) {
                            if (i == 2) {
                                String obj = map.get("size").toString();
                                if (!TextUtils.isEmpty(obj)) {
                                    String[] split = obj.split("x");
                                    int parseInt = Integer.parseInt(split[0]);
                                    int parseInt2 = Integer.parseInt(split[1]);
                                    jSONObject3.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_WIDTH, parseInt);
                                    jSONObject3.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_HEIGHT, parseInt2);
                                }
                            } else if (i != 3) {
                            }
                        }
                        jSONObject3.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_WIDTH, context.getResources().getDisplayMetrics().widthPixels);
                        jSONObject3.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_HEIGHT, context.getResources().getDisplayMetrics().heightPixels);
                    } else {
                        if (map2 != null) {
                            i4 = ATInitMediation.getIntFromMap(map2, ATAdConst.KEY.AD_WIDTH);
                            i9 = ATInitMediation.getIntFromMap(map2, ATAdConst.KEY.AD_HEIGHT);
                        } else {
                            i4 = -1;
                            i9 = -1;
                        }
                        if (i4 > 0) {
                            jSONObject3.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_WIDTH, Math.min(context.getResources().getDisplayMetrics().widthPixels, i4));
                        }
                        if (i9 > 0) {
                            jSONObject3.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_HEIGHT, Math.min(context.getResources().getDisplayMetrics().heightPixels, i9));
                        }
                    }
                } catch (Throwable unused2) {
                }
            }
            f.a().a(str, this.f23206a);
            String c4 = com.anythink.basead.j.f.a().c();
            if (!TextUtils.isEmpty(c4)) {
                this.f23206a.put("om_ver", c4);
            }
            if (t.b().c("sensor_deny")) {
                this.f23206a.put("sensor_deny", 1);
            }
        } catch (Throwable unused3) {
        }
    }

    private static JSONObject a(List<j> list) {
        JSONObject jSONObject = new JSONObject();
        try {
            HashMap hashMap = new HashMap();
            for (j jVar : list) {
                List list2 = (List) hashMap.get(jVar.a());
                if (list2 == null) {
                    list2 = new ArrayList();
                    hashMap.put(jVar.a(), list2);
                }
                list2.add(jVar.b());
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                jSONObject.put((String) entry.getKey(), new JSONArray((Collection) entry.getValue()));
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public void fillAdAcceptType(int i, String str) {
        try {
            if (this.f23206a != null) {
                JSONArray jSONArray = new JSONArray(ATAdConst.AD_SUPPORT_TYPE_ARRAY);
                if ((i == 1 || i == 3 || i == 4) && c.a().g()) {
                    jSONArray.put(4);
                }
                this.f23206a.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.ADP_ACCEPT_TYPE, jSONArray);
                this.f23206a.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.ADP_ACCEPT_VAST_VER, new JSONArray(ATAdConst.AD_SUPPORT_VAST_VERSION_ARRAY));
            }
        } catch (Throwable unused) {
        }
    }

    public void fillBannerData(Map<String, Object> map) {
        fillAdAcceptType(2, null);
    }

    public void fillInterstitial(Map<String, Object> map) {
        String str;
        try {
            String stringFromMap = ATInitMediation.getStringFromMap(map, "unit_type");
            if (!TextUtils.isEmpty(stringFromMap)) {
                this.f23206a.put("unit_type", Integer.parseInt(stringFromMap));
            }
            str = ATInitMediation.getStringFromMap(map, k.aF);
            try {
                if (!TextUtils.isEmpty(str)) {
                    this.f23206a.put("ir_type", str);
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            str = null;
        }
        fillAdAcceptType(3, str);
    }

    public void fillNative(Map<String, Object> map) {
        if (!TextUtils.equals("1", ATInitMediation.getStringFromMap(map, "layout_type"))) {
            try {
                this.f23206a.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.ADP_ACCEPT_TYPE, new JSONArray(ATAdConst.AD_SUPPORT_TYPE_ARRAY_ONLY_PMP_SELF_REDNER));
            } catch (Throwable unused) {
            }
        } else {
            fillAdAcceptType(0, null);
            AdxATInitManager.getInstance();
            fillTemplateIds(AdxATInitManager.a(map));
        }
    }

    public void fillRewardedVideo(Map<String, Object> map) {
        fillAdAcceptType(1, null);
    }

    public void fillSplashData() {
        try {
            this.f23206a.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.GET_OFFER, 2);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(4);
            jSONArray.put(5);
            this.f23206a.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_MTG_DSP_MIX_TYPE, jSONArray);
        } catch (Throwable unused) {
        }
        fillAdAcceptType(4, null);
    }

    public void fillTemplateIds(JSONArray jSONArray) {
        try {
            if (this.f23206a == null || jSONArray == null) {
                return;
            }
            JSONArray jSONArray2 = new JSONArray();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                jSONArray2.put(jSONArray.getInt(i));
            }
            this.f23206a.put("nv_unit_type", jSONArray2);
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.core.api.ATBidRequestInfo
    public JSONObject toRequestJSONObject() {
        return this.f23206a;
    }

    private static void a(Context context, JSONObject jSONObject, Map<String, Object> map, Map<String, Object> map2, int i) {
        int i4;
        int i9;
        if (jSONObject == null) {
            return;
        }
        try {
            if (i == 0) {
                if (map2 != null) {
                    i4 = ATInitMediation.getIntFromMap(map2, ATAdConst.KEY.AD_WIDTH);
                    i9 = ATInitMediation.getIntFromMap(map2, ATAdConst.KEY.AD_HEIGHT);
                } else {
                    i4 = -1;
                    i9 = -1;
                }
                if (i4 > 0) {
                    jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_WIDTH, Math.min(context.getResources().getDisplayMetrics().widthPixels, i4));
                }
                if (i9 > 0) {
                    jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_HEIGHT, Math.min(context.getResources().getDisplayMetrics().heightPixels, i9));
                    return;
                }
                return;
            }
            if (i != 1) {
                if (i == 2) {
                    String obj = map.get("size").toString();
                    if (TextUtils.isEmpty(obj)) {
                        return;
                    }
                    String[] split = obj.split("x");
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_WIDTH, parseInt);
                    jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_HEIGHT, parseInt2);
                    return;
                }
                if (i != 3 && i != 4) {
                    return;
                }
            }
            jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_WIDTH, context.getResources().getDisplayMetrics().widthPixels);
            jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_HEIGHT, context.getResources().getDisplayMetrics().heightPixels);
        } catch (Throwable unused) {
        }
    }
}
