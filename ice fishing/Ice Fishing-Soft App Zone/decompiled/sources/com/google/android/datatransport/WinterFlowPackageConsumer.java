package com.google.android.datatransport;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.TreeMap;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowPackageConsumer implements WinterFlowInvokerValidator {
    public Object WinterFlowRouterStructure;

    public WinterFlowPackageConsumer(int i) {
        switch (i) {
            case 1:
                this.WinterFlowRouterStructure = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                break;
            case 2:
            default:
                this.WinterFlowRouterStructure = new ArrayList();
                break;
            case 3:
                this.WinterFlowRouterStructure = new Object();
                break;
            case 4:
                this.WinterFlowRouterStructure = WinterFlowDecoratorUI.WinterFlowSerializerStructure(Boolean.FALSE);
                break;
        }
    }

    public abstract void WinterFlowArrayNetwork(WinterFlowInvokerPlatform winterFlowInvokerPlatform);

    public abstract void WinterFlowBandwidthObject(Object obj, long j, boolean z);

    public abstract void WinterFlowBatchUI(WinterFlowFrameworkAgent winterFlowFrameworkAgent);

    public abstract void WinterFlowCacheManagerAgent(WinterFlowStackProvider winterFlowStackProvider);

    public abstract void WinterFlowConcurrencyThread(Object obj, long j, double d);

    public abstract void WinterFlowConsumerUserManager();

    public void WinterFlowHookDataSource(int i, WinterFlowSchedulerAgent winterFlowSchedulerAgent, Object obj) {
        ((ArrayList) this.WinterFlowRouterStructure).add(new WinterFlowProviderService(i, null, null));
    }

    public abstract boolean WinterFlowMapperProtocol();

    public abstract void WinterFlowOrchestrationSubsystem(Object obj, long j, byte b);

    public abstract void WinterFlowResolverController(WinterFlowHandlerInvoker winterFlowHandlerInvoker);

    public abstract double WinterFlowResponseEngine(long j, Object obj);

    public abstract void WinterFlowRouterAdapter(Object obj);

    public abstract String WinterFlowRouterRouter();

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003a, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean WinterFlowRouterStructure(int i, WinterFlowSchedulerAgent winterFlowSchedulerAgent, Object obj) {
        ArrayList arrayList = winterFlowSchedulerAgent.WinterFlowRouterStructure;
        if (arrayList != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                Object obj2 = arrayList.get(i2);
                if (!(obj2 instanceof WinterFlowDatabaseSchemaHandler)) {
                    if (!(obj2 instanceof WinterFlowSchedulerAgent)) {
                        WinterFlowCompilerMechanism.WinterFlowVariableVersionControl(obj2, "Unexpected child source info ");
                        break;
                    }
                    if (WinterFlowRouterStructure(i, (WinterFlowSchedulerAgent) obj2, obj)) {
                        WinterFlowHookDataSource(0, winterFlowSchedulerAgent, obj2);
                        return true;
                    }
                } else if (obj2 == obj) {
                    WinterFlowHookDataSource(0, winterFlowSchedulerAgent, obj2);
                    return true;
                }
                i2++;
            }
        } else {
            WinterFlowHookDataSource(i, winterFlowSchedulerAgent, null);
            return true;
        }
    }

    public boolean WinterFlowSerializerStructure() {
        Unsafe unsafe = (Unsafe) this.WinterFlowRouterStructure;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            WinterFlowRouterModule.WinterFlowSyntax(th);
            return false;
        }
    }

    public abstract float WinterFlowServerProtocol(long j, Object obj);

    public void WinterFlowServiceUtility(String str, String str2) {
        ((TreeMap) this.WinterFlowRouterStructure).put(str, str2);
    }

    public abstract void WinterFlowSingletonPlatform(Object obj, long j, float f);

    public abstract Object WinterFlowSyntax();

    public void WinterFlowThreadListener(int i, Object obj, WinterFlowSchedulerAgent winterFlowSchedulerAgent, Object obj2) {
        if (WinterFlowManagerRequest.WinterFlowThreadListener(obj, WinterFlowModuleModule.WinterFlowRouterStructure)) {
            WinterFlowHookDataSource(i, winterFlowSchedulerAgent, null);
        }
    }

    public String WinterFlowTransactionAgent(String str) {
        String str2 = (String) ((TreeMap) this.WinterFlowRouterStructure).get(str);
        return str2 == null ? "" : str2;
    }

    public abstract void WinterFlowTransactionManagerStrategy();

    public abstract boolean WinterFlowUnitTestResponse(long j, Object obj);

    public abstract WinterFlowObjectSession WinterFlowVariableBandwidth(WinterFlowInvokerPlatform winterFlowInvokerPlatform);

    public abstract void WinterFlowVariableVersionControl();
}
