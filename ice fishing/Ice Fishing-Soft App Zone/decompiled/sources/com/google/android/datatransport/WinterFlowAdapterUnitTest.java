package com.google.android.datatransport;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowAdapterUnitTest {
    public Serializable WinterFlowArrayNetwork;
    public Object WinterFlowCacheManagerAgent;
    public int WinterFlowHookDataSource;
    public int WinterFlowRouterStructure;
    public Serializable WinterFlowVariableVersionControl;

    public static String WinterFlowCacheManagerAgent(com.google.firebase.WinterFlowSyntaxEvent winterFlowSyntaxEvent) {
        winterFlowSyntaxEvent.WinterFlowRouterStructure();
        WinterFlowMapperEngine winterFlowMapperEngine = winterFlowSyntaxEvent.WinterFlowCacheManagerAgent;
        String str = winterFlowMapperEngine.WinterFlowVariableVersionControl;
        if (str != null) {
            return str;
        }
        winterFlowSyntaxEvent.WinterFlowRouterStructure();
        String str2 = winterFlowMapperEngine.WinterFlowHookDataSource;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public synchronized int WinterFlowArrayNetwork() {
        PackageInfo packageInfo;
        try {
            if (this.WinterFlowRouterStructure == 0) {
                try {
                    packageInfo = ((Context) this.WinterFlowCacheManagerAgent).getPackageManager().getPackageInfo("com.google.android.gms", 0);
                } catch (PackageManager.NameNotFoundException e) {
                    e.toString();
                    packageInfo = null;
                }
                if (packageInfo != null) {
                    this.WinterFlowRouterStructure = packageInfo.versionCode;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.WinterFlowRouterStructure;
    }

    public synchronized String WinterFlowHookDataSource() {
        try {
            if (((String) this.WinterFlowArrayNetwork) == null) {
                WinterFlowTransactionManagerStrategy();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.WinterFlowArrayNetwork;
    }

    public void WinterFlowRouterRouter(int i, int i2) {
        long[] jArr = (long[]) this.WinterFlowCacheManagerAgent;
        int[] iArr = (int[]) this.WinterFlowArrayNetwork;
        int[] iArr2 = (int[]) this.WinterFlowVariableVersionControl;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v10, types: [int[], java.io.Serializable] */
    public int WinterFlowRouterStructure(long j) {
        int i = this.WinterFlowRouterStructure + 1;
        long[] jArr = (long[]) this.WinterFlowCacheManagerAgent;
        int length = jArr.length;
        if (i > length) {
            int i2 = length * 2;
            long[] jArr2 = new long[i2];
            ?? r2 = new int[i2];
            WinterFlowProtocolPipeline.WinterFlowFrontendBackend(jArr, jArr2, 0, 0, jArr.length);
            WinterFlowProtocolPipeline.WinterFlowUIMiddleware((int[]) this.WinterFlowArrayNetwork, r2, 0, 0, 14);
            this.WinterFlowCacheManagerAgent = jArr2;
            this.WinterFlowArrayNetwork = r2;
        }
        int i3 = this.WinterFlowRouterStructure;
        this.WinterFlowRouterStructure = i3 + 1;
        int[] iArr = (int[]) this.WinterFlowVariableVersionControl;
        int length2 = iArr.length;
        int[] iArr2 = iArr;
        if (this.WinterFlowHookDataSource >= length2) {
            int i4 = length2 * 2;
            ?? r1 = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                r1[i5] = i6;
                i5 = i6;
            }
            WinterFlowProtocolPipeline.WinterFlowUIMiddleware((int[]) this.WinterFlowVariableVersionControl, r1, 0, 0, 14);
            this.WinterFlowVariableVersionControl = r1;
            iArr2 = r1;
        }
        int[] iArr3 = iArr2;
        int i7 = this.WinterFlowHookDataSource;
        this.WinterFlowHookDataSource = iArr2[i7];
        long[] jArr3 = (long[]) this.WinterFlowCacheManagerAgent;
        jArr3[i3] = j;
        ((int[]) this.WinterFlowArrayNetwork)[i3] = i7;
        iArr3[i7] = i3;
        while (i3 > 0) {
            int i8 = ((i3 + 1) >> 1) - 1;
            if (WinterFlowManagerRequest.WinterFlowRouterAdapter(jArr3[i8], j) <= 0) {
                break;
            }
            WinterFlowRouterRouter(i8, i3);
            i3 = i8;
        }
        return i7;
    }

    public synchronized void WinterFlowTransactionManagerStrategy() {
        PackageInfo packageInfo;
        try {
            packageInfo = ((Context) this.WinterFlowCacheManagerAgent).getPackageManager().getPackageInfo(((Context) this.WinterFlowCacheManagerAgent).getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.toString();
            packageInfo = null;
        }
        if (packageInfo != null) {
            this.WinterFlowArrayNetwork = Integer.toString(packageInfo.versionCode);
            this.WinterFlowVariableVersionControl = packageInfo.versionName;
        }
    }

    public void WinterFlowUnitTestResponse(int i) {
        int i2 = this.WinterFlowHookDataSource;
        boolean z = false;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        WinterFlowWorkerPipeline.WinterFlowRouterStructure("lineIndex(" + i + ") is out of bounds [0, " + i2 + ')');
    }

    public boolean WinterFlowVariableVersionControl() {
        int i;
        synchronized (this) {
            i = this.WinterFlowHookDataSource;
            if (i == 0) {
                PackageManager packageManager = ((Context) this.WinterFlowCacheManagerAgent).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    i = 0;
                } else {
                    Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                    if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                        this.WinterFlowHookDataSource = 2;
                    } else {
                        this.WinterFlowHookDataSource = 2;
                    }
                    i = 2;
                }
            }
        }
        return i != 0;
    }
}
