package androidx.camera.camera2.impl;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.Display;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.camera2.adapter.ZslControlImpl$$ExternalSyntheticLambda1;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk;
import androidx.camera.camera2.impl.MeteringRepeating;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.camera.video.Recorder;
import androidx.camera.view.PreviewView;
import com.plaid.internal.EnumC0170g;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes3.dex */
public final class DisplayInfoManager {
    public static volatile DisplayInfoManager instance;
    public final DisplayManager displayManager;
    public volatile Display[] displays;
    public volatile Size previewSize;
    public static final MeteringRepeating.Builder Companion = new MeteringRepeating.Builder();
    public static final Size MAX_PREVIEW_SIZE = new Size(1920, 1080);
    public static final Size ABNORMAL_DISPLAY_SIZE_THRESHOLD = new Size(320, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
    public static final Size FALLBACK_DISPLAY_SIZE = new Size(640, 480);
    public final Recorder.AnonymousClass6 maxPreviewSize = new Recorder.AnonymousClass6(7);
    public final Toolbar.AnonymousClass1 displaySizeCorrector = new Toolbar.AnonymousClass1(4);
    public final Object lock = new Object();

    public DisplayInfoManager(Context context) {
        PreviewView.DisplayRotationListener displayRotationListener = new PreviewView.DisplayRotationListener(this, 1);
        Object systemService = context.getSystemService("display");
        systemService.getClass();
        DisplayManager displayManager = (DisplayManager) systemService;
        displayManager.registerDisplayListener(displayRotationListener, new Handler(Looper.getMainLooper()));
        this.displayManager = displayManager;
    }

    public final Size calculatePreviewSize() {
        Size verifiedResolution;
        Size size;
        Point point = new Point();
        getMaxSizeDisplay(false).getRealSize(point);
        Size size2 = new Size(point.x, point.y);
        if (SizeUtil.getArea(size2) < SizeUtil.getArea(ABNORMAL_DISPLAY_SIZE_THRESHOLD)) {
            if (((SmallDisplaySizeQuirk) this.displaySizeCorrector.this$0) != null) {
                Map map = SmallDisplaySizeQuirk.MODEL_TO_DISPLAY_SIZE_MAP;
                String str = Build.MODEL;
                str.getClass();
                String upperCase = str.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                Object obj = map.get(upperCase);
                obj.getClass();
                size = (Size) obj;
            } else {
                size = null;
            }
            if (size == null) {
                size = FALLBACK_DISPLAY_SIZE;
            }
            size2 = size;
        }
        if (size2.getHeight() > size2.getWidth()) {
            size2 = new Size(size2.getHeight(), size2.getWidth());
        }
        Size size3 = MAX_PREVIEW_SIZE;
        if (SizeUtil.getArea(size3) < SizeUtil.getArea(size2)) {
            size2 = size3;
        }
        Recorder.AnonymousClass6 anonymousClass6 = this.maxPreviewSize;
        anonymousClass6.getClass();
        if (((ExtraCroppingQuirk) anonymousClass6.this$0) != null && (verifiedResolution = ExtraCroppingQuirk.getVerifiedResolution(SurfaceConfig.ConfigType.PRIV)) != null) {
            if (verifiedResolution.getHeight() * verifiedResolution.getWidth() > size2.getHeight() * size2.getWidth()) {
                return verifiedResolution;
            }
        }
        return size2;
    }

    public final Display getMaxSizeDisplay(boolean z) {
        Display[] displayArr;
        int i;
        synchronized (this.lock) {
            displayArr = this.displays;
            if (displayArr == null) {
                displayArr = this.displayManager.getDisplays();
                this.displays = displayArr;
                displayArr.getClass();
            }
        }
        if (displayArr.length == 1) {
            return displayArr[0];
        }
        int i2 = -1;
        int i3 = -1;
        Display display = null;
        Display display2 = null;
        for (Display display3 : displayArr) {
            Point point = new Point();
            display3.getRealSize(point);
            int i4 = point.x * point.y;
            if (i4 > i2) {
                display = display3;
                i2 = i4;
            }
            if (display3.getState() != 1 && (i = point.x * point.y) > i3) {
                display2 = display3;
                i3 = i;
            }
        }
        if (z && display2 != null) {
            display = display2;
        }
        if (display != null) {
            return display;
        }
        String arrays = Arrays.toString(displayArr);
        arrays.getClass();
        ZslControlImpl$$ExternalSyntheticLambda1.m("No displays found from ", 33, arrays);
        return null;
    }

    public final Size getPreviewSize() {
        synchronized (this.lock) {
            if (this.previewSize != null) {
                Size size = this.previewSize;
                size.getClass();
                return size;
            }
            this.previewSize = calculatePreviewSize();
            Size size2 = this.previewSize;
            size2.getClass();
            return size2;
        }
    }
}
