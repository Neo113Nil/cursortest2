package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowParserUI {
    public final float WinterFlowHookDataSource;
    public final float WinterFlowRouterStructure;

    public WinterFlowParserUI(float f, WinterFlowConcurrencyParser winterFlowConcurrencyParser) {
        this.WinterFlowRouterStructure = f;
        float WinterFlowHookDataSource = winterFlowConcurrencyParser.WinterFlowHookDataSource();
        float f2 = WinterFlowModuleBatch.WinterFlowRouterStructure;
        this.WinterFlowHookDataSource = WinterFlowHookDataSource * 386.0878f * 160.0f * 0.84f;
    }

    public final double WinterFlowHookDataSource(float f) {
        float[] fArr = WinterFlowXMLManager.WinterFlowRouterStructure;
        return Math.log((Math.abs(f) * 0.35f) / (this.WinterFlowRouterStructure * this.WinterFlowHookDataSource));
    }

    public final WinterFlowValidatorBatch WinterFlowRouterStructure(float f) {
        double WinterFlowHookDataSource = WinterFlowHookDataSource(f);
        double d = WinterFlowModuleBatch.WinterFlowRouterStructure;
        double d2 = d - 1.0d;
        return new WinterFlowValidatorBatch(f, (float) (Math.exp((d / d2) * WinterFlowHookDataSource) * this.WinterFlowRouterStructure * this.WinterFlowHookDataSource), (long) (Math.exp(WinterFlowHookDataSource / d2) * 1000.0d));
    }
}
