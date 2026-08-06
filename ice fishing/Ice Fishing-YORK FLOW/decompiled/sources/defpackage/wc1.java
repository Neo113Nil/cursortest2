package defpackage;

/* loaded from: classes.dex */
public abstract class wc1 {
    public static boolean ZpBGe2uQfcn8 = false;
    public static java.lang.reflect.Method giKS3J6vZuNy;

    public static final long BHfvd2J71qpO() {
        return java.lang.Thread.currentThread().getId();
    }

    public static final android.os.Bundle BXaznwstz2U0(java.lang.String str, android.os.Bundle bundle) {
        android.os.Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        defpackage.w60.KrtOTfE6jiS2(str);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void CZa7MwI9IzLd(defpackage.ul0 ul0Var, defpackage.n10 n10Var) {
        defpackage.us0 us0Var = ul0Var.Ns0WNyEWdPsk;
        if (us0Var == null) {
            us0Var = new defpackage.us0((defpackage.ts0) ul0Var);
            ul0Var.Ns0WNyEWdPsk = us0Var;
        }
        defpackage.rv0 snapshotObserver = ((defpackage.u) defpackage.la0.qjMheFZ0l9kA(ul0Var)).getSnapshotObserver();
        snapshotObserver.ZpBGe2uQfcn8.JhCgjQRTAOCT(us0Var, defpackage.n.frSwwKIlbUhK, n10Var);
    }

    public static java.util.LinkedHashSet EPEWHACkMcF1(java.util.Set set, defpackage.xo0 xo0Var) {
        set.getClass();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(defpackage.jk0.zJPqDeoF0Os1(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(xo0Var);
        return linkedHashSet;
    }

    public static final defpackage.jq0 Fu5WBEia9jBo(defpackage.y10 y10Var) {
        defpackage.kq0 kq0Var = new defpackage.kq0();
        y10Var.P05cfTpS5W5L(kq0Var);
        boolean z = kq0Var.giKS3J6vZuNy;
        int i = kq0Var.fWTAfUmVKrZq;
        boolean z2 = kq0Var.JhCgjQRTAOCT;
        defpackage.iq0 iq0Var = kq0Var.ZpBGe2uQfcn8;
        return new defpackage.jq0(z, false, i, false, z2, iq0Var.WDYagTQQm9ns, iq0Var.oh71FJcDz6S2);
    }

    public static final android.view.inputmethod.ExtractedText GE9mJIPrb8gP(defpackage.nm1 nm1Var) {
        android.view.inputmethod.ExtractedText extractedText = new android.view.inputmethod.ExtractedText();
        java.lang.String str = nm1Var.ZpBGe2uQfcn8.oh71FJcDz6S2;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = nm1Var.giKS3J6vZuNy;
        extractedText.selectionStart = defpackage.in1.oh71FJcDz6S2(j);
        extractedText.selectionEnd = defpackage.in1.WDYagTQQm9ns(j);
        extractedText.flags = !defpackage.tg1.Fu5WBEia9jBo(nm1Var.ZpBGe2uQfcn8.oh71FJcDz6S2, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final void GcLuU6pT9wO9(defpackage.hb1 hb1Var) {
        defpackage.la0.UmgHb6n58gfG(hb1Var).Mearx7yMn90V();
    }

    public static final boolean GoIRkIe1iwj6(int i, defpackage.d5 d5Var, defpackage.nz nzVar, defpackage.s31 s31Var) {
        defpackage.nz maCixPsq4ml2;
        defpackage.ho0 ho0Var = new defpackage.ho0(new defpackage.nz[16]);
        if (!nzVar.WDYagTQQm9ns.s0TASMVLSWD5) {
            defpackage.e80.giKS3J6vZuNy("visitChildren called on an unattached node");
        }
        defpackage.ho0 ho0Var2 = new defpackage.ho0(new defpackage.ul0[16]);
        defpackage.ul0 ul0Var = nzVar.WDYagTQQm9ns;
        defpackage.ul0 ul0Var2 = ul0Var.GE9mJIPrb8gP;
        if (ul0Var2 == null) {
            defpackage.la0.oh71FJcDz6S2(ho0Var2, ul0Var);
        } else {
            ho0Var2.giKS3J6vZuNy(ul0Var2);
        }
        while (true) {
            int i2 = ho0Var2.QiMR8OkAhezm;
            if (i2 == 0) {
                break;
            }
            defpackage.ul0 ul0Var3 = (defpackage.ul0) ho0Var2.Ns0WNyEWdPsk(i2 - 1);
            if ((ul0Var3.P05cfTpS5W5L & 1024) == 0) {
                defpackage.la0.oh71FJcDz6S2(ho0Var2, ul0Var3);
            } else {
                while (true) {
                    if (ul0Var3 == null) {
                        break;
                    }
                    if ((ul0Var3.QiMR8OkAhezm & 1024) != 0) {
                        defpackage.ho0 ho0Var3 = null;
                        while (ul0Var3 != null) {
                            if (ul0Var3 instanceof defpackage.nz) {
                                defpackage.nz nzVar2 = (defpackage.nz) ul0Var3;
                                if (nzVar2.s0TASMVLSWD5) {
                                    ho0Var.giKS3J6vZuNy(nzVar2);
                                }
                            } else if ((ul0Var3.QiMR8OkAhezm & 1024) != 0 && (ul0Var3 instanceof defpackage.xo)) {
                                int i3 = 0;
                                for (defpackage.ul0 ul0Var4 = ((defpackage.xo) ul0Var3).ZVVdXbWmyCSK; ul0Var4 != null; ul0Var4 = ul0Var4.GE9mJIPrb8gP) {
                                    if ((ul0Var4.QiMR8OkAhezm & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            ul0Var3 = ul0Var4;
                                        } else {
                                            if (ho0Var3 == null) {
                                                ho0Var3 = new defpackage.ho0(new defpackage.ul0[16]);
                                            }
                                            if (ul0Var3 != null) {
                                                ho0Var3.giKS3J6vZuNy(ul0Var3);
                                                ul0Var3 = null;
                                            }
                                            ho0Var3.giKS3J6vZuNy(ul0Var4);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            ul0Var3 = defpackage.la0.P05cfTpS5W5L(ho0Var3);
                        }
                    } else {
                        ul0Var3 = ul0Var3.GE9mJIPrb8gP;
                    }
                }
            }
        }
        while (ho0Var.QiMR8OkAhezm != 0 && (maCixPsq4ml2 = maCixPsq4ml2(ho0Var, s31Var, i)) != null) {
            if (maCixPsq4ml2.I9id0xDxCgYV().ZpBGe2uQfcn8) {
                return ((java.lang.Boolean) d5Var.P05cfTpS5W5L(maCixPsq4ml2)).booleanValue();
            }
            if (jjTN4uUnoyEn(i, d5Var, maCixPsq4ml2, s31Var)) {
                return true;
            }
            ho0Var.GE9mJIPrb8gP(maCixPsq4ml2);
        }
        return false;
    }

    public static final long IBvW5fLsPuHy(int i, byte[] bArr) {
        return (bArr[i + 7] & 255) | ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
    }

    public static final boolean IJ0hOnjhPOri(defpackage.nz nzVar, int i, defpackage.y10 y10Var) {
        defpackage.s31 s31Var;
        defpackage.ho0 ho0Var = new defpackage.ho0(new defpackage.nz[16]);
        WmetiUbpKU9I(nzVar, ho0Var);
        int i2 = ho0Var.QiMR8OkAhezm;
        if (i2 <= 1) {
            defpackage.nz nzVar2 = (defpackage.nz) (i2 == 0 ? null : ho0Var.WDYagTQQm9ns[0]);
            if (nzVar2 != null) {
                return ((java.lang.Boolean) y10Var.P05cfTpS5W5L(nzVar2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                defpackage.s31 VFeft99leXEK = defpackage.h0.VFeft99leXEK(nzVar);
                float f = VFeft99leXEK.ZpBGe2uQfcn8;
                float f2 = VFeft99leXEK.giKS3J6vZuNy;
                s31Var = new defpackage.s31(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    defpackage.h7.P05cfTpS5W5L("This function should only be used for 2-D focus search");
                    return false;
                }
                defpackage.s31 VFeft99leXEK2 = defpackage.h0.VFeft99leXEK(nzVar);
                float f3 = VFeft99leXEK2.fWTAfUmVKrZq;
                float f4 = VFeft99leXEK2.JhCgjQRTAOCT;
                s31Var = new defpackage.s31(f3, f4, f3, f4);
            }
            defpackage.nz maCixPsq4ml2 = maCixPsq4ml2(ho0Var, s31Var, i);
            if (maCixPsq4ml2 != null) {
                return ((java.lang.Boolean) y10Var.P05cfTpS5W5L(maCixPsq4ml2)).booleanValue();
            }
        }
        return false;
    }

    public static final defpackage.n61 JhCgjQRTAOCT(float f, float f2, float f3, float f4, long j) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        long floatToRawIntBits = (java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & java.lang.Float.floatToRawIntBits(intBitsToFloat2));
        return new defpackage.n61(f, f2, f3, f4, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits);
    }

    public static final boolean Jkfc0NcwyPL8(defpackage.n61 n61Var) {
        long j = n61Var.WDYagTQQm9ns;
        return (j >>> 32) == (4294967295L & j) && j == n61Var.oh71FJcDz6S2 && j == n61Var.QiMR8OkAhezm && j == n61Var.P05cfTpS5W5L;
    }

    public static final int KrtOTfE6jiS2(java.lang.String str, android.os.Bundle bundle) {
        int i = bundle.getInt(str, Integer.MIN_VALUE);
        if (i != Integer.MIN_VALUE || bundle.getInt(str, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i;
        }
        defpackage.w60.KrtOTfE6jiS2(str);
        throw null;
    }

    public static final defpackage.b81 Mearx7yMn90V(android.view.View view) {
        view.getClass();
        while (view != null) {
            java.lang.Object tag = view.getTag(com.ice.fishing.wolberta.R.id.view_tree_saved_state_registry_owner);
            defpackage.b81 b81Var = tag instanceof defpackage.b81 ? (defpackage.b81) tag : null;
            if (b81Var != null) {
                return b81Var;
            }
            java.lang.Object IJ0hOnjhPOri = defpackage.t80.IJ0hOnjhPOri(view);
            view = IJ0hOnjhPOri instanceof android.view.View ? (android.view.View) IJ0hOnjhPOri : null;
        }
        return null;
    }

    public static final void NkfcFfdaVTox(java.lang.Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if (r21 != 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        if (r21 != 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (r21 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        r1 = r11 - r19.fWTAfUmVKrZq;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        if (r1 >= 0.0f) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
    
        if (r21 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
    
        if (r11 >= 1.0f) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
    
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
    
        if (r1 >= r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (r21 != 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
    
        if (r21 != 5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        if (r21 != 6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
    
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
    
        defpackage.h7.P05cfTpS5W5L("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0093, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0057, code lost:
    
        if (r21 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:
    
        r1 = r19.ZpBGe2uQfcn8 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005d, code lost:
    
        if (r21 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005f, code lost:
    
        r1 = r9 - r19.JhCgjQRTAOCT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
    
        if (r21 != 6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0066, code lost:
    
        r1 = r19.giKS3J6vZuNy - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0094, code lost:
    
        defpackage.h7.P05cfTpS5W5L("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x003a, code lost:
    
        if (r10 <= r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0041, code lost:
    
        if (r9 >= r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0048, code lost:
    
        if (r8 <= r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r11 >= r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0098, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean Ns0WNyEWdPsk(defpackage.s31 s31Var, defpackage.s31 s31Var2, defpackage.s31 s31Var3, int i) {
        boolean fNwYGHIYeJcR = fNwYGHIYeJcR(i, s31Var3, s31Var);
        float f = s31Var3.giKS3J6vZuNy;
        float f2 = s31Var3.JhCgjQRTAOCT;
        float f3 = s31Var3.ZpBGe2uQfcn8;
        float f4 = s31Var3.fWTAfUmVKrZq;
        float f5 = s31Var.JhCgjQRTAOCT;
        float f6 = s31Var.giKS3J6vZuNy;
        float f7 = s31Var.fWTAfUmVKrZq;
        float f8 = s31Var.ZpBGe2uQfcn8;
        if (!fNwYGHIYeJcR && fNwYGHIYeJcR(i, s31Var2, s31Var)) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            defpackage.h7.P05cfTpS5W5L("This function should only be used for 2-D focus search");
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean OVwOqzUGHcCU(java.lang.String str, android.os.Bundle bundle) {
        str.getClass();
        return bundle.containsKey(str) && bundle.get(str) == null;
    }

    public static final int OcTWLQzke1i2(java.util.ArrayList arrayList, float f) {
        if (f <= 0.0f) {
            return 0;
        }
        if (f >= ((defpackage.dw0) defpackage.hf.EgL5gQQnyJKX(arrayList)).QiMR8OkAhezm) {
            return arrayList.size() - 1;
        }
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            defpackage.dw0 dw0Var = (defpackage.dw0) arrayList.get(i2);
            char c = dw0Var.oh71FJcDz6S2 > f ? (char) 1 : dw0Var.QiMR8OkAhezm <= f ? (char) 65535 : (char) 0;
            if (c < 0) {
                i = i2 + 1;
            } else {
                if (c <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:198:0x04b2, code lost:
    
        if (r52.P05cfTpS5W5L(r11) != false) goto L235;
     */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0501  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void P05cfTpS5W5L(defpackage.c20 c20Var, final defpackage.c20 c20Var2, defpackage.d20 d20Var, final defpackage.c20 c20Var3, final defpackage.c20 c20Var4, final defpackage.c20 c20Var5, final defpackage.c20 c20Var6, final defpackage.ll1 ll1Var, defpackage.el1 el1Var, final defpackage.nh nhVar, defpackage.c20 c20Var7, defpackage.wv0 wv0Var, defpackage.e30 e30Var, final int i, final int i2) {
        int i3;
        int i4;
        final defpackage.wv0 wv0Var2;
        defpackage.c20 c20Var8;
        defpackage.c20 c20Var9;
        defpackage.d20 d20Var2;
        defpackage.el1 el1Var2;
        defpackage.ea eaVar;
        boolean z;
        defpackage.sc0 sc0Var;
        defpackage.h5 h5Var;
        float fWTAfUmVKrZq;
        defpackage.c20 c20Var10;
        defpackage.ea eaVar2;
        boolean z2;
        boolean z3;
        java.lang.Object GcLuU6pT9wO9;
        int i5;
        int s0TASMVLSWD5;
        defpackage.ea eaVar3 = defpackage.jVUAPb5NnIYW.GE9mJIPrb8gP;
        defpackage.ea eaVar4 = defpackage.jVUAPb5NnIYW.oh71FJcDz6S2;
        e30Var.PS16moFv2oLu(-1086465551);
        int i6 = i & 6;
        defpackage.sl0 sl0Var = defpackage.sl0.ZpBGe2uQfcn8;
        if (i6 == 0) {
            i3 = i | (e30Var.oh71FJcDz6S2(sl0Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= e30Var.P05cfTpS5W5L(c20Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= e30Var.P05cfTpS5W5L(c20Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= e30Var.P05cfTpS5W5L(d20Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= e30Var.P05cfTpS5W5L(c20Var3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= e30Var.P05cfTpS5W5L(c20Var4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= e30Var.P05cfTpS5W5L(c20Var5) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= e30Var.P05cfTpS5W5L(c20Var6) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= e30Var.QiMR8OkAhezm(false) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= e30Var.oh71FJcDz6S2(ll1Var) ? 536870912 : 268435456;
        }
        int i7 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | ((i2 & 8) == 0 ? e30Var.oh71FJcDz6S2(el1Var) : e30Var.P05cfTpS5W5L(el1Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= e30Var.P05cfTpS5W5L(nhVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= e30Var.P05cfTpS5W5L(c20Var7) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            wv0Var2 = wv0Var;
            i4 |= e30Var.oh71FJcDz6S2(wv0Var2) ? 2048 : 1024;
        } else {
            wv0Var2 = wv0Var;
        }
        int i8 = i4;
        if (e30Var.zJPqDeoF0Os1(i7 & 1, ((i7 & 306783379) == 306783378 && (i8 & 1171) == 1170) ? false : true)) {
            long j = ((defpackage.gr1) e30Var.GE9mJIPrb8gP(defpackage.hr1.ZpBGe2uQfcn8)).fNwYGHIYeJcR.giKS3J6vZuNy.fWTAfUmVKrZq;
            long j2 = defpackage.qq1.fNwYGHIYeJcR;
            if ((j & 1095216660480L) != 4294967296L) {
                j = j2;
            }
            float BXaznwstz2U0 = ((defpackage.hp) e30Var.GE9mJIPrb8gP(defpackage.rj.P05cfTpS5W5L)).BXaznwstz2U0(j) / 2.0f;
            int i9 = i8 & 14;
            boolean fWTAfUmVKrZq2 = ((i7 & 234881024) == 67108864) | ((i7 & 1879048192) == 536870912) | (i9 == 4 || ((i8 & 8) != 0 && e30Var.oh71FJcDz6S2(el1Var))) | ((i8 & 7168) == 2048) | e30Var.fWTAfUmVKrZq(BXaznwstz2U0);
            java.lang.Object GcLuU6pT9wO92 = e30Var.GcLuU6pT9wO9();
            java.lang.Object obj = defpackage.cj.ZpBGe2uQfcn8;
            if (fWTAfUmVKrZq2 || GcLuU6pT9wO92 == obj) {
                GcLuU6pT9wO92 = new defpackage.nl1(ll1Var, el1Var, wv0Var2, BXaznwstz2U0);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO92);
            }
            defpackage.nl1 nl1Var = (defpackage.nl1) GcLuU6pT9wO92;
            defpackage.sc0 sc0Var2 = (defpackage.sc0) e30Var.GE9mJIPrb8gP(defpackage.rj.gUjdnLbkVAaA);
            int s0TASMVLSWD52 = defpackage.la0.s0TASMVLSWD5(e30Var);
            defpackage.ay0 fNwYGHIYeJcR = e30Var.fNwYGHIYeJcR();
            defpackage.vl0 oCu53ZX2v4Ju = defpackage.i61.oCu53ZX2v4Ju(e30Var, sl0Var);
            defpackage.wi.fWTAfUmVKrZq.getClass();
            defpackage.n10 n10Var = defpackage.vi.giKS3J6vZuNy;
            e30Var.fhbmYuu9J3cT();
            if (e30Var.Fu5WBEia9jBo) {
                e30Var.Ns0WNyEWdPsk(n10Var);
            } else {
                e30Var.lXYSMswtzmix();
            }
            defpackage.h5 h5Var2 = defpackage.vi.oh71FJcDz6S2;
            defpackage.t80.w6IV1lieBIux(h5Var2, e30Var, nl1Var);
            defpackage.h5 h5Var3 = defpackage.vi.WDYagTQQm9ns;
            defpackage.t80.w6IV1lieBIux(h5Var3, e30Var, fNwYGHIYeJcR);
            defpackage.h5 h5Var4 = defpackage.vi.QiMR8OkAhezm;
            if (e30Var.Fu5WBEia9jBo || !defpackage.ma0.QiMR8OkAhezm(e30Var.GcLuU6pT9wO9(), java.lang.Integer.valueOf(s0TASMVLSWD52))) {
                defpackage.pVQOaWB9QMo4.T1fB7bDYiVJQ(s0TASMVLSWD52, e30Var, s0TASMVLSWD52, h5Var4);
            }
            defpackage.h5 h5Var5 = defpackage.vi.JhCgjQRTAOCT;
            defpackage.t80.w6IV1lieBIux(h5Var5, e30Var, oCu53ZX2v4Ju);
            nhVar.QiMR8OkAhezm(e30Var, java.lang.Integer.valueOf((i8 >> 3) & 14));
            defpackage.ol0 ol0Var = defpackage.ol0.ZpBGe2uQfcn8;
            if (c20Var3 != null) {
                e30Var.NkfcFfdaVTox(-1445181094);
                defpackage.vl0 GcLuU6pT9wO93 = defpackage.h0.GcLuU6pT9wO9(sl0Var, "Leading");
                defpackage.l50 l50Var = defpackage.z90.ZpBGe2uQfcn8;
                defpackage.vl0 fWTAfUmVKrZq3 = GcLuU6pT9wO93.fWTAfUmVKrZq(ol0Var);
                eaVar = eaVar3;
                defpackage.vk0 JhCgjQRTAOCT = defpackage.ab.JhCgjQRTAOCT(eaVar, false);
                int s0TASMVLSWD53 = defpackage.la0.s0TASMVLSWD5(e30Var);
                defpackage.ay0 fNwYGHIYeJcR2 = e30Var.fNwYGHIYeJcR();
                defpackage.vl0 oCu53ZX2v4Ju2 = defpackage.i61.oCu53ZX2v4Ju(e30Var, fWTAfUmVKrZq3);
                e30Var.fhbmYuu9J3cT();
                sc0Var = sc0Var2;
                if (e30Var.Fu5WBEia9jBo) {
                    e30Var.Ns0WNyEWdPsk(n10Var);
                } else {
                    e30Var.lXYSMswtzmix();
                }
                defpackage.t80.w6IV1lieBIux(h5Var2, e30Var, JhCgjQRTAOCT);
                defpackage.t80.w6IV1lieBIux(h5Var3, e30Var, fNwYGHIYeJcR2);
                if (e30Var.Fu5WBEia9jBo || !defpackage.ma0.QiMR8OkAhezm(e30Var.GcLuU6pT9wO9(), java.lang.Integer.valueOf(s0TASMVLSWD53))) {
                    defpackage.pVQOaWB9QMo4.T1fB7bDYiVJQ(s0TASMVLSWD53, e30Var, s0TASMVLSWD53, h5Var4);
                }
                defpackage.t80.w6IV1lieBIux(h5Var5, e30Var, oCu53ZX2v4Ju2);
                c20Var3.QiMR8OkAhezm(e30Var, java.lang.Integer.valueOf((i7 >> 12) & 14));
                e30Var.XntWc4eZSQ8j(true);
                h5Var = h5Var3;
                z = false;
                e30Var.XntWc4eZSQ8j(false);
            } else {
                eaVar = eaVar3;
                z = false;
                sc0Var = sc0Var2;
                h5Var = h5Var3;
                e30Var.NkfcFfdaVTox(-1444935078);
                e30Var.XntWc4eZSQ8j(false);
            }
            if (c20Var4 != null) {
                e30Var.NkfcFfdaVTox(-1444892360);
                defpackage.vl0 GcLuU6pT9wO94 = defpackage.h0.GcLuU6pT9wO9(sl0Var, "Trailing");
                defpackage.l50 l50Var2 = defpackage.z90.ZpBGe2uQfcn8;
                defpackage.vl0 fWTAfUmVKrZq4 = GcLuU6pT9wO94.fWTAfUmVKrZq(ol0Var);
                defpackage.vk0 JhCgjQRTAOCT2 = defpackage.ab.JhCgjQRTAOCT(eaVar, z);
                int s0TASMVLSWD54 = defpackage.la0.s0TASMVLSWD5(e30Var);
                defpackage.ay0 fNwYGHIYeJcR3 = e30Var.fNwYGHIYeJcR();
                defpackage.vl0 oCu53ZX2v4Ju3 = defpackage.i61.oCu53ZX2v4Ju(e30Var, fWTAfUmVKrZq4);
                e30Var.fhbmYuu9J3cT();
                if (e30Var.Fu5WBEia9jBo) {
                    e30Var.Ns0WNyEWdPsk(n10Var);
                } else {
                    e30Var.lXYSMswtzmix();
                }
                defpackage.t80.w6IV1lieBIux(h5Var2, e30Var, JhCgjQRTAOCT2);
                defpackage.t80.w6IV1lieBIux(h5Var, e30Var, fNwYGHIYeJcR3);
                if (e30Var.Fu5WBEia9jBo || !defpackage.ma0.QiMR8OkAhezm(e30Var.GcLuU6pT9wO9(), java.lang.Integer.valueOf(s0TASMVLSWD54))) {
                    defpackage.pVQOaWB9QMo4.T1fB7bDYiVJQ(s0TASMVLSWD54, e30Var, s0TASMVLSWD54, h5Var4);
                }
                defpackage.t80.w6IV1lieBIux(h5Var5, e30Var, oCu53ZX2v4Ju3);
                c20Var4.QiMR8OkAhezm(e30Var, java.lang.Integer.valueOf((i7 >> 15) & 14));
                e30Var.XntWc4eZSQ8j(true);
                e30Var.XntWc4eZSQ8j(false);
            } else {
                e30Var.NkfcFfdaVTox(-1444644422);
                e30Var.XntWc4eZSQ8j(z);
            }
            defpackage.sc0 sc0Var3 = defpackage.sc0.WDYagTQQm9ns;
            defpackage.sc0 sc0Var4 = sc0Var;
            if (sc0Var4 == sc0Var3) {
                wv0Var2 = wv0Var;
                fWTAfUmVKrZq = wv0Var2.giKS3J6vZuNy(sc0Var4);
            } else {
                wv0Var2 = wv0Var;
                fWTAfUmVKrZq = wv0Var2.fWTAfUmVKrZq(sc0Var4);
            }
            float fWTAfUmVKrZq5 = sc0Var4 == sc0Var3 ? wv0Var2.fWTAfUmVKrZq(sc0Var4) : wv0Var2.giKS3J6vZuNy(sc0Var4);
            float f = ((defpackage.or) e30Var.GE9mJIPrb8gP(defpackage.z90.fWTAfUmVKrZq)).WDYagTQQm9ns;
            if (java.lang.Float.isNaN(f)) {
                f = 0.0f;
            }
            float f2 = (f - 24.0f) / 2.0f;
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (c20Var3 != null) {
                fWTAfUmVKrZq -= f2;
                if (fWTAfUmVKrZq < 0.0f) {
                    fWTAfUmVKrZq = 0.0f;
                }
            }
            float f3 = fWTAfUmVKrZq;
            if (c20Var4 != null) {
                fWTAfUmVKrZq5 -= f2;
                if (fWTAfUmVKrZq5 < 0.0f) {
                    fWTAfUmVKrZq5 = 0.0f;
                }
            }
            float f4 = fWTAfUmVKrZq5;
            if (c20Var5 != null) {
                e30Var.NkfcFfdaVTox(-1443868027);
                defpackage.vl0 OVwOqzUGHcCU = defpackage.nq1.OVwOqzUGHcCU(defpackage.ce1.e6mdH7fiFuta(defpackage.ce1.JhCgjQRTAOCT(defpackage.h0.GcLuU6pT9wO9(sl0Var, "Prefix"), 24.0f, 0.0f, 2)), f3, 0.0f, 2.0f, 0.0f, 10);
                eaVar2 = eaVar4;
                defpackage.vk0 JhCgjQRTAOCT3 = defpackage.ab.JhCgjQRTAOCT(eaVar2, false);
                int s0TASMVLSWD55 = defpackage.la0.s0TASMVLSWD5(e30Var);
                defpackage.ay0 fNwYGHIYeJcR4 = e30Var.fNwYGHIYeJcR();
                defpackage.vl0 oCu53ZX2v4Ju4 = defpackage.i61.oCu53ZX2v4Ju(e30Var, OVwOqzUGHcCU);
                e30Var.fhbmYuu9J3cT();
                if (e30Var.Fu5WBEia9jBo) {
                    e30Var.Ns0WNyEWdPsk(n10Var);
                } else {
                    e30Var.lXYSMswtzmix();
                }
                defpackage.t80.w6IV1lieBIux(h5Var2, e30Var, JhCgjQRTAOCT3);
                defpackage.t80.w6IV1lieBIux(h5Var, e30Var, fNwYGHIYeJcR4);
                if (e30Var.Fu5WBEia9jBo || !defpackage.ma0.QiMR8OkAhezm(e30Var.GcLuU6pT9wO9(), java.lang.Integer.valueOf(s0TASMVLSWD55))) {
                    defpackage.pVQOaWB9QMo4.T1fB7bDYiVJQ(s0TASMVLSWD55, e30Var, s0TASMVLSWD55, h5Var4);
                }
                defpackage.t80.w6IV1lieBIux(h5Var5, e30Var, oCu53ZX2v4Ju4);
                c20Var10 = c20Var5;
                c20Var10.QiMR8OkAhezm(e30Var, java.lang.Integer.valueOf((i7 >> 18) & 14));
                e30Var.XntWc4eZSQ8j(true);
                e30Var.XntWc4eZSQ8j(false);
            } else {
                c20Var10 = c20Var5;
                eaVar2 = eaVar4;
                e30Var.NkfcFfdaVTox(-1443540326);
                e30Var.XntWc4eZSQ8j(false);
            }
            if (c20Var6 != null) {
                e30Var.NkfcFfdaVTox(-1443497081);
                defpackage.vl0 OVwOqzUGHcCU2 = defpackage.nq1.OVwOqzUGHcCU(defpackage.ce1.e6mdH7fiFuta(defpackage.ce1.JhCgjQRTAOCT(defpackage.h0.GcLuU6pT9wO9(sl0Var, "Suffix"), 24.0f, 0.0f, 2)), 2.0f, 0.0f, f4, 0.0f, 10);
                defpackage.vk0 JhCgjQRTAOCT4 = defpackage.ab.JhCgjQRTAOCT(eaVar2, false);
                int s0TASMVLSWD56 = defpackage.la0.s0TASMVLSWD5(e30Var);
                defpackage.ay0 fNwYGHIYeJcR5 = e30Var.fNwYGHIYeJcR();
                defpackage.vl0 oCu53ZX2v4Ju5 = defpackage.i61.oCu53ZX2v4Ju(e30Var, OVwOqzUGHcCU2);
                e30Var.fhbmYuu9J3cT();
                if (e30Var.Fu5WBEia9jBo) {
                    e30Var.Ns0WNyEWdPsk(n10Var);
                } else {
                    e30Var.lXYSMswtzmix();
                }
                defpackage.t80.w6IV1lieBIux(h5Var2, e30Var, JhCgjQRTAOCT4);
                defpackage.t80.w6IV1lieBIux(h5Var, e30Var, fNwYGHIYeJcR5);
                if (e30Var.Fu5WBEia9jBo || !defpackage.ma0.QiMR8OkAhezm(e30Var.GcLuU6pT9wO9(), java.lang.Integer.valueOf(s0TASMVLSWD56))) {
                    defpackage.pVQOaWB9QMo4.T1fB7bDYiVJQ(s0TASMVLSWD56, e30Var, s0TASMVLSWD56, h5Var4);
                }
                defpackage.t80.w6IV1lieBIux(h5Var5, e30Var, oCu53ZX2v4Ju5);
                c20Var6.QiMR8OkAhezm(e30Var, java.lang.Integer.valueOf((i7 >> 21) & 14));
                e30Var.XntWc4eZSQ8j(true);
                e30Var.XntWc4eZSQ8j(false);
            } else {
                e30Var.NkfcFfdaVTox(-1443171302);
                e30Var.XntWc4eZSQ8j(false);
            }
            defpackage.vl0 OVwOqzUGHcCU3 = defpackage.nq1.OVwOqzUGHcCU(sl0Var, f3, 0.0f, f4, 0.0f, 10);
            if (c20Var2 != null) {
                e30Var.NkfcFfdaVTox(-1442671489);
                defpackage.vl0 GcLuU6pT9wO95 = defpackage.h0.GcLuU6pT9wO9(sl0Var, "Label");
                if (i9 != 4) {
                    if ((i8 & 8) != 0) {
                        el1Var2 = el1Var;
                    } else {
                        el1Var2 = el1Var;
                    }
                    z3 = false;
                    GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
                    if (!z3 || GcLuU6pT9wO9 == obj) {
                        i5 = 6;
                        GcLuU6pT9wO9 = new defpackage.jc1(i5, el1Var2);
                        e30Var.EgL5gQQnyJKX(GcLuU6pT9wO9);
                    } else {
                        i5 = 6;
                    }
                    defpackage.vl0 fWTAfUmVKrZq6 = defpackage.ce1.e6mdH7fiFuta(defpackage.la0.w7APNrr0aGRc(GcLuU6pT9wO95, new defpackage.cd(i5, (defpackage.n10) GcLuU6pT9wO9))).fWTAfUmVKrZq(OVwOqzUGHcCU3);
                    defpackage.vk0 JhCgjQRTAOCT5 = defpackage.ab.JhCgjQRTAOCT(eaVar2, false);
                    s0TASMVLSWD5 = defpackage.la0.s0TASMVLSWD5(e30Var);
                    defpackage.ay0 fNwYGHIYeJcR6 = e30Var.fNwYGHIYeJcR();
                    defpackage.vl0 oCu53ZX2v4Ju6 = defpackage.i61.oCu53ZX2v4Ju(e30Var, fWTAfUmVKrZq6);
                    e30Var.fhbmYuu9J3cT();
                    if (e30Var.Fu5WBEia9jBo) {
                        e30Var.lXYSMswtzmix();
                    } else {
                        e30Var.Ns0WNyEWdPsk(n10Var);
                    }
                    defpackage.t80.w6IV1lieBIux(h5Var2, e30Var, JhCgjQRTAOCT5);
                    defpackage.t80.w6IV1lieBIux(h5Var, e30Var, fNwYGHIYeJcR6);
                    if (!e30Var.Fu5WBEia9jBo || !defpackage.ma0.QiMR8OkAhezm(e30Var.GcLuU6pT9wO9(), java.lang.Integer.valueOf(s0TASMVLSWD5))) {
                        defpackage.pVQOaWB9QMo4.T1fB7bDYiVJQ(s0TASMVLSWD5, e30Var, s0TASMVLSWD5, h5Var4);
                    }
                    defpackage.t80.w6IV1lieBIux(h5Var5, e30Var, oCu53ZX2v4Ju6);
                    c20Var2.QiMR8OkAhezm(e30Var, java.lang.Integer.valueOf((i7 >> 6) & 14));
                    e30Var.XntWc4eZSQ8j(true);
                    e30Var.XntWc4eZSQ8j(false);
                } else {
                    el1Var2 = el1Var;
                }
                z3 = true;
                GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
                if (z3) {
                }
                i5 = 6;
                GcLuU6pT9wO9 = new defpackage.jc1(i5, el1Var2);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO9);
                defpackage.vl0 fWTAfUmVKrZq62 = defpackage.ce1.e6mdH7fiFuta(defpackage.la0.w7APNrr0aGRc(GcLuU6pT9wO95, new defpackage.cd(i5, (defpackage.n10) GcLuU6pT9wO9))).fWTAfUmVKrZq(OVwOqzUGHcCU3);
                defpackage.vk0 JhCgjQRTAOCT52 = defpackage.ab.JhCgjQRTAOCT(eaVar2, false);
                s0TASMVLSWD5 = defpackage.la0.s0TASMVLSWD5(e30Var);
                defpackage.ay0 fNwYGHIYeJcR62 = e30Var.fNwYGHIYeJcR();
                defpackage.vl0 oCu53ZX2v4Ju62 = defpackage.i61.oCu53ZX2v4Ju(e30Var, fWTAfUmVKrZq62);
                e30Var.fhbmYuu9J3cT();
                if (e30Var.Fu5WBEia9jBo) {
                }
                defpackage.t80.w6IV1lieBIux(h5Var2, e30Var, JhCgjQRTAOCT52);
                defpackage.t80.w6IV1lieBIux(h5Var, e30Var, fNwYGHIYeJcR62);
                if (!e30Var.Fu5WBEia9jBo) {
                }
                defpackage.pVQOaWB9QMo4.T1fB7bDYiVJQ(s0TASMVLSWD5, e30Var, s0TASMVLSWD5, h5Var4);
                defpackage.t80.w6IV1lieBIux(h5Var5, e30Var, oCu53ZX2v4Ju62);
                c20Var2.QiMR8OkAhezm(e30Var, java.lang.Integer.valueOf((i7 >> 6) & 14));
                e30Var.XntWc4eZSQ8j(true);
                e30Var.XntWc4eZSQ8j(false);
            } else {
                el1Var2 = el1Var;
                e30Var.NkfcFfdaVTox(-1442276518);
                e30Var.XntWc4eZSQ8j(false);
            }
            defpackage.vl0 OVwOqzUGHcCU4 = defpackage.nq1.OVwOqzUGHcCU(defpackage.ce1.e6mdH7fiFuta(defpackage.ce1.JhCgjQRTAOCT(sl0Var, 24.0f, 0.0f, 2)), c20Var10 == null ? f3 : 0.0f, 0.0f, c20Var6 == null ? f4 : 0.0f, 0.0f, 10);
            if (d20Var != null) {
                e30Var.NkfcFfdaVTox(-1441906533);
                d20Var2 = d20Var;
                d20Var2.JhCgjQRTAOCT(defpackage.h0.GcLuU6pT9wO9(sl0Var, "Hint").fWTAfUmVKrZq(OVwOqzUGHcCU4), e30Var, java.lang.Integer.valueOf((i7 >> 6) & 112));
                e30Var.XntWc4eZSQ8j(false);
            } else {
                d20Var2 = d20Var;
                e30Var.NkfcFfdaVTox(-1441815238);
                e30Var.XntWc4eZSQ8j(false);
            }
            defpackage.vl0 fWTAfUmVKrZq7 = defpackage.h0.GcLuU6pT9wO9(sl0Var, "TextField").fWTAfUmVKrZq(OVwOqzUGHcCU4);
            defpackage.vk0 JhCgjQRTAOCT6 = defpackage.ab.JhCgjQRTAOCT(eaVar2, true);
            int s0TASMVLSWD57 = defpackage.la0.s0TASMVLSWD5(e30Var);
            defpackage.ay0 fNwYGHIYeJcR7 = e30Var.fNwYGHIYeJcR();
            defpackage.vl0 oCu53ZX2v4Ju7 = defpackage.i61.oCu53ZX2v4Ju(e30Var, fWTAfUmVKrZq7);
            e30Var.fhbmYuu9J3cT();
            if (e30Var.Fu5WBEia9jBo) {
                e30Var.Ns0WNyEWdPsk(n10Var);
            } else {
                e30Var.lXYSMswtzmix();
            }
            defpackage.t80.w6IV1lieBIux(h5Var2, e30Var, JhCgjQRTAOCT6);
            defpackage.t80.w6IV1lieBIux(h5Var, e30Var, fNwYGHIYeJcR7);
            if (e30Var.Fu5WBEia9jBo || !defpackage.ma0.QiMR8OkAhezm(e30Var.GcLuU6pT9wO9(), java.lang.Integer.valueOf(s0TASMVLSWD57))) {
                defpackage.pVQOaWB9QMo4.T1fB7bDYiVJQ(s0TASMVLSWD57, e30Var, s0TASMVLSWD57, h5Var4);
            }
            defpackage.t80.w6IV1lieBIux(h5Var5, e30Var, oCu53ZX2v4Ju7);
            c20Var8 = c20Var;
            c20Var8.QiMR8OkAhezm(e30Var, java.lang.Integer.valueOf((i7 >> 3) & 14));
            e30Var.XntWc4eZSQ8j(true);
            if (c20Var7 != null) {
                e30Var.NkfcFfdaVTox(-1441566587);
                defpackage.vl0 GcLuU6pT9wO96 = defpackage.nq1.GcLuU6pT9wO9(defpackage.ce1.e6mdH7fiFuta(defpackage.ce1.JhCgjQRTAOCT(defpackage.h0.GcLuU6pT9wO9(sl0Var, "Supporting"), 16.0f, 0.0f, 2)), new defpackage.wv0(16.0f, 4.0f, 16.0f, 0.0f));
                defpackage.vk0 JhCgjQRTAOCT7 = defpackage.ab.JhCgjQRTAOCT(eaVar2, false);
                int s0TASMVLSWD58 = defpackage.la0.s0TASMVLSWD5(e30Var);
                defpackage.ay0 fNwYGHIYeJcR8 = e30Var.fNwYGHIYeJcR();
                defpackage.vl0 oCu53ZX2v4Ju8 = defpackage.i61.oCu53ZX2v4Ju(e30Var, GcLuU6pT9wO96);
                e30Var.fhbmYuu9J3cT();
                if (e30Var.Fu5WBEia9jBo) {
                    e30Var.Ns0WNyEWdPsk(n10Var);
                } else {
                    e30Var.lXYSMswtzmix();
                }
                defpackage.t80.w6IV1lieBIux(h5Var2, e30Var, JhCgjQRTAOCT7);
                defpackage.t80.w6IV1lieBIux(h5Var, e30Var, fNwYGHIYeJcR8);
                if (e30Var.Fu5WBEia9jBo || !defpackage.ma0.QiMR8OkAhezm(e30Var.GcLuU6pT9wO9(), java.lang.Integer.valueOf(s0TASMVLSWD58))) {
                    defpackage.pVQOaWB9QMo4.T1fB7bDYiVJQ(s0TASMVLSWD58, e30Var, s0TASMVLSWD58, h5Var4);
                }
                defpackage.t80.w6IV1lieBIux(h5Var5, e30Var, oCu53ZX2v4Ju8);
                c20Var9 = c20Var7;
                c20Var9.QiMR8OkAhezm(e30Var, java.lang.Integer.valueOf((i8 >> 6) & 14));
                z2 = true;
                e30Var.XntWc4eZSQ8j(true);
                e30Var.XntWc4eZSQ8j(false);
            } else {
                c20Var9 = c20Var7;
                z2 = true;
                e30Var.NkfcFfdaVTox(-1441177382);
                e30Var.XntWc4eZSQ8j(false);
            }
            e30Var.XntWc4eZSQ8j(z2);
        } else {
            c20Var8 = c20Var;
            c20Var9 = c20Var7;
            d20Var2 = d20Var;
            el1Var2 = el1Var;
            e30Var.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD59 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD59 != null) {
            final defpackage.c20 c20Var11 = c20Var8;
            final defpackage.el1 el1Var3 = el1Var2;
            final defpackage.d20 d20Var3 = d20Var2;
            final defpackage.c20 c20Var12 = c20Var9;
            s0TASMVLSWD59.JhCgjQRTAOCT = new defpackage.c20() { // from class: il1
                @Override // defpackage.c20
                public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj2, java.lang.Object obj3) {
                    ((java.lang.Integer) obj3).getClass();
                    int IBvW5fLsPuHy = defpackage.m90.IBvW5fLsPuHy(i | 1);
                    int IBvW5fLsPuHy2 = defpackage.m90.IBvW5fLsPuHy(i2);
                    defpackage.wc1.P05cfTpS5W5L(defpackage.c20.this, c20Var2, d20Var3, c20Var3, c20Var4, c20Var5, c20Var6, ll1Var, el1Var3, nhVar, c20Var12, wv0Var2, (defpackage.e30) obj2, IBvW5fLsPuHy, IBvW5fLsPuHy2);
                    return defpackage.gs1.ZpBGe2uQfcn8;
                }
            };
        }
    }

    public static final defpackage.q90 PS16moFv2oLu(defpackage.s31 s31Var) {
        return new defpackage.q90(java.lang.Math.round(s31Var.ZpBGe2uQfcn8), java.lang.Math.round(s31Var.giKS3J6vZuNy), java.lang.Math.round(s31Var.fWTAfUmVKrZq), java.lang.Math.round(s31Var.JhCgjQRTAOCT));
    }

    public static final void QiMR8OkAhezm(final java.lang.String str, final defpackage.y10 y10Var, final defpackage.vl0 vl0Var, final boolean z, final defpackage.pn1 pn1Var, final defpackage.c20 c20Var, final defpackage.c20 c20Var2, defpackage.p81 p81Var, defpackage.cc0 cc0Var, defpackage.bc0 bc0Var, int i, int i2, final defpackage.cd1 cd1Var, final defpackage.vk1 vk1Var, defpackage.e30 e30Var, final int i3) {
        final defpackage.p81 p81Var2;
        final defpackage.cc0 cc0Var2;
        final defpackage.bc0 bc0Var2;
        final int i4;
        final int i5;
        defpackage.p81 p81Var3;
        int i6;
        defpackage.cc0 cc0Var3;
        defpackage.bc0 bc0Var3;
        int i7;
        e30Var.PS16moFv2oLu(-154966360);
        int i8 = i3 | (e30Var.oh71FJcDz6S2(str) ? 4 : 2) | (e30Var.QiMR8OkAhezm(true) ? 2048 : 1024) | (e30Var.oh71FJcDz6S2(pn1Var) ? 131072 : 65536) | 113246208;
        if (e30Var.zJPqDeoF0Os1(i8 & 1, ((306783379 & i8) == 306783378 && ((((e30Var.oh71FJcDz6S2(cd1Var) ? ' ' : (char) 16) | 6) | (e30Var.oh71FJcDz6S2(vk1Var) ? 256 : 128)) & 147) == 146) ? false : true)) {
            e30Var.CZa7MwI9IzLd();
            if ((i3 & 1) == 0 || e30Var.oCu53ZX2v4Ju()) {
                p81Var3 = defpackage.pa1.s0TASMVLSWD5;
                i6 = 1;
                cc0Var3 = defpackage.cc0.ZpBGe2uQfcn8;
                bc0Var3 = defpackage.bc0.ZpBGe2uQfcn8;
                i7 = Integer.MAX_VALUE;
            } else {
                e30Var.Jkfc0NcwyPL8();
                p81Var3 = p81Var;
                cc0Var3 = cc0Var;
                bc0Var3 = bc0Var;
                i7 = i;
                i6 = i2;
            }
            e30Var.WmetiUbpKU9I();
            e30Var.NkfcFfdaVTox(488210003);
            java.lang.Object GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
            if (GcLuU6pT9wO9 == defpackage.cj.ZpBGe2uQfcn8) {
                GcLuU6pT9wO9 = new defpackage.in0();
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO9);
            }
            defpackage.in0 in0Var = (defpackage.in0) GcLuU6pT9wO9;
            e30Var.XntWc4eZSQ8j(false);
            e30Var.NkfcFfdaVTox(1401227490);
            long giKS3J6vZuNy2 = pn1Var.giKS3J6vZuNy();
            if (giKS3J6vZuNy2 == 16) {
                giKS3J6vZuNy2 = ((java.lang.Boolean) defpackage.nq1.VFeft99leXEK(in0Var, e30Var, 0).getValue()).booleanValue() ? vk1Var.ZpBGe2uQfcn8 : vk1Var.giKS3J6vZuNy;
            }
            long j = giKS3J6vZuNy2;
            e30Var.XntWc4eZSQ8j(false);
            defpackage.vx1.fWTAfUmVKrZq(defpackage.kn1.ZpBGe2uQfcn8.ZpBGe2uQfcn8(vk1Var.Ns0WNyEWdPsk), defpackage.nn.OcTWLQzke1i2(1459735400, new defpackage.kl1(vl0Var, vk1Var, str, y10Var, z, pn1Var.JhCgjQRTAOCT(new defpackage.pn1(j, 0L, null, null, 0L, 0, 0L, 16777214)), cc0Var3, bc0Var3, i7, i6, p81Var3, in0Var, c20Var, c20Var2, cd1Var), e30Var), e30Var, 56);
            cc0Var2 = cc0Var3;
            bc0Var2 = bc0Var3;
            i4 = i7;
            i5 = i6;
            p81Var2 = p81Var3;
        } else {
            e30Var.Jkfc0NcwyPL8();
            p81Var2 = p81Var;
            cc0Var2 = cc0Var;
            bc0Var2 = bc0Var;
            i4 = i;
            i5 = i2;
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.c20(str, y10Var, vl0Var, z, pn1Var, c20Var, c20Var2, p81Var2, cc0Var2, bc0Var2, i4, i5, cd1Var, vk1Var, i3) { // from class: hl1
                public final /* synthetic */ defpackage.c20 GE9mJIPrb8gP;
                public final /* synthetic */ defpackage.c20 Ns0WNyEWdPsk;
                public final /* synthetic */ boolean P05cfTpS5W5L;
                public final /* synthetic */ defpackage.vl0 QiMR8OkAhezm;
                public final /* synthetic */ int T1fB7bDYiVJQ;
                public final /* synthetic */ java.lang.String WDYagTQQm9ns;
                public final /* synthetic */ defpackage.cd1 WmetiUbpKU9I;
                public final /* synthetic */ int XntWc4eZSQ8j;
                public final /* synthetic */ defpackage.pn1 e6mdH7fiFuta;
                public final /* synthetic */ defpackage.p81 fNwYGHIYeJcR;
                public final /* synthetic */ defpackage.bc0 gUjdnLbkVAaA;
                public final /* synthetic */ defpackage.cc0 h3m55N1URyyK;
                public final /* synthetic */ defpackage.y10 oh71FJcDz6S2;
                public final /* synthetic */ defpackage.vk1 s0TASMVLSWD5;

                @Override // defpackage.c20
                public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).getClass();
                    int IBvW5fLsPuHy = defpackage.m90.IBvW5fLsPuHy(806904241);
                    defpackage.wc1.QiMR8OkAhezm(this.WDYagTQQm9ns, this.oh71FJcDz6S2, this.QiMR8OkAhezm, this.P05cfTpS5W5L, this.e6mdH7fiFuta, this.GE9mJIPrb8gP, this.Ns0WNyEWdPsk, this.fNwYGHIYeJcR, this.h3m55N1URyyK, this.gUjdnLbkVAaA, this.T1fB7bDYiVJQ, this.XntWc4eZSQ8j, this.WmetiUbpKU9I, this.s0TASMVLSWD5, (defpackage.e30) obj, IBvW5fLsPuHy);
                    return defpackage.gs1.ZpBGe2uQfcn8;
                }
            };
        }
    }

    public static final defpackage.s31 T1fB7bDYiVJQ(defpackage.rc0 rc0Var, boolean z) {
        defpackage.rc0 UmgHb6n58gfG = UmgHb6n58gfG(rc0Var);
        float GcLuU6pT9wO9 = (int) (UmgHb6n58gfG.GcLuU6pT9wO9() >> 32);
        float GcLuU6pT9wO92 = (int) (UmgHb6n58gfG.GcLuU6pT9wO9() & 4294967295L);
        defpackage.s31 hH0RRJrNssvh = UmgHb6n58gfG.hH0RRJrNssvh(rc0Var, z);
        float f = hH0RRJrNssvh.ZpBGe2uQfcn8;
        if (z) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f > GcLuU6pT9wO9) {
                f = GcLuU6pT9wO9;
            }
        }
        float f2 = hH0RRJrNssvh.giKS3J6vZuNy;
        if (z) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > GcLuU6pT9wO92) {
                f2 = GcLuU6pT9wO92;
            }
        }
        float f3 = hH0RRJrNssvh.fWTAfUmVKrZq;
        if (z) {
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 <= GcLuU6pT9wO9) {
                GcLuU6pT9wO9 = f3;
            }
            f3 = GcLuU6pT9wO9;
        }
        float f4 = hH0RRJrNssvh.JhCgjQRTAOCT;
        if (z) {
            float f5 = f4 >= 0.0f ? f4 : 0.0f;
            if (f5 <= GcLuU6pT9wO92) {
                GcLuU6pT9wO92 = f5;
            }
            f4 = GcLuU6pT9wO92;
        }
        if (f == f3 || f2 == f4) {
            return defpackage.s31.WDYagTQQm9ns;
        }
        long e6mdH7fiFuta = UmgHb6n58gfG.e6mdH7fiFuta((java.lang.Float.floatToRawIntBits(f) << 32) | (java.lang.Float.floatToRawIntBits(f2) & 4294967295L));
        long e6mdH7fiFuta2 = UmgHb6n58gfG.e6mdH7fiFuta((java.lang.Float.floatToRawIntBits(f3) << 32) | (java.lang.Float.floatToRawIntBits(f2) & 4294967295L));
        long e6mdH7fiFuta3 = UmgHb6n58gfG.e6mdH7fiFuta((java.lang.Float.floatToRawIntBits(f3) << 32) | (java.lang.Float.floatToRawIntBits(f4) & 4294967295L));
        long e6mdH7fiFuta4 = UmgHb6n58gfG.e6mdH7fiFuta((java.lang.Float.floatToRawIntBits(f4) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32));
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (e6mdH7fiFuta >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (e6mdH7fiFuta2 >> 32));
        float intBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (e6mdH7fiFuta4 >> 32));
        float intBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (e6mdH7fiFuta3 >> 32));
        float min = java.lang.Math.min(intBitsToFloat, java.lang.Math.min(intBitsToFloat2, java.lang.Math.min(intBitsToFloat3, intBitsToFloat4)));
        float max = java.lang.Math.max(intBitsToFloat, java.lang.Math.max(intBitsToFloat2, java.lang.Math.max(intBitsToFloat3, intBitsToFloat4)));
        float intBitsToFloat5 = java.lang.Float.intBitsToFloat((int) (e6mdH7fiFuta & 4294967295L));
        float intBitsToFloat6 = java.lang.Float.intBitsToFloat((int) (e6mdH7fiFuta2 & 4294967295L));
        float intBitsToFloat7 = java.lang.Float.intBitsToFloat((int) (e6mdH7fiFuta4 & 4294967295L));
        float intBitsToFloat8 = java.lang.Float.intBitsToFloat((int) (e6mdH7fiFuta3 & 4294967295L));
        return new defpackage.s31(min, java.lang.Math.min(intBitsToFloat5, java.lang.Math.min(intBitsToFloat6, java.lang.Math.min(intBitsToFloat7, intBitsToFloat8))), max, java.lang.Math.max(intBitsToFloat5, java.lang.Math.max(intBitsToFloat6, java.lang.Math.max(intBitsToFloat7, intBitsToFloat8))));
    }

    public static final defpackage.rc0 UmgHb6n58gfG(defpackage.rc0 rc0Var) {
        defpackage.rc0 rc0Var2;
        defpackage.rc0 Ns0WNyEWdPsk = rc0Var.Ns0WNyEWdPsk();
        while (true) {
            defpackage.rc0 rc0Var3 = Ns0WNyEWdPsk;
            rc0Var2 = rc0Var;
            rc0Var = rc0Var3;
            if (rc0Var == null) {
                break;
            }
            Ns0WNyEWdPsk = rc0Var.Ns0WNyEWdPsk();
        }
        defpackage.sr0 sr0Var = rc0Var2 instanceof defpackage.sr0 ? (defpackage.sr0) rc0Var2 : null;
        if (sr0Var == null) {
            return rc0Var2;
        }
        defpackage.sr0 sr0Var2 = sr0Var.w7APNrr0aGRc;
        while (true) {
            defpackage.sr0 sr0Var3 = sr0Var2;
            defpackage.sr0 sr0Var4 = sr0Var;
            sr0Var = sr0Var3;
            if (sr0Var == null) {
                return sr0Var4;
            }
            sr0Var2 = sr0Var.w7APNrr0aGRc;
        }
    }

    public static final int VFeft99leXEK(int i, defpackage.jf0 jf0Var, java.lang.Object obj) {
        int giKS3J6vZuNy2;
        return (obj == null || jf0Var.fWTAfUmVKrZq() == 0 || (i < jf0Var.fWTAfUmVKrZq() && obj.equals(jf0Var.JhCgjQRTAOCT(i))) || (giKS3J6vZuNy2 = jf0Var.JhCgjQRTAOCT.giKS3J6vZuNy(obj)) == -1) ? i : giKS3J6vZuNy2;
    }

    public static final void WDYagTQQm9ns(java.lang.String str, defpackage.y10 y10Var, defpackage.vl0 vl0Var, defpackage.e30 e30Var, int i) {
        defpackage.h5 h5Var;
        defpackage.n nVar;
        defpackage.h5 h5Var2;
        int i2;
        defpackage.sl0 sl0Var;
        defpackage.e30 e30Var2 = e30Var;
        str.getClass();
        y10Var.getClass();
        e30Var2.PS16moFv2oLu(-1047417864);
        int i3 = i | (e30Var2.oh71FJcDz6S2(str) ? 4 : 2) | (e30Var2.P05cfTpS5W5L(y10Var) ? 32 : 16);
        if (e30Var2.zJPqDeoF0Os1(i3 & 1, (i3 & 147) != 146)) {
            java.lang.String xahdJg25P1Bv = defpackage.q70.xahdJg25P1Bv(com.ice.fishing.wolberta.R.string.search_placeholder, e30Var2);
            defpackage.vl0 w6IV1lieBIux = defpackage.nq1.w6IV1lieBIux(defpackage.nn.JhCgjQRTAOCT(defpackage.nn.oh71FJcDz6S2(defpackage.h0.WmetiUbpKU9I(defpackage.ce1.giKS3J6vZuNy(vl0Var, 1.0f), defpackage.j80.oCu53ZX2v4Ju(e30Var2).fWTAfUmVKrZq), defpackage.j80.maCixPsq4ml2(e30Var2).oh71FJcDz6S2, defpackage.j80.oCu53ZX2v4Ju(e30Var2).fWTAfUmVKrZq), defpackage.pf.giKS3J6vZuNy(defpackage.j80.maCixPsq4ml2(e30Var2).ZpBGe2uQfcn8, 0.1f), defpackage.la0.blKFvluuDQOf), 12.0f, 10.0f);
            defpackage.ea eaVar = defpackage.jVUAPb5NnIYW.oh71FJcDz6S2;
            defpackage.vk0 JhCgjQRTAOCT = defpackage.ab.JhCgjQRTAOCT(eaVar, false);
            int hashCode = java.lang.Long.hashCode(e30Var2.CZa7MwI9IzLd);
            defpackage.ay0 fNwYGHIYeJcR = e30Var2.fNwYGHIYeJcR();
            defpackage.vl0 oCu53ZX2v4Ju = defpackage.i61.oCu53ZX2v4Ju(e30Var2, w6IV1lieBIux);
            defpackage.wi.fWTAfUmVKrZq.getClass();
            defpackage.pj pjVar = defpackage.vi.giKS3J6vZuNy;
            e30Var2.fhbmYuu9J3cT();
            if (e30Var2.Fu5WBEia9jBo) {
                e30Var2.Ns0WNyEWdPsk(pjVar);
            } else {
                e30Var2.lXYSMswtzmix();
            }
            defpackage.h5 h5Var3 = defpackage.vi.oh71FJcDz6S2;
            defpackage.t80.w6IV1lieBIux(h5Var3, e30Var2, JhCgjQRTAOCT);
            defpackage.h5 h5Var4 = defpackage.vi.WDYagTQQm9ns;
            defpackage.t80.w6IV1lieBIux(h5Var4, e30Var2, fNwYGHIYeJcR);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode);
            defpackage.h5 h5Var5 = defpackage.vi.QiMR8OkAhezm;
            defpackage.t80.w6IV1lieBIux(h5Var5, e30Var2, valueOf);
            defpackage.n nVar2 = defpackage.vi.P05cfTpS5W5L;
            defpackage.t80.Mearx7yMn90V(e30Var2, nVar2);
            defpackage.h5 h5Var6 = defpackage.vi.JhCgjQRTAOCT;
            defpackage.t80.w6IV1lieBIux(h5Var6, e30Var2, oCu53ZX2v4Ju);
            defpackage.v61 ZpBGe2uQfcn82 = defpackage.u61.ZpBGe2uQfcn8(defpackage.vx1.ZpBGe2uQfcn8, defpackage.jVUAPb5NnIYW.XntWc4eZSQ8j, e30Var2, 48);
            int hashCode2 = java.lang.Long.hashCode(e30Var2.CZa7MwI9IzLd);
            defpackage.ay0 fNwYGHIYeJcR2 = e30Var2.fNwYGHIYeJcR();
            defpackage.sl0 sl0Var2 = defpackage.sl0.ZpBGe2uQfcn8;
            defpackage.vl0 oCu53ZX2v4Ju2 = defpackage.i61.oCu53ZX2v4Ju(e30Var2, sl0Var2);
            e30Var2.fhbmYuu9J3cT();
            if (e30Var2.Fu5WBEia9jBo) {
                e30Var2.Ns0WNyEWdPsk(pjVar);
            } else {
                e30Var2.lXYSMswtzmix();
            }
            defpackage.t80.w6IV1lieBIux(h5Var3, e30Var2, ZpBGe2uQfcn82);
            defpackage.t80.w6IV1lieBIux(h5Var4, e30Var2, fNwYGHIYeJcR2);
            defpackage.pVQOaWB9QMo4.XntWc4eZSQ8j(hashCode2, e30Var2, h5Var5, e30Var2, nVar2);
            defpackage.t80.w6IV1lieBIux(h5Var6, e30Var2, oCu53ZX2v4Ju2);
            defpackage.j60 j60Var = defpackage.w60.ZpBGe2uQfcn8;
            if (j60Var != null) {
                h5Var = h5Var4;
                nVar = nVar2;
                h5Var2 = h5Var5;
            } else {
                defpackage.i60 i60Var = new defpackage.i60("Filled.Search", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i4 = defpackage.bt1.ZpBGe2uQfcn8;
                defpackage.lf1 lf1Var = new defpackage.lf1(defpackage.pf.giKS3J6vZuNy);
                defpackage.k0 k0Var = new defpackage.k0(16, (byte) 0);
                java.util.ArrayList arrayList = (java.util.ArrayList) k0Var.oh71FJcDz6S2;
                h5Var = h5Var4;
                k0Var.WmetiUbpKU9I(15.5f, 14.0f);
                arrayList.add(new defpackage.lx0(-0.79f));
                k0Var.XntWc4eZSQ8j(-0.28f, -0.27f);
                k0Var.GE9mJIPrb8gP(15.41f, 12.59f, 16.0f, 11.11f, 16.0f, 9.5f);
                k0Var.GE9mJIPrb8gP(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f);
                nVar = nVar2;
                k0Var.ZVVdXbWmyCSK(3.0f, 5.91f, 3.0f, 9.5f);
                k0Var.ZVVdXbWmyCSK(5.91f, 16.0f, 9.5f, 16.0f);
                k0Var.Ns0WNyEWdPsk(1.61f, 0.0f, 3.09f, -0.59f, 4.23f, -1.57f);
                k0Var.XntWc4eZSQ8j(0.27f, 0.28f);
                arrayList.add(new defpackage.rx0(0.79f));
                k0Var.XntWc4eZSQ8j(5.0f, 4.99f);
                k0Var.T1fB7bDYiVJQ(20.49f, 19.0f);
                k0Var.XntWc4eZSQ8j(-4.99f, -5.0f);
                k0Var.oh71FJcDz6S2();
                k0Var.WmetiUbpKU9I(9.5f, 14.0f);
                k0Var.GE9mJIPrb8gP(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
                h5Var2 = h5Var5;
                k0Var.ZVVdXbWmyCSK(7.01f, 5.0f, 9.5f, 5.0f);
                k0Var.ZVVdXbWmyCSK(14.0f, 7.01f, 14.0f, 9.5f);
                k0Var.ZVVdXbWmyCSK(11.99f, 14.0f, 9.5f, 14.0f);
                k0Var.oh71FJcDz6S2();
                defpackage.i60.ZpBGe2uQfcn8(i60Var, arrayList, lf1Var);
                j60Var = i60Var.giKS3J6vZuNy();
                defpackage.w60.ZpBGe2uQfcn8 = j60Var;
            }
            long j = defpackage.j80.maCixPsq4ml2(e30Var2).ZpBGe2uQfcn8;
            defpackage.h5 h5Var7 = h5Var;
            defpackage.h5 h5Var8 = h5Var2;
            defpackage.n nVar3 = nVar;
            defpackage.f60.ZpBGe2uQfcn8(j60Var, defpackage.ce1.oh71FJcDz6S2(24.0f), j, e30Var2, 432, 0);
            defpackage.vl0 OVwOqzUGHcCU = defpackage.nq1.OVwOqzUGHcCU(new defpackage.zd0(1.0f, true), 8.0f, 0.0f, 0.0f, 0.0f, 14);
            defpackage.vk0 JhCgjQRTAOCT2 = defpackage.ab.JhCgjQRTAOCT(eaVar, false);
            int hashCode3 = java.lang.Long.hashCode(e30Var2.CZa7MwI9IzLd);
            defpackage.ay0 fNwYGHIYeJcR3 = e30Var2.fNwYGHIYeJcR();
            defpackage.vl0 oCu53ZX2v4Ju3 = defpackage.i61.oCu53ZX2v4Ju(e30Var2, OVwOqzUGHcCU);
            e30Var2.fhbmYuu9J3cT();
            if (e30Var2.Fu5WBEia9jBo) {
                e30Var2.Ns0WNyEWdPsk(pjVar);
            } else {
                e30Var2.lXYSMswtzmix();
            }
            defpackage.t80.w6IV1lieBIux(h5Var3, e30Var2, JhCgjQRTAOCT2);
            defpackage.t80.w6IV1lieBIux(h5Var7, e30Var2, fNwYGHIYeJcR3);
            defpackage.pVQOaWB9QMo4.XntWc4eZSQ8j(hashCode3, e30Var2, h5Var8, e30Var2, nVar3);
            defpackage.t80.w6IV1lieBIux(h5Var6, e30Var2, oCu53ZX2v4Ju3);
            if (str.length() == 0) {
                e30Var2.NkfcFfdaVTox(1250256428);
                i2 = i3;
                sl0Var = sl0Var2;
                defpackage.ym1.giKS3J6vZuNy(xahdJg25P1Bv, null, defpackage.j80.maCixPsq4ml2(e30Var2).ZpBGe2uQfcn8, 0L, 0L, null, 0L, 0, false, 0, 0, defpackage.j80.OcTWLQzke1i2(e30Var2).e6mdH7fiFuta, e30Var, 0, 0, 131066);
                e30Var2 = e30Var;
                e30Var2.XntWc4eZSQ8j(false);
            } else {
                e30Var2 = e30Var2;
                i2 = i3;
                sl0Var = sl0Var2;
                e30Var2.NkfcFfdaVTox(1250454394);
                e30Var2.XntWc4eZSQ8j(false);
            }
            defpackage.u9.ZpBGe2uQfcn8(str, y10Var, defpackage.ce1.giKS3J6vZuNy(sl0Var, 1.0f), false, false, defpackage.j80.OcTWLQzke1i2(e30Var2).e6mdH7fiFuta, null, null, 0, 0, null, null, null, null, null, e30Var2, (i2 & 14) | 384 | (i2 & 112), 0, 65496);
            e30Var2.XntWc4eZSQ8j(true);
            e30Var2.XntWc4eZSQ8j(true);
            e30Var2.XntWc4eZSQ8j(true);
        } else {
            e30Var2.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var2.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.p71(str, y10Var, vl0Var, i, 10);
        }
    }

    public static final boolean Wc0TdmRSwbbi(defpackage.jd0 jd0Var) {
        int ordinal = jd0Var.BXaznwstz2U0.JhCgjQRTAOCT.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            defpackage.h7.T1fB7bDYiVJQ();
                            return false;
                        }
                        defpackage.jd0 w7APNrr0aGRc = jd0Var.w7APNrr0aGRc();
                        if (w7APNrr0aGRc != null) {
                            return Wc0TdmRSwbbi(w7APNrr0aGRc);
                        }
                        defpackage.h7.w7APNrr0aGRc("no parent for idle node");
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final void WmetiUbpKU9I(defpackage.nz nzVar, defpackage.ho0 ho0Var) {
        if (!nzVar.WDYagTQQm9ns.s0TASMVLSWD5) {
            defpackage.e80.giKS3J6vZuNy("visitChildren called on an unattached node");
        }
        defpackage.ho0 ho0Var2 = new defpackage.ho0(new defpackage.ul0[16]);
        defpackage.ul0 ul0Var = nzVar.WDYagTQQm9ns;
        defpackage.ul0 ul0Var2 = ul0Var.GE9mJIPrb8gP;
        if (ul0Var2 == null) {
            defpackage.la0.oh71FJcDz6S2(ho0Var2, ul0Var);
        } else {
            ho0Var2.giKS3J6vZuNy(ul0Var2);
        }
        while (true) {
            int i = ho0Var2.QiMR8OkAhezm;
            if (i == 0) {
                return;
            }
            defpackage.ul0 ul0Var3 = (defpackage.ul0) ho0Var2.Ns0WNyEWdPsk(i - 1);
            if ((ul0Var3.P05cfTpS5W5L & 1024) == 0) {
                defpackage.la0.oh71FJcDz6S2(ho0Var2, ul0Var3);
            } else {
                while (true) {
                    if (ul0Var3 == null) {
                        break;
                    }
                    if ((ul0Var3.QiMR8OkAhezm & 1024) != 0) {
                        defpackage.ho0 ho0Var3 = null;
                        while (ul0Var3 != null) {
                            if (ul0Var3 instanceof defpackage.nz) {
                                defpackage.nz nzVar2 = (defpackage.nz) ul0Var3;
                                if (nzVar2.s0TASMVLSWD5 && !defpackage.la0.UmgHb6n58gfG(nzVar2).Jkfc0NcwyPL8) {
                                    if (nzVar2.I9id0xDxCgYV().ZpBGe2uQfcn8) {
                                        ho0Var.giKS3J6vZuNy(nzVar2);
                                    } else {
                                        WmetiUbpKU9I(nzVar2, ho0Var);
                                    }
                                }
                            } else if ((ul0Var3.QiMR8OkAhezm & 1024) != 0 && (ul0Var3 instanceof defpackage.xo)) {
                                int i2 = 0;
                                for (defpackage.ul0 ul0Var4 = ((defpackage.xo) ul0Var3).ZVVdXbWmyCSK; ul0Var4 != null; ul0Var4 = ul0Var4.GE9mJIPrb8gP) {
                                    if ((ul0Var4.QiMR8OkAhezm & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            ul0Var3 = ul0Var4;
                                        } else {
                                            if (ho0Var3 == null) {
                                                ho0Var3 = new defpackage.ho0(new defpackage.ul0[16]);
                                            }
                                            if (ul0Var3 != null) {
                                                ho0Var3.giKS3J6vZuNy(ul0Var3);
                                                ul0Var3 = null;
                                            }
                                            ho0Var3.giKS3J6vZuNy(ul0Var4);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            ul0Var3 = defpackage.la0.P05cfTpS5W5L(ho0Var3);
                        }
                    } else {
                        ul0Var3 = ul0Var3.GE9mJIPrb8gP;
                    }
                }
            }
        }
    }

    public static defpackage.sc1 XntWc4eZSQ8j(defpackage.sc1 sc1Var) {
        defpackage.ck0 ck0Var = sc1Var.WDYagTQQm9ns;
        ck0Var.giKS3J6vZuNy();
        return ck0Var.h3m55N1URyyK > 0 ? sc1Var : defpackage.sc1.oh71FJcDz6S2;
    }

    public static boolean ZVVdXbWmyCSK(android.view.View view, android.view.KeyEvent keyEvent) {
        java.util.ArrayList arrayList;
        int size;
        int indexOfKey;
        int i = defpackage.zt1.ZpBGe2uQfcn8;
        if (android.os.Build.VERSION.SDK_INT < 28) {
            java.util.ArrayList arrayList2 = defpackage.yt1.JhCgjQRTAOCT;
            defpackage.yt1 yt1Var = (defpackage.yt1) view.getTag(com.ice.fishing.wolberta.R.id.tag_unhandled_key_event_manager);
            java.lang.ref.WeakReference weakReference = null;
            if (yt1Var == null) {
                yt1Var = new defpackage.yt1();
                yt1Var.ZpBGe2uQfcn8 = null;
                yt1Var.giKS3J6vZuNy = null;
                yt1Var.fWTAfUmVKrZq = null;
                view.setTag(com.ice.fishing.wolberta.R.id.tag_unhandled_key_event_manager, yt1Var);
            }
            java.lang.ref.WeakReference weakReference2 = yt1Var.fWTAfUmVKrZq;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                yt1Var.fWTAfUmVKrZq = new java.lang.ref.WeakReference(keyEvent);
                if (yt1Var.giKS3J6vZuNy == null) {
                    yt1Var.giKS3J6vZuNy = new android.util.SparseArray();
                }
                android.util.SparseArray sparseArray = yt1Var.giKS3J6vZuNy;
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (java.lang.ref.WeakReference) sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (java.lang.ref.WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    android.view.View view2 = (android.view.View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (java.util.ArrayList) view2.getTag(com.ice.fishing.wolberta.R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    defpackage.p81.ZpBGe2uQfcn8();
                    return false;
                }
            }
        }
        return false;
    }

    public static defpackage.w1 ZpBGe2uQfcn8(int i, int i2, int i3) {
        android.graphics.Bitmap createBitmap;
        defpackage.u51 u51Var = defpackage.ag.WDYagTQQm9ns;
        android.graphics.Bitmap.Config GcLuU6pT9wO9 = defpackage.la0.GcLuU6pT9wO9(i3);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            createBitmap = android.graphics.Bitmap.createBitmap((android.util.DisplayMetrics) null, i, i2, defpackage.la0.GcLuU6pT9wO9(i3), true, defpackage.zf.ZpBGe2uQfcn8(u51Var));
        } else {
            createBitmap = android.graphics.Bitmap.createBitmap((android.util.DisplayMetrics) null, i, i2, GcLuU6pT9wO9);
            createBitmap.setHasAlpha(true);
        }
        return new defpackage.w1(createBitmap);
    }

    public static final void blKFvluuDQOf(java.util.ArrayList arrayList, long j, defpackage.y10 y10Var) {
        int size = arrayList.size();
        for (int oCu53ZX2v4Ju = oCu53ZX2v4Ju(defpackage.in1.oh71FJcDz6S2(j), arrayList); oCu53ZX2v4Ju < size; oCu53ZX2v4Ju++) {
            defpackage.dw0 dw0Var = (defpackage.dw0) arrayList.get(oCu53ZX2v4Ju);
            if (dw0Var.giKS3J6vZuNy >= defpackage.in1.WDYagTQQm9ns(j)) {
                return;
            }
            if (dw0Var.giKS3J6vZuNy != dw0Var.fWTAfUmVKrZq) {
                y10Var.P05cfTpS5W5L(dw0Var);
            }
        }
    }

    public static final int dG7RjM6DqYVL(int i, java.util.List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            defpackage.dw0 dw0Var = (defpackage.dw0) list.get(i3);
            char c = dw0Var.JhCgjQRTAOCT > i ? (char) 1 : dw0Var.WDYagTQQm9ns <= i ? (char) 65535 : (char) 0;
            if (c < 0) {
                i2 = i3 + 1;
            } else {
                if (c <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final java.lang.String e6mdH7fiFuta(java.lang.Object[] objArr, int i, int i2, defpackage.oCu53ZX2v4Ju ocu53zx2v4ju) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            java.lang.Object obj = objArr[i + i3];
            if (obj == ocu53zx2v4ju) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static final boolean fNwYGHIYeJcR(int i, defpackage.s31 s31Var, defpackage.s31 s31Var2) {
        if (i == 3 || i == 4) {
            return s31Var.JhCgjQRTAOCT > s31Var2.giKS3J6vZuNy && s31Var.giKS3J6vZuNy < s31Var2.JhCgjQRTAOCT;
        }
        if (i == 5 || i == 6) {
            return s31Var.fWTAfUmVKrZq > s31Var2.ZpBGe2uQfcn8 && s31Var.ZpBGe2uQfcn8 < s31Var2.fWTAfUmVKrZq;
        }
        defpackage.h7.P05cfTpS5W5L("This function should only be used for 2-D focus search");
        return false;
    }

    public static defpackage.m2 fWTAfUmVKrZq(java.lang.String str, defpackage.pn1 pn1Var, long j, defpackage.hp hpVar, defpackage.uz uzVar, int i, int i2) {
        defpackage.av avVar = defpackage.av.WDYagTQQm9ns;
        return new defpackage.m2(new defpackage.q2(str, pn1Var, avVar, avVar, uzVar, hpVar), i, 1, j);
    }

    public static final java.lang.Boolean fhbmYuu9J3cT(int i, defpackage.d5 d5Var, defpackage.nz nzVar, defpackage.s31 s31Var) {
        int ordinal = nzVar.iYH9ueRbBBFm().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                defpackage.nz OcTWLQzke1i2 = defpackage.h0.OcTWLQzke1i2(nzVar);
                if (OcTWLQzke1i2 == null) {
                    defpackage.h7.P05cfTpS5W5L("ActiveParent must have a focusedChild");
                    return null;
                }
                int ordinal2 = OcTWLQzke1i2.iYH9ueRbBBFm().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        java.lang.Boolean fhbmYuu9J3cT = fhbmYuu9J3cT(i, d5Var, OcTWLQzke1i2, s31Var);
                        if (!defpackage.ma0.QiMR8OkAhezm(fhbmYuu9J3cT, java.lang.Boolean.FALSE)) {
                            return fhbmYuu9J3cT;
                        }
                        if (s31Var == null) {
                            if (OcTWLQzke1i2.iYH9ueRbBBFm() != defpackage.mz.oh71FJcDz6S2) {
                                defpackage.h7.P05cfTpS5W5L("Searching for active node in inactive hierarchy");
                                return null;
                            }
                            defpackage.nz IJ0hOnjhPOri = defpackage.h0.IJ0hOnjhPOri(OcTWLQzke1i2);
                            if (IJ0hOnjhPOri == null) {
                                defpackage.h7.P05cfTpS5W5L("ActiveParent must have a focusedChild");
                                return null;
                            }
                            s31Var = defpackage.h0.VFeft99leXEK(IJ0hOnjhPOri);
                        }
                        return java.lang.Boolean.valueOf(jjTN4uUnoyEn(i, d5Var, nzVar, s31Var));
                    }
                    if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            defpackage.h7.T1fB7bDYiVJQ();
                            return null;
                        }
                        defpackage.h7.P05cfTpS5W5L("ActiveParent must have a focusedChild");
                        return null;
                    }
                }
                if (s31Var == null) {
                    s31Var = defpackage.h0.VFeft99leXEK(OcTWLQzke1i2);
                }
                return java.lang.Boolean.valueOf(jjTN4uUnoyEn(i, d5Var, nzVar, s31Var));
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return nzVar.I9id0xDxCgYV().ZpBGe2uQfcn8 ? (java.lang.Boolean) d5Var.P05cfTpS5W5L(nzVar) : s31Var == null ? java.lang.Boolean.valueOf(IJ0hOnjhPOri(nzVar, i, d5Var)) : java.lang.Boolean.valueOf(GoIRkIe1iwj6(i, d5Var, nzVar, s31Var));
                }
                defpackage.h7.T1fB7bDYiVJQ();
                return null;
            }
        }
        return java.lang.Boolean.valueOf(IJ0hOnjhPOri(nzVar, i, d5Var));
    }

    public static final java.util.ArrayList frSwwKIlbUhK(defpackage.fa0 fa0Var) {
        fa0Var.getClass();
        defpackage.jd0 ZEXjjCYihNTt = ((defpackage.kj0) fa0Var).ZEXjjCYihNTt();
        boolean Wc0TdmRSwbbi = Wc0TdmRSwbbi(ZEXjjCYihNTt);
        defpackage.qn0 qn0Var = (defpackage.qn0) ZEXjjCYihNTt.T1fB7bDYiVJQ();
        defpackage.ho0 ho0Var = (defpackage.ho0) qn0Var.oh71FJcDz6S2;
        java.util.ArrayList arrayList = new java.util.ArrayList(ho0Var.QiMR8OkAhezm);
        int i = ho0Var.QiMR8OkAhezm;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.jd0 jd0Var = (defpackage.jd0) qn0Var.get(i2);
            arrayList.add(Wc0TdmRSwbbi ? jd0Var.fNwYGHIYeJcR() : jd0Var.h3m55N1URyyK());
        }
        return arrayList;
    }

    public static final defpackage.s31 gUjdnLbkVAaA(defpackage.rc0 rc0Var) {
        defpackage.rc0 Ns0WNyEWdPsk = rc0Var.Ns0WNyEWdPsk();
        return Ns0WNyEWdPsk != null ? Ns0WNyEWdPsk.hH0RRJrNssvh(rc0Var, true) : new defpackage.s31(0.0f, 0.0f, (int) (rc0Var.GcLuU6pT9wO9() >> 32), (int) (rc0Var.GcLuU6pT9wO9() & 4294967295L));
    }

    public static final defpackage.q90 giKS3J6vZuNy(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new defpackage.q90(i, i2, ((int) (j2 >> 32)) + i, ((int) (j2 & 4294967295L)) + i2);
    }

    public static final int h3m55N1URyyK(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final java.util.ArrayList hH0RRJrNssvh(java.lang.String str, android.os.Bundle bundle) {
        java.lang.Class cls = defpackage.b41.ZpBGe2uQfcn8(android.os.Bundle.class).ZpBGe2uQfcn8;
        cls.getClass();
        java.util.ArrayList fWTAfUmVKrZq = android.os.Build.VERSION.SDK_INT >= 34 ? defpackage.hwoZxnIesQBZ.fWTAfUmVKrZq(bundle, str, cls) : bundle.getParcelableArrayList(str);
        if (fWTAfUmVKrZq != null) {
            return fWTAfUmVKrZq;
        }
        defpackage.w60.KrtOTfE6jiS2(str);
        throw null;
    }

    public static final boolean jjTN4uUnoyEn(int i, defpackage.d5 d5Var, defpackage.nz nzVar, defpackage.s31 s31Var) {
        if (GoIRkIe1iwj6(i, d5Var, nzVar, s31Var)) {
            return true;
        }
        java.lang.Boolean bool = (java.lang.Boolean) defpackage.jr0.Fu5WBEia9jBo(nzVar, i, new defpackage.st0(((defpackage.gz) ((defpackage.u) defpackage.la0.qjMheFZ0l9kA(nzVar)).getFocusOwner()).oh71FJcDz6S2(), nzVar, s31Var, i, d5Var, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final defpackage.nz maCixPsq4ml2(defpackage.ho0 ho0Var, defpackage.s31 s31Var, int i) {
        defpackage.s31 P05cfTpS5W5L;
        defpackage.nz nzVar = null;
        if (i == 3) {
            P05cfTpS5W5L = s31Var.P05cfTpS5W5L((s31Var.fWTAfUmVKrZq - s31Var.ZpBGe2uQfcn8) + 1.0f, 0.0f);
        } else if (i == 4) {
            P05cfTpS5W5L = s31Var.P05cfTpS5W5L(-((s31Var.fWTAfUmVKrZq - s31Var.ZpBGe2uQfcn8) + 1.0f), 0.0f);
        } else if (i == 5) {
            P05cfTpS5W5L = s31Var.P05cfTpS5W5L(0.0f, (s31Var.JhCgjQRTAOCT - s31Var.giKS3J6vZuNy) + 1.0f);
        } else {
            if (i != 6) {
                defpackage.h7.P05cfTpS5W5L("This function should only be used for 2-D focus search");
                return null;
            }
            P05cfTpS5W5L = s31Var.P05cfTpS5W5L(0.0f, -((s31Var.JhCgjQRTAOCT - s31Var.giKS3J6vZuNy) + 1.0f));
        }
        java.lang.Object[] objArr = ho0Var.WDYagTQQm9ns;
        int i2 = ho0Var.QiMR8OkAhezm;
        for (int i3 = 0; i3 < i2; i3++) {
            defpackage.nz nzVar2 = (defpackage.nz) objArr[i3];
            if (defpackage.h0.KrtOTfE6jiS2(nzVar2)) {
                defpackage.s31 VFeft99leXEK = defpackage.h0.VFeft99leXEK(nzVar2);
                if (xahdJg25P1Bv(VFeft99leXEK, P05cfTpS5W5L, s31Var, i)) {
                    nzVar = nzVar2;
                    P05cfTpS5W5L = VFeft99leXEK;
                }
            }
        }
        return nzVar;
    }

    public static final int oCu53ZX2v4Ju(int i, java.util.List list) {
        int i2;
        int i3 = ((defpackage.dw0) defpackage.hf.EgL5gQQnyJKX(list)).fWTAfUmVKrZq;
        if (i > ((defpackage.dw0) defpackage.hf.EgL5gQQnyJKX(list)).fWTAfUmVKrZq) {
            defpackage.f80.ZpBGe2uQfcn8("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            defpackage.dw0 dw0Var = (defpackage.dw0) list.get(i2);
            char c = dw0Var.giKS3J6vZuNy > i ? (char) 1 : dw0Var.fWTAfUmVKrZq <= i ? (char) 65535 : (char) 0;
            if (c >= 0) {
                if (c <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        java.lang.StringBuilder h3m55N1URyyK = defpackage.pVQOaWB9QMo4.h3m55N1URyyK(i2, "Found paragraph index ", " should be in range [0, ");
        h3m55N1URyyK.append(list.size());
        h3m55N1URyyK.append(").\nDebug info: index=");
        h3m55N1URyyK.append(i);
        h3m55N1URyyK.append(", paragraphs=[");
        h3m55N1URyyK.append(defpackage.ci0.ZpBGe2uQfcn8(list, null, new defpackage.awuGf4qH8HFd(22), 31));
        h3m55N1URyyK.append(']');
        defpackage.f80.ZpBGe2uQfcn8(h3m55N1URyyK.toString());
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void oh71FJcDz6S2(defpackage.xp0 xp0Var, defpackage.e30 e30Var, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        long j;
        long j2;
        defpackage.xp0 xp0Var2 = xp0Var;
        defpackage.e30 e30Var2 = e30Var;
        defpackage.q50 q50Var = defpackage.la0.blKFvluuDQOf;
        xp0Var2.getClass();
        e30Var2.PS16moFv2oLu(-466524188);
        int i2 = i | (e30Var2.P05cfTpS5W5L(xp0Var2) ? 4 : 2);
        boolean z5 = true;
        boolean z6 = false;
        if (e30Var2.zJPqDeoF0Os1(i2 & 1, (i2 & 3) != 2)) {
            defpackage.xo0 xo0Var = (defpackage.xo0) defpackage.w60.Ns0WNyEWdPsk(new defpackage.a31(xp0Var2.giKS3J6vZuNy.dG7RjM6DqYVL), null, null, e30Var2, 48, 2).getValue();
            defpackage.np0 np0Var = xo0Var != null ? xo0Var.oh71FJcDz6S2 : null;
            defpackage.sl0 sl0Var = defpackage.sl0.ZpBGe2uQfcn8;
            defpackage.vl0 JhCgjQRTAOCT = defpackage.nn.JhCgjQRTAOCT(defpackage.ce1.giKS3J6vZuNy(sl0Var, 1.0f), ((defpackage.uf) e30Var2.GE9mJIPrb8gP(defpackage.wf.ZpBGe2uQfcn8)).gUjdnLbkVAaA, q50Var);
            java.util.WeakHashMap weakHashMap = defpackage.rw1.maCixPsq4ml2;
            defpackage.v4 v4Var = defpackage.l21.e6mdH7fiFuta(e30Var2).WDYagTQQm9ns;
            defpackage.hp hpVar = (defpackage.hp) e30Var2.GE9mJIPrb8gP(defpackage.rj.P05cfTpS5W5L);
            defpackage.vl0 OVwOqzUGHcCU = defpackage.nq1.OVwOqzUGHcCU(JhCgjQRTAOCT, 0.0f, 4.0f, 0.0f, hpVar.pf0OXpZQoaz3(v4Var.ZpBGe2uQfcn8(hpVar)) + 2.0f, 5);
            defpackage.v61 ZpBGe2uQfcn82 = defpackage.u61.ZpBGe2uQfcn8(defpackage.vx1.JhCgjQRTAOCT, defpackage.jVUAPb5NnIYW.XntWc4eZSQ8j, e30Var2, 54);
            int hashCode = java.lang.Long.hashCode(e30Var2.CZa7MwI9IzLd);
            defpackage.ay0 fNwYGHIYeJcR = e30Var2.fNwYGHIYeJcR();
            defpackage.vl0 oCu53ZX2v4Ju = defpackage.i61.oCu53ZX2v4Ju(e30Var2, OVwOqzUGHcCU);
            defpackage.wi.fWTAfUmVKrZq.getClass();
            defpackage.pj pjVar = defpackage.vi.giKS3J6vZuNy;
            e30Var2.fhbmYuu9J3cT();
            if (e30Var2.Fu5WBEia9jBo) {
                e30Var2.Ns0WNyEWdPsk(pjVar);
            } else {
                e30Var2.lXYSMswtzmix();
            }
            defpackage.t80.w6IV1lieBIux(defpackage.vi.oh71FJcDz6S2, e30Var2, ZpBGe2uQfcn82);
            defpackage.t80.w6IV1lieBIux(defpackage.vi.WDYagTQQm9ns, e30Var2, fNwYGHIYeJcR);
            defpackage.t80.w6IV1lieBIux(defpackage.vi.QiMR8OkAhezm, e30Var2, java.lang.Integer.valueOf(hashCode));
            defpackage.t80.Mearx7yMn90V(e30Var2, defpackage.vi.P05cfTpS5W5L);
            defpackage.t80.w6IV1lieBIux(defpackage.vi.JhCgjQRTAOCT, e30Var2, oCu53ZX2v4Ju);
            e30Var2.NkfcFfdaVTox(-1927651379);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(com.ice.fishing.wolberta.R.string.tab_home);
            if (np0Var != null) {
                int i3 = defpackage.np0.e6mdH7fiFuta;
                if (defpackage.b80.VFeft99leXEK(np0Var, defpackage.b41.ZpBGe2uQfcn8(defpackage.v50.class))) {
                    z = true;
                    defpackage.iq1 iq1Var = new defpackage.iq1(valueOf, java.lang.Boolean.valueOf(z), defpackage.v50.INSTANCE);
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(com.ice.fishing.wolberta.R.string.tab_list);
                    if (np0Var != null) {
                        int i4 = defpackage.np0.e6mdH7fiFuta;
                        if (defpackage.b80.VFeft99leXEK(np0Var, defpackage.b41.ZpBGe2uQfcn8(defpackage.uh0.class))) {
                            z2 = true;
                            defpackage.iq1 iq1Var2 = new defpackage.iq1(valueOf2, java.lang.Boolean.valueOf(z2), defpackage.uh0.INSTANCE);
                            java.lang.Integer valueOf3 = java.lang.Integer.valueOf(com.ice.fishing.wolberta.R.string.tab_saved);
                            if (np0Var != null) {
                                int i5 = defpackage.np0.e6mdH7fiFuta;
                                if (defpackage.b80.VFeft99leXEK(np0Var, defpackage.b41.ZpBGe2uQfcn8(defpackage.o71.class))) {
                                    z3 = true;
                                    defpackage.iq1 iq1Var3 = new defpackage.iq1(valueOf3, java.lang.Boolean.valueOf(z3), defpackage.o71.INSTANCE);
                                    java.lang.Integer valueOf4 = java.lang.Integer.valueOf(com.ice.fishing.wolberta.R.string.tab_game);
                                    if (np0Var != null) {
                                        int i6 = defpackage.np0.e6mdH7fiFuta;
                                        if (defpackage.b80.VFeft99leXEK(np0Var, defpackage.b41.ZpBGe2uQfcn8(defpackage.p20.class))) {
                                            z4 = true;
                                            for (defpackage.iq1 iq1Var4 : defpackage.ma0.oCu53ZX2v4Ju(iq1Var, iq1Var2, iq1Var3, new defpackage.iq1(valueOf4, java.lang.Boolean.valueOf(z4), defpackage.p20.INSTANCE))) {
                                                int intValue = iq1Var4.WDYagTQQm9ns.intValue();
                                                boolean booleanValue = ((java.lang.Boolean) iq1Var4.oh71FJcDz6S2).booleanValue();
                                                java.lang.Object obj = iq1Var4.QiMR8OkAhezm;
                                                defpackage.vl0 WmetiUbpKU9I = defpackage.h0.WmetiUbpKU9I(sl0Var, ((defpackage.gd1) e30Var2.GE9mJIPrb8gP(defpackage.id1.ZpBGe2uQfcn8)).fWTAfUmVKrZq);
                                                if (booleanValue) {
                                                    e30Var2.NkfcFfdaVTox(2005466552);
                                                    j = defpackage.pf.giKS3J6vZuNy(((defpackage.uf) e30Var2.GE9mJIPrb8gP(defpackage.wf.ZpBGe2uQfcn8)).ZpBGe2uQfcn8, 0.22f);
                                                    e30Var2.XntWc4eZSQ8j(z6);
                                                } else {
                                                    e30Var2.NkfcFfdaVTox(2005468943);
                                                    j = ((defpackage.uf) e30Var2.GE9mJIPrb8gP(defpackage.wf.ZpBGe2uQfcn8)).gUjdnLbkVAaA;
                                                    e30Var2.XntWc4eZSQ8j(z6);
                                                }
                                                defpackage.vl0 JhCgjQRTAOCT2 = defpackage.nn.JhCgjQRTAOCT(WmetiUbpKU9I, j, q50Var);
                                                boolean P05cfTpS5W5L = e30Var2.P05cfTpS5W5L(xp0Var2) | e30Var2.P05cfTpS5W5L(obj);
                                                java.lang.Object GcLuU6pT9wO9 = e30Var2.GcLuU6pT9wO9();
                                                if (P05cfTpS5W5L || GcLuU6pT9wO9 == defpackage.cj.ZpBGe2uQfcn8) {
                                                    GcLuU6pT9wO9 = new defpackage.S0YpfprlOYIn(19, xp0Var2, obj);
                                                    e30Var2.EgL5gQQnyJKX(GcLuU6pT9wO9);
                                                }
                                                defpackage.n10 n10Var = (defpackage.n10) GcLuU6pT9wO9;
                                                JhCgjQRTAOCT2.getClass();
                                                n10Var.getClass();
                                                defpackage.vl0 w6IV1lieBIux = defpackage.nq1.w6IV1lieBIux(defpackage.i61.gUjdnLbkVAaA(JhCgjQRTAOCT2, new defpackage.v3(z5, n10Var)), 14.0f, 10.0f);
                                                defpackage.vk0 JhCgjQRTAOCT3 = defpackage.ab.JhCgjQRTAOCT(defpackage.jVUAPb5NnIYW.GE9mJIPrb8gP, z6);
                                                int hashCode2 = java.lang.Long.hashCode(e30Var2.CZa7MwI9IzLd);
                                                defpackage.ay0 fNwYGHIYeJcR2 = e30Var2.fNwYGHIYeJcR();
                                                defpackage.vl0 oCu53ZX2v4Ju2 = defpackage.i61.oCu53ZX2v4Ju(e30Var2, w6IV1lieBIux);
                                                defpackage.wi.fWTAfUmVKrZq.getClass();
                                                defpackage.pj pjVar2 = defpackage.vi.giKS3J6vZuNy;
                                                e30Var2.fhbmYuu9J3cT();
                                                if (e30Var2.Fu5WBEia9jBo) {
                                                    e30Var2.Ns0WNyEWdPsk(pjVar2);
                                                } else {
                                                    e30Var2.lXYSMswtzmix();
                                                }
                                                defpackage.t80.w6IV1lieBIux(defpackage.vi.oh71FJcDz6S2, e30Var2, JhCgjQRTAOCT3);
                                                defpackage.t80.w6IV1lieBIux(defpackage.vi.WDYagTQQm9ns, e30Var2, fNwYGHIYeJcR2);
                                                defpackage.t80.w6IV1lieBIux(defpackage.vi.QiMR8OkAhezm, e30Var2, java.lang.Integer.valueOf(hashCode2));
                                                defpackage.t80.Mearx7yMn90V(e30Var2, defpackage.vi.P05cfTpS5W5L);
                                                defpackage.t80.w6IV1lieBIux(defpackage.vi.JhCgjQRTAOCT, e30Var2, oCu53ZX2v4Ju2);
                                                java.lang.String xahdJg25P1Bv = defpackage.q70.xahdJg25P1Bv(intValue, e30Var2);
                                                defpackage.pn1 pn1Var = ((defpackage.gr1) e30Var2.GE9mJIPrb8gP(defpackage.hr1.ZpBGe2uQfcn8)).e6mdH7fiFuta;
                                                if (booleanValue) {
                                                    e30Var2.NkfcFfdaVTox(363191975);
                                                    j2 = ((defpackage.uf) e30Var2.GE9mJIPrb8gP(defpackage.wf.ZpBGe2uQfcn8)).GE9mJIPrb8gP;
                                                    e30Var2.XntWc4eZSQ8j(z6);
                                                } else {
                                                    e30Var2.NkfcFfdaVTox(363193894);
                                                    j2 = ((defpackage.uf) e30Var2.GE9mJIPrb8gP(defpackage.wf.ZpBGe2uQfcn8)).ZpBGe2uQfcn8;
                                                    e30Var2.XntWc4eZSQ8j(z6);
                                                }
                                                boolean z7 = z5;
                                                defpackage.ym1.giKS3J6vZuNy(xahdJg25P1Bv, null, j2, 0L, 0L, null, 0L, 0, false, 0, 0, pn1Var, e30Var, 0, 0, 131066);
                                                e30Var2 = e30Var;
                                                e30Var2.XntWc4eZSQ8j(z7);
                                                z6 = false;
                                                z5 = z7;
                                                q50Var = q50Var;
                                                sl0Var = sl0Var;
                                                xp0Var2 = xp0Var;
                                            }
                                            e30Var2.XntWc4eZSQ8j(z6);
                                            e30Var2.XntWc4eZSQ8j(z5);
                                        }
                                    }
                                    z4 = false;
                                    while (r21.hasNext()) {
                                    }
                                    e30Var2.XntWc4eZSQ8j(z6);
                                    e30Var2.XntWc4eZSQ8j(z5);
                                }
                            }
                            z3 = false;
                            defpackage.iq1 iq1Var32 = new defpackage.iq1(valueOf3, java.lang.Boolean.valueOf(z3), defpackage.o71.INSTANCE);
                            java.lang.Integer valueOf42 = java.lang.Integer.valueOf(com.ice.fishing.wolberta.R.string.tab_game);
                            if (np0Var != null) {
                            }
                            z4 = false;
                            while (r21.hasNext()) {
                            }
                            e30Var2.XntWc4eZSQ8j(z6);
                            e30Var2.XntWc4eZSQ8j(z5);
                        }
                    }
                    z2 = false;
                    defpackage.iq1 iq1Var22 = new defpackage.iq1(valueOf2, java.lang.Boolean.valueOf(z2), defpackage.uh0.INSTANCE);
                    java.lang.Integer valueOf32 = java.lang.Integer.valueOf(com.ice.fishing.wolberta.R.string.tab_saved);
                    if (np0Var != null) {
                    }
                    z3 = false;
                    defpackage.iq1 iq1Var322 = new defpackage.iq1(valueOf32, java.lang.Boolean.valueOf(z3), defpackage.o71.INSTANCE);
                    java.lang.Integer valueOf422 = java.lang.Integer.valueOf(com.ice.fishing.wolberta.R.string.tab_game);
                    if (np0Var != null) {
                    }
                    z4 = false;
                    while (r21.hasNext()) {
                    }
                    e30Var2.XntWc4eZSQ8j(z6);
                    e30Var2.XntWc4eZSQ8j(z5);
                }
            }
            z = false;
            defpackage.iq1 iq1Var5 = new defpackage.iq1(valueOf, java.lang.Boolean.valueOf(z), defpackage.v50.INSTANCE);
            java.lang.Integer valueOf22 = java.lang.Integer.valueOf(com.ice.fishing.wolberta.R.string.tab_list);
            if (np0Var != null) {
            }
            z2 = false;
            defpackage.iq1 iq1Var222 = new defpackage.iq1(valueOf22, java.lang.Boolean.valueOf(z2), defpackage.uh0.INSTANCE);
            java.lang.Integer valueOf322 = java.lang.Integer.valueOf(com.ice.fishing.wolberta.R.string.tab_saved);
            if (np0Var != null) {
            }
            z3 = false;
            defpackage.iq1 iq1Var3222 = new defpackage.iq1(valueOf322, java.lang.Boolean.valueOf(z3), defpackage.o71.INSTANCE);
            java.lang.Integer valueOf4222 = java.lang.Integer.valueOf(com.ice.fishing.wolberta.R.string.tab_game);
            if (np0Var != null) {
            }
            z4 = false;
            while (r21.hasNext()) {
            }
            e30Var2.XntWc4eZSQ8j(z6);
            e30Var2.XntWc4eZSQ8j(z5);
        } else {
            e30Var2.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var2.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.l2(i, 20, xp0Var);
        }
    }

    public static final void qjMheFZ0l9kA(long j, byte[] bArr, int i, int i2, int i3) {
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = defpackage.f50.ZpBGe2uQfcn8[(int) ((j >> (i4 << 3)) & 255)];
            int i7 = i + 1;
            bArr[i] = (byte) (i6 >> 8);
            i += 2;
            bArr[i7] = (byte) i6;
            if (i4 == i5) {
                return;
            } else {
                i4--;
            }
        }
    }

    public static android.text.StaticLayout s0TASMVLSWD5(java.lang.CharSequence charSequence, android.text.TextPaint textPaint, int i, int i2, android.text.TextDirectionHeuristic textDirectionHeuristic, android.text.Layout.Alignment alignment, int i3, android.text.TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        android.graphics.text.LineBreakConfig.Builder lineBreakStyle;
        android.graphics.text.LineBreakConfig.Builder lineBreakWordStyle;
        android.graphics.text.LineBreakConfig build;
        if (i2 < 0) {
            defpackage.f80.ZpBGe2uQfcn8("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            defpackage.f80.ZpBGe2uQfcn8("invalid end value");
        }
        if (i3 < 0) {
            defpackage.f80.ZpBGe2uQfcn8("invalid maxLines value");
        }
        if (i < 0) {
            defpackage.f80.ZpBGe2uQfcn8("invalid width value");
        }
        if (i4 < 0) {
            defpackage.f80.ZpBGe2uQfcn8("invalid ellipsizedWidth value");
        }
        android.text.StaticLayout.Builder obtain = android.text.StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        obtain.setTextDirection(textDirectionHeuristic);
        obtain.setAlignment(alignment);
        obtain.setMaxLines(i3);
        obtain.setEllipsize(truncateAt);
        obtain.setEllipsizedWidth(i4);
        obtain.setLineSpacing(0.0f, 1.0f);
        obtain.setIncludePad(z);
        obtain.setBreakStrategy(i6);
        obtain.setHyphenationFrequency(i9);
        obtain.setIndents(null, null);
        int i10 = android.os.Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            obtain.setJustificationMode(i5);
        }
        if (i10 >= 28) {
            obtain.setUseLineSpacingFromFallbacks(true);
        }
        if (i10 >= 33) {
            lineBreakStyle = defpackage.Rl68HURFBtL3.ZpBGe2uQfcn8().setLineBreakStyle(i7);
            lineBreakWordStyle = lineBreakStyle.setLineBreakWordStyle(i8);
            build = lineBreakWordStyle.build();
            obtain.setLineBreakConfig(build);
        }
        if (i10 >= 35) {
            obtain.setUseBoundsForWidth(false);
        }
        return obtain.build();
    }

    public static final boolean w6IV1lieBIux(int i, defpackage.s31 s31Var, defpackage.s31 s31Var2) {
        if (i == 3) {
            float f = s31Var2.fWTAfUmVKrZq;
            float f2 = s31Var2.ZpBGe2uQfcn8;
            float f3 = s31Var.fWTAfUmVKrZq;
            return (f > f3 || f2 >= f3) && f2 > s31Var.ZpBGe2uQfcn8;
        }
        if (i == 4) {
            float f4 = s31Var2.ZpBGe2uQfcn8;
            float f5 = s31Var2.fWTAfUmVKrZq;
            float f6 = s31Var.ZpBGe2uQfcn8;
            return (f4 < f6 || f5 <= f6) && f5 < s31Var.fWTAfUmVKrZq;
        }
        if (i == 5) {
            float f7 = s31Var2.JhCgjQRTAOCT;
            float f8 = s31Var2.giKS3J6vZuNy;
            float f9 = s31Var.JhCgjQRTAOCT;
            return (f7 > f9 || f8 >= f9) && f8 > s31Var.giKS3J6vZuNy;
        }
        if (i != 6) {
            defpackage.h7.P05cfTpS5W5L("This function should only be used for 2-D focus search");
            return false;
        }
        float f10 = s31Var2.giKS3J6vZuNy;
        float f11 = s31Var2.JhCgjQRTAOCT;
        float f12 = s31Var.giKS3J6vZuNy;
        return (f10 < f12 || f11 <= f12) && f11 < s31Var.JhCgjQRTAOCT;
    }

    public static final defpackage.s31 w7APNrr0aGRc(defpackage.ul0 ul0Var, boolean z, boolean z2) {
        if (!ul0Var.WDYagTQQm9ns.s0TASMVLSWD5) {
            return defpackage.s31.WDYagTQQm9ns;
        }
        if (z) {
            return defpackage.la0.OcTWLQzke1i2(ul0Var, 8).l();
        }
        defpackage.sr0 OcTWLQzke1i2 = defpackage.la0.OcTWLQzke1i2(ul0Var, 8);
        return UmgHb6n58gfG(OcTWLQzke1i2).hH0RRJrNssvh(OcTWLQzke1i2, z2);
    }

    public static final boolean xahdJg25P1Bv(defpackage.s31 s31Var, defpackage.s31 s31Var2, defpackage.s31 s31Var3, int i) {
        if (!w6IV1lieBIux(i, s31Var, s31Var3)) {
            return false;
        }
        if (w6IV1lieBIux(i, s31Var2, s31Var3) && !Ns0WNyEWdPsk(s31Var3, s31Var, s31Var2, i)) {
            return !Ns0WNyEWdPsk(s31Var3, s31Var2, s31Var, i) && zJPqDeoF0Os1(i, s31Var3, s31Var) < zJPqDeoF0Os1(i, s31Var3, s31Var2);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void z16KqenTjq8o(android.view.ViewStructure viewStructure, defpackage.jd0 jd0Var, android.view.autofill.AutofillId autofillId, java.lang.String str, defpackage.u31 u31Var) {
        int i;
        long j;
        long j2;
        char c;
        long j3;
        boolean z;
        defpackage.ko1 ko1Var;
        defpackage.l6 l6Var;
        defpackage.o1 o1Var;
        defpackage.d61 d61Var;
        defpackage.q0 q0Var;
        boolean z2;
        defpackage.al alVar;
        java.lang.Boolean bool;
        boolean z3;
        java.lang.Integer num;
        int i2;
        java.util.List list;
        java.lang.Integer valueOf;
        boolean z4;
        java.lang.String[] s0TASMVLSWD5;
        java.lang.String Mearx7yMn90V;
        java.lang.String[] s0TASMVLSWD52;
        java.lang.String[] s0TASMVLSWD53;
        android.view.autofill.AutofillValue forText;
        defpackage.yn0 yn0Var;
        long[] jArr;
        java.lang.Object[] objArr;
        int i3;
        long[] jArr2;
        java.lang.Object[] objArr2;
        defpackage.yn0 yn0Var2;
        defpackage.ko1 ko1Var2;
        defpackage.l6 l6Var2;
        defpackage.o1 o1Var2;
        defpackage.d61 d61Var2;
        defpackage.qb1 qb1Var = defpackage.nb1.ZpBGe2uQfcn8;
        defpackage.qb1 qb1Var2 = defpackage.eb1.ZpBGe2uQfcn8;
        defpackage.fb1 IJ0hOnjhPOri = jd0Var.IJ0hOnjhPOri();
        int i4 = 8;
        if (IJ0hOnjhPOri == null || (yn0Var2 = IJ0hOnjhPOri.WDYagTQQm9ns) == null) {
            i = 2;
            j = 128;
            j2 = 255;
            c = 7;
            j3 = -9187201950435737472L;
            z = true;
            ko1Var = null;
            l6Var = null;
            o1Var = null;
            d61Var = null;
            q0Var = null;
            z2 = false;
            alVar = null;
            bool = null;
            z3 = false;
            num = null;
        } else {
            java.lang.Object[] objArr3 = yn0Var2.giKS3J6vZuNy;
            j = 128;
            java.lang.Object[] objArr4 = yn0Var2.fWTAfUmVKrZq;
            long[] jArr3 = yn0Var2.ZpBGe2uQfcn8;
            int length = jArr3.length - 2;
            i = 2;
            if (length >= 0) {
                z = true;
                int i5 = 0;
                q0Var = null;
                j2 = 255;
                z2 = false;
                ko1Var2 = null;
                l6Var2 = null;
                o1Var2 = null;
                alVar = null;
                bool = null;
                d61Var2 = null;
                z3 = false;
                num = null;
                c = 7;
                while (true) {
                    long j4 = jArr3[i5];
                    j3 = -9187201950435737472L;
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j4 & 255) < 128) {
                                int i8 = (i5 << 3) + i7;
                                java.lang.Object obj = objArr3[i8];
                                java.lang.Object obj2 = objArr4[i8];
                                defpackage.qb1 qb1Var3 = (defpackage.qb1) obj;
                                if (defpackage.ma0.QiMR8OkAhezm(qb1Var3, defpackage.nb1.BHfvd2J71qpO)) {
                                    obj2.getClass();
                                    q0Var = (defpackage.q0) obj2;
                                } else if (defpackage.ma0.QiMR8OkAhezm(qb1Var3, defpackage.nb1.ZpBGe2uQfcn8)) {
                                    obj2.getClass();
                                    java.lang.CharSequence charSequence = (java.lang.String) defpackage.hf.FhgBoOud6zyW((java.util.List) obj2);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (defpackage.ma0.QiMR8OkAhezm(qb1Var3, defpackage.nb1.s0TASMVLSWD5)) {
                                    obj2.getClass();
                                    alVar = (defpackage.al) obj2;
                                } else if (defpackage.ma0.QiMR8OkAhezm(qb1Var3, defpackage.nb1.ZVVdXbWmyCSK)) {
                                    obj2.getClass();
                                    o1Var2 = (defpackage.o1) obj2;
                                } else if (defpackage.ma0.QiMR8OkAhezm(qb1Var3, defpackage.nb1.frSwwKIlbUhK)) {
                                    obj2.getClass();
                                    l6Var2 = (defpackage.l6) obj2;
                                } else if (defpackage.ma0.QiMR8OkAhezm(qb1Var3, defpackage.nb1.fNwYGHIYeJcR)) {
                                    obj2.getClass();
                                    viewStructure.setFocused(((java.lang.Boolean) obj2).booleanValue());
                                } else if (defpackage.ma0.QiMR8OkAhezm(qb1Var3, defpackage.nb1.Wc0TdmRSwbbi)) {
                                    obj2.getClass();
                                    num = (java.lang.Integer) obj2;
                                } else if (defpackage.ma0.QiMR8OkAhezm(qb1Var3, defpackage.nb1.GcLuU6pT9wO9)) {
                                    z3 = true;
                                } else if (defpackage.ma0.QiMR8OkAhezm(qb1Var3, defpackage.nb1.T1fB7bDYiVJQ)) {
                                    obj2.getClass();
                                    z = ((java.lang.Boolean) obj2).booleanValue();
                                } else if (defpackage.ma0.QiMR8OkAhezm(qb1Var3, defpackage.nb1.dG7RjM6DqYVL)) {
                                    obj2.getClass();
                                    d61Var2 = (defpackage.d61) obj2;
                                } else if (defpackage.ma0.QiMR8OkAhezm(qb1Var3, defpackage.nb1.BXaznwstz2U0)) {
                                    obj2.getClass();
                                    bool = (java.lang.Boolean) obj2;
                                } else if (defpackage.ma0.QiMR8OkAhezm(qb1Var3, defpackage.nb1.hH0RRJrNssvh)) {
                                    obj2.getClass();
                                    ko1Var2 = (defpackage.ko1) obj2;
                                } else if (defpackage.ma0.QiMR8OkAhezm(qb1Var3, defpackage.eb1.giKS3J6vZuNy)) {
                                    viewStructure.setClickable(true);
                                } else if (defpackage.ma0.QiMR8OkAhezm(qb1Var3, defpackage.eb1.fWTAfUmVKrZq)) {
                                    viewStructure.setLongClickable(true);
                                } else if (defpackage.ma0.QiMR8OkAhezm(qb1Var3, defpackage.eb1.IJ0hOnjhPOri)) {
                                    viewStructure.setFocusable(true);
                                } else if (defpackage.ma0.QiMR8OkAhezm(qb1Var3, defpackage.eb1.Ns0WNyEWdPsk)) {
                                    z2 = true;
                                }
                            }
                            j4 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        }
                    }
                    if (i5 == length) {
                        break;
                    } else {
                        i5++;
                    }
                }
            } else {
                j2 = 255;
                c = 7;
                j3 = -9187201950435737472L;
                z = true;
                q0Var = null;
                z2 = false;
                ko1Var2 = null;
                l6Var2 = null;
                o1Var2 = null;
                alVar = null;
                bool = null;
                d61Var2 = null;
                z3 = false;
                num = null;
            }
            ko1Var = ko1Var2;
            l6Var = l6Var2;
            o1Var = o1Var2;
            d61Var = d61Var2;
        }
        defpackage.fb1 IJ0hOnjhPOri2 = jd0Var.IJ0hOnjhPOri();
        if (IJ0hOnjhPOri2 != null && IJ0hOnjhPOri2.QiMR8OkAhezm && !IJ0hOnjhPOri2.P05cfTpS5W5L) {
            IJ0hOnjhPOri2 = IJ0hOnjhPOri2.giKS3J6vZuNy();
            defpackage.sn0 sn0Var = new defpackage.sn0(((defpackage.ho0) ((defpackage.qn0) jd0Var.gUjdnLbkVAaA()).oh71FJcDz6S2).QiMR8OkAhezm);
            sn0Var.fWTAfUmVKrZq(jd0Var.gUjdnLbkVAaA());
            while (sn0Var.e6mdH7fiFuta()) {
                defpackage.jd0 jd0Var2 = (defpackage.jd0) sn0Var.Ns0WNyEWdPsk(sn0Var.giKS3J6vZuNy - 1);
                defpackage.fb1 IJ0hOnjhPOri3 = jd0Var2.IJ0hOnjhPOri();
                if (IJ0hOnjhPOri3 != null && !IJ0hOnjhPOri3.QiMR8OkAhezm) {
                    IJ0hOnjhPOri2.JhCgjQRTAOCT(IJ0hOnjhPOri3);
                    if (!IJ0hOnjhPOri3.P05cfTpS5W5L) {
                        sn0Var.fWTAfUmVKrZq(jd0Var2.gUjdnLbkVAaA());
                    }
                }
            }
        }
        if (IJ0hOnjhPOri2 == null || (yn0Var = IJ0hOnjhPOri2.WDYagTQQm9ns) == null) {
            i2 = 1;
        } else {
            java.lang.Object[] objArr5 = yn0Var.giKS3J6vZuNy;
            java.lang.Object[] objArr6 = yn0Var.fWTAfUmVKrZq;
            long[] jArr4 = yn0Var.ZpBGe2uQfcn8;
            int length2 = jArr4.length - 2;
            i2 = 1;
            if (length2 >= 0) {
                int i9 = 0;
                list = null;
                while (true) {
                    long j5 = jArr4[i9];
                    int i10 = i4;
                    int i11 = i9;
                    if ((((~j5) << c) & j5 & j3) != j3) {
                        int i12 = 8 - ((~(i11 - length2)) >>> 31);
                        int i13 = 0;
                        while (i13 < i12) {
                            if ((j5 & j2) < j) {
                                int i14 = (i11 << 3) + i13;
                                java.lang.Object obj3 = objArr5[i14];
                                java.lang.Object obj4 = objArr6[i14];
                                jArr2 = jArr4;
                                defpackage.qb1 qb1Var4 = (defpackage.qb1) obj3;
                                objArr2 = objArr5;
                                if (defpackage.ma0.QiMR8OkAhezm(qb1Var4, defpackage.nb1.GE9mJIPrb8gP)) {
                                    viewStructure.setEnabled(false);
                                } else if (defpackage.ma0.QiMR8OkAhezm(qb1Var4, defpackage.nb1.UmgHb6n58gfG)) {
                                    obj4.getClass();
                                    list = (java.util.List) obj4;
                                }
                            } else {
                                jArr2 = jArr4;
                                objArr2 = objArr5;
                            }
                            j5 >>= i10;
                            i13++;
                            objArr5 = objArr2;
                            jArr4 = jArr2;
                        }
                        jArr = jArr4;
                        objArr = objArr5;
                        i3 = i10;
                        if (i12 != i3) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        objArr = objArr5;
                        i3 = i10;
                    }
                    if (i11 == length2) {
                        break;
                    }
                    i9 = i11 + 1;
                    i4 = i3;
                    objArr5 = objArr;
                    jArr4 = jArr;
                }
                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(jd0Var.oh71FJcDz6S2);
                if (jd0Var.w7APNrr0aGRc() == null) {
                    valueOf2 = null;
                }
                int intValue = valueOf2 == null ? valueOf2.intValue() : -1;
                viewStructure.setAutofillId(autofillId, intValue);
                viewStructure.setId(intValue, str, null, null);
                valueOf = q0Var == null ? java.lang.Integer.valueOf(q0Var.ZpBGe2uQfcn8) : z2 ? java.lang.Integer.valueOf(i2) : ko1Var != null ? java.lang.Integer.valueOf(i) : null;
                if (valueOf != null) {
                    viewStructure.setAutofillType(valueOf.intValue());
                }
                if (l6Var != null) {
                    java.lang.String str2 = l6Var.oh71FJcDz6S2;
                    if (str2.length() >= 5000) {
                        str2 = (java.lang.Character.isHighSurrogate(str2.charAt(4999)) && java.lang.Character.isLowSurrogate(str2.charAt(5000))) ? defpackage.tg1.cCeDCHgnx5OL(str2, 4999) : defpackage.tg1.cCeDCHgnx5OL(str2, 5000);
                    }
                    forText = android.view.autofill.AutofillValue.forText(str2);
                    viewStructure.setAutofillValue(forText);
                }
                if (o1Var != null) {
                    viewStructure.setAutofillValue(o1Var.ZpBGe2uQfcn8);
                }
                if (alVar != null && (s0TASMVLSWD53 = defpackage.ma0.s0TASMVLSWD5(alVar)) != null) {
                    viewStructure.setAutofillHints(s0TASMVLSWD53);
                }
                u31Var.giKS3J6vZuNy.QiMR8OkAhezm(jd0Var.oh71FJcDz6S2, new defpackage.y01(viewStructure));
                if (bool != null) {
                    viewStructure.setSelected(bool.booleanValue());
                }
                if (ko1Var == null) {
                    viewStructure.setCheckable(i2);
                    viewStructure.setChecked(ko1Var == defpackage.ko1.WDYagTQQm9ns);
                } else if (bool != null && (d61Var == null || d61Var.ZpBGe2uQfcn8 != 4)) {
                    z4 = true;
                    viewStructure.setCheckable(true);
                    viewStructure.setChecked(bool.booleanValue());
                    defpackage.al.ZpBGe2uQfcn8.getClass();
                    s0TASMVLSWD5 = defpackage.ma0.s0TASMVLSWD5(defpackage.zk.giKS3J6vZuNy);
                    s0TASMVLSWD5.getClass();
                    if (s0TASMVLSWD5.length == 0) {
                        throw new java.util.NoSuchElementException("Array is empty.");
                    }
                    boolean z5 = (z3 || ((alVar == null || (s0TASMVLSWD52 = defpackage.ma0.s0TASMVLSWD5(alVar)) == null || defpackage.y7.eSwlWMUpitz8(s0TASMVLSWD52, s0TASMVLSWD5[0]) < 0) ? false : z4)) ? z4 : false;
                    viewStructure.setDataIsSensitive((z5 || z) ? z4 : false);
                    viewStructure.setVisibility(jd0Var.IBvW5fLsPuHy.JhCgjQRTAOCT.fOrlzjnNBRYQ() ? 4 : 0);
                    if (list != null) {
                        int size = list.size();
                        java.lang.String str3 = "";
                        for (int i15 = 0; i15 < size; i15++) {
                            defpackage.l6 l6Var3 = (defpackage.l6) list.get(i15);
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append(str3);
                            str3 = defpackage.pVQOaWB9QMo4.fNwYGHIYeJcR(sb, l6Var3.oh71FJcDz6S2, '\n');
                        }
                        viewStructure.setText(str3);
                        viewStructure.setClassName("android.widget.TextView");
                    }
                    if (((defpackage.qn0) jd0Var.gUjdnLbkVAaA()).isEmpty() && d61Var != null && (Mearx7yMn90V = defpackage.n70.Mearx7yMn90V(d61Var.ZpBGe2uQfcn8)) != null) {
                        viewStructure.setClassName(Mearx7yMn90V);
                    }
                    if (z2) {
                        viewStructure.setClassName("android.widget.EditText");
                        if (android.os.Build.VERSION.SDK_INT >= 28 && num != null) {
                            viewStructure.setMaxTextLength(num.intValue());
                        }
                        if (z5) {
                            viewStructure.setInputType(129);
                            return;
                        }
                        return;
                    }
                    return;
                }
                z4 = true;
                defpackage.al.ZpBGe2uQfcn8.getClass();
                s0TASMVLSWD5 = defpackage.ma0.s0TASMVLSWD5(defpackage.zk.giKS3J6vZuNy);
                s0TASMVLSWD5.getClass();
                if (s0TASMVLSWD5.length == 0) {
                }
            }
        }
        list = null;
        java.lang.Integer valueOf22 = java.lang.Integer.valueOf(jd0Var.oh71FJcDz6S2);
        if (jd0Var.w7APNrr0aGRc() == null) {
        }
        if (valueOf22 == null) {
        }
        viewStructure.setAutofillId(autofillId, intValue);
        viewStructure.setId(intValue, str, null, null);
        if (q0Var == null) {
        }
        if (valueOf != null) {
        }
        if (l6Var != null) {
        }
        if (o1Var != null) {
        }
        if (alVar != null) {
            viewStructure.setAutofillHints(s0TASMVLSWD53);
        }
        u31Var.giKS3J6vZuNy.QiMR8OkAhezm(jd0Var.oh71FJcDz6S2, new defpackage.y01(viewStructure));
        if (bool != null) {
        }
        if (ko1Var == null) {
        }
        z4 = true;
        defpackage.al.ZpBGe2uQfcn8.getClass();
        s0TASMVLSWD5 = defpackage.ma0.s0TASMVLSWD5(defpackage.zk.giKS3J6vZuNy);
        s0TASMVLSWD5.getClass();
        if (s0TASMVLSWD5.length == 0) {
        }
    }

    public static final long zJPqDeoF0Os1(int i, defpackage.s31 s31Var, defpackage.s31 s31Var2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (i == 3) {
            f = s31Var.ZpBGe2uQfcn8;
            f2 = s31Var2.fWTAfUmVKrZq;
        } else if (i == 4) {
            f = s31Var2.ZpBGe2uQfcn8;
            f2 = s31Var.fWTAfUmVKrZq;
        } else if (i == 5) {
            f = s31Var.giKS3J6vZuNy;
            f2 = s31Var2.JhCgjQRTAOCT;
        } else {
            if (i != 6) {
                defpackage.h7.P05cfTpS5W5L("This function should only be used for 2-D focus search");
                return 0L;
            }
            f = s31Var2.giKS3J6vZuNy;
            f2 = s31Var.JhCgjQRTAOCT;
        }
        float f6 = f - f2;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        long j = (long) f6;
        if (i == 3 || i == 4) {
            float f7 = s31Var.giKS3J6vZuNy;
            f3 = ((s31Var.JhCgjQRTAOCT - f7) / 2.0f) + f7;
            f4 = s31Var2.giKS3J6vZuNy;
            f5 = s31Var2.JhCgjQRTAOCT;
        } else {
            if (i != 5 && i != 6) {
                defpackage.h7.P05cfTpS5W5L("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f8 = s31Var.ZpBGe2uQfcn8;
            f3 = ((s31Var.fWTAfUmVKrZq - f8) / 2.0f) + f8;
            f4 = s31Var2.ZpBGe2uQfcn8;
            f5 = s31Var2.fWTAfUmVKrZq;
        }
        long j2 = (long) (f3 - (((f5 - f4) / 2.0f) + f4));
        return (j2 * j2) + (13 * j * j);
    }
}
