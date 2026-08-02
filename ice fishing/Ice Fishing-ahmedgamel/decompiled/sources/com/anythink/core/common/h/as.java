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
    private final String f14348a = "as";

    /* renamed from: b, reason: collision with root package name */
    private String f14349b;

    /* renamed from: c, reason: collision with root package name */
    private List<c> f14350c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f14351d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14352e;

    public final synchronized void a(String str, List<c> list) {
        boolean z6;
        if (TextUtils.equals(this.f14349b, str) && this.f14352e) {
            return;
        }
        this.f14349b = str;
        if (list != null && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                bv unitGroupInfo = list.get(i).e().getUnitGroupInfo();
                if (unitGroupInfo.g() == 8 && unitGroupInfo.aV() && unitGroupInfo.aY() == 1) {
                    z6 = true;
                    break;
                }
            }
        }
        z6 = false;
        this.f14351d = z6;
        if (z6) {
            this.f14350c = list;
            this.f14352e = false;
        } else {
            this.f14350c = null;
            this.f14352e = true;
        }
    }

    public final synchronized void a(String str, String str2, String str3) {
        List<c> list;
        double d9;
        String str4;
        Map<String, Object> networkInfoMap;
        Object obj;
        try {
            List<c> list2 = this.f14350c;
            if (list2 != null) {
                list2.size();
            }
            if (TextUtils.equals(this.f14349b, str2) && this.f14351d && !this.f14352e && (list = this.f14350c) != null && list.size() > 0) {
                this.f14352e = true;
                try {
                    ArrayList arrayList = new ArrayList();
                    Collections.sort(this.f14350c);
                    String str5 = "";
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    JSONObject jSONObject3 = new JSONObject();
                    int i = 0;
                    int i4 = 0;
                    double d10 = 0.0d;
                    while (i < this.f14350c.size()) {
                        c cVar = this.f14350c.get(i);
                        if (cVar.e() == null || cVar.e().getUnitGroupInfo() == null) {
                            d9 = 0.0d;
                        } else {
                            bv unitGroupInfo = cVar.e().getUnitGroupInfo();
                            d9 = 0.0d;
                            if (TextUtils.equals(str3, unitGroupInfo.z())) {
                                str5 = cVar.i().aK();
                                jSONObject.put("nw_firm_id", unitGroupInfo.g());
                                jSONObject.put(e.a.f12854h, a(unitGroupInfo.D()));
                                BaseAd f2 = cVar.f();
                                if (f2 != null) {
                                    jSONObject.put("advertiser_name", f2.getAdvertiserName());
                                    jSONObject.put("title", f2.getTitle());
                                    jSONObject.put("image_url", f2.getMainImageUrl());
                                    jSONObject.put("desc", f2.getDescriptionText());
                                    jSONObject.put("video_url", f2.getVideoUrl());
                                }
                                i4 = i;
                            }
                        }
                        if (i < i4 || cVar.e() == null || cVar.e().getUnitGroupInfo() == null) {
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
                                if (d10 == d9) {
                                    d10 = a(unitGroupInfo2.D());
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
                    com.anythink.core.common.u.e.a(str, str2, str5, d10, jSONObject2.toString(), jSONObject.toString(), jSONObject3.toString());
                    this.f14350c = null;
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

    private static double a(double d9) {
        return ATSDKUtils.getUsdChangeToRmbRate() > 0.0d ? ATSDKUtils.getUsdChangeToRmbRate() * d9 : d9;
    }
}
