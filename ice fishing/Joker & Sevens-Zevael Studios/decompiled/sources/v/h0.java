package v;

import java.util.Arrays;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h0 implements u {

    /* renamed from: a, reason: collision with root package name */
    public final e3.j f6852a;

    public h0(e3.j jVar) {
        this.f6852a = jVar;
    }

    @Override // v.u, v.h
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final o1 a(x4.s sVar) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i10;
        e3.j jVar = this.f6852a;
        s.u uVar = (s.u) jVar.f2092c;
        s.t tVar = new s.t(uVar.f6299e + 2);
        s.u uVar2 = new s.u(uVar.f6299e);
        int[] iArr3 = uVar.f6296b;
        Object[] objArr3 = uVar.f6297c;
        long[] jArr = uVar.f6295a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j3 = jArr[i11];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j3 & 255) < 128) {
                            int i15 = (i11 << 3) + i14;
                            int i16 = iArr3[i15];
                            i10 = i12;
                            g0 g0Var = (g0) objArr3[i15];
                            tVar.a(i16);
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            uVar2.h(i16, new n1((n) ((oc.c) sVar.f8356h).invoke(g0Var.f6849a), g0Var.f6850b));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i10 = i12;
                        }
                        j3 >>= i10;
                        i14++;
                        iArr3 = iArr2;
                        i12 = i10;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i13 != i12) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!uVar.a(0)) {
            int i17 = tVar.f6342b;
            if (i17 < 0) {
                t.a.d("Index must be between 0 and size");
                throw null;
            }
            tVar.b(i17 + 1);
            int[] iArr4 = tVar.f6341a;
            int i18 = tVar.f6342b;
            if (i18 != 0) {
                bc.l.P(1, 0, i18, iArr4, iArr4);
            }
            iArr4[0] = 0;
            tVar.f6342b++;
        }
        if (!uVar.a(jVar.f2091b)) {
            tVar.a(jVar.f2091b);
        }
        int i19 = tVar.f6342b;
        if (i19 != 0) {
            int[] iArr5 = tVar.f6341a;
            pc.j.e(iArr5, "<this>");
            Arrays.sort(iArr5, 0, i19);
        }
        return new o1(tVar, uVar2, jVar.f2091b, w.f7003b);
    }
}
