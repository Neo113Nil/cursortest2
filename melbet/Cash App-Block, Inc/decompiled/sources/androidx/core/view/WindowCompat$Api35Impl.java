package androidx.core.view;

import android.R;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Insets;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Icon;
import android.hardware.camera2.CameraCharacteristics;
import android.net.Uri;
import android.os.Build;
import android.os.VibrationEffect;
import android.util.Log;
import android.util.Range;
import android.util.TypedValue;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.Surface;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.camera.camera2.compat.quirk.ControlZoomRatioRangeAssertionErrorQuirk;
import androidx.camera.camera2.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.compat.Camera2CameraMetadata;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.miteksystems.misnap.workflow.a.b;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.ui.CashInsets;
import com.squareup.cash.ui.InsetsCollector;
import com.squareup.cash.ui.InsetsCollector$Companion$NoOpAnimationCallback;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public abstract class WindowCompat$Api35Impl {
    public static final VibrationEffect access$Failure$lambda$4() {
        VibrationEffect createWaveform = VibrationEffect.createWaveform(new long[]{0, 40, 50, 50, 40, 70}, new int[]{0, EnumC0170g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, 0, 200, 0, 255}, -1);
        createWaveform.getClass();
        return createWaveform;
    }

    public static final VibrationEffect access$InputProminent$lambda$2() {
        VibrationEffect createPredefined = VibrationEffect.createPredefined(5);
        createPredefined.getClass();
        return createPredefined;
    }

    public static final VibrationEffect access$InputStandard$lambda$1() {
        VibrationEffect createPredefined = VibrationEffect.createPredefined(2);
        createPredefined.getClass();
        return createPredefined;
    }

    public static final VibrationEffect access$InputSubtle$lambda$0() {
        if (Build.VERSION.SDK_INT >= 30) {
            VibrationEffect compose = VibrationEffect.startComposition().addPrimitive(7, 0.5f).compose();
            compose.getClass();
            return compose;
        }
        VibrationEffect createOneShot = VibrationEffect.createOneShot(10L, 100);
        createOneShot.getClass();
        return createOneShot;
    }

    public static final VibrationEffect access$Success$lambda$3() {
        VibrationEffect createWaveform = VibrationEffect.createWaveform(new long[]{0, 30, 50, 60}, new int[]{0, 100, 0, EnumC0170g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE}, -1);
        createWaveform.getClass();
        return createWaveform;
    }

    public static /* synthetic */ void adjustScalingForAccessibility$workflow_release(TextView textView) {
        float f = textView.getContext().getResources().getConfiguration().fontScale;
        if (f <= 1.0f) {
            return;
        }
        b.a(textView, f);
    }

    public static /* synthetic */ void announceStateOnScreenReader$workflow_release(View view, String str) {
        str.getClass();
        if (Build.VERSION.SDK_INT >= 30) {
            view.setStateDescription(str);
        } else {
            view.announceForAccessibility(str);
        }
    }

    public static final void applyThemesSystemBarAppearance(Resources.Theme theme, View view, TypedValue typedValue) {
        theme.getClass();
        view.getClass();
        int i = (!theme.resolveAttribute(R.attr.windowLightStatusBar, typedValue, true) || typedValue.data == 0) ? 0 : 8;
        if (theme.resolveAttribute(R.attr.windowLightNavigationBar, typedValue, true) && typedValue.data != 0) {
            i |= 16;
        }
        WindowInsetsController windowInsetsController = view.getWindowInsetsController();
        windowInsetsController.getClass();
        windowInsetsController.setSystemBarsAppearance(i, 24);
    }

    public static InsetsCollector attachedTo(View view) {
        view.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            view.setWindowInsetsAnimationCallback(InsetsCollector$Companion$NoOpAnimationCallback.INSTANCE);
        }
        InsetsCollector insetsCollector = new InsetsCollector();
        WindowInsetsCompat build = (i >= 36 ? new WindowInsetsCompat.BuilderImpl36() : i >= 35 ? new WindowInsetsCompat.BuilderImpl35() : i >= 34 ? new WindowInsetsCompat.BuilderImpl34() : i >= 31 ? new WindowInsetsCompat.BuilderImpl31() : i >= 30 ? new WindowInsetsCompat.BuilderImpl30() : new WindowInsetsCompat.BuilderImpl29()).build();
        build.getClass();
        insetsCollector.windowInsets = build;
        insetsCollector.cashInsets = new CashInsets((Pair[]) Arrays.copyOf(new Pair[0], 0));
        view.setOnApplyWindowInsetsListener(insetsCollector);
        return insetsCollector;
    }

    public static Context createAttributionContext(Context context, String str) {
        return context.createAttributionContext(str);
    }

    public static Icon createWithAdaptiveBitmapContentUri(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static final Rect getActiveArraySizeSafely(CameraMetadata cameraMetadata) {
        cameraMetadata.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
        key.getClass();
        Camera2CameraMetadata camera2CameraMetadata = (Camera2CameraMetadata) cameraMetadata;
        Rect rect = (Rect) camera2CameraMetadata.get(key);
        if (rect != null) {
            return rect;
        }
        if (StringUtilsKt.isLogLevelEnabled(5, "CXCP")) {
            Log.w("CXCP", "Failed to read SENSOR_INFO_ACTIVE_ARRAY_SIZE for " + ((Object) CameraId.m46toStringimpl(camera2CameraMetadata.camera)) + '!');
        }
        return new Rect(0, 0, 4000, 3000);
    }

    public static String getAttributionTag(Context context) {
        return context.getAttributionTag();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d5 A[Catch: AssertionError -> 0x0044, TryCatch #0 {AssertionError -> 0x0044, blocks: (B:3:0x0012, B:5:0x0023, B:7:0x0029, B:8:0x0047, B:11:0x004d, B:14:0x007f, B:16:0x0085, B:18:0x00a0, B:21:0x00cf, B:23:0x00d5, B:24:0x00ef, B:26:0x00c1, B:28:0x00e9, B:29:0x0071, B:31:0x009a), top: B:2:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Range getControlZoomRatioRangeSafely(CameraMetadata cameraMetadata) {
        CameraCharacteristics.Key key;
        Float f;
        float floatValue;
        Float valueOf = Float.valueOf(1.0f);
        cameraMetadata.getClass();
        try {
            key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
            key.getClass();
            Camera2CameraMetadata camera2CameraMetadata = (Camera2CameraMetadata) cameraMetadata;
            Range range = (Range) camera2CameraMetadata.get(key);
            if (range == null) {
                if (StringUtilsKt.isLogLevelEnabled(5, "CXCP")) {
                    Log.w("CXCP", "Failed to read CONTROL_ZOOM_RATIO_RANGE for " + ((Object) CameraId.m46toStringimpl(camera2CameraMetadata.camera)) + '!');
                }
                return new Range(valueOf, valueOf);
            }
            Object lower = range.getLower();
            lower.getClass();
            float floatValue2 = ((Number) lower).floatValue();
            if (Math.abs(floatValue2) >= Math.ulp(Math.abs(floatValue2)) * 2.0d && ((Number) range.getLower()).floatValue() >= RecyclerView.DECELERATION_RATE) {
                f = (Float) range.getLower();
                Object upper = range.getUpper();
                upper.getClass();
                floatValue = ((Number) upper).floatValue();
                if (Math.abs(floatValue) >= Math.ulp(Math.abs(floatValue)) * 2.0d && ((Number) range.getUpper()).floatValue() >= RecyclerView.DECELERATION_RATE) {
                    valueOf = (Float) range.getUpper();
                    return new Range(f, valueOf);
                }
                if (StringUtilsKt.isLogLevelEnabled(5, "CXCP")) {
                    Log.w("CXCP", "Invalid upper zoom range detected: " + range.getUpper());
                }
                return new Range(f, valueOf);
            }
            if (StringUtilsKt.isLogLevelEnabled(5, "CXCP")) {
                Log.w("CXCP", "Invalid lower zoom range detected: " + range.getLower());
            }
            f = valueOf;
            Object upper2 = range.getUpper();
            upper2.getClass();
            floatValue = ((Number) upper2).floatValue();
            if (Math.abs(floatValue) >= Math.ulp(Math.abs(floatValue)) * 2.0d) {
                valueOf = (Float) range.getUpper();
                return new Range(f, valueOf);
            }
            if (StringUtilsKt.isLogLevelEnabled(5, "CXCP")) {
            }
            return new Range(f, valueOf);
        } catch (AssertionError e) {
            if (DeviceQuirks.getAll().get(ControlZoomRatioRangeAssertionErrorQuirk.class) != null) {
                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                    Log.d("CXCP", "Device is known to throw an exception while retrieving the value for CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE. CONTROL_ZOOM_RATIO_RANGE is not supported. [Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", API Level: " + Build.VERSION.SDK_INT + "].");
                }
            } else if (StringUtilsKt.isLogLevelEnabled(6, "CXCP")) {
                Log.e("CXCP", "Exception thrown while retrieving the value for CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE on devices not known to throw exceptions during this operation. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", API Level: " + Build.VERSION.SDK_INT + "]. CONTROL_ZOOM_RATIO_RANGE is not available.", e);
            }
            if (!StringUtilsKt.isLogLevelEnabled(5, "CXCP")) {
                return null;
            }
            Log.w("CXCP", "AssertionError: failed to get CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE", e);
            return null;
        }
    }

    public static String getConversationId(NotificationChannel notificationChannel) {
        return notificationChannel.getConversationId();
    }

    public static final int getDeviceCurrentBasicOrientation(Context context) {
        context.getClass();
        return context.getResources().getConfiguration().orientation;
    }

    public static NotificationChannel getNotificationChannel(NotificationManager notificationManager, String str, String str2) {
        return notificationManager.getNotificationChannel(str, str2);
    }

    public static String getParentChannelId(NotificationChannel notificationChannel) {
        return notificationChannel.getParentChannelId();
    }

    public static final int getRotationFromNaturalOrientation(Context context) {
        Display defaultDisplay;
        if (Build.VERSION.SDK_INT >= 30) {
            defaultDisplay = context.getDisplay();
        } else {
            Object systemService = context.getSystemService("window");
            systemService.getClass();
            defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        }
        if (defaultDisplay != null) {
            return defaultDisplay.getRotation();
        }
        return 0;
    }

    public static final Object getSafely(CameraMetadata cameraMetadata, CameraCharacteristics.Key key) {
        CameraCharacteristics.Key key2;
        cameraMetadata.getClass();
        key.getClass();
        if (Build.VERSION.SDK_INT >= 30) {
            key2 = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
            if (Intrinsics.areEqual(key, key2)) {
                return getControlZoomRatioRangeSafely(cameraMetadata);
            }
        }
        return Intrinsics.areEqual(key, CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE) ? getActiveArraySizeSafely(cameraMetadata) : ((Camera2CameraMetadata) cameraMetadata).get(key);
    }

    public static CharSequence getStateDescription(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static Insets getWaterfallInsets(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    public static final boolean isDocumentAlignedWithImage(int i, int i2, int i3) {
        return (i != 2 ? i3 == 90 || i3 == 270 : i3 == 0 || i3 == 180) ? i == i2 : i != i2;
    }

    public static void isImportantConversation(NotificationChannel notificationChannel) {
        notificationChannel.isImportantConversation();
    }

    public static boolean quickReject(Canvas canvas, RectF rectF) {
        return canvas.quickReject(rectF);
    }

    public static void setConversationId(NotificationChannel notificationChannel, String str, String str2) {
        notificationChannel.setConversationId(str, str2);
    }

    public static void setDecorFitsSystemWindows(Window window, boolean z) {
        window.setDecorFitsSystemWindows(z);
    }

    public static void setPath(Outline outline, AndroidPath androidPath) {
        if (androidPath instanceof AndroidPath) {
            outline.setPath(androidPath.internalPath);
        } else {
            a$$ExternalSyntheticBUOutline0.m("Unable to obtain android.graphics.Path");
        }
    }

    public static void setStateDescription(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }

    public static void setSurfaceFrameRate(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == RecyclerView.DECELERATION_RATE ? 0 : 1);
        } catch (IllegalStateException e) {
            androidx.media3.common.util.Log.e("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }

    public static boolean quickReject(Canvas canvas, Path path) {
        return canvas.quickReject(path);
    }

    public static boolean quickReject(Canvas canvas, float f, float f2, float f3, float f4) {
        return canvas.quickReject(f, f2, f3, f4);
    }
}
