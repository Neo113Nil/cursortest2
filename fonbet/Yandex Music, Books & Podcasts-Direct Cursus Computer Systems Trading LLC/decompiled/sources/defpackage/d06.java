package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import j$.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes3.dex */
public final class d06 extends bfu {
    public static final /* synthetic */ s9f[] y;
    public final String k;
    public final l06 l;
    public final arf m;
    public final arf n;
    public final arf o;
    public final arf p;
    public final xdr q;
    public final fkn r;
    public final xdr s;
    public final j0q t;
    public final j0q u;
    public pv5 v;
    public final jyr w;
    public final z6n x;

    static {
        opi opiVar = new opi(d06.class, "headerJob", "getHeaderJob()Lkotlinx/coroutines/Job;", 0);
        ern.a.getClass();
        y = new s9f[]{opiVar};
    }

    public d06(String str, l06 l06Var, cvo cvoVar, kxi kxiVar, e00 e00Var) {
        jyr b = e00Var.b(hag.I(uv5.class), true);
        jyr b2 = e00Var.b(hag.I(vv5.class), true);
        jyr b3 = e00Var.b(hag.I(z66.class), true);
        jyr b4 = e00Var.b(hag.I(zz5.class), true);
        str.getClass();
        cvoVar.getClass();
        kxiVar.getClass();
        e00Var.getClass();
        this.k = str;
        this.l = l06Var;
        this.m = b;
        this.n = b2;
        this.o = b3;
        this.p = b4;
        xdr a = ydr.a(wz5.a);
        this.q = a;
        this.r = new fkn(a);
        this.s = ydr.a(Boolean.FALSE);
        this.t = new j0q();
        this.u = new j0q();
        this.w = btf.b(new aw5(4, kxiVar, cvoVar));
        this.x = new z6n(7);
        G(false);
        ox6.B(zsd.b0(zsd.d0(((z66) b3.getValue()).c(), 1)), ot0.F(this), new i64(20, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d06 d06Var, boolean z, cg6 cg6Var) {
        c06 c06Var;
        int i;
        rj6 rj6Var;
        CoverPath none;
        String str;
        if (cg6Var instanceof c06) {
            c06Var = (c06) cg6Var;
            int i2 = c06Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c06Var.l = i2 - Integer.MIN_VALUE;
                Object obj = c06Var.j;
                nm6 nm6Var = nm6.a;
                i = c06Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    uv5 uv5Var = (uv5) d06Var.m.getValue();
                    String str2 = d06Var.k;
                    c06Var.l = 1;
                    obj = uv5Var.a(str2, z, c06Var);
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
                rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    if (rj6Var instanceof pj6) {
                        ssg.a(3, "ConcertScreenViewModel", "Header Load Error", null);
                        return ((rj6Var instanceof mj6) && ((mj6) rj6Var).a == 404) ? xz5.a : uz5.a;
                    }
                    b6e.s();
                    return null;
                }
                pv5 pv5Var = (pv5) ((qj6) rj6Var).a;
                d06Var.v = pv5Var;
                rmb.h((rmb) d06Var.w.getValue(), 0, 3);
                vv5 vv5Var = (vv5) d06Var.n.getValue();
                o36 o36Var = vv5Var.a;
                pv5Var.getClass();
                mu5 mu5Var = pv5Var.a;
                List list = pv5Var.c;
                u9b u9bVar = (u9b) CollectionsKt.firstOrNull(list);
                if (u9bVar != null) {
                    none = kg5.M(u9bVar, WebPath$Storage.AFISHA);
                } else {
                    none = CoverPath.none();
                    none.getClass();
                }
                String str3 = mu5Var.c;
                int i3 = mu5Var.e;
                String pathForSize = none.getPathForSize(frv.b());
                pathForSize.getClass();
                ZonedDateTime zonedDateTime = mu5Var.j;
                long f = c3x.f(i3);
                List list2 = list;
                ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(kg5.M((u9b) it.next(), WebPath$Storage.AFISHA));
                }
                boolean z2 = vv5Var.b;
                int t = wct.t();
                String str4 = mu5Var.d;
                String str5 = mu5Var.h;
                String str6 = mu5Var.g;
                WebPath$Storage webPath$Storage = WebPath$Storage.AFISHA;
                str4.getClass();
                webPath$Storage.getClass();
                String pathForSize2 = etn.B(str4, webPath$Storage).getPathForSize(t);
                pathForSize2.getClass();
                String str7 = mu5Var.c;
                long f2 = c3x.f(i3);
                String h = o36Var.h(zonedDateTime);
                String g = o36Var.g(zonedDateTime);
                String c = o36Var.c(zonedDateTime);
                String b = o36Var.b(zonedDateTime);
                String str8 = mu5Var.k;
                String str9 = mu5Var.f;
                String str10 = (str9 == null || StringsKt.U(str9)) ? null : str9;
                String str11 = (str6 == null || StringsKt.U(str6)) ? null : str6;
                String str12 = (str5 == null || StringsKt.U(str5)) ? null : str5;
                Integer num = mu5Var.i;
                StringBuilder sb = new StringBuilder();
                if (z2) {
                    sb.append(o36Var.e(mu5Var.l.d()));
                    sb.append(", ");
                }
                sb.append(mu5Var.c);
                sb.append(", ");
                sb.append(o36Var.d(zonedDateTime));
                sb.append(", ");
                sb.append(mu5Var.k);
                if (str9 != null) {
                    if (StringsKt.U(str9)) {
                        str9 = null;
                    }
                    if (str9 != null) {
                        sb.append(", ");
                        sb.append(str9);
                    }
                }
                if (str6 != null) {
                    if (StringsKt.U(str6)) {
                        str6 = null;
                    }
                    if (str6 != null) {
                        sb.append(", ");
                        sb.append(str6);
                    }
                }
                if (z2) {
                    Integer num2 = mu5Var.i;
                    if (num2 != null) {
                        int intValue = num2.intValue();
                        sb.append(", ");
                        sb.append(o36Var.f(intValue));
                    }
                } else if (str5 != null) {
                    if (StringsKt.U(str5)) {
                        str5 = null;
                    }
                    if (str5 != null) {
                        sb.append(", ");
                        sb.append(str5);
                    }
                }
                ct5 ct5Var = new ct5(pathForSize2, f2, str7, h, g, c, b, str8, str10, str11, str12, num, sb.toString(), mu5Var.l);
                String d = o36Var.d(zonedDateTime);
                uy5 uy5Var = pv5Var.b;
                String a = uy5Var != null ? o36Var.a(uy5Var, null) : null;
                String str13 = pv5Var.e;
                qv5 qv5Var = pv5Var.d;
                if (qv5Var != null) {
                    String str14 = qv5Var.a;
                    if (StringsKt.U(str14)) {
                        str14 = null;
                    }
                    if (str14 != null) {
                        str = new Regex("\n{2,}").replace(str14, StringUtil.LF);
                        return new vz5(new wv5(mu5Var, str3, pathForSize, f, arrayList, ct5Var, d, a, str13, str));
                    }
                }
                str = null;
                return new vz5(new wv5(mu5Var, str3, pathForSize, f, arrayList, ct5Var, d, a, str13, str));
            }
        }
        c06Var = new c06(d06Var, cg6Var);
        Object obj2 = c06Var.j;
        nm6 nm6Var2 = nm6.a;
        i = c06Var.l;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (rj6Var instanceof qj6) {
        }
    }

    public final void G(boolean z) {
        Continuation continuation = null;
        rar y2 = x97.y(ot0.F(this), null, null, new kj1(this, z, continuation, 1), 3);
        this.x.setValue(this, y[0], y2);
        l06 l06Var = this.l;
        rar rarVar = l06Var.p;
        if (rarVar != null) {
            rarVar.g(null);
        }
        l06Var.p = x97.y(ot0.F(l06Var), null, null, new z11(l06Var, z, continuation, 4), 3);
    }
}
