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
    public static String f12670a = "anythink_adx_handler";

    /* renamed from: b, reason: collision with root package name */
    private ad f12671b;

    /* renamed from: c, reason: collision with root package name */
    private bv f12672c;

    /* renamed from: d, reason: collision with root package name */
    private n f12673d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f12674e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f12675f;

    /* renamed from: com.anythink.core.basead.a.b$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12676a;

        static {
            int[] iArr = new int[IATAdxHandler.LOSS_REASON.values().length];
            f12676a = iArr;
            try {
                iArr[IATAdxHandler.LOSS_REASON.LOSS_TO_AUCTION_FLOOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12676a[IATAdxHandler.LOSS_REASON.LOSS_TO_HIGHER_BID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12676a[IATAdxHandler.LOSS_REASON.LOSS_TO_NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public b(ad adVar, bv bvVar, n nVar) {
        this.f12671b = adVar;
        this.f12672c = bvVar;
        this.f12673d = nVar;
    }

    @Override // com.anythink.core.basead.adx.api.IATAdxHandler
    public final synchronized void destroy() {
        if (this.f12675f) {
            Log.e(f12670a, "destroy: has call destroy(), do nothing");
            return;
        }
        this.f12675f = true;
        Log.i(f12670a, "destroy, placementId: " + this.f12673d.aI() + ", adSourceId: " + this.f12672c.z());
        try {
            com.anythink.core.common.a.a().a(this.f12673d.aI(), this.f12672c, this.f12673d.aJ());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.core.basead.adx.api.IATAdxHandler
    public final synchronized void notifyLose(IATAdxHandler.LOSS_REASON loss_reason, double d9, Map<String, Object> map) {
        String str;
        if (this.f12674e) {
            Log.e(f12670a, "notifyWin: win or loss has been sent, do anything");
            return;
        }
        this.f12674e = true;
        if (this.f12671b != null && this.f12672c != null) {
            if (d9 <= 0.0d) {
                Log.e(f12670a, "notifyLose, winnerPrice: " + d9 + " <= 0, do nothing");
                return;
            }
            Log.i(f12670a, "notifyLose, lossCode: " + loss_reason + ", winnerPrice: " + d9 + ", extraMap: " + map);
            try {
                int i = AnonymousClass1.f12676a[loss_reason.ordinal()];
                String str2 = i != 1 ? i != 2 ? "103" : "102" : "100";
                ad adVar = this.f12671b;
                aw awVar = new aw(2, this.f12672c, this.f12673d);
                str = "";
                if (map != null) {
                    Object obj = map.get("bidding_name");
                    str = obj instanceof String ? obj.toString() : "";
                    Object obj2 = map.get("waterfall_info");
                    if (obj2 instanceof String) {
                        com.anythink.core.common.d.a().a(this.f12673d.aI(), (String) obj2);
                    }
                }
                try {
                    if (loss_reason == IATAdxHandler.LOSS_REASON.LOSS_TO_AUCTION_FLOOR) {
                        str = "";
                        f a9 = f.a(t.b().g(), this.f12673d.aI(), this.f12673d.aK());
                        if (a9 != null) {
                            a9.d();
                        }
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                awVar.a(d9, str, str2);
                com.anythink.core.b.d.c.a(adVar, awVar, false, 28);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    @Override // com.anythink.core.basead.adx.api.IATAdxHandler
    public final synchronized void notifyWin(Map<String, Object> map) {
        String str;
        if (this.f12674e) {
            Log.e(f12670a, "notifyWin: win or loss has been sent, do anything");
            return;
        }
        this.f12674e = true;
        if (this.f12671b != null && this.f12672c != null) {
            Log.i(f12670a, "notifyWin, extraMap: ".concat(String.valueOf(map)));
            try {
                ad adVar = this.f12671b;
                bv bvVar = this.f12672c;
                str = "";
                Double d9 = null;
                if (map != null) {
                    Object obj = map.get("second_price");
                    if (obj != null) {
                        try {
                            d9 = Double.valueOf(Double.parseDouble(obj.toString()));
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                    Object obj2 = map.get("bidding_name");
                    str = obj2 instanceof String ? obj2.toString() : "";
                    Object obj3 = map.get("waterfall_info");
                    if (obj3 instanceof String) {
                        com.anythink.core.common.d.a().a(this.f12673d.aI(), (String) obj3);
                    }
                }
                if (d9 == null) {
                    d9 = Double.valueOf(p.a(bvVar));
                    str = "TopOn";
                }
                cd cdVar = adVar.f14225v;
                if (cdVar != null) {
                    cdVar.a(d9, str);
                }
                com.anythink.core.b.d.c.a(adVar, bvVar, 4);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }
}
