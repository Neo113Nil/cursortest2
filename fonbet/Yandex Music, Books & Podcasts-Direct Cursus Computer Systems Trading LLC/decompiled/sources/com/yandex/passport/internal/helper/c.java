package com.yandex.passport.internal.helper;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.yandex.passport.internal.sso.l;
import com.yandex.passport.internal.storage.m;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class c {
    public final Context a;
    public final m b;
    public final com.yandex.passport.internal.sso.h c;
    public final l d;

    public c(Context context, m mVar, com.yandex.passport.internal.sso.h hVar, l lVar) {
        context.getClass();
        mVar.getClass();
        hVar.getClass();
        lVar.getClass();
        this.a = context;
        this.b = mVar;
        this.c = hVar;
        this.d = lVar;
    }

    public final void a() {
        boolean a = this.d.a();
        int i = 0;
        m mVar = this.b;
        if (a) {
            mVar.i.setValue(mVar, m.m[7], 0);
            return;
        }
        int intValue = ((Number) mVar.i.getValue(mVar, m.m[7])).intValue();
        Context context = this.a;
        context.getClass();
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            applicationInfo.getClass();
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                i = bundle.getInt("com.yandex.auth.INTERNAL_VERSION", 0);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (intValue < i) {
            if (intValue < 70000) {
                com.yandex.passport.internal.sso.h hVar = this.c;
                Iterator it = hVar.a.a().iterator();
                while (it.hasNext()) {
                    for (com.yandex.passport.internal.sso.d dVar : ((com.yandex.passport.internal.sso.m) it.next()).a) {
                        try {
                            hVar.c.b(dVar.a, com.yandex.passport.internal.sso.announcing.b.b);
                            break;
                        } catch (Exception e) {
                            com.yandex.passport.common.logger.d dVar2 = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.b, null, "Failed to sync action with " + dVar.a, e);
                            }
                        }
                    }
                }
                hVar.b.b(com.yandex.passport.internal.sso.announcing.d.a);
            }
            mVar.i.setValue(mVar, m.m[7], Integer.valueOf(i));
        }
    }
}
