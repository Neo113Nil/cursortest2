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
    private final String f13719a = "as";

    /* renamed from: b, reason: collision with root package name */
    private String f13720b;

    /* renamed from: c, reason: collision with root package name */
    private List<c> f13721c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f13722d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f13723e;

    public final synchronized void a(String str, List<c> list) {
        boolean z8;
        if (TextUtils.equals(this.f13720b, str) && this.f13723e) {
            return;
        }
        this.f13720b = str;
        if (list != null && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                bv unitGroupInfo = list.get(i).e().getUnitGroupInfo();
                if (unitGroupInfo.g() == 8 && unitGroupInfo.aV() && unitGroupInfo.aY() == 1) {
                    z8 = true;
                    break;
                }
            }
        }
        z8 = false;
        this.f13722d = z8;
        if (z8) {
            this.f13721c = list;
            this.f13723e = false;
        } else {
            this.f13721c = null;
            this.f13723e = true;
        }
    }

    public final synchronized void a(String str, String str2, String str3) {
        List<c> list;
        double d2;
        String str4;
        Map<String, Object> networkInfoMap;
        Object obj;
        try {
            List<c> list2 = this.f13721c;
            if (list2 != null) {
                list2.size();
            }
            if (TextUtils.equals(this.f13720b, str2) && this.f13722d && !this.f13723e && (list = this.f13721c) != null && list.size() > 0) {
                this.f13723e = true;
                try {
                    ArrayList arrayList = new ArrayList();
                    Collections.sort(this.f13721c);
                    String str5 = "";
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    JSONObject jSONObject3 = new JSONObject();
                    int i = 0;
                    int i4 = 0;
                    double d3 = 0.0d;
                    while (i < this.f13721c.size()) {
                        c cVar = this.f13721c.get(i);
                        if (cVar.e() == null || cVar.e().getUnitGroupInfo() == null) {
                            d2 = 0.0d;
                        } else {
                            bv unitGroupInfo = cVar.e().getUnitGroupInfo();
                            d2 = 0.0d;
                            if (TextUtils.equals(str3, unitGroupInfo.z())) {
                                str5 = cVar.i().aK();
                                jSONObject.put("nw_firm_id", unitGroupInfo.g());
                                jSONObject.put(e.a.f12225h, a(unitGroupInfo.D()));
                                BaseAd f6 = cVar.f();
                                if (f6 != null) {
                                    jSONObject.put("advertiser_name", f6.getAdvertiserName());
                                    jSONObject.put("title", f6.getTitle());
                                    jSONObject.put("image_url", f6.getMainImageUrl());
                                    jSONObject.put("desc", f6.getDescriptionText());
                                    jSONObject.put("video_url", f6.getVideoUrl());
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
                                if (d3 == d2) {
                                    d3 = a(unitGroupInfo2.D());
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
                    com.anythink.core.common.u.e.a(str, str2, str5, d3, jSONObject2.toString(), jSONObject.toString(), jSONObject3.toString());
                    this.f13721c = null;
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
