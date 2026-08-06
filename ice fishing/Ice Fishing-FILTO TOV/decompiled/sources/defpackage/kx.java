package defpackage;

import com.combinations.level.experts.core.domain.model.ConduitKt;
import com.combinations.level.experts.core.domain.model.GameProgress;
import com.combinations.level.experts.core.domain.model.GameSettings;
import com.combinations.level.experts.core.domain.model.LevelResult;
import com.combinations.level.experts.core.domain.model.LevelSpec;
import com.combinations.level.experts.core.domain.model.Sector;
import com.combinations.level.experts.core.domain.model.Side;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class kx extends ch0 {
    public final lj AvO7iQsrTN;
    public List JFJ3QoxA;
    public final oj encWxUiV2;
    public f51 mOu10nynGul;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kx(lj ljVar, oj ojVar) {
        super(new cx(r2, 0, 0, "", 0, 0, r8, r8, r8, r8, 0, 0, 0, 0L, 0, r2, null, 0));
        GameSettings gameSettings = new GameSettings(false, false, false, 7, null);
        tw twVar = tw.OOA6hdeuvCS;
        xp xpVar = xp.OOA6hdeuvCS;
        this.AvO7iQsrTN = ljVar;
        this.encWxUiV2 = ojVar;
        this.JFJ3QoxA = xpVar;
        vg vgVar = null;
        fb1.MZhzXH72(rj0.arNh8D4Z5gB(this), null, new zw(this, vgVar, 1), 3);
        fb1.MZhzXH72(rj0.arNh8D4Z5gB(this), null, new zw(this, vgVar, 2), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x016f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object E7jCp8Ls(wg wgVar) {
        ix ixVar;
        Object obj;
        int i;
        cx cxVar;
        ArrayList arrayList;
        int intValue;
        int i2;
        int i3;
        if (wgVar instanceof ix) {
            ixVar = (ix) wgVar;
            int i4 = ixVar.uFEq9NpZ;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                ixVar.uFEq9NpZ = i4 - Integer.MIN_VALUE;
                obj = ixVar.E7jCp8Ls;
                i = ixVar.uFEq9NpZ;
                kc1 kc1Var = kc1.GWasM1elztuh;
                Object obj2 = qh.OOA6hdeuvCS;
                if (i != 0) {
                    o50.A1EKNP6CxJ(obj);
                    cx cxVar2 = (cx) OOA6hdeuvCS();
                    boolean Yi7zF1RB1 = cxVar2.Yi7zF1RB1();
                    List list = cxVar2.mOu10nynGul;
                    if (Yi7zF1RB1) {
                        x20 k8h8IjolWQ = fb1.k8h8IjolWQ(list);
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = k8h8IjolWQ.iterator();
                        while (((w20) it).AvO7iQsrTN) {
                            Object next = ((q20) it).next();
                            int intValue2 = ((Number) next).intValue();
                            if (((Number) list.get(intValue2)).intValue() != ((Number) this.JFJ3QoxA.get(intValue2)).intValue()) {
                                arrayList2.add(next);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            bc1 cwVar = new cw(sw.EljAMC1QTz);
                            ixVar.encWxUiV2 = null;
                            ixVar.mOu10nynGul = null;
                            ixVar.uFEq9NpZ = 1;
                            if (AvO7iQsrTN(cwVar, ixVar) == obj2) {
                            }
                        } else {
                            ixVar.encWxUiV2 = cxVar2;
                            ixVar.mOu10nynGul = arrayList2;
                            ixVar.uFEq9NpZ = 2;
                            Object Yi7zF1RB12 = this.AvO7iQsrTN.Yi7zF1RB1(ixVar);
                            if (Yi7zF1RB12 != obj2) {
                                cxVar = cxVar2;
                                obj = Yi7zF1RB12;
                                arrayList = arrayList2;
                            }
                        }
                    }
                }
                if (i == 1) {
                    o50.A1EKNP6CxJ(obj);
                    return kc1Var;
                }
                if (i != 2) {
                    if (i == 3) {
                        o50.A1EKNP6CxJ(obj);
                        return kc1Var;
                    }
                    if (i != 4) {
                        if (i == 5) {
                            o50.A1EKNP6CxJ(obj);
                            return kc1Var;
                        }
                        o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = ixVar.rQPn8YBR;
                    intValue = ixVar.JFJ3QoxA;
                    o50.A1EKNP6CxJ(obj);
                    i2 = i3;
                    ixVar.encWxUiV2 = null;
                    ixVar.mOu10nynGul = null;
                    ixVar.JFJ3QoxA = intValue;
                    ixVar.rQPn8YBR = i2;
                    ixVar.uFEq9NpZ = 5;
                    return mOu10nynGul(ixVar) != obj2 ? obj2 : kc1Var;
                }
                arrayList = ixVar.mOu10nynGul;
                cxVar = ixVar.encWxUiV2;
                o50.A1EKNP6CxJ(obj);
                if (((Boolean) obj).booleanValue()) {
                    bc1 cwVar2 = new cw(sw.OOA6hdeuvCS);
                    ixVar.encWxUiV2 = null;
                    ixVar.mOu10nynGul = null;
                    ixVar.uFEq9NpZ = 3;
                    if (AvO7iQsrTN(cwVar2, ixVar) == obj2) {
                    }
                } else {
                    ozMwhSAI ozmwhsai = ts0.OOA6hdeuvCS;
                    intValue = ((Number) arrayList.get(ts0.OOA6hdeuvCS.OOA6hdeuvCS().nextInt(arrayList.size()))).intValue();
                    int turnsTo = ConduitKt.turnsTo(((Number) cxVar.mOu10nynGul.get(intValue)).intValue(), ((Number) this.JFJ3QoxA.get(intValue)).intValue());
                    i2 = turnsTo >= 1 ? turnsTo : 1;
                    encWxUiV2(new dx(i2, intValue));
                    if (cxVar.WIEu4Ya2g8.getHapticsEnabled()) {
                        bc1 yvVar = new yv(gz.EljAMC1QTz);
                        ixVar.encWxUiV2 = null;
                        ixVar.mOu10nynGul = null;
                        ixVar.JFJ3QoxA = intValue;
                        ixVar.rQPn8YBR = i2;
                        ixVar.uFEq9NpZ = 4;
                        if (AvO7iQsrTN(yvVar, ixVar) != obj2) {
                            i3 = i2;
                            i2 = i3;
                        }
                    }
                    ixVar.encWxUiV2 = null;
                    ixVar.mOu10nynGul = null;
                    ixVar.JFJ3QoxA = intValue;
                    ixVar.rQPn8YBR = i2;
                    ixVar.uFEq9NpZ = 5;
                    if (mOu10nynGul(ixVar) != obj2) {
                    }
                }
            }
        }
        ixVar = new ix(this, wgVar);
        obj = ixVar.E7jCp8Ls;
        i = ixVar.uFEq9NpZ;
        kc1 kc1Var2 = kc1.GWasM1elztuh;
        Object obj22 = qh.OOA6hdeuvCS;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    @Override // defpackage.ch0
    public final Object EljAMC1QTz(cc1 cc1Var, xqGvceK5x xqgvcek5x) {
        Object value;
        cx cxVar;
        Object value2;
        cx cxVar2;
        Object value3;
        cx cxVar3;
        Object AvO7iQsrTN;
        rw rwVar = (rw) cc1Var;
        boolean z = rwVar instanceof gw;
        kc1 kc1Var = kc1.GWasM1elztuh;
        if (z) {
            JFJ3QoxA(((gw) rwVar).GWasM1elztuh);
            return kc1Var;
        }
        boolean z2 = rwVar instanceof ow;
        qh qhVar = qh.OOA6hdeuvCS;
        if (z2) {
            Object rQPn8YBR = rQPn8YBR(((ow) rwVar).GWasM1elztuh, xqgvcek5x);
            if (rQPn8YBR == qhVar) {
                return rQPn8YBR;
            }
        } else if (o30.rQPn8YBR(rwVar, lw.GWasM1elztuh)) {
            Object E7jCp8Ls = E7jCp8Ls(xqgvcek5x);
            if (E7jCp8Ls == qhVar) {
                return E7jCp8Ls;
            }
        } else {
            if (o30.rQPn8YBR(rwVar, kw.GWasM1elztuh)) {
                JFJ3QoxA(((cx) OOA6hdeuvCS()).Yi7zF1RB1);
                return kc1Var;
            }
            if (o30.rQPn8YBR(rwVar, ew.GWasM1elztuh)) {
                Object AvO7iQsrTN2 = AvO7iQsrTN(zv.GWasM1elztuh, xqgvcek5x);
                if (AvO7iQsrTN2 == qhVar) {
                    return AvO7iQsrTN2;
                }
            } else if (o30.rQPn8YBR(rwVar, hw.GWasM1elztuh)) {
                Object AvO7iQsrTN3 = AvO7iQsrTN(bw.GWasM1elztuh, xqgvcek5x);
                if (AvO7iQsrTN3 == qhVar) {
                    return AvO7iQsrTN3;
                }
            } else {
                if (o30.rQPn8YBR(rwVar, jw.GWasM1elztuh)) {
                    JFJ3QoxA(((cx) OOA6hdeuvCS()).Yi7zF1RB1);
                    return kc1Var;
                }
                if (o30.rQPn8YBR(rwVar, iw.GWasM1elztuh)) {
                    int i = ((cx) OOA6hdeuvCS()).Yi7zF1RB1 + 1;
                    if (i <= h90.Yi7zF1RB1 - 1 && (AvO7iQsrTN = AvO7iQsrTN(new aw(i), xqgvcek5x)) == qhVar) {
                        return AvO7iQsrTN;
                    }
                } else {
                    boolean z3 = rwVar instanceof nw;
                    p51 p51Var = this.Yi7zF1RB1;
                    if (z3) {
                        if (((cx) OOA6hdeuvCS()).Yi7zF1RB1()) {
                            do {
                                value3 = p51Var.getValue();
                                cxVar3 = (cx) value3;
                                cxVar3.getClass();
                            } while (!p51Var.encWxUiV2(value3, cx.GWasM1elztuh(cxVar3, null, 0, 0, null, 0, 0, null, null, null, null, 0, 0, 0, cxVar3.uFEq9NpZ + ((nw) rwVar).GWasM1elztuh, 0, null, null, 0, 253951)));
                        }
                    } else {
                        if (o30.rQPn8YBR(rwVar, pw.GWasM1elztuh)) {
                            XnEVoBF0td1l();
                            return kc1Var;
                        }
                        if (o30.rQPn8YBR(rwVar, qw.GWasM1elztuh)) {
                            if (((cx) OOA6hdeuvCS()).Yi7zF1RB1()) {
                                XnEVoBF0td1l();
                                this.mOu10nynGul = fb1.MZhzXH72(rj0.arNh8D4Z5gB(this), null, new jx(this, null), 3);
                                return kc1Var;
                            }
                        } else if (rwVar instanceof fw) {
                            do {
                                value2 = p51Var.getValue();
                                cxVar2 = (cx) value2;
                                cxVar2.getClass();
                            } while (!p51Var.encWxUiV2(value2, cx.GWasM1elztuh(cxVar2, null, 0, 0, null, 0, 0, null, null, null, null, 0, 0, 0, 0L, ((fw) rwVar).GWasM1elztuh, null, null, 0, 245759)));
                        } else {
                            if (!(rwVar instanceof mw)) {
                                o4.xqGvceK5x();
                                return null;
                            }
                            do {
                                value = p51Var.getValue();
                                cxVar = (cx) value;
                                cxVar.getClass();
                            } while (!p51Var.encWxUiV2(value, cx.GWasM1elztuh(cxVar, null, 0, 0, null, 0, 0, null, null, null, null, 0, 0, 0, 0L, 0, ((mw) rwVar).GWasM1elztuh, null, 0, 229375)));
                        }
                    }
                }
            }
        }
        return kc1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x01d5, code lost:
    
        r2 = defpackage.fb1.k8h8IjolWQ(r11).iterator();
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01e3, code lost:
    
        if (((defpackage.w20) r2).AvO7iQsrTN == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01e5, code lost:
    
        r3 = ((defpackage.q20) r2).nextInt();
        r4 = com.combinations.level.experts.core.domain.model.ConduitKt.turnsTo(((java.lang.Number) r10.get(r3)).intValue(), ((java.lang.Number) r11.get(r3)).intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0204, code lost:
    
        if (r4 >= 0) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0206, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0207, code lost:
    
        r13 = r13 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0209, code lost:
    
        r7 = new com.combinations.level.experts.core.domain.model.Puzzle(r8, r9, r10, r11, r12, r13);
        r22.JFJ3QoxA = r7.getSolution();
        encWxUiV2(new defpackage.X1lG3V04pd(r22, r1, r7));
        XnEVoBF0td1l();
        r3 = r18;
        r22.mOu10nynGul = defpackage.fb1.MZhzXH72(defpackage.rj0.arNh8D4Z5gB(r22), r3, new defpackage.jx(r22, r3), r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0232, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v23, types: [gh, vg] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void JFJ3QoxA(int i) {
        Object obj;
        boolean z;
        ArrayList arrayList;
        XnEVoBF0td1l();
        LevelSpec Yi7zF1RB1 = h90.Yi7zF1RB1(i);
        int width = Yi7zF1RB1.getWidth();
        int height = Yi7zF1RB1.getHeight();
        long seed = Yi7zF1RB1.getSeed();
        int i2 = 3;
        int i3 = width < 3 ? 3 : width;
        int i4 = height < 3 ? 3 : height;
        ji1 ji1Var = new ji1((int) seed, (int) (seed >> 32));
        boolean z2 = true;
        int xqGvceK5x = ((i4 <= 2 ? i4 / 2 : ji1Var.xqGvceK5x(1, i4 - 1)) * i3) + (i3 <= 2 ? i3 / 2 : ji1Var.xqGvceK5x(1, i3 - 1));
        int i5 = i3 * i4;
        int[] iArr = new int[i5];
        boolean[] zArr = new boolean[i5];
        v4 v4Var = new v4();
        zArr[xqGvceK5x] = true;
        v4Var.addLast(Integer.valueOf(xqGvceK5x));
        while (!v4Var.isEmpty()) {
            int intValue = ((Number) v4Var.last()).intValue();
            int i6 = intValue % i3;
            int i7 = intValue / i3;
            int[] entries = Side.INSTANCE.getEntries();
            int i8 = i2;
            ArrayList arrayList2 = new ArrayList();
            boolean z3 = z2;
            int length = entries.length;
            int i9 = 0;
            while (i9 < length) {
                boolean[] zArr2 = zArr;
                int i10 = entries[i9];
                int i11 = length;
                Side side = Side.INSTANCE;
                int[] iArr2 = iArr;
                int dx = side.dx(i10) + i6;
                int dy = side.dy(i10) + i7;
                if (dx >= 0 && dx < i3 && dy >= 0 && dy < i4 && !zArr2[(dy * i3) + dx]) {
                    arrayList2.add(Integer.valueOf(i10));
                }
                i9++;
                zArr = zArr2;
                length = i11;
                iArr = iArr2;
            }
            boolean[] zArr3 = zArr;
            int[] iArr3 = iArr;
            if (arrayList2.isEmpty()) {
                v4Var.removeLast();
            } else {
                int intValue2 = ((Number) arrayList2.get(ji1Var.xqGvceK5x(0, arrayList2.size()))).intValue();
                Side side2 = Side.INSTANCE;
                int dx2 = side2.dx(intValue2) + i6 + ((side2.dy(intValue2) + i7) * i3);
                iArr3[intValue] = iArr3[intValue] | intValue2;
                iArr3[dx2] = side2.opposite(intValue2) | iArr3[dx2];
                zArr3[dx2] = z3;
                v4Var.addLast(Integer.valueOf(dx2));
            }
            i2 = i8;
            z2 = z3;
            zArr = zArr3;
            iArr = iArr3;
        }
        boolean z4 = z2;
        int i12 = i2;
        List Qd9Q8OZgvOo4 = d5.Qd9Q8OZgvOo4(iArr);
        int size = (Qd9Q8OZgvOo4.size() * 3) / 5;
        int i13 = -1;
        ?? r6 = Qd9Q8OZgvOo4;
        int i14 = 0;
        while (true) {
            if (i14 < 64) {
                arrayList = new ArrayList(sb.dcDmLGVhzWm(Qd9Q8OZgvOo4, 10));
                Iterator it = Qd9Q8OZgvOo4.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(ConduitKt.rotateCw(((Number) it.next()).intValue(), ji1Var.xqGvceK5x(0, 4))));
                }
                obj = null;
                Iterator it2 = fb1.k8h8IjolWQ(Qd9Q8OZgvOo4).iterator();
                int i15 = 0;
                while (((w20) it2).AvO7iQsrTN) {
                    int nextInt = ((q20) it2).nextInt();
                    int turnsTo = ConduitKt.turnsTo(((Number) arrayList.get(nextInt)).intValue(), ((Number) Qd9Q8OZgvOo4.get(nextInt)).intValue());
                    if (turnsTo < 0) {
                        turnsTo = 0;
                    }
                    i15 += turnsTo;
                }
                if (i15 > i13) {
                    r6 = arrayList;
                    i13 = i15;
                }
                if (i15 >= size) {
                    break;
                }
                i14++;
                r6 = r6;
            } else {
                obj = null;
                if (i13 <= 0) {
                    r6 = new ArrayList(sb.dcDmLGVhzWm(Qd9Q8OZgvOo4, 10));
                    int i16 = 0;
                    for (Object obj2 : Qd9Q8OZgvOo4) {
                        int i17 = i16 + 1;
                        if (i16 < 0) {
                            fb1.MjxSquD6Av();
                            throw null;
                        }
                        int intValue3 = ((Number) obj2).intValue();
                        if (i16 % 2 == 0) {
                            z = z4;
                            intValue3 = ConduitKt.rotateCw(intValue3, z ? 1 : 0);
                        } else {
                            z = z4;
                        }
                        r6.add(Integer.valueOf(intValue3));
                        z4 = z;
                        i16 = i17;
                    }
                }
                arrayList = r6;
            }
        }
    }

    public final void XnEVoBF0td1l() {
        f51 f51Var = this.mOu10nynGul;
        if (f51Var != null) {
            f51Var.GWasM1elztuh(null);
        }
        this.mOu10nynGul = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mOu10nynGul(wg wgVar) {
        gx gxVar;
        int i;
        Object obj;
        boolean z;
        final int i2;
        final cx cxVar;
        int i3;
        int i4;
        Object JFJ3QoxA;
        cx cxVar2;
        int i5;
        int i6;
        if (wgVar instanceof gx) {
            gxVar = (gx) wgVar;
            int i7 = gxVar.XnEVoBF0td1l;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                gxVar.XnEVoBF0td1l = i7 - Integer.MIN_VALUE;
                Object obj2 = gxVar.rQPn8YBR;
                i = gxVar.XnEVoBF0td1l;
                obj = qh.OOA6hdeuvCS;
                lj ljVar = this.AvO7iQsrTN;
                Object obj3 = kc1.GWasM1elztuh;
                if (i != 0) {
                    o50.A1EKNP6CxJ(obj2);
                    cx cxVar3 = (cx) OOA6hdeuvCS();
                    if (cxVar3.GWasM1elztuh == tw.EljAMC1QTz) {
                        int i8 = cxVar3.OOA6hdeuvCS;
                        int i9 = cxVar3.EljAMC1QTz;
                        List list = cxVar3.mOu10nynGul;
                        int i10 = cxVar3.rQPn8YBR;
                        list.getClass();
                        int size = list.size();
                        int i11 = 0;
                        loop0: while (true) {
                            if (i11 < size) {
                                int intValue = ((Number) list.get(i11)).intValue();
                                int[] entries = Side.INSTANCE.getEntries();
                                int length = entries.length;
                                int i12 = 0;
                                while (i12 < length) {
                                    int i13 = length;
                                    int i14 = entries[i12];
                                    if (ConduitKt.hasSide(intValue, i14)) {
                                        i4 = i12;
                                        int WIEu4Ya2g8 = n4.WIEu4Ya2g8(i8, i9, i11, i14);
                                        if (WIEu4Ya2g8 < 0) {
                                            break loop0;
                                        }
                                        i3 = i11;
                                        if (!ConduitKt.hasSide(((Number) list.get(WIEu4Ya2g8)).intValue(), Side.INSTANCE.opposite(i14))) {
                                            break loop0;
                                        }
                                    } else {
                                        i3 = i11;
                                        i4 = i12;
                                    }
                                    i12 = i4 + 1;
                                    length = i13;
                                    i11 = i3;
                                }
                                i11++;
                            } else {
                                for (boolean z2 : n4.YmKjaVtbfp5Z(i8, i9, list, i10)) {
                                    if (!z2) {
                                        break;
                                    }
                                }
                                XnEVoBF0td1l();
                                int i15 = cxVar3.XnEVoBF0td1l;
                                int i16 = cxVar3.E7jCp8Ls;
                                if (i16 < 1) {
                                    i16 = 1;
                                }
                                int i17 = i15 <= i16 ? 3 : i15 <= vc0.MZhzXH72(((float) i16) * 1.6f) ? 2 : 1;
                                jj jjVar = ljVar.Yi7zF1RB1;
                                gxVar.encWxUiV2 = cxVar3;
                                gxVar.mOu10nynGul = i17;
                                z = true;
                                gxVar.XnEVoBF0td1l = 1;
                                Object cilMamHF = rj0.cilMamHF(jjVar, gxVar);
                                if (cilMamHF != obj) {
                                    i2 = i17;
                                    cxVar = cxVar3;
                                    obj2 = cilMamHF;
                                }
                            }
                        }
                    }
                    return obj3;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            o50.A1EKNP6CxJ(obj2);
                            return obj3;
                        }
                        o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i6 = gxVar.JFJ3QoxA;
                    i5 = gxVar.mOu10nynGul;
                    cxVar2 = gxVar.encWxUiV2;
                    o50.A1EKNP6CxJ(obj2);
                    if (cxVar2.WIEu4Ya2g8.getHapticsEnabled()) {
                        bc1 yvVar = new yv(gz.AvO7iQsrTN);
                        gxVar.encWxUiV2 = null;
                        gxVar.mOu10nynGul = i5;
                        gxVar.JFJ3QoxA = i6;
                        gxVar.XnEVoBF0td1l = 3;
                        if (AvO7iQsrTN(yvVar, gxVar) == obj) {
                            return obj;
                        }
                    }
                    return obj3;
                }
                int i18 = gxVar.mOu10nynGul;
                cx cxVar4 = gxVar.encWxUiV2;
                o50.A1EKNP6CxJ(obj2);
                z = true;
                i2 = i18;
                cxVar = cxVar4;
                LevelResult resultFor = ((GameProgress) obj2).resultFor(cxVar.Yi7zF1RB1);
                final ?? r1 = (resultFor != null || cxVar.XnEVoBF0td1l < resultFor.getBestMoves() || i2 > resultFor.getStars()) ? z : 0;
                List list2 = h90.GWasM1elztuh;
                final Sector GWasM1elztuh = h90.GWasM1elztuh(cxVar.Yi7zF1RB1);
                encWxUiV2(new hv() { // from class: ex
                    @Override // defpackage.hv
                    public final Object mOu10nynGul(Object obj4) {
                        boolean z3;
                        cx cxVar5 = (cx) obj4;
                        cxVar5.getClass();
                        cx cxVar6 = cxVar;
                        int i19 = cxVar6.XnEVoBF0td1l;
                        int i20 = cxVar6.E7jCp8Ls;
                        long j = cxVar6.uFEq9NpZ;
                        int i21 = cxVar6.Yi7zF1RB1;
                        boolean z4 = true;
                        if (i21 >= h90.Yi7zF1RB1 - 1) {
                            z3 = true;
                        } else {
                            z3 = true;
                            z4 = false;
                        }
                        return cx.GWasM1elztuh(cxVar5, tw.AvO7iQsrTN, 0, 0, null, 0, 0, null, null, null, null, 0, 0, 0, 0L, 0, null, new pf1(i2, i19, i20, j, r1, z4, i21 == GWasM1elztuh.getLastLevel() ? z3 : false), 0, 196606);
                    }
                });
                int i19 = cxVar.Yi7zF1RB1;
                int i20 = cxVar.XnEVoBF0td1l;
                long j = cxVar.uFEq9NpZ;
                gxVar.encWxUiV2 = cxVar;
                gxVar.mOu10nynGul = i2;
                gxVar.JFJ3QoxA = r1;
                gxVar.XnEVoBF0td1l = 2;
                JFJ3QoxA = w60.JFJ3QoxA(ljVar.GWasM1elztuh, new gj(ljVar, i19, i2, i20, j, null), gxVar);
                if (JFJ3QoxA != obj) {
                    JFJ3QoxA = obj3;
                }
                if (JFJ3QoxA != obj) {
                    cxVar2 = cxVar;
                    i5 = i2;
                    i6 = r1;
                    if (cxVar2.WIEu4Ya2g8.getHapticsEnabled()) {
                    }
                    return obj3;
                }
                return obj;
            }
        }
        gxVar = new gx(this, wgVar);
        Object obj22 = gxVar.rQPn8YBR;
        i = gxVar.XnEVoBF0td1l;
        obj = qh.OOA6hdeuvCS;
        lj ljVar2 = this.AvO7iQsrTN;
        Object obj32 = kc1.GWasM1elztuh;
        if (i != 0) {
        }
        LevelResult resultFor2 = ((GameProgress) obj22).resultFor(cxVar.Yi7zF1RB1);
        if (resultFor2 != null) {
        }
        List list22 = h90.GWasM1elztuh;
        final Sector GWasM1elztuh2 = h90.GWasM1elztuh(cxVar.Yi7zF1RB1);
        encWxUiV2(new hv() { // from class: ex
            @Override // defpackage.hv
            public final Object mOu10nynGul(Object obj4) {
                boolean z3;
                cx cxVar5 = (cx) obj4;
                cxVar5.getClass();
                cx cxVar6 = cxVar;
                int i192 = cxVar6.XnEVoBF0td1l;
                int i202 = cxVar6.E7jCp8Ls;
                long j2 = cxVar6.uFEq9NpZ;
                int i21 = cxVar6.Yi7zF1RB1;
                boolean z4 = true;
                if (i21 >= h90.Yi7zF1RB1 - 1) {
                    z3 = true;
                } else {
                    z3 = true;
                    z4 = false;
                }
                return cx.GWasM1elztuh(cxVar5, tw.AvO7iQsrTN, 0, 0, null, 0, 0, null, null, null, null, 0, 0, 0, 0L, 0, null, new pf1(i2, i192, i202, j2, r1, z4, i21 == GWasM1elztuh2.getLastLevel() ? z3 : false), 0, 196606);
            }
        });
        int i192 = cxVar.Yi7zF1RB1;
        int i202 = cxVar.XnEVoBF0td1l;
        long j2 = cxVar.uFEq9NpZ;
        gxVar.encWxUiV2 = cxVar;
        gxVar.mOu10nynGul = i2;
        gxVar.JFJ3QoxA = r1;
        gxVar.XnEVoBF0td1l = 2;
        JFJ3QoxA = w60.JFJ3QoxA(ljVar2.GWasM1elztuh, new gj(ljVar2, i192, i2, i202, j2, null), gxVar);
        if (JFJ3QoxA != obj) {
        }
        if (JFJ3QoxA != obj) {
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
    
        if (AvO7iQsrTN(r9, r0) == r5) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object rQPn8YBR(int i, wg wgVar) {
        hx hxVar;
        int i2;
        if (wgVar instanceof hx) {
            hxVar = (hx) wgVar;
            int i3 = hxVar.rQPn8YBR;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hxVar.rQPn8YBR = i3 - Integer.MIN_VALUE;
                Object obj = hxVar.mOu10nynGul;
                i2 = hxVar.rQPn8YBR;
                kc1 kc1Var = kc1.GWasM1elztuh;
                int i4 = 1;
                Object obj2 = qh.OOA6hdeuvCS;
                if (i2 != 0) {
                    o50.A1EKNP6CxJ(obj);
                    cx cxVar = (cx) OOA6hdeuvCS();
                    if (cxVar.Yi7zF1RB1() && i >= 0 && i < cxVar.mOu10nynGul.size()) {
                        encWxUiV2(new dx(i4, i));
                        if (((cx) OOA6hdeuvCS()).GWasM1elztuh == tw.EljAMC1QTz && cxVar.WIEu4Ya2g8.getHapticsEnabled()) {
                            bc1 yvVar = new yv(gz.OOA6hdeuvCS);
                            hxVar.encWxUiV2 = i;
                            hxVar.rQPn8YBR = 1;
                        }
                    }
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        o50.A1EKNP6CxJ(obj);
                        return kc1Var;
                    }
                    o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = hxVar.encWxUiV2;
                o50.A1EKNP6CxJ(obj);
                hxVar.encWxUiV2 = i;
                hxVar.rQPn8YBR = 2;
                return mOu10nynGul(hxVar) != obj2 ? obj2 : kc1Var;
            }
        }
        hxVar = new hx(this, wgVar);
        Object obj3 = hxVar.mOu10nynGul;
        i2 = hxVar.rQPn8YBR;
        kc1 kc1Var2 = kc1.GWasM1elztuh;
        int i42 = 1;
        Object obj22 = qh.OOA6hdeuvCS;
        if (i2 != 0) {
        }
        hxVar.encWxUiV2 = i;
        hxVar.rQPn8YBR = 2;
        if (mOu10nynGul(hxVar) != obj22) {
        }
    }

    @Override // defpackage.ch0, defpackage.we1
    public final void xqGvceK5x() {
        XnEVoBF0td1l();
        super.xqGvceK5x();
    }
}
