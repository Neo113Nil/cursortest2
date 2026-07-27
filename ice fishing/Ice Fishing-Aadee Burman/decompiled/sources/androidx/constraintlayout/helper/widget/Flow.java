package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import w.C5138c;
import w.C5139d;
import w.C5140e;
import w.f;
import w.g;
import w.h;
import x.C5164b;
import z.r;
import z.t;

/* loaded from: classes.dex */
public class Flow extends t {

    /* renamed from: C, reason: collision with root package name */
    public final g f4642C;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42010n = new int[32];
        this.f42016z = new HashMap();
        this.f42012v = context;
        super.g(attributeSet);
        g gVar = new g();
        gVar.f41605s0 = 0;
        gVar.f41606t0 = 0;
        gVar.f41607u0 = 0;
        gVar.f41608v0 = 0;
        gVar.f41609w0 = 0;
        gVar.f41610x0 = 0;
        gVar.f41611y0 = false;
        gVar.f41612z0 = 0;
        gVar.f41578A0 = 0;
        gVar.f41579B0 = new C5164b();
        gVar.C0 = null;
        gVar.f41580D0 = -1;
        gVar.f41581E0 = -1;
        gVar.f41582F0 = -1;
        gVar.f41583G0 = -1;
        gVar.f41584H0 = -1;
        gVar.f41585I0 = -1;
        gVar.f41586J0 = 0.5f;
        gVar.f41587K0 = 0.5f;
        gVar.f41588L0 = 0.5f;
        gVar.f41589M0 = 0.5f;
        gVar.f41590N0 = 0.5f;
        gVar.f41591O0 = 0.5f;
        gVar.f41592P0 = 0;
        gVar.f41593Q0 = 0;
        gVar.f41594R0 = 2;
        gVar.f41595S0 = 2;
        gVar.f41596T0 = 0;
        gVar.f41597U0 = -1;
        gVar.f41598V0 = 0;
        gVar.f41599W0 = new ArrayList();
        gVar.f41600X0 = null;
        gVar.f41601Y0 = null;
        gVar.f41602Z0 = null;
        gVar.f41604b1 = 0;
        this.f4642C = gVar;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f42210b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f4642C.f41598V0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    g gVar2 = this.f4642C;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.f41605s0 = dimensionPixelSize;
                    gVar2.f41606t0 = dimensionPixelSize;
                    gVar2.f41607u0 = dimensionPixelSize;
                    gVar2.f41608v0 = dimensionPixelSize;
                } else if (index == 18) {
                    g gVar3 = this.f4642C;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar3.f41607u0 = dimensionPixelSize2;
                    gVar3.f41609w0 = dimensionPixelSize2;
                    gVar3.f41610x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f4642C.f41608v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f4642C.f41609w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f4642C.f41605s0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f4642C.f41610x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f4642C.f41606t0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f4642C.f41596T0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f4642C.f41580D0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f4642C.f41581E0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f4642C.f41582F0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f4642C.f41584H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f4642C.f41583G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f4642C.f41585I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f4642C.f41586J0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f4642C.f41588L0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f4642C.f41590N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f4642C.f41589M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f4642C.f41591O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f4642C.f41587K0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f4642C.f41594R0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f4642C.f41595S0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f4642C.f41592P0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f4642C.f41593Q0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f4642C.f41597U0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f42013w = this.f4642C;
        i();
    }

    @Override // z.c
    public final void h(C5139d c5139d, boolean z3) {
        g gVar = this.f4642C;
        int i = gVar.f41607u0;
        if (i > 0 || gVar.f41608v0 > 0) {
            if (z3) {
                gVar.f41609w0 = gVar.f41608v0;
                gVar.f41610x0 = i;
            } else {
                gVar.f41609w0 = i;
                gVar.f41610x0 = gVar.f41608v0;
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
    public final void j(g gVar, int i, int i6) {
        int i9;
        int i10;
        C5139d[] c5139dArr;
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
        C5139d c5139d;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i6);
        int size2 = View.MeasureSpec.getSize(i6);
        if (gVar == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (gVar.f41620r0 > 0) {
            C5139d c5139d2 = gVar.f41494T;
            z.f fVar2 = c5139d2 != null ? ((C5140e) c5139d2).f41555u0 : null;
            if (fVar2 == null) {
                gVar.f41612z0 = 0;
                gVar.f41578A0 = 0;
                gVar.f41611y0 = false;
                setMeasuredDimension(gVar.f41612z0, gVar.f41578A0);
            }
            for (int i26 = 0; i26 < gVar.f41620r0; i26++) {
                C5139d c5139d3 = gVar.f41619q0[i26];
                if (c5139d3 != null && !(c5139d3 instanceof h)) {
                    int j6 = c5139d3.j(0);
                    int j9 = c5139d3.j(1);
                    if (j6 != 3 || c5139d3.f41531r == 1 || j9 != 3 || c5139d3.f41532s == 1) {
                        if (j6 == 3) {
                            j6 = 2;
                        }
                        if (j9 == 3) {
                            j9 = 2;
                        }
                        C5164b c5164b = gVar.f41579B0;
                        c5164b.f41695a = j6;
                        c5164b.f41696b = j9;
                        c5164b.f41697c = c5139d3.q();
                        c5164b.f41698d = c5139d3.k();
                        fVar2.b(c5139d3, c5164b);
                        c5139d3.O(c5164b.f41699e);
                        c5139d3.L(c5164b.f41700f);
                        c5139d3.I(c5164b.f41701g);
                    }
                }
            }
        }
        int i27 = gVar.f41609w0;
        int i28 = gVar.f41610x0;
        int i29 = gVar.f41605s0;
        int i30 = gVar.f41606t0;
        int[] iArr2 = new int[2];
        int i31 = (size - i27) - i28;
        int i32 = gVar.f41598V0;
        if (i32 == 1) {
            i31 = (size2 - i29) - i30;
        }
        if (i32 == 0) {
            if (gVar.f41580D0 == -1) {
                gVar.f41580D0 = 0;
            }
            if (gVar.f41581E0 == -1) {
                gVar.f41581E0 = 0;
            }
        } else {
            if (gVar.f41580D0 == -1) {
                gVar.f41580D0 = 0;
            }
            if (gVar.f41581E0 == -1) {
                gVar.f41581E0 = 0;
            }
        }
        C5139d[] c5139dArr2 = gVar.f41619q0;
        int i33 = 0;
        int i34 = 0;
        char c9 = 0;
        while (true) {
            i9 = gVar.f41620r0;
            if (i33 >= i9) {
                break;
            }
            if (gVar.f41619q0[i33].f41513g0 == 8) {
                i34++;
            }
            i33++;
        }
        if (i34 > 0) {
            C5139d[] c5139dArr3 = new C5139d[i9 - i34];
            int i35 = 0;
            i10 = 0;
            while (i35 < gVar.f41620r0) {
                C5139d c5139d4 = gVar.f41619q0[i35];
                int i36 = i27;
                C5139d[] c5139dArr4 = c5139dArr3;
                if (c5139d4.f41513g0 != 8) {
                    c5139dArr4[i10] = c5139d4;
                    i10++;
                }
                i35++;
                i27 = i36;
                c5139dArr3 = c5139dArr4;
            }
            c5139dArr = c5139dArr3;
        } else {
            i10 = i9;
            c5139dArr = c5139dArr2;
        }
        int i37 = i27;
        gVar.f41603a1 = c5139dArr;
        gVar.f41604b1 = i10;
        int i38 = gVar.f41596T0;
        ArrayList arrayList = gVar.f41599W0;
        if (i38 != 0) {
            C5138c c5138c = gVar.J;
            C5138c c5138c2 = gVar.f41484I;
            C5138c c5138c3 = gVar.f41485K;
            C5138c c5138c4 = gVar.f41486L;
            int[] iArr3 = gVar.f41529p0;
            if (i38 == 1) {
                i11 = i28;
                i12 = i29;
                i13 = i30;
                iArr = iArr2;
                i14 = size2;
                i15 = i37;
                int i39 = gVar.f41598V0;
                if (i10 != 0) {
                    arrayList.clear();
                    f fVar3 = new f(gVar, i39, gVar.f41484I, gVar.J, gVar.f41485K, gVar.f41486L, i31);
                    arrayList.add(fVar3);
                    if (i39 == 0) {
                        int i40 = 0;
                        i16 = 0;
                        int i41 = 0;
                        while (i40 < i10) {
                            C5139d c5139d5 = c5139dArr[i40];
                            int U3 = gVar.U(c5139d5, i31);
                            if (c5139d5.f41529p0[0] == 3) {
                                i16++;
                            }
                            int i42 = i16;
                            boolean z3 = (i41 == i31 || (gVar.f41592P0 + i41) + U3 > i31) && fVar3.f41562b != null;
                            if (!z3 && i40 > 0 && (i18 = gVar.f41597U0) > 0 && i40 % i18 == 0) {
                                z3 = true;
                            }
                            if (z3) {
                                fVar3 = new f(gVar, i39, gVar.f41484I, gVar.J, gVar.f41485K, gVar.f41486L, i31);
                                fVar3.f41573n = i40;
                                arrayList.add(fVar3);
                            } else if (i40 > 0) {
                                i41 = gVar.f41592P0 + U3 + i41;
                                fVar3.a(c5139d5);
                                i40++;
                                i16 = i42;
                            }
                            i41 = U3;
                            fVar3.a(c5139d5);
                            i40++;
                            i16 = i42;
                        }
                    } else {
                        int i43 = 0;
                        i16 = 0;
                        int i44 = 0;
                        while (i43 < i10) {
                            C5139d c5139d6 = c5139dArr[i43];
                            int T8 = gVar.T(c5139d6, i31);
                            if (c5139d6.f41529p0[1] == 3) {
                                i16++;
                            }
                            int i45 = i16;
                            boolean z6 = (i44 == i31 || (gVar.f41593Q0 + i44) + T8 > i31) && fVar3.f41562b != null;
                            if (!z6 && i43 > 0 && (i17 = gVar.f41597U0) > 0 && i43 % i17 == 0) {
                                z6 = true;
                            }
                            if (z6) {
                                fVar3 = new f(gVar, i39, gVar.f41484I, gVar.J, gVar.f41485K, gVar.f41486L, i31);
                                fVar3.f41573n = i43;
                                arrayList.add(fVar3);
                            } else if (i43 > 0) {
                                i44 = gVar.f41593Q0 + T8 + i44;
                                fVar3.a(c5139d6);
                                i43++;
                                i16 = i45;
                            }
                            i44 = T8;
                            fVar3.a(c5139d6);
                            i43++;
                            i16 = i45;
                        }
                    }
                    int size3 = arrayList.size();
                    int i46 = gVar.f41609w0;
                    int i47 = gVar.f41605s0;
                    int i48 = gVar.f41610x0;
                    int i49 = gVar.f41606t0;
                    boolean z9 = iArr3[0] == 2 || iArr3[1] == 2;
                    if (i16 > 0 && z9) {
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
                    C5138c c5138c5 = c5138c2;
                    C5138c c5138c6 = c5138c;
                    int i55 = 0;
                    int i56 = 0;
                    C5138c c5138c7 = c5138c3;
                    C5138c c5138c8 = c5138c4;
                    for (int i57 = 0; i57 < size3; i57++) {
                        f fVar5 = (f) arrayList.get(i57);
                        if (i39 == 0) {
                            if (i57 < size3 - 1) {
                                c5138c8 = ((f) arrayList.get(i57 + 1)).f41562b.J;
                                i54 = 0;
                            } else {
                                i54 = gVar.f41606t0;
                                c5138c8 = c5138c4;
                            }
                            C5138c c5138c9 = fVar5.f41562b.f41486L;
                            fVar5.f(i39, c5138c5, c5138c6, c5138c7, c5138c8, i51, i52, i53, i54, i31);
                            i55 = Math.max(i55, fVar5.d());
                            int c10 = fVar5.c() + i56;
                            if (i57 > 0) {
                                c10 += gVar.f41593Q0;
                            }
                            i56 = c10;
                            c5138c6 = c5138c9;
                            i52 = 0;
                        } else {
                            if (i57 < size3 - 1) {
                                c5138c7 = ((f) arrayList.get(i57 + 1)).f41562b.f41484I;
                                i53 = 0;
                            } else {
                                i53 = gVar.f41610x0;
                                c5138c7 = c5138c3;
                            }
                            C5138c c5138c10 = fVar5.f41562b.f41485K;
                            fVar5.f(i39, c5138c5, c5138c6, c5138c7, c5138c8, i51, i52, i53, i54, i31);
                            int d2 = fVar5.d() + i55;
                            int max = Math.max(i56, fVar5.c());
                            if (i57 > 0) {
                                d2 += gVar.f41592P0;
                            }
                            i56 = max;
                            i55 = d2;
                            c5138c5 = c5138c10;
                            i51 = 0;
                        }
                    }
                    iArr[0] = i55;
                    iArr[1] = i56;
                }
            } else if (i38 != 2) {
                if (i38 == 3) {
                    int i58 = gVar.f41598V0;
                    if (i10 != 0) {
                        arrayList.clear();
                        i15 = i37;
                        i11 = i28;
                        i12 = i29;
                        i13 = i30;
                        iArr = iArr2;
                        f fVar6 = new f(gVar, i58, gVar.f41484I, gVar.J, gVar.f41485K, gVar.f41486L, i31);
                        arrayList.add(fVar6);
                        if (i58 == 0) {
                            int i59 = 0;
                            int i60 = 0;
                            i21 = 0;
                            int i61 = 0;
                            while (i59 < i10) {
                                i60++;
                                C5139d c5139d7 = c5139dArr[i59];
                                int U8 = gVar.U(c5139d7, i31);
                                int i62 = i58;
                                int i63 = i59;
                                if (c5139d7.f41529p0[0] == 3) {
                                    i21++;
                                }
                                int i64 = i21;
                                boolean z10 = (i61 == i31 || (gVar.f41592P0 + i61) + U8 > i31) && fVar6.f41562b != null;
                                if (!z10 && i63 > 0 && (i25 = gVar.f41597U0) > 0 && i60 > i25) {
                                    z10 = true;
                                }
                                if (z10) {
                                    i58 = i62;
                                    i23 = size2;
                                    i24 = i63;
                                    fVar6 = new f(gVar, i58, gVar.f41484I, gVar.J, gVar.f41485K, gVar.f41486L, i31);
                                    fVar6.f41573n = i24;
                                    arrayList.add(fVar6);
                                    i61 = U8;
                                    i60 = 1;
                                } else {
                                    i58 = i62;
                                    i23 = size2;
                                    i24 = i63;
                                    i61 = i24 > 0 ? gVar.f41592P0 + U8 + i61 : U8;
                                }
                                fVar6.a(c5139d7);
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
                                C5139d c5139d8 = c5139dArr[i65];
                                int T9 = gVar.T(c5139d8, i31);
                                int i69 = i58;
                                if (c5139d8.f41529p0[1] == 3) {
                                    i67++;
                                }
                                int i70 = i67;
                                boolean z11 = (i68 == i31 || (gVar.f41593Q0 + i68) + T9 > i31) && fVar6.f41562b != null;
                                if (!z11 && i65 > 0 && (i22 = gVar.f41597U0) > 0 && i66 > i22) {
                                    z11 = true;
                                }
                                if (z11) {
                                    i58 = i69;
                                    fVar6 = new f(gVar, i58, gVar.f41484I, gVar.J, gVar.f41485K, gVar.f41486L, i31);
                                    fVar6.f41573n = i65;
                                    arrayList.add(fVar6);
                                    i68 = T9;
                                    i66 = 1;
                                } else {
                                    i58 = i69;
                                    i68 = i65 > 0 ? gVar.f41593Q0 + T9 + i68 : T9;
                                }
                                fVar6.a(c5139d8);
                                i65++;
                                i67 = i70;
                            }
                            i21 = i67;
                        }
                        int size4 = arrayList.size();
                        int i71 = gVar.f41609w0;
                        int i72 = gVar.f41605s0;
                        int i73 = gVar.f41610x0;
                        int i74 = gVar.f41606t0;
                        boolean z12 = iArr3[0] == 2 || iArr3[1] == 2;
                        if (i21 > 0 && z12) {
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
                        C5138c c5138c11 = c5138c2;
                        C5138c c5138c12 = c5138c;
                        int i80 = 0;
                        int i81 = 0;
                        C5138c c5138c13 = c5138c3;
                        C5138c c5138c14 = c5138c4;
                        for (int i82 = 0; i82 < size4; i82++) {
                            f fVar8 = (f) arrayList.get(i82);
                            if (i58 == 0) {
                                if (i82 < size4 - 1) {
                                    c5138c14 = ((f) arrayList.get(i82 + 1)).f41562b.J;
                                    i79 = 0;
                                } else {
                                    i79 = gVar.f41606t0;
                                    c5138c14 = c5138c4;
                                }
                                C5138c c5138c15 = fVar8.f41562b.f41486L;
                                fVar8.f(i58, c5138c11, c5138c12, c5138c13, c5138c14, i76, i77, i78, i79, i31);
                                i80 = Math.max(i80, fVar8.d());
                                int c11 = fVar8.c() + i81;
                                if (i82 > 0) {
                                    c11 += gVar.f41593Q0;
                                }
                                i81 = c11;
                                c5138c12 = c5138c15;
                                i77 = 0;
                            } else {
                                if (i82 < size4 - 1) {
                                    c5138c13 = ((f) arrayList.get(i82 + 1)).f41562b.f41484I;
                                    i78 = 0;
                                } else {
                                    i78 = gVar.f41610x0;
                                    c5138c13 = c5138c3;
                                }
                                C5138c c5138c16 = fVar8.f41562b.f41485K;
                                fVar8.f(i58, c5138c11, c5138c12, c5138c13, c5138c14, i76, i77, i78, i79, i31);
                                int d9 = fVar8.d() + i80;
                                int max2 = Math.max(i81, fVar8.c());
                                if (i82 > 0) {
                                    d9 += gVar.f41592P0;
                                }
                                i81 = max2;
                                i80 = d9;
                                c5138c11 = c5138c16;
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
                int i83 = gVar.f41598V0;
                if (i83 == 0) {
                    int i84 = gVar.f41597U0;
                    if (i84 <= 0) {
                        int i85 = 0;
                        i20 = 0;
                        for (int i86 = 0; i86 < i10; i86++) {
                            if (i86 > 0) {
                                i85 += gVar.f41592P0;
                            }
                            C5139d c5139d9 = c5139dArr[i86];
                            if (c5139d9 != null) {
                                int U9 = gVar.U(c5139d9, i31) + i85;
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
                    i19 = gVar.f41597U0;
                    if (i19 <= 0) {
                        int i87 = 0;
                        int i88 = 0;
                        for (int i89 = 0; i89 < i10; i89++) {
                            if (i89 > 0) {
                                i87 += gVar.f41593Q0;
                            }
                            C5139d c5139d10 = c5139dArr[i89];
                            if (c5139d10 != null) {
                                int T10 = gVar.T(c5139d10, i31) + i87;
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
                if (gVar.f41602Z0 == null) {
                    gVar.f41602Z0 = new int[2];
                }
                boolean z13 = (i19 == 0 && i83 == 1) || (i20 == 0 && i83 == 0);
                while (!z13) {
                    if (i83 == 0) {
                        i19 = (int) Math.ceil(i10 / i20);
                    } else {
                        i20 = (int) Math.ceil(i10 / i19);
                    }
                    C5139d[] c5139dArr5 = gVar.f41601Y0;
                    if (c5139dArr5 == null || c5139dArr5.length < i20) {
                        obj = null;
                        gVar.f41601Y0 = new C5139d[i20];
                    } else {
                        obj = null;
                        Arrays.fill(c5139dArr5, (Object) null);
                    }
                    C5139d[] c5139dArr6 = gVar.f41600X0;
                    if (c5139dArr6 == null || c5139dArr6.length < i19) {
                        gVar.f41600X0 = new C5139d[i19];
                    } else {
                        Arrays.fill(c5139dArr6, obj);
                    }
                    for (int i90 = 0; i90 < i20; i90++) {
                        for (int i91 = 0; i91 < i19; i91++) {
                            int i92 = (i91 * i20) + i90;
                            if (i83 == 1) {
                                i92 = (i90 * i19) + i91;
                            }
                            if (i92 < c5139dArr.length && (c5139d = c5139dArr[i92]) != null) {
                                int U10 = gVar.U(c5139d, i31);
                                C5139d c5139d11 = gVar.f41601Y0[i90];
                                if (c5139d11 == null || c5139d11.q() < U10) {
                                    gVar.f41601Y0[i90] = c5139d;
                                }
                                int T11 = gVar.T(c5139d, i31);
                                C5139d c5139d12 = gVar.f41600X0[i91];
                                if (c5139d12 == null || c5139d12.k() < T11) {
                                    gVar.f41600X0[i91] = c5139d;
                                }
                            }
                        }
                    }
                    int i93 = 0;
                    for (int i94 = 0; i94 < i20; i94++) {
                        C5139d c5139d13 = gVar.f41601Y0[i94];
                        if (c5139d13 != null) {
                            if (i94 > 0) {
                                i93 += gVar.f41592P0;
                            }
                            i93 = gVar.U(c5139d13, i31) + i93;
                        }
                    }
                    int i95 = 0;
                    for (int i96 = 0; i96 < i19; i96++) {
                        C5139d c5139d14 = gVar.f41600X0[i96];
                        if (c5139d14 != null) {
                            if (i96 > 0) {
                                i95 += gVar.f41593Q0;
                            }
                            i95 = gVar.T(c5139d14, i31) + i95;
                        }
                    }
                    iArr[0] = i93;
                    iArr[1] = i95;
                    if (i83 == 0) {
                        if (i93 > i31 && i20 > 1) {
                            i20--;
                        }
                        z13 = true;
                    } else {
                        if (i95 > i31 && i19 > 1) {
                            i19--;
                        }
                        z13 = true;
                    }
                }
                int[] iArr4 = gVar.f41602Z0;
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
            int i97 = gVar.f41598V0;
            if (i10 != 0) {
                if (arrayList.size() == 0) {
                    fVar = new f(gVar, i97, gVar.f41484I, gVar.J, gVar.f41485K, gVar.f41486L, i31);
                    arrayList.add(fVar);
                } else {
                    fVar = (f) arrayList.get(0);
                    fVar.f41563c = 0;
                    fVar.f41562b = null;
                    fVar.f41571l = 0;
                    fVar.f41572m = 0;
                    fVar.f41573n = 0;
                    fVar.f41574o = 0;
                    fVar.f41575p = 0;
                    fVar.f(i97, gVar.f41484I, gVar.J, gVar.f41485K, gVar.f41486L, gVar.f41609w0, gVar.f41605s0, gVar.f41610x0, gVar.f41606t0, i31);
                }
                for (int i98 = 0; i98 < i10; i98++) {
                    fVar.a(c5139dArr[i98]);
                }
                c9 = 0;
                iArr[0] = fVar.d();
                r28 = 1;
                iArr[1] = fVar.c();
                int i99 = iArr[c9] + i15 + i11;
                int i100 = iArr[r28] + i12 + i13;
                if (mode != 1073741824) {
                    size = mode == Integer.MIN_VALUE ? Math.min(i99, size) : mode == 0 ? i99 : 0;
                }
                int min = mode2 != 1073741824 ? i14 : mode2 == Integer.MIN_VALUE ? Math.min(i100, i14) : mode2 == 0 ? i100 : 0;
                gVar.f41612z0 = size;
                gVar.f41578A0 = min;
                gVar.O(size);
                gVar.L(min);
                gVar.f41611y0 = gVar.f41620r0 <= 0 ? r28 : false;
                setMeasuredDimension(gVar.f41612z0, gVar.f41578A0);
            }
        }
        r28 = 1;
        int i992 = iArr[c9] + i15 + i11;
        int i1002 = iArr[r28] + i12 + i13;
        if (mode != 1073741824) {
        }
        if (mode2 != 1073741824) {
        }
        gVar.f41612z0 = size;
        gVar.f41578A0 = min;
        gVar.O(size);
        gVar.L(min);
        gVar.f41611y0 = gVar.f41620r0 <= 0 ? r28 : false;
        setMeasuredDimension(gVar.f41612z0, gVar.f41578A0);
    }

    @Override // z.c, android.view.View
    public final void onMeasure(int i, int i6) {
        j(this.f4642C, i, i6);
    }

    public void setFirstHorizontalBias(float f3) {
        this.f4642C.f41588L0 = f3;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f4642C.f41582F0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f3) {
        this.f4642C.f41589M0 = f3;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f4642C.f41583G0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f4642C.f41594R0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f3) {
        this.f4642C.f41586J0 = f3;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f4642C.f41592P0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f4642C.f41580D0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f3) {
        this.f4642C.f41590N0 = f3;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.f4642C.f41584H0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f3) {
        this.f4642C.f41591O0 = f3;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.f4642C.f41585I0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f4642C.f41597U0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f4642C.f41598V0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        g gVar = this.f4642C;
        gVar.f41605s0 = i;
        gVar.f41606t0 = i;
        gVar.f41607u0 = i;
        gVar.f41608v0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f4642C.f41606t0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f4642C.f41609w0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f4642C.f41610x0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f4642C.f41605s0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f4642C.f41595S0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f3) {
        this.f4642C.f41587K0 = f3;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f4642C.f41593Q0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f4642C.f41581E0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f4642C.f41596T0 = i;
        requestLayout();
    }
}
