package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class fh extends android.app.Activity implements defpackage.wg0 {
    public final defpackage.zg0 WDYagTQQm9ns = new defpackage.zg0(this, true);

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        keyEvent.getClass();
        android.view.View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (defpackage.wc1.ZVVdXbWmyCSK(decorView, keyEvent)) {
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
                if (!defpackage.wc1.ZpBGe2uQfcn8) {
                    try {
                        defpackage.wc1.giKS3J6vZuNy = actionBar.getClass().getMethod("onMenuKeyEvent", android.view.KeyEvent.class);
                    } catch (java.lang.NoSuchMethodException unused) {
                    }
                    defpackage.wc1.ZpBGe2uQfcn8 = true;
                }
                java.lang.reflect.Method method = defpackage.wc1.giKS3J6vZuNy;
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
        int i = defpackage.zt1.ZpBGe2uQfcn8;
        if (android.os.Build.VERSION.SDK_INT < 28) {
            java.util.ArrayList arrayList = defpackage.yt1.JhCgjQRTAOCT;
            defpackage.yt1 yt1Var = (defpackage.yt1) decorView2.getTag(com.ice.fishing.wolberta.R.id.tag_unhandled_key_event_manager);
            if (yt1Var == null) {
                yt1Var = new defpackage.yt1();
                yt1Var.ZpBGe2uQfcn8 = null;
                yt1Var.giKS3J6vZuNy = null;
                yt1Var.fWTAfUmVKrZq = null;
                decorView2.setTag(com.ice.fishing.wolberta.R.id.tag_unhandled_key_event_manager, yt1Var);
            }
            if (keyEvent.getAction() == 0) {
                java.util.WeakHashMap weakHashMap = yt1Var.ZpBGe2uQfcn8;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                java.util.ArrayList arrayList2 = defpackage.yt1.JhCgjQRTAOCT;
                if (!arrayList2.isEmpty()) {
                    synchronized (arrayList2) {
                        try {
                            if (yt1Var.ZpBGe2uQfcn8 == null) {
                                yt1Var.ZpBGe2uQfcn8 = new java.util.WeakHashMap();
                            }
                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                java.util.ArrayList arrayList3 = defpackage.yt1.JhCgjQRTAOCT;
                                android.view.View view = (android.view.View) ((java.lang.ref.WeakReference) arrayList3.get(size)).get();
                                if (view == null) {
                                    arrayList3.remove(size);
                                } else {
                                    yt1Var.ZpBGe2uQfcn8.put(view, java.lang.Boolean.TRUE);
                                    for (android.view.ViewParent parent = view.getParent(); parent instanceof android.view.View; parent = parent.getParent()) {
                                        yt1Var.ZpBGe2uQfcn8.put((android.view.View) parent, java.lang.Boolean.TRUE);
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
            android.view.View ZpBGe2uQfcn8 = yt1Var.ZpBGe2uQfcn8(decorView2);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (ZpBGe2uQfcn8 != null && !android.view.KeyEvent.isModifierKey(keyCode)) {
                    if (yt1Var.giKS3J6vZuNy == null) {
                        yt1Var.giKS3J6vZuNy = new android.util.SparseArray();
                    }
                    yt1Var.giKS3J6vZuNy.put(keyCode, new java.lang.ref.WeakReference(ZpBGe2uQfcn8));
                }
            }
            if (ZpBGe2uQfcn8 != null) {
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
        if (defpackage.wc1.ZVVdXbWmyCSK(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        int i = defpackage.t41.oh71FJcDz6S2;
        defpackage.r41.giKS3J6vZuNy(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        bundle.getClass();
        defpackage.zg0 zg0Var = this.WDYagTQQm9ns;
        zg0Var.getClass();
        zg0Var.fWTAfUmVKrZq("setCurrentState");
        zg0Var.WDYagTQQm9ns(defpackage.pg0.QiMR8OkAhezm);
        super.onSaveInstanceState(bundle);
    }
}
