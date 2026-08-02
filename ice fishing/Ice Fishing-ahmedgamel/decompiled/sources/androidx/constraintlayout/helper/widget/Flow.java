package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import w.C5129d;
import w.C5130e;
import w.g;
import w.h;
import w.i;
import x.C5163b;
import z.f;
import z.r;
import z.t;

/* loaded from: classes.dex */
public class Flow extends t {

    /* renamed from: C, reason: collision with root package name */
    public final h f4610C;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41984n = new int[32];
        this.f41990z = new HashMap();
        this.f41986v = context;
        super.g(attributeSet);
        h hVar = new h();
        hVar.f41387s0 = 0;
        hVar.f41388t0 = 0;
        hVar.f41389u0 = 0;
        hVar.f41390v0 = 0;
        hVar.f41391w0 = 0;
        hVar.f41392x0 = 0;
        hVar.f41393y0 = false;
        hVar.f41394z0 = 0;
        hVar.f41360A0 = 0;
        hVar.f41361B0 = new C5163b();
        hVar.C0 = null;
        hVar.f41362D0 = -1;
        hVar.f41363E0 = -1;
        hVar.f41364F0 = -1;
        hVar.f41365G0 = -1;
        hVar.f41366H0 = -1;
        hVar.f41367I0 = -1;
        hVar.f41368J0 = 0.5f;
        hVar.f41369K0 = 0.5f;
        hVar.f41370L0 = 0.5f;
        hVar.f41371M0 = 0.5f;
        hVar.f41372N0 = 0.5f;
        hVar.f41373O0 = 0.5f;
        hVar.f41374P0 = 0;
        hVar.f41375Q0 = 0;
        hVar.f41376R0 = 2;
        hVar.f41377S0 = 2;
        hVar.f41378T0 = 0;
        hVar.f41379U0 = -1;
        hVar.f41380V0 = 0;
        hVar.f41381W0 = new ArrayList();
        hVar.f41382X0 = null;
        hVar.f41383Y0 = null;
        hVar.f41384Z0 = null;
        hVar.f41386b1 = 0;
        this.f4610C = hVar;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f42184b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f4610C.f41380V0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    h hVar2 = this.f4610C;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    hVar2.f41387s0 = dimensionPixelSize;
                    hVar2.f41388t0 = dimensionPixelSize;
                    hVar2.f41389u0 = dimensionPixelSize;
                    hVar2.f41390v0 = dimensionPixelSize;
                } else if (index == 18) {
                    h hVar3 = this.f4610C;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    hVar3.f41389u0 = dimensionPixelSize2;
                    hVar3.f41391w0 = dimensionPixelSize2;
                    hVar3.f41392x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f4610C.f41390v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f4610C.f41391w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f4610C.f41387s0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f4610C.f41392x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f4610C.f41388t0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f4610C.f41378T0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f4610C.f41362D0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f4610C.f41363E0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f4610C.f41364F0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f4610C.f41366H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f4610C.f41365G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f4610C.f41367I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f4610C.f41368J0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f4610C.f41370L0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f4610C.f41372N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f4610C.f41371M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f4610C.f41373O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f4610C.f41369K0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f4610C.f41376R0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f4610C.f41377S0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f4610C.f41374P0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f4610C.f41375Q0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f4610C.f41379U0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f41987w = this.f4610C;
        i();
    }

    @Override // z.c
    public final void h(C5130e c5130e, boolean z6) {
        h hVar = this.f4610C;
        int i = hVar.f41389u0;
        if (i > 0 || hVar.f41390v0 > 0) {
            if (z6) {
                hVar.f41391w0 = hVar.f41390v0;
                hVar.f41392x0 = i;
            } else {
                hVar.f41391w0 = i;
                hVar.f41392x0 = hVar.f41390v0;
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
    public final void j(h hVar, int i, int i4) {
        int i6;
        int i9;
        C5130e[] c5130eArr;
        int i10;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        int i14;
        g gVar;
        ?? r28;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Object obj;
        C5130e c5130e;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i4);
        if (hVar == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (hVar.f41402r0 > 0) {
            C5130e c5130e2 = hVar.f41276T;
            f fVar = c5130e2 != null ? ((w.f) c5130e2).f41337u0 : null;
            if (fVar == null) {
                hVar.f41394z0 = 0;
                hVar.f41360A0 = 0;
                hVar.f41393y0 = false;
                setMeasuredDimension(hVar.f41394z0, hVar.f41360A0);
            }
            for (int i25 = 0; i25 < hVar.f41402r0; i25++) {
                C5130e c5130e3 = hVar.f41401q0[i25];
                if (c5130e3 != null && !(c5130e3 instanceof i)) {
                    int j6 = c5130e3.j(0);
                    int j9 = c5130e3.j(1);
                    if (j6 != 3 || c5130e3.f41313r == 1 || j9 != 3 || c5130e3.f41314s == 1) {
                        if (j6 == 3) {
                            j6 = 2;
                        }
                        if (j9 == 3) {
                            j9 = 2;
                        }
                        C5163b c5163b = hVar.f41361B0;
                        c5163b.f41753a = j6;
                        c5163b.f41754b = j9;
                        c5163b.f41755c = c5130e3.q();
                        c5163b.f41756d = c5130e3.k();
                        fVar.b(c5130e3, c5163b);
                        c5130e3.O(c5163b.f41757e);
                        c5130e3.L(c5163b.f41758f);
                        c5130e3.I(c5163b.f41759g);
                    }
                }
            }
        }
        int i26 = hVar.f41391w0;
        int i27 = hVar.f41392x0;
        int i28 = hVar.f41387s0;
        int i29 = hVar.f41388t0;
        int[] iArr2 = new int[2];
        int i30 = (size - i26) - i27;
        int i31 = hVar.f41380V0;
        if (i31 == 1) {
            i30 = (size2 - i28) - i29;
        }
        if (i31 == 0) {
            if (hVar.f41362D0 == -1) {
                hVar.f41362D0 = 0;
            }
            if (hVar.f41363E0 == -1) {
                hVar.f41363E0 = 0;
            }
        } else {
            if (hVar.f41362D0 == -1) {
                hVar.f41362D0 = 0;
            }
            if (hVar.f41363E0 == -1) {
                hVar.f41363E0 = 0;
            }
        }
        C5130e[] c5130eArr2 = hVar.f41401q0;
        int i32 = 0;
        int i33 = 0;
        char c9 = 0;
        while (true) {
            i6 = hVar.f41402r0;
            if (i32 >= i6) {
                break;
            }
            if (hVar.f41401q0[i32].f41295g0 == 8) {
                i33++;
            }
            i32++;
        }
        if (i33 > 0) {
            C5130e[] c5130eArr3 = new C5130e[i6 - i33];
            int i34 = 0;
            i9 = 0;
            while (i34 < hVar.f41402r0) {
                C5130e c5130e4 = hVar.f41401q0[i34];
                int i35 = i26;
                C5130e[] c5130eArr4 = c5130eArr3;
                if (c5130e4.f41295g0 != 8) {
                    c5130eArr4[i9] = c5130e4;
                    i9++;
                }
                i34++;
                i26 = i35;
                c5130eArr3 = c5130eArr4;
            }
            c5130eArr = c5130eArr3;
        } else {
            i9 = i6;
            c5130eArr = c5130eArr2;
        }
        int i36 = i26;
        hVar.f41385a1 = c5130eArr;
        hVar.f41386b1 = i9;
        int i37 = hVar.f41378T0;
        ArrayList arrayList = hVar.f41381W0;
        if (i37 != 0) {
            C5129d c5129d = hVar.J;
            C5129d c5129d2 = hVar.f41266I;
            C5129d c5129d3 = hVar.f41267K;
            C5129d c5129d4 = hVar.f41268L;
            int[] iArr3 = hVar.f41311p0;
            if (i37 == 1) {
                i10 = i27;
                i11 = i28;
                i12 = i29;
                iArr = iArr2;
                i13 = size2;
                i14 = i36;
                int i38 = hVar.f41380V0;
                if (i9 != 0) {
                    arrayList.clear();
                    g gVar2 = new g(hVar, i38, hVar.f41266I, hVar.J, hVar.f41267K, hVar.f41268L, i30);
                    arrayList.add(gVar2);
                    if (i38 == 0) {
                        int i39 = 0;
                        i15 = 0;
                        int i40 = 0;
                        while (i39 < i9) {
                            C5130e c5130e5 = c5130eArr[i39];
                            int U8 = hVar.U(c5130e5, i30);
                            if (c5130e5.f41311p0[0] == 3) {
                                i15++;
                            }
                            int i41 = i15;
                            boolean z6 = (i40 == i30 || (hVar.f41374P0 + i40) + U8 > i30) && gVar2.f41344b != null;
                            if (!z6 && i39 > 0 && (i17 = hVar.f41379U0) > 0 && i39 % i17 == 0) {
                                z6 = true;
                            }
                            if (z6) {
                                gVar2 = new g(hVar, i38, hVar.f41266I, hVar.J, hVar.f41267K, hVar.f41268L, i30);
                                gVar2.f41355n = i39;
                                arrayList.add(gVar2);
                            } else if (i39 > 0) {
                                i40 = hVar.f41374P0 + U8 + i40;
                                gVar2.a(c5130e5);
                                i39++;
                                i15 = i41;
                            }
                            i40 = U8;
                            gVar2.a(c5130e5);
                            i39++;
                            i15 = i41;
                        }
                    } else {
                        int i42 = 0;
                        i15 = 0;
                        int i43 = 0;
                        while (i42 < i9) {
                            C5130e c5130e6 = c5130eArr[i42];
                            int T8 = hVar.T(c5130e6, i30);
                            if (c5130e6.f41311p0[1] == 3) {
                                i15++;
                            }
                            int i44 = i15;
                            boolean z9 = (i43 == i30 || (hVar.f41375Q0 + i43) + T8 > i30) && gVar2.f41344b != null;
                            if (!z9 && i42 > 0 && (i16 = hVar.f41379U0) > 0 && i42 % i16 == 0) {
                                z9 = true;
                            }
                            if (z9) {
                                gVar2 = new g(hVar, i38, hVar.f41266I, hVar.J, hVar.f41267K, hVar.f41268L, i30);
                                gVar2.f41355n = i42;
                                arrayList.add(gVar2);
                            } else if (i42 > 0) {
                                i43 = hVar.f41375Q0 + T8 + i43;
                                gVar2.a(c5130e6);
                                i42++;
                                i15 = i44;
                            }
                            i43 = T8;
                            gVar2.a(c5130e6);
                            i42++;
                            i15 = i44;
                        }
                    }
                    int size3 = arrayList.size();
                    int i45 = hVar.f41391w0;
                    int i46 = hVar.f41387s0;
                    int i47 = hVar.f41392x0;
                    int i48 = hVar.f41388t0;
                    boolean z10 = iArr3[0] == 2 || iArr3[1] == 2;
                    if (i15 > 0 && z10) {
                        for (int i49 = 0; i49 < size3; i49++) {
                            g gVar3 = (g) arrayList.get(i49);
                            if (i38 == 0) {
                                gVar3.e(i30 - gVar3.d());
                            } else {
                                gVar3.e(i30 - gVar3.c());
                            }
                        }
                    }
                    int i50 = i45;
                    int i51 = i46;
                    int i52 = i47;
                    int i53 = i48;
                    C5129d c5129d5 = c5129d2;
                    C5129d c5129d6 = c5129d;
                    int i54 = 0;
                    int i55 = 0;
                    C5129d c5129d7 = c5129d3;
                    C5129d c5129d8 = c5129d4;
                    for (int i56 = 0; i56 < size3; i56++) {
                        g gVar4 = (g) arrayList.get(i56);
                        if (i38 == 0) {
                            if (i56 < size3 - 1) {
                                c5129d8 = ((g) arrayList.get(i56 + 1)).f41344b.J;
                                i53 = 0;
                            } else {
                                i53 = hVar.f41388t0;
                                c5129d8 = c5129d4;
                            }
                            C5129d c5129d9 = gVar4.f41344b.f41268L;
                            gVar4.f(i38, c5129d5, c5129d6, c5129d7, c5129d8, i50, i51, i52, i53, i30);
                            i54 = Math.max(i54, gVar4.d());
                            int c10 = gVar4.c() + i55;
                            if (i56 > 0) {
                                c10 += hVar.f41375Q0;
                            }
                            i55 = c10;
                            c5129d6 = c5129d9;
                            i51 = 0;
                        } else {
                            if (i56 < size3 - 1) {
                                c5129d7 = ((g) arrayList.get(i56 + 1)).f41344b.f41266I;
                                i52 = 0;
                            } else {
                                i52 = hVar.f41392x0;
                                c5129d7 = c5129d3;
                            }
                            C5129d c5129d10 = gVar4.f41344b.f41267K;
                            gVar4.f(i38, c5129d5, c5129d6, c5129d7, c5129d8, i50, i51, i52, i53, i30);
                            int d9 = gVar4.d() + i54;
                            int max = Math.max(i55, gVar4.c());
                            if (i56 > 0) {
                                d9 += hVar.f41374P0;
                            }
                            i55 = max;
                            i54 = d9;
                            c5129d5 = c5129d10;
                            i50 = 0;
                        }
                    }
                    iArr[0] = i54;
                    iArr[1] = i55;
                }
            } else if (i37 != 2) {
                if (i37 == 3) {
                    int i57 = hVar.f41380V0;
                    if (i9 != 0) {
                        arrayList.clear();
                        i14 = i36;
                        i10 = i27;
                        i11 = i28;
                        i12 = i29;
                        iArr = iArr2;
                        g gVar5 = new g(hVar, i57, hVar.f41266I, hVar.J, hVar.f41267K, hVar.f41268L, i30);
                        arrayList.add(gVar5);
                        if (i57 == 0) {
                            int i58 = 0;
                            int i59 = 0;
                            i20 = 0;
                            int i60 = 0;
                            while (i58 < i9) {
                                i59++;
                                C5130e c5130e7 = c5130eArr[i58];
                                int U9 = hVar.U(c5130e7, i30);
                                int i61 = i57;
                                int i62 = i58;
                                if (c5130e7.f41311p0[0] == 3) {
                                    i20++;
                                }
                                int i63 = i20;
                                boolean z11 = (i60 == i30 || (hVar.f41374P0 + i60) + U9 > i30) && gVar5.f41344b != null;
                                if (!z11 && i62 > 0 && (i24 = hVar.f41379U0) > 0 && i59 > i24) {
                                    z11 = true;
                                }
                                if (z11) {
                                    i57 = i61;
                                    i22 = size2;
                                    i23 = i62;
                                    gVar5 = new g(hVar, i57, hVar.f41266I, hVar.J, hVar.f41267K, hVar.f41268L, i30);
                                    gVar5.f41355n = i23;
                                    arrayList.add(gVar5);
                                    i60 = U9;
                                    i59 = 1;
                                } else {
                                    i57 = i61;
                                    i22 = size2;
                                    i23 = i62;
                                    i60 = i23 > 0 ? hVar.f41374P0 + U9 + i60 : U9;
                                }
                                gVar5.a(c5130e7);
                                i58 = i23 + 1;
                                i20 = i63;
                                size2 = i22;
                            }
                            i13 = size2;
                        } else {
                            i13 = size2;
                            int i64 = 0;
                            int i65 = 0;
                            int i66 = 0;
                            int i67 = 0;
                            while (i64 < i9) {
                                i65++;
                                C5130e c5130e8 = c5130eArr[i64];
                                int T9 = hVar.T(c5130e8, i30);
                                int i68 = i57;
                                if (c5130e8.f41311p0[1] == 3) {
                                    i66++;
                                }
                                int i69 = i66;
                                boolean z12 = (i67 == i30 || (hVar.f41375Q0 + i67) + T9 > i30) && gVar5.f41344b != null;
                                if (!z12 && i64 > 0 && (i21 = hVar.f41379U0) > 0 && i65 > i21) {
                                    z12 = true;
                                }
                                if (z12) {
                                    i57 = i68;
                                    gVar5 = new g(hVar, i57, hVar.f41266I, hVar.J, hVar.f41267K, hVar.f41268L, i30);
                                    gVar5.f41355n = i64;
                                    arrayList.add(gVar5);
                                    i67 = T9;
                                    i65 = 1;
                                } else {
                                    i57 = i68;
                                    i67 = i64 > 0 ? hVar.f41375Q0 + T9 + i67 : T9;
                                }
                                gVar5.a(c5130e8);
                                i64++;
                                i66 = i69;
                            }
                            i20 = i66;
                        }
                        int size4 = arrayList.size();
                        int i70 = hVar.f41391w0;
                        int i71 = hVar.f41387s0;
                        int i72 = hVar.f41392x0;
                        int i73 = hVar.f41388t0;
                        boolean z13 = iArr3[0] == 2 || iArr3[1] == 2;
                        if (i20 > 0 && z13) {
                            for (int i74 = 0; i74 < size4; i74++) {
                                g gVar6 = (g) arrayList.get(i74);
                                if (i57 == 0) {
                                    gVar6.e(i30 - gVar6.d());
                                } else {
                                    gVar6.e(i30 - gVar6.c());
                                }
                            }
                        }
                        int i75 = i70;
                        int i76 = i71;
                        int i77 = i72;
                        int i78 = i73;
                        C5129d c5129d11 = c5129d2;
                        C5129d c5129d12 = c5129d;
                        int i79 = 0;
                        int i80 = 0;
                        C5129d c5129d13 = c5129d3;
                        C5129d c5129d14 = c5129d4;
                        for (int i81 = 0; i81 < size4; i81++) {
                            g gVar7 = (g) arrayList.get(i81);
                            if (i57 == 0) {
                                if (i81 < size4 - 1) {
                                    c5129d14 = ((g) arrayList.get(i81 + 1)).f41344b.J;
                                    i78 = 0;
                                } else {
                                    i78 = hVar.f41388t0;
                                    c5129d14 = c5129d4;
                                }
                                C5129d c5129d15 = gVar7.f41344b.f41268L;
                                gVar7.f(i57, c5129d11, c5129d12, c5129d13, c5129d14, i75, i76, i77, i78, i30);
                                i79 = Math.max(i79, gVar7.d());
                                int c11 = gVar7.c() + i80;
                                if (i81 > 0) {
                                    c11 += hVar.f41375Q0;
                                }
                                i80 = c11;
                                c5129d12 = c5129d15;
                                i76 = 0;
                            } else {
                                if (i81 < size4 - 1) {
                                    c5129d13 = ((g) arrayList.get(i81 + 1)).f41344b.f41266I;
                                    i77 = 0;
                                } else {
                                    i77 = hVar.f41392x0;
                                    c5129d13 = c5129d3;
                                }
                                C5129d c5129d16 = gVar7.f41344b.f41267K;
                                gVar7.f(i57, c5129d11, c5129d12, c5129d13, c5129d14, i75, i76, i77, i78, i30);
                                int d10 = gVar7.d() + i79;
                                int max2 = Math.max(i80, gVar7.c());
                                if (i81 > 0) {
                                    d10 += hVar.f41374P0;
                                }
                                i80 = max2;
                                i79 = d10;
                                c5129d11 = c5129d16;
                                i75 = 0;
                            }
                        }
                        iArr[0] = i79;
                        iArr[1] = i80;
                    }
                }
                i10 = i27;
                i11 = i28;
                i12 = i29;
                iArr = iArr2;
                i13 = size2;
                i14 = i36;
            } else {
                i10 = i27;
                i11 = i28;
                i12 = i29;
                iArr = iArr2;
                i13 = size2;
                i14 = i36;
                int i82 = hVar.f41380V0;
                if (i82 == 0) {
                    int i83 = hVar.f41379U0;
                    if (i83 <= 0) {
                        int i84 = 0;
                        i19 = 0;
                        for (int i85 = 0; i85 < i9; i85++) {
                            if (i85 > 0) {
                                i84 += hVar.f41374P0;
                            }
                            C5130e c5130e9 = c5130eArr[i85];
                            if (c5130e9 != null) {
                                int U10 = hVar.U(c5130e9, i30) + i84;
                                if (U10 > i30) {
                                    break;
                                }
                                i19++;
                                i84 = U10;
                            }
                        }
                    } else {
                        i19 = i83;
                    }
                    i18 = 0;
                } else {
                    i18 = hVar.f41379U0;
                    if (i18 <= 0) {
                        int i86 = 0;
                        int i87 = 0;
                        for (int i88 = 0; i88 < i9; i88++) {
                            if (i88 > 0) {
                                i86 += hVar.f41375Q0;
                            }
                            C5130e c5130e10 = c5130eArr[i88];
                            if (c5130e10 != null) {
                                int T10 = hVar.T(c5130e10, i30) + i86;
                                if (T10 > i30) {
                                    break;
                                }
                                i87++;
                                i86 = T10;
                            }
                        }
                        i18 = i87;
                    }
                    i19 = 0;
                }
                if (hVar.f41384Z0 == null) {
                    hVar.f41384Z0 = new int[2];
                }
                boolean z14 = (i18 == 0 && i82 == 1) || (i19 == 0 && i82 == 0);
                while (!z14) {
                    if (i82 == 0) {
                        i18 = (int) Math.ceil(i9 / i19);
                    } else {
                        i19 = (int) Math.ceil(i9 / i18);
                    }
                    C5130e[] c5130eArr5 = hVar.f41383Y0;
                    if (c5130eArr5 == null || c5130eArr5.length < i19) {
                        obj = null;
                        hVar.f41383Y0 = new C5130e[i19];
                    } else {
                        obj = null;
                        Arrays.fill(c5130eArr5, (Object) null);
                    }
                    C5130e[] c5130eArr6 = hVar.f41382X0;
                    if (c5130eArr6 == null || c5130eArr6.length < i18) {
                        hVar.f41382X0 = new C5130e[i18];
                    } else {
                        Arrays.fill(c5130eArr6, obj);
                    }
                    for (int i89 = 0; i89 < i19; i89++) {
                        for (int i90 = 0; i90 < i18; i90++) {
                            int i91 = (i90 * i19) + i89;
                            if (i82 == 1) {
                                i91 = (i89 * i18) + i90;
                            }
                            if (i91 < c5130eArr.length && (c5130e = c5130eArr[i91]) != null) {
                                int U11 = hVar.U(c5130e, i30);
                                C5130e c5130e11 = hVar.f41383Y0[i89];
                                if (c5130e11 == null || c5130e11.q() < U11) {
                                    hVar.f41383Y0[i89] = c5130e;
                                }
                                int T11 = hVar.T(c5130e, i30);
                                C5130e c5130e12 = hVar.f41382X0[i90];
                                if (c5130e12 == null || c5130e12.k() < T11) {
                                    hVar.f41382X0[i90] = c5130e;
                                }
                            }
                        }
                    }
                    int i92 = 0;
                    for (int i93 = 0; i93 < i19; i93++) {
                        C5130e c5130e13 = hVar.f41383Y0[i93];
                        if (c5130e13 != null) {
                            if (i93 > 0) {
                                i92 += hVar.f41374P0;
                            }
                            i92 = hVar.U(c5130e13, i30) + i92;
                        }
                    }
                    int i94 = 0;
                    for (int i95 = 0; i95 < i18; i95++) {
                        C5130e c5130e14 = hVar.f41382X0[i95];
                        if (c5130e14 != null) {
                            if (i95 > 0) {
                                i94 += hVar.f41375Q0;
                            }
                            i94 = hVar.T(c5130e14, i30) + i94;
                        }
                    }
                    iArr[0] = i92;
                    iArr[1] = i94;
                    if (i82 == 0) {
                        if (i92 > i30 && i19 > 1) {
                            i19--;
                        }
                        z14 = true;
                    } else {
                        if (i94 > i30 && i18 > 1) {
                            i18--;
                        }
                        z14 = true;
                    }
                }
                int[] iArr4 = hVar.f41384Z0;
                iArr4[0] = i19;
                iArr4[1] = i18;
            }
        } else {
            i10 = i27;
            i11 = i28;
            i12 = i29;
            iArr = iArr2;
            i13 = size2;
            i14 = i36;
            int i96 = hVar.f41380V0;
            if (i9 != 0) {
                if (arrayList.size() == 0) {
                    gVar = new g(hVar, i96, hVar.f41266I, hVar.J, hVar.f41267K, hVar.f41268L, i30);
                    arrayList.add(gVar);
                } else {
                    gVar = (g) arrayList.get(0);
                    gVar.f41345c = 0;
                    gVar.f41344b = null;
                    gVar.f41353l = 0;
                    gVar.f41354m = 0;
                    gVar.f41355n = 0;
                    gVar.f41356o = 0;
                    gVar.f41357p = 0;
                    gVar.f(i96, hVar.f41266I, hVar.J, hVar.f41267K, hVar.f41268L, hVar.f41391w0, hVar.f41387s0, hVar.f41392x0, hVar.f41388t0, i30);
                }
                for (int i97 = 0; i97 < i9; i97++) {
                    gVar.a(c5130eArr[i97]);
                }
                c9 = 0;
                iArr[0] = gVar.d();
                r28 = 1;
                iArr[1] = gVar.c();
                int i98 = iArr[c9] + i14 + i10;
                int i99 = iArr[r28] + i11 + i12;
                if (mode != 1073741824) {
                    size = mode == Integer.MIN_VALUE ? Math.min(i98, size) : mode == 0 ? i98 : 0;
                }
                int min = mode2 != 1073741824 ? i13 : mode2 == Integer.MIN_VALUE ? Math.min(i99, i13) : mode2 == 0 ? i99 : 0;
                hVar.f41394z0 = size;
                hVar.f41360A0 = min;
                hVar.O(size);
                hVar.L(min);
                hVar.f41393y0 = hVar.f41402r0 <= 0 ? r28 : false;
                setMeasuredDimension(hVar.f41394z0, hVar.f41360A0);
            }
        }
        r28 = 1;
        int i982 = iArr[c9] + i14 + i10;
        int i992 = iArr[r28] + i11 + i12;
        if (mode != 1073741824) {
        }
        if (mode2 != 1073741824) {
        }
        hVar.f41394z0 = size;
        hVar.f41360A0 = min;
        hVar.O(size);
        hVar.L(min);
        hVar.f41393y0 = hVar.f41402r0 <= 0 ? r28 : false;
        setMeasuredDimension(hVar.f41394z0, hVar.f41360A0);
    }

    @Override // z.c, android.view.View
    public final void onMeasure(int i, int i4) {
        j(this.f4610C, i, i4);
    }

    public void setFirstHorizontalBias(float f2) {
        this.f4610C.f41370L0 = f2;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f4610C.f41364F0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f2) {
        this.f4610C.f41371M0 = f2;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f4610C.f41365G0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f4610C.f41376R0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f2) {
        this.f4610C.f41368J0 = f2;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f4610C.f41374P0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f4610C.f41362D0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f2) {
        this.f4610C.f41372N0 = f2;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.f4610C.f41366H0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f2) {
        this.f4610C.f41373O0 = f2;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.f4610C.f41367I0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f4610C.f41379U0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f4610C.f41380V0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        h hVar = this.f4610C;
        hVar.f41387s0 = i;
        hVar.f41388t0 = i;
        hVar.f41389u0 = i;
        hVar.f41390v0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f4610C.f41388t0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f4610C.f41391w0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f4610C.f41392x0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f4610C.f41387s0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f4610C.f41377S0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f2) {
        this.f4610C.f41369K0 = f2;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f4610C.f41375Q0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f4610C.f41363E0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f4610C.f41378T0 = i;
        requestLayout();
    }
}
