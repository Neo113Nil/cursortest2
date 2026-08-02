package defpackage;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public abstract class bf0 {
    public static final Comparator[] a;
    public static final af0 b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new eh(2, new eh(i == 0 ? C1318t.m : C1318t.h));
            i++;
        }
        a = comparatorArr;
        b = af0.s;
    }

    public static final boolean a(qfp qfpVar) {
        jfp i = qfpVar.i();
        return !i.a.c(ufp.i);
    }

    public static final void b(qfp qfpVar, ArrayList arrayList, soi soiVar, upe upeVar, Resources resources) {
        boolean f = f(qfpVar);
        int i = qfpVar.g;
        jfp jfpVar = qfpVar.d;
        Object g = jfpVar.a.g(ufp.m);
        if (g == null) {
            g = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) g).booleanValue();
        if ((booleanValue || g(qfpVar, resources)) && upeVar.a(i)) {
            arrayList.add(qfpVar);
        }
        if (booleanValue) {
            soiVar.h(i, h(f, qfp.h(7, qfpVar), upeVar, resources));
            return;
        }
        List h = qfp.h(7, qfpVar);
        int size = h.size();
        for (int i2 = 0; i2 < size; i2++) {
            b((qfp) h.get(i2), arrayList, soiVar, upeVar, resources);
        }
    }

    public static final boolean c(qfp qfpVar) {
        Object g = qfpVar.d.a.g(ufp.H);
        if (g == null) {
            g = null;
        }
        sls slsVar = (sls) g;
        tpi tpiVar = qfpVar.d.a;
        Object g2 = tpiVar.g(ufp.w);
        if (g2 == null) {
            g2 = null;
        }
        meo meoVar = (meo) g2;
        boolean z = slsVar != null;
        Object g3 = tpiVar.g(ufp.G);
        if (((Boolean) (g3 != null ? g3 : null)) == null || (meoVar != null && meoVar.a == 4)) {
            return z;
        }
        return true;
    }

    public static final String d(qfp qfpVar, Resources resources) {
        jfp jfpVar = qfpVar.d;
        jfp jfpVar2 = qfpVar.d;
        Object g = jfpVar.a.g(ufp.b);
        String str = null;
        if (g == null) {
            g = null;
        }
        tpi tpiVar = jfpVar2.a;
        Object g2 = tpiVar.g(ufp.H);
        if (g2 == null) {
            g2 = null;
        }
        sls slsVar = (sls) g2;
        Object g3 = tpiVar.g(ufp.w);
        if (g3 == null) {
            g3 = null;
        }
        meo meoVar = (meo) g3;
        if (slsVar != null) {
            int ordinal = slsVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2 && g == null) {
                        g = resources.getString(R.string.indeterminate);
                    }
                } else if (meoVar != null && meoVar.a == 2 && g == null) {
                    g = resources.getString(R.string.state_off);
                }
            } else if (meoVar != null && meoVar.a == 2 && g == null) {
                g = resources.getString(R.string.state_on);
            }
        }
        Object g4 = tpiVar.g(ufp.G);
        if (g4 == null) {
            g4 = null;
        }
        Boolean bool = (Boolean) g4;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if ((meoVar == null || meoVar.a != 4) && g == null) {
                g = booleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        Object g5 = tpiVar.g(ufp.c);
        if (g5 == null) {
            g5 = null;
        }
        oum oumVar = (oum) g5;
        if (oumVar != null) {
            if (oumVar != oum.d) {
                if (g == null) {
                    gq4 gq4Var = oumVar.b;
                    float floatValue = ((Number) gq4Var.m()).floatValue() - ((Number) gq4Var.g()).floatValue() == 0.0f ? 0.0f : (oumVar.a - ((Number) gq4Var.g()).floatValue()) / (((Number) gq4Var.m()).floatValue() - ((Number) gq4Var.g()).floatValue());
                    if (floatValue < 0.0f) {
                        floatValue = 0.0f;
                    }
                    if (floatValue > 1.0f) {
                        floatValue = 1.0f;
                    }
                    g = resources.getString(R.string.template_percent, Integer.valueOf(floatValue == 0.0f ? 0 : floatValue == 1.0f ? 100 : yhn.d(Math.round(floatValue * 100), 1, 99)));
                }
            } else if (g == null) {
                g = resources.getString(R.string.in_progress);
            }
        }
        xfp xfpVar = ufp.D;
        if (tpiVar.c(xfpVar)) {
            tpi tpiVar2 = new qfp(qfpVar.a, true, qfpVar.c, jfpVar2).i().a;
            Object g6 = tpiVar2.g(ufp.a);
            if (g6 == null) {
                g6 = null;
            }
            Collection collection = (Collection) g6;
            if (collection == null || collection.isEmpty()) {
                Object g7 = tpiVar2.g(ufp.z);
                if (g7 == null) {
                    g7 = null;
                }
                Collection collection2 = (Collection) g7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object g8 = tpiVar2.g(xfpVar);
                    if (g8 == null) {
                        g8 = null;
                    }
                    CharSequence charSequence = (CharSequence) g8;
                    if (charSequence == null || charSequence.length() == 0) {
                        str = resources.getString(R.string.state_empty);
                    }
                }
            }
            g = str;
        }
        return (String) g;
    }

    public static final mn0 e(qfp qfpVar) {
        Object g = qfpVar.d.a.g(ufp.D);
        if (g == null) {
            g = null;
        }
        mn0 mn0Var = (mn0) g;
        Object g2 = qfpVar.d.a.g(ufp.z);
        if (g2 == null) {
            g2 = null;
        }
        List list = (List) g2;
        return mn0Var == null ? list != null ? (mn0) CollectionsKt.firstOrNull(list) : null : mn0Var;
    }

    public static final boolean f(qfp qfpVar) {
        return qfpVar.c.z == xof.b;
    }

    public static final boolean g(qfp qfpVar, Resources resources) {
        Object g = qfpVar.d.a.g(ufp.a);
        if (g == null) {
            g = null;
        }
        List list = (List) g;
        return !bkp.k0(qfpVar) && (qfpVar.d.c || (qfpVar.m() && ((list != null ? (String) CollectionsKt.firstOrNull(list) : null) != null || e(qfpVar) != null || d(qfpVar, resources) != null || c(qfpVar))));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00e4 A[LOOP:1: B:8:0x003d->B:26:0x00e4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ec A[EDGE_INSN: B:27:0x00ec->B:28:0x00ec BREAK  A[LOOP:1: B:8:0x003d->B:26:0x00e4], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList h(boolean z, List list, upe upeVar, Resources resources) {
        int i;
        soi soiVar = vpe.a;
        soi soiVar2 = new soi();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            b((qfp) list.get(i3), arrayList, soiVar2, upeVar, resources);
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int i4 = 1;
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            int i5 = 0;
            while (true) {
                qfp qfpVar = (qfp) arrayList.get(i5);
                if (i5 != 0) {
                    float f = qfpVar.f().b;
                    float f2 = qfpVar.f().d;
                    int i6 = f >= f2 ? i4 : 0;
                    int size3 = arrayList2.size() - i4;
                    if (size3 >= 0) {
                        int i7 = 0;
                        while (true) {
                            ynn ynnVar = (ynn) ((Pair) arrayList2.get(i7)).a;
                            float f3 = ynnVar.b;
                            i = i4;
                            float f4 = ynnVar.d;
                            int i8 = f3 >= f4 ? i : 0;
                            if (i6 == 0 && i8 == 0 && Math.max(f, f3) < Math.min(f2, f4)) {
                                arrayList2.set(i7, new Pair(new ynn(Math.max(ynnVar.a, 0.0f), Math.max(ynnVar.b, f), Math.min(ynnVar.c, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((Pair) arrayList2.get(i7)).b));
                                ((List) ((Pair) arrayList2.get(i7)).b).add(qfpVar);
                                break;
                            }
                            if (i7 == size3) {
                                break;
                            }
                            i7++;
                            i4 = i;
                        }
                        if (i5 != size2) {
                            break;
                        }
                        i5++;
                        i4 = i;
                    }
                }
                i = i4;
                arrayList2.add(new Pair(qfpVar.f(), u75.j(qfpVar)));
                if (i5 != size2) {
                }
            }
        }
        y75.s(arrayList2, C1318t.n);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = a[!z ? 1 : 0];
        int size4 = arrayList2.size();
        for (int i9 = 0; i9 < size4; i9++) {
            Pair pair = (Pair) arrayList2.get(i9);
            y75.s((List) pair.b, comparator);
            arrayList3.addAll((Collection) pair.b);
        }
        y75.s(arrayList3, new ze0(i2, b));
        while (i2 <= arrayList3.size() - 1) {
            List list2 = (List) soiVar2.b(((qfp) arrayList3.get(i2)).g);
            if (list2 != null) {
                if (g((qfp) arrayList3.get(i2), resources)) {
                    i2++;
                } else {
                    arrayList3.remove(i2);
                }
                arrayList3.addAll(i2, list2);
                i2 += list2.size();
            } else {
                i2++;
            }
        }
        return arrayList3;
    }
}
