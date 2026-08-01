package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowValidatorProcess {
    public final Class WinterFlowHookDataSource;
    public final Class WinterFlowRouterStructure;

    public WinterFlowValidatorProcess(Class cls, Class cls2) {
        this.WinterFlowRouterStructure = cls;
        this.WinterFlowHookDataSource = cls2;
    }

    public static WinterFlowValidatorProcess WinterFlowRouterStructure(Class cls) {
        return new WinterFlowValidatorProcess(WinterFlowExceptionJava.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WinterFlowValidatorProcess.class != obj.getClass()) {
            return false;
        }
        WinterFlowValidatorProcess winterFlowValidatorProcess = (WinterFlowValidatorProcess) obj;
        if (this.WinterFlowHookDataSource.equals(winterFlowValidatorProcess.WinterFlowHookDataSource)) {
            return this.WinterFlowRouterStructure.equals(winterFlowValidatorProcess.WinterFlowRouterStructure);
        }
        return false;
    }

    public final int hashCode() {
        return this.WinterFlowRouterStructure.hashCode() + (this.WinterFlowHookDataSource.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.WinterFlowHookDataSource;
        Class cls2 = this.WinterFlowRouterStructure;
        if (cls2 == WinterFlowExceptionJava.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
