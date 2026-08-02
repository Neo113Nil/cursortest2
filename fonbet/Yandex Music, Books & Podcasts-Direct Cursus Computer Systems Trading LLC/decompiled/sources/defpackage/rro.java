package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import com.connectsdk.service.DeviceService;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class rro extends bfu {
    public final sdk k;
    public final jek l;
    public final String m;
    public final aro n;
    public final SharedPreferences o;
    public final String p;
    public final g0c q;
    public final voi r;
    public final voi s;
    public List t;
    public final Object u;
    public Integer v;
    public String w;
    public iro x;
    public Pair y;
    public hro z;

    public rro(sdk sdkVar, jek jekVar, String str, aro aroVar, SharedPreferences sharedPreferences, String str2, g0c g0cVar) {
        sdkVar.getClass();
        jekVar.getClass();
        sharedPreferences.getClass();
        g0cVar.getClass();
        this.k = sdkVar;
        this.l = jekVar;
        this.m = str;
        this.n = aroVar;
        this.o = sharedPreferences;
        this.p = str2;
        this.q = g0cVar;
        this.r = new voi();
        this.s = new voi();
        this.t = c5b.a;
        this.u = btf.a(bwf.c, xuj.x0);
        if (aroVar.equals(yqo.a) ? true : aroVar.equals(zqo.a)) {
            K(nro.a);
            kpm kpmVar = new kpm(6, this);
            rl2 rl2Var = (rl2) ((rzm) ((tdk) sdkVar).f.O).get();
            rl2Var.getClass();
            mif.b(rl2Var.b.K(kgj.qr), new al(15, rl2Var, kpmVar), new m40(6, kpmVar), 1);
        } else if (aroVar instanceof xqo) {
            L();
        }
        this.z = hro.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        if ((r9 >= 0) != false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void G(rro rroVar, List list, boolean z) {
        boolean z2;
        Integer num;
        String str = rroVar.p;
        aro aroVar = rroVar.n;
        boolean z3 = aroVar instanceof xqo;
        yqo yqoVar = yqo.a;
        zqo zqoVar = zqo.a;
        boolean z4 = true;
        if (z3) {
            z2 = true;
        } else {
            if (!(Intrinsics.d(aroVar, zqoVar) ? true : Intrinsics.d(aroVar, yqoVar))) {
                b6e.s();
                return;
            }
            z2 = false;
        }
        if (z2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((hl2) obj).e) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        rroVar.t = list;
        List list2 = str != null ? list : null;
        if (list2 != null) {
            Iterator it = list2.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (((hl2) it.next()).b.equals(str)) {
                    break;
                } else {
                    i++;
                }
            }
            num = Integer.valueOf(i);
        }
        num = null;
        if (num != null) {
            rroVar.H(num.intValue());
            return;
        }
        sdk sdkVar = rroVar.k;
        tdk tdkVar = sdkVar instanceof tdk ? (tdk) sdkVar : null;
        boolean B = qdq.B(tdkVar != null ? Boolean.valueOf(tdkVar.c()) : null);
        if (Intrinsics.d(aroVar, yqoVar)) {
            z3 = true;
        }
        if (!z3) {
            if (!Intrinsics.d(aroVar, zqoVar)) {
                b6e.s();
                return;
            }
            z4 = B;
        }
        rroVar.K(new jro(list, z4, z));
    }

    public static ArrayList M(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((hl2) it.next()).b);
        }
        return new ArrayList(arrayList);
    }

    public static final String a(rro rroVar) {
        hl2 hl2Var = (hl2) CollectionsKt.S(rroVar.t, 0);
        if (hl2Var != null) {
            return hl2Var.b;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r12v10, types: [arf, java.lang.Object] */
    public final void H(int i) {
        am2 am2Var;
        hl2 hl2Var = (hl2) this.t.get(i);
        cfk.g.a(hl2Var.a);
        String str = hl2Var.a;
        String str2 = hl2Var.b;
        Integer num = this.v;
        boolean z = num != null && i == num.intValue();
        int ordinal = this.z.ordinal();
        if (ordinal == 0) {
            am2Var = am2.UNKNOWN;
        } else if (ordinal == 1) {
            am2Var = am2.INSTALLED;
        } else {
            if (ordinal != 2) {
                b6e.s();
                return;
            }
            am2Var = am2.OTHER;
        }
        str.getClass();
        String concat = "Открытие приложения банка ".concat(str);
        if (z) {
            concat = concat.concat(", находящегося в избранном");
        }
        int ordinal2 = am2Var.ordinal();
        String o = ouj.o(ouj.o(concat, ", ", ordinal2 != 0 ? ordinal2 != 1 ? ordinal2 != 2 ? "" : "из неизвестного списка" : "из полного списка" : "из списка установленных"), ", scheme = ", str2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        w1g.B(linkedHashMap, Constants.KEY_VALUE, new jkr(str));
        w1g.B(linkedHashMap, "scheme", new jkr(str2));
        w1g.B(linkedHashMap, "is_favorite", new mc3(z));
        w1g.B(linkedHashMap, "type_bank_list", new jkr(am2Var.a));
        w1g.B(linkedHashMap, DeviceService.KEY_DESC, new jkr(o));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        qne j = su4.j(vtmVar, "event_name", "sbp_start_bank_app", "sbp_start_bank_app", vtmVar);
        x60 x60Var = (x60) this.q;
        x60Var.getClass();
        x60Var.a(j);
        K(new mro());
        ((fjs) this.u.getValue()).c(3L, new qro(this, 1));
        this.w = str2;
        Pair pair = this.y;
        if (pair != null) {
            J(hl2Var, (Uri) pair.a, (String) pair.b);
            return;
        }
        qtf qtfVar = new qtf(8, this, hl2Var);
        sfm sfmVar = new sfm(this, hl2Var, qtfVar);
        aro aroVar = this.n;
        if (aroVar instanceof xqo) {
            gao gaoVar = new gao(this);
            w03 w03Var = ((tdk) this.k).h;
            String str3 = ((xqo) aroVar).a;
            w03Var.b(str3 != null ? str3 : "", new ybg(28, qtfVar), gaoVar);
            return;
        }
        boolean d = Intrinsics.d(aroVar, yqo.a);
        String str4 = this.m;
        jek jekVar = this.l;
        if (d) {
            jekVar.b(str4, sfmVar);
        } else if (Intrinsics.d(aroVar, zqo.a)) {
            jekVar.e(str4, sfmVar);
        }
    }

    public final void J(hl2 hl2Var, Uri uri, String str) {
        String str2 = hl2Var.f;
        if (str == null) {
            str = "";
        }
        iro iroVar = new iro(new Intent("android.intent.action.VIEW", dag.I(str2, str, uri.getQuery())), hl2Var.b, str2);
        this.x = iroVar;
        this.s.m(iroVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [arf, java.lang.Object] */
    public final void K(pro proVar) {
        ((fjs) this.u.getValue()).b();
        this.r.m(proVar);
    }

    public final void L() {
        K(nro.a);
        z6n z6nVar = new z6n(5, this);
        yqo yqoVar = yqo.a;
        aro aroVar = this.n;
        boolean d = Intrinsics.d(aroVar, yqoVar) ? true : Intrinsics.d(aroVar, zqo.a);
        sdk sdkVar = this.k;
        if (d) {
            ((tdk) sdkVar).b(z6nVar);
        } else if (aroVar instanceof xqo) {
            rl2 rl2Var = (rl2) ((rzm) ((tdk) sdkVar).f.O).get();
            rl2Var.getClass();
            mif.b(rl2Var.b.K(kgj.sub), new pl2(z6nVar, 0), new pl2(z6nVar, 1), 1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [arf, java.lang.Object] */
    @Override // defpackage.bfu
    public final void onCleared() {
        ((fjs) this.u.getValue()).a();
        super.onCleared();
    }
}
