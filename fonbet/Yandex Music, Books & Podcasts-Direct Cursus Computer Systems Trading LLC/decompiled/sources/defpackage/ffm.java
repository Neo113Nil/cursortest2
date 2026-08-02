package defpackage;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;

/* loaded from: classes.dex */
public final class ffm {
    public final List a;
    public final fmq b;
    public final int c;
    public int d;

    public ffm(List list, fmq fmqVar) {
        this.a = list;
        this.b = fmqVar;
        MotionEvent motionEvent = fmqVar != null ? (MotionEvent) ((aqd) fmqVar.d).c : null;
        int i = 0;
        this.c = motionEvent != null ? motionEvent.getButtonState() : 0;
        MotionEvent motionEvent2 = fmqVar != null ? (MotionEvent) ((aqd) fmqVar.d).c : null;
        if (motionEvent2 != null) {
            motionEvent2.getMetaState();
        }
        MotionEvent motionEvent3 = fmqVar != null ? (MotionEvent) ((aqd) fmqVar.d).c : null;
        if (motionEvent3 != null) {
            int actionMasked = motionEvent3.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
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
                    i = 3;
                }
                i = 2;
            }
            i = 1;
        } else {
            int size = list.size();
            while (i < size) {
                lfm lfmVar = (lfm) list.get(i);
                if (swf.B(lfmVar)) {
                    i = 2;
                } else if (swf.z(lfmVar)) {
                    i = 1;
                } else {
                    i++;
                }
            }
            i = 3;
        }
        this.d = i;
    }

    public final int a() {
        if (Build.VERSION.SDK_INT < 29) {
            return 0;
        }
        fmq fmqVar = this.b;
        MotionEvent motionEvent = fmqVar != null ? (MotionEvent) ((aqd) fmqVar.d).c : null;
        if (motionEvent != null) {
            return motionEvent.getClassification();
        }
        return 0;
    }
}
