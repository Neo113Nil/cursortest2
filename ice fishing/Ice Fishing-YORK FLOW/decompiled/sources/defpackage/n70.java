package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class n70 {
    public static defpackage.j60 JhCgjQRTAOCT = null;
    public static final int ZpBGe2uQfcn8 = 9;
    public static final int fWTAfUmVKrZq = 12;
    public static final int giKS3J6vZuNy = 10;

    public static final defpackage.bn1 BHfvd2J71qpO(defpackage.fb1 fb1Var) {
        defpackage.y10 y10Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Object QiMR8OkAhezm = fb1Var.WDYagTQQm9ns.QiMR8OkAhezm(defpackage.eb1.ZpBGe2uQfcn8);
        if (QiMR8OkAhezm == null) {
            QiMR8OkAhezm = null;
        }
        defpackage.xahdJg25P1Bv xahdjg25p1bv = (defpackage.xahdJg25P1Bv) QiMR8OkAhezm;
        if (xahdjg25p1bv == null || (y10Var = (defpackage.y10) xahdjg25p1bv.giKS3J6vZuNy) == null || !((java.lang.Boolean) y10Var.P05cfTpS5W5L(arrayList)).booleanValue()) {
            return null;
        }
        return (defpackage.bn1) arrayList.get(0);
    }

    public static final void GE9mJIPrb8gP(int i, int i2) {
        if (i < 0 || i >= i2) {
            defpackage.h7.WmetiUbpKU9I(defpackage.pVQOaWB9QMo4.P05cfTpS5W5L(i, i2, "index: ", ", size: "));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object IBvW5fLsPuHy(long j, defpackage.c20 c20Var, defpackage.ll llVar) {
        defpackage.io1 io1Var;
        int i;
        defpackage.z31 z31Var;
        if (llVar instanceof defpackage.io1) {
            io1Var = (defpackage.io1) llVar;
            int i2 = io1Var.GE9mJIPrb8gP;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                io1Var.GE9mJIPrb8gP = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = io1Var.e6mdH7fiFuta;
                i = io1Var.GE9mJIPrb8gP;
                if (i != 0) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    if (j > 0) {
                        defpackage.z31 z31Var2 = new defpackage.z31();
                        try {
                            io1Var.P05cfTpS5W5L = z31Var2;
                            io1Var.GE9mJIPrb8gP = 1;
                            defpackage.ho1 ho1Var = new defpackage.ho1(j, io1Var);
                            z31Var2.WDYagTQQm9ns = ho1Var;
                            java.lang.Object jjTN4uUnoyEn = jjTN4uUnoyEn(ho1Var, c20Var);
                            defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
                            return jjTN4uUnoyEn == tmVar ? tmVar : jjTN4uUnoyEn;
                        } catch (defpackage.go1 e) {
                            e = e;
                            z31Var = z31Var2;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z31Var = io1Var.P05cfTpS5W5L;
                try {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    return obj;
                } catch (defpackage.go1 e2) {
                    e = e2;
                }
                if (e.WDYagTQQm9ns != z31Var.WDYagTQQm9ns) {
                    throw e;
                }
                return null;
            }
        }
        io1Var = new defpackage.io1(llVar);
        java.lang.Object obj2 = io1Var.e6mdH7fiFuta;
        i = io1Var.GE9mJIPrb8gP;
        if (i != 0) {
        }
        if (e.WDYagTQQm9ns != z31Var.WDYagTQQm9ns) {
        }
        return null;
    }

    public static final boolean IJ0hOnjhPOri(float f, float f2, defpackage.s2 s2Var) {
        float f3 = f - 0.005f;
        float f4 = f2 - 0.005f;
        float f5 = f + 0.005f;
        float f6 = f2 + 0.005f;
        defpackage.s2 ZpBGe2uQfcn82 = defpackage.u2.ZpBGe2uQfcn8();
        if (java.lang.Float.isNaN(f3) || java.lang.Float.isNaN(f4) || java.lang.Float.isNaN(f5) || java.lang.Float.isNaN(f6)) {
            defpackage.u2.giKS3J6vZuNy("Invalid rectangle, make sure no value is NaN");
        }
        if (ZpBGe2uQfcn82.giKS3J6vZuNy == null) {
            ZpBGe2uQfcn82.giKS3J6vZuNy = new android.graphics.RectF();
        }
        android.graphics.RectF rectF = ZpBGe2uQfcn82.giKS3J6vZuNy;
        rectF.getClass();
        rectF.set(f3, f4, f5, f6);
        android.graphics.Path path = ZpBGe2uQfcn82.ZpBGe2uQfcn8;
        android.graphics.RectF rectF2 = ZpBGe2uQfcn82.giKS3J6vZuNy;
        rectF2.getClass();
        path.addRect(rectF2, android.graphics.Path.Direction.CCW);
        defpackage.s2 ZpBGe2uQfcn83 = defpackage.u2.ZpBGe2uQfcn8();
        ZpBGe2uQfcn83.WDYagTQQm9ns(s2Var, ZpBGe2uQfcn82, 1);
        boolean isEmpty = ZpBGe2uQfcn83.ZpBGe2uQfcn8.isEmpty();
        ZpBGe2uQfcn83.oh71FJcDz6S2();
        ZpBGe2uQfcn82.oh71FJcDz6S2();
        return !isEmpty;
    }

    public static final void JhCgjQRTAOCT(defpackage.vl0 vl0Var, defpackage.nh nhVar, defpackage.e30 e30Var, int i) {
        int i2;
        defpackage.vl0 vl0Var2;
        defpackage.nh nhVar2;
        e30Var.PS16moFv2oLu(790527681);
        if ((i & 6) == 0) {
            i2 = (e30Var.oh71FJcDz6S2(vl0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e30Var.P05cfTpS5W5L(nhVar) ? 32 : 16;
        }
        if (e30Var.zJPqDeoF0Os1(i2 & 1, (i2 & 19) != 18)) {
            java.lang.Object GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
            defpackage.pa1 pa1Var = defpackage.cj.ZpBGe2uQfcn8;
            if (GcLuU6pT9wO9 == pa1Var) {
                defpackage.pw0 pw0Var = new defpackage.pw0(null, defpackage.jVUAPb5NnIYW.z16KqenTjq8o);
                e30Var.EgL5gQQnyJKX(pw0Var);
                GcLuU6pT9wO9 = pw0Var;
            }
            defpackage.fo0 fo0Var = (defpackage.fo0) GcLuU6pT9wO9;
            java.lang.Object GcLuU6pT9wO92 = e30Var.GcLuU6pT9wO9();
            if (GcLuU6pT9wO92 == pa1Var) {
                GcLuU6pT9wO92 = new defpackage.g4(fo0Var, 7);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO92);
            }
            defpackage.n10 n10Var = (defpackage.n10) GcLuU6pT9wO92;
            defpackage.e11 e11Var = defpackage.qo.ZpBGe2uQfcn8;
            defpackage.r9 h3m55N1URyyK = defpackage.la0.h3m55N1URyyK(defpackage.h0.oh71FJcDz6S2, e30Var, 6);
            vl0Var2 = vl0Var;
            nhVar2 = nhVar;
            defpackage.vx1.JhCgjQRTAOCT(new defpackage.v21[]{defpackage.kk1.giKS3J6vZuNy.ZpBGe2uQfcn8(defpackage.vx1.KrtOTfE6jiS2(n10Var, e30Var, 2)), defpackage.kk1.ZpBGe2uQfcn8.ZpBGe2uQfcn8(h3m55N1URyyK)}, defpackage.nn.OcTWLQzke1i2(1070596993, new defpackage.vy0(vl0Var2, fo0Var, nhVar2, h3m55N1URyyK, n10Var), e30Var), e30Var, 56);
        } else {
            vl0Var2 = vl0Var;
            nhVar2 = nhVar;
            e30Var.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.f4(vl0Var2, nhVar2, i, 3);
        }
    }

    public static final java.lang.Object KrtOTfE6jiS2(long j, defpackage.oh71FJcDz6S2 oh71fjcdz6s2, defpackage.n01 n01Var) {
        long j2;
        defpackage.pa1 pa1Var = defpackage.jt.WDYagTQQm9ns;
        boolean z = j > 0;
        if (z) {
            long giKS3J6vZuNy2 = defpackage.jt.giKS3J6vZuNy(j, defpackage.vx1.zJPqDeoF0Os1(999999L, defpackage.mt.NANOSECONDS));
            if ((((int) giKS3J6vZuNy2) & 1) == 1) {
                if (!(giKS3J6vZuNy2 == defpackage.jt.oh71FJcDz6S2 || giKS3J6vZuNy2 == defpackage.jt.QiMR8OkAhezm)) {
                    j2 = giKS3J6vZuNy2 >> 1;
                }
            }
            j2 = defpackage.jt.fWTAfUmVKrZq(giKS3J6vZuNy2, defpackage.mt.MILLISECONDS);
        } else {
            if (z) {
                defpackage.h7.T1fB7bDYiVJQ();
                return null;
            }
            j2 = 0;
        }
        if (j2 > 0) {
            return jjTN4uUnoyEn(new defpackage.ho1(j2, n01Var), oh71fjcdz6s2);
        }
        throw new defpackage.go1("Timed out immediately", null);
    }

    public static final java.lang.String Mearx7yMn90V(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    public static final void Ns0WNyEWdPsk(int i, int i2) {
        if (i < 0 || i > i2) {
            defpackage.h7.WmetiUbpKU9I(defpackage.pVQOaWB9QMo4.P05cfTpS5W5L(i, i2, "index: ", ", size: "));
        }
    }

    public static defpackage.kl0 OcTWLQzke1i2(java.nio.MappedByteBuffer mappedByteBuffer) {
        long j;
        java.nio.ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(java.nio.ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i = duplicate.getShort() & 65535;
        if (i > 100) {
            throw new java.io.IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            duplicate.position(duplicate.position() + ((int) (j - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j2 = duplicate.getInt() & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = duplicate.getInt();
                long j3 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    duplicate.position((int) (j3 + j));
                    defpackage.kl0 kl0Var = new defpackage.kl0();
                    duplicate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    kl0Var.P05cfTpS5W5L = duplicate;
                    kl0Var.WDYagTQQm9ns = position;
                    int i6 = position - duplicate.getInt(position);
                    kl0Var.oh71FJcDz6S2 = i6;
                    kl0Var.QiMR8OkAhezm = ((java.nio.ByteBuffer) kl0Var.P05cfTpS5W5L).getShort(i6);
                    return kl0Var;
                }
            }
        }
        throw new java.io.IOException("Cannot read metadata.");
    }

    public static final void P05cfTpS5W5L(boolean z, defpackage.a51 a51Var, defpackage.em1 em1Var, defpackage.e30 e30Var, int i) {
        int i2;
        defpackage.cn1 JhCgjQRTAOCT2;
        e30Var.PS16moFv2oLu(-1344558920);
        if ((i & 6) == 0) {
            i2 = (e30Var.QiMR8OkAhezm(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e30Var.JhCgjQRTAOCT(a51Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e30Var.P05cfTpS5W5L(em1Var) ? 256 : 128;
        }
        if (e30Var.zJPqDeoF0Os1(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 14;
            boolean oh71FJcDz6S2 = (i3 == 4) | e30Var.oh71FJcDz6S2(em1Var);
            java.lang.Object GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
            defpackage.pa1 pa1Var = defpackage.cj.ZpBGe2uQfcn8;
            if (oh71FJcDz6S2 || GcLuU6pT9wO9 == pa1Var) {
                GcLuU6pT9wO9 = new defpackage.bm1(em1Var, z);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO9);
            }
            defpackage.uk1 uk1Var = (defpackage.uk1) GcLuU6pT9wO9;
            boolean P05cfTpS5W5L = (i3 == 4) | e30Var.P05cfTpS5W5L(em1Var);
            java.lang.Object GcLuU6pT9wO92 = e30Var.GcLuU6pT9wO9();
            if (P05cfTpS5W5L || GcLuU6pT9wO92 == pa1Var) {
                GcLuU6pT9wO92 = new defpackage.fm1(em1Var, z);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO92);
            }
            defpackage.at0 at0Var = (defpackage.at0) GcLuU6pT9wO92;
            boolean QiMR8OkAhezm = defpackage.in1.QiMR8OkAhezm(em1Var.gUjdnLbkVAaA().giKS3J6vZuNy);
            int i4 = (int) (z ? em1Var.gUjdnLbkVAaA().giKS3J6vZuNy >> 32 : em1Var.gUjdnLbkVAaA().giKS3J6vZuNy & 4294967295L);
            defpackage.hg0 hg0Var = em1Var.JhCgjQRTAOCT;
            float f = 0.0f;
            if (hg0Var != null && (JhCgjQRTAOCT2 = hg0Var.JhCgjQRTAOCT()) != null) {
                defpackage.bn1 bn1Var = JhCgjQRTAOCT2.ZpBGe2uQfcn8;
                if (i4 >= 0) {
                    defpackage.an1 an1Var = bn1Var.ZpBGe2uQfcn8;
                    defpackage.wm0 wm0Var = bn1Var.giKS3J6vZuNy;
                    if (an1Var.ZpBGe2uQfcn8.oh71FJcDz6S2.length() != 0) {
                        int min = java.lang.Math.min(wm0Var.JhCgjQRTAOCT(i4), java.lang.Math.min(wm0Var.giKS3J6vZuNy - 1, wm0Var.oh71FJcDz6S2 - 1));
                        if (i4 <= wm0Var.fWTAfUmVKrZq(min, false)) {
                            wm0Var.fNwYGHIYeJcR(min);
                            java.util.ArrayList arrayList = wm0Var.P05cfTpS5W5L;
                            defpackage.dw0 dw0Var = (defpackage.dw0) arrayList.get(defpackage.wc1.dG7RjM6DqYVL(min, arrayList));
                            defpackage.m2 m2Var = dw0Var.ZpBGe2uQfcn8;
                            int i5 = min - dw0Var.JhCgjQRTAOCT;
                            defpackage.zm1 zm1Var = m2Var.JhCgjQRTAOCT;
                            f = zm1Var.WDYagTQQm9ns(i5) - zm1Var.P05cfTpS5W5L(i5);
                        }
                    }
                }
            }
            float f2 = f;
            boolean P05cfTpS5W5L2 = e30Var.P05cfTpS5W5L(uk1Var);
            java.lang.Object GcLuU6pT9wO93 = e30Var.GcLuU6pT9wO9();
            if (P05cfTpS5W5L2 || GcLuU6pT9wO93 == pa1Var) {
                GcLuU6pT9wO93 = new defpackage.k1(6, uk1Var);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO93);
            }
            defpackage.nq1.gUjdnLbkVAaA(at0Var, z, a51Var, QiMR8OkAhezm, 0L, f2, defpackage.oi1.ZpBGe2uQfcn8(defpackage.sl0.ZpBGe2uQfcn8, uk1Var, (androidx.compose.ui.input.pointer.PointerInputEventHandler) GcLuU6pT9wO93), e30Var, (i2 << 3) & 1008);
        } else {
            e30Var.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.u3(z, a51Var, em1Var, i);
        }
    }

    public static final void QiMR8OkAhezm(defpackage.i71 i71Var, defpackage.nh nhVar, defpackage.e30 e30Var, int i) {
        e30Var.PS16moFv2oLu(832919318);
        int i2 = (e30Var.P05cfTpS5W5L(i71Var) ? 4 : 2) | i | (e30Var.P05cfTpS5W5L(nhVar) ? 32 : 16);
        if ((i2 & 19) == 18 && e30Var.OcTWLQzke1i2()) {
            e30Var.Jkfc0NcwyPL8();
        } else {
            java.lang.Object GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
            if (GcLuU6pT9wO9 == defpackage.cj.ZpBGe2uQfcn8) {
                GcLuU6pT9wO9 = new defpackage.awuGf4qH8HFd(24);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO9);
            }
            defpackage.y10 y10Var = (defpackage.y10) GcLuU6pT9wO9;
            defpackage.ru1 ZpBGe2uQfcn82 = defpackage.mi0.ZpBGe2uQfcn8(e30Var);
            if (ZpBGe2uQfcn82 == null) {
                defpackage.h7.P05cfTpS5W5L("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            defpackage.ne ZpBGe2uQfcn83 = defpackage.b41.ZpBGe2uQfcn8(defpackage.i9.class);
            defpackage.y70 y70Var = new defpackage.y70(0);
            y70Var.ZpBGe2uQfcn8(defpackage.b41.ZpBGe2uQfcn8(defpackage.i9.class), y10Var);
            defpackage.x70 giKS3J6vZuNy2 = y70Var.giKS3J6vZuNy();
            defpackage.ym JhCgjQRTAOCT2 = ZpBGe2uQfcn82 instanceof defpackage.y40 ? ((defpackage.y40) ZpBGe2uQfcn82).JhCgjQRTAOCT() : defpackage.xm.giKS3J6vZuNy;
            JhCgjQRTAOCT2.getClass();
            defpackage.s81 s81Var = new defpackage.s81(ZpBGe2uQfcn82.WDYagTQQm9ns(), giKS3J6vZuNy2, JhCgjQRTAOCT2);
            java.lang.String giKS3J6vZuNy3 = ZpBGe2uQfcn83.giKS3J6vZuNy();
            if (giKS3J6vZuNy3 == null) {
                defpackage.h7.w7APNrr0aGRc("Local and anonymous classes can not be ViewModels");
                return;
            } else {
                defpackage.i9 i9Var = (defpackage.i9) s81Var.WmetiUbpKU9I(ZpBGe2uQfcn83, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(giKS3J6vZuNy3));
                i9Var.JhCgjQRTAOCT = new defpackage.yu1(i71Var);
                i71Var.giKS3J6vZuNy(i9Var.fWTAfUmVKrZq, nhVar, e30Var, ((i2 << 6) & 896) | (i2 & 112));
            }
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.yh0(i, 12, i71Var, nhVar);
        }
    }

    public static final int T1fB7bDYiVJQ(java.lang.String str, int i) {
        defpackage.ju WmetiUbpKU9I = WmetiUbpKU9I();
        java.lang.Integer num = null;
        if (WmetiUbpKU9I != null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(WmetiUbpKU9I.giKS3J6vZuNy(str, java.lang.Math.max(0, i - 1)));
            if (valueOf.intValue() != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        java.text.BreakIterator characterInstance = java.text.BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    public static final void UmgHb6n58gfG(defpackage.u4 u4Var, int i) {
        java.lang.Object obj;
        java.util.Iterator<T> it = u4Var.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((defpackage.jd0) ((java.util.Map.Entry) obj).getKey()).oh71FJcDz6S2 == i) {
                    break;
                }
            }
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        if (entry == null || entry.getValue() == null) {
            return;
        }
        defpackage.p81.ZpBGe2uQfcn8();
    }

    public static final boolean VFeft99leXEK(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (intBitsToFloat2 * intBitsToFloat2)) + ((f5 * f5) / (intBitsToFloat * intBitsToFloat)) <= 1.0f;
    }

    public static final void WDYagTQQm9ns(defpackage.vl0 vl0Var, defpackage.nh nhVar, defpackage.e30 e30Var, int i) {
        int i2;
        e30Var.PS16moFv2oLu(155925518);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (e30Var.oh71FJcDz6S2(vl0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e30Var.P05cfTpS5W5L(nhVar) ? 32 : 16;
        }
        if (e30Var.zJPqDeoF0Os1(i2 & 1, (i2 & 19) != 18)) {
            boolean z = e30Var.GE9mJIPrb8gP(defpackage.kk1.ZpBGe2uQfcn8) != null;
            boolean z2 = e30Var.GE9mJIPrb8gP(defpackage.kk1.giKS3J6vZuNy) != null;
            if (z && z2) {
                e30Var.NkfcFfdaVTox(-1977187922);
                defpackage.vk0 JhCgjQRTAOCT2 = defpackage.ab.JhCgjQRTAOCT(defpackage.jVUAPb5NnIYW.oh71FJcDz6S2, true);
                int hashCode = java.lang.Long.hashCode(e30Var.CZa7MwI9IzLd);
                defpackage.ay0 fNwYGHIYeJcR = e30Var.fNwYGHIYeJcR();
                defpackage.vl0 oCu53ZX2v4Ju = defpackage.i61.oCu53ZX2v4Ju(e30Var, vl0Var);
                defpackage.wi.fWTAfUmVKrZq.getClass();
                defpackage.pj pjVar = defpackage.vi.giKS3J6vZuNy;
                e30Var.fhbmYuu9J3cT();
                if (e30Var.Fu5WBEia9jBo) {
                    e30Var.Ns0WNyEWdPsk(pjVar);
                } else {
                    e30Var.lXYSMswtzmix();
                }
                defpackage.t80.w6IV1lieBIux(defpackage.vi.oh71FJcDz6S2, e30Var, JhCgjQRTAOCT2);
                defpackage.t80.w6IV1lieBIux(defpackage.vi.WDYagTQQm9ns, e30Var, fNwYGHIYeJcR);
                defpackage.t80.w6IV1lieBIux(defpackage.vi.QiMR8OkAhezm, e30Var, java.lang.Integer.valueOf(hashCode));
                defpackage.t80.Mearx7yMn90V(e30Var, defpackage.vi.P05cfTpS5W5L);
                defpackage.t80.w6IV1lieBIux(defpackage.vi.JhCgjQRTAOCT, e30Var, oCu53ZX2v4Ju);
                nhVar.QiMR8OkAhezm(e30Var, java.lang.Integer.valueOf((i2 >> 3) & 14));
                e30Var.XntWc4eZSQ8j(true);
                e30Var.XntWc4eZSQ8j(false);
            } else if (z) {
                e30Var.NkfcFfdaVTox(-1976997706);
                defpackage.vx1.oh71FJcDz6S2(vl0Var, nhVar, e30Var, i2 & 126);
                e30Var.XntWc4eZSQ8j(false);
            } else if (z2) {
                e30Var.NkfcFfdaVTox(-1976846922);
                defpackage.qo.JhCgjQRTAOCT(vl0Var, nhVar, e30Var, i2 & 126);
                e30Var.XntWc4eZSQ8j(false);
            } else {
                e30Var.NkfcFfdaVTox(-1976716505);
                JhCgjQRTAOCT(vl0Var, nhVar, e30Var, i2 & 126);
                e30Var.XntWc4eZSQ8j(false);
            }
        } else {
            e30Var.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.f4(vl0Var, nhVar, i, i3);
        }
    }

    public static final defpackage.ju WmetiUbpKU9I() {
        if (!defpackage.ju.JhCgjQRTAOCT()) {
            return null;
        }
        defpackage.ju ZpBGe2uQfcn82 = defpackage.ju.ZpBGe2uQfcn8();
        if (ZpBGe2uQfcn82.fWTAfUmVKrZq() == 1) {
            return ZpBGe2uQfcn82;
        }
        return null;
    }

    public static final java.lang.Class XntWc4eZSQ8j(defpackage.hc1 hc1Var) {
        java.lang.String Wc0TdmRSwbbi = defpackage.ah1.Wc0TdmRSwbbi(hc1Var.ZpBGe2uQfcn8(), "?", "");
        try {
            return java.lang.Class.forName(Wc0TdmRSwbbi);
        } catch (java.lang.ClassNotFoundException unused) {
            if (defpackage.tg1.Jkfc0NcwyPL8(Wc0TdmRSwbbi, ".", false)) {
                java.util.regex.Pattern compile = java.util.regex.Pattern.compile("(\\.+)(?!.*\\.)");
                compile.getClass();
                java.lang.String replaceAll = compile.matcher(Wc0TdmRSwbbi).replaceAll("\\$");
                replaceAll.getClass();
                return java.lang.Class.forName(replaceAll);
            }
            java.lang.String str = "Cannot find class with name \"" + hc1Var.ZpBGe2uQfcn8() + "\". Ensure that the serialName for this argument is the default fully qualified name";
            if (hc1Var.giKS3J6vZuNy() instanceof defpackage.lc1) {
                str = str.concat(".\nIf the build is minified, try annotating the Enum class with \"androidx.annotation.Keep\" to ensure the Enum is not removed.");
            }
            defpackage.h7.w7APNrr0aGRc(str);
            return null;
        }
    }

    public static final float ZVVdXbWmyCSK(defpackage.t61 t61Var) {
        if (t61Var != null) {
            return t61Var.ZpBGe2uQfcn8;
        }
        return 0.0f;
    }

    public static final void ZpBGe2uQfcn8(final java.lang.Object obj, final int i, final defpackage.ve0 ve0Var, final defpackage.nh nhVar, defpackage.e30 e30Var, final int i2) {
        int i3;
        e30Var.PS16moFv2oLu(872548579);
        if ((i2 & 6) == 0) {
            i3 = (e30Var.P05cfTpS5W5L(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e30Var.JhCgjQRTAOCT(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= e30Var.P05cfTpS5W5L(ve0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= e30Var.P05cfTpS5W5L(nhVar) ? 2048 : 1024;
        }
        if (e30Var.zJPqDeoF0Os1(i3 & 1, (i3 & 1171) != 1170)) {
            boolean oh71FJcDz6S2 = e30Var.oh71FJcDz6S2(obj) | e30Var.oh71FJcDz6S2(ve0Var);
            java.lang.Object GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
            java.lang.Object obj2 = defpackage.cj.ZpBGe2uQfcn8;
            if (oh71FJcDz6S2 || GcLuU6pT9wO9 == obj2) {
                GcLuU6pT9wO9 = new defpackage.te0(obj, ve0Var);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO9);
            }
            defpackage.te0 te0Var = (defpackage.te0) GcLuU6pT9wO9;
            te0Var.fWTAfUmVKrZq = i;
            defpackage.pw0 pw0Var = te0Var.QiMR8OkAhezm;
            defpackage.t21 t21Var = defpackage.py0.ZpBGe2uQfcn8;
            defpackage.te0 te0Var2 = (defpackage.te0) e30Var.GE9mJIPrb8gP(t21Var);
            defpackage.me1 BHfvd2J71qpO = defpackage.t80.BHfvd2J71qpO();
            defpackage.y10 WDYagTQQm9ns = BHfvd2J71qpO != null ? BHfvd2J71qpO.WDYagTQQm9ns() : null;
            defpackage.me1 UmgHb6n58gfG = defpackage.t80.UmgHb6n58gfG(BHfvd2J71qpO);
            try {
                if (te0Var2 != ((defpackage.te0) pw0Var.getValue())) {
                    pw0Var.setValue(te0Var2);
                    if (te0Var.JhCgjQRTAOCT > 0) {
                        defpackage.te0 te0Var3 = te0Var.WDYagTQQm9ns;
                        if (te0Var3 != null) {
                            te0Var3.giKS3J6vZuNy();
                        }
                        if (te0Var2 != null) {
                            te0Var2.ZpBGe2uQfcn8();
                        } else {
                            te0Var2 = null;
                        }
                        te0Var.WDYagTQQm9ns = te0Var2;
                    }
                }
                defpackage.t80.IBvW5fLsPuHy(BHfvd2J71qpO, UmgHb6n58gfG, WDYagTQQm9ns);
                boolean oh71FJcDz6S22 = e30Var.oh71FJcDz6S2(te0Var);
                java.lang.Object GcLuU6pT9wO92 = e30Var.GcLuU6pT9wO9();
                if (oh71FJcDz6S22 || GcLuU6pT9wO92 == obj2) {
                    GcLuU6pT9wO92 = new defpackage.fNwYGHIYeJcR(14, te0Var);
                    e30Var.EgL5gQQnyJKX(GcLuU6pT9wO92);
                }
                defpackage.nq1.oh71FJcDz6S2(te0Var, (defpackage.y10) GcLuU6pT9wO92, e30Var);
                defpackage.vx1.fWTAfUmVKrZq(t21Var.ZpBGe2uQfcn8(te0Var), nhVar, e30Var, ((i3 >> 6) & 112) | 8);
            } catch (java.lang.Throwable th) {
                defpackage.t80.IBvW5fLsPuHy(BHfvd2J71qpO, UmgHb6n58gfG, WDYagTQQm9ns);
                throw th;
            }
        } else {
            e30Var.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.c20() { // from class: ue0
                @Override // defpackage.c20
                public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj3, java.lang.Object obj4) {
                    ((java.lang.Integer) obj4).getClass();
                    defpackage.n70.ZpBGe2uQfcn8(obj, i, ve0Var, nhVar, (defpackage.e30) obj3, defpackage.m90.IBvW5fLsPuHy(i2 | 1));
                    return defpackage.gs1.ZpBGe2uQfcn8;
                }
            };
        }
    }

    public static final defpackage.dt1 blKFvluuDQOf(defpackage.j60 j60Var, defpackage.e30 e30Var) {
        defpackage.hp hpVar = (defpackage.hp) e30Var.GE9mJIPrb8gP(defpackage.rj.P05cfTpS5W5L);
        float f = j60Var.GE9mJIPrb8gP;
        boolean WDYagTQQm9ns = e30Var.WDYagTQQm9ns((java.lang.Float.floatToRawIntBits(hpVar.giKS3J6vZuNy()) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32));
        java.lang.Object GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
        if (WDYagTQQm9ns || GcLuU6pT9wO9 == defpackage.cj.ZpBGe2uQfcn8) {
            defpackage.l40 l40Var = new defpackage.l40();
            h3m55N1URyyK(l40Var, j60Var.oh71FJcDz6S2);
            float f2 = j60Var.giKS3J6vZuNy;
            float f3 = j60Var.fWTAfUmVKrZq;
            long floatToRawIntBits = (java.lang.Float.floatToRawIntBits(hpVar.dG7RjM6DqYVL(f2)) << 32) | (java.lang.Float.floatToRawIntBits(hpVar.dG7RjM6DqYVL(f3)) & 4294967295L);
            float f4 = j60Var.JhCgjQRTAOCT;
            float f5 = j60Var.WDYagTQQm9ns;
            if (java.lang.Float.isNaN(f4)) {
                f4 = java.lang.Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            }
            if (java.lang.Float.isNaN(f5)) {
                f5 = java.lang.Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
            }
            long floatToRawIntBits2 = (java.lang.Float.floatToRawIntBits(f4) << 32) | (4294967295L & java.lang.Float.floatToRawIntBits(f5));
            defpackage.dt1 dt1Var = new defpackage.dt1(l40Var);
            java.lang.String str = j60Var.ZpBGe2uQfcn8;
            long j = j60Var.QiMR8OkAhezm;
            defpackage.ga gaVar = j != 16 ? new defpackage.ga(j60Var.P05cfTpS5W5L, j) : null;
            boolean z = j60Var.e6mdH7fiFuta;
            dt1Var.WDYagTQQm9ns.setValue(new defpackage.ae1(floatToRawIntBits));
            dt1Var.oh71FJcDz6S2.setValue(java.lang.Boolean.valueOf(z));
            defpackage.ys1 ys1Var = dt1Var.QiMR8OkAhezm;
            ys1Var.QiMR8OkAhezm.setValue(gaVar);
            ys1Var.e6mdH7fiFuta.setValue(new defpackage.ae1(floatToRawIntBits2));
            ys1Var.fWTAfUmVKrZq = str;
            e30Var.EgL5gQQnyJKX(dt1Var);
            GcLuU6pT9wO9 = dt1Var;
        }
        return (defpackage.dt1) GcLuU6pT9wO9;
    }

    public static final void dG7RjM6DqYVL(android.os.Bundle bundle, java.lang.String str, java.util.List list) {
        bundle.putStringArrayList(str, list instanceof java.util.ArrayList ? (java.util.ArrayList) list : new java.util.ArrayList<>(list));
    }

    public static final int e6mdH7fiFuta(int i, defpackage.ho0 ho0Var) {
        int i2 = ho0Var.QiMR8OkAhezm - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            java.lang.Object[] objArr = ho0Var.WDYagTQQm9ns;
            int i5 = ((defpackage.ea0) objArr[i4]).ZpBGe2uQfcn8;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((defpackage.ea0) objArr[i3]).ZpBGe2uQfcn8) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    public static final void fNwYGHIYeJcR(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i <= i2) {
                return;
            }
            defpackage.h7.w7APNrr0aGRc(defpackage.pVQOaWB9QMo4.P05cfTpS5W5L(i, i2, "fromIndex: ", " > toIndex: "));
        } else {
            throw new java.lang.IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
        }
    }

    public static final void fWTAfUmVKrZq(boolean z, defpackage.c20 c20Var, defpackage.e30 e30Var, int i) {
        int i2;
        e30Var.PS16moFv2oLu(-642000585);
        if ((i & 6) == 0) {
            i2 = (e30Var.QiMR8OkAhezm(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e30Var.P05cfTpS5W5L(c20Var) ? 32 : 16;
        }
        int i3 = 1;
        if (e30Var.zJPqDeoF0Os1(i2 & 1, (i2 & 19) != 18)) {
            java.lang.Object ZpBGe2uQfcn82 = defpackage.hi0.ZpBGe2uQfcn8(e30Var);
            if (ZpBGe2uQfcn82 == null) {
                e30Var.NkfcFfdaVTox(1512740606);
                ZpBGe2uQfcn82 = defpackage.ii0.ZpBGe2uQfcn8(e30Var);
            } else {
                e30Var.NkfcFfdaVTox(1512737723);
            }
            e30Var.XntWc4eZSQ8j(false);
            if (ZpBGe2uQfcn82 == null) {
                defpackage.h7.P05cfTpS5W5L("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean oh71FJcDz6S2 = e30Var.oh71FJcDz6S2(ZpBGe2uQfcn82);
            java.lang.Object GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
            java.lang.Object obj = defpackage.cj.ZpBGe2uQfcn8;
            if (oh71FJcDz6S2 || GcLuU6pT9wO9 == obj) {
                defpackage.qq0 qq0Var = ZpBGe2uQfcn82 instanceof defpackage.qq0 ? (defpackage.qq0) ZpBGe2uQfcn82 : null;
                defpackage.s81 ZpBGe2uQfcn83 = qq0Var != null ? qq0Var.ZpBGe2uQfcn8() : null;
                defpackage.mt0 mt0Var = ZpBGe2uQfcn82 instanceof defpackage.mt0 ? (defpackage.mt0) ZpBGe2uQfcn82 : null;
                GcLuU6pT9wO9 = new defpackage.b9(ZpBGe2uQfcn83, mt0Var != null ? mt0Var.giKS3J6vZuNy() : null);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO9);
            }
            java.lang.Object obj2 = (defpackage.b9) GcLuU6pT9wO9;
            java.lang.Object GcLuU6pT9wO92 = e30Var.GcLuU6pT9wO9();
            if (GcLuU6pT9wO92 == obj) {
                GcLuU6pT9wO92 = defpackage.nq1.dG7RjM6DqYVL(e30Var);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO92);
            }
            defpackage.sm smVar = (defpackage.sm) GcLuU6pT9wO92;
            long j = e30Var.CZa7MwI9IzLd;
            boolean oh71FJcDz6S22 = e30Var.oh71FJcDz6S2(obj2) | e30Var.WDYagTQQm9ns(j);
            java.lang.Object GcLuU6pT9wO93 = e30Var.GcLuU6pT9wO9();
            if (oh71FJcDz6S22 || GcLuU6pT9wO93 == obj) {
                GcLuU6pT9wO93 = new defpackage.mi(smVar, new defpackage.j11(j, ZpBGe2uQfcn82));
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO93);
            }
            defpackage.mi miVar = (defpackage.mi) GcLuU6pT9wO93;
            e30Var.NkfcFfdaVTox(-348514256);
            boolean P05cfTpS5W5L = e30Var.P05cfTpS5W5L(miVar) | e30Var.P05cfTpS5W5L(c20Var);
            java.lang.Object GcLuU6pT9wO94 = e30Var.GcLuU6pT9wO9();
            if (P05cfTpS5W5L || GcLuU6pT9wO94 == obj) {
                GcLuU6pT9wO94 = new defpackage.S0YpfprlOYIn(17, miVar, c20Var);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO94);
            }
            defpackage.nq1.WmetiUbpKU9I((defpackage.n10) GcLuU6pT9wO94, e30Var);
            int i4 = i2;
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z);
            int i5 = i4 & 14;
            boolean P05cfTpS5W5L2 = (i5 == 4) | e30Var.P05cfTpS5W5L(miVar);
            java.lang.Object GcLuU6pT9wO95 = e30Var.GcLuU6pT9wO9();
            if (P05cfTpS5W5L2 || GcLuU6pT9wO95 == obj) {
                GcLuU6pT9wO95 = new defpackage.d9(miVar, z, i3);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO95);
            }
            defpackage.t80.ZpBGe2uQfcn8(valueOf, miVar, null, (defpackage.y10) GcLuU6pT9wO95, e30Var, i5);
            boolean P05cfTpS5W5L3 = e30Var.P05cfTpS5W5L(obj2) | e30Var.P05cfTpS5W5L(miVar);
            java.lang.Object GcLuU6pT9wO96 = e30Var.GcLuU6pT9wO9();
            if (P05cfTpS5W5L3 || GcLuU6pT9wO96 == obj) {
                GcLuU6pT9wO96 = new defpackage.fWTAfUmVKrZq(27, obj2, miVar);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO96);
            }
            defpackage.nq1.QiMR8OkAhezm(obj2, miVar, (defpackage.y10) GcLuU6pT9wO96, e30Var);
            e30Var.XntWc4eZSQ8j(false);
        } else {
            e30Var.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.h9(z, c20Var, i, i3);
        }
    }

    public static final void frSwwKIlbUhK() {
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int gUjdnLbkVAaA(java.lang.String str, int i) {
        java.lang.String str2;
        int i2;
        defpackage.ju WmetiUbpKU9I = WmetiUbpKU9I();
        java.lang.Integer num = null;
        if (WmetiUbpKU9I != null) {
            if (!(WmetiUbpKU9I.fWTAfUmVKrZq() == 1)) {
                defpackage.h7.P05cfTpS5W5L("Not initialized yet");
                return 0;
            }
            defpackage.w60.GE9mJIPrb8gP(str, "charSequence cannot be null");
            defpackage.a7 a7Var = WmetiUbpKU9I.WDYagTQQm9ns.giKS3J6vZuNy;
            a7Var.getClass();
            if (i < 0 || i >= str.length()) {
                str2 = str;
                i2 = -1;
            } else {
                if (str instanceof android.text.Spanned) {
                    android.text.Spanned spanned = (android.text.Spanned) str;
                    defpackage.ar1[] ar1VarArr = (defpackage.ar1[]) spanned.getSpans(i, i + 1, defpackage.ar1.class);
                    if (ar1VarArr.length > 0) {
                        i2 = spanned.getSpanEnd(ar1VarArr[0]);
                        str2 = str;
                    }
                }
                str2 = str;
                i2 = ((defpackage.qu) a7Var.XntWc4eZSQ8j(str2, java.lang.Math.max(0, i - 16), java.lang.Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new defpackage.qu(i))).QiMR8OkAhezm;
            }
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i2);
            if (i2 != -1) {
                num = valueOf;
            }
        } else {
            str2 = str;
        }
        if (num != null) {
            return num.intValue();
        }
        java.text.BreakIterator characterInstance = java.text.BreakIterator.getCharacterInstance();
        characterInstance.setText(str2);
        return characterInstance.following(i);
    }

    public static final void giKS3J6vZuNy(defpackage.xo0 xo0Var, defpackage.i71 i71Var, defpackage.nh nhVar, defpackage.e30 e30Var, int i) {
        e30Var.PS16moFv2oLu(233973821);
        if ((((e30Var.P05cfTpS5W5L(xo0Var) ? 4 : 2) | i | (e30Var.P05cfTpS5W5L(i71Var) ? 32 : 16)) & 147) == 146 && e30Var.OcTWLQzke1i2()) {
            e30Var.Jkfc0NcwyPL8();
        } else {
            defpackage.vx1.JhCgjQRTAOCT(new defpackage.v21[]{defpackage.mi0.ZpBGe2uQfcn8.ZpBGe2uQfcn8(xo0Var), defpackage.gi0.ZpBGe2uQfcn8.ZpBGe2uQfcn8(xo0Var), defpackage.li0.ZpBGe2uQfcn8.ZpBGe2uQfcn8(xo0Var)}, defpackage.nn.OcTWLQzke1i2(1808964477, new defpackage.bq(1, i71Var, nhVar), e30Var), e30Var, 56);
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.p71(xo0Var, i71Var, nhVar, i, 7);
        }
    }

    public static final void h3m55N1URyyK(defpackage.l40 l40Var, defpackage.at1 at1Var) {
        java.util.List list = at1Var.gUjdnLbkVAaA;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            defpackage.ct1 ct1Var = (defpackage.ct1) list.get(i);
            if (ct1Var instanceof defpackage.et1) {
                defpackage.zw0 zw0Var = new defpackage.zw0();
                defpackage.et1 et1Var = (defpackage.et1) ct1Var;
                zw0Var.JhCgjQRTAOCT = et1Var.oh71FJcDz6S2;
                zw0Var.gUjdnLbkVAaA = true;
                zw0Var.fWTAfUmVKrZq();
                zw0Var.BHfvd2J71qpO.ZpBGe2uQfcn8.setFillType(et1Var.QiMR8OkAhezm == 1 ? android.graphics.Path.FillType.EVEN_ODD : android.graphics.Path.FillType.WINDING);
                zw0Var.fWTAfUmVKrZq();
                zw0Var.fWTAfUmVKrZq();
                zw0Var.giKS3J6vZuNy = et1Var.P05cfTpS5W5L;
                zw0Var.fWTAfUmVKrZq();
                zw0Var.fWTAfUmVKrZq = et1Var.e6mdH7fiFuta;
                zw0Var.fWTAfUmVKrZq();
                zw0Var.QiMR8OkAhezm = et1Var.GE9mJIPrb8gP;
                zw0Var.fWTAfUmVKrZq();
                zw0Var.WDYagTQQm9ns = et1Var.Ns0WNyEWdPsk;
                zw0Var.fWTAfUmVKrZq();
                zw0Var.oh71FJcDz6S2 = et1Var.fNwYGHIYeJcR;
                zw0Var.T1fB7bDYiVJQ = true;
                zw0Var.fWTAfUmVKrZq();
                zw0Var.P05cfTpS5W5L = et1Var.h3m55N1URyyK;
                zw0Var.T1fB7bDYiVJQ = true;
                zw0Var.fWTAfUmVKrZq();
                zw0Var.e6mdH7fiFuta = et1Var.gUjdnLbkVAaA;
                zw0Var.T1fB7bDYiVJQ = true;
                zw0Var.fWTAfUmVKrZq();
                zw0Var.GE9mJIPrb8gP = et1Var.T1fB7bDYiVJQ;
                zw0Var.T1fB7bDYiVJQ = true;
                zw0Var.fWTAfUmVKrZq();
                zw0Var.Ns0WNyEWdPsk = et1Var.XntWc4eZSQ8j;
                zw0Var.XntWc4eZSQ8j = true;
                zw0Var.fWTAfUmVKrZq();
                zw0Var.fNwYGHIYeJcR = et1Var.WmetiUbpKU9I;
                zw0Var.XntWc4eZSQ8j = true;
                zw0Var.fWTAfUmVKrZq();
                zw0Var.h3m55N1URyyK = et1Var.s0TASMVLSWD5;
                zw0Var.XntWc4eZSQ8j = true;
                zw0Var.fWTAfUmVKrZq();
                l40Var.WDYagTQQm9ns(i, zw0Var);
            } else if (ct1Var instanceof defpackage.at1) {
                defpackage.l40 l40Var2 = new defpackage.l40();
                defpackage.at1 at1Var2 = (defpackage.at1) ct1Var;
                l40Var2.Ns0WNyEWdPsk = at1Var2.WDYagTQQm9ns;
                l40Var2.fWTAfUmVKrZq();
                l40Var2.fNwYGHIYeJcR = at1Var2.oh71FJcDz6S2;
                l40Var2.BHfvd2J71qpO = true;
                l40Var2.fWTAfUmVKrZq();
                l40Var2.T1fB7bDYiVJQ = at1Var2.e6mdH7fiFuta;
                l40Var2.BHfvd2J71qpO = true;
                l40Var2.fWTAfUmVKrZq();
                l40Var2.XntWc4eZSQ8j = at1Var2.GE9mJIPrb8gP;
                l40Var2.BHfvd2J71qpO = true;
                l40Var2.fWTAfUmVKrZq();
                l40Var2.WmetiUbpKU9I = at1Var2.Ns0WNyEWdPsk;
                l40Var2.BHfvd2J71qpO = true;
                l40Var2.fWTAfUmVKrZq();
                l40Var2.s0TASMVLSWD5 = at1Var2.fNwYGHIYeJcR;
                l40Var2.BHfvd2J71qpO = true;
                l40Var2.fWTAfUmVKrZq();
                l40Var2.h3m55N1URyyK = at1Var2.QiMR8OkAhezm;
                l40Var2.BHfvd2J71qpO = true;
                l40Var2.fWTAfUmVKrZq();
                l40Var2.gUjdnLbkVAaA = at1Var2.P05cfTpS5W5L;
                l40Var2.BHfvd2J71qpO = true;
                l40Var2.fWTAfUmVKrZq();
                l40Var2.oh71FJcDz6S2 = at1Var2.h3m55N1URyyK;
                l40Var2.QiMR8OkAhezm = true;
                l40Var2.fWTAfUmVKrZq();
                h3m55N1URyyK(l40Var2, at1Var2);
                l40Var.WDYagTQQm9ns(i, l40Var2);
            }
        }
    }

    public static final java.lang.Object jjTN4uUnoyEn(defpackage.ho1 ho1Var, defpackage.c20 c20Var) {
        java.lang.Object ugVar;
        java.lang.Object z16KqenTjq8o;
        defpackage.b80.dG7RjM6DqYVL(ho1Var, true, new defpackage.fr(defpackage.nn.w7APNrr0aGRc(ho1Var.GE9mJIPrb8gP.oh71FJcDz6S2()).QiMR8OkAhezm(ho1Var.Ns0WNyEWdPsk, ho1Var, ho1Var.e6mdH7fiFuta)));
        try {
            if (c20Var instanceof defpackage.m9) {
                defpackage.nq1.IJ0hOnjhPOri(2, c20Var);
                ugVar = c20Var.QiMR8OkAhezm(ho1Var, ho1Var);
            } else {
                ugVar = defpackage.q70.Wc0TdmRSwbbi(c20Var, ho1Var, ho1Var);
            }
        } catch (java.lang.Throwable th) {
            ugVar = new defpackage.ug(th, false);
        }
        defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
        if (ugVar == tmVar || (z16KqenTjq8o = ho1Var.z16KqenTjq8o(ugVar)) == defpackage.jr0.JhCgjQRTAOCT) {
            return tmVar;
        }
        if (z16KqenTjq8o instanceof defpackage.ug) {
            java.lang.Throwable th2 = ((defpackage.ug) z16KqenTjq8o).ZpBGe2uQfcn8;
            if (!(th2 instanceof defpackage.go1)) {
                throw th2;
            }
            if (((defpackage.go1) th2).WDYagTQQm9ns != ho1Var) {
                throw th2;
            }
            if (ugVar instanceof defpackage.ug) {
                throw ((defpackage.ug) ugVar).ZpBGe2uQfcn8;
            }
        } else {
            ugVar = defpackage.jr0.z16KqenTjq8o(z16KqenTjq8o);
        }
        return ugVar;
    }

    public static final void maCixPsq4ml2(defpackage.ad0 ad0Var) {
        defpackage.la0.UmgHb6n58gfG(ad0Var).jjTN4uUnoyEn();
    }

    public static final void oCu53ZX2v4Ju(defpackage.je1 je1Var, defpackage.e7 e7Var, int i) {
        while (true) {
            int i2 = je1Var.maCixPsq4ml2;
            if (i > i2 && i < je1Var.w7APNrr0aGRc) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            je1Var.xahdJg25P1Bv();
            if (je1Var.oCu53ZX2v4Ju(je1Var.maCixPsq4ml2)) {
                e7Var.WmetiUbpKU9I();
            }
            je1Var.GE9mJIPrb8gP();
        }
    }

    public static final defpackage.s31 oh71FJcDz6S2(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new defpackage.s31(java.lang.Float.intBitsToFloat(i), java.lang.Float.intBitsToFloat(i2), java.lang.Float.intBitsToFloat((int) (j2 >> 32)) + java.lang.Float.intBitsToFloat(i), java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)) + java.lang.Float.intBitsToFloat(i2));
    }

    public static void qjMheFZ0l9kA(android.view.Window window, boolean z) {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 35) {
            defpackage.omM9cAlgeGXx.WDYagTQQm9ns(window, z);
        } else {
            if (i >= 30) {
                defpackage.omM9cAlgeGXx.JhCgjQRTAOCT(window, z);
                return;
            }
            android.view.View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static final defpackage.t61 s0TASMVLSWD5(defpackage.qk0 qk0Var) {
        java.lang.Object GE9mJIPrb8gP = qk0Var.GE9mJIPrb8gP();
        if (GE9mJIPrb8gP instanceof defpackage.t61) {
            return (defpackage.t61) GE9mJIPrb8gP;
        }
        return null;
    }

    public static boolean w7APNrr0aGRc(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }
}
