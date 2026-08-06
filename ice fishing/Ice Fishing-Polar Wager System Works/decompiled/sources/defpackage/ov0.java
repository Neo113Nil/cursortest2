package defpackage;

/* loaded from: classes.dex */
public final class ov0 {
    public final java.util.List IHQe1A4L2xu;
    public final defpackage.F7NU4MC0GW oh6vYeIP;
    public int r1MBDhnF;

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
    
        if (r11 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        r2 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if (r11 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x007f, code lost:
    
        if (r11 != false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ov0(java.util.List list, defpackage.F7NU4MC0GW f7nu4mc0gw) {
        boolean z;
        boolean z2;
        int actionMasked;
        int classification;
        int classification2;
        android.view.MotionEvent IHQe1A4L2xu;
        this.IHQe1A4L2xu = list;
        this.oh6vYeIP = f7nu4mc0gw;
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 29 && (IHQe1A4L2xu = IHQe1A4L2xu()) != null) {
            IHQe1A4L2xu.getClassification();
        }
        android.view.MotionEvent IHQe1A4L2xu2 = IHQe1A4L2xu();
        if (IHQe1A4L2xu2 != null) {
            IHQe1A4L2xu2.getButtonState();
        }
        android.view.MotionEvent IHQe1A4L2xu3 = IHQe1A4L2xu();
        if (IHQe1A4L2xu3 != null) {
            IHQe1A4L2xu3.getMetaState();
        }
        android.view.MotionEvent IHQe1A4L2xu4 = IHQe1A4L2xu();
        int i2 = 0;
        if (IHQe1A4L2xu4 != null) {
            if (i >= 29) {
                classification2 = IHQe1A4L2xu4.getClassification();
                if (classification2 == 3) {
                    z = true;
                    if (i >= 29) {
                        classification = IHQe1A4L2xu4.getClassification();
                        if (classification == 5) {
                            z2 = true;
                            actionMasked = IHQe1A4L2xu4.getActionMasked();
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
                                        case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                                            if (!z) {
                                            }
                                            i2 = 10;
                                            break;
                                        case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                                            if (!z) {
                                            }
                                            i2 = 12;
                                            break;
                                        case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
                                            i2 = 6;
                                            break;
                                        case 9:
                                            i2 = 4;
                                            break;
                                        case 10:
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
                    actionMasked = IHQe1A4L2xu4.getActionMasked();
                    if (actionMasked == 0) {
                    }
                }
            }
            z = false;
            if (i >= 29) {
            }
            z2 = false;
            actionMasked = IHQe1A4L2xu4.getActionMasked();
            if (actionMasked == 0) {
            }
        } else {
            int size = list.size();
            while (i2 < size) {
                defpackage.sv0 sv0Var = (defpackage.sv0) list.get(i2);
                if (defpackage.s70.DFo87pBq1E5(sv0Var)) {
                    i2 = 2;
                } else if (defpackage.s70.JlrlGoKF(sv0Var)) {
                    i2 = 1;
                } else {
                    i2++;
                }
            }
            i2 = 3;
        }
        this.r1MBDhnF = i2;
    }

    public final android.view.MotionEvent IHQe1A4L2xu() {
        defpackage.F7NU4MC0GW f7nu4mc0gw = this.oh6vYeIP;
        if (f7nu4mc0gw != null) {
            return (android.view.MotionEvent) ((defpackage.F7NU4MC0GW) f7nu4mc0gw.AARZUJiTa).AARZUJiTa;
        }
        return null;
    }
}
