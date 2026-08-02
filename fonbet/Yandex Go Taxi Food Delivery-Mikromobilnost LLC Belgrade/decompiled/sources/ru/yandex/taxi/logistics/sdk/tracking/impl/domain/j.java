package ru.yandex.taxi.logistics.sdk.tracking.impl.domain;

import android.R;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import defpackage.aoi;
import defpackage.ba9;
import defpackage.bc;
import defpackage.bdj;
import defpackage.bi60;
import defpackage.bm50;
import defpackage.bo2;
import defpackage.bu0;
import defpackage.bwo;
import defpackage.c06;
import defpackage.c29;
import defpackage.c7n;
import defpackage.can;
import defpackage.cto;
import defpackage.cxm;
import defpackage.czh;
import defpackage.d301;
import defpackage.di60;
import defpackage.ev90;
import defpackage.ewo;
import defpackage.fyc;
import defpackage.gv90;
import defpackage.gwk0;
import defpackage.gym;
import defpackage.gzh;
import defpackage.hbn;
import defpackage.hd3;
import defpackage.hrb1;
import defpackage.hwo;
import defpackage.i5m;
import defpackage.ia9;
import defpackage.izh;
import defpackage.jl40;
import defpackage.jw40;
import defpackage.jwo;
import defpackage.kcz0;
import defpackage.kj7;
import defpackage.kw40;
import defpackage.kwo;
import defpackage.la9;
import defpackage.ma9;
import defpackage.mu90;
import defpackage.mxf;
import defpackage.na9;
import defpackage.nn;
import defpackage.nr;
import defpackage.nxf;
import defpackage.ny61;
import defpackage.oa9;
import defpackage.on;
import defpackage.p470;
import defpackage.p670;
import defpackage.pa9;
import defpackage.pn;
import defpackage.pu90;
import defpackage.qcp0;
import defpackage.qej;
import defpackage.qzf;
import defpackage.rn;
import defpackage.rzf;
import defpackage.sls;
import defpackage.sn;
import defpackage.t4;
import defpackage.u1n;
import defpackage.v370;
import defpackage.vej;
import defpackage.vi60;
import defpackage.vn;
import defpackage.vr;
import defpackage.w511;
import defpackage.wej;
import defpackage.x201;
import defpackage.xej;
import defpackage.xn;
import defpackage.xvf0;
import defpackage.yej;
import defpackage.z9n;
import defpackage.zej;
import defpackage.zrm;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.logistics.childrouter.api.ScreenMode;
import ru.yandex.taxi.logistics.sdk.tracking.domain.api.models.ClickSource;

/* loaded from: classes5.dex */
public final class j {
    public final String a;
    public final com.yandex.delivery.utils.dialogmanager.impl.b b;
    public final x201 c;
    public final oa9 d;
    public final ru.yandex.taxi.logistics.sdk.tracking.impl.edit_order_details.a e;
    public final vr f;
    public final Context g;
    public final kcz0 h;
    public final bi60 i;
    public final u1n j;
    public final d301 k;

