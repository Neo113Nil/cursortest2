package com.yandex.passport.internal.flags.experiments;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.core.app.y0;
import defpackage.b6e;
import defpackage.cmd;
import defpackage.cxb;
import defpackage.dt0;
import defpackage.etn;
import defpackage.vq2;
import defpackage.x97;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q {
    public static final long e = com.yandex.plus.pay.ui.core.b.E(0, 247);
    public static final long f = com.yandex.plus.pay.ui.core.b.E(3, 239);
    public static final long g = com.yandex.plus.pay.ui.core.b.E(1, 239);
    public static final /* synthetic */ int h = 0;
    public final i a;
    public final com.yandex.passport.common.a b;
    public final com.yandex.passport.common.permission.b c;
    public final p d;

    public q(i iVar, com.yandex.passport.common.a aVar, com.yandex.passport.common.permission.b bVar, p pVar) {
        iVar.getClass();
        aVar.getClass();
        bVar.getClass();
        pVar.getClass();
        this.a = iVar;
        this.b = aVar;
        this.c = bVar;
        this.d = pVar;
    }

    public final void a(o oVar) {
        long b;
        long b2;
        com.yandex.passport.common.core.b bVar = com.yandex.passport.common.core.b.c;
        this.b.getClass();
        long a = com.yandex.passport.common.a.a();
        i iVar = this.a;
        SharedPreferences sharedPreferences = iVar.a;
        SharedPreferences sharedPreferences2 = iVar.a;
        b = com.yandex.passport.common.time.a.b(0L, 0L, 0L, sharedPreferences.getLong("__last__updated__time", 0L));
        boolean e2 = com.yandex.passport.common.time.a.e(b, 0L);
        long j = a - b;
        int ordinal = oVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    b6e.s();
                    return;
                }
            } else if (!e2 && Intrinsics.f(j, e) <= 0) {
                return;
            }
        } else if (!e2) {
            long j2 = f;
            if (Intrinsics.f(j, j2) <= 0 && (Intrinsics.f(a, j2) >= 0 || Intrinsics.f(a, b) >= 0)) {
                return;
            }
        }
        if (oVar != o.c) {
            long a2 = com.yandex.passport.common.a.a();
            b2 = com.yandex.passport.common.time.a.b(0L, 0L, 0L, sharedPreferences2.getLong("__last__enqueue__time", 0L));
            if (Intrinsics.f(a2 - b2, g) < 0) {
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "doEnqueue was called less than one hour ago", 8);
                    return;
                }
                return;
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = sharedPreferences2.edit();
        edit.putLong("__last__enqueue__time", currentTimeMillis);
        edit.apply();
        com.yandex.passport.common.permission.a[] aVarArr = com.yandex.passport.common.permission.a.a;
        com.yandex.passport.common.permission.b bVar2 = this.c;
        bVar2.getClass();
        com.yandex.passport.common.core.a aVar = com.yandex.passport.common.permission.b.b;
        Context context = bVar2.a;
        aVar.getClass();
        int z = etn.z(context, "android.permission.WAKE_LOCK");
        p pVar = this.d;
        if (z == 0) {
            pVar.getClass();
            Context context2 = (Context) pVar.b;
            y0.a(context2, FetchExperimentsService.class, 542962, vq2.A(context2, FetchExperimentsService.class, cxb.K((Pair[]) Arrays.copyOf(new Pair[]{new Pair("environment", bVar)}, 1))));
            return;
        }
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "WAKE_LOCK permission is not enabled", 8);
        }
        pVar.getClass();
        ((com.yandex.passport.common.coroutine.e) pVar.c).getClass();
        x97.y(cmd.a, ((com.yandex.passport.common.coroutine.b) ((com.yandex.passport.common.coroutine.a) pVar.d)).d, null, new dt0(null), 2);
    }
}
