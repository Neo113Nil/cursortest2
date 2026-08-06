package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public class k0 implements defpackage.d11, defpackage.k51, defpackage.m21, defpackage.z61 {
    public final /* synthetic */ int WDYagTQQm9ns;
    public java.lang.Object oh71FJcDz6S2;

    public k0(int i, byte b) {
        this.WDYagTQQm9ns = i;
        switch (i) {
            case defpackage.n70.fWTAfUmVKrZq /* 12 */:
                defpackage.yj0 yj0Var = new defpackage.yj0();
                this.oh71FJcDz6S2 = yj0Var;
                if (!yj0Var.oh71FJcDz6S2) {
                    if (yj0Var.QiMR8OkAhezm) {
                        defpackage.h11.ZpBGe2uQfcn8("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    yj0Var.ZpBGe2uQfcn8();
                    yj0Var.QiMR8OkAhezm = true;
                    break;
                }
                break;
            case 13:
                this.oh71FJcDz6S2 = new java.util.concurrent.CopyOnWriteArrayList();
                new java.util.HashMap();
                break;
            case 14:
            case 17:
            case 20:
            case 21:
            default:
                this.oh71FJcDz6S2 = new defpackage.mf1(defpackage.la0.Ns0WNyEWdPsk);
                break;
            case 15:
                this.oh71FJcDz6S2 = new java.util.HashMap();
                break;
            case 16:
                this.oh71FJcDz6S2 = new java.util.ArrayList(32);
                break;
            case 18:
                this.oh71FJcDz6S2 = android.os.Build.VERSION.SDK_INT >= 28 ? new defpackage.hu(27) : new defpackage.hu(28);
                break;
            case 19:
                this.oh71FJcDz6S2 = new defpackage.gj0();
                break;
            case 22:
                this.oh71FJcDz6S2 = defpackage.w60.hH0RRJrNssvh(java.lang.Boolean.FALSE);
                break;
            case 23:
                this.oh71FJcDz6S2 = new android.graphics.Region();
                break;
        }
    }

    public static defpackage.xe0 VFeft99leXEK(defpackage.k0 k0Var, int i) {
        defpackage.tf0 tf0Var = (defpackage.tf0) k0Var.oh71FJcDz6S2;
        defpackage.me1 BHfvd2J71qpO = defpackage.t80.BHfvd2J71qpO();
        defpackage.y10 WDYagTQQm9ns = BHfvd2J71qpO != null ? BHfvd2J71qpO.WDYagTQQm9ns() : null;
        defpackage.me1 UmgHb6n58gfG = defpackage.t80.UmgHb6n58gfG(BHfvd2J71qpO);
        try {
            defpackage.of0 of0Var = (defpackage.of0) tf0Var.oh71FJcDz6S2.getValue();
            defpackage.t80.IBvW5fLsPuHy(BHfvd2J71qpO, UmgHb6n58gfG, WDYagTQQm9ns);
            defpackage.ye0 ye0Var = tf0Var.XntWc4eZSQ8j;
            long j = of0Var.GE9mJIPrb8gP;
            boolean z = tf0Var.JhCgjQRTAOCT;
            defpackage.awuGf4qH8HFd awugf4qh8hfd = new defpackage.awuGf4qH8HFd(i, of0Var);
            defpackage.mc0 mc0Var = ye0Var.fWTAfUmVKrZq;
            if (mc0Var == null) {
                return defpackage.jVUAPb5NnIYW.jjTN4uUnoyEn;
            }
            defpackage.a7 a7Var = ye0Var.giKS3J6vZuNy;
            defpackage.n11 n11Var = (defpackage.n11) mc0Var.JhCgjQRTAOCT;
            boolean z2 = n11Var instanceof defpackage.k3;
            defpackage.m11 m11Var = new defpackage.m11(mc0Var, i, a7Var, awugf4qh8hfd);
            m11Var.P05cfTpS5W5L = new defpackage.mk(j);
            if (!z2) {
                n11Var.ZpBGe2uQfcn8(m11Var);
            } else if (z) {
                defpackage.k3 k3Var = (defpackage.k3) n11Var;
                k3Var.oh71FJcDz6S2.add(new defpackage.d21(1, m11Var));
                if (!k3Var.QiMR8OkAhezm) {
                    k3Var.QiMR8OkAhezm = true;
                    k3Var.WDYagTQQm9ns.post(k3Var);
                }
            } else {
                defpackage.k3 k3Var2 = (defpackage.k3) n11Var;
                k3Var2.oh71FJcDz6S2.add(new defpackage.d21(0, m11Var));
                if (!k3Var2.QiMR8OkAhezm) {
                    k3Var2.QiMR8OkAhezm = true;
                    k3Var2.WDYagTQQm9ns.post(k3Var2);
                }
            }
            defpackage.nn.Mearx7yMn90V("compose:lazy:schedule_prefetch:index", i);
            return m11Var;
        } catch (java.lang.Throwable th) {
            defpackage.t80.IBvW5fLsPuHy(BHfvd2J71qpO, UmgHb6n58gfG, WDYagTQQm9ns);
            throw th;
        }
    }

    public defpackage.n80 BHfvd2J71qpO(defpackage.n80 n80Var, defpackage.u uVar) {
        java.lang.Object obj;
        long j;
        boolean z;
        long frSwwKIlbUhK;
        defpackage.gj0 gj0Var = (defpackage.gj0) this.oh71FJcDz6S2;
        java.util.List list = (java.util.List) n80Var.oh71FJcDz6S2;
        defpackage.gj0 gj0Var2 = new defpackage.gj0(list.size());
        int size = list.size();
        int i = 0;
        while (i < size) {
            defpackage.e01 e01Var = (defpackage.e01) list.get(i);
            long j2 = e01Var.ZpBGe2uQfcn8;
            int Ns0WNyEWdPsk = defpackage.vx1.Ns0WNyEWdPsk(gj0Var.oh71FJcDz6S2, gj0Var.P05cfTpS5W5L, j2);
            if (Ns0WNyEWdPsk < 0 || (obj = gj0Var.QiMR8OkAhezm[Ns0WNyEWdPsk]) == defpackage.vx1.gUjdnLbkVAaA) {
                obj = null;
            }
            defpackage.d01 d01Var = (defpackage.d01) obj;
            if (d01Var == null) {
                j = e01Var.giKS3J6vZuNy;
                frSwwKIlbUhK = e01Var.JhCgjQRTAOCT;
                z = false;
            } else {
                j = d01Var.ZpBGe2uQfcn8;
                z = d01Var.fWTAfUmVKrZq;
                frSwwKIlbUhK = uVar.frSwwKIlbUhK(d01Var.giKS3J6vZuNy);
            }
            long j3 = e01Var.ZpBGe2uQfcn8;
            int i2 = i;
            java.util.List list2 = list;
            int i3 = size;
            gj0Var2.giKS3J6vZuNy(j3, new defpackage.c01(j3, e01Var.giKS3J6vZuNy, e01Var.JhCgjQRTAOCT, e01Var.WDYagTQQm9ns, e01Var.oh71FJcDz6S2, j, frSwwKIlbUhK, z, e01Var.QiMR8OkAhezm, e01Var.e6mdH7fiFuta, e01Var.GE9mJIPrb8gP, e01Var.Ns0WNyEWdPsk, e01Var.fNwYGHIYeJcR, e01Var.h3m55N1URyyK));
            boolean z2 = e01Var.WDYagTQQm9ns;
            if (z2) {
                gj0Var.giKS3J6vZuNy(j2, new defpackage.d01(e01Var.giKS3J6vZuNy, e01Var.fWTAfUmVKrZq, z2));
            } else {
                gj0Var.fWTAfUmVKrZq(j2);
            }
            i = i2 + 1;
            list = list2;
            size = i3;
        }
        return new defpackage.n80(15, gj0Var2, n80Var);
    }

    public void GE9mJIPrb8gP(float f, float f2, float f3, float f4, float f5, float f6) {
        ((java.util.ArrayList) this.oh71FJcDz6S2).add(new defpackage.cx0(f, f2, f3, f4, f5, f6));
    }

    public void IJ0hOnjhPOri(float f, float f2, long j) {
        defpackage.id oh71FJcDz6S2 = ((defpackage.a7) this.oh71FJcDz6S2).oh71FJcDz6S2();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        oh71FJcDz6S2.oh71FJcDz6S2(java.lang.Float.intBitsToFloat(i), java.lang.Float.intBitsToFloat(i2));
        oh71FJcDz6S2.giKS3J6vZuNy(f, f2);
        oh71FJcDz6S2.oh71FJcDz6S2(-java.lang.Float.intBitsToFloat(i), -java.lang.Float.intBitsToFloat(i2));
    }

    @Override // defpackage.m21
    public void JhCgjQRTAOCT(int i, java.lang.Object obj) {
        java.lang.String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case defpackage.n70.ZpBGe2uQfcn8 /* 9 */:
            default:
                str = "";
                break;
            case defpackage.n70.giKS3J6vZuNy /* 10 */:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            android.util.Log.e("ProfileInstaller", str, (java.lang.Throwable) obj);
        } else {
            android.util.Log.d("ProfileInstaller", str);
        }
        ((androidx.profileinstaller.ProfileInstallReceiver) this.oh71FJcDz6S2).setResultCode(i);
    }

    public void Ns0WNyEWdPsk(float f, float f2, float f3, float f4, float f5, float f6) {
        ((java.util.ArrayList) this.oh71FJcDz6S2).add(new defpackage.kx0(f, f2, f3, f4, f5, f6));
    }

    public void OcTWLQzke1i2(float f, float f2) {
        ((defpackage.a7) this.oh71FJcDz6S2).oh71FJcDz6S2().oh71FJcDz6S2(f, f2);
    }

    @Override // defpackage.z61
    public boolean P05cfTpS5W5L() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void QiMR8OkAhezm(defpackage.wd wdVar, defpackage.ll llVar) {
        defpackage.ss0 ss0Var;
        int i;
        if (llVar instanceof defpackage.ss0) {
            ss0Var = (defpackage.ss0) llVar;
            int i2 = ss0Var.GE9mJIPrb8gP;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ss0Var.GE9mJIPrb8gP = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = ss0Var.P05cfTpS5W5L;
                i = ss0Var.GE9mJIPrb8gP;
                if (i != 0) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    defpackage.gg1 gg1Var = (defpackage.gg1) this.oh71FJcDz6S2;
                    ss0Var.GE9mJIPrb8gP = 1;
                    gg1Var.ZpBGe2uQfcn8(wdVar, ss0Var);
                    return;
                }
                if (i != 1) {
                    defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                    return;
                } else {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    defpackage.h7.JhCgjQRTAOCT();
                    return;
                }
            }
        }
        ss0Var = new defpackage.ss0(this, llVar);
        java.lang.Object obj2 = ss0Var.P05cfTpS5W5L;
        i = ss0Var.GE9mJIPrb8gP;
        if (i != 0) {
        }
    }

    public void T1fB7bDYiVJQ(float f, float f2) {
        ((java.util.ArrayList) this.oh71FJcDz6S2).add(new defpackage.ex0(f, f2));
    }

    public void WDYagTQQm9ns(defpackage.jd0 jd0Var) {
        if (!jd0Var.KrtOTfE6jiS2()) {
            defpackage.e80.giKS3J6vZuNy("DepthSortedSet.add called on an unattached node");
        }
        ((defpackage.mf1) this.oh71FJcDz6S2).add(jd0Var);
    }

    public void WmetiUbpKU9I(float f, float f2) {
        ((java.util.ArrayList) this.oh71FJcDz6S2).add(new defpackage.fx0(f, f2));
    }

    public void XntWc4eZSQ8j(float f, float f2) {
        ((java.util.ArrayList) this.oh71FJcDz6S2).add(new defpackage.mx0(f, f2));
    }

    public void ZVVdXbWmyCSK(float f, float f2, float f3, float f4) {
        ((java.util.ArrayList) this.oh71FJcDz6S2).add(new defpackage.hx0(f, f2, f3, f4));
    }

    @Override // defpackage.d11
    public long ZpBGe2uQfcn8(defpackage.q90 q90Var, long j, defpackage.sc0 sc0Var, long j2) {
        return (defpackage.jr0.fNwYGHIYeJcR(q90Var.giKS3J6vZuNy + ((int) (r0 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true) & 4294967295L) | (defpackage.jr0.fNwYGHIYeJcR(q90Var.ZpBGe2uQfcn8 + ((int) (((defpackage.l90) ((defpackage.n10) this.oh71FJcDz6S2).ZpBGe2uQfcn8()).ZpBGe2uQfcn8 >> 32)), (int) (j2 >> 32), (int) (j >> 32), sc0Var == defpackage.sc0.WDYagTQQm9ns) << 32);
    }

    public void dG7RjM6DqYVL() {
        android.view.View view;
        android.view.View view2 = (android.view.View) this.oh71FJcDz6S2;
        if (view2 == null) {
            return;
        }
        if (view2.isInEditMode() || view2.onCheckIsTextEditor()) {
            view2.requestFocus();
            view = view2;
        } else {
            view = view2.getRootView().findFocus();
        }
        if (view == null) {
            view = view2.getRootView().findViewById(android.R.id.content);
        }
        if (view == null || !view.hasWindowFocus()) {
            return;
        }
        view.post(new defpackage.gUjdnLbkVAaA(11, view));
    }

    public void e6mdH7fiFuta() {
        ((defpackage.gj) this.oh71FJcDz6S2).getClass();
    }

    public defpackage.dg1 fNwYGHIYeJcR() {
        defpackage.ju ZpBGe2uQfcn8 = defpackage.ju.ZpBGe2uQfcn8();
        if (ZpBGe2uQfcn8.fWTAfUmVKrZq() == 1) {
            return new defpackage.p60(true);
        }
        defpackage.pw0 hH0RRJrNssvh = defpackage.w60.hH0RRJrNssvh(java.lang.Boolean.FALSE);
        defpackage.ao aoVar = new defpackage.ao(hH0RRJrNssvh, this);
        ZpBGe2uQfcn8.ZpBGe2uQfcn8.writeLock().lock();
        try {
            if (ZpBGe2uQfcn8.fWTAfUmVKrZq != 1 && ZpBGe2uQfcn8.fWTAfUmVKrZq != 2) {
                ZpBGe2uQfcn8.giKS3J6vZuNy.add(aoVar);
                ZpBGe2uQfcn8.ZpBGe2uQfcn8.writeLock().unlock();
                return hH0RRJrNssvh;
            }
            ZpBGe2uQfcn8.JhCgjQRTAOCT.post(new defpackage.wc(java.util.Arrays.asList(aoVar), ZpBGe2uQfcn8.fWTAfUmVKrZq, null));
            ZpBGe2uQfcn8.ZpBGe2uQfcn8.writeLock().unlock();
            return hH0RRJrNssvh;
        } catch (java.lang.Throwable th) {
            ZpBGe2uQfcn8.ZpBGe2uQfcn8.writeLock().unlock();
            throw th;
        }
    }

    @Override // defpackage.m21
    public void fWTAfUmVKrZq() {
        android.util.Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    public void gUjdnLbkVAaA(float f, float f2, float f3, float f4) {
        defpackage.a7 a7Var = (defpackage.a7) this.oh71FJcDz6S2;
        defpackage.id oh71FJcDz6S2 = a7Var.oh71FJcDz6S2();
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (a7Var.Ns0WNyEWdPsk() >> 32)) - (f3 + f);
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (a7Var.Ns0WNyEWdPsk() & 4294967295L)) - (f4 + f2);
        long floatToRawIntBits = (java.lang.Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32);
        if (java.lang.Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) < 0.0f || java.lang.Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) < 0.0f) {
            defpackage.d80.ZpBGe2uQfcn8("Width and height must be greater than or equal to zero");
        }
        a7Var.IJ0hOnjhPOri(floatToRawIntBits);
        oh71FJcDz6S2.oh71FJcDz6S2(f, f2);
    }

    @Override // defpackage.z61
    public defpackage.y61 giKS3J6vZuNy(java.lang.String str) {
        str.getClass();
        defpackage.yh1 yh1Var = (defpackage.yh1) this.oh71FJcDz6S2;
        java.lang.String databaseName = yh1Var.getDatabaseName();
        if (databaseName == null) {
            if (!str.equals(":memory:")) {
                defpackage.p81.JhCgjQRTAOCT("This driver is configured to open an in-memory database but a file-based named '", str, "' was requested.");
                return null;
            }
        } else if (!databaseName.equals(str) && !defpackage.tg1.Rl68HURFBtL3(databaseName, '/').equals(defpackage.tg1.Rl68HURFBtL3(str, '/'))) {
            defpackage.h7.Ns0WNyEWdPsk("This driver is configured to open a database named '", yh1Var.getDatabaseName(), "' but '", str, "' was requested.");
            return null;
        }
        return new defpackage.xh1(yh1Var.dG7RjM6DqYVL());
    }

    public void h3m55N1URyyK() {
        android.view.View view = (android.view.View) this.oh71FJcDz6S2;
        if (view != null) {
            ((android.view.inputmethod.InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public java.lang.Object maCixPsq4ml2(defpackage.pd pdVar, defpackage.n10 n10Var) {
        defpackage.zd1 zd1Var;
        defpackage.bc1 bc1Var;
        int i;
        if (((defpackage.ti) this.oh71FJcDz6S2) == null) {
            defpackage.g11.giKS3J6vZuNy("Called runAndWatch on a manager that has been disposed of");
        }
        defpackage.ti tiVar = (defpackage.ti) this.oh71FJcDz6S2;
        if ((tiVar instanceof defpackage.zd1) && (bc1Var = (zd1Var = (defpackage.zd1) tiVar).oh71FJcDz6S2) != null && !bc1Var.equals(pdVar)) {
            defpackage.bn0 bn0Var = new defpackage.bn0();
            defpackage.bc1 bc1Var2 = zd1Var.oh71FJcDz6S2;
            if (bc1Var2 == null) {
                defpackage.g11.giKS3J6vZuNy("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
            }
            defpackage.zn0 zn0Var = zd1Var.JhCgjQRTAOCT;
            java.util.ArrayList arrayList = bn0Var.fWTAfUmVKrZq;
            if (zn0Var == null) {
                java.lang.Object obj = zd1Var.giKS3J6vZuNy;
                obj.getClass();
                arrayList.add(new defpackage.ym0(obj, bc1Var2));
            } else {
                java.lang.Object[] objArr = zn0Var.giKS3J6vZuNy;
                long[] jArr = zn0Var.ZpBGe2uQfcn8;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8;
                            int i4 = 8 - ((~(i2 - length)) >>> 31);
                            int i5 = 0;
                            while (i5 < i4) {
                                if ((j & 255) < 128) {
                                    i = i3;
                                    arrayList.add(new defpackage.ym0(objArr[(i2 << 3) + i5], bc1Var2));
                                } else {
                                    i = i3;
                                }
                                j >>= i;
                                i5++;
                                i3 = i;
                            }
                            if (i4 != i3) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            bn0Var.JhCgjQRTAOCT();
            zd1Var.WDYagTQQm9ns();
            this.oh71FJcDz6S2 = bn0Var;
        }
        defpackage.ti tiVar2 = (defpackage.ti) this.oh71FJcDz6S2;
        tiVar2.getClass();
        defpackage.me1 w7APNrr0aGRc = defpackage.te1.GE9mJIPrb8gP().w7APNrr0aGRc(tiVar2.e6mdH7fiFuta(pdVar));
        tiVar2.fWTAfUmVKrZq(pdVar);
        try {
            defpackage.me1 GE9mJIPrb8gP = w7APNrr0aGRc.GE9mJIPrb8gP();
            try {
                java.lang.Object ZpBGe2uQfcn8 = n10Var.ZpBGe2uQfcn8();
                w7APNrr0aGRc.fWTAfUmVKrZq();
                tiVar2.JhCgjQRTAOCT();
                return ZpBGe2uQfcn8;
            } finally {
                defpackage.me1.WmetiUbpKU9I(GE9mJIPrb8gP);
            }
        } catch (java.lang.Throwable th) {
            w7APNrr0aGRc.fWTAfUmVKrZq();
            throw th;
        }
    }

    public void oCu53ZX2v4Ju(defpackage.q90 q90Var) {
        ((android.graphics.Region) this.oh71FJcDz6S2).set(q90Var.ZpBGe2uQfcn8, q90Var.giKS3J6vZuNy, q90Var.fWTAfUmVKrZq, q90Var.JhCgjQRTAOCT);
    }

    public void oh71FJcDz6S2() {
        ((java.util.ArrayList) this.oh71FJcDz6S2).add(defpackage.bx0.fWTAfUmVKrZq);
    }

    public void s0TASMVLSWD5(android.view.View view, int i, boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 27) {
            ((android.view.autofill.AutofillManager) this.oh71FJcDz6S2).notifyViewVisibilityChanged(view, i, z);
        }
    }

    public java.lang.String toString() {
        switch (this.WDYagTQQm9ns) {
            case 5:
                return ((defpackage.mf1) this.oh71FJcDz6S2).toString();
            default:
                return super.toString();
        }
    }

    public boolean w7APNrr0aGRc(defpackage.jd0 jd0Var) {
        if (!jd0Var.KrtOTfE6jiS2()) {
            defpackage.e80.giKS3J6vZuNy("DepthSortedSet.remove called on an unattached node");
        }
        return ((defpackage.mf1) this.oh71FJcDz6S2).remove(jd0Var);
    }

    public /* synthetic */ k0(int i, java.lang.Object obj) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = obj;
    }

    public k0(defpackage.hp hpVar) {
        this.WDYagTQQm9ns = 28;
        this.oh71FJcDz6S2 = new defpackage.ix(defpackage.tf1.ZpBGe2uQfcn8, hpVar);
    }

    public k0(defpackage.yh1 yh1Var) {
        this.WDYagTQQm9ns = 29;
        yh1Var.getClass();
        this.oh71FJcDz6S2 = yh1Var;
    }

    public /* synthetic */ k0(int i, char c) {
        this.WDYagTQQm9ns = i;
    }

    public k0(android.view.View view) {
        this.WDYagTQQm9ns = 27;
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            defpackage.kf1 kf1Var = new defpackage.kf1(26, view);
            kf1Var.QiMR8OkAhezm = view;
            this.oh71FJcDz6S2 = kf1Var;
            return;
        }
        this.oh71FJcDz6S2 = new defpackage.k0(26, view);
    }

    public k0(long[] jArr) {
        defpackage.jn0 jn0Var;
        this.WDYagTQQm9ns = 25;
        if (jArr != null) {
            long[] copyOf = java.util.Arrays.copyOf(jArr, jArr.length);
            jn0Var = new defpackage.jn0(copyOf.length);
            int i = jn0Var.giKS3J6vZuNy;
            if (i >= 0) {
                if (copyOf.length != 0) {
                    int length = copyOf.length + i;
                    long[] jArr2 = jn0Var.ZpBGe2uQfcn8;
                    if (jArr2.length < length) {
                        jn0Var.ZpBGe2uQfcn8 = java.util.Arrays.copyOf(jArr2, java.lang.Math.max(length, (jArr2.length * 3) / 2));
                    }
                    long[] jArr3 = jn0Var.ZpBGe2uQfcn8;
                    int i2 = jn0Var.giKS3J6vZuNy;
                    if (i != i2) {
                        defpackage.y7.omM9cAlgeGXx(jArr3, jArr3, copyOf.length + i, i, i2);
                    }
                    defpackage.y7.omM9cAlgeGXx(copyOf, jArr3, i, 0, copyOf.length);
                    jn0Var.giKS3J6vZuNy += copyOf.length;
                }
            } else {
                defpackage.h7.WmetiUbpKU9I("");
                throw null;
            }
        } else {
            jn0Var = new defpackage.jn0();
        }
        this.oh71FJcDz6S2 = jn0Var;
    }

    public k0(int i) {
        this.WDYagTQQm9ns = 14;
        this.oh71FJcDz6S2 = defpackage.nq1.fNwYGHIYeJcR(new int[i]);
    }
}
