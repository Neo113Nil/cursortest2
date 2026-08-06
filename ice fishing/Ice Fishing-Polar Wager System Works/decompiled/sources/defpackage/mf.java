package defpackage;

/* loaded from: classes.dex */
public abstract class mf extends android.app.Activity implements defpackage.ud0 {
    public final defpackage.xd0 adDC3e2L = new defpackage.xd0(this, true);

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        keyEvent.getClass();
        android.view.View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (defpackage.j70.SyNS6RMn(decorView, keyEvent)) {
            return true;
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return super.dispatchKeyEvent(keyEvent);
        }
        onUserInteraction();
        android.view.Window window = getWindow();
        if (window.hasFeature(8)) {
            android.app.ActionBar actionBar = getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                if (!defpackage.j70.IHQe1A4L2xu) {
                    try {
                        defpackage.j70.oh6vYeIP = actionBar.getClass().getMethod("onMenuKeyEvent", android.view.KeyEvent.class);
                    } catch (java.lang.NoSuchMethodException unused) {
                    }
                    defpackage.j70.IHQe1A4L2xu = true;
                }
                java.lang.reflect.Method method = defpackage.j70.oh6vYeIP;
                boolean z = false;
                if (method != null) {
                    try {
                        java.lang.Object invoke = method.invoke(actionBar, keyEvent);
                        if (invoke != null) {
                            z = ((java.lang.Boolean) invoke).booleanValue();
                        }
                    } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused2) {
                    }
                }
                if (z) {
                    return true;
                }
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        android.view.View decorView2 = window.getDecorView();
        int i = defpackage.mm1.IHQe1A4L2xu;
        if (android.os.Build.VERSION.SDK_INT < 28) {
            java.util.ArrayList arrayList = defpackage.lm1.F7NU4MC0GW;
            defpackage.lm1 lm1Var = (defpackage.lm1) decorView2.getTag(com.combinations.spin.balbi.R.id.tag_unhandled_key_event_manager);
            if (lm1Var == null) {
                lm1Var = new defpackage.lm1();
                lm1Var.IHQe1A4L2xu = null;
                lm1Var.oh6vYeIP = null;
                lm1Var.r1MBDhnF = null;
                decorView2.setTag(com.combinations.spin.balbi.R.id.tag_unhandled_key_event_manager, lm1Var);
            }
            if (keyEvent.getAction() == 0) {
                java.util.WeakHashMap weakHashMap = lm1Var.IHQe1A4L2xu;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                java.util.ArrayList arrayList2 = defpackage.lm1.F7NU4MC0GW;
                if (!arrayList2.isEmpty()) {
                    synchronized (arrayList2) {
                        try {
                            if (lm1Var.IHQe1A4L2xu == null) {
                                lm1Var.IHQe1A4L2xu = new java.util.WeakHashMap();
                            }
                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                java.util.ArrayList arrayList3 = defpackage.lm1.F7NU4MC0GW;
                                android.view.View view = (android.view.View) ((java.lang.ref.WeakReference) arrayList3.get(size)).get();
                                if (view == null) {
                                    arrayList3.remove(size);
                                } else {
                                    lm1Var.IHQe1A4L2xu.put(view, java.lang.Boolean.TRUE);
                                    for (android.view.ViewParent parent = view.getParent(); parent instanceof android.view.View; parent = parent.getParent()) {
                                        lm1Var.IHQe1A4L2xu.put((android.view.View) parent, java.lang.Boolean.TRUE);
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
            android.view.View IHQe1A4L2xu = lm1Var.IHQe1A4L2xu(decorView2);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (IHQe1A4L2xu != null && !android.view.KeyEvent.isModifierKey(keyCode)) {
                    if (lm1Var.oh6vYeIP == null) {
                        lm1Var.oh6vYeIP = new android.util.SparseArray();
                    }
                    lm1Var.oh6vYeIP.put(keyCode, new java.lang.ref.WeakReference(IHQe1A4L2xu));
                }
            }
            if (IHQe1A4L2xu != null) {
                return true;
            }
        }
        return keyEvent.dispatch(this, decorView2 != null ? decorView2.getKeyDispatcherState() : null, this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent keyEvent) {
        keyEvent.getClass();
        android.view.View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (defpackage.j70.SyNS6RMn(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        int i = defpackage.g11.xiZrDbcSW0;
        defpackage.e11.oh6vYeIP(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        bundle.getClass();
        defpackage.xd0 xd0Var = this.adDC3e2L;
        xd0Var.getClass();
        xd0Var.r1MBDhnF("setCurrentState");
        xd0Var.adDC3e2L(defpackage.nd0.AARZUJiTa);
        super.onSaveInstanceState(bundle);
    }
}
