package defpackage;

/* loaded from: classes.dex */
public final class xd0 {
    public final java.util.ArrayList AARZUJiTa;
    public defpackage.nd0 EXtogiMhuM;
    public int F7NU4MC0GW;
    public final boolean IHQe1A4L2xu;
    public boolean adDC3e2L;
    public defpackage.v5 oh6vYeIP;
    public final defpackage.in1 r1MBDhnF;
    public final defpackage.hc1 riuEU0zW4;
    public boolean xiZrDbcSW0;

    public xd0(defpackage.ud0 ud0Var, boolean z) {
        new java.util.concurrent.atomic.AtomicReference(null);
        this.IHQe1A4L2xu = z;
        this.oh6vYeIP = new defpackage.v5(5);
        this.r1MBDhnF = new defpackage.in1(ud0Var);
        this.AARZUJiTa = new java.util.ArrayList();
        defpackage.nd0 nd0Var = defpackage.nd0.xiZrDbcSW0;
        this.EXtogiMhuM = nd0Var;
        this.riuEU0zW4 = defpackage.gq1.F7NU4MC0GW(nd0Var);
    }

    public final void AARZUJiTa() {
        java.lang.Object obj = this.r1MBDhnF.IHQe1A4L2xu.get();
        if (obj == null) {
            defpackage.db.AARZUJiTa("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        final defpackage.ud0 ud0Var = (defpackage.ud0) obj;
        while (true) {
            defpackage.v5 v5Var = this.oh6vYeIP;
            final int i = 0;
            if (((defpackage.nl0) v5Var.oh6vYeIP).adDC3e2L == 0) {
                break;
            }
            defpackage.bv bvVar = (defpackage.bv) v5Var.r1MBDhnF;
            if (bvVar == null) {
                throw new java.util.NoSuchElementException("Collection is empty.");
            }
            defpackage.nd0 nd0Var = bvVar.xiZrDbcSW0.IHQe1A4L2xu;
            defpackage.bv bvVar2 = (defpackage.bv) v5Var.F7NU4MC0GW;
            if (bvVar2 == null) {
                throw new java.util.NoSuchElementException("Collection is empty.");
            }
            defpackage.nd0 nd0Var2 = bvVar2.xiZrDbcSW0.IHQe1A4L2xu;
            if (nd0Var == nd0Var2 && this.EXtogiMhuM == nd0Var2) {
                break;
            }
            this.xiZrDbcSW0 = false;
            defpackage.nd0 nd0Var3 = this.EXtogiMhuM;
            if (bvVar == null) {
                throw new java.util.NoSuchElementException("Collection is empty.");
            }
            if (nd0Var3.compareTo(nd0Var) < 0) {
                defpackage.v5 v5Var2 = this.oh6vYeIP;
                defpackage.g00 g00Var = new defpackage.g00(this) { // from class: vd0
                    public final /* synthetic */ defpackage.xd0 xiZrDbcSW0;

                    {
                        this.xiZrDbcSW0 = this;
                    }

                    @Override // defpackage.g00
                    public final java.lang.Object AARZUJiTa(java.lang.Object obj2) {
                        int i2 = i;
                        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
                        defpackage.ud0 ud0Var2 = ud0Var;
                        defpackage.xd0 xd0Var = this.xiZrDbcSW0;
                        java.util.Map.Entry entry = (java.util.Map.Entry) obj2;
                        switch (i2) {
                            case 0:
                                entry.getClass();
                                defpackage.td0 td0Var = (defpackage.td0) entry.getKey();
                                defpackage.wd0 wd0Var = (defpackage.wd0) entry.getValue();
                                while (true) {
                                    defpackage.nd0 nd0Var4 = wd0Var.IHQe1A4L2xu;
                                    defpackage.nd0 nd0Var5 = xd0Var.EXtogiMhuM;
                                    java.util.ArrayList arrayList = xd0Var.AARZUJiTa;
                                    if (nd0Var4.compareTo(nd0Var5) > 0 && !xd0Var.xiZrDbcSW0) {
                                        defpackage.v5 v5Var3 = xd0Var.oh6vYeIP;
                                        v5Var3.getClass();
                                        td0Var.getClass();
                                        if (!((defpackage.nl0) v5Var3.oh6vYeIP).r1MBDhnF(td0Var)) {
                                            break;
                                        } else {
                                            defpackage.kd0 kd0Var = defpackage.md0.Companion;
                                            defpackage.nd0 nd0Var6 = wd0Var.IHQe1A4L2xu;
                                            kd0Var.getClass();
                                            nd0Var6.getClass();
                                            int ordinal = nd0Var6.ordinal();
                                            defpackage.md0 md0Var = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : defpackage.md0.ON_PAUSE : defpackage.md0.ON_STOP : defpackage.md0.ON_DESTROY;
                                            if (md0Var == null) {
                                                defpackage.db.EgCjBq0SZwJ(wd0Var.IHQe1A4L2xu, "no event down from ");
                                                break;
                                            } else {
                                                arrayList.add(md0Var.IHQe1A4L2xu());
                                                wd0Var.IHQe1A4L2xu(ud0Var2, md0Var);
                                                defpackage.yd.nVhUznk1t(arrayList);
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                entry.getClass();
                                defpackage.td0 td0Var2 = (defpackage.td0) entry.getKey();
                                defpackage.wd0 wd0Var2 = (defpackage.wd0) entry.getValue();
                                while (true) {
                                    defpackage.nd0 nd0Var7 = wd0Var2.IHQe1A4L2xu;
                                    defpackage.nd0 nd0Var8 = xd0Var.EXtogiMhuM;
                                    java.util.ArrayList arrayList2 = xd0Var.AARZUJiTa;
                                    if (nd0Var7.compareTo(nd0Var8) < 0 && !xd0Var.xiZrDbcSW0) {
                                        defpackage.v5 v5Var4 = xd0Var.oh6vYeIP;
                                        v5Var4.getClass();
                                        td0Var2.getClass();
                                        if (!((defpackage.nl0) v5Var4.oh6vYeIP).r1MBDhnF(td0Var2)) {
                                            break;
                                        } else {
                                            arrayList2.add(wd0Var2.IHQe1A4L2xu);
                                            defpackage.kd0 kd0Var2 = defpackage.md0.Companion;
                                            defpackage.nd0 nd0Var9 = wd0Var2.IHQe1A4L2xu;
                                            kd0Var2.getClass();
                                            nd0Var9.getClass();
                                            int ordinal2 = nd0Var9.ordinal();
                                            defpackage.md0 md0Var2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : defpackage.md0.ON_RESUME : defpackage.md0.ON_START : defpackage.md0.ON_CREATE;
                                            if (md0Var2 == null) {
                                                defpackage.db.EgCjBq0SZwJ(wd0Var2.IHQe1A4L2xu, "no event up from ");
                                                break;
                                            } else {
                                                wd0Var2.IHQe1A4L2xu(ud0Var2, md0Var2);
                                                defpackage.yd.nVhUznk1t(arrayList2);
                                            }
                                        }
                                    }
                                }
                                break;
                        }
                        return null;
                    }
                };
                v5Var2.getClass();
                for (defpackage.bv bvVar3 = (defpackage.bv) v5Var2.F7NU4MC0GW; bvVar3 != null; bvVar3 = bvVar3.EXtogiMhuM) {
                    if (!bvVar3.riuEU0zW4) {
                        g00Var.AARZUJiTa(bvVar3);
                    }
                }
            }
            defpackage.bv bvVar4 = (defpackage.bv) this.oh6vYeIP.F7NU4MC0GW;
            if (!this.xiZrDbcSW0 && bvVar4 != null && this.EXtogiMhuM.compareTo(bvVar4.xiZrDbcSW0.IHQe1A4L2xu) > 0) {
                defpackage.v5 v5Var3 = this.oh6vYeIP;
                final int i2 = 1;
                defpackage.g00 g00Var2 = new defpackage.g00(this) { // from class: vd0
                    public final /* synthetic */ defpackage.xd0 xiZrDbcSW0;

                    {
                        this.xiZrDbcSW0 = this;
                    }

                    @Override // defpackage.g00
                    public final java.lang.Object AARZUJiTa(java.lang.Object obj2) {
                        int i22 = i2;
                        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
                        defpackage.ud0 ud0Var2 = ud0Var;
                        defpackage.xd0 xd0Var = this.xiZrDbcSW0;
                        java.util.Map.Entry entry = (java.util.Map.Entry) obj2;
                        switch (i22) {
                            case 0:
                                entry.getClass();
                                defpackage.td0 td0Var = (defpackage.td0) entry.getKey();
                                defpackage.wd0 wd0Var = (defpackage.wd0) entry.getValue();
                                while (true) {
                                    defpackage.nd0 nd0Var4 = wd0Var.IHQe1A4L2xu;
                                    defpackage.nd0 nd0Var5 = xd0Var.EXtogiMhuM;
                                    java.util.ArrayList arrayList = xd0Var.AARZUJiTa;
                                    if (nd0Var4.compareTo(nd0Var5) > 0 && !xd0Var.xiZrDbcSW0) {
                                        defpackage.v5 v5Var32 = xd0Var.oh6vYeIP;
                                        v5Var32.getClass();
                                        td0Var.getClass();
                                        if (!((defpackage.nl0) v5Var32.oh6vYeIP).r1MBDhnF(td0Var)) {
                                            break;
                                        } else {
                                            defpackage.kd0 kd0Var = defpackage.md0.Companion;
                                            defpackage.nd0 nd0Var6 = wd0Var.IHQe1A4L2xu;
                                            kd0Var.getClass();
                                            nd0Var6.getClass();
                                            int ordinal = nd0Var6.ordinal();
                                            defpackage.md0 md0Var = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : defpackage.md0.ON_PAUSE : defpackage.md0.ON_STOP : defpackage.md0.ON_DESTROY;
                                            if (md0Var == null) {
                                                defpackage.db.EgCjBq0SZwJ(wd0Var.IHQe1A4L2xu, "no event down from ");
                                                break;
                                            } else {
                                                arrayList.add(md0Var.IHQe1A4L2xu());
                                                wd0Var.IHQe1A4L2xu(ud0Var2, md0Var);
                                                defpackage.yd.nVhUznk1t(arrayList);
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                entry.getClass();
                                defpackage.td0 td0Var2 = (defpackage.td0) entry.getKey();
                                defpackage.wd0 wd0Var2 = (defpackage.wd0) entry.getValue();
                                while (true) {
                                    defpackage.nd0 nd0Var7 = wd0Var2.IHQe1A4L2xu;
                                    defpackage.nd0 nd0Var8 = xd0Var.EXtogiMhuM;
                                    java.util.ArrayList arrayList2 = xd0Var.AARZUJiTa;
                                    if (nd0Var7.compareTo(nd0Var8) < 0 && !xd0Var.xiZrDbcSW0) {
                                        defpackage.v5 v5Var4 = xd0Var.oh6vYeIP;
                                        v5Var4.getClass();
                                        td0Var2.getClass();
                                        if (!((defpackage.nl0) v5Var4.oh6vYeIP).r1MBDhnF(td0Var2)) {
                                            break;
                                        } else {
                                            arrayList2.add(wd0Var2.IHQe1A4L2xu);
                                            defpackage.kd0 kd0Var2 = defpackage.md0.Companion;
                                            defpackage.nd0 nd0Var9 = wd0Var2.IHQe1A4L2xu;
                                            kd0Var2.getClass();
                                            nd0Var9.getClass();
                                            int ordinal2 = nd0Var9.ordinal();
                                            defpackage.md0 md0Var2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : defpackage.md0.ON_RESUME : defpackage.md0.ON_START : defpackage.md0.ON_CREATE;
                                            if (md0Var2 == null) {
                                                defpackage.db.EgCjBq0SZwJ(wd0Var2.IHQe1A4L2xu, "no event up from ");
                                                break;
                                            } else {
                                                wd0Var2.IHQe1A4L2xu(ud0Var2, md0Var2);
                                                defpackage.yd.nVhUznk1t(arrayList2);
                                            }
                                        }
                                    }
                                }
                                break;
                        }
                        return null;
                    }
                };
                v5Var3.getClass();
                for (defpackage.bv bvVar5 = (defpackage.bv) v5Var3.r1MBDhnF; bvVar5 != null; bvVar5 = bvVar5.AARZUJiTa) {
                    if (!bvVar5.riuEU0zW4) {
                        g00Var2.AARZUJiTa(bvVar5);
                    }
                }
            }
        }
        this.xiZrDbcSW0 = false;
        this.riuEU0zW4.SH1y5HwkJhh(this.EXtogiMhuM);
    }

    public final void F7NU4MC0GW(defpackage.md0 md0Var) {
        md0Var.getClass();
        r1MBDhnF("handleLifecycleEvent");
        adDC3e2L(md0Var.IHQe1A4L2xu());
    }

    public final void IHQe1A4L2xu(defpackage.td0 td0Var) {
        defpackage.sd0 anVar;
        defpackage.wd0 wd0Var;
        defpackage.ud0 ud0Var;
        td0Var.getClass();
        r1MBDhnF("addObserver");
        defpackage.nd0 nd0Var = this.EXtogiMhuM;
        defpackage.nd0 nd0Var2 = defpackage.nd0.adDC3e2L;
        if (nd0Var != nd0Var2) {
            nd0Var2 = defpackage.nd0.xiZrDbcSW0;
        }
        defpackage.wd0 wd0Var2 = new defpackage.wd0();
        wd0Var2.IHQe1A4L2xu = nd0Var2;
        java.util.HashMap hashMap = defpackage.ce0.IHQe1A4L2xu;
        boolean z = td0Var instanceof defpackage.sd0;
        boolean z2 = td0Var instanceof defpackage.ym;
        int i = 2;
        if (z && z2) {
            anVar = new defpackage.an((defpackage.ym) td0Var, (defpackage.sd0) td0Var);
        } else if (z2) {
            anVar = new defpackage.an((defpackage.ym) td0Var, (defpackage.sd0) null);
        } else if (z) {
            anVar = (defpackage.sd0) td0Var;
        } else {
            java.lang.Class<?> cls = td0Var.getClass();
            if (defpackage.ce0.oh6vYeIP(cls) == 2) {
                java.lang.Object obj = defpackage.ce0.oh6vYeIP.get(cls);
                obj.getClass();
                java.util.List list = (java.util.List) obj;
                if (list.size() == 1) {
                    defpackage.ce0.IHQe1A4L2xu((java.lang.reflect.Constructor) list.get(0), td0Var);
                    throw null;
                }
                int size = list.size();
                defpackage.y10[] y10VarArr = new defpackage.y10[size];
                if (size > 0) {
                    defpackage.ce0.IHQe1A4L2xu((java.lang.reflect.Constructor) list.get(0), td0Var);
                    throw null;
                }
                anVar = new defpackage.jz0(i, y10VarArr);
            } else {
                anVar = new defpackage.an(td0Var);
            }
        }
        wd0Var2.oh6vYeIP = anVar;
        defpackage.v5 v5Var = this.oh6vYeIP;
        v5Var.getClass();
        defpackage.nl0 nl0Var = (defpackage.nl0) v5Var.oh6vYeIP;
        defpackage.bv bvVar = (defpackage.bv) nl0Var.AARZUJiTa(td0Var);
        if (bvVar != null) {
            wd0Var = bvVar.xiZrDbcSW0;
        } else {
            defpackage.bv bvVar2 = new defpackage.bv(td0Var, wd0Var2);
            nl0Var.DFo87pBq1E5(td0Var, bvVar2);
            defpackage.bv bvVar3 = (defpackage.bv) v5Var.F7NU4MC0GW;
            if (bvVar3 == null) {
                v5Var.r1MBDhnF = bvVar2;
                v5Var.F7NU4MC0GW = bvVar2;
            } else {
                bvVar3.AARZUJiTa = bvVar2;
                bvVar2.EXtogiMhuM = bvVar3;
                v5Var.F7NU4MC0GW = bvVar2;
            }
            wd0Var = null;
        }
        if (wd0Var == null && (ud0Var = (defpackage.ud0) this.r1MBDhnF.IHQe1A4L2xu.get()) != null) {
            boolean z3 = this.F7NU4MC0GW != 0 || this.adDC3e2L;
            defpackage.nd0 oh6vYeIP = oh6vYeIP(td0Var);
            this.F7NU4MC0GW++;
            while (wd0Var2.IHQe1A4L2xu.compareTo(oh6vYeIP) < 0) {
                defpackage.v5 v5Var2 = this.oh6vYeIP;
                v5Var2.getClass();
                if (!((defpackage.nl0) v5Var2.oh6vYeIP).r1MBDhnF(td0Var)) {
                    break;
                }
                defpackage.nd0 nd0Var3 = wd0Var2.IHQe1A4L2xu;
                java.util.ArrayList arrayList = this.AARZUJiTa;
                arrayList.add(nd0Var3);
                defpackage.kd0 kd0Var = defpackage.md0.Companion;
                defpackage.nd0 nd0Var4 = wd0Var2.IHQe1A4L2xu;
                kd0Var.getClass();
                nd0Var4.getClass();
                int ordinal = nd0Var4.ordinal();
                defpackage.md0 md0Var = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : defpackage.md0.ON_RESUME : defpackage.md0.ON_START : defpackage.md0.ON_CREATE;
                if (md0Var == null) {
                    defpackage.db.SyNS6RMn(wd0Var2.IHQe1A4L2xu, "no event up from ");
                    return;
                } else {
                    wd0Var2.IHQe1A4L2xu(ud0Var, md0Var);
                    defpackage.yd.nVhUznk1t(arrayList);
                    oh6vYeIP = oh6vYeIP(td0Var);
                }
            }
            if (!z3) {
                AARZUJiTa();
            }
            this.F7NU4MC0GW--;
        }
    }

    public final void adDC3e2L(defpackage.nd0 nd0Var) {
        if (this.EXtogiMhuM == nd0Var) {
            return;
        }
        defpackage.ud0 ud0Var = (defpackage.ud0) this.r1MBDhnF.IHQe1A4L2xu.get();
        defpackage.nd0 nd0Var2 = this.EXtogiMhuM;
        defpackage.nd0 nd0Var3 = defpackage.nd0.xiZrDbcSW0;
        defpackage.nd0 nd0Var4 = defpackage.nd0.adDC3e2L;
        if (nd0Var2 == nd0Var3 && nd0Var == nd0Var4) {
            throw new java.lang.IllegalStateException(("State must be at least '" + defpackage.nd0.AARZUJiTa + "' to be moved to '" + nd0Var + "' in component " + ud0Var).toString());
        }
        if (nd0Var2 == nd0Var4 && nd0Var2 != nd0Var) {
            throw new java.lang.IllegalStateException(("State is '" + nd0Var4 + "' and cannot be moved to `" + nd0Var + "` in component " + ud0Var).toString());
        }
        this.EXtogiMhuM = nd0Var;
        if (this.adDC3e2L || this.F7NU4MC0GW != 0) {
            this.xiZrDbcSW0 = true;
            return;
        }
        this.adDC3e2L = true;
        AARZUJiTa();
        this.adDC3e2L = false;
        if (this.EXtogiMhuM == nd0Var4) {
            this.oh6vYeIP = new defpackage.v5(5);
        }
    }

    public final defpackage.nd0 oh6vYeIP(defpackage.td0 td0Var) {
        defpackage.v5 v5Var = this.oh6vYeIP;
        v5Var.getClass();
        td0Var.getClass();
        defpackage.bv bvVar = (defpackage.bv) ((defpackage.nl0) v5Var.oh6vYeIP).AARZUJiTa(td0Var);
        defpackage.bv bvVar2 = bvVar != null ? bvVar.EXtogiMhuM : null;
        defpackage.nd0 nd0Var = bvVar2 != null ? bvVar2.xiZrDbcSW0.IHQe1A4L2xu : null;
        java.util.ArrayList arrayList = this.AARZUJiTa;
        defpackage.nd0 nd0Var2 = arrayList.isEmpty() ? null : (defpackage.nd0) arrayList.get(arrayList.size() - 1);
        defpackage.nd0 nd0Var3 = this.EXtogiMhuM;
        if (nd0Var == null || nd0Var.compareTo(nd0Var3) >= 0) {
            nd0Var = nd0Var3;
        }
        return (nd0Var2 == null || nd0Var2.compareTo(nd0Var) >= 0) ? nd0Var : nd0Var2;
    }

    public final void r1MBDhnF(java.lang.String str) {
        if (this.IHQe1A4L2xu) {
            defpackage.d6.p4kuH6PDtgom().adDC3e2L.getClass();
            if (android.os.Looper.getMainLooper().getThread() != java.lang.Thread.currentThread()) {
                throw new java.lang.IllegalStateException(defpackage.fx0.ez2rX8ReCYw("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void xiZrDbcSW0(defpackage.td0 td0Var) {
        td0Var.getClass();
        r1MBDhnF("removeObserver");
        defpackage.v5 v5Var = this.oh6vYeIP;
        v5Var.getClass();
        defpackage.bv bvVar = (defpackage.bv) ((defpackage.nl0) v5Var.oh6vYeIP).ez2rX8ReCYw(td0Var);
        if (bvVar == null) {
            return;
        }
        defpackage.bv bvVar2 = bvVar.EXtogiMhuM;
        defpackage.bv bvVar3 = bvVar.AARZUJiTa;
        if (bvVar2 == null) {
            v5Var.r1MBDhnF = bvVar3;
        } else {
            bvVar2.AARZUJiTa = bvVar3;
        }
        defpackage.bv bvVar4 = bvVar.AARZUJiTa;
        if (bvVar4 == null) {
            v5Var.F7NU4MC0GW = bvVar2;
        } else {
            bvVar4.EXtogiMhuM = bvVar2;
        }
        bvVar.riuEU0zW4 = true;
    }
}
