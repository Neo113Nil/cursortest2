package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class vz0 {
    public final int JhCgjQRTAOCT;
    public final int WDYagTQQm9ns;
    public final java.util.List ZpBGe2uQfcn8;
    public final int fWTAfUmVKrZq;
    public final defpackage.n80 giKS3J6vZuNy;
    public int oh71FJcDz6S2;

    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        if (r11 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        r0 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0084, code lost:
    
        if (r11 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008e, code lost:
    
        if (r11 != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vz0(java.util.List list, defpackage.n80 n80Var) {
        boolean z;
        boolean z2;
        int actionMasked;
        int classification;
        int classification2;
        android.view.MotionEvent ZpBGe2uQfcn8;
        this.ZpBGe2uQfcn8 = list;
        this.giKS3J6vZuNy = n80Var;
        int i = android.os.Build.VERSION.SDK_INT;
        int i2 = 0;
        this.fWTAfUmVKrZq = (i < 29 || (ZpBGe2uQfcn8 = ZpBGe2uQfcn8()) == null) ? 0 : ZpBGe2uQfcn8.getClassification();
        android.view.MotionEvent ZpBGe2uQfcn82 = ZpBGe2uQfcn8();
        this.JhCgjQRTAOCT = ZpBGe2uQfcn82 != null ? ZpBGe2uQfcn82.getButtonState() : 0;
        android.view.MotionEvent ZpBGe2uQfcn83 = ZpBGe2uQfcn8();
        this.WDYagTQQm9ns = ZpBGe2uQfcn83 != null ? ZpBGe2uQfcn83.getMetaState() : 0;
        android.view.MotionEvent ZpBGe2uQfcn84 = ZpBGe2uQfcn8();
        if (ZpBGe2uQfcn84 != null) {
            if (i >= 29) {
                classification2 = ZpBGe2uQfcn84.getClassification();
                if (classification2 == 3) {
                    z = true;
                    if (i >= 29) {
                        classification = ZpBGe2uQfcn84.getClassification();
                        if (classification == 5) {
                            z2 = true;
                            actionMasked = ZpBGe2uQfcn84.getActionMasked();
                            if (actionMasked == 0) {
                                if (!z) {
                                    if (z2) {
                                        i2 = 7;
                                    }
                                    i2 = 1;
                                }
                                i2 = 10;
                            } else if (actionMasked != 1) {
                                if (actionMasked != 2) {
                                    switch (actionMasked) {
                                        case 5:
                                            if (!z) {
                                            }
                                            i2 = 10;
                                            break;
                                        case 6:
                                            if (!z) {
                                            }
                                            i2 = 12;
                                            break;
                                        case 8:
                                            i2 = 6;
                                            break;
                                        case defpackage.n70.ZpBGe2uQfcn8 /* 9 */:
                                            i2 = 4;
                                            break;
                                        case defpackage.n70.giKS3J6vZuNy /* 10 */:
                                            i2 = 5;
                                            break;
                                    }
                                }
                                if (z) {
                                    i2 = 11;
                                }
                            } else {
                                if (!z) {
                                    if (z2) {
                                        i2 = 9;
                                    }
                                    i2 = 2;
                                }
                                i2 = 12;
                            }
                        }
                    }
                    z2 = false;
                    actionMasked = ZpBGe2uQfcn84.getActionMasked();
                    if (actionMasked == 0) {
                    }
                }
            }
            z = false;
            if (i >= 29) {
            }
            z2 = false;
            actionMasked = ZpBGe2uQfcn84.getActionMasked();
            if (actionMasked == 0) {
            }
        } else {
            int size = list.size();
            while (i2 < size) {
                defpackage.c01 c01Var = (defpackage.c01) list.get(i2);
                if (defpackage.j80.fNwYGHIYeJcR(c01Var)) {
                    i2 = 2;
                } else if (defpackage.j80.GE9mJIPrb8gP(c01Var)) {
                    i2 = 1;
                } else {
                    i2++;
                }
            }
            i2 = 3;
        }
        this.oh71FJcDz6S2 = i2;
    }

    public final android.view.MotionEvent ZpBGe2uQfcn8() {
        defpackage.n80 n80Var = this.giKS3J6vZuNy;
        if (n80Var != null) {
            return (android.view.MotionEvent) ((defpackage.n80) n80Var.QiMR8OkAhezm).QiMR8OkAhezm;
        }
        return null;
    }
}
