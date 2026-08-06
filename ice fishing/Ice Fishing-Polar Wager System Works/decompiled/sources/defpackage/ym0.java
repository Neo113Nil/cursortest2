package defpackage;

/* loaded from: classes.dex */
public final class ym0 {
    public final defpackage.hc1 AARZUJiTa;
    public final java.util.LinkedHashMap DFo87pBq1E5;
    public final defpackage.hc1 EXtogiMhuM;
    public final defpackage.po0 EgCjBq0SZwJ;
    public android.os.Bundle F7NU4MC0GW;
    public defpackage.nd0 G3OKOH3wZRC;
    public final defpackage.qn0 IHQe1A4L2xu;
    public final java.util.LinkedHashMap JlrlGoKF;
    public final java.util.ArrayList NHJTzaLwkd;
    public final java.util.LinkedHashMap PAEGRtP0bX;
    public final defpackage.m91 QQUzIjv3iOC5;
    public final java.util.ArrayList QoRHpC4k;
    public final java.util.LinkedHashMap SH1y5HwkJhh;
    public defpackage.ud0 SyNS6RMn;
    public defpackage.wm0 V7bD7b8KA;
    public int abhbClRa;
    public android.os.Bundle[] adDC3e2L;
    public defpackage.zm0 cnag84Bm;
    public final java.util.LinkedHashMap ez2rX8ReCYw;
    public final java.util.LinkedHashMap fnWB2E7cs;
    public defpackage.g00 kNAkVymC;
    public final defpackage.vm0 kd6TUFXn;
    public final defpackage.tm0 oh6vYeIP;
    public defpackage.kn0 r1MBDhnF;
    public final defpackage.xy0 riuEU0zW4;
    public final defpackage.l6 xiZrDbcSW0 = new defpackage.l6();

    public ym0(defpackage.qn0 qn0Var, defpackage.tm0 tm0Var) {
        this.IHQe1A4L2xu = qn0Var;
        this.oh6vYeIP = tm0Var;
        defpackage.nt ntVar = defpackage.nt.adDC3e2L;
        this.AARZUJiTa = defpackage.gq1.F7NU4MC0GW(ntVar);
        defpackage.hc1 F7NU4MC0GW = defpackage.gq1.F7NU4MC0GW(ntVar);
        this.EXtogiMhuM = F7NU4MC0GW;
        this.riuEU0zW4 = new defpackage.xy0(F7NU4MC0GW);
        this.SH1y5HwkJhh = new java.util.LinkedHashMap();
        this.ez2rX8ReCYw = new java.util.LinkedHashMap();
        this.JlrlGoKF = new java.util.LinkedHashMap();
        this.DFo87pBq1E5 = new java.util.LinkedHashMap();
        this.QoRHpC4k = new java.util.ArrayList();
        this.G3OKOH3wZRC = defpackage.nd0.xiZrDbcSW0;
        this.kd6TUFXn = new defpackage.vm0(0, this);
        this.EgCjBq0SZwJ = new defpackage.po0();
        this.fnWB2E7cs = new java.util.LinkedHashMap();
        this.PAEGRtP0bX = new java.util.LinkedHashMap();
        this.NHJTzaLwkd = new java.util.ArrayList();
        this.QQUzIjv3iOC5 = new defpackage.m91(1, 1, defpackage.t9.xiZrDbcSW0);
    }

    public static /* synthetic */ void QoRHpC4k(defpackage.ym0 ym0Var, defpackage.nm0 nm0Var) {
        ym0Var.cnag84Bm(nm0Var, false, new defpackage.l6());
    }

    public static defpackage.gn0 adDC3e2L(int i, defpackage.gn0 gn0Var, defpackage.gn0 gn0Var2, boolean z) {
        if (gn0Var.xiZrDbcSW0.IHQe1A4L2xu == i && (gn0Var2 == null || (gn0Var.equals(gn0Var2) && defpackage.x70.QoRHpC4k(gn0Var.AARZUJiTa, gn0Var2.AARZUJiTa)))) {
            return gn0Var;
        }
        defpackage.kn0 kn0Var = gn0Var instanceof defpackage.kn0 ? (defpackage.kn0) gn0Var : null;
        if (kn0Var == null) {
            kn0Var = gn0Var.AARZUJiTa;
            kn0Var.getClass();
        }
        return kn0Var.SH1y5HwkJhh.r1MBDhnF(i, kn0Var, gn0Var2, z);
    }

    public final defpackage.nm0 AARZUJiTa() {
        return (defpackage.nm0) this.xiZrDbcSW0.EXtogiMhuM();
    }

    public final void DFo87pBq1E5(java.lang.String str, defpackage.co0 co0Var) {
        if (this.r1MBDhnF == null) {
            throw new java.lang.IllegalArgumentException(("Cannot navigate to " + str + ". Navigation graph has not been set for NavController " + this + '.').toString());
        }
        defpackage.kn0 SH1y5HwkJhh = SH1y5HwkJhh();
        defpackage.fn0 xiZrDbcSW0 = SH1y5HwkJhh.xiZrDbcSW0(str, true, SH1y5HwkJhh);
        if (xiZrDbcSW0 == null) {
            throw new java.lang.IllegalArgumentException("Navigation destination that matches route " + str + " cannot be found in the navigation graph " + this.r1MBDhnF);
        }
        defpackage.gn0 gn0Var = xiZrDbcSW0.adDC3e2L;
        android.os.Bundle IHQe1A4L2xu = gn0Var.IHQe1A4L2xu(xiZrDbcSW0.xiZrDbcSW0);
        if (IHQe1A4L2xu == null) {
            IHQe1A4L2xu = defpackage.w70.SyNS6RMn((defpackage.et0[]) java.util.Arrays.copyOf(new defpackage.et0[0], 0));
        }
        int i = defpackage.gn0.riuEU0zW4;
        java.lang.String str2 = (java.lang.String) gn0Var.xiZrDbcSW0.adDC3e2L;
        android.net.Uri parse = android.net.Uri.parse(str2 != null ? "android-app://androidx.navigation/".concat(str2) : "");
        parse.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.setDataAndType(parse, null);
        intent.setAction(null);
        IHQe1A4L2xu.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        JlrlGoKF(gn0Var, IHQe1A4L2xu, co0Var);
    }

    public final defpackage.gn0 EXtogiMhuM() {
        defpackage.nm0 AARZUJiTa = AARZUJiTa();
        if (AARZUJiTa != null) {
            return AARZUJiTa.xiZrDbcSW0;
        }
        return null;
    }

