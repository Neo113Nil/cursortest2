package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowObjectClass implements WinterFlowHookInheritance {
    public final /* synthetic */ Object WinterFlowHookDataSource;
    public final /* synthetic */ int WinterFlowRouterStructure;

    public /* synthetic */ WinterFlowObjectClass(int i, Object obj) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = obj;
    }

    @Override // com.google.android.datatransport.WinterFlowHookInheritance
    public final Object get() {
        int i = this.WinterFlowRouterStructure;
        Object obj = this.WinterFlowHookDataSource;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                String str = (String) obj;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new WinterFlowControllerCache("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    return null;
                } catch (IllegalAccessException e) {
                    throw new WinterFlowControllerCache(WinterFlowResolverBackend.WinterFlowResponseEngine("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e2) {
                    throw new WinterFlowControllerCache(WinterFlowResolverBackend.WinterFlowResponseEngine("Could not instantiate ", str, "."), e2);
                } catch (NoSuchMethodException e3) {
                    throw new WinterFlowControllerCache("Could not instantiate " + str, e3);
                } catch (InvocationTargetException e4) {
                    throw new WinterFlowControllerCache("Could not instantiate " + str, e4);
                }
            case 1:
                return (ComponentRegistrar) obj;
            default:
                return new WinterFlowVersionControlManager((com.google.firebase.WinterFlowSyntaxEvent) obj);
        }
    }
}
