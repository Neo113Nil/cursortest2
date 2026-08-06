package defpackage;

/* loaded from: classes.dex */
public final class aj0 implements defpackage.c51 {
    public static final int[] SyNS6RMn = new int[0];
    public static final sun.misc.Unsafe cnag84Bm = defpackage.al1.riuEU0zW4();
    public final int[] AARZUJiTa;
    public final defpackage.ih0 DFo87pBq1E5;
    public final int EXtogiMhuM;
    public final int F7NU4MC0GW;
    public final int[] IHQe1A4L2xu;
    public final defpackage.qk1 JlrlGoKF;
    public final defpackage.yo0 SH1y5HwkJhh;
    public final defpackage.QQUzIjv3iOC5 adDC3e2L;
    public final defpackage.ve0 ez2rX8ReCYw;
    public final java.lang.Object[] oh6vYeIP;
    public final int r1MBDhnF;
    public final int riuEU0zW4;
    public final boolean xiZrDbcSW0;

    public aj0(int[] iArr, java.lang.Object[] objArr, int i, int i2, defpackage.QQUzIjv3iOC5 qQUzIjv3iOC5, int[] iArr2, int i3, int i4, defpackage.yo0 yo0Var, defpackage.ve0 ve0Var, defpackage.qk1 qk1Var, defpackage.vu vuVar, defpackage.ih0 ih0Var) {
        this.IHQe1A4L2xu = iArr;
        this.oh6vYeIP = objArr;
        this.r1MBDhnF = i;
        this.F7NU4MC0GW = i2;
        this.xiZrDbcSW0 = qQUzIjv3iOC5 instanceof defpackage.e20;
        this.AARZUJiTa = iArr2;
        this.EXtogiMhuM = i3;
        this.riuEU0zW4 = i4;
        this.SH1y5HwkJhh = yo0Var;
        this.ez2rX8ReCYw = ve0Var;
        this.JlrlGoKF = qk1Var;
        this.adDC3e2L = qQUzIjv3iOC5;
        this.DFo87pBq1E5 = ih0Var;
    }

