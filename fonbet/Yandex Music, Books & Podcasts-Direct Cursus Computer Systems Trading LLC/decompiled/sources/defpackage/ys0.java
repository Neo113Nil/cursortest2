package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import com.yandex.passport.api.a2;
import com.yandex.passport.api.h;
import com.yandex.passport.api.k0;
import com.yandex.passport.common.core.b;
import com.yandex.passport.internal.credentials.f;
import com.yandex.passport.internal.network.o;
import com.yandex.passport.internal.network.p;
import com.yandex.passport.internal.properties.w;
import com.yandex.passport.internal.ui.a;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Exchanger;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.YMApplication;

/* loaded from: classes3.dex */
public final /* synthetic */ class ys0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ YMApplication b;

    public /* synthetic */ ys0(YMApplication yMApplication, int i) {
        this.a = i;
        this.b = yMApplication;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        htr htrVar;
        int i = this.a;
        int i2 = 7;
        boolean z = false;
        Object[] objArr = 0;
        YMApplication yMApplication = this.b;
        switch (i) {
            case 0:
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(Context.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                rp7Var.C(yMApplication);
                o18Var.c = hag.I(Application.class);
                rp7Var.getClass();
                rp7Var.C(yMApplication);
                o18Var.c(u70.a);
                o18Var.c(lp6.a);
                o18Var.c(j3f.a);
                o18Var.c(zb7.a);
                o18Var.c = hag.I(eyb.class);
                rp7Var.getClass();
                rp7Var.E(new qxb(7));
                o18Var.c = hag.I(byb.class);
                rp7Var.D(new qxb(8));
                o18Var.c = hag.I(hyb.class);
                rp7Var.E(new qxb(9));
                o18Var.c(v10.a);
                o18Var.c(ez7.a);
                o18Var.c(me7.a);
                o18Var.c(f0j.a);
                o18Var.c(ej2.a);
                o18Var.c(o60.a);
                o18Var.c(cku.a);
                o18Var.c(rnr.a);
                o18Var.c(jor.a);
                o18Var.c(nkj.a);
                o18Var.c(qjk.a);
                o18Var.c(rjk.a);
                o18Var.c(jvj.a);
                new b7s(new zb0(10), objArr == true ? 1 : 0).invoke(o18Var);
                o18Var.c(j7s.a);
                o18Var.c(uh7.a);
                o18Var.c(xh7.a);
                o18Var.c(j8m.a);
                o18Var.c(n6m.a);
                o18Var.c(xyp.a);
                o18Var.c(nzp.a);
                o18Var.c(zx2.a);
                o18Var.c(by2.a);
                o18Var.c(bzp.a);
                o18Var.c(rzp.a);
                o18Var.c(xzp.a);
                o18Var.c(kva.a);
                o18Var.c(nxa.a);
                o18Var.c(hf2.a);
                o18Var.c(n5m.a);
                o18Var.c(u5m.a);
                o18Var.c(i7m.a);
                o18Var.c(z8m.a);
                o18Var.c(y7m.a);
                o18Var.c(p8m.a);
                o18Var.c(vwp.a);
                o18Var.c(ocb.a);
                o18Var.c(w0h.a);
                o18Var.c(jrt.a);
                o18Var.c = hag.I(et0.class);
                rp7Var.getClass();
                rp7Var.E(new od0(27));
                o18Var.c(e76.a);
                o18Var.c(wyk.a);
                o18Var.c(ffj.a);
                o18Var.c(fk4.a);
                o18Var.c = hag.I(dv3.class);
                rp7Var.getClass();
                rp7Var.E(new od0(28));
                o18Var.c(rka.a);
                o18Var.c(az7.a);
                o18Var.c(pyk.a);
                o18Var.c(xe4.a);
                o18Var.c(hkm.a);
                o18Var.c(sve.a);
                o18Var.c = hag.I(z5l.class);
                rp7Var.getClass();
                rp7Var.E(new od0(29));
                o18Var.c = hag.I(m4l.class);
                rp7Var.getClass();
                rp7Var.E(new zs0(0));
                o18Var.c(t1i.a);
                o18Var.c(w7i.a);
                o18Var.c = hag.I(rfj.class);
                rp7Var.getClass();
                rp7Var.E(new od0(18));
                o18Var.c = hag.I(y18.class);
                rp7Var.getClass();
                rp7Var.E(new od0(19));
                o18Var.c = hag.I(zzp.class);
                rp7Var.getClass();
                rp7Var.E(new od0(20));
                o18Var.c = hag.I(va.class);
                rp7Var.getClass();
                rp7Var.E(new od0(21));
                o18Var.c = hag.I(owp.class);
                rp7Var.getClass();
                rp7Var.E(new od0(22));
                o18Var.c = hag.I(eu0.class);
                rp7Var.getClass();
                rp7Var.E(new od0(23));
                o18Var.c = hag.I(icu.class);
                rp7Var.getClass();
                rp7Var.E(new od0(24));
                o18Var.c = hag.I(skr.class);
                rp7Var.getClass();
                rp7Var.E(new od0(25));
                o18Var.c = hag.I(o8q.class);
                rp7Var.getClass();
                rp7Var.E(new od0(26));
                o18Var.c(ak3.a);
                o18Var.c(x3g.a);
                o18Var.c(qrn.a);
                o18Var.c(y1l.a);
                o18Var.c(da.a);
                o18Var.c(ore.a);
                o18Var.c(a2d.a);
                o18Var.c(gkh.a);
                o18Var.c(jw2.a);
                o18Var.c(p4s.a);
                o18Var.c(wlv.b);
                o18Var.c(v64.a);
                o18Var.c(xed.a);
                o18Var.c(d2c.a);
                o18Var.c(zyb.a);
                o18Var.c(psl.a);
                o18Var.c(hsr.a);
                o18Var.c(cc0.a);
                o18Var.c(ofn.a);
                o18Var.c(ckf.a);
                o18Var.c(k0p.c);
                o18Var.c(y4p.a);
                o18Var.c(pz.a);
                o18Var.c(ji1.a);
                o18Var.c(o41.a);
                o18Var.c(pfe.a);
                o18Var.c(ybj.a);
                o18Var.c(jaj.a);
                o18Var.c(cui.a);
                o18Var.c(zif.a);
                o18Var.c(poq.a);
                o18Var.c(lyl.a);
                o18Var.c(yul.a);
                o18Var.c(owl.a);
                o18Var.c(oaj.a);
                o18Var.c(nik.a);
                o18Var.c(yp0.a);
                o18Var.c(w4.a);
                o18Var.c(b98.a);
                o18Var.c(kp3.a);
                o18Var.c(yus.a);
                o18Var.c(cou.a);
                o18Var.c(b6q.a);
                o18Var.c(lcl.a);
                o18Var.c(mnk.a);
                o18Var.c(adm.a);
                o18Var.c(idm.a);
                o18Var.c(o87.a);
                o18Var.c(x3d.a);
                o18Var.c(q4n.a);
                o18Var.c(ug4.a);
                o18Var.c(vhb.a);
                o18Var.c(lu5.a);
                o18Var.c(e1d.a);
                o18Var.c(jgr.a);
                o18Var.c(ynk.a);
                o18Var.c(lu0.a);
                o18Var.c(fin.a);
                o18Var.c(mwr.a);
                o18Var.c(rpp.a);
                o18Var.c(sdf.a);
                o18Var.c(uge.a);
                o18Var.c(yau.a);
                o18Var.c(egw.a);
                o18Var.c(dsr.a);
                o18Var.c(py3.a);
                o18Var.c(hy3.a);
                o18Var.c(n2h.a);
                o18Var.c(lsb.a);
                o18Var.c(g9b.a);
                o18Var.c(xxb.a);
                o18Var.c(f4u.a);
                o18Var.c(mkl.a);
                o18Var.c(nkl.a);
                o18Var.c(js4.a);
                o18Var.c(h58.a);
                o18Var.c(zfa.a);
                o18Var.c(a45.a);
                o18Var.c(ry4.a);
                o18Var.c(kt.a);
                o18Var.c(ui5.a);
                o18Var.c(uuq.a);
                o18Var.c(gu4.a);
                o18Var.c(g65.a);
                o18Var.c(eru.a);
                o18Var.b(hag.I(tli.class)).D(new p1i(17));
                o18Var.b(hag.I(nli.class)).D(new p1i(18));
                o18Var.c(ffv.a);
                o18Var.c(m7r.a);
                o18Var.c(ln2.a);
                o18Var.c(s0w.a);
                o18Var.c(x0w.a);
                o18Var.c(luv.a);
                o18Var.c(xjt.a);
                o18Var.c(c32.a);
                o18Var.c(hrk.a);
                o18Var.c(tnk.a);
                o18Var.c(hle.b);
                o18Var.c(hv4.a);
                o18Var.c(bkf.a);
                o18Var.c(gwg.a);
                o18Var.c(mwc.a);
                o18Var.b(hag.I(k6t.class)).D(new h4t(7));
                o18Var.b(hag.I(b5t.class)).D(new h4t(8));
                o18Var.c(gwm.a);
                o18Var.c(gg2.a);
                o18Var.c(wz1.b);
                o18Var.c(g56.a);
                o18Var.c(mvo.a);
                o18Var.c(hqg.a);
                o18Var.c(agf.a);
                o18Var.c(hza.a);
                o18Var.c(j6o.a);
                o18Var.c(f6t.a);
                o18Var.c(pn6.a);
                o18Var.c(svt.a);
                o18Var.c(jbc.a);
                o18Var.c(k1v.a);
                o18Var.c(fy7.a);
                o18Var.c(q78.a);
                o18Var.c(we3.a);
                o18Var.c(k1h.a);
                o18Var.c(mt6.a);
                o18Var.c(qvp.a);
                o18Var.c(ilk.a);
                return Unit.a;
            case 1:
                w wVar = (w) obj;
                wVar.getClass();
                h hVar = h.c;
                f fVar = new f("2hrlSIPH5MiBX5Pshy3X/wed7sKNfnqKDxODrg5sCwCS3/fqduwjuCuK2zM2exyV", "3RrkStaQtJ/aD8Drh3jfptIgi3KCK2AlQRBrM+JbBns1sQnVHnTkIDEwE521IN4f");
                hVar.getClass();
                wVar.a.put(hVar, fVar);
                h hVar2 = h.e;
                f fVar2 = new f("ikrkENSSt53XX8m+hyXaqY8wpzepYGkL9MHP4seA+OigMPkcOeW+Z5Rth/dxqmUK", "20q+H4OcsZTbWcjuh3/bq5OJw7bS99ycScbKFfjoNFHmoklAwtj9Cp4lMCQDzgnQ");
                hVar2.getClass();
                wVar.a.put(hVar2, fVar2);
                wVar.k = true;
                try {
                    File filesDir = yMApplication.getFilesDir();
                    filesDir.getClass();
                    z = new File(filesDir, "enableAMAltUrl").exists();
                } catch (SecurityException unused) {
                }
                if (z) {
                    hpj hpjVar = new hpj(20);
                    o oVar = new o();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    oVar.a = linkedHashMap;
                    hpjVar.invoke(oVar);
                    wVar.i = new p(linkedHashMap);
                }
                wVar.f = new l48(29);
                quk qukVar = htr.f;
                String language = swf.I().getLanguage();
                language.getClass();
                qukVar.getClass();
                int hashCode = language.hashCode();
                if (hashCode == 3424) {
                    if (language.equals("kk")) {
                        htrVar = htr.j;
                    }
                    htrVar = htr.g;
                } else if (hashCode != 3651) {
                    if (hashCode == 3749 && language.equals("uz")) {
                        htrVar = htr.i;
                    }
                    htrVar = htr.g;
                } else {
                    if (language.equals("ru")) {
                        htrVar = htr.h;
                    }
                    htrVar = htr.g;
                }
                wVar.h = htrVar.c;
                joj jojVar = new joj();
                int i3 = Build.VERSION.SDK_INT;
                ArrayList arrayList = jojVar.c;
                if (i3 >= 29) {
                    arrayList.add(new n56(4));
                }
                arrayList.add(new up3(i2, yMApplication));
                wVar.e = jojVar;
                if (wVar.a.isEmpty()) {
                    xq0.q("At least one credential set is required");
                    return null;
                }
                LinkedHashMap linkedHashMap2 = wVar.a;
                LinkedHashMap linkedHashMap3 = wVar.b;
                List list = wVar.c;
                List list2 = wVar.d;
                joj jojVar2 = wVar.e;
                List list3 = wVar.g;
                a2 a2Var = wVar.i;
                a2Var.getClass();
                a2Var.d().getClass();
                Map F = a.F(wVar.j);
                Map map = wVar.l;
                Map map2 = wVar.m;
                linkedHashMap2.getClass();
                linkedHashMap3.getClass();
                list.getClass();
                list2.getClass();
                jojVar2.getClass();
                list3.getClass();
                F.getClass();
                map.getClass();
                map2.getClass();
                ArrayList arrayList2 = new ArrayList(linkedHashMap2.size());
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    b K = com.yandex.plus.core.network.api.utils.a.K((k0) entry.getKey());
                    f fVar3 = (f) entry.getValue();
                    fVar3.getClass();
                    arrayList2.add(new Pair(K, new f(fVar3.a, fVar3.b)));
                }
                uah.n(arrayList2);
                ArrayList arrayList3 = new ArrayList(linkedHashMap3.size());
                for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                    b K2 = com.yandex.plus.core.network.api.utils.a.K((k0) entry2.getKey());
                    f fVar4 = (f) entry2.getValue();
                    fVar4.getClass();
                    String str = fVar4.a;
                    String str2 = fVar4.b;
                    str.getClass();
                    str2.getClass();
                    arrayList3.add(new Pair(K2, new f(str, str2)));
                }
                uah.n(arrayList3);
                return Unit.a;
            default:
                String str3 = (String) obj;
                ju0 ju0Var = YMApplication.d;
                str3.getClass();
                wge C = q6k.C(yMApplication);
                C.b();
                Exchanger exchanger = new Exchanger();
                ((LinkedBlockingQueue) C.c).offer(new nud(exchanger, C, str3, false, 9));
                exchanger.exchange(null);
                return Unit.a;
        }
    }
}
