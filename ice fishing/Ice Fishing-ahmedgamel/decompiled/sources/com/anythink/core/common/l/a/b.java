package com.anythink.core.common.l.a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.ATBiddingListener;
import com.anythink.core.api.ATBiddingResult;
import com.anythink.core.api.ATCommonImpressionListener;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.IATBaseAdAdapter;
import com.anythink.core.common.h.n;
import com.anythink.core.common.l.g.c;
import com.anythink.core.common.v.q;
import com.anythink.core.common.v.u;
import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;
import java.util.Map;

/* loaded from: classes.dex */
public class b implements IATBaseAdAdapter {

    /* renamed from: a, reason: collision with root package name */
    private static final String f14339a = "b";

    /* renamed from: b, reason: collision with root package name */
    private static final String f14340b = "not support this format: %s";

    /* renamed from: c, reason: collision with root package name */
    private IATBaseAdAdapter f14341c;

    /* renamed from: d, reason: collision with root package name */
    private Map<Integer, Class<? extends ATBaseAdAdapter>> f14342d;

    /* renamed from: e, reason: collision with root package name */
    private String f14343e;

    public b(IATBaseAdAdapter iATBaseAdAdapter) {
        this.f14341c = iATBaseAdAdapter;
    }

    private boolean a() {
        return !TextUtils.isEmpty(this.f14343e) || this.f14341c == null;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        IATBaseAdAdapter iATBaseAdAdapter = this.f14341c;
        if (iATBaseAdAdapter != null) {
            iATBaseAdAdapter.destory();
        }
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        if (this.f14341c != null) {
            this.f14341c = a(map, map2);
            if (!a()) {
                this.f14341c.getBidRequestInfo(context, map, map2, aTBidRequestInfoListener);
            } else if (aTBidRequestInfoListener != null) {
                aTBidRequestInfoListener.onFailed(this.f14343e);
            }
        }
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public Map<Integer, Class<? extends ATBaseAdAdapter>> getFormatAdapterMap() {
        IATBaseAdAdapter iATBaseAdAdapter = this.f14341c;
        if (iATBaseAdAdapter != null) {
            return iATBaseAdAdapter.getFormatAdapterMap();
        }
        return null;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public View getMixView() {
        IATBaseAdAdapter iATBaseAdAdapter = this.f14341c;
        if (iATBaseAdAdapter != null) {
            return iATBaseAdAdapter.getMixView();
        }
        return null;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        com.anythink.core.common.l.d.b serverExtraInfo = getServerExtraInfo();
        if (serverExtraInfo != null && serverExtraInfo.q() != null) {
            return serverExtraInfo.q();
        }
        IATBaseAdAdapter iATBaseAdAdapter = this.f14341c;
        if (iATBaseAdAdapter != null) {
            return iATBaseAdAdapter.getNetworkInfoMap();
        }
        return null;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        IATBaseAdAdapter iATBaseAdAdapter = this.f14341c;
        return iATBaseAdAdapter != null ? iATBaseAdAdapter.getNetworkName() : "";
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        IATBaseAdAdapter iATBaseAdAdapter = this.f14341c;
        return iATBaseAdAdapter != null ? iATBaseAdAdapter.getNetworkPlacementId() : "";
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        IATBaseAdAdapter iATBaseAdAdapter = this.f14341c;
        return iATBaseAdAdapter != null ? iATBaseAdAdapter.getNetworkSDKVersion() : "";
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public com.anythink.core.common.l.d.b getServerExtraInfo() {
        IATBaseAdAdapter iATBaseAdAdapter = this.f14341c;
        if (iATBaseAdAdapter != null) {
            return iATBaseAdAdapter.getServerExtraInfo();
        }
        return null;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public n getTrackingInfo() {
        IATBaseAdAdapter iATBaseAdAdapter = this.f14341c;
        if (iATBaseAdAdapter != null) {
            return iATBaseAdAdapter.getTrackingInfo();
        }
        return null;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (this.f14341c != null) {
            IATBaseAdAdapter a9 = a(map, map2);
            this.f14341c = a9;
            if (a9 != null && a9.initNetworkObjectByPlacementId(context, map, map2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void internalFormatShow(Activity activity, ViewGroup viewGroup, ATCommonImpressionListener aTCommonImpressionListener) {
        IATBaseAdAdapter iATBaseAdAdapter = this.f14341c;
        if (iATBaseAdAdapter != null) {
            iATBaseAdAdapter.internalFormatShow(activity, viewGroup, aTCommonImpressionListener);
        }
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public boolean isAdReady() {
        IATBaseAdAdapter iATBaseAdAdapter = this.f14341c;
        return iATBaseAdAdapter != null && iATBaseAdAdapter.isAdReady();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void parseGlobalParams(Map<String, Object> map, Map<String, Object> map2) {
        IATBaseAdAdapter iATBaseAdAdapter = this.f14341c;
        if (iATBaseAdAdapter != null) {
            iATBaseAdAdapter.parseGlobalParams(map, map2);
        }
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void setBiddingListener(ATBiddingListener aTBiddingListener) {
        IATBaseAdAdapter iATBaseAdAdapter = this.f14341c;
        if (iATBaseAdAdapter != null) {
            iATBaseAdAdapter.setBiddingListener(aTBiddingListener);
        }
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void setLoadListener(ATCustomLoadListener aTCustomLoadListener) {
        IATBaseAdAdapter iATBaseAdAdapter = this.f14341c;
        if (iATBaseAdAdapter != null) {
            iATBaseAdAdapter.setLoadListener(aTCustomLoadListener);
        }
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void setTrackingInfo(n nVar) {
        IATBaseAdAdapter iATBaseAdAdapter = this.f14341c;
        if (iATBaseAdAdapter == null || iATBaseAdAdapter.getTrackingInfo() != null || nVar == null) {
            return;
        }
        this.f14341c.setTrackingInfo(nVar);
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z3, boolean z6) {
        IATBaseAdAdapter iATBaseAdAdapter = this.f14341c;
        if (iATBaseAdAdapter == null) {
            return false;
        }
        iATBaseAdAdapter.setUserDataConsent(context, z3, z6);
        return false;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public boolean startBiddingRequest(Context context, Map<String, Object> map, Map<String, Object> map2, ATBiddingListener aTBiddingListener) {
        if (this.f14341c == null) {
            return false;
        }
        this.f14341c = a(map, map2);
        if (a()) {
            if (aTBiddingListener != null) {
                aTBiddingListener.onC2SBiddingResultWithCache(ATBiddingResult.fail(this.f14343e), null);
            }
            return false;
        }
        IATBaseAdAdapter iATBaseAdAdapter = this.f14341c;
        if (iATBaseAdAdapter == null || aTBiddingListener == null) {
            aTBiddingListener = null;
        } else {
            com.anythink.core.common.l.d.b serverExtraInfo = iATBaseAdAdapter.getServerExtraInfo();
            if (serverExtraInfo != null && serverExtraInfo.k()) {
                aTBiddingListener = new com.anythink.core.common.l.g.b(aTBiddingListener, serverExtraInfo);
            }
        }
        this.f14341c.setBiddingListener(aTBiddingListener);
        return this.f14341c.startBiddingRequest(context, map, map2, aTBiddingListener);
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public boolean supportImpressionCallback() {
        IATBaseAdAdapter iATBaseAdAdapter = this.f14341c;
        return iATBaseAdAdapter == null || iATBaseAdAdapter.supportImpressionCallback();
    }

    private IATBaseAdAdapter a(Map<String, Object> map, Map<String, Object> map2) {
        IATBaseAdAdapter iATBaseAdAdapter;
        IATBaseAdAdapter iATBaseAdAdapter2 = this.f14341c;
        if (iATBaseAdAdapter2 != null) {
            iATBaseAdAdapter2.parseGlobalParams(map, map2);
        }
        com.anythink.core.common.l.d.b serverExtraInfo = getServerExtraInfo();
        if (serverExtraInfo == null || !serverExtraInfo.k()) {
            iATBaseAdAdapter = this.f14341c;
        } else {
            int b9 = serverExtraInfo.b();
            if (this.f14342d == null) {
                this.f14342d = getFormatAdapterMap();
            }
            Map<Integer, Class<? extends ATBaseAdAdapter>> map3 = this.f14342d;
            if (map3 == null || map3.size() <= 0) {
                this.f14343e = AbstractC4404f.e(b9, "not support this format: ");
            } else {
                Class<? extends ATBaseAdAdapter> cls = this.f14342d.get(Integer.valueOf(b9));
                if (cls != null) {
                    try {
                        iATBaseAdAdapter = u.a(cls.getName());
                    } catch (Throwable th) {
                        Log.e("anythink", th.getMessage());
                        this.f14343e = th.getMessage();
                    }
                } else {
                    this.f14343e = AbstractC4404f.e(b9, "not support this format: ");
                }
            }
            iATBaseAdAdapter = null;
        }
        if (iATBaseAdAdapter != null && iATBaseAdAdapter != this.f14341c) {
            try {
                serverExtraInfo.a(iATBaseAdAdapter);
                if (serverExtraInfo.l()) {
                    int intValue = ((Integer) q.a(map, "nw_firm_id", 0)).intValue();
                    if (intValue == 39 && map2 != null) {
                        Object obj = map2.get("huawei_request_custom_dislike");
                        boolean booleanValue = obj instanceof Boolean ? ((Boolean) obj).booleanValue() : true;
                        map2.put("huawei_request_custom_dislike", Boolean.valueOf(booleanValue));
                        if (booleanValue && !map2.containsKey(ATAdConst.KEY.AD_CHOICES_PLACEMENT)) {
                            map2.put(ATAdConst.KEY.AD_CHOICES_PLACEMENT, 2);
                        }
                    }
                    if (!serverExtraInfo.g() || map == null) {
                        if (serverExtraInfo.f() && intValue == 2 && map2 != null && !map2.containsKey(ATAdConst.KEY.AD_CHOICES_PLACEMENT)) {
                            map2.put(ATAdConst.KEY.AD_CHOICES_PLACEMENT, 2);
                        }
                    } else if (intValue != 2) {
                        if (intValue != 6) {
                            if (intValue != 8) {
                                if (intValue == 28 && !map.containsKey("video_sound")) {
                                    map.put("video_sound", 0);
                                }
                            } else if (!map.containsKey("video_muted")) {
                                map.put("video_muted", "1");
                            }
                        } else if (!map.containsKey("video_muted")) {
                            map.put("video_muted", "0");
                        }
                    } else if (map2 != null && !map2.containsKey(ATAdConst.KEY.AD_CHOICES_PLACEMENT)) {
                        map2.put(ATAdConst.KEY.AD_CHOICES_PLACEMENT, 0);
                    }
                }
                iATBaseAdAdapter.parseGlobalParams(map, map2);
                iATBaseAdAdapter.setTrackingInfo(this.f14341c.getTrackingInfo());
            } catch (Throwable unused) {
            }
        }
        return iATBaseAdAdapter;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2, ATCustomLoadListener aTCustomLoadListener) {
        if (this.f14341c != null) {
            this.f14341c = a(map, map2);
            if (a()) {
                if (aTCustomLoadListener != null) {
                    aTCustomLoadListener.onAdLoadError("", this.f14343e);
                    return;
                }
                return;
            }
            IATBaseAdAdapter iATBaseAdAdapter = this.f14341c;
            if (iATBaseAdAdapter == null || aTCustomLoadListener == null) {
                aTCustomLoadListener = null;
            } else {
                com.anythink.core.common.l.d.b serverExtraInfo = iATBaseAdAdapter.getServerExtraInfo();
                if (serverExtraInfo != null && serverExtraInfo.k()) {
                    aTCustomLoadListener = new c(aTCustomLoadListener, serverExtraInfo);
                }
            }
            iATBaseAdAdapter.setLoadListener(aTCustomLoadListener);
            this.f14341c.loadCustomNetworkAd(context, map, map2);
        }
    }

    private static void a(com.anythink.core.common.l.d.b bVar, Map<String, Object> map, Map<String, Object> map2) {
        if (bVar.l()) {
            int intValue = ((Integer) q.a(map, "nw_firm_id", 0)).intValue();
            if (intValue == 39 && map2 != null) {
                Object obj = map2.get("huawei_request_custom_dislike");
                boolean booleanValue = obj instanceof Boolean ? ((Boolean) obj).booleanValue() : true;
                map2.put("huawei_request_custom_dislike", Boolean.valueOf(booleanValue));
                if (booleanValue && !map2.containsKey(ATAdConst.KEY.AD_CHOICES_PLACEMENT)) {
                    map2.put(ATAdConst.KEY.AD_CHOICES_PLACEMENT, 2);
                }
            }
            if (!bVar.g() || map == null) {
                if (!bVar.f() || intValue != 2 || map2 == null || map2.containsKey(ATAdConst.KEY.AD_CHOICES_PLACEMENT)) {
                    return;
                }
                map2.put(ATAdConst.KEY.AD_CHOICES_PLACEMENT, 2);
                return;
            }
            if (intValue == 2) {
                if (map2 == null || map2.containsKey(ATAdConst.KEY.AD_CHOICES_PLACEMENT)) {
                    return;
                }
                map2.put(ATAdConst.KEY.AD_CHOICES_PLACEMENT, 0);
                return;
            }
            if (intValue == 6) {
                if (map.containsKey("video_muted")) {
                    return;
                }
                map.put("video_muted", "0");
            } else {
                if (intValue != 8) {
                    if (intValue == 28 && !map.containsKey("video_sound")) {
                        map.put("video_sound", 0);
                        return;
                    }
                    return;
                }
                if (map.containsKey("video_muted")) {
                    return;
                }
                map.put("video_muted", "1");
            }
        }
    }
}
