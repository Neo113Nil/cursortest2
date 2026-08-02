package ru.yandex.music.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.bdt;
import defpackage.ca8;
import defpackage.dq7;
import defpackage.eps;
import defpackage.ezb;
import defpackage.frt;
import defpackage.gld;
import defpackage.hag;
import defpackage.ixr;
import defpackage.j7q;
import defpackage.l18;
import defpackage.mgp;
import defpackage.mn7;
import defpackage.ouj;
import defpackage.pfj;
import defpackage.qdc;
import defpackage.rfj;
import defpackage.s1n;
import defpackage.ssg;
import defpackage.tf6;
import defpackage.u75;
import defpackage.x97;
import defpackage.z66;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class RoutineService extends Service {
    public static final String b = ouj.n(RoutineService.class.getCanonicalName(), ".do.work");
    public final tf6 a;

    public RoutineService() {
        dq7 dq7Var = ca8.a;
        this.a = gld.e(mn7.d);
    }

    public static final List a(RoutineService routineService) {
        l18 l18Var = l18.b;
        bdt I = hag.I(frt.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        frt frtVar = (frt) qdcVar.C(I);
        bdt I2 = hag.I(j7q.class);
        qdc qdcVar2 = l18Var.a;
        qdcVar2.getClass();
        j7q j7qVar = (j7q) qdcVar2.C(I2);
        bdt I3 = hag.I(ezb.class);
        qdc qdcVar3 = l18Var.a;
        qdcVar3.getClass();
        ezb ezbVar = (ezb) qdcVar3.C(I3);
        bdt I4 = hag.I(z66.class);
        qdc qdcVar4 = l18Var.a;
        qdcVar4.getClass();
        z66 z66Var = (z66) qdcVar4.C(I4);
        bdt I5 = hag.I(pfj.class);
        qdc qdcVar5 = l18Var.a;
        qdcVar5.getClass();
        pfj pfjVar = (pfj) qdcVar5.C(I5);
        bdt I6 = hag.I(rfj.class);
        qdc qdcVar6 = l18Var.a;
        qdcVar6.getClass();
        eps epsVar = new eps(routineService, frtVar, j7qVar, ezbVar, z66Var, pfjVar, (rfj) qdcVar6.C(I6));
        return u75.h(new ixr(epsVar), new mgp(epsVar));
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        gld.L(this.a, null);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        ssg.a(3, null, "starting", null);
        x97.y(this.a, null, null, new s1n(this, (Continuation) null, 22), 3);
        return super.onStartCommand(intent, i, i2);
    }
}
