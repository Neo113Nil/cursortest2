package defpackage;

import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public class rnz implements Cloneable {
    public /* synthetic */ boolean a;
    public /* synthetic */ long[] b;
    public /* synthetic */ Object[] c;
    public /* synthetic */ int w;

    public rnz(int i) {
        if (i == 0) {
            this.b = cvw.b;
            this.c = cvw.c;
            return;
        }
        int i2 = i * 8;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.b = new long[i5];
        this.c = new Object[i5];
    }

    public final void a(long j, Long l) {
        int i = this.w;
        if (i != 0 && j <= this.b[i - 1]) {
            h(j, l);
            return;
        }
        if (this.a) {
            long[] jArr = this.b;
            if (i >= jArr.length) {
                Object[] objArr = this.c;
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    Object obj = objArr[i3];
                    if (obj != dai0.b) {
                        if (i3 != i2) {
                            jArr[i2] = jArr[i3];
                            objArr[i2] = obj;
                            objArr[i3] = null;
                        }
                        i2++;
                    }
                }
                this.a = false;
                this.w = i2;
            }
        }
        int i4 = this.w;
        if (i4 >= this.b.length) {
            int i5 = (i4 + 1) * 8;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 8;
            this.b = Arrays.copyOf(this.b, i8);
            this.c = Arrays.copyOf(this.c, i8);
        }
        this.b[i4] = j;
        this.c[i4] = l;
        this.w = i4 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final rnz clone() {
        rnz rnzVar = (rnz) super.clone();
        rnzVar.b = (long[]) this.b.clone();
        rnzVar.c = (Object[]) this.c.clone();
        return rnzVar;
    }

    public final Object c(long j) {
        Object obj;
        int b = cvw.b(j, this.w, this.b);
        if (b < 0 || (obj = this.c[b]) == dai0.b) {
            return null;
        }
        return obj;
    }

    public final void clear() {
        int i = this.w;
        Object[] objArr = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.w = 0;
        this.a = false;
    }

    public final Object d(long j, Long l) {
        Object obj;
        int b = cvw.b(j, this.w, this.b);
        return (b < 0 || (obj = this.c[b]) == dai0.b) ? l : obj;
    }

    public final int e(long j) {
        if (this.a) {
            int i = this.w;
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != dai0.b) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.a = false;
            this.w = i2;
        }
        return cvw.b(j, this.w, this.b);
    }

    public final boolean f() {
        return j() == 0;
    }

    public final long g(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.w)) {
            xva1.b("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.a) {
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != dai0.b) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.a = false;
            this.w = i3;
        }
        return this.b[i];
    }

    public final void h(long j, Object obj) {
        Object obj2 = dai0.b;
        int b = cvw.b(j, this.w, this.b);
        if (b >= 0) {
            this.c[b] = obj;
            return;
        }
        int i = ~b;
        int i2 = this.w;
        if (i < i2) {
            Object[] objArr = this.c;
            if (objArr[i] == obj2) {
                this.b[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.a) {
            long[] jArr = this.b;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.c;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.a = false;
                this.w = i3;
                i = ~cvw.b(j, i3, this.b);
            }
        }
        int i5 = this.w;
        if (i5 >= this.b.length) {
            int i6 = (i5 + 1) * 8;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 8;
            this.b = Arrays.copyOf(this.b, i9);
            this.c = Arrays.copyOf(this.c, i9);
        }
        int i10 = this.w;
        if (i10 - i != 0) {
            long[] jArr2 = this.b;
            int i11 = i + 1;
            f73.f(jArr2, jArr2, i11, i, i10);
            Object[] objArr3 = this.c;
            f73.g(objArr3, i11, objArr3, i, this.w);
        }
        this.b[i] = j;
        this.c[i] = obj;
        this.w++;
    }

    public final void i(long j) {
        int b = cvw.b(j, this.w, this.b);
        if (b >= 0) {
            Object[] objArr = this.c;
            Object obj = objArr[b];
            Object obj2 = dai0.b;
            if (obj != obj2) {
                objArr[b] = obj2;
                this.a = true;
            }
        }
    }

    public final int j() {
        if (this.a) {
            int i = this.w;
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != dai0.b) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.a = false;
            this.w = i2;
        }
        return this.w;
    }

    public final Object l(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.w)) {
            xva1.b("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.a) {
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != dai0.b) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.a = false;
            this.w = i3;
        }
        return this.c[i];
    }

    public final String toString() {
        if (j() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.w * 28);
        sb.append('{');
        int i = this.w;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(Extension.FIX_SPACE);
            }
            sb.append(g(i2));
            sb.append('=');
            Object l = l(i2);
            if (l != sb) {
                sb.append(l);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public rnz() {
        this((Object) null);
    }

    public /* synthetic */ rnz(Object obj) {
        this(10);
    }
}
