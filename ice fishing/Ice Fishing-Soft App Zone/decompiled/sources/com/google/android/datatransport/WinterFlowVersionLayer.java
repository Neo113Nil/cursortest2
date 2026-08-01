package com.google.android.datatransport;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowVersionLayer implements WinterFlowTransactionManagerLayer, WinterFlowEventConfiguration, Serializable {
    public final WinterFlowTransactionManagerLayer WinterFlowVariableVersionControl;

    public WinterFlowVersionLayer(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        this.WinterFlowVariableVersionControl = winterFlowTransactionManagerLayer;
    }

    public WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public abstract Object WinterFlowServiceUtility(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.datatransport.WinterFlowTransactionManagerLayer
    public final void WinterFlowSyntax(Object obj) {
        while (true) {
            WinterFlowVersionLayer winterFlowVersionLayer = this;
            WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer = winterFlowVersionLayer.WinterFlowVariableVersionControl;
            winterFlowTransactionManagerLayer.getClass();
            try {
                obj = winterFlowVersionLayer.WinterFlowServiceUtility(obj);
                if (obj == WinterFlowListenerJava.WinterFlowVariableVersionControl) {
                    return;
                }
            } catch (Throwable th) {
                obj = new WinterFlowDecoratorTool(th);
            }
            winterFlowVersionLayer.WinterFlowBandwidthObject();
            if (!(winterFlowTransactionManagerLayer instanceof WinterFlowVersionLayer)) {
                winterFlowTransactionManagerLayer.WinterFlowSyntax(obj);
                return;
            }
            this = winterFlowTransactionManagerLayer;
        }
    }

    public StackTraceElement WinterFlowThreadListener() {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        WinterFlowCloudProcessor winterFlowCloudProcessor = (WinterFlowCloudProcessor) getClass().getAnnotation(WinterFlowCloudProcessor.class);
        String str2 = null;
        if (winterFlowCloudProcessor == null || winterFlowCloudProcessor.v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i = -1;
        }
        int i2 = i >= 0 ? winterFlowCloudProcessor.l()[i] : -1;
        WinterFlowObjectPackage winterFlowObjectPackage = WinterFlowUnitTestLibrary.WinterFlowTransactionManagerStrategy;
        WinterFlowObjectPackage winterFlowObjectPackage2 = WinterFlowUnitTestLibrary.WinterFlowUnitTestResponse;
        if (winterFlowObjectPackage2 == null) {
            try {
                WinterFlowObjectPackage winterFlowObjectPackage3 = new WinterFlowObjectPackage(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 17);
                WinterFlowUnitTestLibrary.WinterFlowUnitTestResponse = winterFlowObjectPackage3;
                winterFlowObjectPackage2 = winterFlowObjectPackage3;
            } catch (Exception unused2) {
                WinterFlowUnitTestLibrary.WinterFlowUnitTestResponse = winterFlowObjectPackage;
                winterFlowObjectPackage2 = winterFlowObjectPackage;
            }
        }
        if (winterFlowObjectPackage2 != winterFlowObjectPackage && (method = (Method) winterFlowObjectPackage2.WinterFlowTransactionManagerStrategy) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = (Method) winterFlowObjectPackage2.WinterFlowUnitTestResponse) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = (Method) winterFlowObjectPackage2.WinterFlowRouterRouter;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof String) {
                str2 = (String) invoke3;
            }
        }
        if (str2 == null) {
            str = winterFlowCloudProcessor.c();
        } else {
            str = str2 + '/' + winterFlowCloudProcessor.c();
        }
        return new StackTraceElement(str, winterFlowCloudProcessor.m(), winterFlowCloudProcessor.f(), i2);
    }

    public WinterFlowEventConfiguration WinterFlowTransactionManagerStrategy() {
        WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer = this.WinterFlowVariableVersionControl;
        if (winterFlowTransactionManagerLayer instanceof WinterFlowEventConfiguration) {
            return (WinterFlowEventConfiguration) winterFlowTransactionManagerLayer;
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object WinterFlowThreadListener = WinterFlowThreadListener();
        if (WinterFlowThreadListener == null) {
            WinterFlowThreadListener = getClass().getName();
        }
        sb.append(WinterFlowThreadListener);
        return sb.toString();
    }

    public void WinterFlowBandwidthObject() {
    }
}
