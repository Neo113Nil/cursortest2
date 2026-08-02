package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.c;
import ru.yandex.video.m3.playback.features.DisplayInfo;
import timber.log.Timber;

/* loaded from: classes6.dex */
public abstract class nzk {
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final LinkedHashSet a(Context context) {
        Point point;
        List split$default;
        context.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Object systemService = context.getSystemService("display");
        systemService.getClass();
        Display[] displays = ((DisplayManager) systemService).getDisplays();
        displays.getClass();
        for (Display display : displays) {
            boolean z = true;
            if (display.getDisplayId() == 0) {
                Object systemService2 = context.getApplicationContext().getSystemService("uimode");
                UiModeManager uiModeManager = systemService2 instanceof UiModeManager ? (UiModeManager) systemService2 : null;
                if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
                    String b = b(Build.VERSION.SDK_INT < 28 ? "sys.display-size" : "vendor.display-size");
                    if (b.length() > 0) {
                        try {
                            split$default = StringsKt__StringsKt.split$default(StringsKt.t0(b).toString(), new String[]{"x"}, false, 0, 6, null);
                        } catch (Throwable unused) {
                        }
                        if (split$default.size() == 2) {
                            int parseInt = Integer.parseInt((String) split$default.get(0));
                            int parseInt2 = Integer.parseInt((String) split$default.get(1));
                            if (parseInt > 0 && parseInt2 > 0) {
                                point = new Point(parseInt, parseInt2);
                                Boolean valueOf = Boolean.valueOf((display.getFlags() & 1) == 1);
                                if ((display.getFlags() & 2) != 2) {
                                    z = false;
                                }
                                linkedHashSet.add(new DisplayInfo(point, valueOf, Boolean.valueOf(z), null));
                            }
                        }
                    }
                    if ("Sony".equals(Build.MANUFACTURER)) {
                        String str = Build.MODEL;
                        str.getClass();
                        if (c.v(str, "BRAVIA", false) && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                            point = new Point(3840, 2160);
                            Boolean valueOf2 = Boolean.valueOf((display.getFlags() & 1) == 1);
                            if ((display.getFlags() & 2) != 2) {
                            }
                            linkedHashSet.add(new DisplayInfo(point, valueOf2, Boolean.valueOf(z), null));
                        }
                    }
                }
            }
            Display.Mode mode = display.getMode();
            point = new Point(mode.getPhysicalWidth(), mode.getPhysicalHeight());
            Boolean valueOf22 = Boolean.valueOf((display.getFlags() & 1) == 1);
            if ((display.getFlags() & 2) != 2) {
            }
            linkedHashSet.add(new DisplayInfo(point, valueOf22, Boolean.valueOf(z), null));
        }
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public static final String b(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties", true, Context.class.getClassLoader());
            Object invoke = cls.getMethod("get", String.class).invoke(cls, str);
            invoke.getClass();
            return (String) invoke;
        } catch (Exception e) {
            Timber.INSTANCE.e(e, "Failed to retrieve property ".concat(str), new Object[0]);
            return "";
        }
    }
}
