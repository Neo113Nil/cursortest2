package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class eSwlWMUpitz8 implements defpackage.y10 {
    public final /* synthetic */ java.lang.Object P05cfTpS5W5L;
    public final /* synthetic */ java.lang.Object QiMR8OkAhezm;
    public final /* synthetic */ int WDYagTQQm9ns;
    public final /* synthetic */ java.lang.Object oh71FJcDz6S2;

    public /* synthetic */ eSwlWMUpitz8(defpackage.wk wkVar, defpackage.qs1 qs1Var, defpackage.cb0 cb0Var, defpackage.w91 w91Var) {
        this.WDYagTQQm9ns = 2;
        this.QiMR8OkAhezm = wkVar;
        this.oh71FJcDz6S2 = cb0Var;
        this.P05cfTpS5W5L = w91Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 17, insn: 0x098f: MOVE (r3 I:??[OBJECT, ARRAY]) = (r17 I:??[OBJECT, ARRAY]) (LINE:2448), block:B:429:0x098f */
    /* JADX WARN: Type inference failed for: r2v23, types: [sg0, vg0] */
    @Override // defpackage.y10
    public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj) {
        defpackage.id idVar;
        defpackage.id idVar2;
        int i;
        java.util.List actions;
        defpackage.nh nhVar;
        boolean shouldShowIcon;
        android.graphics.drawable.Drawable icon;
        boolean z;
        defpackage.hg0 hg0Var;
        java.lang.Integer WDYagTQQm9ns;
        java.lang.Integer JhCgjQRTAOCT;
        java.lang.Integer JhCgjQRTAOCT2;
        java.lang.Integer WDYagTQQm9ns2;
        defpackage.bn1 bn1Var;
        defpackage.bn1 bn1Var2;
        defpackage.cn1 cn1Var;
        defpackage.cn1 cn1Var2;
        defpackage.bn1 bn1Var3;
        defpackage.bn1 bn1Var4;
        defpackage.cn1 cn1Var3;
        defpackage.cn1 cn1Var4;
        java.lang.Integer JhCgjQRTAOCT3;
        java.lang.Integer WDYagTQQm9ns3;
        java.lang.Integer WDYagTQQm9ns4;
        java.lang.Integer JhCgjQRTAOCT4;
        defpackage.pd1 pd1Var;
        int i2 = this.WDYagTQQm9ns;
        int i3 = 6;
        int i4 = 21;
        int i5 = 3;
        final int i6 = 2;
        defpackage.kl klVar = null;
        defpackage.nm1 nm1Var = null;
        r9 = null;
        defpackage.nm1 nm1Var2 = null;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        int i7 = 4;
        java.lang.Object obj2 = this.P05cfTpS5W5L;
        java.lang.Object obj3 = this.oh71FJcDz6S2;
        java.lang.Object obj4 = this.QiMR8OkAhezm;
        int i8 = 1;
        switch (i2) {
            case 0:
                defpackage.wg0 wg0Var = (defpackage.wg0) obj4;
                int i9 = 0;
                defpackage.mnkwqFSfsWTC mnkwqfsfswtc = new defpackage.mnkwqFSfsWTC(i9, (defpackage.y10) obj3);
                wg0Var.QiMR8OkAhezm().ZpBGe2uQfcn8(mnkwqfsfswtc);
                return new defpackage.pf0OXpZQoaz3((defpackage.n10) obj2, wg0Var, mnkwqfsfswtc, i9);
            case 1:
                defpackage.y10 y10Var = (defpackage.y10) obj3;
                defpackage.fo0 fo0Var = (defpackage.fo0) obj2;
                defpackage.nm1 nm1Var3 = (defpackage.nm1) obj;
                ((defpackage.fo0) obj4).setValue(nm1Var3);
                boolean QiMR8OkAhezm = defpackage.ma0.QiMR8OkAhezm((java.lang.String) fo0Var.getValue(), nm1Var3.ZpBGe2uQfcn8.oh71FJcDz6S2);
                defpackage.l6 l6Var = nm1Var3.ZpBGe2uQfcn8;
                fo0Var.setValue(l6Var.oh71FJcDz6S2);
                if (!QiMR8OkAhezm) {
                    y10Var.P05cfTpS5W5L(l6Var.oh71FJcDz6S2);
                }
                return gs1Var;
            case 2:
                defpackage.wk wkVar = (defpackage.wk) obj4;
                defpackage.cb0 cb0Var = (defpackage.cb0) obj3;
                defpackage.w91 w91Var = (defpackage.w91) obj2;
                float floatValue = ((java.lang.Float) obj).floatValue();
                float f = wkVar.w7APNrr0aGRc ? 1.0f : -1.0f;
                defpackage.y91 y91Var = wkVar.ZVVdXbWmyCSK;
                long WDYagTQQm9ns5 = y91Var.WDYagTQQm9ns(y91Var.P05cfTpS5W5L(f * floatValue));
                defpackage.y91 y91Var2 = w91Var.ZpBGe2uQfcn8;
                float QiMR8OkAhezm2 = y91Var.QiMR8OkAhezm(y91Var.WDYagTQQm9ns(y91Var2.fWTAfUmVKrZq(y91Var2.Ns0WNyEWdPsk, WDYagTQQm9ns5, 1))) * f;
                if (java.lang.Math.abs(QiMR8OkAhezm2) < java.lang.Math.abs(floatValue)) {
                    java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("Scroll animation cancelled because scroll was not consumed (" + QiMR8OkAhezm2 + " < " + floatValue + ')');
                    cancellationException.initCause(null);
                    cb0Var.JhCgjQRTAOCT(cancellationException);
                }
                return gs1Var;
            case 3:
                defpackage.hg0 hg0Var2 = (defpackage.hg0) obj4;
                long j = ((defpackage.nm1) obj3).giKS3J6vZuNy;
                defpackage.zs0 zs0Var = (defpackage.zs0) obj2;
                defpackage.ct ctVar = (defpackage.ct) obj;
                defpackage.cn1 JhCgjQRTAOCT5 = hg0Var2.JhCgjQRTAOCT();
                if (JhCgjQRTAOCT5 != null) {
                    defpackage.id oh71FJcDz6S2 = ctVar.qjMheFZ0l9kA().oh71FJcDz6S2();
                    long j2 = ((defpackage.in1) hg0Var2.OcTWLQzke1i2.getValue()).ZpBGe2uQfcn8;
                    long j3 = ((defpackage.in1) hg0Var2.blKFvluuDQOf.getValue()).ZpBGe2uQfcn8;
                    defpackage.bn1 bn1Var5 = JhCgjQRTAOCT5.ZpBGe2uQfcn8;
                    defpackage.wm0 wm0Var = bn1Var5.giKS3J6vZuNy;
                    defpackage.an1 an1Var = bn1Var5.ZpBGe2uQfcn8;
                    defpackage.j2 j2Var = hg0Var2.oCu53ZX2v4Ju;
                    long j4 = hg0Var2.dG7RjM6DqYVL;
                    if (!defpackage.in1.fWTAfUmVKrZq(j2)) {
                        j2Var.WDYagTQQm9ns(j4);
                        int QiMR8OkAhezm3 = zs0Var.QiMR8OkAhezm(defpackage.in1.oh71FJcDz6S2(j2));
                        int QiMR8OkAhezm4 = zs0Var.QiMR8OkAhezm(defpackage.in1.WDYagTQQm9ns(j2));
                        if (QiMR8OkAhezm3 != QiMR8OkAhezm4) {
                            oh71FJcDz6S2.QiMR8OkAhezm(bn1Var5.P05cfTpS5W5L(QiMR8OkAhezm3, QiMR8OkAhezm4), j2Var);
                        }
                    } else if (!defpackage.in1.fWTAfUmVKrZq(j3)) {
                        long giKS3J6vZuNy = an1Var.giKS3J6vZuNy.giKS3J6vZuNy();
                        defpackage.pf pfVar = giKS3J6vZuNy == 16 ? null : new defpackage.pf(giKS3J6vZuNy);
                        long j5 = pfVar != null ? pfVar.ZpBGe2uQfcn8 : defpackage.pf.giKS3J6vZuNy;
                        j2Var.WDYagTQQm9ns(defpackage.pf.giKS3J6vZuNy(j5, defpackage.pf.JhCgjQRTAOCT(j5) * 0.2f));
                        int QiMR8OkAhezm5 = zs0Var.QiMR8OkAhezm(defpackage.in1.oh71FJcDz6S2(j3));
                        int QiMR8OkAhezm6 = zs0Var.QiMR8OkAhezm(defpackage.in1.WDYagTQQm9ns(j3));
                        if (QiMR8OkAhezm5 != QiMR8OkAhezm6) {
                            oh71FJcDz6S2.QiMR8OkAhezm(bn1Var5.P05cfTpS5W5L(QiMR8OkAhezm5, QiMR8OkAhezm6), j2Var);
                        }
                    } else if (!defpackage.in1.fWTAfUmVKrZq(j)) {
                        j2Var.WDYagTQQm9ns(j4);
                        int QiMR8OkAhezm7 = zs0Var.QiMR8OkAhezm(defpackage.in1.oh71FJcDz6S2(j));
                        int QiMR8OkAhezm8 = zs0Var.QiMR8OkAhezm(defpackage.in1.WDYagTQQm9ns(j));
                        if (QiMR8OkAhezm7 != QiMR8OkAhezm8) {
                            oh71FJcDz6S2.QiMR8OkAhezm(bn1Var5.P05cfTpS5W5L(QiMR8OkAhezm7, QiMR8OkAhezm8), j2Var);
                        }
                    }
                    long j6 = bn1Var5.fWTAfUmVKrZq;
                    float f2 = (int) (j6 >> 32);
                    defpackage.wm0 wm0Var2 = bn1Var5.giKS3J6vZuNy;
                    boolean z2 = ((f2 > wm0Var2.JhCgjQRTAOCT ? 1 : (f2 == wm0Var2.JhCgjQRTAOCT ? 0 : -1)) < 0 || wm0Var2.fWTAfUmVKrZq || (((float) ((int) (j6 & 4294967295L))) > wm0Var2.WDYagTQQm9ns ? 1 : (((float) ((int) (j6 & 4294967295L))) == wm0Var2.WDYagTQQm9ns ? 0 : -1)) < 0) && an1Var.oh71FJcDz6S2 != 3;
                    if (z2) {
                        long j7 = bn1Var5.fWTAfUmVKrZq;
                        defpackage.s31 oh71FJcDz6S22 = defpackage.n70.oh71FJcDz6S2(0L, (java.lang.Float.floatToRawIntBits((int) (j7 >> 32)) << 32) | (java.lang.Float.floatToRawIntBits((int) (j7 & 4294967295L)) & 4294967295L));
                        oh71FJcDz6S2.fNwYGHIYeJcR();
                        defpackage.id.Ns0WNyEWdPsk(oh71FJcDz6S2, oh71FJcDz6S22);
                    }
                    defpackage.pf1 pf1Var = an1Var.giKS3J6vZuNy.ZpBGe2uQfcn8;
                    defpackage.qk1 qk1Var = pf1Var.h3m55N1URyyK;
                    defpackage.pm1 pm1Var = pf1Var.ZpBGe2uQfcn8;
                    if (qk1Var == null) {
                        qk1Var = defpackage.qk1.giKS3J6vZuNy;
                    }
                    defpackage.qk1 qk1Var2 = qk1Var;
                    defpackage.zc1 zc1Var = pf1Var.gUjdnLbkVAaA;
                    if (zc1Var == null) {
                        zc1Var = defpackage.zc1.JhCgjQRTAOCT;
                    }
                    defpackage.zc1 zc1Var2 = zc1Var;
                    defpackage.dt dtVar = pf1Var.XntWc4eZSQ8j;
                    if (dtVar == null) {
                        dtVar = defpackage.yw.ZpBGe2uQfcn8;
                    }
                    defpackage.dt dtVar2 = dtVar;
                    try {
                        defpackage.vb fWTAfUmVKrZq = pm1Var.fWTAfUmVKrZq();
                        defpackage.om1 om1Var = defpackage.om1.ZpBGe2uQfcn8;
                        try {
                            if (fWTAfUmVKrZq != null) {
                                defpackage.wm0.e6mdH7fiFuta(wm0Var, oh71FJcDz6S2, fWTAfUmVKrZq, pm1Var != om1Var ? pm1Var.ZpBGe2uQfcn8() : 1.0f, zc1Var2, qk1Var2, dtVar2);
                                idVar = oh71FJcDz6S2;
                            } else {
                                defpackage.id idVar3 = oh71FJcDz6S2;
                                long giKS3J6vZuNy2 = pm1Var != om1Var ? pm1Var.giKS3J6vZuNy() : defpackage.pf.giKS3J6vZuNy;
                                idVar3.fNwYGHIYeJcR();
                                java.util.ArrayList arrayList = wm0Var.P05cfTpS5W5L;
                                int size = arrayList.size();
                                int i10 = 0;
                                while (i10 < size) {
                                    defpackage.dw0 dw0Var = (defpackage.dw0) arrayList.get(i10);
                                    dw0Var.ZpBGe2uQfcn8.oh71FJcDz6S2(idVar3, giKS3J6vZuNy2, zc1Var2, qk1Var2, dtVar2);
                                    idVar = idVar3;
                                    try {
                                        idVar.oh71FJcDz6S2(0.0f, dw0Var.ZpBGe2uQfcn8.giKS3J6vZuNy());
                                        i10++;
                                        idVar3 = idVar;
                                    } catch (java.lang.Throwable th) {
                                        th = th;
                                        if (z2) {
                                            idVar.e6mdH7fiFuta();
                                        }
                                        throw th;
                                    }
                                }
                                idVar = idVar3;
                                idVar.e6mdH7fiFuta();
                            }
                            if (z2) {
                                idVar.e6mdH7fiFuta();
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            idVar = idVar2;
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        idVar = oh71FJcDz6S2;
                    }
                }
                return gs1Var;
            case 4:
                android.content.Context context = (android.content.Context) obj3;
                defpackage.mk1 mk1Var = (defpackage.mk1) obj2;
                defpackage.el elVar = (defpackage.el) obj;
                java.util.List list = ((defpackage.ak1) obj4).ZpBGe2uQfcn8;
                int size2 = list.size();
                int i11 = 0;
                while (i11 < size2) {
                    defpackage.zj1 zj1Var = (defpackage.zj1) list.get(i11);
                    if (zj1Var instanceof defpackage.hk1) {
                        defpackage.hk1 hk1Var = (defpackage.hk1) zj1Var;
                        defpackage.el.giKS3J6vZuNy(elVar, new defpackage.l2(i7, hk1Var), hk1Var.fWTAfUmVKrZq == 0 ? klVar : new defpackage.nh(-1930700965, true, new defpackage.po(0, hk1Var)), new defpackage.S0YpfprlOYIn(8, hk1Var, mk1Var), 6);
                    } else {
                        if (!(zj1Var instanceof defpackage.nk1)) {
                            i = 4;
                            if (zj1Var instanceof defpackage.lk1) {
                                elVar.ZpBGe2uQfcn8.add(defpackage.vx1.QiMR8OkAhezm);
                            }
                        } else if (android.os.Build.VERSION.SDK_INT >= 28) {
                            defpackage.nk1 nk1Var = (defpackage.nk1) zj1Var;
                            if (context != null) {
                                int i12 = nk1Var.fWTAfUmVKrZq;
                                android.view.textclassifier.TextClassification textClassification = nk1Var.giKS3J6vZuNy;
                                if (i12 < 0) {
                                    defpackage.l2 l2Var = new defpackage.l2(i4, textClassification);
                                    icon = textClassification.getIcon();
                                    defpackage.el.giKS3J6vZuNy(elVar, l2Var, icon != null ? new defpackage.nh(-1123224187, true, new defpackage.po(1, icon)) : null, new defpackage.S0YpfprlOYIn(20, context, textClassification), 6);
                                } else {
                                    actions = textClassification.getActions();
                                    android.app.RemoteAction JhCgjQRTAOCT6 = defpackage.jd.JhCgjQRTAOCT(actions.get(i12));
                                    boolean z3 = i12 == 0;
                                    defpackage.l2 l2Var2 = new defpackage.l2(22, JhCgjQRTAOCT6);
                                    if (!z3) {
                                        shouldShowIcon = JhCgjQRTAOCT6.shouldShowIcon();
                                        if (!shouldShowIcon) {
                                            nhVar = null;
                                            i = 4;
                                            defpackage.el.giKS3J6vZuNy(elVar, l2Var2, nhVar, new defpackage.jc1(i, JhCgjQRTAOCT6), 6);
                                        }
                                    }
                                    nhVar = new defpackage.nh(-1261173016, true, new defpackage.po(i6, JhCgjQRTAOCT6));
                                    i = 4;
                                    defpackage.el.giKS3J6vZuNy(elVar, l2Var2, nhVar, new defpackage.jc1(i, JhCgjQRTAOCT6), 6);
                                }
                            }
                        }
                        i11++;
                        i7 = i;
                        klVar = null;
                    }
                    i = 4;
                    i11++;
                    i7 = i;
                    klVar = null;
                }
                return gs1Var;
            case 5:
                defpackage.ff1 ff1Var = (defpackage.ff1) obj4;
                defpackage.xo0 xo0Var = (defpackage.xo0) obj3;
                ff1Var.add(xo0Var);
                return new defpackage.pf0OXpZQoaz3((defpackage.hq) obj2, xo0Var, ff1Var, i6);
            case 6:
                defpackage.fo0 fo0Var2 = (defpackage.fo0) obj4;
                java.util.ArrayList arrayList2 = (java.util.ArrayList) obj3;
                java.util.List list2 = (java.util.List) obj2;
                defpackage.qy0 qy0Var = (defpackage.qy0) obj;
                qy0Var.WDYagTQQm9ns = true;
                int size3 = arrayList2.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    ((defpackage.pf0) arrayList2.get(i13)).giKS3J6vZuNy(qy0Var);
                }
                int size4 = list2.size();
                for (int i14 = 0; i14 < size4; i14++) {
                    ((defpackage.pf0) list2.get(i14)).giKS3J6vZuNy(qy0Var);
                }
                qy0Var.WDYagTQQm9ns = false;
                fo0Var2.getValue();
                return gs1Var;
            case 7:
                defpackage.wg0 wg0Var2 = (defpackage.wg0) obj4;
                final defpackage.dh0 dh0Var = (defpackage.dh0) obj2;
                final defpackage.y10 y10Var2 = (defpackage.y10) obj3;
                final defpackage.z31 z31Var = new defpackage.z31();
                ?? r2 = new defpackage.ug0() { // from class: sg0
                    @Override // defpackage.ug0
                    public final void e6mdH7fiFuta(defpackage.wg0 wg0Var3, defpackage.og0 og0Var) {
                        int i15 = defpackage.tg0.ZpBGe2uQfcn8[og0Var.ordinal()];
                        defpackage.z31 z31Var2 = z31Var;
                        if (i15 == 1) {
                            z31Var2.WDYagTQQm9ns = y10Var2.P05cfTpS5W5L(defpackage.dh0.this);
                        } else {
                            if (i15 != 2) {
                                return;
                            }
                            defpackage.f9 f9Var = (defpackage.f9) z31Var2.WDYagTQQm9ns;
                            if (f9Var != null) {
                                f9Var.ZpBGe2uQfcn8();
                            }
                            z31Var2.WDYagTQQm9ns = null;
                        }
                    }
                };
                wg0Var2.QiMR8OkAhezm().ZpBGe2uQfcn8(r2);
                return new defpackage.pf0OXpZQoaz3(wg0Var2, r2, z31Var);
            case 8:
                defpackage.j71 j71Var = (defpackage.j71) obj4;
                defpackage.n71 n71Var = (defpackage.n71) obj2;
                defpackage.yn0 yn0Var = j71Var.oh71FJcDz6S2;
                if (yn0Var.giKS3J6vZuNy(obj3)) {
                    defpackage.p81.JhCgjQRTAOCT("Key ", obj3, " was used multiple times ");
                    return null;
                }
                j71Var.WDYagTQQm9ns.remove(obj3);
                yn0Var.h3m55N1URyyK(obj3, n71Var);
                return new defpackage.pf0OXpZQoaz3(j71Var, obj3, n71Var, i7);
            case defpackage.n70.ZpBGe2uQfcn8 /* 9 */:
                defpackage.yd1 yd1Var = (defpackage.yd1) obj4;
                defpackage.p81 p81Var = (defpackage.p81) obj3;
                defpackage.v31 v31Var = (defpackage.v31) obj2;
                defpackage.c01 c01Var = (defpackage.c01) obj;
                long j8 = c01Var.fWTAfUmVKrZq;
                defpackage.em1 em1Var = (defpackage.em1) yd1Var.JhCgjQRTAOCT;
                if (!em1Var.Ns0WNyEWdPsk() || em1Var.gUjdnLbkVAaA().ZpBGe2uQfcn8.oh71FJcDz6S2.length() == 0 || (hg0Var = em1Var.JhCgjQRTAOCT) == null || hg0Var.JhCgjQRTAOCT() == null) {
                    z = false;
                } else {
                    yd1Var.fWTAfUmVKrZq(em1Var.gUjdnLbkVAaA(), j8, false, p81Var);
                    z = true;
                }
                if (z) {
                    c01Var.ZpBGe2uQfcn8();
                    v31Var.WDYagTQQm9ns = true;
                }
                return gs1Var;
            case defpackage.n70.giKS3J6vZuNy /* 10 */:
                defpackage.y10 y10Var3 = (defpackage.y10) obj3;
                defpackage.wm1 wm1Var = (defpackage.wm1) ((defpackage.z31) obj2).WDYagTQQm9ns;
                defpackage.nm1 fNwYGHIYeJcR = ((defpackage.n80) obj4).fNwYGHIYeJcR((java.util.List) obj);
                if (wm1Var != null) {
                    wm1Var.ZpBGe2uQfcn8(null, fNwYGHIYeJcR);
                }
                y10Var3.P05cfTpS5W5L(fNwYGHIYeJcR);
                return gs1Var;
            case 11:
                defpackage.fl1 fl1Var = (defpackage.fl1) obj3;
                defpackage.v31 v31Var2 = (defpackage.v31) obj2;
                defpackage.pl1 pl1Var = (defpackage.pl1) obj;
                switch (((defpackage.vb0) obj4).ordinal()) {
                    case 0:
                        pl1Var.WDYagTQQm9ns.ZpBGe2uQfcn8 = null;
                        if (pl1Var.QiMR8OkAhezm.oh71FJcDz6S2.length() > 0) {
                            if (defpackage.in1.fWTAfUmVKrZq(pl1Var.oh71FJcDz6S2)) {
                                pl1Var.e6mdH7fiFuta();
                                break;
                            } else {
                                boolean oh71FJcDz6S23 = pl1Var.oh71FJcDz6S2();
                                long j9 = pl1Var.oh71FJcDz6S2;
                                if (oh71FJcDz6S23) {
                                    int oh71FJcDz6S24 = defpackage.in1.oh71FJcDz6S2(j9);
                                    pl1Var.WmetiUbpKU9I(oh71FJcDz6S24, oh71FJcDz6S24);
                                    break;
                                } else {
                                    int WDYagTQQm9ns6 = defpackage.in1.WDYagTQQm9ns(j9);
                                    pl1Var.WmetiUbpKU9I(WDYagTQQm9ns6, WDYagTQQm9ns6);
                                    break;
                                }
                            }
                        }
                        break;
                    case 1:
                        pl1Var.WDYagTQQm9ns.ZpBGe2uQfcn8 = null;
                        if (pl1Var.QiMR8OkAhezm.oh71FJcDz6S2.length() > 0) {
                            if (defpackage.in1.fWTAfUmVKrZq(pl1Var.oh71FJcDz6S2)) {
                                pl1Var.h3m55N1URyyK();
                                break;
                            } else {
                                boolean oh71FJcDz6S25 = pl1Var.oh71FJcDz6S2();
                                long j10 = pl1Var.oh71FJcDz6S2;
                                if (oh71FJcDz6S25) {
                                    int WDYagTQQm9ns7 = defpackage.in1.WDYagTQQm9ns(j10);
                                    pl1Var.WmetiUbpKU9I(WDYagTQQm9ns7, WDYagTQQm9ns7);
                                    break;
                                } else {
                                    int oh71FJcDz6S26 = defpackage.in1.oh71FJcDz6S2(j10);
                                    pl1Var.WmetiUbpKU9I(oh71FJcDz6S26, oh71FJcDz6S26);
                                    break;
                                }
                            }
                        }
                        break;
                    case 2:
                        defpackage.hn1 hn1Var = pl1Var.WDYagTQQm9ns;
                        hn1Var.ZpBGe2uQfcn8 = null;
                        defpackage.l6 l6Var2 = pl1Var.QiMR8OkAhezm;
                        java.lang.String str = l6Var2.oh71FJcDz6S2;
                        java.lang.String str2 = l6Var2.oh71FJcDz6S2;
                        if (str.length() > 0) {
                            if (pl1Var.oh71FJcDz6S2()) {
                                hn1Var.ZpBGe2uQfcn8 = null;
                                if (str2.length() > 0 && (JhCgjQRTAOCT = pl1Var.JhCgjQRTAOCT()) != null) {
                                    int intValue = JhCgjQRTAOCT.intValue();
                                    pl1Var.WmetiUbpKU9I(intValue, intValue);
                                    break;
                                }
                            } else {
                                hn1Var.ZpBGe2uQfcn8 = null;
                                if (str2.length() > 0 && (WDYagTQQm9ns = pl1Var.WDYagTQQm9ns()) != null) {
                                    int intValue2 = WDYagTQQm9ns.intValue();
                                    pl1Var.WmetiUbpKU9I(intValue2, intValue2);
                                    break;
                                }
                            }
                        }
                        break;
                    case 3:
                        defpackage.hn1 hn1Var2 = pl1Var.WDYagTQQm9ns;
                        hn1Var2.ZpBGe2uQfcn8 = null;
                        defpackage.l6 l6Var3 = pl1Var.QiMR8OkAhezm;
                        java.lang.String str3 = l6Var3.oh71FJcDz6S2;
                        java.lang.String str4 = l6Var3.oh71FJcDz6S2;
                        if (str3.length() > 0) {
                            if (pl1Var.oh71FJcDz6S2()) {
                                hn1Var2.ZpBGe2uQfcn8 = null;
                                if (str4.length() > 0 && (WDYagTQQm9ns2 = pl1Var.WDYagTQQm9ns()) != null) {
                                    int intValue3 = WDYagTQQm9ns2.intValue();
                                    pl1Var.WmetiUbpKU9I(intValue3, intValue3);
                                    break;
                                }
                            } else {
                                hn1Var2.ZpBGe2uQfcn8 = null;
                                if (str4.length() > 0 && (JhCgjQRTAOCT2 = pl1Var.JhCgjQRTAOCT()) != null) {
                                    int intValue4 = JhCgjQRTAOCT2.intValue();
                                    pl1Var.WmetiUbpKU9I(intValue4, intValue4);
                                    break;
                                }
                            }
                        }
                        break;
                    case 4:
                        pl1Var.GE9mJIPrb8gP();
                        break;
                    case 5:
                        pl1Var.fNwYGHIYeJcR();
                        break;
                    case 6:
                        pl1Var.T1fB7bDYiVJQ();
                        break;
                    case 7:
                        pl1Var.gUjdnLbkVAaA();
                        break;
                    case 8:
                        pl1Var.WDYagTQQm9ns.ZpBGe2uQfcn8 = null;
                        if (pl1Var.QiMR8OkAhezm.oh71FJcDz6S2.length() > 0) {
                            if (pl1Var.oh71FJcDz6S2()) {
                                pl1Var.T1fB7bDYiVJQ();
                                break;
                            } else {
                                pl1Var.gUjdnLbkVAaA();
                                break;
                            }
                        }
                        break;
                    case defpackage.n70.ZpBGe2uQfcn8 /* 9 */:
                        pl1Var.WDYagTQQm9ns.ZpBGe2uQfcn8 = null;
                        if (pl1Var.QiMR8OkAhezm.oh71FJcDz6S2.length() > 0) {
                            if (pl1Var.oh71FJcDz6S2()) {
                                pl1Var.gUjdnLbkVAaA();
                                break;
                            } else {
                                pl1Var.T1fB7bDYiVJQ();
                                break;
                            }
                        }
                        break;
                    case defpackage.n70.giKS3J6vZuNy /* 10 */:
                        if (pl1Var.QiMR8OkAhezm.oh71FJcDz6S2.length() > 0 && (bn1Var = pl1Var.fWTAfUmVKrZq) != null) {
                            int QiMR8OkAhezm9 = pl1Var.QiMR8OkAhezm(bn1Var, -1);
                            pl1Var.WmetiUbpKU9I(QiMR8OkAhezm9, QiMR8OkAhezm9);
                            break;
                        }
                        break;
                    case 11:
                        if (pl1Var.QiMR8OkAhezm.oh71FJcDz6S2.length() > 0 && (bn1Var2 = pl1Var.fWTAfUmVKrZq) != null) {
                            int QiMR8OkAhezm10 = pl1Var.QiMR8OkAhezm(bn1Var2, 1);
                            pl1Var.WmetiUbpKU9I(QiMR8OkAhezm10, QiMR8OkAhezm10);
                            break;
                        }
                        break;
                    case defpackage.n70.fWTAfUmVKrZq /* 12 */:
                    case 48:
                        break;
                    case 13:
                        if (pl1Var.QiMR8OkAhezm.oh71FJcDz6S2.length() > 0 && (cn1Var = pl1Var.e6mdH7fiFuta) != null) {
                            int P05cfTpS5W5L = pl1Var.P05cfTpS5W5L(cn1Var, -1);
                            pl1Var.WmetiUbpKU9I(P05cfTpS5W5L, P05cfTpS5W5L);
                            break;
                        }
                        break;
                    case 14:
                        if (pl1Var.QiMR8OkAhezm.oh71FJcDz6S2.length() > 0 && (cn1Var2 = pl1Var.e6mdH7fiFuta) != null) {
                            int P05cfTpS5W5L2 = pl1Var.P05cfTpS5W5L(cn1Var2, 1);
                            pl1Var.WmetiUbpKU9I(P05cfTpS5W5L2, P05cfTpS5W5L2);
                            break;
                        }
                        break;
                    case 15:
                        pl1Var.WDYagTQQm9ns.ZpBGe2uQfcn8 = null;
                        if (pl1Var.QiMR8OkAhezm.oh71FJcDz6S2.length() > 0) {
                            pl1Var.WmetiUbpKU9I(0, 0);
                            break;
                        }
                        break;
                    case 16:
                        pl1Var.WDYagTQQm9ns.ZpBGe2uQfcn8 = null;
                        defpackage.l6 l6Var4 = pl1Var.QiMR8OkAhezm;
                        if (l6Var4.oh71FJcDz6S2.length() > 0) {
                            int length = l6Var4.oh71FJcDz6S2.length();
                            pl1Var.WmetiUbpKU9I(length, length);
                            break;
                        }
                        break;
                    case 17:
                        fl1Var.giKS3J6vZuNy.JhCgjQRTAOCT(false);
                        break;
                    case 18:
                        fl1Var.giKS3J6vZuNy.XntWc4eZSQ8j();
                        break;
                    case 19:
                        fl1Var.giKS3J6vZuNy.oh71FJcDz6S2();
                        break;
                    case 20:
                        java.util.List ZpBGe2uQfcn8 = pl1Var.ZpBGe2uQfcn8(new defpackage.ui1(i6));
                        if (ZpBGe2uQfcn8 != null) {
                            fl1Var.ZpBGe2uQfcn8(ZpBGe2uQfcn8);
                            break;
                        }
                        break;
                    case 21:
                        java.util.List ZpBGe2uQfcn82 = pl1Var.ZpBGe2uQfcn8(new defpackage.ui1(i5));
                        if (ZpBGe2uQfcn82 != null) {
                            fl1Var.ZpBGe2uQfcn8(ZpBGe2uQfcn82);
                            break;
                        }
                        break;
                    case 22:
                        java.util.List ZpBGe2uQfcn83 = pl1Var.ZpBGe2uQfcn8(new defpackage.ui1(i7));
                        if (ZpBGe2uQfcn83 != null) {
                            fl1Var.ZpBGe2uQfcn8(ZpBGe2uQfcn83);
                            break;
                        }
                        break;
                    case 23:
                        java.util.List ZpBGe2uQfcn84 = pl1Var.ZpBGe2uQfcn8(new defpackage.ui1(5));
                        if (ZpBGe2uQfcn84 != null) {
                            fl1Var.ZpBGe2uQfcn8(ZpBGe2uQfcn84);
                            break;
                        }
                        break;
                    case 24:
                        java.util.List ZpBGe2uQfcn85 = pl1Var.ZpBGe2uQfcn8(new defpackage.ui1(i3));
                        if (ZpBGe2uQfcn85 != null) {
                            fl1Var.ZpBGe2uQfcn8(ZpBGe2uQfcn85);
                            break;
                        }
                        break;
                    case 25:
                        java.util.List ZpBGe2uQfcn86 = pl1Var.ZpBGe2uQfcn8(new defpackage.ui1(7));
                        if (ZpBGe2uQfcn86 != null) {
                            fl1Var.ZpBGe2uQfcn8(ZpBGe2uQfcn86);
                            break;
                        }
                        break;
                    case 26:
                        pl1Var.WDYagTQQm9ns.ZpBGe2uQfcn8 = null;
                        defpackage.l6 l6Var5 = pl1Var.QiMR8OkAhezm;
                        if (l6Var5.oh71FJcDz6S2.length() > 0) {
                            pl1Var.WmetiUbpKU9I(0, l6Var5.oh71FJcDz6S2.length());
                            break;
                        }
                        break;
                    case 27:
                        pl1Var.e6mdH7fiFuta();
                        pl1Var.XntWc4eZSQ8j();
                        break;
                    case 28:
                        pl1Var.h3m55N1URyyK();
                        pl1Var.XntWc4eZSQ8j();
                        break;
                    case 29:
                        if (pl1Var.QiMR8OkAhezm.oh71FJcDz6S2.length() > 0 && (bn1Var3 = pl1Var.fWTAfUmVKrZq) != null) {
                            int QiMR8OkAhezm11 = pl1Var.QiMR8OkAhezm(bn1Var3, -1);
                            pl1Var.WmetiUbpKU9I(QiMR8OkAhezm11, QiMR8OkAhezm11);
                        }
                        pl1Var.XntWc4eZSQ8j();
                        break;
                    case 30:
                        if (pl1Var.QiMR8OkAhezm.oh71FJcDz6S2.length() > 0 && (bn1Var4 = pl1Var.fWTAfUmVKrZq) != null) {
                            int QiMR8OkAhezm12 = pl1Var.QiMR8OkAhezm(bn1Var4, 1);
                            pl1Var.WmetiUbpKU9I(QiMR8OkAhezm12, QiMR8OkAhezm12);
                        }
                        pl1Var.XntWc4eZSQ8j();
                        break;
                    case 31:
                        if (pl1Var.QiMR8OkAhezm.oh71FJcDz6S2.length() > 0 && (cn1Var3 = pl1Var.e6mdH7fiFuta) != null) {
                            int P05cfTpS5W5L3 = pl1Var.P05cfTpS5W5L(cn1Var3, -1);
                            pl1Var.WmetiUbpKU9I(P05cfTpS5W5L3, P05cfTpS5W5L3);
                        }
                        pl1Var.XntWc4eZSQ8j();
                        break;
                    case 32:
                        if (pl1Var.QiMR8OkAhezm.oh71FJcDz6S2.length() > 0 && (cn1Var4 = pl1Var.e6mdH7fiFuta) != null) {
                            int P05cfTpS5W5L4 = pl1Var.P05cfTpS5W5L(cn1Var4, 1);
                            pl1Var.WmetiUbpKU9I(P05cfTpS5W5L4, P05cfTpS5W5L4);
                        }
                        pl1Var.XntWc4eZSQ8j();
                        break;
                    case 33:
                        pl1Var.WDYagTQQm9ns.ZpBGe2uQfcn8 = null;
                        if (pl1Var.QiMR8OkAhezm.oh71FJcDz6S2.length() > 0) {
                            pl1Var.WmetiUbpKU9I(0, 0);
                        }
                        pl1Var.XntWc4eZSQ8j();
                        break;
                    case 34:
                        pl1Var.WDYagTQQm9ns.ZpBGe2uQfcn8 = null;
                        defpackage.l6 l6Var6 = pl1Var.QiMR8OkAhezm;
                        if (l6Var6.oh71FJcDz6S2.length() > 0) {
                            int length2 = l6Var6.oh71FJcDz6S2.length();
                            pl1Var.WmetiUbpKU9I(length2, length2);
                        }
                        pl1Var.XntWc4eZSQ8j();
                        break;
                    case 35:
                        defpackage.hn1 hn1Var3 = pl1Var.WDYagTQQm9ns;
                        hn1Var3.ZpBGe2uQfcn8 = null;
                        defpackage.l6 l6Var7 = pl1Var.QiMR8OkAhezm;
                        java.lang.String str5 = l6Var7.oh71FJcDz6S2;
                        java.lang.String str6 = l6Var7.oh71FJcDz6S2;
                        if (str5.length() > 0) {
                            if (pl1Var.oh71FJcDz6S2()) {
                                hn1Var3.ZpBGe2uQfcn8 = null;
                                if (str6.length() > 0 && (WDYagTQQm9ns3 = pl1Var.WDYagTQQm9ns()) != null) {
                                    int intValue5 = WDYagTQQm9ns3.intValue();
                                    pl1Var.WmetiUbpKU9I(intValue5, intValue5);
                                }
                            } else {
                                hn1Var3.ZpBGe2uQfcn8 = null;
                                if (str6.length() > 0 && (JhCgjQRTAOCT3 = pl1Var.JhCgjQRTAOCT()) != null) {
                                    int intValue6 = JhCgjQRTAOCT3.intValue();
                                    pl1Var.WmetiUbpKU9I(intValue6, intValue6);
                                }
                            }
                        }
                        pl1Var.XntWc4eZSQ8j();
                        break;
                    case 36:
                        defpackage.hn1 hn1Var4 = pl1Var.WDYagTQQm9ns;
                        hn1Var4.ZpBGe2uQfcn8 = null;
                        defpackage.l6 l6Var8 = pl1Var.QiMR8OkAhezm;
                        java.lang.String str7 = l6Var8.oh71FJcDz6S2;
                        java.lang.String str8 = l6Var8.oh71FJcDz6S2;
                        if (str7.length() > 0) {
                            if (pl1Var.oh71FJcDz6S2()) {
                                hn1Var4.ZpBGe2uQfcn8 = null;
                                if (str8.length() > 0 && (JhCgjQRTAOCT4 = pl1Var.JhCgjQRTAOCT()) != null) {
                                    int intValue7 = JhCgjQRTAOCT4.intValue();
                                    pl1Var.WmetiUbpKU9I(intValue7, intValue7);
                                }
                            } else {
                                hn1Var4.ZpBGe2uQfcn8 = null;
                                if (str8.length() > 0 && (WDYagTQQm9ns4 = pl1Var.WDYagTQQm9ns()) != null) {
                                    int intValue8 = WDYagTQQm9ns4.intValue();
                                    pl1Var.WmetiUbpKU9I(intValue8, intValue8);
                                }
                            }
                        }
                        pl1Var.XntWc4eZSQ8j();
                        break;
                    case 37:
                        pl1Var.GE9mJIPrb8gP();
                        pl1Var.XntWc4eZSQ8j();
                        break;
                    case 38:
                        pl1Var.fNwYGHIYeJcR();
                        pl1Var.XntWc4eZSQ8j();
                        break;
                    case 39:
                        pl1Var.T1fB7bDYiVJQ();
                        pl1Var.XntWc4eZSQ8j();
                        break;
                    case 40:
                        pl1Var.gUjdnLbkVAaA();
                        pl1Var.XntWc4eZSQ8j();
                        break;
                    case 41:
                        pl1Var.WDYagTQQm9ns.ZpBGe2uQfcn8 = null;
                        if (pl1Var.QiMR8OkAhezm.oh71FJcDz6S2.length() > 0) {
                            if (pl1Var.oh71FJcDz6S2()) {
                                pl1Var.T1fB7bDYiVJQ();
                            } else {
                                pl1Var.gUjdnLbkVAaA();
                            }
                        }
                        pl1Var.XntWc4eZSQ8j();
                        break;
                    case 42:
                        pl1Var.WDYagTQQm9ns.ZpBGe2uQfcn8 = null;
                        if (pl1Var.QiMR8OkAhezm.oh71FJcDz6S2.length() > 0) {
                            if (pl1Var.oh71FJcDz6S2()) {
                                pl1Var.gUjdnLbkVAaA();
                            } else {
                                pl1Var.T1fB7bDYiVJQ();
                            }
                        }
                        pl1Var.XntWc4eZSQ8j();
                        break;
                    case 43:
                        pl1Var.WDYagTQQm9ns.ZpBGe2uQfcn8 = null;
                        if (pl1Var.QiMR8OkAhezm.oh71FJcDz6S2.length() > 0) {
                            long j11 = pl1Var.oh71FJcDz6S2;
                            int i15 = defpackage.in1.fWTAfUmVKrZq;
                            int i16 = (int) (j11 & 4294967295L);
                            pl1Var.WmetiUbpKU9I(i16, i16);
                            break;
                        }
                        break;
                    case 44:
                        if (fl1Var.WDYagTQQm9ns) {
                            v31Var2.WDYagTQQm9ns = fl1Var.ZpBGe2uQfcn8.VFeft99leXEK.oh71FJcDz6S2.s0TASMVLSWD5.s0TASMVLSWD5(fl1Var.fNwYGHIYeJcR);
                            break;
                        } else {
                            fl1Var.ZpBGe2uQfcn8(defpackage.ma0.VFeft99leXEK(new defpackage.og("\n", 1)));
                            break;
                        }
                    case 45:
                        if (fl1Var.WDYagTQQm9ns) {
                            v31Var2.WDYagTQQm9ns = false;
                            break;
                        } else {
                            fl1Var.ZpBGe2uQfcn8(defpackage.ma0.VFeft99leXEK(new defpackage.og("\t", 1)));
                            break;
                        }
                    case 46:
                        defpackage.es1 es1Var = fl1Var.P05cfTpS5W5L;
                        if (es1Var != null) {
                            es1Var.ZpBGe2uQfcn8(defpackage.nm1.ZpBGe2uQfcn8(pl1Var.P05cfTpS5W5L, pl1Var.QiMR8OkAhezm, pl1Var.oh71FJcDz6S2, 4));
                        }
                        defpackage.es1 es1Var2 = fl1Var.P05cfTpS5W5L;
                        if (es1Var2 != null) {
                            defpackage.pd1 pd1Var2 = es1Var2.ZpBGe2uQfcn8;
                            if (pd1Var2 != null && (pd1Var = (defpackage.pd1) pd1Var2.giKS3J6vZuNy) != null) {
                                es1Var2.ZpBGe2uQfcn8 = pd1Var;
                                es1Var2.fWTAfUmVKrZq -= ((defpackage.nm1) pd1Var2.fWTAfUmVKrZq).ZpBGe2uQfcn8.oh71FJcDz6S2.length();
                                es1Var2.giKS3J6vZuNy = new defpackage.pd1(i5, es1Var2.giKS3J6vZuNy, (defpackage.nm1) pd1Var2.fWTAfUmVKrZq);
                                nm1Var2 = (defpackage.nm1) pd1Var.fWTAfUmVKrZq;
                            }
                            if (nm1Var2 != null) {
                                fl1Var.Ns0WNyEWdPsk.P05cfTpS5W5L(nm1Var2);
                                break;
                            }
                        }
                        break;
                    case 47:
                        defpackage.es1 es1Var3 = fl1Var.P05cfTpS5W5L;
                        if (es1Var3 != null) {
                            defpackage.pd1 pd1Var3 = es1Var3.giKS3J6vZuNy;
                            if (pd1Var3 != null) {
                                es1Var3.giKS3J6vZuNy = (defpackage.pd1) pd1Var3.giKS3J6vZuNy;
                                defpackage.nm1 nm1Var4 = (defpackage.nm1) pd1Var3.fWTAfUmVKrZq;
                                es1Var3.ZpBGe2uQfcn8 = new defpackage.pd1(i5, es1Var3.ZpBGe2uQfcn8, nm1Var4);
                                es1Var3.fWTAfUmVKrZq = nm1Var4.ZpBGe2uQfcn8.oh71FJcDz6S2.length() + es1Var3.fWTAfUmVKrZq;
                                nm1Var = (defpackage.nm1) pd1Var3.fWTAfUmVKrZq;
                            }
                            if (nm1Var != null) {
                                fl1Var.Ns0WNyEWdPsk.P05cfTpS5W5L(nm1Var);
                                break;
                            }
                        }
                        break;
                    default:
                        defpackage.h7.T1fB7bDYiVJQ();
                        return null;
                }
                return gs1Var;
            default:
                final defpackage.em1 em1Var2 = (defpackage.em1) obj4;
                defpackage.sm smVar = (defpackage.sm) obj3;
                android.content.Context context2 = (android.content.Context) obj2;
                defpackage.yj1 yj1Var = (defpackage.yj1) obj;
                defpackage.sn0 sn0Var = yj1Var.ZpBGe2uQfcn8;
                defpackage.sn0 sn0Var2 = yj1Var.ZpBGe2uQfcn8;
                defpackage.lk1 lk1Var = defpackage.lk1.giKS3J6vZuNy;
                sn0Var.ZpBGe2uQfcn8(lk1Var);
                defpackage.ik1 ik1Var = defpackage.ik1.Autofill;
                boolean z4 = (defpackage.in1.fWTAfUmVKrZq(em1Var2.gUjdnLbkVAaA().giKS3J6vZuNy) || !em1Var2.GE9mJIPrb8gP() || em1Var2.QiMR8OkAhezm == null) ? false : true;
                defpackage.S0YpfprlOYIn s0YpfprlOYIn = new defpackage.S0YpfprlOYIn(i4, smVar, new defpackage.yl1(em1Var2, klVar, i8));
                android.content.res.Resources resources = context2.getResources();
                defpackage.m91 m91Var = new defpackage.m91(i7, s0YpfprlOYIn, klVar);
                if (z4) {
                    sn0Var2.ZpBGe2uQfcn8(new defpackage.hk1(defpackage.ma0.lXYSMswtzmix, resources.getString(android.R.string.cut), android.R.attr.actionModeCutDrawable, m91Var));
                }
                defpackage.ik1 ik1Var2 = defpackage.ik1.Autofill;
                boolean z5 = (defpackage.in1.fWTAfUmVKrZq(em1Var2.gUjdnLbkVAaA().giKS3J6vZuNy) || em1Var2.QiMR8OkAhezm == null) ? false : true;
                defpackage.S0YpfprlOYIn s0YpfprlOYIn2 = new defpackage.S0YpfprlOYIn(i4, smVar, new defpackage.yl1(em1Var2, klVar, i6));
                android.content.res.Resources resources2 = context2.getResources();
                defpackage.m91 m91Var2 = new defpackage.m91(i7, s0YpfprlOYIn2, klVar);
                if (z5) {
                    sn0Var2.ZpBGe2uQfcn8(new defpackage.hk1(defpackage.ma0.ULjnV488Y6RO, resources2.getString(android.R.string.copy), android.R.attr.actionModeCopyDrawable, m91Var2));
                }
                defpackage.ik1 ik1Var3 = defpackage.ik1.Autofill;
                boolean z6 = em1Var2.GE9mJIPrb8gP() && ((java.lang.Boolean) em1Var2.IJ0hOnjhPOri.getValue()).booleanValue() && em1Var2.QiMR8OkAhezm != null;
                defpackage.S0YpfprlOYIn s0YpfprlOYIn3 = new defpackage.S0YpfprlOYIn(i4, smVar, new defpackage.yl1(em1Var2, klVar, i5));
                android.content.res.Resources resources3 = context2.getResources();
                defpackage.m91 m91Var3 = new defpackage.m91(i7, s0YpfprlOYIn3, klVar);
                if (z6) {
                    sn0Var2.ZpBGe2uQfcn8(new defpackage.hk1(defpackage.ma0.S0YpfprlOYIn, resources3.getString(android.R.string.paste), android.R.attr.actionModePasteDrawable, m91Var3));
                }
                defpackage.ik1 ik1Var4 = defpackage.ik1.Autofill;
                boolean z7 = defpackage.in1.JhCgjQRTAOCT(em1Var2.gUjdnLbkVAaA().giKS3J6vZuNy) != em1Var2.gUjdnLbkVAaA().ZpBGe2uQfcn8.oh71FJcDz6S2.length();
                final int i17 = 0;
                defpackage.n10 n10Var = new defpackage.n10() { // from class: im1
                    @Override // defpackage.n10
                    public final java.lang.Object ZpBGe2uQfcn8() {
                        int i18 = i17;
                        defpackage.gs1 gs1Var2 = defpackage.gs1.ZpBGe2uQfcn8;
                        defpackage.em1 em1Var3 = em1Var2;
                        switch (i18) {
                            case 0:
                                break;
                            case 1:
                                defpackage.nm1 WDYagTQQm9ns8 = defpackage.em1.WDYagTQQm9ns(em1Var3.gUjdnLbkVAaA().ZpBGe2uQfcn8, defpackage.j80.JhCgjQRTAOCT(0, em1Var3.gUjdnLbkVAaA().ZpBGe2uQfcn8.oh71FJcDz6S2.length()));
                                em1Var3.fWTAfUmVKrZq.P05cfTpS5W5L(WDYagTQQm9ns8);
                                long j12 = WDYagTQQm9ns8.giKS3J6vZuNy;
                                em1Var3.maCixPsq4ml2 = new defpackage.in1(j12);
                                em1Var3.ZVVdXbWmyCSK = defpackage.nm1.ZpBGe2uQfcn8(em1Var3.ZVVdXbWmyCSK, null, j12, 5);
                                em1Var3.P05cfTpS5W5L(true);
                                break;
                            default:
                                defpackage.n10 n10Var2 = em1Var3.oh71FJcDz6S2;
                                if (n10Var2 != null) {
                                    n10Var2.ZpBGe2uQfcn8();
                                    break;
                                }
                                break;
                        }
                        return gs1Var2;
                    }
                };
                final int i18 = 1;
                defpackage.n10 n10Var2 = new defpackage.n10() { // from class: im1
                    @Override // defpackage.n10
                    public final java.lang.Object ZpBGe2uQfcn8() {
                        int i182 = i18;
                        defpackage.gs1 gs1Var2 = defpackage.gs1.ZpBGe2uQfcn8;
                        defpackage.em1 em1Var3 = em1Var2;
                        switch (i182) {
                            case 0:
                                break;
                            case 1:
                                defpackage.nm1 WDYagTQQm9ns8 = defpackage.em1.WDYagTQQm9ns(em1Var3.gUjdnLbkVAaA().ZpBGe2uQfcn8, defpackage.j80.JhCgjQRTAOCT(0, em1Var3.gUjdnLbkVAaA().ZpBGe2uQfcn8.oh71FJcDz6S2.length()));
                                em1Var3.fWTAfUmVKrZq.P05cfTpS5W5L(WDYagTQQm9ns8);
                                long j12 = WDYagTQQm9ns8.giKS3J6vZuNy;
                                em1Var3.maCixPsq4ml2 = new defpackage.in1(j12);
                                em1Var3.ZVVdXbWmyCSK = defpackage.nm1.ZpBGe2uQfcn8(em1Var3.ZVVdXbWmyCSK, null, j12, 5);
                                em1Var3.P05cfTpS5W5L(true);
                                break;
                            default:
                                defpackage.n10 n10Var22 = em1Var3.oh71FJcDz6S2;
                                if (n10Var22 != null) {
                                    n10Var22.ZpBGe2uQfcn8();
                                    break;
                                }
                                break;
                        }
                        return gs1Var2;
                    }
                };
                android.content.res.Resources resources4 = context2.getResources();
                defpackage.m91 m91Var4 = new defpackage.m91(i7, n10Var2, n10Var);
                if (z7) {
                    sn0Var2.ZpBGe2uQfcn8(new defpackage.hk1(defpackage.ma0.eSwlWMUpitz8, resources4.getString(android.R.string.selectAll), android.R.attr.actionModeSelectAllDrawable, m91Var4));
                }
                if (android.os.Build.VERSION.SDK_INT >= 26) {
                    defpackage.ik1 ik1Var5 = defpackage.ik1.Autofill;
                    boolean z8 = em1Var2.GE9mJIPrb8gP() && defpackage.in1.fWTAfUmVKrZq(em1Var2.gUjdnLbkVAaA().giKS3J6vZuNy);
                    defpackage.n10 n10Var3 = new defpackage.n10() { // from class: im1
                        @Override // defpackage.n10
                        public final java.lang.Object ZpBGe2uQfcn8() {
                            int i182 = i6;
                            defpackage.gs1 gs1Var2 = defpackage.gs1.ZpBGe2uQfcn8;
                            defpackage.em1 em1Var3 = em1Var2;
                            switch (i182) {
                                case 0:
                                    break;
                                case 1:
                                    defpackage.nm1 WDYagTQQm9ns8 = defpackage.em1.WDYagTQQm9ns(em1Var3.gUjdnLbkVAaA().ZpBGe2uQfcn8, defpackage.j80.JhCgjQRTAOCT(0, em1Var3.gUjdnLbkVAaA().ZpBGe2uQfcn8.oh71FJcDz6S2.length()));
                                    em1Var3.fWTAfUmVKrZq.P05cfTpS5W5L(WDYagTQQm9ns8);
                                    long j12 = WDYagTQQm9ns8.giKS3J6vZuNy;
                                    em1Var3.maCixPsq4ml2 = new defpackage.in1(j12);
                                    em1Var3.ZVVdXbWmyCSK = defpackage.nm1.ZpBGe2uQfcn8(em1Var3.ZVVdXbWmyCSK, null, j12, 5);
                                    em1Var3.P05cfTpS5W5L(true);
                                    break;
                                default:
                                    defpackage.n10 n10Var22 = em1Var3.oh71FJcDz6S2;
                                    if (n10Var22 != null) {
                                        n10Var22.ZpBGe2uQfcn8();
                                        break;
                                    }
                                    break;
                            }
                            return gs1Var2;
                        }
                    };
                    android.content.res.Resources resources5 = context2.getResources();
                    defpackage.m91 m91Var5 = new defpackage.m91(i7, n10Var3, klVar);
                    if (z8) {
                        sn0Var2.ZpBGe2uQfcn8(new defpackage.hk1(ik1Var5.WDYagTQQm9ns, resources5.getString(ik1Var5.oh71FJcDz6S2), ik1Var5.QiMR8OkAhezm, m91Var5));
                    }
                }
                sn0Var2.ZpBGe2uQfcn8(lk1Var);
                return gs1Var;
        }
    }

    public /* synthetic */ eSwlWMUpitz8(defpackage.y10 y10Var, defpackage.fo0 fo0Var, defpackage.fo0 fo0Var2) {
        this.WDYagTQQm9ns = 1;
        this.oh71FJcDz6S2 = y10Var;
        this.QiMR8OkAhezm = fo0Var;
        this.P05cfTpS5W5L = fo0Var2;
    }

    public /* synthetic */ eSwlWMUpitz8(defpackage.wg0 wg0Var, defpackage.dh0 dh0Var, defpackage.y10 y10Var) {
        this.WDYagTQQm9ns = 7;
        this.QiMR8OkAhezm = wg0Var;
        this.P05cfTpS5W5L = dh0Var;
        this.oh71FJcDz6S2 = y10Var;
    }

    public /* synthetic */ eSwlWMUpitz8(defpackage.fo0 fo0Var, java.util.ArrayList arrayList, java.util.List list, boolean z) {
        this.WDYagTQQm9ns = 6;
        this.QiMR8OkAhezm = fo0Var;
        this.oh71FJcDz6S2 = arrayList;
        this.P05cfTpS5W5L = list;
    }

    public /* synthetic */ eSwlWMUpitz8(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.WDYagTQQm9ns = i;
        this.QiMR8OkAhezm = obj;
        this.oh71FJcDz6S2 = obj2;
        this.P05cfTpS5W5L = obj3;
    }
}
