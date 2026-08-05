package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class dh implements yg {
    public final Object MdtA4re8;
    public final /* synthetic */ int NCTxEWno = 0;
    public final ll VgvYg0wo;
    public final Object wxUZMvaN;

    public dh(yg ygVar, l9 l9Var) {
        this.wxUZMvaN = l9Var;
        this.MdtA4re8 = w30.ZyZthT5G(l9Var);
        this.VgvYg0wo = new y7(ygVar, null, 9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d9, code lost:
    
        if (r2 == r9) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b9  */
    @Override // defpackage.yg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OnDfzHZD(Object obj, g9 g9Var) {
        ch chVar;
        Object obj2;
        int i;
        mh mhVar;
        Object obj3;
        int i2;
        yg ygVar;
        dh dhVar = this;
        Object obj4 = obj;
        int i3 = dhVar.NCTxEWno;
        xe0 xe0Var = xe0.qoPGr6Ce;
        u9 u9Var = u9.NCTxEWno;
        ll llVar = dhVar.VgvYg0wo;
        Object obj5 = dhVar.MdtA4re8;
        Object obj6 = dhVar.wxUZMvaN;
        switch (i3) {
            case 0:
                if (g9Var instanceof ch) {
                    chVar = (ch) g9Var;
                    int i4 = chVar.jb9XjC4I;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        chVar.jb9XjC4I = i4 - Integer.MIN_VALUE;
                        obj2 = chVar.b2ZJblxo;
                        i = chVar.jb9XjC4I;
                        if (i != 0) {
                            fn.SgZGMMPL(obj2);
                            if (!((j20) obj6).NCTxEWno) {
                                chVar.VgvYg0wo = dhVar;
                                chVar.P7K7Inc8 = obj4;
                                chVar.jb9XjC4I = 2;
                                obj2 = ((t90) llVar).Qr9iLBAD(obj4, chVar);
                                break;
                            } else {
                                chVar.jb9XjC4I = 1;
                                if (((yg) obj5).OnDfzHZD(obj4, chVar) != u9Var) {
                                    return xe0Var;
                                }
                            }
                            return u9Var;
                        }
                        if (i != 1) {
                            if (i == 2) {
                                Object obj7 = chVar.P7K7Inc8;
                                dh dhVar2 = chVar.VgvYg0wo;
                                fn.SgZGMMPL(obj2);
                                obj4 = obj7;
                                dhVar = dhVar2;
                            } else if (i != 3) {
                                m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        }
                        fn.SgZGMMPL(obj2);
                        return xe0Var;
                        if (!((Boolean) obj2).booleanValue()) {
                            return xe0Var;
                        }
                        ((j20) dhVar.wxUZMvaN).NCTxEWno = true;
                        yg ygVar2 = (yg) dhVar.MdtA4re8;
                        chVar.VgvYg0wo = null;
                        chVar.P7K7Inc8 = null;
                        chVar.jb9XjC4I = 3;
                        if (ygVar2.OnDfzHZD(obj4, chVar) != u9Var) {
                            return xe0Var;
                        }
                        return u9Var;
                    }
                }
                chVar = new ch(dhVar, g9Var);
                obj2 = chVar.b2ZJblxo;
                i = chVar.jb9XjC4I;
                if (i != 0) {
                }
                if (!((Boolean) obj2).booleanValue()) {
                }
            case 1:
                if (g9Var instanceof mh) {
                    mhVar = (mh) g9Var;
                    int i5 = mhVar.P7K7Inc8;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        mhVar.P7K7Inc8 = i5 - Integer.MIN_VALUE;
                        obj3 = mhVar.VgvYg0wo;
                        i2 = mhVar.P7K7Inc8;
                        if (i2 != 0) {
                            fn.SgZGMMPL(obj3);
                            yg ygVar3 = (yg) obj5;
                            mhVar.b2ZJblxo = ygVar3;
                            mhVar.P7K7Inc8 = 1;
                            Object gjV1z5T1 = fn.gjV1z5T1(mhVar, (zk) llVar, (v30) obj6, true, false);
                            if (gjV1z5T1 != u9Var) {
                                ygVar = ygVar3;
                                obj3 = gjV1z5T1;
                            }
                            return u9Var;
                        }
                        if (i2 != 1) {
                            if (i2 == 2) {
                                fn.SgZGMMPL(obj3);
                                return xe0Var;
                            }
                            m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ygVar = mhVar.b2ZJblxo;
                        fn.SgZGMMPL(obj3);
                        mhVar.b2ZJblxo = null;
                        mhVar.P7K7Inc8 = 2;
                        if (ygVar.OnDfzHZD(obj3, mhVar) != u9Var) {
                            return xe0Var;
                        }
                        return u9Var;
                    }
                }
                mhVar = new mh(dhVar, g9Var);
                obj3 = mhVar.VgvYg0wo;
                i2 = mhVar.P7K7Inc8;
                if (i2 != 0) {
                }
                mhVar.b2ZJblxo = null;
                mhVar.P7K7Inc8 = 2;
                if (ygVar.OnDfzHZD(obj3, mhVar) != u9Var) {
                }
                return u9Var;
            default:
                Object hzgxAD8d = fn.hzgxAD8d((l9) obj6, obj4, obj5, (y7) llVar, g9Var);
                return hzgxAD8d == u9Var ? hzgxAD8d : xe0Var;
        }
    }

    public dh(j20 j20Var, yg ygVar, t90 t90Var) {
        this.wxUZMvaN = j20Var;
        this.MdtA4re8 = ygVar;
        this.VgvYg0wo = t90Var;
    }

    public dh(yg ygVar, v30 v30Var, zk zkVar) {
        this.MdtA4re8 = ygVar;
        this.wxUZMvaN = v30Var;
        this.VgvYg0wo = zkVar;
    }
}
