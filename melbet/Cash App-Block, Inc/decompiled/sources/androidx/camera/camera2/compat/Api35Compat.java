package androidx.camera.camera2.compat;

import android.hardware.camera2.CaptureRequest;
import android.text.StaticLayout;
import android.view.inputmethod.EditorInfo;
import androidx.core.widget.NestedScrollView;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public abstract class Api35Compat {
    public static final void disableUseBoundsForWidth(StaticLayout.Builder builder) {
        builder.setUseBoundsForWidth(false);
    }

    public static final void setFlashStrengthLevel(LinkedHashMap linkedHashMap, int i) {
        linkedHashMap.put(CaptureRequest.FLASH_STRENGTH_LEVEL, Integer.valueOf(i));
    }

    public static void setFrameContentVelocity(NestedScrollView nestedScrollView, float f) {
        try {
            nestedScrollView.setFrameContentVelocity(f);
        } catch (LinkageError unused) {
        }
    }

    public static void setStylusHandwritingEnabled(EditorInfo editorInfo, boolean z) {
        editorInfo.setStylusHandwritingEnabled(z);
    }
}
