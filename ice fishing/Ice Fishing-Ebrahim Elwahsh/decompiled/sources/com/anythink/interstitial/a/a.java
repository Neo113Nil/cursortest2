package com.anythink.interstitial.a;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.widget.Toast;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATEventInterface;
import com.anythink.core.api.ATNativeAdCustomRender;
import com.anythink.core.api.ATShowConfig;
import com.anythink.core.common.d.j;
import com.anythink.core.common.d.m;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.n;
import com.anythink.core.common.v.ab;
import com.anythink.core.common.v.q;
import com.anythink.core.d.l;
import com.anythink.expressad.foundation.h.k;
import com.anythink.interstitial.api.ATInterstitialListener;
import com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter;
import com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private static final String f22787b = "a";

    /* renamed from: c, reason: collision with root package name */
    private static final int f22788c = 1;

    /* renamed from: d, reason: collision with root package name */
    private static final int f22789d = 2;

    /* renamed from: a, reason: collision with root package name */
    ATNativeAdCustomRender f22790a;

    /* renamed from: e, reason: collision with root package name */
    private final WeakReference<Activity> f22791e;

    /* renamed from: f, reason: collision with root package name */
    private final String f22792f;

    /* renamed from: g, reason: collision with root package name */
    private final ATShowConfig f22793g;

    /* renamed from: h, reason: collision with root package name */
    private final ATInterstitialListener f22794h;
    private final ATEventInterface i;

    /* renamed from: j, reason: collision with root package name */
    private final Map<String, Object> f22795j;

    /* renamed from: k, reason: collision with root package name */
    private final b f22796k;

    /* renamed from: l, reason: collision with root package name */
    private CustomInterstitialAdapter f22797l;

    /* renamed from: m, reason: collision with root package name */
    private com.anythink.core.common.h.c f22798m;

    /* renamed from: p, reason: collision with root package name */
    private int f22801p;

    /* renamed from: u, reason: collision with root package name */
    private int f22806u;

    /* renamed from: n, reason: collision with root package name */
    private int f22799n = 0;

    /* renamed from: o, reason: collision with root package name */
    private int f22800o = 1;

    /* renamed from: q, reason: collision with root package name */
    private final List<Integer> f22802q = Arrays.asList(8, 15, 22, 28);

    /* renamed from: r, reason: collision with root package name */
    private final List<CustomInterstitialAdapter> f22803r = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    private final List<CustomInterstitialAdapter> f22804s = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    private final Map<CustomInterstitialAdapter, WeakReference<Activity>> f22805t = new HashMap();

    /* renamed from: v, reason: collision with root package name */
    private int f22807v = 3;

    /* renamed from: w, reason: collision with root package name */
    private int f22808w = -1;

    /* renamed from: x, reason: collision with root package name */
    private final Handler f22809x = new Handler(Looper.getMainLooper()) { // from class: com.anythink.interstitial.a.a.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                ab.b(j.f12528s, "handleMessage:0x002:" + a.this.f22799n);
                if (a.this.f22799n != 1) {
                    ab.b(j.f12528s, "handleMessage:0x002:carouselState!=1");
                    return;
                }
                Object obj = message.obj;
                if (!(obj instanceof Integer)) {
                    a.o(a.this);
                    ab.b(j.f12528s, "handleMessage:0x002:msg.obj is not Integer");
                    return;
                }
                try {
                    int intValue = ((Integer) obj).intValue() / 1000;
                    com.anythink.core.common.h.c i4 = a.this.i();
                    if (i4 == null) {
                        a.o(a.this);
                        ab.b(j.f12528s, "handleMessage:0x002:没有可以轮播的广告了终止轮播");
                        return;
                    }
                    a.this.f22798m = i4;
                    if (a.this.f22798m.e() != null) {
                        ab.b(j.f12528s, "handleMessage:nextPlayAdCacheInfo:" + a.this.f22798m.e().getNetworkName());
                    }
                    Context g9 = t.b().g();
                    if (g9 == null) {
                        g9 = a.this.g();
                    }
                    if (g9 != null) {
                        String str = "";
                        try {
                            str = g9.getString(q.a(g9, "interstitial_text_next_play", k.f19794g));
                        } catch (Exception unused) {
                        }
                        a.a(g9, str, intValue);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    a.o(a.this);
                    th.printStackTrace();
                    return;
                }
            }
            try {
                ab.b(j.f12528s, "handleMessage:0x001:" + a.this.f22799n);
                if (a.this.f22798m == null || !a.this.f22798m.k() || a.this.f22799n != 1) {
                    if (a.this.f22798m != null) {
                        ab.b(j.f12528s, "handleMessage:0x001:nextPlayAdCacheInfo:" + a.this.f22798m.k() + ":carouselState:" + a.this.f22799n);
                    } else {
                        ab.b(j.f12528s, "handleMessage:0x001:nextPlayAdCacheInfo is null and carouselState=" + a.this.f22799n);
                    }
                    a.o(a.this);
                    return;
                }
                if (a.this.f22800o >= a.this.f22801p) {
                    a.o(a.this);
                    ab.b(j.f12528s, "handleMessage:0x001:rotation_num is out");
                    return;
                }
                String e6 = a.e(a.this);
                if (!TextUtils.isEmpty(e6)) {
                    a.o(a.this);
                    com.anythink.core.common.u.e.a("1", a.this.f22797l != null ? a.this.f22797l.getTrackingInfo() : null, t.b().W(), e6);
                    ab.b(j.f12528s, "handleMessage:0x001:close is exception:".concat(String.valueOf(e6)));
                    return;
                }
                ab.b(j.f12528s, "handleMessage:0x001:close:success");
                if (a.this.f22796k == null) {
                    a.o(a.this);
                    return;
                }
                ATBaseAdAdapter e9 = a.this.f22798m.e();
                if (e9 != null) {
                    ab.b(j.f12528s, "handleMessage:0x001:internalShow:" + e9.getNetworkName());
                    e9.setCarouselShowType(1);
                }
                if (a.this.f22808w > 0) {
                    a.h(a.this);
                }
                a.i(a.this);
                a.this.f22796k.a(a.this.g(), a.this.f22798m, a.this.f22793g, a.this.f22794h, a.this.i, a.this.f22795j, a.this.f22790a);
            } catch (Throwable th2) {
                a.o(a.this);
                th2.printStackTrace();
            }
        }
    };

    /* renamed from: y, reason: collision with root package name */
    private final m f22810y = new m() { // from class: com.anythink.interstitial.a.a.2
        @Override // com.anythink.core.common.d.m
        public final void a(boolean z8) {
            ab.b(j.f12528s, "backToForeground:".concat(String.valueOf(z8)));
            if (z8) {
                return;
            }
            a.o(a.this);
            if (a.this.f22797l == null || a.this.f22797l.getTrackingInfo() == null) {
                return;
            }
            com.anythink.core.common.u.e.a(a.this.f22797l.getTrackingInfo(), String.valueOf(a.this.f()));
        }
    };

    /* renamed from: z, reason: collision with root package name */
    private final Map<CustomInterstitialAdapter, CustomInterstitialEventListener> f22811z = new HashMap();

    public a(Activity activity, ATShowConfig aTShowConfig, ATInterstitialListener aTInterstitialListener, ATEventInterface aTEventInterface, Map<String, Object> map, ATNativeAdCustomRender aTNativeAdCustomRender, String str, b bVar) {
        this.f22791e = new WeakReference<>(activity);
        this.f22793g = aTShowConfig;
        this.f22794h = aTInterstitialListener;
        this.i = aTEventInterface;
        this.f22795j = map;
        this.f22790a = aTNativeAdCustomRender;
        this.f22792f = str;
        this.f22796k = bVar;
    }

    public static /* synthetic */ String e(a aVar) {
        return aVar.a(1);
    }

    public static /* synthetic */ int h(a aVar) {
        int i = aVar.f22808w;
        aVar.f22808w = i - 1;
        return i;
    }

    public static /* synthetic */ int i(a aVar) {
        int i = aVar.f22800o;
        aVar.f22800o = i + 1;
        return i;
    }

    public static /* synthetic */ int o(a aVar) {
        aVar.f22799n = 2;
        return 2;
    }

    private static void b(Context context, String str, int i) {
        try {
            if (!TextUtils.isEmpty(str)) {
                Toast.makeText(context, str.replace("_SEC_", String.valueOf(i)), 1).show();
                return;
            }
            Toast.makeText(context, i + "秒后展示下一个广告", 1).show();
        } catch (Throwable unused) {
        }
    }

    private boolean d(CustomInterstitialAdapter customInterstitialAdapter) {
        n trackingInfo;
        bv unitGroupInfo;
        if (customInterstitialAdapter != null && (trackingInfo = customInterstitialAdapter.getTrackingInfo()) != null && (unitGroupInfo = customInterstitialAdapter.getUnitGroupInfo()) != null) {
            if (trackingInfo.ad() != 3) {
                return true;
            }
            int ah = unitGroupInfo.ah();
            if (this.f22802q.contains(Integer.valueOf(trackingInfo.Y())) && ah == 1) {
                return true;
            }
        }
        return false;
    }

    private Activity e(CustomInterstitialAdapter customInterstitialAdapter) {
        WeakReference<Activity> remove = this.f22805t.remove(customInterstitialAdapter);
        if (remove != null) {
            return remove.get();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Activity g() {
        Activity activity = this.f22791e.get() != null ? this.f22791e.get() : null;
        return activity == null ? t.b().N() : activity;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049 A[Catch: all -> 0x011d, TryCatch #0 {all -> 0x011d, blocks: (B:3:0x0007, B:5:0x000c, B:7:0x0012, B:9:0x0018, B:12:0x0039, B:16:0x0049, B:18:0x007a, B:21:0x0084, B:23:0x00a8, B:25:0x00ac, B:28:0x00b7, B:30:0x00c5, B:31:0x00c7, B:34:0x00e9, B:36:0x0107, B:38:0x010f, B:40:0x0117, B:42:0x011a, B:45:0x0021), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void h() {
        boolean z8;
        n trackingInfo;
        bv unitGroupInfo;
        try {
            CustomInterstitialAdapter customInterstitialAdapter = this.f22797l;
            if (customInterstitialAdapter != null && (trackingInfo = customInterstitialAdapter.getTrackingInfo()) != null && (unitGroupInfo = customInterstitialAdapter.getUnitGroupInfo()) != null) {
                if (trackingInfo.ad() == 3) {
                    int ah = unitGroupInfo.ah();
                    if (this.f22802q.contains(Integer.valueOf(trackingInfo.Y())) && ah == 1) {
                    }
                }
                z8 = true;
                ab.b(j.f12528s, "startCarouse:canCarouse:".concat(String.valueOf(z8)));
                if (z8) {
                    return;
                }
                t.b().a(this.f22810y);
                ab.b(j.f12528s, "startCarouse:" + this.f22799n);
                l a9 = com.anythink.core.d.n.a(t.b().g()).a(this.f22792f);
                CustomInterstitialAdapter customInterstitialAdapter2 = this.f22797l;
                bv unitGroupInfo2 = customInterstitialAdapter2 != null ? customInterstitialAdapter2.getUnitGroupInfo() : null;
                if (a9 == null || unitGroupInfo2 == null) {
                    this.f22799n = 0;
                    return;
                }
                this.f22801p = a9.bB();
                ab.b(j.f12528s, "startCarouse:" + this.f22801p + ":" + this.f22800o);
                int i = this.f22801p;
                if (i < 2) {
                    this.f22799n = 0;
                    return;
                }
                if (this.f22800o >= i) {
                    this.f22799n = 2;
                    ab.b(j.f12528s, "startCarouse:轮播个数超限终止轮播");
                    return;
                }
                int bC = a9.bC();
                int ai = unitGroupInfo2.ai();
                if (ai == 0) {
                    ai = bC;
                }
                int bD = a9.bD();
                this.f22806u = bC;
                if (this.f22797l.isMixSplash()) {
                    this.f22806u = ai;
                }
                int i4 = this.f22806u - bD;
                ab.b(j.f12528s, "startCarouse:interval:" + this.f22806u + ":" + i4);
                if (this.f22806u <= 0 || i4 <= 0) {
                    ab.b(j.f12528s, "startCarouse:服务端下发间隔异常");
                    this.f22799n = 0;
                    return;
                }
                this.f22809x.removeCallbacksAndMessages(null);
                this.f22809x.sendEmptyMessageDelayed(1, this.f22806u);
                Handler handler = this.f22809x;
                handler.sendMessageDelayed(Message.obtain(handler, 2, Integer.valueOf(bD)), i4);
                this.f22799n = 1;
                return;
            }
            z8 = false;
            ab.b(j.f12528s, "startCarouse:canCarouse:".concat(String.valueOf(z8)));
            if (z8) {
            }
        } catch (Throwable unused) {
            this.f22799n = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.anythink.core.common.h.c i() {
        try {
            List<com.anythink.core.common.h.c> j9 = j();
            if (j9 != null) {
                ab.b(j.f12528s, "checkNextAdCacheInfo:" + j9.size());
            }
            if (j9 == null || j9.isEmpty()) {
                return null;
            }
            if (this.f22801p - this.f22800o == 1) {
                ab.b(j.f12528s, "checkNextAdCacheInfo:播到最后一个了随便播");
                List<com.anythink.core.common.h.c> b9 = b(j9);
                if (b9.isEmpty()) {
                    return null;
                }
                return b9.get(0);
            }
            List<com.anythink.core.common.h.c> a9 = a(j9);
            if (a9.isEmpty()) {
                return null;
            }
            this.f22808w = a9.size();
            List<com.anythink.core.common.h.c> b10 = b(a9);
            if (b10 == null || b10.isEmpty()) {
                return null;
            }
            return b10.get(0);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private List<com.anythink.core.common.h.c> j() {
        com.anythink.core.common.f a9;
        List<com.anythink.core.common.h.c> b9;
        try {
            b bVar = this.f22796k;
            if (bVar == null || (a9 = bVar.a()) == null) {
                return null;
            }
            Context g9 = t.b().g();
            if (g9 == null) {
                g9 = g();
            }
            if (g9 == null || (b9 = a9.b(g9)) == null || b9.isEmpty()) {
                return null;
            }
            ab.b(j.f12528s, "getAllAdCacheInfoList:" + b9.size());
            return b9;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final void c(CustomInterstitialAdapter customInterstitialAdapter) {
        ab.b(j.f12528s, "notifyAdClose:hashCode:" + hashCode());
        if (customInterstitialAdapter == null || customInterstitialAdapter != this.f22797l) {
            ab.b(j.f12528s, "notifyAdClose:adapter != currentPlayAdapter");
            return;
        }
        if (this.f22803r.contains(customInterstitialAdapter)) {
            this.f22807v = 1;
            ab.b(j.f12528s, "notifyAdClose:轮播广告触发的关闭:" + customInterstitialAdapter.getNetworkName() + ":" + this.f22799n);
            return;
        }
        if (this.f22804s.contains(customInterstitialAdapter)) {
            this.f22799n = 2;
            this.f22807v = 2;
            ab.b(j.f12528s, "notifyAdClose:服务端点击关闭触发的close:" + customInterstitialAdapter.getNetworkName() + ":" + this.f22799n);
            return;
        }
        this.f22799n = 2;
        this.f22807v = 3;
        ab.b(j.f12528s, "notifyAdClose:用户点击关闭按钮触发的关闭:" + customInterstitialAdapter.getNetworkName() + ":" + this.f22799n);
    }

    public final int f() {
        return this.f22808w;
    }

    private List<com.anythink.core.common.h.c> a(List<com.anythink.core.common.h.c> list) {
        bv unitGroupInfo;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            try {
                com.anythink.core.common.h.c cVar = list.get(i);
                ATBaseAdAdapter e6 = cVar.e();
                n i4 = cVar.i();
                if (i4 != null && e6 != null && (unitGroupInfo = e6.getUnitGroupInfo()) != null) {
                    int ah = unitGroupInfo.ah();
                    if (i4.ad() != 3) {
                        if (ah == 1) {
                            arrayList.add(cVar);
                        }
                    } else if (this.f22802q.contains(Integer.valueOf(i4.Y())) && ah == 1) {
                        arrayList.add(cVar);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        ab.b(j.f12528s, "getAdSupportCacheInfoList:" + arrayList.size());
        return arrayList;
    }

    public final int e() {
        return this.f22807v;
    }

    private static List<com.anythink.core.common.h.c> b(List<com.anythink.core.common.h.c> list) {
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    Collections.sort(list);
                    return list;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return list;
    }

    public final void b(CustomInterstitialAdapter customInterstitialAdapter) {
        n trackingInfo;
        if (customInterstitialAdapter == null || customInterstitialAdapter != this.f22797l) {
            ab.b(j.f12528s, "notifyAdClick:adapter != currentPlayAdapter");
            return;
        }
        ab.b(j.f12528s, "notifyAdClick:" + customInterstitialAdapter.getNetworkName());
        this.f22799n = 2;
        bv unitGroupInfo = this.f22797l.getUnitGroupInfo();
        if (unitGroupInfo == null || unitGroupInfo.ag() != 1 || (trackingInfo = this.f22797l.getTrackingInfo()) == null) {
            return;
        }
        if (trackingInfo.ad() != 3 || this.f22802q.contains(Integer.valueOf(trackingInfo.Y()))) {
            String a9 = a(2);
            if (TextUtils.isEmpty(a9)) {
                return;
            }
            com.anythink.core.common.u.e.a("2", trackingInfo, t.b().W(), a9);
        }
    }

    public final int d() {
        return this.f22806u;
    }

    public final int c() {
        return this.f22800o;
    }

    public final void a(CustomInterstitialAdapter customInterstitialAdapter) {
        ab.b(j.f12528s, "notifyAdPlay:hashCode:" + hashCode());
        if (customInterstitialAdapter != null) {
            ab.b(j.f12528s, "notifyAdPlay::" + customInterstitialAdapter.getNetworkName());
            CustomInterstitialAdapter customInterstitialAdapter2 = this.f22797l;
            if (customInterstitialAdapter2 == null) {
                this.f22797l = customInterstitialAdapter;
                h();
            } else {
                if (customInterstitialAdapter != customInterstitialAdapter2) {
                    this.f22797l = customInterstitialAdapter;
                    if (this.f22799n == 1) {
                        h();
                        return;
                    } else {
                        ab.b(j.f12528s, "notifyAdPlay:当前属于轮播禁止状态");
                        return;
                    }
                }
                ab.b(j.f12528s, "notifyAdPlay:adapter == currentPlayAdapter");
            }
        }
    }

    public final int b() {
        return this.f22799n;
    }

    public final void a(CustomInterstitialAdapter customInterstitialAdapter, CustomInterstitialEventListener customInterstitialEventListener) {
        if (customInterstitialAdapter != null) {
            this.f22811z.put(customInterstitialAdapter, customInterstitialEventListener);
        }
    }

    private String a(int i) {
        try {
            this.f22807v = i;
            if (this.f22797l != null) {
                ab.b(j.f12528s, "closeAd:" + i + ":" + this.f22797l.getNetworkName());
                int i4 = this.f22807v;
                if (i4 == 1) {
                    this.f22803r.add(this.f22797l);
                } else if (i4 == 2) {
                    this.f22799n = 2;
                    this.f22804s.add(this.f22797l);
                } else {
                    this.f22799n = 2;
                }
                if (this.f22797l.isMixFormatAd()) {
                    WeakReference<Activity> remove = this.f22805t.remove(this.f22797l);
                    Activity activity = remove != null ? remove.get() : null;
                    if (activity != null) {
                        ab.b(j.f12528s, "removeMixActivity:" + this.f22799n + ":" + activity.getClass().getName());
                        activity.finish();
                        activity.overridePendingTransition(0, 0);
                        CustomInterstitialEventListener customInterstitialEventListener = this.f22811z.get(this.f22797l);
                        if (customInterstitialEventListener != null) {
                            customInterstitialEventListener.onInterstitialAdClose();
                            return "";
                        }
                        return "";
                    }
                    return "mixActivityMap get is null";
                }
                return this.f22797l.closeAd();
            }
            return "closeAd currentPlayAdapter is null";
        } catch (Throwable th) {
            return th.getMessage();
        }
    }

    public final void a() {
        try {
            ab.b(j.f12528s, "destroy:hashCode:" + hashCode() + ":carouselState:" + this.f22799n);
            this.f22799n = 0;
            this.f22800o = 1;
            this.f22807v = 3;
            this.f22808w = -1;
            this.f22805t.clear();
            this.f22803r.clear();
            this.f22804s.clear();
            this.f22811z.clear();
            this.f22809x.removeCallbacksAndMessages(null);
            t.b().b(this.f22810y);
        } catch (Throwable unused) {
        }
    }

    public final void a(CustomInterstitialAdapter customInterstitialAdapter, Activity activity) {
        if (customInterstitialAdapter == null || activity == null) {
            return;
        }
        ab.b(j.f12528s, "saveMixActivity:" + this.f22799n + ":" + activity.getClass().getName());
        this.f22805t.put(customInterstitialAdapter, new WeakReference<>(activity));
    }

    public static /* synthetic */ void a(Context context, String str, int i) {
        try {
            if (!TextUtils.isEmpty(str)) {
                Toast.makeText(context, str.replace("_SEC_", String.valueOf(i)), 1).show();
                return;
            }
            Toast.makeText(context, i + "秒后展示下一个广告", 1).show();
        } catch (Throwable unused) {
        }
    }
}
