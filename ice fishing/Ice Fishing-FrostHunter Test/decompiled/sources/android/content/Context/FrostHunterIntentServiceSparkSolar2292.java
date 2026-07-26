package android.content.Context;

import android.os.Build;
import android.os.Process;
import android.os.WorkSource;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterIntentServiceSparkSolar2292 {
    public static final Method FrostHunterAlphaAnimationNeoCosmos5761;
    public static Boolean FrostHunterBundlePulseFusionHero2475;
    public static final Method FrostHunterConstraintSetCloneMasterUltraRogue2633;

    static {
        Method method;
        Method method2;
        Class cls = Integer.TYPE;
        Process.myUid();
        try {
            method = WorkSource.class.getMethod("add", cls);
        } catch (Exception unused) {
            method = null;
        }
        FrostHunterAlphaAnimationNeoCosmos5761 = method;
        try {
            method2 = WorkSource.class.getMethod("add", cls, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        FrostHunterConstraintSetCloneMasterUltraRogue2633 = method2;
        try {
            WorkSource.class.getMethod("size", null);
        } catch (Exception unused3) {
        }
        try {
            WorkSource.class.getMethod("get", cls);
        } catch (Exception unused4) {
        }
        try {
            WorkSource.class.getMethod("getName", cls);
        } catch (Exception unused5) {
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                WorkSource.class.getMethod("createWorkChain", null);
            } catch (Exception unused6) {
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", cls, String.class);
            } catch (Exception unused7) {
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                WorkSource.class.getMethod("isEmpty", null).setAccessible(true);
            } catch (Exception unused8) {
            }
        }
        FrostHunterBundlePulseFusionHero2475 = null;
    }
}
