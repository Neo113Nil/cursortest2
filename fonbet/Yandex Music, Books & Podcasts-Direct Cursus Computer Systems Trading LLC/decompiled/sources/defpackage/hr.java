package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes3.dex */
public final class hr {
    public final oq a;
    public final br b;
    public final qe3 c;
    public final cr d;
    public final Context e;
    public final xdr f;
    public final jyr g;
    public final jyr h;
    public final jyr i;

    public hr(oq oqVar, br brVar, qe3 qe3Var, cr crVar, Context context, mm6 mm6Var) {
        oqVar.getClass();
        this.a = oqVar;
        this.b = brVar;
        this.c = qe3Var;
        this.d = crVar;
        this.e = context;
        this.f = ydr.a(jr.a);
        final int i = 0;
        this.g = btf.b(new Function0(this) { // from class: dr
            public final /* synthetic */ hr b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        hr hrVar = this.b;
                        oq oqVar2 = hrVar.a;
                        br brVar2 = hrVar.b;
                        return new g10(oqVar2, (p0t) brVar2.f.getValue(), (lwc) brVar2.i.getValue(), (f7l) brVar2.j.getValue());
                    case 1:
                        hr hrVar2 = this.b;
                        br brVar3 = hrVar2.b;
                        return new h10((f7l) brVar3.j.getValue(), (k1l) brVar3.k.getValue(), (k1l) brVar3.l.getValue(), hrVar2.c.a, new c3(0, brVar3, br.class, "generateFrom", "generateFrom()Ljava/lang/String;", 0, 15));
                    default:
                        LinkedList linkedList = this.b.a.F;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : linkedList) {
                            if (((mqs) obj).k == dg2.b) {
                                arrayList.add(obj);
                            }
                        }
                        return arrayList;
                }
            }
        });
        final int i2 = 1;
        this.h = btf.b(new Function0(this) { // from class: dr
            public final /* synthetic */ hr b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        hr hrVar = this.b;
                        oq oqVar2 = hrVar.a;
                        br brVar2 = hrVar.b;
                        return new g10(oqVar2, (p0t) brVar2.f.getValue(), (lwc) brVar2.i.getValue(), (f7l) brVar2.j.getValue());
                    case 1:
                        hr hrVar2 = this.b;
                        br brVar3 = hrVar2.b;
                        return new h10((f7l) brVar3.j.getValue(), (k1l) brVar3.k.getValue(), (k1l) brVar3.l.getValue(), hrVar2.c.a, new c3(0, brVar3, br.class, "generateFrom", "generateFrom()Ljava/lang/String;", 0, 15));
                    default:
                        LinkedList linkedList = this.b.a.F;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : linkedList) {
                            if (((mqs) obj).k == dg2.b) {
                                arrayList.add(obj);
                            }
                        }
                        return arrayList;
                }
            }
        });
        final int i3 = 2;
        this.i = btf.b(new Function0(this) { // from class: dr
            public final /* synthetic */ hr b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        hr hrVar = this.b;
                        oq oqVar2 = hrVar.a;
                        br brVar2 = hrVar.b;
                        return new g10(oqVar2, (p0t) brVar2.f.getValue(), (lwc) brVar2.i.getValue(), (f7l) brVar2.j.getValue());
                    case 1:
                        hr hrVar2 = this.b;
                        br brVar3 = hrVar2.b;
                        return new h10((f7l) brVar3.j.getValue(), (k1l) brVar3.k.getValue(), (k1l) brVar3.l.getValue(), hrVar2.c.a, new c3(0, brVar3, br.class, "generateFrom", "generateFrom()Ljava/lang/String;", 0, 15));
                    default:
                        LinkedList linkedList = this.b.a.F;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : linkedList) {
                            if (((mqs) obj).k == dg2.b) {
                                arrayList.add(obj);
                            }
                        }
                        return arrayList;
                }
            }
        });
        x97.y(mm6Var, dm6.b, null, new er(mm6Var, this, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007e -> B:10:0x0081). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(hr hrVar, cg6 cg6Var) {
        fr frVar;
        int i;
        int i2;
        Iterator it;
        Collection collection;
        int i3;
        int i4;
        String str;
        if (cg6Var instanceof fr) {
            frVar = (fr) cg6Var;
            int i5 = frVar.q;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                frVar.q = i5 - Integer.MIN_VALUE;
                Object obj = frVar.o;
                nm6 nm6Var = nm6.a;
                i = frVar.q;
                if (i != 0) {
                    qgg.h0(obj);
                    ArrayList m = lxe.m(hrVar.a.h());
                    ArrayList arrayList = new ArrayList();
                    i2 = 0;
                    it = m.iterator();
                    collection = arrayList;
                    i3 = 0;
                    i4 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = frVar.n;
                    i2 = frVar.m;
                    i4 = frVar.l;
                    it = frVar.k;
                    collection = frVar.j;
                    qgg.h0(obj);
                    a58 a58Var = (a58) obj;
                    String str2 = (a58Var != null || (str = a58Var.d) == null) ? null : (String) avf.Q(str);
                    if (str2 != null) {
                        collection.add(str2);
                    }
                    if (it.hasNext()) {
                        hs5 hs5Var = (hs5) it.next();
                        k68 k68Var = (k68) hrVar.b.n.getValue();
                        frVar.j = collection;
                        frVar.k = it;
                        frVar.l = i4;
                        frVar.m = i2;
                        frVar.n = i3;
                        frVar.q = 1;
                        obj = k68Var.a(hs5Var, frVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        a58 a58Var2 = (a58) obj;
                        if (a58Var2 != null) {
                        }
                        if (str2 != null) {
                        }
                        if (it.hasNext()) {
                            return (List) collection;
                        }
                    }
                }
            }
        }
        frVar = new fr(hrVar, cg6Var);
        Object obj2 = frVar.o;
        nm6 nm6Var2 = nm6.a;
        i = frVar.q;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(hr hrVar, cg6 cg6Var) {
        gr grVar;
        Object obj;
        nm6 nm6Var;
        int i;
        String str;
        String str2;
        String str3;
        long j;
        br brVar = hrVar.b;
        oq oqVar = hrVar.a;
        if (cg6Var instanceof gr) {
            grVar = (gr) cg6Var;
            int i2 = grVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                grVar.o = i2 - Integer.MIN_VALUE;
                obj = grVar.m;
                nm6Var = nm6.a;
                i = grVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    oqVar.getClass();
                    if (u2x.M(oqVar.j) || !oqVar.d || oqVar.l <= 0 || !((z66) brVar.h.getValue()).f()) {
                        return null;
                    }
                    String str4 = oqVar.b;
                    String str5 = ((ir) brVar.m.getValue()).a;
                    CoverPath coverPath = oqVar.o;
                    grVar.j = str4;
                    grVar.k = str5;
                    grVar.o = 1;
                    Object t = h4a.t(ouj.t(coverPath), hrVar.e, (cce) brVar.g.getValue(), true, grVar);
                    if (t != nm6Var) {
                        str = str4;
                        obj = t;
                        str2 = str5;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j2 = grVar.l;
                    str2 = grVar.k;
                    String str6 = grVar.j;
                    qgg.h0(obj);
                    j = j2;
                    str3 = str6;
                    return new lnu(str3, str2, j, (amu) obj, null, null, null, null, 240);
                }
                str2 = grVar.k;
                str = grVar.j;
                qgg.h0(obj);
                d85 d85Var = (d85) obj;
                long j3 = d85Var == null ? d85Var.a : oa5.a;
                dy6 dy6Var = (dy6) brVar.o.getValue();
                grVar.j = str;
                grVar.k = str2;
                grVar.l = j3;
                grVar.o = 2;
                obj = dy6Var.a(grVar);
                if (obj != nm6Var) {
                    str3 = str;
                    j = j3;
                    return new lnu(str3, str2, j, (amu) obj, null, null, null, null, 240);
                }
                return nm6Var;
            }
        }
        grVar = new gr(hrVar, cg6Var);
        obj = grVar.m;
        nm6Var = nm6.a;
        i = grVar.o;
        if (i != 0) {
        }
        d85 d85Var2 = (d85) obj;
        if (d85Var2 == null) {
        }
        dy6 dy6Var2 = (dy6) brVar.o.getValue();
        grVar.j = str;
        grVar.k = str2;
        grVar.l = j3;
        grVar.o = 2;
        obj = dy6Var2.a(grVar);
        if (obj != nm6Var) {
        }
        return nm6Var;
    }

    public final twu c(mm6 mm6Var) {
        StationId stationId = StationId.a;
        StationId a = StationId.a(this.a.a);
        a.getClass();
        xzi xziVar = new xzi(this);
        kxi kxiVar = this.c.a;
        br brVar = this.b;
        return wyf.T(a, mm6Var, kxiVar, new hb(5, this, a), (k6l) brVar.p.getValue(), (uwu) brVar.q.getValue(), (qwu) brVar.r.getValue(), xziVar, 768);
    }
}
