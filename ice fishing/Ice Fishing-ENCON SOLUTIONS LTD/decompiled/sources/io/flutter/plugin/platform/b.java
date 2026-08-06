package io.flutter.plugin.platform;

import P0.C0077j;
import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class b extends C0077j {

    /* renamed from: h, reason: collision with root package name */
    public a f7832h;

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        a aVar = this.f7832h;
        if (aVar != null) {
            io.flutter.view.h hVar = aVar.f7831a;
            if (hVar == null ? false : hVar.e(motionEvent, true)) {
                return true;
            }
        }
        return super.onHoverEvent(motionEvent);
    }
}
