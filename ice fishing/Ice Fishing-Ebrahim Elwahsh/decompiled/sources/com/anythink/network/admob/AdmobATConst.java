package com.anythink.network.admob;

import android.content.Context;
import android.util.Log;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.common.h.y;
import com.google.android.gms.ads.MobileAds;
import java.util.Map;
import k2.C4637h;
import u2.d;

/* loaded from: classes.dex */
public class AdmobATConst {
    public static final int ADAPTIVE_ANCHORED = 0;
    public static final int ADAPTIVE_INLINE = 1;
    public static final String ADAPTIVE_ORIENTATION = "adaptive_orientation";
    public static final String ADAPTIVE_TYPE = "adaptive_type";
    public static final String ADAPTIVE_WIDTH = "adaptive_width";
    public static final String ADMOB_IS_COLLAPSIBLE = "admob_is_collapsible";
    public static final String CONTENT_KEYWORDS = "admob_keywords";
    public static final String CONTENT_URLS = "admob_content_urls";
    public static final long IMPRESSION_DEALY = 500;
    public static final int NETWORK_FIRM_ID = 2;
    public static final int ORIENTATION_CURRENT = 0;
    public static final int ORIENTATION_LANDSCAPE = 2;
    public static final int ORIENTATION_PORTRAIT = 1;
    public static String TAG = "AdmobATConst";

    /* renamed from: a, reason: collision with root package name */
    private static String f22964a = null;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f22965b = false;

    public static class DEBUGGER_CONFIG {
        public static final int Admob_INTERSTITIAL_IMAGE = 1;
        public static final int Admob_INTERSTITIAL_VIDEO = 2;
        public static final int Admob_NATIVE_IMAGE = 1;
        public static final int Admob_NATIVE_VIDEO = 2;
        public static final int Admob_NETWORK = 2;
    }

    public static class ORIENTATION {
        public static final int LANDSCAPE = 2;
        public static final int PORTRAIT = 1;
    }

