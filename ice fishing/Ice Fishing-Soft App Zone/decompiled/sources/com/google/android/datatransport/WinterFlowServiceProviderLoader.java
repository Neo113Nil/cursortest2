package com.google.android.datatransport;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowServiceProviderLoader {
    public final WinterFlowUnitTestSystem WinterFlowCacheManagerAgent;
    public final WinterFlowUnitTestSystem WinterFlowHookDataSource;
    public final WinterFlowUnitTestSystem WinterFlowRouterStructure;

    public WinterFlowServiceProviderLoader(WinterFlowUnitTestSystem winterFlowUnitTestSystem, WinterFlowUnitTestSystem winterFlowUnitTestSystem2, WinterFlowUnitTestSystem winterFlowUnitTestSystem3) {
        this.WinterFlowRouterStructure = winterFlowUnitTestSystem;
        this.WinterFlowHookDataSource = winterFlowUnitTestSystem2;
        this.WinterFlowCacheManagerAgent = winterFlowUnitTestSystem3;
    }

    public final Method WinterFlowArrayNetwork(Class cls) {
        String name = cls.getName();
        WinterFlowUnitTestSystem winterFlowUnitTestSystem = this.WinterFlowHookDataSource;
        Method method = (Method) winterFlowUnitTestSystem.get(name);
        if (method != null) {
            return method;
        }
        Class WinterFlowHookDataSource = WinterFlowHookDataSource(cls);
        System.currentTimeMillis();
        Method declaredMethod = WinterFlowHookDataSource.getDeclaredMethod("write", cls, WinterFlowServiceProviderLoader.class);
        winterFlowUnitTestSystem.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public final Method WinterFlowCacheManagerAgent(String str) {
        WinterFlowUnitTestSystem winterFlowUnitTestSystem = this.WinterFlowRouterStructure;
        Method method = (Method) winterFlowUnitTestSystem.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, WinterFlowServiceProviderLoader.class.getClassLoader()).getDeclaredMethod("read", WinterFlowServiceProviderLoader.class);
        winterFlowUnitTestSystem.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Class WinterFlowHookDataSource(Class cls) {
        String name = cls.getName();
        WinterFlowUnitTestSystem winterFlowUnitTestSystem = this.WinterFlowCacheManagerAgent;
        Class cls2 = (Class) winterFlowUnitTestSystem.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        winterFlowUnitTestSystem.put(cls.getName(), cls3);
        return cls3;
    }

    public abstract void WinterFlowRouterRouter(int i);

    public abstract WinterFlowThreadPool WinterFlowRouterStructure();

    public final void WinterFlowSyntax(WinterFlowJavaConsumer winterFlowJavaConsumer) {
        if (winterFlowJavaConsumer == null) {
            ((WinterFlowThreadPool) this).WinterFlowVariableVersionControl.writeString(null);
            return;
        }
        try {
            ((WinterFlowThreadPool) this).WinterFlowVariableVersionControl.writeString(WinterFlowHookDataSource(winterFlowJavaConsumer.getClass()).getName());
            WinterFlowThreadPool WinterFlowRouterStructure = WinterFlowRouterStructure();
            try {
                WinterFlowArrayNetwork(winterFlowJavaConsumer.getClass()).invoke(null, winterFlowJavaConsumer, WinterFlowRouterStructure);
                Parcel parcel = WinterFlowRouterStructure.WinterFlowVariableVersionControl;
                int i = WinterFlowRouterStructure.WinterFlowSyntax;
                if (i >= 0) {
                    int i2 = WinterFlowRouterStructure.WinterFlowArrayNetwork.get(i);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(winterFlowJavaConsumer.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }

    public final Parcelable WinterFlowTransactionManagerStrategy(Parcelable parcelable, int i) {
        if (!WinterFlowVariableVersionControl(i)) {
            return parcelable;
        }
        return ((WinterFlowThreadPool) this).WinterFlowVariableVersionControl.readParcelable(WinterFlowThreadPool.class.getClassLoader());
    }

    public final WinterFlowJavaConsumer WinterFlowUnitTestResponse() {
        String readString = ((WinterFlowThreadPool) this).WinterFlowVariableVersionControl.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (WinterFlowJavaConsumer) WinterFlowCacheManagerAgent(readString).invoke(null, WinterFlowRouterStructure());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public abstract boolean WinterFlowVariableVersionControl(int i);
}
