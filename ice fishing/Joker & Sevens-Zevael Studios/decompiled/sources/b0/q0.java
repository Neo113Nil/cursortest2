package b0;

import java.util.Arrays;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class q0 implements u {

    /* renamed from: a, reason: collision with root package name */
    public int f873a;

    /* renamed from: b, reason: collision with root package name */
    public Object f874b;

    /* renamed from: c, reason: collision with root package name */
    public Object f875c;

    public z7.b a() {
        if (!"".isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(""));
        }
        String str = (String) this.f874b;
        return new z7.b(this.f873a, ((Long) this.f875c).longValue(), str);
    }

    @Override // b0.u
    public int b(Object obj) {
        s.z zVar = (s.z) this.f874b;
        int d10 = zVar.d(obj);
        if (d10 >= 0) {
            return zVar.f6364c[d10];
        }
        return -1;
    }

    public void c(int i10) {
        if (i10 < 0 || i10 >= this.f873a) {
            throw new IndexOutOfBoundsException("Index " + i10 + ", size " + this.f873a);
        }
    }

    public h d(int i10) {
        c(i10);
        h hVar = (h) this.f875c;
        if (hVar != null) {
            int i11 = hVar.f825a;
            if (i10 < hVar.f826b + i11 && i11 <= i10) {
                return hVar;
            }
        }
        o0.e eVar = (o0.e) this.f874b;
        h hVar2 = (h) eVar.f5134g[a.a.e(i10, eVar)];
        this.f875c = hVar2;
        return hVar2;
    }

    public void e(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, boolean z11) {
        long[] jArr = (long[]) this.f874b;
        int i16 = this.f873a;
        int i17 = i16 + 3;
        this.f873a = i17;
        int length = jArr.length;
        if (length <= i17) {
            int max = Math.max(length * 2, i17);
            long[] copyOf = Arrays.copyOf(jArr, max);
            pc.j.d(copyOf, "copyOf(...)");
            this.f874b = copyOf;
            long[] copyOf2 = Arrays.copyOf((long[]) this.f875c, max);
            pc.j.d(copyOf2, "copyOf(...)");
            this.f875c = copyOf2;
        }
        long[] jArr2 = (long[]) this.f874b;
        jArr2[i16] = (i11 << 32) | (i12 & 4294967295L);
        jArr2[i16 + 1] = (i13 << 32) | (i14 & 4294967295L);
        int i18 = i15 & 67108863;
        jArr2[i16 + 2] = ((z11 ? 1L : 0L) << 63) | ((z10 ? 1L : 0L) << 62) | (1 << 61) | (0 << 52) | (i18 << 26) | (i10 & 67108863);
        if (i15 < 0) {
            return;
        }
        for (int i19 = i16 - 3; i19 >= 0; i19 -= 3) {
            int i20 = i19 + 2;
            long j3 = jArr2[i20];
            if ((((int) j3) & 67108863) == i18) {
                jArr2[i20] = (j3 & (-2301339409586323457L)) | (((i16 - i19) & 511) << 52);
                return;
            }
        }
    }

    public void f(int i10, oc.g gVar) {
        int i11 = i10 & 67108863;
        long[] jArr = (long[]) this.f874b;
        int i12 = this.f873a;
        for (int i13 = 0; i13 < jArr.length - 2 && i13 < i12; i13 += 3) {
            if ((((int) jArr[i13 + 2]) & 67108863) == i11) {
                long j3 = jArr[i13];
                long j6 = jArr[i13 + 1];
                gVar.d(Integer.valueOf((int) (j3 >> 32)), Integer.valueOf((int) j3), Integer.valueOf((int) (j6 >> 32)), Integer.valueOf((int) j6));
                return;
            }
        }
    }
}
