package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class IA {

    /* renamed from: c, reason: collision with root package name */
    public static final HE f25532c = new HE("OverlayDisplayService");

    /* renamed from: d, reason: collision with root package name */
    public static final Intent f25533d = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");

    /* renamed from: a, reason: collision with root package name */
    public final C2631Jq f25534a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25535b;

    public IA(Context context) {
        if (MA.a(context)) {
            this.f25534a = new C2631Jq(context.getApplicationContext(), f25532c, f25533d);
        } else {
            this.f25534a = null;
        }
        this.f25535b = context.getPackageName();
    }

    public static boolean b(String str) {
        if (str == null) {
            str = "";
        }
        return str.trim().isEmpty();
    }

    public static boolean c(h8.d dVar, String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!b((String) it.next())) {
                return true;
            }
        }
        f25532c.c(str, new Object[0]);
        byte b9 = (byte) (((byte) (((byte) (0 | 1)) | 2)) | 1);
        if (b9 == 3) {
            dVar.p(new FA(8160, null, 0, null));
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

    public final void a(GA ga, h8.d dVar, int i) {
        C2631Jq c2631Jq = this.f25534a;
        if (c2631Jq == null) {
            f25532c.c("error: %s", "Play Store not found.");
        } else {
            if (c(dVar, "Failed to apply OverlayDisplayUpdateRequest: missing appId and sessionToken.", Arrays.asList(ga.f25106a, ga.f25107b))) {
                c2631Jq.a(new LA(c2631Jq, new RunnableC2740Qg(this, ga, i, dVar), 0));
            }
        }
    }
}
