package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.pulse.mvi.tracker.ResponsivenessTracker;
import io.appmetrica.analytics.MviEventsReporter;
import io.appmetrica.analytics.MviTimestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/* loaded from: classes5.dex */
public final /* synthetic */ class yj4 implements Choreographer.FrameCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yj4(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.a = 2;
        this.b = context;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        MviEventsReporter mviEventsReporter;
        switch (this.a) {
            case 0:
                hq3 hq3Var = (hq3) this.b;
                if (hq3Var.b) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    long j2 = hq3Var.c;
                    long j3 = uptimeMillis - j2;
                    if (j3 >= hq3Var.a) {
                        owg owgVar = new owg(j2, j3);
                        if (((h5n) hq3Var.e) == null) {
                            ((ArrayList) hq3Var.d).add(owgVar);
                        } else {
                            ((h5n) hq3Var.e).c(Collections.singletonList(owgVar));
                        }
                    }
                    hq3Var.c = uptimeMillis;
                    zj4.a.postFrameCallback((yj4) hq3Var.f);
                    break;
                }
                break;
            case 1:
                suc sucVar = (suc) this.b;
                sucVar.e.c();
                if (sucVar.b.b && (mviEventsReporter = hdg.b) != null) {
                    mviEventsReporter.onFirstFrameDrawn(sucVar.c, MviTimestamp.now());
                    break;
                }
                break;
            case 2:
                (Build.VERSION.SDK_INT >= 28 ? jo0.g(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new oq0((Context) this.b, 2), new Random().nextInt(Math.max(1000, 1)) + ScreenMirroringConfig.Test.pcVideoUdpPort);
                break;
            default:
                ResponsivenessTracker responsivenessTracker = (ResponsivenessTracker) this.b;
                SparseArray sparseArray = responsivenessTracker.i;
                responsivenessTracker.g = false;
                if (responsivenessTracker.h) {
                    long uptimeMillis2 = SystemClock.uptimeMillis();
                    int size = sparseArray.size();
                    for (int i = 0; i < size; i++) {
                        z3o z3oVar = (z3o) sparseArray.valueAt(i);
                        nkk nkkVar = z3oVar.a;
                        if (nkkVar != null) {
                            long j4 = uptimeMillis2 - nkkVar.a;
                            Long l = z3oVar.b;
                            z3oVar.b = Long.valueOf(Math.max(j4, l != null ? l.longValue() : 0L));
                            z3oVar.a = null;
                        }
                    }
                    break;
                }
                break;
        }
    }

    public /* synthetic */ yj4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
