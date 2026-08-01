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
    private static final String f22629b = "a";

    /* renamed from: c, reason: collision with root package name */
    private static final int f22630c = 1;

    /* renamed from: d, reason: collision with root package name */
    private static final int f22631d = 2;

    /* renamed from: a, reason: collision with root package name */
    ATNativeAdCustomRender f22632a;

    /* renamed from: e, reason: collision with root package name */
    private final WeakReference<Activity> f22633e;

    /* renamed from: f, reason: collision with root package name */
    private final String f22634f;

    /* renamed from: g, reason: collision with root package name */
    private final ATShowConfig f22635g;

    /* renamed from: h, reason: collision with root package name */
    private final ATInterstitialListener f22636h;
    private final ATEventInterface i;

    /* renamed from: j, reason: collision with root package name */
    private final Map<String, Object> f22637j;

    /* renamed from: k, reason: collision with root package name */
    private final b f22638k;

    /* renamed from: l, reason: collision with root package name */
    private CustomInterstitialAdapter f22639l;

    /* renamed from: m, reason: collision with root package name */
    private com.anythink.core.common.h.c f22640m;

    /* renamed from: p, reason: collision with root package name */
    private int f22643p;

    /* renamed from: u, reason: collision with root package name */
    private int f22648u;

    /* renamed from: n, reason: collision with root package name */
    private int f22641n = 0;

    /* renamed from: o, reason: collision with root package name */
    private int f22642o = 1;

    /* renamed from: q, reason: collision with root package name */
    private final List<Integer> f22644q = Arrays.asList(8, 15, 22, 28);

    /* renamed from: r, reason: collision with root package name */
    private final List<CustomInterstitialAdapter> f22645r = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    private final List<CustomInterstitialAdapter> f22646s = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    private final Map<CustomInterstitialAdapter, WeakReference<Activity>> f22647t = new HashMap();

    /* renamed from: v, reason: collision with root package name */
    private int f22649v = 3;

    /* renamed from: w, reason: collision with root package name */
    private int f22650w = -1;

    /* renamed from: x, reason: collision with root package name */
    private final Handler f22651x = new Handler(Looper.getMainLooper()) { // from class: com.anythink.interstitial.a.a.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                ab.b(j.f12371s, "handleMessage:0x002:" + a.this.f22641n);
                if (a.this.f22641n != 1) {
                    ab.b(j.f12371s, "handleMessage:0x002:carouselState!=1");
                    return;
                }
                Object obj = message.obj;
                if (!(obj instanceof Integer)) {
                    a.o(a.this);
                    ab.b(j.f12371s, "handleMessage:0x002:msg.obj is not Integer");
                    return;
                }
                try {
                    int intValue = ((Integer) obj).intValue() / 1000;
                    com.anythink.core.common.h.c i6 = a.this.i();
                    if (i6 == null) {
                        a.o(a.this);
                        ab.b(j.f12371s, "handleMessage:0x002:没有可以轮播的广告了终止轮播");
                        return;
                    }
                    a.this.f22640m = i6;
                    if (a.this.f22640m.e() != null) {
                        ab.b(j.f12371s, "handleMessage:nextPlayAdCacheInfo:" + a.this.f22640m.e().getNetworkName());
                    }
                    Context g4 = t.b().g();
                    if (g4 == null) {
                        g4 = a.this.g();
                    }
                    if (g4 != null) {
                        String str = "";
                        try {
                            str = g4.getString(q.a(g4, "interstitial_text_next_play", k.f19636g));
                        } catch (Exception unused) {
                        }
                        a.a(g4, str, intValue);
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
                ab.b(j.f12371s, "handleMessage:0x001:" + a.this.f22641n);
                if (a.this.f22640m == null || !a.this.f22640m.k() || a.this.f22641n != 1) {
                    if (a.this.f22640m != null) {
                        ab.b(j.f12371s, "handleMessage:0x001:nextPlayAdCacheInfo:" + a.this.f22640m.k() + ":carouselState:" + a.this.f22641n);
                    } else {
                        ab.b(j.f12371s, "handleMessage:0x001:nextPlayAdCacheInfo is null and carouselState=" + a.this.f22641n);
                    }
                    a.o(a.this);
                    return;
                }
                if (a.this.f22642o >= a.this.f22643p) {
                    a.o(a.this);
                    ab.b(j.f12371s, "handleMessage:0x001:rotation_num is out");
                    return;
                }
                String e9 = a.e(a.this);
                if (!TextUtils.isEmpty(e9)) {
                    a.o(a.this);
                    com.anythink.core.common.u.e.a("1", a.this.f22639l != null ? a.this.f22639l.getTrackingInfo() : null, t.b().W(), e9);
                    ab.b(j.f12371s, "handleMessage:0x001:close is exception:".concat(String.valueOf(e9)));
                    return;
                }
                ab.b(j.f12371s, "handleMessage:0x001:close:success");
                if (a.this.f22638k == null) {
                    a.o(a.this);
                    return;
                }
                ATBaseAdAdapter e10 = a.this.f22640m.e();
                if (e10 != null) {
                    ab.b(j.f12371s, "handleMessage:0x001:internalShow:" + e10.getNetworkName());
                    e10.setCarouselShowType(1);
                }
                if (a.this.f22650w > 0) {
                    a.h(a.this);
                }
                a.i(a.this);
                a.this.f22638k.a(a.this.g(), a.this.f22640m, a.this.f22635g, a.this.f22636h, a.this.i, a.this.f22637j, a.this.f22632a);
            } catch (Throwable th2) {
                a.o(a.this);
                th2.printStackTrace();
            }
        }
    };

    /* renamed from: y, reason: collision with root package name */
    private final m f22652y = new m() { // from class: com.anythink.interstitial.a.a.2
        @Override // com.anythink.core.common.d.m
        public final void a(boolean z3) {
            ab.b(j.f12371s, "backToForeground:".concat(String.valueOf(z3)));
            if (z3) {
                return;
            }
            a.o(a.this);
            if (a.this.f22639l == null || a.this.f22639l.getTrackingInfo() == null) {
                return;
            }
            com.anythink.core.common.u.e.a(a.this.f22639l.getTrackingInfo(), String.valueOf(a.this.f()));
        }
    };

    /* renamed from: z, reason: collision with root package name */
    private final Map<CustomInterstitialAdapter, CustomInterstitialEventListener> f22653z = new HashMap();

    public a(Activity activity, ATShowConfig aTShowConfig, ATInterstitialListener aTInterstitialListener, ATEventInterface aTEventInterface, Map<String, Object> map, ATNativeAdCustomRender aTNativeAdCustomRender, String str, b bVar) {
        this.f22633e = new WeakReference<>(activity);
        this.f22635g = aTShowConfig;
        this.f22636h = aTInterstitialListener;
        this.i = aTEventInterface;
        this.f22637j = map;
        this.f22632a = aTNativeAdCustomRender;
        this.f22634f = str;
        this.f22638k = bVar;
    }

    public static /* synthetic */ String e(a aVar) {
        return aVar.a(1);
    }

    public static /* synthetic */ int h(a aVar) {
        int i = aVar.f22650w;
        aVar.f22650w = i - 1;
        return i;
    }

    public static /* synthetic */ int i(a aVar) {
        int i = aVar.f22642o;
        aVar.f22642o = i + 1;
        return i;
    }

    public static /* synthetic */ int o(a aVar) {
        aVar.f22641n = 2;
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
            if (this.f22644q.contains(Integer.valueOf(trackingInfo.Y())) && ah == 1) {
                return true;
            }
        }
        return false;
    }

    private Activity e(CustomInterstitialAdapter customInterstitialAdapter) {
        WeakReference<Activity> remove = this.f22647t.remove(customInterstitialAdapter);
        if (remove != null) {
            return remove.get();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Activity g() {
        Activity activity = this.f22633e.get() != null ? this.f22633e.get() : null;
        return activity == null ? t.b().N() : activity;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049 A[Catch: all -> 0x011d, TryCatch #0 {all -> 0x011d, blocks: (B:3:0x0007, B:5:0x000c, B:7:0x0012, B:9:0x0018, B:12:0x0039, B:16:0x0049, B:18:0x007a, B:21:0x0084, B:23:0x00a8, B:25:0x00ac, B:28:0x00b7, B:30:0x00c5, B:31:0x00c7, B:34:0x00e9, B:36:0x0107, B:38:0x010f, B:40:0x0117, B:42:0x011a, B:45:0x0021), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void h() {
        boolean z3;
        n trackingInfo;
        bv unitGroupInfo;
        try {
            CustomInterstitialAdapter customInterstitialAdapter = this.f22639l;
            if (customInterstitialAdapter != null && (trackingInfo = customInterstitialAdapter.getTrackingInfo()) != null && (unitGroupInfo = customInterstitialAdapter.getUnitGroupInfo()) != null) {
                if (trackingInfo.ad() == 3) {
                    int ah = unitGroupInfo.ah();
                    if (this.f22644q.contains(Integer.valueOf(trackingInfo.Y())) && ah == 1) {
                    }
                }
                z3 = true;
                ab.b(j.f12371s, "startCarouse:canCarouse:".concat(String.valueOf(z3)));
                if (z3) {
                    return;
                }
                t.b().a(this.f22652y);
                ab.b(j.f12371s, "startCarouse:" + this.f22641n);
                l a9 = com.anythink.core.d.n.a(t.b().g()).a(this.f22634f);
                CustomInterstitialAdapter customInterstitialAdapter2 = this.f22639l;
                bv unitGroupInfo2 = customInterstitialAdapter2 != null ? customInterstitialAdapter2.getUnitGroupInfo() : null;
                if (a9 == null || unitGroupInfo2 == null) {
                    this.f22641n = 0;
                    return;
                }
                this.f22643p = a9.bB();
                ab.b(j.f12371s, "startCarouse:" + this.f22643p + ":" + this.f22642o);
                int i = this.f22643p;
                if (i < 2) {
                    this.f22641n = 0;
                    return;
                }
                if (this.f22642o >= i) {
                    this.f22641n = 2;
                    ab.b(j.f12371s, "startCarouse:轮播个数超限终止轮播");
                    return;
                }
                int bC = a9.bC();
                int ai = unitGroupInfo2.ai();
                if (ai == 0) {
                    ai = bC;
                }
                int bD = a9.bD();
                this.f22648u = bC;
                if (this.f22639l.isMixSplash()) {
                    this.f22648u = ai;
                }
                int i6 = this.f22648u - bD;
                ab.b(j.f12371s, "startCarouse:interval:" + this.f22648u + ":" + i6);
                if (this.f22648u <= 0 || i6 <= 0) {
                    ab.b(j.f12371s, "startCarouse:服务端下发间隔异常");
                    this.f22641n = 0;
                    return;
                }
                this.f22651x.removeCallbacksAndMessages(null);
                this.f22651x.sendEmptyMessageDelayed(1, this.f22648u);
                Handler handler = this.f22651x;
                handler.sendMessageDelayed(Message.obtain(handler, 2, Integer.valueOf(bD)), i6);
                this.f22641n = 1;
                return;
            }
            z3 = false;
            ab.b(j.f12371s, "startCarouse:canCarouse:".concat(String.valueOf(z3)));
            if (z3) {
            }
        } catch (Throwable unused) {
            this.f22641n = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.anythink.core.common.h.c i() {
        try {
            List<com.anythink.core.common.h.c> j6 = j();
            if (j6 != null) {
                ab.b(j.f12371s, "checkNextAdCacheInfo:" + j6.size());
            }
            if (j6 == null || j6.isEmpty()) {
                return null;
            }
            if (this.f22643p - this.f22642o == 1) {
                ab.b(j.f12371s, "checkNextAdCacheInfo:播到最后一个了随便播");
                List<com.anythink.core.common.h.c> b9 = b(j6);
                if (b9.isEmpty()) {
                    return null;
                }
                return b9.get(0);
            }
            List<com.anythink.core.common.h.c> a9 = a(j6);
            if (a9.isEmpty()) {
                return null;
            }
            this.f22650w = a9.size();
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
            b bVar = this.f22638k;
            if (bVar == null || (a9 = bVar.a()) == null) {
                return null;
            }
            Context g4 = t.b().g();
            if (g4 == null) {
                g4 = g();
            }
            if (g4 == null || (b9 = a9.b(g4)) == null || b9.isEmpty()) {
                return null;
            }
            ab.b(j.f12371s, "getAllAdCacheInfoList:" + b9.size());
            return b9;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final void c(CustomInterstitialAdapter customInterstitialAdapter) {
        ab.b(j.f12371s, "notifyAdClose:hashCode:" + hashCode());
        if (customInterstitialAdapter == null || customInterstitialAdapter != this.f22639l) {
            ab.b(j.f12371s, "notifyAdClose:adapter != currentPlayAdapter");
            return;
        }
        if (this.f22645r.contains(customInterstitialAdapter)) {
            this.f22649v = 1;
            ab.b(j.f12371s, "notifyAdClose:轮播广告触发的关闭:" + customInterstitialAdapter.getNetworkName() + ":" + this.f22641n);
            return;
        }
        if (this.f22646s.contains(customInterstitialAdapter)) {
            this.f22641n = 2;
            this.f22649v = 2;
            ab.b(j.f12371s, "notifyAdClose:服务端点击关闭触发的close:" + customInterstitialAdapter.getNetworkName() + ":" + this.f22641n);
            return;
        }
        this.f22641n = 2;
        this.f22649v = 3;
        ab.b(j.f12371s, "notifyAdClose:用户点击关闭按钮触发的关闭:" + customInterstitialAdapter.getNetworkName() + ":" + this.f22641n);
    }

    public final int f() {
        return this.f22650w;
    }

    private List<com.anythink.core.common.h.c> a(List<com.anythink.core.common.h.c> list) {
        bv unitGroupInfo;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            try {
                com.anythink.core.common.h.c cVar = list.get(i);
                ATBaseAdAdapter e9 = cVar.e();
                n i6 = cVar.i();
                if (i6 != null && e9 != null && (unitGroupInfo = e9.getUnitGroupInfo()) != null) {
                    int ah = unitGroupInfo.ah();
                    if (i6.ad() != 3) {
                        if (ah == 1) {
                            arrayList.add(cVar);
                        }
                    } else if (this.f22644q.contains(Integer.valueOf(i6.Y())) && ah == 1) {
                        arrayList.add(cVar);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        ab.b(j.f12371s, "getAdSupportCacheInfoList:" + arrayList.size());
        return arrayList;
    }

    public final int e() {
        return this.f22649v;
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
        if (customInterstitialAdapter == null || customInterstitialAdapter != this.f22639l) {
            ab.b(j.f12371s, "notifyAdClick:adapter != currentPlayAdapter");
            return;
        }
        ab.b(j.f12371s, "notifyAdClick:" + customInterstitialAdapter.getNetworkName());
        this.f22641n = 2;
        bv unitGroupInfo = this.f22639l.getUnitGroupInfo();
        if (unitGroupInfo == null || unitGroupInfo.ag() != 1 || (trackingInfo = this.f22639l.getTrackingInfo()) == null) {
            return;
        }
        if (trackingInfo.ad() != 3 || this.f22644q.contains(Integer.valueOf(trackingInfo.Y()))) {
            String a9 = a(2);
            if (TextUtils.isEmpty(a9)) {
                return;
            }
            com.anythink.core.common.u.e.a("2", trackingInfo, t.b().W(), a9);
        }
    }

    public final int d() {
        return this.f22648u;
    }

    public final int c() {
        return this.f22642o;
    }

    public final void a(CustomInterstitialAdapter customInterstitialAdapter) {
        ab.b(j.f12371s, "notifyAdPlay:hashCode:" + hashCode());
        if (customInterstitialAdapter != null) {
            ab.b(j.f12371s, "notifyAdPlay::" + customInterstitialAdapter.getNetworkName());
            CustomInterstitialAdapter customInterstitialAdapter2 = this.f22639l;
            if (customInterstitialAdapter2 == null) {
                this.f22639l = customInterstitialAdapter;
                h();
            } else {
                if (customInterstitialAdapter != customInterstitialAdapter2) {
                    this.f22639l = customInterstitialAdapter;
                    if (this.f22641n == 1) {
                        h();
                        return;
                    } else {
                        ab.b(j.f12371s, "notifyAdPlay:当前属于轮播禁止状态");
                        return;
                    }
                }
                ab.b(j.f12371s, "notifyAdPlay:adapter == currentPlayAdapter");
            }
        }
    }

    public final int b() {
        return this.f22641n;
    }

    public final void a(CustomInterstitialAdapter customInterstitialAdapter, CustomInterstitialEventListener customInterstitialEventListener) {
        if (customInterstitialAdapter != null) {
            this.f22653z.put(customInterstitialAdapter, customInterstitialEventListener);
        }
    }

    private String a(int i) {
        try {
            this.f22649v = i;
            if (this.f22639l != null) {
                ab.b(j.f12371s, "closeAd:" + i + ":" + this.f22639l.getNetworkName());
                int i6 = this.f22649v;
                if (i6 == 1) {
                    this.f22645r.add(this.f22639l);
                } else if (i6 == 2) {
                    this.f22641n = 2;
                    this.f22646s.add(this.f22639l);
                } else {
                    this.f22641n = 2;
                }
                if (this.f22639l.isMixFormatAd()) {
                    WeakReference<Activity> remove = this.f22647t.remove(this.f22639l);
                    Activity activity = remove != null ? remove.get() : null;
                    if (activity != null) {
                        ab.b(j.f12371s, "removeMixActivity:" + this.f22641n + ":" + activity.getClass().getName());
                        activity.finish();
                        activity.overridePendingTransition(0, 0);
                        CustomInterstitialEventListener customInterstitialEventListener = this.f22653z.get(this.f22639l);
                        if (customInterstitialEventListener != null) {
                            customInterstitialEventListener.onInterstitialAdClose();
                            return "";
                        }
                        return "";
                    }
                    return "mixActivityMap get is null";
                }
                return this.f22639l.closeAd();
            }
            return "closeAd currentPlayAdapter is null";
        } catch (Throwable th) {
            return th.getMessage();
        }
    }

    public final void a() {
        try {
            ab.b(j.f12371s, "destroy:hashCode:" + hashCode() + ":carouselState:" + this.f22641n);
            this.f22641n = 0;
            this.f22642o = 1;
            this.f22649v = 3;
            this.f22650w = -1;
            this.f22647t.clear();
            this.f22645r.clear();
            this.f22646s.clear();
            this.f22653z.clear();
            this.f22651x.removeCallbacksAndMessages(null);
            t.b().b(this.f22652y);
        } catch (Throwable unused) {
        }
    }

    public final void a(CustomInterstitialAdapter customInterstitialAdapter, Activity activity) {
        if (customInterstitialAdapter == null || activity == null) {
            return;
        }
        ab.b(j.f12371s, "saveMixActivity:" + this.f22641n + ":" + activity.getClass().getName());
        this.f22647t.put(customInterstitialAdapter, new WeakReference<>(activity));
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
