package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class cj extends d71 implements hv {
    public Object E7jCp8Ls;
    public int JFJ3QoxA;
    public Object XnEVoBF0td1l;
    public final /* synthetic */ int mOu10nynGul = 1;
    public final /* synthetic */ Object rQPn8YBR;
    public final /* synthetic */ Object uFEq9NpZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj(rt0 rt0Var, fj fjVar, pt0 pt0Var, vg vgVar) {
        super(1, vgVar);
        this.XnEVoBF0td1l = rt0Var;
        this.rQPn8YBR = fjVar;
        this.uFEq9NpZ = pt0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x014e, code lost:
    
        if (r12 != r6) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c3  */
    @Override // defpackage.h6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WIEu4Ya2g8(Object obj) {
        rt0 rt0Var;
        pt0 pt0Var;
        bi biVar;
        Object obj2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        Object obj3 = this.uFEq9NpZ;
        qh qhVar = qh.OOA6hdeuvCS;
        Object obj4 = this.rQPn8YBR;
        vg vgVar = null;
        switch (i) {
            case 0:
                pt0 pt0Var2 = (pt0) obj3;
                rt0 rt0Var2 = (rt0) this.XnEVoBF0td1l;
                fj fjVar = (fj) obj4;
                int i2 = this.JFJ3QoxA;
                try {
                } catch (uh unused) {
                    Object obj5 = rt0Var2.OOA6hdeuvCS;
                    this.E7jCp8Ls = pt0Var2;
                    this.JFJ3QoxA = 3;
                    obj = fjVar.rQPn8YBR(obj5, true, this);
                    break;
                }
                if (i2 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    this.E7jCp8Ls = rt0Var2;
                    this.JFJ3QoxA = 1;
                    obj = fjVar.JFJ3QoxA(this);
                    if (obj == qhVar) {
                        return qhVar;
                    }
                    rt0Var = rt0Var2;
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            pt0Var = (pt0) ((Serializable) this.E7jCp8Ls);
                            o50.A1EKNP6CxJ(obj);
                            pt0Var.OOA6hdeuvCS = ((Number) obj).intValue();
                            return kc1Var;
                        }
                        if (i2 != 3) {
                            o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        pt0Var2 = (pt0) ((Serializable) this.E7jCp8Ls);
                        o50.A1EKNP6CxJ(obj);
                        pt0Var2.OOA6hdeuvCS = ((Number) obj).intValue();
                        return kc1Var;
                    }
                    rt0Var = (rt0) ((Serializable) this.E7jCp8Ls);
                    o50.A1EKNP6CxJ(obj);
                }
                rt0Var.OOA6hdeuvCS = obj;
                r21 mOu10nynGul = fjVar.mOu10nynGul();
                this.E7jCp8Ls = pt0Var2;
                this.JFJ3QoxA = 2;
                obj = mOu10nynGul.GWasM1elztuh();
                if (obj == qhVar) {
                    return qhVar;
                }
                pt0Var = pt0Var2;
                pt0Var.OOA6hdeuvCS = ((Number) obj).intValue();
                return kc1Var;
            case 1:
                fj fjVar2 = (fj) obj4;
                int i3 = this.JFJ3QoxA;
                if (i3 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    this.JFJ3QoxA = 1;
                    obj = fj.encWxUiV2(fjVar2, true, this);
                    if (obj == qhVar) {
                        return qhVar;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Object obj6 = this.E7jCp8Ls;
                            o50.A1EKNP6CxJ(obj);
                            return obj6;
                        }
                        biVar = (bi) this.E7jCp8Ls;
                        o50.A1EKNP6CxJ(obj);
                        obj2 = biVar.Yi7zF1RB1;
                        if ((obj2 == null ? obj2.hashCode() : 0) == biVar.X1lG3V04pd) {
                            o4.jivtDDk9H("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                            return null;
                        }
                        if (!o30.rQPn8YBR(biVar.Yi7zF1RB1, obj)) {
                            this.E7jCp8Ls = obj;
                            this.JFJ3QoxA = 3;
                            if (fjVar2.rQPn8YBR(obj, true, this) == qhVar) {
                                return qhVar;
                            }
                        }
                        return obj;
                    }
                    o50.A1EKNP6CxJ(obj);
                }
                biVar = (bi) obj;
                gh ghVar = (gh) this.XnEVoBF0td1l;
                xqGvceK5x xqgvcek5x = new xqGvceK5x((lv) obj3, biVar, vgVar, 11);
                this.E7jCp8Ls = biVar;
                this.JFJ3QoxA = 2;
                obj = fb1.ES6ysExf(ghVar, xqgvcek5x, this);
                if (obj == qhVar) {
                    return qhVar;
                }
                obj2 = biVar.Yi7zF1RB1;
                if ((obj2 == null ? obj2.hashCode() : 0) == biVar.X1lG3V04pd) {
                }
            default:
                File file = ((rr) obj4).GWasM1elztuh;
                int i4 = this.JFJ3QoxA;
                if (i4 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    try {
                        fileOutputStream = new FileOutputStream(file);
                        try {
                            fc1 fc1Var = new fc1(fileOutputStream);
                            this.E7jCp8Ls = fileOutputStream;
                            this.XnEVoBF0td1l = fileOutputStream;
                            this.JFJ3QoxA = 1;
                            b9xEq24R1.JFJ3QoxA(obj3, fc1Var);
                            if (kc1Var == qhVar) {
                                return qhVar;
                            }
                            fileOutputStream2 = fileOutputStream;
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream2 = fileOutputStream;
                            throw th;
                        }
                    } catch (Exception e) {
                        if (e instanceof FileNotFoundException) {
                            throw ki1.VeqTn1PQw7(file.getParent(), (FileNotFoundException) e);
                        }
                        throw e;
                    }
                } else {
                    if (i4 != 1) {
                        o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fileOutputStream = (FileOutputStream) this.XnEVoBF0td1l;
                    fileOutputStream2 = (FileOutputStream) this.E7jCp8Ls;
                    try {
                        o50.A1EKNP6CxJ(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            o30.E7jCp8Ls(fileOutputStream2, th);
                            throw th3;
                        }
                    }
                }
                fileOutputStream.getFD().sync();
                o30.E7jCp8Ls(fileOutputStream2, null);
                return kc1Var;
        }
    }

    @Override // defpackage.hv
    public final Object mOu10nynGul(Object obj) {
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        Object obj2 = this.uFEq9NpZ;
        Object obj3 = this.rQPn8YBR;
        vg vgVar = (vg) obj;
        switch (i) {
            case 0:
                return new cj((rt0) this.XnEVoBF0td1l, (fj) obj3, (pt0) obj2, vgVar).WIEu4Ya2g8(kc1Var);
            case 1:
                return new cj((fj) obj3, (gh) this.XnEVoBF0td1l, (lv) obj2, vgVar).WIEu4Ya2g8(kc1Var);
            default:
                return new cj((rr) obj3, obj2, vgVar).WIEu4Ya2g8(kc1Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj(rr rrVar, Object obj, vg vgVar) {
        super(1, vgVar);
        this.rQPn8YBR = rrVar;
        this.uFEq9NpZ = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj(fj fjVar, gh ghVar, lv lvVar, vg vgVar) {
        super(1, vgVar);
        this.rQPn8YBR = fjVar;
        this.XnEVoBF0td1l = ghVar;
        this.uFEq9NpZ = lvVar;
    }
}
