package androidx.versionedparcelable;

import android.R;
import android.content.Context;
import android.os.Build;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public abstract class YellowLoopAPIMonitorAQPdiaqYqCOkUm1mZY59667568441323 {
    public static final Method ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", null);
            } catch (Exception unused) {
            }
        }
    }

    public static float ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) != null) {
            try {
                return ((Integer) method.invoke(viewConfiguration, null)).intValue();
            } catch (Exception unused) {
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }
}
