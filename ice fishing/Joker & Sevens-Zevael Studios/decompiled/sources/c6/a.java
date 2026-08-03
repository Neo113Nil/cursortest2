package c6;

import android.os.Build;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.onesignal.inAppMessages.internal.display.impl.a;
import s.a0;
import y1.e0;
import y1.r;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1235g;

    public /* synthetic */ a(int i10) {
        this.f1235g = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1235g) {
            case 0:
                int i10 = AlarmManagerSchedulerBroadcastReceiver.f1401a;
                return;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                a0 a0Var = r.O0;
                synchronized (a0Var) {
                    try {
                        int i11 = 0;
                        if (Build.VERSION.SDK_INT < 30) {
                            Object[] objArr = a0Var.f6219a;
                            int i12 = a0Var.f6220b;
                            while (i11 < i12) {
                                r rVar = (r) objArr[i11];
                                boolean showLayoutBounds = rVar.getShowLayoutBounds();
                                Class cls = r.L0;
                                rVar.setShowLayoutBounds(e0.p());
                                if (showLayoutBounds != rVar.getShowLayoutBounds()) {
                                    r.n(rVar.getRoot());
                                }
                                i11++;
                            }
                        } else {
                            Object[] objArr2 = a0Var.f6219a;
                            int i13 = a0Var.f6220b;
                            while (i11 < i13) {
                                r.n(((r) objArr2[i11]).getRoot());
                                i11++;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                return;
        }
    }

    private final void a() {
    }
}
