package defpackage;

/* loaded from: classes.dex */
public final class v5 {
    public static volatile defpackage.v5 adDC3e2L;
    public static final java.lang.Object xiZrDbcSW0 = new java.lang.Object();
    public java.lang.Object F7NU4MC0GW;
    public final /* synthetic */ int IHQe1A4L2xu;
    public java.lang.Object oh6vYeIP;
    public java.lang.Object r1MBDhnF;

    public v5(int i) {
        this.IHQe1A4L2xu = i;
        switch (i) {
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                this.oh6vYeIP = new defpackage.c1NqjJifC7(10);
                this.r1MBDhnF = new defpackage.c1NqjJifC7(10);
                this.F7NU4MC0GW = new defpackage.c1NqjJifC7(10);
                break;
            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                this.oh6vYeIP = new defpackage.nl0();
                break;
            case 12:
                long[] jArr = defpackage.z41.IHQe1A4L2xu;
                this.oh6vYeIP = new defpackage.nl0();
                break;
            case 14:
                this.oh6vYeIP = new java.util.concurrent.atomic.AtomicReference(defpackage.s21.riuEU0zW4);
                this.r1MBDhnF = new java.lang.Object();
                break;
            case 16:
                this.oh6vYeIP = new java.util.WeakHashMap();
                this.r1MBDhnF = new java.util.WeakHashMap();
                this.F7NU4MC0GW = new java.util.WeakHashMap();
                break;
            default:
                this.F7NU4MC0GW = new defpackage.c41(9);
                break;
        }
    }

    public static defpackage.v5 AARZUJiTa(android.content.Context context) {
        if (adDC3e2L == null) {
            synchronized (xiZrDbcSW0) {
                try {
                    if (adDC3e2L == null) {
                        adDC3e2L = new defpackage.v5(context);
                    }
                } finally {
                }
            }
        }
        return adDC3e2L;
    }

    public defpackage.v5 DFo87pBq1E5() {
        java.lang.CharSequence charSequence = (java.lang.CharSequence) this.r1MBDhnF;
        java.util.regex.Matcher matcher = (java.util.regex.Matcher) this.oh6vYeIP;
        int end = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        if (end > charSequence.length()) {
            return null;
        }
        java.util.regex.Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        if (matcher2.find(end)) {
            return new defpackage.v5(matcher2, charSequence);
        }
        return null;
    }

    public defpackage.d70 EXtogiMhuM() {
        java.util.regex.Matcher matcher = (java.util.regex.Matcher) this.oh6vYeIP;
        return defpackage.x80.QPwENk36pDC(matcher.start(), matcher.end());
    }

    public void EgCjBq0SZwJ(long j) {
        ((defpackage.jb) this.F7NU4MC0GW).adDC3e2L.F7NU4MC0GW = j;
    }

    public java.lang.Object F7NU4MC0GW(java.lang.Class cls, java.util.HashSet hashSet) {
        java.lang.Object obj;
        java.util.HashMap hashMap = (java.util.HashMap) this.oh6vYeIP;
        if (defpackage.l80.kNAkVymC()) {
            try {
                defpackage.l80.AARZUJiTa(cls.getSimpleName());
            } finally {
                android.os.Trace.endSection();
            }
        }
        if (hashSet.contains(cls)) {
            throw new java.lang.IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                defpackage.t50 t50Var = (defpackage.t50) cls.getDeclaredConstructor(null).newInstance(null);
                java.util.List<java.lang.Class> IHQe1A4L2xu = t50Var.IHQe1A4L2xu();
                if (!IHQe1A4L2xu.isEmpty()) {
                    for (java.lang.Class cls2 : IHQe1A4L2xu) {
                        if (!hashMap.containsKey(cls2)) {
                            F7NU4MC0GW(cls2, hashSet);
                        }
                    }
                }
                obj = t50Var.oh6vYeIP((android.content.Context) this.F7NU4MC0GW);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (java.lang.Throwable th) {
                throw new defpackage.cf(th);
            }
        }
        return obj;
    }

    public void G3OKOH3wZRC(defpackage.qn qnVar) {
        ((defpackage.jb) this.F7NU4MC0GW).adDC3e2L.IHQe1A4L2xu = qnVar;
    }

