package com.google.android.datatransport;

import android.os.Build;
import android.os.LocaleList;
import android.os.Looper;
import android.os.Trace;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import com.icewinter.flow.winter.icecatch.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowHookProcessor {
    public static Method WinterFlowTransactionManagerStrategy;
    public static long WinterFlowVariableVersionControl;

    public static Object WinterFlowArrayNetwork(WinterFlowExceptionParser winterFlowExceptionParser) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Must not be called on the main application thread");
            return null;
        }
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && Objects.equals(myLooper.getThread().getName(), "GoogleApiHandler")) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        WinterFlowUnitTestLibrary.WinterFlowSingletonPlatform(winterFlowExceptionParser, "Task must not be null");
        if (winterFlowExceptionParser.WinterFlowUnitTestResponse()) {
            return WinterFlowRouterAdapter(winterFlowExceptionParser);
        }
        WinterFlowCompilerAlgorithm winterFlowCompilerAlgorithm = new WinterFlowCompilerAlgorithm();
        Executor executor = WinterFlowCacheHandler.WinterFlowHookDataSource;
        winterFlowExceptionParser.WinterFlowHookDataSource(executor, winterFlowCompilerAlgorithm);
        WinterFlowProtocolMechanism winterFlowProtocolMechanism = new WinterFlowProtocolMechanism(executor, (WinterFlowMicroserviceMiddleware) winterFlowCompilerAlgorithm);
        WinterFlowCacheModule winterFlowCacheModule = winterFlowExceptionParser.WinterFlowHookDataSource;
        winterFlowCacheModule.WinterFlowHookDataSource(winterFlowProtocolMechanism);
        winterFlowExceptionParser.WinterFlowThreadListener();
        winterFlowCacheModule.WinterFlowHookDataSource(new WinterFlowProtocolMechanism(executor, (WinterFlowTransactionDeserialization) winterFlowCompilerAlgorithm));
        winterFlowExceptionParser.WinterFlowThreadListener();
        winterFlowCompilerAlgorithm.WinterFlowVariableVersionControl.await();
        return WinterFlowRouterAdapter(winterFlowExceptionParser);
    }

    public static final boolean WinterFlowBandwidthObject(WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure, Object obj, Object obj2) {
        Object WinterFlowUnitTestResponse = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(obj);
        if (WinterFlowUnitTestResponse == null) {
            return false;
        }
        if (!(WinterFlowUnitTestResponse instanceof WinterFlowCacheManagerTransactionManager)) {
            if (!WinterFlowUnitTestResponse.equals(obj2)) {
                return false;
            }
            winterFlowDatabaseSchemaStructure.WinterFlowTransactionAgent(obj);
            return true;
        }
        WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager = (WinterFlowCacheManagerTransactionManager) WinterFlowUnitTestResponse;
        boolean WinterFlowServerProtocol = winterFlowCacheManagerTransactionManager.WinterFlowServerProtocol(obj2);
        if (WinterFlowServerProtocol && winterFlowCacheManagerTransactionManager.WinterFlowUnitTestResponse()) {
            winterFlowDatabaseSchemaStructure.WinterFlowTransactionAgent(obj);
        }
        return WinterFlowServerProtocol;
    }

    public static final void WinterFlowBatchUI(Spannable spannable, WinterFlowRuntimeException winterFlowRuntimeException, int i, int i2) {
        if (winterFlowRuntimeException != null) {
            ArrayList arrayList = new ArrayList(WinterFlowModuleThread.WinterFlowModuleAgent(winterFlowRuntimeException, 10));
            Iterator it = winterFlowRuntimeException.WinterFlowVariableVersionControl.iterator();
            while (it.hasNext()) {
                arrayList.add(((WinterFlowGatewayEngine) it.next()).WinterFlowRouterStructure);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    public static final void WinterFlowCacheManagerAgent(WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure, Object obj, Object obj2) {
        int WinterFlowTransactionManagerStrategy2 = winterFlowDatabaseSchemaStructure.WinterFlowTransactionManagerStrategy(obj);
        boolean z = WinterFlowTransactionManagerStrategy2 < 0;
        Object obj3 = z ? null : winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent[WinterFlowTransactionManagerStrategy2];
        if (obj3 != null) {
            if (obj3 instanceof WinterFlowCacheManagerTransactionManager) {
                ((WinterFlowCacheManagerTransactionManager) obj3).WinterFlowRouterStructure(obj2);
            } else if (obj3 != obj2) {
                WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager = new WinterFlowCacheManagerTransactionManager();
                winterFlowCacheManagerTransactionManager.WinterFlowRouterStructure(obj3);
                winterFlowCacheManagerTransactionManager.WinterFlowRouterStructure(obj2);
                obj2 = winterFlowCacheManagerTransactionManager;
            }
            obj2 = obj3;
        }
        if (!z) {
            winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent[WinterFlowTransactionManagerStrategy2] = obj2;
            return;
        }
        int i = ~WinterFlowTransactionManagerStrategy2;
        winterFlowDatabaseSchemaStructure.WinterFlowHookDataSource[i] = obj;
        winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent[i] = obj2;
    }

    public static final float WinterFlowConcurrencyThread(long j, float f, WinterFlowConcurrencyParser winterFlowConcurrencyParser) {
        float WinterFlowCacheManagerAgent;
        long WinterFlowHookDataSource = WinterFlowOrchestrationPlatform.WinterFlowHookDataSource(j);
        if (WinterFlowInheritanceValidator.WinterFlowRouterStructure(WinterFlowHookDataSource, 4294967296L)) {
            if (winterFlowConcurrencyParser.WinterFlowRouterRouter() <= 1.05d) {
                return winterFlowConcurrencyParser.WinterFlowValidatorHandler(j);
            }
            WinterFlowCacheManagerAgent = WinterFlowOrchestrationPlatform.WinterFlowCacheManagerAgent(j) / WinterFlowOrchestrationPlatform.WinterFlowCacheManagerAgent(winterFlowConcurrencyParser.WinterFlowVariableInterface(f));
        } else {
            if (!WinterFlowInheritanceValidator.WinterFlowRouterStructure(WinterFlowHookDataSource, 8589934592L)) {
                return Float.NaN;
            }
            WinterFlowCacheManagerAgent = WinterFlowOrchestrationPlatform.WinterFlowCacheManagerAgent(j);
        }
        return WinterFlowCacheManagerAgent * f;
    }

    public static final WinterFlowVersionParser WinterFlowHookDataSource(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new WinterFlowVersionParser(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    public static String WinterFlowMapperProtocol(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
            sb.append(name);
            sb.append("@");
            sb.append(hexString);
            String sb2 = sb.toString();
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(sb2), (Throwable) e);
            String name2 = e.getClass().getName();
            StringBuilder sb3 = new StringBuilder(sb2.length() + 8 + name2.length() + 1);
            sb3.append("<");
            sb3.append(sb2);
            sb3.append(" threw ");
            sb3.append(name2);
            sb3.append(">");
            return sb3.toString();
        }
    }

    public static final void WinterFlowOrchestrationSubsystem(WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure, Object obj) {
        boolean z;
        long[] jArr = winterFlowDatabaseSchemaStructure.WinterFlowRouterStructure;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = winterFlowDatabaseSchemaStructure.WinterFlowHookDataSource[i4];
                        Object obj3 = winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent[i4];
                        if (obj3 instanceof WinterFlowCacheManagerTransactionManager) {
                            WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager = (WinterFlowCacheManagerTransactionManager) obj3;
                            winterFlowCacheManagerTransactionManager.WinterFlowServerProtocol(obj);
                            z = winterFlowCacheManagerTransactionManager.WinterFlowUnitTestResponse();
                        } else {
                            z = obj3 == obj;
                        }
                        if (z) {
                            winterFlowDatabaseSchemaStructure.WinterFlowServerProtocol(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static WinterFlowExceptionParser WinterFlowResponseEngine(Object obj) {
        WinterFlowExceptionParser winterFlowExceptionParser = new WinterFlowExceptionParser();
        winterFlowExceptionParser.WinterFlowSyntax(obj);
        return winterFlowExceptionParser;
    }

    public static Object WinterFlowRouterAdapter(WinterFlowExceptionParser winterFlowExceptionParser) {
        if (winterFlowExceptionParser.WinterFlowRouterRouter()) {
            return winterFlowExceptionParser.WinterFlowTransactionManagerStrategy();
        }
        if (winterFlowExceptionParser.WinterFlowArrayNetwork) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(winterFlowExceptionParser.WinterFlowVariableVersionControl());
    }

    public static WinterFlowDatabaseSchemaStructure WinterFlowRouterRouter() {
        long[] jArr = WinterFlowDatabaseSchemaUtility.WinterFlowRouterStructure;
        return new WinterFlowDatabaseSchemaStructure();
    }

    public static final void WinterFlowRouterStructure(final boolean z, final WinterFlowEventEvent winterFlowEventEvent, WinterFlowResolverLibrary winterFlowResolverLibrary, final int i) {
        int i2;
        winterFlowResolverLibrary.WinterFlowFrameworkTransaction(-642000585);
        if ((i & 6) == 0) {
            i2 = (winterFlowResolverLibrary.WinterFlowTransactionManagerStrategy(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowEventEvent) ? 32 : 16;
        }
        if (winterFlowResolverLibrary.WinterFlowFrontendBackend(i2 & 1, (i2 & 19) != 18)) {
            Object WinterFlowRouterStructure = WinterFlowTransactionManagerMiddleware.WinterFlowRouterStructure(winterFlowResolverLibrary);
            if (WinterFlowRouterStructure == null) {
                winterFlowResolverLibrary.WinterFlowCompilerDataSource(1512740606);
                WinterFlowRouterStructure = WinterFlowHandlerArray.WinterFlowRouterStructure(winterFlowResolverLibrary);
            } else {
                winterFlowResolverLibrary.WinterFlowCompilerDataSource(1512737723);
            }
            winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
            if (WinterFlowRouterStructure == null) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean WinterFlowVariableVersionControl2 = winterFlowResolverLibrary.WinterFlowVariableVersionControl(WinterFlowRouterStructure);
            Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            Object obj = WinterFlowModuleModule.WinterFlowRouterStructure;
            if (WinterFlowVariableVersionControl2 || WinterFlowSyntaxSubsystem == obj) {
                WinterFlowSingletonPlatform winterFlowSingletonPlatform = WinterFlowRouterStructure instanceof WinterFlowSingletonPlatform ? (WinterFlowSingletonPlatform) WinterFlowRouterStructure : null;
                WinterFlowStackProvider WinterFlowCacheManagerAgent = winterFlowSingletonPlatform != null ? winterFlowSingletonPlatform.WinterFlowCacheManagerAgent() : null;
                WinterFlowArrayDeserialization winterFlowArrayDeserialization = WinterFlowRouterStructure instanceof WinterFlowArrayDeserialization ? (WinterFlowArrayDeserialization) WinterFlowRouterStructure : null;
                WinterFlowSyntaxSubsystem = new WinterFlowIDEOrchestration(WinterFlowCacheManagerAgent, winterFlowArrayDeserialization != null ? winterFlowArrayDeserialization.WinterFlowRouterStructure() : null);
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
            }
            Object obj2 = (WinterFlowIDEOrchestration) WinterFlowSyntaxSubsystem;
            Object WinterFlowSyntaxSubsystem2 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            if (WinterFlowSyntaxSubsystem2 == obj) {
                WinterFlowSyntaxSubsystem2 = WinterFlowSoftwareException.WinterFlowConsumerUserManager(winterFlowResolverLibrary);
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem2);
            }
            WinterFlowAdapterResponse winterFlowAdapterResponse = (WinterFlowAdapterResponse) WinterFlowSyntaxSubsystem2;
            long j = winterFlowResolverLibrary.WinterFlowConfiguration;
            boolean WinterFlowVariableVersionControl3 = winterFlowResolverLibrary.WinterFlowVariableVersionControl(obj2) | winterFlowResolverLibrary.WinterFlowArrayNetwork(j);
            Object WinterFlowSyntaxSubsystem3 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            if (WinterFlowVariableVersionControl3 || WinterFlowSyntaxSubsystem3 == obj) {
                WinterFlowSyntaxSubsystem3 = new WinterFlowDataSourceResolver(winterFlowAdapterResponse, new WinterFlowProviderHook(j, WinterFlowRouterStructure));
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem3);
            }
            final WinterFlowDataSourceResolver winterFlowDataSourceResolver = (WinterFlowDataSourceResolver) WinterFlowSyntaxSubsystem3;
            winterFlowResolverLibrary.WinterFlowCompilerDataSource(-348514256);
            boolean WinterFlowUnitTestResponse = winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowDataSourceResolver) | winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowEventEvent);
            Object WinterFlowSyntaxSubsystem4 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            if (WinterFlowUnitTestResponse || WinterFlowSyntaxSubsystem4 == obj) {
                WinterFlowSyntaxSubsystem4 = new WinterFlowRepositoryLayer(8, winterFlowDataSourceResolver, winterFlowEventEvent);
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem4);
            }
            WinterFlowSoftwareException.WinterFlowTransactionAgent((WinterFlowObjectUI) WinterFlowSyntaxSubsystem4, winterFlowResolverLibrary);
            int i3 = i2;
            Boolean valueOf = Boolean.valueOf(z);
            int i4 = i3 & 14;
            boolean WinterFlowUnitTestResponse2 = winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowDataSourceResolver) | (i4 == 4);
            Object WinterFlowSyntaxSubsystem5 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            if (WinterFlowUnitTestResponse2 || WinterFlowSyntaxSubsystem5 == obj) {
                WinterFlowSyntaxSubsystem5 = new WinterFlowObjectSession() { // from class: com.google.android.datatransport.WinterFlowRequestQueue
                    @Override // com.google.android.datatransport.WinterFlowObjectSession
                    public final Object WinterFlowUnitTestResponse(Object obj3) {
                        WinterFlowDataSourceResolver winterFlowDataSourceResolver2 = WinterFlowDataSourceResolver.this;
                        winterFlowDataSourceResolver2.WinterFlowResponseEngine(z);
                        return new WinterFlowMapperFramework((WinterFlowNetworkStrategy) obj3, winterFlowDataSourceResolver2, 1);
                    }
                };
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem5);
            }
            WinterFlowSoftwareException.WinterFlowTransactionManagerStrategy(valueOf, winterFlowDataSourceResolver, null, (WinterFlowObjectSession) WinterFlowSyntaxSubsystem5, winterFlowResolverLibrary, i4);
            boolean WinterFlowUnitTestResponse3 = winterFlowResolverLibrary.WinterFlowUnitTestResponse(obj2) | winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowDataSourceResolver);
            Object WinterFlowSyntaxSubsystem6 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            if (WinterFlowUnitTestResponse3 || WinterFlowSyntaxSubsystem6 == obj) {
                WinterFlowSyntaxSubsystem6 = new WinterFlowRouterCompiler(25, obj2, winterFlowDataSourceResolver);
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem6);
            }
            WinterFlowSoftwareException.WinterFlowCacheManagerAgent(obj2, winterFlowDataSourceResolver, (WinterFlowObjectSession) WinterFlowSyntaxSubsystem6, winterFlowResolverLibrary);
            winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
        } else {
            winterFlowResolverLibrary.WinterFlowQueueService();
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread = winterFlowResolverLibrary.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread != null) {
            WinterFlowConcurrencyThread.WinterFlowArrayNetwork = new WinterFlowEventEvent() { // from class: com.google.android.datatransport.WinterFlowDebugProvider
                @Override // com.google.android.datatransport.WinterFlowEventEvent
                public final Object WinterFlowVariableVersionControl(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int WinterFlowResponseEngine = WinterFlowConfigurationException.WinterFlowResponseEngine(i | 1);
                    WinterFlowHookProcessor.WinterFlowRouterStructure(z, winterFlowEventEvent, (WinterFlowResolverLibrary) obj3, WinterFlowResponseEngine);
                    return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                }
            };
        }
    }

    public static String WinterFlowSerializerStructure(String str, Object... objArr) {
        int length;
        int indexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (indexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, indexOf);
            sb.append(WinterFlowMapperProtocol(objArr[i]));
            i2 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(WinterFlowMapperProtocol(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static final long WinterFlowServerProtocol(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static boolean WinterFlowServiceUtility(byte b) {
        return b > -65;
    }

    public static final void WinterFlowSingletonPlatform(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(WinterFlowInvokerComponent.WinterFlowConfiguration(j)), i, i2, 33);
        }
    }

    public static WinterFlowExceptionParser WinterFlowSyntax(Exception exc) {
        WinterFlowExceptionParser winterFlowExceptionParser = new WinterFlowExceptionParser();
        winterFlowExceptionParser.WinterFlowResponseEngine(exc);
        return winterFlowExceptionParser;
    }

    public static boolean WinterFlowThreadListener() {
        if (Build.VERSION.SDK_INT >= 29) {
            return WinterFlowManagerInterface.WinterFlowRouterStructure();
        }
        try {
            Method method = WinterFlowTransactionManagerStrategy;
            if (method == null) {
                WinterFlowVariableVersionControl = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                method = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                WinterFlowTransactionManagerStrategy = method;
            }
            return ((Boolean) method.invoke(null, Long.valueOf(WinterFlowVariableVersionControl))).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                return false;
            }
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static final WinterFlowDecoratorVersion WinterFlowTransactionAgent(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            WinterFlowDecoratorVersion winterFlowDecoratorVersion = tag instanceof WinterFlowDecoratorVersion ? (WinterFlowDecoratorVersion) tag : null;
            if (winterFlowDecoratorVersion != null) {
                return winterFlowDecoratorVersion;
            }
            Object WinterFlowCacheManagerAgent = WinterFlowProtocolNetwork.WinterFlowCacheManagerAgent(view);
            view = WinterFlowCacheManagerAgent instanceof View ? (View) WinterFlowCacheManagerAgent : null;
        }
        return null;
    }

    public static void WinterFlowTransactionManagerStrategy(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static WinterFlowExceptionParser WinterFlowUnitTestResponse(Executor executor, Callable callable) {
        WinterFlowUnitTestLibrary.WinterFlowSingletonPlatform(executor, "Executor must not be null");
        WinterFlowExceptionParser winterFlowExceptionParser = new WinterFlowExceptionParser();
        executor.execute(new WinterFlowProtocolThread(11, winterFlowExceptionParser, callable, false));
        return winterFlowExceptionParser;
    }

    public static final void WinterFlowVariableBandwidth(Spannable spannable, long j, WinterFlowConcurrencyParser winterFlowConcurrencyParser, int i, int i2) {
        long WinterFlowHookDataSource = WinterFlowOrchestrationPlatform.WinterFlowHookDataSource(j);
        if (WinterFlowInheritanceValidator.WinterFlowRouterStructure(WinterFlowHookDataSource, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(WinterFlowCloudStack.WinterFlowFrontendBackend(winterFlowConcurrencyParser.WinterFlowValidatorHandler(j)), false), i, i2, 33);
        } else if (WinterFlowInheritanceValidator.WinterFlowRouterStructure(WinterFlowHookDataSource, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(WinterFlowOrchestrationPlatform.WinterFlowCacheManagerAgent(j)), i, i2, 33);
        }
    }

    public static Object WinterFlowVariableVersionControl(WinterFlowExceptionParser winterFlowExceptionParser, long j) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Must not be called on the main application thread");
            return null;
        }
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && Objects.equals(myLooper.getThread().getName(), "GoogleApiHandler")) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        WinterFlowUnitTestLibrary.WinterFlowSingletonPlatform(winterFlowExceptionParser, "Task must not be null");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        WinterFlowUnitTestLibrary.WinterFlowSingletonPlatform(timeUnit, "TimeUnit must not be null");
        if (winterFlowExceptionParser.WinterFlowUnitTestResponse()) {
            return WinterFlowRouterAdapter(winterFlowExceptionParser);
        }
        WinterFlowCompilerAlgorithm winterFlowCompilerAlgorithm = new WinterFlowCompilerAlgorithm();
        Executor executor = WinterFlowCacheHandler.WinterFlowHookDataSource;
        winterFlowExceptionParser.WinterFlowHookDataSource(executor, winterFlowCompilerAlgorithm);
        WinterFlowProtocolMechanism winterFlowProtocolMechanism = new WinterFlowProtocolMechanism(executor, (WinterFlowMicroserviceMiddleware) winterFlowCompilerAlgorithm);
        WinterFlowCacheModule winterFlowCacheModule = winterFlowExceptionParser.WinterFlowHookDataSource;
        winterFlowCacheModule.WinterFlowHookDataSource(winterFlowProtocolMechanism);
        winterFlowExceptionParser.WinterFlowThreadListener();
        winterFlowCacheModule.WinterFlowHookDataSource(new WinterFlowProtocolMechanism(executor, (WinterFlowTransactionDeserialization) winterFlowCompilerAlgorithm));
        winterFlowExceptionParser.WinterFlowThreadListener();
        if (winterFlowCompilerAlgorithm.WinterFlowVariableVersionControl.await(j, timeUnit)) {
            return WinterFlowRouterAdapter(winterFlowExceptionParser);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }
}
