package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import l.C4659e;

/* loaded from: classes2.dex */
public final class FA {

    /* renamed from: c, reason: collision with root package name */
    public static final C3956tE f25506c = new C3956tE("OverlayDisplayService");

    /* renamed from: d, reason: collision with root package name */
    public static final Intent f25507d = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");

    /* renamed from: a, reason: collision with root package name */
    public final C2618Hq f25508a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25509b;

    public FA(Context context) {
        if (JA.a(context)) {
            this.f25508a = new C2618Hq(context.getApplicationContext(), f25506c, f25507d);
        } else {
            this.f25508a = null;
        }
        this.f25509b = context.getPackageName();
    }

    public static boolean b(String str) {
        if (str == null) {
            str = "";
        }
        return str.trim().isEmpty();
    }

    public static boolean c(C4659e c4659e, String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!b((String) it.next())) {
                return true;
            }
        }
        f25506c.c(str, new Object[0]);
        byte b9 = (byte) (((byte) (((byte) (0 | 1)) | 2)) | 1);
        if (b9 == 3) {
            c4659e.C(new CA(8160, null, 0, null));
            return false;
        }
        StringBuilder sb = new StringBuilder();
        if ((b9 & 1) == 0) {
            sb.append(" statusCode");
        }
        if ((b9 & 2) == 0) {
            sb.append(" uiMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void a(DA da, C4659e c4659e, int i) {
        C2618Hq c2618Hq = this.f25508a;
        if (c2618Hq == null) {
            f25506c.c("error: %s", "Play Store not found.");
        } else {
            if (c(c4659e, "Failed to apply OverlayDisplayUpdateRequest: missing appId and sessionToken.", Arrays.asList(da.f25104a, da.f25105b))) {
                c2618Hq.a(new IA(c2618Hq, new RunnableC2812Tg(this, da, i, c4659e), 0));
            }
        }
    }
}
