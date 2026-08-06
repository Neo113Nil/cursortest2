package defpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class zi extends d71 implements hv {
    public final /* synthetic */ Object E7jCp8Ls;
    public int JFJ3QoxA;
    public final /* synthetic */ int mOu10nynGul;
    public Object rQPn8YBR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zi(Object obj, vg vgVar, int i) {
        super(1, vgVar);
        this.mOu10nynGul = i;
        this.E7jCp8Ls = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.io.Closeable] */
    @Override // defpackage.h6
    public final Object WIEu4Ya2g8(Object obj) {
        Throwable th;
        l51 l51Var;
        Throwable th2;
        FileInputStream fileInputStream;
        int i = this.mOu10nynGul;
        qh qhVar = qh.OOA6hdeuvCS;
        Object obj2 = this.E7jCp8Ls;
        boolean z = true;
        switch (i) {
            case 0:
                fj fjVar = (fj) obj2;
                int i2 = this.JFJ3QoxA;
                try {
                } catch (Throwable th3) {
                    r21 mOu10nynGul = fjVar.mOu10nynGul();
                    this.rQPn8YBR = th3;
                    this.JFJ3QoxA = 2;
                    Integer GWasM1elztuh = mOu10nynGul.GWasM1elztuh();
                    if (GWasM1elztuh == qhVar) {
                        return qhVar;
                    }
                    obj = GWasM1elztuh;
                    th = th3;
                }
                if (i2 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    this.JFJ3QoxA = 1;
                    obj = fj.encWxUiV2(fjVar, true, this);
                    if (obj == qhVar) {
                        return qhVar;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = (Throwable) this.rQPn8YBR;
                        o50.A1EKNP6CxJ(obj);
                        l51Var = new vs0(th, ((Number) obj).intValue());
                        return new rn0(l51Var, Boolean.TRUE);
                    }
                    o50.A1EKNP6CxJ(obj);
                }
                l51Var = (l51) obj;
                return new rn0(l51Var, Boolean.TRUE);
            default:
                lr lrVar = (lr) obj2;
                ?? r0 = this.JFJ3QoxA;
                try {
                    try {
                        try {
                        } finally {
                        }
                    } catch (FileNotFoundException unused) {
                        if (!lrVar.GWasM1elztuh.exists()) {
                            return new eg0(z);
                        }
                        FileInputStream fileInputStream2 = new FileInputStream(lrVar.GWasM1elztuh);
                        try {
                            this.rQPn8YBR = fileInputStream2;
                            this.JFJ3QoxA = 2;
                            eg0 mOu10nynGul2 = b9xEq24R1.mOu10nynGul(fileInputStream2);
                            if (mOu10nynGul2 == qhVar) {
                                return qhVar;
                            }
                            obj = mOu10nynGul2;
                            fileInputStream = fileInputStream2;
                        } catch (Throwable th4) {
                            th2 = th4;
                            fileInputStream = fileInputStream2;
                            try {
                                throw th2;
                            } catch (Throwable th5) {
                                o30.E7jCp8Ls(fileInputStream, th2);
                                throw th5;
                            }
                        }
                    }
                    if (r0 == 0) {
                        o50.A1EKNP6CxJ(obj);
                        FileInputStream fileInputStream3 = new FileInputStream(lrVar.GWasM1elztuh);
                        this.rQPn8YBR = fileInputStream3;
                        this.JFJ3QoxA = 1;
                        obj = b9xEq24R1.mOu10nynGul(fileInputStream3);
                        r0 = fileInputStream3;
                        if (obj == qhVar) {
                            return qhVar;
                        }
                    } else {
                        if (r0 != 1) {
                            if (r0 != 2) {
                                o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            fileInputStream = (FileInputStream) this.rQPn8YBR;
                            try {
                                o50.A1EKNP6CxJ(obj);
                                o30.E7jCp8Ls(fileInputStream, null);
                                return obj;
                            } catch (Throwable th6) {
                                th2 = th6;
                                throw th2;
                            }
                        }
                        FileInputStream fileInputStream4 = (FileInputStream) this.rQPn8YBR;
                        o50.A1EKNP6CxJ(obj);
                        r0 = fileInputStream4;
                    }
                    o30.E7jCp8Ls(r0, null);
                    return obj;
                } catch (Exception e) {
                    if (e instanceof FileNotFoundException) {
                        throw ki1.VeqTn1PQw7(lrVar.GWasM1elztuh.getParent(), (FileNotFoundException) e);
                    }
                    throw e;
                }
        }
    }

    @Override // defpackage.hv
    public final Object mOu10nynGul(Object obj) {
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        Object obj2 = this.E7jCp8Ls;
        vg vgVar = (vg) obj;
        switch (i) {
            case 0:
                return new zi((fj) obj2, vgVar, 0).WIEu4Ya2g8(kc1Var);
            default:
                return new zi((lr) obj2, vgVar, 1).WIEu4Ya2g8(kc1Var);
        }
    }
}
