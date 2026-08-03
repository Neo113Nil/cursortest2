package s;

import java.util.Arrays;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public long[] f6349a;

    /* renamed from: b, reason: collision with root package name */
    public int f6350b;

    public w(int i10) {
        this.f6349a = i10 == 0 ? n.f6306a : new long[i10];
    }

    public final void a(long j3) {
        int i10 = this.f6350b + 1;
        long[] jArr = this.f6349a;
        if (jArr.length < i10) {
            long[] copyOf = Arrays.copyOf(jArr, Math.max(i10, (jArr.length * 3) / 2));
            pc.j.d(copyOf, "copyOf(...)");
            this.f6349a = copyOf;
        }
        long[] jArr2 = this.f6349a;
        int i11 = this.f6350b;
        jArr2[i11] = j3;
        this.f6350b = i11 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            int i10 = wVar.f6350b;
            int i11 = this.f6350b;
            if (i10 == i11) {
                long[] jArr = this.f6349a;
                long[] jArr2 = wVar.f6349a;
                uc.d q10 = uc.e.q(0, i11);
                int i12 = q10.f6735g;
                int i13 = q10.f6736h;
                if (i12 > i13) {
                    return true;
                }
                while (jArr[i12] == jArr2[i12]) {
                    if (i12 == i13) {
                        return true;
                    }
                    i12++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.f6349a;
        int i10 = this.f6350b;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += Long.hashCode(jArr[i12]) * 31;
        }
        return i11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.f6349a;
        int i10 = this.f6350b;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                sb.append((CharSequence) "]");
                break;
            }
            long j3 = jArr[i11];
            if (i11 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i11 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(j3);
            i11++;
        }
        String sb2 = sb.toString();
        pc.j.d(sb2, "toString(...)");
        return sb2;
    }
}
