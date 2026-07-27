package com.anythink.core.common.h;

import android.text.TextUtils;
import com.anythink.core.api.ATSDKUtils;
import com.anythink.core.api.BaseAd;
import com.anythink.core.c.b.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class as {

    /* renamed from: a, reason: collision with root package name */
    private final String f13562a = "as";

    /* renamed from: b, reason: collision with root package name */
    private String f13563b;

    /* renamed from: c, reason: collision with root package name */
    private List<c> f13564c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f13565d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f13566e;

    public final synchronized void a(String str, List<c> list) {
        boolean z3;
        if (TextUtils.equals(this.f13563b, str) && this.f13566e) {
            return;
        }
        this.f13563b = str;
        if (list != null && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                bv unitGroupInfo = list.get(i).e().getUnitGroupInfo();
                if (unitGroupInfo.g() == 8 && unitGroupInfo.aV() && unitGroupInfo.aY() == 1) {
                    z3 = true;
                    break;
                }
            }
        }
        z3 = false;
        this.f13565d = z3;
        if (z3) {
            this.f13564c = list;
            this.f13566e = false;
        } else {
            this.f13564c = null;
            this.f13566e = true;
        }
    }

    public final synchronized void a(String str, String str2, String str3) {
        List<c> list;
        double d2;
        String str4;
        Map<String, Object> networkInfoMap;
        Object obj;
        try {
            List<c> list2 = this.f13564c;
            if (list2 != null) {
                list2.size();
            }
            if (TextUtils.equals(this.f13563b, str2) && this.f13565d && !this.f13566e && (list = this.f13564c) != null && list.size() > 0) {
                this.f13566e = true;
                try {
                    ArrayList arrayList = new ArrayList();
                    Collections.sort(this.f13564c);
                    String str5 = "";
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    JSONObject jSONObject3 = new JSONObject();
                    int i = 0;
                    int i6 = 0;
                    double d9 = 0.0d;
                    while (i < this.f13564c.size()) {
                        c cVar = this.f13564c.get(i);
                        if (cVar.e() == null || cVar.e().getUnitGroupInfo() == null) {
                            d2 = 0.0d;
                        } else {
                            bv unitGroupInfo = cVar.e().getUnitGroupInfo();
                            d2 = 0.0d;
                            if (TextUtils.equals(str3, unitGroupInfo.z())) {
                                str5 = cVar.i().aK();
                                jSONObject.put("nw_firm_id", unitGroupInfo.g());
                                jSONObject.put(e.a.f12068h, a(unitGroupInfo.D()));
                                BaseAd f3 = cVar.f();
                                if (f3 != null) {
                                    jSONObject.put("advertiser_name", f3.getAdvertiserName());
                                    jSONObject.put("title", f3.getTitle());
                                    jSONObject.put("image_url", f3.getMainImageUrl());
                                    jSONObject.put("desc", f3.getDescriptionText());
                                    jSONObject.put("video_url", f3.getVideoUrl());
                                }
                                i6 = i;
                            }
                        }
                        if (i < i6 || cVar.e() == null || cVar.e().getUnitGroupInfo() == null) {
                            str4 = str5;
                        } else {
                            bv unitGroupInfo2 = cVar.e().getUnitGroupInfo();
                            if (cVar.f() != null) {
                                networkInfoMap = cVar.f().getNetworkInfoMap();
                            } else {
                                networkInfoMap = cVar.e().getNetworkInfoMap();
                            }
                            String networkPlacementId = cVar.e().getNetworkPlacementId();
                            str4 = str5;
                            if (unitGroupInfo2.g() == 8) {
                                if (d9 == d2) {
                                    d9 = a(unitGroupInfo2.D());
                                }
                                if (!TextUtils.isEmpty(networkPlacementId)) {
                                    String str6 = "";
                                    if (networkInfoMap != null && (obj = networkInfoMap.get("request_id")) != null) {
                                        str6 = obj.toString();
                                    }
                                    jSONObject2.put(networkPlacementId, str6 + "," + String.valueOf(cVar.d() - cVar.i().ab()) + "," + a(unitGroupInfo2.D()));
                                }
                            } else if (!arrayList.contains(Integer.valueOf(unitGroupInfo2.g()))) {
                                arrayList.add(Integer.valueOf(unitGroupInfo2.g()));
                                StringBuilder sb = new StringBuilder();
                                sb.append(unitGroupInfo2.g());
                                jSONObject3.put(sb.toString(), a(unitGroupInfo2.D()));
                            }
                        }
                        i++;
                        str5 = str4;
                    }
                    com.anythink.core.common.u.e.a(str, str2, str5, d9, jSONObject2.toString(), jSONObject.toString(), jSONObject3.toString());
                    this.f13564c = null;
                    jSONObject.toString();
                    jSONObject2.toString();
                    jSONObject3.toString();
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static double a(double d2) {
        return ATSDKUtils.getUsdChangeToRmbRate() > 0.0d ? ATSDKUtils.getUsdChangeToRmbRate() * d2 : d2;
    }
}
