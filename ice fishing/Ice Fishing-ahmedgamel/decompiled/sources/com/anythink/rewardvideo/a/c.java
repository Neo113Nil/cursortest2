package com.anythink.rewardvideo.a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.api.ATAdRevenueListener;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.api.ATShowConfig;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.basead.adx.api.ATAdxSetting;
import com.anythink.core.common.d.j;
import com.anythink.core.common.d.l;
import com.anythink.core.common.d.t;
import com.anythink.core.common.u;
import com.anythink.core.common.v.ab;
import com.anythink.core.common.w;
import com.anythink.rewardvideo.api.ATRewardVideoAutoEventListener;
import com.anythink.rewardvideo.api.ATRewardVideoAutoLoadListener;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class c implements com.anythink.core.common.p.b {

    /* renamed from: c, reason: collision with root package name */
    private static volatile c f23284c;

    /* renamed from: a, reason: collision with root package name */
    String f23285a = "RewardVideoAuto";

    /* renamed from: b, reason: collision with root package name */
    ATRewardVideoAutoLoadListener f23286b = new ATRewardVideoAutoLoadListener() { // from class: com.anythink.rewardvideo.a.c.1
        @Override // com.anythink.rewardvideo.api.ATRewardVideoAutoLoadListener
        public final void onRewardVideoAutoLoadFail(final String str, final AdError adError) {
            t.b().b(new Runnable() { // from class: com.anythink.rewardvideo.a.c.1.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (c.this.f23287d != null) {
                        c.this.f23287d.onRewardVideoAutoLoadFail(str, adError);
                    }
                }
            });
        }

        @Override // com.anythink.rewardvideo.api.ATRewardVideoAutoLoadListener
        public final void onRewardVideoAutoLoaded(final String str) {
            t.b().b(new Runnable() { // from class: com.anythink.rewardvideo.a.c.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (c.this.f23287d != null) {
                        c.this.f23287d.onRewardVideoAutoLoaded(str);
                    }
                }
            });
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private ATRewardVideoAutoLoadListener f23287d;

    private ATAdStatusInfo e(String str) {
        if (t.b().g() == null || TextUtils.isEmpty(t.b().p()) || TextUtils.isEmpty(t.b().q())) {
            Log.e(this.f23285a, "SDK init error!");
            return null;
        }
        com.anythink.core.common.f f3 = f(str);
        if (f3 != null) {
            return f3.a(t.b().M(), (Map<String, Object>) null);
        }
        return null;
    }

    private static com.anythink.core.common.f f(String str) {
        return com.anythink.core.common.f.a(t.b().g(), str, "1");
    }

    public final boolean b(String str) {
        boolean z3 = false;
        if (!TextUtils.isEmpty(str)) {
            ATAdStatusInfo e9 = e(str);
            if (e9 == null) {
                return false;
            }
            z3 = e9.isReady();
        }
        ab.b(str, j.r.f12550w, j.r.f12524B, String.valueOf(z3), "");
        return z3;
    }

    public final ATAdStatusInfo c(String str) {
        ATAdStatusInfo aTAdStatusInfo;
        if (TextUtils.isEmpty(str)) {
            aTAdStatusInfo = new ATAdStatusInfo(false, false, null);
        } else {
            aTAdStatusInfo = e(str);
            if (aTAdStatusInfo == null) {
                aTAdStatusInfo = new ATAdStatusInfo(false, false, null);
            }
        }
        ab.b(str, j.r.f12550w, j.r.f12525C, aTAdStatusInfo.toString(), "");
        return aTAdStatusInfo;
    }

    public final List<ATAdInfo> d(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.e(this.f23285a, "PlacementId is empty.");
            return null;
        }
        com.anythink.core.common.f f3 = f(str);
        if (f3 != null) {
            return f3.a(t.b().M());
        }
        return null;
    }

    public static c a() {
        if (f23284c == null) {
            synchronized (c.class) {
                try {
                    if (f23284c == null) {
                        f23284c = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f23284c;
    }

    private ATRewardVideoAutoLoadListener b() {
        return this.f23286b;
    }

    public final void a(Context context, String[] strArr, ATRewardVideoAutoLoadListener aTRewardVideoAutoLoadListener, ATAdRequest aTAdRequest) {
        if (context == null) {
            Log.e("anythink", this.f23285a + " init failed: context = null");
            return;
        }
        if (context instanceof Activity) {
            t.b().a((Activity) context);
        }
        if (strArr != null) {
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str)) {
                    if (ATAdxSetting.getInstance().isAdxNetworkMode(str)) {
                        Log.w("anythink", "Forbidden placement, this placement is in adx network mode");
                    } else if (w.a().a(str)) {
                        Log.w("anythink", "Forbidden placement");
                    } else if (!u.a().e(str)) {
                        u.a().a(str, true);
                        com.anythink.core.common.p.d a9 = f(str).a();
                        if (a9 != null) {
                            a9.a(this);
                            a9.a(context, aTAdRequest, 3);
                        }
                    }
                }
            }
        }
        this.f23287d = aTRewardVideoAutoLoadListener;
    }

    public final void a(ATAdRequest aTAdRequest, String... strArr) {
        if (strArr == null) {
            return;
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                if (ATAdxSetting.getInstance().isAdxNetworkMode(str)) {
                    Log.w("anythink", "Forbidden placement, this placement is in adx network mode");
                } else if (w.a().a(str)) {
                    Log.w("anythink", "Forbidden placement");
                } else if (!u.a().e(str)) {
                    u.a().a(str, true);
                    com.anythink.core.common.p.d a9 = f(str).a();
                    if (a9 != null) {
                        a9.a(this);
                        a9.a(t.b().M(), aTAdRequest, 3);
                    }
                }
            }
        }
    }

    public static void a(String... strArr) {
        if (strArr == null) {
            return;
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                u.a().a(str, false);
                com.anythink.core.common.p.d a9 = f(str).a();
                if (a9 != null) {
                    a9.a((com.anythink.core.common.p.b) null);
                    a9.d();
                }
            }
        }
    }

    public static void a(String str, Map<String, Object> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        u.a().a(str, map);
    }

    public final void a(Activity activity, String str, ATShowConfig aTShowConfig, ATRewardVideoAutoEventListener aTRewardVideoAutoEventListener, ATAdRevenueListener aTAdRevenueListener) {
        ab.b(str, j.r.f12550w, j.r.f12523A, j.r.f12542o, "");
        if (TextUtils.isEmpty(str)) {
            AdError errorCode = ErrorCode.getErrorCode(ErrorCode.exception, "", "placementId is empty.");
            if (aTRewardVideoAutoEventListener != null) {
                aTRewardVideoAutoEventListener.onRewardedVideoAdPlayFailed(errorCode, l.a((com.anythink.core.common.d.f) null));
            }
            Log.e(this.f23285a, "PlacementId is Empty!");
        }
        if (t.b().g() != null && !TextUtils.isEmpty(t.b().p()) && !TextUtils.isEmpty(t.b().q())) {
            if (activity == null) {
                Log.e(this.f23285a, "RewardedVideo Show Activity is null.");
            }
            a.a(activity, str).a(activity, aTShowConfig, new b(aTRewardVideoAutoEventListener, aTAdRevenueListener), null, null);
        } else {
            AdError errorCode2 = ErrorCode.getErrorCode(ErrorCode.exception, "", "sdk init error");
            if (aTRewardVideoAutoEventListener != null) {
                aTRewardVideoAutoEventListener.onRewardedVideoAdPlayFailed(errorCode2, l.a((com.anythink.core.common.d.f) null));
            }
            Log.e(this.f23285a, "SDK init error!");
        }
    }

    public static void a(String str, String str2, Map<String, Object> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        t.b().a(str, str2, "1", map);
    }

    @Override // com.anythink.core.common.p.b
    public final void a(String str) {
        ATRewardVideoAutoLoadListener aTRewardVideoAutoLoadListener = a().f23286b;
        if (aTRewardVideoAutoLoadListener != null) {
            aTRewardVideoAutoLoadListener.onRewardVideoAutoLoaded(str);
        }
    }

    @Override // com.anythink.core.common.p.b
    public final void a(String str, AdError adError) {
        ATRewardVideoAutoLoadListener aTRewardVideoAutoLoadListener = a().f23286b;
        if (aTRewardVideoAutoLoadListener != null) {
            aTRewardVideoAutoLoadListener.onRewardVideoAutoLoadFail(str, adError);
        }
    }

    public final void a(ATRewardVideoAutoLoadListener aTRewardVideoAutoLoadListener) {
        this.f23287d = aTRewardVideoAutoLoadListener;
    }
}
