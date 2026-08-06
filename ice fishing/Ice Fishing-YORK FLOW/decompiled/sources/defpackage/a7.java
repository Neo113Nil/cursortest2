package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class a7 {
    public static volatile defpackage.a7 WDYagTQQm9ns;
    public static final java.lang.Object oh71FJcDz6S2 = new java.lang.Object();
    public java.lang.Object JhCgjQRTAOCT;
    public final /* synthetic */ int ZpBGe2uQfcn8;
    public java.lang.Object fWTAfUmVKrZq;
    public java.lang.Object giKS3J6vZuNy;

    public a7(int i) {
        this.ZpBGe2uQfcn8 = i;
        int i2 = 17;
        switch (i) {
            case 2:
                this.giKS3J6vZuNy = new defpackage.rj0(16);
                long[] jArr = defpackage.m81.ZpBGe2uQfcn8;
                this.fWTAfUmVKrZq = new defpackage.yn0();
                this.JhCgjQRTAOCT = new defpackage.l21(i2);
                break;
            case 4:
                this.giKS3J6vZuNy = new defpackage.k0(5, (byte) 0);
                this.fWTAfUmVKrZq = new defpackage.k0(5, (byte) 0);
                this.JhCgjQRTAOCT = new defpackage.k0(5, (byte) 0);
                break;
            case 6:
                this.giKS3J6vZuNy = new defpackage.yn0();
                break;
            case 14:
                long[] jArr2 = defpackage.m81.ZpBGe2uQfcn8;
                this.giKS3J6vZuNy = new defpackage.yn0();
                break;
            case 16:
                this.giKS3J6vZuNy = new java.util.concurrent.atomic.AtomicReference(defpackage.jr0.fNwYGHIYeJcR);
                this.fWTAfUmVKrZq = new java.lang.Object();
                break;
            case 18:
                this.giKS3J6vZuNy = new java.util.WeakHashMap();
                this.fWTAfUmVKrZq = new java.util.WeakHashMap();
                this.JhCgjQRTAOCT = new java.util.WeakHashMap();
                break;
            default:
                this.JhCgjQRTAOCT = new defpackage.l21(i2);
                break;
        }
    }

    public static defpackage.a7 P05cfTpS5W5L(android.content.Context context) {
        if (WDYagTQQm9ns == null) {
            synchronized (oh71FJcDz6S2) {
                try {
                    if (WDYagTQQm9ns == null) {
                        WDYagTQQm9ns = new defpackage.a7(context);
                    }
                } finally {
                }
            }
        }
        return WDYagTQQm9ns;
    }

    public void BHfvd2J71qpO(java.lang.Object obj) {
        long gUjdnLbkVAaA = defpackage.w60.gUjdnLbkVAaA();
        if (gUjdnLbkVAaA == defpackage.co1.ZpBGe2uQfcn8) {
            this.JhCgjQRTAOCT = obj;
            return;
        }
        synchronized (this.fWTAfUmVKrZq) {
            defpackage.zn1 zn1Var = (defpackage.zn1) ((java.util.concurrent.atomic.AtomicReference) this.giKS3J6vZuNy).get();
            int ZpBGe2uQfcn8 = zn1Var.ZpBGe2uQfcn8(gUjdnLbkVAaA);
            if (ZpBGe2uQfcn8 < 0) {
                ((java.util.concurrent.atomic.AtomicReference) this.giKS3J6vZuNy).set(zn1Var.giKS3J6vZuNy(gUjdnLbkVAaA, obj));
            } else {
                zn1Var.fWTAfUmVKrZq[ZpBGe2uQfcn8] = obj;
            }
        }
    }

    public defpackage.p90 GE9mJIPrb8gP() {
        java.util.regex.Matcher matcher = (java.util.regex.Matcher) this.giKS3J6vZuNy;
        return defpackage.j80.OVwOqzUGHcCU(matcher.start(), matcher.end());
    }

    public void IJ0hOnjhPOri(long j) {
        ((defpackage.ld) this.JhCgjQRTAOCT).WDYagTQQm9ns.JhCgjQRTAOCT = j;
    }

    public java.lang.Object JhCgjQRTAOCT(java.lang.Class cls, java.util.HashSet hashSet) {
        java.lang.Object obj;
        java.util.HashMap hashMap = (java.util.HashMap) this.giKS3J6vZuNy;
        if (defpackage.v70.OcTWLQzke1i2()) {
            try {
                defpackage.v70.Ns0WNyEWdPsk(cls.getSimpleName());
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
                defpackage.w70 w70Var = (defpackage.w70) cls.getDeclaredConstructor(null).newInstance(null);
                java.util.List<java.lang.Class> ZpBGe2uQfcn8 = w70Var.ZpBGe2uQfcn8();
                if (!ZpBGe2uQfcn8.isEmpty()) {
                    for (java.lang.Class cls2 : ZpBGe2uQfcn8) {
                        if (!hashMap.containsKey(cls2)) {
                            JhCgjQRTAOCT(cls2, hashSet);
                        }
                    }
                }
                obj = w70Var.giKS3J6vZuNy((android.content.Context) this.JhCgjQRTAOCT);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (java.lang.Throwable th) {
                throw new defpackage.vg(th);
            }
        }
        return obj;
    }

    public long Ns0WNyEWdPsk() {
        return ((defpackage.ld) this.JhCgjQRTAOCT).WDYagTQQm9ns.JhCgjQRTAOCT;
    }

    public defpackage.oi0 QiMR8OkAhezm() {
        android.os.LocaleList localeList = android.os.LocaleList.getDefault();
        synchronized (((defpackage.l21) this.JhCgjQRTAOCT)) {
            try {
                defpackage.oi0 oi0Var = (defpackage.oi0) this.fWTAfUmVKrZq;
                if (oi0Var != null && localeList == ((android.os.LocaleList) this.giKS3J6vZuNy)) {
                    return oi0Var;
                }
                int size = localeList.size();
                java.util.ArrayList arrayList = new java.util.ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new defpackage.ni0(localeList.get(i)));
                }
                defpackage.oi0 oi0Var2 = new defpackage.oi0(arrayList);
                this.giKS3J6vZuNy = localeList;
                this.fWTAfUmVKrZq = oi0Var2;
                return oi0Var2;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public defpackage.a7 T1fB7bDYiVJQ() {
        java.lang.CharSequence charSequence = (java.lang.CharSequence) this.fWTAfUmVKrZq;
        java.util.regex.Matcher matcher = (java.util.regex.Matcher) this.giKS3J6vZuNy;
        int end = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        if (end > charSequence.length()) {
            return null;
        }
        java.util.regex.Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        return defpackage.q70.e6mdH7fiFuta(matcher2, end, charSequence);
    }

    public void VFeft99leXEK() {
        defpackage.yn0 yn0Var = (defpackage.yn0) this.giKS3J6vZuNy;
        java.lang.String str = (java.lang.String) this.fWTAfUmVKrZq;
        java.util.List list = (java.util.List) yn0Var.Ns0WNyEWdPsk(str);
        if (list != null) {
            list.remove((defpackage.n10) this.JhCgjQRTAOCT);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        yn0Var.h3m55N1URyyK(str, list);
    }

    public java.lang.Object WDYagTQQm9ns() {
        long gUjdnLbkVAaA = defpackage.w60.gUjdnLbkVAaA();
        if (gUjdnLbkVAaA == defpackage.co1.ZpBGe2uQfcn8) {
            return this.JhCgjQRTAOCT;
        }
        defpackage.zn1 zn1Var = (defpackage.zn1) ((java.util.concurrent.atomic.AtomicReference) this.giKS3J6vZuNy).get();
        int ZpBGe2uQfcn8 = zn1Var.ZpBGe2uQfcn8(gUjdnLbkVAaA);
        if (ZpBGe2uQfcn8 >= 0) {
            return zn1Var.fWTAfUmVKrZq[ZpBGe2uQfcn8];
        }
        return null;
    }

    public defpackage.b90 WmetiUbpKU9I(defpackage.ne neVar, defpackage.w21 w21Var, defpackage.w21 w21Var2) {
        java.lang.String str;
        neVar.getClass();
        w21Var2.getClass();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(defpackage.mb0.ZpBGe2uQfcn8(neVar));
        sb.append(':');
        if (w21Var == null || (str = w21Var.getValue()) == null) {
            str = "";
        }
        sb.append(str);
        sb.append(':');
        sb.append(w21Var2);
        return (defpackage.b90) ((java.util.concurrent.ConcurrentHashMap) this.fWTAfUmVKrZq).get(sb.toString());
    }

    public java.lang.Object XntWc4eZSQ8j(java.lang.CharSequence charSequence, int i, int i2, int i3, boolean z, defpackage.pu puVar) {
        int i4;
        char c;
        defpackage.su suVar = new defpackage.su((defpackage.ll0) ((defpackage.s81) this.fWTAfUmVKrZq).QiMR8OkAhezm);
        int codePointAt = java.lang.Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean z2 = true;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z2) {
                android.util.SparseArray sparseArray = suVar.fWTAfUmVKrZq.ZpBGe2uQfcn8;
                defpackage.ll0 ll0Var = sparseArray == null ? null : (defpackage.ll0) sparseArray.get(codePointAt);
                if (suVar.ZpBGe2uQfcn8 == 2) {
                    if (ll0Var != null) {
                        suVar.fWTAfUmVKrZq = ll0Var;
                        suVar.oh71FJcDz6S2++;
                    } else {
                        if (codePointAt == 65038) {
                            suVar.ZpBGe2uQfcn8();
                        } else if (codePointAt != 65039) {
                            defpackage.ll0 ll0Var2 = suVar.fWTAfUmVKrZq;
                            if (ll0Var2.giKS3J6vZuNy != null) {
                                if (suVar.oh71FJcDz6S2 != 1) {
                                    suVar.JhCgjQRTAOCT = ll0Var2;
                                    suVar.ZpBGe2uQfcn8();
                                } else if (suVar.giKS3J6vZuNy()) {
                                    suVar.JhCgjQRTAOCT = suVar.fWTAfUmVKrZq;
                                    suVar.ZpBGe2uQfcn8();
                                } else {
                                    suVar.ZpBGe2uQfcn8();
                                }
                                c = 3;
                            } else {
                                suVar.ZpBGe2uQfcn8();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (ll0Var == null) {
                    suVar.ZpBGe2uQfcn8();
                    c = 1;
                } else {
                    suVar.ZpBGe2uQfcn8 = 2;
                    suVar.fWTAfUmVKrZq = ll0Var;
                    suVar.oh71FJcDz6S2 = 1;
                    c = 2;
                }
                suVar.WDYagTQQm9ns = codePointAt;
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
                    if (z || !fNwYGHIYeJcR(charSequence, i4, i6, suVar.JhCgjQRTAOCT.giKS3J6vZuNy)) {
                        z2 = puVar.QiMR8OkAhezm(charSequence, i4, i6, suVar.JhCgjQRTAOCT.giKS3J6vZuNy);
                        i5++;
                    }
                }
            }
        }
        if (suVar.ZpBGe2uQfcn8 == 2 && suVar.fWTAfUmVKrZq.giKS3J6vZuNy != null && ((suVar.oh71FJcDz6S2 > 1 || suVar.giKS3J6vZuNy()) && i5 < i3 && z2 && (z || !fNwYGHIYeJcR(charSequence, i4, i6, suVar.fWTAfUmVKrZq.giKS3J6vZuNy)))) {
            puVar.QiMR8OkAhezm(charSequence, i4, i6, suVar.fWTAfUmVKrZq.giKS3J6vZuNy);
        }
        return puVar.ZpBGe2uQfcn8();
    }

    public void ZVVdXbWmyCSK(defpackage.id idVar) {
        ((defpackage.ld) this.JhCgjQRTAOCT).WDYagTQQm9ns.fWTAfUmVKrZq = idVar;
    }

    public void ZpBGe2uQfcn8(defpackage.jd0 jd0Var, defpackage.ta0 ta0Var) {
        defpackage.k0 k0Var = (defpackage.k0) this.giKS3J6vZuNy;
        defpackage.k0 k0Var2 = (defpackage.k0) this.fWTAfUmVKrZq;
        defpackage.k0 k0Var3 = (defpackage.k0) this.JhCgjQRTAOCT;
        int ordinal = ta0Var.ordinal();
        if (ordinal == 0) {
            k0Var.WDYagTQQm9ns(jd0Var);
            k0Var3.WDYagTQQm9ns(jd0Var);
            return;
        }
        if (ordinal == 1) {
            k0Var2.WDYagTQQm9ns(jd0Var);
            k0Var3.WDYagTQQm9ns(jd0Var);
            return;
        }
        if (ordinal == 2) {
            if (jd0Var.fNwYGHIYeJcR != null) {
                k0Var3.WDYagTQQm9ns(jd0Var);
                return;
            } else {
                k0Var.WDYagTQQm9ns(jd0Var);
                return;
            }
        }
        if (ordinal != 3) {
            defpackage.h7.T1fB7bDYiVJQ();
        } else if (jd0Var.fNwYGHIYeJcR != null) {
            k0Var3.WDYagTQQm9ns(jd0Var);
        } else {
            k0Var2.WDYagTQQm9ns(jd0Var);
        }
    }

    public defpackage.bc0 e6mdH7fiFuta() {
        defpackage.bc0 bc0Var = (defpackage.bc0) this.fWTAfUmVKrZq;
        if (bc0Var != null) {
            return bc0Var;
        }
        defpackage.ma0.hH0RRJrNssvh("keyboardActions");
        throw null;
    }

    public boolean fNwYGHIYeJcR(java.lang.CharSequence charSequence, int i, int i2, defpackage.zq1 zq1Var) {
        if ((zq1Var.fWTAfUmVKrZq & 3) == 0) {
            defpackage.zn znVar = (defpackage.zn) this.JhCgjQRTAOCT;
            defpackage.jl0 giKS3J6vZuNy = zq1Var.giKS3J6vZuNy();
            int ZpBGe2uQfcn8 = giKS3J6vZuNy.ZpBGe2uQfcn8(8);
            if (ZpBGe2uQfcn8 != 0) {
                ((java.nio.ByteBuffer) giKS3J6vZuNy.P05cfTpS5W5L).getShort(ZpBGe2uQfcn8 + giKS3J6vZuNy.WDYagTQQm9ns);
            }
            znVar.getClass();
            java.lang.ThreadLocal threadLocal = defpackage.zn.giKS3J6vZuNy;
            if (threadLocal.get() == null) {
                threadLocal.set(new java.lang.StringBuilder());
            }
            java.lang.StringBuilder sb = (java.lang.StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean hasGlyph = znVar.ZpBGe2uQfcn8.hasGlyph(sb.toString());
            int i3 = zq1Var.fWTAfUmVKrZq & 4;
            zq1Var.fWTAfUmVKrZq = hasGlyph ? i3 | 2 : i3 | 1;
        }
        return (zq1Var.fWTAfUmVKrZq & 3) == 2;
    }

    public void fWTAfUmVKrZq(android.os.Bundle bundle) {
        java.util.HashSet hashSet = (java.util.HashSet) this.fWTAfUmVKrZq;
        java.lang.String string = ((android.content.Context) this.JhCgjQRTAOCT).getString(com.ice.fishing.wolberta.R.string.androidx_startup);
        if (bundle != null) {
            try {
                java.util.HashSet hashSet2 = new java.util.HashSet();
                for (java.lang.String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        java.lang.Class<?> cls = java.lang.Class.forName(str);
                        if (defpackage.w70.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                java.util.Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    JhCgjQRTAOCT((java.lang.Class) it.next(), hashSet2);
                }
            } catch (java.lang.ClassNotFoundException e) {
                throw new defpackage.vg(e);
            }
        }
    }

    public boolean gUjdnLbkVAaA() {
        if (((defpackage.dg1) this.giKS3J6vZuNy).getValue() != this.JhCgjQRTAOCT) {
            return true;
        }
        defpackage.a7 a7Var = (defpackage.a7) this.fWTAfUmVKrZq;
        return a7Var != null && a7Var.gUjdnLbkVAaA();
    }

    public boolean giKS3J6vZuNy(defpackage.jd0 jd0Var) {
        return !(jd0Var.fNwYGHIYeJcR == null) && (((defpackage.mf1) ((defpackage.k0) this.giKS3J6vZuNy).oh71FJcDz6S2).contains(jd0Var) || ((defpackage.mf1) ((defpackage.k0) this.fWTAfUmVKrZq).oh71FJcDz6S2).contains(jd0Var));
    }

    public boolean h3m55N1URyyK() {
        return !(((defpackage.mf1) ((defpackage.k0) this.giKS3J6vZuNy).oh71FJcDz6S2).isEmpty() && ((defpackage.mf1) ((defpackage.k0) this.JhCgjQRTAOCT).oh71FJcDz6S2).isEmpty() && ((defpackage.mf1) ((defpackage.k0) this.fWTAfUmVKrZq).oh71FJcDz6S2).isEmpty());
    }

    public void maCixPsq4ml2(defpackage.sc0 sc0Var) {
        ((defpackage.ld) this.JhCgjQRTAOCT).WDYagTQQm9ns.giKS3J6vZuNy = sc0Var;
    }

    public defpackage.id oh71FJcDz6S2() {
        return ((defpackage.ld) this.JhCgjQRTAOCT).WDYagTQQm9ns.fWTAfUmVKrZq;
    }

    public boolean s0TASMVLSWD5(int i) {
        defpackage.if1 if1Var;
        if (i == 7) {
            e6mdH7fiFuta();
        } else if (i == 2) {
            e6mdH7fiFuta();
        } else if (i == 6) {
            e6mdH7fiFuta();
        } else if (i == 5) {
            e6mdH7fiFuta();
        } else if (i == 3) {
            e6mdH7fiFuta();
        } else if (i == 4) {
            e6mdH7fiFuta();
        } else if (i != 1 && i != 0) {
            defpackage.h7.P05cfTpS5W5L("invalid ImeAction");
            return false;
        }
        if (i == 6) {
            defpackage.dz dzVar = (defpackage.dz) this.JhCgjQRTAOCT;
            if (dzVar != null) {
                ((defpackage.gz) dzVar).QiMR8OkAhezm(1, true);
                return true;
            }
            defpackage.ma0.hH0RRJrNssvh("focusManager");
            throw null;
        }
        if (i != 5) {
            if (i != 7 || (if1Var = (defpackage.if1) this.giKS3J6vZuNy) == null) {
                return false;
            }
            ((defpackage.zo) if1Var).ZpBGe2uQfcn8();
            return true;
        }
        defpackage.dz dzVar2 = (defpackage.dz) this.JhCgjQRTAOCT;
        if (dzVar2 != null) {
            ((defpackage.gz) dzVar2).QiMR8OkAhezm(2, true);
            return true;
        }
        defpackage.ma0.hH0RRJrNssvh("focusManager");
        throw null;
    }

    public java.lang.String toString() {
        switch (this.ZpBGe2uQfcn8) {
            case defpackage.n70.fWTAfUmVKrZq /* 12 */:
                java.lang.String str = (java.lang.String) this.JhCgjQRTAOCT;
                java.lang.String str2 = (java.lang.String) this.fWTAfUmVKrZq;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("NavDeepLinkRequest{");
                android.net.Uri uri = (android.net.Uri) this.giKS3J6vZuNy;
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

    public void w7APNrr0aGRc(defpackage.hp hpVar) {
        ((defpackage.ld) this.JhCgjQRTAOCT).WDYagTQQm9ns.ZpBGe2uQfcn8 = hpVar;
    }

    public a7(defpackage.g31 g31Var) {
        this.ZpBGe2uQfcn8 = 13;
        this.giKS3J6vZuNy = new defpackage.h8(0);
        this.fWTAfUmVKrZq = new defpackage.x8(0);
        this.JhCgjQRTAOCT = new defpackage.S0YpfprlOYIn(15, this, g31Var);
    }

    public /* synthetic */ a7(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.ZpBGe2uQfcn8 = i;
        this.giKS3J6vZuNy = obj;
        this.fWTAfUmVKrZq = obj2;
        this.JhCgjQRTAOCT = obj3;
    }

    public a7(defpackage.if1 if1Var) {
        this.ZpBGe2uQfcn8 = 9;
        this.giKS3J6vZuNy = if1Var;
    }

    public a7(defpackage.x8 x8Var) {
        this.ZpBGe2uQfcn8 = 8;
        this.giKS3J6vZuNy = x8Var;
        this.fWTAfUmVKrZq = new java.util.concurrent.ConcurrentHashMap();
        this.JhCgjQRTAOCT = new java.util.concurrent.ConcurrentHashMap();
    }

    public a7(android.view.View view) {
        this.ZpBGe2uQfcn8 = 7;
        this.giKS3J6vZuNy = view;
        this.fWTAfUmVKrZq = defpackage.t80.oCu53ZX2v4Ju(defpackage.yf0.oh71FJcDz6S2, new defpackage.w2(5, this));
        this.JhCgjQRTAOCT = new defpackage.k0(view);
    }

    public a7(defpackage.ld ldVar) {
        this.ZpBGe2uQfcn8 = 3;
        this.JhCgjQRTAOCT = ldVar;
        this.giKS3J6vZuNy = new defpackage.k0(1, this);
    }

    public a7(android.content.Context context) {
        this.ZpBGe2uQfcn8 = 0;
        this.JhCgjQRTAOCT = context.getApplicationContext();
        this.fWTAfUmVKrZq = new java.util.HashSet();
        this.giKS3J6vZuNy = new java.util.HashMap();
    }

    public a7(defpackage.s81 s81Var, defpackage.hu huVar, defpackage.zn znVar, java.util.Set set) {
        this.ZpBGe2uQfcn8 = 5;
        this.giKS3J6vZuNy = huVar;
        this.fWTAfUmVKrZq = s81Var;
        this.JhCgjQRTAOCT = znVar;
        if (set.isEmpty()) {
            return;
        }
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            java.lang.String str = new java.lang.String(iArr, 0, iArr.length);
            XntWc4eZSQ8j(str, 0, str.length(), 1, true, new defpackage.ru(str, 0));
        }
    }

    public a7(defpackage.er1 er1Var, defpackage.a7 a7Var) {
        this.ZpBGe2uQfcn8 = 17;
        this.giKS3J6vZuNy = er1Var;
        this.fWTAfUmVKrZq = a7Var;
        this.JhCgjQRTAOCT = er1Var.getValue();
    }

    public a7(java.util.regex.Matcher matcher, java.lang.CharSequence charSequence) {
        this.ZpBGe2uQfcn8 = 10;
        charSequence.getClass();
        this.giKS3J6vZuNy = matcher;
        this.fWTAfUmVKrZq = charSequence;
        this.JhCgjQRTAOCT = new defpackage.lk0(0, this);
    }
}
