package defpackage;

import android.view.MotionEvent;
import java.util.List;

/* loaded from: classes10.dex */
public final class tvd0 {
    public final List a;
    public final tis0 b;
    public final int c;
    public final int d;
    public final int e;
    public int f;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
    
        if (r4 != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
    
        r0 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        if (r4 != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0084, code lost:
    
        if (r4 != false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tvd0(List list, tis0 tis0Var) {
        this.a = list;
        this.b = tis0Var;
        MotionEvent c = c();
        int i = 0;
        this.c = c != null ? c.getClassification() : 0;
        MotionEvent c2 = c();
        this.d = c2 != null ? c2.getButtonState() : 0;
        MotionEvent c3 = c();
        this.e = c3 != null ? c3.getMetaState() : 0;
        MotionEvent c4 = c();
        if (c4 != null) {
            boolean z = c4.getClassification() == 3;
            boolean z2 = c4.getClassification() == 5;
            int actionMasked = c4.getActionMasked();
            if (actionMasked == 0) {
                if (!z) {
                    if (z2) {
                        i = 7;
                    }
                    i = 1;
                }
                i = 10;
            } else if (actionMasked != 1) {
                if (actionMasked != 2) {
                    switch (actionMasked) {
                        case 5:
                            if (!z) {
                            }
                            i = 10;
                            break;
                        case 6:
                            if (!z) {
                            }
                            i = 12;
                            break;
                        case 8:
                            i = 6;
                            break;
                        case 9:
                            i = 4;
                            break;
                        case 10:
                            i = 5;
                            break;
                    }
                }
                if (z) {
                    i = 11;
                }
            } else {
                if (!z) {
                    if (z2) {
                        i = 9;
                    }
                    i = 2;
                }
                i = 12;
            }
        } else {
            int size = list.size();
            while (i < size) {
                zvd0 zvd0Var = (zvd0) list.get(i);
                if (kx91.d(zvd0Var)) {
                    i = 2;
                } else if (kx91.b(zvd0Var)) {
                    i = 1;
                } else {
                    i++;
                }
            }
            i = 3;
        }
        this.f = i;
    }

    public final List a() {
        return this.a;
    }

    public final tis0 b() {
        return this.b;
    }

    public final MotionEvent c() {
        tis0 tis0Var = this.b;
        if (tis0Var != null) {
            return (MotionEvent) ((y4a0) tis0Var.w).c;
        }
        return null;
    }

    public final int d() {
        return this.f;
    }

    public final void e(int i) {
        this.f = i;
    }
}
