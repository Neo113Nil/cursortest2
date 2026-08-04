package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.gamericefishpro.space.k3.c;
import com.gamericefishpro.space.k3.d;
import com.gamericefishpro.space.k3.e;
import com.gamericefishpro.space.k3.f;
import com.gamericefishpro.space.k3.g;
import com.gamericefishpro.space.k3.h;
import com.gamericefishpro.space.l3.b;
import com.gamericefishpro.space.n3.s;
import com.gamericefishpro.space.n3.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class Flow extends u {
    public final g C;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new int[32];
        this.z = new HashMap();
        this.i = context;
        super.g(attributeSet);
        g gVar = new g();
        gVar.r0 = 0;
        gVar.s0 = 0;
        gVar.t0 = 0;
        gVar.u0 = 0;
        gVar.v0 = 0;
        gVar.w0 = 0;
        gVar.x0 = false;
        gVar.y0 = 0;
        gVar.z0 = 0;
        gVar.A0 = new b();
        gVar.B0 = null;
        gVar.C0 = -1;
        gVar.D0 = -1;
        gVar.E0 = -1;
        gVar.F0 = -1;
        gVar.G0 = -1;
        gVar.H0 = -1;
        gVar.I0 = 0.5f;
        gVar.J0 = 0.5f;
        gVar.K0 = 0.5f;
        gVar.L0 = 0.5f;
        gVar.M0 = 0.5f;
        gVar.N0 = 0.5f;
        gVar.O0 = 0;
        gVar.P0 = 0;
        gVar.Q0 = 2;
        gVar.R0 = 2;
        gVar.S0 = 0;
        gVar.T0 = -1;
        gVar.U0 = 0;
        gVar.V0 = new ArrayList();
        gVar.W0 = null;
        gVar.X0 = null;
        gVar.Y0 = null;
        gVar.a1 = 0;
        this.C = gVar;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.C.U0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    g gVar2 = this.C;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.r0 = dimensionPixelSize;
                    gVar2.s0 = dimensionPixelSize;
                    gVar2.t0 = dimensionPixelSize;
                    gVar2.u0 = dimensionPixelSize;
                } else if (index == 18) {
                    g gVar3 = this.C;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar3.t0 = dimensionPixelSize2;
                    gVar3.v0 = dimensionPixelSize2;
                    gVar3.w0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.C.u0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.C.v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.C.r0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.C.w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.C.s0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.C.S0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.C.C0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.C.D0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.C.E0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.C.G0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.C.F0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.C.H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.C.I0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.C.K0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.C.M0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.C.L0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.C.N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.C.J0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.C.Q0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.C.R0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.C.O0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.C.P0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.C.T0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.v = this.C;
        i();
    }

    @Override // com.gamericefishpro.space.n3.c
    public final void h(d dVar, boolean z) {
        g gVar = this.C;
        int i = gVar.t0;
        if (i > 0 || gVar.u0 > 0) {
            if (z) {
                gVar.v0 = gVar.u0;
                gVar.w0 = i;
            } else {
                gVar.v0 = i;
                gVar.w0 = gVar.u0;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0150 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x0152  */
    /* JADX WARN: Code duplicated, block: B:106:0x015a  */
    /* JADX WARN: Code duplicated, block: B:109:0x0162  */
    /* JADX WARN: Code duplicated, block: B:115:0x016e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x0185  */
    /* JADX WARN: Code duplicated, block: B:126:0x0190  */
    /* JADX WARN: Code duplicated, block: B:131:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:140:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:143:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:147:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:150:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:158:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:163:0x020b  */
    /* JADX WARN: Code duplicated, block: B:168:0x0229  */
    /* JADX WARN: Code duplicated, block: B:170:0x022f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:171:0x0231  */
    /* JADX WARN: Code duplicated, block: B:176:0x0241  */
    /* JADX WARN: Code duplicated, block: B:178:0x0249 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:179:0x024b  */
    /* JADX WARN: Code duplicated, block: B:184:0x025f  */
    /* JADX WARN: Code duplicated, block: B:188:0x0267  */
    /* JADX WARN: Code duplicated, block: B:189:0x0269  */
    /* JADX WARN: Code duplicated, block: B:195:0x0290 A[PHI: r28 r30 r31 r32 r33 r35
      0x0290: PHI (r28v1 char) = (r28v0 char), (r28v3 char), (r28v4 char) binds: [B:295:0x04b4, B:293:0x049b, B:194:0x0284] A[DONT_GENERATE, DONT_INLINE]
      0x0290: PHI (r30v1 int) = (r30v0 int), (r30v3 int), (r30v4 int) binds: [B:295:0x04b4, B:293:0x049b, B:194:0x0284] A[DONT_GENERATE, DONT_INLINE]
      0x0290: PHI (r31v1 int) = (r31v0 int), (r31v3 int), (r31v4 int) binds: [B:295:0x04b4, B:293:0x049b, B:194:0x0284] A[DONT_GENERATE, DONT_INLINE]
      0x0290: PHI (r32v1 int) = (r32v0 int), (r32v3 int), (r32v4 int) binds: [B:295:0x04b4, B:293:0x049b, B:194:0x0284] A[DONT_GENERATE, DONT_INLINE]
      0x0290: PHI (r33v1 int[]) = (r33v0 int[]), (r33v3 int[]), (r33v4 int[]) binds: [B:295:0x04b4, B:293:0x049b, B:194:0x0284] A[DONT_GENERATE, DONT_INLINE]
      0x0290: PHI (r35v1 int) = (r35v0 int), (r35v3 int), (r35v4 int) binds: [B:295:0x04b4, B:293:0x049b, B:194:0x0284] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:196:0x0294  */
    /* JADX WARN: Code duplicated, block: B:199:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:201:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:203:0x02df  */
    /* JADX WARN: Code duplicated, block: B:205:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:222:0x0314  */
    /* JADX WARN: Code duplicated, block: B:224:0x0332  */
    /* JADX WARN: Code duplicated, block: B:226:0x0339  */
    /* JADX WARN: Code duplicated, block: B:228:0x0348  */
    /* JADX WARN: Code duplicated, block: B:230:0x034e  */
    /* JADX WARN: Code duplicated, block: B:232:0x035b  */
    /* JADX WARN: Code duplicated, block: B:249:0x0380  */
    /* JADX WARN: Code duplicated, block: B:251:0x0398  */
    /* JADX WARN: Code duplicated, block: B:253:0x039c  */
    /* JADX WARN: Code duplicated, block: B:262:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:267:0x03da  */
    /* JADX WARN: Code duplicated, block: B:269:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:270:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:274:0x040d  */
    /* JADX WARN: Code duplicated, block: B:276:0x0415  */
    /* JADX WARN: Code duplicated, block: B:278:0x0419  */
    /* JADX WARN: Code duplicated, block: B:279:0x042a  */
    /* JADX WARN: Code duplicated, block: B:282:0x044c  */
    /* JADX WARN: Code duplicated, block: B:284:0x0455  */
    /* JADX WARN: Code duplicated, block: B:286:0x045b  */
    /* JADX WARN: Code duplicated, block: B:287:0x046c  */
    /* JADX WARN: Code duplicated, block: B:290:0x048c  */
    /* JADX WARN: Code duplicated, block: B:294:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:297:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:299:0x04be  */
    /* JADX WARN: Code duplicated, block: B:300:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:303:0x0513 A[LOOP:14: B:302:0x0511->B:303:0x0513, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:308:0x053c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:309:0x053e  */
    /* JADX WARN: Code duplicated, block: B:310:0x0543 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:311:0x0545  */
    /* JADX WARN: Code duplicated, block: B:312:0x0547  */
    /* JADX WARN: Code duplicated, block: B:315:0x054b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:316:0x054d  */
    /* JADX WARN: Code duplicated, block: B:317:0x0552 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:318:0x0554  */
    /* JADX WARN: Code duplicated, block: B:319:0x0556  */
    /* JADX WARN: Code duplicated, block: B:322:0x0565  */
    /* JADX WARN: Code duplicated, block: B:323:0x0568  */
    /* JADX WARN: Code duplicated, block: B:334:0x00d7 A[EDGE_INSN: B:334:0x00d7->B:60:0x00d7 BREAK  A[LOOP:1: B:54:0x00c0->B:59:0x00d2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:340:0x013f A[EDGE_INSN: B:340:0x013f->B:95:0x013f BREAK  A[LOOP:3: B:83:0x0121->B:94:0x013a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:341:0x013f A[EDGE_INSN: B:341:0x013f->B:95:0x013f BREAK  A[LOOP:3: B:83:0x0121->B:94:0x013a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:343:0x013a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:355:0x023a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:358:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:360:0x0168 A[EDGE_INSN: B:360:0x0168->B:111:0x0168 BREAK  A[LOOP:9: B:100:0x014e->B:110:0x0165], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:362:0x0165 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0097  */
    /* JADX WARN: Code duplicated, block: B:40:0x009d  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:73:0x0100  */
    /* JADX WARN: Code duplicated, block: B:75:0x0103  */
    /* JADX WARN: Code duplicated, block: B:77:0x0106  */
    /* JADX WARN: Code duplicated, block: B:78:0x0116  */
    /* JADX WARN: Code duplicated, block: B:80:0x011a  */
    /* JADX WARN: Code duplicated, block: B:82:0x011e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0125 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x0127  */
    /* JADX WARN: Code duplicated, block: B:90:0x012f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0137  */
    /* JADX WARN: Code duplicated, block: B:96:0x0141  */
    /* JADX WARN: Code duplicated, block: B:97:0x0145  */
    /* JADX WARN: Code duplicated, block: B:99:0x014b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.gamericefishpro.space.n3.u
    public final void j(g gVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr;
        int i7;
        int i8;
        d[] dVarArr;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        d[] dVarArr2;
        int i14;
        int i15;
        int i16;
        int[] iArr2;
        int i17;
        int i18;
        int i19;
        char c;
        int i20;
        f fVar;
        int i21;
        char c2;
        int i22;
        int i23;
        boolean z;
        int i24;
        char c3;
        int[] iArr3;
        int i25;
        c cVar;
        c cVar2;
        f fVar2;
        int i26;
        f fVar3;
        int i27;
        int i28;
        int i29;
        int i30;
        d dVar;
        int iO;
        boolean z2;
        int i31;
        int size;
        int[] iArr4;
        int i32;
        boolean z3;
        c cVar3;
        int i33;
        int i34;
        int i35;
        int i36;
        c cVar4;
        c cVar5;
        c cVar6;
        int i37;
        int iMax;
        int i38;
        f fVar4;
        int i39;
        int iD;
        int iC;
        int i40;
        f fVar5;
        f fVar6;
        int i41;
        int i42;
        d dVar2;
        int iP;
        int i43;
        int i44;
        boolean z4;
        d dVar3;
        int i45;
        int i46;
        int i47;
        int i48;
        int iCeil;
        int iCeil2;
        int i49;
        int i50;
        int i51;
        d dVar4;
        int iO2;
        boolean z5;
        d[] dVarArr3;
        d[] dVarArr4;
        int i52;
        int i53;
        int i54;
        int iP2;
        int i55;
        int iO3;
        d dVar5;
        d dVar6;
        int i56;
        int i57;
        int i58;
        int i59;
        d dVar7;
        d[] dVarArr5;
        d dVar8;
        d dVar9;
        int i60;
        int i61;
        int i62;
        d dVar10;
        int iP3;
        int i63;
        int i64;
        d dVar11;
        int i65;
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size3 = View.MeasureSpec.getSize(i2);
        int i66 = 0;
        if (gVar == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        ArrayList arrayList = gVar.V0;
        if (gVar.q0 > 0) {
            b bVar = gVar.A0;
            d dVar12 = gVar.S;
            com.gamericefishpro.space.n3.f fVar7 = dVar12 != null ? ((e) dVar12).t0 : null;
            if (fVar7 == null) {
                gVar.y0 = 0;
                gVar.z0 = 0;
                gVar.x0 = false;
            } else {
                int i67 = 0;
                while (i67 < gVar.q0) {
                    d dVar13 = gVar.p0[i67];
                    if (dVar13 != null && !(dVar13 instanceof h)) {
                        int iJ = dVar13.j(i66);
                        int iJ2 = dVar13.j(1);
                        if (iJ != 3 || dVar13.q == 1 || iJ2 != 3 || dVar13.r == 1) {
                            if (iJ == 3) {
                                iJ = 2;
                            }
                            if (iJ2 == 3) {
                                iJ2 = 2;
                            }
                            bVar.a = iJ;
                            bVar.b = iJ2;
                            bVar.c = dVar13.n();
                            bVar.d = dVar13.k();
                            fVar7.b(dVar13, bVar);
                            dVar13.J(bVar.e);
                            dVar13.G(bVar.f);
                            dVar13.D(bVar.g);
                        }
                    }
                    i67++;
                    i66 = 0;
                }
                i3 = gVar.v0;
                i4 = gVar.w0;
                i5 = gVar.r0;
                i6 = gVar.s0;
                iArr = new int[2];
                i7 = (size2 - i3) - i4;
                i8 = gVar.U0;
                if (i8 == 1) {
                    i7 = (size3 - i5) - i6;
                }
                if (i8 == 0) {
                    if (gVar.C0 == -1) {
                        i65 = 0;
                        gVar.C0 = 0;
                    } else {
                        i65 = 0;
                    }
                    if (gVar.D0 == -1) {
                        gVar.D0 = i65;
                    }
                } else {
                    if (gVar.C0 == -1) {
                        gVar.C0 = 0;
                    }
                    if (gVar.D0 == -1) {
                        gVar.D0 = 0;
                    }
                }
                dVarArr = gVar.p0;
                i9 = 0;
                i10 = 0;
                while (true) {
                    i11 = gVar.q0;
                    i12 = i5;
                    if (i9 < i11) {
                        break;
                    }
                    if (gVar.p0[i9].f0 == 8) {
                        i10++;
                    }
                    i9++;
                    i5 = i12;
                }
                if (i10 > 0) {
                    dVarArr = new d[i11 - i10];
                    i63 = 0;
                    i64 = 0;
                    while (i63 < gVar.q0) {
                        dVar11 = gVar.p0[i63];
                        int i68 = i63;
                        if (dVar11.f0 != 8) {
                            dVarArr[i64] = dVar11;
                            i64++;
                        }
                        i63 = i68 + 1;
                    }
                    i13 = i64;
                } else {
                    i13 = i11;
                }
                dVarArr2 = dVarArr;
                gVar.Z0 = dVarArr2;
                gVar.a1 = i13;
                i14 = gVar.S0;
                if (i14 != 0) {
                    if (i14 != 1) {
                        i24 = i6;
                        c3 = 1;
                        iArr3 = iArr;
                        i25 = gVar.U0;
                        cVar = gVar.K;
                        cVar2 = gVar.J;
                        if (i13 == 0) {
                            arrayList.clear();
                            i26 = i7;
                            i17 = i3;
                            c = 1;
                            i18 = i4;
                            i19 = i12;
                            i15 = i24;
                            iArr2 = iArr3;
                            fVar2 = new f(gVar, i25, gVar.H, gVar.I, gVar.J, gVar.K, i26);
                            arrayList.add(fVar2);
                            if (i25 == 0) {
                                fVar6 = fVar2;
                                i41 = 0;
                                i30 = 0;
                                i42 = 0;
                                while (i41 < i13) {
                                    dVar2 = dVarArr2[i41];
                                    iP = gVar.P(dVar2, i26);
                                    i43 = i41;
                                    if (dVar2.o0[0] == 3) {
                                        i30++;
                                    }
                                    i44 = i30;
                                    z4 = (i42 != i26 || (gVar.O0 + i42) + iP > i26) && fVar6.b != null;
                                    if (!z4 && i43 > 0 && (i47 = gVar.T0) > 0 && i43 % i47 == 0) {
                                        z4 = true;
                                    }
                                    if (z4) {
                                        i45 = i44;
                                        dVar3 = dVar2;
                                        i46 = i43;
                                        f fVar8 = new f(gVar, i25, gVar.H, gVar.I, gVar.J, gVar.K, i26);
                                        fVar8.n = i46;
                                        arrayList.add(fVar8);
                                        fVar6 = fVar8;
                                    } else {
                                        dVar3 = dVar2;
                                        i45 = i44;
                                        i46 = i43;
                                        if (i46 > 0) {
                                            i42 = gVar.O0 + iP + i42;
                                        }
                                        fVar6.a(dVar3);
                                        i41 = i46 + 1;
                                        i30 = i45;
                                    }
                                    i42 = iP;
                                    fVar6.a(dVar3);
                                    i41 = i46 + 1;
                                    i30 = i45;
                                }
                            } else {
                                fVar3 = fVar2;
                                i27 = 0;
                                i28 = 0;
                                i29 = 0;
                                while (i27 < i13) {
                                    dVar = dVarArr2[i27];
                                    iO = gVar.O(dVar, i26);
                                    if (dVar.o0[1] == 3) {
                                        i28++;
                                    }
                                    int i69 = i28;
                                    z2 = (i29 != i26 || (gVar.P0 + i29) + iO > i26) && fVar3.b != null;
                                    if (!z2 && i27 > 0 && (i31 = gVar.T0) > 0 && i27 % i31 == 0) {
                                        z2 = true;
                                    }
                                    if (z2) {
                                        f fVar9 = new f(gVar, i25, gVar.H, gVar.I, gVar.J, gVar.K, i26);
                                        fVar9.n = i27;
                                        arrayList.add(fVar9);
                                        fVar3 = fVar9;
                                    } else {
                                        if (i27 > 0) {
                                            i29 = gVar.P0 + iO + i29;
                                        }
                                        fVar3.a(dVar);
                                        i27++;
                                        i28 = i69;
                                    }
                                    i29 = iO;
                                    fVar3.a(dVar);
                                    i27++;
                                    i28 = i69;
                                }
                                i30 = i28;
                            }
                            size = arrayList.size();
                            c cVar7 = gVar.H;
                            c cVar8 = gVar.I;
                            int i70 = gVar.v0;
                            int i71 = gVar.r0;
                            int i72 = gVar.w0;
                            int i73 = gVar.s0;
                            iArr4 = gVar.o0;
                            i32 = i25;
                            if (iArr4[0] != 2 || iArr4[1] == 2) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (i30 > 0 && z3) {
                                for (i40 = 0; i40 < size; i40++) {
                                    fVar5 = (f) arrayList.get(i40);
                                    if (i32 == 0) {
                                        fVar5.e(i26 - fVar5.d());
                                    } else {
                                        fVar5.e(i26 - fVar5.c());
                                    }
                                }
                            }
                            cVar3 = cVar8;
                            i33 = i70;
                            i34 = i71;
                            i35 = i72;
                            i36 = i73;
                            cVar4 = cVar;
                            cVar5 = cVar7;
                            cVar6 = cVar2;
                            i37 = 0;
                            iMax = 0;
                            i38 = 0;
                            while (i37 < size) {
                                fVar4 = (f) arrayList.get(i37);
                                if (i32 == 0) {
                                    if (i37 < size - 1) {
                                        cVar4 = ((f) arrayList.get(i37 + 1)).b.I;
                                        i36 = 0;
                                    } else {
                                        i36 = gVar.s0;
                                        cVar4 = cVar;
                                    }
                                    c cVar9 = fVar4.b.K;
                                    i39 = i32;
                                    fVar4.f(i39, cVar5, cVar3, cVar6, cVar4, i33, i34, i35, i36, i26);
                                    iMax = Math.max(iMax, fVar4.d());
                                    iC = fVar4.c() + i38;
                                    if (i37 > 0) {
                                        iC += gVar.P0;
                                    }
                                    i38 = iC;
                                    cVar3 = cVar9;
                                    i34 = 0;
                                } else {
                                    i39 = i32;
                                    if (i37 < size - 1) {
                                        cVar6 = ((f) arrayList.get(i37 + 1)).b.H;
                                        i35 = 0;
                                    } else {
                                        i35 = gVar.w0;
                                        cVar6 = cVar2;
                                    }
                                    c cVar10 = fVar4.b.J;
                                    fVar4.f(i39, cVar5, cVar3, cVar6, cVar4, i33, i34, i35, i36, i26);
                                    iD = fVar4.d() + iMax;
                                    int iMax2 = Math.max(i38, fVar4.c());
                                    if (i37 > 0) {
                                        iD += gVar.O0;
                                    }
                                    i38 = iMax2;
                                    iMax = iD;
                                    cVar5 = cVar10;
                                    i33 = 0;
                                }
                                i37++;
                                i32 = i39;
                            }
                            iArr2[0] = iMax;
                            iArr2[1] = i38;
                        }
                        c2 = 0;
                    } else if (i14 != 2) {
                        i15 = i6;
                        iArr2 = iArr;
                        i17 = i3;
                        i18 = i4;
                        i19 = i12;
                        c2 = 0;
                        c = 1;
                    } else {
                        i48 = gVar.U0;
                        if (i48 == 0) {
                            i60 = gVar.T0;
                            if (i60 <= 0) {
                                i61 = 0;
                                i62 = 0;
                                iCeil2 = 0;
                                while (true) {
                                    i24 = i6;
                                    if (i61 >= i13) {
                                        break;
                                    }
                                    if (i61 > 0) {
                                        i62 += gVar.O0;
                                    }
                                    dVar10 = dVarArr2[i61];
                                    if (dVar10 != null) {
                                        iP3 = gVar.P(dVar10, i7) + i62;
                                        if (iP3 > i7) {
                                            break;
                                        }
                                        iCeil2++;
                                        i62 = iP3;
                                    }
                                    i61++;
                                    i6 = i24;
                                }
                            } else {
                                i24 = i6;
                                iCeil2 = i60;
                            }
                            iCeil = 0;
                        } else {
                            i24 = i6;
                            iCeil = gVar.T0;
                            if (iCeil <= 0) {
                                i50 = 0;
                                i51 = 0;
                                for (i49 = 0; i49 < i13; i49++) {
                                    if (i49 > 0) {
                                        i50 += gVar.P0;
                                    }
                                    dVar4 = dVarArr2[i49];
                                    if (dVar4 != null) {
                                        iO2 = gVar.O(dVar4, i7) + i50;
                                        if (iO2 > i7) {
                                            break;
                                        }
                                        i51++;
                                        i50 = iO2;
                                    }
                                }
                                iCeil = i51;
                            }
                            iCeil2 = 0;
                        }
                        if (gVar.Y0 == null) {
                            gVar.Y0 = new int[2];
                        }
                        z5 = (iCeil != 0 && i48 == 1) || (iCeil2 == 0 && i48 == 0);
                        while (!z5) {
                            if (i48 == 0) {
                                iCeil = (int) Math.ceil(i13 / iCeil2);
                            } else {
                                iCeil2 = (int) Math.ceil(i13 / iCeil);
                                iCeil = iCeil;
                            }
                            dVarArr3 = gVar.X0;
                            int[] iArr5 = iArr;
                            if (dVarArr3 != null || dVarArr3.length < iCeil2) {
                                gVar.X0 = new d[iCeil2];
                            } else {
                                Arrays.fill(dVarArr3, (Object) null);
                            }
                            dVarArr4 = gVar.W0;
                            if (dVarArr4 != null || dVarArr4.length < iCeil) {
                                gVar.W0 = new d[iCeil];
                            } else {
                                Arrays.fill(dVarArr4, (Object) null);
                            }
                            i52 = 0;
                            while (i52 < iCeil2) {
                                i56 = 0;
                                while (i56 < iCeil) {
                                    i57 = (i56 * iCeil2) + i52;
                                    i58 = i52;
                                    if (i48 == 1) {
                                        i57 = (i58 * iCeil) + i56;
                                    }
                                    int i74 = i48;
                                    i59 = i57;
                                    if (i59 >= dVarArr2.length && (dVar7 = dVarArr2[i59]) != null) {
                                        int iP4 = gVar.P(dVar7, i7);
                                        dVarArr5 = dVarArr2;
                                        dVar8 = gVar.X0[i58];
                                        if (dVar8 != null || dVar8.n() < iP4) {
                                            gVar.X0[i58] = dVar7;
                                        }
                                        int iO4 = gVar.O(dVar7, i7);
                                        dVar9 = gVar.W0[i56];
                                        if (dVar9 != null || dVar9.k() < iO4) {
                                            gVar.W0[i56] = dVar7;
                                        }
                                    } else {
                                        dVarArr5 = dVarArr2;
                                    }
                                    i56++;
                                    i52 = i58;
                                    i48 = i74;
                                    dVarArr2 = dVarArr5;
                                }
                                i52++;
                            }
                            d[] dVarArr6 = dVarArr2;
                            i53 = i48;
                            iP2 = 0;
                            for (i54 = 0; i54 < iCeil2; i54++) {
                                dVar6 = gVar.X0[i54];
                                if (dVar6 == null) {
                                    if (i54 > 0) {
                                        iP2 += gVar.O0;
                                    }
                                    iP2 = gVar.P(dVar6, i7) + iP2;
                                }
                            }
                            i55 = 0;
                            iO3 = 0;
                            while (i55 < iCeil) {
                                dVar5 = gVar.W0[i55];
                                int i75 = i55;
                                if (dVar5 == null) {
                                    if (i55 > 0) {
                                        iO3 += gVar.P0;
                                    }
                                    iO3 = gVar.O(dVar5, i7) + iO3;
                                }
                                i55 = i75 + 1;
                            }
                            iArr5[0] = iP2;
                            iArr5[1] = iO3;
                            if (i53 == 0) {
                                if (iP2 > i7 || iCeil2 <= 1) {
                                    z5 = true;
                                } else {
                                    iCeil2--;
                                    z5 = z5;
                                }
                            } else if (iO3 > i7 || iCeil <= 1) {
                                z5 = true;
                            } else {
                                iCeil--;
                                z5 = z5;
                            }
                            iArr = iArr5;
                            i48 = i53;
                            dVarArr2 = dVarArr6;
                        }
                        iArr3 = iArr;
                        c3 = 1;
                        int[] iArr6 = gVar.Y0;
                        iArr6[0] = iCeil2;
                        iArr6[1] = iCeil;
                    }
                    c = c3;
                    i17 = i3;
                    i18 = i4;
                    i19 = i12;
                    i15 = i24;
                    iArr2 = iArr3;
                    c2 = 0;
                } else {
                    i15 = i6;
                    i16 = i7;
                    iArr2 = iArr;
                    i17 = i3;
                    i18 = i4;
                    i19 = i12;
                    c = 1;
                    i20 = gVar.U0;
                    if (i13 == 0) {
                        c2 = 0;
                    } else {
                        if (arrayList.size() == 0) {
                            fVar = new f(gVar, i20, gVar.H, gVar.I, gVar.J, gVar.K, i16);
                            arrayList.add(fVar);
                        } else {
                            f fVar10 = (f) arrayList.get(0);
                            fVar10.c = 0;
                            fVar10.b = null;
                            fVar10.l = 0;
                            fVar10.m = 0;
                            fVar10.n = 0;
                            fVar10.o = 0;
                            fVar10.p = 0;
                            fVar10.f(i20, gVar.H, gVar.I, gVar.J, gVar.K, gVar.v0, gVar.r0, gVar.w0, gVar.s0, i16);
                            fVar = fVar10;
                        }
                        for (i21 = 0; i21 < i13; i21++) {
                            fVar.a(dVarArr2[i21]);
                        }
                        c2 = 0;
                        iArr2[0] = fVar.d();
                        iArr2[1] = fVar.c();
                    }
                }
                i22 = iArr2[c2] + i17 + i18;
                i23 = iArr2[c] + i19 + i15;
                if (mode != 1073741824) {
                    if (mode == Integer.MIN_VALUE) {
                        size2 = Math.min(i22, size2);
                    } else if (mode == 0) {
                        size2 = i22;
                    } else {
                        size2 = 0;
                    }
                }
                if (mode2 != 1073741824) {
                    if (mode2 == Integer.MIN_VALUE) {
                        size3 = Math.min(i23, size3);
                    } else if (mode2 == 0) {
                        size3 = i23;
                    } else {
                        size3 = 0;
                    }
                }
                gVar.y0 = size2;
                gVar.z0 = size3;
                gVar.J(size2);
                gVar.G(size3);
                if (gVar.q0 > 0) {
                    z = c;
                } else {
                    z = 0;
                }
                gVar.x0 = z;
            }
        } else {
            i3 = gVar.v0;
            i4 = gVar.w0;
            i5 = gVar.r0;
            i6 = gVar.s0;
            iArr = new int[2];
            i7 = (size2 - i3) - i4;
            i8 = gVar.U0;
            if (i8 == 1) {
                i7 = (size3 - i5) - i6;
            }
            if (i8 == 0) {
                if (gVar.C0 == -1) {
                    i65 = 0;
                    gVar.C0 = 0;
                } else {
                    i65 = 0;
                }
                if (gVar.D0 == -1) {
                    gVar.D0 = i65;
                }
            } else {
                if (gVar.C0 == -1) {
                    gVar.C0 = 0;
                }
                if (gVar.D0 == -1) {
                    gVar.D0 = 0;
                }
            }
            dVarArr = gVar.p0;
            i9 = 0;
            i10 = 0;
            while (true) {
                i11 = gVar.q0;
                i12 = i5;
                if (i9 < i11) {
                    break;
                    break;
                }
                if (gVar.p0[i9].f0 == 8) {
                    i10++;
                }
                i9++;
                i5 = i12;
            }
            if (i10 > 0) {
                dVarArr = new d[i11 - i10];
                i63 = 0;
                i64 = 0;
                while (i63 < gVar.q0) {
                    dVar11 = gVar.p0[i63];
                    int i610 = i63;
                    if (dVar11.f0 != 8) {
                        dVarArr[i64] = dVar11;
                        i64++;
                    }
                    i63 = i610 + 1;
                }
                i13 = i64;
            } else {
                i13 = i11;
            }
            dVarArr2 = dVarArr;
            gVar.Z0 = dVarArr2;
            gVar.a1 = i13;
            i14 = gVar.S0;
            if (i14 != 0) {
                if (i14 != 1) {
                    i24 = i6;
                    c3 = 1;
                    iArr3 = iArr;
                    i25 = gVar.U0;
                    cVar = gVar.K;
                    cVar2 = gVar.J;
                    if (i13 == 0) {
                        arrayList.clear();
                        i26 = i7;
                        i17 = i3;
                        c = 1;
                        i18 = i4;
                        i19 = i12;
                        i15 = i24;
                        iArr2 = iArr3;
                        fVar2 = new f(gVar, i25, gVar.H, gVar.I, gVar.J, gVar.K, i26);
                        arrayList.add(fVar2);
                        if (i25 == 0) {
                            fVar6 = fVar2;
                            i41 = 0;
                            i30 = 0;
                            i42 = 0;
                            while (i41 < i13) {
                                dVar2 = dVarArr2[i41];
                                iP = gVar.P(dVar2, i26);
                                i43 = i41;
                                if (dVar2.o0[0] == 3) {
                                    i30++;
                                }
                                i44 = i30;
                                if (i42 != i26) {
                                }
                                if (!z4) {
                                    z4 = true;
                                }
                                if (z4) {
                                    i45 = i44;
                                    dVar3 = dVar2;
                                    i46 = i43;
                                    f fVar11 = new f(gVar, i25, gVar.H, gVar.I, gVar.J, gVar.K, i26);
                                    fVar11.n = i46;
                                    arrayList.add(fVar11);
                                    fVar6 = fVar11;
                                } else {
                                    dVar3 = dVar2;
                                    i45 = i44;
                                    i46 = i43;
                                    if (i46 > 0) {
                                        i42 = gVar.O0 + iP + i42;
                                    }
                                    fVar6.a(dVar3);
                                    i41 = i46 + 1;
                                    i30 = i45;
                                }
                                i42 = iP;
                                fVar6.a(dVar3);
                                i41 = i46 + 1;
                                i30 = i45;
                            }
                        } else {
                            fVar3 = fVar2;
                            i27 = 0;
                            i28 = 0;
                            i29 = 0;
                            while (i27 < i13) {
                                dVar = dVarArr2[i27];
                                iO = gVar.O(dVar, i26);
                                if (dVar.o0[1] == 3) {
                                    i28++;
                                }
                                int i611 = i28;
                                if (i29 != i26) {
                                }
                                if (!z2) {
                                    z2 = true;
                                }
                                if (z2) {
                                    f fVar12 = new f(gVar, i25, gVar.H, gVar.I, gVar.J, gVar.K, i26);
                                    fVar12.n = i27;
                                    arrayList.add(fVar12);
                                    fVar3 = fVar12;
                                } else {
                                    if (i27 > 0) {
                                        i29 = gVar.P0 + iO + i29;
                                    }
                                    fVar3.a(dVar);
                                    i27++;
                                    i28 = i611;
                                }
                                i29 = iO;
                                fVar3.a(dVar);
                                i27++;
                                i28 = i611;
                            }
                            i30 = i28;
                        }
                        size = arrayList.size();
                        c cVar11 = gVar.H;
                        c cVar12 = gVar.I;
                        int i76 = gVar.v0;
                        int i77 = gVar.r0;
                        int i78 = gVar.w0;
                        int i79 = gVar.s0;
                        iArr4 = gVar.o0;
                        i32 = i25;
                        if (iArr4[0] != 2) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (i30 > 0) {
                            while (i40 < size) {
                                fVar5 = (f) arrayList.get(i40);
                                if (i32 == 0) {
                                    fVar5.e(i26 - fVar5.d());
                                } else {
                                    fVar5.e(i26 - fVar5.c());
                                }
                            }
                        }
                        cVar3 = cVar12;
                        i33 = i76;
                        i34 = i77;
                        i35 = i78;
                        i36 = i79;
                        cVar4 = cVar;
                        cVar5 = cVar11;
                        cVar6 = cVar2;
                        i37 = 0;
                        iMax = 0;
                        i38 = 0;
                        while (i37 < size) {
                            fVar4 = (f) arrayList.get(i37);
                            if (i32 == 0) {
                                if (i37 < size - 1) {
                                    cVar4 = ((f) arrayList.get(i37 + 1)).b.I;
                                    i36 = 0;
                                } else {
                                    i36 = gVar.s0;
                                    cVar4 = cVar;
                                }
                                c cVar13 = fVar4.b.K;
                                i39 = i32;
                                fVar4.f(i39, cVar5, cVar3, cVar6, cVar4, i33, i34, i35, i36, i26);
                                iMax = Math.max(iMax, fVar4.d());
                                iC = fVar4.c() + i38;
                                if (i37 > 0) {
                                    iC += gVar.P0;
                                }
                                i38 = iC;
                                cVar3 = cVar13;
                                i34 = 0;
                            } else {
                                i39 = i32;
                                if (i37 < size - 1) {
                                    cVar6 = ((f) arrayList.get(i37 + 1)).b.H;
                                    i35 = 0;
                                } else {
                                    i35 = gVar.w0;
                                    cVar6 = cVar2;
                                }
                                c cVar14 = fVar4.b.J;
                                fVar4.f(i39, cVar5, cVar3, cVar6, cVar4, i33, i34, i35, i36, i26);
                                iD = fVar4.d() + iMax;
                                int iMax3 = Math.max(i38, fVar4.c());
                                if (i37 > 0) {
                                    iD += gVar.O0;
                                }
                                i38 = iMax3;
                                iMax = iD;
                                cVar5 = cVar14;
                                i33 = 0;
                            }
                            i37++;
                            i32 = i39;
                        }
                        iArr2[0] = iMax;
                        iArr2[1] = i38;
                    }
                    c2 = 0;
                } else if (i14 != 2) {
                    i15 = i6;
                    iArr2 = iArr;
                    i17 = i3;
                    i18 = i4;
                    i19 = i12;
                    c2 = 0;
                    c = 1;
                } else {
                    i48 = gVar.U0;
                    if (i48 == 0) {
                        i60 = gVar.T0;
                        if (i60 <= 0) {
                            i61 = 0;
                            i62 = 0;
                            iCeil2 = 0;
                            while (true) {
                                i24 = i6;
                                if (i61 >= i13) {
                                    break;
                                    break;
                                }
                                if (i61 > 0) {
                                    i62 += gVar.O0;
                                }
                                dVar10 = dVarArr2[i61];
                                if (dVar10 != null) {
                                    iP3 = gVar.P(dVar10, i7) + i62;
                                    if (iP3 > i7) {
                                        break;
                                        break;
                                    } else {
                                        iCeil2++;
                                        i62 = iP3;
                                    }
                                }
                                i61++;
                                i6 = i24;
                            }
                        } else {
                            i24 = i6;
                            iCeil2 = i60;
                        }
                        iCeil = 0;
                    } else {
                        i24 = i6;
                        iCeil = gVar.T0;
                        if (iCeil <= 0) {
                            i50 = 0;
                            i51 = 0;
                            while (i49 < i13) {
                                if (i49 > 0) {
                                    i50 += gVar.P0;
                                }
                                dVar4 = dVarArr2[i49];
                                if (dVar4 != null) {
                                    iO2 = gVar.O(dVar4, i7) + i50;
                                    if (iO2 > i7) {
                                        break;
                                        break;
                                    } else {
                                        i51++;
                                        i50 = iO2;
                                    }
                                }
                            }
                            iCeil = i51;
                        }
                        iCeil2 = 0;
                    }
                    if (gVar.Y0 == null) {
                        gVar.Y0 = new int[2];
                    }
                    if (iCeil != 0) {
                    }
                    while (!z5) {
                        if (i48 == 0) {
                            iCeil = (int) Math.ceil(i13 / iCeil2);
                        } else {
                            iCeil2 = (int) Math.ceil(i13 / iCeil);
                            iCeil = iCeil;
                        }
                        dVarArr3 = gVar.X0;
                        int[] iArr7 = iArr;
                        if (dVarArr3 != null) {
                            gVar.X0 = new d[iCeil2];
                        } else {
                            gVar.X0 = new d[iCeil2];
                        }
                        dVarArr4 = gVar.W0;
                        if (dVarArr4 != null) {
                            gVar.W0 = new d[iCeil];
                        } else {
                            gVar.W0 = new d[iCeil];
                        }
                        i52 = 0;
                        while (i52 < iCeil2) {
                            i56 = 0;
                            while (i56 < iCeil) {
                                i57 = (i56 * iCeil2) + i52;
                                i58 = i52;
                                if (i48 == 1) {
                                    i57 = (i58 * iCeil) + i56;
                                }
                                int i710 = i48;
                                i59 = i57;
                                if (i59 >= dVarArr2.length) {
                                    dVarArr5 = dVarArr2;
                                } else {
                                    int iP5 = gVar.P(dVar7, i7);
                                    dVarArr5 = dVarArr2;
                                    dVar8 = gVar.X0[i58];
                                    if (dVar8 != null) {
                                        gVar.X0[i58] = dVar7;
                                    } else {
                                        gVar.X0[i58] = dVar7;
                                    }
                                    int iO5 = gVar.O(dVar7, i7);
                                    dVar9 = gVar.W0[i56];
                                    if (dVar9 != null) {
                                        gVar.W0[i56] = dVar7;
                                    } else {
                                        gVar.W0[i56] = dVar7;
                                    }
                                }
                                i56++;
                                i52 = i58;
                                i48 = i710;
                                dVarArr2 = dVarArr5;
                            }
                            i52++;
                        }
                        d[] dVarArr7 = dVarArr2;
                        i53 = i48;
                        iP2 = 0;
                        while (i54 < iCeil2) {
                            dVar6 = gVar.X0[i54];
                            if (dVar6 == null) {
                                if (i54 > 0) {
                                    iP2 += gVar.O0;
                                }
                                iP2 = gVar.P(dVar6, i7) + iP2;
                            }
                        }
                        i55 = 0;
                        iO3 = 0;
                        while (i55 < iCeil) {
                            dVar5 = gVar.W0[i55];
                            int i711 = i55;
                            if (dVar5 == null) {
                                if (i55 > 0) {
                                    iO3 += gVar.P0;
                                }
                                iO3 = gVar.O(dVar5, i7) + iO3;
                            }
                            i55 = i711 + 1;
                        }
                        iArr7[0] = iP2;
                        iArr7[1] = iO3;
                        if (i53 == 0) {
                            if (iP2 > i7) {
                            }
                            z5 = true;
                        } else {
                            if (iO3 > i7) {
                            }
                            z5 = true;
                        }
                        iArr = iArr7;
                        i48 = i53;
                        dVarArr2 = dVarArr7;
                    }
                    iArr3 = iArr;
                    c3 = 1;
                    int[] iArr8 = gVar.Y0;
                    iArr8[0] = iCeil2;
                    iArr8[1] = iCeil;
                }
                c = c3;
                i17 = i3;
                i18 = i4;
                i19 = i12;
                i15 = i24;
                iArr2 = iArr3;
                c2 = 0;
            } else {
                i15 = i6;
                i16 = i7;
                iArr2 = iArr;
                i17 = i3;
                i18 = i4;
                i19 = i12;
                c = 1;
                i20 = gVar.U0;
                if (i13 == 0) {
                    c2 = 0;
                } else {
                    if (arrayList.size() == 0) {
                        fVar = new f(gVar, i20, gVar.H, gVar.I, gVar.J, gVar.K, i16);
                        arrayList.add(fVar);
                    } else {
                        f fVar13 = (f) arrayList.get(0);
                        fVar13.c = 0;
                        fVar13.b = null;
                        fVar13.l = 0;
                        fVar13.m = 0;
                        fVar13.n = 0;
                        fVar13.o = 0;
                        fVar13.p = 0;
                        fVar13.f(i20, gVar.H, gVar.I, gVar.J, gVar.K, gVar.v0, gVar.r0, gVar.w0, gVar.s0, i16);
                        fVar = fVar13;
                    }
                    while (i21 < i13) {
                        fVar.a(dVarArr2[i21]);
                    }
                    c2 = 0;
                    iArr2[0] = fVar.d();
                    iArr2[1] = fVar.c();
                }
            }
            i22 = iArr2[c2] + i17 + i18;
            i23 = iArr2[c] + i19 + i15;
            if (mode != 1073741824) {
                if (mode == Integer.MIN_VALUE) {
                    size2 = Math.min(i22, size2);
                } else if (mode == 0) {
                    size2 = i22;
                } else {
                    size2 = 0;
                }
            }
            if (mode2 != 1073741824) {
                if (mode2 == Integer.MIN_VALUE) {
                    size3 = Math.min(i23, size3);
                } else if (mode2 == 0) {
                    size3 = i23;
                } else {
                    size3 = 0;
                }
            }
            gVar.y0 = size2;
            gVar.z0 = size3;
            gVar.J(size2);
            gVar.G(size3);
            if (gVar.q0 > 0) {
                z = c;
            } else {
                z = 0;
            }
            gVar.x0 = z;
        }
        setMeasuredDimension(gVar.y0, gVar.z0);
    }

    @Override // com.gamericefishpro.space.n3.c, android.view.View
    public final void onMeasure(int i, int i2) {
        j(this.C, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.C.K0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.C.E0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.C.L0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.C.F0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.C.Q0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.C.I0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.C.O0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.C.C0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.C.T0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.C.U0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        g gVar = this.C;
        gVar.r0 = i;
        gVar.s0 = i;
        gVar.t0 = i;
        gVar.u0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.C.s0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.C.v0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.C.w0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.C.r0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.C.R0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.C.J0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.C.P0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.C.D0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.C.S0 = i;
        requestLayout();
    }
}
