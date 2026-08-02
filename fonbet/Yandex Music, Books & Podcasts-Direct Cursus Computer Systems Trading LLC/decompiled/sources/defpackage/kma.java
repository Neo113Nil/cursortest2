package defpackage;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.fragment.app.t;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.ott.data.dto.DrmParams;

/* loaded from: classes.dex */
public final class kma extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kma(i1b i1bVar, pt0 pt0Var) {
        super(1);
        this.r = 3;
        this.s = i1bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String concat;
        qf7 qf7Var;
        ksf ksfVar;
        bvf bvfVar;
        switch (this.r) {
            case 0:
                mma mmaVar = (mma) obj;
                if (!mmaVar.a.n) {
                    return v9t.b;
                }
                mma mmaVar2 = mmaVar.p;
                if (mmaVar2 != null) {
                    kma kmaVar = new kma(0, (efo) this.s);
                    if (kmaVar.invoke(mmaVar2) == v9t.a) {
                        q7g.V(mmaVar2, kmaVar);
                    }
                }
                mmaVar.p = null;
                mmaVar.o = null;
                return v9t.a;
            case 1:
                lfm lfmVar = (lfm) obj;
                ((f5r) this.s).invoke(lfmVar, Float.valueOf(Float.intBitsToFloat((int) (swf.f0(lfmVar, false) >> 32))));
                lfmVar.a();
                return Unit.a;
            case 2:
                ((Number) obj).floatValue();
                return Float.valueOf(dqa.a((dqa) this.s).n0(cqa.a));
            case 3:
                i1b i1bVar = (i1b) obj;
                StringBuilder k = dfi.k(((i1b) this.s) == i1bVar ? " > " : "   ");
                if (i1bVar instanceof vb5) {
                    StringBuilder sb = new StringBuilder("CommitTextCommand(text.length=");
                    vb5 vb5Var = (vb5) i1bVar;
                    sb.append(vb5Var.a.b.length());
                    sb.append(", newCursorPosition=");
                    concat = vz1.r(sb, vb5Var.b, ')');
                } else if (i1bVar instanceof onp) {
                    StringBuilder sb2 = new StringBuilder("SetComposingTextCommand(text.length=");
                    onp onpVar = (onp) i1bVar;
                    sb2.append(onpVar.a.b.length());
                    sb2.append(", newCursorPosition=");
                    concat = vz1.r(sb2, onpVar.b, ')');
                } else if (i1bVar instanceof nnp) {
                    concat = i1bVar.toString();
                } else if (i1bVar instanceof dx7) {
                    concat = i1bVar.toString();
                } else if (i1bVar instanceof ex7) {
                    concat = i1bVar.toString();
                } else if (i1bVar instanceof hop) {
                    concat = i1bVar.toString();
                } else if (i1bVar instanceof sdc) {
                    concat = "FinishComposingTextCommand()";
                } else if (i1bVar instanceof xw7) {
                    concat = "DeleteAllCommand()";
                } else {
                    String h = ern.a(i1bVar.getClass()).h();
                    if (h == null) {
                        h = "{anonymous EditCommand}";
                    }
                    concat = "Unknown EditCommand: ".concat(h);
                }
                k.append(concat);
                return k.toString();
            case 4:
                d23 d23Var = (d23) obj;
                sf7 sf7Var = ((ygb) this.s).g;
                sf7Var.getClass();
                dw8 dw8Var = d23Var.a;
                qf7 qf7Var2 = sf7Var.k;
                if (qf7Var2 != null) {
                    qf7Var2.close();
                }
                dfb a = sf7Var.a.a(d23Var.b, d23Var.a);
                y5 y5Var = sf7Var.l;
                synchronized (a.c) {
                    a.d.a(y5Var);
                    a.g();
                    y5Var.invoke(a.h, a.g);
                    qf7Var = new qf7(1, a, y5Var);
                }
                sf7Var.k = qf7Var;
                return Unit.a;
            case 5:
                qsb qsbVar = (qsb) obj;
                qsbVar.getClass();
                erb erbVar = (erb) this.s;
                qsbVar.b = null;
                qsbVar.f = erbVar.e;
                qsbVar.g = erbVar.f;
                return Unit.a;
            case 6:
                zzb zzbVar = (zzb) this.s;
                Set set = (Set) zzbVar.i.get(((kxt) obj).c());
                List w0 = set != null ? CollectionsKt.w0(set) : null;
                if (w0 != null) {
                    Iterator it = w0.iterator();
                    while (it.hasNext()) {
                        zzbVar.h.remove((String) it.next());
                    }
                }
                if (w0 != null) {
                    Iterator it2 = w0.iterator();
                    while (it2.hasNext()) {
                        ckj ckjVar = (ckj) zzbVar.j.get((String) it2.next());
                        if (ckjVar != null) {
                            akj akjVar = new akj(ckjVar);
                            while (akjVar.hasNext()) {
                                ((Function0) akjVar.next()).invoke();
                            }
                        }
                    }
                }
                return Unit.a;
            case 7:
                String str = (String) obj;
                str.getClass();
                oac oacVar = (oac) this.s;
                oxa oxaVar = oacVar.a;
                String str2 = (String) oacVar.b.a;
                return mif.a(mif.a(oxaVar.t(str2), new sea(7, oxaVar, str2), null, 5), new sea(8, oacVar, str), null, 5);
            case 8:
                qfk qfkVar = (qfk) obj;
                wfk wfkVar = (wfk) ((gp7) this.s).b;
                qfkVar.getClass();
                r8k r8kVar = qfkVar.l;
                t7w t7wVar = r8kVar != null ? r8kVar.c : null;
                if (t7wVar != null && r8kVar != null) {
                    if (r8kVar.a) {
                        return Boolean.valueOf(wfkVar.f && wfkVar.g.contains(t7wVar));
                    }
                }
                ufk ufkVar = qfkVar.j;
                return ufkVar == ufk.Card ? Boolean.valueOf(wfkVar.a) : ufkVar == ufk.SbpToken ? Boolean.valueOf(wfkVar.e) : Boolean.TRUE;
            case 9:
                int intValue = ((Number) obj).intValue();
                yfx yfxVar = (yfx) this.s;
                ViewPager2 viewPager = ((oc9) yfxVar.b).getViewPager();
                int i = 1;
                if (intValue != 0 && intValue != ((hb9) yfxVar.c).q.f() - 1) {
                    i = -1;
                }
                viewPager.setOffscreenPageLimit(i);
                return Unit.a;
            case 10:
                String str3 = (String) obj;
                str3.getClass();
                ((my0) this.s).b.add(new jkr(str3));
                return Unit.a;
            case 11:
                ghc ghcVar = (ghc) obj;
                ghcVar.getClass();
                mm7 mm7Var = (mm7) this.s;
                mm7Var.d = ghcVar.a;
                es6 es6Var = mm7Var.c;
                ((LinkedHashMap) es6Var.c).clear();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                w1g.n(((sk2) es6Var.a).a(), new s30(25, es6Var, linkedHashMap));
                w1g.n(linkedHashMap, new y5(12, es6Var));
                g06 g06Var = mm7Var.a;
                n7b n7bVar = (n7b) g06Var.d;
                knn knnVar = (knn) g06Var.c;
                ArrayList<zgc> arrayList = mm7Var.d;
                arrayList.getClass();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (zgc zgcVar : arrayList) {
                    w1g.n(zgcVar.d, new wgc(linkedHashMap2, zgcVar));
                }
                ix6 ix6Var = (ix6) g06Var.b;
                s7w s7wVar = (s7w) g06Var.a;
                ArrayList arrayList2 = new ArrayList();
                w1g.n(linkedHashMap2, new s30(23, s7wVar, arrayList2));
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    w1g.n((Map) it3.next(), new u60(linkedHashMap3, 3));
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                w1g.n(linkedHashMap3, new s30(24, n7bVar, linkedHashMap4));
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                w1g.n(linkedHashMap4, new u60(linkedHashMap5, 1));
                knnVar.q(linkedHashMap5);
                SharedPreferences.Editor edit = ((sk2) ix6Var.b).a.edit();
                edit.getClass();
                w1g.n(ix6Var.f(), new s30(20, linkedHashMap3, new sld(edit)));
                edit.apply();
                LinkedHashMap f = ix6Var.f();
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                w1g.n(f, new s30(24, n7bVar, linkedHashMap6));
                knnVar.q(linkedHashMap6);
                knnVar.q(ghcVar.b);
                h4a.j = mm7Var;
                return Unit.a;
            case 12:
                ldt ldtVar = (ldt) obj;
                return ((rpc) this.s).a(new ldt(null, ldtVar.b, ldtVar.c, ldtVar.d, ldtVar.e)).getValue();
            case 13:
                t tVar = (t) obj;
                tVar.getClass();
                nyf lifecycle = tVar.getLifecycle();
                lifecycle.getClass();
                tVar.runOnUiThread(new juc(1, lifecycle, (cr) this.s));
                return Unit.a;
            case 14:
                t tVar2 = (t) obj;
                tVar2.getClass();
                return new BitmapDrawable(tVar2.getResources(), (Bitmap) this.s);
            case 15:
                if (fmd.b.compareAndSet(false, true)) {
                    ((zi3) this.s).c(Unit.a);
                }
                return Unit.a;
            case 16:
                jpa jpaVar = (jpa) obj;
                xod xodVar = (xod) this.s;
                eak eakVar = xodVar.l;
                if (xodVar.n && xodVar.w && eakVar != null) {
                    nsh q0 = jpaVar.q0();
                    long B = q0.B();
                    q0.s().r();
                    try {
                        ((nsh) ((xzi) q0.b).a).s().h(eakVar);
                        xodVar.d(jpaVar);
                    } finally {
                        vz1.A(q0, B);
                    }
                } else {
                    xodVar.d(jpaVar);
                }
                return Unit.a;
            case 17:
                jpa jpaVar2 = (jpa) obj;
                zod zodVar = (zod) this.s;
                mu3 s = jpaVar2.q0().s();
                Function2 function2 = zodVar.d;
                if (function2 != null) {
                    function2.invoke(s, (xod) jpaVar2.q0().c);
                }
                return Unit.a;
            case 18:
                nwt nwtVar = (nwt) obj;
                nqd nqdVar = (nqd) this.s;
                nqdVar.g(nwtVar);
                Function1 function1 = nqdVar.i;
                if (function1 != null) {
                    function1.invoke(nwtVar);
                }
                return Unit.a;
            case 19:
                return Boolean.valueOf(!((fq4) this.s).b(Float.valueOf(((sje) obj).c)));
            case 20:
                wgj wgjVar = (wgj) obj;
                qnn qnnVar = wgjVar.b;
                if (qnnVar != null) {
                    qnnVar.closeConnection();
                    wgjVar.b = null;
                }
                rne rneVar = (rne) this.s;
                eqi eqiVar = rneVar.d;
                Object[] objArr = eqiVar.a;
                int i2 = eqiVar.c;
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        i3 = -1;
                    } else if (!Intrinsics.d((cbv) objArr[i3], wgjVar)) {
                        i3++;
                    }
                }
                if (i3 >= 0) {
                    eqiVar.m(i3);
                }
                if (eqiVar.c == 0) {
                    rneVar.b.invoke();
                }
                return Unit.a;
            case 21:
                ase aseVar = (ase) this.s;
                synchronized (aseVar.c) {
                    aseVar.d = 5;
                    aseVar.f = null;
                }
                return Unit.a;
            case 22:
                vqa vqaVar = (vqa) obj;
                vqaVar.getClass();
                vqaVar.a = ((DrmParams) this.s).getRequestParams();
                return Unit.a;
            case 23:
                float floatValue = ((Number) obj).floatValue();
                tsf tsfVar = (tsf) this.s;
                float f2 = -floatValue;
                if ((f2 >= 0.0f || tsfVar.d()) && (f2 <= 0.0f || tsfVar.c())) {
                    if (Math.abs(tsfVar.g) > 0.5f) {
                        vme.c("entered drag with non-zero pending scroll");
                    }
                    float f3 = tsfVar.g + f2;
                    tsfVar.g = f3;
                    if (Math.abs(f3) > 0.5f) {
                        float f4 = tsfVar.g;
                        int b = eeh.b(f4);
                        ksf f5 = ((ksf) tsfVar.e.getValue()).f(b, !tsfVar.b);
                        if (f5 != null && (ksfVar = tsfVar.c) != null) {
                            ksf f6 = ksfVar.f(b, true);
                            if (f6 != null) {
                                tsfVar.c = f6;
                            } else {
                                f5 = null;
                            }
                        }
                        if (f5 != null) {
                            tsfVar.f(f5, tsfVar.b, true);
                            tsfVar.r.setValue(Unit.a);
                            tsfVar.i(f4 - tsfVar.g, f5);
                        } else {
                            mpf mpfVar = tsfVar.j;
                            if (mpfVar != null) {
                                mpfVar.l();
                            }
                            tsfVar.i(f4 - tsfVar.g, tsfVar.h());
                        }
                    }
                    if (Math.abs(tsfVar.g) > 0.5f) {
                        f2 -= tsfVar.g;
                        tsfVar.g = 0.0f;
                    }
                } else {
                    f2 = 0.0f;
                }
                return Float.valueOf(-f2);
            case 24:
                return new hi(9, (rtf) this.s);
            case 25:
                return new hi(11, (auf) this.s);
            case 26:
                int intValue2 = ((Number) obj).intValue();
                yuf yufVar = (yuf) this.s;
                return yufVar.g(intValue2, yufVar.f);
            case 27:
                float floatValue2 = ((Number) obj).floatValue();
                fvf fvfVar = (fvf) this.s;
                float f7 = -floatValue2;
                if ((f7 >= 0.0f || fvfVar.d()) && (f7 <= 0.0f || fvfVar.c())) {
                    if (Math.abs(fvfVar.g) > 0.5f) {
                        vme.c("entered drag with non-zero pending scroll");
                    }
                    float f8 = fvfVar.g + f7;
                    fvfVar.g = f8;
                    if (Math.abs(f8) > 0.5f) {
                        float f9 = fvfVar.g;
                        int round = Math.round(f9);
                        bvf f10 = ((bvf) fvfVar.e.getValue()).f(round, !fvfVar.b);
                        if (f10 != null && (bvfVar = fvfVar.c) != null) {
                            bvf f11 = bvfVar.f(round, true);
                            if (f11 != null) {
                                fvfVar.c = f11;
                            } else {
                                f10 = null;
                            }
                        }
                        if (f10 != null) {
                            fvfVar.g(f10, fvfVar.b, true);
                            fvfVar.u.setValue(Unit.a);
                            fvfVar.k(f9 - fvfVar.g, f10);
                        } else {
                            mpf mpfVar2 = fvfVar.j;
                            if (mpfVar2 != null) {
                                mpfVar2.l();
                            }
                            fvfVar.k(f9 - fvfVar.g, fvfVar.j());
                        }
                    }
                    if (Math.abs(fvfVar.g) > 0.5f) {
                        f7 -= fvfVar.g;
                        fvfVar.g = 0.0f;
                    }
                } else {
                    f7 = 0.0f;
                }
                return Float.valueOf(-f7);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                koo kooVar = (koo) this.s;
                return Boolean.valueOf(kooVar != null ? kooVar.c(obj) : true);
            default:
                r9g r9gVar = (r9g) obj;
                r9gVar.getClass();
                ((yjj) ((mmo) this.s).g).a(r9gVar);
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kma(int i, Object obj) {
        super(1);
        this.r = i;
        this.s = obj;
    }
}
