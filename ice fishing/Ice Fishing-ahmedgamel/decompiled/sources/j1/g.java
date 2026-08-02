package j1;

import android.graphics.Path;
import com.google.android.gms.internal.ads.Wv;
import f1.C4515a;
import f1.C4516b;
import java.util.ArrayList;
import java.util.Collections;
import k1.C4639a;
import k1.C4641c;
import l1.AbstractC4668c;
import m1.C4739a;
import q5.C4876a;
import u.AbstractC5050e;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final C4639a f38435a = C4639a.d("ty", "d");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0773 A[LOOP:1: B:27:0x076d->B:29:0x0773, LOOP_END] */
    /* JADX WARN: Type inference failed for: r10v10, types: [f1.b] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v15, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r17v16, types: [g1.l] */
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
    /* JADX WARN: Type inference failed for: r20v1, types: [f1.e] */
    /* JADX WARN: Type inference failed for: r20v13 */
    /* JADX WARN: Type inference failed for: r20v14, types: [f1.e] */
    /* JADX WARN: Type inference failed for: r20v15, types: [f1.e] */
    /* JADX WARN: Type inference failed for: r20v16 */
    /* JADX WARN: Type inference failed for: r20v17 */
    /* JADX WARN: Type inference failed for: r20v18, types: [f1.b] */
    /* JADX WARN: Type inference failed for: r20v19, types: [f1.b] */
    /* JADX WARN: Type inference failed for: r20v2, types: [f1.e] */
    /* JADX WARN: Type inference failed for: r20v20 */
    /* JADX WARN: Type inference failed for: r20v26 */
    /* JADX WARN: Type inference failed for: r20v27, types: [f1.b] */
    /* JADX WARN: Type inference failed for: r20v28 */
    /* JADX WARN: Type inference failed for: r20v29 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v30 */
    /* JADX WARN: Type inference failed for: r20v31 */
    /* JADX WARN: Type inference failed for: r21v26 */
    /* JADX WARN: Type inference failed for: r21v27, types: [f1.b] */
    /* JADX WARN: Type inference failed for: r21v28, types: [f1.b] */
    /* JADX WARN: Type inference failed for: r21v29 */
    /* JADX WARN: Type inference failed for: r21v31 */
    /* JADX WARN: Type inference failed for: r21v32, types: [f1.b] */
    /* JADX WARN: Type inference failed for: r21v33 */
    /* JADX WARN: Type inference failed for: r21v34, types: [f1.b] */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5, types: [f1.a] */
    /* JADX WARN: Type inference failed for: r21v6, types: [f1.a] */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r22v10 */
    /* JADX WARN: Type inference failed for: r22v11, types: [f1.a] */
    /* JADX WARN: Type inference failed for: r22v12 */
    /* JADX WARN: Type inference failed for: r22v13, types: [f1.a] */
    /* JADX WARN: Type inference failed for: r22v14 */
    /* JADX WARN: Type inference failed for: r22v15 */
    /* JADX WARN: Type inference failed for: r22v16 */
    /* JADX WARN: Type inference failed for: r22v17, types: [f1.b] */
    /* JADX WARN: Type inference failed for: r22v18, types: [f1.b] */
    /* JADX WARN: Type inference failed for: r22v19 */
    /* JADX WARN: Type inference failed for: r22v20 */
    /* JADX WARN: Type inference failed for: r22v21, types: [f1.d] */
    /* JADX WARN: Type inference failed for: r22v22, types: [f1.d] */
    /* JADX WARN: Type inference failed for: r22v23 */
    /* JADX WARN: Type inference failed for: r23v10 */
    /* JADX WARN: Type inference failed for: r23v11, types: [f1.a] */
    /* JADX WARN: Type inference failed for: r23v12 */
    /* JADX WARN: Type inference failed for: r23v13 */
    /* JADX WARN: Type inference failed for: r23v23 */
    /* JADX WARN: Type inference failed for: r23v24, types: [f1.b] */
    /* JADX WARN: Type inference failed for: r23v25, types: [f1.b] */
    /* JADX WARN: Type inference failed for: r23v26 */
    /* JADX WARN: Type inference failed for: r23v8 */
    /* JADX WARN: Type inference failed for: r23v9, types: [f1.a] */
    /* JADX WARN: Type inference failed for: r24v10, types: [f1.b] */
    /* JADX WARN: Type inference failed for: r24v11, types: [f1.b] */
    /* JADX WARN: Type inference failed for: r24v12 */
    /* JADX WARN: Type inference failed for: r24v9 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r26v5, types: [f1.b] */
    /* JADX WARN: Type inference failed for: r26v6, types: [f1.b] */
    /* JADX WARN: Type inference failed for: r26v7 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53, types: [f1.a] */
    /* JADX WARN: Type inference failed for: r2v54, types: [f1.a] */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [f1.b] */
    /* JADX WARN: Type inference failed for: r3v20, types: [f1.b] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47, types: [f1.a] */
    /* JADX WARN: Type inference failed for: r7v48, types: [f1.a] */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53, types: [f1.a] */
    /* JADX WARN: Type inference failed for: r7v54, types: [f1.a] */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v62 */
    /* JADX WARN: Type inference failed for: r7v63 */
    /* JADX WARN: Type inference failed for: r7v64, types: [f1.a] */
    /* JADX WARN: Type inference failed for: r7v65, types: [f1.a] */
    /* JADX WARN: Type inference failed for: r7v66 */
    /* JADX WARN: Type inference failed for: r7v79 */
    /* JADX WARN: Type inference failed for: r7v80 */
    /* JADX WARN: Type inference failed for: r7v81 */
    /* JADX WARN: Type inference failed for: r7v82, types: [f1.a] */
    /* JADX WARN: Type inference failed for: r7v83, types: [f1.a] */
    /* JADX WARN: Type inference failed for: r7v84 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static g1.b a(C4641c c4641c, Z0.i iVar) {
        String str;
        char c9;
        ?? r17;
        g1.b aVar;
        g1.b dVar;
        g1.b mVar;
        g1.b bVar;
        int i;
        char c10;
        Object obj;
        boolean z6 = false;
        boolean z9 = false;
        int i4 = 0;
        c4641c.j();
        int i6 = 2;
        while (true) {
            if (!c4641c.D()) {
                str = null;
                break;
            }
            int K7 = c4641c.K(f38435a);
            if (K7 == 0) {
                str = c4641c.H();
                break;
            }
            if (K7 != 1) {
                c4641c.V();
                c4641c.W();
            } else {
                i6 = c4641c.G();
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
                if (str.equals(com.anythink.expressad.foundation.d.e.f19461u)) {
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
                C4639a c4639a = e.f38427a;
                boolean z10 = i6 == 3;
                boolean z11 = false;
                String str2 = r17;
                ?? r20 = str2;
                C4515a c4515a = r20;
                while (c4641c.D()) {
                    int K8 = c4641c.K(e.f38427a);
                    if (K8 == 0) {
                        str2 = c4641c.H();
                    } else if (K8 == 1) {
                        r20 = AbstractC4606a.b(c4641c, iVar);
                    } else if (K8 == 2) {
                        c4515a = Q3.b.q(c4641c, iVar);
                    } else if (K8 == 3) {
                        z11 = c4641c.E();
                    } else if (K8 != 4) {
                        c4641c.V();
                        c4641c.W();
                    } else {
                        z10 = c4641c.G() == 3;
                    }
                }
                aVar = new g1.a(str2, r20, c4515a, z10, z11);
                bVar = aVar;
                while (c4641c.D()) {
                    c4641c.W();
                }
                c4641c.B();
                return bVar;
            case 1:
                C4639a c4639a2 = y.f38473a;
                boolean z12 = false;
                boolean z13 = false;
                int i9 = 1;
                C4515a c4515a2 = r17;
                String str3 = c4515a2;
                ?? r21 = str3;
                while (c4641c.D()) {
                    int K9 = c4641c.K(y.f38473a);
                    if (K9 == 0) {
                        str3 = c4641c.H();
                    } else if (K9 == 1) {
                        r21 = Q3.b.m(c4641c, iVar);
                    } else if (K9 == 2) {
                        c4515a2 = Q3.b.p(c4641c, iVar);
                    } else if (K9 == 3) {
                        z12 = c4641c.E();
                    } else if (K9 == 4) {
                        i9 = c4641c.G();
                    } else if (K9 != 5) {
                        c4641c.V();
                        c4641c.W();
                    } else {
                        z13 = c4641c.E();
                    }
                }
                if (c4515a2 == 0) {
                    c4515a2 = new C4515a(Collections.singletonList(new C4739a(100)), 2);
                }
                r17 = new g1.l(str3, z12, i9 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, r21, c4515a2, z13);
                bVar = r17;
                while (c4641c.D()) {
                }
                c4641c.B();
                return bVar;
            case 2:
                C4639a c4639a3 = l.f38448a;
                Path.FillType fillType = Path.FillType.WINDING;
                int i10 = 0;
                boolean z14 = false;
                C4515a c4515a3 = r17;
                String str4 = c4515a3;
                ?? r23 = str4;
                C4515a c4515a4 = r23;
                C4515a c4515a5 = c4515a4;
                while (c4641c.D()) {
                    switch (c4641c.K(l.f38448a)) {
                        case 0:
                            str4 = c4641c.H();
                            break;
                        case 1:
                            c4641c.j();
                            int i11 = -1;
                            while (c4641c.D()) {
                                int K10 = c4641c.K(l.f38449b);
                                if (K10 == 0) {
                                    i11 = c4641c.G();
                                } else if (K10 != 1) {
                                    c4641c.V();
                                    c4641c.W();
                                } else {
                                    r23 = Q3.b.o(c4641c, iVar, i11);
                                }
                            }
                            c4641c.B();
                            break;
                        case 2:
                            c4515a3 = Q3.b.p(c4641c, iVar);
                            break;
                        case 3:
                            if (c4641c.G() != 1) {
                                i10 = 2;
                                break;
                            } else {
                                i10 = 1;
                                break;
                            }
                        case 4:
                            c4515a4 = Q3.b.q(c4641c, iVar);
                            break;
                        case 5:
                            c4515a5 = Q3.b.q(c4641c, iVar);
                            break;
                        case 6:
                            fillType = c4641c.G() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                            break;
                        case 7:
                            z14 = c4641c.E();
                            break;
                        default:
                            c4641c.V();
                            c4641c.W();
                            break;
                    }
                }
                if (c4515a3 == 0) {
                    c4515a3 = new C4515a(Collections.singletonList(new C4739a(100)), 2);
                }
                dVar = new g1.d(str4, i10, fillType, r23, c4515a3, c4515a4, c4515a5, z14);
                bVar = dVar;
                while (c4641c.D()) {
                }
                c4641c.B();
                return bVar;
            case 3:
                C4639a c4639a4 = z.f38474a;
                ArrayList arrayList = new ArrayList();
                String str5 = r17;
                while (c4641c.D()) {
                    int K11 = c4641c.K(z.f38474a);
                    if (K11 == 0) {
                        str5 = c4641c.H();
                    } else if (K11 == 1) {
                        z6 = c4641c.E();
                    } else if (K11 != 2) {
                        c4641c.W();
                    } else {
                        c4641c.b();
                        while (c4641c.D()) {
                            g1.b a9 = a(c4641c, iVar);
                            if (a9 != null) {
                                arrayList.add(a9);
                            }
                        }
                        c4641c.z();
                    }
                }
                mVar = new g1.m(str5, arrayList, z6);
                bVar = mVar;
                while (c4641c.D()) {
                }
                c4641c.B();
                return bVar;
            case 4:
                C4639a c4639a5 = m.f38450a;
                ArrayList arrayList2 = new ArrayList();
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                boolean z15 = false;
                float f2 = 0.0f;
                C4515a c4515a6 = r17;
                String str6 = c4515a6;
                ?? r22 = str6;
                C4515a c4515a7 = r22;
                C4515a c4515a8 = c4515a7;
                ?? r26 = c4515a8;
                C4516b c4516b = r26;
                while (c4641c.D()) {
                    switch (c4641c.K(m.f38450a)) {
                        case 0:
                            str6 = c4641c.H();
                            break;
                        case 1:
                            c4641c.j();
                            int i15 = -1;
                            while (c4641c.D()) {
                                int K12 = c4641c.K(m.f38451b);
                                if (K12 == 0) {
                                    i15 = c4641c.G();
                                } else if (K12 != 1) {
                                    c4641c.V();
                                    c4641c.W();
                                } else {
                                    r22 = Q3.b.o(c4641c, iVar, i15);
                                }
                            }
                            c4641c.B();
                            break;
                        case 2:
                            c4515a6 = Q3.b.p(c4641c, iVar);
                            break;
                        case 3:
                            if (c4641c.G() != 1) {
                                i12 = 2;
                                break;
                            } else {
                                i12 = 1;
                                break;
                            }
                        case 4:
                            c4515a7 = Q3.b.q(c4641c, iVar);
                            break;
                        case 5:
                            c4515a8 = Q3.b.q(c4641c, iVar);
                            break;
                        case 6:
                            r26 = Q3.b.n(c4641c, iVar, true);
                            break;
                        case 7:
                            i13 = AbstractC5050e.e(3)[c4641c.G() - 1];
                            break;
                        case 8:
                            i14 = AbstractC5050e.e(3)[c4641c.G() - 1];
                            break;
                        case 9:
                            f2 = (float) c4641c.F();
                            break;
                        case 10:
                            z15 = c4641c.E();
                            break;
                        case 11:
                            c4641c.b();
                            while (c4641c.D()) {
                                c4641c.j();
                                String str7 = r17;
                                ?? r10 = str7;
                                while (c4641c.D()) {
                                    int K13 = c4641c.K(m.f38452c);
                                    if (K13 == 0) {
                                        str7 = c4641c.H();
                                    } else if (K13 != 1) {
                                        c4641c.V();
                                        c4641c.W();
                                    } else {
                                        r10 = Q3.b.n(c4641c, iVar, true);
                                    }
                                }
                                c4641c.B();
                                if (str7.equals(C4876a.PUSH_MINIFIED_BUTTONS_LIST)) {
                                    c4516b = r10;
                                } else if (str7.equals("d") || str7.equals("g")) {
                                    iVar.f3978o = true;
                                    arrayList2.add(r10);
                                }
                            }
                            c4641c.z();
                            if (arrayList2.size() != 1) {
                                break;
                            } else {
                                arrayList2.add((C4516b) arrayList2.get(0));
                                break;
                            }
                        default:
                            c4641c.V();
                            c4641c.W();
                            break;
                    }
                }
                if (c4515a6 == 0) {
                    c4515a6 = new C4515a(Collections.singletonList(new C4739a(100)), 2);
                }
                dVar = new g1.e(str6, i12, r22, c4515a6, c4515a7, c4515a8, r26, i13, i14, f2, arrayList2, c4516b, z15);
                bVar = dVar;
                while (c4641c.D()) {
                }
                c4641c.B();
                return bVar;
            case 5:
                C4639a c4639a6 = s.f38466a;
                boolean z16 = false;
                String str8 = r17;
                while (c4641c.D()) {
                    int K14 = c4641c.K(s.f38466a);
                    if (K14 == 0) {
                        str8 = c4641c.H();
                    } else if (K14 == 1) {
                        int G2 = c4641c.G();
                        if (G2 != 1) {
                            if (G2 == 2) {
                                i4 = 2;
                            } else if (G2 == 3) {
                                i4 = 3;
                            } else if (G2 == 4) {
                                i4 = 4;
                            } else if (G2 == 5) {
                                i4 = 5;
                            }
                        }
                        i4 = 1;
                    } else if (K14 != 2) {
                        c4641c.V();
                        c4641c.W();
                    } else {
                        z16 = c4641c.E();
                    }
                }
                g1.g gVar = new g1.g(i4, str8, z16);
                iVar.a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                bVar = gVar;
                while (c4641c.D()) {
                }
                c4641c.B();
                return bVar;
            case 6:
                C4639a c4639a7 = u.f38468a;
                boolean z17 = false;
                String str9 = r17;
                ?? r202 = str9;
                C4515a c4515a9 = r202;
                ?? r222 = c4515a9;
                while (c4641c.D()) {
                    int K15 = c4641c.K(u.f38468a);
                    if (K15 == 0) {
                        str9 = c4641c.H();
                    } else if (K15 == 1) {
                        r202 = AbstractC4606a.b(c4641c, iVar);
                    } else if (K15 == 2) {
                        c4515a9 = Q3.b.q(c4641c, iVar);
                    } else if (K15 == 3) {
                        r222 = Q3.b.n(c4641c, iVar, true);
                    } else if (K15 != 4) {
                        c4641c.W();
                    } else {
                        z17 = c4641c.E();
                    }
                }
                aVar = new g1.i(str9, (f1.e) r202, c4515a9, (C4516b) r222, z17);
                bVar = aVar;
                while (c4641c.D()) {
                }
                c4641c.B();
                return bVar;
            case 7:
                C4639a c4639a8 = w.f38470a;
                String str10 = r17;
                ?? r32 = str10;
                while (c4641c.D()) {
                    int K16 = c4641c.K(w.f38470a);
                    if (K16 == 0) {
                        str10 = c4641c.H();
                    } else if (K16 == 1) {
                        r32 = Q3.b.n(c4641c, iVar, true);
                    } else if (K16 != 2) {
                        c4641c.W();
                    } else {
                        z9 = c4641c.E();
                    }
                }
                if (!z9) {
                    bVar = new g1.j(str10, r32);
                    while (c4641c.D()) {
                    }
                    c4641c.B();
                    return bVar;
                }
                bVar = r17;
                while (c4641c.D()) {
                }
                c4641c.B();
                return bVar;
            case '\b':
                C4639a c4639a9 = v.f38469a;
                boolean z18 = false;
                String str11 = r17;
                ?? r203 = str11;
                C4516b c4516b2 = r203;
                ?? r223 = c4516b2;
                while (c4641c.D()) {
                    int K17 = c4641c.K(v.f38469a);
                    if (K17 == 0) {
                        str11 = c4641c.H();
                    } else if (K17 == 1) {
                        r203 = Q3.b.n(c4641c, iVar, false);
                    } else if (K17 == 2) {
                        c4516b2 = Q3.b.n(c4641c, iVar, false);
                    } else if (K17 == 3) {
                        r223 = AbstractC4608c.c(c4641c, iVar);
                    } else if (K17 != 4) {
                        c4641c.W();
                    } else {
                        z18 = c4641c.E();
                    }
                }
                aVar = new g1.i(str11, (C4516b) r203, c4516b2, (f1.d) r223, z18);
                bVar = aVar;
                while (c4641c.D()) {
                }
                c4641c.B();
                return bVar;
            case '\t':
                C4639a c4639a10 = A.f38415a;
                int i16 = 0;
                boolean z19 = false;
                ?? r24 = r17;
                String str12 = r24;
                while (c4641c.D()) {
                    int K18 = c4641c.K(A.f38415a);
                    if (K18 == 0) {
                        str12 = c4641c.H();
                    } else if (K18 == 1) {
                        i16 = c4641c.G();
                    } else if (K18 == 2) {
                        r24 = new C4515a(p.a(c4641c, iVar, l1.i.c(), x.f38471n, false), 5);
                    } else if (K18 != 3) {
                        c4641c.W();
                    } else {
                        z19 = c4641c.E();
                    }
                }
                mVar = new g1.n(str12, i16, r24, z19);
                bVar = mVar;
                while (c4641c.D()) {
                }
                c4641c.B();
                return bVar;
            case '\n':
                C4639a c4639a11 = t.f38467a;
                boolean z20 = i6 == 3;
                int i17 = 0;
                boolean z21 = false;
                String str13 = r17;
                ?? r212 = str13;
                f1.e eVar = r212;
                ?? r232 = eVar;
                C4516b c4516b3 = r232;
                C4516b c4516b4 = c4516b3;
                C4516b c4516b5 = c4516b4;
                C4516b c4516b6 = c4516b5;
                while (c4641c.D()) {
                    switch (c4641c.K(t.f38467a)) {
                        case 0:
                            str13 = c4641c.H();
                            break;
                        case 1:
                            int G7 = c4641c.G();
                            int[] e9 = AbstractC5050e.e(2);
                            int length = e9.length;
                            int i18 = 0;
                            while (true) {
                                if (i18 >= length) {
                                    i17 = 0;
                                    break;
                                } else {
                                    int i19 = e9[i18];
                                    if (i19 == 1) {
                                        i = 1;
                                    } else {
                                        if (i19 != 2) {
                                            throw r17;
                                        }
                                        i = 2;
                                    }
                                    if (i == G7) {
                                        i17 = i19;
                                        break;
                                    } else {
                                        i18++;
                                    }
                                }
                            }
                        case 2:
                            r212 = Q3.b.n(c4641c, iVar, false);
                            break;
                        case 3:
                            eVar = AbstractC4606a.b(c4641c, iVar);
                            break;
                        case 4:
                            r232 = Q3.b.n(c4641c, iVar, false);
                            break;
                        case 5:
                            c4516b4 = Q3.b.n(c4641c, iVar, true);
                            break;
                        case 6:
                            c4516b6 = Q3.b.n(c4641c, iVar, false);
                            break;
                        case 7:
                            c4516b3 = Q3.b.n(c4641c, iVar, true);
                            break;
                        case 8:
                            c4516b5 = Q3.b.n(c4641c, iVar, false);
                            break;
                        case 9:
                            z21 = c4641c.E();
                            break;
                        case 10:
                            if (c4641c.G() != 3) {
                                z20 = false;
                                break;
                            } else {
                                z20 = true;
                                break;
                            }
                        default:
                            c4641c.V();
                            c4641c.W();
                            break;
                    }
                }
                aVar = new g1.h(str13, i17, r212, eVar, r232, c4516b3, c4516b4, c4516b5, c4516b6, z21, z20);
                bVar = aVar;
                while (c4641c.D()) {
                }
                c4641c.B();
                return bVar;
            case 11:
                C4639a c4639a12 = B.f38416a;
                ArrayList arrayList3 = new ArrayList();
                int i20 = 0;
                int i21 = 0;
                boolean z22 = false;
                float f9 = 0.0f;
                C4515a c4515a10 = r17;
                String str14 = c4515a10;
                ?? r204 = str14;
                C4515a c4515a11 = r204;
                ?? r242 = c4515a11;
                while (c4641c.D()) {
                    switch (c4641c.K(B.f38416a)) {
                        case 0:
                            str14 = c4641c.H();
                            break;
                        case 1:
                            c4515a11 = Q3.b.m(c4641c, iVar);
                            break;
                        case 2:
                            r242 = Q3.b.n(c4641c, iVar, true);
                            break;
                        case 3:
                            c4515a10 = Q3.b.p(c4641c, iVar);
                            break;
                        case 4:
                            i20 = AbstractC5050e.e(3)[c4641c.G() - 1];
                            break;
                        case 5:
                            i21 = AbstractC5050e.e(3)[c4641c.G() - 1];
                            break;
                        case 6:
                            f9 = (float) c4641c.F();
                            break;
                        case 7:
                            z22 = c4641c.E();
                            break;
                        case 8:
                            c4641c.b();
                            while (c4641c.D()) {
                                c4641c.j();
                                String str15 = r17;
                                Object obj2 = str15;
                                while (c4641c.D()) {
                                    int K19 = c4641c.K(B.f38417b);
                                    if (K19 == 0) {
                                        str15 = c4641c.H();
                                    } else if (K19 != 1) {
                                        c4641c.V();
                                        c4641c.W();
                                    } else {
                                        obj2 = Q3.b.n(c4641c, iVar, true);
                                    }
                                }
                                c4641c.B();
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
                                        if (str15.equals(C4876a.PUSH_MINIFIED_BUTTONS_LIST)) {
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
                                        iVar.f3978o = true;
                                        arrayList3.add(obj2);
                                        break;
                                    case 2:
                                        r204 = obj2;
                                        break;
                                }
                            }
                            c4641c.z();
                            if (arrayList3.size() != 1) {
                                break;
                            } else {
                                arrayList3.add((C4516b) arrayList3.get(0));
                                break;
                            }
                            break;
                        default:
                            c4641c.W();
                            break;
                    }
                }
                if (c4515a10 == 0) {
                    c4515a10 = new C4515a(Collections.singletonList(new C4739a(100)), 2);
                }
                aVar = new g1.o(str14, r204, arrayList3, c4515a11, c4515a10, r242, i20 == 0 ? 1 : i20, i21 == 0 ? 1 : i21, f9, z22);
                bVar = aVar;
                while (c4641c.D()) {
                }
                c4641c.B();
                return bVar;
            case '\f':
                C4639a c4639a13 = C.f38418a;
                int i22 = 0;
                boolean z23 = false;
                String str16 = r17;
                ?? r213 = str16;
                C4516b c4516b7 = r213;
                C4516b c4516b8 = c4516b7;
                while (c4641c.D()) {
                    int K20 = c4641c.K(C.f38418a);
                    if (K20 == 0) {
                        r213 = Q3.b.n(c4641c, iVar, false);
                    } else if (K20 == 1) {
                        c4516b7 = Q3.b.n(c4641c, iVar, false);
                    } else if (K20 == 2) {
                        c4516b8 = Q3.b.n(c4641c, iVar, false);
                    } else if (K20 == 3) {
                        str16 = c4641c.H();
                    } else if (K20 == 4) {
                        int G8 = c4641c.G();
                        if (G8 == 1) {
                            i22 = 1;
                        } else {
                            if (G8 != 2) {
                                throw new IllegalArgumentException(Wv.f(G8, "Unknown trim path type "));
                            }
                            i22 = 2;
                        }
                    } else if (K20 != 5) {
                        c4641c.W();
                    } else {
                        z23 = c4641c.E();
                    }
                }
                aVar = new g1.p(str16, i22, r213, c4516b7, c4516b8, z23);
                bVar = aVar;
                while (c4641c.D()) {
                }
                c4641c.B();
                return bVar;
            case '\r':
                bVar = AbstractC4608c.c(c4641c, iVar);
                while (c4641c.D()) {
                }
                c4641c.B();
                return bVar;
            default:
                AbstractC4668c.b("Unknown shape type ".concat(str));
                bVar = r17;
                while (c4641c.D()) {
                }
                c4641c.B();
                return bVar;
        }
    }
}
