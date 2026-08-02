package ru.yandex.taxi.logistics.sdk.tracking.domain.impl;

import defpackage.bvf0;
import defpackage.esi;
import defpackage.f801;
import defpackage.gci0;
import defpackage.gv90;
import defpackage.gws0;
import defpackage.ha2;
import defpackage.ike;
import defpackage.jwh;
import defpackage.kus0;
import defpackage.lri;
import defpackage.mri;
import defpackage.mu90;
import defpackage.ori;
import defpackage.p6i;
import defpackage.qri;
import defpackage.sri;
import defpackage.st2;
import defpackage.tcc;
import defpackage.uri;
import defpackage.v6s;
import defpackage.vri;
import defpackage.w701;
import defpackage.wsr0;
import defpackage.xsr0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.q0;

/* loaded from: classes5.dex */
public final class e {
    public final f801 a;
    public final ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data.f b;
    public final jwh c;
    public final vri d;
    public final gci0 e;

    public e(f801 f801Var, ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data.f fVar, jwh jwhVar, vri vriVar, ru.yandex.taxi.logistics.sdk.delivery.edit.b bVar, ru.yandex.taxi.logistics.sdk.management.localstate.e eVar, st2 st2Var, v6s v6sVar) {
        this.a = f801Var;
        this.b = fVar;
        this.c = jwhVar;
        this.d = vriVar;
        ike a = bvf0.a(st2Var.a);
        ha2 m = kotlinx.coroutines.flow.e.m(fVar.c(), bVar.c.b, eVar.h, v6sVar.b, new TrackingRepositoryImpl$_trackingFlow$1(this, null));
        q0 a2 = wsr0.a(xsr0.a, 3);
        Object b = fVar.b();
        this.e = kotlinx.coroutines.flow.e.R(m, a, a2, b == null ? w701.a : b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x00b5, code lost:
    
        if (defpackage.vri.a(r13 != null ? r13.b : null, r27, r28) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005f, code lost:
    
        if (defpackage.vri.a(r13.d, r27, r28) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p6i a(p6i p6iVar, boolean z, Map map) {
        boolean a;
        gws0 gws0Var;
        uri qriVar;
        ArrayList arrayList = p6iVar.a;
        int i = 10;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            List<uri> list = ((esi) it.next()).a;
            ArrayList arrayList3 = new ArrayList(tcc.n(list, i));
            for (uri uriVar : list) {
                this.d.getClass();
                boolean z2 = uriVar instanceof lri;
                if (z2) {
                    lri lriVar = (lri) uriVar;
                    if (!vri.a(lriVar.h, z, map)) {
                    }
                    a = true;
                } else if (uriVar instanceof mri) {
                    a = vri.a(((mri) uriVar).b, z, map);
                } else if (uriVar instanceof ori) {
                    a = vri.a(((ori) uriVar).b, z, map);
                } else if (uriVar instanceof sri) {
                    a = vri.a(((sri) uriVar).i, z, map);
                } else {
                    if (uriVar instanceof qri) {
                        gws0 gws0Var2 = ((qri) uriVar).b.g;
                        if (gws0Var2 == null) {
                            gws0Var2 = null;
                        }
                        if (!vri.a(gws0Var2 != null ? gws0Var2.a : null, z, map)) {
                        }
                        a = true;
                    }
                    a = false;
                }
                if (a) {
                    if (z2) {
                        lri lriVar2 = (lri) uriVar;
                        gv90 gv90Var = lriVar2.h;
                        mu90 mu90Var = gv90Var instanceof mu90 ? (mu90) gv90Var : null;
                        gv90 gv90Var2 = lriVar2.d;
                        mu90 mu90Var2 = gv90Var2 instanceof mu90 ? (mu90) gv90Var2 : null;
                        uriVar = new lri(lriVar2.a, lriVar2.b, lriVar2.c, mu90Var2 != null ? new mu90(mu90Var2.a, false) : null, lriVar2.e, lriVar2.f, lriVar2.g, mu90Var != null ? new mu90(mu90Var.a, false) : null, true, lriVar2.j);
                    } else if (uriVar instanceof mri) {
                        mri mriVar = (mri) uriVar;
                        gv90 gv90Var3 = mriVar.b;
                        mu90 mu90Var3 = gv90Var3 instanceof mu90 ? (mu90) gv90Var3 : null;
                        uriVar = new mri(mriVar.a, mu90Var3 != null ? new mu90(mu90Var3.a, false) : null, true, mriVar.d);
                    } else {
                        if (uriVar instanceof ori) {
                            ori oriVar = (ori) uriVar;
                            gv90 gv90Var4 = oriVar.b;
                            mu90 mu90Var4 = gv90Var4 instanceof mu90 ? (mu90) gv90Var4 : null;
                            qriVar = new ori(oriVar.a, mu90Var4 != null ? new mu90(mu90Var4.a, false) : null, true);
                        } else if (uriVar instanceof sri) {
                            sri sriVar = (sri) uriVar;
                            gv90 gv90Var5 = sriVar.i;
                            mu90 mu90Var5 = gv90Var5 instanceof mu90 ? (mu90) gv90Var5 : null;
                            uriVar = new sri(sriVar.a, sriVar.b, sriVar.c, sriVar.d, sriVar.e, sriVar.f, sriVar.g, sriVar.h, mu90Var5 != null ? new mu90(mu90Var5.a, false) : null, true, sriVar.k);
                        } else if (uriVar instanceof qri) {
                            qri qriVar2 = (qri) uriVar;
                            kus0 kus0Var = qriVar2.b;
                            gws0 gws0Var3 = kus0Var.g;
                            if (gws0Var3 != null) {
                                mu90 mu90Var6 = gws0Var3.a;
                                if (mu90Var6 == null) {
                                    mu90Var6 = null;
                                }
                                mu90 mu90Var7 = mu90Var6 != null ? new mu90(mu90Var6.a, false) : null;
                                mu90 mu90Var8 = gws0Var3.b;
                                if (mu90Var8 == null) {
                                    mu90Var8 = null;
                                }
                                gws0Var = new gws0(mu90Var7, mu90Var8 != null ? new mu90(mu90Var8.a, false) : null, gws0Var3.c, gws0Var3.d, gws0Var3.e);
                            } else {
                                gws0Var = gws0Var3;
                            }
                            qriVar = new qri(qriVar2.a, new kus0(kus0Var.a, kus0Var.b, kus0Var.c, kus0Var.d, kus0Var.e, kus0Var.f, gws0Var, kus0Var.h), true);
                        }
                        uriVar = qriVar;
                    }
                }
                arrayList3.add(uriVar);
            }
            arrayList2.add(new esi(arrayList3));
            i = 10;
        }
        return new p6i(arrayList2);
    }

    public final void b() {
        this.b.c.d.g(zy11.a);
    }
}
