package defpackage;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class gq0 {
    public final List GWasM1elztuh;
    public int X1lG3V04pd;
    public final d Yi7zF1RB1;

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
    public gq0(List list, d dVar) {
        boolean z;
        boolean z2;
        int actionMasked;
        int classification;
        int classification2;
        MotionEvent GWasM1elztuh;
        this.GWasM1elztuh = list;
        this.Yi7zF1RB1 = dVar;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29 && (GWasM1elztuh = GWasM1elztuh()) != null) {
            GWasM1elztuh.getClassification();
        }
        MotionEvent GWasM1elztuh2 = GWasM1elztuh();
        if (GWasM1elztuh2 != null) {
            GWasM1elztuh2.getButtonState();
        }
        MotionEvent GWasM1elztuh3 = GWasM1elztuh();
        if (GWasM1elztuh3 != null) {
            GWasM1elztuh3.getMetaState();
        }
        MotionEvent GWasM1elztuh4 = GWasM1elztuh();
        int i2 = 0;
        if (GWasM1elztuh4 != null) {
            if (i >= 29) {
                classification2 = GWasM1elztuh4.getClassification();
                if (classification2 == 3) {
                    z = true;
                    if (i >= 29) {
                        classification = GWasM1elztuh4.getClassification();
                        if (classification == 5) {
                            z2 = true;
                            actionMasked = GWasM1elztuh4.getActionMasked();
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
                                        case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                                            if (!z) {
                                            }
                                            i2 = 12;
                                            break;
                                        case 8:
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
                    actionMasked = GWasM1elztuh4.getActionMasked();
                    if (actionMasked == 0) {
                    }
                }
            }
            z = false;
            if (i >= 29) {
            }
            z2 = false;
            actionMasked = GWasM1elztuh4.getActionMasked();
            if (actionMasked == 0) {
            }
        } else {
            int size = list.size();
            while (i2 < size) {
                kq0 kq0Var = (kq0) list.get(i2);
                if (d70.rQPn8YBR(kq0Var)) {
                    i2 = 2;
                } else if (d70.JFJ3QoxA(kq0Var)) {
                    i2 = 1;
                } else {
                    i2++;
                }
            }
            i2 = 3;
        }
        this.X1lG3V04pd = i2;
    }

    public final MotionEvent GWasM1elztuh() {
        d dVar = this.Yi7zF1RB1;
        if (dVar != null) {
            return (MotionEvent) ((d) dVar.AvO7iQsrTN).AvO7iQsrTN;
        }
        return null;
    }
}