    public static class REWARD_EXTRA {
        public static final String REWARD_EXTRA_KEY_REWARD_AMOUNT = "admob_reward_amount";
        public static final String REWARD_EXTRA_KEY_REWARD_TYPE = "admob_reward_type";
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ff A[Catch: all -> 0x0102, TRY_LEAVE, TryCatch #0 {all -> 0x0102, blocks: (B:3:0x0002, B:6:0x000f, B:8:0x0015, B:10:0x0027, B:11:0x002d, B:14:0x0037, B:17:0x0050, B:18:0x00f9, B:20:0x00ff, B:25:0x006e, B:26:0x0074, B:27:0x007c, B:35:0x00c5, B:36:0x00c8, B:37:0x00ee, B:38:0x00f1, B:39:0x00f4, B:40:0x00f7, B:41:0x0080, B:44:0x008a, B:47:0x0094, B:50:0x009e, B:53:0x00a8, B:56:0x00b0), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C4637h a(Context context, Map<String, Object> map, Map<String, Object> map2) {
        char c4;
        C4637h c4637h;
        try {
            int intFromMap = ATInitMediation.getIntFromMap(map, ATAdConst.KEY.AD_WIDTH, 0);
            if (!f22965b && intFromMap > 0 && !map.containsKey(ADAPTIVE_TYPE)) {
                map.put(ADAPTIVE_TYPE, 0);
                map.put(ADAPTIVE_ORIENTATION, 0);
            }
            if (intFromMap <= 0) {
                intFromMap = ATInitMediation.getIntFromMap(map, ADAPTIVE_WIDTH, 0);
            }
            String stringFromMap = ATInitMediation.getStringFromMap(map2, "size");
            if (intFromMap > 0) {
                int i = (int) ((context.getResources().getDisplayMetrics().density * 300.0f) + 0.5f);
                if (!y.f14336c.equals(stringFromMap)) {
                    if (intFromMap < i) {
                        Log.e("anythink_network", TAG + ": The width is too small. It is recommended to be larger than 300dp to avoid affecting the ad fill rate.");
                        c4637h = a(context, map, i);
                    } else {
                        c4637h = a(context, map, intFromMap);
                    }
                    int i4 = c4637h.f38711a;
                    return c4637h != C4637h.f38710o ? C4637h.i : c4637h;
                }
            }
            switch (stringFromMap.hashCode()) {
                case -1306012042:
                    if (stringFromMap.equals("adaptive")) {
                        c4 = 4;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -559799608:
                    if (stringFromMap.equals(y.f14336c)) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -502542422:
                    if (stringFromMap.equals("320x100")) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1507809730:
                    if (stringFromMap.equals(y.f14334a)) {
                        c4 = 5;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1540371324:
                    if (stringFromMap.equals("468x60")) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1622564786:
                    if (stringFromMap.equals(y.f14337d)) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            if (c4 == 0) {
                c4637h = C4637h.f38706k;
            } else if (c4 == 1) {
                c4637h = C4637h.f38708m;
            } else if (c4 == 2) {
                c4637h = C4637h.f38705j;
            } else if (c4 == 3) {
                c4637h = C4637h.f38707l;
            } else if (c4 != 4) {
                c4637h = C4637h.i;
            } else {
                int a9 = a(context, Math.min(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels));
                C4637h c4637h2 = C4637h.i;
                c4637h = d.k(context, a9, 0);
                c4637h.f38714d = true;
            }
            int i42 = c4637h.f38711a;
            if (c4637h != C4637h.f38710o) {
            }
        } catch (Throwable th) {
            Log.e(TAG, "getAdaptiveBannerAdSize() >>> failed: " + th.getMessage());
            return C4637h.i;
        }
    }

    public static String getNetworkVersion() {
        String str = f22964a;
        if (str != null) {
            return str;
        }
        try {
            String tVar = MobileAds.b().toString();
            f22964a = tVar;
            return tVar;
        } catch (Throwable unused) {
            f22964a = "";
            return "";
        }
    }

    public static void setDisableAutoUseAdaptiveBanner(boolean z8) {
        Log.e(TAG, "setDisableAutoUseAdaptiveBanner: ".concat(String.valueOf(z8)));
        f22965b = z8;
    }

    private static C4637h a(Context context, Map<String, Object> map, int i) {
        int intFromMap = ATInitMediation.getIntFromMap(map, ADAPTIVE_TYPE, 0);
        int intFromMap2 = ATInitMediation.getIntFromMap(map, ADAPTIVE_ORIENTATION, 0);
        int a9 = a(context, i);
        if (intFromMap2 == 1) {
            if (intFromMap == 1) {
                C4637h c4637h = C4637h.i;
                int p6 = d.p(context, 1);
                C4637h c4637h2 = new C4637h(a9, 0);
                if (p6 == -1) {
                    return C4637h.f38710o;
                }
                c4637h2.f38716f = p6;
                c4637h2.f38715e = true;
                return c4637h2;
            }
            C4637h c4637h3 = C4637h.i;
            C4637h k6 = d.k(context, a9, 1);
            k6.f38714d = true;
            return k6;
        }
        if (intFromMap2 != 2) {
            if (intFromMap == 1) {
                C4637h c4637h4 = C4637h.i;
                int p9 = d.p(context, 0);
                if (p9 == -1) {
                    return C4637h.f38710o;
                }
                C4637h c4637h5 = new C4637h(a9, 0);
                c4637h5.f38716f = p9;
                c4637h5.f38715e = true;
                return c4637h5;
            }
            C4637h c4637h6 = C4637h.i;
            C4637h k9 = d.k(context, a9, 0);
            k9.f38714d = true;
            return k9;
        }
        if (intFromMap == 1) {
            C4637h c4637h7 = C4637h.i;
            int p10 = d.p(context, 2);
            C4637h c4637h8 = new C4637h(a9, 0);
            if (p10 == -1) {
                return C4637h.f38710o;
            }
            c4637h8.f38716f = p10;
            c4637h8.f38715e = true;
            return c4637h8;
        }
        C4637h c4637h9 = C4637h.i;
        C4637h k10 = d.k(context, a9, 2);
        k10.f38714d = true;
        return k10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static C4637h a(Context context, String str) {
        char c4;
        switch (str.hashCode()) {
            case -1306012042:
                if (str.equals("adaptive")) {
                    c4 = 4;
                    break;
                }
                c4 = 65535;
                break;
            case -559799608:
                if (str.equals(y.f14336c)) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case -502542422:
                if (str.equals("320x100")) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case 1507809730:
                if (str.equals(y.f14334a)) {
                    c4 = 5;
                    break;
                }
                c4 = 65535;
                break;
            case 1540371324:
                if (str.equals("468x60")) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            case 1622564786:
                if (str.equals(y.f14337d)) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            default:
                c4 = 65535;
                break;
        }
        if (c4 == 0) {
            return C4637h.f38706k;
        }
        if (c4 == 1) {
            return C4637h.f38708m;
        }
        if (c4 == 2) {
            return C4637h.f38705j;
        }
        if (c4 == 3) {
            return C4637h.f38707l;
        }
        if (c4 != 4) {
            return C4637h.i;
        }
        int a9 = a(context, Math.min(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels));
        C4637h c4637h = C4637h.i;
        C4637h k6 = d.k(context, a9, 0);
        k6.f38714d = true;
        return k6;
    }

    private static int a(Context context, float f6) {
        float f9 = context.getResources().getDisplayMetrics().density;
        if (f9 <= 0.0f) {
            f9 = 1.0f;
        }
        return (int) ((f6 / f9) + 0.5f);
    }

    private static int a(Context context) {
        return (int) ((context.getResources().getDisplayMetrics().density * 300.0f) + 0.5f);
    }
}
