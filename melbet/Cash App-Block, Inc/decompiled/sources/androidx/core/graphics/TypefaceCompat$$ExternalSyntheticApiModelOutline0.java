package androidx.core.graphics;

import android.content.ClipData;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.fonts.Font;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.MultiResolutionStreamInfo;
import android.media.MediaRecorder;
import android.view.ContentInfo;
import android.view.ScrollCaptureTarget;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class TypefaceCompat$$ExternalSyntheticApiModelOutline0 {
    public static /* synthetic */ Font.Builder m(Font font) {
        return new Font.Builder(font);
    }

    public static /* synthetic */ InputConfiguration m(int i, ArrayList arrayList) {
        return new InputConfiguration(arrayList, i);
    }

    public static /* synthetic */ MultiResolutionStreamInfo m(int i, int i2, String str) {
        return new MultiResolutionStreamInfo(i, i2, str);
    }

    public static /* synthetic */ MediaRecorder m(Context context) {
        return new MediaRecorder(context);
    }

    public static /* synthetic */ ContentInfo.Builder m(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    public static /* synthetic */ ScrollCaptureTarget m(AndroidComposeView androidComposeView, Rect rect, Point point, ComposeScrollCaptureCallback composeScrollCaptureCallback) {
        return new ScrollCaptureTarget(androidComposeView, rect, point, composeScrollCaptureCallback);
    }

    public static /* synthetic */ void m() {
    }
}
