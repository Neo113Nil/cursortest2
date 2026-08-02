package com.yandex.passport.internal.ui.router;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.yandex.passport.internal.methods.u6;
import com.yandex.passport.internal.properties.h0;
import defpackage.cxb;
import defpackage.vq2;
import defpackage.xz0;
import java.util.Iterator;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class b {
    public static Intent a(Context context, com.yandex.passport.internal.properties.l lVar, boolean z, String str, String str2) {
        context.getClass();
        Intent d = d(context, c0.LOGIN, lVar != null ? lVar.t() : null, cxb.K(new Pair("passport_action", str2)));
        d.putExtra("EXTERNAL_EXTRA", !z);
        d.putExtra("CORRECTION_EXTRA", str);
        return d;
    }

    public static /* synthetic */ Intent b(Context context, com.yandex.passport.internal.properties.l lVar, String str, int i) {
        boolean z = (i & 4) != 0;
        if ((i & 8) != 0) {
            str = null;
        }
        return a(context, lVar, z, str, null);
    }

    public static Intent c(Context context, h0 h0Var) {
        context.getClass();
        c0 c0Var = c0.TURBO_APP_AUTH;
        Bundle bundle = new Bundle();
        u6 u6Var = u6.d;
        u6Var.getClass();
        bundle.putParcelable((String) u6Var.b, h0Var);
        Intent d = d(context, c0Var, bundle);
        d.putExtra("com.yandex.auth.CLIENT_ID", h0Var.d);
        d.putExtra("com.yandex.passport.THEME", h0Var.a);
        return d;
    }

    public static Intent d(Context context, c0 c0Var, Bundle... bundleArr) {
        Bundle bundle = new Bundle();
        bundle.putString("ROAD_SIGN_EXTRA", c0Var.name());
        bundle.putBoolean("EXTERNAL_EXTRA", true);
        Iterator it = xz0.w(bundleArr).iterator();
        while (it.hasNext()) {
            bundle.putAll((Bundle) it.next());
        }
        return vq2.A(context, GlobalRouterActivity.class, bundle);
    }
}
