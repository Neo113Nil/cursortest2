package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import w.C5143c;
import w.C5144d;
import w.C5145e;
import w.f;
import w.g;
import w.h;
import x.C5185b;
import z.r;
import z.t;

/* loaded from: classes.dex */
public class Flow extends t {

    /* renamed from: C, reason: collision with root package name */
    public final g f4757C;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41895n = new int[32];
        this.f41901z = new HashMap();
        this.f41897v = context;
        super.g(attributeSet);
        g gVar = new g();
        gVar.f41543s0 = 0;
        gVar.f41544t0 = 0;
        gVar.f41545u0 = 0;
        gVar.f41546v0 = 0;
        gVar.f41547w0 = 0;
        gVar.f41548x0 = 0;
        gVar.f41549y0 = false;
        gVar.f41550z0 = 0;
        gVar.f41516A0 = 0;
        gVar.f41517B0 = new C5185b();
        gVar.C0 = null;
        gVar.f41518D0 = -1;
        gVar.f41519E0 = -1;
        gVar.f41520F0 = -1;
        gVar.f41521G0 = -1;
        gVar.f41522H0 = -1;
        gVar.f41523I0 = -1;
        gVar.f41524J0 = 0.5f;
        gVar.f41525K0 = 0.5f;
        gVar.f41526L0 = 0.5f;
        gVar.f41527M0 = 0.5f;
        gVar.f41528N0 = 0.5f;
        gVar.f41529O0 = 0.5f;
        gVar.f41530P0 = 0;
        gVar.f41531Q0 = 0;
        gVar.f41532R0 = 2;
        gVar.f41533S0 = 2;
        gVar.f41534T0 = 0;
        gVar.f41535U0 = -1;
        gVar.f41536V0 = 0;
        gVar.f41537W0 = new ArrayList();
        gVar.f41538X0 = null;
        gVar.f41539Y0 = null;
        gVar.f41540Z0 = null;
        gVar.f41542b1 = 0;
        this.f4757C = gVar;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f42095b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f4757C.f41536V0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    g gVar2 = this.f4757C;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.f41543s0 = dimensionPixelSize;
                    gVar2.f41544t0 = dimensionPixelSize;
                    gVar2.f41545u0 = dimensionPixelSize;
                    gVar2.f41546v0 = dimensionPixelSize;
                } else if (index == 18) {
                    g gVar3 = this.f4757C;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar3.f41545u0 = dimensionPixelSize2;
                    gVar3.f41547w0 = dimensionPixelSize2;
                    gVar3.f41548x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f4757C.f41546v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f4757C.f41547w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f4757C.f41543s0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f4757C.f41548x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f4757C.f41544t0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f4757C.f41534T0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f4757C.f41518D0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f4757C.f41519E0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f4757C.f41520F0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f4757C.f41522H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f4757C.f41521G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f4757C.f41523I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f4757C.f41524J0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f4757C.f41526L0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f4757C.f41528N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f4757C.f41527M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f4757C.f41529O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f4757C.f41525K0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f4757C.f41532R0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f4757C.f41533S0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f4757C.f41530P0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f4757C.f41531Q0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f4757C.f41535U0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f41898w = this.f4757C;
        i();
    }

    @Override // z.c
    public final void h(C5144d c5144d, boolean z8) {
        g gVar = this.f4757C;
        int i = gVar.f41545u0;
        if (i > 0 || gVar.f41546v0 > 0) {
            if (z8) {
                gVar.f41547w0 = gVar.f41546v0;
                gVar.f41548x0 = i;
            } else {
                gVar.f41547w0 = i;
                gVar.f41548x0 = gVar.f41546v0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0716  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x06f7  */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2 */
    @Override // z.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(g gVar, int i, int i4) {
        int i9;
        int i10;
        C5144d[] c5144dArr;
        int i11;
        int i12;
        int i13;
        int[] iArr;
        int i14;
        int i15;
        f fVar;
        ?? r28;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Object obj;
        C5144d c5144d;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i4);
        if (gVar == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (gVar.f41558r0 > 0) {
            C5144d c5144d2 = gVar.f41432T;
            z.f fVar2 = c5144d2 != null ? ((C5145e) c5144d2).f41493u0 : null;
            if (fVar2 == null) {
                gVar.f41550z0 = 0;
                gVar.f41516A0 = 0;
                gVar.f41549y0 = false;
                setMeasuredDimension(gVar.f41550z0, gVar.f41516A0);
            }
            for (int i26 = 0; i26 < gVar.f41558r0; i26++) {
                C5144d c5144d3 = gVar.f41557q0[i26];
                if (c5144d3 != null && !(c5144d3 instanceof h)) {
                    int j9 = c5144d3.j(0);
                    int j10 = c5144d3.j(1);
                    if (j9 != 3 || c5144d3.f41469r == 1 || j10 != 3 || c5144d3.f41470s == 1) {
                        if (j9 == 3) {
                            j9 = 2;
                        }
                        if (j10 == 3) {
                            j10 = 2;
                        }
                        C5185b c5185b = gVar.f41517B0;
                        c5185b.f41714a = j9;
                        c5185b.f41715b = j10;
                        c5185b.f41716c = c5144d3.q();
                        c5185b.f41717d = c5144d3.k();
                        fVar2.b(c5144d3, c5185b);
                        c5144d3.O(c5185b.f41718e);
                        c5144d3.L(c5185b.f41719f);
                        c5144d3.I(c5185b.f41720g);
                    }
                }
            }
        }
        int i27 = gVar.f41547w0;
        int i28 = gVar.f41548x0;
        int i29 = gVar.f41543s0;
        int i30 = gVar.f41544t0;
        int[] iArr2 = new int[2];
        int i31 = (size - i27) - i28;
        int i32 = gVar.f41536V0;
        if (i32 == 1) {
            i31 = (size2 - i29) - i30;
        }
        if (i32 == 0) {
            if (gVar.f41518D0 == -1) {
                gVar.f41518D0 = 0;
            }
            if (gVar.f41519E0 == -1) {
                gVar.f41519E0 = 0;
            }
        } else {
            if (gVar.f41518D0 == -1) {
                gVar.f41518D0 = 0;
            }
            if (gVar.f41519E0 == -1) {
                gVar.f41519E0 = 0;
            }
        }
        C5144d[] c5144dArr2 = gVar.f41557q0;
        int i33 = 0;
        int i34 = 0;
        char c4 = 0;
        while (true) {
            i9 = gVar.f41558r0;
            if (i33 >= i9) {
                break;
            }
            if (gVar.f41557q0[i33].f41451g0 == 8) {
                i34++;
            }
            i33++;
        }
        if (i34 > 0) {
            C5144d[] c5144dArr3 = new C5144d[i9 - i34];
            int i35 = 0;
            i10 = 0;
            while (i35 < gVar.f41558r0) {
                C5144d c5144d4 = gVar.f41557q0[i35];
                int i36 = i27;
                C5144d[] c5144dArr4 = c5144dArr3;
                if (c5144d4.f41451g0 != 8) {
                    c5144dArr4[i10] = c5144d4;
                    i10++;
                }
                i35++;
                i27 = i36;
                c5144dArr3 = c5144dArr4;
            }
            c5144dArr = c5144dArr3;
        } else {
            i10 = i9;
            c5144dArr = c5144dArr2;
        }
        int i37 = i27;
        gVar.f41541a1 = c5144dArr;
        gVar.f41542b1 = i10;
        int i38 = gVar.f41534T0;
        ArrayList arrayList = gVar.f41537W0;
        if (i38 != 0) {
            C5143c c5143c = gVar.J;
            C5143c c5143c2 = gVar.f41422I;
            C5143c c5143c3 = gVar.f41423K;
            C5143c c5143c4 = gVar.f41424L;
            int[] iArr3 = gVar.f41467p0;
            if (i38 == 1) {
                i11 = i28;
                i12 = i29;
                i13 = i30;
                iArr = iArr2;
                i14 = size2;
                i15 = i37;
                int i39 = gVar.f41536V0;
                if (i10 != 0) {
                    arrayList.clear();
                    f fVar3 = new f(gVar, i39, gVar.f41422I, gVar.J, gVar.f41423K, gVar.f41424L, i31);
                    arrayList.add(fVar3);
                    if (i39 == 0) {
                        int i40 = 0;
                        i16 = 0;
                        int i41 = 0;
                        while (i40 < i10) {
                            C5144d c5144d5 = c5144dArr[i40];
                            int U7 = gVar.U(c5144d5, i31);
                            if (c5144d5.f41467p0[0] == 3) {
                                i16++;
                            }
                            int i42 = i16;
                            boolean z8 = (i41 == i31 || (gVar.f41530P0 + i41) + U7 > i31) && fVar3.f41500b != null;
                            if (!z8 && i40 > 0 && (i18 = gVar.f41535U0) > 0 && i40 % i18 == 0) {
                                z8 = true;
                            }
                            if (z8) {
                                fVar3 = new f(gVar, i39, gVar.f41422I, gVar.J, gVar.f41423K, gVar.f41424L, i31);
                                fVar3.f41511n = i40;
                                arrayList.add(fVar3);
                            } else if (i40 > 0) {
                                i41 = gVar.f41530P0 + U7 + i41;
                                fVar3.a(c5144d5);
                                i40++;
                                i16 = i42;
                            }
                            i41 = U7;
                            fVar3.a(c5144d5);
                            i40++;
                            i16 = i42;
                        }
                    } else {
                        int i43 = 0;
                        i16 = 0;
                        int i44 = 0;
                        while (i43 < i10) {
                            C5144d c5144d6 = c5144dArr[i43];
                            int T8 = gVar.T(c5144d6, i31);
                            if (c5144d6.f41467p0[1] == 3) {
                                i16++;
                            }
                            int i45 = i16;
                            boolean z9 = (i44 == i31 || (gVar.f41531Q0 + i44) + T8 > i31) && fVar3.f41500b != null;
                            if (!z9 && i43 > 0 && (i17 = gVar.f41535U0) > 0 && i43 % i17 == 0) {
                                z9 = true;
                            }
                            if (z9) {
                                fVar3 = new f(gVar, i39, gVar.f41422I, gVar.J, gVar.f41423K, gVar.f41424L, i31);
                                fVar3.f41511n = i43;
                                arrayList.add(fVar3);
                            } else if (i43 > 0) {
                                i44 = gVar.f41531Q0 + T8 + i44;
                                fVar3.a(c5144d6);
                                i43++;
                                i16 = i45;
                            }
                            i44 = T8;
                            fVar3.a(c5144d6);
                            i43++;
                            i16 = i45;
                        }
                    }
                    int size3 = arrayList.size();
                    int i46 = gVar.f41547w0;
                    int i47 = gVar.f41543s0;
                    int i48 = gVar.f41548x0;
                    int i49 = gVar.f41544t0;
                    boolean z10 = iArr3[0] == 2 || iArr3[1] == 2;
                    if (i16 > 0 && z10) {
                        for (int i50 = 0; i50 < size3; i50++) {
                            f fVar4 = (f) arrayList.get(i50);
                            if (i39 == 0) {
                                fVar4.e(i31 - fVar4.d());
                            } else {
                                fVar4.e(i31 - fVar4.c());
                            }
                        }
                    }
                    int i51 = i46;
                    int i52 = i47;
                    int i53 = i48;
                    int i54 = i49;
                    C5143c c5143c5 = c5143c2;
                    C5143c c5143c6 = c5143c;
                    int i55 = 0;
                    int i56 = 0;
                    C5143c c5143c7 = c5143c3;
                    C5143c c5143c8 = c5143c4;
                    for (int i57 = 0; i57 < size3; i57++) {
                        f fVar5 = (f) arrayList.get(i57);
                        if (i39 == 0) {
                            if (i57 < size3 - 1) {
                                c5143c8 = ((f) arrayList.get(i57 + 1)).f41500b.J;
                                i54 = 0;
                            } else {
                                i54 = gVar.f41544t0;
                                c5143c8 = c5143c4;
                            }
                            C5143c c5143c9 = fVar5.f41500b.f41424L;
                            fVar5.f(i39, c5143c5, c5143c6, c5143c7, c5143c8, i51, i52, i53, i54, i31);
                            i55 = Math.max(i55, fVar5.d());
                            int c9 = fVar5.c() + i56;
                            if (i57 > 0) {
                                c9 += gVar.f41531Q0;
                            }
                            i56 = c9;
                            c5143c6 = c5143c9;
                            i52 = 0;
                        } else {
                            if (i57 < size3 - 1) {
                                c5143c7 = ((f) arrayList.get(i57 + 1)).f41500b.f41422I;
                                i53 = 0;
                            } else {
                                i53 = gVar.f41548x0;
                                c5143c7 = c5143c3;
                            }
                            C5143c c5143c10 = fVar5.f41500b.f41423K;
                            fVar5.f(i39, c5143c5, c5143c6, c5143c7, c5143c8, i51, i52, i53, i54, i31);
                            int d2 = fVar5.d() + i55;
                            int max = Math.max(i56, fVar5.c());
                            if (i57 > 0) {
                                d2 += gVar.f41530P0;
                            }
                            i56 = max;
                            i55 = d2;
                            c5143c5 = c5143c10;
                            i51 = 0;
                        }
                    }
                    iArr[0] = i55;
                    iArr[1] = i56;
                }
            } else if (i38 != 2) {
                if (i38 == 3) {
                    int i58 = gVar.f41536V0;
                    if (i10 != 0) {
                        arrayList.clear();
                        i15 = i37;
                        i11 = i28;
                        i12 = i29;
                        i13 = i30;
                        iArr = iArr2;
                        f fVar6 = new f(gVar, i58, gVar.f41422I, gVar.J, gVar.f41423K, gVar.f41424L, i31);
                        arrayList.add(fVar6);
                        if (i58 == 0) {
                            int i59 = 0;
                            int i60 = 0;
                            i21 = 0;
                            int i61 = 0;
                            while (i59 < i10) {
                                i60++;
                                C5144d c5144d7 = c5144dArr[i59];
                                int U8 = gVar.U(c5144d7, i31);
                                int i62 = i58;
                                int i63 = i59;
                                if (c5144d7.f41467p0[0] == 3) {
                                    i21++;
                                }
                                int i64 = i21;
                                boolean z11 = (i61 == i31 || (gVar.f41530P0 + i61) + U8 > i31) && fVar6.f41500b != null;
                                if (!z11 && i63 > 0 && (i25 = gVar.f41535U0) > 0 && i60 > i25) {
                                    z11 = true;
                                }
                                if (z11) {
                                    i58 = i62;
                                    i23 = size2;
                                    i24 = i63;
                                    fVar6 = new f(gVar, i58, gVar.f41422I, gVar.J, gVar.f41423K, gVar.f41424L, i31);
                                    fVar6.f41511n = i24;
                                    arrayList.add(fVar6);
                                    i61 = U8;
                                    i60 = 1;
                                } else {
                                    i58 = i62;
                                    i23 = size2;
                                    i24 = i63;
                                    i61 = i24 > 0 ? gVar.f41530P0 + U8 + i61 : U8;
                                }
                                fVar6.a(c5144d7);
                                i59 = i24 + 1;
                                i21 = i64;
                                size2 = i23;
                            }
                            i14 = size2;
                        } else {
                            i14 = size2;
                            int i65 = 0;
                            int i66 = 0;
                            int i67 = 0;
                            int i68 = 0;
                            while (i65 < i10) {
                                i66++;
                                C5144d c5144d8 = c5144dArr[i65];
                                int T9 = gVar.T(c5144d8, i31);
                                int i69 = i58;
                                if (c5144d8.f41467p0[1] == 3) {
                                    i67++;
                                }
                                int i70 = i67;
                                boolean z12 = (i68 == i31 || (gVar.f41531Q0 + i68) + T9 > i31) && fVar6.f41500b != null;
                                if (!z12 && i65 > 0 && (i22 = gVar.f41535U0) > 0 && i66 > i22) {
                                    z12 = true;
                                }
                                if (z12) {
                                    i58 = i69;
                                    fVar6 = new f(gVar, i58, gVar.f41422I, gVar.J, gVar.f41423K, gVar.f41424L, i31);
                                    fVar6.f41511n = i65;
                                    arrayList.add(fVar6);
                                    i68 = T9;
                                    i66 = 1;
                                } else {
                                    i58 = i69;
                                    i68 = i65 > 0 ? gVar.f41531Q0 + T9 + i68 : T9;
                                }
                                fVar6.a(c5144d8);
                                i65++;
                                i67 = i70;
                            }
                            i21 = i67;
                        }
                        int size4 = arrayList.size();
                        int i71 = gVar.f41547w0;
                        int i72 = gVar.f41543s0;
                        int i73 = gVar.f41548x0;
                        int i74 = gVar.f41544t0;
                        boolean z13 = iArr3[0] == 2 || iArr3[1] == 2;
                        if (i21 > 0 && z13) {
                            for (int i75 = 0; i75 < size4; i75++) {
                                f fVar7 = (f) arrayList.get(i75);
                                if (i58 == 0) {
                                    fVar7.e(i31 - fVar7.d());
                                } else {
                                    fVar7.e(i31 - fVar7.c());
                                }
                            }
                        }
                        int i76 = i71;
                        int i77 = i72;
                        int i78 = i73;
                        int i79 = i74;
                        C5143c c5143c11 = c5143c2;
                        C5143c c5143c12 = c5143c;
                        int i80 = 0;
                        int i81 = 0;
                        C5143c c5143c13 = c5143c3;
                        C5143c c5143c14 = c5143c4;
                        for (int i82 = 0; i82 < size4; i82++) {
                            f fVar8 = (f) arrayList.get(i82);
                            if (i58 == 0) {
                                if (i82 < size4 - 1) {
                                    c5143c14 = ((f) arrayList.get(i82 + 1)).f41500b.J;
                                    i79 = 0;
                                } else {
                                    i79 = gVar.f41544t0;
                                    c5143c14 = c5143c4;
                                }
                                C5143c c5143c15 = fVar8.f41500b.f41424L;
                                fVar8.f(i58, c5143c11, c5143c12, c5143c13, c5143c14, i76, i77, i78, i79, i31);
                                i80 = Math.max(i80, fVar8.d());
                                int c10 = fVar8.c() + i81;
                                if (i82 > 0) {
                                    c10 += gVar.f41531Q0;
                                }
                                i81 = c10;
                                c5143c12 = c5143c15;
                                i77 = 0;
                            } else {
                                if (i82 < size4 - 1) {
                                    c5143c13 = ((f) arrayList.get(i82 + 1)).f41500b.f41422I;
                                    i78 = 0;
                                } else {
                                    i78 = gVar.f41548x0;
                                    c5143c13 = c5143c3;
                                }
                                C5143c c5143c16 = fVar8.f41500b.f41423K;
                                fVar8.f(i58, c5143c11, c5143c12, c5143c13, c5143c14, i76, i77, i78, i79, i31);
                                int d3 = fVar8.d() + i80;
                                int max2 = Math.max(i81, fVar8.c());
                                if (i82 > 0) {
                                    d3 += gVar.f41530P0;
                                }
                                i81 = max2;
                                i80 = d3;
                                c5143c11 = c5143c16;
                                i76 = 0;
                            }
                        }
                        iArr[0] = i80;
                        iArr[1] = i81;
                    }
                }
                i11 = i28;
                i12 = i29;
                i13 = i30;
                iArr = iArr2;
                i14 = size2;
                i15 = i37;
            } else {
                i11 = i28;
                i12 = i29;
                i13 = i30;
                iArr = iArr2;
                i14 = size2;
                i15 = i37;
                int i83 = gVar.f41536V0;
                if (i83 == 0) {
                    int i84 = gVar.f41535U0;
                    if (i84 <= 0) {
                        int i85 = 0;
                        i20 = 0;
                        for (int i86 = 0; i86 < i10; i86++) {
                            if (i86 > 0) {
                                i85 += gVar.f41530P0;
                            }
                            C5144d c5144d9 = c5144dArr[i86];
                            if (c5144d9 != null) {
                                int U9 = gVar.U(c5144d9, i31) + i85;
                                if (U9 > i31) {
                                    break;
                                }
                                i20++;
                                i85 = U9;
                            }
                        }
                    } else {
                        i20 = i84;
                    }
                    i19 = 0;
                } else {
                    i19 = gVar.f41535U0;
                    if (i19 <= 0) {
                        int i87 = 0;
                        int i88 = 0;
                        for (int i89 = 0; i89 < i10; i89++) {
                            if (i89 > 0) {
                                i87 += gVar.f41531Q0;
                            }
                            C5144d c5144d10 = c5144dArr[i89];
                            if (c5144d10 != null) {
                                int T10 = gVar.T(c5144d10, i31) + i87;
                                if (T10 > i31) {
                                    break;
                                }
                                i88++;
                                i87 = T10;
                            }
                        }
                        i19 = i88;
                    }
                    i20 = 0;
                }
                if (gVar.f41540Z0 == null) {
                    gVar.f41540Z0 = new int[2];
                }
                boolean z14 = (i19 == 0 && i83 == 1) || (i20 == 0 && i83 == 0);
                while (!z14) {
                    if (i83 == 0) {
                        i19 = (int) Math.ceil(i10 / i20);
                    } else {
                        i20 = (int) Math.ceil(i10 / i19);
                    }
                    C5144d[] c5144dArr5 = gVar.f41539Y0;
                    if (c5144dArr5 == null || c5144dArr5.length < i20) {
                        obj = null;
                        gVar.f41539Y0 = new C5144d[i20];
                    } else {
                        obj = null;
                        Arrays.fill(c5144dArr5, (Object) null);
                    }
                    C5144d[] c5144dArr6 = gVar.f41538X0;
                    if (c5144dArr6 == null || c5144dArr6.length < i19) {
                        gVar.f41538X0 = new C5144d[i19];
                    } else {
                        Arrays.fill(c5144dArr6, obj);
                    }
                    for (int i90 = 0; i90 < i20; i90++) {
                        for (int i91 = 0; i91 < i19; i91++) {
                            int i92 = (i91 * i20) + i90;
                            if (i83 == 1) {
                                i92 = (i90 * i19) + i91;
                            }
                            if (i92 < c5144dArr.length && (c5144d = c5144dArr[i92]) != null) {
                                int U10 = gVar.U(c5144d, i31);
                                C5144d c5144d11 = gVar.f41539Y0[i90];
                                if (c5144d11 == null || c5144d11.q() < U10) {
                                    gVar.f41539Y0[i90] = c5144d;
                                }
                                int T11 = gVar.T(c5144d, i31);
                                C5144d c5144d12 = gVar.f41538X0[i91];
                                if (c5144d12 == null || c5144d12.k() < T11) {
                                    gVar.f41538X0[i91] = c5144d;
                                }
                            }
                        }
                    }
                    int i93 = 0;
                    for (int i94 = 0; i94 < i20; i94++) {
                        C5144d c5144d13 = gVar.f41539Y0[i94];
                        if (c5144d13 != null) {
                            if (i94 > 0) {
                                i93 += gVar.f41530P0;
                            }
                            i93 = gVar.U(c5144d13, i31) + i93;
                        }
                    }
                    int i95 = 0;
                    for (int i96 = 0; i96 < i19; i96++) {
                        C5144d c5144d14 = gVar.f41538X0[i96];
                        if (c5144d14 != null) {
                            if (i96 > 0) {
                                i95 += gVar.f41531Q0;
                            }
                            i95 = gVar.T(c5144d14, i31) + i95;
                        }
                    }
                    iArr[0] = i93;
                    iArr[1] = i95;
                    if (i83 == 0) {
                        if (i93 > i31 && i20 > 1) {
                            i20--;
                        }
                        z14 = true;
                    } else {
                        if (i95 > i31 && i19 > 1) {
                            i19--;
                        }
                        z14 = true;
                    }
                }
                int[] iArr4 = gVar.f41540Z0;
                iArr4[0] = i20;
                iArr4[1] = i19;
            }
        } else {
            i11 = i28;
            i12 = i29;
            i13 = i30;
            iArr = iArr2;
            i14 = size2;
            i15 = i37;
            int i97 = gVar.f41536V0;
            if (i10 != 0) {
                if (arrayList.size() == 0) {
                    fVar = new f(gVar, i97, gVar.f41422I, gVar.J, gVar.f41423K, gVar.f41424L, i31);
                    arrayList.add(fVar);
                } else {
                    fVar = (f) arrayList.get(0);
                    fVar.f41501c = 0;
                    fVar.f41500b = null;
                    fVar.f41509l = 0;
                    fVar.f41510m = 0;
                    fVar.f41511n = 0;
                    fVar.f41512o = 0;
                    fVar.f41513p = 0;
                    fVar.f(i97, gVar.f41422I, gVar.J, gVar.f41423K, gVar.f41424L, gVar.f41547w0, gVar.f41543s0, gVar.f41548x0, gVar.f41544t0, i31);
                }
                for (int i98 = 0; i98 < i10; i98++) {
                    fVar.a(c5144dArr[i98]);
                }
                c4 = 0;
                iArr[0] = fVar.d();
                r28 = 1;
                iArr[1] = fVar.c();
                int i99 = iArr[c4] + i15 + i11;
                int i100 = iArr[r28] + i12 + i13;
                if (mode != 1073741824) {
                    size = mode == Integer.MIN_VALUE ? Math.min(i99, size) : mode == 0 ? i99 : 0;
                }
                int min = mode2 != 1073741824 ? i14 : mode2 == Integer.MIN_VALUE ? Math.min(i100, i14) : mode2 == 0 ? i100 : 0;
                gVar.f41550z0 = size;
                gVar.f41516A0 = min;
                gVar.O(size);
                gVar.L(min);
                gVar.f41549y0 = gVar.f41558r0 <= 0 ? r28 : false;
                setMeasuredDimension(gVar.f41550z0, gVar.f41516A0);
            }
        }
        r28 = 1;
        int i992 = iArr[c4] + i15 + i11;
        int i1002 = iArr[r28] + i12 + i13;
        if (mode != 1073741824) {
        }
        if (mode2 != 1073741824) {
        }
        gVar.f41550z0 = size;
        gVar.f41516A0 = min;
        gVar.O(size);
        gVar.L(min);
        gVar.f41549y0 = gVar.f41558r0 <= 0 ? r28 : false;
        setMeasuredDimension(gVar.f41550z0, gVar.f41516A0);
    }

    @Override // z.c, android.view.View
    public final void onMeasure(int i, int i4) {
        j(this.f4757C, i, i4);
    }

    public void setFirstHorizontalBias(float f6) {
        this.f4757C.f41526L0 = f6;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f4757C.f41520F0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f6) {
        this.f4757C.f41527M0 = f6;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f4757C.f41521G0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f4757C.f41532R0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f6) {
        this.f4757C.f41524J0 = f6;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f4757C.f41530P0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f4757C.f41518D0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f6) {
        this.f4757C.f41528N0 = f6;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.f4757C.f41522H0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f6) {
        this.f4757C.f41529O0 = f6;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.f4757C.f41523I0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f4757C.f41535U0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f4757C.f41536V0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        g gVar = this.f4757C;
        gVar.f41543s0 = i;
        gVar.f41544t0 = i;
        gVar.f41545u0 = i;
        gVar.f41546v0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f4757C.f41544t0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f4757C.f41547w0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f4757C.f41548x0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f4757C.f41543s0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f4757C.f41533S0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f6) {
        this.f4757C.f41525K0 = f6;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f4757C.f41531Q0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f4757C.f41519E0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f4757C.f41534T0 = i;
        requestLayout();
    }
}
