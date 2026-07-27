package androidx.versionedparcelable;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public abstract class MysticCacheDelegateMacroGh78ObUwWuR2WMViSK46130287575253 {
    public static final WhiteFieldTemplatingSchedulerOxcRMYoY0S0zmiWbpQ42044688650049 ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = new WhiteFieldTemplatingSchedulerOxcRMYoY0S0zmiWbpQ42044688650049();
    public static final Object AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = new Object();
    public static YellowLoopClosureRuntimeADXBWZM52VT7HZFiG874319005768760 ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = null;

    /* JADX WARN: Can't wrap try/catch for region: R(17:33|34|35|(2:75|76)(1:37)|38|(9:45|(1:49)|(1:56)|57|(2:65|66)|61|62|63|64)|(1:72)(1:(1:74))|(1:49)|(3:51|54|56)|57|(1:59)|65|66|61|62|63|64) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c5, code lost:
    
        r5 = 327680;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(Context context, boolean z) {
        boolean z2;
        KryptonFlowSingletonProtocolJX29rRL12ApQu8opqq40553353913441 ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928002;
        KryptonFlowSingletonProtocolJX29rRL12ApQu8opqq40553353913441 kryptonFlowSingletonProtocolJX29rRL12ApQu8opqq40553353913441;
        int i;
        if (z || ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 == null) {
            synchronized (AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365) {
                if (!z) {
                    if (ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 != null) {
                        return;
                    }
                }
                int i2 = 0;
                try {
                    AssetFileDescriptor openFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        z2 = openFd.getLength() > 0;
                        openFd.close();
                    } finally {
                    }
                } catch (IOException unused) {
                    z2 = false;
                }
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 28 && i3 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    boolean z3 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z4 = file2.exists() && length2 > 0;
                    try {
                        long ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928003 = ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928002 = KryptonFlowSingletonProtocolJX29rRL12ApQu8opqq40553353913441.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(file3);
                            } catch (IOException unused2) {
                                AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365();
                                return;
                            }
                        } else {
                            ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928002 = null;
                        }
                        if (ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928002 != null && ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928002.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 == ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928003 && (i = ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928002.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365) != 2) {
                            i2 = i;
                            if (z && z4 && i2 != 1) {
                                i2 = 2;
                            }
                            if (ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928002 != null && ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928002.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 == 2 && i2 == 1 && length < ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928002.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
                                i2 = 3;
                            }
                            kryptonFlowSingletonProtocolJX29rRL12ApQu8opqq40553353913441 = new KryptonFlowSingletonProtocolJX29rRL12ApQu8opqq40553353913441(1, i2, ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928003, length2);
                            if (ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928002 != null || !ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928002.equals(kryptonFlowSingletonProtocolJX29rRL12ApQu8opqq40553353913441)) {
                                kryptonFlowSingletonProtocolJX29rRL12ApQu8opqq40553353913441.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(file3);
                            }
                            AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365();
                            return;
                        }
                        if (z3) {
                            i2 = 1;
                        } else if (z4) {
                            i2 = 2;
                        }
                        if (z) {
                            i2 = 2;
                        }
                        if (ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928002 != null) {
                            i2 = 3;
                        }
                        kryptonFlowSingletonProtocolJX29rRL12ApQu8opqq40553353913441 = new KryptonFlowSingletonProtocolJX29rRL12ApQu8opqq40553353913441(1, i2, ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928003, length2);
                        if (ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928002 != null) {
                        }
                        kryptonFlowSingletonProtocolJX29rRL12ApQu8opqq40553353913441.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(file3);
                        AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365();
                        return;
                    }
                }
                AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365();
            }
        }
    }

    public static YellowLoopClosureRuntimeADXBWZM52VT7HZFiG874319005768760 AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365() {
        YellowLoopClosureRuntimeADXBWZM52VT7HZFiG874319005768760 yellowLoopClosureRuntimeADXBWZM52VT7HZFiG874319005768760 = new YellowLoopClosureRuntimeADXBWZM52VT7HZFiG874319005768760(2);
        ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = yellowLoopClosureRuntimeADXBWZM52VT7HZFiG874319005768760;
        WhiteFieldTemplatingSchedulerOxcRMYoY0S0zmiWbpQ42044688650049 whiteFieldTemplatingSchedulerOxcRMYoY0S0zmiWbpQ42044688650049 = ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        whiteFieldTemplatingSchedulerOxcRMYoY0S0zmiWbpQ42044688650049.getClass();
        if (FrostBridgeGatewayDelegateQRGk9yxPto5mQrR1Wa10362725350657.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834(whiteFieldTemplatingSchedulerOxcRMYoY0S0zmiWbpQ42044688650049, null, yellowLoopClosureRuntimeADXBWZM52VT7HZFiG874319005768760)) {
            FrostBridgeGatewayDelegateQRGk9yxPto5mQrR1Wa10362725350657.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(whiteFieldTemplatingSchedulerOxcRMYoY0S0zmiWbpQ42044688650049);
        }
        return ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
    }

    public static long ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? WhiteFieldMacroNamespaceWUSqo0DNNzmeXxIYAD20406158457028.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }
}
