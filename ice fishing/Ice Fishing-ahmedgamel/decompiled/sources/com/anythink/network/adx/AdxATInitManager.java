package com.anythink.network.adx;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.f.c.a;
import com.anythink.basead.j.f;
import com.anythink.basead.k.c;
import com.anythink.basead.plugin.InnerQMHandler;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.ATSDK;
import com.anythink.core.api.MediationInitCallback;
import com.anythink.core.common.d.j;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.n;
import com.anythink.core.common.h.x;
import com.anythink.expressad.a.b;
import com.google.android.gms.internal.ads.Wv;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class AdxATInitManager extends ATInitMediation {

    /* renamed from: a, reason: collision with root package name */
    private static String f23790a = "AdxATInitManager";

    /* renamed from: b, reason: collision with root package name */
    private static volatile AdxATInitManager f23791b;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f23792o = 0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f23793c;

    /* renamed from: f, reason: collision with root package name */
    private List<MediationInitCallback> f23796f;

    /* renamed from: h, reason: collision with root package name */
    private String f23798h;

    /* renamed from: d, reason: collision with root package name */
    private AtomicBoolean f23794d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    private AtomicBoolean f23795e = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    private final Object f23797g = new Object();

    private AdxATInitManager() {
        try {
            a.a(b.a());
        } catch (Throwable unused) {
        }
        try {
            com.anythink.basead.f.d.b.a(InnerQMHandler.getInstance());
        } catch (Throwable unused2) {
        }
        try {
            f.a().a(new c());
        } catch (Throwable unused3) {
        }
    }

    private void a(boolean z6, String str) {
        synchronized (this.f23797g) {
            try {
                int size = this.f23796f.size();
                for (int i = 0; i < size; i++) {
                    MediationInitCallback mediationInitCallback = this.f23796f.get(i);
                    if (mediationInitCallback != null) {
                        if (z6) {
                            mediationInitCallback.onSuccess();
                        } else {
                            mediationInitCallback.onFail(str);
                        }
                    }
                }
                this.f23796f.clear();
                this.f23794d.set(false);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static JSONArray b() {
        if (com.anythink.basead.f.d.b.a() != null) {
            return com.anythink.basead.f.d.b.a().a();
        }
        return null;
    }

    private String c() {
        StringBuilder sb = new StringBuilder("The ");
        sb.append(this.f23798h);
        sb.append(" resources are missing, If shrinkResources is enabled, the ");
        return Wv.i(sb, this.f23798h, " resources must be added to the whitelist (keep.xml)");
    }

    public static AdxATInitManager getInstance() {
        if (f23791b == null) {
            synchronized (AdxATInitManager.class) {
                try {
                    if (f23791b == null) {
                        f23791b = new AdxATInitManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f23791b;
    }

    @Override // com.anythink.core.api.ATInitMediation
    public String getAdapterVersion() {
        return "UA_6.5.13";
    }

    @Override // com.anythink.core.api.ATInitMediation
    public String getNetworkName() {
        return "Adx";
    }

    @Override // com.anythink.core.api.ATInitMediation
    public String getNetworkSDKClass() {
        return "com.anythink.core.api.ATSDK";
    }

    @Override // com.anythink.core.api.ATInitMediation
    public String getNetworkVersion() {
        return ATSDK.getSDKVersionName();
    }

    @Override // com.anythink.core.api.ATInitMediation
    public List getResourceStatus() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("anythink_myoffer_full_screen");
        arrayList.add("anythink_myoffer_splash_ad_layout_asseblem_vertical_port");
        return arrayList;
    }

    @Override // com.anythink.core.api.ATInitMediation
    public void initSDK(Context context, Map<String, Object> map, MediationInitCallback mediationInitCallback) {
        if (this.f23793c) {
            if (TextUtils.isEmpty(this.f23798h)) {
                if (mediationInitCallback != null) {
                    mediationInitCallback.onSuccess();
                    return;
                }
                return;
            } else {
                if (mediationInitCallback != null) {
                    mediationInitCallback.onFail(c());
                    return;
                }
                return;
            }
        }
        synchronized (this.f23797g) {
            try {
                if (this.f23796f == null) {
                    this.f23796f = new ArrayList();
                }
                if (mediationInitCallback != null) {
                    this.f23796f.add(mediationInitCallback);
                }
                if (this.f23794d.get()) {
                    return;
                }
                this.f23794d.set(true);
                String a9 = t.b().a(context, getResourceStatus(), getDevBundleName());
                this.f23798h = a9;
                if (!TextUtils.isEmpty(a9)) {
                    a(false, c());
                    return;
                }
                com.anythink.basead.c.a().a(context);
                this.f23793c = true;
                a(true, "");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean a() {
        return a.a();
    }

    public static void a(n nVar, x xVar) {
        if (nVar == null || xVar == null) {
            return;
        }
        nVar.ab(xVar.f14950k);
    }

    public static JSONArray a(Map<String, Object> map) {
        String stringFromMap = ATInitMediation.getStringFromMap(map, "nv_tmpl_id", "[\"1\",\"2\",\"3\",\"4\",\"5\"]");
        if (!TextUtils.isEmpty(stringFromMap)) {
            try {
                JSONArray jSONArray = new JSONArray(stringFromMap);
                if (jSONArray.length() > 0) {
                    return jSONArray;
                }
            } catch (Throwable unused) {
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put("1");
        jSONArray2.put("2");
        jSONArray2.put("3");
        jSONArray2.put("4");
        jSONArray2.put("5");
        return jSONArray2;
    }

    public final void a(final Context context, final Map<String, Object> map, final Map<String, Object> map2, final ATBidRequestInfoListener aTBidRequestInfoListener, final int i) {
        com.anythink.basead.c.a().b();
        getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.anythink.network.adx.AdxATInitManager.1
            @Override // com.anythink.core.api.MediationInitCallback
            public final void onFail(String str) {
                ATBidRequestInfoListener aTBidRequestInfoListener2 = aTBidRequestInfoListener;
                if (aTBidRequestInfoListener2 != null) {
                    aTBidRequestInfoListener2.onFailed(str);
                }
            }

            @Override // com.anythink.core.api.MediationInitCallback
            public final void onSuccess() {
                x xVar = (x) map.get(j.w.f13400a);
                AdxBidRequestInfo adxBidRequestInfo = new AdxBidRequestInfo(context, xVar != null ? xVar.f14942b : "", map, map2, i);
                int i4 = i;
                if (i4 == 0) {
                    adxBidRequestInfo.fillNative(map);
                } else if (i4 == 1) {
                    adxBidRequestInfo.fillRewardedVideo(map);
                } else if (i4 == 2) {
                    adxBidRequestInfo.fillBannerData(map);
                } else if (i4 == 3) {
                    adxBidRequestInfo.fillInterstitial(map);
                } else if (i4 == 4) {
                    adxBidRequestInfo.fillSplashData();
                }
                ATBidRequestInfoListener aTBidRequestInfoListener2 = aTBidRequestInfoListener;
                if (aTBidRequestInfoListener2 != null) {
                    aTBidRequestInfoListener2.onSuccess(adxBidRequestInfo);
                }
            }
        });
    }
}
