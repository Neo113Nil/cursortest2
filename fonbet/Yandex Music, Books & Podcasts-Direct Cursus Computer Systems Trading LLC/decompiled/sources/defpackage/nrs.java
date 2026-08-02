package defpackage;

import android.content.Context;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes3.dex */
public final class nrs {
    public final mqs a;
    public final irs b;
    public final qe3 c;
    public final jrs d;
    public final kxi e;
    public final Context f;
    public final boolean g;
    public final xdr h;

    public nrs(mqs mqsVar, irs irsVar, qe3 qe3Var, jrs jrsVar, kxi kxiVar, Context context, mm6 mm6Var, boolean z) {
        mqsVar.getClass();
        kxiVar.getClass();
        this.a = mqsVar;
        this.b = irsVar;
        this.c = qe3Var;
        this.d = jrsVar;
        this.e = kxiVar;
        this.f = context;
        this.g = z;
        this.h = ydr.a(prs.a);
        x97.y(mm6Var, dm6.b, null, new v0r(mm6Var, this, null, 27), 2);
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
    public static final Object a(nrs nrsVar, cg6 cg6Var) {
        lrs lrsVar;
        int i;
        int i2;
        Iterator it;
        Collection collection;
        int i3;
        int i4;
        String str;
        if (cg6Var instanceof lrs) {
            lrsVar = (lrs) cg6Var;
            int i5 = lrsVar.q;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                lrsVar.q = i5 - Integer.MIN_VALUE;
                Object obj = lrsVar.o;
                nm6 nm6Var = nm6.a;
                i = lrsVar.q;
                if (i != 0) {
                    qgg.h0(obj);
                    ArrayList m = lxe.m(nrsVar.a.h());
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
                    i3 = lrsVar.n;
                    i2 = lrsVar.m;
                    i4 = lrsVar.l;
                    it = lrsVar.k;
                    collection = lrsVar.j;
                    qgg.h0(obj);
                    a58 a58Var = (a58) obj;
                    String str2 = (a58Var != null || (str = a58Var.d) == null) ? null : (String) avf.Q(str);
                    if (str2 != null) {
                        collection.add(str2);
                    }
                    if (it.hasNext()) {
                        hs5 hs5Var = (hs5) it.next();
                        k68 k68Var = (k68) nrsVar.b.x.getValue();
                        lrsVar.j = collection;
                        lrsVar.k = it;
                        lrsVar.l = i4;
                        lrsVar.m = i2;
                        lrsVar.n = i3;
                        lrsVar.q = 1;
                        obj = k68Var.a(hs5Var, lrsVar);
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
        lrsVar = new lrs(nrsVar, cg6Var);
        Object obj2 = lrsVar.o;
        nm6 nm6Var2 = nm6.a;
        i = lrsVar.q;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(nrs nrsVar, cg6 cg6Var) {
        mrs mrsVar;
        nm6 nm6Var;
        int i;
        String str;
        String str2;
        String str3;
        d85 d85Var;
        Object a;
        String str4;
        long j;
        irs irsVar = nrsVar.b;
        mqs mqsVar = nrsVar.a;
        if (cg6Var instanceof mrs) {
            mrsVar = (mrs) cg6Var;
            int i2 = mrsVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mrsVar.o = i2 - Integer.MIN_VALUE;
                Object obj = mrsVar.m;
                nm6Var = nm6.a;
                i = mrsVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    if (u2x.K(mqsVar.d) || a4g.D(gys.AudioBookHolder, mqsVar) || mqsVar.C() || mqsVar.k != dg2.b || !irsVar.m().f()) {
                        return null;
                    }
                    str = mqsVar.c;
                    String str5 = ((ors) irsVar.s.getValue()).a;
                    if (!nrsVar.g) {
                        CoverPath coverPath = mqsVar.x0.a;
                        mrsVar.j = str;
                        mrsVar.k = str5;
                        mrsVar.o = 1;
                        Object t = h4a.t(ouj.t(coverPath), nrsVar.f, (cce) irsVar.q.getValue(), true, mrsVar);
                        if (t != nm6Var) {
                            str2 = str;
                            obj = t;
                            str3 = str5;
                        }
                        return nm6Var;
                    }
                    Integer R = pd.R(mqsVar.f().a);
                    d85Var = R != null ? new d85(c3x.f(R.intValue())) : null;
                    str3 = str5;
                    long j2 = d85Var != null ? d85Var.a : oa5.a;
                    dy6 dy6Var = (dy6) irsVar.t.getValue();
                    mrsVar.j = str;
                    mrsVar.k = str3;
                    mrsVar.l = j2;
                    mrsVar.o = 2;
                    a = dy6Var.a(mrsVar);
                    if (a != nm6Var) {
                        str4 = str;
                        obj = a;
                        j = j2;
                        return new lnu(str4, str3, j, (amu) obj, null, null, null, null, 240);
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j3 = mrsVar.l;
                    str3 = mrsVar.k;
                    String str6 = mrsVar.j;
                    qgg.h0(obj);
                    j = j3;
                    str4 = str6;
                    return new lnu(str4, str3, j, (amu) obj, null, null, null, null, 240);
                }
                str3 = mrsVar.k;
                str2 = mrsVar.j;
                qgg.h0(obj);
                d85Var = (d85) obj;
                str = str2;
                if (d85Var != null) {
                }
                dy6 dy6Var2 = (dy6) irsVar.t.getValue();
                mrsVar.j = str;
                mrsVar.k = str3;
                mrsVar.l = j2;
                mrsVar.o = 2;
                a = dy6Var2.a(mrsVar);
                if (a != nm6Var) {
                }
                return nm6Var;
            }
        }
        mrsVar = new mrs(nrsVar, cg6Var);
        Object obj2 = mrsVar.m;
        nm6Var = nm6.a;
        i = mrsVar.o;
        if (i != 0) {
        }
        d85Var = (d85) obj2;
        str = str2;
        if (d85Var != null) {
        }
        dy6 dy6Var22 = (dy6) irsVar.t.getValue();
        mrsVar.j = str;
        mrsVar.k = str3;
        mrsVar.l = j2;
        mrsVar.o = 2;
        a = dy6Var22.a(mrsVar);
        if (a != nm6Var) {
        }
        return nm6Var;
    }

    public final swu c(mm6 mm6Var) {
        mqs mqsVar = this.a;
        StationId o = StationId.o(mqsVar.a);
        rr5 d = mqsVar.d();
        kpm kpmVar = new kpm(14, this);
        xes xesVar = new xes(5, this, o);
        irs irsVar = this.b;
        k6l k6lVar = (k6l) irsVar.u.getValue();
        uwu uwuVar = (uwu) irsVar.v.getValue();
        zy7 zy7Var = (zy7) irsVar.w.getValue();
        kxi kxiVar = this.e;
        kxiVar.getClass();
        k6lVar.getClass();
        uwuVar.getClass();
        zy7Var.getClass();
        return new swu(d, kxiVar, xesVar, k6lVar, uwuVar, zy7Var, kpmVar, mm6Var);
    }

    public final void d() {
        this.c.b(wjb.AlbumScreen);
        jrs jrsVar = this.d;
        Context context = jrsVar.b;
        mqs mqsVar = this.a;
        mqsVar.getClass();
        jrsVar.dismiss();
        if (mqsVar.k != dg2.c || ((m8w) ((k8w) jrsVar.e.getValue())).b(mqsVar)) {
            Parcelable.Creator<oq> creator = oq.CREATOR;
            context.startActivity(quj.T(context, cxb.O(mqsVar), jrsVar.c));
        } else {
            context.getClass();
            hag.x(context, R.string.track_no_rights_title, 0);
        }
    }
}
