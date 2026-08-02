package com.yandex.passport.internal.core.announcing;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.SystemClock;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.passport.common.network.r;
import com.yandex.passport.internal.analytics.n;
import com.yandex.passport.internal.report.n0;
import com.yandex.passport.internal.report.reporters.f;
import com.yandex.passport.internal.report.ve;
import com.yandex.passport.internal.sso.g;
import defpackage.jhp;
import defpackage.lcc;
import defpackage.o7t;
import defpackage.q0v;
import defpackage.u75;
import defpackage.wz0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class e {
    public final Context a;
    public final com.yandex.passport.common.a b;
    public final f c;
    public final com.yandex.passport.common.analytics.f d;
    public final g e;

    public e(Context context, com.yandex.passport.common.a aVar, f fVar, com.yandex.passport.common.analytics.f fVar2, com.yandex.passport.internal.config.a aVar2) {
        context.getClass();
        aVar.getClass();
        fVar.getClass();
        fVar2.getClass();
        aVar2.getClass();
        this.a = context;
        this.b = aVar;
        this.c = fVar;
        this.d = fVar2;
        this.e = new g(context, aVar2, null);
    }

    public final d a(Intent intent) {
        this.b.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String action = intent.getAction();
        if (action == null) {
            return null;
        }
        String stringExtra = intent.getStringExtra("com.yandex.passport.sender");
        String stringExtra2 = intent.getStringExtra("com.yandex.passport.sender_device_id");
        String stringExtra3 = intent.getStringExtra("com.yandex.passport.reason");
        long longExtra = intent.getLongExtra("com.yandex.passport.created", 0L);
        return new d(action, stringExtra3, stringExtra, stringExtra2, longExtra, elapsedRealtime, longExtra > 0 ? elapsedRealtime - longExtra : 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(n nVar) {
        nVar.getClass();
        String str = nVar.b;
        Context context = this.a;
        String packageName = context.getPackageName();
        packageName.getClass();
        String str2 = this.d.b().a;
        if (str2 == null) {
            str2 = null;
        }
        this.b.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Intent intent = new Intent("com.yandex.accounts.LOGIN_ACCOUNTS_CHANGED");
        intent.putExtra("com.yandex.passport.reason", str);
        intent.putExtra("com.yandex.passport.sender", packageName);
        intent.putExtra("com.yandex.passport.sender_device_id", str2);
        intent.putExtra("com.yandex.passport.created", elapsedRealtime);
        intent.setFlags(32);
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(new Intent("com.yandex.accounts.LOGIN_ACCOUNTS_CHANGED"), RemoteCameraConfig.Mic.BUFFER_SIZE);
        queryBroadcastReceivers.getClass();
        List k = jhp.k(new lcc(new o7t(new wz0(1, queryBroadcastReceivers), new r(8)), true, new q0v(21, this)));
        f fVar = this.c;
        fVar.getClass();
        k.getClass();
        ArrayList j = u75.j(new com.yandex.passport.internal.report.a("com.yandex.accounts.LOGIN_ACCOUNTS_CHANGED", 0, 0 == true ? 1 : 0), new ve(k));
        j.add(new ve(packageName, 23));
        if (str2 != null) {
            j.add(new com.yandex.passport.internal.report.a(str2, 22));
        }
        j.add(new ve(str, 17));
        fVar.m(n0.d, j);
        Iterator it = k.iterator();
        while (it.hasNext()) {
            intent.setPackage((String) it.next());
            context.sendBroadcast(intent);
        }
    }
}
