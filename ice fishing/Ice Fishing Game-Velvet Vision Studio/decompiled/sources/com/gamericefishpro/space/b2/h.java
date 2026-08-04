package com.gamericefishpro.space.b2;

import android.os.Build;
import android.view.MotionEvent;
import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.i9.g4;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public final List a;
    public final g4 b;
    public int c;

    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    public h(List list, g4 g4Var) {
        MotionEvent motionEventA;
        this.a = list;
        this.b = g4Var;
        if (Build.VERSION.SDK_INT >= 29 && (motionEventA = a()) != null) {
            motionEventA.getClassification();
        }
        MotionEvent motionEventA2 = a();
        if (motionEventA2 != null) {
            motionEventA2.getButtonState();
        }
        MotionEvent motionEventA3 = a();
        if (motionEventA3 != null) {
            motionEventA3.getMetaState();
        }
        MotionEvent motionEventA4 = a();
        int i = 0;
        if (motionEventA4 != null) {
            int actionMasked = motionEventA4.getActionMasked();
            if (actionMasked == 0) {
                i = 1;
            } else if (actionMasked == 1) {
                i = 2;
            } else if (actionMasked != 2) {
                switch (actionMasked) {
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        i = 1;
                        break;
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        i = 2;
                        break;
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        i = 3;
                        break;
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        i = 6;
                        break;
                    case 9:
                        i = 4;
                        break;
                    case 10:
                        i = 5;
                        break;
                }
            } else {
                i = 3;
            }
        } else {
            int size = list.size();
            while (true) {
                if (i < size) {
                    m mVar = (m) list.get(i);
                    if (d5.p(mVar)) {
                        i = 2;
                    } else if (d5.o(mVar)) {
                        i = 1;
                    } else {
                        i++;
                    }
                } else {
                    i = 3;
                }
            }
        }
        this.c = i;
    }

    public final MotionEvent a() {
        g4 g4Var = this.b;
        if (g4Var != null) {
            return (MotionEvent) ((com.gamericefishpro.space.u6.c) g4Var.c).e;
        }
        return null;
    }
}
