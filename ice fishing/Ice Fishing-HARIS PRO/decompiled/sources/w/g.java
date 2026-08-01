package w;

import java.util.ArrayList;
import u.C0355c;
import x.C0367b;
import z.C0384f;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: A0, reason: collision with root package name */
    public int f4620A0;

    /* renamed from: B0, reason: collision with root package name */
    public C0367b f4621B0;

    /* renamed from: C0, reason: collision with root package name */
    public C0384f f4622C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f4623D0;

    /* renamed from: E0, reason: collision with root package name */
    public int f4624E0;

    /* renamed from: F0, reason: collision with root package name */
    public int f4625F0;

    /* renamed from: G0, reason: collision with root package name */
    public int f4626G0;
    public int H0;

    /* renamed from: I0, reason: collision with root package name */
    public int f4627I0;

    /* renamed from: J0, reason: collision with root package name */
    public float f4628J0;

    /* renamed from: K0, reason: collision with root package name */
    public float f4629K0;

    /* renamed from: L0, reason: collision with root package name */
    public float f4630L0;

    /* renamed from: M0, reason: collision with root package name */
    public float f4631M0;

    /* renamed from: N0, reason: collision with root package name */
    public float f4632N0;

    /* renamed from: O0, reason: collision with root package name */
    public float f4633O0;

    /* renamed from: P0, reason: collision with root package name */
    public int f4634P0;

    /* renamed from: Q0, reason: collision with root package name */
    public int f4635Q0;

    /* renamed from: R0, reason: collision with root package name */
    public int f4636R0;

    /* renamed from: S0, reason: collision with root package name */
    public int f4637S0;

    /* renamed from: T0, reason: collision with root package name */
    public int f4638T0;

    /* renamed from: U0, reason: collision with root package name */
    public int f4639U0;

    /* renamed from: V0, reason: collision with root package name */
    public int f4640V0;

    /* renamed from: W0, reason: collision with root package name */
    public ArrayList f4641W0;

    /* renamed from: X0, reason: collision with root package name */
    public d[] f4642X0;

    /* renamed from: Y0, reason: collision with root package name */
    public d[] f4643Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public int[] f4644Z0;

    /* renamed from: a1, reason: collision with root package name */
    public d[] f4645a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f4646b1;
    public int s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f4647t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f4648u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f4649v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f4650w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f4651x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f4652y0;
    public int z0;

    @Override // w.i
    public final void S() {
        for (int i = 0; i < this.f4659r0; i++) {
            d dVar = this.f4658q0[i];
            if (dVar != null) {
                dVar.f4527F = true;
            }
        }
    }

    public final int T(d dVar, int i) {
        if (dVar == null) {
            return 0;
        }
        int[] iArr = dVar.f4575p0;
        if (iArr[1] == 3) {
            int i2 = dVar.f4578s;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (dVar.f4585z * i);
                if (i3 != dVar.k()) {
                    dVar.f4558g = true;
                    V(iArr[0], dVar.q(), 1, i3, dVar);
                }
                return i3;
            }
            if (i2 == 1) {
                return dVar.k();
            }
            if (i2 == 3) {
                return (int) ((dVar.q() * dVar.f4543W) + 0.5f);
            }
        }
        return dVar.k();
    }

    public final int U(d dVar, int i) {
        if (dVar == null) {
            return 0;
        }
        int[] iArr = dVar.f4575p0;
        if (iArr[0] == 3) {
            int i2 = dVar.f4577r;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (dVar.f4582w * i);
                if (i3 != dVar.q()) {
                    dVar.f4558g = true;
                    V(1, i3, iArr[1], dVar.k(), dVar);
                }
                return i3;
            }
            if (i2 == 1) {
                return dVar.q();
            }
            if (i2 == 3) {
                return (int) ((dVar.k() * dVar.f4543W) + 0.5f);
            }
        }
        return dVar.q();
    }

    public final void V(int i, int i2, int i3, int i4, d dVar) {
        C0384f c0384f;
        d dVar2;
        while (true) {
            c0384f = this.f4622C0;
            if (c0384f != null || (dVar2 = this.f4540T) == null) {
                break;
            } else {
                this.f4622C0 = ((e) dVar2).f4600u0;
            }
        }
        C0367b c0367b = this.f4621B0;
        c0367b.f4669a = i;
        c0367b.f4670b = i3;
        c0367b.f4671c = i2;
        c0367b.f4672d = i4;
        c0384f.b(dVar, c0367b);
        dVar.O(c0367b.e);
        dVar.L(c0367b.f4673f);
        dVar.f4526E = c0367b.f4675h;
        dVar.I(c0367b.f4674g);
    }

    @Override // w.d
    public final void b(C0355c c0355c, boolean z2) {
        d dVar;
        float f2;
        int i;
        super.b(c0355c, z2);
        d dVar2 = this.f4540T;
        boolean z3 = dVar2 != null && ((e) dVar2).f4601v0;
        int i2 = this.f4638T0;
        ArrayList arrayList = this.f4641W0;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ((f) arrayList.get(i3)).b(i3, z3, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        ((f) arrayList.get(i4)).b(i4, z3, i4 == size2 + (-1));
                        i4++;
                    }
                }
            } else if (this.f4644Z0 != null && this.f4643Y0 != null && this.f4642X0 != null) {
                for (int i5 = 0; i5 < this.f4646b1; i5++) {
                    this.f4645a1[i5].D();
                }
                int[] iArr = this.f4644Z0;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f3 = this.f4628J0;
                d dVar3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z3) {
                        i = (i6 - i8) - 1;
                        f2 = 1.0f - this.f4628J0;
                    } else {
                        f2 = f3;
                        i = i8;
                    }
                    d dVar4 = this.f4643Y0[i];
                    if (dVar4 != null && dVar4.f4559g0 != 8) {
                        c cVar = dVar4.f4530I;
                        if (i8 == 0) {
                            dVar4.f(cVar, this.f4530I, this.f4650w0);
                            dVar4.f4562i0 = this.f4623D0;
                            dVar4.f4554d0 = f2;
                        }
                        if (i8 == i6 - 1) {
                            dVar4.f(dVar4.f4531K, this.f4531K, this.f4651x0);
                        }
                        if (i8 > 0 && dVar3 != null) {
                            int i9 = this.f4634P0;
                            c cVar2 = dVar3.f4531K;
                            dVar4.f(cVar, cVar2, i9);
                            dVar3.f(cVar2, cVar, 0);
                        }
                        dVar3 = dVar4;
                    }
                    i8++;
                    f3 = f2;
                }
                for (int i10 = 0; i10 < i7; i10++) {
                    d dVar5 = this.f4642X0[i10];
                    if (dVar5 != null && dVar5.f4559g0 != 8) {
                        c cVar3 = dVar5.J;
                        if (i10 == 0) {
                            dVar5.f(cVar3, this.J, this.s0);
                            dVar5.f4563j0 = this.f4624E0;
                            dVar5.f4555e0 = this.f4629K0;
                        }
                        if (i10 == i7 - 1) {
                            dVar5.f(dVar5.f4532L, this.f4532L, this.f4647t0);
                        }
                        if (i10 > 0 && dVar3 != null) {
                            int i11 = this.f4635Q0;
                            c cVar4 = dVar3.f4532L;
                            dVar5.f(cVar3, cVar4, i11);
                            dVar3.f(cVar4, cVar3, 0);
                        }
                        dVar3 = dVar5;
                    }
                }
                for (int i12 = 0; i12 < i6; i12++) {
                    for (int i13 = 0; i13 < i7; i13++) {
                        int i14 = (i13 * i6) + i12;
                        if (this.f4640V0 == 1) {
                            i14 = (i12 * i7) + i13;
                        }
                        d[] dVarArr = this.f4645a1;
                        if (i14 < dVarArr.length && (dVar = dVarArr[i14]) != null && dVar.f4559g0 != 8) {
                            d dVar6 = this.f4643Y0[i12];
                            d dVar7 = this.f4642X0[i13];
                            if (dVar != dVar6) {
                                dVar.f(dVar.f4530I, dVar6.f4530I, 0);
                                dVar.f(dVar.f4531K, dVar6.f4531K, 0);
                            }
                            if (dVar != dVar7) {
                                dVar.f(dVar.J, dVar7.J, 0);
                                dVar.f(dVar.f4532L, dVar7.f4532L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z3, true);
        }
        this.f4652y0 = false;
    }
}
