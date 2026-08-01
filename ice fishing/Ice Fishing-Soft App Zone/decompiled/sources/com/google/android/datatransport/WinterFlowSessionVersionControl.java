package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowSessionVersionControl {
    public static final boolean WinterFlowHookDataSource;
    public static final Class WinterFlowRouterStructure;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        WinterFlowRouterStructure = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        WinterFlowHookDataSource = cls2 != null;
    }

    public static boolean WinterFlowRouterStructure() {
        return (WinterFlowRouterStructure == null || WinterFlowHookDataSource) ? false : true;
    }
}
