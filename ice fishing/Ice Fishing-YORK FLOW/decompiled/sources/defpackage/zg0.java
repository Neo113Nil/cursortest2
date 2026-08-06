package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class zg0 {
    public int JhCgjQRTAOCT;
    public defpackage.pg0 P05cfTpS5W5L;
    public final java.util.ArrayList QiMR8OkAhezm;
    public boolean WDYagTQQm9ns;
    public final boolean ZpBGe2uQfcn8;
    public final defpackage.gg1 e6mdH7fiFuta;
    public final defpackage.yu1 fWTAfUmVKrZq;
    public defpackage.a7 giKS3J6vZuNy;
    public boolean oh71FJcDz6S2;

    public zg0(defpackage.wg0 wg0Var, boolean z) {
        new java.util.concurrent.atomic.AtomicReference(null);
        this.ZpBGe2uQfcn8 = z;
        this.giKS3J6vZuNy = new defpackage.a7(6);
        this.fWTAfUmVKrZq = new defpackage.yu1(wg0Var);
        this.QiMR8OkAhezm = new java.util.ArrayList();
        defpackage.pg0 pg0Var = defpackage.pg0.oh71FJcDz6S2;
        this.P05cfTpS5W5L = pg0Var;
        this.e6mdH7fiFuta = defpackage.nq1.fNwYGHIYeJcR(pg0Var);
    }

    public final void JhCgjQRTAOCT(defpackage.og0 og0Var) {
        og0Var.getClass();
        fWTAfUmVKrZq("handleLifecycleEvent");
        WDYagTQQm9ns(og0Var.ZpBGe2uQfcn8());
    }

    public final void QiMR8OkAhezm() {
        java.lang.Object obj = this.fWTAfUmVKrZq.ZpBGe2uQfcn8.get();
        if (obj == null) {
            defpackage.h7.P05cfTpS5W5L("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        final defpackage.wg0 wg0Var = (defpackage.wg0) obj;
        while (true) {
            defpackage.a7 a7Var = this.giKS3J6vZuNy;
            final int i = 0;
            if (((defpackage.yn0) a7Var.giKS3J6vZuNy).WDYagTQQm9ns == 0) {
                break;
            }
            defpackage.xw xwVar = (defpackage.xw) a7Var.fWTAfUmVKrZq;
            if (xwVar == null) {
                throw new java.util.NoSuchElementException("Collection is empty.");
            }
            defpackage.pg0 pg0Var = xwVar.oh71FJcDz6S2.ZpBGe2uQfcn8;
            defpackage.xw xwVar2 = (defpackage.xw) a7Var.JhCgjQRTAOCT;
            if (xwVar2 == null) {
                throw new java.util.NoSuchElementException("Collection is empty.");
            }
            defpackage.pg0 pg0Var2 = xwVar2.oh71FJcDz6S2.ZpBGe2uQfcn8;
            if (pg0Var == pg0Var2 && this.P05cfTpS5W5L == pg0Var2) {
                break;
            }
            this.oh71FJcDz6S2 = false;
            defpackage.pg0 pg0Var3 = this.P05cfTpS5W5L;
            if (xwVar == null) {
                throw new java.util.NoSuchElementException("Collection is empty.");
            }
            if (pg0Var3.compareTo(pg0Var) < 0) {
                defpackage.a7 a7Var2 = this.giKS3J6vZuNy;
                defpackage.y10 y10Var = new defpackage.y10(this) { // from class: xg0
                    public final /* synthetic */ defpackage.zg0 oh71FJcDz6S2;

                    {
                        this.oh71FJcDz6S2 = this;
                    }

                    @Override // defpackage.y10
                    public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj2) {
                        int i2 = i;
                        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
                        defpackage.wg0 wg0Var2 = wg0Var;
                        defpackage.zg0 zg0Var = this.oh71FJcDz6S2;
                        java.util.Map.Entry entry = (java.util.Map.Entry) obj2;
                        switch (i2) {
                            case 0:
                                entry.getClass();
                                defpackage.vg0 vg0Var = (defpackage.vg0) entry.getKey();
                                defpackage.yg0 yg0Var = (defpackage.yg0) entry.getValue();
                                while (true) {
                                    defpackage.pg0 pg0Var4 = yg0Var.ZpBGe2uQfcn8;
                                    defpackage.pg0 pg0Var5 = zg0Var.P05cfTpS5W5L;
                                    java.util.ArrayList arrayList = zg0Var.QiMR8OkAhezm;
                                    if (pg0Var4.compareTo(pg0Var5) > 0 && !zg0Var.oh71FJcDz6S2) {
                                        defpackage.a7 a7Var3 = zg0Var.giKS3J6vZuNy;
                                        a7Var3.getClass();
                                        vg0Var.getClass();
                                        if (!((defpackage.yn0) a7Var3.giKS3J6vZuNy).fWTAfUmVKrZq(vg0Var)) {
                                            break;
                                        } else {
                                            defpackage.mg0 mg0Var = defpackage.og0.Companion;
                                            defpackage.pg0 pg0Var6 = yg0Var.ZpBGe2uQfcn8;
                                            mg0Var.getClass();
                                            pg0Var6.getClass();
                                            int ordinal = pg0Var6.ordinal();
                                            defpackage.og0 og0Var = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : defpackage.og0.ON_PAUSE : defpackage.og0.ON_STOP : defpackage.og0.ON_DESTROY;
                                            if (og0Var == null) {
                                                defpackage.h7.ZVVdXbWmyCSK(yg0Var.ZpBGe2uQfcn8, "no event down from ");
                                                break;
                                            } else {
                                                arrayList.add(og0Var.ZpBGe2uQfcn8());
                                                yg0Var.ZpBGe2uQfcn8(wg0Var2, og0Var);
                                                defpackage.nf.EPEWHACkMcF1(arrayList);
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                entry.getClass();
                                defpackage.vg0 vg0Var2 = (defpackage.vg0) entry.getKey();
                                defpackage.yg0 yg0Var2 = (defpackage.yg0) entry.getValue();
                                while (true) {
                                    defpackage.pg0 pg0Var7 = yg0Var2.ZpBGe2uQfcn8;
                                    defpackage.pg0 pg0Var8 = zg0Var.P05cfTpS5W5L;
                                    java.util.ArrayList arrayList2 = zg0Var.QiMR8OkAhezm;
                                    if (pg0Var7.compareTo(pg0Var8) < 0 && !zg0Var.oh71FJcDz6S2) {
                                        defpackage.a7 a7Var4 = zg0Var.giKS3J6vZuNy;
                                        a7Var4.getClass();
                                        vg0Var2.getClass();
                                        if (!((defpackage.yn0) a7Var4.giKS3J6vZuNy).fWTAfUmVKrZq(vg0Var2)) {
                                            break;
                                        } else {
                                            arrayList2.add(yg0Var2.ZpBGe2uQfcn8);
                                            defpackage.mg0 mg0Var2 = defpackage.og0.Companion;
                                            defpackage.pg0 pg0Var9 = yg0Var2.ZpBGe2uQfcn8;
                                            mg0Var2.getClass();
                                            pg0Var9.getClass();
                                            int ordinal2 = pg0Var9.ordinal();
                                            defpackage.og0 og0Var2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : defpackage.og0.ON_RESUME : defpackage.og0.ON_START : defpackage.og0.ON_CREATE;
                                            if (og0Var2 == null) {
                                                defpackage.h7.ZVVdXbWmyCSK(yg0Var2.ZpBGe2uQfcn8, "no event up from ");
                                                break;
                                            } else {
                                                yg0Var2.ZpBGe2uQfcn8(wg0Var2, og0Var2);
                                                defpackage.nf.EPEWHACkMcF1(arrayList2);
                                            }
                                        }
                                    }
                                }
                                break;
                        }
                        return null;
                    }
                };
                a7Var2.getClass();
                for (defpackage.xw xwVar3 = (defpackage.xw) a7Var2.JhCgjQRTAOCT; xwVar3 != null; xwVar3 = xwVar3.P05cfTpS5W5L) {
                    if (!xwVar3.e6mdH7fiFuta) {
                        y10Var.P05cfTpS5W5L(xwVar3);
                    }
                }
            }
            defpackage.xw xwVar4 = (defpackage.xw) this.giKS3J6vZuNy.JhCgjQRTAOCT;
            if (!this.oh71FJcDz6S2 && xwVar4 != null && this.P05cfTpS5W5L.compareTo(xwVar4.oh71FJcDz6S2.ZpBGe2uQfcn8) > 0) {
                defpackage.a7 a7Var3 = this.giKS3J6vZuNy;
                final int i2 = 1;
                defpackage.y10 y10Var2 = new defpackage.y10(this) { // from class: xg0
                    public final /* synthetic */ defpackage.zg0 oh71FJcDz6S2;

                    {
                        this.oh71FJcDz6S2 = this;
                    }

                    @Override // defpackage.y10
                    public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj2) {
                        int i22 = i2;
                        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
                        defpackage.wg0 wg0Var2 = wg0Var;
                        defpackage.zg0 zg0Var = this.oh71FJcDz6S2;
                        java.util.Map.Entry entry = (java.util.Map.Entry) obj2;
                        switch (i22) {
                            case 0:
                                entry.getClass();
                                defpackage.vg0 vg0Var = (defpackage.vg0) entry.getKey();
                                defpackage.yg0 yg0Var = (defpackage.yg0) entry.getValue();
                                while (true) {
                                    defpackage.pg0 pg0Var4 = yg0Var.ZpBGe2uQfcn8;
                                    defpackage.pg0 pg0Var5 = zg0Var.P05cfTpS5W5L;
                                    java.util.ArrayList arrayList = zg0Var.QiMR8OkAhezm;
                                    if (pg0Var4.compareTo(pg0Var5) > 0 && !zg0Var.oh71FJcDz6S2) {
                                        defpackage.a7 a7Var32 = zg0Var.giKS3J6vZuNy;
                                        a7Var32.getClass();
                                        vg0Var.getClass();
                                        if (!((defpackage.yn0) a7Var32.giKS3J6vZuNy).fWTAfUmVKrZq(vg0Var)) {
                                            break;
                                        } else {
                                            defpackage.mg0 mg0Var = defpackage.og0.Companion;
                                            defpackage.pg0 pg0Var6 = yg0Var.ZpBGe2uQfcn8;
                                            mg0Var.getClass();
                                            pg0Var6.getClass();
                                            int ordinal = pg0Var6.ordinal();
                                            defpackage.og0 og0Var = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : defpackage.og0.ON_PAUSE : defpackage.og0.ON_STOP : defpackage.og0.ON_DESTROY;
                                            if (og0Var == null) {
                                                defpackage.h7.ZVVdXbWmyCSK(yg0Var.ZpBGe2uQfcn8, "no event down from ");
                                                break;
                                            } else {
                                                arrayList.add(og0Var.ZpBGe2uQfcn8());
                                                yg0Var.ZpBGe2uQfcn8(wg0Var2, og0Var);
                                                defpackage.nf.EPEWHACkMcF1(arrayList);
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                entry.getClass();
                                defpackage.vg0 vg0Var2 = (defpackage.vg0) entry.getKey();
                                defpackage.yg0 yg0Var2 = (defpackage.yg0) entry.getValue();
                                while (true) {
                                    defpackage.pg0 pg0Var7 = yg0Var2.ZpBGe2uQfcn8;
                                    defpackage.pg0 pg0Var8 = zg0Var.P05cfTpS5W5L;
                                    java.util.ArrayList arrayList2 = zg0Var.QiMR8OkAhezm;
                                    if (pg0Var7.compareTo(pg0Var8) < 0 && !zg0Var.oh71FJcDz6S2) {
                                        defpackage.a7 a7Var4 = zg0Var.giKS3J6vZuNy;
                                        a7Var4.getClass();
                                        vg0Var2.getClass();
                                        if (!((defpackage.yn0) a7Var4.giKS3J6vZuNy).fWTAfUmVKrZq(vg0Var2)) {
                                            break;
                                        } else {
                                            arrayList2.add(yg0Var2.ZpBGe2uQfcn8);
                                            defpackage.mg0 mg0Var2 = defpackage.og0.Companion;
                                            defpackage.pg0 pg0Var9 = yg0Var2.ZpBGe2uQfcn8;
                                            mg0Var2.getClass();
                                            pg0Var9.getClass();
                                            int ordinal2 = pg0Var9.ordinal();
                                            defpackage.og0 og0Var2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : defpackage.og0.ON_RESUME : defpackage.og0.ON_START : defpackage.og0.ON_CREATE;
                                            if (og0Var2 == null) {
                                                defpackage.h7.ZVVdXbWmyCSK(yg0Var2.ZpBGe2uQfcn8, "no event up from ");
                                                break;
                                            } else {
                                                yg0Var2.ZpBGe2uQfcn8(wg0Var2, og0Var2);
                                                defpackage.nf.EPEWHACkMcF1(arrayList2);
                                            }
                                        }
                                    }
                                }
                                break;
                        }
                        return null;
                    }
                };
                a7Var3.getClass();
                for (defpackage.xw xwVar5 = (defpackage.xw) a7Var3.fWTAfUmVKrZq; xwVar5 != null; xwVar5 = xwVar5.QiMR8OkAhezm) {
                    if (!xwVar5.e6mdH7fiFuta) {
                        y10Var2.P05cfTpS5W5L(xwVar5);
                    }
                }
            }
        }
        this.oh71FJcDz6S2 = false;
        this.e6mdH7fiFuta.e6mdH7fiFuta(this.P05cfTpS5W5L);
    }

    public final void WDYagTQQm9ns(defpackage.pg0 pg0Var) {
        if (this.P05cfTpS5W5L == pg0Var) {
            return;
        }
        defpackage.wg0 wg0Var = (defpackage.wg0) this.fWTAfUmVKrZq.ZpBGe2uQfcn8.get();
        defpackage.pg0 pg0Var2 = this.P05cfTpS5W5L;
        defpackage.pg0 pg0Var3 = defpackage.pg0.oh71FJcDz6S2;
        defpackage.pg0 pg0Var4 = defpackage.pg0.WDYagTQQm9ns;
        if (pg0Var2 == pg0Var3 && pg0Var == pg0Var4) {
            throw new java.lang.IllegalStateException(("State must be at least '" + defpackage.pg0.QiMR8OkAhezm + "' to be moved to '" + pg0Var + "' in component " + wg0Var).toString());
        }
        if (pg0Var2 == pg0Var4 && pg0Var2 != pg0Var) {
            throw new java.lang.IllegalStateException(("State is '" + pg0Var4 + "' and cannot be moved to `" + pg0Var + "` in component " + wg0Var).toString());
        }
        this.P05cfTpS5W5L = pg0Var;
        if (this.WDYagTQQm9ns || this.JhCgjQRTAOCT != 0) {
            this.oh71FJcDz6S2 = true;
            return;
        }
        this.WDYagTQQm9ns = true;
        QiMR8OkAhezm();
        this.WDYagTQQm9ns = false;
        if (this.P05cfTpS5W5L == pg0Var4) {
            this.giKS3J6vZuNy = new defpackage.a7(6);
        }
    }

    public final void ZpBGe2uQfcn8(defpackage.vg0 vg0Var) {
        defpackage.ug0 ioVar;
        defpackage.yg0 yg0Var;
        defpackage.wg0 wg0Var;
        vg0Var.getClass();
        fWTAfUmVKrZq("addObserver");
        defpackage.pg0 pg0Var = this.P05cfTpS5W5L;
        defpackage.pg0 pg0Var2 = defpackage.pg0.WDYagTQQm9ns;
        if (pg0Var != pg0Var2) {
            pg0Var2 = defpackage.pg0.oh71FJcDz6S2;
        }
        defpackage.yg0 yg0Var2 = new defpackage.yg0();
        yg0Var2.ZpBGe2uQfcn8 = pg0Var2;
        java.util.HashMap hashMap = defpackage.eh0.ZpBGe2uQfcn8;
        boolean z = vg0Var instanceof defpackage.ug0;
        boolean z2 = vg0Var instanceof defpackage.go;
        int i = 2;
        if (z && z2) {
            ioVar = new defpackage.io((defpackage.go) vg0Var, (defpackage.ug0) vg0Var);
        } else if (z2) {
            ioVar = new defpackage.io((defpackage.go) vg0Var, (defpackage.ug0) null);
        } else if (z) {
            ioVar = (defpackage.ug0) vg0Var;
        } else {
            java.lang.Class<?> cls = vg0Var.getClass();
            if (defpackage.eh0.giKS3J6vZuNy(cls) == 2) {
                java.lang.Object obj = defpackage.eh0.giKS3J6vZuNy.get(cls);
                obj.getClass();
                java.util.List list = (java.util.List) obj;
                if (list.size() == 1) {
                    defpackage.eh0.ZpBGe2uQfcn8((java.lang.reflect.Constructor) list.get(0), vg0Var);
                    throw null;
                }
                int size = list.size();
                defpackage.k30[] k30VarArr = new defpackage.k30[size];
                if (size > 0) {
                    defpackage.eh0.ZpBGe2uQfcn8((java.lang.reflect.Constructor) list.get(0), vg0Var);
                    throw null;
                }
                ioVar = new defpackage.r31(i, k30VarArr);
            } else {
                ioVar = new defpackage.io(vg0Var);
            }
        }
        yg0Var2.giKS3J6vZuNy = ioVar;
        defpackage.a7 a7Var = this.giKS3J6vZuNy;
        a7Var.getClass();
        defpackage.yn0 yn0Var = (defpackage.yn0) a7Var.giKS3J6vZuNy;
        defpackage.xw xwVar = (defpackage.xw) yn0Var.QiMR8OkAhezm(vg0Var);
        if (xwVar != null) {
            yg0Var = xwVar.oh71FJcDz6S2;
        } else {
            defpackage.xw xwVar2 = new defpackage.xw(vg0Var, yg0Var2);
            yn0Var.h3m55N1URyyK(vg0Var, xwVar2);
            defpackage.xw xwVar3 = (defpackage.xw) a7Var.JhCgjQRTAOCT;
            if (xwVar3 == null) {
                a7Var.fWTAfUmVKrZq = xwVar2;
                a7Var.JhCgjQRTAOCT = xwVar2;
            } else {
                xwVar3.QiMR8OkAhezm = xwVar2;
                xwVar2.P05cfTpS5W5L = xwVar3;
                a7Var.JhCgjQRTAOCT = xwVar2;
            }
            yg0Var = null;
        }
        if (yg0Var == null && (wg0Var = (defpackage.wg0) this.fWTAfUmVKrZq.ZpBGe2uQfcn8.get()) != null) {
            boolean z3 = this.JhCgjQRTAOCT != 0 || this.WDYagTQQm9ns;
            defpackage.pg0 giKS3J6vZuNy = giKS3J6vZuNy(vg0Var);
            this.JhCgjQRTAOCT++;
            while (yg0Var2.ZpBGe2uQfcn8.compareTo(giKS3J6vZuNy) < 0) {
                defpackage.a7 a7Var2 = this.giKS3J6vZuNy;
                a7Var2.getClass();
                if (!((defpackage.yn0) a7Var2.giKS3J6vZuNy).fWTAfUmVKrZq(vg0Var)) {
                    break;
                }
                defpackage.pg0 pg0Var3 = yg0Var2.ZpBGe2uQfcn8;
                java.util.ArrayList arrayList = this.QiMR8OkAhezm;
                arrayList.add(pg0Var3);
                defpackage.mg0 mg0Var = defpackage.og0.Companion;
                defpackage.pg0 pg0Var4 = yg0Var2.ZpBGe2uQfcn8;
                mg0Var.getClass();
                pg0Var4.getClass();
                int ordinal = pg0Var4.ordinal();
                defpackage.og0 og0Var = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : defpackage.og0.ON_RESUME : defpackage.og0.ON_START : defpackage.og0.ON_CREATE;
                if (og0Var == null) {
                    defpackage.h7.XntWc4eZSQ8j(yg0Var2.ZpBGe2uQfcn8, "no event up from ");
                    return;
                } else {
                    yg0Var2.ZpBGe2uQfcn8(wg0Var, og0Var);
                    defpackage.nf.EPEWHACkMcF1(arrayList);
                    giKS3J6vZuNy = giKS3J6vZuNy(vg0Var);
                }
            }
            if (!z3) {
                QiMR8OkAhezm();
            }
            this.JhCgjQRTAOCT--;
        }
    }

    public final void fWTAfUmVKrZq(java.lang.String str) {
        if (this.ZpBGe2uQfcn8) {
            defpackage.g7.BXaznwstz2U0().WDYagTQQm9ns.getClass();
            if (android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()) {
                return;
            }
            defpackage.h7.e6mdH7fiFuta("Method ", str, " must be called on the main thread");
        }
    }

    public final defpackage.pg0 giKS3J6vZuNy(defpackage.vg0 vg0Var) {
        defpackage.a7 a7Var = this.giKS3J6vZuNy;
        a7Var.getClass();
        vg0Var.getClass();
        defpackage.xw xwVar = (defpackage.xw) ((defpackage.yn0) a7Var.giKS3J6vZuNy).QiMR8OkAhezm(vg0Var);
        defpackage.xw xwVar2 = xwVar != null ? xwVar.P05cfTpS5W5L : null;
        defpackage.pg0 pg0Var = xwVar2 != null ? xwVar2.oh71FJcDz6S2.ZpBGe2uQfcn8 : null;
        java.util.ArrayList arrayList = this.QiMR8OkAhezm;
        defpackage.pg0 pg0Var2 = arrayList.isEmpty() ? null : (defpackage.pg0) arrayList.get(arrayList.size() - 1);
        defpackage.pg0 pg0Var3 = this.P05cfTpS5W5L;
        if (pg0Var == null || pg0Var.compareTo(pg0Var3) >= 0) {
            pg0Var = pg0Var3;
        }
        return (pg0Var2 == null || pg0Var2.compareTo(pg0Var) >= 0) ? pg0Var : pg0Var2;
    }

    public final void oh71FJcDz6S2(defpackage.vg0 vg0Var) {
        vg0Var.getClass();
        fWTAfUmVKrZq("removeObserver");
        defpackage.a7 a7Var = this.giKS3J6vZuNy;
        a7Var.getClass();
        defpackage.xw xwVar = (defpackage.xw) ((defpackage.yn0) a7Var.giKS3J6vZuNy).Ns0WNyEWdPsk(vg0Var);
        if (xwVar == null) {
            return;
        }
        defpackage.xw xwVar2 = xwVar.P05cfTpS5W5L;
        defpackage.xw xwVar3 = xwVar.QiMR8OkAhezm;
        if (xwVar2 == null) {
            a7Var.fWTAfUmVKrZq = xwVar3;
        } else {
            xwVar2.QiMR8OkAhezm = xwVar3;
        }
        defpackage.xw xwVar4 = xwVar.QiMR8OkAhezm;
        if (xwVar4 == null) {
            a7Var.JhCgjQRTAOCT = xwVar2;
        } else {
            xwVar4.P05cfTpS5W5L = xwVar2;
        }
        xwVar.e6mdH7fiFuta = true;
    }
}
