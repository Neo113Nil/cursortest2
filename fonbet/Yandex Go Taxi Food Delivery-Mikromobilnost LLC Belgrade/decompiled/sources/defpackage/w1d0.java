package defpackage;

import android.graphics.Color;
import android.os.Parcelable;
import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.core.data.common.PlusColor;
import com.yandex.plus.core.data.common.PlusGradient;
import com.yandex.plus.core.data.common.PlusThemedColor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.a;

/* loaded from: classes2.dex */
public final class w1d0 {
    public final sbx a;

    public w1d0() {
        this(tje.a(sbx.d, new fnb0(18)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v3, types: [com.yandex.plus.core.data.common.PlusGradient$Radial] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static PlusColor a(bfc bfcVar) {
        PlusGradient.Linear linear;
        zec zecVar;
        afc afcVar = (afc) a.R(bfcVar.a);
        zec zecVar2 = afcVar != null ? afcVar.c : null;
        ArrayList arrayList = bfcVar.a;
        if (zecVar2 != null) {
            afc afcVar2 = (afc) a.R(arrayList);
            if (afcVar2 != null && (zecVar = afcVar2.c) != null) {
                vfu vfuVar = zecVar.b;
                return new PlusColor.Color(lhc.f(Color.parseColor(vfuVar.b), m810.b(((float) vfuVar.a) * 255.0f)));
            }
        } else {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                yec yecVar = ((afc) it.next()).b;
                if (yecVar != null) {
                    oyt oytVar = yecVar.a.b;
                    ArrayList arrayList3 = oytVar.b;
                    ArrayList arrayList4 = new ArrayList(arrayList3.size());
                    ArrayList arrayList5 = new ArrayList(arrayList3.size());
                    int i = 0;
                    for (Object obj : arrayList3) {
                        int i2 = i + 1;
                        if (i < 0) {
                            scc.m();
                            throw null;
                        }
                        iyt iytVar = (iyt) obj;
                        arrayList4.add(i, Double.valueOf(iytVar.b));
                        vfu vfuVar2 = iytVar.a.b;
                        arrayList5.add(i, Integer.valueOf(lhc.f(Color.parseColor(vfuVar2.b), m810.b(((float) vfuVar2.a) * 255.0f))));
                        i = i2;
                    }
                    kyt kytVar = oytVar.c;
                    if (kytVar != null) {
                        linear = new PlusGradient.Linear(arrayList5, arrayList4, kytVar.a);
                    } else {
                        lyt lytVar = oytVar.d;
                        if (lytVar != null) {
                            nyt nytVar = lytVar.b;
                            Pair pair = new Pair(Double.valueOf(nytVar.a), Double.valueOf(nytVar.b));
                            myt mytVar = lytVar.a;
                            linear = new PlusGradient.Radial(arrayList5, arrayList4, pair, new Pair(Double.valueOf(mytVar.a), Double.valueOf(mytVar.b)));
                        }
                    }
                    if (linear == null) {
                        arrayList2.add(linear);
                    }
                }
                linear = null;
                if (linear == null) {
                }
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            if (arrayList2 != null) {
                return new PlusColor.Gradient(arrayList2);
            }
        }
        return null;
    }

    public static ArrayList d(List list) {
        List<ixt> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (ixt ixtVar : list2) {
            Integer b = bob1.b(ixtVar.a);
            if (b == null) {
                ny61.g("Failed parsing color from gradient");
                return null;
            }
            arrayList.add(Integer.valueOf(lhc.f(b.intValue(), (int) (Math.min(1.0d, Math.max(0.0d, ixtVar.b)) * 255.0d))));
        }
        return arrayList;
    }

    public static ArrayList e(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(((ixt) it.next()).c));
        }
        return arrayList;
    }

    public final PlusThemedColor b(bfc bfcVar, String str, bfc bfcVar2, String str2) {
        PlusColor c;
        PlusColor c2;
        if (bfcVar == null || (c = a(bfcVar)) == null) {
            c = c(str);
        }
        if (bfcVar2 == null || (c2 = a(bfcVar2)) == null) {
            c2 = c(str2);
        }
        return new PlusThemedColor(c, c2);
    }

    public final PlusColor c(String str) {
        Object failure;
        Parcelable radial;
        Object obj = null;
        if (str != null) {
            Integer b = bob1.b(str);
            PlusColor.Color color = b != null ? new PlusColor.Color(b.intValue()) : null;
            if (color != null) {
                return color;
            }
        }
        if (str == null) {
            return null;
        }
        try {
            List<fzt> list = (List) this.a.b(new p53(fzt.Companion.serializer(), 0), str);
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            for (fzt fztVar : list) {
                if (fztVar instanceof bzt) {
                    radial = new PlusGradient.Linear(d(((bzt) fztVar).b), e(((bzt) fztVar).b), ((bzt) fztVar).c);
                } else {
                    if (!(fztVar instanceof ezt)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ArrayList d = d(((ezt) fztVar).b);
                    ArrayList e = e(((ezt) fztVar).b);
                    xud0 xud0Var = ((ezt) fztVar).c;
                    Pair pair = new Pair(Double.valueOf(xud0Var.a), Double.valueOf(xud0Var.b));
                    xud0 xud0Var2 = ((ezt) fztVar).d;
                    radial = new PlusGradient.Radial(d, e, pair, new Pair(Double.valueOf(xud0Var2.a), Double.valueOf(xud0Var2.b)));
                }
                arrayList.add(radial);
            }
            failure = new PlusColor.Gradient(arrayList);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a == null) {
            obj = failure;
        } else {
            skd0.c(PlusLogTag.SDK, "mapToColorGradient() error=" + a.getMessage(), null);
        }
        return (PlusColor.Gradient) obj;
    }

    public w1d0(sbx sbxVar) {
        this.a = sbxVar;
    }
}
