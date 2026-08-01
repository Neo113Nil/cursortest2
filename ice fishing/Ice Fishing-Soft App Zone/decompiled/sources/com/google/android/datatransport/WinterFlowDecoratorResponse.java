package com.google.android.datatransport;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowDecoratorResponse extends WinterFlowHookBackend {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, WinterFlowDecoratorResponse> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected WinterFlowFrameworkRenderer unknownFields;

    public WinterFlowDecoratorResponse() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = WinterFlowFrameworkRenderer.WinterFlowTransactionManagerStrategy;
    }

    public static WinterFlowDecoratorResponse WinterFlowArrayNetwork(Class cls) {
        WinterFlowDecoratorResponse winterFlowDecoratorResponse = defaultInstanceMap.get(cls);
        if (winterFlowDecoratorResponse == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                winterFlowDecoratorResponse = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (winterFlowDecoratorResponse != null) {
            return winterFlowDecoratorResponse;
        }
        try {
            WinterFlowDecoratorResponse winterFlowDecoratorResponse2 = (WinterFlowDecoratorResponse) ((WinterFlowDecoratorResponse) WinterFlowRouterModule.WinterFlowRouterStructure.allocateInstance(cls)).WinterFlowCacheManagerAgent(6);
            if (winterFlowDecoratorResponse2 == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, winterFlowDecoratorResponse2);
            return winterFlowDecoratorResponse2;
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static void WinterFlowResponseEngine(Class cls, WinterFlowDecoratorResponse winterFlowDecoratorResponse) {
        winterFlowDecoratorResponse.WinterFlowRouterRouter();
        defaultInstanceMap.put(cls, winterFlowDecoratorResponse);
    }

    public static final boolean WinterFlowTransactionManagerStrategy(WinterFlowDecoratorResponse winterFlowDecoratorResponse, boolean z) {
        byte byteValue = ((Byte) winterFlowDecoratorResponse.WinterFlowCacheManagerAgent(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        WinterFlowRequestCompiler winterFlowRequestCompiler = WinterFlowRequestCompiler.WinterFlowCacheManagerAgent;
        winterFlowRequestCompiler.getClass();
        boolean WinterFlowVariableVersionControl = winterFlowRequestCompiler.WinterFlowRouterStructure(winterFlowDecoratorResponse.getClass()).WinterFlowVariableVersionControl(winterFlowDecoratorResponse);
        if (z) {
            winterFlowDecoratorResponse.WinterFlowCacheManagerAgent(2);
        }
        return WinterFlowVariableVersionControl;
    }

    public static Object WinterFlowVariableVersionControl(Method method, WinterFlowDecoratorResponse winterFlowDecoratorResponse, Object... objArr) {
        try {
            return method.invoke(winterFlowDecoratorResponse, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public abstract Object WinterFlowCacheManagerAgent(int i);

    @Override // com.google.android.datatransport.WinterFlowHookBackend
    public final void WinterFlowHookDataSource(WinterFlowSessionManagerSingleton winterFlowSessionManagerSingleton) {
        WinterFlowRequestCompiler winterFlowRequestCompiler = WinterFlowRequestCompiler.WinterFlowCacheManagerAgent;
        winterFlowRequestCompiler.getClass();
        WinterFlowServerSyntax WinterFlowRouterStructure = winterFlowRequestCompiler.WinterFlowRouterStructure(getClass());
        WinterFlowJSONDecorator winterFlowJSONDecorator = winterFlowSessionManagerSingleton.WinterFlowRouterStructure;
        if (winterFlowJSONDecorator == null) {
            winterFlowJSONDecorator = new WinterFlowJSONDecorator(winterFlowSessionManagerSingleton);
        }
        WinterFlowRouterStructure.WinterFlowHookDataSource(this, winterFlowJSONDecorator);
    }

    public final void WinterFlowRouterRouter() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // com.google.android.datatransport.WinterFlowHookBackend
    public final int WinterFlowRouterStructure(WinterFlowServerSyntax winterFlowServerSyntax) {
        int WinterFlowUnitTestResponse;
        int WinterFlowUnitTestResponse2;
        if (WinterFlowUnitTestResponse()) {
            if (winterFlowServerSyntax == null) {
                WinterFlowRequestCompiler winterFlowRequestCompiler = WinterFlowRequestCompiler.WinterFlowCacheManagerAgent;
                winterFlowRequestCompiler.getClass();
                WinterFlowUnitTestResponse2 = winterFlowRequestCompiler.WinterFlowRouterStructure(getClass()).WinterFlowUnitTestResponse(this);
            } else {
                WinterFlowUnitTestResponse2 = winterFlowServerSyntax.WinterFlowUnitTestResponse(this);
            }
            if (WinterFlowUnitTestResponse2 >= 0) {
                return WinterFlowUnitTestResponse2;
            }
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter(WinterFlowResolverBackend.WinterFlowSyntax("serialized size must be non-negative, was ", WinterFlowUnitTestResponse2));
            return 0;
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (winterFlowServerSyntax == null) {
            WinterFlowRequestCompiler winterFlowRequestCompiler2 = WinterFlowRequestCompiler.WinterFlowCacheManagerAgent;
            winterFlowRequestCompiler2.getClass();
            WinterFlowUnitTestResponse = winterFlowRequestCompiler2.WinterFlowRouterStructure(getClass()).WinterFlowUnitTestResponse(this);
        } else {
            WinterFlowUnitTestResponse = winterFlowServerSyntax.WinterFlowUnitTestResponse(this);
        }
        WinterFlowTransactionAgent(WinterFlowUnitTestResponse);
        return WinterFlowUnitTestResponse;
    }

    public final WinterFlowDecoratorResponse WinterFlowSyntax() {
        return (WinterFlowDecoratorResponse) WinterFlowCacheManagerAgent(4);
    }

    public final void WinterFlowTransactionAgent(int i) {
        if (i < 0) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter(WinterFlowResolverBackend.WinterFlowSyntax("serialized size must be non-negative, was ", i));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }

    public final boolean WinterFlowUnitTestResponse() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WinterFlowRequestCompiler winterFlowRequestCompiler = WinterFlowRequestCompiler.WinterFlowCacheManagerAgent;
        winterFlowRequestCompiler.getClass();
        return winterFlowRequestCompiler.WinterFlowRouterStructure(getClass()).WinterFlowCacheManagerAgent(this, (WinterFlowDecoratorResponse) obj);
    }

    public final int hashCode() {
        if (WinterFlowUnitTestResponse()) {
            WinterFlowRequestCompiler winterFlowRequestCompiler = WinterFlowRequestCompiler.WinterFlowCacheManagerAgent;
            winterFlowRequestCompiler.getClass();
            return winterFlowRequestCompiler.WinterFlowRouterStructure(getClass()).WinterFlowTransactionManagerStrategy(this);
        }
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        WinterFlowRequestCompiler winterFlowRequestCompiler2 = WinterFlowRequestCompiler.WinterFlowCacheManagerAgent;
        winterFlowRequestCompiler2.getClass();
        int WinterFlowTransactionManagerStrategy = winterFlowRequestCompiler2.WinterFlowRouterStructure(getClass()).WinterFlowTransactionManagerStrategy(this);
        this.memoizedHashCode = WinterFlowTransactionManagerStrategy;
        return WinterFlowTransactionManagerStrategy;
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = WinterFlowServerSessionManager.WinterFlowRouterStructure;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        WinterFlowServerSessionManager.WinterFlowCacheManagerAgent(this, sb, 0);
        return sb.toString();
    }
}
