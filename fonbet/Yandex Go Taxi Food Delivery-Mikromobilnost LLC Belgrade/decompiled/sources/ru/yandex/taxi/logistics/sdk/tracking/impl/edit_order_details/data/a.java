package ru.yandex.taxi.logistics.sdk.tracking.impl.edit_order_details.data;

import com.yandex.delivery.mapper.model.PointType;
import defpackage.a0t;
import defpackage.bvf0;
import defpackage.cqi;
import defpackage.cyq;
import defpackage.dnn;
import defpackage.dyq;
import defpackage.e0l0;
import defpackage.elb0;
import defpackage.erv;
import defpackage.eyq;
import defpackage.f4l0;
import defpackage.fyq;
import defpackage.g8l0;
import defpackage.gri;
import defpackage.gyq;
import defpackage.hyq;
import defpackage.kkb0;
import defpackage.nkb0;
import defpackage.oo0;
import defpackage.qv0;
import defpackage.s9e;
import defpackage.scc;
import defpackage.st2;
import defpackage.t701;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tpr;
import defpackage.w511;
import defpackage.wqi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e;

/* loaded from: classes5.dex */
public final class a implements f4l0 {
    public final elb0 a;
    public final r0 b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v1, types: [fse, kotlin.coroutines.Continuation, kotlinx.coroutines.CoroutineStart] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    public a(e eVar, st2 st2Var, elb0 elb0Var) {
        Object value;
        gri griVar;
        this.a = elb0Var;
        ?? r2 = EmptyList.a;
        this.b = bvf0.c(new e0l0(r2));
        Object value2 = eVar.e.a.getValue();
        Throwable th = null;
        t701 t701Var = value2 instanceof t701 ? (t701) value2 : null;
        if (t701Var != null && (griVar = t701Var.a) != null) {
            List list = griVar.c;
            r2 = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof wqi) {
                    r2.add(obj);
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj2 : (Iterable) r2) {
            int i2 = i + 1;
            if (i < 0) {
                Throwable th2 = th;
                scc.m();
                throw th2;
            }
            wqi wqiVar = (wqi) obj2;
            List<nkb0> list2 = wqiVar.q;
            ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
            for (nkb0 nkb0Var : list2) {
                arrayList2.add(new kkb0(nkb0Var.a, nkb0Var.b));
            }
            linkedHashMap.put(new erv(i), arrayList2);
            String str = wqiVar.a;
            String str2 = wqiVar.g;
            PointType pointType = wqiVar.d;
            int i3 = dnn.a[pointType.ordinal()];
            if (i3 != 1) {
                if (i3 != 2 && i3 != 3 && i3 != 4) {
                    w511.b();
                    throw th;
                }
                pointType = PointType.DESTINATION;
            }
            String str3 = wqiVar.e;
            String str4 = wqiVar.i;
            String str5 = wqiVar.g;
            Throwable th3 = th;
            double d = wqiVar.f.a;
            oo0 oo0Var = new oo0(str2, pointType, str3, str4, str5, new a0t(d, d, 0.0d), (String) null, 192);
            String str6 = wqiVar.j;
            ?? r5 = "";
            String str7 = str6 == null ? "" : str6;
            String str8 = wqiVar.l;
            String str9 = str8 == null ? "" : str8;
            String str10 = wqiVar.k;
            String str11 = str10 == null ? "" : str10;
            String str12 = wqiVar.o;
            String str13 = str12 == null ? "" : str12;
            String str14 = wqiVar.m;
            String str15 = str14 == null ? "" : str14;
            cqi cqiVar = wqiVar.n;
            String str16 = cqiVar != null ? cqiVar.a : th3;
            str16 = str16 == 0 ? "" : str16;
            Object obj3 = cqiVar != null ? cqiVar.b : th3;
            if (obj3 != null) {
                r5 = obj3;
            }
            arrayList.add(new qv0(oo0Var, str7, str9, str11, str13, str15, new s9e(str16, r5), arrayList2, str));
            th = th3;
            i = i2;
        }
        ?? r24 = th;
        r0 r0Var = this.b;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, new e0l0(arrayList)));
        this.a.c(linkedHashMap);
        tje.N(bvf0.a(st2Var.c), r24, r24, new EditOrderDetailsRouteInfoProviderImpl$1(this, r24), 3);
    }

    @Override // defpackage.f4l0
    public final void a(int i, int i2) {
        r0 r0Var;
        Object value;
        e0l0 e0l0Var;
        ArrayList arrayList;
        do {
            r0Var = this.b;
            value = r0Var.getValue();
            e0l0Var = (e0l0) value;
            arrayList = new ArrayList(kotlin.collections.a.J(e0l0Var.a, 1));
            if (arrayList.size() < 2) {
                return;
            } else {
                arrayList.add(i, arrayList.remove(i2));
            }
        } while (!r0Var.k(value, new e0l0(kotlin.collections.a.m0(arrayList, Collections.singletonList(kotlin.collections.a.P(e0l0Var.a))))));
    }

    @Override // defpackage.f4l0
    public final void b(g8l0 g8l0Var, g8l0 g8l0Var2) {
    }

    @Override // defpackage.f4l0
    public final void c(hyq hyqVar, String str, int i) {
        r0 r0Var;
        Object value;
        qv0 a;
        ArrayList arrayList;
        do {
            r0Var = this.b;
            value = r0Var.getValue();
            e0l0 e0l0Var = (e0l0) value;
            qv0 qv0Var = (qv0) kotlin.collections.a.S(i, e0l0Var.a);
            if (qv0Var == null) {
                return;
            }
            if (hyqVar instanceof gyq) {
                a = qv0.a(qv0Var, str, null, null, null, null, null, null, 509);
            } else if (hyqVar instanceof fyq) {
                a = qv0.a(qv0Var, null, null, str, null, null, null, null, 503);
            } else if (hyqVar instanceof dyq) {
                a = qv0.a(qv0Var, null, null, null, str, null, null, null, 495);
            } else if (hyqVar instanceof cyq) {
                a = qv0.a(qv0Var, null, str, null, null, null, null, null, 507);
            } else {
                if (!(hyqVar instanceof eyq)) {
                    w511.b();
                    return;
                }
                a = qv0.a(qv0Var, null, null, null, null, str, null, null, 479);
            }
            arrayList = new ArrayList(e0l0Var.a);
            arrayList.set(i, a);
        } while (!r0Var.k(value, new e0l0(arrayList)));
    }

    @Override // defpackage.f4l0
    public final tpr d() {
        return kotlinx.coroutines.flow.e.d(this.b);
    }

    @Override // defpackage.f4l0
    public final void e(int i, s9e s9eVar) {
        while (true) {
            r0 r0Var = this.b;
            Object value = r0Var.getValue();
            e0l0 e0l0Var = (e0l0) value;
            qv0 qv0Var = (qv0) kotlin.collections.a.S(i, e0l0Var.a);
            if (qv0Var == null) {
                return;
            }
            s9e s9eVar2 = s9eVar;
            qv0 a = qv0.a(qv0Var, null, null, null, null, null, s9eVar2, null, 447);
            ArrayList arrayList = new ArrayList(e0l0Var.a);
            arrayList.set(i, a);
            if (r0Var.k(value, new e0l0(arrayList))) {
                return;
            } else {
                s9eVar = s9eVar2;
            }
        }
    }

    @Override // defpackage.f4l0
    public final void f(int i, s9e s9eVar, String str, String str2, String str3, String str4, String str5, List list) {
        if (s9eVar != null) {
            e(i, s9eVar);
        }
        if (str != null) {
            c(fyq.a, str, i);
        }
        if (str2 != null) {
            c(cyq.a, str2, i);
        }
        if (str3 != null) {
            c(eyq.a, str3, i);
        }
        if (str4 != null) {
            c(gyq.a, str4, i);
        }
        if (str5 != null) {
            c(dyq.a, str5, i);
        }
        if (list != null) {
            List<nkb0> list2 = list;
            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
            for (nkb0 nkb0Var : list2) {
                arrayList.add(new kkb0(nkb0Var.a, nkb0Var.b));
            }
            elb0 elb0Var = this.a;
            LinkedHashMap linkedHashMap = new LinkedHashMap((Map) elb0Var.a().a.getValue());
            linkedHashMap.put(new erv(i), arrayList);
            elb0Var.c(linkedHashMap);
        }
    }

    @Override // defpackage.f4l0
    public final void g(int i) {
        r0 r0Var;
        Object value;
        ArrayList arrayList;
        do {
            r0Var = this.b;
            value = r0Var.getValue();
            arrayList = new ArrayList(((e0l0) value).a);
            arrayList.remove(i);
        } while (!r0Var.k(value, new e0l0(arrayList)));
    }

    @Override // defpackage.f4l0
    public final e0l0 getRoute() {
        return (e0l0) this.b.getValue();
    }
}
