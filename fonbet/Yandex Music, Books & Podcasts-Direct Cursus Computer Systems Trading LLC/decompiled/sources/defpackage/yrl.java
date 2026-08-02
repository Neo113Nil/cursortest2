package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.e;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes3.dex */
public final class yrl {
    public final cvl a;
    public final List b;
    public final vrl c;
    public final qe3 d;
    public final wrl e;
    public final Context f;
    public final xdr g;
    public final jyr h;

    public yrl(cvl cvlVar, List list, vrl vrlVar, qe3 qe3Var, wrl wrlVar, Context context, mm6 mm6Var) {
        cvlVar.getClass();
        context.getClass();
        this.a = cvlVar;
        this.b = list;
        this.c = vrlVar;
        this.d = qe3Var;
        this.e = wrlVar;
        this.f = context;
        this.g = ydr.a(asl.a);
        this.h = btf.b(new ril(11, this));
        x97.y(mm6Var, dm6.b, null, new st7(mm6Var, this, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(yrl yrlVar, cg6 cg6Var) {
        xrl xrlVar;
        Object obj;
        nm6 nm6Var;
        int i;
        String str;
        String str2;
        String str3;
        long j;
        vrl vrlVar = yrlVar.c;
        cvl cvlVar = yrlVar.a;
        if (cg6Var instanceof xrl) {
            xrlVar = (xrl) cg6Var;
            int i2 = xrlVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xrlVar.o = i2 - Integer.MIN_VALUE;
                obj = xrlVar.m;
                nm6Var = nm6.a;
                i = xrlVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    cvlVar.getClass();
                    if ("414787002:1076".equals(cvlVar.e()) || cvlVar.g <= 0 || !((z66) vrlVar.k.getValue()).f()) {
                        return null;
                    }
                    String str4 = cvlVar.b;
                    String str5 = ((zrl) vrlVar.n.getValue()).a;
                    CoverPath coverPath = op7.c(cvlVar).a;
                    xrlVar.j = str4;
                    xrlVar.k = str5;
                    xrlVar.o = 1;
                    Object t = h4a.t(ouj.t(coverPath), yrlVar.f, (cce) vrlVar.h.getValue(), true, xrlVar);
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
                    long j2 = xrlVar.l;
                    str2 = xrlVar.k;
                    String str6 = xrlVar.j;
                    qgg.h0(obj);
                    j = j2;
                    str3 = str6;
                    return new lnu(str3, str2, j, (amu) obj, null, null, null, null, 240);
                }
                str2 = xrlVar.k;
                str = xrlVar.j;
                qgg.h0(obj);
                d85 d85Var = (d85) obj;
                long j3 = d85Var == null ? d85Var.a : oa5.a;
                dy6 dy6Var = (dy6) vrlVar.o.getValue();
                xrlVar.j = str;
                xrlVar.k = str2;
                xrlVar.l = j3;
                xrlVar.o = 2;
                obj = dy6Var.a(xrlVar);
                if (obj != nm6Var) {
                    str3 = str;
                    j = j3;
                    return new lnu(str3, str2, j, (amu) obj, null, null, null, null, 240);
                }
                return nm6Var;
            }
        }
        xrlVar = new xrl(yrlVar, cg6Var);
        obj = xrlVar.m;
        nm6Var = nm6.a;
        i = xrlVar.o;
        if (i != 0) {
        }
        d85 d85Var2 = (d85) obj;
        if (d85Var2 == null) {
        }
        dy6 dy6Var2 = (dy6) vrlVar.o.getValue();
        xrlVar.j = str;
        xrlVar.k = str2;
        xrlVar.l = j3;
        xrlVar.o = 2;
        obj = dy6Var2.a(xrlVar);
        if (obj != nm6Var) {
        }
        return nm6Var;
    }

    public final twu b(mm6 mm6Var) {
        StationId k = StationId.k(this.a);
        k.getClass();
        n7b n7bVar = new n7b(this);
        kxi kxiVar = this.d.a;
        vrl vrlVar = this.c;
        return wyf.T(k, mm6Var, kxiVar, new iik(14, this, k), (k6l) vrlVar.p.getValue(), (uwu) vrlVar.q.getValue(), (qwu) vrlVar.r.getValue(), n7bVar, 768);
    }

    public final List c(String str) {
        kxi kxiVar = this.d.a;
        List list = this.b;
        if (list == null) {
            return c5b.a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((mqs) obj).k == dg2.b) {
                arrayList.add(obj);
            }
        }
        vrl vrlVar = this.c;
        e eVar = (e) vrlVar.s.getValue();
        PlaybackScope playbackScope = vrlVar.e;
        cvl cvlVar = vrlVar.a;
        eVar.getClass();
        String a = e.f(playbackScope, cvlVar).a();
        gxc gxcVar = new gxc(kxiVar.a.G(), str);
        b6v w0 = y5g.w0(this.a);
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new jzs((mqs) it.next(), new v80(a, gxcVar, kxiVar.b), null, null, null, null, w0, false));
        }
        return arrayList2;
    }
}
