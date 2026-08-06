package P0;

import android.util.Log;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import io.flutter.embedding.engine.FlutterEngine;

/* renamed from: P0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0071d implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0072e f1407a;

    public C0071d(AbstractActivityC0072e abstractActivityC0072e) {
        this.f1407a = abstractActivityC0072e;
    }

    public final void onBackCancelled() {
        AbstractActivityC0072e abstractActivityC0072e = this.f1407a;
        if (abstractActivityC0072e.l("cancelBackGesture")) {
            C0075h c0075h = abstractActivityC0072e.f1410b;
            c0075h.c();
            FlutterEngine flutterEngine = c0075h.f1418b;
            if (flutterEngine != null) {
                flutterEngine.f7715j.f1952a.G("cancelBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackInvoked() {
        AbstractActivityC0072e abstractActivityC0072e = this.f1407a;
        if (abstractActivityC0072e.l("commitBackGesture")) {
            C0075h c0075h = abstractActivityC0072e.f1410b;
            c0075h.c();
            FlutterEngine flutterEngine = c0075h.f1418b;
            if (flutterEngine != null) {
                flutterEngine.f7715j.f1952a.G("commitBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        AbstractActivityC0072e abstractActivityC0072e = this.f1407a;
        if (abstractActivityC0072e.l("updateBackGestureProgress")) {
            C0075h c0075h = abstractActivityC0072e.f1410b;
            c0075h.c();
            FlutterEngine flutterEngine = c0075h.f1418b;
            if (flutterEngine == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
                return;
            }
            Z0.a aVar = flutterEngine.f7715j;
            aVar.getClass();
            aVar.f1952a.G("updateBackGestureProgress", Z0.a.a(backEvent), null);
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        AbstractActivityC0072e abstractActivityC0072e = this.f1407a;
        if (abstractActivityC0072e.l("startBackGesture")) {
            C0075h c0075h = abstractActivityC0072e.f1410b;
            c0075h.c();
            FlutterEngine flutterEngine = c0075h.f1418b;
            if (flutterEngine == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
                return;
            }
            Z0.a aVar = flutterEngine.f7715j;
            aVar.getClass();
            aVar.f1952a.G("startBackGesture", Z0.a.a(backEvent), null);
        }
    }
}
