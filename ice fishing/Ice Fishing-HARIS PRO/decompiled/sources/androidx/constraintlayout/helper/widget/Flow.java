package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import w.c;
import w.d;
import w.e;
import w.f;
import w.g;
import w.h;
import x.C0367b;
import z.AbstractC0396r;
import z.AbstractC0398t;
import z.C0384f;

/* loaded from: classes.dex */
public class Flow extends AbstractC0398t {
    public final g j;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4777a = new int[32];
        this.f4782g = new HashMap();
        this.f4779c = context;
        super.g(attributeSet);
        g gVar = new g();
        gVar.s0 = 0;
        gVar.f4647t0 = 0;
        gVar.f4648u0 = 0;
        gVar.f4649v0 = 0;
        gVar.f4650w0 = 0;
        gVar.f4651x0 = 0;
        gVar.f4652y0 = false;
        gVar.z0 = 0;
        gVar.f4620A0 = 0;
        gVar.f4621B0 = new C0367b();
        gVar.f4622C0 = null;
        gVar.f4623D0 = -1;
        gVar.f4624E0 = -1;
        gVar.f4625F0 = -1;
        gVar.f4626G0 = -1;
        gVar.H0 = -1;
        gVar.f4627I0 = -1;
        gVar.f4628J0 = 0.5f;
        gVar.f4629K0 = 0.5f;
        gVar.f4630L0 = 0.5f;
        gVar.f4631M0 = 0.5f;
        gVar.f4632N0 = 0.5f;
        gVar.f4633O0 = 0.5f;
        gVar.f4634P0 = 0;
        gVar.f4635Q0 = 0;
        gVar.f4636R0 = 2;
        gVar.f4637S0 = 2;
        gVar.f4638T0 = 0;
        gVar.f4639U0 = -1;
        gVar.f4640V0 = 0;
        gVar.f4641W0 = new ArrayList();
        gVar.f4642X0 = null;
        gVar.f4643Y0 = null;
        gVar.f4644Z0 = null;
        gVar.f4646b1 = 0;
        this.j = gVar;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0396r.f4966b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.j.f4640V0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    g gVar2 = this.j;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.s0 = dimensionPixelSize;
                    gVar2.f4647t0 = dimensionPixelSize;
                    gVar2.f4648u0 = dimensionPixelSize;
                    gVar2.f4649v0 = dimensionPixelSize;
                } else if (index == 18) {
                    g gVar3 = this.j;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar3.f4648u0 = dimensionPixelSize2;
                    gVar3.f4650w0 = dimensionPixelSize2;
                    gVar3.f4651x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.j.f4649v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.j.f4650w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.j.s0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.j.f4651x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.j.f4647t0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.j.f4638T0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.j.f4623D0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.j.f4624E0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.j.f4625F0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.j.H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.j.f4626G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.j.f4627I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.j.f4628J0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.j.f4630L0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.j.f4632N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.j.f4631M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.j.f4633O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.j.f4629K0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.j.f4636R0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.j.f4637S0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.j.f4634P0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.j.f4635Q0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.j.f4639U0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f4780d = this.j;
        i();
    }

    @Override // z.AbstractC0381c
    public final void h(d dVar, boolean z2) {
        g gVar = this.j;
        int i = gVar.f4648u0;
        if (i > 0 || gVar.f4649v0 > 0) {
            if (z2) {
                gVar.f4650w0 = gVar.f4649v0;
                gVar.f4651x0 = i;
            } else {
                gVar.f4650w0 = i;
                gVar.f4651x0 = gVar.f4649v0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:83:0x07a8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x07e2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x07ad  */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // z.AbstractC0398t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(g gVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int[] iArr;
        f fVar;
        char c2;
        ?? r2;
        int i12;
        int i13;
        int i14;
        int[] iArr2;
        int i15;
        int i16;
        d[] dVarArr;
        int i17;
        int i18;
        ArrayList arrayList;
        int[] iArr3;
        d dVar;
        int i19;
        int i20;
        int i21;
        int i22;
        Object obj;
        d dVar2;
        int i23;
        int i24;
        int i25;
        ArrayList arrayList2;
        int i26;
        int i27;
        int i28;
        d dVar3;
        int i29;
        int i30;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (gVar == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (gVar.f4659r0 > 0) {
            d dVar4 = gVar.f4540T;
            C0384f c0384f = dVar4 != null ? ((e) dVar4).f4600u0 : null;
            if (c0384f == null) {
                gVar.z0 = 0;
                gVar.f4620A0 = 0;
                gVar.f4652y0 = false;
                setMeasuredDimension(gVar.z0, gVar.f4620A0);
            }
            for (int i31 = 0; i31 < gVar.f4659r0; i31++) {
                d dVar5 = gVar.f4658q0[i31];
                if (dVar5 != null && !(dVar5 instanceof h)) {
                    int j = dVar5.j(0);
                    int j2 = dVar5.j(1);
                    if (j != 3 || dVar5.f4577r == 1 || j2 != 3 || dVar5.f4578s == 1) {
                        if (j == 3) {
                            j = 2;
                        }
                        if (j2 == 3) {
                            j2 = 2;
                        }
                        C0367b c0367b = gVar.f4621B0;
                        c0367b.f4669a = j;
                        c0367b.f4670b = j2;
                        c0367b.f4671c = dVar5.q();
                        c0367b.f4672d = dVar5.k();
                        c0384f.b(dVar5, c0367b);
                        dVar5.O(c0367b.e);
                        dVar5.L(c0367b.f4673f);
                        dVar5.I(c0367b.f4674g);
                    }
                }
            }
        }
        int i32 = gVar.f4650w0;
        int i33 = gVar.f4651x0;
        int i34 = gVar.s0;
        int i35 = gVar.f4647t0;
        int[] iArr4 = new int[2];
        int i36 = (size - i32) - i33;
        int i37 = gVar.f4640V0;
        if (i37 == 1) {
            i36 = (size2 - i34) - i35;
        }
        if (i37 == 0) {
            if (gVar.f4623D0 == -1) {
                gVar.f4623D0 = 0;
            }
            if (gVar.f4624E0 == -1) {
                gVar.f4624E0 = 0;
            }
        } else {
            if (gVar.f4623D0 == -1) {
                gVar.f4623D0 = 0;
            }
            if (gVar.f4624E0 == -1) {
                gVar.f4624E0 = 0;
            }
        }
        d[] dVarArr2 = gVar.f4658q0;
        int i38 = 0;
        int i39 = 0;
        while (true) {
            i3 = gVar.f4659r0;
            if (i38 >= i3) {
                break;
            }
            if (gVar.f4658q0[i38].f4559g0 == 8) {
                i39++;
            }
            i38++;
        }
        if (i39 > 0) {
            dVarArr2 = new d[i3 - i39];
            int i40 = 0;
            i3 = 0;
            while (i40 < gVar.f4659r0) {
                d dVar6 = gVar.f4658q0[i40];
                int i41 = i36;
                int[] iArr5 = iArr4;
                if (dVar6.f4559g0 != 8) {
                    dVarArr2[i3] = dVar6;
                    i3++;
                }
                i40++;
                i36 = i41;
                iArr4 = iArr5;
            }
        }
        int i42 = i36;
        int[] iArr6 = iArr4;
        int i43 = i3;
        d[] dVarArr3 = dVarArr2;
        gVar.f4645a1 = dVarArr3;
        gVar.f4646b1 = i43;
        int i44 = gVar.f4638T0;
        ArrayList arrayList3 = gVar.f4641W0;
        if (i44 != 0) {
            c cVar = gVar.J;
            c cVar2 = gVar.f4530I;
            c cVar3 = gVar.f4531K;
            c cVar4 = gVar.f4532L;
            int[] iArr7 = gVar.f4575p0;
            if (i44 == 1) {
                i4 = i35;
                i5 = i34;
                i6 = i33;
                i7 = i32;
                i8 = mode;
                i9 = size;
                i10 = mode2;
                i11 = size2;
                iArr = iArr6;
                ArrayList arrayList4 = arrayList3;
                int i45 = gVar.f4640V0;
                if (i43 != 0) {
                    arrayList4.clear();
                    f fVar2 = new f(gVar, i45, gVar.f4530I, gVar.J, gVar.f4531K, gVar.f4532L, i42);
                    arrayList4.add(fVar2);
                    if (i45 == 0) {
                        f fVar3 = fVar2;
                        i16 = 0;
                        int i46 = 0;
                        int i47 = 0;
                        while (i47 < i43) {
                            d dVar7 = dVarArr3[i47];
                            int U2 = gVar.U(dVar7, i42);
                            if (dVar7.f4575p0[0] == 3) {
                                i16++;
                            }
                            int i48 = i16;
                            boolean z2 = (i46 == i42 || (gVar.f4634P0 + i46) + U2 > i42) && fVar3.f4606b != null;
                            if (!z2 && i47 > 0 && (i20 = gVar.f4639U0) > 0 && i47 % i20 == 0) {
                                z2 = true;
                            }
                            if (z2) {
                                iArr3 = iArr7;
                                dVar = dVar7;
                                i19 = i45;
                                f fVar4 = new f(gVar, i45, gVar.f4530I, gVar.J, gVar.f4531K, gVar.f4532L, i42);
                                fVar4.f4615n = i47;
                                arrayList4.add(fVar4);
                                fVar3 = fVar4;
                            } else {
                                iArr3 = iArr7;
                                dVar = dVar7;
                                i19 = i45;
                                if (i47 > 0) {
                                    i46 = gVar.f4634P0 + U2 + i46;
                                    fVar3.a(dVar);
                                    i47++;
                                    i16 = i48;
                                    iArr7 = iArr3;
                                    i45 = i19;
                                }
                            }
                            i46 = U2;
                            fVar3.a(dVar);
                            i47++;
                            i16 = i48;
                            iArr7 = iArr3;
                            i45 = i19;
                        }
                        iArr2 = iArr7;
                        i15 = i45;
                    } else {
                        iArr2 = iArr7;
                        i15 = i45;
                        f fVar5 = fVar2;
                        int i49 = 0;
                        i16 = 0;
                        int i50 = 0;
                        while (i49 < i43) {
                            d dVar8 = dVarArr3[i49];
                            int T2 = gVar.T(dVar8, i42);
                            if (dVar8.f4575p0[1] == 3) {
                                i16++;
                            }
                            int i51 = i16;
                            boolean z3 = (i50 == i42 || (gVar.f4635Q0 + i50) + T2 > i42) && fVar5.f4606b != null;
                            if (!z3 && i49 > 0 && (i17 = gVar.f4639U0) > 0 && i49 % i17 == 0) {
                                z3 = true;
                            }
                            if (z3) {
                                dVarArr = dVarArr3;
                                f fVar6 = new f(gVar, i15, gVar.f4530I, gVar.J, gVar.f4531K, gVar.f4532L, i42);
                                fVar6.f4615n = i49;
                                arrayList4.add(fVar6);
                                i50 = T2;
                                fVar5 = fVar6;
                            } else {
                                dVarArr = dVarArr3;
                                i50 = i49 > 0 ? gVar.f4635Q0 + T2 + i50 : T2;
                            }
                            fVar5.a(dVar8);
                            i49++;
                            i16 = i51;
                            dVarArr3 = dVarArr;
                        }
                    }
                    int size3 = arrayList4.size();
                    int i52 = gVar.f4650w0;
                    int i53 = gVar.s0;
                    int i54 = gVar.f4651x0;
                    int i55 = gVar.f4647t0;
                    boolean z4 = iArr2[0] == 2 || iArr2[1] == 2;
                    if (i16 > 0 && z4) {
                        for (int i56 = 0; i56 < size3; i56++) {
                            f fVar7 = (f) arrayList4.get(i56);
                            if (i15 == 0) {
                                fVar7.e(i42 - fVar7.d());
                            } else {
                                fVar7.e(i42 - fVar7.c());
                            }
                        }
                    }
                    int i57 = i53;
                    c cVar5 = cVar2;
                    c cVar6 = cVar3;
                    c cVar7 = cVar4;
                    int i58 = 0;
                    int i59 = 0;
                    int i60 = 0;
                    int i61 = i52;
                    c cVar8 = cVar;
                    while (i58 < size3) {
                        f fVar8 = (f) arrayList4.get(i58);
                        if (i15 == 0) {
                            if (i58 < size3 - 1) {
                                cVar7 = ((f) arrayList4.get(i58 + 1)).f4606b.J;
                                arrayList = arrayList4;
                                i55 = 0;
                            } else {
                                i55 = gVar.f4647t0;
                                arrayList = arrayList4;
                                cVar7 = cVar4;
                            }
                            c cVar9 = fVar8.f4606b.f4532L;
                            fVar8.f(i15, cVar5, cVar8, cVar6, cVar7, i61, i57, i54, i55, i42);
                            int max = Math.max(i59, fVar8.d());
                            int c3 = fVar8.c() + i60;
                            if (i58 > 0) {
                                c3 += gVar.f4635Q0;
                            }
                            i18 = size3;
                            i59 = max;
                            i60 = c3;
                            cVar8 = cVar9;
                            arrayList4 = arrayList;
                            i57 = 0;
                        } else {
                            ArrayList arrayList5 = arrayList4;
                            if (i58 < size3 - 1) {
                                arrayList4 = arrayList5;
                                i18 = size3;
                                cVar6 = ((f) arrayList4.get(i58 + 1)).f4606b.f4530I;
                                i54 = 0;
                            } else {
                                arrayList4 = arrayList5;
                                i54 = gVar.f4651x0;
                                i18 = size3;
                                cVar6 = cVar3;
                            }
                            c cVar10 = fVar8.f4606b.f4531K;
                            fVar8.f(i15, cVar5, cVar8, cVar6, cVar7, i61, i57, i54, i55, i42);
                            int d2 = fVar8.d() + i59;
                            int max2 = Math.max(i60, fVar8.c());
                            if (i58 > 0) {
                                d2 += gVar.f4634P0;
                            }
                            i59 = d2;
                            i60 = max2;
                            i61 = 0;
                            cVar5 = cVar10;
                        }
                        i58++;
                        size3 = i18;
                    }
                    iArr[0] = i59;
                    iArr[1] = i60;
                }
            } else if (i44 != 2) {
                if (i44 == 3) {
                    int i62 = gVar.f4640V0;
                    if (i43 != 0) {
                        arrayList3.clear();
                        i11 = size2;
                        int i63 = i42;
                        iArr = iArr6;
                        i4 = i35;
                        i5 = i34;
                        i6 = i33;
                        i7 = i32;
                        i10 = mode2;
                        ArrayList arrayList6 = arrayList3;
                        f fVar9 = new f(gVar, i62, gVar.f4530I, gVar.J, gVar.f4531K, gVar.f4532L, i63);
                        arrayList6.add(fVar9);
                        if (i62 == 0) {
                            int i64 = 0;
                            i23 = 0;
                            int i65 = 0;
                            int i66 = 0;
                            while (i66 < i43) {
                                i64++;
                                d dVar9 = dVarArr3[i66];
                                int i67 = i63;
                                int U3 = gVar.U(dVar9, i67);
                                if (dVar9.f4575p0[0] == 3) {
                                    i23++;
                                }
                                int i68 = i23;
                                boolean z5 = (i65 == i67 || (gVar.f4634P0 + i65) + U3 > i67) && fVar9.f4606b != null;
                                if (!z5 && i66 > 0 && (i30 = gVar.f4639U0) > 0 && i64 > i30) {
                                    z5 = true;
                                }
                                if (z5) {
                                    i63 = i67;
                                    i28 = size;
                                    dVar3 = dVar9;
                                    i27 = mode;
                                    i29 = i66;
                                    fVar9 = new f(gVar, i62, gVar.f4530I, gVar.J, gVar.f4531K, gVar.f4532L, i63);
                                    fVar9.f4615n = i29;
                                    arrayList6.add(fVar9);
                                    i65 = U3;
                                    i64 = 1;
                                } else {
                                    i63 = i67;
                                    i27 = mode;
                                    i28 = size;
                                    dVar3 = dVar9;
                                    i29 = i66;
                                    i65 = i29 > 0 ? gVar.f4634P0 + U3 + i65 : U3;
                                }
                                fVar9.a(dVar3);
                                i66 = i29 + 1;
                                i23 = i68;
                                size = i28;
                                mode = i27;
                            }
                            i8 = mode;
                            i9 = size;
                        } else {
                            i8 = mode;
                            i9 = size;
                            int i69 = 0;
                            i23 = 0;
                            int i70 = 0;
                            int i71 = 0;
                            while (i71 < i43) {
                                i69++;
                                d dVar10 = dVarArr3[i71];
                                int i72 = i63;
                                int T3 = gVar.T(dVar10, i72);
                                if (dVar10.f4575p0[1] == 3) {
                                    i23++;
                                }
                                int i73 = i23;
                                boolean z6 = (i70 == i72 || (gVar.f4635Q0 + i70) + T3 > i72) && fVar9.f4606b != null;
                                if (!z6 && i71 > 0 && (i24 = gVar.f4639U0) > 0 && i69 > i24) {
                                    z6 = true;
                                }
                                if (z6) {
                                    i63 = i72;
                                    fVar9 = new f(gVar, i62, gVar.f4530I, gVar.J, gVar.f4531K, gVar.f4532L, i72);
                                    fVar9.f4615n = i71;
                                    arrayList6.add(fVar9);
                                    i70 = T3;
                                    i69 = 1;
                                } else {
                                    i63 = i72;
                                    i70 = i71 > 0 ? gVar.f4635Q0 + T3 + i70 : T3;
                                }
                                fVar9.a(dVar10);
                                i71++;
                                i23 = i73;
                            }
                        }
                        int size4 = arrayList6.size();
                        int i74 = gVar.f4650w0;
                        int i75 = gVar.s0;
                        int i76 = gVar.f4651x0;
                        int i77 = gVar.f4647t0;
                        boolean z7 = iArr7[0] == 2 || iArr7[1] == 2;
                        if (i23 > 0 && z7) {
                            int i78 = 0;
                            while (i78 < size4) {
                                f fVar10 = (f) arrayList6.get(i78);
                                if (i62 == 0) {
                                    i26 = i63;
                                    fVar10.e(i26 - fVar10.d());
                                } else {
                                    i26 = i63;
                                    fVar10.e(i26 - fVar10.c());
                                }
                                i78++;
                                i63 = i26;
                            }
                        }
                        int i79 = i63;
                        c cVar11 = cVar;
                        c cVar12 = cVar2;
                        c cVar13 = cVar3;
                        c cVar14 = cVar4;
                        int i80 = 0;
                        int i81 = 0;
                        int i82 = 0;
                        while (i80 < size4) {
                            f fVar11 = (f) arrayList6.get(i80);
                            if (i62 == 0) {
                                if (i80 < size4 - 1) {
                                    cVar14 = ((f) arrayList6.get(i80 + 1)).f4606b.J;
                                    arrayList2 = arrayList6;
                                    i77 = 0;
                                } else {
                                    i77 = gVar.f4647t0;
                                    arrayList2 = arrayList6;
                                    cVar14 = cVar4;
                                }
                                c cVar15 = fVar11.f4606b.f4532L;
                                fVar11.f(i62, cVar12, cVar11, cVar13, cVar14, i74, i75, i76, i77, i79);
                                int max3 = Math.max(i81, fVar11.d());
                                int c4 = fVar11.c() + i82;
                                if (i80 > 0) {
                                    c4 += gVar.f4635Q0;
                                }
                                i25 = size4;
                                i81 = max3;
                                i82 = c4;
                                cVar11 = cVar15;
                                arrayList6 = arrayList2;
                                i75 = 0;
                            } else {
                                ArrayList arrayList7 = arrayList6;
                                if (i80 < size4 - 1) {
                                    arrayList6 = arrayList7;
                                    i25 = size4;
                                    cVar13 = ((f) arrayList6.get(i80 + 1)).f4606b.f4530I;
                                    i76 = 0;
                                } else {
                                    arrayList6 = arrayList7;
                                    i76 = gVar.f4651x0;
                                    i25 = size4;
                                    cVar13 = cVar3;
                                }
                                c cVar16 = fVar11.f4606b.f4531K;
                                fVar11.f(i62, cVar12, cVar11, cVar13, cVar14, i74, i75, i76, i77, i79);
                                int d3 = fVar11.d() + i81;
                                int max4 = Math.max(i82, fVar11.c());
                                if (i80 > 0) {
                                    d3 += gVar.f4634P0;
                                }
                                i81 = d3;
                                cVar12 = cVar16;
                                i82 = max4;
                                i74 = 0;
                            }
                            i80++;
                            size4 = i25;
                        }
                        iArr[0] = i81;
                        iArr[1] = i82;
                    }
                }
                i4 = i35;
                i5 = i34;
                i6 = i33;
                i7 = i32;
                i8 = mode;
                i9 = size;
                i10 = mode2;
                i11 = size2;
                iArr = iArr6;
            } else {
                i4 = i35;
                i5 = i34;
                i6 = i33;
                i7 = i32;
                i8 = mode;
                i9 = size;
                i10 = mode2;
                i11 = size2;
                iArr = iArr6;
                int i83 = gVar.f4640V0;
                if (i83 == 0) {
                    int i84 = gVar.f4639U0;
                    if (i84 <= 0) {
                        int i85 = 0;
                        i22 = 0;
                        for (int i86 = 0; i86 < i43; i86++) {
                            if (i86 > 0) {
                                i85 += gVar.f4634P0;
                            }
                            d dVar11 = dVarArr3[i86];
                            if (dVar11 != null) {
                                int U4 = gVar.U(dVar11, i42) + i85;
                                if (U4 > i42) {
                                    break;
                                }
                                i22++;
                                i85 = U4;
                            }
                        }
                    } else {
                        i22 = i84;
                    }
                    i21 = 0;
                } else {
                    i21 = gVar.f4639U0;
                    if (i21 <= 0) {
                        int i87 = 0;
                        int i88 = 0;
                        for (int i89 = 0; i89 < i43; i89++) {
                            if (i89 > 0) {
                                i87 += gVar.f4635Q0;
                            }
                            d dVar12 = dVarArr3[i89];
                            if (dVar12 != null) {
                                int T4 = gVar.T(dVar12, i42) + i87;
                                if (T4 > i42) {
                                    break;
                                }
                                i88++;
                                i87 = T4;
                            }
                        }
                        i21 = i88;
                    }
                    i22 = 0;
                }
                if (gVar.f4644Z0 == null) {
                    gVar.f4644Z0 = new int[2];
                }
                boolean z8 = (i21 == 0 && i83 == 1) || (i22 == 0 && i83 == 0);
                while (!z8) {
                    if (i83 == 0) {
                        i21 = (int) Math.ceil(i43 / i22);
                    } else {
                        i22 = (int) Math.ceil(i43 / i21);
                    }
                    d[] dVarArr4 = gVar.f4643Y0;
                    if (dVarArr4 == null || dVarArr4.length < i22) {
                        obj = null;
                        gVar.f4643Y0 = new d[i22];
                    } else {
                        obj = null;
                        Arrays.fill(dVarArr4, (Object) null);
                    }
                    d[] dVarArr5 = gVar.f4642X0;
                    if (dVarArr5 == null || dVarArr5.length < i21) {
                        gVar.f4642X0 = new d[i21];
                    } else {
                        Arrays.fill(dVarArr5, obj);
                    }
                    for (int i90 = 0; i90 < i22; i90++) {
                        for (int i91 = 0; i91 < i21; i91++) {
                            int i92 = (i91 * i22) + i90;
                            if (i83 == 1) {
                                i92 = (i90 * i21) + i91;
                            }
                            if (i92 < dVarArr3.length && (dVar2 = dVarArr3[i92]) != null) {
                                int U5 = gVar.U(dVar2, i42);
                                d dVar13 = gVar.f4643Y0[i90];
                                if (dVar13 == null || dVar13.q() < U5) {
                                    gVar.f4643Y0[i90] = dVar2;
                                }
                                int T5 = gVar.T(dVar2, i42);
                                d dVar14 = gVar.f4642X0[i91];
                                if (dVar14 == null || dVar14.k() < T5) {
                                    gVar.f4642X0[i91] = dVar2;
                                }
                            }
                        }
                    }
                    int i93 = 0;
                    for (int i94 = 0; i94 < i22; i94++) {
                        d dVar15 = gVar.f4643Y0[i94];
                        if (dVar15 != null) {
                            if (i94 > 0) {
                                i93 += gVar.f4634P0;
                            }
                            i93 = gVar.U(dVar15, i42) + i93;
                        }
                    }
                    int i95 = 0;
                    for (int i96 = 0; i96 < i21; i96++) {
                        d dVar16 = gVar.f4642X0[i96];
                        if (dVar16 != null) {
                            if (i96 > 0) {
                                i95 += gVar.f4635Q0;
                            }
                            i95 = gVar.T(dVar16, i42) + i95;
                        }
                    }
                    iArr[0] = i93;
                    iArr[1] = i95;
                    if (i83 == 0) {
                        if (i93 > i42 && i22 > 1) {
                            i22--;
                        }
                        z8 = true;
                    } else {
                        if (i95 > i42 && i21 > 1) {
                            i21--;
                        }
                        z8 = true;
                    }
                }
                int[] iArr8 = gVar.f4644Z0;
                iArr8[0] = i22;
                iArr8[1] = i21;
            }
        } else {
            i4 = i35;
            i5 = i34;
            i6 = i33;
            i7 = i32;
            i8 = mode;
            i9 = size;
            i10 = mode2;
            i11 = size2;
            iArr = iArr6;
            int i97 = gVar.f4640V0;
            if (i43 != 0) {
                if (arrayList3.size() == 0) {
                    fVar = new f(gVar, i97, gVar.f4530I, gVar.J, gVar.f4531K, gVar.f4532L, i42);
                    arrayList3.add(fVar);
                } else {
                    fVar = (f) arrayList3.get(0);
                    fVar.f4607c = 0;
                    fVar.f4606b = null;
                    fVar.f4613l = 0;
                    fVar.f4614m = 0;
                    fVar.f4615n = 0;
                    fVar.f4616o = 0;
                    fVar.f4617p = 0;
                    fVar.f(i97, gVar.f4530I, gVar.J, gVar.f4531K, gVar.f4532L, gVar.f4650w0, gVar.s0, gVar.f4651x0, gVar.f4647t0, i42);
                }
                for (int i98 = 0; i98 < i43; i98++) {
                    fVar.a(dVarArr3[i98]);
                }
                c2 = 0;
                iArr[0] = fVar.d();
                r2 = 1;
                iArr[1] = fVar.c();
                int i99 = iArr[c2] + i7 + i6;
                int i100 = iArr[r2] + i5 + i4;
                i12 = i8;
                if (i12 != 1073741824) {
                    i13 = i10;
                    i14 = i9;
                } else {
                    if (i12 == Integer.MIN_VALUE) {
                        i14 = Math.min(i99, i9);
                    } else if (i12 == 0) {
                        i14 = i99;
                    } else {
                        i13 = i10;
                        i14 = 0;
                    }
                    i13 = i10;
                }
                int min = i13 != 1073741824 ? i11 : i13 == Integer.MIN_VALUE ? Math.min(i100, i11) : i13 == 0 ? i100 : 0;
                gVar.z0 = i14;
                gVar.f4620A0 = min;
                gVar.O(i14);
                gVar.L(min);
                gVar.f4652y0 = gVar.f4659r0 <= 0 ? r2 : false;
                setMeasuredDimension(gVar.z0, gVar.f4620A0);
            }
        }
        c2 = 0;
        r2 = 1;
        int i992 = iArr[c2] + i7 + i6;
        int i1002 = iArr[r2] + i5 + i4;
        i12 = i8;
        if (i12 != 1073741824) {
        }
        if (i13 != 1073741824) {
        }
        gVar.z0 = i14;
        gVar.f4620A0 = min;
        gVar.O(i14);
        gVar.L(min);
        gVar.f4652y0 = gVar.f4659r0 <= 0 ? r2 : false;
        setMeasuredDimension(gVar.z0, gVar.f4620A0);
    }

    @Override // z.AbstractC0381c, android.view.View
    public final void onMeasure(int i, int i2) {
        j(this.j, i, i2);
    }

    public void setFirstHorizontalBias(float f2) {
        this.j.f4630L0 = f2;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.j.f4625F0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f2) {
        this.j.f4631M0 = f2;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.j.f4626G0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.j.f4636R0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f2) {
        this.j.f4628J0 = f2;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.j.f4634P0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.j.f4623D0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f2) {
        this.j.f4632N0 = f2;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.j.H0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f2) {
        this.j.f4633O0 = f2;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.j.f4627I0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.j.f4639U0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.j.f4640V0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        g gVar = this.j;
        gVar.s0 = i;
        gVar.f4647t0 = i;
        gVar.f4648u0 = i;
        gVar.f4649v0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.j.f4647t0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.j.f4650w0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.j.f4651x0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.j.s0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.j.f4637S0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f2) {
        this.j.f4629K0 = f2;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.j.f4635Q0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.j.f4624E0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.j.f4638T0 = i;
        requestLayout();
    }
}
