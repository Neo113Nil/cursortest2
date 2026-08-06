package defpackage;

/* loaded from: classes.dex */
public final class c1NqjJifC7 implements defpackage.u11, defpackage.zx0 {
    public static final defpackage.c1NqjJifC7 AARZUJiTa = new defpackage.c1NqjJifC7(0, new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});
    public static final defpackage.b20 EXtogiMhuM = new defpackage.b20(1);
    public final /* synthetic */ int adDC3e2L;
    public java.lang.Object xiZrDbcSW0;

    public c1NqjJifC7(int i) {
        defpackage.yi0 yi0Var;
        this.adDC3e2L = i;
        switch (i) {
            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                this.xiZrDbcSW0 = new java.util.concurrent.atomic.AtomicInteger(0);
                break;
            case 10:
                this.xiZrDbcSW0 = new defpackage.lb1(defpackage.gq1.oh6vYeIP);
                break;
            case 15:
                this.xiZrDbcSW0 = new java.util.HashMap();
                break;
            case 18:
                defpackage.mg0 mg0Var = new defpackage.mg0();
                this.xiZrDbcSW0 = mg0Var;
                if (!mg0Var.xiZrDbcSW0) {
                    if (mg0Var.AARZUJiTa) {
                        defpackage.ow0.IHQe1A4L2xu("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    mg0Var.IHQe1A4L2xu();
                    mg0Var.AARZUJiTa = true;
                    break;
                }
                break;
            case 19:
                this.xiZrDbcSW0 = new java.util.concurrent.CopyOnWriteArrayList();
                new java.util.HashMap();
                break;
            case 21:
                this.xiZrDbcSW0 = android.os.Build.VERSION.SDK_INT >= 28 ? new defpackage.ky(19) : new defpackage.ky(20);
                break;
            case 22:
                this.xiZrDbcSW0 = new defpackage.vf0();
                break;
            case 25:
                this.xiZrDbcSW0 = new defpackage.xk0();
                break;
            case 27:
                this.xiZrDbcSW0 = new android.graphics.Region();
                break;
            case 28:
                this.xiZrDbcSW0 = new defpackage.km0();
                break;
            default:
                defpackage.jy0 jy0Var = defpackage.jy0.r1MBDhnF;
                try {
                    yi0Var = (defpackage.yi0) java.lang.Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (java.lang.Exception unused) {
                    yi0Var = EXtogiMhuM;
                }
                defpackage.yi0[] yi0VarArr = {defpackage.b20.oh6vYeIP, yi0Var};
                defpackage.ng0 ng0Var = new defpackage.ng0();
                ng0Var.IHQe1A4L2xu = yi0VarArr;
                java.nio.charset.Charset charset = defpackage.q70.IHQe1A4L2xu;
                this.xiZrDbcSW0 = ng0Var;
                break;
        }
    }

    public static defpackage.dc0 JlrlGoKF(defpackage.c1NqjJifC7 c1nqjjifc7, int i) {
        defpackage.yc0 yc0Var = (defpackage.yc0) c1nqjjifc7.xiZrDbcSW0;
        defpackage.oa1 QoRHpC4k = defpackage.f70.QoRHpC4k();
        defpackage.g00 adDC3e2L = QoRHpC4k != null ? QoRHpC4k.adDC3e2L() : null;
        defpackage.oa1 fnWB2E7cs = defpackage.f70.fnWB2E7cs(QoRHpC4k);
        try {
            defpackage.sc0 sc0Var = (defpackage.sc0) yc0Var.xiZrDbcSW0.getValue();
            defpackage.f70.QQUzIjv3iOC5(QoRHpC4k, fnWB2E7cs, adDC3e2L);
            defpackage.ec0 ec0Var = yc0Var.QoRHpC4k;
            long j = sc0Var.SH1y5HwkJhh;
            boolean z = yc0Var.F7NU4MC0GW;
            defpackage.uc0 uc0Var = new defpackage.uc0(i, sc0Var);
            defpackage.q90 q90Var = ec0Var.r1MBDhnF;
            if (q90Var == null) {
                return defpackage.n.v5iciZok;
            }
            defpackage.v5 v5Var = ec0Var.oh6vYeIP;
            defpackage.kx0 kx0Var = (defpackage.kx0) q90Var.F7NU4MC0GW;
            boolean z2 = kx0Var instanceof defpackage.d3;
            defpackage.jx0 jx0Var = new defpackage.jx0(q90Var, i, v5Var, uc0Var);
            jx0Var.EXtogiMhuM = new defpackage.ki(j);
            if (!z2) {
                kx0Var.IHQe1A4L2xu(jx0Var);
            } else if (z) {
                defpackage.d3 d3Var = (defpackage.d3) kx0Var;
                d3Var.xiZrDbcSW0.add(new defpackage.tx0(1, jx0Var));
                if (!d3Var.AARZUJiTa) {
                    d3Var.AARZUJiTa = true;
                    d3Var.adDC3e2L.post(d3Var);
                }
            } else {
                defpackage.d3 d3Var2 = (defpackage.d3) kx0Var;
                d3Var2.xiZrDbcSW0.add(new defpackage.tx0(0, jx0Var));
                if (!d3Var2.AARZUJiTa) {
                    d3Var2.AARZUJiTa = true;
                    d3Var2.adDC3e2L.post(d3Var2);
                }
            }
            defpackage.fm.WLpAkxCo("compose:lazy:schedule_prefetch:index", i);
            return jx0Var;
        } catch (java.lang.Throwable th) {
            defpackage.f70.QQUzIjv3iOC5(QoRHpC4k, fnWB2E7cs, adDC3e2L);
            throw th;
        }
    }

    public void AARZUJiTa(android.view.View view, int i, boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 27) {
            ((android.view.autofill.AutofillManager) this.xiZrDbcSW0).notifyViewVisibilityChanged(view, i, z);
        }
    }

    public void DFo87pBq1E5(defpackage.e70 e70Var) {
        ((android.graphics.Region) this.xiZrDbcSW0).set(e70Var.IHQe1A4L2xu, e70Var.oh6vYeIP, e70Var.r1MBDhnF, e70Var.F7NU4MC0GW);
    }

    public defpackage.F7NU4MC0GW EXtogiMhuM(defpackage.F7NU4MC0GW f7nu4mc0gw, defpackage.v0 v0Var) {
        java.lang.Object obj;
        long j;
        boolean z;
        long frpfPPIgqM9O;
        defpackage.vf0 vf0Var = (defpackage.vf0) this.xiZrDbcSW0;
        java.util.List list = (java.util.List) f7nu4mc0gw.xiZrDbcSW0;
        defpackage.vf0 vf0Var2 = new defpackage.vf0(list.size());
        int size = list.size();
        int i = 0;
        while (i < size) {
            defpackage.uv0 uv0Var = (defpackage.uv0) list.get(i);
            long j2 = uv0Var.IHQe1A4L2xu;
            int kd6TUFXn = defpackage.s21.kd6TUFXn(vf0Var.xiZrDbcSW0, vf0Var.EXtogiMhuM, j2);
            if (kd6TUFXn < 0 || (obj = vf0Var.AARZUJiTa[kd6TUFXn]) == defpackage.gq1.JlrlGoKF) {
                obj = null;
            }
            defpackage.tv0 tv0Var = (defpackage.tv0) obj;
            if (tv0Var == null) {
                j = uv0Var.oh6vYeIP;
                frpfPPIgqM9O = uv0Var.F7NU4MC0GW;
                z = false;
            } else {
                j = tv0Var.IHQe1A4L2xu;
                z = tv0Var.r1MBDhnF;
                frpfPPIgqM9O = v0Var.frpfPPIgqM9O(tv0Var.oh6vYeIP);
            }
            long j3 = uv0Var.IHQe1A4L2xu;
            int i2 = i;
            java.util.List list2 = list;
            int i3 = size;
            vf0Var2.oh6vYeIP(j3, new defpackage.sv0(j3, uv0Var.oh6vYeIP, uv0Var.F7NU4MC0GW, uv0Var.adDC3e2L, uv0Var.xiZrDbcSW0, j, frpfPPIgqM9O, z, uv0Var.AARZUJiTa, uv0Var.riuEU0zW4, uv0Var.SH1y5HwkJhh, uv0Var.ez2rX8ReCYw, uv0Var.JlrlGoKF, uv0Var.DFo87pBq1E5));
            boolean z2 = uv0Var.adDC3e2L;
            if (z2) {
                vf0Var.oh6vYeIP(j2, new defpackage.tv0(uv0Var.oh6vYeIP, uv0Var.r1MBDhnF, z2));
            } else {
                vf0Var.r1MBDhnF(j2);
            }
            i = i2 + 1;
            list = list2;
            size = i3;
        }
        return new defpackage.F7NU4MC0GW(10, vf0Var2, f7nu4mc0gw);
    }

    public long F7NU4MC0GW() {
        switch (this.adDC3e2L) {
            case 9:
                defpackage.on onVar = (defpackage.on) this.xiZrDbcSW0;
                long F7NU4MC0GW = onVar.abhbClRa.F7NU4MC0GW();
                if (F7NU4MC0GW != 16) {
                    return F7NU4MC0GW;
                }
                defpackage.f21 f21Var = (defpackage.f21) defpackage.mj1.abhbClRa(onVar, defpackage.i21.IHQe1A4L2xu);
                if (f21Var != null) {
                    long j = f21Var.IHQe1A4L2xu;
                    if (j != 16) {
                        return j;
                    }
                }
                return ((defpackage.ae) defpackage.mj1.abhbClRa(onVar, defpackage.ti.IHQe1A4L2xu)).IHQe1A4L2xu;
            default:
                return ((defpackage.k21) this.xiZrDbcSW0).r1MBDhnF;
        }
    }

    public void IHQe1A4L2xu(defpackage.ma0 ma0Var) {
        if (!ma0Var.p4kuH6PDtgom()) {
            defpackage.x50.oh6vYeIP("DepthSortedSet.add called on an unattached node");
        }
        ((defpackage.lb1) this.xiZrDbcSW0).add(ma0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object SH1y5HwkJhh(defpackage.ej ejVar, defpackage.g00 g00Var) {
        defpackage.u91 u91Var;
        int i;
        defpackage.km0 km0Var = (defpackage.km0) this.xiZrDbcSW0;
        try {
            if (ejVar instanceof defpackage.u91) {
                u91Var = (defpackage.u91) ejVar;
                int i2 = u91Var.SH1y5HwkJhh;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    u91Var.SH1y5HwkJhh = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = u91Var.EXtogiMhuM;
                    i = u91Var.SH1y5HwkJhh;
                    defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
                    if (i != 0) {
                        defpackage.f70.nBH8hAHy(obj);
                        if (!km0Var.AARZUJiTa()) {
                            return ok1Var;
                        }
                        u91Var.SH1y5HwkJhh = 1;
                        java.lang.Object AARZUJiTa2 = g00Var.AARZUJiTa(u91Var);
                        java.lang.Object obj2 = defpackage.vj.adDC3e2L;
                        if (AARZUJiTa2 == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        defpackage.f70.nBH8hAHy(obj);
                    }
                    return ok1Var;
                }
            }
            if (i != 0) {
            }
            return ok1Var;
        } finally {
            km0Var.oh6vYeIP(null);
        }
        u91Var = new defpackage.u91(this, ejVar);
        java.lang.Object obj3 = u91Var.EXtogiMhuM;
        i = u91Var.SH1y5HwkJhh;
        defpackage.ok1 ok1Var2 = defpackage.ok1.IHQe1A4L2xu;
    }

    public void SyNS6RMn(float f, float f2) {
        ((defpackage.v5) this.xiZrDbcSW0).xiZrDbcSW0().adDC3e2L(f, f2);
    }

    @Override // defpackage.zx0
    public void adDC3e2L() {
        android.util.Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    public void cnag84Bm(int i, java.lang.Object obj, defpackage.c51 c51Var) {
        defpackage.rd rdVar = (defpackage.rd) this.xiZrDbcSW0;
        rdVar.UsuH8pd5P(i, 3);
        c51Var.xiZrDbcSW0((defpackage.QQUzIjv3iOC5) obj, rdVar.IHQe1A4L2xu);
        rdVar.UsuH8pd5P(i, 4);
    }

    public java.lang.Object ez2rX8ReCYw(defpackage.sb sbVar, defpackage.s4 s4Var) {
        defpackage.y91 y91Var;
        defpackage.w71 w71Var;
        int i;
        if (((defpackage.sg) this.xiZrDbcSW0) == null) {
            defpackage.nw0.oh6vYeIP("Called runAndWatch on a manager that has been disposed of");
        }
        defpackage.sg sgVar = (defpackage.sg) this.xiZrDbcSW0;
        if ((sgVar instanceof defpackage.y91) && (w71Var = (y91Var = (defpackage.y91) sgVar).xiZrDbcSW0) != null && !w71Var.equals(sbVar)) {
            defpackage.sk0 sk0Var = new defpackage.sk0();
            defpackage.w71 w71Var2 = y91Var.xiZrDbcSW0;
            if (w71Var2 == null) {
                defpackage.nw0.oh6vYeIP("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
            }
            defpackage.ol0 ol0Var = y91Var.F7NU4MC0GW;
            java.util.ArrayList arrayList = sk0Var.r1MBDhnF;
            if (ol0Var == null) {
                java.lang.Object obj = y91Var.oh6vYeIP;
                obj.getClass();
                arrayList.add(new defpackage.pk0(obj, w71Var2));
            } else {
                java.lang.Object[] objArr = ol0Var.oh6vYeIP;
                long[] jArr = ol0Var.IHQe1A4L2xu;
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
                                    arrayList.add(new defpackage.pk0(objArr[(i2 << 3) + i5], w71Var2));
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
            sk0Var.F7NU4MC0GW();
            y91Var.adDC3e2L();
            this.xiZrDbcSW0 = sk0Var;
        }
        defpackage.sg sgVar2 = (defpackage.sg) this.xiZrDbcSW0;
        sgVar2.getClass();
        defpackage.oa1 kNAkVymC = defpackage.wa1.SH1y5HwkJhh().kNAkVymC(sgVar2.EXtogiMhuM(sbVar));
        sgVar2.r1MBDhnF(sbVar);
        try {
            defpackage.oa1 SH1y5HwkJhh = kNAkVymC.SH1y5HwkJhh();
            try {
                java.lang.Object IHQe1A4L2xu = s4Var.IHQe1A4L2xu();
                kNAkVymC.r1MBDhnF();
                sgVar2.F7NU4MC0GW();
                return IHQe1A4L2xu;
            } finally {
                defpackage.oa1.G3OKOH3wZRC(SH1y5HwkJhh);
            }
        } catch (java.lang.Throwable th) {
            kNAkVymC.r1MBDhnF();
            throw th;
        }
    }

    public void oh6vYeIP() {
        ((defpackage.fh) this.xiZrDbcSW0).getClass();
    }

    public defpackage.ec1 r1MBDhnF() {
        defpackage.ws IHQe1A4L2xu = defpackage.ws.IHQe1A4L2xu();
        if (IHQe1A4L2xu.oh6vYeIP() == 1) {
            return new defpackage.u40(true);
        }
        defpackage.qt0 nBH8hAHy = defpackage.c80.nBH8hAHy(java.lang.Boolean.FALSE);
        defpackage.tm tmVar = new defpackage.tm(nBH8hAHy, this);
        IHQe1A4L2xu.IHQe1A4L2xu.writeLock().lock();
        try {
            if (IHQe1A4L2xu.r1MBDhnF != 1 && IHQe1A4L2xu.r1MBDhnF != 2) {
                IHQe1A4L2xu.oh6vYeIP.add(tmVar);
                IHQe1A4L2xu.IHQe1A4L2xu.writeLock().unlock();
                return nBH8hAHy;
            }
            IHQe1A4L2xu.F7NU4MC0GW.post(new defpackage.us(java.util.Arrays.asList(tmVar), IHQe1A4L2xu.r1MBDhnF, null));
            IHQe1A4L2xu.IHQe1A4L2xu.writeLock().unlock();
            return nBH8hAHy;
        } catch (java.lang.Throwable th) {
            IHQe1A4L2xu.IHQe1A4L2xu.writeLock().unlock();
            throw th;
        }
    }

    public boolean riuEU0zW4(defpackage.ma0 ma0Var) {
        if (!ma0Var.p4kuH6PDtgom()) {
            defpackage.x50.oh6vYeIP("DepthSortedSet.remove called on an unattached node");
        }
        return ((defpackage.lb1) this.xiZrDbcSW0).remove(ma0Var);
    }

    public java.lang.String toString() {
        switch (this.adDC3e2L) {
            case 0:
                return "Bradford";
            case 10:
                return ((defpackage.lb1) this.xiZrDbcSW0).toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.zx0
    public void xiZrDbcSW0(int i, java.lang.Object obj) {
        java.lang.String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                str = "RESULT_NOT_WRITABLE";
                break;
            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
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
        ((androidx.profileinstaller.ProfileInstallReceiver) this.xiZrDbcSW0).setResultCode(i);
    }

    public /* synthetic */ c1NqjJifC7(int i, boolean z) {
        this.adDC3e2L = i;
    }

    public c1NqjJifC7(defpackage.rd rdVar) {
        this.adDC3e2L = 6;
        defpackage.q70.IHQe1A4L2xu(rdVar, "output");
        this.xiZrDbcSW0 = rdVar;
        rdVar.IHQe1A4L2xu = this;
    }

    public c1NqjJifC7(boolean z) {
        this.adDC3e2L = 3;
        this.xiZrDbcSW0 = new java.util.concurrent.atomic.AtomicBoolean(z);
    }

    public c1NqjJifC7(android.view.View view) {
        this.adDC3e2L = 16;
        this.xiZrDbcSW0 = view;
        defpackage.c80.NHJTzaLwkd(defpackage.ed0.xiZrDbcSW0, new defpackage.s4(4, this));
    }

    public /* synthetic */ c1NqjJifC7(int i, java.lang.Object obj) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = obj;
    }
}
