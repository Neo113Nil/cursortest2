package com.yandex.passport.internal.push;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.yandex.passport.api.z1;
import com.yandex.passport.internal.ui.sloth.webcard.WebCardComposeActivity;
import com.yandex.passport.internal.ui.sloth.webcard.WebCardSlothActivity;
import defpackage.r1w;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* loaded from: classes4.dex */
public final class f0 {
    public final Context a;
    public final com.yandex.passport.common.common.a b;
    public final com.yandex.passport.common.analytics.f c;
    public final com.yandex.passport.internal.flags.i d;

    public f0(Context context, com.yandex.passport.common.common.a aVar, com.yandex.passport.common.analytics.f fVar, com.yandex.passport.internal.flags.i iVar) {
        context.getClass();
        aVar.getClass();
        fVar.getClass();
        iVar.getClass();
        this.a = context;
        this.b = aVar;
        this.c = fVar;
        this.d = iVar;
    }

    public static com.yandex.passport.internal.properties.l f(com.yandex.passport.common.core.f fVar) {
        z1 J = com.yandex.plus.pay.ui.core.b.J(fVar);
        com.yandex.passport.internal.entities.j jVar = new com.yandex.passport.internal.entities.j();
        jVar.O(com.yandex.plus.core.network.api.utils.a.P(fVar.a));
        ((com.yandex.passport.common.bitflag.b) jVar.e).a(new com.yandex.passport.api.n[]{com.yandex.passport.api.n.SOCIAL}[0], false);
        return new com.yandex.passport.internal.properties.l(null, false, null, jVar.l(), null, null, J, false, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, false, null, false, null, 1073741751);
    }

    public final PendingIntent a(int i, Intent intent) {
        if (Build.VERSION.SDK_INT >= 28) {
            intent.addFlags(268437504);
        }
        intent.setAction("push_action_" + System.currentTimeMillis());
        PendingIntent activity = PendingIntent.getActivity(this.a, i, intent, 1140850688);
        activity.getClass();
        return activity;
    }

    public final PendingIntent b(com.yandex.passport.common.core.f fVar, c0 c0Var, com.yandex.passport.sloth.data.g gVar) {
        fVar.getClass();
        String str = c0Var.s;
        String str2 = c0Var.b;
        int i = c0Var.r;
        com.yandex.passport.internal.properties.l f = f(fVar);
        com.yandex.passport.common.url.a aVar = com.yandex.passport.common.url.b.Companion;
        Uri parse = Uri.parse(str);
        aVar.getClass();
        return a(c0Var.hashCode() + c0Var.r, d(g(f, new com.yandex.passport.sloth.data.g0(str2, gVar, com.yandex.passport.common.url.a.a(parse), fVar, com.yandex.plus.core.network.api.utils.a.S(f.e), i))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PendingIntent c(Context context, int i, String str, com.yandex.passport.common.core.f fVar, String str2, String str3, String str4) {
        context.getClass();
        fVar.getClass();
        Intent putExtra = new Intent(context, (Class<?>) NotificationDismissedReceiver.class).setAction("com.yandex.passport.NOTIFICATION_DISMISS").putExtra(CommonUrlParts.APP_ID, ((com.yandex.passport.internal.common.d) this.b).a());
        Object B = com.yandex.passport.internal.ui.a.B(new r1w(this, 0 == true ? 1 : 0, 18));
        r7o r7oVar = z7o.b;
        if (B instanceof t7o) {
            B = null;
        }
        com.yandex.passport.common.value.a aVar = (com.yandex.passport.common.value.a) B;
        String str5 = aVar != null ? aVar.a : null;
        Intent putExtra2 = putExtra.putExtra("device_id", str5 != null ? str5 : null).putExtra("notification_message", str);
        fVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("passport-uid", fVar);
        Intent putExtra3 = putExtra2.putExtra("uid", bundle).putExtra("push_id", str2).putExtra("track_id", str3).putExtra("push_platform", str4);
        putExtra3.getClass();
        return PendingIntent.getBroadcast(context, i, putExtra3, 1140850688);
    }

    public final Intent d(com.yandex.passport.sloth.data.m mVar) {
        Intent intent = new Intent(this.a, (Class<?>) (((Boolean) this.d.b(com.yandex.passport.internal.flags.o.b0)).booleanValue() ? WebCardComposeActivity.class : WebCardSlothActivity.class));
        intent.putExtras(new Bundle[]{mVar.t()}[0]);
        intent.addFlags(268435456);
        return intent;
    }

    public final com.yandex.passport.sloth.data.m e(com.yandex.passport.common.core.f fVar, String str, com.yandex.passport.sloth.data.h hVar) {
        com.yandex.passport.internal.properties.l f = f(fVar);
        com.yandex.passport.common.url.a aVar = com.yandex.passport.common.url.b.Companion;
        Uri parse = Uri.parse(str);
        aVar.getClass();
        return g(f, new com.yandex.passport.sloth.data.n0(com.yandex.passport.common.url.a.a(parse), fVar, com.yandex.plus.core.network.api.utils.a.S(f.e), hVar));
    }

    public final com.yandex.passport.sloth.data.m g(com.yandex.passport.internal.properties.l lVar, com.yandex.passport.sloth.data.s sVar) {
        return new com.yandex.passport.sloth.data.m(sVar, com.yandex.plus.core.network.api.utils.a.L(lVar.d.a), com.yandex.plus.core.network.api.utils.a.J(lVar.u, ((Boolean) this.d.b(com.yandex.passport.internal.flags.o.y)).booleanValue()), 4);
    }
}
