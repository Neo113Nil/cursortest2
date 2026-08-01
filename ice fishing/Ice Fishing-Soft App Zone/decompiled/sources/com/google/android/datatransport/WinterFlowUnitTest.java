package com.google.android.datatransport;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowUnitTest extends WinterFlowAlgorithmDebug {
    @Override // com.google.android.datatransport.WinterFlowAlgorithmDebug
    public final Signature[] WinterFlowVariableVersionControl(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