    public void IHQe1A4L2xu(defpackage.ma0 ma0Var, defpackage.h80 h80Var) {
        defpackage.c1NqjJifC7 c1nqjjifc7 = (defpackage.c1NqjJifC7) this.oh6vYeIP;
        defpackage.c1NqjJifC7 c1nqjjifc72 = (defpackage.c1NqjJifC7) this.r1MBDhnF;
        defpackage.c1NqjJifC7 c1nqjjifc73 = (defpackage.c1NqjJifC7) this.F7NU4MC0GW;
        int ordinal = h80Var.ordinal();
        if (ordinal == 0) {
            c1nqjjifc7.IHQe1A4L2xu(ma0Var);
            c1nqjjifc73.IHQe1A4L2xu(ma0Var);
            return;
        }
        if (ordinal == 1) {
            c1nqjjifc72.IHQe1A4L2xu(ma0Var);
            c1nqjjifc73.IHQe1A4L2xu(ma0Var);
            return;
        }
        if (ordinal == 2) {
            if (ma0Var.JlrlGoKF != null) {
                c1nqjjifc73.IHQe1A4L2xu(ma0Var);
                return;
            } else {
                c1nqjjifc7.IHQe1A4L2xu(ma0Var);
                return;
            }
        }
        if (ordinal != 3) {
            defpackage.db.F7NU4MC0GW();
        } else if (ma0Var.JlrlGoKF != null) {
            c1nqjjifc73.IHQe1A4L2xu(ma0Var);
        } else {
            c1nqjjifc72.IHQe1A4L2xu(ma0Var);
        }
    }

    public boolean JlrlGoKF() {
        if (((defpackage.ec1) this.oh6vYeIP).getValue() != this.F7NU4MC0GW) {
            return true;
        }
        defpackage.v5 v5Var = (defpackage.v5) this.r1MBDhnF;
        return v5Var != null && v5Var.JlrlGoKF();
    }

    public void QoRHpC4k(defpackage.hb hbVar) {
        ((defpackage.jb) this.F7NU4MC0GW).adDC3e2L.r1MBDhnF = hbVar;
    }