    public final void EgCjBq0SZwJ(defpackage.nm0 nm0Var) {
        nm0Var.getClass();
        defpackage.nm0 nm0Var2 = (defpackage.nm0) this.SH1y5HwkJhh.remove(nm0Var);
        if (nm0Var2 == null) {
            return;
        }
        java.util.LinkedHashMap linkedHashMap = this.ez2rX8ReCYw;
        defpackage.x6 x6Var = (defpackage.x6) linkedHashMap.get(nm0Var2);
        java.lang.Integer valueOf = x6Var != null ? java.lang.Integer.valueOf(x6Var.IHQe1A4L2xu.decrementAndGet()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            defpackage.um0 um0Var = (defpackage.um0) this.fnWB2E7cs.get(this.EgCjBq0SZwJ.oh6vYeIP(nm0Var2.xiZrDbcSW0.adDC3e2L));
            if (um0Var != null) {
                um0Var.r1MBDhnF(nm0Var2);
            }
            linkedHashMap.remove(nm0Var2);
        }
    }

    public final defpackage.gn0 F7NU4MC0GW(int i, defpackage.gn0 gn0Var) {
        defpackage.gn0 gn0Var2;
        defpackage.kn0 kn0Var = this.r1MBDhnF;
        if (kn0Var == null) {
            return null;
        }
        if (kn0Var.xiZrDbcSW0.IHQe1A4L2xu == i) {
            if (gn0Var == null) {
                return kn0Var;
            }
            if (defpackage.x70.QoRHpC4k(kn0Var, gn0Var) && gn0Var.AARZUJiTa == null) {
                return this.r1MBDhnF;
            }
        }
        defpackage.nm0 nm0Var = (defpackage.nm0) this.xiZrDbcSW0.EXtogiMhuM();
        if (nm0Var == null || (gn0Var2 = nm0Var.xiZrDbcSW0) == null) {
            gn0Var2 = this.r1MBDhnF;
            gn0Var2.getClass();
        }
        return adDC3e2L(i, gn0Var2, gn0Var, false);
    }

