package defpackage;

import com.combinations.level.experts.core.domain.model.GameProgress;
import java.util.ArrayList;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ij implements ms {
    public final /* synthetic */ Object AvO7iQsrTN;
    public final /* synthetic */ Object EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public ij(zm zmVar, rt0 rt0Var, ms msVar) {
        this.OOA6hdeuvCS = 1;
        this.AvO7iQsrTN = rt0Var;
        this.EljAMC1QTz = msVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02c2  */
    @Override // defpackage.ms
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object E7jCp8Ls(Object obj, vg vgVar) {
        hj hjVar;
        int i;
        ym ymVar;
        int i2;
        ws wsVar;
        Object obj2;
        int i3;
        zs zsVar;
        Object obj3;
        int i4;
        int i5 = this.OOA6hdeuvCS;
        qh qhVar = qh.OOA6hdeuvCS;
        vg vgVar2 = null;
        Object obj4 = this.AvO7iQsrTN;
        Object obj5 = this.EljAMC1QTz;
        kc1 kc1Var = kc1.GWasM1elztuh;
        switch (i5) {
            case 0:
                if (vgVar instanceof hj) {
                    hjVar = (hj) vgVar;
                    int i6 = hjVar.mOu10nynGul;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        hjVar.mOu10nynGul = i6 - Integer.MIN_VALUE;
                        Object obj6 = hjVar.encWxUiV2;
                        i = hjVar.mOu10nynGul;
                        if (i != 0) {
                            o50.A1EKNP6CxJ(obj6);
                            GameProgress GWasM1elztuh = lj.GWasM1elztuh((lj) obj4, (eg0) obj);
                            hjVar.mOu10nynGul = 1;
                            if (((ms) obj5).E7jCp8Ls(GWasM1elztuh, hjVar) == qhVar) {
                                return qhVar;
                            }
                        } else {
                            if (i != 1) {
                                o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            o50.A1EKNP6CxJ(obj6);
                        }
                        return kc1Var;
                    }
                }
                hjVar = new hj(this, vgVar);
                Object obj62 = hjVar.encWxUiV2;
                i = hjVar.mOu10nynGul;
                if (i != 0) {
                }
                return kc1Var;
            case 1:
                rt0 rt0Var = (rt0) obj4;
                if (vgVar instanceof ym) {
                    ymVar = (ym) vgVar;
                    int i7 = ymVar.JFJ3QoxA;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        ymVar.JFJ3QoxA = i7 - Integer.MIN_VALUE;
                        Object obj7 = ymVar.encWxUiV2;
                        i2 = ymVar.JFJ3QoxA;
                        if (i2 != 0) {
                            o50.A1EKNP6CxJ(obj7);
                            Object obj8 = rt0Var.OOA6hdeuvCS;
                            if (obj8 == n30.JFJ3QoxA || !o30.rQPn8YBR(obj8, obj)) {
                                rt0Var.OOA6hdeuvCS = obj;
                                ymVar.JFJ3QoxA = 1;
                                if (((ms) obj5).E7jCp8Ls(obj, ymVar) == qhVar) {
                                    return qhVar;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            o50.A1EKNP6CxJ(obj7);
                        }
                        return kc1Var;
                    }
                }
                ymVar = new ym(this, vgVar);
                Object obj72 = ymVar.encWxUiV2;
                i2 = ymVar.JFJ3QoxA;
                if (i2 != 0) {
                }
                return kc1Var;
            case 2:
                if (vgVar instanceof ws) {
                    wsVar = (ws) vgVar;
                    int i8 = wsVar.JFJ3QoxA;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        wsVar.JFJ3QoxA = i8 - Integer.MIN_VALUE;
                        obj2 = wsVar.mOu10nynGul;
                        i3 = wsVar.JFJ3QoxA;
                        if (i3 != 0) {
                            o50.A1EKNP6CxJ(obj2);
                            wsVar.encWxUiV2 = this;
                            wsVar.E7jCp8Ls = obj;
                            wsVar.JFJ3QoxA = 1;
                            obj2 = ((ni) obj4).EljAMC1QTz(obj, wsVar);
                            if (obj2 == qhVar) {
                                return qhVar;
                            }
                        } else {
                            if (i3 != 1) {
                                if (i3 != 2) {
                                    o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                this = wsVar.encWxUiV2;
                                o50.A1EKNP6CxJ(obj2);
                                r1 = true;
                                if (r1) {
                                    return kc1Var;
                                }
                                throw new GWasM1elztuh(this);
                            }
                            obj = wsVar.E7jCp8Ls;
                            this = wsVar.encWxUiV2;
                            o50.A1EKNP6CxJ(obj2);
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            ms msVar = (ms) this.EljAMC1QTz;
                            wsVar.encWxUiV2 = this;
                            wsVar.E7jCp8Ls = null;
                            wsVar.JFJ3QoxA = 2;
                            if (msVar.E7jCp8Ls(obj, wsVar) == qhVar) {
                                return qhVar;
                            }
                            r1 = true;
                        }
                        if (r1) {
                        }
                    }
                }
                wsVar = new ws(this, vgVar);
                obj2 = wsVar.mOu10nynGul;
                i3 = wsVar.JFJ3QoxA;
                if (i3 != 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
                if (r1) {
                }
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                if (vgVar instanceof zs) {
                    zsVar = (zs) vgVar;
                    int i9 = zsVar.JFJ3QoxA;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        zsVar.JFJ3QoxA = i9 - Integer.MIN_VALUE;
                        obj3 = zsVar.mOu10nynGul;
                        i4 = zsVar.JFJ3QoxA;
                        if (i4 != 0) {
                            o50.A1EKNP6CxJ(obj3);
                            zsVar.encWxUiV2 = this;
                            zsVar.E7jCp8Ls = obj;
                            zsVar.JFJ3QoxA = 1;
                            obj3 = ((lv) obj5).EljAMC1QTz(obj, zsVar);
                            if (obj3 == qhVar) {
                                return qhVar;
                            }
                        } else {
                            if (i4 != 1) {
                                o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj = zsVar.E7jCp8Ls;
                            this = zsVar.encWxUiV2;
                            o50.A1EKNP6CxJ(obj3);
                        }
                        if (((Boolean) obj3).booleanValue()) {
                            return kc1Var;
                        }
                        ((rt0) this.AvO7iQsrTN).OOA6hdeuvCS = obj;
                        throw new GWasM1elztuh(this);
                    }
                }
                zsVar = new zs(this, vgVar);
                obj3 = zsVar.mOu10nynGul;
                i4 = zsVar.JFJ3QoxA;
                if (i4 != 0) {
                }
                if (((Boolean) obj3).booleanValue()) {
                }
            case 4:
                ((mg0) obj5).setValue(Boolean.TRUE);
                ((bo0) obj4).encWxUiV2(((w5) obj).X1lG3V04pd);
                return kc1Var;
            case 5:
                d30 d30Var = (d30) obj;
                ArrayList arrayList = (ArrayList) obj5;
                if (d30Var instanceof vr0) {
                    arrayList.add(d30Var);
                } else if (d30Var instanceof wr0) {
                    arrayList.remove(((wr0) d30Var).GWasM1elztuh);
                } else if (d30Var instanceof ur0) {
                    arrayList.remove(((ur0) d30Var).GWasM1elztuh);
                }
                ((mg0) obj4).setValue(Boolean.valueOf(!arrayList.isEmpty()));
                return kc1Var;
            case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                d30 d30Var2 = (d30) obj;
                p1 p1Var = (p1) obj5;
                if (!(d30Var2 instanceof xr0)) {
                    ph phVar = (ph) obj4;
                    ra raVar = p1Var.WdrkLMV3xh;
                    float f = 0.0f;
                    if (raVar == null) {
                        boolean z = p1Var.jivtDDk9H;
                        zk zkVar = p1Var.lv06NcmrQ;
                        raVar = new ra();
                        raVar.GWasM1elztuh = z;
                        raVar.Yi7zF1RB1 = zkVar;
                        raVar.X1lG3V04pd = qj.GWasM1elztuh(0.0f);
                        raVar.xqGvceK5x = new ArrayList();
                        p.uFEq9NpZ(p1Var);
                        p1Var.WdrkLMV3xh = raVar;
                    }
                    ArrayList arrayList2 = (ArrayList) raVar.xqGvceK5x;
                    if (d30Var2 instanceof vz) {
                        arrayList2.add(d30Var2);
                    } else if (d30Var2 instanceof wz) {
                        arrayList2.remove(((wz) d30Var2).GWasM1elztuh);
                    } else if (d30Var2 instanceof et) {
                        arrayList2.add(d30Var2);
                    } else if (d30Var2 instanceof ft) {
                        arrayList2.remove(((ft) d30Var2).GWasM1elztuh);
                    } else if (d30Var2 instanceof yn) {
                        arrayList2.add(d30Var2);
                    } else if (d30Var2 instanceof zn) {
                        arrayList2.remove(((zn) d30Var2).GWasM1elztuh);
                    } else if (d30Var2 instanceof xn) {
                        arrayList2.remove(((xn) d30Var2).GWasM1elztuh);
                    }
                    d30 d30Var3 = (d30) rb.cTIXpaxc(arrayList2);
                    if (!o30.rQPn8YBR((d30) raVar.OOA6hdeuvCS, d30Var3)) {
                        if (d30Var3 != null) {
                            ((zk) raVar.Yi7zF1RB1).GWasM1elztuh();
                            boolean z2 = d30Var3 instanceof vz;
                            if (z2) {
                                f = 0.08f;
                            } else if (d30Var3 instanceof et) {
                                f = 0.1f;
                            } else if (d30Var3 instanceof yn) {
                                f = 0.16f;
                            }
                            db1 db1Var = mv0.GWasM1elztuh;
                            if (!z2) {
                                if (d30Var3 instanceof et) {
                                    db1Var = new db1(45, 0, po.Yi7zF1RB1);
                                } else if (d30Var3 instanceof yn) {
                                    db1Var = new db1(45, 0, po.Yi7zF1RB1);
                                }
                            }
                            fb1.MZhzXH72(phVar, null, new mi0(raVar, f, db1Var, (vg) null), 3);
                        } else {
                            d30 d30Var4 = (d30) raVar.OOA6hdeuvCS;
                            db1 db1Var2 = mv0.GWasM1elztuh;
                            if (!(d30Var4 instanceof vz) && !(d30Var4 instanceof et) && (d30Var4 instanceof yn)) {
                                db1Var2 = new db1(150, 0, po.Yi7zF1RB1);
                            }
                            fb1.MZhzXH72(phVar, null, new xqGvceK5x(raVar, db1Var2, vgVar2, 25), 3);
                        }
                        raVar.OOA6hdeuvCS = d30Var3;
                    }
                } else if (p1Var.pog2g9KITJA) {
                    p1Var.gqMuANyCes((xr0) d30Var2);
                } else {
                    p1Var.M3K9sHhK.GWasM1elztuh(d30Var2);
                }
                return kc1Var;
            default:
                d30 d30Var5 = (d30) obj;
                pt0 pt0Var = (pt0) obj5;
                if (d30Var5 instanceof vr0) {
                    pt0Var.OOA6hdeuvCS++;
                } else if (d30Var5 instanceof wr0) {
                    pt0Var.OOA6hdeuvCS--;
                } else if (d30Var5 instanceof ur0) {
                    pt0Var.OOA6hdeuvCS--;
                }
                r1 = pt0Var.OOA6hdeuvCS > 0;
                o91 o91Var = (o91) obj4;
                if (o91Var.cilMamHF != r1) {
                    o91Var.cilMamHF = r1;
                    n4.XnEVoBF0td1l(o91Var);
                }
                return kc1Var;
        }
    }

    public /* synthetic */ ij(int i, Object obj, Object obj2) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = obj;
        this.AvO7iQsrTN = obj2;
    }

    public ij(ni niVar, ms msVar) {
        this.OOA6hdeuvCS = 2;
        this.AvO7iQsrTN = niVar;
        this.EljAMC1QTz = msVar;
    }
}
