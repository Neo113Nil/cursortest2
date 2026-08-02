package defpackage;

import android.content.Context;
import android.content.Intent;
import com.yandex.passport.sloth.ui.dependencies.m;
import com.yandex.plus.pay.internal.di.e;
import com.yandex.plus.pay.internal.di.i;
import com.yandex.plus.pay.internal.di.o;
import java.util.ArrayList;
import java.util.List;
import ru.yandex.music.catalog.album.screen.AlbumScreenActivity;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.d;

/* loaded from: classes3.dex */
public final class ie5 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;
    public final Object p;
    public final Object q;
    public final Object r;
    public final Object s;

    public ie5(cq4 cq4Var, rbj rbjVar, Intent intent, kxi kxiVar) {
        intent.getClass();
        this.a = cq4Var;
        Boolean bool = Boolean.FALSE;
        this.b = ydr.a(bool);
        this.c = ydr.a(0);
        this.e = new j0q();
        this.d = ydr.a(bool);
        this.f = new j0q();
        this.g = new j0q();
        this.h = new j0q();
        l18 l18Var = l18.b;
        bdt I = hag.I(xbj.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        xbj xbjVar = (xbj) qdcVar.C(I);
        this.k = xbjVar;
        int i = AlbumScreenActivity.v0;
        PlaybackScope b = d.b(rbjVar.b, rbjVar.c);
        int i2 = np2.u;
        yzk yzkVar = new yzk(cq4Var, sj2.w(intent, b), kxiVar);
        this.l = yzkVar;
        l13 l13Var = xbjVar.a;
        this.m = new jtc((ms) l13Var.a.D(hag.I(ms.class), l13Var, l13Var.b), (ay) l13Var.a.D(hag.I(ay.class), l13Var, l13Var.b));
        bdt I2 = hag.I(vka.class);
        qdc qdcVar2 = l18Var.a;
        qdcVar2.getClass();
        m a = ((vka) qdcVar2.C(I2)).a(cq4Var);
        this.n = a;
        bdt I3 = hag.I(z3g.class);
        qdc qdcVar3 = l18Var.a;
        qdcVar3.getClass();
        this.o = (z3g) qdcVar3.C(I3);
        this.p = new vxr((Context) l13Var.a.D(hag.I(Context.class), l13Var, l13Var.b), (z66) l13Var.a.D(hag.I(z66.class), l13Var, l13Var.b));
        this.q = (a68) l13Var.a.D(hag.I(a68.class), l13Var, l13Var.b);
        this.r = zsd.F0(yzkVar.d(), cq4Var, lbq.a, bool);
        this.i = yzkVar.c();
        this.s = sk3.a0(cq4Var, new d64((fkn) a.j, 11));
        this.j = (j0q) a.k;
        x97.y(cq4Var, null, null, new de5(this, null, 0), 3);
    }

    public pnb a() {
        return (pnb) ((jyr) this.d).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(String str, cg6 cg6Var) {
        ee5 ee5Var;
        int i;
        boolean isEmpty;
        if (cg6Var instanceof ee5) {
            ee5Var = (ee5) cg6Var;
            int i2 = ee5Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ee5Var.l = i2 - Integer.MIN_VALUE;
                Object obj = ee5Var.j;
                nm6 nm6Var = nm6.a;
                i = ee5Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    jtc jtcVar = (jtc) this.m;
                    ee5Var.l = 1;
                    obj = jtcVar.A(str, ee5Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                List list = (List) obj;
                isEmpty = list.isEmpty();
                if (!isEmpty) {
                    return dcj.a;
                }
                if (isEmpty) {
                    b6e.s();
                    return null;
                }
                List<px> list2 = list;
                ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                for (px pxVar : list2) {
                    pxVar.getClass();
                    String str2 = pxVar.c;
                    String str3 = pxVar.d;
                    ArrayList<oq> arrayList2 = pxVar.e;
                    ArrayList arrayList3 = new ArrayList(v75.o(arrayList2, 10));
                    for (oq oqVar : arrayList2) {
                        oqVar.getClass();
                        v1g v1gVar = new v1g(oqVar.b, vz1.w(oqVar.D.a), oqVar.i(), qo6.g);
                        l18 l18Var = l18.b;
                        bdt I = hag.I(k8w.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        arrayList3.add(new f9j(oqVar, new x1g(v1gVar, ((m8w) ((k8w) qdcVar.C(I))).a(oqVar))));
                    }
                    arrayList.add(new tx(str2, str3, arrayList3));
                }
                return new ccj(arrayList);
            }
        }
        ee5Var = new ee5(this, cg6Var);
        Object obj2 = ee5Var.j;
        nm6 nm6Var2 = nm6.a;
        i = ee5Var.l;
        if (i != 0) {
        }
        List list3 = (List) obj2;
        isEmpty = list3.isEmpty();
        if (!isEmpty) {
        }
    }

    public void c() {
        x97.y((cq4) this.a, null, null, new de5(this, null, 1), 3);
    }

    public void d(kv4 kv4Var) {
        String t = weo.t();
        Object obj = (Boolean) ((fkn) this.r).a.getValue();
        obj.getClass();
        ((yzk) this.l).h(t);
        kv4Var.invoke(obj, t);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e(cg6 cg6Var) {
        fe5 fe5Var;
        int i;
        xdr xdrVar = (xdr) this.d;
        if (cg6Var instanceof fe5) {
            fe5Var = (fe5) cg6Var;
            int i2 = fe5Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fe5Var.l = i2 - Integer.MIN_VALUE;
                Object obj = fe5Var.j;
                nm6 nm6Var = nm6.a;
                i = fe5Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Boolean bool = Boolean.TRUE;
                    xdrVar.getClass();
                    xdrVar.m(null, bool);
                    vxr vxrVar = (vxr) this.p;
                    fe5Var.l = 1;
                    obj = vxrVar.a(fe5Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                txr txrVar = (txr) obj;
                Boolean bool2 = Boolean.FALSE;
                xdrVar.getClass();
                xdrVar.m(null, bool2);
                return txrVar;
            }
        }
        fe5Var = new fe5(this, cg6Var);
        Object obj2 = fe5Var.j;
        nm6 nm6Var2 = nm6.a;
        i = fe5Var.l;
        if (i != 0) {
        }
        txr txrVar2 = (txr) obj2;
        Boolean bool22 = Boolean.FALSE;
        xdrVar.getClass();
        xdrVar.m(null, bool22);
        return txrVar2;
    }

    public void f() {
        x97.y((cq4) this.a, null, null, new ge5(this, j66.j0(), null, 1), 3);
    }

    public ie5(i iVar, e eVar, jk6 jk6Var) {
        this.a = iVar;
        this.b = eVar;
        this.c = jk6Var;
        this.d = btf.b(new o(this, 0));
        this.e = btf.b(new o(this, 15));
        this.f = btf.b(new o(this, 16));
        this.g = btf.b(new o(this, 17));
        this.h = btf.b(new o(this, 1));
        this.i = btf.b(new o(this, 2));
        this.j = btf.b(new o(this, 3));
        this.k = btf.b(new o(this, 4));
        this.l = btf.b(new o(this, 5));
        this.m = btf.b(new o(this, 6));
        this.n = btf.b(new o(this, 9));
        this.o = btf.b(new o(this, 10));
        this.p = btf.b(new o(this, 11));
        this.q = btf.b(new o(this, 12));
        this.r = btf.b(new o(this, 13));
        this.s = btf.b(new o(this, 14));
    }
}
