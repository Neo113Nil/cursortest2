package io.flutter.plugin.platform;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import defpackage.tg;
import io.flutter.embedding.android.FlutterImageView;
import io.flutter.view.AccessibilityBridge;

/* loaded from: classes4.dex */
public class PlatformOverlayView extends FlutterImageView {
    private tg accessibilityDelegate;

    public PlatformOverlayView(Context context, int i, int i2, tg tgVar) {
        super(context, i, i2, FlutterImageView.SurfaceKind.overlay);
        this.accessibilityDelegate = tgVar;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        tg tgVar = this.accessibilityDelegate;
        if (tgVar != null) {
            AccessibilityBridge accessibilityBridge = tgVar.a;
            if (accessibilityBridge == null ? false : accessibilityBridge.onAccessibilityHoverEvent(motionEvent, true)) {
                return true;
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    public PlatformOverlayView(Context context) {
        this(context, 1, 1, null);
    }

    public PlatformOverlayView(Context context, AttributeSet attributeSet) {
        this(context, 1, 1, null);
    }
}