    public j(String str, com.yandex.delivery.utils.dialogmanager.impl.b bVar, x201 x201Var, oa9 oa9Var, ru.yandex.taxi.logistics.sdk.tracking.impl.edit_order_details.a aVar, vr vrVar, Context context, kcz0 kcz0Var, bi60 bi60Var, u1n u1nVar, d301 d301Var) {
        this.a = str;
        this.b = bVar;
        this.c = x201Var;
        this.d = oa9Var;
        this.e = aVar;
        this.f = vrVar;
        this.g = context;
        this.h = kcz0Var;
        this.i = bi60Var;
        this.j = u1nVar;
        this.k = d301Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0233, code lost:
    
        if (r0 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(nr nrVar, ClickSource clickSource, ContinuationImpl continuationImpl) {
        Object obj;
        boolean z = nrVar instanceof pn;
        zy11 zy11Var = zy11.a;
        if (z) {
            Object d = d(((pn) nrVar).d, clickSource, continuationImpl);
            if (d == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return d;
            }
        } else {
            int i = 3;
            int i2 = 2;
            int i3 = 1;
            if (nrVar instanceof nn) {
                nn nnVar = (nn) nrVar;
                oa9 oa9Var = this.d;
                czh create = oa9Var.b.create();
                c29 c29Var = oa9Var.c;
                String str = oa9Var.a;
                pa9 pa9Var = nnVar.c;
                int i4 = 0;
                c06 c06Var = new c06(new la9(str, pa9Var.a, pa9Var.b, pa9Var.d.a, pa9Var.c.a, nnVar.d, clickSource), new na9(create));
                bc bcVar = (bc) c29Var.b;
                bcVar.getClass();
                mxf mxfVar = new mxf(bcVar, i);
                mxf mxfVar2 = new mxf(bcVar, i3);
                nxf nxfVar = new nxf(c06Var, i4);
                nxf nxfVar2 = new nxf(c06Var, i3);
                ia9 ia9Var = (ia9) i5m.b(new t4(mxfVar, i5m.b(new kj7(mxfVar2, i5m.b(new t4(nxfVar, nxfVar2, new ba9(new mxf(bcVar, i4), i2), new mxf(bcVar, i2), 26)), new mxf(bcVar, 4), 14)), nxfVar, nxfVar2, 25)).get();
                qcp0 qcp0Var = ia9Var.a;
                ma9 ma9Var = ia9Var.b;
                la9 la9Var = ia9Var.c;
                na9 na9Var = ia9Var.d;
                qcp0Var.getClass();
                czh.a(create, new izh(new cxm(new aoi(ma9Var, la9Var, na9Var)), null, null, null, null, null, 8190));
                return zy11Var;
            }
            boolean z2 = nrVar instanceof on;
            x201 x201Var = this.c;
            if (z2) {
                x201Var.a(new p470(((on) nrVar).a));
                return zy11Var;
            }
            if (nrVar instanceof rn) {
                this.e.a(false);
                return zy11Var;
            }
            if (nrVar instanceof sn) {
                u1n u1nVar = this.j;
                czh create2 = ((gzh) u1nVar.b).create();
                jwo jwoVar = new jwo(this.a);
                hwo hwoVar = new hwo(create2);
                gym gymVar = (gym) u1nVar.c;
                zrm zrmVar = new zrm(13, jwoVar, hwoVar);
                bu0 bu0Var = (bu0) gymVar.a;
                bu0Var.getClass();
                qzf qzfVar = new qzf(bu0Var, 7);
                qzf qzfVar2 = new qzf(bu0Var, 2);
                rzf rzfVar = new rzf(zrmVar, r13);
                rzf rzfVar2 = new rzf(zrmVar, i3);
                qzf qzfVar3 = new qzf(bu0Var, 3);
                qzf qzfVar4 = new qzf(bu0Var, 6);
                bwo bwoVar = (bwo) i5m.b(new z9n((xvf0) qzfVar, i5m.b(new cto(qzfVar2, new bo2(rzfVar, rzfVar2, qzfVar3, i5m.b(new cto(i5m.b(new ewo(qzfVar4, 1)), i5m.b(new ewo(qzfVar4, 0)), new c7n(hd3.a, 16), i2)), new hbn(9, new qzf(bu0Var, 0)), new qzf(bu0Var, 1), new can(new qzf(bu0Var, 5), qzfVar3, 5), new hbn(11, new qzf(bu0Var, 4))), new qzf(bu0Var, 8), 3)), (xvf0) rzfVar, (xvf0) rzfVar2, 9, (byte) 0)).get();
                qcp0 qcp0Var2 = bwoVar.a;
                kwo kwoVar = bwoVar.b;
                jwo jwoVar2 = bwoVar.c;
                hwo hwoVar2 = bwoVar.d;
                qcp0Var2.getClass();
                czh.a(create2, new izh(new cxm(new aoi(kwoVar, jwoVar2, hwoVar2)), null, ScreenMode.FIXED, null, null, null, 8182));
                return zy11Var;
            }
            if (nrVar instanceof vn) {
                vn vnVar = (vn) nrVar;
                String str2 = vnVar.e;
                if (str2 != null) {
                    this.k.a(str2);
                }
                x201Var.a(new p670(vnVar.a, vnVar.b, vnVar.c, vnVar.d, vnVar.f));
                return zy11Var;
            }
            if (nrVar instanceof xn) {
                xn xnVar = (xn) nrVar;
                bdj bdjVar = xnVar.b;
                r13 = bdjVar != null ? 1 : 0;
                if (r13 == 1) {
                    obj = c(bdjVar, new bm50(26, this, xnVar), continuationImpl);
                } else {
                    if (r13 != 0) {
                        w511.b();
                        return null;
                    }
                    x201Var.a(new v370(xnVar.c, xnVar.e, new bm50(27, xnVar.f, this)));
                }
                obj = zy11Var;
                if (obj == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return obj;
                }
            }
        }
        return zy11Var;
    }

    public final Object b(gv90 gv90Var, ClickSource clickSource, SuspendLambda suspendLambda) {
        View findViewById;
        boolean z = gv90Var instanceof pu90;
        zy11 zy11Var = zy11.a;
        if (!z) {
            if (gv90Var instanceof mu90) {
                Object a = a(((mu90) gv90Var).a, clickSource, suspendLambda);
                if (a == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return a;
                }
            } else if (!jl40.l(gv90Var, ev90.a)) {
                w511.b();
                return null;
            }
            return zy11Var;
        }
        pu90 pu90Var = (pu90) gv90Var;
        Activity b = hrb1.b(this.g);
        if (b != null && (findViewById = b.findViewById(R.id.content)) != null) {
            findViewById.performHapticFeedback(0);
        }
        ((ClipboardManager) this.f.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("DeliveryInfo", pu90Var.a));
        vi60 vi60Var = new vi60(pu90Var.b, 7000L);
        com.yandex.delivery.utils.notificationmanager.impl.b bVar = (com.yandex.delivery.utils.notificationmanager.impl.b) this.i;
        bVar.getClass();
        bVar.a.d(new di60(vi60Var, gwk0.b()));
        this.h.x("SharedOrderCard.CopiedExecutorInfo", null);
        return zy11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(bdj bdjVar, bm50 bm50Var, ContinuationImpl continuationImpl) {
        PayloadHandler$showDialog$1 payloadHandler$showDialog$1;
        int i;
        sls slsVar;
        zej zejVar;
        if (continuationImpl instanceof PayloadHandler$showDialog$1) {
            payloadHandler$showDialog$1 = (PayloadHandler$showDialog$1) continuationImpl;
            int i2 = payloadHandler$showDialog$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                payloadHandler$showDialog$1.label = i2 - Integer.MIN_VALUE;
                Object obj = payloadHandler$showDialog$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = payloadHandler$showDialog$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fyc b = this.b.b(new qej(bdjVar.a, bdjVar.b, bdjVar.d.a, bdjVar.c.a, null, true, null, null, 208));
                    payloadHandler$showDialog$1.L$0 = null;
                    payloadHandler$showDialog$1.L$1 = bm50Var;
                    payloadHandler$showDialog$1.L$2 = null;
                    payloadHandler$showDialog$1.label = 1;
                    obj = b.s(payloadHandler$showDialog$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    slsVar = bm50Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    slsVar = (sls) payloadHandler$showDialog$1.L$1;
                    kotlin.b.b(obj);
                }
                zejVar = (zej) obj;
                if (!(zejVar instanceof yej)) {
                    slsVar.invoke();
                } else if (!(zejVar instanceof wej) && !(zejVar instanceof xej) && !(zejVar instanceof vej)) {
                    w511.b();
                    return null;
                }
                return zy11.a;
            }
        }
        payloadHandler$showDialog$1 = new PayloadHandler$showDialog$1(this, continuationImpl);
        Object obj2 = payloadHandler$showDialog$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = payloadHandler$showDialog$1.label;
        if (i != 0) {
        }
        zejVar = (zej) obj2;
        if (!(zejVar instanceof yej)) {
        }
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b6, code lost:
    
        if (a(r1, r2, r3) == r4) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d7, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d5, code lost:
    
        if (a(r1, r2, r3) == r4) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0096, code lost:
    
        if (r5 == r4) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(jw40 jw40Var, ClickSource clickSource, ContinuationImpl continuationImpl) {
        PayloadHandler$showDialog$2 payloadHandler$showDialog$2;
        int i;
        ClickSource clickSource2;
        Object a;
        zej zejVar;
        kw40 kw40Var;
        jw40 jw40Var2 = jw40Var;
        if (continuationImpl instanceof PayloadHandler$showDialog$2) {
            payloadHandler$showDialog$2 = (PayloadHandler$showDialog$2) continuationImpl;
            int i2 = payloadHandler$showDialog$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                payloadHandler$showDialog$2.label = i2 - Integer.MIN_VALUE;
                Object obj = payloadHandler$showDialog$2.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = payloadHandler$showDialog$2.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str = jw40Var2.a;
                    String str2 = jw40Var2.b;
                    String str3 = jw40Var2.c.a;
                    kw40 kw40Var2 = jw40Var2.d;
                    qej qejVar = new qej(str, str2, str3, kw40Var2 != null ? kw40Var2.a : null, null, false, jw40Var2.f, null, 176);
                    payloadHandler$showDialog$2.L$0 = jw40Var2;
                    clickSource2 = clickSource;
                    payloadHandler$showDialog$2.L$1 = clickSource2;
                    payloadHandler$showDialog$2.L$2 = null;
                    payloadHandler$showDialog$2.label = 1;
                    a = this.b.a(qejVar, payloadHandler$showDialog$2);
                } else {
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    ClickSource clickSource3 = (ClickSource) payloadHandler$showDialog$2.L$1;
                    jw40 jw40Var3 = (jw40) payloadHandler$showDialog$2.L$0;
                    kotlin.b.b(obj);
                    clickSource2 = clickSource3;
                    jw40Var2 = jw40Var3;
                    a = obj;
                }
                zejVar = (zej) a;
                if (!(zejVar instanceof yej)) {
                    nr nrVar = jw40Var2.c.c;
                    if (nrVar != null) {
                        payloadHandler$showDialog$2.L$0 = null;
                        payloadHandler$showDialog$2.L$1 = null;
                        payloadHandler$showDialog$2.L$2 = null;
                        payloadHandler$showDialog$2.L$3 = null;
                        payloadHandler$showDialog$2.I$0 = 0;
                        payloadHandler$showDialog$2.label = 2;
                    }
                    return zy11.a;
                }
                if ((zejVar instanceof wej) && (kw40Var = jw40Var2.d) != null && (r1 = kw40Var.c) != null) {
                    payloadHandler$showDialog$2.L$0 = null;
                    payloadHandler$showDialog$2.L$1 = null;
                    payloadHandler$showDialog$2.L$2 = null;
                    payloadHandler$showDialog$2.L$3 = null;
                    payloadHandler$showDialog$2.I$0 = 0;
                    payloadHandler$showDialog$2.label = 3;
                }
                return zy11.a;
            }
        }
        payloadHandler$showDialog$2 = new PayloadHandler$showDialog$2(this, continuationImpl);
        Object obj3 = payloadHandler$showDialog$2.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = payloadHandler$showDialog$2.label;
        if (i != 0) {
        }
        zejVar = (zej) a;
        if (!(zejVar instanceof yej)) {
        }
    }
}
