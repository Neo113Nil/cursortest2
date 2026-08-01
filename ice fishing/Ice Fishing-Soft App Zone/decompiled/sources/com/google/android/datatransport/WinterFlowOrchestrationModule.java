package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowOrchestrationModule {
    public static final Object[] WinterFlowCacheManagerAgent;
    public static final float[] WinterFlowRouterStructure = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile WinterFlowRequestListener WinterFlowHookDataSource = new WinterFlowRequestListener();

    static {
        Object[] objArr = new Object[0];
        WinterFlowCacheManagerAgent = objArr;
        synchronized (objArr) {
            WinterFlowHookDataSource.WinterFlowCacheManagerAgent(115, new WinterFlowProviderProcess(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            WinterFlowHookDataSource.WinterFlowCacheManagerAgent(130, new WinterFlowProviderProcess(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            WinterFlowHookDataSource.WinterFlowCacheManagerAgent(150, new WinterFlowProviderProcess(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            WinterFlowHookDataSource.WinterFlowCacheManagerAgent(180, new WinterFlowProviderProcess(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            WinterFlowHookDataSource.WinterFlowCacheManagerAgent(200, new WinterFlowProviderProcess(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((WinterFlowHookDataSource.WinterFlowHookDataSource(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        WinterFlowConcurrencyMapper.WinterFlowHookDataSource("You should only apply non-linear scaling to font scales > 1");
    }

    public static void WinterFlowHookDataSource(float f, WinterFlowProviderProcess winterFlowProviderProcess) {
        synchronized (WinterFlowCacheManagerAgent) {
            WinterFlowRequestListener clone = WinterFlowHookDataSource.clone();
            clone.WinterFlowCacheManagerAgent((int) (f * 100.0f), winterFlowProviderProcess);
            WinterFlowHookDataSource = clone;
        }
    }

    public static WinterFlowVersionService WinterFlowRouterStructure(float f) {
        float WinterFlowHookDataSource2;
        WinterFlowVersionService winterFlowVersionService;
        float[] fArr = WinterFlowRouterStructure;
        if (f < 1.03f) {
            return null;
        }
        WinterFlowRequestListener winterFlowRequestListener = WinterFlowHookDataSource;
        int i = (int) (f * 100.0f);
        winterFlowRequestListener.getClass();
        WinterFlowVersionService winterFlowVersionService2 = (WinterFlowVersionService) WinterFlowCloudStack.WinterFlowThreadListener(winterFlowRequestListener, i);
        if (winterFlowVersionService2 != null) {
            return winterFlowVersionService2;
        }
        WinterFlowRequestListener winterFlowRequestListener2 = WinterFlowHookDataSource;
        if (winterFlowRequestListener2.WinterFlowVariableVersionControl) {
            WinterFlowCloudStack.WinterFlowSerializerStructure(winterFlowRequestListener2);
        }
        int WinterFlowSyntax = WinterFlowHandlerWebsocket.WinterFlowSyntax(winterFlowRequestListener2.WinterFlowTransactionManagerStrategy, winterFlowRequestListener2.WinterFlowRouterRouter, i);
        if (WinterFlowSyntax >= 0) {
            return (WinterFlowVersionService) WinterFlowHookDataSource.WinterFlowVariableVersionControl(WinterFlowSyntax);
        }
        int i2 = -(WinterFlowSyntax + 1);
        int i3 = i2 - 1;
        if (i2 >= WinterFlowHookDataSource.WinterFlowArrayNetwork()) {
            WinterFlowProviderProcess winterFlowProviderProcess = new WinterFlowProviderProcess(new float[]{1.0f}, new float[]{f});
            WinterFlowHookDataSource(f, winterFlowProviderProcess);
            return winterFlowProviderProcess;
        }
        if (i3 < 0) {
            winterFlowVersionService = new WinterFlowProviderProcess(fArr, fArr);
            WinterFlowHookDataSource2 = 1.0f;
        } else {
            WinterFlowHookDataSource2 = WinterFlowHookDataSource.WinterFlowHookDataSource(i3) / 100.0f;
            winterFlowVersionService = (WinterFlowVersionService) WinterFlowHookDataSource.WinterFlowVariableVersionControl(i3);
        }
        float WinterFlowHookDataSource3 = WinterFlowHookDataSource.WinterFlowHookDataSource(i2) / 100.0f;
        float max = (Math.max(0.0f, Math.min(1.0f, WinterFlowHookDataSource2 == WinterFlowHookDataSource3 ? 0.0f : (f - WinterFlowHookDataSource2) / (WinterFlowHookDataSource3 - WinterFlowHookDataSource2))) * 1.0f) + 0.0f;
        WinterFlowVersionService winterFlowVersionService3 = (WinterFlowVersionService) WinterFlowHookDataSource.WinterFlowVariableVersionControl(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f2 = fArr[i4];
            float WinterFlowHookDataSource4 = winterFlowVersionService.WinterFlowHookDataSource(f2);
            fArr2[i4] = ((winterFlowVersionService3.WinterFlowHookDataSource(f2) - WinterFlowHookDataSource4) * max) + WinterFlowHookDataSource4;
        }
        WinterFlowProviderProcess winterFlowProviderProcess2 = new WinterFlowProviderProcess(fArr, fArr2);
        WinterFlowHookDataSource(f, winterFlowProviderProcess2);
        return winterFlowProviderProcess2;
    }
}