    public boolean SH1y5HwkJhh(java.lang.CharSequence charSequence, int i, int i2, defpackage.wj1 wj1Var) {
        if ((wj1Var.r1MBDhnF & 3) == 0) {
            defpackage.sm smVar = (defpackage.sm) this.F7NU4MC0GW;
            defpackage.cj0 oh6vYeIP = wj1Var.oh6vYeIP();
            int IHQe1A4L2xu = oh6vYeIP.IHQe1A4L2xu(8);
            if (IHQe1A4L2xu != 0) {
                ((java.nio.ByteBuffer) oh6vYeIP.EXtogiMhuM).getShort(IHQe1A4L2xu + oh6vYeIP.adDC3e2L);
            }
            smVar.getClass();
            java.lang.ThreadLocal threadLocal = defpackage.sm.oh6vYeIP;
            if (threadLocal.get() == null) {
                threadLocal.set(new java.lang.StringBuilder());
            }
            java.lang.StringBuilder sb = (java.lang.StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean hasGlyph = smVar.IHQe1A4L2xu.hasGlyph(sb.toString());
            int i3 = wj1Var.r1MBDhnF & 4;
            wj1Var.r1MBDhnF = hasGlyph ? i3 | 2 : i3 | 1;
        }
        return (wj1Var.r1MBDhnF & 3) == 2;
    }

    public java.lang.Object SyNS6RMn(java.lang.CharSequence charSequence, int i, int i2, int i3, boolean z, defpackage.dt dtVar) {
        int i4;
        char c;
        defpackage.ft ftVar = new defpackage.ft((defpackage.ej0) ((defpackage.y) this.r1MBDhnF).AARZUJiTa);
        int codePointAt = java.lang.Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean z2 = true;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z2) {
                android.util.SparseArray sparseArray = ftVar.r1MBDhnF.IHQe1A4L2xu;
                defpackage.ej0 ej0Var = sparseArray == null ? null : (defpackage.ej0) sparseArray.get(codePointAt);
                if (ftVar.IHQe1A4L2xu == 2) {
                    if (ej0Var != null) {
                        ftVar.r1MBDhnF = ej0Var;
                        ftVar.xiZrDbcSW0++;
                    } else {
                        if (codePointAt == 65038) {
                            ftVar.IHQe1A4L2xu();
                        } else if (codePointAt != 65039) {
                            defpackage.ej0 ej0Var2 = ftVar.r1MBDhnF;
                            if (ej0Var2.oh6vYeIP != null) {
                                if (ftVar.xiZrDbcSW0 != 1) {
                                    ftVar.F7NU4MC0GW = ej0Var2;
                                    ftVar.IHQe1A4L2xu();
                                } else if (ftVar.oh6vYeIP()) {
                                    ftVar.F7NU4MC0GW = ftVar.r1MBDhnF;
                                    ftVar.IHQe1A4L2xu();
                                } else {
                                    ftVar.IHQe1A4L2xu();
                                }
                                c = 3;
                            } else {
                                ftVar.IHQe1A4L2xu();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (ej0Var == null) {
                    ftVar.IHQe1A4L2xu();
                    c = 1;
                } else {
                    ftVar.IHQe1A4L2xu = 2;
                    ftVar.r1MBDhnF = ej0Var;
                    ftVar.xiZrDbcSW0 = 1;
                    c = 2;
                }
                ftVar.adDC3e2L = codePointAt;
                if (c == 1) {
                    i6 = java.lang.Character.charCount(java.lang.Character.codePointAt(charSequence, i4)) + i4;
                    if (i6 < i2) {
                        codePointAt = java.lang.Character.codePointAt(charSequence, i6);
                    }
                } else if (c == 2) {
                    int charCount = java.lang.Character.charCount(codePointAt) + i6;
                    if (charCount < i2) {
                        codePointAt = java.lang.Character.codePointAt(charSequence, charCount);
                    }
                    i6 = charCount;
                } else if (c == 3) {
                    if (z || !SH1y5HwkJhh(charSequence, i4, i6, ftVar.F7NU4MC0GW.oh6vYeIP)) {
                        z2 = dtVar.EXtogiMhuM(charSequence, i4, i6, ftVar.F7NU4MC0GW.oh6vYeIP);
                        i5++;
                    }
                }
            }
        }
        if (ftVar.IHQe1A4L2xu == 2 && ftVar.r1MBDhnF.oh6vYeIP != null && ((ftVar.xiZrDbcSW0 > 1 || ftVar.oh6vYeIP()) && i5 < i3 && z2 && (z || !SH1y5HwkJhh(charSequence, i4, i6, ftVar.r1MBDhnF.oh6vYeIP)))) {
            dtVar.EXtogiMhuM(charSequence, i4, i6, ftVar.r1MBDhnF.oh6vYeIP);
        }
        return dtVar.IHQe1A4L2xu();
    }

    public java.lang.Object adDC3e2L() {
        long DFo87pBq1E5 = defpackage.j70.DFo87pBq1E5();
        if (DFo87pBq1E5 == defpackage.qg1.IHQe1A4L2xu) {
            return this.F7NU4MC0GW;
        }
        defpackage.ng1 ng1Var = (defpackage.ng1) ((java.util.concurrent.atomic.AtomicReference) this.oh6vYeIP).get();
        int IHQe1A4L2xu = ng1Var.IHQe1A4L2xu(DFo87pBq1E5);
        if (IHQe1A4L2xu >= 0) {
            return ng1Var.r1MBDhnF[IHQe1A4L2xu];
        }
        return null;
    }

    public void cnag84Bm(java.lang.Object obj) {
        long DFo87pBq1E5 = defpackage.j70.DFo87pBq1E5();
        if (DFo87pBq1E5 == defpackage.qg1.IHQe1A4L2xu) {
            this.F7NU4MC0GW = obj;
            return;
        }
        synchronized (this.r1MBDhnF) {
            defpackage.ng1 ng1Var = (defpackage.ng1) ((java.util.concurrent.atomic.AtomicReference) this.oh6vYeIP).get();
            int IHQe1A4L2xu = ng1Var.IHQe1A4L2xu(DFo87pBq1E5);
            if (IHQe1A4L2xu < 0) {
                ((java.util.concurrent.atomic.AtomicReference) this.oh6vYeIP).set(ng1Var.oh6vYeIP(DFo87pBq1E5, obj));
            } else {
                ng1Var.r1MBDhnF[IHQe1A4L2xu] = obj;
            }
        }
    }

    public boolean ez2rX8ReCYw() {
        return !(((defpackage.lb1) ((defpackage.c1NqjJifC7) this.oh6vYeIP).xiZrDbcSW0).isEmpty() && ((defpackage.lb1) ((defpackage.c1NqjJifC7) this.F7NU4MC0GW).xiZrDbcSW0).isEmpty() && ((defpackage.lb1) ((defpackage.c1NqjJifC7) this.r1MBDhnF).xiZrDbcSW0).isEmpty());
    }

    public void fnWB2E7cs() {
        defpackage.nl0 nl0Var = (defpackage.nl0) this.oh6vYeIP;
        java.lang.String str = (java.lang.String) this.r1MBDhnF;
        java.util.List list = (java.util.List) nl0Var.ez2rX8ReCYw(str);
        if (list != null) {
            list.remove((defpackage.vz) this.F7NU4MC0GW);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        nl0Var.DFo87pBq1E5(str, list);
    }

    public void kd6TUFXn(defpackage.w90 w90Var) {
        ((defpackage.jb) this.F7NU4MC0GW).adDC3e2L.oh6vYeIP = w90Var;
    }

    public boolean oh6vYeIP(defpackage.ma0 ma0Var) {
        return !(ma0Var.JlrlGoKF == null) && (((defpackage.lb1) ((defpackage.c1NqjJifC7) this.oh6vYeIP).xiZrDbcSW0).contains(ma0Var) || ((defpackage.lb1) ((defpackage.c1NqjJifC7) this.r1MBDhnF).xiZrDbcSW0).contains(ma0Var));
    }

    public void r1MBDhnF(android.os.Bundle bundle) {
        java.util.HashSet hashSet = (java.util.HashSet) this.r1MBDhnF;
        java.lang.String string = ((android.content.Context) this.F7NU4MC0GW).getString(com.combinations.spin.balbi.R.string.androidx_startup);
        if (bundle != null) {
            try {
                java.util.HashSet hashSet2 = new java.util.HashSet();
                for (java.lang.String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        java.lang.Class<?> cls = java.lang.Class.forName(str);
                        if (defpackage.t50.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                java.util.Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    F7NU4MC0GW((java.lang.Class) it.next(), hashSet2);
                }
            } catch (java.lang.ClassNotFoundException e) {
                throw new defpackage.cf(e);
            }
        }
    }

    public long riuEU0zW4() {
        return ((defpackage.jb) this.F7NU4MC0GW).adDC3e2L.F7NU4MC0GW;
    }

    public java.lang.String toString() {
        switch (this.IHQe1A4L2xu) {
            case 10:
                java.lang.String str = (java.lang.String) this.F7NU4MC0GW;
                java.lang.String str2 = (java.lang.String) this.r1MBDhnF;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("NavDeepLinkRequest{");
                android.net.Uri uri = (android.net.Uri) this.oh6vYeIP;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(java.lang.String.valueOf(uri));
                }
                if (str2 != null) {
                    sb.append(" action=");
                    sb.append(str2);
                }
                if (str != null) {
                    sb.append(" mimetype=");
                    sb.append(str);
                }
                sb.append(" }");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public defpackage.hb xiZrDbcSW0() {
        return ((defpackage.jb) this.F7NU4MC0GW).adDC3e2L.r1MBDhnF;
    }

    public v5(defpackage.bz0 bz0Var) {
        this.IHQe1A4L2xu = 11;
        this.oh6vYeIP = new defpackage.y6(0);
        this.r1MBDhnF = new defpackage.m7();
        this.F7NU4MC0GW = new defpackage.DSux0S2nxMSk(8, this, bz0Var);
    }

    public /* synthetic */ v5(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.IHQe1A4L2xu = i;
        this.oh6vYeIP = obj;
        this.r1MBDhnF = obj2;
        this.F7NU4MC0GW = obj3;
    }

    public v5(defpackage.jb jbVar) {
        this.IHQe1A4L2xu = 2;
        this.F7NU4MC0GW = jbVar;
        this.oh6vYeIP = new defpackage.c1NqjJifC7(5, this);
    }

    public v5(android.content.Context context) {
        this.IHQe1A4L2xu = 0;
        this.F7NU4MC0GW = context.getApplicationContext();
        this.r1MBDhnF = new java.util.HashSet();
        this.oh6vYeIP = new java.util.HashMap();
    }

    public v5(defpackage.y yVar, defpackage.ad1 ad1Var, defpackage.sm smVar, java.util.Set set) {
        this.IHQe1A4L2xu = 4;
        this.oh6vYeIP = ad1Var;
        this.r1MBDhnF = yVar;
        this.F7NU4MC0GW = smVar;
        if (set.isEmpty()) {
            return;
        }
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            java.lang.String str = new java.lang.String(iArr, 0, iArr.length);
            SyNS6RMn(str, 0, str.length(), 1, true, new defpackage.et(str, 0));
        }
    }

    public v5(defpackage.zj1 zj1Var, defpackage.v5 v5Var) {
        this.IHQe1A4L2xu = 15;
        this.oh6vYeIP = zj1Var;
        this.r1MBDhnF = v5Var;
        this.F7NU4MC0GW = zj1Var.adDC3e2L;
    }

    public v5(java.util.regex.Matcher matcher, java.lang.CharSequence charSequence) {
        this.IHQe1A4L2xu = 8;
        charSequence.getClass();
        this.oh6vYeIP = matcher;
        this.r1MBDhnF = charSequence;
        this.F7NU4MC0GW = new defpackage.ai0(0, this);
    }
}
