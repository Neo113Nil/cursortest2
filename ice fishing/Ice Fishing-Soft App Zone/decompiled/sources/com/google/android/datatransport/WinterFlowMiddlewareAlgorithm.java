package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class WinterFlowMiddlewareAlgorithm {
    public static final /* synthetic */ int[] WinterFlowRouterStructure;

    static {
        int[] iArr = new int[WinterFlowMicroserviceProcess.values().length];
        try {
            iArr[WinterFlowMicroserviceProcess.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WinterFlowMicroserviceProcess.ON_STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[WinterFlowMicroserviceProcess.ON_START.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[WinterFlowMicroserviceProcess.ON_PAUSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[WinterFlowMicroserviceProcess.ON_RESUME.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[WinterFlowMicroserviceProcess.ON_DESTROY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[WinterFlowMicroserviceProcess.ON_ANY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        WinterFlowRouterStructure = iArr;
    }
}
