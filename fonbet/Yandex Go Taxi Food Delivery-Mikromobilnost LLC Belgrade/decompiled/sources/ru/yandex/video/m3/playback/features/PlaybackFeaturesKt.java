package ru.yandex.video.m3.playback.features;

import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import defpackage.cvu0;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.h5z0;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0010\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u001a\u0014\u0010\u0011\u001a\u00020\b*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013*\u00020\u0003H\u0002¢\u0006\u0002\u0010\u0014\u001a\u0015\u0010\u0015\u001a\u00020\r*\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0082\u0004¨\u0006\u0017"}, d2 = {"findDisplaySize", "Landroid/graphics/Point;", "context", "Landroid/content/Context;", "display", "Landroid/view/Display;", "getDisplayInfos", "", "Lru/yandex/video/m3/playback/features/DisplayInfo;", "getHdrTypes", "", "getInfoViaSystemApi", "isTv", "", "readSystemProperty", "", "name", "asDisplayInfo", "getDisplays", "", "(Landroid/content/Context;)[Landroid/view/Display;", "has", "flag", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlaybackFeaturesKt {
    private static final DisplayInfo asDisplayInfo(Point point, Display display) {
        return DisplayInfoKt.DisplayInfo$default(point, Boolean.valueOf(has(display.getFlags(), 1)), Boolean.valueOf(has(display.getFlags(), 2)), null, 8, null);
    }

    private static final Point findDisplaySize(Context context, Display display) {
        List W;
        if (display.getDisplayId() == 0 && isTv(context)) {
            String readSystemProperty = readSystemProperty("vendor.display-size");
            if (readSystemProperty.length() > 0) {
                try {
                    W = evu0.W(evu0.k0(readSystemProperty).toString(), new String[]{RemoteBioParameters.X}, (r2 & 4) != 0 ? 0 : 2);
                    if (W.size() == 2) {
                        int parseInt = Integer.parseInt((String) W.get(0));
                        int parseInt2 = Integer.parseInt((String) W.get(1));
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            if ("Sony".equals(Build.MANUFACTURER) && cvu0.x(Build.MODEL, "BRAVIA", false) && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        return getInfoViaSystemApi(display);
    }

    public static final Set<DisplayInfo> getDisplayInfos(Context context) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Display display : getDisplays(context)) {
            linkedHashSet.add(asDisplayInfo(findDisplaySize(context, display), display));
        }
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    private static final Display[] getDisplays(Context context) {
        return ((DisplayManager) context.getSystemService("display")).getDisplays();
    }

    public static final Set<Integer> getHdrTypes(Context context) {
        int[] supportedHdrTypes;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Display display : getDisplays(context)) {
            Display.HdrCapabilities hdrCapabilities = display.getHdrCapabilities();
            if (hdrCapabilities != null && (supportedHdrTypes = hdrCapabilities.getSupportedHdrTypes()) != null) {
                for (int i : supportedHdrTypes) {
                    linkedHashSet.add(Integer.valueOf(i));
                }
            }
        }
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    private static final Point getInfoViaSystemApi(Display display) {
        Display.Mode mode = display.getMode();
        return new Point(mode.getPhysicalWidth(), mode.getPhysicalHeight());
    }

    private static final boolean has(int i, int i2) {
        return (i & i2) == i2;
    }

    private static final boolean isTv(Context context) {
        Object systemService = context.getApplicationContext().getSystemService("uimode");
        UiModeManager uiModeManager = systemService instanceof UiModeManager ? (UiModeManager) systemService : null;
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    private static final String readSystemProperty(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties", true, Context.class.getClassLoader());
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e) {
            h5z0.a.f(e, g8e.o("Failed to retrieve property ", str), new Object[0]);
            return "";
        }
    }
}
