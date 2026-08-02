package defpackage;

import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.z;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class umh extends tmh {
    public final boolean A;
    public final boolean B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final boolean I;
    public final int J;
    public final boolean K;
    public final int L;
    public final boolean M;
    public final boolean N;
    public final int O;
    public final boolean x;
    public final omh y;
    public final boolean z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0100 A[EDGE_INSN: B:107:0x0100->B:73:0x0100 BREAK  A[LOOP:1: B:65:0x00e5->B:105:0x00fd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public umh(int i, xzz0 xzz0Var, int i2, omh omhVar, int i3, String str, int i4, boolean z) {
        super(i, xzz0Var, i2);
        boolean z2;
        boolean z3;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z4;
        omh omhVar2;
        a aVar;
        int i9;
        a aVar2;
        int i10;
        int i11;
        float f;
        int i12;
        a aVar3;
        int i13;
        int i14;
        int i15;
        this.y = omhVar;
        boolean z5 = omhVar.x;
        ImmutableList immutableList = omhVar.i;
        ImmutableList immutableList2 = omhVar.j;
        int i16 = z5 ? 24 : 16;
        int i17 = 0;
        this.K = false;
        if (z && (((i13 = (aVar3 = this.w).u) == -1 || i13 <= omhVar.a) && ((i14 = aVar3.v) == -1 || i14 <= omhVar.b))) {
            float f2 = aVar3.w;
            if ((f2 == -1.0f || f2 <= omhVar.c) && ((i15 = aVar3.j) == -1 || i15 <= omhVar.d)) {
                z2 = true;
                this.x = z2;
                if (z && (((i10 = (aVar2 = this.w).u) == -1 || i10 >= 0) && ((i11 = aVar2.v) == -1 || i11 >= 0))) {
                    f = aVar2.w;
                    if ((f != -1.0f || f >= 0.0f) && ((i12 = aVar2.j) == -1 || i12 >= 0)) {
                        z3 = true;
                        this.z = z3;
                        this.A = iyi0.e(i3, false);
                        a aVar4 = this.w;
                        float f3 = aVar4.w;
                        this.B = f3 == -1.0f && f3 >= 10.0f;
                        this.C = aVar4.j;
                        int i18 = aVar4.u;
                        this.D = (i18 != -1 || (i9 = aVar4.v) == -1) ? -1 : i18 * i9;
                        i5 = 0;
                        while (true) {
                            i6 = Integer.MAX_VALUE;
                            if (i5 < immutableList2.size()) {
                                i7 = 0;
                                i5 = Integer.MAX_VALUE;
                                break;
                            } else {
                                i7 = vmh.getFormatLanguageScore(this.w, (String) immutableList2.get(i5), false);
                                if (i7 > 0) {
                                    break;
                                } else {
                                    i5++;
                                }
                            }
                        }
                        this.F = i5;
                        this.G = i7;
                        this.H = vmh.access$4200(this.w.f, 0);
                        int i19 = this.w.f;
                        this.I = (i19 == 0 && (i19 & 1) == 0) ? false : true;
                        this.J = vmh.getFormatLanguageScore(this.w, str, vmh.normalizeUndeterminedLanguageToNull(str) != null);
                        i8 = 0;
                        while (true) {
                            if (i8 < immutableList.size()) {
                                String str2 = this.w.n;
                                if (str2 != null && str2.equals(immutableList.get(i8))) {
                                    i6 = i8;
                                    break;
                                }
                                i8++;
                            } else {
                                break;
                            }
                        }
                        this.E = i6;
                        this.M = (i3 & 384) != 128;
                        this.N = (i3 & 64) != 64;
                        this.O = vmh.access$4300(this.w.n);
                        z4 = this.x;
                        omhVar2 = this.y;
                        aVar = this.w;
                        if ((aVar.f & 16384) == 0 && iyi0.e(i3, omhVar2.B) && (z4 || omhVar2.w)) {
                            i17 = (iyi0.e(i3, false) || !this.z || !z4 || aVar.j == -1 || omhVar2.s || (i16 & i3) == 0) ? 1 : 2;
                        }
                        this.L = i17;
                    }
                }
                z3 = false;
                this.z = z3;
                this.A = iyi0.e(i3, false);
                a aVar42 = this.w;
                float f32 = aVar42.w;
                this.B = f32 == -1.0f && f32 >= 10.0f;
                this.C = aVar42.j;
                int i182 = aVar42.u;
                this.D = (i182 != -1 || (i9 = aVar42.v) == -1) ? -1 : i182 * i9;
                i5 = 0;
                while (true) {
                    i6 = Integer.MAX_VALUE;
                    if (i5 < immutableList2.size()) {
                    }
                    i5++;
                }
                this.F = i5;
                this.G = i7;
                this.H = vmh.access$4200(this.w.f, 0);
                int i192 = this.w.f;
                this.I = (i192 == 0 && (i192 & 1) == 0) ? false : true;
                this.J = vmh.getFormatLanguageScore(this.w, str, vmh.normalizeUndeterminedLanguageToNull(str) != null);
                i8 = 0;
                while (true) {
                    if (i8 < immutableList.size()) {
                    }
                    i8++;
                }
                this.E = i6;
                this.M = (i3 & 384) != 128;
                this.N = (i3 & 64) != 64;
                this.O = vmh.access$4300(this.w.n);
                z4 = this.x;
                omhVar2 = this.y;
                aVar = this.w;
                if ((aVar.f & 16384) == 0) {
                    if (iyi0.e(i3, false)) {
                    }
                }
                this.L = i17;
            }
        }
        z2 = false;
        this.x = z2;
        if (z) {
            f = aVar2.w;
            if (f != -1.0f) {
            }
            z3 = true;
            this.z = z3;
            this.A = iyi0.e(i3, false);
            a aVar422 = this.w;
            float f322 = aVar422.w;
            this.B = f322 == -1.0f && f322 >= 10.0f;
            this.C = aVar422.j;
            int i1822 = aVar422.u;
            this.D = (i1822 != -1 || (i9 = aVar422.v) == -1) ? -1 : i1822 * i9;
            i5 = 0;
            while (true) {
                i6 = Integer.MAX_VALUE;
                if (i5 < immutableList2.size()) {
                }
                i5++;
            }
            this.F = i5;
            this.G = i7;
            this.H = vmh.access$4200(this.w.f, 0);
            int i1922 = this.w.f;
            this.I = (i1922 == 0 && (i1922 & 1) == 0) ? false : true;
            this.J = vmh.getFormatLanguageScore(this.w, str, vmh.normalizeUndeterminedLanguageToNull(str) != null);
            i8 = 0;
            while (true) {
                if (i8 < immutableList.size()) {
                }
                i8++;
            }
            this.E = i6;
            this.M = (i3 & 384) != 128;
            this.N = (i3 & 64) != 64;
            this.O = vmh.access$4300(this.w.n);
            z4 = this.x;
            omhVar2 = this.y;
            aVar = this.w;
            if ((aVar.f & 16384) == 0) {
            }
            this.L = i17;
        }
        z3 = false;
        this.z = z3;
        this.A = iyi0.e(i3, false);
        a aVar4222 = this.w;
        float f3222 = aVar4222.w;
        this.B = f3222 == -1.0f && f3222 >= 10.0f;
        this.C = aVar4222.j;
        int i18222 = aVar4222.u;
        this.D = (i18222 != -1 || (i9 = aVar4222.v) == -1) ? -1 : i18222 * i9;
        i5 = 0;
        while (true) {
            i6 = Integer.MAX_VALUE;
            if (i5 < immutableList2.size()) {
            }
            i5++;
        }
        this.F = i5;
        this.G = i7;
        this.H = vmh.access$4200(this.w.f, 0);
        int i19222 = this.w.f;
        this.I = (i19222 == 0 && (i19222 & 1) == 0) ? false : true;
        this.J = vmh.getFormatLanguageScore(this.w, str, vmh.normalizeUndeterminedLanguageToNull(str) != null);
        i8 = 0;
        while (true) {
            if (i8 < immutableList.size()) {
            }
            i8++;
        }
        this.E = i6;
        this.M = (i3 & 384) != 128;
        this.N = (i3 & 64) != 64;
        this.O = vmh.access$4300(this.w.n);
        z4 = this.x;
        omhVar2 = this.y;
        aVar = this.w;
        if ((aVar.f & 16384) == 0) {
        }
        this.L = i17;
    }

    public static int c(umh umhVar, umh umhVar2) {
        jvc b = jvc.a.c(umhVar.A, umhVar2.A).b(Integer.valueOf(umhVar.F), Integer.valueOf(umhVar2.F), z.c().g()).a(umhVar.G, umhVar2.G).a(umhVar.H, umhVar2.H).c(umhVar.I, umhVar2.I).a(umhVar.J, umhVar2.J).c(umhVar.B, umhVar2.B).c(umhVar.x, umhVar2.x).c(umhVar.z, umhVar2.z).b(Integer.valueOf(umhVar.E), Integer.valueOf(umhVar2.E), z.c().g());
        boolean z = umhVar.M;
        jvc c = b.c(z, umhVar2.M);
        boolean z2 = umhVar.N;
        jvc c2 = c.c(z2, umhVar2.N);
        if (z && z2) {
            c2 = c2.a(umhVar.O, umhVar2.O);
        }
        return c2.e();
    }

    @Override // defpackage.tmh
    public final int a() {
        return this.L;
    }

    @Override // defpackage.tmh
    public final boolean b(tmh tmhVar) {
        umh umhVar = (umh) tmhVar;
        return (this.K || Objects.equals(this.w.n, umhVar.w.n)) && this.M == umhVar.M && this.N == umhVar.N;
    }
}