    public final java.util.ArrayList G3OKOH3wZRC() {
        defpackage.nd0 nd0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.fnWB2E7cs.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            nd0Var = defpackage.nd0.EXtogiMhuM;
            if (!hasNext) {
                break;
            }
            java.lang.Iterable iterable = (java.lang.Iterable) ((defpackage.um0) it.next()).xiZrDbcSW0.adDC3e2L.getValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : iterable) {
                defpackage.nm0 nm0Var = (defpackage.nm0) obj;
                if (!arrayList.contains(nm0Var) && nm0Var.JlrlGoKF.ez2rX8ReCYw.compareTo(nd0Var) < 0) {
                    arrayList2.add(obj);
                }
            }
            defpackage.yd.AsxAYCCkb3Hi(arrayList, arrayList2);
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it2 = this.xiZrDbcSW0.iterator();
        while (it2.hasNext()) {
            java.lang.Object next = it2.next();
            defpackage.nm0 nm0Var2 = (defpackage.nm0) next;
            if (!arrayList.contains(nm0Var2) && nm0Var2.JlrlGoKF.ez2rX8ReCYw.compareTo(nd0Var) >= 0) {
                arrayList3.add(next);
            }
        }
        defpackage.yd.AsxAYCCkb3Hi(arrayList, arrayList3);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            java.lang.Object obj2 = arrayList.get(i);
            i++;
            if (!(((defpackage.nm0) obj2).xiZrDbcSW0 instanceof defpackage.kn0)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    public final void IHQe1A4L2xu(defpackage.gn0 gn0Var, android.os.Bundle bundle, defpackage.nm0 nm0Var, java.util.List list) {
        java.lang.Object obj;
        java.lang.Object obj2;
        defpackage.a6 a6Var = this.IHQe1A4L2xu.r1MBDhnF;
        defpackage.gn0 gn0Var2 = nm0Var.xiZrDbcSW0;
        boolean z = gn0Var2 instanceof defpackage.mo;
        defpackage.l6 l6Var = this.xiZrDbcSW0;
        if (!z) {
            while (!l6Var.isEmpty() && (((defpackage.nm0) l6Var.last()).xiZrDbcSW0 instanceof defpackage.mo) && SyNS6RMn(((defpackage.nm0) l6Var.last()).xiZrDbcSW0.xiZrDbcSW0.IHQe1A4L2xu, true, false)) {
            }
        }
        defpackage.l6 l6Var2 = new defpackage.l6();
        java.lang.Object obj3 = null;
        if (gn0Var instanceof defpackage.kn0) {
            defpackage.gn0 gn0Var3 = gn0Var2;
            do {
                gn0Var3.getClass();
                gn0Var3 = gn0Var3.AARZUJiTa;
                if (gn0Var3 != null) {
                    java.util.ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = listIterator.previous();
                            if (defpackage.x70.QoRHpC4k(((defpackage.nm0) obj2).xiZrDbcSW0, gn0Var3)) {
                                break;
                            }
                        }
                    }
                    defpackage.nm0 nm0Var2 = (defpackage.nm0) obj2;
                    if (nm0Var2 == null) {
                        nm0Var2 = defpackage.ky.ez2rX8ReCYw(a6Var, gn0Var3, bundle, riuEU0zW4(), this.cnag84Bm);
                    }
                    l6Var2.addFirst(nm0Var2);
                    if (!l6Var.isEmpty() && ((defpackage.nm0) l6Var.last()).xiZrDbcSW0 == gn0Var3) {
                        QoRHpC4k(this, (defpackage.nm0) l6Var.last());
                    }
                }
                if (gn0Var3 == null) {
                    break;
                }
            } while (gn0Var3 != gn0Var);
        }
        defpackage.gn0 gn0Var4 = l6Var2.isEmpty() ? gn0Var2 : ((defpackage.nm0) l6Var2.first()).xiZrDbcSW0;
        while (gn0Var4 != null && F7NU4MC0GW(gn0Var4.xiZrDbcSW0.IHQe1A4L2xu, gn0Var4) != gn0Var4) {
            gn0Var4 = gn0Var4.AARZUJiTa;
            if (gn0Var4 != null) {
                android.os.Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                java.util.ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        obj = null;
                        break;
                    } else {
                        obj = listIterator2.previous();
                        if (defpackage.x70.QoRHpC4k(((defpackage.nm0) obj).xiZrDbcSW0, gn0Var4)) {
                            break;
                        }
                    }
                }
                defpackage.nm0 nm0Var3 = (defpackage.nm0) obj;
                if (nm0Var3 == null) {
                    nm0Var3 = defpackage.ky.ez2rX8ReCYw(a6Var, gn0Var4, gn0Var4.IHQe1A4L2xu(bundle2), riuEU0zW4(), this.cnag84Bm);
                }
                l6Var2.addFirst(nm0Var3);
            }
        }
        if (!l6Var2.isEmpty()) {
            gn0Var2 = ((defpackage.nm0) l6Var2.first()).xiZrDbcSW0;
        }
        while (!l6Var.isEmpty() && (((defpackage.nm0) l6Var.last()).xiZrDbcSW0 instanceof defpackage.kn0)) {
            defpackage.gn0 gn0Var5 = ((defpackage.nm0) l6Var.last()).xiZrDbcSW0;
            gn0Var5.getClass();
            if (((defpackage.kn0) gn0Var5).SH1y5HwkJhh.oh6vYeIP.oh6vYeIP(gn0Var2.xiZrDbcSW0.IHQe1A4L2xu) != null) {
                break;
            } else {
                QoRHpC4k(this, (defpackage.nm0) l6Var.last());
            }
        }
        defpackage.nm0 nm0Var4 = (defpackage.nm0) l6Var.xiZrDbcSW0();
        if (nm0Var4 == null) {
            nm0Var4 = (defpackage.nm0) l6Var2.xiZrDbcSW0();
        }
        if (!defpackage.x70.QoRHpC4k(nm0Var4 != null ? nm0Var4.xiZrDbcSW0 : null, this.r1MBDhnF)) {
            java.util.ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                java.lang.Object previous = listIterator3.previous();
                defpackage.gn0 gn0Var6 = ((defpackage.nm0) previous).xiZrDbcSW0;
                defpackage.kn0 kn0Var = this.r1MBDhnF;
                kn0Var.getClass();
                if (defpackage.x70.QoRHpC4k(gn0Var6, kn0Var)) {
                    obj3 = previous;
                    break;
                }
            }
            defpackage.nm0 nm0Var5 = (defpackage.nm0) obj3;
            if (nm0Var5 == null) {
                defpackage.kn0 kn0Var2 = this.r1MBDhnF;
                kn0Var2.getClass();
                defpackage.kn0 kn0Var3 = this.r1MBDhnF;
                kn0Var3.getClass();
                nm0Var5 = defpackage.ky.ez2rX8ReCYw(a6Var, kn0Var2, kn0Var3.IHQe1A4L2xu(bundle), riuEU0zW4(), this.cnag84Bm);
            }
            l6Var2.addFirst(nm0Var5);
        }
        java.util.Iterator it = l6Var2.iterator();
        while (it.hasNext()) {
            defpackage.nm0 nm0Var6 = (defpackage.nm0) it.next();
            java.lang.Object obj4 = this.fnWB2E7cs.get(this.EgCjBq0SZwJ.oh6vYeIP(nm0Var6.xiZrDbcSW0.adDC3e2L));
            if (obj4 == null) {
                defpackage.db.riuEU0zW4("NavigatorBackStack for ", gn0Var.adDC3e2L, " should already be created");
                return;
            }
            ((defpackage.um0) obj4).IHQe1A4L2xu(nm0Var6);
        }
        l6Var.addAll(l6Var2);
        l6Var.addLast(nm0Var);
        java.util.ArrayList ZNF7fheNE = defpackage.td.ZNF7fheNE(l6Var2, nm0Var);
        int size = ZNF7fheNE.size();
        int i = 0;
        while (i < size) {
            java.lang.Object obj5 = ZNF7fheNE.get(i);
            i++;
            defpackage.nm0 nm0Var7 = (defpackage.nm0) obj5;
            defpackage.kn0 kn0Var4 = nm0Var7.xiZrDbcSW0.AARZUJiTa;
            if (kn0Var4 != null) {
                ez2rX8ReCYw(nm0Var7, xiZrDbcSW0(kn0Var4.xiZrDbcSW0.IHQe1A4L2xu));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02d7, code lost:
    
        r10 = defpackage.td.seT5W8IHOge((java.util.Collection) r8.adDC3e2L.adDC3e2L.getValue());
        r11 = r10.listIterator(r10.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02f1, code lost:
    
        if (r11.hasPrevious() == false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0301, code lost:
    
        if (defpackage.x70.QoRHpC4k(((defpackage.nm0) r11.previous()).SH1y5HwkJhh, r7.SH1y5HwkJhh) == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0303, code lost:
    
        r11 = r11.nextIndex();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x030b, code lost:
    
        r10.set(r11, r7);
        r7 = r8.oh6vYeIP;
        r7.getClass();
        r7.ez2rX8ReCYw(null, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0317, code lost:
    
        monitor-exit(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x030a, code lost:
    
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0308, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x031a, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x031b, code lost:
    
        r24 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x021f, code lost:
    
        if (r27.xiZrDbcSW0.IHQe1A4L2xu == r6.xiZrDbcSW0.IHQe1A4L2xu) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x020c, code lost:
    
        if (r10.equals(r6) == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0221, code lost:
    
        r6 = new defpackage.l6();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x022c, code lost:
    
        if (defpackage.fm.nBH8hAHy(r26.xiZrDbcSW0) < r7) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x022e, code lost:
    
        r9 = (defpackage.nm0) defpackage.yd.QUKZkWRtw6(r26.xiZrDbcSW0);
        EgCjBq0SZwJ(r9);
        r16 = new defpackage.nm0(r9.adDC3e2L, r9.xiZrDbcSW0, r9.xiZrDbcSW0.IHQe1A4L2xu(r28), r9.EXtogiMhuM, r9.riuEU0zW4, r9.SH1y5HwkJhh, r9.ez2rX8ReCYw);
        r10 = r16.JlrlGoKF;
        r11 = r9.EXtogiMhuM;
        r10.getClass();
        r11.getClass();
        r10.F7NU4MC0GW = r11;
        r10 = r16.JlrlGoKF;
        r9 = r9.JlrlGoKF.ez2rX8ReCYw;
        r10.getClass();
        r9.getClass();
        r10.ez2rX8ReCYw = r9;
        r10.oh6vYeIP();
        r6.addFirst(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0283, code lost:
    
        r7 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x028b, code lost:
    
        if (r7.hasNext() == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x028d, code lost:
    
        r8 = (defpackage.nm0) r7.next();
        r9 = r8.xiZrDbcSW0.AARZUJiTa;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0297, code lost:
    
        if (r9 == null) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0299, code lost:
    
        ez2rX8ReCYw(r8, xiZrDbcSW0(r9.xiZrDbcSW0.IHQe1A4L2xu));
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02a4, code lost:
    
        r26.xiZrDbcSW0.addLast(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02aa, code lost:
    
        r6 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02b2, code lost:
    
        if (r6.hasNext() == false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02b4, code lost:
    
        r7 = (defpackage.nm0) r6.next();
        r8 = r26.EgCjBq0SZwJ.oh6vYeIP(r7.xiZrDbcSW0.adDC3e2L);
        r9 = r7.xiZrDbcSW0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02c6, code lost:
    
        if (r9 == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02c9, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02ca, code lost:
    
        if (r9 != null) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02cd, code lost:
    
        r8.r1MBDhnF(r9);
        r8 = r8.oh6vYeIP();
        r9 = r8.IHQe1A4L2xu;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02d6, code lost:
    
        monitor-enter(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010e A[LOOP:1: B:13:0x004e->B:22:0x010e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0114 A[EDGE_INSN: B:23:0x0114->B:24:0x0114 BREAK  A[LOOP:1: B:13:0x004e->B:22:0x010e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0360 A[LOOP:2: B:38:0x035a->B:40:0x0360, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void JlrlGoKF(defpackage.gn0 gn0Var, android.os.Bundle bundle, defpackage.co0 co0Var) {
        boolean z;
        boolean z2;
        java.util.ListIterator listIterator;
        int i;
        java.util.Iterator it;
        java.lang.Object obj;
        java.util.ListIterator listIterator2;
        android.os.Bundle bundle2;
        java.lang.Object obj2;
        boolean z3;
        gn0Var.getClass();
        java.util.Iterator it2 = this.fnWB2E7cs.values().iterator();
        while (it2.hasNext()) {
            ((defpackage.um0) it2.next()).F7NU4MC0GW = true;
        }
        defpackage.nz0 nz0Var = new defpackage.nz0();
        if (co0Var != null) {
            java.lang.String str = co0Var.EXtogiMhuM;
            if (str != null) {
                boolean z4 = co0Var.F7NU4MC0GW;
                boolean z5 = co0Var.adDC3e2L;
                str.getClass();
                defpackage.l6 l6Var = this.xiZrDbcSW0;
                if (!l6Var.isEmpty()) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.ListIterator listIterator3 = l6Var.listIterator(l6Var.IHQe1A4L2xu());
                    while (true) {
                        if (!listIterator3.hasPrevious()) {
                            obj = null;
                            break;
                        }
                        obj = listIterator3.previous();
                        defpackage.nm0 nm0Var = (defpackage.nm0) obj;
                        defpackage.gn0 gn0Var2 = nm0Var.xiZrDbcSW0;
                        android.os.Bundle IHQe1A4L2xu = nm0Var.JlrlGoKF.IHQe1A4L2xu();
                        gn0Var2.getClass();
                        defpackage.jn0 jn0Var = gn0Var2.xiZrDbcSW0;
                        jn0Var.getClass();
                        if (!defpackage.x70.QoRHpC4k((java.lang.String) jn0Var.adDC3e2L, str)) {
                            defpackage.fn0 IHQe1A4L2xu2 = jn0Var.IHQe1A4L2xu(str);
                            if (((defpackage.gn0) jn0Var.oh6vYeIP).equals(IHQe1A4L2xu2 != null ? IHQe1A4L2xu2.adDC3e2L : null)) {
                                android.os.Bundle bundle3 = IHQe1A4L2xu2.xiZrDbcSW0;
                                if (IHQe1A4L2xu != null && bundle3 != null) {
                                    java.util.Set<java.lang.String> keySet = bundle3.keySet();
                                    keySet.getClass();
                                    for (java.lang.String str2 : keySet) {
                                        str2.getClass();
                                        if (IHQe1A4L2xu.containsKey(str2)) {
                                            listIterator2 = listIterator3;
                                            defpackage.mm0 mm0Var = (defpackage.mm0) IHQe1A4L2xu2.adDC3e2L.oh6vYeIP().get(str2);
                                            defpackage.eo0 eo0Var = mm0Var != null ? mm0Var.IHQe1A4L2xu : null;
                                            if (eo0Var != null) {
                                                bundle2 = bundle3;
                                                obj2 = eo0Var.IHQe1A4L2xu(bundle3, str2);
                                            } else {
                                                bundle2 = bundle3;
                                                obj2 = null;
                                            }
                                            java.lang.Object IHQe1A4L2xu3 = eo0Var != null ? eo0Var.IHQe1A4L2xu(IHQe1A4L2xu, str2) : null;
                                            if (eo0Var != null && !eo0Var.xiZrDbcSW0(obj2, IHQe1A4L2xu3)) {
                                                z3 = false;
                                                break;
                                            } else {
                                                listIterator3 = listIterator2;
                                                bundle3 = bundle2;
                                            }
                                        }
                                    }
                                }
                            }
                            listIterator2 = listIterator3;
                            z3 = false;
                            if (!z4 || !z3) {
                                arrayList.add(this.EgCjBq0SZwJ.oh6vYeIP(nm0Var.xiZrDbcSW0.adDC3e2L));
                            }
                            if (!z3) {
                                break;
                            } else {
                                listIterator3 = listIterator2;
                            }
                        }
                        listIterator2 = listIterator3;
                        z3 = true;
                        if (!z4) {
                        }
                        arrayList.add(this.EgCjBq0SZwJ.oh6vYeIP(nm0Var.xiZrDbcSW0.adDC3e2L));
                        if (!z3) {
                        }
                    }
                    defpackage.nm0 nm0Var2 = (defpackage.nm0) obj;
                    defpackage.gn0 gn0Var3 = nm0Var2 != null ? nm0Var2.xiZrDbcSW0 : null;
                    if (gn0Var3 == null) {
                        android.util.Log.i("NavController", "Ignoring popBackStack to route " + str + " as it was not found on the current back stack");
                    } else {
                        z = r1MBDhnF(arrayList, gn0Var3, z4, z5);
                    }
                }
            } else {
                int i2 = co0Var.r1MBDhnF;
                if (i2 != -1) {
                    z = SyNS6RMn(i2, co0Var.F7NU4MC0GW, co0Var.adDC3e2L);
                }
            }
            android.os.Bundle IHQe1A4L2xu4 = gn0Var.IHQe1A4L2xu(bundle);
            if (co0Var == null && co0Var.oh6vYeIP && this.JlrlGoKF.containsKey(java.lang.Integer.valueOf(gn0Var.xiZrDbcSW0.IHQe1A4L2xu))) {
                nz0Var.adDC3e2L = kd6TUFXn(gn0Var.xiZrDbcSW0.IHQe1A4L2xu, IHQe1A4L2xu4, co0Var);
                z2 = false;
            } else {
                if (co0Var != null && co0Var.IHQe1A4L2xu) {
                    defpackage.nm0 AARZUJiTa = AARZUJiTa();
                    defpackage.l6 l6Var2 = this.xiZrDbcSW0;
                    listIterator = l6Var2.listIterator(l6Var2.IHQe1A4L2xu());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            if (((defpackage.nm0) listIterator.previous()).xiZrDbcSW0 == gn0Var) {
                                i = listIterator.nextIndex();
                                break;
                            }
                        } else {
                            i = -1;
                            break;
                        }
                    }
                    if (i != -1) {
                        if (gn0Var instanceof defpackage.kn0) {
                            int i3 = defpackage.kn0.ez2rX8ReCYw;
                            java.util.List wll2JLbTBC2 = defpackage.a81.wll2JLbTBC2(new defpackage.ue1(defpackage.a81.yIx6ChFVk((defpackage.kn0) gn0Var, new defpackage.uc0(15)), new defpackage.uc0(12), 1));
                            if (this.xiZrDbcSW0.AARZUJiTa - i == wll2JLbTBC2.size()) {
                                defpackage.l6 l6Var3 = this.xiZrDbcSW0;
                                java.util.List subList = l6Var3.subList(i, l6Var3.AARZUJiTa);
                                java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.ud.EoOhNTTfIN7K(subList, 10));
                                java.util.Iterator it3 = subList.iterator();
                                while (it3.hasNext()) {
                                    arrayList2.add(java.lang.Integer.valueOf(((defpackage.nm0) it3.next()).xiZrDbcSW0.xiZrDbcSW0.IHQe1A4L2xu));
                                }
                            }
                        } else if (AARZUJiTa != null) {
                            defpackage.gn0 gn0Var4 = AARZUJiTa.xiZrDbcSW0;
                            if (gn0Var4 != null) {
                            }
                        }
                        if (!z2) {
                            defpackage.nm0 ez2rX8ReCYw = defpackage.ky.ez2rX8ReCYw(this.IHQe1A4L2xu.r1MBDhnF, gn0Var, IHQe1A4L2xu4, riuEU0zW4(), this.cnag84Bm);
                            defpackage.oo0 oh6vYeIP = this.EgCjBq0SZwJ.oh6vYeIP(gn0Var.adDC3e2L);
                            java.util.List p4kuH6PDtgom = defpackage.fm.p4kuH6PDtgom(ez2rX8ReCYw);
                            this.kNAkVymC = new defpackage.t3(nz0Var, this, gn0Var, IHQe1A4L2xu4);
                            oh6vYeIP.F7NU4MC0GW(p4kuH6PDtgom, co0Var);
                            this.kNAkVymC = null;
                        }
                    }
                }
                z2 = false;
                if (!z2) {
                }
            }
            this.oh6vYeIP.IHQe1A4L2xu();
            it = this.fnWB2E7cs.values().iterator();
            while (it.hasNext()) {
                ((defpackage.um0) it.next()).F7NU4MC0GW = false;
            }
            if (z && !nz0Var.adDC3e2L && !z2) {
                fnWB2E7cs();
                return;
            }
            oh6vYeIP();
        }
        z = false;
        android.os.Bundle IHQe1A4L2xu42 = gn0Var.IHQe1A4L2xu(bundle);
        if (co0Var == null) {
        }
        if (co0Var != null) {
            defpackage.nm0 AARZUJiTa2 = AARZUJiTa();
            defpackage.l6 l6Var22 = this.xiZrDbcSW0;
            listIterator = l6Var22.listIterator(l6Var22.IHQe1A4L2xu());
            while (true) {
                if (!listIterator.hasPrevious()) {
                }
            }
            if (i != -1) {
            }
        }
        z2 = false;
        if (!z2) {
        }
        this.oh6vYeIP.IHQe1A4L2xu();
        it = this.fnWB2E7cs.values().iterator();
        while (it.hasNext()) {
        }
        if (z) {
        }
        oh6vYeIP();
    }

    public final defpackage.kn0 SH1y5HwkJhh() {
        defpackage.gn0 gn0Var;
        defpackage.nm0 nm0Var = (defpackage.nm0) this.xiZrDbcSW0.EXtogiMhuM();
        if (nm0Var == null || (gn0Var = nm0Var.xiZrDbcSW0) == null) {
            gn0Var = this.r1MBDhnF;
            gn0Var.getClass();
        }
        defpackage.kn0 kn0Var = gn0Var instanceof defpackage.kn0 ? (defpackage.kn0) gn0Var : null;
        if (kn0Var != null) {
            return kn0Var;
        }
        defpackage.kn0 kn0Var2 = gn0Var.AARZUJiTa;
        kn0Var2.getClass();
        return kn0Var2;
    }

    public final boolean SyNS6RMn(int i, boolean z, boolean z2) {
        defpackage.gn0 gn0Var;
        defpackage.l6 l6Var = this.xiZrDbcSW0;
        if (l6Var.isEmpty()) {
            return false;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = defpackage.td.k3hcgHS3MP(l6Var).iterator();
        while (true) {
            if (!it.hasNext()) {
                gn0Var = null;
                break;
            }
            gn0Var = ((defpackage.nm0) it.next()).xiZrDbcSW0;
            java.lang.String str = gn0Var.adDC3e2L;
            defpackage.jn0 jn0Var = gn0Var.xiZrDbcSW0;
            defpackage.oo0 oh6vYeIP = this.EgCjBq0SZwJ.oh6vYeIP(str);
            if (z || jn0Var.IHQe1A4L2xu != i) {
                arrayList.add(oh6vYeIP);
            }
            if (jn0Var.IHQe1A4L2xu == i) {
                break;
            }
        }
        if (gn0Var != null) {
            return r1MBDhnF(arrayList, gn0Var, z, z2);
        }
        int i2 = defpackage.gn0.riuEU0zW4;
        android.util.Log.i("NavController", "Ignoring popBackStack to destination " + defpackage.x80.V7bD7b8KA(this.IHQe1A4L2xu.r1MBDhnF, i) + " as it was not found on the current back stack");
        return false;
    }

    public final void cnag84Bm(defpackage.nm0 nm0Var, boolean z, defpackage.l6 l6Var) {
        defpackage.zm0 zm0Var;
        defpackage.xy0 xy0Var;
        java.util.Set set;
        nm0Var.getClass();
        defpackage.l6 l6Var2 = this.xiZrDbcSW0;
        defpackage.nm0 nm0Var2 = (defpackage.nm0) l6Var2.last();
        if (!defpackage.x70.QoRHpC4k(nm0Var2, nm0Var)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Attempted to pop ");
            sb.append(nm0Var.xiZrDbcSW0);
            defpackage.gn0 gn0Var = nm0Var2.xiZrDbcSW0;
            sb.append(", which is not the top of the back stack (");
            sb.append(gn0Var);
            sb.append(')');
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        defpackage.yd.QUKZkWRtw6(l6Var2);
        defpackage.um0 um0Var = (defpackage.um0) this.fnWB2E7cs.get(this.EgCjBq0SZwJ.oh6vYeIP(nm0Var2.xiZrDbcSW0.adDC3e2L));
        boolean z2 = true;
        if ((um0Var == null || (xy0Var = um0Var.xiZrDbcSW0) == null || (set = (java.util.Set) xy0Var.adDC3e2L.getValue()) == null || !set.contains(nm0Var2)) && !this.ez2rX8ReCYw.containsKey(nm0Var2)) {
            z2 = false;
        }
        defpackage.nd0 nd0Var = nm0Var2.JlrlGoKF.SH1y5HwkJhh.EXtogiMhuM;
        defpackage.nd0 nd0Var2 = defpackage.nd0.AARZUJiTa;
        if (nd0Var.compareTo(nd0Var2) >= 0) {
            if (z) {
                nm0Var2.IHQe1A4L2xu(nd0Var2);
                l6Var.addFirst(new defpackage.rm0(nm0Var2));
            }
            if (z2) {
                nm0Var2.IHQe1A4L2xu(nd0Var2);
            } else {
                nm0Var2.IHQe1A4L2xu(defpackage.nd0.adDC3e2L);
                EgCjBq0SZwJ(nm0Var2);
            }
        }
        if (z || z2 || (zm0Var = this.cnag84Bm) == null) {
            return;
        }
        java.lang.String str = nm0Var2.SH1y5HwkJhh;
        str.getClass();
        defpackage.bn1 bn1Var = (defpackage.bn1) zm0Var.oh6vYeIP.remove(str);
        if (bn1Var != null) {
            bn1Var.IHQe1A4L2xu();
        }
    }

    public final void ez2rX8ReCYw(defpackage.nm0 nm0Var, defpackage.nm0 nm0Var2) {
        this.SH1y5HwkJhh.put(nm0Var, nm0Var2);
        java.util.LinkedHashMap linkedHashMap = this.ez2rX8ReCYw;
        if (linkedHashMap.get(nm0Var2) == null) {
            linkedHashMap.put(nm0Var2, new defpackage.x6());
        }
        java.lang.Object obj = linkedHashMap.get(nm0Var2);
        obj.getClass();
        ((defpackage.x6) obj).IHQe1A4L2xu.incrementAndGet();
    }

    public final void fnWB2E7cs() {
        defpackage.x6 x6Var;
        defpackage.xy0 xy0Var;
        java.util.Set set;
        java.util.ArrayList seT5W8IHOge = defpackage.td.seT5W8IHOge(this.xiZrDbcSW0);
        if (seT5W8IHOge.isEmpty()) {
            return;
        }
        java.util.ArrayList wll2JLbTBC2 = defpackage.fm.wll2JLbTBC2(((defpackage.nm0) defpackage.td.NWDBeGGF(seT5W8IHOge)).xiZrDbcSW0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (defpackage.td.NWDBeGGF(wll2JLbTBC2) instanceof defpackage.mo) {
            java.util.Iterator it = defpackage.td.k3hcgHS3MP(seT5W8IHOge).iterator();
            while (it.hasNext()) {
                defpackage.gn0 gn0Var = ((defpackage.nm0) it.next()).xiZrDbcSW0;
                arrayList.add(gn0Var);
                if (!(gn0Var instanceof defpackage.mo) && !(gn0Var instanceof defpackage.kn0)) {
                    break;
                }
            }
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        for (defpackage.nm0 nm0Var : defpackage.td.k3hcgHS3MP(seT5W8IHOge)) {
            defpackage.nd0 nd0Var = nm0Var.JlrlGoKF.ez2rX8ReCYw;
            defpackage.gn0 gn0Var2 = nm0Var.xiZrDbcSW0;
            defpackage.gn0 gn0Var3 = (defpackage.gn0) defpackage.td.gG5uWf3dqScO(wll2JLbTBC2);
            defpackage.nd0 nd0Var2 = defpackage.nd0.riuEU0zW4;
            defpackage.nd0 nd0Var3 = defpackage.nd0.EXtogiMhuM;
            if (gn0Var3 != null && gn0Var3.xiZrDbcSW0.IHQe1A4L2xu == gn0Var2.xiZrDbcSW0.IHQe1A4L2xu) {
                if (nd0Var != nd0Var2) {
                    defpackage.um0 um0Var = (defpackage.um0) this.fnWB2E7cs.get(this.EgCjBq0SZwJ.oh6vYeIP(nm0Var.xiZrDbcSW0.adDC3e2L));
                    if (defpackage.x70.QoRHpC4k((um0Var == null || (xy0Var = um0Var.xiZrDbcSW0) == null || (set = (java.util.Set) xy0Var.adDC3e2L.getValue()) == null) ? null : java.lang.Boolean.valueOf(set.contains(nm0Var)), java.lang.Boolean.TRUE) || ((x6Var = (defpackage.x6) this.ez2rX8ReCYw.get(nm0Var)) != null && x6Var.IHQe1A4L2xu.get() == 0)) {
                        hashMap.put(nm0Var, nd0Var3);
                    } else {
                        hashMap.put(nm0Var, nd0Var2);
                    }
                }
                defpackage.gn0 gn0Var4 = (defpackage.gn0) defpackage.td.gG5uWf3dqScO(arrayList);
                if (gn0Var4 != null && gn0Var4.xiZrDbcSW0.IHQe1A4L2xu == gn0Var2.xiZrDbcSW0.IHQe1A4L2xu) {
                    defpackage.yd.RmCzwkUxICV(arrayList);
                }
                defpackage.yd.RmCzwkUxICV(wll2JLbTBC2);
                defpackage.kn0 kn0Var = gn0Var2.AARZUJiTa;
                if (kn0Var != null) {
                    wll2JLbTBC2.add(kn0Var);
                }
            } else if (arrayList.isEmpty() || gn0Var2.xiZrDbcSW0.IHQe1A4L2xu != ((defpackage.gn0) defpackage.td.JcqDrWrgMf(arrayList)).xiZrDbcSW0.IHQe1A4L2xu) {
                nm0Var.IHQe1A4L2xu(defpackage.nd0.AARZUJiTa);
            } else {
                defpackage.gn0 gn0Var5 = (defpackage.gn0) defpackage.yd.RmCzwkUxICV(arrayList);
                if (nd0Var == nd0Var2) {
                    nm0Var.IHQe1A4L2xu(nd0Var3);
                } else if (nd0Var != nd0Var3) {
                    hashMap.put(nm0Var, nd0Var3);
                }
                defpackage.kn0 kn0Var2 = gn0Var5.AARZUJiTa;
                if (kn0Var2 != null && !arrayList.contains(kn0Var2)) {
                    arrayList.add(kn0Var2);
                }
            }
        }
        int size = seT5W8IHOge.size();
        int i = 0;
        while (i < size) {
            java.lang.Object obj = seT5W8IHOge.get(i);
            i++;
            defpackage.nm0 nm0Var2 = (defpackage.nm0) obj;
            defpackage.nd0 nd0Var4 = (defpackage.nd0) hashMap.get(nm0Var2);
            if (nd0Var4 != null) {
                nm0Var2.IHQe1A4L2xu(nd0Var4);
            } else {
                nm0Var2.JlrlGoKF.oh6vYeIP();
            }
        }
    }

    public final boolean kd6TUFXn(int i, android.os.Bundle bundle, defpackage.co0 co0Var) {
        defpackage.gn0 gn0Var;
        defpackage.nm0 nm0Var;
        defpackage.gn0 gn0Var2;
        android.os.Bundle bundle2;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i);
        java.util.LinkedHashMap linkedHashMap = this.JlrlGoKF;
        int i2 = 0;
        if (!linkedHashMap.containsKey(valueOf)) {
            return false;
        }
        java.lang.String str = (java.lang.String) linkedHashMap.get(java.lang.Integer.valueOf(i));
        java.util.Collection values = linkedHashMap.values();
        values.getClass();
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            if (defpackage.x70.QoRHpC4k((java.lang.String) it.next(), str)) {
                it.remove();
            }
        }
        defpackage.l6 l6Var = (defpackage.l6) defpackage.mj1.fnWB2E7cs(this.DFo87pBq1E5).remove(str);
        defpackage.a6 a6Var = this.IHQe1A4L2xu.r1MBDhnF;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.nm0 nm0Var2 = (defpackage.nm0) this.xiZrDbcSW0.EXtogiMhuM();
        if ((nm0Var2 == null || (gn0Var = nm0Var2.xiZrDbcSW0) == null) && (gn0Var = this.r1MBDhnF) == null) {
            defpackage.db.AARZUJiTa("You must call setGraph() before calling getGraph()");
            return false;
        }
        if (l6Var != null) {
            java.util.Iterator it2 = l6Var.iterator();
            while (it2.hasNext()) {
                defpackage.rm0 rm0Var = (defpackage.rm0) it2.next();
                defpackage.r2 r2Var = rm0Var.IHQe1A4L2xu;
                defpackage.r2 r2Var2 = rm0Var.IHQe1A4L2xu;
                defpackage.gn0 adDC3e2L = adDC3e2L(r2Var.IHQe1A4L2xu, gn0Var, null, true);
                if (adDC3e2L == null) {
                    int i3 = defpackage.gn0.riuEU0zW4;
                    defpackage.db.G3OKOH3wZRC("Restore State failed: destination ", defpackage.x80.V7bD7b8KA(a6Var, r2Var2.IHQe1A4L2xu), " cannot be found from the current destination ", gn0Var);
                    return false;
                }
                defpackage.nd0 riuEU0zW4 = riuEU0zW4();
                defpackage.zm0 zm0Var = this.cnag84Bm;
                a6Var.getClass();
                riuEU0zW4.getClass();
                android.os.Bundle bundle3 = (android.os.Bundle) r2Var2.r1MBDhnF;
                if (bundle3 != null) {
                    android.content.Context context = a6Var.IHQe1A4L2xu;
                    bundle3.setClassLoader(context != null ? context.getClassLoader() : null);
                    bundle2 = bundle3;
                } else {
                    bundle2 = null;
                }
                java.lang.String str2 = (java.lang.String) r2Var2.oh6vYeIP;
                android.os.Bundle bundle4 = (android.os.Bundle) r2Var2.F7NU4MC0GW;
                str2.getClass();
                arrayList.add(new defpackage.nm0(a6Var, adDC3e2L, bundle2, riuEU0zW4, zm0Var, str2, bundle4));
                gn0Var = adDC3e2L;
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            java.lang.Object obj = arrayList.get(i4);
            i4++;
            if (!(((defpackage.nm0) obj).xiZrDbcSW0 instanceof defpackage.kn0)) {
                arrayList3.add(obj);
            }
        }
        int size2 = arrayList3.size();
        int i5 = 0;
        while (i5 < size2) {
            java.lang.Object obj2 = arrayList3.get(i5);
            i5++;
            defpackage.nm0 nm0Var3 = (defpackage.nm0) obj2;
            java.util.List list = (java.util.List) defpackage.td.FyULxpbU8bu(arrayList2);
            if (defpackage.x70.QoRHpC4k((list == null || (nm0Var = (defpackage.nm0) defpackage.td.NWDBeGGF(list)) == null || (gn0Var2 = nm0Var.xiZrDbcSW0) == null) ? null : gn0Var2.adDC3e2L, nm0Var3.xiZrDbcSW0.adDC3e2L)) {
                list.add(nm0Var3);
            } else {
                arrayList2.add(defpackage.fm.wll2JLbTBC2(nm0Var3));
            }
        }
        defpackage.nz0 nz0Var = new defpackage.nz0();
        int size3 = arrayList2.size();
        while (i2 < size3) {
            java.lang.Object obj3 = arrayList2.get(i2);
            i2++;
            java.util.List list2 = (java.util.List) obj3;
            defpackage.oo0 oh6vYeIP = this.EgCjBq0SZwJ.oh6vYeIP(((defpackage.nm0) defpackage.td.JcqDrWrgMf(list2)).xiZrDbcSW0.adDC3e2L);
            java.util.ArrayList arrayList4 = arrayList;
            this.kNAkVymC = new defpackage.ek0(nz0Var, arrayList4, new defpackage.pz0(), this, bundle);
            oh6vYeIP.F7NU4MC0GW(list2, co0Var);
            this.kNAkVymC = null;
            arrayList = arrayList4;
        }
        return nz0Var.adDC3e2L;
    }

    public final boolean oh6vYeIP() {
        defpackage.l6 l6Var;
        while (true) {
            l6Var = this.xiZrDbcSW0;
            if (l6Var.isEmpty() || !(((defpackage.nm0) l6Var.last()).xiZrDbcSW0 instanceof defpackage.kn0)) {
                break;
            }
            QoRHpC4k(this, (defpackage.nm0) l6Var.last());
        }
        defpackage.nm0 nm0Var = (defpackage.nm0) l6Var.EXtogiMhuM();
        java.util.ArrayList arrayList = this.NHJTzaLwkd;
        if (nm0Var != null) {
            arrayList.add(nm0Var);
        }
        this.abhbClRa++;
        fnWB2E7cs();
        int i = this.abhbClRa - 1;
        this.abhbClRa = i;
        if (i == 0) {
            java.util.ArrayList seT5W8IHOge = defpackage.td.seT5W8IHOge(arrayList);
            arrayList.clear();
            int size = seT5W8IHOge.size();
            int i2 = 0;
            while (i2 < size) {
                java.lang.Object obj = seT5W8IHOge.get(i2);
                i2++;
                defpackage.nm0 nm0Var2 = (defpackage.nm0) obj;
                java.util.Iterator it = defpackage.td.boH8X4DXyc4(this.QoRHpC4k).iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        defpackage.db.kd6TUFXn();
                        return false;
                    }
                    defpackage.gn0 gn0Var = nm0Var2.xiZrDbcSW0;
                    nm0Var2.JlrlGoKF.IHQe1A4L2xu();
                    throw null;
                }
                this.QQUzIjv3iOC5.G3OKOH3wZRC(nm0Var2);
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(l6Var);
            defpackage.hc1 hc1Var = this.AARZUJiTa;
            hc1Var.getClass();
            hc1Var.ez2rX8ReCYw(null, arrayList2);
            java.util.ArrayList G3OKOH3wZRC = G3OKOH3wZRC();
            defpackage.hc1 hc1Var2 = this.EXtogiMhuM;
            hc1Var2.getClass();
            hc1Var2.ez2rX8ReCYw(null, G3OKOH3wZRC);
        }
        return nm0Var != null;
    }

    public final boolean r1MBDhnF(java.util.ArrayList arrayList, defpackage.gn0 gn0Var, boolean z, boolean z2) {
        boolean z3;
        defpackage.nz0 nz0Var = new defpackage.nz0();
        defpackage.l6 l6Var = new defpackage.l6();
        int size = arrayList.size();
        final int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z3 = z2;
                break;
            }
            int i3 = i2 + 1;
            defpackage.oo0 oo0Var = (defpackage.oo0) arrayList.get(i2);
            defpackage.nz0 nz0Var2 = new defpackage.nz0();
            defpackage.nm0 nm0Var = (defpackage.nm0) this.xiZrDbcSW0.last();
            z3 = z2;
            defpackage.wm0 wm0Var = new defpackage.wm0(nz0Var2, nz0Var, this, z3, l6Var);
            oo0Var.getClass();
            nm0Var.getClass();
            this.V7bD7b8KA = wm0Var;
            oo0Var.adDC3e2L(nm0Var, z3);
            this.V7bD7b8KA = null;
            if (!nz0Var2.adDC3e2L) {
                break;
            }
            i2 = i3;
        }
        if (z3) {
            java.util.LinkedHashMap linkedHashMap = this.JlrlGoKF;
            if (!z) {
                defpackage.qv qvVar = new defpackage.qv(new defpackage.ue1(defpackage.a81.yIx6ChFVk(gn0Var, new defpackage.uc0(10)), new defpackage.g00(this) { // from class: xm0
                    public final /* synthetic */ defpackage.ym0 xiZrDbcSW0;

                    {
                        this.xiZrDbcSW0 = this;
                    }

                    @Override // defpackage.g00
                    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
                        boolean containsKey;
                        int i4 = i;
                        defpackage.ym0 ym0Var = this.xiZrDbcSW0;
                        defpackage.gn0 gn0Var2 = (defpackage.gn0) obj;
                        switch (i4) {
                            case 0:
                                gn0Var2.getClass();
                                containsKey = ym0Var.JlrlGoKF.containsKey(java.lang.Integer.valueOf(gn0Var2.xiZrDbcSW0.IHQe1A4L2xu));
                                break;
                            default:
                                gn0Var2.getClass();
                                containsKey = ym0Var.JlrlGoKF.containsKey(java.lang.Integer.valueOf(gn0Var2.xiZrDbcSW0.IHQe1A4L2xu));
                                break;
                        }
                        return java.lang.Boolean.valueOf(!containsKey);
                    }
                }, 0));
                while (qvVar.hasNext()) {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(((defpackage.gn0) qvVar.next()).xiZrDbcSW0.IHQe1A4L2xu);
                    defpackage.rm0 rm0Var = (defpackage.rm0) l6Var.xiZrDbcSW0();
                    linkedHashMap.put(valueOf, rm0Var != null ? (java.lang.String) rm0Var.IHQe1A4L2xu.oh6vYeIP : null);
                }
            }
            if (!l6Var.isEmpty()) {
                defpackage.r2 r2Var = ((defpackage.rm0) l6Var.first()).IHQe1A4L2xu;
                final int i4 = 1;
                defpackage.qv qvVar2 = new defpackage.qv(new defpackage.ue1(defpackage.a81.yIx6ChFVk(F7NU4MC0GW(r2Var.IHQe1A4L2xu, null), new defpackage.uc0(11)), new defpackage.g00(this) { // from class: xm0
                    public final /* synthetic */ defpackage.ym0 xiZrDbcSW0;

                    {
                        this.xiZrDbcSW0 = this;
                    }

                    @Override // defpackage.g00
                    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
                        boolean containsKey;
                        int i42 = i4;
                        defpackage.ym0 ym0Var = this.xiZrDbcSW0;
                        defpackage.gn0 gn0Var2 = (defpackage.gn0) obj;
                        switch (i42) {
                            case 0:
                                gn0Var2.getClass();
                                containsKey = ym0Var.JlrlGoKF.containsKey(java.lang.Integer.valueOf(gn0Var2.xiZrDbcSW0.IHQe1A4L2xu));
                                break;
                            default:
                                gn0Var2.getClass();
                                containsKey = ym0Var.JlrlGoKF.containsKey(java.lang.Integer.valueOf(gn0Var2.xiZrDbcSW0.IHQe1A4L2xu));
                                break;
                        }
                        return java.lang.Boolean.valueOf(!containsKey);
                    }
                }, 0));
                while (qvVar2.hasNext()) {
                    linkedHashMap.put(java.lang.Integer.valueOf(((defpackage.gn0) qvVar2.next()).xiZrDbcSW0.IHQe1A4L2xu), (java.lang.String) r2Var.oh6vYeIP);
                }
                if (linkedHashMap.values().contains((java.lang.String) r2Var.oh6vYeIP)) {
                    this.DFo87pBq1E5.put((java.lang.String) r2Var.oh6vYeIP, l6Var);
                }
            }
        }
        this.oh6vYeIP.IHQe1A4L2xu();
        return nz0Var.adDC3e2L;
    }

    public final defpackage.nd0 riuEU0zW4() {
        return this.SyNS6RMn == null ? defpackage.nd0.AARZUJiTa : this.G3OKOH3wZRC;
    }

    public final defpackage.nm0 xiZrDbcSW0(int i) {
        java.lang.Object obj;
        defpackage.l6 l6Var = this.xiZrDbcSW0;
        java.util.ListIterator<E> listIterator = l6Var.listIterator(l6Var.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((defpackage.nm0) obj).xiZrDbcSW0.xiZrDbcSW0.IHQe1A4L2xu == i) {
                break;
            }
        }
        defpackage.nm0 nm0Var = (defpackage.nm0) obj;
        if (nm0Var != null) {
            return nm0Var;
        }
        java.lang.StringBuilder JlrlGoKF = defpackage.fx0.JlrlGoKF(i, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        JlrlGoKF.append(EXtogiMhuM());
        throw new java.lang.IllegalArgumentException(JlrlGoKF.toString().toString());
    }
}
