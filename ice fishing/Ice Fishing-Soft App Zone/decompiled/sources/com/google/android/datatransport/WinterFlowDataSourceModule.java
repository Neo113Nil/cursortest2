package com.google.android.datatransport;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowDataSourceModule {
    public static final WinterFlowEventConsumer WinterFlowRouterStructure = new WinterFlowEventConsumer();
    public static final Object WinterFlowHookDataSource = new Object();
    public static WinterFlowThreadPoolProcess WinterFlowCacheManagerAgent = null;

    /* JADX WARN: Can't wrap try/catch for region: R(17:33|34|35|(2:75|76)(1:37)|38|(9:45|(1:49)|(1:56)|57|(2:65|66)|61|62|63|64)|(1:72)(1:(1:74))|(1:49)|(3:51|54|56)|57|(1:59)|65|66|61|62|63|64) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c5, code lost:
    
        r5 = 327680;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void WinterFlowCacheManagerAgent(Context context, boolean z) {
        boolean z2;
        WinterFlowListenerBandwidth WinterFlowRouterStructure2;
        WinterFlowListenerBandwidth winterFlowListenerBandwidth;
        int i;
        if (z || WinterFlowCacheManagerAgent == null) {
            synchronized (WinterFlowHookDataSource) {
                if (!z) {
                    if (WinterFlowCacheManagerAgent != null) {
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
                        long WinterFlowRouterStructure3 = WinterFlowRouterStructure(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                WinterFlowRouterStructure2 = WinterFlowListenerBandwidth.WinterFlowRouterStructure(file3);
                            } catch (IOException unused2) {
                                WinterFlowHookDataSource();
                                return;
                            }
                        } else {
                            WinterFlowRouterStructure2 = null;
                        }
                        if (WinterFlowRouterStructure2 != null && WinterFlowRouterStructure2.WinterFlowCacheManagerAgent == WinterFlowRouterStructure3 && (i = WinterFlowRouterStructure2.WinterFlowHookDataSource) != 2) {
                            i2 = i;
                            if (z && z4 && i2 != 1) {
                                i2 = 2;
                            }
                            if (WinterFlowRouterStructure2 != null && WinterFlowRouterStructure2.WinterFlowHookDataSource == 2 && i2 == 1 && length < WinterFlowRouterStructure2.WinterFlowArrayNetwork) {
                                i2 = 3;
                            }
                            winterFlowListenerBandwidth = new WinterFlowListenerBandwidth(1, i2, WinterFlowRouterStructure3, length2);
                            if (WinterFlowRouterStructure2 != null || !WinterFlowRouterStructure2.equals(winterFlowListenerBandwidth)) {
                                winterFlowListenerBandwidth.WinterFlowHookDataSource(file3);
                            }
                            WinterFlowHookDataSource();
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
                        if (WinterFlowRouterStructure2 != null) {
                            i2 = 3;
                        }
                        winterFlowListenerBandwidth = new WinterFlowListenerBandwidth(1, i2, WinterFlowRouterStructure3, length2);
                        if (WinterFlowRouterStructure2 != null) {
                        }
                        winterFlowListenerBandwidth.WinterFlowHookDataSource(file3);
                        WinterFlowHookDataSource();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        WinterFlowHookDataSource();
                        return;
                    }
                }
                WinterFlowHookDataSource();
            }
        }
    }

    public static WinterFlowThreadPoolProcess WinterFlowHookDataSource() {
        WinterFlowThreadPoolProcess winterFlowThreadPoolProcess = new WinterFlowThreadPoolProcess(20);
        WinterFlowCacheManagerAgent = winterFlowThreadPoolProcess;
        WinterFlowEventConsumer winterFlowEventConsumer = WinterFlowRouterStructure;
        winterFlowEventConsumer.getClass();
        if (WinterFlowThreadHelper.WinterFlowResponseEngine.WinterFlowBatchUI(winterFlowEventConsumer, null, winterFlowThreadPoolProcess)) {
            WinterFlowThreadHelper.WinterFlowCacheManagerAgent(winterFlowEventConsumer);
        }
        return WinterFlowCacheManagerAgent;
    }

    public static long WinterFlowRouterStructure(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? WinterFlowBackendThreadPool.WinterFlowRouterStructure(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }
}
