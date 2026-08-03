package d1;

import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.compose.ui.focus.FocusOwnerImpl$modifier$1;
import d1.i;
import java.util.ArrayList;
import s.a0;
import s.y;
import x1.c1;
import x1.g0;
import x1.y0;
import y0.m;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    public final y1.r f1576a;

    /* renamed from: b, reason: collision with root package name */
    public final y1.r f1577b;

    /* renamed from: d, reason: collision with root package name */
    public final f f1579d;

    /* renamed from: f, reason: collision with root package name */
    public y f1581f;

    /* renamed from: h, reason: collision with root package name */
    public r f1583h;

    /* renamed from: c, reason: collision with root package name */
    public final r f1578c = new r(null, 6);

    /* renamed from: e, reason: collision with root package name */
    public final FocusOwnerImpl$modifier$1 f1580e = new y0() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        public final boolean equals(Object obj) {
            return obj == this;
        }

        @Override // x1.y0
        public final m f() {
            return i.this.f1578c;
        }

        @Override // x1.y0
        public final /* bridge */ /* synthetic */ void g(m mVar) {
        }

        public final int hashCode() {
            return i.this.f1578c.hashCode();
        }
    };

    /* renamed from: g, reason: collision with root package name */
    public final a0 f1582g = new a0(1);

    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.ui.focus.FocusOwnerImpl$modifier$1] */
    public i(y1.r rVar, y1.r rVar2) {
        this.f1576a = rVar;
        this.f1577b = rVar2;
        this.f1579d = new f(this, rVar2);
    }

    public final boolean a(boolean z10) {
        c1 c1Var;
        r rVar = this.f1583h;
        if (rVar != null) {
            f(null);
            p pVar = p.f1603g;
            p pVar2 = p.f1606j;
            rVar.r0(pVar, pVar2);
            if (!rVar.f8443g.f8456t) {
                u1.a.b("visitAncestors called on an unattached node");
            }
            y0.m mVar = rVar.f8443g.f8447k;
            g0 v10 = x1.f.v(rVar);
            while (v10 != null) {
                if ((v10.I.f7991f.f8446j & 1024) != 0) {
                    while (mVar != null) {
                        if ((mVar.f8445i & 1024) != 0) {
                            o0.e eVar = null;
                            y0.m mVar2 = mVar;
                            while (mVar2 != null) {
                                if (mVar2 instanceof r) {
                                    ((r) mVar2).r0(p.f1604h, pVar2);
                                } else if ((mVar2.f8445i & 1024) != 0 && (mVar2 instanceof x1.m)) {
                                    int i10 = 0;
                                    for (y0.m mVar3 = ((x1.m) mVar2).f8110v; mVar3 != null; mVar3 = mVar3.f8448l) {
                                        if ((mVar3.f8445i & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                mVar2 = mVar3;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new o0.e(new y0.m[16]);
                                                }
                                                if (mVar2 != null) {
                                                    eVar.b(mVar2);
                                                    mVar2 = null;
                                                }
                                                eVar.b(mVar3);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                mVar2 = x1.f.f(eVar);
                            }
                        }
                        mVar = mVar.f8447k;
                    }
                }
                v10 = v10.s();
                mVar = (v10 == null || (c1Var = v10.I) == null) ? null : c1Var.f7990e;
            }
        }
        return true;
    }

    public final boolean b(int i10, boolean z10, boolean z11) {
        boolean z12 = true;
        if (z10) {
            a(z10);
        } else {
            int ordinal = e.s(this.f1578c).ordinal();
            if (ordinal == 0) {
                a(z10);
            } else {
                if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                    throw new ac.d();
                }
                z12 = false;
            }
        }
        if (z12 && z11) {
            c();
        }
        return z12;
    }

    public final void c() {
        y1.r rVar = this.f1576a;
        if (rVar.isFocused() || rVar.hasFocus()) {
            rVar.clearFocus();
        } else if (rVar.hasFocus()) {
            View findFocus = rVar.findFocus();
            if (findFocus != null) {
                findFocus.clearFocus();
            }
            rVar.clearFocus();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        if (r8 == null) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016a A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:9:0x001c, B:13:0x0026, B:16:0x0032, B:18:0x0038, B:19:0x003d, B:21:0x0045, B:23:0x004a, B:25:0x0050, B:29:0x0056, B:34:0x016a, B:36:0x0170, B:37:0x0173, B:39:0x017e, B:42:0x018a, B:46:0x0194, B:81:0x019a, B:82:0x019f, B:75:0x01d9, B:48:0x01a3, B:50:0x01a9, B:52:0x01ad, B:54:0x01b5, B:56:0x01bb, B:62:0x01c3, B:64:0x01cc, B:65:0x01d0, B:60:0x01d3, B:84:0x01de, B:87:0x01e1, B:89:0x01e7, B:96:0x01eb, B:101:0x01f2, B:103:0x01fa, B:111:0x0211, B:113:0x0216, B:147:0x021a, B:142:0x025c, B:115:0x0226, B:117:0x022c, B:119:0x0230, B:121:0x0238, B:123:0x023e, B:129:0x0246, B:131:0x024f, B:132:0x0253, B:127:0x0256, B:153:0x0261, B:157:0x0271, B:159:0x0276, B:193:0x027a, B:188:0x02bc, B:161:0x0286, B:163:0x028c, B:165:0x0290, B:167:0x0298, B:169:0x029e, B:175:0x02a6, B:177:0x02af, B:178:0x02b3, B:173:0x02b6, B:200:0x02c3, B:202:0x02ca, B:215:0x005e, B:217:0x0064, B:218:0x0067, B:220:0x006f, B:223:0x007b, B:227:0x0085, B:262:0x00d8, B:264:0x00dc, B:229:0x008a, B:231:0x0090, B:233:0x0094, B:235:0x009c, B:237:0x00a2, B:243:0x00aa, B:245:0x00b3, B:246:0x00b7, B:241:0x00ba, B:252:0x00c0, B:266:0x00c5, B:269:0x00c8, B:271:0x00ce, B:278:0x00d2, B:283:0x00e2, B:285:0x00e8, B:286:0x00eb, B:288:0x00f5, B:291:0x0101, B:295:0x010b, B:330:0x015e, B:332:0x0162, B:297:0x0110, B:299:0x0116, B:301:0x011a, B:303:0x0122, B:305:0x0128, B:311:0x0130, B:313:0x0139, B:314:0x013d, B:309:0x0140, B:320:0x0146, B:335:0x014b, B:338:0x014e, B:340:0x0154, B:347:0x0158), top: B:2:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v10, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v16, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r0v24, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v9, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v4, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r15v5, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r15v9, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v35, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(KeyEvent keyEvent, oc.a aVar) {
        x1.l lVar;
        y0.m mVar;
        c1 c1Var;
        x1.l lVar2;
        c1 c1Var2;
        int size;
        c1 c1Var3;
        r rVar = this.f1578c;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.f1579d.f1574e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                return false;
            }
            if (!g(keyEvent)) {
                return false;
            }
            r g8 = e.g(rVar);
            if (g8 != null) {
                if (!g8.f8443g.f8456t) {
                    u1.a.b("visitLocalDescendants called on an unattached node");
                }
                y0.m mVar2 = g8.f8443g;
                if ((mVar2.f8446j & 9216) != 0) {
                    mVar = null;
                    for (y0.m mVar3 = mVar2.f8448l; mVar3 != null; mVar3 = mVar3.f8448l) {
                        int i10 = mVar3.f8445i;
                        if ((i10 & 9216) != 0) {
                            if ((i10 & 1024) != 0) {
                                break;
                            }
                            mVar = mVar3;
                        }
                    }
                } else {
                    mVar = null;
                }
            }
            if (g8 != null) {
                if (!g8.f8443g.f8456t) {
                    u1.a.b("visitAncestors called on an unattached node");
                }
                y0.m mVar4 = g8.f8443g;
                g0 v10 = x1.f.v(g8);
                loop11: while (true) {
                    if (v10 == null) {
                        lVar2 = null;
                        break;
                    }
                    if ((v10.I.f7991f.f8446j & 8192) != 0) {
                        while (mVar4 != null) {
                            if ((mVar4.f8445i & 8192) != 0) {
                                o0.e eVar = null;
                                y0.m mVar5 = mVar4;
                                while (mVar5 != null) {
                                    if (mVar5 instanceof p1.c) {
                                        lVar2 = mVar5;
                                        break loop11;
                                    }
                                    if ((mVar5.f8445i & 8192) != 0 && (mVar5 instanceof x1.m)) {
                                        y0.m mVar6 = ((x1.m) mVar5).f8110v;
                                        int i11 = 0;
                                        mVar5 = mVar5;
                                        eVar = eVar;
                                        while (mVar6 != null) {
                                            if ((mVar6.f8445i & 8192) != 0) {
                                                i11++;
                                                eVar = eVar;
                                                if (i11 == 1) {
                                                    mVar5 = mVar6;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new o0.e(new y0.m[16]);
                                                    }
                                                    if (mVar5 != null) {
                                                        eVar.b(mVar5);
                                                        mVar5 = null;
                                                    }
                                                    eVar.b(mVar6);
                                                }
                                            }
                                            mVar6 = mVar6.f8448l;
                                            mVar5 = mVar5;
                                            eVar = eVar;
                                        }
                                        if (i11 == 1) {
                                        }
                                    }
                                    mVar5 = x1.f.f(eVar);
                                }
                            }
                            mVar4 = mVar4.f8447k;
                        }
                    }
                    v10 = v10.s();
                    mVar4 = (v10 == null || (c1Var2 = v10.I) == null) ? null : c1Var2.f7990e;
                }
                x1.l lVar3 = (p1.c) lVar2;
                if (lVar3 != null) {
                    mVar = ((y0.m) lVar3).f8443g;
                    if (mVar != null) {
                        if (!mVar.f8443g.f8456t) {
                            u1.a.b("visitAncestors called on an unattached node");
                        }
                        y0.m mVar7 = mVar.f8443g.f8447k;
                        g0 v11 = x1.f.v(mVar);
                        ArrayList arrayList = null;
                        while (v11 != null) {
                            if ((v11.I.f7991f.f8446j & 8192) != 0) {
                                while (mVar7 != null) {
                                    if ((mVar7.f8445i & 8192) != 0) {
                                        y0.m mVar8 = mVar7;
                                        o0.e eVar2 = null;
                                        while (mVar8 != null) {
                                            if (mVar8 instanceof p1.c) {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                arrayList.add(mVar8);
                                            } else if ((mVar8.f8445i & 8192) != 0 && (mVar8 instanceof x1.m)) {
                                                int i12 = 0;
                                                for (y0.m mVar9 = ((x1.m) mVar8).f8110v; mVar9 != null; mVar9 = mVar9.f8448l) {
                                                    if ((mVar9.f8445i & 8192) != 0) {
                                                        i12++;
                                                        if (i12 == 1) {
                                                            mVar8 = mVar9;
                                                        } else {
                                                            if (eVar2 == null) {
                                                                eVar2 = new o0.e(new y0.m[16]);
                                                            }
                                                            if (mVar8 != null) {
                                                                eVar2.b(mVar8);
                                                                mVar8 = null;
                                                            }
                                                            eVar2.b(mVar9);
                                                        }
                                                    }
                                                }
                                                if (i12 == 1) {
                                                }
                                            }
                                            mVar8 = x1.f.f(eVar2);
                                        }
                                    }
                                    mVar7 = mVar7.f8447k;
                                }
                            }
                            v11 = v11.s();
                            mVar7 = (v11 == null || (c1Var3 = v11.I) == null) ? null : c1Var3.f7990e;
                        }
                        if (arrayList != null && arrayList.size() - 1 >= 0) {
                            while (true) {
                                int i13 = size - 1;
                                if (((p1.c) arrayList.get(size)).k(keyEvent)) {
                                    return true;
                                }
                                if (i13 < 0) {
                                    break;
                                }
                                size = i13;
                            }
                        }
                        x1.m mVar10 = mVar.f8443g;
                        ?? r12 = 0;
                        while (mVar10 != 0) {
                            if (mVar10 instanceof p1.c) {
                                if (((p1.c) mVar10).k(keyEvent)) {
                                    return true;
                                }
                            } else if ((mVar10.f8445i & 8192) != 0 && (mVar10 instanceof x1.m)) {
                                y0.m mVar11 = mVar10.f8110v;
                                int i14 = 0;
                                mVar10 = mVar10;
                                r12 = r12;
                                while (mVar11 != null) {
                                    if ((mVar11.f8445i & 8192) != 0) {
                                        i14++;
                                        r12 = r12;
                                        if (i14 == 1) {
                                            mVar10 = mVar11;
                                        } else {
                                            if (r12 == 0) {
                                                r12 = new o0.e(new y0.m[16]);
                                            }
                                            if (mVar10 != 0) {
                                                r12.b(mVar10);
                                                mVar10 = 0;
                                            }
                                            r12.b(mVar11);
                                        }
                                    }
                                    mVar11 = mVar11.f8448l;
                                    mVar10 = mVar10;
                                    r12 = r12;
                                }
                                if (i14 == 1) {
                                }
                            }
                            mVar10 = x1.f.f(r12);
                        }
                        if (((Boolean) aVar.invoke()).booleanValue()) {
                            return true;
                        }
                        x1.m mVar12 = mVar.f8443g;
                        ?? r02 = 0;
                        while (mVar12 != 0) {
                            if (mVar12 instanceof p1.c) {
                                if (((p1.c) mVar12).F(keyEvent)) {
                                    return true;
                                }
                            } else if ((mVar12.f8445i & 8192) != 0 && (mVar12 instanceof x1.m)) {
                                y0.m mVar13 = mVar12.f8110v;
                                int i15 = 0;
                                r02 = r02;
                                mVar12 = mVar12;
                                while (mVar13 != null) {
                                    if ((mVar13.f8445i & 8192) != 0) {
                                        i15++;
                                        r02 = r02;
                                        if (i15 == 1) {
                                            mVar12 = mVar13;
                                        } else {
                                            if (r02 == 0) {
                                                r02 = new o0.e(new y0.m[16]);
                                            }
                                            if (mVar12 != 0) {
                                                r02.b(mVar12);
                                                mVar12 = 0;
                                            }
                                            r02.b(mVar13);
                                        }
                                    }
                                    mVar13 = mVar13.f8448l;
                                    r02 = r02;
                                    mVar12 = mVar12;
                                }
                                if (i15 == 1) {
                                }
                            }
                            mVar12 = x1.f.f(r02);
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            for (int i16 = 0; i16 < size2; i16++) {
                                if (((p1.c) arrayList.get(i16)).F(keyEvent)) {
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
            }
            if (!rVar.f8443g.f8456t) {
                u1.a.b("visitAncestors called on an unattached node");
            }
            y0.m mVar14 = rVar.f8443g.f8447k;
            g0 v12 = x1.f.v(rVar);
            loop15: while (true) {
                if (v12 == null) {
                    lVar = null;
                    break;
                }
                if ((v12.I.f7991f.f8446j & 8192) != 0) {
                    while (mVar14 != null) {
                        if ((mVar14.f8445i & 8192) != 0) {
                            y0.m mVar15 = mVar14;
                            o0.e eVar3 = null;
                            while (mVar15 != null) {
                                if (mVar15 instanceof p1.c) {
                                    lVar = mVar15;
                                    break loop15;
                                }
                                if ((mVar15.f8445i & 8192) != 0 && (mVar15 instanceof x1.m)) {
                                    y0.m mVar16 = ((x1.m) mVar15).f8110v;
                                    int i17 = 0;
                                    mVar15 = mVar15;
                                    eVar3 = eVar3;
                                    while (mVar16 != null) {
                                        if ((mVar16.f8445i & 8192) != 0) {
                                            i17++;
                                            eVar3 = eVar3;
                                            if (i17 == 1) {
                                                mVar15 = mVar16;
                                            } else {
                                                if (eVar3 == null) {
                                                    eVar3 = new o0.e(new y0.m[16]);
                                                }
                                                if (mVar15 != null) {
                                                    eVar3.b(mVar15);
                                                    mVar15 = null;
                                                }
                                                eVar3.b(mVar16);
                                            }
                                        }
                                        mVar16 = mVar16.f8448l;
                                        mVar15 = mVar15;
                                        eVar3 = eVar3;
                                    }
                                    if (i17 == 1) {
                                    }
                                }
                                mVar15 = x1.f.f(eVar3);
                            }
                        }
                        mVar14 = mVar14.f8447k;
                    }
                }
                v12 = v12.s();
                mVar14 = (v12 == null || (c1Var = v12.I) == null) ? null : c1Var.f7990e;
            }
            x1.l lVar4 = (p1.c) lVar;
            mVar = lVar4 != null ? ((y0.m) lVar4).f8443g : null;
            if (mVar != null) {
            }
            return false;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x0113, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean e(int i10, e1.c cVar, oc.c cVar2) {
        boolean a6;
        c1 c1Var;
        n nVar;
        boolean z10;
        r rVar = this.f1578c;
        r g8 = e.g(rVar);
        int i11 = 4;
        y1.r rVar2 = this.f1577b;
        r rVar3 = null;
        if (g8 != null) {
            s2.l layoutDirection = rVar2.getLayoutDirection();
            l s02 = g8.s0();
            n nVar2 = s02.f1595h;
            n nVar3 = s02.f1596i;
            if (i10 == 1) {
                nVar = s02.f1589b;
            } else if (i10 == 2) {
                nVar = s02.f1590c;
            } else if (i10 == 5) {
                nVar = s02.f1591d;
            } else if (i10 == 6) {
                nVar = s02.f1592e;
            } else if (i10 == 3) {
                int ordinal = layoutDirection.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        throw new ac.d();
                    }
                    nVar2 = nVar3;
                }
                if (nVar2 == n.f1599b) {
                    nVar2 = null;
                }
                if (nVar2 == null) {
                    nVar = s02.f1593f;
                }
                nVar = nVar2;
            } else if (i10 == 4) {
                int ordinal2 = layoutDirection.ordinal();
                if (ordinal2 == 0) {
                    nVar2 = nVar3;
                } else if (ordinal2 != 1) {
                    throw new ac.d();
                }
                if (nVar2 == n.f1599b) {
                    nVar2 = null;
                }
                if (nVar2 == null) {
                    nVar = s02.f1594g;
                }
                nVar = nVar2;
            } else {
                if (i10 != 7 && i10 != 8) {
                    throw new IllegalStateException("invalid FocusDirection");
                }
                i iVar = (i) ((y1.r) x1.f.w(g8)).getFocusOwner();
                r rVar4 = iVar.f1583h;
                if (i10 == 7) {
                    s02.f1597j.getClass();
                } else {
                    s02.f1598k.getClass();
                }
                nVar = rVar4 != iVar.f1583h ? n.f1601d : n.f1599b;
            }
            n nVar4 = n.f1600c;
            if (!pc.j.a(nVar, nVar4)) {
                if (pc.j.a(nVar, n.f1601d)) {
                    Object g10 = e.g(rVar);
                    if (g10 != null) {
                        return (Boolean) cVar2.invoke(g10);
                    }
                } else {
                    n nVar5 = n.f1599b;
                    if (!pc.j.a(nVar, nVar5)) {
                        nVar.getClass();
                        if (nVar == nVar5) {
                            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                        }
                        if (nVar == nVar4) {
                            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                        }
                        o0.e eVar = nVar.f1602a;
                        int i12 = eVar.f5136i;
                        if (i12 == 0) {
                            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                            z10 = false;
                        } else {
                            Object[] objArr = eVar.f5134g;
                            boolean z11 = false;
                            for (int i13 = 0; i13 < i12; i13++) {
                                y0.m mVar = (y0.m) ((o) objArr[i13]);
                                if (!mVar.f8443g.f8456t) {
                                    u1.a.b("visitChildren called on an unattached node");
                                }
                                o0.e eVar2 = new o0.e(new y0.m[16]);
                                y0.m mVar2 = mVar.f8443g;
                                y0.m mVar3 = mVar2.f8448l;
                                if (mVar3 == null) {
                                    x1.f.b(eVar2, mVar2);
                                } else {
                                    eVar2.b(mVar3);
                                }
                                while (true) {
                                    int i14 = eVar2.f5136i;
                                    if (i14 != 0) {
                                        y0.m mVar4 = (y0.m) eVar2.k(i14 - 1);
                                        if ((mVar4.f8446j & 1024) == 0) {
                                            x1.f.b(eVar2, mVar4);
                                        } else {
                                            while (true) {
                                                if (mVar4 == null) {
                                                    break;
                                                }
                                                if ((mVar4.f8445i & 1024) != 0) {
                                                    o0.e eVar3 = null;
                                                    while (mVar4 != null) {
                                                        if (mVar4 instanceof r) {
                                                            r rVar5 = (r) mVar4;
                                                            if (rVar5.s0().f1588a ? ((Boolean) cVar2.invoke(rVar5)).booleanValue() : e.i(rVar5, 7, cVar2)) {
                                                                z11 = true;
                                                                break;
                                                            }
                                                        } else if (((mVar4.f8445i & 1024) != 0) && (mVar4 instanceof x1.m)) {
                                                            int i15 = 0;
                                                            for (y0.m mVar5 = ((x1.m) mVar4).f8110v; mVar5 != null; mVar5 = mVar5.f8448l) {
                                                                if ((mVar5.f8445i & 1024) != 0) {
                                                                    i15++;
                                                                    if (i15 == 1) {
                                                                        mVar4 = mVar5;
                                                                    } else {
                                                                        if (eVar3 == null) {
                                                                            eVar3 = new o0.e(new y0.m[16]);
                                                                        }
                                                                        if (mVar4 != null) {
                                                                            eVar3.b(mVar4);
                                                                            mVar4 = null;
                                                                        }
                                                                        eVar3.b(mVar5);
                                                                    }
                                                                }
                                                            }
                                                            if (i15 == 1) {
                                                            }
                                                        }
                                                        mVar4 = x1.f.f(eVar3);
                                                    }
                                                } else {
                                                    mVar4 = mVar4.f8448l;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            z10 = z11;
                        }
                        return Boolean.valueOf(z10);
                    }
                }
            }
            return null;
        }
        g8 = null;
        s2.l layoutDirection2 = rVar2.getLayoutDirection();
        a0.r rVar6 = new a0.r(g8, this, cVar2);
        if (i10 == 1 || i10 == 2) {
            if (i10 == 1) {
                a6 = e.k(rVar, rVar6);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("This function should only be used for 1-D focus search");
                }
                a6 = e.a(rVar, rVar6);
            }
            return Boolean.valueOf(a6);
        }
        if (i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6) {
            return e.C(i10, rVar6, rVar, cVar);
        }
        if (i10 == 7) {
            int ordinal3 = layoutDirection2.ordinal();
            if (ordinal3 != 0) {
                if (ordinal3 != 1) {
                    throw new ac.d();
                }
                i11 = 3;
            }
            r g11 = e.g(rVar);
            if (g11 != null) {
                return e.C(i11, rVar6, g11, cVar);
            }
            return null;
        }
        if (i10 != 8) {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) b.a(i10))).toString());
        }
        r g12 = e.g(rVar);
        if (g12 != null) {
            if (!g12.f8443g.f8456t) {
                u1.a.b("visitAncestors called on an unattached node");
            }
            y0.m mVar6 = g12.f8443g.f8447k;
            g0 v10 = x1.f.v(g12);
            loop5: while (true) {
                if (v10 == null) {
                    break;
                }
                if ((v10.I.f7991f.f8446j & 1024) != 0) {
                    while (mVar6 != null) {
                        if ((mVar6.f8445i & 1024) != 0) {
                            y0.m mVar7 = mVar6;
                            o0.e eVar4 = null;
                            while (mVar7 != null) {
                                if (mVar7 instanceof r) {
                                    r rVar7 = (r) mVar7;
                                    if (rVar7.s0().f1588a) {
                                        rVar3 = rVar7;
                                        break loop5;
                                    }
                                } else if ((mVar7.f8445i & 1024) != 0 && (mVar7 instanceof x1.m)) {
                                    int i16 = 0;
                                    for (y0.m mVar8 = ((x1.m) mVar7).f8110v; mVar8 != null; mVar8 = mVar8.f8448l) {
                                        if ((mVar8.f8445i & 1024) != 0) {
                                            i16++;
                                            if (i16 == 1) {
                                                mVar7 = mVar8;
                                            } else {
                                                if (eVar4 == null) {
                                                    eVar4 = new o0.e(new y0.m[16]);
                                                }
                                                if (mVar7 != null) {
                                                    eVar4.b(mVar7);
                                                    mVar7 = null;
                                                }
                                                eVar4.b(mVar8);
                                            }
                                        }
                                    }
                                    if (i16 != 1) {
                                        mVar7 = x1.f.f(eVar4);
                                    }
                                }
                                mVar7 = x1.f.f(eVar4);
                            }
                        }
                        mVar6 = mVar6.f8447k;
                    }
                }
                v10 = v10.s();
                mVar6 = (v10 == null || (c1Var = v10.I) == null) ? null : c1Var.f7990e;
            }
        }
        r rVar8 = rVar3;
        return Boolean.valueOf((rVar8 == null || rVar8.equals(rVar)) ? false : ((Boolean) rVar6.invoke(rVar8)).booleanValue());
    }

    public final void f(r rVar) {
        g0 v10;
        e2.j u10;
        g0 v11;
        e2.j u11;
        r rVar2 = this.f1583h;
        this.f1583h = rVar;
        a0 a0Var = this.f1582g;
        Object[] objArr = a0Var.f6219a;
        int i10 = a0Var.f6220b;
        for (int i11 = 0; i11 < i10; i11++) {
            z0.b bVar = (z0.b) objArr[i11];
            bVar.getClass();
            if (rVar2 != null && (v11 = x1.f.v(rVar2)) != null && (u11 = v11.u()) != null && u11.f1985g.b(e2.i.f1965g)) {
                ((AutofillManager) bVar.f9050a.f4957h).notifyViewExited(bVar.f9052c, v11.f8042h);
            }
            if (rVar != null && (v10 = x1.f.v(rVar)) != null && (u10 = v10.u()) != null && u10.f1985g.b(e2.i.f1965g)) {
                int i12 = v10.f8042h;
                bVar.f9053d.f2293a.f(i12, new z0.a(bVar, i12));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0349, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x034b, code lost:
    
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009f, code lost:
    
        r36 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a9, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == r36) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ab, code lost:
    
        r3 = r4.b(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b1, code lost:
    
        if (r4.f6361e != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c2, code lost:
    
        if (((r4.f6357a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ca, code lost:
    
        r3 = r4.f6359c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cc, code lost:
    
        if (r3 <= r5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ce, code lost:
    
        r15 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00df, code lost:
    
        if (java.lang.Long.compareUnsigned(r4.f6360d * 32, r3 * 25) > 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e1, code lost:
    
        r3 = r4.f6357a;
        r8 = r4.f6359c;
        r9 = r4.f6358b;
        r10 = (r8 + 7) >> 3;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ed, code lost:
    
        if (r13 >= r10) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ef, code lost:
    
        r14 = r5;
        r5 = r3[r13] & (-9187201950435737472L);
        r3[r13] = (-72340172838076674L) & ((~r5) + (r5 >>> 7));
        r13 = r13 + 1;
        r5 = r14;
        r15 = r15;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x010f, code lost:
    
        r32 = r6;
        r17 = r15;
        r5 = bc.l.Y(r3);
        r6 = r5 - 1;
        r3[r6] = (r3[r6] & 72057594037927935L) | (-72057594037927936L);
        r3[r5] = r3[0];
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0130, code lost:
    
        if (r5 == r8) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0132, code lost:
    
        r6 = r5 >> 3;
        r10 = (r5 & 7) << 3;
        r13 = (r3[r6] >> r10) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x013f, code lost:
    
        if (r13 != r17) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0146, code lost:
    
        if (r13 == 254) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0149, code lost:
    
        r13 = java.lang.Long.hashCode(r9[r5]) * r31;
        r14 = (r13 ^ (r13 << 16)) >>> 7;
        r15 = r4.b(r14);
        r14 = r14 & r8;
        r33 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x016a, code lost:
    
        if ((((r15 - r14) & r8) / 8) != (((r5 - r14) & r8) / 8)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x016c, code lost:
    
        r3[r6] = (r3[r6] & (~(255 << r10))) | ((r13 & 127) << r10);
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x018a, code lost:
    
        r7 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x018d, code lost:
    
        r7 = r5;
        r5 = r15 >> 3;
        r34 = r3[r5];
        r6 = (r15 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x019e, code lost:
    
        if (((r34 >> r6) & 255) != r17) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01a0, code lost:
    
        r3[r5] = (r34 & (~(255 << r6))) | ((r13 & 127) << r6);
        r3[r6] = (r3[r6] & (~(255 << r10))) | (r17 << r10);
        r9[r15] = r9[r7];
        r9[r7] = r36;
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01df, code lost:
    
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01c4, code lost:
    
        r3[r5] = ((r13 & 127) << r6) | (r34 & (~(255 << r6)));
        r5 = r9[r15];
        r9[r15] = r9[r7];
        r9[r7] = r5;
        r5 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0141, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01ed, code lost:
    
        r33 = r7;
        r4.f6361e = s.o0.a(r4.f6359c) - r4.f6360d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x027d, code lost:
    
        r3 = r4.b(r32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0281, code lost:
    
        r32 = r3;
        r4.f6360d++;
        r3 = r4.f6361e;
        r5 = r4.f6357a;
        r6 = r32 >> 3;
        r7 = r5[r6];
        r9 = (r32 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x029b, code lost:
    
        if (((r7 >> r9) & 255) != r17) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x029d, code lost:
    
        r21 = r33 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x029f, code lost:
    
        r4.f6361e = r3 - r21;
        r3 = r4.f6359c;
        r7 = (r7 & (~(255 << r9))) | (r11 << r9);
        r5[r6] = r7;
        r5[(((r32 - 7) & r3) + (r3 & 7)) >> 3] = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01fe, code lost:
    
        r17 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0200, code lost:
    
        r32 = r6;
        r33 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0208, code lost:
    
        r3 = s.o0.b(r4.f6359c);
        r5 = r4.f6357a;
        r6 = r4.f6358b;
        r7 = r4.f6359c;
        r4.c(r3);
        r3 = r4.f6357a;
        r8 = r4.f6358b;
        r9 = r4.f6359c;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x021f, code lost:
    
        if (r10 >= r7) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x022e, code lost:
    
        if (((r5[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= r17) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0230, code lost:
    
        r13 = r6[r10];
        r15 = java.lang.Long.hashCode(r13) * r31;
        r15 = r15 ^ (r15 << 16);
        r16 = r3;
        r3 = r4.b(r15 >>> 7);
        r19 = r5;
        r20 = r6;
        r5 = r15 & 127;
        r15 = r3 >> 3;
        r22 = (r3 & 7) << 3;
        r5 = (r16[r15] & (~(255 << r22))) | (r5 << r22);
        r16[r15] = r5;
        r16[(((r3 - 7) & r9) + (r9 & 7)) >> 3] = r5;
        r8[r3] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0274, code lost:
    
        r10 = r10 + 1;
        r3 = r16;
        r5 = r19;
        r6 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x026e, code lost:
    
        r16 = r3;
        r19 = r5;
        r20 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0205, code lost:
    
        r17 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c4, code lost:
    
        r33 = true;
        r17 = 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(KeyEvent keyEvent) {
        int i10;
        long j3;
        boolean z10;
        int i11;
        long d10 = v6.a.d(keyEvent.getKeyCode());
        int u10 = bc.a0.u(keyEvent);
        int i12 = -862048943;
        long j6 = 0;
        int i13 = 8;
        int i14 = 0;
        boolean z11 = true;
        if (u10 == 2) {
            y yVar = this.f1581f;
            if (yVar == null) {
                yVar = new y(3);
                this.f1581f = yVar;
            }
            y yVar2 = yVar;
            int hashCode = Long.hashCode(d10) * (-862048943);
            int i15 = hashCode ^ (hashCode << 16);
            int i16 = i15 >>> 7;
            int i17 = i15 & 127;
            int i18 = yVar2.f6359c;
            int i19 = i16 & i18;
            int i20 = 0;
            loop0: while (true) {
                long[] jArr = yVar2.f6357a;
                int i21 = i19 >> 3;
                int i22 = i12;
                int i23 = (i19 & 7) << 3;
                long j10 = (jArr[i21] >>> i23) | ((jArr[i21 + 1] << (64 - i23)) & ((-i23) >> 63));
                long j11 = i17;
                long j12 = j10 ^ (j11 * 72340172838076673L);
                long j13 = (j12 - 72340172838076673L) & (~j12) & (-9187201950435737472L);
                while (true) {
                    if (j13 == j6) {
                        break;
                    }
                    i11 = (i19 + (Long.numberOfTrailingZeros(j13) >> 3)) & i18;
                    long j14 = j6;
                    if (yVar2.f6358b[i11] == d10) {
                        z10 = true;
                        break loop0;
                    }
                    j13 &= j13 - 1;
                    j6 = j14;
                }
                i20 += 8;
                i19 = (i19 + i20) & i18;
                i13 = i13;
                i12 = i22;
                j6 = j3;
            }
            yVar2.f6358b[i11] = d10;
            return z10;
        }
        if (u10 != 1) {
            return true;
        }
        y yVar3 = this.f1581f;
        if (yVar3 == null || !yVar3.a(d10)) {
            return false;
        }
        y yVar4 = this.f1581f;
        if (yVar4 != null) {
            int hashCode2 = Long.hashCode(d10) * (-862048943);
            int i24 = hashCode2 ^ (hashCode2 << 16);
            int i25 = i24 & 127;
            int i26 = yVar4.f6359c;
            int i27 = i24 >>> 7;
            loop5: while (true) {
                int i28 = i27 & i26;
                long[] jArr2 = yVar4.f6357a;
                int i29 = i28 >> 3;
                int i30 = (i28 & 7) << 3;
                long j15 = ((jArr2[i29 + 1] << (64 - i30)) & ((-i30) >> 63)) | (jArr2[i29] >>> i30);
                long j16 = (i25 * 72340172838076673L) ^ j15;
                long j17 = (~j16) & (j16 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j17 == 0) {
                        break;
                    }
                    i10 = ((Long.numberOfTrailingZeros(j17) >> 3) + i28) & i26;
                    if (yVar4.f6358b[i10] == d10) {
                        break loop5;
                    }
                    j17 &= j17 - 1;
                }
                i14 += 8;
                i27 = i28 + i14;
            }
            if (i10 >= 0) {
                yVar4.f6360d--;
                long[] jArr3 = yVar4.f6357a;
                int i31 = yVar4.f6359c;
                int i32 = i10 >> 3;
                int i33 = (i10 & 7) << 3;
                long j18 = (jArr3[i32] & (~(255 << i33))) | (254 << i33);
                jArr3[i32] = j18;
                jArr3[(((i10 - 7) & i31) + (i31 & 7)) >> 3] = j18;
                return true;
            }
        }
        return true;
    }
}