    public static int NHJTzaLwkd(long j, java.lang.Object obj) {
        return ((java.lang.Integer) defpackage.al1.r1MBDhnF.EXtogiMhuM(j, obj)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0266  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static defpackage.aj0 PAEGRtP0bX(defpackage.ty0 ty0Var, defpackage.yo0 yo0Var, defpackage.ve0 ve0Var, defpackage.qk1 qk1Var, defpackage.vu vuVar, defpackage.ih0 ih0Var) {
        int i;
        int charAt;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        int i8;
        char charAt2;
        int i9;
        char charAt3;
        int i10;
        char charAt4;
        int i11;
        char charAt5;
        int i12;
        char charAt6;
        int i13;
        char charAt7;
        int i14;
        char charAt8;
        int i15;
        char charAt9;
        int i16;
        int i17;
        int i18;
        java.lang.Class<?> cls;
        int i19;
        int objectFieldOffset;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        java.lang.reflect.Field frpfPPIgqM9O;
        char charAt10;
        int i25;
        int i26;
        java.lang.Object obj;
        java.lang.reflect.Field frpfPPIgqM9O2;
        java.lang.Object obj2;
        java.lang.reflect.Field frpfPPIgqM9O3;
        int i27;
        char charAt11;
        int i28;
        char charAt12;
        int i29;
        char charAt13;
        int i30;
        char charAt14;
        java.lang.String str = ty0Var.oh6vYeIP;
        int length = str.length();
        int i31 = 55296;
        if (str.charAt(0) >= 55296) {
            int i32 = 1;
            while (true) {
                i = i32 + 1;
                if (str.charAt(i32) < 55296) {
                    break;
                }
                i32 = i;
            }
        } else {
            i = 1;
        }
        int i33 = i + 1;
        int charAt15 = str.charAt(i);
        if (charAt15 >= 55296) {
            int i34 = charAt15 & 8191;
            int i35 = 13;
            while (true) {
                i30 = i33 + 1;
                charAt14 = str.charAt(i33);
                if (charAt14 < 55296) {
                    break;
                }
                i34 |= (charAt14 & 8191) << i35;
                i35 += 13;
                i33 = i30;
            }
            charAt15 = i34 | (charAt14 << i35);
            i33 = i30;
        }
        if (charAt15 == 0) {
            i3 = 0;
            i6 = 0;
            charAt = 0;
            i2 = 0;
            i5 = 0;
            i7 = 0;
            iArr = SyNS6RMn;
            i4 = 0;
        } else {
            int i36 = i33 + 1;
            int charAt16 = str.charAt(i33);
            if (charAt16 >= 55296) {
                int i37 = charAt16 & 8191;
                int i38 = 13;
                while (true) {
                    i15 = i36 + 1;
                    charAt9 = str.charAt(i36);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i37 |= (charAt9 & 8191) << i38;
                    i38 += 13;
                    i36 = i15;
                }
                charAt16 = i37 | (charAt9 << i38);
                i36 = i15;
            }
            int i39 = i36 + 1;
            int charAt17 = str.charAt(i36);
            if (charAt17 >= 55296) {
                int i40 = charAt17 & 8191;
                int i41 = 13;
                while (true) {
                    i14 = i39 + 1;
                    charAt8 = str.charAt(i39);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i40 |= (charAt8 & 8191) << i41;
                    i41 += 13;
                    i39 = i14;
                }
                charAt17 = i40 | (charAt8 << i41);
                i39 = i14;
            }
            int i42 = i39 + 1;
            int charAt18 = str.charAt(i39);
            if (charAt18 >= 55296) {
                int i43 = charAt18 & 8191;
                int i44 = 13;
                while (true) {
                    i13 = i42 + 1;
                    charAt7 = str.charAt(i42);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i43 |= (charAt7 & 8191) << i44;
                    i44 += 13;
                    i42 = i13;
                }
                charAt18 = i43 | (charAt7 << i44);
                i42 = i13;
            }
            int i45 = i42 + 1;
            int charAt19 = str.charAt(i42);
            if (charAt19 >= 55296) {
                int i46 = charAt19 & 8191;
                int i47 = 13;
                while (true) {
                    i12 = i45 + 1;
                    charAt6 = str.charAt(i45);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i46 |= (charAt6 & 8191) << i47;
                    i47 += 13;
                    i45 = i12;
                }
                charAt19 = i46 | (charAt6 << i47);
                i45 = i12;
            }
            int i48 = i45 + 1;
            charAt = str.charAt(i45);
            if (charAt >= 55296) {
                int i49 = charAt & 8191;
                int i50 = 13;
                while (true) {
                    i11 = i48 + 1;
                    charAt5 = str.charAt(i48);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i49 |= (charAt5 & 8191) << i50;
                    i50 += 13;
                    i48 = i11;
                }
                charAt = i49 | (charAt5 << i50);
                i48 = i11;
            }
            int i51 = i48 + 1;
            int charAt20 = str.charAt(i48);
            if (charAt20 >= 55296) {
                int i52 = charAt20 & 8191;
                int i53 = 13;
                while (true) {
                    i10 = i51 + 1;
                    charAt4 = str.charAt(i51);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i52 |= (charAt4 & 8191) << i53;
                    i53 += 13;
                    i51 = i10;
                }
                charAt20 = i52 | (charAt4 << i53);
                i51 = i10;
            }
            int i54 = i51 + 1;
            int charAt21 = str.charAt(i51);
            if (charAt21 >= 55296) {
                int i55 = charAt21 & 8191;
                int i56 = 13;
                while (true) {
                    i9 = i54 + 1;
                    charAt3 = str.charAt(i54);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i55 |= (charAt3 & 8191) << i56;
                    i56 += 13;
                    i54 = i9;
                }
                charAt21 = i55 | (charAt3 << i56);
                i54 = i9;
            }
            int i57 = i54 + 1;
            int charAt22 = str.charAt(i54);
            if (charAt22 >= 55296) {
                int i58 = charAt22 & 8191;
                int i59 = 13;
                while (true) {
                    i8 = i57 + 1;
                    charAt2 = str.charAt(i57);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i58 |= (charAt2 & 8191) << i59;
                    i59 += 13;
                    i57 = i8;
                }
                charAt22 = i58 | (charAt2 << i59);
                i57 = i8;
            }
            int[] iArr2 = new int[charAt22 + charAt20 + charAt21];
            int i60 = (charAt16 * 2) + charAt17;
            int i61 = charAt20;
            i2 = charAt18;
            i3 = i61;
            i4 = charAt16;
            i33 = i57;
            iArr = iArr2;
            i5 = charAt19;
            i6 = i60;
            i7 = charAt22;
        }
        sun.misc.Unsafe unsafe = cnag84Bm;
        java.lang.Object[] objArr = ty0Var.r1MBDhnF;
        java.lang.Class<?> cls2 = ty0Var.IHQe1A4L2xu.getClass();
        int[] iArr3 = new int[charAt * 3];
        java.lang.Object[] objArr2 = new java.lang.Object[charAt * 2];
        int i62 = i7 + i3;
        int i63 = i62;
        int i64 = i7;
        int i65 = 0;
        int i66 = 0;
        while (i33 < length) {
            int i67 = i33 + 1;
            int charAt23 = str.charAt(i33);
            if (charAt23 >= i31) {
                int i68 = charAt23 & 8191;
                int i69 = i67;
                int i70 = 13;
                while (true) {
                    i29 = i69 + 1;
                    charAt13 = str.charAt(i69);
                    i16 = length;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i68 |= (charAt13 & 8191) << i70;
                    i70 += 13;
                    i69 = i29;
                    length = i16;
                }
                charAt23 = i68 | (charAt13 << i70);
                i17 = i29;
            } else {
                i16 = length;
                i17 = i67;
            }
            int i71 = i17 + 1;
            int charAt24 = str.charAt(i17);
            java.lang.Object[] objArr3 = objArr;
            char c = 55296;
            if (charAt24 >= 55296) {
                int i72 = charAt24 & 8191;
                int i73 = 13;
                while (true) {
                    i28 = i71 + 1;
                    charAt12 = str.charAt(i71);
                    if (charAt12 < c) {
                        break;
                    }
                    i72 |= (charAt12 & 8191) << i73;
                    i73 += 13;
                    i71 = i28;
                    c = 55296;
                }
                charAt24 = i72 | (charAt12 << i73);
                i71 = i28;
            }
            int i74 = charAt24 & 255;
            int i75 = charAt23;
            if ((charAt24 & 1024) != 0) {
                iArr[i65] = i66;
                i65++;
            }
            int[] iArr4 = iArr3;
            if (i74 >= 51) {
                int i76 = i71 + 1;
                int charAt25 = str.charAt(i71);
                char c2 = 55296;
                if (charAt25 >= 55296) {
                    int i77 = charAt25 & 8191;
                    int i78 = 13;
                    while (true) {
                        i27 = i76 + 1;
                        charAt11 = str.charAt(i76);
                        if (charAt11 < c2) {
                            break;
                        }
                        i77 |= (charAt11 & 8191) << i78;
                        i78 += 13;
                        i76 = i27;
                        c2 = 55296;
                    }
                    charAt25 = i77 | (charAt11 << i78);
                    i76 = i27;
                }
                int i79 = i74 - 51;
                int i80 = i76;
                if (i79 == 9 || i79 == 17) {
                    i26 = i6 + 1;
                    objArr2[((i66 / 3) * 2) + 1] = objArr3[i6];
                } else {
                    if (i79 == 12) {
                        int IHQe1A4L2xu = ty0Var.IHQe1A4L2xu();
                        if (IHQe1A4L2xu == 0) {
                            throw null;
                        }
                        if ((IHQe1A4L2xu == 1) || (charAt24 & 2048) != 0) {
                            i26 = i6 + 1;
                            objArr2[((i66 / 3) * 2) + 1] = objArr3[i6];
                        }
                    }
                    int i81 = charAt25 * 2;
                    obj = objArr3[i81];
                    if (obj instanceof java.lang.reflect.Field) {
                        frpfPPIgqM9O2 = frpfPPIgqM9O(cls2, (java.lang.String) obj);
                        objArr3[i81] = frpfPPIgqM9O2;
                    } else {
                        frpfPPIgqM9O2 = (java.lang.reflect.Field) obj;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(frpfPPIgqM9O2);
                    int i82 = i81 + 1;
                    obj2 = objArr3[i82];
                    if (obj2 instanceof java.lang.reflect.Field) {
                        frpfPPIgqM9O3 = frpfPPIgqM9O(cls2, (java.lang.String) obj2);
                        objArr3[i82] = frpfPPIgqM9O3;
                    } else {
                        frpfPPIgqM9O3 = (java.lang.reflect.Field) obj2;
                    }
                    int objectFieldOffset3 = (int) unsafe.objectFieldOffset(frpfPPIgqM9O3);
                    int i83 = i4;
                    i20 = objectFieldOffset3;
                    i24 = objectFieldOffset2;
                    i18 = i83;
                    i23 = i6;
                    i21 = i80;
                    i22 = 0;
                    cls = cls2;
                }
                i6 = i26;
                int i812 = charAt25 * 2;
                obj = objArr3[i812];
                if (obj instanceof java.lang.reflect.Field) {
                }
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(frpfPPIgqM9O2);
                int i822 = i812 + 1;
                obj2 = objArr3[i822];
                if (obj2 instanceof java.lang.reflect.Field) {
                }
                int objectFieldOffset32 = (int) unsafe.objectFieldOffset(frpfPPIgqM9O3);
                int i832 = i4;
                i20 = objectFieldOffset32;
                i24 = objectFieldOffset22;
                i18 = i832;
                i23 = i6;
                i21 = i80;
                i22 = 0;
                cls = cls2;
            } else {
                int i84 = i6 + 1;
                java.lang.reflect.Field frpfPPIgqM9O4 = frpfPPIgqM9O(cls2, (java.lang.String) objArr3[i6]);
                if (i74 == 9 || i74 == 17) {
                    i18 = i4;
                    objArr2[((i66 / 3) * 2) + 1] = frpfPPIgqM9O4.getType();
                } else {
                    if (i74 == 27 || i74 == 49) {
                        i18 = i4;
                        i25 = i6 + 2;
                        objArr2[((i66 / 3) * 2) + 1] = objArr3[i84];
                    } else if (i74 == 12 || i74 == 30 || i74 == 44) {
                        i18 = i4;
                        if (ty0Var.IHQe1A4L2xu() == 1 || (charAt24 & 2048) != 0) {
                            i25 = i6 + 2;
                            objArr2[((i66 / 3) * 2) + 1] = objArr3[i84];
                        }
                    } else if (i74 == 50) {
                        int i85 = i64 + 1;
                        iArr[i64] = i66;
                        int i86 = (i66 / 3) * 2;
                        int i87 = i6 + 2;
                        objArr2[i86] = objArr3[i84];
                        if ((charAt24 & 2048) != 0) {
                            i19 = i6 + 3;
                            objArr2[i86 + 1] = objArr3[i87];
                            i18 = i4;
                            cls = cls2;
                            i64 = i85;
                        } else {
                            cls = cls2;
                            i19 = i87;
                            i64 = i85;
                            i18 = i4;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(frpfPPIgqM9O4);
                        if ((charAt24 & 4096) != 0 || i74 > 17) {
                            i20 = 1048575;
                            i21 = i71;
                            i22 = 0;
                        } else {
                            int i88 = i71 + 1;
                            int charAt26 = str.charAt(i71);
                            if (charAt26 >= 55296) {
                                int i89 = charAt26 & 8191;
                                int i90 = 13;
                                while (true) {
                                    i21 = i88 + 1;
                                    charAt10 = str.charAt(i88);
                                    if (charAt10 < 55296) {
                                        break;
                                    }
                                    i89 |= (charAt10 & 8191) << i90;
                                    i90 += 13;
                                    i88 = i21;
                                }
                                charAt26 = i89 | (charAt10 << i90);
                            } else {
                                i21 = i88;
                            }
                            int i91 = (charAt26 / 32) + (i18 * 2);
                            java.lang.Object obj3 = objArr3[i91];
                            if (obj3 instanceof java.lang.reflect.Field) {
                                frpfPPIgqM9O = (java.lang.reflect.Field) obj3;
                            } else {
                                frpfPPIgqM9O = frpfPPIgqM9O(cls, (java.lang.String) obj3);
                                objArr3[i91] = frpfPPIgqM9O;
                            }
                            i20 = (int) unsafe.objectFieldOffset(frpfPPIgqM9O);
                            i22 = charAt26 % 32;
                        }
                        if (i74 >= 18 || i74 > 49) {
                            i23 = i19;
                            i24 = objectFieldOffset;
                        } else {
                            iArr[i63] = objectFieldOffset;
                            i23 = i19;
                            i24 = objectFieldOffset;
                            i63++;
                        }
                    } else {
                        i18 = i4;
                    }
                    i19 = i25;
                    cls = cls2;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(frpfPPIgqM9O4);
                    if ((charAt24 & 4096) != 0) {
                    }
                    i20 = 1048575;
                    i21 = i71;
                    i22 = 0;
                    if (i74 >= 18) {
                    }
                    i23 = i19;
                    i24 = objectFieldOffset;
                }
                cls = cls2;
                i19 = i84;
                objectFieldOffset = (int) unsafe.objectFieldOffset(frpfPPIgqM9O4);
                if ((charAt24 & 4096) != 0) {
                }
                i20 = 1048575;
                i21 = i71;
                i22 = 0;
                if (i74 >= 18) {
                }
                i23 = i19;
                i24 = objectFieldOffset;
            }
            int i92 = i66 + 1;
            iArr4[i66] = i75;
            int i93 = i66 + 2;
            java.lang.String str2 = str;
            iArr4[i92] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i74 << 20) | i24;
            i66 += 3;
            iArr4[i93] = (i22 << 20) | i20;
            cls2 = cls;
            objArr = objArr3;
            str = str2;
            length = i16;
            i4 = i18;
            i33 = i21;
            i31 = 55296;
            i6 = i23;
            iArr3 = iArr4;
        }
        return new defpackage.aj0(iArr3, objArr2, i2, i5, ty0Var.IHQe1A4L2xu, iArr, i7, i62, yo0Var, ve0Var, qk1Var, vuVar, ih0Var);
    }

    public static long QQUzIjv3iOC5(long j, java.lang.Object obj) {
        return ((java.lang.Long) defpackage.al1.r1MBDhnF.EXtogiMhuM(j, obj)).longValue();
    }

    public static boolean QoRHpC4k(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof defpackage.e20) {
            return ((defpackage.e20) obj).AARZUJiTa();
        }
        return true;
    }

    public static int XZx205DYe(int i) {
        return (i & 267386880) >>> 20;
    }

    public static long abhbClRa(int i) {
        return i & 1048575;
    }

    public static java.lang.reflect.Field frpfPPIgqM9O(java.lang.Class cls, java.lang.String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new java.lang.RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + java.util.Arrays.toString(declaredFields));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (defpackage.d51.JlrlGoKF(r5.EXtogiMhuM(r7, r12), r5.EXtogiMhuM(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r5.AARZUJiTa(r7, r12) == r5.AARZUJiTa(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r5.xiZrDbcSW0(r7, r12) == r5.xiZrDbcSW0(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r5.AARZUJiTa(r7, r12) == r5.AARZUJiTa(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r5.xiZrDbcSW0(r7, r12) == r5.xiZrDbcSW0(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r5.xiZrDbcSW0(r7, r12) == r5.xiZrDbcSW0(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r5.xiZrDbcSW0(r7, r12) == r5.xiZrDbcSW0(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (defpackage.d51.JlrlGoKF(r5.EXtogiMhuM(r7, r12), r5.EXtogiMhuM(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (defpackage.d51.JlrlGoKF(r5.EXtogiMhuM(r7, r12), r5.EXtogiMhuM(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (defpackage.d51.JlrlGoKF(r5.EXtogiMhuM(r7, r12), r5.EXtogiMhuM(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        if (r5.r1MBDhnF(r7, r12) == r5.r1MBDhnF(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0160, code lost:
    
        if (r5.xiZrDbcSW0(r7, r12) == r5.xiZrDbcSW0(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        if (r5.AARZUJiTa(r7, r12) == r5.AARZUJiTa(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:
    
        if (r5.xiZrDbcSW0(r7, r12) == r5.xiZrDbcSW0(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        if (r5.AARZUJiTa(r7, r12) == r5.AARZUJiTa(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        if (r5.AARZUJiTa(r7, r12) == r5.AARZUJiTa(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cf, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.adDC3e2L(r7, r12)) == java.lang.Float.floatToIntBits(r5.adDC3e2L(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ec, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.F7NU4MC0GW(r7, r12)) == java.lang.Double.doubleToLongBits(r5.F7NU4MC0GW(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (defpackage.d51.JlrlGoKF(r9.EXtogiMhuM(r7, r12), r9.EXtogiMhuM(r7, r13)) != false) goto L105;
     */
    @Override // defpackage.c51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean AARZUJiTa(defpackage.e20 e20Var, defpackage.e20 e20Var2) {
        int[] iArr = this.IHQe1A4L2xu;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                int mAr5m2L7gYDP = mAr5m2L7gYDP(i);
                long j = mAr5m2L7gYDP & 1048575;
                switch (XZx205DYe(mAr5m2L7gYDP)) {
                    case 0:
                        if (SH1y5HwkJhh(e20Var, e20Var2, i)) {
                            defpackage.zk1 zk1Var = defpackage.al1.r1MBDhnF;
                            break;
                        }
                        z = false;
                        break;
                    case 1:
                        if (SH1y5HwkJhh(e20Var, e20Var2, i)) {
                            defpackage.zk1 zk1Var2 = defpackage.al1.r1MBDhnF;
                            break;
                        }
                        z = false;
                        break;
                    case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                        if (SH1y5HwkJhh(e20Var, e20Var2, i)) {
                            defpackage.zk1 zk1Var3 = defpackage.al1.r1MBDhnF;
                            break;
                        }
                        z = false;
                        break;
                    case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                        if (SH1y5HwkJhh(e20Var, e20Var2, i)) {
                            defpackage.zk1 zk1Var4 = defpackage.al1.r1MBDhnF;
                            break;
                        }
                        z = false;
                        break;
                    case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                        if (SH1y5HwkJhh(e20Var, e20Var2, i)) {
                            defpackage.zk1 zk1Var5 = defpackage.al1.r1MBDhnF;
                            break;
                        }
                        z = false;
                        break;
                    case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                        if (SH1y5HwkJhh(e20Var, e20Var2, i)) {
                            defpackage.zk1 zk1Var6 = defpackage.al1.r1MBDhnF;
                            break;
                        }
                        z = false;
                        break;
                    case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (SH1y5HwkJhh(e20Var, e20Var2, i)) {
                            defpackage.zk1 zk1Var7 = defpackage.al1.r1MBDhnF;
                            break;
                        }
                        z = false;
                        break;
                    case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                        if (SH1y5HwkJhh(e20Var, e20Var2, i)) {
                            defpackage.zk1 zk1Var8 = defpackage.al1.r1MBDhnF;
                            break;
                        }
                        z = false;
                        break;
                    case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
                        if (SH1y5HwkJhh(e20Var, e20Var2, i)) {
                            defpackage.zk1 zk1Var9 = defpackage.al1.r1MBDhnF;
                            break;
                        }
                        z = false;
                        break;
                    case 9:
                        if (SH1y5HwkJhh(e20Var, e20Var2, i)) {
                            defpackage.zk1 zk1Var10 = defpackage.al1.r1MBDhnF;
                            break;
                        }
                        z = false;
                        break;
                    case 10:
                        if (SH1y5HwkJhh(e20Var, e20Var2, i)) {
                            defpackage.zk1 zk1Var11 = defpackage.al1.r1MBDhnF;
                            break;
                        }
                        z = false;
                        break;
                    case 11:
                        if (SH1y5HwkJhh(e20Var, e20Var2, i)) {
                            defpackage.zk1 zk1Var12 = defpackage.al1.r1MBDhnF;
                            break;
                        }
                        z = false;
                        break;
                    case 12:
                        if (SH1y5HwkJhh(e20Var, e20Var2, i)) {
                            defpackage.zk1 zk1Var13 = defpackage.al1.r1MBDhnF;
                            break;
                        }
                        z = false;
                        break;
                    case 13:
                        if (SH1y5HwkJhh(e20Var, e20Var2, i)) {
                            defpackage.zk1 zk1Var14 = defpackage.al1.r1MBDhnF;
                            break;
                        }
                        z = false;
                        break;
                    case 14:
                        if (SH1y5HwkJhh(e20Var, e20Var2, i)) {
                            defpackage.zk1 zk1Var15 = defpackage.al1.r1MBDhnF;
                            break;
                        }
                        z = false;
                        break;
                    case 15:
                        if (SH1y5HwkJhh(e20Var, e20Var2, i)) {
                            defpackage.zk1 zk1Var16 = defpackage.al1.r1MBDhnF;
                            break;
                        }
                        z = false;
                        break;
                    case 16:
                        if (SH1y5HwkJhh(e20Var, e20Var2, i)) {
                            defpackage.zk1 zk1Var17 = defpackage.al1.r1MBDhnF;
                            break;
                        }
                        z = false;
                        break;
                    case 17:
                        if (SH1y5HwkJhh(e20Var, e20Var2, i)) {
                            defpackage.zk1 zk1Var18 = defpackage.al1.r1MBDhnF;
                            break;
                        }
                        z = false;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        defpackage.zk1 zk1Var19 = defpackage.al1.r1MBDhnF;
                        z = defpackage.d51.JlrlGoKF(zk1Var19.EXtogiMhuM(j, e20Var), zk1Var19.EXtogiMhuM(j, e20Var2));
                        break;
                    case 50:
                        defpackage.zk1 zk1Var20 = defpackage.al1.r1MBDhnF;
                        z = defpackage.d51.JlrlGoKF(zk1Var20.EXtogiMhuM(j, e20Var), zk1Var20.EXtogiMhuM(j, e20Var2));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j2 = iArr[i + 2] & 1048575;
                        defpackage.zk1 zk1Var21 = defpackage.al1.r1MBDhnF;
                        if (zk1Var21.xiZrDbcSW0(j2, e20Var) == zk1Var21.xiZrDbcSW0(j2, e20Var2)) {
                            break;
                        }
                        z = false;
                        break;
                }
                if (z) {
                    i += 3;
                }
            } else {
                this.JlrlGoKF.getClass();
                if (e20Var.unknownFields.equals(e20Var2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int C0U8sNJm(int i) {
        if (i < this.r1MBDhnF || i > this.F7NU4MC0GW) {
            return -1;
        }
        int[] iArr = this.IHQe1A4L2xu;
        int length = (iArr.length / 3) - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public final void D2vUnMij(int i, defpackage.pd pdVar, java.lang.Object obj) {
        boolean z = (536870912 & i) != 0;
        defpackage.ve0 ve0Var = this.ez2rX8ReCYw;
        if (z) {
            ve0Var.getClass();
            pdVar.kNAkVymC(defpackage.ve0.IHQe1A4L2xu(i & 1048575, obj), true);
        } else {
            ve0Var.getClass();
            pdVar.kNAkVymC(defpackage.ve0.IHQe1A4L2xu(i & 1048575, obj), false);
        }
    }

    public final defpackage.c51 DFo87pBq1E5(int i) {
        int i2 = (i / 3) * 2;
        java.lang.Object[] objArr = this.oh6vYeIP;
        defpackage.c51 c51Var = (defpackage.c51) objArr[i2];
        if (c51Var != null) {
            return c51Var;
        }
        defpackage.c51 IHQe1A4L2xu = defpackage.jy0.r1MBDhnF.IHQe1A4L2xu((java.lang.Class) objArr[i2 + 1]);
        objArr[i2] = IHQe1A4L2xu;
        return IHQe1A4L2xu;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // defpackage.c51
    public final void EXtogiMhuM(java.lang.Object r19, defpackage.pd r20, defpackage.uu r21) {
        /*
            Method dump skipped, instructions count: 1936
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aj0.EXtogiMhuM(java.lang.Object, pd, uu):void");
    }

    public final void EgCjBq0SZwJ(int i, java.lang.Object obj, java.lang.Object obj2) {
        if (SyNS6RMn(i, obj2)) {
            long mAr5m2L7gYDP = mAr5m2L7gYDP(i) & 1048575;
            sun.misc.Unsafe unsafe = cnag84Bm;
            java.lang.Object object = unsafe.getObject(obj2, mAr5m2L7gYDP);
            if (object == null) {
                throw new java.lang.IllegalStateException("Source subfield " + this.IHQe1A4L2xu[i] + " is present but null: " + obj2);
            }
            defpackage.c51 DFo87pBq1E5 = DFo87pBq1E5(i);
            if (!SyNS6RMn(i, obj)) {
                if (QoRHpC4k(object)) {
                    defpackage.e20 riuEU0zW4 = DFo87pBq1E5.riuEU0zW4();
                    DFo87pBq1E5.oh6vYeIP(riuEU0zW4, object);
                    unsafe.putObject(obj, mAr5m2L7gYDP, riuEU0zW4);
                } else {
                    unsafe.putObject(obj, mAr5m2L7gYDP, object);
                }
                SiPhmbmu(i, obj);
                return;
            }
            java.lang.Object object2 = unsafe.getObject(obj, mAr5m2L7gYDP);
            if (!QoRHpC4k(object2)) {
                defpackage.e20 riuEU0zW42 = DFo87pBq1E5.riuEU0zW4();
                DFo87pBq1E5.oh6vYeIP(riuEU0zW42, object2);
                unsafe.putObject(obj, mAr5m2L7gYDP, riuEU0zW42);
                object2 = riuEU0zW42;
            }
            DFo87pBq1E5.oh6vYeIP(object2, object);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x032a A[SYNTHETIC] */
    @Override // defpackage.c51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int F7NU4MC0GW(defpackage.e20 e20Var) {
        int i;
        int EXtogiMhuM;
        int EXtogiMhuM2;
        int EXtogiMhuM3;
        int SH1y5HwkJhh;
        int EXtogiMhuM4;
        int SH1y5HwkJhh2;
        int EXtogiMhuM5;
        int EXtogiMhuM6;
        int xiZrDbcSW0;
        int IHQe1A4L2xu;
        int i2;
        int r1MBDhnF;
        int i3;
        int i4;
        int EXtogiMhuM7;
        int size;
        int riuEU0zW4;
        int EXtogiMhuM8;
        int EXtogiMhuM9;
        int size2;
        int EXtogiMhuM10;
        int riuEU0zW42;
        int i5;
        int i6;
        java.util.Iterator it;
        int SH1y5HwkJhh3;
        int size3;
        int riuEU0zW43;
        defpackage.tp1 tp1Var;
        int SH1y5HwkJhh4;
        int size4;
        int riuEU0zW44;
        int EXtogiMhuM11;
        int EXtogiMhuM12;
        int SH1y5HwkJhh5;
        int EXtogiMhuM13;
        int SH1y5HwkJhh6;
        int riuEU0zW45;
        defpackage.aj0 aj0Var = this;
        defpackage.e20 e20Var2 = e20Var;
        sun.misc.Unsafe unsafe = cnag84Bm;
        int i7 = 1048575;
        int i8 = 1048575;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = aj0Var.IHQe1A4L2xu;
            if (i9 >= iArr.length) {
                aj0Var.JlrlGoKF.getClass();
                return e20Var2.unknownFields.oh6vYeIP() + i11;
            }
            int mAr5m2L7gYDP = aj0Var.mAr5m2L7gYDP(i9);
            int XZx205DYe = XZx205DYe(mAr5m2L7gYDP);
            int i12 = iArr[i9];
            int i13 = iArr[i9 + 2];
            int i14 = i13 & i7;
            int i15 = 1;
            if (XZx205DYe <= 17) {
                if (i14 != i8) {
                    i10 = i14 == i7 ? 0 : unsafe.getInt(e20Var2, i14);
                    i8 = i14;
                }
                i = 1 << (i13 >>> 20);
            } else {
                i = 0;
            }
            long j = mAr5m2L7gYDP & i7;
            if (XZx205DYe >= defpackage.ev.xiZrDbcSW0.adDC3e2L) {
                int i16 = defpackage.ev.AARZUJiTa.adDC3e2L;
            }
            char c = '?';
            switch (XZx205DYe) {
                case 0:
                    if (aj0Var.cnag84Bm(e20Var2, i9, i8, i10, i)) {
                        EXtogiMhuM = defpackage.rd.EXtogiMhuM(i12);
                        IHQe1A4L2xu = EXtogiMhuM + 8;
                        i11 += IHQe1A4L2xu;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 1:
                    if (aj0Var.cnag84Bm(e20Var2, i9, i8, i10, i)) {
                        EXtogiMhuM2 = defpackage.rd.EXtogiMhuM(i12);
                        EXtogiMhuM6 = EXtogiMhuM2 + 4;
                        i11 += EXtogiMhuM6;
                    }
                    aj0Var = this;
                    e20Var2 = e20Var;
                    i9 += 3;
                    i7 = 1048575;
                case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                    if (aj0Var.cnag84Bm(e20Var2, i9, i8, i10, i)) {
                        long j2 = unsafe.getLong(e20Var2, j);
                        EXtogiMhuM3 = defpackage.rd.EXtogiMhuM(i12);
                        SH1y5HwkJhh = defpackage.rd.SH1y5HwkJhh(j2);
                        i11 += SH1y5HwkJhh + EXtogiMhuM3;
                    }
                    aj0Var = this;
                    i9 += 3;
                    i7 = 1048575;
                case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                    if (aj0Var.cnag84Bm(e20Var2, i9, i8, i10, i)) {
                        long j3 = unsafe.getLong(e20Var2, j);
                        EXtogiMhuM3 = defpackage.rd.EXtogiMhuM(i12);
                        SH1y5HwkJhh = defpackage.rd.SH1y5HwkJhh(j3);
                        i11 += SH1y5HwkJhh + EXtogiMhuM3;
                    }
                    aj0Var = this;
                    i9 += 3;
                    i7 = 1048575;
                case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                    if (aj0Var.cnag84Bm(e20Var2, i9, i8, i10, i)) {
                        int i17 = unsafe.getInt(e20Var2, j);
                        EXtogiMhuM4 = defpackage.rd.EXtogiMhuM(i12);
                        SH1y5HwkJhh2 = defpackage.rd.SH1y5HwkJhh(i17);
                        xiZrDbcSW0 = SH1y5HwkJhh2 + EXtogiMhuM4;
                        i11 += xiZrDbcSW0;
                    }
                    aj0Var = this;
                    i9 += 3;
                    i7 = 1048575;
                case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                    if (aj0Var.cnag84Bm(e20Var2, i9, i8, i10, i)) {
                        EXtogiMhuM5 = defpackage.rd.EXtogiMhuM(i12);
                        EXtogiMhuM6 = EXtogiMhuM5 + 8;
                        i11 += EXtogiMhuM6;
                    }
                    aj0Var = this;
                    e20Var2 = e20Var;
                    i9 += 3;
                    i7 = 1048575;
                case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (aj0Var.cnag84Bm(e20Var2, i9, i8, i10, i)) {
                        EXtogiMhuM2 = defpackage.rd.EXtogiMhuM(i12);
                        EXtogiMhuM6 = EXtogiMhuM2 + 4;
                        i11 += EXtogiMhuM6;
                    }
                    aj0Var = this;
                    e20Var2 = e20Var;
                    i9 += 3;
                    i7 = 1048575;
                case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (aj0Var.cnag84Bm(e20Var2, i9, i8, i10, i)) {
                        EXtogiMhuM6 = defpackage.rd.EXtogiMhuM(i12) + 1;
                        i11 += EXtogiMhuM6;
                    }
                    aj0Var = this;
                    e20Var2 = e20Var;
                    i9 += 3;
                    i7 = 1048575;
                case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
                    if (aj0Var.cnag84Bm(e20Var2, i9, i8, i10, i)) {
                        java.lang.Object object = unsafe.getObject(e20Var2, j);
                        i11 = (object instanceof defpackage.ra ? defpackage.rd.xiZrDbcSW0(i12, (defpackage.ra) object) : defpackage.rd.AARZUJiTa((java.lang.String) object) + defpackage.rd.EXtogiMhuM(i12)) + i11;
                    }
                    aj0Var = this;
                    i9 += 3;
                    i7 = 1048575;
                case 9:
                    if (aj0Var.cnag84Bm(e20Var2, i9, i8, i10, i)) {
                        java.lang.Object object2 = unsafe.getObject(e20Var2, j);
                        defpackage.c51 DFo87pBq1E5 = aj0Var.DFo87pBq1E5(i9);
                        java.lang.Class cls = defpackage.d51.IHQe1A4L2xu;
                        int EXtogiMhuM14 = defpackage.rd.EXtogiMhuM(i12);
                        int IHQe1A4L2xu2 = ((defpackage.QQUzIjv3iOC5) object2).IHQe1A4L2xu(DFo87pBq1E5);
                        i11 += defpackage.rd.riuEU0zW4(IHQe1A4L2xu2) + IHQe1A4L2xu2 + EXtogiMhuM14;
                    }
                    i9 += 3;
                    i7 = 1048575;
                case 10:
                    if (aj0Var.cnag84Bm(e20Var2, i9, i8, i10, i)) {
                        xiZrDbcSW0 = defpackage.rd.xiZrDbcSW0(i12, (defpackage.ra) unsafe.getObject(e20Var2, j));
                        i11 += xiZrDbcSW0;
                    }
                    aj0Var = this;
                    i9 += 3;
                    i7 = 1048575;
                case 11:
                    if (aj0Var.cnag84Bm(e20Var2, i9, i8, i10, i)) {
                        int i18 = unsafe.getInt(e20Var2, j);
                        EXtogiMhuM4 = defpackage.rd.EXtogiMhuM(i12);
                        SH1y5HwkJhh2 = defpackage.rd.riuEU0zW4(i18);
                        xiZrDbcSW0 = SH1y5HwkJhh2 + EXtogiMhuM4;
                        i11 += xiZrDbcSW0;
                    }
                    aj0Var = this;
                    i9 += 3;
                    i7 = 1048575;
                case 12:
                    if (aj0Var.cnag84Bm(e20Var2, i9, i8, i10, i)) {
                        int i19 = unsafe.getInt(e20Var2, j);
                        EXtogiMhuM4 = defpackage.rd.EXtogiMhuM(i12);
                        SH1y5HwkJhh2 = defpackage.rd.SH1y5HwkJhh(i19);
                        xiZrDbcSW0 = SH1y5HwkJhh2 + EXtogiMhuM4;
                        i11 += xiZrDbcSW0;
                    }
                    aj0Var = this;
                    i9 += 3;
                    i7 = 1048575;
                case 13:
                    if (aj0Var.cnag84Bm(e20Var2, i9, i8, i10, i)) {
                        EXtogiMhuM2 = defpackage.rd.EXtogiMhuM(i12);
                        EXtogiMhuM6 = EXtogiMhuM2 + 4;
                        i11 += EXtogiMhuM6;
                    }
                    aj0Var = this;
                    e20Var2 = e20Var;
                    i9 += 3;
                    i7 = 1048575;
                case 14:
                    if (aj0Var.cnag84Bm(e20Var2, i9, i8, i10, i)) {
                        EXtogiMhuM5 = defpackage.rd.EXtogiMhuM(i12);
                        EXtogiMhuM6 = EXtogiMhuM5 + 8;
                        i11 += EXtogiMhuM6;
                    }
                    aj0Var = this;
                    e20Var2 = e20Var;
                    i9 += 3;
                    i7 = 1048575;
                case 15:
                    if (aj0Var.cnag84Bm(e20Var2, i9, i8, i10, i)) {
                        int i20 = unsafe.getInt(e20Var2, j);
                        EXtogiMhuM4 = defpackage.rd.EXtogiMhuM(i12);
                        SH1y5HwkJhh2 = defpackage.rd.riuEU0zW4((i20 >> 31) ^ (i20 << 1));
                        xiZrDbcSW0 = SH1y5HwkJhh2 + EXtogiMhuM4;
                        i11 += xiZrDbcSW0;
                    }
                    aj0Var = this;
                    i9 += 3;
                    i7 = 1048575;
                case 16:
                    if (aj0Var.cnag84Bm(e20Var2, i9, i8, i10, i)) {
                        long j4 = unsafe.getLong(e20Var2, j);
                        EXtogiMhuM3 = defpackage.rd.EXtogiMhuM(i12);
                        SH1y5HwkJhh = defpackage.rd.SH1y5HwkJhh((j4 >> 63) ^ (j4 << 1));
                        i11 += SH1y5HwkJhh + EXtogiMhuM3;
                    }
                    aj0Var = this;
                    i9 += 3;
                    i7 = 1048575;
                case 17:
                    if (aj0Var.cnag84Bm(e20Var2, i9, i8, i10, i)) {
                        IHQe1A4L2xu = ((defpackage.QQUzIjv3iOC5) unsafe.getObject(e20Var2, j)).IHQe1A4L2xu(aj0Var.DFo87pBq1E5(i9)) + (defpackage.rd.EXtogiMhuM(i12) * 2);
                        i11 += IHQe1A4L2xu;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 18:
                    i2 = i8;
                    r1MBDhnF = defpackage.d51.r1MBDhnF(i12, (java.util.List) unsafe.getObject(e20Var2, j));
                    i11 += r1MBDhnF;
                    i8 = i2;
                    i9 += 3;
                    i7 = 1048575;
                case 19:
                    i2 = i8;
                    r1MBDhnF = defpackage.d51.oh6vYeIP(i12, (java.util.List) unsafe.getObject(e20Var2, j));
                    i11 += r1MBDhnF;
                    i8 = i2;
                    i9 += 3;
                    i7 = 1048575;
                case 20:
                    i3 = i8;
                    i4 = i10;
                    java.util.List list = (java.util.List) unsafe.getObject(e20Var2, j);
                    java.lang.Class cls2 = defpackage.d51.IHQe1A4L2xu;
                    if (list.size() != 0) {
                        EXtogiMhuM7 = (defpackage.rd.EXtogiMhuM(i12) * list.size()) + defpackage.d51.adDC3e2L(list);
                        i11 += EXtogiMhuM7;
                        i8 = i3;
                        i10 = i4;
                        i9 += 3;
                        i7 = 1048575;
                    }
                    EXtogiMhuM7 = 0;
                    i11 += EXtogiMhuM7;
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                case 21:
                    i3 = i8;
                    i4 = i10;
                    java.util.List list2 = (java.util.List) unsafe.getObject(e20Var2, j);
                    java.lang.Class cls3 = defpackage.d51.IHQe1A4L2xu;
                    size = list2.size();
                    if (size != 0) {
                        riuEU0zW4 = defpackage.d51.riuEU0zW4(list2);
                        EXtogiMhuM8 = defpackage.rd.EXtogiMhuM(i12);
                        EXtogiMhuM7 = (EXtogiMhuM8 * size) + riuEU0zW4;
                        i11 += EXtogiMhuM7;
                        i8 = i3;
                        i10 = i4;
                        i9 += 3;
                        i7 = 1048575;
                    }
                    EXtogiMhuM7 = 0;
                    i11 += EXtogiMhuM7;
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                case 22:
                    i3 = i8;
                    i4 = i10;
                    java.util.List list3 = (java.util.List) unsafe.getObject(e20Var2, j);
                    java.lang.Class cls4 = defpackage.d51.IHQe1A4L2xu;
                    size = list3.size();
                    if (size != 0) {
                        riuEU0zW4 = defpackage.d51.F7NU4MC0GW(list3);
                        EXtogiMhuM8 = defpackage.rd.EXtogiMhuM(i12);
                        EXtogiMhuM7 = (EXtogiMhuM8 * size) + riuEU0zW4;
                        i11 += EXtogiMhuM7;
                        i8 = i3;
                        i10 = i4;
                        i9 += 3;
                        i7 = 1048575;
                    }
                    EXtogiMhuM7 = 0;
                    i11 += EXtogiMhuM7;
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                case 23:
                    i2 = i8;
                    r1MBDhnF = defpackage.d51.r1MBDhnF(i12, (java.util.List) unsafe.getObject(e20Var2, j));
                    i11 += r1MBDhnF;
                    i8 = i2;
                    i9 += 3;
                    i7 = 1048575;
                case 24:
                    i2 = i8;
                    r1MBDhnF = defpackage.d51.oh6vYeIP(i12, (java.util.List) unsafe.getObject(e20Var2, j));
                    i11 += r1MBDhnF;
                    i8 = i2;
                    i9 += 3;
                    i7 = 1048575;
                case 25:
                    i3 = i8;
                    i4 = i10;
                    java.util.List list4 = (java.util.List) unsafe.getObject(e20Var2, j);
                    java.lang.Class cls5 = defpackage.d51.IHQe1A4L2xu;
                    int size5 = list4.size();
                    i11 += size5 == 0 ? 0 : (defpackage.rd.EXtogiMhuM(i12) + 1) * size5;
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                case 26:
                    i3 = i8;
                    i4 = i10;
                    java.util.List list5 = (java.util.List) unsafe.getObject(e20Var2, j);
                    java.lang.Class cls6 = defpackage.d51.IHQe1A4L2xu;
                    int size6 = list5.size();
                    if (size6 != 0) {
                        EXtogiMhuM7 = defpackage.rd.EXtogiMhuM(i12) * size6;
                        for (int i21 = 0; i21 < size6; i21++) {
                            java.lang.Object obj = list5.get(i21);
                            if (obj instanceof defpackage.ra) {
                                int size7 = ((defpackage.ra) obj).size();
                                EXtogiMhuM7 = defpackage.rd.riuEU0zW4(size7) + size7 + EXtogiMhuM7;
                            } else {
                                EXtogiMhuM7 = defpackage.rd.AARZUJiTa((java.lang.String) obj) + EXtogiMhuM7;
                            }
                        }
                        i11 += EXtogiMhuM7;
                        i8 = i3;
                        i10 = i4;
                        i9 += 3;
                        i7 = 1048575;
                    }
                    EXtogiMhuM7 = 0;
                    i11 += EXtogiMhuM7;
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                case 27:
                    i3 = i8;
                    i4 = i10;
                    java.util.List list6 = (java.util.List) unsafe.getObject(e20Var2, j);
                    defpackage.c51 DFo87pBq1E52 = aj0Var.DFo87pBq1E5(i9);
                    java.lang.Class cls7 = defpackage.d51.IHQe1A4L2xu;
                    int size8 = list6.size();
                    if (size8 == 0) {
                        EXtogiMhuM9 = 0;
                    } else {
                        EXtogiMhuM9 = defpackage.rd.EXtogiMhuM(i12) * size8;
                        for (int i22 = 0; i22 < size8; i22++) {
                            int IHQe1A4L2xu3 = ((defpackage.QQUzIjv3iOC5) list6.get(i22)).IHQe1A4L2xu(DFo87pBq1E52);
                            EXtogiMhuM9 += defpackage.rd.riuEU0zW4(IHQe1A4L2xu3) + IHQe1A4L2xu3;
                        }
                    }
                    i11 += EXtogiMhuM9;
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                case 28:
                    i3 = i8;
                    i4 = i10;
                    java.util.List list7 = (java.util.List) unsafe.getObject(e20Var2, j);
                    java.lang.Class cls8 = defpackage.d51.IHQe1A4L2xu;
                    int size9 = list7.size();
                    if (size9 != 0) {
                        EXtogiMhuM7 = defpackage.rd.EXtogiMhuM(i12) * size9;
                        for (int i23 = 0; i23 < list7.size(); i23++) {
                            int size10 = ((defpackage.ra) list7.get(i23)).size();
                            EXtogiMhuM7 += defpackage.rd.riuEU0zW4(size10) + size10;
                        }
                        i11 += EXtogiMhuM7;
                        i8 = i3;
                        i10 = i4;
                        i9 += 3;
                        i7 = 1048575;
                    }
                    EXtogiMhuM7 = 0;
                    i11 += EXtogiMhuM7;
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                case 29:
                    i3 = i8;
                    i4 = i10;
                    java.util.List list8 = (java.util.List) unsafe.getObject(e20Var2, j);
                    java.lang.Class cls9 = defpackage.d51.IHQe1A4L2xu;
                    size = list8.size();
                    if (size != 0) {
                        riuEU0zW4 = defpackage.d51.EXtogiMhuM(list8);
                        EXtogiMhuM8 = defpackage.rd.EXtogiMhuM(i12);
                        EXtogiMhuM7 = (EXtogiMhuM8 * size) + riuEU0zW4;
                        i11 += EXtogiMhuM7;
                        i8 = i3;
                        i10 = i4;
                        i9 += 3;
                        i7 = 1048575;
                    }
                    EXtogiMhuM7 = 0;
                    i11 += EXtogiMhuM7;
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                case 30:
                    i3 = i8;
                    i4 = i10;
                    java.util.List list9 = (java.util.List) unsafe.getObject(e20Var2, j);
                    java.lang.Class cls10 = defpackage.d51.IHQe1A4L2xu;
                    size = list9.size();
                    if (size != 0) {
                        riuEU0zW4 = defpackage.d51.IHQe1A4L2xu(list9);
                        EXtogiMhuM8 = defpackage.rd.EXtogiMhuM(i12);
                        EXtogiMhuM7 = (EXtogiMhuM8 * size) + riuEU0zW4;
                        i11 += EXtogiMhuM7;
                        i8 = i3;
                        i10 = i4;
                        i9 += 3;
                        i7 = 1048575;
                    }
                    EXtogiMhuM7 = 0;
                    i11 += EXtogiMhuM7;
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                case 31:
                    i2 = i8;
                    r1MBDhnF = defpackage.d51.oh6vYeIP(i12, (java.util.List) unsafe.getObject(e20Var2, j));
                    i11 += r1MBDhnF;
                    i8 = i2;
                    i9 += 3;
                    i7 = 1048575;
                case 32:
                    i2 = i8;
                    r1MBDhnF = defpackage.d51.r1MBDhnF(i12, (java.util.List) unsafe.getObject(e20Var2, j));
                    i11 += r1MBDhnF;
                    i8 = i2;
                    i9 += 3;
                    i7 = 1048575;
                case 33:
                    i3 = i8;
                    i4 = i10;
                    java.util.List list10 = (java.util.List) unsafe.getObject(e20Var2, j);
                    java.lang.Class cls11 = defpackage.d51.IHQe1A4L2xu;
                    size = list10.size();
                    if (size != 0) {
                        riuEU0zW4 = defpackage.d51.xiZrDbcSW0(list10);
                        EXtogiMhuM8 = defpackage.rd.EXtogiMhuM(i12);
                        EXtogiMhuM7 = (EXtogiMhuM8 * size) + riuEU0zW4;
                        i11 += EXtogiMhuM7;
                        i8 = i3;
                        i10 = i4;
                        i9 += 3;
                        i7 = 1048575;
                    }
                    EXtogiMhuM7 = 0;
                    i11 += EXtogiMhuM7;
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                case 34:
                    i3 = i8;
                    i4 = i10;
                    java.util.List list11 = (java.util.List) unsafe.getObject(e20Var2, j);
                    java.lang.Class cls12 = defpackage.d51.IHQe1A4L2xu;
                    size = list11.size();
                    if (size != 0) {
                        riuEU0zW4 = defpackage.d51.AARZUJiTa(list11);
                        EXtogiMhuM8 = defpackage.rd.EXtogiMhuM(i12);
                        EXtogiMhuM7 = (EXtogiMhuM8 * size) + riuEU0zW4;
                        i11 += EXtogiMhuM7;
                        i8 = i3;
                        i10 = i4;
                        i9 += 3;
                        i7 = 1048575;
                    }
                    EXtogiMhuM7 = 0;
                    i11 += EXtogiMhuM7;
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                case 35:
                    i3 = i8;
                    i4 = i10;
                    java.util.List list12 = (java.util.List) unsafe.getObject(e20Var2, j);
                    java.lang.Class cls13 = defpackage.d51.IHQe1A4L2xu;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        EXtogiMhuM10 = defpackage.rd.EXtogiMhuM(i12);
                        riuEU0zW42 = defpackage.rd.riuEU0zW4(size2);
                        i11 += riuEU0zW42 + EXtogiMhuM10 + size2;
                    }
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                case 36:
                    i3 = i8;
                    i4 = i10;
                    java.util.List list13 = (java.util.List) unsafe.getObject(e20Var2, j);
                    java.lang.Class cls14 = defpackage.d51.IHQe1A4L2xu;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        EXtogiMhuM10 = defpackage.rd.EXtogiMhuM(i12);
                        riuEU0zW42 = defpackage.rd.riuEU0zW4(size2);
                        i11 += riuEU0zW42 + EXtogiMhuM10 + size2;
                    }
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                case 37:
                    i3 = i8;
                    i4 = i10;
                    size2 = defpackage.d51.adDC3e2L((java.util.List) unsafe.getObject(e20Var2, j));
                    if (size2 > 0) {
                        EXtogiMhuM10 = defpackage.rd.EXtogiMhuM(i12);
                        riuEU0zW42 = defpackage.rd.riuEU0zW4(size2);
                        i11 += riuEU0zW42 + EXtogiMhuM10 + size2;
                    }
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                case 38:
                    i3 = i8;
                    i4 = i10;
                    size2 = defpackage.d51.riuEU0zW4((java.util.List) unsafe.getObject(e20Var2, j));
                    if (size2 > 0) {
                        EXtogiMhuM10 = defpackage.rd.EXtogiMhuM(i12);
                        riuEU0zW42 = defpackage.rd.riuEU0zW4(size2);
                        i11 += riuEU0zW42 + EXtogiMhuM10 + size2;
                    }
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                case 39:
                    i3 = i8;
                    i4 = i10;
                    size2 = defpackage.d51.F7NU4MC0GW((java.util.List) unsafe.getObject(e20Var2, j));
                    if (size2 > 0) {
                        EXtogiMhuM10 = defpackage.rd.EXtogiMhuM(i12);
                        riuEU0zW42 = defpackage.rd.riuEU0zW4(size2);
                        i11 += riuEU0zW42 + EXtogiMhuM10 + size2;
                    }
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                case 40:
                    i3 = i8;
                    i4 = i10;
                    java.util.List list14 = (java.util.List) unsafe.getObject(e20Var2, j);
                    java.lang.Class cls15 = defpackage.d51.IHQe1A4L2xu;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        EXtogiMhuM10 = defpackage.rd.EXtogiMhuM(i12);
                        riuEU0zW42 = defpackage.rd.riuEU0zW4(size2);
                        i11 += riuEU0zW42 + EXtogiMhuM10 + size2;
                    }
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                case 41:
                    i3 = i8;
                    i4 = i10;
                    java.util.List list15 = (java.util.List) unsafe.getObject(e20Var2, j);
                    java.lang.Class cls16 = defpackage.d51.IHQe1A4L2xu;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        EXtogiMhuM10 = defpackage.rd.EXtogiMhuM(i12);
                        riuEU0zW42 = defpackage.rd.riuEU0zW4(size2);
                        i11 += riuEU0zW42 + EXtogiMhuM10 + size2;
                    }
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                case 42:
                    i3 = i8;
                    i4 = i10;
                    java.util.List list16 = (java.util.List) unsafe.getObject(e20Var2, j);
                    java.lang.Class cls17 = defpackage.d51.IHQe1A4L2xu;
                    size2 = list16.size();
                    if (size2 > 0) {
                        EXtogiMhuM10 = defpackage.rd.EXtogiMhuM(i12);
                        riuEU0zW42 = defpackage.rd.riuEU0zW4(size2);
                        i11 += riuEU0zW42 + EXtogiMhuM10 + size2;
                    }
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                case 43:
                    i3 = i8;
                    i4 = i10;
                    size2 = defpackage.d51.EXtogiMhuM((java.util.List) unsafe.getObject(e20Var2, j));
                    if (size2 > 0) {
                        EXtogiMhuM10 = defpackage.rd.EXtogiMhuM(i12);
                        riuEU0zW42 = defpackage.rd.riuEU0zW4(size2);
                        i11 += riuEU0zW42 + EXtogiMhuM10 + size2;
                    }
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                case 44:
                    i3 = i8;
                    i4 = i10;
                    size2 = defpackage.d51.IHQe1A4L2xu((java.util.List) unsafe.getObject(e20Var2, j));
                    if (size2 > 0) {
                        EXtogiMhuM10 = defpackage.rd.EXtogiMhuM(i12);
                        riuEU0zW42 = defpackage.rd.riuEU0zW4(size2);
                        i11 += riuEU0zW42 + EXtogiMhuM10 + size2;
                    }
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                case 45:
                    i3 = i8;
                    i4 = i10;
                    java.util.List list17 = (java.util.List) unsafe.getObject(e20Var2, j);
                    java.lang.Class cls18 = defpackage.d51.IHQe1A4L2xu;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        EXtogiMhuM10 = defpackage.rd.EXtogiMhuM(i12);
                        riuEU0zW42 = defpackage.rd.riuEU0zW4(size2);
                        i11 += riuEU0zW42 + EXtogiMhuM10 + size2;
                    }
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                case 46:
                    i3 = i8;
                    i4 = i10;
                    java.util.List list18 = (java.util.List) unsafe.getObject(e20Var2, j);
                    java.lang.Class cls19 = defpackage.d51.IHQe1A4L2xu;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        EXtogiMhuM10 = defpackage.rd.EXtogiMhuM(i12);
                        riuEU0zW42 = defpackage.rd.riuEU0zW4(size2);
                        i11 += riuEU0zW42 + EXtogiMhuM10 + size2;
                    }
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                case 47:
                    i3 = i8;
                    i4 = i10;
                    size2 = defpackage.d51.xiZrDbcSW0((java.util.List) unsafe.getObject(e20Var2, j));
                    if (size2 > 0) {
                        EXtogiMhuM10 = defpackage.rd.EXtogiMhuM(i12);
                        riuEU0zW42 = defpackage.rd.riuEU0zW4(size2);
                        i11 += riuEU0zW42 + EXtogiMhuM10 + size2;
                    }
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                case 48:
                    i3 = i8;
                    i4 = i10;
                    size2 = defpackage.d51.AARZUJiTa((java.util.List) unsafe.getObject(e20Var2, j));
                    if (size2 > 0) {
                        EXtogiMhuM10 = defpackage.rd.EXtogiMhuM(i12);
                        riuEU0zW42 = defpackage.rd.riuEU0zW4(size2);
                        i11 += riuEU0zW42 + EXtogiMhuM10 + size2;
                    }
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                case 49:
                    i3 = i8;
                    i4 = i10;
                    java.util.List list19 = (java.util.List) unsafe.getObject(e20Var2, j);
                    defpackage.c51 DFo87pBq1E53 = aj0Var.DFo87pBq1E5(i9);
                    java.lang.Class cls20 = defpackage.d51.IHQe1A4L2xu;
                    int size11 = list19.size();
                    if (size11 == 0) {
                        i5 = 0;
                    } else {
                        i5 = 0;
                        for (int i24 = 0; i24 < size11; i24++) {
                            i5 += ((defpackage.QQUzIjv3iOC5) list19.get(i24)).IHQe1A4L2xu(DFo87pBq1E53) + (defpackage.rd.EXtogiMhuM(i12) * 2);
                        }
                    }
                    i11 += i5;
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                case 50:
                    java.lang.Object object3 = unsafe.getObject(e20Var2, j);
                    java.lang.Object obj2 = aj0Var.oh6vYeIP[(i9 / 3) * 2];
                    aj0Var.DFo87pBq1E5.getClass();
                    defpackage.hh0 hh0Var = (defpackage.hh0) object3;
                    defpackage.zg0 zg0Var = (defpackage.zg0) obj2;
                    if (hh0Var.isEmpty()) {
                        i6 = 0;
                    } else {
                        java.util.Iterator it2 = hh0Var.entrySet().iterator();
                        i6 = 0;
                        while (it2.hasNext()) {
                            java.util.Map.Entry entry = (java.util.Map.Entry) it2.next();
                            java.lang.Object key = entry.getKey();
                            java.lang.Object value = entry.getValue();
                            zg0Var.getClass();
                            int EXtogiMhuM15 = defpackage.rd.EXtogiMhuM(i12);
                            defpackage.v5 v5Var = zg0Var.IHQe1A4L2xu;
                            char c2 = c;
                            defpackage.tp1 tp1Var2 = (defpackage.tp1) v5Var.oh6vYeIP;
                            int i25 = defpackage.dv.r1MBDhnF;
                            int EXtogiMhuM16 = defpackage.rd.EXtogiMhuM(i15);
                            int i26 = i15;
                            defpackage.qp1 qp1Var = defpackage.tp1.EXtogiMhuM;
                            if (tp1Var2 == qp1Var) {
                                EXtogiMhuM16 *= 2;
                            }
                            int i27 = i8;
                            int i28 = i10;
                            switch (tp1Var2.ordinal()) {
                                case 0:
                                    it = it2;
                                    ((java.lang.Double) key).getClass();
                                    SH1y5HwkJhh3 = 8;
                                    int i29 = SH1y5HwkJhh3 + EXtogiMhuM16;
                                    tp1Var = (defpackage.tp1) v5Var.r1MBDhnF;
                                    int EXtogiMhuM17 = defpackage.rd.EXtogiMhuM(2);
                                    if (tp1Var == qp1Var) {
                                        EXtogiMhuM17 *= 2;
                                    }
                                    switch (tp1Var.ordinal()) {
                                        case 0:
                                            ((java.lang.Double) value).getClass();
                                            SH1y5HwkJhh4 = 8;
                                            int i30 = SH1y5HwkJhh4 + EXtogiMhuM17 + i29;
                                            i6 += defpackage.rd.riuEU0zW4(i30) + i30 + EXtogiMhuM15;
                                            it2 = it;
                                            c = c2;
                                            i15 = i26;
                                            i8 = i27;
                                            i10 = i28;
                                        case 1:
                                            ((java.lang.Float) value).getClass();
                                            SH1y5HwkJhh4 = 4;
                                            int i302 = SH1y5HwkJhh4 + EXtogiMhuM17 + i29;
                                            i6 += defpackage.rd.riuEU0zW4(i302) + i302 + EXtogiMhuM15;
                                            it2 = it;
                                            c = c2;
                                            i15 = i26;
                                            i8 = i27;
                                            i10 = i28;
                                        case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                                            SH1y5HwkJhh4 = defpackage.rd.SH1y5HwkJhh(((java.lang.Long) value).longValue());
                                            int i3022 = SH1y5HwkJhh4 + EXtogiMhuM17 + i29;
                                            i6 += defpackage.rd.riuEU0zW4(i3022) + i3022 + EXtogiMhuM15;
                                            it2 = it;
                                            c = c2;
                                            i15 = i26;
                                            i8 = i27;
                                            i10 = i28;
                                        case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                                            SH1y5HwkJhh4 = defpackage.rd.SH1y5HwkJhh(((java.lang.Long) value).longValue());
                                            int i30222 = SH1y5HwkJhh4 + EXtogiMhuM17 + i29;
                                            i6 += defpackage.rd.riuEU0zW4(i30222) + i30222 + EXtogiMhuM15;
                                            it2 = it;
                                            c = c2;
                                            i15 = i26;
                                            i8 = i27;
                                            i10 = i28;
                                        case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                                            SH1y5HwkJhh4 = defpackage.rd.SH1y5HwkJhh(((java.lang.Integer) value).intValue());
                                            int i302222 = SH1y5HwkJhh4 + EXtogiMhuM17 + i29;
                                            i6 += defpackage.rd.riuEU0zW4(i302222) + i302222 + EXtogiMhuM15;
                                            it2 = it;
                                            c = c2;
                                            i15 = i26;
                                            i8 = i27;
                                            i10 = i28;
                                        case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                                            ((java.lang.Long) value).getClass();
                                            SH1y5HwkJhh4 = 8;
                                            int i3022222 = SH1y5HwkJhh4 + EXtogiMhuM17 + i29;
                                            i6 += defpackage.rd.riuEU0zW4(i3022222) + i3022222 + EXtogiMhuM15;
                                            it2 = it;
                                            c = c2;
                                            i15 = i26;
                                            i8 = i27;
                                            i10 = i28;
                                        case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((java.lang.Integer) value).getClass();
                                            SH1y5HwkJhh4 = 4;
                                            int i30222222 = SH1y5HwkJhh4 + EXtogiMhuM17 + i29;
                                            i6 += defpackage.rd.riuEU0zW4(i30222222) + i30222222 + EXtogiMhuM15;
                                            it2 = it;
                                            c = c2;
                                            i15 = i26;
                                            i8 = i27;
                                            i10 = i28;
                                        case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((java.lang.Boolean) value).getClass();
                                            SH1y5HwkJhh4 = i26;
                                            int i302222222 = SH1y5HwkJhh4 + EXtogiMhuM17 + i29;
                                            i6 += defpackage.rd.riuEU0zW4(i302222222) + i302222222 + EXtogiMhuM15;
                                            it2 = it;
                                            c = c2;
                                            i15 = i26;
                                            i8 = i27;
                                            i10 = i28;
                                        case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
                                            if (value instanceof defpackage.ra) {
                                                size4 = ((defpackage.ra) value).size();
                                                riuEU0zW44 = defpackage.rd.riuEU0zW4(size4);
                                                SH1y5HwkJhh4 = size4 + riuEU0zW44;
                                                int i3022222222 = SH1y5HwkJhh4 + EXtogiMhuM17 + i29;
                                                i6 += defpackage.rd.riuEU0zW4(i3022222222) + i3022222222 + EXtogiMhuM15;
                                                it2 = it;
                                                c = c2;
                                                i15 = i26;
                                                i8 = i27;
                                                i10 = i28;
                                            } else {
                                                SH1y5HwkJhh4 = defpackage.rd.AARZUJiTa((java.lang.String) value);
                                                int i30222222222 = SH1y5HwkJhh4 + EXtogiMhuM17 + i29;
                                                i6 += defpackage.rd.riuEU0zW4(i30222222222) + i30222222222 + EXtogiMhuM15;
                                                it2 = it;
                                                c = c2;
                                                i15 = i26;
                                                i8 = i27;
                                                i10 = i28;
                                            }
                                        case 9:
                                            SH1y5HwkJhh4 = ((defpackage.e20) ((defpackage.QQUzIjv3iOC5) value)).IHQe1A4L2xu(null);
                                            int i302222222222 = SH1y5HwkJhh4 + EXtogiMhuM17 + i29;
                                            i6 += defpackage.rd.riuEU0zW4(i302222222222) + i302222222222 + EXtogiMhuM15;
                                            it2 = it;
                                            c = c2;
                                            i15 = i26;
                                            i8 = i27;
                                            i10 = i28;
                                        case 10:
                                            size4 = ((defpackage.e20) ((defpackage.QQUzIjv3iOC5) value)).IHQe1A4L2xu(null);
                                            riuEU0zW44 = defpackage.rd.riuEU0zW4(size4);
                                            SH1y5HwkJhh4 = size4 + riuEU0zW44;
                                            int i3022222222222 = SH1y5HwkJhh4 + EXtogiMhuM17 + i29;
                                            i6 += defpackage.rd.riuEU0zW4(i3022222222222) + i3022222222222 + EXtogiMhuM15;
                                            it2 = it;
                                            c = c2;
                                            i15 = i26;
                                            i8 = i27;
                                            i10 = i28;
                                        case 11:
                                            if (value instanceof defpackage.ra) {
                                                size4 = ((defpackage.ra) value).size();
                                                riuEU0zW44 = defpackage.rd.riuEU0zW4(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                riuEU0zW44 = defpackage.rd.riuEU0zW4(size4);
                                            }
                                            SH1y5HwkJhh4 = size4 + riuEU0zW44;
                                            int i30222222222222 = SH1y5HwkJhh4 + EXtogiMhuM17 + i29;
                                            i6 += defpackage.rd.riuEU0zW4(i30222222222222) + i30222222222222 + EXtogiMhuM15;
                                            it2 = it;
                                            c = c2;
                                            i15 = i26;
                                            i8 = i27;
                                            i10 = i28;
                                        case 12:
                                            SH1y5HwkJhh4 = defpackage.rd.riuEU0zW4(((java.lang.Integer) value).intValue());
                                            int i302222222222222 = SH1y5HwkJhh4 + EXtogiMhuM17 + i29;
                                            i6 += defpackage.rd.riuEU0zW4(i302222222222222) + i302222222222222 + EXtogiMhuM15;
                                            it2 = it;
                                            c = c2;
                                            i15 = i26;
                                            i8 = i27;
                                            i10 = i28;
                                        case 13:
                                            SH1y5HwkJhh4 = defpackage.rd.SH1y5HwkJhh(((java.lang.Integer) value).intValue());
                                            int i3022222222222222 = SH1y5HwkJhh4 + EXtogiMhuM17 + i29;
                                            i6 += defpackage.rd.riuEU0zW4(i3022222222222222) + i3022222222222222 + EXtogiMhuM15;
                                            it2 = it;
                                            c = c2;
                                            i15 = i26;
                                            i8 = i27;
                                            i10 = i28;
                                        case 14:
                                            ((java.lang.Integer) value).getClass();
                                            SH1y5HwkJhh4 = 4;
                                            int i30222222222222222 = SH1y5HwkJhh4 + EXtogiMhuM17 + i29;
                                            i6 += defpackage.rd.riuEU0zW4(i30222222222222222) + i30222222222222222 + EXtogiMhuM15;
                                            it2 = it;
                                            c = c2;
                                            i15 = i26;
                                            i8 = i27;
                                            i10 = i28;
                                        case 15:
                                            ((java.lang.Long) value).getClass();
                                            SH1y5HwkJhh4 = 8;
                                            int i302222222222222222 = SH1y5HwkJhh4 + EXtogiMhuM17 + i29;
                                            i6 += defpackage.rd.riuEU0zW4(i302222222222222222) + i302222222222222222 + EXtogiMhuM15;
                                            it2 = it;
                                            c = c2;
                                            i15 = i26;
                                            i8 = i27;
                                            i10 = i28;
                                        case 16:
                                            int intValue = ((java.lang.Integer) value).intValue();
                                            SH1y5HwkJhh4 = defpackage.rd.riuEU0zW4((intValue >> 31) ^ (intValue << 1));
                                            int i3022222222222222222 = SH1y5HwkJhh4 + EXtogiMhuM17 + i29;
                                            i6 += defpackage.rd.riuEU0zW4(i3022222222222222222) + i3022222222222222222 + EXtogiMhuM15;
                                            it2 = it;
                                            c = c2;
                                            i15 = i26;
                                            i8 = i27;
                                            i10 = i28;
                                        case 17:
                                            long longValue = ((java.lang.Long) value).longValue();
                                            SH1y5HwkJhh4 = defpackage.rd.SH1y5HwkJhh((longValue >> c2) ^ (longValue << i26));
                                            int i30222222222222222222 = SH1y5HwkJhh4 + EXtogiMhuM17 + i29;
                                            i6 += defpackage.rd.riuEU0zW4(i30222222222222222222) + i30222222222222222222 + EXtogiMhuM15;
                                            it2 = it;
                                            c = c2;
                                            i15 = i26;
                                            i8 = i27;
                                            i10 = i28;
                                        default:
                                            throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                case 1:
                                    it = it2;
                                    ((java.lang.Float) key).getClass();
                                    SH1y5HwkJhh3 = 4;
                                    int i292 = SH1y5HwkJhh3 + EXtogiMhuM16;
                                    tp1Var = (defpackage.tp1) v5Var.r1MBDhnF;
                                    int EXtogiMhuM172 = defpackage.rd.EXtogiMhuM(2);
                                    if (tp1Var == qp1Var) {
                                    }
                                    switch (tp1Var.ordinal()) {
                                    }
                                case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                                    it = it2;
                                    SH1y5HwkJhh3 = defpackage.rd.SH1y5HwkJhh(((java.lang.Long) key).longValue());
                                    int i2922 = SH1y5HwkJhh3 + EXtogiMhuM16;
                                    tp1Var = (defpackage.tp1) v5Var.r1MBDhnF;
                                    int EXtogiMhuM1722 = defpackage.rd.EXtogiMhuM(2);
                                    if (tp1Var == qp1Var) {
                                    }
                                    switch (tp1Var.ordinal()) {
                                    }
                                case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                                    it = it2;
                                    SH1y5HwkJhh3 = defpackage.rd.SH1y5HwkJhh(((java.lang.Long) key).longValue());
                                    int i29222 = SH1y5HwkJhh3 + EXtogiMhuM16;
                                    tp1Var = (defpackage.tp1) v5Var.r1MBDhnF;
                                    int EXtogiMhuM17222 = defpackage.rd.EXtogiMhuM(2);
                                    if (tp1Var == qp1Var) {
                                    }
                                    switch (tp1Var.ordinal()) {
                                    }
                                case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                                    it = it2;
                                    SH1y5HwkJhh3 = defpackage.rd.SH1y5HwkJhh(((java.lang.Integer) key).intValue());
                                    int i292222 = SH1y5HwkJhh3 + EXtogiMhuM16;
                                    tp1Var = (defpackage.tp1) v5Var.r1MBDhnF;
                                    int EXtogiMhuM172222 = defpackage.rd.EXtogiMhuM(2);
                                    if (tp1Var == qp1Var) {
                                    }
                                    switch (tp1Var.ordinal()) {
                                    }
                                case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                                    it = it2;
                                    ((java.lang.Long) key).getClass();
                                    SH1y5HwkJhh3 = 8;
                                    int i2922222 = SH1y5HwkJhh3 + EXtogiMhuM16;
                                    tp1Var = (defpackage.tp1) v5Var.r1MBDhnF;
                                    int EXtogiMhuM1722222 = defpackage.rd.EXtogiMhuM(2);
                                    if (tp1Var == qp1Var) {
                                    }
                                    switch (tp1Var.ordinal()) {
                                    }
                                case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                                    it = it2;
                                    ((java.lang.Integer) key).getClass();
                                    SH1y5HwkJhh3 = 4;
                                    int i29222222 = SH1y5HwkJhh3 + EXtogiMhuM16;
                                    tp1Var = (defpackage.tp1) v5Var.r1MBDhnF;
                                    int EXtogiMhuM17222222 = defpackage.rd.EXtogiMhuM(2);
                                    if (tp1Var == qp1Var) {
                                    }
                                    switch (tp1Var.ordinal()) {
                                    }
                                case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                                    it = it2;
                                    ((java.lang.Boolean) key).getClass();
                                    SH1y5HwkJhh3 = i26;
                                    int i292222222 = SH1y5HwkJhh3 + EXtogiMhuM16;
                                    tp1Var = (defpackage.tp1) v5Var.r1MBDhnF;
                                    int EXtogiMhuM172222222 = defpackage.rd.EXtogiMhuM(2);
                                    if (tp1Var == qp1Var) {
                                    }
                                    switch (tp1Var.ordinal()) {
                                    }
                                case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
                                    it = it2;
                                    if (key instanceof defpackage.ra) {
                                        size3 = ((defpackage.ra) key).size();
                                        riuEU0zW43 = defpackage.rd.riuEU0zW4(size3);
                                        SH1y5HwkJhh3 = riuEU0zW43 + size3;
                                        int i2922222222 = SH1y5HwkJhh3 + EXtogiMhuM16;
                                        tp1Var = (defpackage.tp1) v5Var.r1MBDhnF;
                                        int EXtogiMhuM1722222222 = defpackage.rd.EXtogiMhuM(2);
                                        if (tp1Var == qp1Var) {
                                        }
                                        switch (tp1Var.ordinal()) {
                                        }
                                    } else {
                                        SH1y5HwkJhh3 = defpackage.rd.AARZUJiTa((java.lang.String) key);
                                        int i29222222222 = SH1y5HwkJhh3 + EXtogiMhuM16;
                                        tp1Var = (defpackage.tp1) v5Var.r1MBDhnF;
                                        int EXtogiMhuM17222222222 = defpackage.rd.EXtogiMhuM(2);
                                        if (tp1Var == qp1Var) {
                                        }
                                        switch (tp1Var.ordinal()) {
                                        }
                                    }
                                case 9:
                                    it = it2;
                                    SH1y5HwkJhh3 = ((defpackage.e20) ((defpackage.QQUzIjv3iOC5) key)).IHQe1A4L2xu(null);
                                    int i292222222222 = SH1y5HwkJhh3 + EXtogiMhuM16;
                                    tp1Var = (defpackage.tp1) v5Var.r1MBDhnF;
                                    int EXtogiMhuM172222222222 = defpackage.rd.EXtogiMhuM(2);
                                    if (tp1Var == qp1Var) {
                                    }
                                    switch (tp1Var.ordinal()) {
                                    }
                                case 10:
                                    it = it2;
                                    int IHQe1A4L2xu4 = ((defpackage.e20) ((defpackage.QQUzIjv3iOC5) key)).IHQe1A4L2xu(null);
                                    SH1y5HwkJhh3 = defpackage.rd.riuEU0zW4(IHQe1A4L2xu4) + IHQe1A4L2xu4;
                                    int i2922222222222 = SH1y5HwkJhh3 + EXtogiMhuM16;
                                    tp1Var = (defpackage.tp1) v5Var.r1MBDhnF;
                                    int EXtogiMhuM1722222222222 = defpackage.rd.EXtogiMhuM(2);
                                    if (tp1Var == qp1Var) {
                                    }
                                    switch (tp1Var.ordinal()) {
                                    }
                                case 11:
                                    it = it2;
                                    if (key instanceof defpackage.ra) {
                                        size3 = ((defpackage.ra) key).size();
                                        riuEU0zW43 = defpackage.rd.riuEU0zW4(size3);
                                    } else {
                                        size3 = ((byte[]) key).length;
                                        riuEU0zW43 = defpackage.rd.riuEU0zW4(size3);
                                    }
                                    SH1y5HwkJhh3 = riuEU0zW43 + size3;
                                    int i29222222222222 = SH1y5HwkJhh3 + EXtogiMhuM16;
                                    tp1Var = (defpackage.tp1) v5Var.r1MBDhnF;
                                    int EXtogiMhuM17222222222222 = defpackage.rd.EXtogiMhuM(2);
                                    if (tp1Var == qp1Var) {
                                    }
                                    switch (tp1Var.ordinal()) {
                                    }
                                case 12:
                                    it = it2;
                                    SH1y5HwkJhh3 = defpackage.rd.riuEU0zW4(((java.lang.Integer) key).intValue());
                                    int i292222222222222 = SH1y5HwkJhh3 + EXtogiMhuM16;
                                    tp1Var = (defpackage.tp1) v5Var.r1MBDhnF;
                                    int EXtogiMhuM172222222222222 = defpackage.rd.EXtogiMhuM(2);
                                    if (tp1Var == qp1Var) {
                                    }
                                    switch (tp1Var.ordinal()) {
                                    }
                                case 13:
                                    it = it2;
                                    SH1y5HwkJhh3 = defpackage.rd.SH1y5HwkJhh(((java.lang.Integer) key).intValue());
                                    int i2922222222222222 = SH1y5HwkJhh3 + EXtogiMhuM16;
                                    tp1Var = (defpackage.tp1) v5Var.r1MBDhnF;
                                    int EXtogiMhuM1722222222222222 = defpackage.rd.EXtogiMhuM(2);
                                    if (tp1Var == qp1Var) {
                                    }
                                    switch (tp1Var.ordinal()) {
                                    }
                                case 14:
                                    ((java.lang.Integer) key).getClass();
                                    it = it2;
                                    SH1y5HwkJhh3 = 4;
                                    int i29222222222222222 = SH1y5HwkJhh3 + EXtogiMhuM16;
                                    tp1Var = (defpackage.tp1) v5Var.r1MBDhnF;
                                    int EXtogiMhuM17222222222222222 = defpackage.rd.EXtogiMhuM(2);
                                    if (tp1Var == qp1Var) {
                                    }
                                    switch (tp1Var.ordinal()) {
                                    }
                                case 15:
                                    ((java.lang.Long) key).getClass();
                                    it = it2;
                                    SH1y5HwkJhh3 = 8;
                                    int i292222222222222222 = SH1y5HwkJhh3 + EXtogiMhuM16;
                                    tp1Var = (defpackage.tp1) v5Var.r1MBDhnF;
                                    int EXtogiMhuM172222222222222222 = defpackage.rd.EXtogiMhuM(2);
                                    if (tp1Var == qp1Var) {
                                    }
                                    switch (tp1Var.ordinal()) {
                                    }
                                case 16:
                                    int intValue2 = ((java.lang.Integer) key).intValue();
                                    SH1y5HwkJhh3 = defpackage.rd.riuEU0zW4((intValue2 >> 31) ^ (intValue2 << 1));
                                    it = it2;
                                    int i2922222222222222222 = SH1y5HwkJhh3 + EXtogiMhuM16;
                                    tp1Var = (defpackage.tp1) v5Var.r1MBDhnF;
                                    int EXtogiMhuM1722222222222222222 = defpackage.rd.EXtogiMhuM(2);
                                    if (tp1Var == qp1Var) {
                                    }
                                    switch (tp1Var.ordinal()) {
                                    }
                                case 17:
                                    long longValue2 = ((java.lang.Long) key).longValue();
                                    SH1y5HwkJhh3 = defpackage.rd.SH1y5HwkJhh((longValue2 << i26) ^ (longValue2 >> c2));
                                    it = it2;
                                    int i29222222222222222222 = SH1y5HwkJhh3 + EXtogiMhuM16;
                                    tp1Var = (defpackage.tp1) v5Var.r1MBDhnF;
                                    int EXtogiMhuM17222222222222222222 = defpackage.rd.EXtogiMhuM(2);
                                    if (tp1Var == qp1Var) {
                                    }
                                    switch (tp1Var.ordinal()) {
                                    }
                                default:
                                    throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                            }
                        }
                    }
                    i3 = i8;
                    i4 = i10;
                    i11 += i6;
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    i7 = 1048575;
                case 51:
                    if (aj0Var.G3OKOH3wZRC(i12, i9, e20Var2)) {
                        EXtogiMhuM = defpackage.rd.EXtogiMhuM(i12);
                        IHQe1A4L2xu = EXtogiMhuM + 8;
                        i11 += IHQe1A4L2xu;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 52:
                    if (aj0Var.G3OKOH3wZRC(i12, i9, e20Var2)) {
                        EXtogiMhuM11 = defpackage.rd.EXtogiMhuM(i12);
                        IHQe1A4L2xu = EXtogiMhuM11 + 4;
                        i11 += IHQe1A4L2xu;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 53:
                    if (aj0Var.G3OKOH3wZRC(i12, i9, e20Var2)) {
                        long QQUzIjv3iOC5 = QQUzIjv3iOC5(j, e20Var2);
                        EXtogiMhuM12 = defpackage.rd.EXtogiMhuM(i12);
                        SH1y5HwkJhh5 = defpackage.rd.SH1y5HwkJhh(QQUzIjv3iOC5);
                        riuEU0zW45 = SH1y5HwkJhh5 + EXtogiMhuM12;
                        i11 += riuEU0zW45;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 54:
                    if (aj0Var.G3OKOH3wZRC(i12, i9, e20Var2)) {
                        long QQUzIjv3iOC52 = QQUzIjv3iOC5(j, e20Var2);
                        EXtogiMhuM12 = defpackage.rd.EXtogiMhuM(i12);
                        SH1y5HwkJhh5 = defpackage.rd.SH1y5HwkJhh(QQUzIjv3iOC52);
                        riuEU0zW45 = SH1y5HwkJhh5 + EXtogiMhuM12;
                        i11 += riuEU0zW45;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 55:
                    if (aj0Var.G3OKOH3wZRC(i12, i9, e20Var2)) {
                        int NHJTzaLwkd = NHJTzaLwkd(j, e20Var2);
                        EXtogiMhuM13 = defpackage.rd.EXtogiMhuM(i12);
                        SH1y5HwkJhh6 = defpackage.rd.SH1y5HwkJhh(NHJTzaLwkd);
                        IHQe1A4L2xu = SH1y5HwkJhh6 + EXtogiMhuM13;
                        i11 += IHQe1A4L2xu;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 56:
                    if (aj0Var.G3OKOH3wZRC(i12, i9, e20Var2)) {
                        EXtogiMhuM = defpackage.rd.EXtogiMhuM(i12);
                        IHQe1A4L2xu = EXtogiMhuM + 8;
                        i11 += IHQe1A4L2xu;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 57:
                    if (aj0Var.G3OKOH3wZRC(i12, i9, e20Var2)) {
                        EXtogiMhuM11 = defpackage.rd.EXtogiMhuM(i12);
                        IHQe1A4L2xu = EXtogiMhuM11 + 4;
                        i11 += IHQe1A4L2xu;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 58:
                    if (aj0Var.G3OKOH3wZRC(i12, i9, e20Var2)) {
                        IHQe1A4L2xu = defpackage.rd.EXtogiMhuM(i12) + 1;
                        i11 += IHQe1A4L2xu;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 59:
                    if (aj0Var.G3OKOH3wZRC(i12, i9, e20Var2)) {
                        java.lang.Object object4 = unsafe.getObject(e20Var2, j);
                        i11 = (object4 instanceof defpackage.ra ? defpackage.rd.xiZrDbcSW0(i12, (defpackage.ra) object4) : defpackage.rd.AARZUJiTa((java.lang.String) object4) + defpackage.rd.EXtogiMhuM(i12)) + i11;
                    }
                    i9 += 3;
                    i7 = 1048575;
                case 60:
                    if (aj0Var.G3OKOH3wZRC(i12, i9, e20Var2)) {
                        java.lang.Object object5 = unsafe.getObject(e20Var2, j);
                        defpackage.c51 DFo87pBq1E54 = aj0Var.DFo87pBq1E5(i9);
                        java.lang.Class cls21 = defpackage.d51.IHQe1A4L2xu;
                        int EXtogiMhuM18 = defpackage.rd.EXtogiMhuM(i12);
                        int IHQe1A4L2xu5 = ((defpackage.QQUzIjv3iOC5) object5).IHQe1A4L2xu(DFo87pBq1E54);
                        riuEU0zW45 = defpackage.rd.riuEU0zW4(IHQe1A4L2xu5) + IHQe1A4L2xu5 + EXtogiMhuM18;
                        i11 += riuEU0zW45;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 61:
                    if (aj0Var.G3OKOH3wZRC(i12, i9, e20Var2)) {
                        IHQe1A4L2xu = defpackage.rd.xiZrDbcSW0(i12, (defpackage.ra) unsafe.getObject(e20Var2, j));
                        i11 += IHQe1A4L2xu;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 62:
                    if (aj0Var.G3OKOH3wZRC(i12, i9, e20Var2)) {
                        int NHJTzaLwkd2 = NHJTzaLwkd(j, e20Var2);
                        EXtogiMhuM13 = defpackage.rd.EXtogiMhuM(i12);
                        SH1y5HwkJhh6 = defpackage.rd.riuEU0zW4(NHJTzaLwkd2);
                        IHQe1A4L2xu = SH1y5HwkJhh6 + EXtogiMhuM13;
                        i11 += IHQe1A4L2xu;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 63:
                    if (aj0Var.G3OKOH3wZRC(i12, i9, e20Var2)) {
                        int NHJTzaLwkd3 = NHJTzaLwkd(j, e20Var2);
                        EXtogiMhuM13 = defpackage.rd.EXtogiMhuM(i12);
                        SH1y5HwkJhh6 = defpackage.rd.SH1y5HwkJhh(NHJTzaLwkd3);
                        IHQe1A4L2xu = SH1y5HwkJhh6 + EXtogiMhuM13;
                        i11 += IHQe1A4L2xu;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 64:
                    if (aj0Var.G3OKOH3wZRC(i12, i9, e20Var2)) {
                        EXtogiMhuM11 = defpackage.rd.EXtogiMhuM(i12);
                        IHQe1A4L2xu = EXtogiMhuM11 + 4;
                        i11 += IHQe1A4L2xu;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 65:
                    if (aj0Var.G3OKOH3wZRC(i12, i9, e20Var2)) {
                        EXtogiMhuM = defpackage.rd.EXtogiMhuM(i12);
                        IHQe1A4L2xu = EXtogiMhuM + 8;
                        i11 += IHQe1A4L2xu;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 66:
                    if (aj0Var.G3OKOH3wZRC(i12, i9, e20Var2)) {
                        int NHJTzaLwkd4 = NHJTzaLwkd(j, e20Var2);
                        EXtogiMhuM13 = defpackage.rd.EXtogiMhuM(i12);
                        SH1y5HwkJhh6 = defpackage.rd.riuEU0zW4((NHJTzaLwkd4 >> 31) ^ (NHJTzaLwkd4 << 1));
                        IHQe1A4L2xu = SH1y5HwkJhh6 + EXtogiMhuM13;
                        i11 += IHQe1A4L2xu;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 67:
                    if (aj0Var.G3OKOH3wZRC(i12, i9, e20Var2)) {
                        long QQUzIjv3iOC53 = QQUzIjv3iOC5(j, e20Var2);
                        EXtogiMhuM12 = defpackage.rd.EXtogiMhuM(i12);
                        SH1y5HwkJhh5 = defpackage.rd.SH1y5HwkJhh((QQUzIjv3iOC53 << 1) ^ (QQUzIjv3iOC53 >> 63));
                        riuEU0zW45 = SH1y5HwkJhh5 + EXtogiMhuM12;
                        i11 += riuEU0zW45;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                case 68:
                    if (aj0Var.G3OKOH3wZRC(i12, i9, e20Var2)) {
                        IHQe1A4L2xu = ((defpackage.QQUzIjv3iOC5) unsafe.getObject(e20Var2, j)).IHQe1A4L2xu(aj0Var.DFo87pBq1E5(i9)) + (defpackage.rd.EXtogiMhuM(i12) * 2);
                        i11 += IHQe1A4L2xu;
                        i9 += 3;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                    }
                default:
                    i9 += 3;
                    i7 = 1048575;
            }
        }
    }

    public final boolean G3OKOH3wZRC(int i, int i2, java.lang.Object obj) {
        return defpackage.al1.r1MBDhnF.xiZrDbcSW0((long) (this.IHQe1A4L2xu[i2 + 2] & 1048575), obj) == i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0216, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e1, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e2, code lost:
    
        r3 = r8 + r3;
     */
    @Override // defpackage.c51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int IHQe1A4L2xu(defpackage.e20 e20Var) {
        int i;
        int oh6vYeIP;
        int i2;
        int[] iArr = this.IHQe1A4L2xu;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int mAr5m2L7gYDP = mAr5m2L7gYDP(i4);
            int i5 = iArr[i4];
            long j = 1048575 & mAr5m2L7gYDP;
            int i6 = 1237;
            int i7 = 37;
            switch (XZx205DYe(mAr5m2L7gYDP)) {
                case 0:
                    i = i3 * 53;
                    oh6vYeIP = defpackage.q70.oh6vYeIP(java.lang.Double.doubleToLongBits(defpackage.al1.r1MBDhnF.F7NU4MC0GW(j, e20Var)));
                    i3 = oh6vYeIP + i;
                    break;
                case 1:
                    i = i3 * 53;
                    oh6vYeIP = java.lang.Float.floatToIntBits(defpackage.al1.r1MBDhnF.adDC3e2L(j, e20Var));
                    i3 = oh6vYeIP + i;
                    break;
                case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                    i = i3 * 53;
                    oh6vYeIP = defpackage.q70.oh6vYeIP(defpackage.al1.r1MBDhnF.AARZUJiTa(j, e20Var));
                    i3 = oh6vYeIP + i;
                    break;
                case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                    i = i3 * 53;
                    oh6vYeIP = defpackage.q70.oh6vYeIP(defpackage.al1.r1MBDhnF.AARZUJiTa(j, e20Var));
                    i3 = oh6vYeIP + i;
                    break;
                case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                    i = i3 * 53;
                    oh6vYeIP = defpackage.al1.r1MBDhnF.xiZrDbcSW0(j, e20Var);
                    i3 = oh6vYeIP + i;
                    break;
                case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                    i = i3 * 53;
                    oh6vYeIP = defpackage.q70.oh6vYeIP(defpackage.al1.r1MBDhnF.AARZUJiTa(j, e20Var));
                    i3 = oh6vYeIP + i;
                    break;
                case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                    i = i3 * 53;
                    oh6vYeIP = defpackage.al1.r1MBDhnF.xiZrDbcSW0(j, e20Var);
                    i3 = oh6vYeIP + i;
                    break;
                case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                    i2 = i3 * 53;
                    boolean r1MBDhnF = defpackage.al1.r1MBDhnF.r1MBDhnF(j, e20Var);
                    java.nio.charset.Charset charset = defpackage.q70.IHQe1A4L2xu;
                    break;
                case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
                    i = i3 * 53;
                    oh6vYeIP = ((java.lang.String) defpackage.al1.r1MBDhnF.EXtogiMhuM(j, e20Var)).hashCode();
                    i3 = oh6vYeIP + i;
                    break;
                case 9:
                    java.lang.Object EXtogiMhuM = defpackage.al1.r1MBDhnF.EXtogiMhuM(j, e20Var);
                    if (EXtogiMhuM != null) {
                        i7 = EXtogiMhuM.hashCode();
                    }
                    i3 = (i3 * 53) + i7;
                    break;
                case 10:
                    i = i3 * 53;
                    oh6vYeIP = defpackage.al1.r1MBDhnF.EXtogiMhuM(j, e20Var).hashCode();
                    i3 = oh6vYeIP + i;
                    break;
                case 11:
                    i = i3 * 53;
                    oh6vYeIP = defpackage.al1.r1MBDhnF.xiZrDbcSW0(j, e20Var);
                    i3 = oh6vYeIP + i;
                    break;
                case 12:
                    i = i3 * 53;
                    oh6vYeIP = defpackage.al1.r1MBDhnF.xiZrDbcSW0(j, e20Var);
                    i3 = oh6vYeIP + i;
                    break;
                case 13:
                    i = i3 * 53;
                    oh6vYeIP = defpackage.al1.r1MBDhnF.xiZrDbcSW0(j, e20Var);
                    i3 = oh6vYeIP + i;
                    break;
                case 14:
                    i = i3 * 53;
                    oh6vYeIP = defpackage.q70.oh6vYeIP(defpackage.al1.r1MBDhnF.AARZUJiTa(j, e20Var));
                    i3 = oh6vYeIP + i;
                    break;
                case 15:
                    i = i3 * 53;
                    oh6vYeIP = defpackage.al1.r1MBDhnF.xiZrDbcSW0(j, e20Var);
                    i3 = oh6vYeIP + i;
                    break;
                case 16:
                    i = i3 * 53;
                    oh6vYeIP = defpackage.q70.oh6vYeIP(defpackage.al1.r1MBDhnF.AARZUJiTa(j, e20Var));
                    i3 = oh6vYeIP + i;
                    break;
                case 17:
                    java.lang.Object EXtogiMhuM2 = defpackage.al1.r1MBDhnF.EXtogiMhuM(j, e20Var);
                    if (EXtogiMhuM2 != null) {
                        i7 = EXtogiMhuM2.hashCode();
                    }
                    i3 = (i3 * 53) + i7;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i3 * 53;
                    oh6vYeIP = defpackage.al1.r1MBDhnF.EXtogiMhuM(j, e20Var).hashCode();
                    i3 = oh6vYeIP + i;
                    break;
                case 50:
                    i = i3 * 53;
                    oh6vYeIP = defpackage.al1.r1MBDhnF.EXtogiMhuM(j, e20Var).hashCode();
                    i3 = oh6vYeIP + i;
                    break;
                case 51:
                    if (G3OKOH3wZRC(i5, i4, e20Var)) {
                        i = i3 * 53;
                        oh6vYeIP = defpackage.q70.oh6vYeIP(java.lang.Double.doubleToLongBits(((java.lang.Double) defpackage.al1.r1MBDhnF.EXtogiMhuM(j, e20Var)).doubleValue()));
                        i3 = oh6vYeIP + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (G3OKOH3wZRC(i5, i4, e20Var)) {
                        i = i3 * 53;
                        oh6vYeIP = java.lang.Float.floatToIntBits(((java.lang.Float) defpackage.al1.r1MBDhnF.EXtogiMhuM(j, e20Var)).floatValue());
                        i3 = oh6vYeIP + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (G3OKOH3wZRC(i5, i4, e20Var)) {
                        i = i3 * 53;
                        oh6vYeIP = defpackage.q70.oh6vYeIP(QQUzIjv3iOC5(j, e20Var));
                        i3 = oh6vYeIP + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (G3OKOH3wZRC(i5, i4, e20Var)) {
                        i = i3 * 53;
                        oh6vYeIP = defpackage.q70.oh6vYeIP(QQUzIjv3iOC5(j, e20Var));
                        i3 = oh6vYeIP + i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (G3OKOH3wZRC(i5, i4, e20Var)) {
                        i = i3 * 53;
                        oh6vYeIP = NHJTzaLwkd(j, e20Var);
                        i3 = oh6vYeIP + i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (G3OKOH3wZRC(i5, i4, e20Var)) {
                        i = i3 * 53;
                        oh6vYeIP = defpackage.q70.oh6vYeIP(QQUzIjv3iOC5(j, e20Var));
                        i3 = oh6vYeIP + i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (G3OKOH3wZRC(i5, i4, e20Var)) {
                        i = i3 * 53;
                        oh6vYeIP = NHJTzaLwkd(j, e20Var);
                        i3 = oh6vYeIP + i;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (G3OKOH3wZRC(i5, i4, e20Var)) {
                        i2 = i3 * 53;
                        boolean booleanValue = ((java.lang.Boolean) defpackage.al1.r1MBDhnF.EXtogiMhuM(j, e20Var)).booleanValue();
                        java.nio.charset.Charset charset2 = defpackage.q70.IHQe1A4L2xu;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (G3OKOH3wZRC(i5, i4, e20Var)) {
                        i = i3 * 53;
                        oh6vYeIP = ((java.lang.String) defpackage.al1.r1MBDhnF.EXtogiMhuM(j, e20Var)).hashCode();
                        i3 = oh6vYeIP + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (G3OKOH3wZRC(i5, i4, e20Var)) {
                        i = i3 * 53;
                        oh6vYeIP = defpackage.al1.r1MBDhnF.EXtogiMhuM(j, e20Var).hashCode();
                        i3 = oh6vYeIP + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (G3OKOH3wZRC(i5, i4, e20Var)) {
                        i = i3 * 53;
                        oh6vYeIP = defpackage.al1.r1MBDhnF.EXtogiMhuM(j, e20Var).hashCode();
                        i3 = oh6vYeIP + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (G3OKOH3wZRC(i5, i4, e20Var)) {
                        i = i3 * 53;
                        oh6vYeIP = NHJTzaLwkd(j, e20Var);
                        i3 = oh6vYeIP + i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (G3OKOH3wZRC(i5, i4, e20Var)) {
                        i = i3 * 53;
                        oh6vYeIP = NHJTzaLwkd(j, e20Var);
                        i3 = oh6vYeIP + i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (G3OKOH3wZRC(i5, i4, e20Var)) {
                        i = i3 * 53;
                        oh6vYeIP = NHJTzaLwkd(j, e20Var);
                        i3 = oh6vYeIP + i;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (G3OKOH3wZRC(i5, i4, e20Var)) {
                        i = i3 * 53;
                        oh6vYeIP = defpackage.q70.oh6vYeIP(QQUzIjv3iOC5(j, e20Var));
                        i3 = oh6vYeIP + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (G3OKOH3wZRC(i5, i4, e20Var)) {
                        i = i3 * 53;
                        oh6vYeIP = NHJTzaLwkd(j, e20Var);
                        i3 = oh6vYeIP + i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (G3OKOH3wZRC(i5, i4, e20Var)) {
                        i = i3 * 53;
                        oh6vYeIP = defpackage.q70.oh6vYeIP(QQUzIjv3iOC5(j, e20Var));
                        i3 = oh6vYeIP + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (G3OKOH3wZRC(i5, i4, e20Var)) {
                        i = i3 * 53;
                        oh6vYeIP = defpackage.al1.r1MBDhnF.EXtogiMhuM(j, e20Var).hashCode();
                        i3 = oh6vYeIP + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.JlrlGoKF.getClass();
        return e20Var.unknownFields.hashCode() + (i3 * 53);
    }

    public final void JlrlGoKF(int i) {
        if (this.oh6vYeIP[((i / 3) * 2) + 1] == null) {
            return;
        }
        defpackage.db.kd6TUFXn();
    }

    public final boolean SH1y5HwkJhh(defpackage.e20 e20Var, defpackage.e20 e20Var2, int i) {
        return SyNS6RMn(i, e20Var) == SyNS6RMn(i, e20Var2);
    }

    public final void SiPhmbmu(int i, java.lang.Object obj) {
        int i2 = this.IHQe1A4L2xu[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        defpackage.al1.DFo87pBq1E5(obj, j, (1 << (i2 >>> 20)) | defpackage.al1.r1MBDhnF.xiZrDbcSW0(j, obj));
    }

    public final boolean SyNS6RMn(int i, java.lang.Object obj) {
        int i2 = this.IHQe1A4L2xu[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int mAr5m2L7gYDP = mAr5m2L7gYDP(i);
            long j2 = mAr5m2L7gYDP & 1048575;
            switch (XZx205DYe(mAr5m2L7gYDP)) {
                case 0:
                    if (java.lang.Double.doubleToRawLongBits(defpackage.al1.r1MBDhnF.F7NU4MC0GW(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (java.lang.Float.floatToRawIntBits(defpackage.al1.r1MBDhnF.adDC3e2L(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                    if (defpackage.al1.r1MBDhnF.AARZUJiTa(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                    if (defpackage.al1.r1MBDhnF.AARZUJiTa(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                    if (defpackage.al1.r1MBDhnF.xiZrDbcSW0(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                    if (defpackage.al1.r1MBDhnF.AARZUJiTa(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (defpackage.al1.r1MBDhnF.xiZrDbcSW0(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                    return defpackage.al1.r1MBDhnF.r1MBDhnF(j2, obj);
                case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
                    java.lang.Object EXtogiMhuM = defpackage.al1.r1MBDhnF.EXtogiMhuM(j2, obj);
                    if (EXtogiMhuM instanceof java.lang.String) {
                        return !((java.lang.String) EXtogiMhuM).isEmpty();
                    }
                    if (EXtogiMhuM instanceof defpackage.ra) {
                        return !defpackage.ra.AARZUJiTa.equals(EXtogiMhuM);
                    }
                    throw new java.lang.IllegalArgumentException();
                case 9:
                    if (defpackage.al1.r1MBDhnF.EXtogiMhuM(j2, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !defpackage.ra.AARZUJiTa.equals(defpackage.al1.r1MBDhnF.EXtogiMhuM(j2, obj));
                case 11:
                    if (defpackage.al1.r1MBDhnF.xiZrDbcSW0(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (defpackage.al1.r1MBDhnF.xiZrDbcSW0(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (defpackage.al1.r1MBDhnF.xiZrDbcSW0(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (defpackage.al1.r1MBDhnF.AARZUJiTa(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (defpackage.al1.r1MBDhnF.xiZrDbcSW0(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (defpackage.al1.r1MBDhnF.AARZUJiTa(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (defpackage.al1.r1MBDhnF.EXtogiMhuM(j2, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new java.lang.IllegalArgumentException();
            }
        } else if (((1 << (i2 >>> 20)) & defpackage.al1.r1MBDhnF.xiZrDbcSW0(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final void UsuH8pd5P(java.lang.Object obj, long j, defpackage.pd pdVar, defpackage.c51 c51Var, defpackage.uu uuVar) {
        int QQUzIjv3iOC5;
        this.ez2rX8ReCYw.getClass();
        defpackage.p70 IHQe1A4L2xu = defpackage.ve0.IHQe1A4L2xu(j, obj);
        defpackage.od odVar = (defpackage.od) pdVar.F7NU4MC0GW;
        int i = pdVar.IHQe1A4L2xu;
        if ((i & 7) != 3) {
            throw defpackage.g80.oh6vYeIP();
        }
        do {
            defpackage.e20 riuEU0zW4 = c51Var.riuEU0zW4();
            pdVar.F7NU4MC0GW(riuEU0zW4, c51Var, uuVar);
            c51Var.r1MBDhnF(riuEU0zW4);
            ((defpackage.ky0) IHQe1A4L2xu).add(riuEU0zW4);
            if (odVar.F7NU4MC0GW() || pdVar.r1MBDhnF != 0) {
                return;
            } else {
                QQUzIjv3iOC5 = odVar.QQUzIjv3iOC5();
            }
        } while (QQUzIjv3iOC5 == i);
        pdVar.r1MBDhnF = QQUzIjv3iOC5;
    }

    public final java.lang.Object V7bD7b8KA(int i, int i2, java.lang.Object obj) {
        defpackage.c51 DFo87pBq1E5 = DFo87pBq1E5(i2);
        if (!G3OKOH3wZRC(i, i2, obj)) {
            return DFo87pBq1E5.riuEU0zW4();
        }
        java.lang.Object object = cnag84Bm.getObject(obj, mAr5m2L7gYDP(i2) & 1048575);
        if (QoRHpC4k(object)) {
            return object;
        }
        defpackage.e20 riuEU0zW4 = DFo87pBq1E5.riuEU0zW4();
        if (object != null) {
            DFo87pBq1E5.oh6vYeIP(riuEU0zW4, object);
        }
        return riuEU0zW4;
    }

    @Override // defpackage.c51
    public final boolean adDC3e2L(java.lang.Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.EXtogiMhuM) {
            int i7 = this.AARZUJiTa[i6];
            int[] iArr = this.IHQe1A4L2xu;
            int i8 = iArr[i7];
            int mAr5m2L7gYDP = mAr5m2L7gYDP(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = cnag84Bm.getInt(obj, i10);
                }
                i2 = i7;
                i3 = i5;
                i = i10;
            } else {
                int i12 = i5;
                i = i4;
                i2 = i7;
                i3 = i12;
            }
            if ((268435456 & mAr5m2L7gYDP) == 0 || cnag84Bm(obj, i2, i, i3, i11)) {
                int XZx205DYe = XZx205DYe(mAr5m2L7gYDP);
                if (XZx205DYe == 9 || XZx205DYe == 17) {
                    if (cnag84Bm(obj, i2, i, i3, i11)) {
                        if (!DFo87pBq1E5(i2).adDC3e2L(defpackage.al1.r1MBDhnF.EXtogiMhuM(mAr5m2L7gYDP & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                } else {
                    if (XZx205DYe != 27) {
                        if (XZx205DYe == 60 || XZx205DYe == 68) {
                            if (G3OKOH3wZRC(i8, i2, obj)) {
                                if (!DFo87pBq1E5(i2).adDC3e2L(defpackage.al1.r1MBDhnF.EXtogiMhuM(mAr5m2L7gYDP & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                            i6++;
                            i4 = i;
                            i5 = i3;
                        } else if (XZx205DYe != 49) {
                            if (XZx205DYe != 50) {
                                continue;
                            } else {
                                java.lang.Object EXtogiMhuM = defpackage.al1.r1MBDhnF.EXtogiMhuM(mAr5m2L7gYDP & 1048575, obj);
                                this.DFo87pBq1E5.getClass();
                                defpackage.hh0 hh0Var = (defpackage.hh0) EXtogiMhuM;
                                if (hh0Var.isEmpty()) {
                                    continue;
                                } else {
                                    if (((defpackage.tp1) ((defpackage.zg0) this.oh6vYeIP[(i2 / 3) * 2]).IHQe1A4L2xu.r1MBDhnF).adDC3e2L != defpackage.up1.DFo87pBq1E5) {
                                        continue;
                                    } else {
                                        defpackage.c51 c51Var = null;
                                        for (java.lang.Object obj2 : hh0Var.values()) {
                                            if (c51Var == null) {
                                                c51Var = defpackage.jy0.r1MBDhnF.IHQe1A4L2xu(obj2.getClass());
                                            }
                                            if (!c51Var.adDC3e2L(obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                            i6++;
                            i4 = i;
                            i5 = i3;
                        }
                    }
                    java.util.List list = (java.util.List) defpackage.al1.r1MBDhnF.EXtogiMhuM(mAr5m2L7gYDP & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        defpackage.c51 DFo87pBq1E5 = DFo87pBq1E5(i2);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (DFo87pBq1E5.adDC3e2L(list.get(i13))) {
                            }
                        }
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean cnag84Bm(java.lang.Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? SyNS6RMn(i, obj) : (i3 & i4) != 0;
    }

    public final void ez2rX8ReCYw(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = this.IHQe1A4L2xu[i];
        if (defpackage.al1.r1MBDhnF.EXtogiMhuM(mAr5m2L7gYDP(i) & 1048575, obj) == null) {
            return;
        }
        JlrlGoKF(i);
    }

    public final void fnWB2E7cs(int i, java.lang.Object obj, java.lang.Object obj2) {
        int[] iArr = this.IHQe1A4L2xu;
        int i2 = iArr[i];
        if (G3OKOH3wZRC(i2, i, obj2)) {
            long mAr5m2L7gYDP = mAr5m2L7gYDP(i) & 1048575;
            sun.misc.Unsafe unsafe = cnag84Bm;
            java.lang.Object object = unsafe.getObject(obj2, mAr5m2L7gYDP);
            if (object == null) {
                throw new java.lang.IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2);
            }
            defpackage.c51 DFo87pBq1E5 = DFo87pBq1E5(i);
            if (!G3OKOH3wZRC(i2, i, obj)) {
                if (QoRHpC4k(object)) {
                    defpackage.e20 riuEU0zW4 = DFo87pBq1E5.riuEU0zW4();
                    DFo87pBq1E5.oh6vYeIP(riuEU0zW4, object);
                    unsafe.putObject(obj, mAr5m2L7gYDP, riuEU0zW4);
                } else {
                    unsafe.putObject(obj, mAr5m2L7gYDP, object);
                }
                p4kuH6PDtgom(i2, i, obj);
                return;
            }
            java.lang.Object object2 = unsafe.getObject(obj, mAr5m2L7gYDP);
            if (!QoRHpC4k(object2)) {
                defpackage.e20 riuEU0zW42 = DFo87pBq1E5.riuEU0zW4();
                DFo87pBq1E5.oh6vYeIP(riuEU0zW42, object2);
                unsafe.putObject(obj, mAr5m2L7gYDP, riuEU0zW42);
                object2 = riuEU0zW42;
            }
            DFo87pBq1E5.oh6vYeIP(object2, object);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0344 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x036d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void hyxIchWRW(java.lang.Object obj, defpackage.c1NqjJifC7 c1nqjjifc7) {
        int i;
        int i2;
        defpackage.c1NqjJifC7 c1nqjjifc72;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        int SH1y5HwkJhh;
        int size;
        int riuEU0zW4;
        int IHQe1A4L2xu;
        int riuEU0zW42;
        int SH1y5HwkJhh2;
        int size2;
        int riuEU0zW43;
        defpackage.aj0 aj0Var = this;
        defpackage.c1NqjJifC7 c1nqjjifc73 = c1nqjjifc7;
        int[] iArr = aj0Var.IHQe1A4L2xu;
        int length = iArr.length;
        sun.misc.Unsafe unsafe = cnag84Bm;
        int i7 = 1048575;
        int i8 = 1048575;
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            int mAr5m2L7gYDP = aj0Var.mAr5m2L7gYDP(i9);
            int i11 = iArr[i9];
            int XZx205DYe = XZx205DYe(mAr5m2L7gYDP);
            int i12 = 1;
            if (XZx205DYe <= 17) {
                int i13 = iArr[i9 + 2];
                int i14 = i13 & i7;
                if (i14 != i8) {
                    i10 = i14 == i7 ? 0 : unsafe.getInt(obj, i14);
                    i8 = i14;
                }
                i = mAr5m2L7gYDP;
                i2 = 1 << (i13 >>> 20);
            } else {
                i = mAr5m2L7gYDP;
                i2 = 0;
            }
            long j = i & i7;
            switch (XZx205DYe) {
                case 0:
                    c1nqjjifc72 = c1nqjjifc73;
                    if (aj0Var.cnag84Bm(obj, i9, i8, i10, i2)) {
                        double F7NU4MC0GW = defpackage.al1.r1MBDhnF.F7NU4MC0GW(j, obj);
                        defpackage.rd rdVar = (defpackage.rd) c1nqjjifc72.xiZrDbcSW0;
                        rdVar.getClass();
                        rdVar.fnWB2E7cs(i11, java.lang.Double.doubleToRawLongBits(F7NU4MC0GW));
                    }
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 1:
                    c1nqjjifc72 = c1nqjjifc73;
                    if (aj0Var.cnag84Bm(obj, i9, i8, i10, i2)) {
                        float adDC3e2L = defpackage.al1.r1MBDhnF.adDC3e2L(j, obj);
                        defpackage.rd rdVar2 = (defpackage.rd) c1nqjjifc72.xiZrDbcSW0;
                        rdVar2.getClass();
                        rdVar2.kd6TUFXn(i11, java.lang.Float.floatToRawIntBits(adDC3e2L));
                    }
                    aj0Var = this;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                    c1nqjjifc72 = c1nqjjifc73;
                    if (aj0Var.cnag84Bm(obj, i9, i8, i10, i2)) {
                        ((defpackage.rd) c1nqjjifc72.xiZrDbcSW0).D2vUnMij(i11, unsafe.getLong(obj, j));
                    }
                    aj0Var = this;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                    c1nqjjifc72 = c1nqjjifc73;
                    if (aj0Var.cnag84Bm(obj, i9, i8, i10, i2)) {
                        ((defpackage.rd) c1nqjjifc72.xiZrDbcSW0).D2vUnMij(i11, unsafe.getLong(obj, j));
                    }
                    aj0Var = this;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                    c1nqjjifc72 = c1nqjjifc73;
                    if (aj0Var.cnag84Bm(obj, i9, i8, i10, i2)) {
                        ((defpackage.rd) c1nqjjifc72.xiZrDbcSW0).V7bD7b8KA(i11, unsafe.getInt(obj, j));
                    }
                    aj0Var = this;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                    c1nqjjifc72 = c1nqjjifc73;
                    if (aj0Var.cnag84Bm(obj, i9, i8, i10, i2)) {
                        ((defpackage.rd) c1nqjjifc72.xiZrDbcSW0).fnWB2E7cs(i11, unsafe.getLong(obj, j));
                    }
                    aj0Var = this;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                    c1nqjjifc72 = c1nqjjifc73;
                    if (aj0Var.cnag84Bm(obj, i9, i8, i10, i2)) {
                        ((defpackage.rd) c1nqjjifc72.xiZrDbcSW0).kd6TUFXn(i11, unsafe.getInt(obj, j));
                    }
                    aj0Var = this;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                    c1nqjjifc72 = c1nqjjifc73;
                    if (aj0Var.cnag84Bm(obj, i9, i8, i10, i2)) {
                        ((defpackage.rd) c1nqjjifc72.xiZrDbcSW0).cnag84Bm(i11, defpackage.al1.r1MBDhnF.r1MBDhnF(j, obj));
                    }
                    aj0Var = this;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
                    c1nqjjifc72 = c1nqjjifc73;
                    if (aj0Var.cnag84Bm(obj, i9, i8, i10, i2)) {
                        java.lang.Object object = unsafe.getObject(obj, j);
                        if (object instanceof java.lang.String) {
                            ((defpackage.rd) c1nqjjifc72.xiZrDbcSW0).QQUzIjv3iOC5((java.lang.String) object, i11);
                        } else {
                            ((defpackage.rd) c1nqjjifc72.xiZrDbcSW0).QoRHpC4k(i11, (defpackage.ra) object);
                        }
                    }
                    aj0Var = this;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 9:
                    c1nqjjifc72 = c1nqjjifc73;
                    if (aj0Var.cnag84Bm(obj, i9, i8, i10, i2)) {
                        ((defpackage.rd) c1nqjjifc72.xiZrDbcSW0).NHJTzaLwkd(i11, (defpackage.QQUzIjv3iOC5) unsafe.getObject(obj, j), aj0Var.DFo87pBq1E5(i9));
                    }
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 10:
                    c1nqjjifc72 = c1nqjjifc73;
                    if (aj0Var.cnag84Bm(obj, i9, i8, i10, i2)) {
                        ((defpackage.rd) c1nqjjifc72.xiZrDbcSW0).QoRHpC4k(i11, (defpackage.ra) unsafe.getObject(obj, j));
                    }
                    aj0Var = this;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 11:
                    c1nqjjifc72 = c1nqjjifc73;
                    if (aj0Var.cnag84Bm(obj, i9, i8, i10, i2)) {
                        ((defpackage.rd) c1nqjjifc72.xiZrDbcSW0).nBH8hAHy(i11, unsafe.getInt(obj, j));
                    }
                    aj0Var = this;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 12:
                    c1nqjjifc72 = c1nqjjifc73;
                    if (aj0Var.cnag84Bm(obj, i9, i8, i10, i2)) {
                        ((defpackage.rd) c1nqjjifc72.xiZrDbcSW0).V7bD7b8KA(i11, unsafe.getInt(obj, j));
                    }
                    aj0Var = this;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 13:
                    c1nqjjifc72 = c1nqjjifc73;
                    if (aj0Var.cnag84Bm(obj, i9, i8, i10, i2)) {
                        ((defpackage.rd) c1nqjjifc72.xiZrDbcSW0).kd6TUFXn(i11, unsafe.getInt(obj, j));
                    }
                    aj0Var = this;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 14:
                    c1nqjjifc72 = c1nqjjifc73;
                    if (aj0Var.cnag84Bm(obj, i9, i8, i10, i2)) {
                        ((defpackage.rd) c1nqjjifc72.xiZrDbcSW0).fnWB2E7cs(i11, unsafe.getLong(obj, j));
                    }
                    aj0Var = this;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 15:
                    c1nqjjifc72 = c1nqjjifc73;
                    if (aj0Var.cnag84Bm(obj, i9, i8, i10, i2)) {
                        int i15 = unsafe.getInt(obj, j);
                        ((defpackage.rd) c1nqjjifc72.xiZrDbcSW0).nBH8hAHy(i11, (i15 >> 31) ^ (i15 << 1));
                    }
                    aj0Var = this;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 16:
                    c1nqjjifc72 = c1nqjjifc73;
                    if (aj0Var.cnag84Bm(obj, i9, i8, i10, i2)) {
                        long j2 = unsafe.getLong(obj, j);
                        ((defpackage.rd) c1nqjjifc72.xiZrDbcSW0).D2vUnMij(i11, (j2 >> 63) ^ (j2 << 1));
                    }
                    aj0Var = this;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 17:
                    c1nqjjifc72 = c1nqjjifc73;
                    if (aj0Var.cnag84Bm(obj, i9, i8, i10, i2)) {
                        c1nqjjifc72.cnag84Bm(i11, unsafe.getObject(obj, j), aj0Var.DFo87pBq1E5(i9));
                    }
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 18:
                    i3 = i8;
                    i4 = i10;
                    c1nqjjifc72 = c1nqjjifc73;
                    defpackage.d51.SyNS6RMn(iArr[i9], (java.util.List) unsafe.getObject(obj, j), c1nqjjifc72, false);
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 19:
                    i3 = i8;
                    i4 = i10;
                    c1nqjjifc72 = c1nqjjifc73;
                    defpackage.d51.kd6TUFXn(iArr[i9], (java.util.List) unsafe.getObject(obj, j), c1nqjjifc72, false);
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 20:
                    i3 = i8;
                    i4 = i10;
                    c1nqjjifc72 = c1nqjjifc73;
                    defpackage.d51.fnWB2E7cs(iArr[i9], (java.util.List) unsafe.getObject(obj, j), c1nqjjifc72, false);
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 21:
                    i3 = i8;
                    i4 = i10;
                    c1nqjjifc72 = c1nqjjifc73;
                    defpackage.d51.QQUzIjv3iOC5(iArr[i9], (java.util.List) unsafe.getObject(obj, j), c1nqjjifc72, false);
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 22:
                    i3 = i8;
                    i4 = i10;
                    c1nqjjifc72 = c1nqjjifc73;
                    defpackage.d51.EgCjBq0SZwJ(iArr[i9], (java.util.List) unsafe.getObject(obj, j), c1nqjjifc72, false);
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 23:
                    i3 = i8;
                    i4 = i10;
                    c1nqjjifc72 = c1nqjjifc73;
                    defpackage.d51.G3OKOH3wZRC(iArr[i9], (java.util.List) unsafe.getObject(obj, j), c1nqjjifc72, false);
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 24:
                    i3 = i8;
                    i4 = i10;
                    c1nqjjifc72 = c1nqjjifc73;
                    defpackage.d51.QoRHpC4k(iArr[i9], (java.util.List) unsafe.getObject(obj, j), c1nqjjifc72, false);
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 25:
                    i3 = i8;
                    i4 = i10;
                    c1nqjjifc72 = c1nqjjifc73;
                    defpackage.d51.DFo87pBq1E5(iArr[i9], (java.util.List) unsafe.getObject(obj, j), c1nqjjifc72, false);
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 26:
                    i5 = i8;
                    i6 = i10;
                    c1nqjjifc72 = c1nqjjifc73;
                    int i16 = iArr[i9];
                    java.util.List list = (java.util.List) unsafe.getObject(obj, j);
                    java.lang.Class cls = defpackage.d51.IHQe1A4L2xu;
                    if (list != null && !list.isEmpty()) {
                        c1nqjjifc72.getClass();
                        for (int i17 = 0; i17 < list.size(); i17++) {
                            ((defpackage.rd) c1nqjjifc72.xiZrDbcSW0).QQUzIjv3iOC5((java.lang.String) list.get(i17), i16);
                        }
                    }
                    i8 = i5;
                    i10 = i6;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                    break;
                case 27:
                    i5 = i8;
                    i6 = i10;
                    c1nqjjifc72 = c1nqjjifc73;
                    int i18 = iArr[i9];
                    java.util.List list2 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.c51 DFo87pBq1E5 = aj0Var.DFo87pBq1E5(i9);
                    java.lang.Class cls2 = defpackage.d51.IHQe1A4L2xu;
                    if (list2 != null && !list2.isEmpty()) {
                        c1nqjjifc72.getClass();
                        for (int i19 = 0; i19 < list2.size(); i19++) {
                            ((defpackage.rd) c1nqjjifc72.xiZrDbcSW0).NHJTzaLwkd(i18, (defpackage.QQUzIjv3iOC5) list2.get(i19), DFo87pBq1E5);
                        }
                    }
                    i8 = i5;
                    i10 = i6;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                    break;
                case 28:
                    i5 = i8;
                    i6 = i10;
                    c1nqjjifc72 = c1nqjjifc73;
                    int i20 = iArr[i9];
                    java.util.List list3 = (java.util.List) unsafe.getObject(obj, j);
                    java.lang.Class cls3 = defpackage.d51.IHQe1A4L2xu;
                    if (list3 != null && !list3.isEmpty()) {
                        c1nqjjifc72.getClass();
                        for (int i21 = 0; i21 < list3.size(); i21++) {
                            ((defpackage.rd) c1nqjjifc72.xiZrDbcSW0).QoRHpC4k(i20, (defpackage.ra) list3.get(i21));
                        }
                    }
                    i8 = i5;
                    i10 = i6;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                    break;
                case 29:
                    i3 = i8;
                    i4 = i10;
                    c1nqjjifc72 = c1nqjjifc73;
                    z = false;
                    defpackage.d51.NHJTzaLwkd(iArr[i9], (java.util.List) unsafe.getObject(obj, j), c1nqjjifc72, false);
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 30:
                    i3 = i8;
                    i4 = i10;
                    c1nqjjifc72 = c1nqjjifc73;
                    z = false;
                    defpackage.d51.cnag84Bm(iArr[i9], (java.util.List) unsafe.getObject(obj, j), c1nqjjifc72, false);
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 31:
                    i3 = i8;
                    i4 = i10;
                    c1nqjjifc72 = c1nqjjifc73;
                    z = false;
                    defpackage.d51.kNAkVymC(iArr[i9], (java.util.List) unsafe.getObject(obj, j), c1nqjjifc72, false);
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 32:
                    i3 = i8;
                    i4 = i10;
                    c1nqjjifc72 = c1nqjjifc73;
                    z = false;
                    defpackage.d51.V7bD7b8KA(iArr[i9], (java.util.List) unsafe.getObject(obj, j), c1nqjjifc72, false);
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 33:
                    i3 = i8;
                    i4 = i10;
                    c1nqjjifc72 = c1nqjjifc73;
                    z = false;
                    defpackage.d51.PAEGRtP0bX(iArr[i9], (java.util.List) unsafe.getObject(obj, j), c1nqjjifc72, false);
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 34:
                    i3 = i8;
                    i4 = i10;
                    c1nqjjifc72 = c1nqjjifc73;
                    z = false;
                    defpackage.d51.abhbClRa(iArr[i9], (java.util.List) unsafe.getObject(obj, j), c1nqjjifc72, false);
                    i8 = i3;
                    i10 = i4;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 35:
                    i5 = i8;
                    i6 = i10;
                    c1nqjjifc72 = c1nqjjifc73;
                    defpackage.d51.SyNS6RMn(iArr[i9], (java.util.List) unsafe.getObject(obj, j), c1nqjjifc72, true);
                    i8 = i5;
                    i10 = i6;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 36:
                    i5 = i8;
                    i6 = i10;
                    c1nqjjifc72 = c1nqjjifc73;
                    defpackage.d51.kd6TUFXn(iArr[i9], (java.util.List) unsafe.getObject(obj, j), c1nqjjifc72, true);
                    i8 = i5;
                    i10 = i6;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 37:
                    i5 = i8;
                    i6 = i10;
                    c1nqjjifc72 = c1nqjjifc73;
                    defpackage.d51.fnWB2E7cs(iArr[i9], (java.util.List) unsafe.getObject(obj, j), c1nqjjifc72, true);
                    i8 = i5;
                    i10 = i6;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 38:
                    i5 = i8;
                    i6 = i10;
                    c1nqjjifc72 = c1nqjjifc73;
                    defpackage.d51.QQUzIjv3iOC5(iArr[i9], (java.util.List) unsafe.getObject(obj, j), c1nqjjifc72, true);
                    i8 = i5;
                    i10 = i6;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 39:
                    i5 = i8;
                    i6 = i10;
                    c1nqjjifc72 = c1nqjjifc73;
                    defpackage.d51.EgCjBq0SZwJ(iArr[i9], (java.util.List) unsafe.getObject(obj, j), c1nqjjifc72, true);
                    i8 = i5;
                    i10 = i6;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 40:
                    i5 = i8;
                    i6 = i10;
                    c1nqjjifc72 = c1nqjjifc73;
                    defpackage.d51.G3OKOH3wZRC(iArr[i9], (java.util.List) unsafe.getObject(obj, j), c1nqjjifc72, true);
                    i8 = i5;
                    i10 = i6;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 41:
                    i5 = i8;
                    i6 = i10;
                    c1nqjjifc72 = c1nqjjifc73;
                    defpackage.d51.QoRHpC4k(iArr[i9], (java.util.List) unsafe.getObject(obj, j), c1nqjjifc72, true);
                    i8 = i5;
                    i10 = i6;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 42:
                    i5 = i8;
                    i6 = i10;
                    c1nqjjifc72 = c1nqjjifc73;
                    defpackage.d51.DFo87pBq1E5(iArr[i9], (java.util.List) unsafe.getObject(obj, j), c1nqjjifc72, true);
                    i8 = i5;
                    i10 = i6;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 43:
                    i5 = i8;
                    i6 = i10;
                    c1nqjjifc72 = c1nqjjifc73;
                    defpackage.d51.NHJTzaLwkd(iArr[i9], (java.util.List) unsafe.getObject(obj, j), c1nqjjifc72, true);
                    i8 = i5;
                    i10 = i6;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 44:
                    i5 = i8;
                    i6 = i10;
                    c1nqjjifc72 = c1nqjjifc73;
                    defpackage.d51.cnag84Bm(iArr[i9], (java.util.List) unsafe.getObject(obj, j), c1nqjjifc72, true);
                    i8 = i5;
                    i10 = i6;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 45:
                    i5 = i8;
                    i6 = i10;
                    c1nqjjifc72 = c1nqjjifc73;
                    defpackage.d51.kNAkVymC(iArr[i9], (java.util.List) unsafe.getObject(obj, j), c1nqjjifc72, true);
                    i8 = i5;
                    i10 = i6;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 46:
                    i5 = i8;
                    i6 = i10;
                    c1nqjjifc72 = c1nqjjifc73;
                    defpackage.d51.V7bD7b8KA(iArr[i9], (java.util.List) unsafe.getObject(obj, j), c1nqjjifc72, true);
                    i8 = i5;
                    i10 = i6;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 47:
                    i5 = i8;
                    i6 = i10;
                    c1nqjjifc72 = c1nqjjifc73;
                    defpackage.d51.PAEGRtP0bX(iArr[i9], (java.util.List) unsafe.getObject(obj, j), c1nqjjifc72, true);
                    i8 = i5;
                    i10 = i6;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 48:
                    i5 = i8;
                    i6 = i10;
                    c1nqjjifc72 = c1nqjjifc73;
                    defpackage.d51.abhbClRa(iArr[i9], (java.util.List) unsafe.getObject(obj, j), c1nqjjifc72, true);
                    i8 = i5;
                    i10 = i6;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 49:
                    i5 = i8;
                    i6 = i10;
                    int i22 = iArr[i9];
                    java.util.List list4 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.c51 DFo87pBq1E52 = aj0Var.DFo87pBq1E5(i9);
                    java.lang.Class cls4 = defpackage.d51.IHQe1A4L2xu;
                    if (list4 != null && !list4.isEmpty()) {
                        c1nqjjifc7.getClass();
                        for (int i23 = 0; i23 < list4.size(); i23++) {
                            c1nqjjifc7.cnag84Bm(i22, list4.get(i23), DFo87pBq1E52);
                        }
                    }
                    c1nqjjifc72 = c1nqjjifc7;
                    i8 = i5;
                    i10 = i6;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                    break;
                case 50:
                    java.lang.Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        int i24 = 2;
                        java.lang.Object obj2 = aj0Var.oh6vYeIP[(i9 / 3) * 2];
                        aj0Var.DFo87pBq1E5.getClass();
                        defpackage.v5 v5Var = ((defpackage.zg0) obj2).IHQe1A4L2xu;
                        defpackage.tp1 tp1Var = (defpackage.tp1) v5Var.r1MBDhnF;
                        defpackage.tp1 tp1Var2 = (defpackage.tp1) v5Var.oh6vYeIP;
                        defpackage.rd rdVar3 = (defpackage.rd) c1nqjjifc73.xiZrDbcSW0;
                        rdVar3.getClass();
                        java.util.Iterator it = ((defpackage.hh0) object2).entrySet().iterator();
                        while (it.hasNext()) {
                            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                            rdVar3.UsuH8pd5P(i11, i24);
                            int i25 = i24;
                            java.lang.Object key = entry.getKey();
                            int i26 = i12;
                            java.lang.Object value = entry.getValue();
                            int i27 = defpackage.dv.r1MBDhnF;
                            int EXtogiMhuM = defpackage.rd.EXtogiMhuM(i26);
                            int i28 = i8;
                            defpackage.qp1 qp1Var = defpackage.tp1.EXtogiMhuM;
                            if (tp1Var2 == qp1Var) {
                                EXtogiMhuM *= 2;
                            }
                            int i29 = i10;
                            java.util.Iterator it2 = it;
                            switch (tp1Var2.ordinal()) {
                                case 0:
                                    ((java.lang.Double) key).getClass();
                                    SH1y5HwkJhh = 8;
                                    int i30 = SH1y5HwkJhh + EXtogiMhuM;
                                    int EXtogiMhuM2 = defpackage.rd.EXtogiMhuM(i25);
                                    if (tp1Var == qp1Var) {
                                        EXtogiMhuM2 *= 2;
                                    }
                                    switch (tp1Var.ordinal()) {
                                        case 0:
                                            ((java.lang.Double) value).getClass();
                                            SH1y5HwkJhh2 = 8;
                                            rdVar3.v5iciZok(SH1y5HwkJhh2 + EXtogiMhuM2 + i30);
                                            java.lang.Object key2 = entry.getKey();
                                            java.lang.Object value2 = entry.getValue();
                                            defpackage.dv.oh6vYeIP(rdVar3, tp1Var2, i26, key2);
                                            defpackage.dv.oh6vYeIP(rdVar3, tp1Var, i25, value2);
                                            i24 = i25;
                                            i8 = i28;
                                            i10 = i29;
                                            it = it2;
                                            i12 = 1;
                                        case 1:
                                            ((java.lang.Float) value).getClass();
                                            SH1y5HwkJhh2 = 4;
                                            rdVar3.v5iciZok(SH1y5HwkJhh2 + EXtogiMhuM2 + i30);
                                            java.lang.Object key22 = entry.getKey();
                                            java.lang.Object value22 = entry.getValue();
                                            defpackage.dv.oh6vYeIP(rdVar3, tp1Var2, i26, key22);
                                            defpackage.dv.oh6vYeIP(rdVar3, tp1Var, i25, value22);
                                            i24 = i25;
                                            i8 = i28;
                                            i10 = i29;
                                            it = it2;
                                            i12 = 1;
                                        case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                                            SH1y5HwkJhh2 = defpackage.rd.SH1y5HwkJhh(((java.lang.Long) value).longValue());
                                            rdVar3.v5iciZok(SH1y5HwkJhh2 + EXtogiMhuM2 + i30);
                                            java.lang.Object key222 = entry.getKey();
                                            java.lang.Object value222 = entry.getValue();
                                            defpackage.dv.oh6vYeIP(rdVar3, tp1Var2, i26, key222);
                                            defpackage.dv.oh6vYeIP(rdVar3, tp1Var, i25, value222);
                                            i24 = i25;
                                            i8 = i28;
                                            i10 = i29;
                                            it = it2;
                                            i12 = 1;
                                        case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                                            SH1y5HwkJhh2 = defpackage.rd.SH1y5HwkJhh(((java.lang.Long) value).longValue());
                                            rdVar3.v5iciZok(SH1y5HwkJhh2 + EXtogiMhuM2 + i30);
                                            java.lang.Object key2222 = entry.getKey();
                                            java.lang.Object value2222 = entry.getValue();
                                            defpackage.dv.oh6vYeIP(rdVar3, tp1Var2, i26, key2222);
                                            defpackage.dv.oh6vYeIP(rdVar3, tp1Var, i25, value2222);
                                            i24 = i25;
                                            i8 = i28;
                                            i10 = i29;
                                            it = it2;
                                            i12 = 1;
                                        case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                                            SH1y5HwkJhh2 = defpackage.rd.SH1y5HwkJhh(((java.lang.Integer) value).intValue());
                                            rdVar3.v5iciZok(SH1y5HwkJhh2 + EXtogiMhuM2 + i30);
                                            java.lang.Object key22222 = entry.getKey();
                                            java.lang.Object value22222 = entry.getValue();
                                            defpackage.dv.oh6vYeIP(rdVar3, tp1Var2, i26, key22222);
                                            defpackage.dv.oh6vYeIP(rdVar3, tp1Var, i25, value22222);
                                            i24 = i25;
                                            i8 = i28;
                                            i10 = i29;
                                            it = it2;
                                            i12 = 1;
                                        case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                                            ((java.lang.Long) value).getClass();
                                            SH1y5HwkJhh2 = 8;
                                            rdVar3.v5iciZok(SH1y5HwkJhh2 + EXtogiMhuM2 + i30);
                                            java.lang.Object key222222 = entry.getKey();
                                            java.lang.Object value222222 = entry.getValue();
                                            defpackage.dv.oh6vYeIP(rdVar3, tp1Var2, i26, key222222);
                                            defpackage.dv.oh6vYeIP(rdVar3, tp1Var, i25, value222222);
                                            i24 = i25;
                                            i8 = i28;
                                            i10 = i29;
                                            it = it2;
                                            i12 = 1;
                                        case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((java.lang.Integer) value).getClass();
                                            SH1y5HwkJhh2 = 4;
                                            rdVar3.v5iciZok(SH1y5HwkJhh2 + EXtogiMhuM2 + i30);
                                            java.lang.Object key2222222 = entry.getKey();
                                            java.lang.Object value2222222 = entry.getValue();
                                            defpackage.dv.oh6vYeIP(rdVar3, tp1Var2, i26, key2222222);
                                            defpackage.dv.oh6vYeIP(rdVar3, tp1Var, i25, value2222222);
                                            i24 = i25;
                                            i8 = i28;
                                            i10 = i29;
                                            it = it2;
                                            i12 = 1;
                                        case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((java.lang.Boolean) value).getClass();
                                            SH1y5HwkJhh2 = i26;
                                            rdVar3.v5iciZok(SH1y5HwkJhh2 + EXtogiMhuM2 + i30);
                                            java.lang.Object key22222222 = entry.getKey();
                                            java.lang.Object value22222222 = entry.getValue();
                                            defpackage.dv.oh6vYeIP(rdVar3, tp1Var2, i26, key22222222);
                                            defpackage.dv.oh6vYeIP(rdVar3, tp1Var, i25, value22222222);
                                            i24 = i25;
                                            i8 = i28;
                                            i10 = i29;
                                            it = it2;
                                            i12 = 1;
                                        case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
                                            if (value instanceof defpackage.ra) {
                                                size2 = ((defpackage.ra) value).size();
                                                riuEU0zW43 = defpackage.rd.riuEU0zW4(size2);
                                                SH1y5HwkJhh2 = size2 + riuEU0zW43;
                                                rdVar3.v5iciZok(SH1y5HwkJhh2 + EXtogiMhuM2 + i30);
                                                java.lang.Object key222222222 = entry.getKey();
                                                java.lang.Object value222222222 = entry.getValue();
                                                defpackage.dv.oh6vYeIP(rdVar3, tp1Var2, i26, key222222222);
                                                defpackage.dv.oh6vYeIP(rdVar3, tp1Var, i25, value222222222);
                                                i24 = i25;
                                                i8 = i28;
                                                i10 = i29;
                                                it = it2;
                                                i12 = 1;
                                            } else {
                                                SH1y5HwkJhh2 = defpackage.rd.AARZUJiTa((java.lang.String) value);
                                                rdVar3.v5iciZok(SH1y5HwkJhh2 + EXtogiMhuM2 + i30);
                                                java.lang.Object key2222222222 = entry.getKey();
                                                java.lang.Object value2222222222 = entry.getValue();
                                                defpackage.dv.oh6vYeIP(rdVar3, tp1Var2, i26, key2222222222);
                                                defpackage.dv.oh6vYeIP(rdVar3, tp1Var, i25, value2222222222);
                                                i24 = i25;
                                                i8 = i28;
                                                i10 = i29;
                                                it = it2;
                                                i12 = 1;
                                            }
                                        case 9:
                                            SH1y5HwkJhh2 = ((defpackage.e20) ((defpackage.QQUzIjv3iOC5) value)).IHQe1A4L2xu(null);
                                            rdVar3.v5iciZok(SH1y5HwkJhh2 + EXtogiMhuM2 + i30);
                                            java.lang.Object key22222222222 = entry.getKey();
                                            java.lang.Object value22222222222 = entry.getValue();
                                            defpackage.dv.oh6vYeIP(rdVar3, tp1Var2, i26, key22222222222);
                                            defpackage.dv.oh6vYeIP(rdVar3, tp1Var, i25, value22222222222);
                                            i24 = i25;
                                            i8 = i28;
                                            i10 = i29;
                                            it = it2;
                                            i12 = 1;
                                        case 10:
                                            size2 = ((defpackage.e20) ((defpackage.QQUzIjv3iOC5) value)).IHQe1A4L2xu(null);
                                            riuEU0zW43 = defpackage.rd.riuEU0zW4(size2);
                                            SH1y5HwkJhh2 = size2 + riuEU0zW43;
                                            rdVar3.v5iciZok(SH1y5HwkJhh2 + EXtogiMhuM2 + i30);
                                            java.lang.Object key222222222222 = entry.getKey();
                                            java.lang.Object value222222222222 = entry.getValue();
                                            defpackage.dv.oh6vYeIP(rdVar3, tp1Var2, i26, key222222222222);
                                            defpackage.dv.oh6vYeIP(rdVar3, tp1Var, i25, value222222222222);
                                            i24 = i25;
                                            i8 = i28;
                                            i10 = i29;
                                            it = it2;
                                            i12 = 1;
                                        case 11:
                                            if (value instanceof defpackage.ra) {
                                                size2 = ((defpackage.ra) value).size();
                                                riuEU0zW43 = defpackage.rd.riuEU0zW4(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                riuEU0zW43 = defpackage.rd.riuEU0zW4(size2);
                                            }
                                            SH1y5HwkJhh2 = size2 + riuEU0zW43;
                                            rdVar3.v5iciZok(SH1y5HwkJhh2 + EXtogiMhuM2 + i30);
                                            java.lang.Object key2222222222222 = entry.getKey();
                                            java.lang.Object value2222222222222 = entry.getValue();
                                            defpackage.dv.oh6vYeIP(rdVar3, tp1Var2, i26, key2222222222222);
                                            defpackage.dv.oh6vYeIP(rdVar3, tp1Var, i25, value2222222222222);
                                            i24 = i25;
                                            i8 = i28;
                                            i10 = i29;
                                            it = it2;
                                            i12 = 1;
                                        case 12:
                                            SH1y5HwkJhh2 = defpackage.rd.riuEU0zW4(((java.lang.Integer) value).intValue());
                                            rdVar3.v5iciZok(SH1y5HwkJhh2 + EXtogiMhuM2 + i30);
                                            java.lang.Object key22222222222222 = entry.getKey();
                                            java.lang.Object value22222222222222 = entry.getValue();
                                            defpackage.dv.oh6vYeIP(rdVar3, tp1Var2, i26, key22222222222222);
                                            defpackage.dv.oh6vYeIP(rdVar3, tp1Var, i25, value22222222222222);
                                            i24 = i25;
                                            i8 = i28;
                                            i10 = i29;
                                            it = it2;
                                            i12 = 1;
                                        case 13:
                                            SH1y5HwkJhh2 = defpackage.rd.SH1y5HwkJhh(((java.lang.Integer) value).intValue());
                                            rdVar3.v5iciZok(SH1y5HwkJhh2 + EXtogiMhuM2 + i30);
                                            java.lang.Object key222222222222222 = entry.getKey();
                                            java.lang.Object value222222222222222 = entry.getValue();
                                            defpackage.dv.oh6vYeIP(rdVar3, tp1Var2, i26, key222222222222222);
                                            defpackage.dv.oh6vYeIP(rdVar3, tp1Var, i25, value222222222222222);
                                            i24 = i25;
                                            i8 = i28;
                                            i10 = i29;
                                            it = it2;
                                            i12 = 1;
                                        case 14:
                                            ((java.lang.Integer) value).getClass();
                                            SH1y5HwkJhh2 = 4;
                                            rdVar3.v5iciZok(SH1y5HwkJhh2 + EXtogiMhuM2 + i30);
                                            java.lang.Object key2222222222222222 = entry.getKey();
                                            java.lang.Object value2222222222222222 = entry.getValue();
                                            defpackage.dv.oh6vYeIP(rdVar3, tp1Var2, i26, key2222222222222222);
                                            defpackage.dv.oh6vYeIP(rdVar3, tp1Var, i25, value2222222222222222);
                                            i24 = i25;
                                            i8 = i28;
                                            i10 = i29;
                                            it = it2;
                                            i12 = 1;
                                        case 15:
                                            ((java.lang.Long) value).getClass();
                                            SH1y5HwkJhh2 = 8;
                                            rdVar3.v5iciZok(SH1y5HwkJhh2 + EXtogiMhuM2 + i30);
                                            java.lang.Object key22222222222222222 = entry.getKey();
                                            java.lang.Object value22222222222222222 = entry.getValue();
                                            defpackage.dv.oh6vYeIP(rdVar3, tp1Var2, i26, key22222222222222222);
                                            defpackage.dv.oh6vYeIP(rdVar3, tp1Var, i25, value22222222222222222);
                                            i24 = i25;
                                            i8 = i28;
                                            i10 = i29;
                                            it = it2;
                                            i12 = 1;
                                        case 16:
                                            int intValue = ((java.lang.Integer) value).intValue();
                                            SH1y5HwkJhh2 = defpackage.rd.riuEU0zW4((intValue >> 31) ^ (intValue << 1));
                                            rdVar3.v5iciZok(SH1y5HwkJhh2 + EXtogiMhuM2 + i30);
                                            java.lang.Object key222222222222222222 = entry.getKey();
                                            java.lang.Object value222222222222222222 = entry.getValue();
                                            defpackage.dv.oh6vYeIP(rdVar3, tp1Var2, i26, key222222222222222222);
                                            defpackage.dv.oh6vYeIP(rdVar3, tp1Var, i25, value222222222222222222);
                                            i24 = i25;
                                            i8 = i28;
                                            i10 = i29;
                                            it = it2;
                                            i12 = 1;
                                        case 17:
                                            long longValue = ((java.lang.Long) value).longValue();
                                            SH1y5HwkJhh2 = defpackage.rd.SH1y5HwkJhh((longValue << i26) ^ (longValue >> 63));
                                            rdVar3.v5iciZok(SH1y5HwkJhh2 + EXtogiMhuM2 + i30);
                                            java.lang.Object key2222222222222222222 = entry.getKey();
                                            java.lang.Object value2222222222222222222 = entry.getValue();
                                            defpackage.dv.oh6vYeIP(rdVar3, tp1Var2, i26, key2222222222222222222);
                                            defpackage.dv.oh6vYeIP(rdVar3, tp1Var, i25, value2222222222222222222);
                                            i24 = i25;
                                            i8 = i28;
                                            i10 = i29;
                                            it = it2;
                                            i12 = 1;
                                        default:
                                            throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                case 1:
                                    ((java.lang.Float) key).getClass();
                                    SH1y5HwkJhh = 4;
                                    int i302 = SH1y5HwkJhh + EXtogiMhuM;
                                    int EXtogiMhuM22 = defpackage.rd.EXtogiMhuM(i25);
                                    if (tp1Var == qp1Var) {
                                    }
                                    switch (tp1Var.ordinal()) {
                                    }
                                case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                                    SH1y5HwkJhh = defpackage.rd.SH1y5HwkJhh(((java.lang.Long) key).longValue());
                                    int i3022 = SH1y5HwkJhh + EXtogiMhuM;
                                    int EXtogiMhuM222 = defpackage.rd.EXtogiMhuM(i25);
                                    if (tp1Var == qp1Var) {
                                    }
                                    switch (tp1Var.ordinal()) {
                                    }
                                case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                                    SH1y5HwkJhh = defpackage.rd.SH1y5HwkJhh(((java.lang.Long) key).longValue());
                                    int i30222 = SH1y5HwkJhh + EXtogiMhuM;
                                    int EXtogiMhuM2222 = defpackage.rd.EXtogiMhuM(i25);
                                    if (tp1Var == qp1Var) {
                                    }
                                    switch (tp1Var.ordinal()) {
                                    }
                                case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                                    SH1y5HwkJhh = defpackage.rd.SH1y5HwkJhh(((java.lang.Integer) key).intValue());
                                    int i302222 = SH1y5HwkJhh + EXtogiMhuM;
                                    int EXtogiMhuM22222 = defpackage.rd.EXtogiMhuM(i25);
                                    if (tp1Var == qp1Var) {
                                    }
                                    switch (tp1Var.ordinal()) {
                                    }
                                case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                                    ((java.lang.Long) key).getClass();
                                    SH1y5HwkJhh = 8;
                                    int i3022222 = SH1y5HwkJhh + EXtogiMhuM;
                                    int EXtogiMhuM222222 = defpackage.rd.EXtogiMhuM(i25);
                                    if (tp1Var == qp1Var) {
                                    }
                                    switch (tp1Var.ordinal()) {
                                    }
                                case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                                    ((java.lang.Integer) key).getClass();
                                    SH1y5HwkJhh = 4;
                                    int i30222222 = SH1y5HwkJhh + EXtogiMhuM;
                                    int EXtogiMhuM2222222 = defpackage.rd.EXtogiMhuM(i25);
                                    if (tp1Var == qp1Var) {
                                    }
                                    switch (tp1Var.ordinal()) {
                                    }
                                case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                                    ((java.lang.Boolean) key).getClass();
                                    SH1y5HwkJhh = i26;
                                    int i302222222 = SH1y5HwkJhh + EXtogiMhuM;
                                    int EXtogiMhuM22222222 = defpackage.rd.EXtogiMhuM(i25);
                                    if (tp1Var == qp1Var) {
                                    }
                                    switch (tp1Var.ordinal()) {
                                    }
                                case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
                                    if (key instanceof defpackage.ra) {
                                        size = ((defpackage.ra) key).size();
                                        riuEU0zW4 = defpackage.rd.riuEU0zW4(size);
                                        SH1y5HwkJhh = size + riuEU0zW4;
                                        int i3022222222 = SH1y5HwkJhh + EXtogiMhuM;
                                        int EXtogiMhuM222222222 = defpackage.rd.EXtogiMhuM(i25);
                                        if (tp1Var == qp1Var) {
                                        }
                                        switch (tp1Var.ordinal()) {
                                        }
                                    } else {
                                        SH1y5HwkJhh = defpackage.rd.AARZUJiTa((java.lang.String) key);
                                        int i30222222222 = SH1y5HwkJhh + EXtogiMhuM;
                                        int EXtogiMhuM2222222222 = defpackage.rd.EXtogiMhuM(i25);
                                        if (tp1Var == qp1Var) {
                                        }
                                        switch (tp1Var.ordinal()) {
                                        }
                                    }
                                case 9:
                                    IHQe1A4L2xu = ((defpackage.e20) ((defpackage.QQUzIjv3iOC5) key)).IHQe1A4L2xu(null);
                                    SH1y5HwkJhh = IHQe1A4L2xu;
                                    int i302222222222 = SH1y5HwkJhh + EXtogiMhuM;
                                    int EXtogiMhuM22222222222 = defpackage.rd.EXtogiMhuM(i25);
                                    if (tp1Var == qp1Var) {
                                    }
                                    switch (tp1Var.ordinal()) {
                                    }
                                case 10:
                                    int IHQe1A4L2xu2 = ((defpackage.e20) ((defpackage.QQUzIjv3iOC5) key)).IHQe1A4L2xu(null);
                                    IHQe1A4L2xu = IHQe1A4L2xu2 + defpackage.rd.riuEU0zW4(IHQe1A4L2xu2);
                                    SH1y5HwkJhh = IHQe1A4L2xu;
                                    int i3022222222222 = SH1y5HwkJhh + EXtogiMhuM;
                                    int EXtogiMhuM222222222222 = defpackage.rd.EXtogiMhuM(i25);
                                    if (tp1Var == qp1Var) {
                                    }
                                    switch (tp1Var.ordinal()) {
                                    }
                                case 11:
                                    if (key instanceof defpackage.ra) {
                                        size = ((defpackage.ra) key).size();
                                        riuEU0zW4 = defpackage.rd.riuEU0zW4(size);
                                    } else {
                                        size = ((byte[]) key).length;
                                        riuEU0zW4 = defpackage.rd.riuEU0zW4(size);
                                    }
                                    SH1y5HwkJhh = size + riuEU0zW4;
                                    int i30222222222222 = SH1y5HwkJhh + EXtogiMhuM;
                                    int EXtogiMhuM2222222222222 = defpackage.rd.EXtogiMhuM(i25);
                                    if (tp1Var == qp1Var) {
                                    }
                                    switch (tp1Var.ordinal()) {
                                    }
                                case 12:
                                    SH1y5HwkJhh = defpackage.rd.riuEU0zW4(((java.lang.Integer) key).intValue());
                                    int i302222222222222 = SH1y5HwkJhh + EXtogiMhuM;
                                    int EXtogiMhuM22222222222222 = defpackage.rd.EXtogiMhuM(i25);
                                    if (tp1Var == qp1Var) {
                                    }
                                    switch (tp1Var.ordinal()) {
                                    }
                                case 13:
                                    SH1y5HwkJhh = defpackage.rd.SH1y5HwkJhh(((java.lang.Integer) key).intValue());
                                    int i3022222222222222 = SH1y5HwkJhh + EXtogiMhuM;
                                    int EXtogiMhuM222222222222222 = defpackage.rd.EXtogiMhuM(i25);
                                    if (tp1Var == qp1Var) {
                                    }
                                    switch (tp1Var.ordinal()) {
                                    }
                                case 14:
                                    ((java.lang.Integer) key).getClass();
                                    SH1y5HwkJhh = 4;
                                    int i30222222222222222 = SH1y5HwkJhh + EXtogiMhuM;
                                    int EXtogiMhuM2222222222222222 = defpackage.rd.EXtogiMhuM(i25);
                                    if (tp1Var == qp1Var) {
                                    }
                                    switch (tp1Var.ordinal()) {
                                    }
                                case 15:
                                    ((java.lang.Long) key).getClass();
                                    SH1y5HwkJhh = 8;
                                    int i302222222222222222 = SH1y5HwkJhh + EXtogiMhuM;
                                    int EXtogiMhuM22222222222222222 = defpackage.rd.EXtogiMhuM(i25);
                                    if (tp1Var == qp1Var) {
                                    }
                                    switch (tp1Var.ordinal()) {
                                    }
                                case 16:
                                    int intValue2 = ((java.lang.Integer) key).intValue();
                                    riuEU0zW42 = defpackage.rd.riuEU0zW4((intValue2 << 1) ^ (intValue2 >> 31));
                                    SH1y5HwkJhh = riuEU0zW42;
                                    int i3022222222222222222 = SH1y5HwkJhh + EXtogiMhuM;
                                    int EXtogiMhuM222222222222222222 = defpackage.rd.EXtogiMhuM(i25);
                                    if (tp1Var == qp1Var) {
                                    }
                                    switch (tp1Var.ordinal()) {
                                    }
                                case 17:
                                    long longValue2 = ((java.lang.Long) key).longValue();
                                    riuEU0zW42 = defpackage.rd.SH1y5HwkJhh((longValue2 << i26) ^ (longValue2 >> 63));
                                    SH1y5HwkJhh = riuEU0zW42;
                                    int i30222222222222222222 = SH1y5HwkJhh + EXtogiMhuM;
                                    int EXtogiMhuM2222222222222222222 = defpackage.rd.EXtogiMhuM(i25);
                                    if (tp1Var == qp1Var) {
                                    }
                                    switch (tp1Var.ordinal()) {
                                    }
                                default:
                                    throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                            }
                        }
                    }
                    i5 = i8;
                    i6 = i10;
                    c1nqjjifc72 = c1nqjjifc7;
                    i8 = i5;
                    i10 = i6;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 51:
                    if (aj0Var.G3OKOH3wZRC(i11, i9, obj)) {
                        double doubleValue = ((java.lang.Double) defpackage.al1.r1MBDhnF.EXtogiMhuM(j, obj)).doubleValue();
                        defpackage.rd rdVar4 = (defpackage.rd) c1nqjjifc73.xiZrDbcSW0;
                        rdVar4.getClass();
                        rdVar4.fnWB2E7cs(i11, java.lang.Double.doubleToRawLongBits(doubleValue));
                    }
                    c1nqjjifc72 = c1nqjjifc73;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 52:
                    if (aj0Var.G3OKOH3wZRC(i11, i9, obj)) {
                        float floatValue = ((java.lang.Float) defpackage.al1.r1MBDhnF.EXtogiMhuM(j, obj)).floatValue();
                        defpackage.rd rdVar5 = (defpackage.rd) c1nqjjifc73.xiZrDbcSW0;
                        rdVar5.getClass();
                        rdVar5.kd6TUFXn(i11, java.lang.Float.floatToRawIntBits(floatValue));
                    }
                    c1nqjjifc72 = c1nqjjifc73;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 53:
                    if (aj0Var.G3OKOH3wZRC(i11, i9, obj)) {
                        ((defpackage.rd) c1nqjjifc73.xiZrDbcSW0).D2vUnMij(i11, QQUzIjv3iOC5(j, obj));
                    }
                    c1nqjjifc72 = c1nqjjifc73;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 54:
                    if (aj0Var.G3OKOH3wZRC(i11, i9, obj)) {
                        ((defpackage.rd) c1nqjjifc73.xiZrDbcSW0).D2vUnMij(i11, QQUzIjv3iOC5(j, obj));
                    }
                    c1nqjjifc72 = c1nqjjifc73;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 55:
                    if (aj0Var.G3OKOH3wZRC(i11, i9, obj)) {
                        ((defpackage.rd) c1nqjjifc73.xiZrDbcSW0).V7bD7b8KA(i11, NHJTzaLwkd(j, obj));
                    }
                    c1nqjjifc72 = c1nqjjifc73;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 56:
                    if (aj0Var.G3OKOH3wZRC(i11, i9, obj)) {
                        ((defpackage.rd) c1nqjjifc73.xiZrDbcSW0).fnWB2E7cs(i11, QQUzIjv3iOC5(j, obj));
                    }
                    c1nqjjifc72 = c1nqjjifc73;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 57:
                    if (aj0Var.G3OKOH3wZRC(i11, i9, obj)) {
                        ((defpackage.rd) c1nqjjifc73.xiZrDbcSW0).kd6TUFXn(i11, NHJTzaLwkd(j, obj));
                    }
                    c1nqjjifc72 = c1nqjjifc73;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 58:
                    if (aj0Var.G3OKOH3wZRC(i11, i9, obj)) {
                        ((defpackage.rd) c1nqjjifc73.xiZrDbcSW0).cnag84Bm(i11, ((java.lang.Boolean) defpackage.al1.r1MBDhnF.EXtogiMhuM(j, obj)).booleanValue());
                    }
                    c1nqjjifc72 = c1nqjjifc73;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 59:
                    if (aj0Var.G3OKOH3wZRC(i11, i9, obj)) {
                        java.lang.Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof java.lang.String) {
                            ((defpackage.rd) c1nqjjifc73.xiZrDbcSW0).QQUzIjv3iOC5((java.lang.String) object3, i11);
                        } else {
                            ((defpackage.rd) c1nqjjifc73.xiZrDbcSW0).QoRHpC4k(i11, (defpackage.ra) object3);
                        }
                    }
                    c1nqjjifc72 = c1nqjjifc73;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 60:
                    if (aj0Var.G3OKOH3wZRC(i11, i9, obj)) {
                        ((defpackage.rd) c1nqjjifc73.xiZrDbcSW0).NHJTzaLwkd(i11, (defpackage.QQUzIjv3iOC5) unsafe.getObject(obj, j), aj0Var.DFo87pBq1E5(i9));
                    }
                    c1nqjjifc72 = c1nqjjifc73;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 61:
                    if (aj0Var.G3OKOH3wZRC(i11, i9, obj)) {
                        ((defpackage.rd) c1nqjjifc73.xiZrDbcSW0).QoRHpC4k(i11, (defpackage.ra) unsafe.getObject(obj, j));
                    }
                    c1nqjjifc72 = c1nqjjifc73;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 62:
                    if (aj0Var.G3OKOH3wZRC(i11, i9, obj)) {
                        ((defpackage.rd) c1nqjjifc73.xiZrDbcSW0).nBH8hAHy(i11, NHJTzaLwkd(j, obj));
                    }
                    c1nqjjifc72 = c1nqjjifc73;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 63:
                    if (aj0Var.G3OKOH3wZRC(i11, i9, obj)) {
                        ((defpackage.rd) c1nqjjifc73.xiZrDbcSW0).V7bD7b8KA(i11, NHJTzaLwkd(j, obj));
                    }
                    c1nqjjifc72 = c1nqjjifc73;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 64:
                    if (aj0Var.G3OKOH3wZRC(i11, i9, obj)) {
                        ((defpackage.rd) c1nqjjifc73.xiZrDbcSW0).kd6TUFXn(i11, NHJTzaLwkd(j, obj));
                    }
                    c1nqjjifc72 = c1nqjjifc73;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 65:
                    if (aj0Var.G3OKOH3wZRC(i11, i9, obj)) {
                        ((defpackage.rd) c1nqjjifc73.xiZrDbcSW0).fnWB2E7cs(i11, QQUzIjv3iOC5(j, obj));
                    }
                    c1nqjjifc72 = c1nqjjifc73;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 66:
                    if (aj0Var.G3OKOH3wZRC(i11, i9, obj)) {
                        int NHJTzaLwkd = NHJTzaLwkd(j, obj);
                        ((defpackage.rd) c1nqjjifc73.xiZrDbcSW0).nBH8hAHy(i11, (NHJTzaLwkd >> 31) ^ (NHJTzaLwkd << 1));
                    }
                    c1nqjjifc72 = c1nqjjifc73;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 67:
                    if (aj0Var.G3OKOH3wZRC(i11, i9, obj)) {
                        long QQUzIjv3iOC5 = QQUzIjv3iOC5(j, obj);
                        ((defpackage.rd) c1nqjjifc73.xiZrDbcSW0).D2vUnMij(i11, (QQUzIjv3iOC5 << 1) ^ (QQUzIjv3iOC5 >> 63));
                    }
                    c1nqjjifc72 = c1nqjjifc73;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                case 68:
                    if (aj0Var.G3OKOH3wZRC(i11, i9, obj)) {
                        c1nqjjifc73.cnag84Bm(i11, unsafe.getObject(obj, j), aj0Var.DFo87pBq1E5(i9));
                    }
                    c1nqjjifc72 = c1nqjjifc73;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
                default:
                    c1nqjjifc72 = c1nqjjifc73;
                    i9 += 3;
                    c1nqjjifc73 = c1nqjjifc72;
                    i7 = 1048575;
            }
        }
        aj0Var.JlrlGoKF.getClass();
        ((defpackage.e20) obj).unknownFields.F7NU4MC0GW(c1nqjjifc73);
    }

    public final java.lang.Object kNAkVymC(int i, java.lang.Object obj) {
        defpackage.c51 DFo87pBq1E5 = DFo87pBq1E5(i);
        long mAr5m2L7gYDP = mAr5m2L7gYDP(i) & 1048575;
        if (!SyNS6RMn(i, obj)) {
            return DFo87pBq1E5.riuEU0zW4();
        }
        java.lang.Object object = cnag84Bm.getObject(obj, mAr5m2L7gYDP);
        if (QoRHpC4k(object)) {
            return object;
        }
        defpackage.e20 riuEU0zW4 = DFo87pBq1E5.riuEU0zW4();
        if (object != null) {
            DFo87pBq1E5.oh6vYeIP(riuEU0zW4, object);
        }
        return riuEU0zW4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009f, code lost:
    
        r9.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a2, code lost:
    
        r10.riuEU0zW4(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a5, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void kd6TUFXn(java.lang.Object obj, int i, java.lang.Object obj2, defpackage.uu uuVar, defpackage.pd pdVar) {
        long mAr5m2L7gYDP = mAr5m2L7gYDP(i) & 1048575;
        java.lang.Object EXtogiMhuM = defpackage.al1.r1MBDhnF.EXtogiMhuM(mAr5m2L7gYDP, obj);
        defpackage.ih0 ih0Var = this.DFo87pBq1E5;
        if (EXtogiMhuM == null) {
            ih0Var.getClass();
            EXtogiMhuM = defpackage.hh0.xiZrDbcSW0.oh6vYeIP();
            defpackage.al1.cnag84Bm(obj, mAr5m2L7gYDP, EXtogiMhuM);
        } else {
            ih0Var.getClass();
            if (!((defpackage.hh0) EXtogiMhuM).adDC3e2L) {
                defpackage.hh0 oh6vYeIP = defpackage.hh0.xiZrDbcSW0.oh6vYeIP();
                defpackage.ih0.IHQe1A4L2xu(oh6vYeIP, EXtogiMhuM);
                defpackage.al1.cnag84Bm(obj, mAr5m2L7gYDP, oh6vYeIP);
                EXtogiMhuM = oh6vYeIP;
            }
        }
        ih0Var.getClass();
        defpackage.hh0 hh0Var = (defpackage.hh0) EXtogiMhuM;
        defpackage.v5 v5Var = ((defpackage.zg0) obj2).IHQe1A4L2xu;
        pdVar.NHJTzaLwkd(2);
        defpackage.od odVar = (defpackage.od) pdVar.F7NU4MC0GW;
        int SH1y5HwkJhh = odVar.SH1y5HwkJhh(odVar.C0U8sNJm());
        java.lang.Object obj3 = v5Var.F7NU4MC0GW;
        java.lang.Object obj4 = "";
        java.lang.Object obj5 = obj3;
        while (true) {
            try {
                int IHQe1A4L2xu = pdVar.IHQe1A4L2xu();
                if (IHQe1A4L2xu == Integer.MAX_VALUE || odVar.F7NU4MC0GW()) {
                    break;
                }
                if (IHQe1A4L2xu == 1) {
                    obj4 = pdVar.ez2rX8ReCYw((defpackage.tp1) v5Var.oh6vYeIP, null, null);
                } else if (IHQe1A4L2xu != 2) {
                    try {
                        if (!pdVar.QQUzIjv3iOC5()) {
                            throw new defpackage.g80("Unable to parse map entry.");
                        }
                    } catch (defpackage.f80 unused) {
                        if (!pdVar.QQUzIjv3iOC5()) {
                            throw new defpackage.g80("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj5 = pdVar.ez2rX8ReCYw((defpackage.tp1) v5Var.r1MBDhnF, obj3.getClass(), uuVar);
                }
            } catch (java.lang.Throwable th) {
                odVar.riuEU0zW4(SH1y5HwkJhh);
                throw th;
            }
        }
    }

    public final int mAr5m2L7gYDP(int i) {
        return this.IHQe1A4L2xu[i + 1];
    }

    public final void nBH8hAHy(java.lang.Object obj, int i, defpackage.pd pdVar, defpackage.c51 c51Var, defpackage.uu uuVar) {
        int QQUzIjv3iOC5;
        this.ez2rX8ReCYw.getClass();
        defpackage.p70 IHQe1A4L2xu = defpackage.ve0.IHQe1A4L2xu(i & 1048575, obj);
        defpackage.od odVar = (defpackage.od) pdVar.F7NU4MC0GW;
        int i2 = pdVar.IHQe1A4L2xu;
        if ((i2 & 7) != 2) {
            throw defpackage.g80.oh6vYeIP();
        }
        do {
            defpackage.e20 riuEU0zW4 = c51Var.riuEU0zW4();
            pdVar.adDC3e2L(riuEU0zW4, c51Var, uuVar);
            c51Var.r1MBDhnF(riuEU0zW4);
            ((defpackage.ky0) IHQe1A4L2xu).add(riuEU0zW4);
            if (odVar.F7NU4MC0GW() || pdVar.r1MBDhnF != 0) {
                return;
            } else {
                QQUzIjv3iOC5 = odVar.QQUzIjv3iOC5();
            }
        } while (QQUzIjv3iOC5 == i2);
        pdVar.r1MBDhnF = QQUzIjv3iOC5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.c51
    public final void oh6vYeIP(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3;
        if (!QoRHpC4k(obj)) {
            throw new java.lang.IllegalArgumentException("Mutating immutable message: " + obj);
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.IHQe1A4L2xu;
            if (i >= iArr.length) {
                defpackage.d51.ez2rX8ReCYw(this.JlrlGoKF, obj, obj2);
                return;
            }
            int mAr5m2L7gYDP = mAr5m2L7gYDP(i);
            long j = 1048575 & mAr5m2L7gYDP;
            int i2 = iArr[i];
            switch (XZx205DYe(mAr5m2L7gYDP)) {
                case 0:
                    if (SyNS6RMn(i, obj2)) {
                        defpackage.zk1 zk1Var = defpackage.al1.r1MBDhnF;
                        obj3 = obj;
                        zk1Var.JlrlGoKF(obj3, j, zk1Var.F7NU4MC0GW(j, obj2));
                        SiPhmbmu(i, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (SyNS6RMn(i, obj2)) {
                        defpackage.zk1 zk1Var2 = defpackage.al1.r1MBDhnF;
                        zk1Var2.DFo87pBq1E5(obj, j, zk1Var2.adDC3e2L(j, obj2));
                        SiPhmbmu(i, obj);
                    }
                    obj3 = obj;
                    break;
                case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                    if (SyNS6RMn(i, obj2)) {
                        defpackage.al1.SyNS6RMn(obj, j, defpackage.al1.r1MBDhnF.AARZUJiTa(j, obj2));
                        SiPhmbmu(i, obj);
                    }
                    obj3 = obj;
                    break;
                case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                    if (SyNS6RMn(i, obj2)) {
                        defpackage.al1.SyNS6RMn(obj, j, defpackage.al1.r1MBDhnF.AARZUJiTa(j, obj2));
                        SiPhmbmu(i, obj);
                    }
                    obj3 = obj;
                    break;
                case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                    if (SyNS6RMn(i, obj2)) {
                        defpackage.al1.DFo87pBq1E5(obj, j, defpackage.al1.r1MBDhnF.xiZrDbcSW0(j, obj2));
                        SiPhmbmu(i, obj);
                    }
                    obj3 = obj;
                    break;
                case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                    if (SyNS6RMn(i, obj2)) {
                        defpackage.al1.SyNS6RMn(obj, j, defpackage.al1.r1MBDhnF.AARZUJiTa(j, obj2));
                        SiPhmbmu(i, obj);
                    }
                    obj3 = obj;
                    break;
                case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (SyNS6RMn(i, obj2)) {
                        defpackage.al1.DFo87pBq1E5(obj, j, defpackage.al1.r1MBDhnF.xiZrDbcSW0(j, obj2));
                        SiPhmbmu(i, obj);
                    }
                    obj3 = obj;
                    break;
                case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (SyNS6RMn(i, obj2)) {
                        defpackage.zk1 zk1Var3 = defpackage.al1.r1MBDhnF;
                        zk1Var3.SH1y5HwkJhh(obj, j, zk1Var3.r1MBDhnF(j, obj2));
                        SiPhmbmu(i, obj);
                    }
                    obj3 = obj;
                    break;
                case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
                    if (SyNS6RMn(i, obj2)) {
                        defpackage.al1.cnag84Bm(obj, j, defpackage.al1.r1MBDhnF.EXtogiMhuM(j, obj2));
                        SiPhmbmu(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    EgCjBq0SZwJ(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (SyNS6RMn(i, obj2)) {
                        defpackage.al1.cnag84Bm(obj, j, defpackage.al1.r1MBDhnF.EXtogiMhuM(j, obj2));
                        SiPhmbmu(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (SyNS6RMn(i, obj2)) {
                        defpackage.al1.DFo87pBq1E5(obj, j, defpackage.al1.r1MBDhnF.xiZrDbcSW0(j, obj2));
                        SiPhmbmu(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (SyNS6RMn(i, obj2)) {
                        defpackage.al1.DFo87pBq1E5(obj, j, defpackage.al1.r1MBDhnF.xiZrDbcSW0(j, obj2));
                        SiPhmbmu(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (SyNS6RMn(i, obj2)) {
                        defpackage.al1.DFo87pBq1E5(obj, j, defpackage.al1.r1MBDhnF.xiZrDbcSW0(j, obj2));
                        SiPhmbmu(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (SyNS6RMn(i, obj2)) {
                        defpackage.al1.SyNS6RMn(obj, j, defpackage.al1.r1MBDhnF.AARZUJiTa(j, obj2));
                        SiPhmbmu(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (SyNS6RMn(i, obj2)) {
                        defpackage.al1.DFo87pBq1E5(obj, j, defpackage.al1.r1MBDhnF.xiZrDbcSW0(j, obj2));
                        SiPhmbmu(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (SyNS6RMn(i, obj2)) {
                        defpackage.al1.SyNS6RMn(obj, j, defpackage.al1.r1MBDhnF.AARZUJiTa(j, obj2));
                        SiPhmbmu(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    EgCjBq0SZwJ(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.ez2rX8ReCYw.getClass();
                    defpackage.zk1 zk1Var4 = defpackage.al1.r1MBDhnF;
                    defpackage.p70 p70Var = (defpackage.p70) zk1Var4.EXtogiMhuM(j, obj);
                    defpackage.p70 p70Var2 = (defpackage.p70) zk1Var4.EXtogiMhuM(j, obj2);
                    int i3 = ((defpackage.ky0) p70Var).AARZUJiTa;
                    int i4 = ((defpackage.ky0) p70Var2).AARZUJiTa;
                    if (i3 > 0 && i4 > 0) {
                        if (!((defpackage.ky0) p70Var).adDC3e2L) {
                            p70Var = ((defpackage.ky0) p70Var).r1MBDhnF(i4 + i3);
                        }
                        ((defpackage.ky0) p70Var).addAll(p70Var2);
                    }
                    if (i3 > 0) {
                        p70Var2 = p70Var;
                    }
                    defpackage.al1.cnag84Bm(obj, j, p70Var2);
                    obj3 = obj;
                    break;
                case 50:
                    java.lang.Class cls = defpackage.d51.IHQe1A4L2xu;
                    defpackage.zk1 zk1Var5 = defpackage.al1.r1MBDhnF;
                    java.lang.Object EXtogiMhuM = zk1Var5.EXtogiMhuM(j, obj);
                    java.lang.Object EXtogiMhuM2 = zk1Var5.EXtogiMhuM(j, obj2);
                    this.DFo87pBq1E5.getClass();
                    defpackage.al1.cnag84Bm(obj, j, defpackage.ih0.IHQe1A4L2xu(EXtogiMhuM, EXtogiMhuM2));
                    obj3 = obj;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (G3OKOH3wZRC(i2, i, obj2)) {
                        defpackage.al1.cnag84Bm(obj, j, defpackage.al1.r1MBDhnF.EXtogiMhuM(j, obj2));
                        p4kuH6PDtgom(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    fnWB2E7cs(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (G3OKOH3wZRC(i2, i, obj2)) {
                        defpackage.al1.cnag84Bm(obj, j, defpackage.al1.r1MBDhnF.EXtogiMhuM(j, obj2));
                        p4kuH6PDtgom(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    fnWB2E7cs(i, obj, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i += 3;
            obj = obj3;
        }
    }

    public final void p4kuH6PDtgom(int i, int i2, java.lang.Object obj) {
        defpackage.al1.DFo87pBq1E5(obj, this.IHQe1A4L2xu[i2 + 2] & 1048575, i);
    }

    @Override // defpackage.c51
    public final void r1MBDhnF(java.lang.Object obj) {
        if (QoRHpC4k(obj)) {
            if (obj instanceof defpackage.e20) {
                defpackage.e20 e20Var = (defpackage.e20) obj;
                e20Var.ez2rX8ReCYw(Integer.MAX_VALUE);
                e20Var.memoizedHashCode = 0;
                e20Var.EXtogiMhuM();
            }
            int[] iArr = this.IHQe1A4L2xu;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int mAr5m2L7gYDP = mAr5m2L7gYDP(i);
                long j = 1048575 & mAr5m2L7gYDP;
                int XZx205DYe = XZx205DYe(mAr5m2L7gYDP);
                if (XZx205DYe != 9) {
                    if (XZx205DYe != 60 && XZx205DYe != 68) {
                        switch (XZx205DYe) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.ez2rX8ReCYw.getClass();
                                defpackage.ky0 ky0Var = (defpackage.ky0) ((defpackage.p70) defpackage.al1.r1MBDhnF.EXtogiMhuM(j, obj));
                                if (ky0Var.adDC3e2L) {
                                    ky0Var.adDC3e2L = false;
                                    break;
                                } else {
                                    break;
                                }
                            case 50:
                                sun.misc.Unsafe unsafe = cnag84Bm;
                                java.lang.Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.DFo87pBq1E5.getClass();
                                    ((defpackage.hh0) object).adDC3e2L = false;
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (G3OKOH3wZRC(iArr[i], i, obj)) {
                        DFo87pBq1E5(i).r1MBDhnF(cnag84Bm.getObject(obj, j));
                    }
                }
                if (SyNS6RMn(i, obj)) {
                    DFo87pBq1E5(i).r1MBDhnF(cnag84Bm.getObject(obj, j));
                }
            }
            this.JlrlGoKF.getClass();
            defpackage.pk1 pk1Var = ((defpackage.e20) obj).unknownFields;
            if (pk1Var.adDC3e2L) {
                pk1Var.adDC3e2L = false;
            }
        }
    }

    @Override // defpackage.c51
    public final defpackage.e20 riuEU0zW4() {
        this.SH1y5HwkJhh.getClass();
        return ((defpackage.e20) this.adDC3e2L).riuEU0zW4();
    }

    public final void v5iciZok(int i, defpackage.pd pdVar, java.lang.Object obj) {
        if ((536870912 & i) != 0) {
            pdVar.NHJTzaLwkd(2);
            defpackage.al1.cnag84Bm(obj, i & 1048575, ((defpackage.od) pdVar.F7NU4MC0GW).NHJTzaLwkd());
        } else if (!this.xiZrDbcSW0) {
            defpackage.al1.cnag84Bm(obj, i & 1048575, pdVar.AARZUJiTa());
        } else {
            pdVar.NHJTzaLwkd(2);
            defpackage.al1.cnag84Bm(obj, i & 1048575, ((defpackage.od) pdVar.F7NU4MC0GW).abhbClRa());
        }
    }

    public final void wll2JLbTBC2(java.lang.Object obj, int i, int i2, defpackage.QQUzIjv3iOC5 qQUzIjv3iOC5) {
        cnag84Bm.putObject(obj, mAr5m2L7gYDP(i2) & 1048575, qQUzIjv3iOC5);
        p4kuH6PDtgom(i, i2, obj);
    }

    @Override // defpackage.c51
    public final void xiZrDbcSW0(java.lang.Object obj, defpackage.c1NqjJifC7 c1nqjjifc7) {
        c1nqjjifc7.getClass();
        hyxIchWRW(obj, c1nqjjifc7);
    }

    public final void yIx6ChFVk(java.lang.Object obj, int i, defpackage.QQUzIjv3iOC5 qQUzIjv3iOC5) {
        cnag84Bm.putObject(obj, mAr5m2L7gYDP(i) & 1048575, qQUzIjv3iOC5);
        SiPhmbmu(i, obj);
    }
}
