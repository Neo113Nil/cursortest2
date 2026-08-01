package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowSoftwareSubsystem {
    public WinterFlowProxyValidator WinterFlowHookDataSource;
    public WinterFlowProtocolPlatform WinterFlowRouterStructure;
    public float WinterFlowCacheManagerAgent = 1.0f;
    public WinterFlowCacheManagerConfiguration WinterFlowArrayNetwork = WinterFlowCacheManagerConfiguration.WinterFlowVariableVersionControl;

    public abstract long WinterFlowArrayNetwork();

    public final void WinterFlowCacheManagerAgent(WinterFlowParserUserManager winterFlowParserUserManager, long j, float f, WinterFlowProxyValidator winterFlowProxyValidator) {
        if (this.WinterFlowCacheManagerAgent != f) {
            WinterFlowRouterStructure(f);
            this.WinterFlowCacheManagerAgent = f;
        }
        if (!WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowHookDataSource, winterFlowProxyValidator)) {
            WinterFlowHookDataSource(winterFlowProxyValidator);
            this.WinterFlowHookDataSource = winterFlowProxyValidator;
        }
        WinterFlowCacheManagerConfiguration layoutDirection = winterFlowParserUserManager.getLayoutDirection();
        if (this.WinterFlowArrayNetwork != layoutDirection) {
            this.WinterFlowArrayNetwork = layoutDirection;
        }
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (winterFlowParserUserManager.WinterFlowArrayNetwork() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (winterFlowParserUserManager.WinterFlowArrayNetwork() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((WinterFlowConfigurationModule) winterFlowParserUserManager.WinterFlowSerializerStructure().WinterFlowTransactionManagerStrategy).WinterFlowThreadListener(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    WinterFlowVariableVersionControl(winterFlowParserUserManager);
                }
            } finally {
                ((WinterFlowConfigurationModule) winterFlowParserUserManager.WinterFlowSerializerStructure().WinterFlowTransactionManagerStrategy).WinterFlowThreadListener(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
            }
        }
    }

    public abstract void WinterFlowHookDataSource(WinterFlowProxyValidator winterFlowProxyValidator);

    public abstract void WinterFlowRouterStructure(float f);

    public abstract void WinterFlowVariableVersionControl(WinterFlowParserUserManager winterFlowParserUserManager);
}
