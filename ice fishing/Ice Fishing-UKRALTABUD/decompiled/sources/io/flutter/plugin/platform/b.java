package io.flutter.plugin.platform;

import android.view.MotionEvent;
import c0.C0108j;

/* loaded from: classes.dex */
public final class b extends C0108j {

    /* renamed from: m, reason: collision with root package name */
    public a f2441m;

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        a aVar = this.f2441m;
        if (aVar != null) {
            io.flutter.view.h hVar = aVar.f2440a;
            if (hVar == null ? false : hVar.e(motionEvent, true)) {
                return true;
            }
        }
        return super.onHoverEvent(motionEvent);
    }
}
