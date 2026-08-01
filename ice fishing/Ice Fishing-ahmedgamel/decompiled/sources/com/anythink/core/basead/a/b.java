package com.anythink.core.basead.a;

import android.util.Log;
import com.anythink.core.basead.adx.api.IATAdxHandler;
import com.anythink.core.common.d.t;
import com.anythink.core.common.f;
import com.anythink.core.common.h.ad;
import com.anythink.core.common.h.aw;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.cd;
import com.anythink.core.common.h.n;
import com.anythink.core.common.v.p;
import java.util.Map;

/* loaded from: classes.dex */
public final class b implements IATAdxHandler {

    /* renamed from: a, reason: collision with root package name */
    public static String f11884a = "anythink_adx_handler";

    /* renamed from: b, reason: collision with root package name */
    private ad f11885b;

    /* renamed from: c, reason: collision with root package name */
    private bv f11886c;

    /* renamed from: d, reason: collision with root package name */
    private n f11887d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f11888e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f11889f;

    /* renamed from: com.anythink.core.basead.a.b$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11890a;

        static {
            int[] iArr = new int[IATAdxHandler.LOSS_REASON.values().length];
            f11890a = iArr;
            try {
                iArr[IATAdxHandler.LOSS_REASON.LOSS_TO_AUCTION_FLOOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11890a[IATAdxHandler.LOSS_REASON.LOSS_TO_HIGHER_BID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11890a[IATAdxHandler.LOSS_REASON.LOSS_TO_NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public b(ad adVar, bv bvVar, n nVar) {
        this.f11885b = adVar;
        this.f11886c = bvVar;
        this.f11887d = nVar;
    }

    @Override // com.anythink.core.basead.adx.api.IATAdxHandler
    public final synchronized void destroy() {
        if (this.f11889f) {
            Log.e(f11884a, "destroy: has call destroy(), do nothing");
            return;
        }
        this.f11889f = true;
        Log.i(f11884a, "destroy, placementId: " + this.f11887d.aI() + ", adSourceId: " + this.f11886c.z());
        try {
            com.anythink.core.common.a.a().a(this.f11887d.aI(), this.f11886c, this.f11887d.aJ());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.core.basead.adx.api.IATAdxHandler
    public final synchronized void notifyLose(IATAdxHandler.LOSS_REASON loss_reason, double d2, Map<String, Object> map) {
        String str;
        if (this.f11888e) {
            Log.e(f11884a, "notifyWin: win or loss has been sent, do anything");
            return;
        }
        this.f11888e = true;
        if (this.f11885b != null && this.f11886c != null) {
            if (d2 <= 0.0d) {
                Log.e(f11884a, "notifyLose, winnerPrice: " + d2 + " <= 0, do nothing");
                return;
            }
            Log.i(f11884a, "notifyLose, lossCode: " + loss_reason + ", winnerPrice: " + d2 + ", extraMap: " + map);
            try {
                int i = AnonymousClass1.f11890a[loss_reason.ordinal()];
                String str2 = i != 1 ? i != 2 ? "103" : "102" : "100";
                ad adVar = this.f11885b;
                aw awVar = new aw(2, this.f11886c, this.f11887d);
                str = "";
                if (map != null) {
                    Object obj = map.get("bidding_name");
                    str = obj instanceof String ? obj.toString() : "";
                    Object obj2 = map.get("waterfall_info");
                    if (obj2 instanceof String) {
                        com.anythink.core.common.d.a().a(this.f11887d.aI(), (String) obj2);
                    }
                }
                try {
                    if (loss_reason == IATAdxHandler.LOSS_REASON.LOSS_TO_AUCTION_FLOOR) {
                        str = "";
                        f a9 = f.a(t.b().g(), this.f11887d.aI(), this.f11887d.aK());
                        if (a9 != null) {
                            a9.d();
                        }
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                awVar.a(d2, str, str2);
                com.anythink.core.b.d.c.a(adVar, awVar, false, 28);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    @Override // com.anythink.core.basead.adx.api.IATAdxHandler
    public final synchronized void notifyWin(Map<String, Object> map) {
        String str;
        if (this.f11888e) {
            Log.e(f11884a, "notifyWin: win or loss has been sent, do anything");
            return;
        }
        this.f11888e = true;
        if (this.f11885b != null && this.f11886c != null) {
            Log.i(f11884a, "notifyWin, extraMap: ".concat(String.valueOf(map)));
            try {
                ad adVar = this.f11885b;
                bv bvVar = this.f11886c;
                str = "";
                Double d2 = null;
                if (map != null) {
                    Object obj = map.get("second_price");
                    if (obj != null) {
                        try {
                            d2 = Double.valueOf(Double.parseDouble(obj.toString()));
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                    Object obj2 = map.get("bidding_name");
                    str = obj2 instanceof String ? obj2.toString() : "";
                    Object obj3 = map.get("waterfall_info");
                    if (obj3 instanceof String) {
                        com.anythink.core.common.d.a().a(this.f11887d.aI(), (String) obj3);
                    }
                }
                if (d2 == null) {
                    d2 = Double.valueOf(p.a(bvVar));
                    str = "TopOn";
                }
                cd cdVar = adVar.f13439v;
                if (cdVar != null) {
                    cdVar.a(d2, str);
                }
                com.anythink.core.b.d.c.a(adVar, bvVar, 4);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }
}
