package c0;

import android.util.Log;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import d0.C0113c;
import l0.C0198a;

/* renamed from: c0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0103e implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0104f f1688a;

    public C0103e(AbstractActivityC0104f abstractActivityC0104f) {
        this.f1688a = abstractActivityC0104f;
    }

    public final void onBackCancelled() {
        AbstractActivityC0104f abstractActivityC0104f = this.f1688a;
        if (abstractActivityC0104f.k("cancelBackGesture")) {
            C0107i c0107i = abstractActivityC0104f.f1691f;
            c0107i.c();
            C0113c c0113c = c0107i.f1699b;
            if (c0113c != null) {
                c0113c.f1793j.f2694a.D("cancelBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackInvoked() {
        AbstractActivityC0104f abstractActivityC0104f = this.f1688a;
        if (abstractActivityC0104f.k("commitBackGesture")) {
            C0107i c0107i = abstractActivityC0104f.f1691f;
            c0107i.c();
            C0113c c0113c = c0107i.f1699b;
            if (c0113c != null) {
                c0113c.f1793j.f2694a.D("commitBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        AbstractActivityC0104f abstractActivityC0104f = this.f1688a;
        if (abstractActivityC0104f.k("updateBackGestureProgress")) {
            C0107i c0107i = abstractActivityC0104f.f1691f;
            c0107i.c();
            C0113c c0113c = c0107i.f1699b;
            if (c0113c == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
                return;
            }
            C0198a c0198a = c0113c.f1793j;
            c0198a.getClass();
            c0198a.f2694a.D("updateBackGestureProgress", C0198a.a(backEvent), null);
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        AbstractActivityC0104f abstractActivityC0104f = this.f1688a;
        if (abstractActivityC0104f.k("startBackGesture")) {
            C0107i c0107i = abstractActivityC0104f.f1691f;
            c0107i.c();
            C0113c c0113c = c0107i.f1699b;
            if (c0113c == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
                return;
            }
            C0198a c0198a = c0113c.f1793j;
            c0198a.getClass();
            c0198a.f2694a.D("startBackGesture", C0198a.a(backEvent), null);
        }
    }
}
