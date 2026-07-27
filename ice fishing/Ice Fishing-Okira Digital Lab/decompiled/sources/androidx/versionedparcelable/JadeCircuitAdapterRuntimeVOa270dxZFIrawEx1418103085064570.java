package androidx.versionedparcelable;

import android.os.Build;
import android.os.Process;
import android.os.WorkSource;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public abstract class JadeCircuitAdapterRuntimeVOa270dxZFIrawEx1418103085064570 {
    public static Boolean ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
    public static final Method AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public static final Method ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

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
        ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = method;
        try {
            method2 = WorkSource.class.getMethod("add", cls, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = method2;
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
        ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = null;
    }
}
