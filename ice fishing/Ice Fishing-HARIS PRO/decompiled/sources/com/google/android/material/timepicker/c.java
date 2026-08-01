package com.google.android.material.timepicker;

import O.C0026b;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.lumenpath.harispro.hrnavigator.R;

/* loaded from: classes.dex */
public final class c extends C0026b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f2730d;

    public c(ClockFaceView clockFaceView) {
        this.f2730d = clockFaceView;
    }

    @Override // O.C0026b
    public final void d(View view, P.f fVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f785a;
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f891a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f2730d.f2678x.get(intValue - 1));
        }
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, intValue, 1, false, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        fVar.b(P.d.e);
    }

    @Override // O.C0026b
    public final boolean g(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.g(view, i, bundle);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f2730d;
        view.getHitRect(clockFaceView.f2675u);
        float centerX = clockFaceView.f2675u.centerX();
        float centerY = clockFaceView.f2675u.centerY();
        clockFaceView.f2674t.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
        clockFaceView.f2674t.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
        return true;
    }
}
