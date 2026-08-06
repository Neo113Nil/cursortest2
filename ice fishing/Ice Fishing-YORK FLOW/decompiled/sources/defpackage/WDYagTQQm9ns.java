package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class WDYagTQQm9ns extends defpackage.n20 implements defpackage.y10 {
    public final /* synthetic */ int fNwYGHIYeJcR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WDYagTQQm9ns(int i, java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.fNwYGHIYeJcR = i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0096  */
    @Override // defpackage.y10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj) {
        java.lang.Object[] objArr;
        int i;
        java.lang.Object[] objArr2;
        int i2;
        defpackage.og ogVar;
        defpackage.vb0 T1fB7bDYiVJQ;
        java.lang.Integer valueOf;
        int i3 = this.fNwYGHIYeJcR;
        int i4 = 8;
        boolean z = true;
        int i5 = 0;
        defpackage.kl klVar = null;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        java.lang.Object obj2 = this.oh71FJcDz6S2;
        switch (i3) {
            case 0:
                boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
                defpackage.ve veVar = (defpackage.ve) obj2;
                defpackage.kn0 kn0Var = veVar.frSwwKIlbUhK;
                if (booleanValue) {
                    veVar.VpXebusPOq9I();
                } else {
                    if (veVar.w7APNrr0aGRc != null) {
                        java.lang.Object[] objArr3 = kn0Var.fWTAfUmVKrZq;
                        long[] jArr = kn0Var.ZpBGe2uQfcn8;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j = jArr[i6];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                                    int i8 = 0;
                                    while (i8 < i7) {
                                        if ((j & 255) < 128) {
                                            i2 = i4;
                                            objArr2 = objArr3;
                                            defpackage.ok0.zJPqDeoF0Os1(veVar.XuMcJunjB8iA(), null, new defpackage.GE9mJIPrb8gP(veVar, (defpackage.u11) objArr3[(i6 << 3) + i8], klVar, i5), 3);
                                        } else {
                                            objArr2 = objArr3;
                                            i2 = i4;
                                        }
                                        j >>= i2;
                                        i8++;
                                        i4 = i2;
                                        objArr3 = objArr2;
                                    }
                                    objArr = objArr3;
                                    i = i4;
                                    if (i7 != i) {
                                    }
                                } else {
                                    objArr = objArr3;
                                    i = i4;
                                }
                                if (i6 != length) {
                                    i6++;
                                    i4 = i;
                                    objArr3 = objArr;
                                }
                            }
                        }
                        defpackage.u11 u11Var = veVar.IBvW5fLsPuHy;
                        if (u11Var != null) {
                            defpackage.ok0.zJPqDeoF0Os1(veVar.XuMcJunjB8iA(), null, new defpackage.GE9mJIPrb8gP(veVar, u11Var, klVar, 1), 3);
                        }
                    }
                    kn0Var.ZpBGe2uQfcn8();
                    veVar.IBvW5fLsPuHy = null;
                }
                return gs1Var;
            case 1:
                com.ice.fishing.wolberta.data.local.Item item = (com.ice.fishing.wolberta.data.local.Item) obj;
                item.getClass();
                defpackage.z50 z50Var = (defpackage.z50) obj2;
                z50Var.getClass();
                defpackage.ok0.zJPqDeoF0Os1(defpackage.la0.BHfvd2J71qpO(z50Var), null, new defpackage.oh71FJcDz6S2(z50Var, item, klVar, i4), 3);
                return gs1Var;
            case 2:
                ((java.util.Set) obj).getClass();
                defpackage.wa0 wa0Var = (defpackage.wa0) obj2;
                java.util.concurrent.locks.ReentrantLock reentrantLock = wa0Var.JhCgjQRTAOCT;
                reentrantLock.lock();
                try {
                    java.util.List a6r05ZxsOP0A = defpackage.hf.a6r05ZxsOP0A(wa0Var.fWTAfUmVKrZq.values());
                    reentrantLock.unlock();
                    java.util.Iterator it = a6r05ZxsOP0A.iterator();
                    if (!it.hasNext()) {
                        return gs1Var;
                    }
                    ((defpackage.vs0) it.next()).getClass();
                    throw null;
                } catch (java.lang.Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 3:
                ((defpackage.fb0) obj2).BHfvd2J71qpO((java.lang.Throwable) obj);
                return gs1Var;
            case 4:
                java.lang.String str = (java.lang.String) obj;
                str.getClass();
                defpackage.bi0 bi0Var = (defpackage.bi0) obj2;
                bi0Var.getClass();
                bi0Var.fWTAfUmVKrZq.setValue(str);
                defpackage.gg1 gg1Var = bi0Var.JhCgjQRTAOCT;
                gg1Var.getClass();
                gg1Var.GE9mJIPrb8gP(null, str);
                return gs1Var;
            case 5:
                defpackage.mq1 mq1Var = (defpackage.mq1) obj;
                defpackage.bi0 bi0Var2 = (defpackage.bi0) obj2;
                bi0Var2.oh71FJcDz6S2.setValue(mq1Var);
                bi0Var2.WDYagTQQm9ns.e6mdH7fiFuta(mq1Var);
                return gs1Var;
            case 6:
                com.ice.fishing.wolberta.data.local.Item item2 = (com.ice.fishing.wolberta.data.local.Item) obj;
                item2.getClass();
                defpackage.bi0 bi0Var3 = (defpackage.bi0) obj2;
                bi0Var3.getClass();
                bi0Var3.QiMR8OkAhezm.setValue(item2);
                return gs1Var;
            case 7:
                com.ice.fishing.wolberta.data.local.Item item3 = (com.ice.fishing.wolberta.data.local.Item) obj;
                item3.getClass();
                defpackage.bi0 bi0Var4 = (defpackage.bi0) obj2;
                bi0Var4.getClass();
                defpackage.ok0.zJPqDeoF0Os1(defpackage.la0.BHfvd2J71qpO(bi0Var4), null, new defpackage.oh71FJcDz6S2(bi0Var4, item3, klVar, 9), 3);
                return gs1Var;
            case 8:
                defpackage.dh1 dh1Var = (defpackage.dh1) obj;
                defpackage.r71 r71Var = (defpackage.r71) obj2;
                r71Var.oh71FJcDz6S2.setValue(dh1Var);
                r71Var.fWTAfUmVKrZq.e6mdH7fiFuta(dh1Var);
                return gs1Var;
            case defpackage.n70.ZpBGe2uQfcn8 /* 9 */:
                com.ice.fishing.wolberta.data.local.Item item4 = (com.ice.fishing.wolberta.data.local.Item) obj;
                item4.getClass();
                defpackage.r71 r71Var2 = (defpackage.r71) obj2;
                r71Var2.getClass();
                r71Var2.QiMR8OkAhezm.setValue(item4);
                return gs1Var;
            case defpackage.n70.giKS3J6vZuNy /* 10 */:
                com.ice.fishing.wolberta.data.local.Item item5 = (com.ice.fishing.wolberta.data.local.Item) obj;
                item5.getClass();
                defpackage.r71 r71Var3 = (defpackage.r71) obj2;
                r71Var3.getClass();
                defpackage.ok0.zJPqDeoF0Os1(defpackage.la0.BHfvd2J71qpO(r71Var3), null, new defpackage.oh71FJcDz6S2(r71Var3, item5, klVar, 13), 3);
                return gs1Var;
            case 11:
                long j2 = ((defpackage.ws0) obj).ZpBGe2uQfcn8;
                defpackage.fk1 fk1Var = (defpackage.fk1) obj2;
                fk1Var.getClass();
                defpackage.jk1 jk1Var = (defpackage.jk1) defpackage.nq1.blKFvluuDQOf(fk1Var, defpackage.kk1.ZpBGe2uQfcn8);
                if (jk1Var != null) {
                    defpackage.ok0.zJPqDeoF0Os1(fk1Var.XuMcJunjB8iA(), null, new defpackage.QiMR8OkAhezm(fk1Var, j2, jk1Var, new defpackage.ek1(fk1Var, j2), (defpackage.kl) null), 3);
                }
                return gs1Var;
            case defpackage.n70.fWTAfUmVKrZq /* 12 */:
                ((defpackage.yj1) obj2).giKS3J6vZuNy.ZpBGe2uQfcn8((defpackage.y10) obj);
                return gs1Var;
            default:
                android.view.KeyEvent keyEvent = ((defpackage.wb0) obj).ZpBGe2uQfcn8;
                defpackage.fl1 fl1Var = (defpackage.fl1) obj2;
                defpackage.hn1 hn1Var = fl1Var.oh71FJcDz6S2;
                boolean z2 = fl1Var.JhCgjQRTAOCT;
                if (keyEvent.getAction() == 0 && !java.lang.Character.isISOControl(keyEvent.getUnicodeChar())) {
                    defpackage.ln lnVar = fl1Var.e6mdH7fiFuta;
                    lnVar.getClass();
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                        lnVar.ZpBGe2uQfcn8 = java.lang.Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
                        valueOf = null;
                    } else {
                        java.lang.Integer num = lnVar.ZpBGe2uQfcn8;
                        if (num != null) {
                            lnVar.ZpBGe2uQfcn8 = null;
                            int deadChar = android.view.KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar);
                            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(deadChar);
                            if (deadChar == 0) {
                                valueOf2 = null;
                            }
                            if (valueOf2 != null) {
                                unicodeChar = valueOf2.intValue();
                            }
                            valueOf = java.lang.Integer.valueOf(unicodeChar);
                        } else {
                            valueOf = java.lang.Integer.valueOf(unicodeChar);
                        }
                    }
                    if (valueOf != null) {
                        ogVar = new defpackage.og(new java.lang.StringBuilder().appendCodePoint(valueOf.intValue()).toString(), 1);
                        if (ogVar == null) {
                            if (z2) {
                                fl1Var.ZpBGe2uQfcn8(defpackage.ma0.VFeft99leXEK(ogVar));
                                hn1Var.ZpBGe2uQfcn8 = null;
                            }
                            z = false;
                        } else {
                            if (defpackage.w60.jjTN4uUnoyEn(keyEvent) == 2 && (T1fB7bDYiVJQ = fl1Var.GE9mJIPrb8gP.T1fB7bDYiVJQ(keyEvent)) != null && (!T1fB7bDYiVJQ.WDYagTQQm9ns || z2)) {
                                defpackage.v31 v31Var = new defpackage.v31();
                                v31Var.WDYagTQQm9ns = true;
                                defpackage.eSwlWMUpitz8 eswlwmupitz8 = new defpackage.eSwlWMUpitz8(T1fB7bDYiVJQ, fl1Var, v31Var, 11);
                                defpackage.nm1 nm1Var = fl1Var.fWTAfUmVKrZq;
                                defpackage.pl1 pl1Var = new defpackage.pl1(nm1Var, fl1Var.QiMR8OkAhezm, fl1Var.ZpBGe2uQfcn8.JhCgjQRTAOCT(), hn1Var);
                                eswlwmupitz8.P05cfTpS5W5L(pl1Var);
                                boolean giKS3J6vZuNy = defpackage.in1.giKS3J6vZuNy(pl1Var.oh71FJcDz6S2, nm1Var.giKS3J6vZuNy);
                                defpackage.l6 l6Var = pl1Var.QiMR8OkAhezm;
                                if (!giKS3J6vZuNy || !defpackage.ma0.QiMR8OkAhezm(l6Var, nm1Var.ZpBGe2uQfcn8)) {
                                    fl1Var.Ns0WNyEWdPsk.P05cfTpS5W5L(defpackage.nm1.ZpBGe2uQfcn8(nm1Var, l6Var, pl1Var.oh71FJcDz6S2, 4));
                                }
                                defpackage.es1 es1Var = fl1Var.P05cfTpS5W5L;
                                if (es1Var != null) {
                                    es1Var.WDYagTQQm9ns = true;
                                }
                                z = v31Var.WDYagTQQm9ns;
                            }
                            z = false;
                        }
                        return java.lang.Boolean.valueOf(z);
                    }
                }
                ogVar = null;
                if (ogVar == null) {
                }
                return java.lang.Boolean.valueOf(z);
        }
    }
}
