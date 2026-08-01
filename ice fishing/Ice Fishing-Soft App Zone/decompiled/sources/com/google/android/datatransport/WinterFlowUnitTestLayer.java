package com.google.android.datatransport;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowUnitTestLayer {
    public final File WinterFlowArrayNetwork;
    public final byte[] WinterFlowCacheManagerAgent;
    public final WinterFlowWidgetCache WinterFlowHookDataSource;
    public byte[] WinterFlowRouterRouter;
    public final Executor WinterFlowRouterStructure;
    public boolean WinterFlowTransactionManagerStrategy = false;
    public WinterFlowNodeNetwork[] WinterFlowUnitTestResponse;
    public final String WinterFlowVariableVersionControl;

    public WinterFlowUnitTestLayer(AssetManager assetManager, Executor executor, WinterFlowWidgetCache winterFlowWidgetCache, String str, File file) {
        byte[] bArr;
        this.WinterFlowRouterStructure = executor;
        this.WinterFlowHookDataSource = winterFlowWidgetCache;
        this.WinterFlowVariableVersionControl = str;
        this.WinterFlowArrayNetwork = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 26:
                    bArr = WinterFlowEncryptionSubsystem.WinterFlowOrchestrationSubsystem;
                    break;
                case 27:
                    bArr = WinterFlowEncryptionSubsystem.WinterFlowBandwidthObject;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = WinterFlowEncryptionSubsystem.WinterFlowServiceUtility;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = WinterFlowEncryptionSubsystem.WinterFlowThreadListener;
        }
        this.WinterFlowCacheManagerAgent = bArr;
    }

    public final void WinterFlowHookDataSource(int i, Serializable serializable) {
        this.WinterFlowRouterStructure.execute(new WinterFlowGatewayHelper(i, 2, this, serializable));
    }

    public final FileInputStream WinterFlowRouterStructure(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null) {
                return null;
            }
            message.contains("compressed");
            return null;
        }
    }
}
