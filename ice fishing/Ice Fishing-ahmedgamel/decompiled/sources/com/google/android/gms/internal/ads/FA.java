package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class FA {

    /* renamed from: c, reason: collision with root package name */
    public static final C3933tE f24750c = new C3933tE("OverlayDisplayService");

    /* renamed from: d, reason: collision with root package name */
    public static final Intent f24751d = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");

    /* renamed from: a, reason: collision with root package name */
    public final C2598Hq f24752a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24753b;

    public FA(Context context) {
        if (JA.a(context)) {
            this.f24752a = new C2598Hq(context.getApplicationContext(), f24750c, f24751d);
        } else {
            this.f24752a = null;
        }
        this.f24753b = context.getPackageName();
    }

    public static boolean b(String str) {
        if (str == null) {
            str = "";
        }
        return str.trim().isEmpty();
    }

    public static boolean c(t2.n nVar, String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!b((String) it.next())) {
                return true;
            }
        }
        f24750c.c(str, new Object[0]);
        byte b9 = (byte) (((byte) (((byte) (0 | 1)) | 2)) | 1);
        if (b9 == 3) {
            nVar.a(new CA(8160, null, 0, null));
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

    public final void a(DA da, t2.n nVar, int i) {
        C2598Hq c2598Hq = this.f24752a;
        if (c2598Hq == null) {
            f24750c.c("error: %s", "Play Store not found.");
        } else {
            if (c(nVar, "Failed to apply OverlayDisplayUpdateRequest: missing appId and sessionToken.", Arrays.asList(da.f24359a, da.f24360b))) {
                c2598Hq.a(new IA(c2598Hq, new RunnableC2791Tg(this, da, i, nVar), 0));
            }
        }
    }
}
