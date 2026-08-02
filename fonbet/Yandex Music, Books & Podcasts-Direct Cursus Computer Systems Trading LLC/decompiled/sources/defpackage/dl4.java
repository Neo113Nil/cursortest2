package defpackage;

import android.view.View;
import com.yandex.pulse.metrics.o;
import java.util.Comparator;
import java.util.Date;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class dl4 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ dl4(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Date date;
        Date date2;
        switch (this.a) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                int min = Math.min(str.length(), str2.length());
                int i = 4;
                while (true) {
                    if (i >= min) {
                        int length = str.length();
                        int length2 = str2.length();
                        if (length == length2) {
                            return 0;
                        }
                        if (length < length2) {
                            return -1;
                        }
                    } else {
                        char charAt = str.charAt(i);
                        char charAt2 = str2.charAt(i);
                        if (charAt == charAt2) {
                            i++;
                        } else if (Intrinsics.e(charAt, charAt2) < 0) {
                            return -1;
                        }
                    }
                }
                return 1;
            case 1:
                return gl5.b(Float.valueOf(((kps) obj).a.c), Float.valueOf(((kps) obj2).a.c));
            case 2:
                return gl5.b(q7g.R(((s75) obj).a()), q7g.R(((s75) obj2).a()));
            case 3:
                return gl5.b(q7g.R(((s75) obj).b()), q7g.R(((s75) obj2).b()));
            case 4:
                return gl5.b(((s75) obj2).c(), ((s75) obj).c());
            case 5:
                s75 s75Var = (s75) obj2;
                s75Var.getClass();
                if (!(s75Var instanceof q75)) {
                    if (s75Var instanceof r75) {
                        date = ((r75) s75Var).a.i;
                    }
                    b6e.s();
                    return 0;
                }
                date = ((q75) s75Var).a.E;
                s75 s75Var2 = (s75) obj;
                s75Var2.getClass();
                if (!(s75Var2 instanceof q75)) {
                    if (s75Var2 instanceof r75) {
                        date2 = ((r75) s75Var2).a.i;
                    }
                    b6e.s();
                    return 0;
                }
                date2 = ((q75) s75Var2).a.E;
                return gl5.b(date, date2);
            case 6:
                return gl5.b(q7g.R(((c01) obj).b), q7g.R(((c01) obj2).b));
            case 7:
                return gl5.b(((c01) obj2).r, ((c01) obj).r);
            case 8:
                return gl5.b(Long.valueOf(((cvl) obj).m), Long.valueOf(((cvl) obj2).m));
            case 9:
                return gl5.b(q7g.R(((cvl) obj).b), q7g.R(((cvl) obj2).b));
            case 10:
                return gl5.b(((cvl) obj2).o, ((cvl) obj).o);
            case 11:
                return gl5.b(((cvl) obj2).n, ((cvl) obj).n);
            case 12:
                return gl5.b(((cvl) obj2).A, ((cvl) obj).A);
            case 13:
                return ((k85) obj2).b() - ((k85) obj).b();
            case 14:
                return gl5.b((Integer) ((Pair) obj).a, (Integer) ((Pair) obj2).a);
            case 15:
                WeakHashMap weakHashMap = wdu.a;
                float h = ndu.h((View) obj);
                float h2 = ndu.h((View) obj2);
                if (h > h2) {
                    return -1;
                }
                return h < h2 ? 1 : 0;
            case 16:
                return gl5.b(Long.valueOf(((tk2) obj).a), Long.valueOf(((tk2) obj2).a));
            case 17:
                return gl5.b(Long.valueOf(((cgg) obj).a), Long.valueOf(((cgg) obj2).a));
            case 18:
                mpf mpfVar = (mpf) obj;
                mpf mpfVar2 = (mpf) obj2;
                int e = Intrinsics.e(mpfVar.p, mpfVar2.p);
                return e != 0 ? e : Intrinsics.e(mpfVar.hashCode(), mpfVar2.hashCode());
            case 19:
                return ((d38) obj).a - ((d38) obj2).a;
            case 20:
                Date date3 = ((t2m) obj2).b;
                Long valueOf = date3 != null ? Long.valueOf(date3.getTime()) : null;
                Date date4 = ((t2m) obj).b;
                return gl5.b(valueOf, date4 != null ? Long.valueOf(date4.getTime()) : null);
            case 21:
                return gl5.b((Float) ((Pair) obj).b, (Float) ((Pair) obj2).b);
            case 22:
                b8t b8tVar = (b8t) obj2;
                b8t b8tVar2 = (b8t) obj;
                return gl5.b(Long.valueOf(b8tVar.b + b8tVar.c), Long.valueOf(b8tVar2.b + b8tVar2.c));
            case 23:
                oq4 oq4Var = ((vaa) obj).a;
                oq4 oq4Var2 = oq4.f;
                return gl5.b(Boolean.valueOf(oq4Var == oq4Var2), Boolean.valueOf(((vaa) obj2).a == oq4Var2));
            case 24:
                oq4 oq4Var3 = ((vaa) obj).a;
                oq4 oq4Var4 = oq4.e;
                return gl5.b(Boolean.valueOf(oq4Var3 == oq4Var4), Boolean.valueOf(((vaa) obj2).a == oq4Var4));
            case 25:
                return gl5.b(Integer.valueOf(((vaa) obj).b), Integer.valueOf(((vaa) obj2).b));
            case 26:
                zp2 zp2Var = (zp2) CollectionsKt.firstOrNull(((kca) obj).a.n);
                String R = q7g.R(zp2Var != null ? zp2Var.b : null);
                zp2 zp2Var2 = (zp2) CollectionsKt.firstOrNull(((kca) obj2).a.n);
                return gl5.b(R, q7g.R(zp2Var2 != null ? zp2Var2.b : null));
            case 27:
                return gl5.b(q7g.R(((kca) obj).a.b), q7g.R(((kca) obj2).a.b));
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return gl5.b(Long.valueOf(((kca) obj2).b), Long.valueOf(((kca) obj).b));
            default:
                return gl5.b(q7g.R(((pda) obj).a.b), q7g.R(((pda) obj2).a.b));
        }
    }
}
