package s;

import java.util.Arrays;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class o implements Cloneable {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ boolean f6308g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ long[] f6309h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object[] f6310i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ int f6311j;

    public o(int i10) {
        if (i10 == 0) {
            this.f6309h = t.a.f6508b;
            this.f6310i = t.a.f6509c;
            return;
        }
        int i11 = i10 * 8;
        int i12 = 4;
        while (true) {
            if (i12 >= 32) {
                break;
            }
            int i13 = (1 << i12) - 12;
            if (i11 <= i13) {
                i11 = i13;
                break;
            }
            i12++;
        }
        int i14 = i11 / 8;
        this.f6309h = new long[i14];
        this.f6310i = new Object[i14];
    }

    public final long a(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f6311j)) {
            t.a.c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        if (this.f6308g) {
            long[] jArr = this.f6309h;
            Object[] objArr = this.f6310i;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != p.f6313a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f6308g = false;
            this.f6311j = i12;
        }
        return this.f6309h[i10];
    }

    public final void b(long j3, Object obj) {
        Object obj2 = p.f6313a;
        int b2 = t.a.b(this.f6309h, this.f6311j, j3);
        if (b2 >= 0) {
            this.f6310i[b2] = obj;
            return;
        }
        int i10 = ~b2;
        int i11 = this.f6311j;
        if (i10 < i11) {
            Object[] objArr = this.f6310i;
            if (objArr[i10] == obj2) {
                this.f6309h[i10] = j3;
                objArr[i10] = obj;
                return;
            }
        }
        if (this.f6308g) {
            long[] jArr = this.f6309h;
            if (i11 >= jArr.length) {
                Object[] objArr2 = this.f6310i;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj3 = objArr2[i13];
                    if (obj3 != obj2) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr2[i12] = obj3;
                            objArr2[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f6308g = false;
                this.f6311j = i12;
                i10 = ~t.a.b(this.f6309h, i12, j3);
            }
        }
        int i14 = this.f6311j;
        if (i14 >= this.f6309h.length) {
            int i15 = (i14 + 1) * 8;
            int i16 = 4;
            while (true) {
                if (i16 >= 32) {
                    break;
                }
                int i17 = (1 << i16) - 12;
                if (i15 <= i17) {
                    i15 = i17;
                    break;
                }
                i16++;
            }
            int i18 = i15 / 8;
            long[] copyOf = Arrays.copyOf(this.f6309h, i18);
            pc.j.d(copyOf, "copyOf(...)");
            this.f6309h = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f6310i, i18);
            pc.j.d(copyOf2, "copyOf(...)");
            this.f6310i = copyOf2;
        }
        int i19 = this.f6311j;
        if (i19 - i10 != 0) {
            long[] jArr2 = this.f6309h;
            int i20 = i10 + 1;
            bc.l.Q(jArr2, jArr2, i20, i10, i19);
            Object[] objArr3 = this.f6310i;
            bc.l.R(objArr3, objArr3, i20, i10, this.f6311j);
        }
        this.f6309h[i10] = j3;
        this.f6310i[i10] = obj;
        this.f6311j++;
    }

    public final void c(long j3) {
        int b2 = t.a.b(this.f6309h, this.f6311j, j3);
        if (b2 >= 0) {
            Object[] objArr = this.f6310i;
            Object obj = objArr[b2];
            Object obj2 = p.f6313a;
            if (obj != obj2) {
                objArr[b2] = obj2;
                this.f6308g = true;
            }
        }
    }

    public final Object clone() {
        Object clone = super.clone();
        pc.j.c(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        o oVar = (o) clone;
        oVar.f6309h = (long[]) this.f6309h.clone();
        oVar.f6310i = (Object[]) this.f6310i.clone();
        return oVar;
    }

    public final int d() {
        if (this.f6308g) {
            int i10 = this.f6311j;
            long[] jArr = this.f6309h;
            Object[] objArr = this.f6310i;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != p.f6313a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f6308g = false;
            this.f6311j = i11;
        }
        return this.f6311j;
    }

    public final Object e(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f6311j)) {
            t.a.c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        if (this.f6308g) {
            long[] jArr = this.f6309h;
            Object[] objArr = this.f6310i;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != p.f6313a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f6308g = false;
            this.f6311j = i12;
        }
        return this.f6310i[i10];
    }

    public final String toString() {
        if (d() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f6311j * 28);
        sb.append('{');
        int i10 = this.f6311j;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            sb.append(a(i11));
            sb.append('=');
            Object e10 = e(i11);
            if (e10 != sb) {
                sb.append(e10);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        pc.j.d(sb2, "toString(...)");
        return sb2;
    }

    public /* synthetic */ o(Object obj) {
        this(10);
    }
}
