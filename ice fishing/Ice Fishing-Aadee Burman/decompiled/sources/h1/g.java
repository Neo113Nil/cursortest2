package h1;

import android.graphics.Path;
import com.icefishing.icefishinglive2.AbstractC4404f;
import d1.C4443a;
import d1.C4444b;
import i1.C4580b;
import j1.AbstractC4599c;
import java.util.ArrayList;
import java.util.Collections;
import k1.C4629a;
import q5.C4927a;
import u.AbstractC5049e;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final S0.l f37966a = S0.l.F("ty", "d");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0773 A[LOOP:1: B:27:0x076d->B:29:0x0773, LOOP_END] */
    /* JADX WARN: Type inference failed for: r10v10, types: [d1.b] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v15, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r17v16, types: [e1.l] */
    /* JADX WARN: Type inference failed for: r17v17 */
    /* JADX WARN: Type inference failed for: r17v34 */
    /* JADX WARN: Type inference failed for: r17v35 */
    /* JADX WARN: Type inference failed for: r17v36 */
    /* JADX WARN: Type inference failed for: r17v37 */
    /* JADX WARN: Type inference failed for: r17v38 */
    /* JADX WARN: Type inference failed for: r17v39 */
    /* JADX WARN: Type inference failed for: r17v40 */
    /* JADX WARN: Type inference failed for: r17v41 */
    /* JADX WARN: Type inference failed for: r17v42 */
    /* JADX WARN: Type inference failed for: r17v43 */
    /* JADX WARN: Type inference failed for: r17v44 */
    /* JADX WARN: Type inference failed for: r17v45 */
    /* JADX WARN: Type inference failed for: r17v46 */
    /* JADX WARN: Type inference failed for: r17v47 */
    /* JADX WARN: Type inference failed for: r17v48 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [d1.f] */
    /* JADX WARN: Type inference failed for: r20v13 */
    /* JADX WARN: Type inference failed for: r20v14, types: [d1.f] */
    /* JADX WARN: Type inference failed for: r20v15, types: [d1.f] */
    /* JADX WARN: Type inference failed for: r20v16 */
    /* JADX WARN: Type inference failed for: r20v17 */
    /* JADX WARN: Type inference failed for: r20v18, types: [d1.b] */
    /* JADX WARN: Type inference failed for: r20v19, types: [d1.b] */
    /* JADX WARN: Type inference failed for: r20v2, types: [d1.f] */
    /* JADX WARN: Type inference failed for: r20v20 */
    /* JADX WARN: Type inference failed for: r20v26 */
    /* JADX WARN: Type inference failed for: r20v27, types: [d1.b] */
    /* JADX WARN: Type inference failed for: r20v28 */
    /* JADX WARN: Type inference failed for: r20v29 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v30 */
    /* JADX WARN: Type inference failed for: r20v31 */
    /* JADX WARN: Type inference failed for: r21v26 */
    /* JADX WARN: Type inference failed for: r21v27, types: [d1.b] */
    /* JADX WARN: Type inference failed for: r21v28, types: [d1.b] */
    /* JADX WARN: Type inference failed for: r21v29 */
    /* JADX WARN: Type inference failed for: r21v31 */
    /* JADX WARN: Type inference failed for: r21v32, types: [d1.b] */
    /* JADX WARN: Type inference failed for: r21v33 */
    /* JADX WARN: Type inference failed for: r21v34, types: [d1.b] */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5, types: [d1.a] */
    /* JADX WARN: Type inference failed for: r21v6, types: [d1.a] */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r22v10 */
    /* JADX WARN: Type inference failed for: r22v11, types: [d1.a] */
    /* JADX WARN: Type inference failed for: r22v12 */
    /* JADX WARN: Type inference failed for: r22v13, types: [d1.a] */
    /* JADX WARN: Type inference failed for: r22v14 */
    /* JADX WARN: Type inference failed for: r22v15 */
    /* JADX WARN: Type inference failed for: r22v16 */
    /* JADX WARN: Type inference failed for: r22v17, types: [d1.b] */
    /* JADX WARN: Type inference failed for: r22v18, types: [d1.b] */
    /* JADX WARN: Type inference failed for: r22v19 */
    /* JADX WARN: Type inference failed for: r22v20 */
    /* JADX WARN: Type inference failed for: r22v21, types: [d1.e] */
    /* JADX WARN: Type inference failed for: r22v22, types: [d1.e] */
    /* JADX WARN: Type inference failed for: r22v23 */
    /* JADX WARN: Type inference failed for: r23v10 */
    /* JADX WARN: Type inference failed for: r23v11, types: [d1.a] */
    /* JADX WARN: Type inference failed for: r23v12 */
    /* JADX WARN: Type inference failed for: r23v13 */
    /* JADX WARN: Type inference failed for: r23v23 */
    /* JADX WARN: Type inference failed for: r23v24, types: [d1.b] */
    /* JADX WARN: Type inference failed for: r23v25, types: [d1.b] */
    /* JADX WARN: Type inference failed for: r23v26 */
    /* JADX WARN: Type inference failed for: r23v8 */
    /* JADX WARN: Type inference failed for: r23v9, types: [d1.a] */
    /* JADX WARN: Type inference failed for: r24v10, types: [d1.b] */
    /* JADX WARN: Type inference failed for: r24v11, types: [d1.b] */
    /* JADX WARN: Type inference failed for: r24v12 */
    /* JADX WARN: Type inference failed for: r24v9 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r26v5, types: [d1.b] */
    /* JADX WARN: Type inference failed for: r26v6, types: [d1.b] */
    /* JADX WARN: Type inference failed for: r26v7 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53, types: [d1.a] */
    /* JADX WARN: Type inference failed for: r2v54, types: [d1.a] */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [d1.b] */
    /* JADX WARN: Type inference failed for: r3v20, types: [d1.b] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47, types: [d1.a] */
    /* JADX WARN: Type inference failed for: r7v48, types: [d1.a] */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53, types: [d1.a] */
    /* JADX WARN: Type inference failed for: r7v54, types: [d1.a] */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v62 */
    /* JADX WARN: Type inference failed for: r7v63 */
    /* JADX WARN: Type inference failed for: r7v64, types: [d1.a] */
    /* JADX WARN: Type inference failed for: r7v65, types: [d1.a] */
    /* JADX WARN: Type inference failed for: r7v66 */
    /* JADX WARN: Type inference failed for: r7v79 */
    /* JADX WARN: Type inference failed for: r7v80 */
    /* JADX WARN: Type inference failed for: r7v81 */
    /* JADX WARN: Type inference failed for: r7v82, types: [d1.a] */
    /* JADX WARN: Type inference failed for: r7v83, types: [d1.a] */
    /* JADX WARN: Type inference failed for: r7v84 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e1.b a(C4580b c4580b, X0.i iVar) {
        String str;
        char c9;
        ?? r17;
        e1.b aVar;
        e1.b dVar;
        e1.b mVar;
        e1.b bVar;
        int i;
        char c10;
        Object obj;
        boolean z3 = false;
        boolean z6 = false;
        int i6 = 0;
        c4580b.j();
        int i9 = 2;
        while (true) {
            if (!c4580b.D()) {
                str = null;
                break;
            }
            int K7 = c4580b.K(f37966a);
            if (K7 == 0) {
                str = c4580b.H();
                break;
            }
            if (K7 != 1) {
                c4580b.V();
                c4580b.W();
            } else {
                i9 = c4580b.G();
            }
        }
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case 3239:
                obj = null;
                if (str.equals("el")) {
                    c9 = 0;
                    r17 = null;
                    break;
                }
                c9 = 65535;
                r17 = obj;
                break;
            case 3270:
                obj = null;
                if (str.equals("fl")) {
                    c9 = 1;
                    r17 = null;
                    break;
                }
                c9 = 65535;
                r17 = obj;
                break;
            case 3295:
                obj = null;
                if (str.equals("gf")) {
                    c9 = 2;
                    r17 = null;
                    break;
                }
                c9 = 65535;
                r17 = obj;
                break;
            case 3307:
                obj = null;
                if (str.equals("gr")) {
                    c9 = 3;
                    r17 = null;
                    break;
                }
                c9 = 65535;
                r17 = obj;
                break;
            case 3308:
                obj = null;
                if (str.equals("gs")) {
                    c9 = 4;
                    r17 = null;
                    break;
                }
                c9 = 65535;
                r17 = obj;
                break;
            case 3488:
                obj = null;
                if (str.equals("mm")) {
                    c9 = 5;
                    r17 = null;
                    break;
                }
                c9 = 65535;
                r17 = obj;
                break;
            case 3633:
                obj = null;
                if (str.equals("rc")) {
                    c9 = 6;
                    r17 = null;
                    break;
                }
                c9 = 65535;
                r17 = obj;
                break;
            case 3634:
                obj = null;
                if (str.equals("rd")) {
                    c9 = 7;
                    r17 = null;
                    break;
                }
                c9 = 65535;
                r17 = obj;
                break;
            case 3646:
                obj = null;
                if (str.equals("rp")) {
                    c9 = '\b';
                    r17 = null;
                    break;
                }
                c9 = 65535;
                r17 = obj;
                break;
            case 3669:
                obj = null;
                if (str.equals(com.anythink.expressad.foundation.d.e.f18674u)) {
                    c9 = '\t';
                    r17 = null;
                    break;
                }
                c9 = 65535;
                r17 = obj;
                break;
            case 3679:
                obj = null;
                if (str.equals("sr")) {
                    c9 = '\n';
                    r17 = null;
                    break;
                }
                c9 = 65535;
                r17 = obj;
                break;
            case 3681:
                obj = null;
                if (str.equals(com.anythink.expressad.foundation.g.g.a.b.bb)) {
                    c9 = 11;
                    r17 = null;
                    break;
                }
                c9 = 65535;
                r17 = obj;
                break;
            case 3705:
                obj = null;
                if (str.equals("tm")) {
                    c9 = '\f';
                    r17 = null;
                    break;
                }
                c9 = 65535;
                r17 = obj;
                break;
            case 3710:
                obj = null;
                if (str.equals("tr")) {
                    c9 = '\r';
                    r17 = null;
                    break;
                }
                c9 = 65535;
                r17 = obj;
                break;
            default:
                obj = null;
                c9 = 65535;
                r17 = obj;
                break;
        }
        switch (c9) {
            case 0:
                S0.l lVar = e.f37958a;
                boolean z9 = i9 == 3;
                boolean z10 = false;
                String str2 = r17;
                ?? r20 = str2;
                C4443a c4443a = r20;
                while (c4580b.D()) {
                    int K8 = c4580b.K(e.f37958a);
                    if (K8 == 0) {
                        str2 = c4580b.H();
                    } else if (K8 == 1) {
                        r20 = AbstractC4558a.b(c4580b, iVar);
                    } else if (K8 == 2) {
                        c4443a = com.bumptech.glide.f.t(c4580b, iVar);
                    } else if (K8 == 3) {
                        z10 = c4580b.E();
                    } else if (K8 != 4) {
                        c4580b.V();
                        c4580b.W();
                    } else {
                        z9 = c4580b.G() == 3;
                    }
                }
                aVar = new e1.a(str2, r20, c4443a, z9, z10);
                bVar = aVar;
                while (c4580b.D()) {
                    c4580b.W();
                }
                c4580b.B();
                return bVar;
            case 1:
                S0.l lVar2 = y.f38004a;
                boolean z11 = false;
                boolean z12 = false;
                int i10 = 1;
                C4443a c4443a2 = r17;
                String str3 = c4443a2;
                ?? r21 = str3;
                while (c4580b.D()) {
                    int K9 = c4580b.K(y.f38004a);
                    if (K9 == 0) {
                        str3 = c4580b.H();
                    } else if (K9 == 1) {
                        r21 = com.bumptech.glide.f.p(c4580b, iVar);
                    } else if (K9 == 2) {
                        c4443a2 = com.bumptech.glide.f.s(c4580b, iVar);
                    } else if (K9 == 3) {
                        z11 = c4580b.E();
                    } else if (K9 == 4) {
                        i10 = c4580b.G();
                    } else if (K9 != 5) {
                        c4580b.V();
                        c4580b.W();
                    } else {
                        z12 = c4580b.E();
                    }
                }
                if (c4443a2 == 0) {
                    c4443a2 = new C4443a(Collections.singletonList(new C4629a(100)), 2);
                }
                r17 = new e1.l(str3, z11, i10 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, r21, c4443a2, z12);
                bVar = r17;
                while (c4580b.D()) {
                }
                c4580b.B();
                return bVar;
            case 2:
                S0.l lVar3 = l.f37979a;
                Path.FillType fillType = Path.FillType.WINDING;
                int i11 = 0;
                boolean z13 = false;
                C4443a c4443a3 = r17;
                String str4 = c4443a3;
                ?? r23 = str4;
                C4443a c4443a4 = r23;
                C4443a c4443a5 = c4443a4;
                while (c4580b.D()) {
                    switch (c4580b.K(l.f37979a)) {
                        case 0:
                            str4 = c4580b.H();
                            break;
                        case 1:
                            c4580b.j();
                            int i12 = -1;
                            while (c4580b.D()) {
                                int K10 = c4580b.K(l.f37980b);
                                if (K10 == 0) {
                                    i12 = c4580b.G();
                                } else if (K10 != 1) {
                                    c4580b.V();
                                    c4580b.W();
                                } else {
                                    r23 = com.bumptech.glide.f.r(c4580b, iVar, i12);
                                }
                            }
                            c4580b.B();
                            break;
                        case 2:
                            c4443a3 = com.bumptech.glide.f.s(c4580b, iVar);
                            break;
                        case 3:
                            if (c4580b.G() != 1) {
                                i11 = 2;
                                break;
                            } else {
                                i11 = 1;
                                break;
                            }
                        case 4:
                            c4443a4 = com.bumptech.glide.f.t(c4580b, iVar);
                            break;
                        case 5:
                            c4443a5 = com.bumptech.glide.f.t(c4580b, iVar);
                            break;
                        case 6:
                            fillType = c4580b.G() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                            break;
                        case 7:
                            z13 = c4580b.E();
                            break;
                        default:
                            c4580b.V();
                            c4580b.W();
                            break;
                    }
                }
                if (c4443a3 == 0) {
                    c4443a3 = new C4443a(Collections.singletonList(new C4629a(100)), 2);
                }
                dVar = new e1.d(str4, i11, fillType, r23, c4443a3, c4443a4, c4443a5, z13);
                bVar = dVar;
                while (c4580b.D()) {
                }
                c4580b.B();
                return bVar;
            case 3:
                S0.l lVar4 = z.f38005a;
                ArrayList arrayList = new ArrayList();
                String str5 = r17;
                while (c4580b.D()) {
                    int K11 = c4580b.K(z.f38005a);
                    if (K11 == 0) {
                        str5 = c4580b.H();
                    } else if (K11 == 1) {
                        z3 = c4580b.E();
                    } else if (K11 != 2) {
                        c4580b.W();
                    } else {
                        c4580b.b();
                        while (c4580b.D()) {
                            e1.b a9 = a(c4580b, iVar);
                            if (a9 != null) {
                                arrayList.add(a9);
                            }
                        }
                        c4580b.z();
                    }
                }
                mVar = new e1.m(str5, arrayList, z3);
                bVar = mVar;
                while (c4580b.D()) {
                }
                c4580b.B();
                return bVar;
            case 4:
                S0.l lVar5 = m.f37981a;
                ArrayList arrayList2 = new ArrayList();
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                boolean z14 = false;
                float f3 = 0.0f;
                C4443a c4443a6 = r17;
                String str6 = c4443a6;
                ?? r22 = str6;
                C4443a c4443a7 = r22;
                C4443a c4443a8 = c4443a7;
                ?? r26 = c4443a8;
                C4444b c4444b = r26;
                while (c4580b.D()) {
                    switch (c4580b.K(m.f37981a)) {
                        case 0:
                            str6 = c4580b.H();
                            break;
                        case 1:
                            c4580b.j();
                            int i16 = -1;
                            while (c4580b.D()) {
                                int K12 = c4580b.K(m.f37982b);
                                if (K12 == 0) {
                                    i16 = c4580b.G();
                                } else if (K12 != 1) {
                                    c4580b.V();
                                    c4580b.W();
                                } else {
                                    r22 = com.bumptech.glide.f.r(c4580b, iVar, i16);
                                }
                            }
                            c4580b.B();
                            break;
                        case 2:
                            c4443a6 = com.bumptech.glide.f.s(c4580b, iVar);
                            break;
                        case 3:
                            if (c4580b.G() != 1) {
                                i13 = 2;
                                break;
                            } else {
                                i13 = 1;
                                break;
                            }
                        case 4:
                            c4443a7 = com.bumptech.glide.f.t(c4580b, iVar);
                            break;
                        case 5:
                            c4443a8 = com.bumptech.glide.f.t(c4580b, iVar);
                            break;
                        case 6:
                            r26 = com.bumptech.glide.f.q(c4580b, iVar, true);
                            break;
                        case 7:
                            i14 = AbstractC5049e.e(3)[c4580b.G() - 1];
                            break;
                        case 8:
                            i15 = AbstractC5049e.e(3)[c4580b.G() - 1];
                            break;
                        case 9:
                            f3 = (float) c4580b.F();
                            break;
                        case 10:
                            z14 = c4580b.E();
                            break;
                        case 11:
                            c4580b.b();
                            while (c4580b.D()) {
                                c4580b.j();
                                String str7 = r17;
                                ?? r10 = str7;
                                while (c4580b.D()) {
                                    int K13 = c4580b.K(m.f37983c);
                                    if (K13 == 0) {
                                        str7 = c4580b.H();
                                    } else if (K13 != 1) {
                                        c4580b.V();
                                        c4580b.W();
                                    } else {
                                        r10 = com.bumptech.glide.f.q(c4580b, iVar, true);
                                    }
                                }
                                c4580b.B();
                                if (str7.equals(C4927a.PUSH_MINIFIED_BUTTONS_LIST)) {
                                    c4444b = r10;
                                } else if (str7.equals("d") || str7.equals("g")) {
                                    iVar.f3626o = true;
                                    arrayList2.add(r10);
                                }
                            }
                            c4580b.z();
                            if (arrayList2.size() != 1) {
                                break;
                            } else {
                                arrayList2.add((C4444b) arrayList2.get(0));
                                break;
                            }
                        default:
                            c4580b.V();
                            c4580b.W();
                            break;
                    }
                }
                if (c4443a6 == 0) {
                    c4443a6 = new C4443a(Collections.singletonList(new C4629a(100)), 2);
                }
                dVar = new e1.e(str6, i13, r22, c4443a6, c4443a7, c4443a8, r26, i14, i15, f3, arrayList2, c4444b, z14);
                bVar = dVar;
                while (c4580b.D()) {
                }
                c4580b.B();
                return bVar;
            case 5:
                S0.l lVar6 = s.f37997a;
                boolean z15 = false;
                String str8 = r17;
                while (c4580b.D()) {
                    int K14 = c4580b.K(s.f37997a);
                    if (K14 == 0) {
                        str8 = c4580b.H();
                    } else if (K14 == 1) {
                        int G7 = c4580b.G();
                        if (G7 != 1) {
                            if (G7 == 2) {
                                i6 = 2;
                            } else if (G7 == 3) {
                                i6 = 3;
                            } else if (G7 == 4) {
                                i6 = 4;
                            } else if (G7 == 5) {
                                i6 = 5;
                            }
                        }
                        i6 = 1;
                    } else if (K14 != 2) {
                        c4580b.V();
                        c4580b.W();
                    } else {
                        z15 = c4580b.E();
                    }
                }
                e1.g gVar = new e1.g(i6, str8, z15);
                iVar.a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                bVar = gVar;
                while (c4580b.D()) {
                }
                c4580b.B();
                return bVar;
            case 6:
                S0.l lVar7 = u.f37999a;
                boolean z16 = false;
                String str9 = r17;
                ?? r202 = str9;
                C4443a c4443a9 = r202;
                ?? r222 = c4443a9;
                while (c4580b.D()) {
                    int K15 = c4580b.K(u.f37999a);
                    if (K15 == 0) {
                        str9 = c4580b.H();
                    } else if (K15 == 1) {
                        r202 = AbstractC4558a.b(c4580b, iVar);
                    } else if (K15 == 2) {
                        c4443a9 = com.bumptech.glide.f.t(c4580b, iVar);
                    } else if (K15 == 3) {
                        r222 = com.bumptech.glide.f.q(c4580b, iVar, true);
                    } else if (K15 != 4) {
                        c4580b.W();
                    } else {
                        z16 = c4580b.E();
                    }
                }
                aVar = new e1.i(str9, (d1.f) r202, c4443a9, (C4444b) r222, z16);
                bVar = aVar;
                while (c4580b.D()) {
                }
                c4580b.B();
                return bVar;
            case 7:
                S0.l lVar8 = w.f38001a;
                String str10 = r17;
                ?? r32 = str10;
                while (c4580b.D()) {
                    int K16 = c4580b.K(w.f38001a);
                    if (K16 == 0) {
                        str10 = c4580b.H();
                    } else if (K16 == 1) {
                        r32 = com.bumptech.glide.f.q(c4580b, iVar, true);
                    } else if (K16 != 2) {
                        c4580b.W();
                    } else {
                        z6 = c4580b.E();
                    }
                }
                if (!z6) {
                    bVar = new e1.j(str10, r32);
                    while (c4580b.D()) {
                    }
                    c4580b.B();
                    return bVar;
                }
                bVar = r17;
                while (c4580b.D()) {
                }
                c4580b.B();
                return bVar;
            case '\b':
                S0.l lVar9 = v.f38000a;
                boolean z17 = false;
                String str11 = r17;
                ?? r203 = str11;
                C4444b c4444b2 = r203;
                ?? r223 = c4444b2;
                while (c4580b.D()) {
                    int K17 = c4580b.K(v.f38000a);
                    if (K17 == 0) {
                        str11 = c4580b.H();
                    } else if (K17 == 1) {
                        r203 = com.bumptech.glide.f.q(c4580b, iVar, false);
                    } else if (K17 == 2) {
                        c4444b2 = com.bumptech.glide.f.q(c4580b, iVar, false);
                    } else if (K17 == 3) {
                        r223 = AbstractC4560c.c(c4580b, iVar);
                    } else if (K17 != 4) {
                        c4580b.W();
                    } else {
                        z17 = c4580b.E();
                    }
                }
                aVar = new e1.i(str11, (C4444b) r203, c4444b2, (d1.e) r223, z17);
                bVar = aVar;
                while (c4580b.D()) {
                }
                c4580b.B();
                return bVar;
            case '\t':
                S0.l lVar10 = A.f37946a;
                int i17 = 0;
                boolean z18 = false;
                ?? r24 = r17;
                String str12 = r24;
                while (c4580b.D()) {
                    int K18 = c4580b.K(A.f37946a);
                    if (K18 == 0) {
                        str12 = c4580b.H();
                    } else if (K18 == 1) {
                        i17 = c4580b.G();
                    } else if (K18 == 2) {
                        r24 = new C4443a(p.a(c4580b, iVar, j1.j.c(), x.f38002n, false), 5);
                    } else if (K18 != 3) {
                        c4580b.W();
                    } else {
                        z18 = c4580b.E();
                    }
                }
                mVar = new e1.n(str12, i17, r24, z18);
                bVar = mVar;
                while (c4580b.D()) {
                }
                c4580b.B();
                return bVar;
            case '\n':
                S0.l lVar11 = t.f37998a;
                boolean z19 = i9 == 3;
                int i18 = 0;
                boolean z20 = false;
                String str13 = r17;
                ?? r212 = str13;
                d1.f fVar = r212;
                ?? r232 = fVar;
                C4444b c4444b3 = r232;
                C4444b c4444b4 = c4444b3;
                C4444b c4444b5 = c4444b4;
                C4444b c4444b6 = c4444b5;
                while (c4580b.D()) {
                    switch (c4580b.K(t.f37998a)) {
                        case 0:
                            str13 = c4580b.H();
                            break;
                        case 1:
                            int G8 = c4580b.G();
                            int[] e9 = AbstractC5049e.e(2);
                            int length = e9.length;
                            int i19 = 0;
                            while (true) {
                                if (i19 >= length) {
                                    i18 = 0;
                                    break;
                                } else {
                                    int i20 = e9[i19];
                                    if (i20 == 1) {
                                        i = 1;
                                    } else {
                                        if (i20 != 2) {
                                            throw r17;
                                        }
                                        i = 2;
                                    }
                                    if (i == G8) {
                                        i18 = i20;
                                        break;
                                    } else {
                                        i19++;
                                    }
                                }
                            }
                        case 2:
                            r212 = com.bumptech.glide.f.q(c4580b, iVar, false);
                            break;
                        case 3:
                            fVar = AbstractC4558a.b(c4580b, iVar);
                            break;
                        case 4:
                            r232 = com.bumptech.glide.f.q(c4580b, iVar, false);
                            break;
                        case 5:
                            c4444b4 = com.bumptech.glide.f.q(c4580b, iVar, true);
                            break;
                        case 6:
                            c4444b6 = com.bumptech.glide.f.q(c4580b, iVar, false);
                            break;
                        case 7:
                            c4444b3 = com.bumptech.glide.f.q(c4580b, iVar, true);
                            break;
                        case 8:
                            c4444b5 = com.bumptech.glide.f.q(c4580b, iVar, false);
                            break;
                        case 9:
                            z20 = c4580b.E();
                            break;
                        case 10:
                            if (c4580b.G() != 3) {
                                z19 = false;
                                break;
                            } else {
                                z19 = true;
                                break;
                            }
                        default:
                            c4580b.V();
                            c4580b.W();
                            break;
                    }
                }
                aVar = new e1.h(str13, i18, r212, fVar, r232, c4444b3, c4444b4, c4444b5, c4444b6, z20, z19);
                bVar = aVar;
                while (c4580b.D()) {
                }
                c4580b.B();
                return bVar;
            case 11:
                S0.l lVar12 = B.f37947a;
                ArrayList arrayList3 = new ArrayList();
                int i21 = 0;
                int i22 = 0;
                boolean z21 = false;
                float f9 = 0.0f;
                C4443a c4443a10 = r17;
                String str14 = c4443a10;
                ?? r204 = str14;
                C4443a c4443a11 = r204;
                ?? r242 = c4443a11;
                while (c4580b.D()) {
                    switch (c4580b.K(B.f37947a)) {
                        case 0:
                            str14 = c4580b.H();
                            break;
                        case 1:
                            c4443a11 = com.bumptech.glide.f.p(c4580b, iVar);
                            break;
                        case 2:
                            r242 = com.bumptech.glide.f.q(c4580b, iVar, true);
                            break;
                        case 3:
                            c4443a10 = com.bumptech.glide.f.s(c4580b, iVar);
                            break;
                        case 4:
                            i21 = AbstractC5049e.e(3)[c4580b.G() - 1];
                            break;
                        case 5:
                            i22 = AbstractC5049e.e(3)[c4580b.G() - 1];
                            break;
                        case 6:
                            f9 = (float) c4580b.F();
                            break;
                        case 7:
                            z21 = c4580b.E();
                            break;
                        case 8:
                            c4580b.b();
                            while (c4580b.D()) {
                                c4580b.j();
                                String str15 = r17;
                                Object obj2 = str15;
                                while (c4580b.D()) {
                                    int K19 = c4580b.K(B.f37948b);
                                    if (K19 == 0) {
                                        str15 = c4580b.H();
                                    } else if (K19 != 1) {
                                        c4580b.V();
                                        c4580b.W();
                                    } else {
                                        obj2 = com.bumptech.glide.f.q(c4580b, iVar, true);
                                    }
                                }
                                c4580b.B();
                                str15.getClass();
                                switch (str15.hashCode()) {
                                    case 100:
                                        if (str15.equals("d")) {
                                            c10 = 0;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 103:
                                        if (str15.equals("g")) {
                                            c10 = 1;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 111:
                                        if (str15.equals(C4927a.PUSH_MINIFIED_BUTTONS_LIST)) {
                                            c10 = 2;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    default:
                                        c10 = 65535;
                                        break;
                                }
                                switch (c10) {
                                    case 0:
                                    case 1:
                                        iVar.f3626o = true;
                                        arrayList3.add(obj2);
                                        break;
                                    case 2:
                                        r204 = obj2;
                                        break;
                                }
                            }
                            c4580b.z();
                            if (arrayList3.size() != 1) {
                                break;
                            } else {
                                arrayList3.add((C4444b) arrayList3.get(0));
                                break;
                            }
                            break;
                        default:
                            c4580b.W();
                            break;
                    }
                }
                if (c4443a10 == 0) {
                    c4443a10 = new C4443a(Collections.singletonList(new C4629a(100)), 2);
                }
                aVar = new e1.o(str14, r204, arrayList3, c4443a11, c4443a10, r242, i21 == 0 ? 1 : i21, i22 == 0 ? 1 : i22, f9, z21);
                bVar = aVar;
                while (c4580b.D()) {
                }
                c4580b.B();
                return bVar;
            case '\f':
                S0.l lVar13 = C.f37949a;
                int i23 = 0;
                boolean z22 = false;
                String str16 = r17;
                ?? r213 = str16;
                C4444b c4444b7 = r213;
                C4444b c4444b8 = c4444b7;
                while (c4580b.D()) {
                    int K20 = c4580b.K(C.f37949a);
                    if (K20 == 0) {
                        r213 = com.bumptech.glide.f.q(c4580b, iVar, false);
                    } else if (K20 == 1) {
                        c4444b7 = com.bumptech.glide.f.q(c4580b, iVar, false);
                    } else if (K20 == 2) {
                        c4444b8 = com.bumptech.glide.f.q(c4580b, iVar, false);
                    } else if (K20 == 3) {
                        str16 = c4580b.H();
                    } else if (K20 == 4) {
                        int G9 = c4580b.G();
                        if (G9 == 1) {
                            i23 = 1;
                        } else {
                            if (G9 != 2) {
                                throw new IllegalArgumentException(AbstractC4404f.e(G9, "Unknown trim path type "));
                            }
                            i23 = 2;
                        }
                    } else if (K20 != 5) {
                        c4580b.W();
                    } else {
                        z22 = c4580b.E();
                    }
                }
                aVar = new e1.p(str16, i23, r213, c4444b7, c4444b8, z22);
                bVar = aVar;
                while (c4580b.D()) {
                }
                c4580b.B();
                return bVar;
            case '\r':
                bVar = AbstractC4560c.c(c4580b, iVar);
                while (c4580b.D()) {
                }
                c4580b.B();
                return bVar;
            default:
                AbstractC4599c.b("Unknown shape type ".concat(str));
                bVar = r17;
                while (c4580b.D()) {
                }
                c4580b.B();
                return bVar;
        }
    }
}
