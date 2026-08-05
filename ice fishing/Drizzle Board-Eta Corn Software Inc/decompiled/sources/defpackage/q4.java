package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class q4 implements yg {
    public final /* synthetic */ l20 MdtA4re8;
    public final /* synthetic */ int NCTxEWno = 0;
    public final /* synthetic */ Object P7K7Inc8;
    public final /* synthetic */ Object VgvYg0wo;
    public final /* synthetic */ yg wxUZMvaN;

    public q4(l20 l20Var, t9 t9Var, r4 r4Var, yg ygVar) {
        this.MdtA4re8 = l20Var;
        this.VgvYg0wo = t9Var;
        this.P7K7Inc8 = r4Var;
        this.wxUZMvaN = ygVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009a, code lost:
    
        if (r9 == r6) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    @Override // defpackage.yg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OnDfzHZD(Object obj, g9 g9Var) {
        p4 p4Var;
        int i;
        u9 u9Var;
        Object obj2;
        switch (this.NCTxEWno) {
            case 0:
                if (g9Var instanceof p4) {
                    p4Var = (p4) g9Var;
                    int i2 = p4Var.jb9XjC4I;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        p4Var.jb9XjC4I = i2 - Integer.MIN_VALUE;
                        Object obj3 = p4Var.b2ZJblxo;
                        i = p4Var.jb9XjC4I;
                        xe0 xe0Var = xe0.qoPGr6Ce;
                        if (i != 0) {
                            fn.SgZGMMPL(obj3);
                            vn vnVar = (vn) this.MdtA4re8.NCTxEWno;
                            if (vnVar != null) {
                                vnVar.b2ZJblxo(new w4("Child of the scoped flow was cancelled"));
                                p4Var.VgvYg0wo = this;
                                p4Var.P7K7Inc8 = obj;
                                p4Var.jb9XjC4I = 1;
                                while (true) {
                                    Object euDDoUNr = vnVar.euDDoUNr();
                                    boolean z = euDDoUNr instanceof qm;
                                    u9Var = u9.NCTxEWno;
                                    if (!z) {
                                        l9 l9Var = p4Var.MdtA4re8;
                                        l9Var.getClass();
                                        le0.lDXGDhIF(l9Var);
                                    } else if (vnVar.ZyZthT5G(euDDoUNr) >= 0) {
                                        m3 m3Var = new m3(1, w30.SgZGMMPL(p4Var));
                                        m3Var.I5GHvsYW();
                                        m3Var.FySoLYna(new i3(2, le0.WYNAV5pd(vnVar, true, new m30(m3Var))));
                                        obj2 = m3Var.Ey6iv0m0();
                                        if (obj2 != u9Var) {
                                            obj2 = xe0Var;
                                            break;
                                        }
                                    }
                                }
                                obj2 = xe0Var;
                                if (obj2 == u9Var) {
                                    return u9Var;
                                }
                            }
                        } else {
                            if (i != 1) {
                                m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj = p4Var.P7K7Inc8;
                            this = p4Var.VgvYg0wo;
                            fn.SgZGMMPL(obj3);
                        }
                        this.MdtA4re8.NCTxEWno = fn.Ey6iv0m0((t9) this.VgvYg0wo, null, new o4((r4) this.P7K7Inc8, this.wxUZMvaN, obj, null), 1);
                        return xe0Var;
                    }
                }
                p4Var = new p4(this, g9Var);
                Object obj32 = p4Var.b2ZJblxo;
                i = p4Var.jb9XjC4I;
                xe0 xe0Var2 = xe0.qoPGr6Ce;
                if (i != 0) {
                }
                this.MdtA4re8.NCTxEWno = fn.Ey6iv0m0((t9) this.VgvYg0wo, null, new o4((r4) this.P7K7Inc8, this.wxUZMvaN, obj, null), 1);
                return xe0Var2;
            default:
                return qoPGr6Ce((int[]) obj, g9Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (r2.OnDfzHZD(r13, r1) == r7) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0093, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0091, code lost:
    
        if (r2.OnDfzHZD(r13, r1) == r7) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object qoPGr6Ce(int[] iArr, g9 g9Var) {
        be0 be0Var;
        int i;
        String[] strArr = (String[]) this.VgvYg0wo;
        if (g9Var instanceof be0) {
            be0Var = (be0) g9Var;
            int i2 = be0Var.Qr9iLBAD;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                be0Var.Qr9iLBAD = i2 - Integer.MIN_VALUE;
                Object obj = be0Var.P7K7Inc8;
                i = be0Var.Qr9iLBAD;
                l20 l20Var = this.MdtA4re8;
                if (i != 0) {
                    fn.SgZGMMPL(obj);
                    Object obj2 = l20Var.NCTxEWno;
                    yg ygVar = this.wxUZMvaN;
                    u9 u9Var = u9.NCTxEWno;
                    if (obj2 == null) {
                        Set Wi7iiXC4 = a1.Wi7iiXC4(strArr);
                        be0Var.VgvYg0wo = iArr;
                        be0Var.Qr9iLBAD = 1;
                    } else {
                        int[] iArr2 = (int[]) this.P7K7Inc8;
                        ArrayList arrayList = new ArrayList();
                        int length = strArr.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            String str = strArr[i3];
                            int i5 = i4 + 1;
                            Object obj3 = l20Var.NCTxEWno;
                            if (obj3 == null) {
                                m1.Ey6iv0m0("Required value was null.");
                                return null;
                            }
                            int i6 = iArr2[i4];
                            if (((int[]) obj3)[i6] != iArr[i6]) {
                                arrayList.add(str);
                            }
                            i3++;
                            i4 = i5;
                        }
                        if (!arrayList.isEmpty()) {
                            Set AxnhUDtd = x5.AxnhUDtd(arrayList);
                            be0Var.VgvYg0wo = iArr;
                            be0Var.Qr9iLBAD = 2;
                        }
                    }
                } else {
                    if (i != 1 && i != 2) {
                        m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    iArr = be0Var.VgvYg0wo;
                    fn.SgZGMMPL(obj);
                }
                l20Var.NCTxEWno = iArr;
                return xe0.qoPGr6Ce;
            }
        }
        be0Var = new be0(this, g9Var);
        Object obj4 = be0Var.P7K7Inc8;
        i = be0Var.Qr9iLBAD;
        l20 l20Var2 = this.MdtA4re8;
        if (i != 0) {
        }
        l20Var2.NCTxEWno = iArr;
        return xe0.qoPGr6Ce;
    }

    public q4(l20 l20Var, yg ygVar, String[] strArr, int[] iArr) {
        this.MdtA4re8 = l20Var;
        this.wxUZMvaN = ygVar;
        this.VgvYg0wo = strArr;
        this.P7K7Inc8 = iArr;
    }
}
