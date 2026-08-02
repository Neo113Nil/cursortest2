package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class vjs {
    public final nks a;

    public vjs(nks nksVar) {
        this.a = nksVar;
    }

    public static String a(List list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g9p g9pVar = (g9p) it.next();
            arrayList.add(g9pVar.getType() + StringUtils.PROCESS_POSTFIX_DELIMITER + g9pVar.getTag());
        }
        return CollectionsKt.X(arrayList, ";", "", "", null, 24);
    }

    public static int[] b(s7c s7cVar) {
        if (s7cVar instanceof o7c) {
            o7c o7cVar = (o7c) s7cVar;
            return new int[]{(int) (o7cVar.a.getTime() / 1000), c(o7cVar.b), 2, 0};
        }
        if (s7cVar instanceof n7c) {
            n7c n7cVar = (n7c) s7cVar;
            return new int[]{(int) (n7cVar.a.getTime() / 1000), c(n7cVar.b), 3, Float.floatToIntBits(n7cVar.c / 1000.0f)};
        }
        if (s7cVar instanceof m7c) {
            m7c m7cVar = (m7c) s7cVar;
            return new int[]{(int) (m7cVar.a.getTime() / 1000), c(m7cVar.b), 4, Float.floatToIntBits(m7cVar.c / 1000.0f)};
        }
        if (s7cVar instanceof l7c) {
            l7c l7cVar = (l7c) s7cVar;
            return new int[]{(int) (l7cVar.a.getTime() / 1000), c(l7cVar.b), 5, 0};
        }
        if (s7cVar instanceof k7c) {
            k7c k7cVar = (k7c) s7cVar;
            return new int[]{(int) (k7cVar.a.getTime() / 1000), c(k7cVar.b), 6, Float.floatToIntBits(k7cVar.c / 1000.0f)};
        }
        if (s7cVar instanceof q7c) {
            q7c q7cVar = (q7c) s7cVar;
            return new int[]{(int) (q7cVar.a.getTime() / 1000), c(q7cVar.b), 7, 0};
        }
        if (!(s7cVar instanceof p7c)) {
            return new int[]{-1, -1, -1, 0};
        }
        p7c p7cVar = (p7c) s7cVar;
        return new int[]{(int) (p7cVar.a.getTime() / 1000), c(p7cVar.b), 8, 0};
    }

    public static int c(rr5 rr5Var) {
        try {
            return Integer.parseInt(rr5Var.a);
        } catch (Exception unused) {
            return -1;
        }
    }

    public static int[] e(nks nksVar, int i) {
        int[] iArr = nksVar.k;
        int i2 = nksVar.e;
        int i3 = iArr[i2 + i] + i2 + i;
        nks.a("Invalid telemetry data", i3 >= 0 && i3 < i2 + nksVar.d);
        return Arrays.copyOfRange(iArr, 0, i3);
    }

    public final synchronized x0 d(ArrayList arrayList, int i, int i2) {
        nks nksVar;
        int[] iArr;
        int i3;
        try {
            int[] iArr2 = new int[7];
            iArr2[0] = i;
            iArr2[1] = i2;
            int min = Math.min(arrayList.size(), 256);
            for (int i4 = 0; i4 < 4; i4++) {
                iArr2[i4 + 2] = (i4 * min) + this.a.e;
            }
            iArr2[6] = min;
            int size = arrayList.size() - min;
            for (int i5 = 0; i5 < min; i5++) {
                int[] b = b((s7c) arrayList.get(size + i5));
                for (int i6 = 0; i6 < 4; i6++) {
                    this.a.k[iArr2[i6 + 2] + i5] = b[i6];
                }
            }
            nks.a("Exit code is not 0", this.a.e(iArr2, 2) == 0);
            nksVar = this.a;
            iArr = nksVar.k;
            i3 = nksVar.e;
        } catch (Throwable th) {
            throw th;
        }
        return new x0(iArr[i3], e(nksVar, 2), this.a.d(iArr[i3 + 1]));
    }

    public final synchronized x3n f(int[] iArr, ArrayList arrayList, List list, int[] iArr2) {
        int i;
        int[] iArr3;
        x3n x3nVar;
        try {
            g(iArr2);
            int[] iArr4 = new int[6];
            boolean z = true;
            if (iArr == null || iArr.length <= 0) {
                i = 0;
            } else {
                nks nksVar = this.a;
                int i2 = nksVar.e;
                iArr4[0] = i2;
                i = iArr.length;
                iArr4[1] = i;
                System.arraycopy(iArr, 0, nksVar.k, i2, iArr.length);
            }
            int min = Math.min(arrayList.size(), 256);
            int i3 = this.a.e;
            iArr4[2] = i3 + i;
            int i4 = i + min;
            iArr4[3] = i3 + i4;
            iArr4[4] = min;
            int i5 = i4 + min;
            int size = arrayList.size() - min;
            for (int i6 = 0; i6 < min; i6++) {
                int i7 = size + i6;
                this.a.k[iArr4[2] + i6] = ((k2t) arrayList.get(i7)).a;
                Integer num = ((k2t) arrayList.get(i7)).b;
                this.a.k[iArr4[3] + i6] = num != null ? num.intValue() : -1;
            }
            String a = a(list.size() < 8 ? list : list.subList(0, 8));
            nks nksVar2 = this.a;
            int i8 = nksVar2.e + i5;
            byte[] bytes = a.getBytes(StandardCharsets.UTF_8);
            int min2 = Math.min(bytes.length, 1023);
            int i9 = 0;
            while (true) {
                iArr3 = nksVar2.k;
                if (i9 >= min2) {
                    break;
                }
                iArr3[i8 + i9] = bytes[i9];
                i9++;
            }
            iArr3[i8 + min2] = 0;
            nks nksVar3 = this.a;
            iArr4[5] = nksVar3.e + i5;
            if (nksVar3.e(iArr4, 1) != 0) {
                z = false;
            }
            nks.a("Exit code is not 0", z);
            nks nksVar4 = this.a;
            int[] iArr5 = nksVar4.k;
            int i10 = nksVar4.e;
            int i11 = i10 + 2;
            int i12 = iArr5[i11];
            int i13 = iArr5[i10 + 3];
            int[] copyOfRange = Arrays.copyOfRange(iArr5, i10, i11);
            int[] e = e(this.a, 4);
            String d = this.a.d(i12);
            String d2 = this.a.d(i13);
            copyOfRange.getClass();
            e.getClass();
            x3nVar = new x3n();
            x3nVar.b = copyOfRange;
            x3nVar.c = e;
            x3nVar.a = d;
            x3nVar.d = d2;
        } catch (Throwable th) {
            throw th;
        }
        return x3nVar;
    }

    public final synchronized void g(int[] iArr) {
        if (iArr.length > 0) {
            int min = Math.min(iArr.length, 10000);
            nks nksVar = this.a;
            System.arraycopy(iArr, 0, nksVar.k, nksVar.e, min);
            nks nksVar2 = this.a;
            nks.a("Exit code is not 0", nksVar2.e(new int[]{nksVar2.e, min}, 3) == 0);
        }
    }
}
