package r1;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5954a;

    /* renamed from: b, reason: collision with root package name */
    public int f5955b;

    public g(List list, x4.c cVar) {
        this.f5954a = list;
        if (Build.VERSION.SDK_INT >= 29) {
            MotionEvent motionEvent = cVar != null ? (MotionEvent) ((x4.e) cVar.f8291h).f8295h : null;
            if (motionEvent != null) {
                motionEvent.getClassification();
            }
        }
        MotionEvent motionEvent2 = cVar != null ? (MotionEvent) ((x4.e) cVar.f8291h).f8295h : null;
        if (motionEvent2 != null) {
            motionEvent2.getButtonState();
        }
        MotionEvent motionEvent3 = cVar != null ? (MotionEvent) ((x4.e) cVar.f8291h).f8295h : null;
        if (motionEvent3 != null) {
            motionEvent3.getMetaState();
        }
        MotionEvent motionEvent4 = cVar != null ? (MotionEvent) ((x4.e) cVar.f8291h).f8295h : null;
        int i10 = 0;
        if (motionEvent4 != null) {
            int actionMasked = motionEvent4.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 8:
                                i10 = 6;
                                break;
                            case 9:
                                i10 = 4;
                                break;
                            case com.onesignal.core.internal.config.d.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                                i10 = 5;
                                break;
                        }
                    }
                    i10 = 3;
                }
                i10 = 2;
            }
            i10 = 1;
        } else {
            int size = list.size();
            while (i10 < size) {
                n nVar = (n) list.get(i10);
                if (v.b(nVar)) {
                    i10 = 2;
                } else if (v.a(nVar)) {
                    i10 = 1;
                } else {
                    i10++;
                }
            }
            i10 = 3;
        }
        this.f5955b = i10;
    }
}
