package defpackage;

import android.os.Parcelable;
import defpackage.hmm;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.ranges.IntRange;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class fkg {
    public final cc7 a;
    public final jyr b = btf.b(new v1e(29, this));

    public fkg(cc7 cc7Var) {
        this.a = cc7Var;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static final java.lang.Object a(defpackage.fkg r7, defpackage.lpi r8, java.lang.String r9, defpackage.cg6 r10) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fkg.a(fkg, lpi, java.lang.String, cg6):java.lang.Object");
    }

    public static final Object b(fkg fkgVar, String str, String str2, aur aurVar) {
        fkgVar.getClass();
        return x97.V(dm6.b, new akg(fkgVar, str, str2, null), aurVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable c(fkg fkgVar, String str, String str2, cg6 cg6Var) {
        bkg bkgVar;
        int i;
        String str3;
        if (cg6Var instanceof bkg) {
            bkgVar = (bkg) cg6Var;
            int i2 = bkgVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bkgVar.n = i2 - Integer.MIN_VALUE;
                Object obj = bkgVar.l;
                nm6 nm6Var = nm6.a;
                i = bkgVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc data = ((wb7) fkgVar.b.getValue()).getData();
                    bkgVar.j = str;
                    bkgVar.k = str2;
                    bkgVar.n = 1;
                    obj = zsd.g0(data, bkgVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = bkgVar.k;
                    str = bkgVar.j;
                    qgg.h0(obj);
                }
                hmm.a aVar = new hmm.a(e(str, str2));
                lpi lpiVar = (lpi) ((hmm) obj);
                lpiVar.getClass();
                str3 = (String) lpiVar.a.get(aVar);
                if (str3 != null) {
                    if (str3.length() <= 0) {
                        str3 = null;
                    }
                    if (str3 != null) {
                        JSONArray jSONArray = new JSONArray(str3);
                        IntRange m = yhn.m(0, jSONArray.length());
                        ArrayList arrayList = new ArrayList(v75.o(m, 10));
                        ype it = m.iterator();
                        while (it.c) {
                            arrayList.add(jSONArray.getString(it.nextInt()));
                        }
                        return arrayList;
                    }
                }
                return null;
            }
        }
        bkgVar = new bkg(fkgVar, cg6Var);
        Object obj2 = bkgVar.l;
        nm6 nm6Var2 = nm6.a;
        i = bkgVar.n;
        if (i != 0) {
        }
        hmm.a aVar2 = new hmm.a(e(str, str2));
        lpi lpiVar2 = (lpi) ((hmm) obj2);
        lpiVar2.getClass();
        str3 = (String) lpiVar2.a.get(aVar2);
        if (str3 != null) {
        }
        return null;
    }

    public static final Object d(fkg fkgVar, lpi lpiVar, Parcelable parcelable, String str, String str2, rfg rfgVar) {
        Object V = x97.V(dm6.b, new ckg(parcelable, fkgVar, lpiVar, str, str2, (Continuation) null), rfgVar);
        return V == nm6.a ? V : Unit.a;
    }

    public static String e(String str, String str2) {
        return hrg.r("$", str, "_", str2);
    }

    public final Object f(lpi lpiVar, String str, String str2, String str3, cg6 cg6Var) {
        return x97.V(dm6.b, new dkg(this, str2, str3, str, lpiVar, null), cg6Var);
    }

    public final Object g(lpi lpiVar, Collection collection, String str, String str2, cg6 cg6Var) {
        return x97.V(dm6.b, new ekg(this, str, str2, collection, lpiVar, null), cg6Var);
    }
}
