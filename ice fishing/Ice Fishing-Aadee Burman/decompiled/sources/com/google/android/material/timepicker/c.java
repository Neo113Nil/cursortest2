package com.google.android.material.timepicker;

import O.C0323b;
import P.j;
import P.k;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.icefishing.icefishinglive2.C5275R;

/* loaded from: classes2.dex */
public final class c extends C0323b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f36174d;

    public c(ClockFaceView clockFaceView) {
        this.f36174d = clockFaceView;
    }

    @Override // O.C0323b
    public final void d(View view, k kVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f2062a;
        AccessibilityNodeInfo accessibilityNodeInfo = kVar.f2409a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(C5275R.id.material_value_index)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f36174d.f36147Q.get(intValue - 1));
        }
        kVar.j(j.a(0, 1, intValue, 1, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        kVar.b(P.f.f2396g);
    }

    @Override // O.C0323b
    public final boolean g(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.g(view, i, bundle);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f36174d;
        view.getHitRect(clockFaceView.f36144N);
        float centerX = clockFaceView.f36144N.centerX();
        float centerY = clockFaceView.f36144N.centerY();
        clockFaceView.f36143M.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
        clockFaceView.f36143M.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
        return true;
    }
}
