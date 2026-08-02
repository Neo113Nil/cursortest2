package com.anythink.network.admob;

import android.content.Context;
import android.util.Log;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.common.h.y;
import com.google.android.gms.ads.MobileAds;
import java.util.Map;
import m2.h;
import x2.d;

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
    private static String f23593a = null;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f23594b = false;

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
    public static h a(Context context, Map<String, Object> map, Map<String, Object> map2) {
        char c9;
        h hVar;
        try {
            int intFromMap = ATInitMediation.getIntFromMap(map, ATAdConst.KEY.AD_WIDTH, 0);
            if (!f23594b && intFromMap > 0 && !map.containsKey(ADAPTIVE_TYPE)) {
                map.put(ADAPTIVE_TYPE, 0);
                map.put(ADAPTIVE_ORIENTATION, 0);
            }
            if (intFromMap <= 0) {
                intFromMap = ATInitMediation.getIntFromMap(map, ADAPTIVE_WIDTH, 0);
            }
            String stringFromMap = ATInitMediation.getStringFromMap(map2, "size");
            if (intFromMap > 0) {
                int i = (int) ((context.getResources().getDisplayMetrics().density * 300.0f) + 0.5f);
                if (!y.f14965c.equals(stringFromMap)) {
                    if (intFromMap < i) {
                        Log.e("anythink_network", TAG + ": The width is too small. It is recommended to be larger than 300dp to avoid affecting the ad fill rate.");
                        hVar = a(context, map, i);
                    } else {
                        hVar = a(context, map, intFromMap);
                    }
                    int i4 = hVar.f39380a;
                    return hVar != h.f39379o ? h.i : hVar;
                }
            }
            switch (stringFromMap.hashCode()) {
                case -1306012042:
                    if (stringFromMap.equals("adaptive")) {
                        c9 = 4;
                        break;
                    }
                    c9 = 65535;
                    break;
                case -559799608:
                    if (stringFromMap.equals(y.f14965c)) {
                        c9 = 1;
                        break;
                    }
                    c9 = 65535;
                    break;
                case -502542422:
                    if (stringFromMap.equals("320x100")) {
                        c9 = 0;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1507809730:
                    if (stringFromMap.equals(y.f14963a)) {
                        c9 = 5;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1540371324:
                    if (stringFromMap.equals("468x60")) {
                        c9 = 2;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1622564786:
                    if (stringFromMap.equals(y.f14966d)) {
                        c9 = 3;
                        break;
                    }
                    c9 = 65535;
                    break;
                default:
                    c9 = 65535;
                    break;
            }
            if (c9 == 0) {
                hVar = h.f39375k;
            } else if (c9 == 1) {
                hVar = h.f39377m;
            } else if (c9 == 2) {
                hVar = h.f39374j;
            } else if (c9 == 3) {
                hVar = h.f39376l;
            } else if (c9 != 4) {
                hVar = h.i;
            } else {
                int a9 = a(context, Math.min(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels));
                h hVar2 = h.i;
                hVar = d.k(context, a9, 0);
                hVar.f39383d = true;
            }
            int i42 = hVar.f39380a;
            if (hVar != h.f39379o) {
            }
        } catch (Throwable th) {
            Log.e(TAG, "getAdaptiveBannerAdSize() >>> failed: " + th.getMessage());
            return h.i;
        }
    }

    public static String getNetworkVersion() {
        String str = f23593a;
        if (str != null) {
            return str;
        }
        try {
            String tVar = MobileAds.b().toString();
            f23593a = tVar;
            return tVar;
        } catch (Throwable unused) {
            f23593a = "";
            return "";
        }
    }

    public static void setDisableAutoUseAdaptiveBanner(boolean z6) {
        Log.e(TAG, "setDisableAutoUseAdaptiveBanner: ".concat(String.valueOf(z6)));
        f23594b = z6;
    }

    private static h a(Context context, Map<String, Object> map, int i) {
        int intFromMap = ATInitMediation.getIntFromMap(map, ADAPTIVE_TYPE, 0);
        int intFromMap2 = ATInitMediation.getIntFromMap(map, ADAPTIVE_ORIENTATION, 0);
        int a9 = a(context, i);
        if (intFromMap2 == 1) {
            if (intFromMap == 1) {
                h hVar = h.i;
                int q8 = d.q(context, 1);
                h hVar2 = new h(a9, 0);
                if (q8 == -1) {
                    return h.f39379o;
                }
                hVar2.f39385f = q8;
                hVar2.f39384e = true;
                return hVar2;
            }
            h hVar3 = h.i;
            h k9 = d.k(context, a9, 1);
            k9.f39383d = true;
            return k9;
        }
        if (intFromMap2 != 2) {
            if (intFromMap == 1) {
                h hVar4 = h.i;
                int q9 = d.q(context, 0);
                if (q9 == -1) {
                    return h.f39379o;
                }
                h hVar5 = new h(a9, 0);
                hVar5.f39385f = q9;
                hVar5.f39384e = true;
                return hVar5;
            }
            h hVar6 = h.i;
            h k10 = d.k(context, a9, 0);
            k10.f39383d = true;
            return k10;
        }
        if (intFromMap == 1) {
            h hVar7 = h.i;
            int q10 = d.q(context, 2);
            h hVar8 = new h(a9, 0);
            if (q10 == -1) {
                return h.f39379o;
            }
            hVar8.f39385f = q10;
            hVar8.f39384e = true;
            return hVar8;
        }
        h hVar9 = h.i;
        h k11 = d.k(context, a9, 2);
        k11.f39383d = true;
        return k11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static h a(Context context, String str) {
        char c9;
        switch (str.hashCode()) {
            case -1306012042:
                if (str.equals("adaptive")) {
                    c9 = 4;
                    break;
                }
                c9 = 65535;
                break;
            case -559799608:
                if (str.equals(y.f14965c)) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            case -502542422:
                if (str.equals("320x100")) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case 1507809730:
                if (str.equals(y.f14963a)) {
                    c9 = 5;
                    break;
                }
                c9 = 65535;
                break;
            case 1540371324:
                if (str.equals("468x60")) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case 1622564786:
                if (str.equals(y.f14966d)) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        if (c9 == 0) {
            return h.f39375k;
        }
        if (c9 == 1) {
            return h.f39377m;
        }
        if (c9 == 2) {
            return h.f39374j;
        }
        if (c9 == 3) {
            return h.f39376l;
        }
        if (c9 != 4) {
            return h.i;
        }
        int a9 = a(context, Math.min(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels));
        h hVar = h.i;
        h k9 = d.k(context, a9, 0);
        k9.f39383d = true;
        return k9;
    }

    private static int a(Context context, float f2) {
        float f9 = context.getResources().getDisplayMetrics().density;
        if (f9 <= 0.0f) {
            f9 = 1.0f;
        }
        return (int) ((f2 / f9) + 0.5f);
    }

    private static int a(Context context) {
        return (int) ((context.getResources().getDisplayMetrics().density * 300.0f) + 0.5f);
    }
}
