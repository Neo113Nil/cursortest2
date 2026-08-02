package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class ul7 implements tsr, r30 {
    public Lifecycle a;
    public hj7 b;
    public qgn0 c;
    public krl0 w;
    public md6 x;

    @Override // defpackage.r30
    public final void onAttachedToActivity(l40 l40Var) {
        wrr wrrVar = (wrr) l40Var;
        Lifecycle lifecycle = ((HiddenLifecycleReference) wrrVar.c).getLifecycle();
        this.a = lifecycle;
        if (lifecycle != null) {
            hj7 hj7Var = this.b;
            if (hj7Var == null) {
                hj7Var = null;
            }
            lifecycle.a(hj7Var);
        }
        krl0 krl0Var = this.w;
        (krl0Var != null ? krl0Var : null).n((Activity) wrrVar.b);
    }

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        Context context = ssrVar.a;
        tt5 tt5Var = ssrVar.c;
        ea20 ea20Var = g4j0.a;
        f69 f69Var = xi7.a;
        f69.k("initialize", Collections.singletonList("Reporter"));
        g4j0.a = new ea20(tt5Var, "in-app-calls/android-reporter");
        g4j0.c = true;
        f69.k("sendStoredEventsToFlutterIfNeeded", Collections.singletonList("Reporter"));
        ArrayList arrayList = g4j0.b;
        if (arrayList.isEmpty()) {
            f69.k("sendStoredEventsToFlutterIfNeeded called, but eventsBeforeFlutterReady is empty -> return", Collections.singletonList("Reporter"));
        } else {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f4j0 f4j0Var = (f4j0) it.next();
                ea20 ea20Var2 = g4j0.a;
                if (ea20Var2 != null) {
                    ea20Var2.a(f4j0Var.a, f4j0Var.b, null);
                }
            }
            arrayList.clear();
        }
        this.b = new hj7(context, tt5Var);
        this.c = new qgn0(context, tt5Var);
        this.w = new krl0(tt5Var);
        this.x = new md6(context, tt5Var);
    }

    @Override // defpackage.r30
    public final void onDetachedFromActivity() {
        Lifecycle lifecycle = this.a;
        if (lifecycle != null) {
            hj7 hj7Var = this.b;
            if (hj7Var == null) {
                hj7Var = null;
            }
            lifecycle.d(hj7Var);
        }
        this.a = null;
        krl0 krl0Var = this.w;
        if (krl0Var == null) {
            krl0Var = null;
        }
        krl0Var.n(null);
    }

    @Override // defpackage.r30
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        hj7 hj7Var = this.b;
        if (hj7Var == null) {
            hj7Var = null;
        }
        hj7Var.getClass();
        f69 f69Var = xi7.a;
        f69.k("dispose", Collections.singletonList("CallNotificationManagerHandler"));
        hj7.w = null;
        hj7Var.c.b(null);
        qgn0 qgn0Var = this.c;
        if (qgn0Var == null) {
            qgn0Var = null;
        }
        ((afo) qgn0Var.b).a(null);
        krl0 krl0Var = this.w;
        if (krl0Var == null) {
            krl0Var = null;
        }
        krl0Var.getClass();
        f69.k("dispose", Collections.singletonList("ScreenSecurityHandler"));
        ((ea20) krl0Var.b).b(null);
        krl0Var.a = null;
        md6 md6Var = this.x;
        if (md6Var == null) {
            md6Var = null;
        }
        md6Var.getClass();
        f69.k("dispose", Collections.singletonList("CallVolumeHandler"));
        ((ea20) md6Var.c).b(null);
    }

    @Override // defpackage.r30
    public final void onReattachedToActivityForConfigChanges(l40 l40Var) {
        onAttachedToActivity(l40Var);
    }
}
