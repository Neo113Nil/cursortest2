package defpackage;

import com.yandex.pulse.metrics.o;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class mj implements Comparator {
    public final /* synthetic */ int a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return Integer.compare(((dsc) obj).j, ((dsc) obj2).j);
            case 1:
                return Long.compare(((z7w) obj).a, ((z7w) obj2).a);
            case 2:
                return ((dsc) obj2).j - ((dsc) obj).j;
            case 3:
                mu2 mu2Var = (mu2) obj;
                mu2 mu2Var2 = (mu2) obj2;
                int compare = Integer.compare(mu2Var.c, mu2Var2.c);
                return compare != 0 ? compare : mu2Var.b.compareTo(mu2Var2.b);
            case 4:
                return Integer.compare(((t94) obj2).b, ((t94) obj).b);
            case 5:
                return Intrinsics.e(((fye) obj).b, ((fye) obj2).b);
            case 6:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 7:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 8:
                String name = ((File) obj).getName();
                int i = tq6.f;
                return name.substring(0, i).compareTo(((File) obj2).getName().substring(0, i));
            case 9:
                return Integer.compare(((ss7) ((List) obj).get(0)).f, ((ss7) ((List) obj2).get(0)).f);
            case 10:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i2 = 15;
                return bl5.f(bt7.c((bt7) Collections.max(list, new mj(14)), (bt7) Collections.max(list2, new mj(14)))).a(list.size(), list2.size()).b((bt7) Collections.max(list, new mj(i2)), (bt7) Collections.max(list2, new mj(i2)), new mj(i2)).e();
            case 11:
                return ((rs7) Collections.max((List) obj)).compareTo((rs7) Collections.max((List) obj2));
            case 12:
                return ((ys7) ((List) obj).get(0)).compareTo((ys7) ((List) obj2).get(0));
            case 13:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 14:
                return bt7.c((bt7) obj, (bt7) obj2);
            case 15:
                bt7 bt7Var = (bt7) obj;
                bt7 bt7Var2 = (bt7) obj2;
                boolean z = bt7Var.e;
                int i3 = bt7Var.j;
                zwj a = (z && bt7Var.h) ? ct7.j : ct7.j.a();
                boolean z2 = bt7Var.f.B;
                dl5 dl5Var = dl5.a;
                if (z2) {
                    dl5Var = dl5Var.b(Integer.valueOf(i3), Integer.valueOf(bt7Var2.j), ct7.j.a());
                }
                return dl5Var.b(Integer.valueOf(bt7Var.k), Integer.valueOf(bt7Var2.k), a).b(Integer.valueOf(i3), Integer.valueOf(bt7Var2.j), a).e();
            case 16:
                pm9 pm9Var = (pm9) obj;
                pm9 pm9Var2 = (pm9) obj2;
                long j = pm9Var.a;
                List list3 = pm9Var.b;
                long j2 = pm9Var2.a;
                List list4 = pm9Var2.b;
                if (j != j2) {
                    return (int) (j - j2);
                }
                int min = Math.min(list3.size(), list4.size());
                for (int i4 = 0; i4 < min; i4++) {
                    Pair pair = (Pair) list3.get(i4);
                    Pair pair2 = (Pair) list4.get(i4);
                    int compareTo = ((String) pair.a).compareTo((String) pair2.a);
                    if (compareTo != 0) {
                        return compareTo;
                    }
                    int compareTo2 = ((String) pair.b).compareTo((String) pair2.b);
                    if (compareTo2 != 0) {
                        return compareTo2;
                    }
                }
                return list3.size() - list4.size();
            case 17:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i5 = 0; i5 < bArr.length; i5++) {
                    byte b = bArr[i5];
                    byte b2 = bArr2[i5];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 18:
                Pair pair3 = (Pair) obj;
                Pair pair4 = (Pair) obj2;
                return (((Number) pair3.b).intValue() - ((Number) pair3.a).intValue()) - (((Number) pair4.b).intValue() - ((Number) pair4.a).intValue());
            case 19:
                mpf mpfVar = (mpf) obj;
                mpf mpfVar2 = (mpf) obj2;
                float f = mpfVar.G.p.F;
                float f2 = mpfVar2.G.p.F;
                return f == f2 ? Intrinsics.e(mpfVar.v(), mpfVar2.v()) : Float.compare(f, f2);
            case 20:
                return Intrinsics.e(((vtf) obj).getIndex(), ((vtf) obj2).getIndex());
            case 21:
                jq3 jq3Var = (jq3) obj;
                jq3 jq3Var2 = (jq3) obj2;
                long j3 = jq3Var.f;
                long j4 = jq3Var2.f;
                return j3 - j4 == 0 ? jq3Var.compareTo(jq3Var2) : j3 < j4 ? -1 : 1;
            case 22:
                g8g g8gVar = (g8g) obj;
                g8g g8gVar2 = (g8g) obj2;
                int i6 = g8gVar.c;
                int i7 = g8gVar2.c;
                if (i6 < i7) {
                    return -1;
                }
                if (i6 > i7) {
                    return 1;
                }
                return Integer.compare(g8gVar2.d, g8gVar.d);
            case 23:
                rre rreVar = mzi.b;
                int i8 = ((h6r) obj).a;
                rreVar.getClass();
                return rre.V(i8).compareTo(rre.V(((h6r) obj2).a));
            case 24:
                return Long.compare(((Long) obj2).longValue(), ((Long) obj).longValue());
            case 25:
                onm onmVar = (onm) obj;
                onm onmVar2 = (onm) obj2;
                jnm jnmVar = onmVar.a;
                jnm jnmVar2 = onmVar2.a;
                jnmVar.getClass();
                jnmVar2.getClass();
                if (jnmVar.a - jnmVar2.a > 0) {
                    return -1;
                }
                jnm jnmVar3 = onmVar.a;
                jnm jnmVar4 = onmVar2.a;
                jnmVar3.getClass();
                jnmVar4.getClass();
                return jnmVar3.a - jnmVar4.a < 0 ? 1 : 0;
            case 26:
                File file = (File) obj;
                File file2 = (File) obj2;
                file2.getClass();
                file.getClass();
                int e = Intrinsics.e(file2.getName().length(), file.getName().length());
                return e == 0 ? file2.compareTo(file) : e;
            case 27:
                return krd.b(((lio) obj).a.c, ((lio) obj2).a.c);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return Long.compare(((luo) obj).a, ((luo) obj2).a);
            default:
                return ((vb2) ((rp6) obj)).a.compareTo(((vb2) ((rp6) obj2)).a);
        }
    }

    public /* synthetic */ mj(int i) {
        this.a = i;
    }
}
