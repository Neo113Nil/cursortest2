package defpackage;

/* loaded from: classes.dex */
public final class QuX7t5UZl9 implements defpackage.zm1 {
    public final /* synthetic */ int IHQe1A4L2xu;
    public final java.lang.Object oh6vYeIP;

    public /* synthetic */ QuX7t5UZl9(int i, java.lang.Object obj) {
        this.IHQe1A4L2xu = i;
        this.oh6vYeIP = obj;
    }

    @Override // defpackage.zm1
    public final defpackage.vm1 oh6vYeIP(java.lang.Class cls, defpackage.uk0 uk0Var) {
        android.app.Application application;
        defpackage.vm1 vm1Var;
        defpackage.vm1 vm1Var2;
        defpackage.xm1 xm1Var;
        defpackage.g00 g00Var;
        switch (this.IHQe1A4L2xu) {
            case 0:
                defpackage.t21 t21Var = new defpackage.t21();
                t21Var.IHQe1A4L2xu = true;
                t21Var.oh6vYeIP = uk0Var;
                android.content.Context applicationContext = ((com.corsair.ledger.MainActivity) this.oh6vYeIP).getApplicationContext();
                if (!(applicationContext instanceof android.app.Application)) {
                    android.content.Context context = applicationContext;
                    while (context instanceof android.content.ContextWrapper) {
                        context = ((android.content.ContextWrapper) context).getBaseContext();
                        if (context instanceof android.app.Application) {
                            application = (android.app.Application) context;
                        }
                    }
                    throw new java.lang.IllegalStateException("Could not find an Application in the given context: " + applicationContext);
                }
                application = (android.app.Application) applicationContext;
                return new defpackage.GhHh9OOt4I(new defpackage.vk(((defpackage.xk) ((defpackage.C6j8I7Ng) defpackage.w70.PAEGRtP0bX(application, defpackage.C6j8I7Ng.class))).oh6vYeIP), t21Var);
            case 1:
                final defpackage.t11 t11Var = new defpackage.t11();
                defpackage.F7NU4MC0GW f7nu4mc0gw = (defpackage.F7NU4MC0GW) this.oh6vYeIP;
                defpackage.yk ykVar = new defpackage.yk((defpackage.xk) f7nu4mc0gw.xiZrDbcSW0, (defpackage.vk) f7nu4mc0gw.AARZUJiTa, defpackage.w70.kd6TUFXn(uk0Var));
                defpackage.yk ykVar2 = (defpackage.yk) ((defpackage.v30) defpackage.w70.PAEGRtP0bX(ykVar, defpackage.v30.class));
                ykVar2.getClass();
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(15);
                linkedHashMap.put("b", ykVar2.r1MBDhnF);
                linkedHashMap.put("sp", ykVar2.F7NU4MC0GW);
                linkedHashMap.put("s30", ykVar2.adDC3e2L);
                linkedHashMap.put("sf0", ykVar2.xiZrDbcSW0);
                linkedHashMap.put("lg0", ykVar2.AARZUJiTa);
                linkedHashMap.put("wh0", ykVar2.EXtogiMhuM);
                linkedHashMap.put("wi0", ykVar2.riuEU0zW4);
                linkedHashMap.put("u01", ykVar2.SH1y5HwkJhh);
                linkedHashMap.put("z81", ykVar2.ez2rX8ReCYw);
                linkedHashMap.put("wh1", ykVar2.JlrlGoKF);
                linkedHashMap.put("fm1", ykVar2.DFo87pBq1E5);
                defpackage.oy0 oy0Var = (defpackage.oy0) (linkedHashMap.isEmpty() ? java.util.Collections.EMPTY_MAP : java.util.Collections.unmodifiableMap(linkedHashMap)).get(cls.getName());
                defpackage.g00 g00Var2 = (defpackage.g00) uk0Var.IHQe1A4L2xu.get(defpackage.w30.F7NU4MC0GW);
                ((defpackage.yk) ((defpackage.v30) defpackage.w70.PAEGRtP0bX(ykVar, defpackage.v30.class))).getClass();
                java.lang.Object obj = java.util.Collections.EMPTY_MAP.get(cls);
                if (obj == null) {
                    if (g00Var2 != null) {
                        throw new java.lang.IllegalStateException("Found creation callback but class " + cls.getName() + " does not have an assisted factory specified in @HiltViewModel.");
                    }
                    if (oy0Var == null) {
                        throw new java.lang.IllegalStateException("Expected the @HiltViewModel-annotated class " + cls.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
                    }
                    vm1Var = (defpackage.vm1) oy0Var.get();
                } else {
                    if (oy0Var != null) {
                        throw new java.lang.AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
                    }
                    if (g00Var2 == null) {
                        throw new java.lang.IllegalStateException("Found @HiltViewModel-annotated class " + cls.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
                    }
                    vm1Var = (defpackage.vm1) g00Var2.AARZUJiTa(obj);
                }
                java.io.Closeable closeable = new java.io.Closeable() { // from class: t30
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        defpackage.t11.this.IHQe1A4L2xu();
                    }
                };
                vm1Var.getClass();
                defpackage.wm1 wm1Var = vm1Var.IHQe1A4L2xu;
                if (wm1Var != null) {
                    if (wm1Var.F7NU4MC0GW) {
                        defpackage.wm1.IHQe1A4L2xu(closeable);
                    } else {
                        synchronized (wm1Var.IHQe1A4L2xu) {
                            wm1Var.r1MBDhnF.add(closeable);
                        }
                    }
                }
                return vm1Var;
            default:
                defpackage.xc IHQe1A4L2xu = defpackage.sz0.IHQe1A4L2xu(cls);
                defpackage.xm1[] xm1VarArr = (defpackage.xm1[]) this.oh6vYeIP;
                defpackage.xm1[] xm1VarArr2 = (defpackage.xm1[]) java.util.Arrays.copyOf(xm1VarArr, xm1VarArr.length);
                int length = xm1VarArr2.length;
                int i = 0;
                while (true) {
                    vm1Var2 = null;
                    if (i < length) {
                        xm1Var = xm1VarArr2[i];
                        if (!xm1Var.IHQe1A4L2xu.equals(IHQe1A4L2xu)) {
                            i++;
                        }
                    } else {
                        xm1Var = null;
                    }
                }
                if (xm1Var != null && (g00Var = xm1Var.oh6vYeIP) != null) {
                    vm1Var2 = (defpackage.vm1) g00Var.AARZUJiTa(uk0Var);
                }
                if (vm1Var2 != null) {
                    return vm1Var2;
                }
                throw new java.lang.IllegalArgumentException(("No initializer set for given class " + IHQe1A4L2xu.oh6vYeIP()).toString());
        }
    }
}
