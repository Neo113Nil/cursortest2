package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowParserUtility {
    public static final boolean WinterFlowArrayNetwork;
    public static volatile int WinterFlowRouterStructure;
    public static final String[] WinterFlowTransactionManagerStrategy;
    public static volatile WinterFlowThreadAgent WinterFlowVariableVersionControl;
    public static final WinterFlowThreadAgent WinterFlowHookDataSource = new WinterFlowThreadAgent(1);
    public static final WinterFlowThreadAgent WinterFlowCacheManagerAgent = new WinterFlowThreadAgent(0);

    static {
        String str;
        try {
            str = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            str = null;
        }
        WinterFlowArrayNetwork = str != null ? str.equalsIgnoreCase("true") : false;
        WinterFlowTransactionManagerStrategy = new String[]{"2.0"};
    }

    public static final void WinterFlowArrayNetwork() {
        try {
            ArrayList WinterFlowRouterStructure2 = WinterFlowRouterStructure();
            WinterFlowUnitTestResponse(WinterFlowRouterStructure2);
            if (WinterFlowRouterStructure2.isEmpty()) {
                WinterFlowRouterStructure = 4;
                WinterFlowQueueRequest.WinterFlowCacheManagerAgent("No SLF4J providers were found.");
                WinterFlowQueueRequest.WinterFlowCacheManagerAgent("Defaulting to no-operation (NOP) logger implementation");
                WinterFlowQueueRequest.WinterFlowCacheManagerAgent("See https://www.slf4j.org/codes.html#noProviders for further details.");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    ClassLoader classLoader = WinterFlowParserUtility.class.getClassLoader();
                    Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class") : classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
                    while (systemResources.hasMoreElements()) {
                        linkedHashSet.add(systemResources.nextElement());
                    }
                } catch (IOException e) {
                    WinterFlowQueueRequest.WinterFlowRouterStructure("Error getting resources from path", e);
                }
                WinterFlowTransactionManagerStrategy(linkedHashSet);
            } else {
                WinterFlowVariableVersionControl = (WinterFlowThreadAgent) WinterFlowRouterStructure2.get(0);
                WinterFlowVariableVersionControl.getClass();
                WinterFlowRouterStructure = 3;
                if (!WinterFlowRouterStructure2.isEmpty() && WinterFlowRouterStructure2.size() > 1) {
                    String str = "Actual provider is of type [" + WinterFlowRouterStructure2.get(0) + "]";
                    if (WinterFlowResolverBackend.WinterFlowHookDataSource(1) >= WinterFlowResolverBackend.WinterFlowHookDataSource(WinterFlowQueueRequest.WinterFlowHookDataSource)) {
                        WinterFlowQueueRequest.WinterFlowHookDataSource().println("SLF4J(I): ".concat(str));
                    }
                }
            }
            WinterFlowVariableVersionControl();
            if (WinterFlowRouterStructure == 3) {
                try {
                    switch (WinterFlowVariableVersionControl.WinterFlowRouterStructure) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            boolean z = false;
                            for (String str2 : WinterFlowTransactionManagerStrategy) {
                                if ("2.0.99".startsWith(str2)) {
                                    z = true;
                                }
                            }
                            if (z) {
                                return;
                            }
                            WinterFlowQueueRequest.WinterFlowCacheManagerAgent("The requested version 2.0.99 by your slf4j provider is not compatible with " + Arrays.asList(WinterFlowTransactionManagerStrategy).toString());
                            WinterFlowQueueRequest.WinterFlowCacheManagerAgent("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
                            return;
                        default:
                            throw new UnsupportedOperationException();
                    }
                } catch (Throwable th) {
                    WinterFlowQueueRequest.WinterFlowRouterStructure("Unexpected problem occurred during version sanity check", th);
                }
            }
        } catch (Exception e2) {
            WinterFlowRouterStructure = 2;
            WinterFlowQueueRequest.WinterFlowRouterStructure("Failed to instantiate SLF4J LoggerFactory", e2);
            throw new IllegalStateException("Unexpected initialization failure", e2);
        }
    }

    public static WinterFlowValidatorPipeline WinterFlowCacheManagerAgent(String str) {
        WinterFlowThreadAgent winterFlowThreadAgent;
        WinterFlowServiceInterface winterFlowServiceInterface;
        if (WinterFlowRouterStructure == 0) {
            synchronized (WinterFlowParserUtility.class) {
                try {
                    if (WinterFlowRouterStructure == 0) {
                        WinterFlowRouterStructure = 1;
                        WinterFlowArrayNetwork();
                    }
                } finally {
                }
            }
        }
        int i = WinterFlowRouterStructure;
        if (i == 1) {
            winterFlowThreadAgent = WinterFlowHookDataSource;
        } else {
            if (i == 2) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
                return null;
            }
            if (i == 3) {
                winterFlowThreadAgent = WinterFlowVariableVersionControl;
            } else {
                if (i != 4) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Unreachable code");
                    return null;
                }
                winterFlowThreadAgent = WinterFlowCacheManagerAgent;
            }
        }
        switch (winterFlowThreadAgent.WinterFlowRouterStructure) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                winterFlowServiceInterface = (WinterFlowAlgorithmDebug) winterFlowThreadAgent.WinterFlowHookDataSource;
                break;
            default:
                winterFlowServiceInterface = (WinterFlowManagerAlgorithm) winterFlowThreadAgent.WinterFlowHookDataSource;
                break;
        }
        return winterFlowServiceInterface.WinterFlowCacheManagerAgent(str);
    }

    public static WinterFlowValidatorPipeline WinterFlowHookDataSource(Class cls) {
        int i;
        WinterFlowValidatorPipeline WinterFlowCacheManagerAgent2 = WinterFlowCacheManagerAgent(cls.getName());
        if (WinterFlowArrayNetwork) {
            WinterFlowSyntaxRequest winterFlowSyntaxRequest = WinterFlowInvokerComponent.WinterFlowRouterStructure;
            Class cls2 = null;
            if (winterFlowSyntaxRequest == null) {
                if (WinterFlowInvokerComponent.WinterFlowHookDataSource) {
                    winterFlowSyntaxRequest = null;
                } else {
                    try {
                        winterFlowSyntaxRequest = new WinterFlowSyntaxRequest();
                    } catch (SecurityException unused) {
                        winterFlowSyntaxRequest = null;
                    }
                    WinterFlowInvokerComponent.WinterFlowRouterStructure = winterFlowSyntaxRequest;
                    WinterFlowInvokerComponent.WinterFlowHookDataSource = true;
                }
            }
            if (winterFlowSyntaxRequest != null) {
                Class[] classContext = winterFlowSyntaxRequest.getClassContext();
                String name = WinterFlowInvokerComponent.class.getName();
                int i2 = 0;
                while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
                    i2++;
                }
                if (i2 >= classContext.length || (i = i2 + 2) >= classContext.length) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
                    return null;
                }
                cls2 = classContext[i];
            }
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                WinterFlowQueueRequest.WinterFlowCacheManagerAgent("Detected logger name mismatch. Given name: \"" + WinterFlowCacheManagerAgent2.getName() + "\"; computed name: \"" + cls2.getName() + "\".");
                WinterFlowQueueRequest.WinterFlowCacheManagerAgent("See https://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
            }
        }
        return WinterFlowCacheManagerAgent2;
    }

    public static ArrayList WinterFlowRouterStructure() {
        ArrayList arrayList = new ArrayList();
        final ClassLoader classLoader = WinterFlowParserUtility.class.getClassLoader();
        String property = System.getProperty("slf4j.provider");
        WinterFlowThreadAgent winterFlowThreadAgent = null;
        if (property != null && !property.isEmpty()) {
            try {
                String str = "Attempting to load provider \"" + property + "\" specified via \"slf4j.provider\" system property";
                if (WinterFlowResolverBackend.WinterFlowHookDataSource(1) >= WinterFlowResolverBackend.WinterFlowHookDataSource(WinterFlowQueueRequest.WinterFlowHookDataSource)) {
                    WinterFlowQueueRequest.WinterFlowHookDataSource().println("SLF4J(I): ".concat(str));
                }
                winterFlowThreadAgent = (WinterFlowThreadAgent) classLoader.loadClass(property).getConstructor(null).newInstance(null);
            } catch (ClassCastException e) {
                WinterFlowQueueRequest.WinterFlowRouterStructure("Specified SLF4JServiceProvider (" + property + ") does not implement SLF4JServiceProvider interface", e);
            } catch (ClassNotFoundException e2) {
                e = e2;
                WinterFlowQueueRequest.WinterFlowRouterStructure("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (IllegalAccessException e3) {
                e = e3;
                WinterFlowQueueRequest.WinterFlowRouterStructure("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InstantiationException e4) {
                e = e4;
                WinterFlowQueueRequest.WinterFlowRouterStructure("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (NoSuchMethodException e5) {
                e = e5;
                WinterFlowQueueRequest.WinterFlowRouterStructure("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InvocationTargetException e6) {
                e = e6;
                WinterFlowQueueRequest.WinterFlowRouterStructure("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            }
        }
        if (winterFlowThreadAgent != null) {
            arrayList.add(winterFlowThreadAgent);
            return arrayList;
        }
        Iterator it = (System.getSecurityManager() == null ? ServiceLoader.load(WinterFlowThreadAgent.class, classLoader) : (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: com.google.android.datatransport.WinterFlowVersionComponent
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return ServiceLoader.load(WinterFlowThreadAgent.class, classLoader);
            }
        })).iterator();
        while (it.hasNext()) {
            try {
                arrayList.add((WinterFlowThreadAgent) it.next());
            } catch (ServiceConfigurationError e7) {
                WinterFlowQueueRequest.WinterFlowHookDataSource().println("SLF4J(E): ".concat("A service provider failed to instantiate:\n" + e7.getMessage()));
            }
        }
        return arrayList;
    }

    public static void WinterFlowTransactionManagerStrategy(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.isEmpty()) {
            return;
        }
        WinterFlowQueueRequest.WinterFlowCacheManagerAgent("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            WinterFlowQueueRequest.WinterFlowCacheManagerAgent("Ignoring binding found at [" + ((URL) it.next()) + "]");
        }
        WinterFlowQueueRequest.WinterFlowCacheManagerAgent("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    public static void WinterFlowUnitTestResponse(ArrayList arrayList) {
        if (arrayList.size() > 1) {
            WinterFlowQueueRequest.WinterFlowCacheManagerAgent("Class path contains multiple SLF4J providers.");
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                WinterFlowQueueRequest.WinterFlowCacheManagerAgent("Found provider [" + ((WinterFlowThreadAgent) obj) + "]");
            }
            WinterFlowQueueRequest.WinterFlowCacheManagerAgent("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    public static void WinterFlowVariableVersionControl() {
        WinterFlowThreadAgent winterFlowThreadAgent = WinterFlowHookDataSource;
        synchronized (winterFlowThreadAgent) {
            try {
                ((WinterFlowManagerAlgorithm) winterFlowThreadAgent.WinterFlowHookDataSource).WinterFlowVariableVersionControl = true;
                ArrayList arrayList = new ArrayList(((WinterFlowManagerAlgorithm) winterFlowThreadAgent.WinterFlowHookDataSource).WinterFlowTransactionManagerStrategy.values());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    WinterFlowFrameworkObject winterFlowFrameworkObject = (WinterFlowFrameworkObject) obj;
                    winterFlowFrameworkObject.WinterFlowTransactionManagerStrategy = WinterFlowCacheManagerAgent(winterFlowFrameworkObject.WinterFlowVariableVersionControl);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LinkedBlockingQueue linkedBlockingQueue = ((WinterFlowManagerAlgorithm) WinterFlowHookDataSource.WinterFlowHookDataSource).WinterFlowUnitTestResponse;
        int size2 = linkedBlockingQueue.size();
        ArrayList arrayList2 = new ArrayList(128);
        int i2 = 0;
        while (linkedBlockingQueue.drainTo(arrayList2, 128) != 0) {
            int size3 = arrayList2.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                WinterFlowThreadTransaction winterFlowThreadTransaction = (WinterFlowThreadTransaction) obj2;
                if (winterFlowThreadTransaction != null) {
                    WinterFlowFrameworkObject winterFlowFrameworkObject2 = winterFlowThreadTransaction.WinterFlowHookDataSource;
                    String str = winterFlowFrameworkObject2.WinterFlowVariableVersionControl;
                    if (winterFlowFrameworkObject2.WinterFlowTransactionManagerStrategy == null) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Delegate logger cannot be null at this state.");
                        return;
                    } else if (!(winterFlowFrameworkObject2.WinterFlowTransactionManagerStrategy instanceof WinterFlowProviderOrchestration)) {
                        if (!winterFlowFrameworkObject2.WinterFlowServiceUtility()) {
                            WinterFlowQueueRequest.WinterFlowCacheManagerAgent(str);
                        } else if (winterFlowFrameworkObject2.WinterFlowUnitTestResponse(winterFlowThreadTransaction.WinterFlowRouterStructure) && winterFlowFrameworkObject2.WinterFlowServiceUtility()) {
                            try {
                                winterFlowFrameworkObject2.WinterFlowRouterRouter.invoke(winterFlowFrameworkObject2.WinterFlowTransactionManagerStrategy, winterFlowThreadTransaction);
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i4 = i2 + 1;
                if (i2 == 0) {
                    if (winterFlowThreadTransaction.WinterFlowHookDataSource.WinterFlowServiceUtility()) {
                        WinterFlowQueueRequest.WinterFlowCacheManagerAgent("A number (" + size2 + ") of logging calls during the initialization phase have been intercepted and are");
                        WinterFlowQueueRequest.WinterFlowCacheManagerAgent("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        WinterFlowQueueRequest.WinterFlowCacheManagerAgent("See also https://www.slf4j.org/codes.html#replay");
                    } else if (!(winterFlowThreadTransaction.WinterFlowHookDataSource.WinterFlowTransactionManagerStrategy instanceof WinterFlowProviderOrchestration)) {
                        WinterFlowQueueRequest.WinterFlowCacheManagerAgent("The following set of substitute loggers may have been accessed");
                        WinterFlowQueueRequest.WinterFlowCacheManagerAgent("during the initialization phase. Logging calls during this");
                        WinterFlowQueueRequest.WinterFlowCacheManagerAgent("phase were not honored. However, subsequent logging calls to these");
                        WinterFlowQueueRequest.WinterFlowCacheManagerAgent("loggers will work as normally expected.");
                        WinterFlowQueueRequest.WinterFlowCacheManagerAgent("See also https://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i2 = i4;
            }
            arrayList2.clear();
        }
        WinterFlowManagerAlgorithm winterFlowManagerAlgorithm = (WinterFlowManagerAlgorithm) WinterFlowHookDataSource.WinterFlowHookDataSource;
        winterFlowManagerAlgorithm.WinterFlowTransactionManagerStrategy.clear();
        winterFlowManagerAlgorithm.WinterFlowUnitTestResponse.clear();
    }
}
