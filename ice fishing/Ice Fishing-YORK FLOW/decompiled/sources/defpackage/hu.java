package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public class hu implements defpackage.qr0, defpackage.zs0, defpackage.im, defpackage.hz0 {
    public final /* synthetic */ int WDYagTQQm9ns;

    public /* synthetic */ hu(int i) {
        this.WDYagTQQm9ns = i;
    }

    public static defpackage.xo0 Ns0WNyEWdPsk(defpackage.r1 r1Var, defpackage.np0 np0Var, android.os.Bundle bundle, defpackage.pg0 pg0Var, defpackage.fp0 fp0Var) {
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        uuid.getClass();
        np0Var.getClass();
        pg0Var.getClass();
        return new defpackage.xo0(r1Var, np0Var, bundle, pg0Var, fp0Var, uuid, null);
    }

    public static final float e6mdH7fiFuta(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float abs = java.lang.Math.abs(f);
        float signum = java.lang.Math.signum(f);
        int binarySearch = java.util.Arrays.binarySearch(fArr, abs);
        if (binarySearch >= 0) {
            return signum * fArr2[binarySearch];
        }
        int i = -(binarySearch + 1);
        int i2 = i - 1;
        if (i2 >= fArr.length - 1) {
            float f6 = fArr[fArr.length - 1];
            float f7 = fArr2[fArr.length - 1];
            if (f6 == 0.0f) {
                return 0.0f;
            }
            return (f7 / f6) * f;
        }
        if (i2 == -1) {
            float f8 = fArr[0];
            f4 = fArr2[0];
            f5 = f8;
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            float f9 = fArr[i2];
            float f10 = fArr[i];
            f2 = fArr2[i2];
            f3 = f9;
            f4 = fArr2[i];
            f5 = f10;
        }
        return (((f4 - f2) * java.lang.Math.max(0.0f, java.lang.Math.min(1.0f, f3 == f5 ? 0.0f : (abs - f3) / (f5 - f3)))) + f2) * signum;
    }

    public static android.graphics.Typeface fNwYGHIYeJcR(java.lang.String str, defpackage.w00 w00Var, int i) {
        android.graphics.Typeface create;
        if (i == 0 && defpackage.ma0.QiMR8OkAhezm(w00Var, defpackage.w00.e6mdH7fiFuta) && (str == null || str.length() == 0)) {
            return android.graphics.Typeface.DEFAULT;
        }
        create = android.graphics.Typeface.create(str == null ? android.graphics.Typeface.DEFAULT : android.graphics.Typeface.create(str, 0), w00Var.WDYagTQQm9ns, i == 1);
        return create;
    }

    public static android.graphics.Typeface h3m55N1URyyK(java.lang.String str, defpackage.w00 w00Var, int i) {
        if (i == 0 && defpackage.ma0.QiMR8OkAhezm(w00Var, defpackage.w00.e6mdH7fiFuta) && (str == null || str.length() == 0)) {
            return android.graphics.Typeface.DEFAULT;
        }
        int ZVVdXbWmyCSK = defpackage.nn.ZVVdXbWmyCSK(w00Var, i);
        return (str == null || str.length() == 0) ? android.graphics.Typeface.defaultFromStyle(ZVVdXbWmyCSK) : android.graphics.Typeface.create(str, ZVVdXbWmyCSK);
    }

    public void GE9mJIPrb8gP(defpackage.a71 a71Var, java.lang.Object obj) {
        switch (this.WDYagTQQm9ns) {
            case 11:
                com.ice.fishing.wolberta.data.local.Item item = (com.ice.fishing.wolberta.data.local.Item) obj;
                a71Var.getClass();
                a71Var.ZpBGe2uQfcn8(1, item.getId());
                a71Var.WDYagTQQm9ns(item.getName(), 2);
                a71Var.ZpBGe2uQfcn8(3, item.getMarked() ? 1L : 0L);
                defpackage.mq1 type = item.getType();
                type.getClass();
                a71Var.WDYagTQQm9ns(type.name(), 4);
                a71Var.WDYagTQQm9ns(item.getIcon(), 5);
                defpackage.b50 heat = item.getHeat();
                heat.getClass();
                a71Var.WDYagTQQm9ns(heat.name(), 6);
                a71Var.ZpBGe2uQfcn8(7, item.getVeggie() ? 1L : 0L);
                a71Var.WDYagTQQm9ns(item.getTime(), 8);
                a71Var.ZpBGe2uQfcn8(9, item.getScore());
                defpackage.dh1 style = item.getStyle();
                style.getClass();
                a71Var.WDYagTQQm9ns(style.name(), 10);
                break;
            default:
                com.ice.fishing.wolberta.data.local.Item item2 = (com.ice.fishing.wolberta.data.local.Item) obj;
                a71Var.getClass();
                item2.getClass();
                a71Var.ZpBGe2uQfcn8(1, item2.getId());
                a71Var.WDYagTQQm9ns(item2.getName(), 2);
                a71Var.ZpBGe2uQfcn8(3, item2.getMarked() ? 1L : 0L);
                defpackage.mq1 type2 = item2.getType();
                type2.getClass();
                a71Var.WDYagTQQm9ns(type2.name(), 4);
                a71Var.WDYagTQQm9ns(item2.getIcon(), 5);
                defpackage.b50 heat2 = item2.getHeat();
                heat2.getClass();
                a71Var.WDYagTQQm9ns(heat2.name(), 6);
                a71Var.ZpBGe2uQfcn8(7, item2.getVeggie() ? 1L : 0L);
                a71Var.WDYagTQQm9ns(item2.getTime(), 8);
                a71Var.ZpBGe2uQfcn8(9, item2.getScore());
                defpackage.dh1 style2 = item2.getStyle();
                style2.getClass();
                a71Var.WDYagTQQm9ns(style2.name(), 10);
                a71Var.ZpBGe2uQfcn8(11, item2.getId());
                break;
        }
    }

    @Override // defpackage.qr0
    public void JhCgjQRTAOCT(defpackage.jd0 jd0Var, long j, defpackage.k50 k50Var, int i, boolean z) {
        defpackage.or0 or0Var = jd0Var.IBvW5fLsPuHy;
        defpackage.sr0 sr0Var = or0Var.JhCgjQRTAOCT;
        defpackage.m51 m51Var = defpackage.sr0.OVwOqzUGHcCU;
        or0Var.JhCgjQRTAOCT.pVQOaWB9QMo4(defpackage.sr0.EPEWHACkMcF1, sr0Var.J2k156ROr5mz(j), k50Var, 1, z);
    }

    @Override // defpackage.qr0
    public boolean P05cfTpS5W5L(defpackage.jd0 jd0Var) {
        defpackage.fb1 IJ0hOnjhPOri = jd0Var.IJ0hOnjhPOri();
        boolean z = false;
        if (IJ0hOnjhPOri != null && IJ0hOnjhPOri.P05cfTpS5W5L) {
            z = true;
        }
        return !z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x00da, code lost:
    
        if (r8 != 10) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0225, code lost:
    
        if (defpackage.ub0.ZpBGe2uQfcn8(defpackage.v70.giKS3J6vZuNy(r15.getKeyCode()), defpackage.ub0.T1fB7bDYiVJQ) != false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0331, code lost:
    
        if (defpackage.ub0.ZpBGe2uQfcn8(r14, defpackage.ub0.w6IV1lieBIux) == false) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00cf, code lost:
    
        if (defpackage.ub0.ZpBGe2uQfcn8(r10, defpackage.ub0.jjTN4uUnoyEn) == false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x020d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public defpackage.vb0 T1fB7bDYiVJQ(android.view.KeyEvent keyEvent) {
        defpackage.vb0 vb0Var;
        int i = this.WDYagTQQm9ns;
        defpackage.vb0 vb0Var2 = defpackage.vb0.SELECT_LINE_START;
        defpackage.vb0 vb0Var3 = defpackage.vb0.SELECT_LINE_END;
        defpackage.vb0 vb0Var4 = defpackage.vb0.NEW_LINE;
        defpackage.vb0 vb0Var5 = defpackage.vb0.DELETE_PREV_CHAR;
        switch (i) {
            case 13:
                int w7APNrr0aGRc = defpackage.q70.w7APNrr0aGRc(keyEvent);
                defpackage.vb0 vb0Var6 = defpackage.vb0.REDO;
                if (w7APNrr0aGRc != 10) {
                    defpackage.vb0 vb0Var7 = defpackage.vb0.COPY;
                    defpackage.vb0 vb0Var8 = defpackage.vb0.CUT;
                    defpackage.vb0 vb0Var9 = defpackage.vb0.PASTE;
                    if (w7APNrr0aGRc == 2) {
                        long giKS3J6vZuNy = defpackage.v70.giKS3J6vZuNy(keyEvent.getKeyCode());
                        if (!defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy, defpackage.ub0.GE9mJIPrb8gP) && !defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy, defpackage.ub0.VFeft99leXEK) && !defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy, defpackage.ub0.w6IV1lieBIux)) {
                            if (!defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy, defpackage.ub0.fNwYGHIYeJcR)) {
                                if (!defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy, defpackage.ub0.h3m55N1URyyK)) {
                                    if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy, defpackage.ub0.e6mdH7fiFuta)) {
                                        return defpackage.vb0.SELECT_ALL;
                                    }
                                    if (!defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy, defpackage.ub0.gUjdnLbkVAaA)) {
                                        if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy, defpackage.ub0.T1fB7bDYiVJQ)) {
                                            return defpackage.vb0.UNDO;
                                        }
                                        return null;
                                    }
                                    return vb0Var6;
                                }
                                return vb0Var8;
                            }
                            return vb0Var9;
                        }
                        return vb0Var7;
                    }
                    if (w7APNrr0aGRc == 8) {
                        long giKS3J6vZuNy2 = defpackage.v70.giKS3J6vZuNy(keyEvent.getKeyCode());
                        if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy2, defpackage.ub0.oh71FJcDz6S2) || defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy2, defpackage.ub0.KrtOTfE6jiS2)) {
                            return defpackage.vb0.SELECT_LEFT_CHAR;
                        }
                        if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy2, defpackage.ub0.QiMR8OkAhezm) || defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy2, defpackage.ub0.IBvW5fLsPuHy)) {
                            return defpackage.vb0.SELECT_RIGHT_CHAR;
                        }
                        if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy2, defpackage.ub0.JhCgjQRTAOCT) || defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy2, defpackage.ub0.Mearx7yMn90V)) {
                            return defpackage.vb0.SELECT_UP;
                        }
                        if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy2, defpackage.ub0.WDYagTQQm9ns) || defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy2, defpackage.ub0.frSwwKIlbUhK)) {
                            return defpackage.vb0.SELECT_DOWN;
                        }
                        if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy2, defpackage.ub0.UmgHb6n58gfG) || defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy2, defpackage.ub0.GcLuU6pT9wO9)) {
                            return defpackage.vb0.SELECT_PAGE_UP;
                        }
                        if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy2, defpackage.ub0.qjMheFZ0l9kA) || defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy2, defpackage.ub0.xahdJg25P1Bv)) {
                            return defpackage.vb0.SELECT_PAGE_DOWN;
                        }
                        if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy2, defpackage.ub0.maCixPsq4ml2) || defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy2, defpackage.ub0.BXaznwstz2U0)) {
                            return vb0Var2;
                        }
                        if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy2, defpackage.ub0.IJ0hOnjhPOri) || defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy2, defpackage.ub0.hH0RRJrNssvh)) {
                            return vb0Var3;
                        }
                        if (!defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy2, defpackage.ub0.VFeft99leXEK)) {
                            break;
                        }
                        return vb0Var9;
                    }
                    if (w7APNrr0aGRc == 0) {
                        long giKS3J6vZuNy3 = defpackage.v70.giKS3J6vZuNy(keyEvent.getKeyCode());
                        if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy3, defpackage.ub0.oh71FJcDz6S2) || defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy3, defpackage.ub0.KrtOTfE6jiS2)) {
                            return defpackage.vb0.LEFT_CHAR;
                        }
                        if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy3, defpackage.ub0.QiMR8OkAhezm) || defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy3, defpackage.ub0.IBvW5fLsPuHy)) {
                            return defpackage.vb0.RIGHT_CHAR;
                        }
                        if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy3, defpackage.ub0.JhCgjQRTAOCT) || defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy3, defpackage.ub0.Mearx7yMn90V)) {
                            return defpackage.vb0.UP;
                        }
                        if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy3, defpackage.ub0.WDYagTQQm9ns) || defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy3, defpackage.ub0.frSwwKIlbUhK)) {
                            return defpackage.vb0.DOWN;
                        }
                        if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy3, defpackage.ub0.P05cfTpS5W5L)) {
                            return defpackage.vb0.CENTER;
                        }
                        if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy3, defpackage.ub0.UmgHb6n58gfG) || defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy3, defpackage.ub0.GcLuU6pT9wO9)) {
                            return defpackage.vb0.PAGE_UP;
                        }
                        if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy3, defpackage.ub0.qjMheFZ0l9kA) || defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy3, defpackage.ub0.xahdJg25P1Bv)) {
                            return defpackage.vb0.PAGE_DOWN;
                        }
                        if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy3, defpackage.ub0.maCixPsq4ml2) || defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy3, defpackage.ub0.BXaznwstz2U0)) {
                            return defpackage.vb0.LINE_START;
                        }
                        if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy3, defpackage.ub0.IJ0hOnjhPOri) || defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy3, defpackage.ub0.hH0RRJrNssvh)) {
                            return defpackage.vb0.LINE_END;
                        }
                        if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy3, defpackage.ub0.s0TASMVLSWD5) || defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy3, defpackage.ub0.jjTN4uUnoyEn)) {
                            return vb0Var4;
                        }
                        if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy3, defpackage.ub0.BHfvd2J71qpO)) {
                            return vb0Var5;
                        }
                        if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy3, defpackage.ub0.ZVVdXbWmyCSK)) {
                            return defpackage.vb0.DELETE_NEXT_CHAR;
                        }
                        if (!defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy3, defpackage.ub0.OcTWLQzke1i2)) {
                            if (!defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy3, defpackage.ub0.oCu53ZX2v4Ju)) {
                                if (!defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy3, defpackage.ub0.dG7RjM6DqYVL)) {
                                    if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy3, defpackage.ub0.XntWc4eZSQ8j)) {
                                        return defpackage.vb0.TAB;
                                    }
                                }
                                return vb0Var7;
                            }
                            return vb0Var8;
                        }
                        return vb0Var9;
                    }
                    return null;
                }
                break;
                break;
            default:
                int w7APNrr0aGRc2 = defpackage.q70.w7APNrr0aGRc(keyEvent);
                if (w7APNrr0aGRc2 == 9) {
                    long giKS3J6vZuNy4 = defpackage.v70.giKS3J6vZuNy(keyEvent.getKeyCode());
                    if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy4, defpackage.ub0.oh71FJcDz6S2)) {
                        vb0Var = defpackage.vb0.SELECT_LINE_LEFT;
                    } else if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy4, defpackage.ub0.QiMR8OkAhezm)) {
                        vb0Var = defpackage.vb0.SELECT_LINE_RIGHT;
                    } else if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy4, defpackage.ub0.JhCgjQRTAOCT)) {
                        vb0Var = defpackage.vb0.SELECT_HOME;
                    } else {
                        if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy4, defpackage.ub0.WDYagTQQm9ns)) {
                            vb0Var = defpackage.vb0.SELECT_END;
                        }
                        vb0Var = null;
                    }
                } else {
                    if (w7APNrr0aGRc2 == 1) {
                        long giKS3J6vZuNy5 = defpackage.v70.giKS3J6vZuNy(keyEvent.getKeyCode());
                        if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy5, defpackage.ub0.oh71FJcDz6S2)) {
                            vb0Var = defpackage.vb0.LINE_LEFT;
                        } else if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy5, defpackage.ub0.QiMR8OkAhezm)) {
                            vb0Var = defpackage.vb0.LINE_RIGHT;
                        } else if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy5, defpackage.ub0.JhCgjQRTAOCT)) {
                            vb0Var = defpackage.vb0.HOME;
                        } else if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy5, defpackage.ub0.WDYagTQQm9ns)) {
                            vb0Var = defpackage.vb0.END;
                        } else if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy5, defpackage.ub0.BHfvd2J71qpO)) {
                            vb0Var = defpackage.vb0.DELETE_FROM_LINE_START;
                        }
                    }
                    vb0Var = null;
                }
                if (vb0Var != null) {
                    return vb0Var;
                }
                defpackage.k0 k0Var = defpackage.nq1.QiMR8OkAhezm;
                int w7APNrr0aGRc3 = defpackage.q70.w7APNrr0aGRc(keyEvent);
                long giKS3J6vZuNy6 = defpackage.v70.giKS3J6vZuNy(keyEvent.getKeyCode());
                if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy6, defpackage.ub0.BHfvd2J71qpO)) {
                    if (w7APNrr0aGRc3 == 0 || w7APNrr0aGRc3 == 8 || w7APNrr0aGRc3 == 12) {
                        vb0Var4 = vb0Var5;
                    } else {
                        if (w7APNrr0aGRc3 == 2 || w7APNrr0aGRc3 == 10) {
                            vb0Var4 = defpackage.vb0.DELETE_PREV_WORD;
                        }
                        vb0Var4 = null;
                    }
                    if (vb0Var4 == null) {
                        return vb0Var4;
                    }
                    int w7APNrr0aGRc4 = defpackage.q70.w7APNrr0aGRc(keyEvent);
                    if (w7APNrr0aGRc4 == 10) {
                        long giKS3J6vZuNy7 = defpackage.v70.giKS3J6vZuNy(keyEvent.getKeyCode());
                        if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy7, defpackage.ub0.oh71FJcDz6S2) || defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy7, defpackage.ub0.KrtOTfE6jiS2)) {
                            vb0Var2 = defpackage.vb0.SELECT_LEFT_WORD;
                        } else if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy7, defpackage.ub0.QiMR8OkAhezm) || defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy7, defpackage.ub0.IBvW5fLsPuHy)) {
                            vb0Var2 = defpackage.vb0.SELECT_RIGHT_WORD;
                        } else if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy7, defpackage.ub0.JhCgjQRTAOCT) || defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy7, defpackage.ub0.Mearx7yMn90V)) {
                            vb0Var2 = defpackage.vb0.SELECT_PREV_PARAGRAPH;
                        } else {
                            if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy7, defpackage.ub0.WDYagTQQm9ns) || defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy7, defpackage.ub0.frSwwKIlbUhK)) {
                                vb0Var2 = defpackage.vb0.SELECT_NEXT_PARAGRAPH;
                            }
                            vb0Var2 = null;
                        }
                        return vb0Var2 == null ? ((defpackage.hu) k0Var.oh71FJcDz6S2).T1fB7bDYiVJQ(keyEvent) : vb0Var2;
                    }
                    if (w7APNrr0aGRc4 == 2) {
                        long giKS3J6vZuNy8 = defpackage.v70.giKS3J6vZuNy(keyEvent.getKeyCode());
                        if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy8, defpackage.ub0.oh71FJcDz6S2) || defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy8, defpackage.ub0.KrtOTfE6jiS2)) {
                            vb0Var2 = defpackage.vb0.LEFT_WORD;
                        } else if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy8, defpackage.ub0.QiMR8OkAhezm) || defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy8, defpackage.ub0.IBvW5fLsPuHy)) {
                            vb0Var2 = defpackage.vb0.RIGHT_WORD;
                        } else if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy8, defpackage.ub0.JhCgjQRTAOCT) || defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy8, defpackage.ub0.Mearx7yMn90V)) {
                            vb0Var2 = defpackage.vb0.PREV_PARAGRAPH;
                        } else if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy8, defpackage.ub0.WDYagTQQm9ns) || defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy8, defpackage.ub0.frSwwKIlbUhK)) {
                            vb0Var2 = defpackage.vb0.NEXT_PARAGRAPH;
                        } else if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy8, defpackage.ub0.Ns0WNyEWdPsk)) {
                            vb0Var2 = vb0Var5;
                        } else if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy8, defpackage.ub0.ZVVdXbWmyCSK)) {
                            vb0Var2 = defpackage.vb0.DELETE_NEXT_WORD;
                        } else {
                            if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy8, defpackage.ub0.blKFvluuDQOf)) {
                                vb0Var2 = defpackage.vb0.DESELECT;
                            }
                            vb0Var2 = null;
                        }
                        if (vb0Var2 == null) {
                        }
                    } else if (w7APNrr0aGRc4 == 8) {
                        long giKS3J6vZuNy9 = defpackage.v70.giKS3J6vZuNy(keyEvent.getKeyCode());
                        if (!defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy9, defpackage.ub0.maCixPsq4ml2) && !defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy9, defpackage.ub0.BXaznwstz2U0)) {
                            if (defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy9, defpackage.ub0.IJ0hOnjhPOri) || defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy9, defpackage.ub0.hH0RRJrNssvh)) {
                                vb0Var2 = vb0Var3;
                            }
                            vb0Var2 = null;
                        }
                        if (vb0Var2 == null) {
                        }
                    } else {
                        if (w7APNrr0aGRc4 == 1 && defpackage.ub0.ZpBGe2uQfcn8(defpackage.v70.giKS3J6vZuNy(keyEvent.getKeyCode()), defpackage.ub0.ZVVdXbWmyCSK)) {
                            vb0Var2 = defpackage.vb0.DELETE_TO_LINE_END;
                            if (vb0Var2 == null) {
                            }
                        }
                        vb0Var2 = null;
                        if (vb0Var2 == null) {
                        }
                    }
                } else {
                    if (!defpackage.ub0.ZpBGe2uQfcn8(giKS3J6vZuNy6, defpackage.ub0.s0TASMVLSWD5)) {
                        break;
                    }
                    if (w7APNrr0aGRc3 != 0) {
                        if (w7APNrr0aGRc3 != 8) {
                            if (w7APNrr0aGRc3 != 2) {
                            }
                        }
                    }
                    if (vb0Var4 == null) {
                    }
                }
                break;
        }
    }

    @Override // defpackage.qr0
    public boolean ZpBGe2uQfcn8(defpackage.ul0 ul0Var) {
        return false;
    }

    @Override // defpackage.qr0
    public boolean fWTAfUmVKrZq(defpackage.ul0 ul0Var) {
        return defpackage.h0.BXaznwstz2U0(defpackage.w60.WDYagTQQm9ns(defpackage.la0.UmgHb6n58gfG(ul0Var), false));
    }

    public void gUjdnLbkVAaA(android.view.View view, android.graphics.Rect rect) {
        android.util.DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        rect.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    @Override // defpackage.qr0
    public int giKS3J6vZuNy() {
        return 8;
    }

    @Override // defpackage.qr0
    public boolean oh71FJcDz6S2(defpackage.k50 k50Var, defpackage.jd0 jd0Var) {
        return false;
    }

    @Override // defpackage.zs0
    public int QiMR8OkAhezm(int i) {
        return i;
    }

    @Override // defpackage.zs0
    public int WDYagTQQm9ns(int i) {
        return i;
    }

    public void XntWc4eZSQ8j(defpackage.a11 a11Var, int i, int i2) {
    }
}
