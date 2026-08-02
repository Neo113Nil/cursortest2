package com.datadog.android.internal.system;

import android.os.Build;

/* loaded from: classes4.dex */
public final class BuildSdkVersionProvider$Companion$DEFAULT$1 implements BuildSdkVersionProvider {
    public final boolean isAtLeastN;
    public final boolean isAtLeastO;
    public final boolean isAtLeastP;
    public final boolean isAtLeastQ;
    public final boolean isAtLeastR;
    public final boolean isAtLeastS;
    public final boolean isAtLeastTiramisu;
    public final int version;

    public BuildSdkVersionProvider$Companion$DEFAULT$1() {
        int i = Build.VERSION.SDK_INT;
        this.version = i;
        this.isAtLeastN = true;
        this.isAtLeastO = true;
        this.isAtLeastP = true;
        this.isAtLeastQ = true;
        this.isAtLeastR = i >= 30;
        this.isAtLeastS = i >= 31;
        this.isAtLeastTiramisu = i >= 33;
    }
}
