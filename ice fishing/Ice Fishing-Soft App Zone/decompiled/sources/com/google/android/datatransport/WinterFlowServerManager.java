package com.google.android.datatransport;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import com.adjust.sdk.Constants;
import com.android.installreferrer.api.InstallReferrerClient;
import com.icewinter.flow.winter.icecatch.R;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowServerManager {
    public static final WinterFlowVariableSubsystem WinterFlowRouterStructure = new WinterFlowVariableSubsystem(Float.POSITIVE_INFINITY);
    public static final WinterFlowTestingSyntax WinterFlowHookDataSource = new WinterFlowTestingSyntax(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final WinterFlowDecoratorScript WinterFlowCacheManagerAgent = new WinterFlowDecoratorScript(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final WinterFlowWebsocketHelper WinterFlowArrayNetwork = new WinterFlowWebsocketHelper(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final WinterFlowVariableSubsystem WinterFlowVariableVersionControl = new WinterFlowVariableSubsystem(Float.NEGATIVE_INFINITY);
    public static final WinterFlowTestingSyntax WinterFlowTransactionManagerStrategy = new WinterFlowTestingSyntax(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final WinterFlowDecoratorScript WinterFlowUnitTestResponse = new WinterFlowDecoratorScript(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final WinterFlowWebsocketHelper WinterFlowRouterRouter = new WinterFlowWebsocketHelper(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final WinterFlowJSONDecorator WinterFlowSyntax = new WinterFlowJSONDecorator(25, "RESUME_TOKEN");
    public static final WinterFlowClassSystem WinterFlowResponseEngine = new WinterFlowClassSystem(7);
    public static final WinterFlowWidgetModule WinterFlowTransactionAgent = new WinterFlowWidgetModule();
    public static final Object WinterFlowServerProtocol = new Object();
    public static final WinterFlowResolverFramework WinterFlowThreadListener = new WinterFlowResolverFramework();

    public static byte[] WinterFlowArrayHelper(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read < 0) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter(WinterFlowResolverBackend.WinterFlowSyntax("Not enough bytes to read: ", i));
                return null;
            }
            i2 += read;
        }
        return bArr;
    }

    public static final void WinterFlowArrayNetwork(final WinterFlowObjectUI winterFlowObjectUI, final WinterFlowMapperManager winterFlowMapperManager, final WinterFlowStrategyService winterFlowStrategyService, final WinterFlowXMLLayer winterFlowXMLLayer, WinterFlowResolverLibrary winterFlowResolverLibrary, final int i) {
        winterFlowResolverLibrary.WinterFlowFrameworkTransaction(1055276397);
        int i2 = (winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowObjectUI) ? 4 : 2) | i | (winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowMapperManager) ? 32 : 16) | (winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowStrategyService) ? 256 : 128) | (winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowXMLLayer) ? 2048 : 1024);
        if (winterFlowResolverLibrary.WinterFlowFrontendBackend(i2 & 1, (i2 & 1171) != 1170)) {
            final WinterFlowThreadPoolGateway WinterFlowBackendCacheManager = WinterFlowDecoratorUI.WinterFlowBackendCacheManager(winterFlowObjectUI, winterFlowResolverLibrary);
            WinterFlowTestingCloud.WinterFlowHookDataSource(WinterFlowManagerRequest.WinterFlowSyntaxSubsystem(-933153643, new WinterFlowControllerScript() { // from class: com.google.android.datatransport.WinterFlowSingletonHelper
                @Override // com.google.android.datatransport.WinterFlowControllerScript
                public final Object WinterFlowArrayNetwork(Object obj, Object obj2, Object obj3) {
                    WinterFlowMapperManager WinterFlowCacheManagerAgent2;
                    WinterFlowRefactoringServer winterFlowRefactoringServer = (WinterFlowRefactoringServer) obj;
                    WinterFlowResolverLibrary winterFlowResolverLibrary2 = (WinterFlowResolverLibrary) obj2;
                    ((Integer) obj3).getClass();
                    Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary2.WinterFlowSyntaxSubsystem();
                    Object obj4 = WinterFlowModuleModule.WinterFlowRouterStructure;
                    if (WinterFlowSyntaxSubsystem == obj4) {
                        WinterFlowSyntaxSubsystem = new WinterFlowRouterManager(winterFlowRefactoringServer, new WinterFlowCloudFrontend(WinterFlowBackendCacheManager, 0));
                        winterFlowResolverLibrary2.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
                    }
                    WinterFlowRouterManager winterFlowRouterManager = (WinterFlowRouterManager) WinterFlowSyntaxSubsystem;
                    Object WinterFlowSyntaxSubsystem2 = winterFlowResolverLibrary2.WinterFlowSyntaxSubsystem();
                    if (WinterFlowSyntaxSubsystem2 == obj4) {
                        WinterFlowSyntaxSubsystem2 = new WinterFlowLibraryAgent(new WinterFlowAlgorithmArray(winterFlowRouterManager));
                        winterFlowResolverLibrary2.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem2);
                    }
                    WinterFlowLibraryAgent winterFlowLibraryAgent = (WinterFlowLibraryAgent) WinterFlowSyntaxSubsystem2;
                    WinterFlowStrategyService winterFlowStrategyService2 = WinterFlowStrategyService.this;
                    if (winterFlowStrategyService2 != null) {
                        winterFlowResolverLibrary2.WinterFlowCompilerDataSource(1743490539);
                        winterFlowResolverLibrary2.WinterFlowCompilerDataSource(887527095);
                        Object obj5 = WinterFlowNetworkInheritance.WinterFlowRouterStructure;
                        if (obj5 != null) {
                            winterFlowResolverLibrary2.WinterFlowCompilerDataSource(1345554384);
                        } else {
                            winterFlowResolverLibrary2.WinterFlowCompilerDataSource(1345603457);
                            View view = (View) winterFlowResolverLibrary2.WinterFlowSyntax(WinterFlowUnitTestProvider.WinterFlowTransactionManagerStrategy);
                            boolean WinterFlowVariableVersionControl2 = winterFlowResolverLibrary2.WinterFlowVariableVersionControl(view);
                            Object WinterFlowSyntaxSubsystem3 = winterFlowResolverLibrary2.WinterFlowSyntaxSubsystem();
                            if (WinterFlowVariableVersionControl2 || WinterFlowSyntaxSubsystem3 == obj4) {
                                Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                                WinterFlowSyntaxSubsystem3 = tag instanceof WinterFlowProviderConcurrency ? (WinterFlowProviderConcurrency) tag : null;
                                if (WinterFlowSyntaxSubsystem3 == null) {
                                    WinterFlowSyntaxSubsystem3 = new WinterFlowSessionInheritance(view);
                                    view.setTag(R.id.compose_prefetch_scheduler, WinterFlowSyntaxSubsystem3);
                                }
                                winterFlowResolverLibrary2.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem3);
                            }
                            obj5 = (WinterFlowProviderConcurrency) WinterFlowSyntaxSubsystem3;
                        }
                        winterFlowResolverLibrary2.WinterFlowBandwidthObject(false);
                        Object obj6 = obj5;
                        winterFlowResolverLibrary2.WinterFlowBandwidthObject(false);
                        Object[] objArr = {winterFlowStrategyService2, winterFlowRouterManager, winterFlowLibraryAgent, obj6};
                        boolean WinterFlowVariableVersionControl3 = winterFlowResolverLibrary2.WinterFlowVariableVersionControl(winterFlowStrategyService2) | winterFlowResolverLibrary2.WinterFlowUnitTestResponse(winterFlowRouterManager) | winterFlowResolverLibrary2.WinterFlowUnitTestResponse(winterFlowLibraryAgent) | winterFlowResolverLibrary2.WinterFlowUnitTestResponse(obj6);
                        Object WinterFlowSyntaxSubsystem4 = winterFlowResolverLibrary2.WinterFlowSyntaxSubsystem();
                        if (WinterFlowVariableVersionControl3 || WinterFlowSyntaxSubsystem4 == obj4) {
                            WinterFlowSyntaxSubsystem4 = new WinterFlowRequestPipeline(winterFlowStrategyService2, winterFlowRouterManager, winterFlowLibraryAgent, obj6, 3);
                            winterFlowResolverLibrary2.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem4);
                        }
                        WinterFlowObjectSession winterFlowObjectSession = (WinterFlowObjectSession) WinterFlowSyntaxSubsystem4;
                        boolean z = false;
                        for (Object obj7 : Arrays.copyOf(objArr, 4)) {
                            z |= winterFlowResolverLibrary2.WinterFlowVariableVersionControl(obj7);
                        }
                        Object WinterFlowSyntaxSubsystem5 = winterFlowResolverLibrary2.WinterFlowSyntaxSubsystem();
                        if (z || WinterFlowSyntaxSubsystem5 == obj4) {
                            winterFlowResolverLibrary2.WinterFlowArrayFramework(new WinterFlowDatabaseSchemaMicroservice(winterFlowObjectSession));
                        }
                        winterFlowResolverLibrary2.WinterFlowBandwidthObject(false);
                    } else {
                        winterFlowResolverLibrary2.WinterFlowCompilerDataSource(1744076749);
                        winterFlowResolverLibrary2.WinterFlowBandwidthObject(false);
                    }
                    int i3 = WinterFlowStackDebug.WinterFlowRouterStructure;
                    WinterFlowMapperManager winterFlowMapperManager2 = winterFlowMapperManager;
                    if (winterFlowStrategyService2 != null && (WinterFlowCacheManagerAgent2 = winterFlowMapperManager2.WinterFlowCacheManagerAgent(new WinterFlowHandlerDatabaseSchema(winterFlowStrategyService2))) != null) {
                        winterFlowMapperManager2 = WinterFlowCacheManagerAgent2;
                    }
                    boolean WinterFlowVariableVersionControl4 = winterFlowResolverLibrary2.WinterFlowVariableVersionControl(winterFlowRouterManager);
                    Object obj8 = winterFlowXMLLayer;
                    boolean WinterFlowVariableVersionControl5 = WinterFlowVariableVersionControl4 | winterFlowResolverLibrary2.WinterFlowVariableVersionControl(obj8);
                    Object WinterFlowSyntaxSubsystem6 = winterFlowResolverLibrary2.WinterFlowSyntaxSubsystem();
                    if (WinterFlowVariableVersionControl5 || WinterFlowSyntaxSubsystem6 == obj4) {
                        WinterFlowSyntaxSubsystem6 = new WinterFlowAPIVersionControl(6, winterFlowRouterManager, obj8);
                        winterFlowResolverLibrary2.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem6);
                    }
                    WinterFlowUnitTestLibrary.WinterFlowUnitTestResponse(winterFlowLibraryAgent, winterFlowMapperManager2, (WinterFlowEventEvent) WinterFlowSyntaxSubsystem6, winterFlowResolverLibrary2, 8);
                    return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                }
            }, winterFlowResolverLibrary), winterFlowResolverLibrary, 6);
        } else {
            winterFlowResolverLibrary.WinterFlowQueueService();
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread = winterFlowResolverLibrary.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread != null) {
            WinterFlowConcurrencyThread.WinterFlowArrayNetwork = new WinterFlowEventEvent(winterFlowMapperManager, winterFlowStrategyService, winterFlowXMLLayer, i) { // from class: com.google.android.datatransport.WinterFlowQueryFrontend
                public final /* synthetic */ WinterFlowXMLLayer WinterFlowRouterRouter;
                public final /* synthetic */ WinterFlowMapperManager WinterFlowTransactionManagerStrategy;
                public final /* synthetic */ WinterFlowStrategyService WinterFlowUnitTestResponse;

                @Override // com.google.android.datatransport.WinterFlowEventEvent
                public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int WinterFlowResponseEngine2 = WinterFlowConfigurationException.WinterFlowResponseEngine(1);
                    WinterFlowServerManager.WinterFlowArrayNetwork(WinterFlowObjectUI.this, this.WinterFlowTransactionManagerStrategy, this.WinterFlowUnitTestResponse, this.WinterFlowRouterRouter, (WinterFlowResolverLibrary) obj, WinterFlowResponseEngine2);
                    return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                }
            };
        }
    }

    public static WinterFlowMapperManager WinterFlowBackendCacheManager(WinterFlowMapperManager winterFlowMapperManager, WinterFlowSoftwareSubsystem winterFlowSoftwareSubsystem, WinterFlowStackNode winterFlowStackNode, float f, int i) {
        WinterFlowInvokerConsumer winterFlowInvokerConsumer = WinterFlowCacheUtility.WinterFlowTransactionAgent;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        return winterFlowMapperManager.WinterFlowCacheManagerAgent(new WinterFlowPackageValidator(winterFlowSoftwareSubsystem, winterFlowInvokerConsumer, winterFlowStackNode, f, null));
    }

    public static void WinterFlowBandwidthObject(String str, String str2, Object obj) {
        if (Log.isLoggable("TRuntime.".concat(str), 3)) {
            String.format(str2, obj);
        }
    }

    public static Object WinterFlowBatchUI(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 34) {
            return WinterFlowBackendThreadPool.WinterFlowHookDataSource(bundle, str);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (WinterFlowScriptVersion.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static final long WinterFlowCacheManagerAgent(int i) {
        long j = i << 32;
        int i2 = WinterFlowUserManagerDatabaseSchema.WinterFlowOrchestrationSubsystem;
        return j;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static String WinterFlowCacheManagerListener(String str) {
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -2061550653:
                if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "Char";
                }
                return null;
            case 3327612:
                if (str.equals(Constants.LONG)) {
                    return "Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "Long";
                }
                return null;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "Companion";
                }
                return null;
            default:
                switch (hashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (hashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (hashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static void WinterFlowCompilerHandler(ByteArrayOutputStream byteArrayOutputStream, int i) {
        WinterFlowTestingNode(byteArrayOutputStream, i, 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] WinterFlowCompilerVariable(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int i4 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i4 += inflater.inflate(bArr, i4, i2 - i4);
                    i3 += read;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } finally {
            inflater.end();
        }
    }

    public static final boolean WinterFlowConcurrencyThread(long j, long j2) {
        return j == j2;
    }

    public static long WinterFlowConfigurationSubsystem(InputStream inputStream, int i) {
        byte[] WinterFlowArrayHelper = WinterFlowArrayHelper(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += (WinterFlowArrayHelper[i2] & 255) << (i2 * 8);
        }
        return j;
    }

    public static final boolean WinterFlowConsumerUserManager(WinterFlowPackageResolver winterFlowPackageResolver, WinterFlowObjectSession winterFlowObjectSession) {
        int i;
        WinterFlowParserThread winterFlowParserThread;
        Object WinterFlowUnitTestResponse2;
        WinterFlowJSONModule WinterFlowRouterRouter2;
        boolean WinterFlowRouterRouter3;
        do {
            synchronized (WinterFlowServerProtocol) {
                WinterFlowSyntaxJava winterFlowSyntaxJava = winterFlowPackageResolver.WinterFlowVariableVersionControl;
                winterFlowSyntaxJava.getClass();
                WinterFlowSyntaxJava winterFlowSyntaxJava2 = (WinterFlowSyntaxJava) WinterFlowVersionProtocol.WinterFlowTransactionManagerStrategy(winterFlowSyntaxJava);
                i = winterFlowSyntaxJava2.WinterFlowArrayNetwork;
                winterFlowParserThread = winterFlowSyntaxJava2.WinterFlowCacheManagerAgent;
            }
            winterFlowParserThread.getClass();
            WinterFlowDataSourceController WinterFlowTransactionManagerStrategy2 = winterFlowParserThread.WinterFlowTransactionManagerStrategy();
            WinterFlowUnitTestResponse2 = winterFlowObjectSession.WinterFlowUnitTestResponse(WinterFlowTransactionManagerStrategy2);
            WinterFlowParserThread WinterFlowArrayNetwork2 = WinterFlowTransactionManagerStrategy2.WinterFlowArrayNetwork();
            if (WinterFlowManagerRequest.WinterFlowThreadListener(WinterFlowArrayNetwork2, winterFlowParserThread)) {
                break;
            }
            WinterFlowSyntaxJava winterFlowSyntaxJava3 = winterFlowPackageResolver.WinterFlowVariableVersionControl;
            winterFlowSyntaxJava3.getClass();
            synchronized (WinterFlowVersionProtocol.WinterFlowCacheManagerAgent) {
                WinterFlowRouterRouter2 = WinterFlowVersionProtocol.WinterFlowRouterRouter();
                WinterFlowRouterRouter3 = WinterFlowRouterRouter((WinterFlowSyntaxJava) WinterFlowVersionProtocol.WinterFlowMapperProtocol(winterFlowSyntaxJava3, winterFlowPackageResolver, WinterFlowRouterRouter2), i, WinterFlowArrayNetwork2, true);
            }
            WinterFlowVersionProtocol.WinterFlowServerProtocol(WinterFlowRouterRouter2, winterFlowPackageResolver);
        } while (!WinterFlowRouterRouter3);
        return ((Boolean) WinterFlowUnitTestResponse2).booleanValue();
    }

    public static final void WinterFlowEventEmitterController(WinterFlowServiceProviderListener winterFlowServiceProviderListener, WinterFlowProcessorConsumer winterFlowProcessorConsumer, int i) {
        while (true) {
            int i2 = winterFlowServiceProviderListener.WinterFlowSerializerStructure;
            if (i > i2 && i < winterFlowServiceProviderListener.WinterFlowRouterAdapter) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            winterFlowServiceProviderListener.WinterFlowTestingNode();
            if (winterFlowServiceProviderListener.WinterFlowResolverController(winterFlowServiceProviderListener.WinterFlowSerializerStructure)) {
                winterFlowProcessorConsumer.WinterFlowServiceUtility();
            }
            winterFlowServiceProviderListener.WinterFlowSyntax();
        }
    }

    public static final void WinterFlowHookDataSource(boolean z, WinterFlowObjectUI winterFlowObjectUI, WinterFlowResolverLibrary winterFlowResolverLibrary, int i) {
        winterFlowResolverLibrary.WinterFlowFrameworkTransaction(-361453782);
        int i2 = i | 6 | (winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowObjectUI) ? 32 : 16);
        int i3 = 0;
        if (winterFlowResolverLibrary.WinterFlowFrontendBackend(i2 & 1, (i2 & 19) != 18)) {
            Object WinterFlowRouterStructure2 = WinterFlowTransactionManagerMiddleware.WinterFlowRouterStructure(winterFlowResolverLibrary);
            if (WinterFlowRouterStructure2 == null) {
                winterFlowResolverLibrary.WinterFlowCompilerDataSource(535274673);
                WinterFlowRouterStructure2 = WinterFlowHandlerArray.WinterFlowRouterStructure(winterFlowResolverLibrary);
            } else {
                winterFlowResolverLibrary.WinterFlowCompilerDataSource(535271790);
            }
            winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
            if (WinterFlowRouterStructure2 == null) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean WinterFlowVariableVersionControl2 = winterFlowResolverLibrary.WinterFlowVariableVersionControl(WinterFlowRouterStructure2);
            Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            Object obj = WinterFlowModuleModule.WinterFlowRouterStructure;
            if (WinterFlowVariableVersionControl2 || WinterFlowSyntaxSubsystem == obj) {
                WinterFlowSingletonPlatform winterFlowSingletonPlatform = WinterFlowRouterStructure2 instanceof WinterFlowSingletonPlatform ? (WinterFlowSingletonPlatform) WinterFlowRouterStructure2 : null;
                WinterFlowStackProvider WinterFlowCacheManagerAgent2 = winterFlowSingletonPlatform != null ? winterFlowSingletonPlatform.WinterFlowCacheManagerAgent() : null;
                WinterFlowArrayDeserialization winterFlowArrayDeserialization = WinterFlowRouterStructure2 instanceof WinterFlowArrayDeserialization ? (WinterFlowArrayDeserialization) WinterFlowRouterStructure2 : null;
                WinterFlowSyntaxSubsystem = new WinterFlowIDEOrchestration(WinterFlowCacheManagerAgent2, winterFlowArrayDeserialization != null ? winterFlowArrayDeserialization.WinterFlowRouterStructure() : null);
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
            }
            Object obj2 = (WinterFlowIDEOrchestration) WinterFlowSyntaxSubsystem;
            long j = winterFlowResolverLibrary.WinterFlowConfiguration;
            boolean WinterFlowVariableVersionControl3 = winterFlowResolverLibrary.WinterFlowVariableVersionControl(obj2) | winterFlowResolverLibrary.WinterFlowArrayNetwork(j);
            Object WinterFlowSyntaxSubsystem2 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            Object obj3 = WinterFlowSyntaxSubsystem2;
            if (WinterFlowVariableVersionControl3 || WinterFlowSyntaxSubsystem2 == obj) {
                WinterFlowUnitTestRefactoring winterFlowUnitTestRefactoring = new WinterFlowUnitTestRefactoring(new WinterFlowUnitTestMechanism(j, WinterFlowRouterStructure2));
                winterFlowUnitTestRefactoring.WinterFlowCacheManagerAgent = new WinterFlowDeploymentEngine(4);
                winterFlowResolverLibrary.WinterFlowArrayFramework(winterFlowUnitTestRefactoring);
                obj3 = winterFlowUnitTestRefactoring;
            }
            Object obj4 = (WinterFlowUnitTestRefactoring) obj3;
            winterFlowResolverLibrary.WinterFlowCompilerDataSource(-585307852);
            boolean WinterFlowUnitTestResponse2 = winterFlowResolverLibrary.WinterFlowUnitTestResponse(obj4) | ((i2 & 112) == 32);
            Object WinterFlowSyntaxSubsystem3 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            if (WinterFlowUnitTestResponse2 || WinterFlowSyntaxSubsystem3 == obj) {
                WinterFlowSyntaxSubsystem3 = new WinterFlowRepositoryLayer(i3, obj4, winterFlowObjectUI);
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem3);
            }
            WinterFlowSoftwareException.WinterFlowTransactionAgent((WinterFlowObjectUI) WinterFlowSyntaxSubsystem3, winterFlowResolverLibrary);
            boolean WinterFlowUnitTestResponse3 = winterFlowResolverLibrary.WinterFlowUnitTestResponse(obj4);
            Object WinterFlowSyntaxSubsystem4 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            if (WinterFlowUnitTestResponse3 || WinterFlowSyntaxSubsystem4 == obj) {
                WinterFlowSyntaxSubsystem4 = new WinterFlowCompilerCloud(2, obj4);
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem4);
            }
            WinterFlowSoftwareException.WinterFlowTransactionManagerStrategy(true, obj4, null, (WinterFlowObjectSession) WinterFlowSyntaxSubsystem4, winterFlowResolverLibrary, 6);
            boolean WinterFlowUnitTestResponse4 = winterFlowResolverLibrary.WinterFlowUnitTestResponse(obj2) | winterFlowResolverLibrary.WinterFlowUnitTestResponse(obj4);
            Object WinterFlowSyntaxSubsystem5 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            if (WinterFlowUnitTestResponse4 || WinterFlowSyntaxSubsystem5 == obj) {
                WinterFlowSyntaxSubsystem5 = new WinterFlowRouterCompiler(3, obj2, obj4);
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem5);
            }
            WinterFlowSoftwareException.WinterFlowCacheManagerAgent(obj2, obj4, (WinterFlowObjectSession) WinterFlowSyntaxSubsystem5, winterFlowResolverLibrary);
            winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
            z = true;
        } else {
            winterFlowResolverLibrary.WinterFlowQueueService();
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread = winterFlowResolverLibrary.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread != null) {
            WinterFlowConcurrencyThread.WinterFlowArrayNetwork = new WinterFlowExceptionThreadPool(z, winterFlowObjectUI, i, i3);
        }
    }

    public static String WinterFlowMapperProtocol(String str) {
        return "TRuntime.".concat(str);
    }

    public static final WinterFlowEventProvider WinterFlowOrchestrationSubsystem(WinterFlowEventProvider winterFlowEventProvider) {
        return winterFlowEventProvider instanceof WinterFlowHookView ? winterFlowEventProvider : winterFlowEventProvider instanceof WinterFlowScriptInterface ? winterFlowEventProvider : new WinterFlowScriptInterface(winterFlowEventProvider);
    }

    public static final BlendMode WinterFlowPackageIDE(int i) {
        BlendMode blendMode;
        BlendMode blendMode2;
        BlendMode blendMode3;
        BlendMode blendMode4;
        BlendMode blendMode5;
        BlendMode blendMode6;
        BlendMode blendMode7;
        BlendMode blendMode8;
        BlendMode blendMode9;
        BlendMode blendMode10;
        BlendMode blendMode11;
        BlendMode blendMode12;
        BlendMode blendMode13;
        BlendMode blendMode14;
        BlendMode blendMode15;
        BlendMode blendMode16;
        BlendMode blendMode17;
        BlendMode blendMode18;
        BlendMode blendMode19;
        BlendMode blendMode20;
        BlendMode blendMode21;
        BlendMode blendMode22;
        BlendMode blendMode23;
        BlendMode blendMode24;
        BlendMode blendMode25;
        BlendMode blendMode26;
        BlendMode blendMode27;
        BlendMode blendMode28;
        BlendMode blendMode29;
        BlendMode blendMode30;
        if (i == 0) {
            blendMode30 = BlendMode.CLEAR;
            return blendMode30;
        }
        if (i == 1) {
            blendMode29 = BlendMode.SRC;
            return blendMode29;
        }
        if (i == 2) {
            blendMode28 = BlendMode.DST;
            return blendMode28;
        }
        if (i == 3) {
            blendMode27 = BlendMode.SRC_OVER;
            return blendMode27;
        }
        if (i == 4) {
            blendMode26 = BlendMode.DST_OVER;
            return blendMode26;
        }
        if (i == 5) {
            blendMode25 = BlendMode.SRC_IN;
            return blendMode25;
        }
        if (i == 6) {
            blendMode24 = BlendMode.DST_IN;
            return blendMode24;
        }
        if (i == 7) {
            blendMode23 = BlendMode.SRC_OUT;
            return blendMode23;
        }
        if (i == 8) {
            blendMode22 = BlendMode.DST_OUT;
            return blendMode22;
        }
        if (i == 9) {
            blendMode21 = BlendMode.SRC_ATOP;
            return blendMode21;
        }
        if (i == 10) {
            blendMode20 = BlendMode.DST_ATOP;
            return blendMode20;
        }
        if (i == 11) {
            blendMode19 = BlendMode.XOR;
            return blendMode19;
        }
        if (i == 12) {
            blendMode18 = BlendMode.PLUS;
            return blendMode18;
        }
        if (i == 13) {
            blendMode17 = BlendMode.MODULATE;
            return blendMode17;
        }
        if (i == 14) {
            blendMode16 = BlendMode.SCREEN;
            return blendMode16;
        }
        if (i == 15) {
            blendMode15 = BlendMode.OVERLAY;
            return blendMode15;
        }
        if (i == 16) {
            blendMode14 = BlendMode.DARKEN;
            return blendMode14;
        }
        if (i == 17) {
            blendMode13 = BlendMode.LIGHTEN;
            return blendMode13;
        }
        if (i == 18) {
            blendMode12 = BlendMode.COLOR_DODGE;
            return blendMode12;
        }
        if (i == 19) {
            blendMode11 = BlendMode.COLOR_BURN;
            return blendMode11;
        }
        if (i == 20) {
            blendMode10 = BlendMode.HARD_LIGHT;
            return blendMode10;
        }
        if (i == 21) {
            blendMode9 = BlendMode.SOFT_LIGHT;
            return blendMode9;
        }
        if (i == 22) {
            blendMode8 = BlendMode.DIFFERENCE;
            return blendMode8;
        }
        if (i == 23) {
            blendMode7 = BlendMode.EXCLUSION;
            return blendMode7;
        }
        if (i == 24) {
            blendMode6 = BlendMode.MULTIPLY;
            return blendMode6;
        }
        if (i == 25) {
            blendMode5 = BlendMode.HUE;
            return blendMode5;
        }
        if (i == 26) {
            blendMode4 = BlendMode.SATURATION;
            return blendMode4;
        }
        if (i == 27) {
            blendMode3 = BlendMode.COLOR;
            return blendMode3;
        }
        if (i == 28) {
            blendMode2 = BlendMode.LUMINOSITY;
            return blendMode2;
        }
        blendMode = BlendMode.SRC_OVER;
        return blendMode;
    }

    public static final WinterFlowMapperManager WinterFlowResolverController(WinterFlowCloudPackage winterFlowCloudPackage, WinterFlowRequestController winterFlowRequestController, WinterFlowBackendBatch winterFlowBackendBatch) {
        return new WinterFlowThreadPoolInterface(winterFlowCloudPackage, winterFlowRequestController, winterFlowBackendBatch);
    }

    public static byte[] WinterFlowResponseEngine(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static final WinterFlowSyntaxJava WinterFlowRouterAdapter(WinterFlowPackageResolver winterFlowPackageResolver) {
        WinterFlowSyntaxJava winterFlowSyntaxJava = winterFlowPackageResolver.WinterFlowVariableVersionControl;
        winterFlowSyntaxJava.getClass();
        return (WinterFlowSyntaxJava) WinterFlowVersionProtocol.WinterFlowVariableBandwidth(winterFlowSyntaxJava, winterFlowPackageResolver);
    }

    public static final boolean WinterFlowRouterRouter(WinterFlowSyntaxJava winterFlowSyntaxJava, int i, WinterFlowParserThread winterFlowParserThread, boolean z) {
        boolean z2;
        synchronized (WinterFlowServerProtocol) {
            try {
                int i2 = winterFlowSyntaxJava.WinterFlowArrayNetwork;
                if (i2 == i) {
                    winterFlowSyntaxJava.WinterFlowCacheManagerAgent = winterFlowParserThread;
                    z2 = true;
                    if (z) {
                        winterFlowSyntaxJava.WinterFlowVariableVersionControl++;
                    }
                    winterFlowSyntaxJava.WinterFlowArrayNetwork = i2 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public static WinterFlowRendererRefactoring WinterFlowRouterStructure(float f) {
        return new WinterFlowRendererRefactoring(Float.valueOf(f), WinterFlowEncryptionSubsystem.WinterFlowRouterAdapter, Float.valueOf(0.01f), 8);
    }

    public static final int WinterFlowSerializerStructure(WinterFlowPackageResolver winterFlowPackageResolver) {
        WinterFlowSyntaxJava winterFlowSyntaxJava = winterFlowPackageResolver.WinterFlowVariableVersionControl;
        winterFlowSyntaxJava.getClass();
        return ((WinterFlowSyntaxJava) WinterFlowVersionProtocol.WinterFlowTransactionManagerStrategy(winterFlowSyntaxJava)).WinterFlowVariableVersionControl;
    }

    public static final boolean WinterFlowServerProtocol(WinterFlowClassTool winterFlowClassTool, long j) {
        if (!winterFlowClassTool.WinterFlowVariableVersionControl.WinterFlowSingletonPlatform) {
            return false;
        }
        WinterFlowRouterInvoker winterFlowRouterInvoker = WinterFlowCloudStack.WinterFlowSyntaxSubsystem(winterFlowClassTool).WinterFlowUserManagerUserManager.WinterFlowCacheManagerAgent;
        if (!winterFlowRouterInvoker.WinterFlowValidatorHandler.WinterFlowSingletonPlatform) {
            return false;
        }
        long WinterFlowPackageIDE = winterFlowRouterInvoker.WinterFlowPackageIDE(0L);
        float intBitsToFloat = Float.intBitsToFloat((int) (WinterFlowPackageIDE >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (WinterFlowPackageIDE & 4294967295L));
        long j2 = winterFlowClassTool.WinterFlowRouterAdapter;
        float f = ((int) (j2 >> 32)) + intBitsToFloat;
        float f2 = ((int) (j2 & 4294967295L)) + intBitsToFloat2;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (intBitsToFloat > intBitsToFloat3 || intBitsToFloat3 > f) {
            return false;
        }
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        return intBitsToFloat2 <= intBitsToFloat4 && intBitsToFloat4 <= f2;
    }

    public static Handler WinterFlowServiceUtility(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return WinterFlowQueueScheduler.WinterFlowRouterStructure(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static final View WinterFlowSingletonPlatform(WinterFlowUserManagerController winterFlowUserManagerController) {
        WinterFlowServiceProviderController winterFlowServiceProviderController = WinterFlowCloudStack.WinterFlowSyntaxSubsystem(winterFlowUserManagerController.WinterFlowVariableVersionControl).WinterFlowVariableBandwidth;
        View interopView = winterFlowServiceProviderController != null ? winterFlowServiceProviderController.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Could not fetch interop view");
        return null;
    }

    public static String WinterFlowSoftwareEngine(long j) {
        return "PointerId(value=" + j + ')';
    }

    public static final PorterDuff.Mode WinterFlowSoftwareProtocol(int i) {
        return i == 0 ? PorterDuff.Mode.CLEAR : i == 1 ? PorterDuff.Mode.SRC : i == 2 ? PorterDuff.Mode.DST : i == 3 ? PorterDuff.Mode.SRC_OVER : i == 4 ? PorterDuff.Mode.DST_OVER : i == 5 ? PorterDuff.Mode.SRC_IN : i == 6 ? PorterDuff.Mode.DST_IN : i == 7 ? PorterDuff.Mode.SRC_OUT : i == 8 ? PorterDuff.Mode.DST_OUT : i == 9 ? PorterDuff.Mode.SRC_ATOP : i == 10 ? PorterDuff.Mode.DST_ATOP : i == 11 ? PorterDuff.Mode.XOR : i == 12 ? PorterDuff.Mode.ADD : i == 14 ? PorterDuff.Mode.SCREEN : i == 15 ? PorterDuff.Mode.OVERLAY : i == 16 ? PorterDuff.Mode.DARKEN : i == 17 ? PorterDuff.Mode.LIGHTEN : i == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    public static final Object WinterFlowStrategyTool(Object obj) {
        return obj instanceof WinterFlowSessionManagerSessionManager ? WinterFlowPackageProcess.WinterFlowHookDataSource(((WinterFlowSessionManagerSessionManager) obj).WinterFlowRouterStructure) : obj;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static String WinterFlowSyntax(String str) {
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -2061550653:
                if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return "kotlin.Double.Companion";
                }
                return null;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "kotlin.Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "kotlin.Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "kotlin.Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "kotlin.Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "kotlin.collections.Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "kotlin.collections.Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "kotlin.Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "kotlin.Byte.Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "kotlin.CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "kotlin.collections.Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "kotlin.Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "kotlin.Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "kotlin.Char.Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "kotlin.Long.Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "kotlin.collections.Map.Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "kotlin.Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "kotlin.Char";
                }
                return null;
            case 3327612:
                if (str.equals(Constants.LONG)) {
                    return "kotlin.Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "kotlin.collections.List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "kotlin.Short.Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "kotlin.Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "kotlin.Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "kotlin.Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "kotlin.Enum.Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "kotlin.Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "kotlin.Long";
                }
                return null;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "kotlin.Float.Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "kotlin.collections.Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "kotlin.collections.ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "kotlin.String.Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "kotlin.Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "kotlin.Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "kotlin.Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "kotlin.String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "kotlin.collections.Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "kotlin.Boolean.Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "kotlin.Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "kotlin.Int.Companion";
                }
                return null;
            default:
                switch (hashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (hashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (hashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static final void WinterFlowSyntaxSubsystem(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
    }

    public static void WinterFlowTestingNode(OutputStream outputStream, long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static WinterFlowMiddlewareSystem WinterFlowThreadListener(Context context) {
        ProviderInfo providerInfo;
        WinterFlowXMLHelper winterFlowXMLHelper;
        ApplicationInfo applicationInfo;
        int i = 4;
        WinterFlowAlgorithmDebug winterFlowUnitTest = Build.VERSION.SDK_INT >= 28 ? new WinterFlowUnitTest(i) : new WinterFlowAlgorithmDebug(i);
        PackageManager packageManager = context.getPackageManager();
        WinterFlowSoftwareException.WinterFlowSerializerStructure(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] WinterFlowVariableVersionControl2 = winterFlowUnitTest.WinterFlowVariableVersionControl(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : WinterFlowVariableVersionControl2) {
                    arrayList.add(signature.toByteArray());
                }
                winterFlowXMLHelper = new WinterFlowXMLHelper(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (winterFlowXMLHelper != null) {
                return null;
            }
            return new WinterFlowMiddlewareSystem(new WinterFlowOrchestrationHandler(context, winterFlowXMLHelper));
        }
        winterFlowXMLHelper = null;
        if (winterFlowXMLHelper != null) {
        }
    }

    public static final float WinterFlowTransactionAgent(long j, long j2) {
        return Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x04fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:508:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x03be  */
    /* JADX WARN: Type inference failed for: r12v5, types: [com.google.android.datatransport.WinterFlowResolverLibrary] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v8, types: [com.google.android.datatransport.WinterFlowTransactionManagerLayer] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r23v2, types: [com.google.android.datatransport.WinterFlowTransactionManagerLayer] */
    /* JADX WARN: Type inference failed for: r23v4, types: [com.google.android.datatransport.WinterFlowTransactionManagerLayer] */
    /* JADX WARN: Type inference failed for: r4v16, types: [com.google.android.datatransport.WinterFlowHandlerInvoker, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v37, types: [com.google.android.datatransport.WinterFlowSerializerMicroservice, com.google.android.datatransport.WinterFlowServerLayer] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WinterFlowTransactionManagerStrategy(WinterFlowProtocolManager winterFlowProtocolManager, WinterFlowSerializerMicroservice winterFlowSerializerMicroservice, WinterFlowMapperManager winterFlowMapperManager, WinterFlowInvokerConsumer winterFlowInvokerConsumer, final WinterFlowObjectSession winterFlowObjectSession, final WinterFlowObjectSession winterFlowObjectSession2, final WinterFlowObjectSession winterFlowObjectSession3, final WinterFlowObjectSession winterFlowObjectSession4, WinterFlowResolverLibrary winterFlowResolverLibrary, int i) {
        WinterFlowRouterTesting winterFlowRouterTesting;
        WinterFlowDecoratorVersion winterFlowDecoratorVersion;
        Object winterFlowRuntimeMechanism;
        WinterFlowThreadPoolGateway winterFlowThreadPoolGateway;
        WinterFlowObjectHandler winterFlowObjectHandler;
        final WinterFlowThreadPoolGateway winterFlowThreadPoolGateway2;
        int i2;
        WinterFlowRouterTesting winterFlowRouterTesting2;
        WinterFlowJavaSubsystem winterFlowJavaSubsystem;
        WinterFlowRouterTesting winterFlowRouterTesting3;
        int i3;
        Object obj;
        final WinterFlowCacheException winterFlowCacheException;
        WinterFlowObjectSession winterFlowObjectSession5;
        WinterFlowBatchCacheManager winterFlowBatchCacheManager;
        int i4;
        ?? r15;
        WinterFlowCacheManagerMicroservice winterFlowCacheManagerMicroservice;
        WinterFlowHandlerInvoker winterFlowHandlerInvoker;
        WinterFlowJavaSubsystem winterFlowJavaSubsystem2;
        Object obj2;
        WinterFlowCacheException winterFlowCacheException2;
        WinterFlowThreadPoolGateway winterFlowThreadPoolGateway3;
        WinterFlowSessionComponent winterFlowSessionComponent;
        WinterFlowJavaSubsystem winterFlowJavaSubsystem3;
        int[] intArray;
        ArrayList parcelableArrayList;
        Bundle bundle;
        int[] iArr;
        ArrayList arrayList;
        WinterFlowLoaderValidator WinterFlowVariableVersionControl2;
        int[] iArr2;
        ArrayList arrayList2;
        int length;
        int i5;
        String str;
        WinterFlowServerLayer WinterFlowRouterStructure2;
        WinterFlowSerializerMicroservice winterFlowSerializerMicroservice2;
        int i6;
        Bundle bundle2;
        WinterFlowServerLayer WinterFlowRouterStructure3;
        WinterFlowSerializerMicroservice winterFlowSerializerMicroservice3;
        int i7;
        WinterFlowResolverLibrary winterFlowResolverLibrary2;
        winterFlowResolverLibrary.WinterFlowFrameworkTransaction(-1964664536);
        int i8 = (i & 6) == 0 ? (winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowProtocolManager) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i8 |= winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowSerializerMicroservice) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowMapperManager) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowInvokerConsumer) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i8 |= winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowObjectSession) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i8 |= winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowObjectSession2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i8 |= winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowObjectSession3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i8 |= winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowObjectSession4) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i8 |= winterFlowResolverLibrary.WinterFlowUnitTestResponse(null) ? 67108864 : 33554432;
        }
        if ((i8 & 38347923) == 38347922 && winterFlowResolverLibrary.WinterFlowBackendCacheManager()) {
            winterFlowResolverLibrary.WinterFlowQueueService();
            winterFlowResolverLibrary2 = winterFlowResolverLibrary;
        } else {
            winterFlowResolverLibrary.WinterFlowProxyStructure();
            if ((i & 1) != 0 && !winterFlowResolverLibrary.WinterFlowResolverController()) {
                winterFlowResolverLibrary.WinterFlowQueueService();
            }
            winterFlowResolverLibrary.WinterFlowOrchestrationSubsystem();
            WinterFlowDecoratorVersion winterFlowDecoratorVersion2 = (WinterFlowDecoratorVersion) winterFlowResolverLibrary.WinterFlowSyntax(WinterFlowAlgorithmDeployment.WinterFlowRouterStructure);
            WinterFlowProviderCacheManager WinterFlowRouterStructure4 = WinterFlowUnitTestTool.WinterFlowRouterStructure(winterFlowResolverLibrary);
            if (WinterFlowRouterStructure4 == null) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
                return;
            }
            WinterFlowScriptManager WinterFlowTransactionManagerStrategy2 = WinterFlowRouterStructure4.WinterFlowTransactionManagerStrategy();
            winterFlowProtocolManager.getClass();
            WinterFlowProcessorProtocol winterFlowProcessorProtocol = winterFlowProtocolManager.WinterFlowHookDataSource;
            WinterFlowTransactionManagerStrategy2.getClass();
            winterFlowProcessorProtocol.getClass();
            WinterFlowOrchestrationValidator winterFlowOrchestrationValidator = winterFlowProcessorProtocol.WinterFlowTransactionManagerStrategy;
            WinterFlowRouterTesting winterFlowRouterTesting4 = winterFlowProcessorProtocol.WinterFlowVariableBandwidth;
            int i9 = i8;
            if (!WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowProcessorProtocol.WinterFlowBandwidthObject, WinterFlowEncryptionSubsystem.WinterFlowCompilerVariable(WinterFlowTransactionManagerStrategy2))) {
                if (!winterFlowOrchestrationValidator.isEmpty()) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("ViewModelStore should be set before setGraph call");
                    return;
                }
                winterFlowProcessorProtocol.WinterFlowBandwidthObject = WinterFlowEncryptionSubsystem.WinterFlowCompilerVariable(WinterFlowTransactionManagerStrategy2);
            }
            winterFlowSerializerMicroservice.getClass();
            LinkedHashMap linkedHashMap = winterFlowProcessorProtocol.WinterFlowBatchUI;
            WinterFlowMicroserviceProtocol winterFlowMicroserviceProtocol = winterFlowSerializerMicroservice.WinterFlowResponseEngine;
            if (!winterFlowOrchestrationValidator.isEmpty() && winterFlowProcessorProtocol.WinterFlowUnitTestResponse() == WinterFlowDatabaseProtocol.WinterFlowVariableVersionControl) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
                return;
            }
            boolean z = false;
            if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowProcessorProtocol.WinterFlowCacheManagerAgent, winterFlowSerializerMicroservice)) {
                winterFlowRouterTesting = winterFlowRouterTesting4;
                winterFlowDecoratorVersion = winterFlowDecoratorVersion2;
                int WinterFlowArrayNetwork2 = winterFlowMicroserviceProtocol.WinterFlowHookDataSource.WinterFlowArrayNetwork();
                for (int i10 = 0; i10 < WinterFlowArrayNetwork2; i10++) {
                    WinterFlowServerLayer winterFlowServerLayer = (WinterFlowServerLayer) winterFlowMicroserviceProtocol.WinterFlowHookDataSource.WinterFlowVariableVersionControl(i10);
                    WinterFlowSerializerMicroservice winterFlowSerializerMicroservice4 = winterFlowProcessorProtocol.WinterFlowCacheManagerAgent;
                    winterFlowSerializerMicroservice4.getClass();
                    int WinterFlowHookDataSource2 = winterFlowSerializerMicroservice4.WinterFlowResponseEngine.WinterFlowHookDataSource.WinterFlowHookDataSource(i10);
                    WinterFlowSerializerMicroservice winterFlowSerializerMicroservice5 = winterFlowProcessorProtocol.WinterFlowCacheManagerAgent;
                    winterFlowSerializerMicroservice5.getClass();
                    WinterFlowRequestListener winterFlowRequestListener = winterFlowSerializerMicroservice5.WinterFlowResponseEngine.WinterFlowHookDataSource;
                    if (winterFlowRequestListener.WinterFlowVariableVersionControl) {
                        WinterFlowCloudStack.WinterFlowSerializerStructure(winterFlowRequestListener);
                    }
                    int WinterFlowSyntax2 = WinterFlowHandlerWebsocket.WinterFlowSyntax(winterFlowRequestListener.WinterFlowTransactionManagerStrategy, winterFlowRequestListener.WinterFlowRouterRouter, WinterFlowHookDataSource2);
                    if (WinterFlowSyntax2 >= 0) {
                        Object[] objArr = winterFlowRequestListener.WinterFlowUnitTestResponse;
                        Object obj3 = objArr[WinterFlowSyntax2];
                        objArr[WinterFlowSyntax2] = winterFlowServerLayer;
                    }
                }
                Iterator it = winterFlowOrchestrationValidator.iterator();
                while (it.hasNext()) {
                    WinterFlowLibrarySessionManager winterFlowLibrarySessionManager = (WinterFlowLibrarySessionManager) it.next();
                    int i11 = WinterFlowServerLayer.WinterFlowSyntax;
                    WinterFlowWebsocketEngine winterFlowWebsocketEngine = new WinterFlowWebsocketEngine(WinterFlowFrontendSubsystem.WinterFlowBandwidthObject(WinterFlowHandlerWebsocket.WinterFlowMapperProtocol(winterFlowLibrarySessionManager.WinterFlowTransactionManagerStrategy)));
                    WinterFlowServerLayer winterFlowServerLayer2 = winterFlowProcessorProtocol.WinterFlowCacheManagerAgent;
                    winterFlowServerLayer2.getClass();
                    Iterator it2 = winterFlowWebsocketEngine.iterator();
                    while (true) {
                        ListIterator listIterator = (ListIterator) ((WinterFlowClassController) it2).WinterFlowTransactionManagerStrategy;
                        if (listIterator.hasPrevious()) {
                            WinterFlowServerLayer winterFlowServerLayer3 = (WinterFlowServerLayer) listIterator.previous();
                            if (!WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowServerLayer3, winterFlowProcessorProtocol.WinterFlowCacheManagerAgent) || !winterFlowServerLayer2.equals(winterFlowSerializerMicroservice)) {
                                if (winterFlowServerLayer2 instanceof WinterFlowSerializerMicroservice) {
                                    winterFlowServerLayer2 = ((WinterFlowSerializerMicroservice) winterFlowServerLayer2).WinterFlowResponseEngine.WinterFlowRouterStructure(winterFlowServerLayer3.WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure);
                                    winterFlowServerLayer2.getClass();
                                }
                            }
                        }
                    }
                    winterFlowLibrarySessionManager.WinterFlowTransactionManagerStrategy = winterFlowServerLayer2;
                }
            } else {
                WinterFlowSerializerMicroservice winterFlowSerializerMicroservice6 = winterFlowProcessorProtocol.WinterFlowCacheManagerAgent;
                if (winterFlowSerializerMicroservice6 != null) {
                    ArrayList arrayList3 = new ArrayList(winterFlowProcessorProtocol.WinterFlowServerProtocol.keySet());
                    int size = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj4 = arrayList3.get(i12);
                        int i13 = i12 + 1;
                        Integer num = (Integer) obj4;
                        num.getClass();
                        int intValue = num.intValue();
                        Iterator it3 = linkedHashMap.values().iterator();
                        while (it3.hasNext()) {
                            ((WinterFlowAdapterUI) it3.next()).WinterFlowArrayNetwork = true;
                        }
                        boolean WinterFlowBandwidthObject = winterFlowProcessorProtocol.WinterFlowBandwidthObject(intValue, null, new WinterFlowQueueView(z, true, -1, false, z, -1, -1));
                        for (Iterator it4 = linkedHashMap.values().iterator(); it4.hasNext(); it4 = it4) {
                            ((WinterFlowAdapterUI) it4.next()).WinterFlowArrayNetwork = false;
                            WinterFlowBandwidthObject = WinterFlowBandwidthObject;
                        }
                        if (WinterFlowBandwidthObject) {
                            winterFlowProcessorProtocol.WinterFlowTransactionAgent(intValue, true, false);
                        }
                        i12 = i13;
                        z = false;
                    }
                    winterFlowProcessorProtocol.WinterFlowTransactionAgent(winterFlowSerializerMicroservice6.WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure, true, false);
                }
                winterFlowProcessorProtocol.WinterFlowCacheManagerAgent = winterFlowSerializerMicroservice;
                WinterFlowProtocolManager winterFlowProtocolManager2 = winterFlowProcessorProtocol.WinterFlowRouterStructure;
                WinterFlowUIMiddleware winterFlowUIMiddleware = winterFlowProtocolManager2.WinterFlowCacheManagerAgent;
                Bundle bundle3 = winterFlowProcessorProtocol.WinterFlowArrayNetwork;
                if (bundle3 != null && bundle3.containsKey("android-support-nav:controller:navigatorState:names")) {
                    ArrayList<String> stringArrayList = bundle3.getStringArrayList("android-support-nav:controller:navigatorState:names");
                    if (stringArrayList == null) {
                        WinterFlowFrameworkMechanism.WinterFlowResponseEngine("android-support-nav:controller:navigatorState:names");
                        throw null;
                    }
                    int size2 = stringArrayList.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        String str2 = stringArrayList.get(i14);
                        i14++;
                        int i15 = size2;
                        String str3 = str2;
                        winterFlowRouterTesting4.WinterFlowHookDataSource(str3);
                        if (bundle3.containsKey(str3) && bundle3.getBundle(str3) == null) {
                            WinterFlowFrameworkMechanism.WinterFlowResponseEngine(str3);
                            throw null;
                        }
                        size2 = i15;
                    }
                }
                Bundle[] bundleArr = winterFlowProcessorProtocol.WinterFlowVariableVersionControl;
                if (bundleArr != null) {
                    int i16 = 0;
                    for (int length2 = bundleArr.length; i16 < length2; length2 = i7) {
                        Bundle[] bundleArr2 = bundleArr;
                        Bundle bundle4 = bundleArr2[i16];
                        bundle4.getClass();
                        bundle4.setClassLoader(WinterFlowMicroserviceEntity.class.getClassLoader());
                        String string = bundle4.getString("nav-entry-state:id");
                        if (string == null) {
                            WinterFlowFrameworkMechanism.WinterFlowResponseEngine("nav-entry-state:id");
                            throw null;
                        }
                        int i17 = bundle4.getInt("nav-entry-state:destination-id", Integer.MIN_VALUE);
                        if (i17 == Integer.MIN_VALUE) {
                            i7 = length2;
                            if (bundle4.getInt("nav-entry-state:destination-id", Integer.MAX_VALUE) == Integer.MAX_VALUE) {
                                WinterFlowFrameworkMechanism.WinterFlowResponseEngine("nav-entry-state:destination-id");
                                throw null;
                            }
                        } else {
                            i7 = length2;
                        }
                        Bundle bundle5 = bundle4.getBundle("nav-entry-state:args");
                        if (bundle5 == null) {
                            WinterFlowFrameworkMechanism.WinterFlowResponseEngine("nav-entry-state:args");
                            throw null;
                        }
                        Bundle bundle6 = bundle4.getBundle("nav-entry-state:saved-state");
                        if (bundle6 == null) {
                            WinterFlowFrameworkMechanism.WinterFlowResponseEngine("nav-entry-state:saved-state");
                            throw null;
                        }
                        WinterFlowServerLayer WinterFlowCacheManagerAgent2 = winterFlowProcessorProtocol.WinterFlowCacheManagerAgent(i17, null);
                        if (WinterFlowCacheManagerAgent2 == null) {
                            int i18 = WinterFlowServerLayer.WinterFlowSyntax;
                            throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + WinterFlowHandlerWebsocket.WinterFlowSerializerStructure(winterFlowUIMiddleware, i17) + " cannot be found from the current destination " + winterFlowProcessorProtocol.WinterFlowTransactionManagerStrategy());
                        }
                        WinterFlowDatabaseProtocol WinterFlowUnitTestResponse2 = winterFlowProcessorProtocol.WinterFlowUnitTestResponse();
                        WinterFlowPackageLayer winterFlowPackageLayer = winterFlowProcessorProtocol.WinterFlowBandwidthObject;
                        winterFlowUIMiddleware.getClass();
                        WinterFlowUnitTestResponse2.getClass();
                        Context context = winterFlowUIMiddleware.WinterFlowRouterStructure;
                        bundle5.setClassLoader(context != null ? context.getClassLoader() : null);
                        WinterFlowLibrarySessionManager winterFlowLibrarySessionManager2 = new WinterFlowLibrarySessionManager(winterFlowUIMiddleware, WinterFlowCacheManagerAgent2, bundle5, WinterFlowUnitTestResponse2, winterFlowPackageLayer, string, bundle6);
                        WinterFlowRendererRenderer WinterFlowHookDataSource3 = winterFlowRouterTesting4.WinterFlowHookDataSource(WinterFlowCacheManagerAgent2.WinterFlowVariableVersionControl);
                        Object obj5 = linkedHashMap.get(WinterFlowHookDataSource3);
                        if (obj5 == null) {
                            obj5 = new WinterFlowAdapterUI(winterFlowProtocolManager2, WinterFlowHookDataSource3);
                            linkedHashMap.put(WinterFlowHookDataSource3, obj5);
                        }
                        winterFlowOrchestrationValidator.addLast(winterFlowLibrarySessionManager2);
                        ((WinterFlowAdapterUI) obj5).WinterFlowRouterStructure(winterFlowLibrarySessionManager2);
                        WinterFlowSerializerMicroservice winterFlowSerializerMicroservice7 = winterFlowLibrarySessionManager2.WinterFlowTransactionManagerStrategy.WinterFlowUnitTestResponse;
                        if (winterFlowSerializerMicroservice7 != null) {
                            winterFlowProcessorProtocol.WinterFlowSyntax(winterFlowLibrarySessionManager2, winterFlowProcessorProtocol.WinterFlowVariableVersionControl(winterFlowSerializerMicroservice7.WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure));
                        }
                        i16++;
                        bundleArr = bundleArr2;
                    }
                    winterFlowProcessorProtocol.WinterFlowHookDataSource.WinterFlowRouterStructure();
                    winterFlowProcessorProtocol.WinterFlowVariableVersionControl = null;
                }
                Collection values = WinterFlowDataSourceUtility.WinterFlowSessionManagerInterface(winterFlowRouterTesting4.WinterFlowRouterStructure).values();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj6 : values) {
                    if (!((WinterFlowRendererRenderer) obj6).WinterFlowHookDataSource) {
                        arrayList4.add(obj6);
                    }
                }
                int size3 = arrayList4.size();
                int i19 = 0;
                while (i19 < size3) {
                    Object obj7 = arrayList4.get(i19);
                    i19++;
                    WinterFlowRendererRenderer winterFlowRendererRenderer = (WinterFlowRendererRenderer) obj7;
                    Object obj8 = linkedHashMap.get(winterFlowRendererRenderer);
                    if (obj8 == null) {
                        winterFlowRendererRenderer.getClass();
                        obj8 = new WinterFlowAdapterUI(winterFlowProtocolManager2, winterFlowRendererRenderer);
                        linkedHashMap.put(winterFlowRendererRenderer, obj8);
                    }
                    winterFlowRendererRenderer.getClass();
                    winterFlowRendererRenderer.WinterFlowRouterStructure = (WinterFlowAdapterUI) obj8;
                    winterFlowRendererRenderer.WinterFlowHookDataSource = true;
                }
                if (winterFlowProcessorProtocol.WinterFlowCacheManagerAgent == null || !winterFlowOrchestrationValidator.isEmpty()) {
                    winterFlowRouterTesting = winterFlowRouterTesting4;
                    winterFlowDecoratorVersion = winterFlowDecoratorVersion2;
                    winterFlowProcessorProtocol.WinterFlowHookDataSource();
                } else {
                    Activity activity = winterFlowProtocolManager2.WinterFlowArrayNetwork;
                    if (!winterFlowProtocolManager2.WinterFlowVariableVersionControl && activity != null) {
                        Intent intent = activity.getIntent();
                        WinterFlowProcessorProtocol winterFlowProcessorProtocol2 = winterFlowProtocolManager2.WinterFlowHookDataSource;
                        if (intent != null) {
                            Bundle extras = intent.getExtras();
                            if (extras != null) {
                                try {
                                    intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                                } catch (Exception unused) {
                                    intent.toString();
                                }
                                parcelableArrayList = extras == null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
                                Bundle WinterFlowOrchestrationSubsystem = WinterFlowManagerRequest.WinterFlowOrchestrationSubsystem((WinterFlowServerPlatform[]) Arrays.copyOf(new WinterFlowServerPlatform[0], 0));
                                bundle = extras == null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
                                if (bundle != null) {
                                    WinterFlowOrchestrationSubsystem.putAll(bundle);
                                }
                                if (intArray != null || intArray.length == 0) {
                                    ?? WinterFlowRouterRouter2 = winterFlowProcessorProtocol2.WinterFlowRouterRouter();
                                    iArr = intArray;
                                    arrayList = parcelableArrayList;
                                    winterFlowDecoratorVersion = winterFlowDecoratorVersion2;
                                    WinterFlowVariableVersionControl2 = WinterFlowRouterRouter2.WinterFlowVariableVersionControl(new WinterFlowObjectPackage(intent.getData(), intent.getAction(), intent.getType(), 18), WinterFlowRouterRouter2);
                                    if (WinterFlowVariableVersionControl2 != null) {
                                        WinterFlowServerLayer winterFlowServerLayer4 = WinterFlowVariableVersionControl2.WinterFlowVariableVersionControl;
                                        WinterFlowOrchestrationValidator winterFlowOrchestrationValidator2 = new WinterFlowOrchestrationValidator();
                                        WinterFlowServerLayer winterFlowServerLayer5 = winterFlowServerLayer4;
                                        while (true) {
                                            WinterFlowListenerPlatform winterFlowListenerPlatform = winterFlowServerLayer5.WinterFlowTransactionManagerStrategy;
                                            WinterFlowSerializerMicroservice winterFlowSerializerMicroservice8 = winterFlowServerLayer5.WinterFlowUnitTestResponse;
                                            winterFlowRouterTesting = winterFlowRouterTesting4;
                                            if (winterFlowSerializerMicroservice8 == null || winterFlowSerializerMicroservice8.WinterFlowResponseEngine.WinterFlowCacheManagerAgent != winterFlowListenerPlatform.WinterFlowRouterStructure) {
                                                winterFlowOrchestrationValidator2.addFirst(winterFlowServerLayer5);
                                            }
                                            if (!WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowSerializerMicroservice8, null) && winterFlowSerializerMicroservice8 != null) {
                                                winterFlowServerLayer5 = winterFlowSerializerMicroservice8;
                                                winterFlowRouterTesting4 = winterFlowRouterTesting;
                                            }
                                        }
                                        List WinterFlowProtocolConsumer = WinterFlowSerializerUtility.WinterFlowProtocolConsumer(winterFlowOrchestrationValidator2);
                                        ArrayList arrayList5 = new ArrayList(WinterFlowModuleThread.WinterFlowModuleAgent(WinterFlowProtocolConsumer, 10));
                                        Iterator it5 = WinterFlowProtocolConsumer.iterator();
                                        while (it5.hasNext()) {
                                            arrayList5.add(Integer.valueOf(((WinterFlowServerLayer) it5.next()).WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure));
                                        }
                                        int[] iArr3 = new int[arrayList5.size()];
                                        int size4 = arrayList5.size();
                                        int i20 = 0;
                                        int i21 = 0;
                                        while (i21 < size4) {
                                            Object obj9 = arrayList5.get(i21);
                                            i21++;
                                            iArr3[i20] = ((Number) obj9).intValue();
                                            i20++;
                                        }
                                        Bundle WinterFlowRouterStructure5 = winterFlowServerLayer4.WinterFlowRouterStructure(WinterFlowVariableVersionControl2.WinterFlowTransactionManagerStrategy);
                                        if (WinterFlowRouterStructure5 != null) {
                                            WinterFlowOrchestrationSubsystem.putAll(WinterFlowRouterStructure5);
                                        }
                                        iArr2 = iArr3;
                                        arrayList2 = null;
                                        if (iArr2 != null && iArr2.length != 0) {
                                            winterFlowProcessorProtocol2.getClass();
                                            WinterFlowSerializerMicroservice winterFlowSerializerMicroservice9 = winterFlowProcessorProtocol2.WinterFlowCacheManagerAgent;
                                            length = iArr2.length;
                                            i5 = 0;
                                            while (true) {
                                                if (i5 < length) {
                                                    str = null;
                                                    break;
                                                }
                                                int i22 = iArr2[i5];
                                                if (i5 == 0) {
                                                    WinterFlowSerializerMicroservice winterFlowSerializerMicroservice10 = winterFlowProcessorProtocol2.WinterFlowCacheManagerAgent;
                                                    winterFlowSerializerMicroservice10.getClass();
                                                    WinterFlowRouterStructure3 = winterFlowSerializerMicroservice10.WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure == i22 ? winterFlowProcessorProtocol2.WinterFlowCacheManagerAgent : null;
                                                } else {
                                                    winterFlowSerializerMicroservice9.getClass();
                                                    WinterFlowRouterStructure3 = winterFlowSerializerMicroservice9.WinterFlowResponseEngine.WinterFlowRouterStructure(i22);
                                                }
                                                if (WinterFlowRouterStructure3 == null) {
                                                    int i23 = WinterFlowServerLayer.WinterFlowSyntax;
                                                    str = WinterFlowHandlerWebsocket.WinterFlowSerializerStructure(winterFlowProcessorProtocol2.WinterFlowRouterStructure.WinterFlowCacheManagerAgent, i22);
                                                    break;
                                                }
                                                if (i5 != iArr2.length - 1 && (WinterFlowRouterStructure3 instanceof WinterFlowSerializerMicroservice)) {
                                                    while (true) {
                                                        winterFlowSerializerMicroservice3 = (WinterFlowSerializerMicroservice) WinterFlowRouterStructure3;
                                                        winterFlowSerializerMicroservice3.getClass();
                                                        WinterFlowMicroserviceProtocol winterFlowMicroserviceProtocol2 = winterFlowSerializerMicroservice3.WinterFlowResponseEngine;
                                                        if (!(winterFlowMicroserviceProtocol2.WinterFlowRouterStructure(winterFlowMicroserviceProtocol2.WinterFlowCacheManagerAgent) instanceof WinterFlowSerializerMicroservice)) {
                                                            break;
                                                        } else {
                                                            WinterFlowRouterStructure3 = winterFlowMicroserviceProtocol2.WinterFlowRouterStructure(winterFlowMicroserviceProtocol2.WinterFlowCacheManagerAgent);
                                                        }
                                                    }
                                                    winterFlowSerializerMicroservice9 = winterFlowSerializerMicroservice3;
                                                }
                                                i5++;
                                            }
                                            if (str == null) {
                                                intent.toString();
                                            } else {
                                                WinterFlowOrchestrationSubsystem.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                                                int length3 = iArr2.length;
                                                Bundle[] bundleArr3 = new Bundle[length3];
                                                for (int i24 = 0; i24 < length3; i24++) {
                                                    Bundle WinterFlowOrchestrationSubsystem2 = WinterFlowManagerRequest.WinterFlowOrchestrationSubsystem((WinterFlowServerPlatform[]) Arrays.copyOf(new WinterFlowServerPlatform[0], 0));
                                                    WinterFlowOrchestrationSubsystem2.putAll(WinterFlowOrchestrationSubsystem);
                                                    if (arrayList2 != null && (bundle2 = (Bundle) arrayList2.get(i24)) != null) {
                                                        WinterFlowOrchestrationSubsystem2.putAll(bundle2);
                                                    }
                                                    bundleArr3[i24] = WinterFlowOrchestrationSubsystem2;
                                                }
                                                int flags = intent.getFlags();
                                                int i25 = 268435456 & flags;
                                                if (i25 != 0 && (flags & 32768) == 0) {
                                                    intent.addFlags(32768);
                                                    Context context2 = winterFlowProtocolManager2.WinterFlowRouterStructure;
                                                    ArrayList arrayList6 = new ArrayList();
                                                    ComponentName component = intent.getComponent();
                                                    if (component == null) {
                                                        component = intent.resolveActivity(context2.getPackageManager());
                                                    }
                                                    if (component != null) {
                                                        int size5 = arrayList6.size();
                                                        try {
                                                            for (Intent WinterFlowConsumerUserManager = WinterFlowCloudStack.WinterFlowConsumerUserManager(context2, component); WinterFlowConsumerUserManager != null; WinterFlowConsumerUserManager = WinterFlowCloudStack.WinterFlowConsumerUserManager(context2, WinterFlowConsumerUserManager.getComponent())) {
                                                                arrayList6.add(size5, WinterFlowConsumerUserManager);
                                                            }
                                                        } catch (PackageManager.NameNotFoundException e) {
                                                            throw new IllegalArgumentException(e);
                                                        }
                                                    }
                                                    arrayList6.add(intent);
                                                    if (arrayList6.isEmpty()) {
                                                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("No intents added to TaskStackBuilder; cannot startActivities");
                                                        return;
                                                    }
                                                    Intent[] intentArr = (Intent[]) arrayList6.toArray(new Intent[0]);
                                                    intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                                                    context2.startActivities(intentArr, null);
                                                    activity.finish();
                                                    activity.overridePendingTransition(0, 0);
                                                } else if (i25 != 0) {
                                                    if (winterFlowProcessorProtocol2.WinterFlowTransactionManagerStrategy.isEmpty()) {
                                                        i6 = 0;
                                                    } else {
                                                        WinterFlowSerializerMicroservice winterFlowSerializerMicroservice11 = winterFlowProcessorProtocol2.WinterFlowCacheManagerAgent;
                                                        winterFlowSerializerMicroservice11.getClass();
                                                        i6 = 0;
                                                        winterFlowProcessorProtocol2.WinterFlowTransactionAgent(winterFlowSerializerMicroservice11.WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure, true, false);
                                                    }
                                                    while (i6 < iArr2.length) {
                                                        int i26 = iArr2[i6];
                                                        int i27 = i6 + 1;
                                                        Bundle bundle7 = bundleArr3[i6];
                                                        WinterFlowServerLayer WinterFlowCacheManagerAgent3 = winterFlowProcessorProtocol2.WinterFlowCacheManagerAgent(i26, null);
                                                        if (WinterFlowCacheManagerAgent3 == null) {
                                                            int i28 = WinterFlowServerLayer.WinterFlowSyntax;
                                                            throw new IllegalStateException("Deep Linking failed: destination " + WinterFlowHandlerWebsocket.WinterFlowSerializerStructure(winterFlowUIMiddleware, i26) + " cannot be found from the current destination " + winterFlowProcessorProtocol2.WinterFlowTransactionManagerStrategy());
                                                        }
                                                        WinterFlowRouterCompiler winterFlowRouterCompiler = new WinterFlowRouterCompiler(19, WinterFlowCacheManagerAgent3, winterFlowProtocolManager2);
                                                        WinterFlowUnitTestCacheManager winterFlowUnitTestCacheManager = new WinterFlowUnitTestCacheManager();
                                                        winterFlowRouterCompiler.WinterFlowUnitTestResponse(winterFlowUnitTestCacheManager);
                                                        WinterFlowStrategyLayer winterFlowStrategyLayer = winterFlowUnitTestCacheManager.WinterFlowRouterStructure;
                                                        winterFlowStrategyLayer.WinterFlowRouterStructure = false;
                                                        winterFlowStrategyLayer.WinterFlowHookDataSource = false;
                                                        int i29 = winterFlowUnitTestCacheManager.WinterFlowHookDataSource;
                                                        boolean z2 = winterFlowUnitTestCacheManager.WinterFlowCacheManagerAgent;
                                                        winterFlowStrategyLayer.WinterFlowCacheManagerAgent = i29;
                                                        winterFlowStrategyLayer.WinterFlowArrayNetwork = z2;
                                                        winterFlowProcessorProtocol2.WinterFlowResponseEngine(WinterFlowCacheManagerAgent3, bundle7, new WinterFlowQueueView(winterFlowStrategyLayer.WinterFlowRouterStructure, winterFlowStrategyLayer.WinterFlowHookDataSource, winterFlowStrategyLayer.WinterFlowCacheManagerAgent, false, winterFlowStrategyLayer.WinterFlowArrayNetwork, winterFlowStrategyLayer.WinterFlowVariableVersionControl, winterFlowStrategyLayer.WinterFlowTransactionManagerStrategy));
                                                        i6 = i27;
                                                    }
                                                    winterFlowProtocolManager2.WinterFlowVariableVersionControl = true;
                                                } else {
                                                    WinterFlowSerializerMicroservice winterFlowSerializerMicroservice12 = winterFlowProcessorProtocol2.WinterFlowCacheManagerAgent;
                                                    int length4 = iArr2.length;
                                                    for (int i30 = 0; i30 < length4; i30++) {
                                                        int i31 = iArr2[i30];
                                                        Bundle bundle8 = bundleArr3[i30];
                                                        if (i30 == 0) {
                                                            WinterFlowRouterStructure2 = winterFlowProcessorProtocol2.WinterFlowCacheManagerAgent;
                                                        } else {
                                                            winterFlowSerializerMicroservice12.getClass();
                                                            WinterFlowRouterStructure2 = winterFlowSerializerMicroservice12.WinterFlowResponseEngine.WinterFlowRouterStructure(i31);
                                                        }
                                                        if (WinterFlowRouterStructure2 == null) {
                                                            int i32 = WinterFlowServerLayer.WinterFlowSyntax;
                                                            throw new IllegalStateException("Deep Linking failed: destination " + WinterFlowHandlerWebsocket.WinterFlowSerializerStructure(winterFlowUIMiddleware, i31) + " cannot be found in graph " + winterFlowSerializerMicroservice12);
                                                        }
                                                        if (i30 == iArr2.length - 1) {
                                                            WinterFlowSerializerMicroservice winterFlowSerializerMicroservice13 = winterFlowProcessorProtocol2.WinterFlowCacheManagerAgent;
                                                            winterFlowSerializerMicroservice13.getClass();
                                                            winterFlowProcessorProtocol2.WinterFlowResponseEngine(WinterFlowRouterStructure2, bundle8, new WinterFlowQueueView(false, false, winterFlowSerializerMicroservice13.WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure, true, false, 0, 0));
                                                        } else if (WinterFlowRouterStructure2 instanceof WinterFlowSerializerMicroservice) {
                                                            while (true) {
                                                                winterFlowSerializerMicroservice2 = (WinterFlowSerializerMicroservice) WinterFlowRouterStructure2;
                                                                winterFlowSerializerMicroservice2.getClass();
                                                                WinterFlowMicroserviceProtocol winterFlowMicroserviceProtocol3 = winterFlowSerializerMicroservice2.WinterFlowResponseEngine;
                                                                if (!(winterFlowMicroserviceProtocol3.WinterFlowRouterStructure(winterFlowMicroserviceProtocol3.WinterFlowCacheManagerAgent) instanceof WinterFlowSerializerMicroservice)) {
                                                                    break;
                                                                } else {
                                                                    WinterFlowRouterStructure2 = winterFlowMicroserviceProtocol3.WinterFlowRouterStructure(winterFlowMicroserviceProtocol3.WinterFlowCacheManagerAgent);
                                                                }
                                                            }
                                                            winterFlowSerializerMicroservice12 = winterFlowSerializerMicroservice2;
                                                        }
                                                    }
                                                    winterFlowProtocolManager2.WinterFlowVariableVersionControl = true;
                                                }
                                            }
                                        }
                                        WinterFlowSerializerMicroservice winterFlowSerializerMicroservice14 = winterFlowProcessorProtocol.WinterFlowCacheManagerAgent;
                                        winterFlowSerializerMicroservice14.getClass();
                                        winterFlowProcessorProtocol.WinterFlowResponseEngine(winterFlowSerializerMicroservice14, null, null);
                                    }
                                } else {
                                    iArr = intArray;
                                    winterFlowDecoratorVersion = winterFlowDecoratorVersion2;
                                    arrayList = parcelableArrayList;
                                }
                                winterFlowRouterTesting = winterFlowRouterTesting4;
                                iArr2 = iArr;
                                arrayList2 = arrayList;
                                if (iArr2 != null) {
                                    winterFlowProcessorProtocol2.getClass();
                                    WinterFlowSerializerMicroservice winterFlowSerializerMicroservice92 = winterFlowProcessorProtocol2.WinterFlowCacheManagerAgent;
                                    length = iArr2.length;
                                    i5 = 0;
                                    while (true) {
                                        if (i5 < length) {
                                        }
                                        i5++;
                                    }
                                    if (str == null) {
                                    }
                                }
                                WinterFlowSerializerMicroservice winterFlowSerializerMicroservice142 = winterFlowProcessorProtocol.WinterFlowCacheManagerAgent;
                                winterFlowSerializerMicroservice142.getClass();
                                winterFlowProcessorProtocol.WinterFlowResponseEngine(winterFlowSerializerMicroservice142, null, null);
                            }
                            intArray = null;
                            if (extras == null) {
                            }
                            Bundle WinterFlowOrchestrationSubsystem3 = WinterFlowManagerRequest.WinterFlowOrchestrationSubsystem((WinterFlowServerPlatform[]) Arrays.copyOf(new WinterFlowServerPlatform[0], 0));
                            if (extras == null) {
                            }
                            if (bundle != null) {
                            }
                            if (intArray != null) {
                            }
                            ?? WinterFlowRouterRouter22 = winterFlowProcessorProtocol2.WinterFlowRouterRouter();
                            iArr = intArray;
                            arrayList = parcelableArrayList;
                            winterFlowDecoratorVersion = winterFlowDecoratorVersion2;
                            WinterFlowVariableVersionControl2 = WinterFlowRouterRouter22.WinterFlowVariableVersionControl(new WinterFlowObjectPackage(intent.getData(), intent.getAction(), intent.getType(), 18), WinterFlowRouterRouter22);
                            if (WinterFlowVariableVersionControl2 != null) {
                            }
                            winterFlowRouterTesting = winterFlowRouterTesting4;
                            iArr2 = iArr;
                            arrayList2 = arrayList;
                            if (iArr2 != null) {
                            }
                            WinterFlowSerializerMicroservice winterFlowSerializerMicroservice1422 = winterFlowProcessorProtocol.WinterFlowCacheManagerAgent;
                            winterFlowSerializerMicroservice1422.getClass();
                            winterFlowProcessorProtocol.WinterFlowResponseEngine(winterFlowSerializerMicroservice1422, null, null);
                        }
                    }
                    winterFlowRouterTesting = winterFlowRouterTesting4;
                    winterFlowDecoratorVersion = winterFlowDecoratorVersion2;
                    WinterFlowSerializerMicroservice winterFlowSerializerMicroservice14222 = winterFlowProcessorProtocol.WinterFlowCacheManagerAgent;
                    winterFlowSerializerMicroservice14222.getClass();
                    winterFlowProcessorProtocol.WinterFlowResponseEngine(winterFlowSerializerMicroservice14222, null, null);
                }
            }
            WinterFlowRouterTesting winterFlowRouterTesting5 = winterFlowRouterTesting;
            WinterFlowRendererRenderer WinterFlowHookDataSource4 = winterFlowRouterTesting5.WinterFlowHookDataSource("composable");
            WinterFlowCacheException winterFlowCacheException3 = WinterFlowHookDataSource4 instanceof WinterFlowCacheException ? (WinterFlowCacheException) WinterFlowHookDataSource4 : null;
            if (winterFlowCacheException3 == null) {
                WinterFlowStackEngine WinterFlowConcurrencyThread = winterFlowResolverLibrary.WinterFlowConcurrencyThread();
                if (WinterFlowConcurrencyThread != null) {
                    WinterFlowConcurrencyThread.WinterFlowArrayNetwork = new WinterFlowPipelineResolver(winterFlowProtocolManager, winterFlowSerializerMicroservice, winterFlowMapperManager, winterFlowInvokerConsumer, winterFlowObjectSession, winterFlowObjectSession2, winterFlowObjectSession3, winterFlowObjectSession4, i, 2);
                    return;
                }
                return;
            }
            ?? r12 = winterFlowResolverLibrary;
            WinterFlowThreadPoolGateway WinterFlowArrayNetwork3 = WinterFlowFrameworkMechanism.WinterFlowArrayNetwork(winterFlowCacheException3.WinterFlowHookDataSource().WinterFlowVariableVersionControl, r12);
            Object WinterFlowSyntaxSubsystem = r12.WinterFlowSyntaxSubsystem();
            Object obj10 = WinterFlowModuleModule.WinterFlowRouterStructure;
            if (WinterFlowSyntaxSubsystem == obj10) {
                WinterFlowSyntaxSubsystem = new WinterFlowObjectHandler(0.0f);
                r12.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
            }
            WinterFlowObjectHandler winterFlowObjectHandler2 = (WinterFlowObjectHandler) WinterFlowSyntaxSubsystem;
            Object WinterFlowSyntaxSubsystem2 = r12.WinterFlowSyntaxSubsystem();
            if (WinterFlowSyntaxSubsystem2 == obj10) {
                WinterFlowSyntaxSubsystem2 = WinterFlowDecoratorUI.WinterFlowSerializerStructure(Boolean.FALSE);
                r12.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem2);
            }
            WinterFlowThreadPoolGateway winterFlowThreadPoolGateway4 = (WinterFlowThreadPoolGateway) WinterFlowSyntaxSubsystem2;
            boolean z3 = ((List) WinterFlowArrayNetwork3.getValue()).size() > 1;
            boolean WinterFlowVariableVersionControl3 = r12.WinterFlowVariableVersionControl(WinterFlowArrayNetwork3) | r12.WinterFlowUnitTestResponse(winterFlowCacheException3);
            Object WinterFlowSyntaxSubsystem3 = r12.WinterFlowSyntaxSubsystem();
            if (WinterFlowVariableVersionControl3 || WinterFlowSyntaxSubsystem3 == obj10) {
                WinterFlowCacheException winterFlowCacheException4 = winterFlowCacheException3;
                winterFlowRuntimeMechanism = new WinterFlowRuntimeMechanism(winterFlowCacheException4, WinterFlowArrayNetwork3, winterFlowObjectHandler2, winterFlowThreadPoolGateway4, (WinterFlowTransactionManagerLayer) null);
                winterFlowThreadPoolGateway = WinterFlowArrayNetwork3;
                winterFlowObjectHandler = winterFlowObjectHandler2;
                winterFlowThreadPoolGateway2 = winterFlowThreadPoolGateway4;
                winterFlowCacheException3 = winterFlowCacheException4;
                i2 = 1048576;
                r12.WinterFlowArrayFramework(winterFlowRuntimeMechanism);
            } else {
                winterFlowRuntimeMechanism = WinterFlowSyntaxSubsystem3;
                winterFlowThreadPoolGateway = WinterFlowArrayNetwork3;
                winterFlowObjectHandler = winterFlowObjectHandler2;
                winterFlowThreadPoolGateway2 = winterFlowThreadPoolGateway4;
                i2 = 1048576;
            }
            WinterFlowSoftwareException.WinterFlowResponseEngine(z3, (WinterFlowEventEvent) winterFlowRuntimeMechanism, r12, 0);
            WinterFlowDecoratorVersion winterFlowDecoratorVersion3 = winterFlowDecoratorVersion;
            boolean WinterFlowUnitTestResponse3 = r12.WinterFlowUnitTestResponse(winterFlowProtocolManager) | r12.WinterFlowUnitTestResponse(winterFlowDecoratorVersion3);
            Object WinterFlowSyntaxSubsystem4 = r12.WinterFlowSyntaxSubsystem();
            if (WinterFlowUnitTestResponse3 || WinterFlowSyntaxSubsystem4 == obj10) {
                WinterFlowSyntaxSubsystem4 = new WinterFlowRouterCompiler(21, winterFlowProtocolManager, winterFlowDecoratorVersion3);
                r12.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem4);
            }
            WinterFlowSoftwareException.WinterFlowHookDataSource(winterFlowDecoratorVersion3, (WinterFlowObjectSession) WinterFlowSyntaxSubsystem4, r12);
            WinterFlowDecoratorPlatform WinterFlowSyntax3 = WinterFlowPackageProcess.WinterFlowSyntax(r12);
            WinterFlowThreadPoolGateway WinterFlowArrayNetwork4 = WinterFlowFrameworkMechanism.WinterFlowArrayNetwork(winterFlowProcessorProtocol.WinterFlowSyntax, r12);
            Object WinterFlowSyntaxSubsystem5 = r12.WinterFlowSyntaxSubsystem();
            if (WinterFlowSyntaxSubsystem5 == obj10) {
                WinterFlowSyntaxSubsystem5 = WinterFlowInheritanceConcurrency.WinterFlowHookDataSource(new WinterFlowAPISystem(10, WinterFlowArrayNetwork4));
                r12.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem5);
            }
            WinterFlowBatchCacheManager winterFlowBatchCacheManager2 = (WinterFlowBatchCacheManager) WinterFlowSyntaxSubsystem5;
            WinterFlowLibrarySessionManager winterFlowLibrarySessionManager3 = (WinterFlowLibrarySessionManager) WinterFlowSerializerUtility.WinterFlowModuleService((List) winterFlowBatchCacheManager2.getValue());
            Object WinterFlowSyntaxSubsystem6 = r12.WinterFlowSyntaxSubsystem();
            if (WinterFlowSyntaxSubsystem6 == obj10) {
                int i33 = WinterFlowVariableStrategy.WinterFlowRouterStructure;
                WinterFlowSyntaxSubsystem6 = new WinterFlowSessionComponent(6);
                r12.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem6);
            }
            final WinterFlowSessionComponent winterFlowSessionComponent2 = (WinterFlowSessionComponent) WinterFlowSyntaxSubsystem6;
            if (winterFlowLibrarySessionManager3 != null) {
                r12.WinterFlowCompilerDataSource(-1797563167);
                boolean WinterFlowUnitTestResponse4 = r12.WinterFlowUnitTestResponse(winterFlowCacheException3) | ((((i9 & 3670016) ^ 1572864) > i2 && r12.WinterFlowVariableVersionControl(winterFlowObjectSession3)) || (i9 & 1572864) == i2) | ((i9 & 57344) == 16384);
                Object WinterFlowSyntaxSubsystem7 = r12.WinterFlowSyntaxSubsystem();
                if (WinterFlowUnitTestResponse4 || WinterFlowSyntaxSubsystem7 == obj10) {
                    final int i34 = 1;
                    winterFlowRouterTesting3 = winterFlowRouterTesting5;
                    final WinterFlowCacheException winterFlowCacheException5 = winterFlowCacheException3;
                    i3 = i9;
                    WinterFlowObjectSession winterFlowObjectSession6 = new WinterFlowObjectSession() { // from class: com.google.android.datatransport.WinterFlowVersionManager
                        @Override // com.google.android.datatransport.WinterFlowObjectSession
                        public final Object WinterFlowUnitTestResponse(Object obj11) {
                            int i35 = i34;
                            WinterFlowThreadPoolGateway winterFlowThreadPoolGateway5 = winterFlowThreadPoolGateway2;
                            WinterFlowObjectSession winterFlowObjectSession7 = winterFlowObjectSession;
                            WinterFlowObjectSession winterFlowObjectSession8 = winterFlowObjectSession3;
                            WinterFlowCacheException winterFlowCacheException6 = winterFlowCacheException5;
                            WinterFlowSessionManagerRequest winterFlowSessionManagerRequest = (WinterFlowSessionManagerRequest) obj11;
                            switch (i35) {
                                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                    WinterFlowServerLayer winterFlowServerLayer6 = ((WinterFlowLibrarySessionManager) winterFlowSessionManagerRequest.WinterFlowRouterStructure()).WinterFlowTransactionManagerStrategy;
                                    winterFlowServerLayer6.getClass();
                                    WinterFlowDatabaseSchemaFunction winterFlowDatabaseSchemaFunction = (WinterFlowDatabaseSchemaFunction) winterFlowServerLayer6;
                                    if (((Boolean) winterFlowCacheException6.WinterFlowCacheManagerAgent.getValue()).booleanValue() || ((Boolean) winterFlowThreadPoolGateway5.getValue()).booleanValue()) {
                                        int i36 = WinterFlowServerLayer.WinterFlowSyntax;
                                        for (WinterFlowServerLayer winterFlowServerLayer7 : WinterFlowHandlerWebsocket.WinterFlowMapperProtocol(winterFlowDatabaseSchemaFunction)) {
                                        }
                                        return (WinterFlowInvokerOrchestration) winterFlowObjectSession8.WinterFlowUnitTestResponse(winterFlowSessionManagerRequest);
                                    }
                                    int i37 = WinterFlowServerLayer.WinterFlowSyntax;
                                    for (WinterFlowServerLayer winterFlowServerLayer8 : WinterFlowHandlerWebsocket.WinterFlowMapperProtocol(winterFlowDatabaseSchemaFunction)) {
                                    }
                                    return (WinterFlowInvokerOrchestration) winterFlowObjectSession7.WinterFlowUnitTestResponse(winterFlowSessionManagerRequest);
                                default:
                                    WinterFlowServerLayer winterFlowServerLayer9 = ((WinterFlowLibrarySessionManager) winterFlowSessionManagerRequest.WinterFlowCacheManagerAgent()).WinterFlowTransactionManagerStrategy;
                                    winterFlowServerLayer9.getClass();
                                    WinterFlowDatabaseSchemaFunction winterFlowDatabaseSchemaFunction2 = (WinterFlowDatabaseSchemaFunction) winterFlowServerLayer9;
                                    if (((Boolean) winterFlowCacheException6.WinterFlowCacheManagerAgent.getValue()).booleanValue() || ((Boolean) winterFlowThreadPoolGateway5.getValue()).booleanValue()) {
                                        int i38 = WinterFlowServerLayer.WinterFlowSyntax;
                                        for (WinterFlowServerLayer winterFlowServerLayer10 : WinterFlowHandlerWebsocket.WinterFlowMapperProtocol(winterFlowDatabaseSchemaFunction2)) {
                                        }
                                        return (WinterFlowProxyLayer) winterFlowObjectSession8.WinterFlowUnitTestResponse(winterFlowSessionManagerRequest);
                                    }
                                    int i39 = WinterFlowServerLayer.WinterFlowSyntax;
                                    for (WinterFlowServerLayer winterFlowServerLayer11 : WinterFlowHandlerWebsocket.WinterFlowMapperProtocol(winterFlowDatabaseSchemaFunction2)) {
                                    }
                                    return (WinterFlowProxyLayer) winterFlowObjectSession7.WinterFlowUnitTestResponse(winterFlowSessionManagerRequest);
                            }
                        }
                    };
                    r12.WinterFlowArrayFramework(winterFlowObjectSession6);
                    WinterFlowSyntaxSubsystem7 = winterFlowObjectSession6;
                } else {
                    winterFlowRouterTesting3 = winterFlowRouterTesting5;
                    i3 = i9;
                }
                WinterFlowObjectSession winterFlowObjectSession7 = (WinterFlowObjectSession) WinterFlowSyntaxSubsystem7;
                boolean WinterFlowUnitTestResponse5 = r12.WinterFlowUnitTestResponse(winterFlowCacheException3) | ((((29360128 & i3) ^ 12582912) > 8388608 && r12.WinterFlowVariableVersionControl(winterFlowObjectSession4)) || (i3 & 12582912) == 8388608) | ((458752 & i3) == 131072);
                Object WinterFlowSyntaxSubsystem8 = r12.WinterFlowSyntaxSubsystem();
                if (WinterFlowUnitTestResponse5 || WinterFlowSyntaxSubsystem8 == obj10) {
                    final int i35 = 0;
                    winterFlowCacheException = winterFlowCacheException3;
                    winterFlowObjectSession5 = winterFlowObjectSession7;
                    obj = new WinterFlowObjectSession() { // from class: com.google.android.datatransport.WinterFlowVersionManager
                        @Override // com.google.android.datatransport.WinterFlowObjectSession
                        public final Object WinterFlowUnitTestResponse(Object obj11) {
                            int i352 = i35;
                            WinterFlowThreadPoolGateway winterFlowThreadPoolGateway5 = winterFlowThreadPoolGateway2;
                            WinterFlowObjectSession winterFlowObjectSession72 = winterFlowObjectSession2;
                            WinterFlowObjectSession winterFlowObjectSession8 = winterFlowObjectSession4;
                            WinterFlowCacheException winterFlowCacheException6 = winterFlowCacheException;
                            WinterFlowSessionManagerRequest winterFlowSessionManagerRequest = (WinterFlowSessionManagerRequest) obj11;
                            switch (i352) {
                                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                    WinterFlowServerLayer winterFlowServerLayer6 = ((WinterFlowLibrarySessionManager) winterFlowSessionManagerRequest.WinterFlowRouterStructure()).WinterFlowTransactionManagerStrategy;
                                    winterFlowServerLayer6.getClass();
                                    WinterFlowDatabaseSchemaFunction winterFlowDatabaseSchemaFunction = (WinterFlowDatabaseSchemaFunction) winterFlowServerLayer6;
                                    if (((Boolean) winterFlowCacheException6.WinterFlowCacheManagerAgent.getValue()).booleanValue() || ((Boolean) winterFlowThreadPoolGateway5.getValue()).booleanValue()) {
                                        int i36 = WinterFlowServerLayer.WinterFlowSyntax;
                                        for (WinterFlowServerLayer winterFlowServerLayer7 : WinterFlowHandlerWebsocket.WinterFlowMapperProtocol(winterFlowDatabaseSchemaFunction)) {
                                        }
                                        return (WinterFlowInvokerOrchestration) winterFlowObjectSession8.WinterFlowUnitTestResponse(winterFlowSessionManagerRequest);
                                    }
                                    int i37 = WinterFlowServerLayer.WinterFlowSyntax;
                                    for (WinterFlowServerLayer winterFlowServerLayer8 : WinterFlowHandlerWebsocket.WinterFlowMapperProtocol(winterFlowDatabaseSchemaFunction)) {
                                    }
                                    return (WinterFlowInvokerOrchestration) winterFlowObjectSession72.WinterFlowUnitTestResponse(winterFlowSessionManagerRequest);
                                default:
                                    WinterFlowServerLayer winterFlowServerLayer9 = ((WinterFlowLibrarySessionManager) winterFlowSessionManagerRequest.WinterFlowCacheManagerAgent()).WinterFlowTransactionManagerStrategy;
                                    winterFlowServerLayer9.getClass();
                                    WinterFlowDatabaseSchemaFunction winterFlowDatabaseSchemaFunction2 = (WinterFlowDatabaseSchemaFunction) winterFlowServerLayer9;
                                    if (((Boolean) winterFlowCacheException6.WinterFlowCacheManagerAgent.getValue()).booleanValue() || ((Boolean) winterFlowThreadPoolGateway5.getValue()).booleanValue()) {
                                        int i38 = WinterFlowServerLayer.WinterFlowSyntax;
                                        for (WinterFlowServerLayer winterFlowServerLayer10 : WinterFlowHandlerWebsocket.WinterFlowMapperProtocol(winterFlowDatabaseSchemaFunction2)) {
                                        }
                                        return (WinterFlowProxyLayer) winterFlowObjectSession8.WinterFlowUnitTestResponse(winterFlowSessionManagerRequest);
                                    }
                                    int i39 = WinterFlowServerLayer.WinterFlowSyntax;
                                    for (WinterFlowServerLayer winterFlowServerLayer11 : WinterFlowHandlerWebsocket.WinterFlowMapperProtocol(winterFlowDatabaseSchemaFunction2)) {
                                    }
                                    return (WinterFlowProxyLayer) winterFlowObjectSession72.WinterFlowUnitTestResponse(winterFlowSessionManagerRequest);
                            }
                        }
                    };
                    r12.WinterFlowArrayFramework(obj);
                } else {
                    obj = WinterFlowSyntaxSubsystem8;
                    winterFlowCacheException = winterFlowCacheException3;
                    winterFlowObjectSession5 = winterFlowObjectSession7;
                }
                final WinterFlowObjectSession winterFlowObjectSession8 = (WinterFlowObjectSession) obj;
                boolean z4 = (234881024 & i3) == 67108864;
                Object WinterFlowSyntaxSubsystem9 = r12.WinterFlowSyntaxSubsystem();
                if (z4 || WinterFlowSyntaxSubsystem9 == obj10) {
                    WinterFlowSyntaxSubsystem9 = new WinterFlowSessionJava(1);
                    r12.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem9);
                }
                final WinterFlowObjectSession winterFlowObjectSession9 = (WinterFlowObjectSession) WinterFlowSyntaxSubsystem9;
                Boolean bool = Boolean.TRUE;
                boolean WinterFlowUnitTestResponse6 = r12.WinterFlowUnitTestResponse(winterFlowCacheException);
                Object WinterFlowSyntaxSubsystem10 = r12.WinterFlowSyntaxSubsystem();
                if (WinterFlowUnitTestResponse6 || WinterFlowSyntaxSubsystem10 == obj10) {
                    WinterFlowSyntaxSubsystem10 = new WinterFlowRouterCompiler(20, winterFlowBatchCacheManager2, winterFlowCacheException);
                    r12.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem10);
                }
                WinterFlowSoftwareException.WinterFlowHookDataSource(bool, (WinterFlowObjectSession) WinterFlowSyntaxSubsystem10, r12);
                Object WinterFlowSyntaxSubsystem11 = r12.WinterFlowSyntaxSubsystem();
                if (WinterFlowSyntaxSubsystem11 == obj10) {
                    WinterFlowSyntaxSubsystem11 = new WinterFlowCacheManagerMicroservice(winterFlowLibrarySessionManager3);
                    r12.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem11);
                }
                WinterFlowCacheManagerMicroservice winterFlowCacheManagerMicroservice2 = (WinterFlowCacheManagerMicroservice) WinterFlowSyntaxSubsystem11;
                boolean WinterFlowVariableVersionControl4 = r12.WinterFlowVariableVersionControl(winterFlowCacheManagerMicroservice2);
                final WinterFlowThreadPoolGateway winterFlowThreadPoolGateway5 = winterFlowThreadPoolGateway2;
                Object WinterFlowSyntaxSubsystem12 = r12.WinterFlowSyntaxSubsystem();
                if (WinterFlowVariableVersionControl4 || WinterFlowSyntaxSubsystem12 == obj10) {
                    WinterFlowJSONModule WinterFlowVariableVersionControl5 = WinterFlowWorkerVersionControl.WinterFlowVariableVersionControl();
                    WinterFlowObjectSession WinterFlowVariableVersionControl6 = WinterFlowVariableVersionControl5 != null ? WinterFlowVariableVersionControl5.WinterFlowVariableVersionControl() : null;
                    winterFlowBatchCacheManager = winterFlowBatchCacheManager2;
                    WinterFlowJSONModule WinterFlowResponseEngine2 = WinterFlowWorkerVersionControl.WinterFlowResponseEngine(WinterFlowVariableVersionControl5);
                    try {
                        i4 = i3;
                        WinterFlowHandlerInvoker winterFlowHandlerInvoker2 = new WinterFlowHandlerInvoker(winterFlowCacheManagerMicroservice2, null, "entry");
                        WinterFlowWorkerVersionControl.WinterFlowBandwidthObject(WinterFlowVariableVersionControl5, WinterFlowResponseEngine2, WinterFlowVariableVersionControl6);
                        r12.WinterFlowArrayFramework(winterFlowHandlerInvoker2);
                        WinterFlowSyntaxSubsystem12 = winterFlowHandlerInvoker2;
                    } catch (Throwable th) {
                        WinterFlowWorkerVersionControl.WinterFlowBandwidthObject(WinterFlowVariableVersionControl5, WinterFlowResponseEngine2, WinterFlowVariableVersionControl6);
                        throw th;
                    }
                } else {
                    winterFlowBatchCacheManager = winterFlowBatchCacheManager2;
                    i4 = i3;
                }
                ?? r4 = (WinterFlowHandlerInvoker) WinterFlowSyntaxSubsystem12;
                if (winterFlowCacheManagerMicroservice2 != null) {
                    r12.WinterFlowCompilerDataSource(-1357590553);
                    Object WinterFlowSyntaxSubsystem13 = r12.WinterFlowSyntaxSubsystem();
                    if (WinterFlowSyntaxSubsystem13 == obj10) {
                        WinterFlowSyntaxSubsystem13 = WinterFlowSoftwareException.WinterFlowConsumerUserManager(r12);
                        r12.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem13);
                    }
                    WinterFlowAdapterResponse winterFlowAdapterResponse = (WinterFlowAdapterResponse) WinterFlowSyntaxSubsystem13;
                    boolean WinterFlowUnitTestResponse7 = r12.WinterFlowUnitTestResponse(winterFlowAdapterResponse) | r12.WinterFlowVariableVersionControl(winterFlowCacheManagerMicroservice2);
                    Object WinterFlowSyntaxSubsystem14 = r12.WinterFlowSyntaxSubsystem();
                    if (WinterFlowUnitTestResponse7 || WinterFlowSyntaxSubsystem14 == obj10) {
                        WinterFlowSyntaxSubsystem14 = new WinterFlowDataSourceVersionControl(1, winterFlowCacheManagerMicroservice2, winterFlowAdapterResponse, false);
                        r12.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem14);
                    }
                    WinterFlowSoftwareException.WinterFlowHookDataSource(winterFlowAdapterResponse, (WinterFlowObjectSession) WinterFlowSyntaxSubsystem14, r12);
                    Object value = winterFlowCacheManagerMicroservice2.WinterFlowCacheManagerAgent.getValue();
                    Object value2 = winterFlowCacheManagerMicroservice2.WinterFlowHookDataSource.getValue();
                    boolean WinterFlowVariableVersionControl7 = r12.WinterFlowVariableVersionControl(winterFlowCacheManagerMicroservice2);
                    Object WinterFlowSyntaxSubsystem15 = r12.WinterFlowSyntaxSubsystem();
                    if (WinterFlowVariableVersionControl7 || WinterFlowSyntaxSubsystem15 == obj10) {
                        r15 = null;
                        WinterFlowSyntaxSubsystem15 = new WinterFlowMapperJava(winterFlowCacheManagerMicroservice2, r15, 17);
                        r12.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem15);
                    } else {
                        r15 = null;
                    }
                    WinterFlowSoftwareException.WinterFlowVariableVersionControl(value, value2, (WinterFlowEventEvent) WinterFlowSyntaxSubsystem15, r12);
                    r12.WinterFlowBandwidthObject(false);
                } else {
                    r15 = null;
                    r12.WinterFlowCompilerDataSource(-1356604288);
                    r4.WinterFlowRouterStructure(winterFlowCacheManagerMicroservice2.WinterFlowHookDataSource.getValue(), r12, 0);
                    r12.WinterFlowBandwidthObject(false);
                }
                boolean WinterFlowVariableVersionControl8 = r12.WinterFlowVariableVersionControl(r4);
                Object WinterFlowSyntaxSubsystem16 = r12.WinterFlowSyntaxSubsystem();
                if (WinterFlowVariableVersionControl8 || WinterFlowSyntaxSubsystem16 == obj10) {
                    WinterFlowSyntaxSubsystem16 = new WinterFlowMicroserviceRequest(1, r4);
                    r12.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem16);
                }
                WinterFlowSoftwareException.WinterFlowHookDataSource(r4, (WinterFlowObjectSession) WinterFlowSyntaxSubsystem16, r12);
                if (((Boolean) winterFlowThreadPoolGateway5.getValue()).booleanValue()) {
                    r12.WinterFlowCompilerDataSource(-1795329152);
                    Float valueOf = Float.valueOf(winterFlowObjectHandler.WinterFlowRouterRouter());
                    boolean WinterFlowVariableVersionControl9 = r12.WinterFlowVariableVersionControl(winterFlowThreadPoolGateway) | r12.WinterFlowUnitTestResponse(winterFlowCacheManagerMicroservice2);
                    Object WinterFlowSyntaxSubsystem17 = r12.WinterFlowSyntaxSubsystem();
                    if (WinterFlowVariableVersionControl9 || WinterFlowSyntaxSubsystem17 == obj10) {
                        ?? r23 = r15;
                        WinterFlowSyntaxSubsystem17 = new WinterFlowMapperJava(winterFlowCacheManagerMicroservice2, winterFlowThreadPoolGateway, winterFlowObjectHandler, r23, 11);
                        r12.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem17);
                        winterFlowJavaSubsystem3 = r23;
                    } else {
                        winterFlowJavaSubsystem3 = r15;
                    }
                    WinterFlowSoftwareException.WinterFlowArrayNetwork((WinterFlowEventEvent) WinterFlowSyntaxSubsystem17, r12, valueOf);
                    r12.WinterFlowBandwidthObject(false);
                    winterFlowCacheManagerMicroservice = winterFlowCacheManagerMicroservice2;
                    winterFlowHandlerInvoker = r4;
                    winterFlowJavaSubsystem2 = winterFlowJavaSubsystem3;
                } else {
                    ?? r232 = r15;
                    r12.WinterFlowCompilerDataSource(-1794910745);
                    boolean WinterFlowUnitTestResponse8 = r12.WinterFlowUnitTestResponse(winterFlowCacheManagerMicroservice2) | r12.WinterFlowUnitTestResponse(winterFlowLibrarySessionManager3) | r12.WinterFlowVariableVersionControl(r4);
                    Object WinterFlowSyntaxSubsystem18 = r12.WinterFlowSyntaxSubsystem();
                    if (WinterFlowUnitTestResponse8 || WinterFlowSyntaxSubsystem18 == obj10) {
                        winterFlowCacheManagerMicroservice = winterFlowCacheManagerMicroservice2;
                        winterFlowHandlerInvoker = r4;
                        WinterFlowSyntaxSubsystem18 = new WinterFlowMiddlewareVariable(winterFlowCacheManagerMicroservice, winterFlowLibrarySessionManager3, winterFlowHandlerInvoker, r232, 3);
                        r12.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem18);
                    } else {
                        winterFlowCacheManagerMicroservice = winterFlowCacheManagerMicroservice2;
                        winterFlowHandlerInvoker = r4;
                    }
                    WinterFlowSoftwareException.WinterFlowArrayNetwork((WinterFlowEventEvent) WinterFlowSyntaxSubsystem18, r12, winterFlowLibrarySessionManager3);
                    r12.WinterFlowBandwidthObject(false);
                    winterFlowJavaSubsystem2 = r232;
                }
                boolean WinterFlowUnitTestResponse9 = r12.WinterFlowUnitTestResponse(winterFlowSessionComponent2) | r12.WinterFlowUnitTestResponse(winterFlowCacheException) | r12.WinterFlowVariableVersionControl(winterFlowObjectSession5) | r12.WinterFlowVariableVersionControl(winterFlowObjectSession8) | r12.WinterFlowVariableVersionControl(winterFlowObjectSession9);
                Object WinterFlowSyntaxSubsystem19 = r12.WinterFlowSyntaxSubsystem();
                if (WinterFlowUnitTestResponse9 || WinterFlowSyntaxSubsystem19 == obj10) {
                    final WinterFlowCacheException winterFlowCacheException6 = winterFlowCacheException;
                    final WinterFlowObjectSession winterFlowObjectSession10 = winterFlowObjectSession5;
                    winterFlowRouterTesting2 = winterFlowRouterTesting3;
                    final WinterFlowBatchCacheManager winterFlowBatchCacheManager3 = winterFlowBatchCacheManager;
                    obj2 = new WinterFlowObjectSession() { // from class: com.google.android.datatransport.WinterFlowBandwidthDatabase
                        @Override // com.google.android.datatransport.WinterFlowObjectSession
                        public final Object WinterFlowUnitTestResponse(Object obj11) {
                            WinterFlowSessionManagerRequest winterFlowSessionManagerRequest = (WinterFlowSessionManagerRequest) obj11;
                            float f = 0.0f;
                            if (!((List) winterFlowBatchCacheManager3.getValue()).contains(winterFlowSessionManagerRequest.WinterFlowRouterStructure())) {
                                return new WinterFlowBackendUI(WinterFlowProxyLayer.WinterFlowHookDataSource, WinterFlowInvokerOrchestration.WinterFlowHookDataSource, 0.0f, new WinterFlowQuerySystem(WinterFlowExceptionBackend.WinterFlowServiceUtility));
                            }
                            String str4 = ((WinterFlowLibrarySessionManager) winterFlowSessionManagerRequest.WinterFlowRouterStructure()).WinterFlowResponseEngine;
                            WinterFlowSessionComponent winterFlowSessionComponent3 = WinterFlowSessionComponent.this;
                            int WinterFlowHookDataSource5 = winterFlowSessionComponent3.WinterFlowHookDataSource(str4);
                            if (WinterFlowHookDataSource5 >= 0) {
                                f = winterFlowSessionComponent3.WinterFlowCacheManagerAgent[WinterFlowHookDataSource5];
                            } else {
                                winterFlowSessionComponent3.WinterFlowArrayNetwork(str4, 0.0f);
                            }
                            if (!((WinterFlowLibrarySessionManager) winterFlowSessionManagerRequest.WinterFlowCacheManagerAgent()).WinterFlowResponseEngine.equals(((WinterFlowLibrarySessionManager) winterFlowSessionManagerRequest.WinterFlowRouterStructure()).WinterFlowResponseEngine)) {
                                f = (((Boolean) winterFlowCacheException6.WinterFlowCacheManagerAgent.getValue()).booleanValue() || ((Boolean) winterFlowThreadPoolGateway5.getValue()).booleanValue()) ? f - 1.0f : f + 1.0f;
                            }
                            winterFlowSessionComponent3.WinterFlowArrayNetwork(((WinterFlowLibrarySessionManager) winterFlowSessionManagerRequest.WinterFlowCacheManagerAgent()).WinterFlowResponseEngine, f);
                            return new WinterFlowBackendUI((WinterFlowProxyLayer) winterFlowObjectSession10.WinterFlowUnitTestResponse(winterFlowSessionManagerRequest), (WinterFlowInvokerOrchestration) winterFlowObjectSession8.WinterFlowUnitTestResponse(winterFlowSessionManagerRequest), f, (WinterFlowQuerySystem) winterFlowObjectSession9.WinterFlowUnitTestResponse(winterFlowSessionManagerRequest));
                        }
                    };
                    winterFlowCacheException2 = winterFlowCacheException6;
                    winterFlowThreadPoolGateway3 = winterFlowThreadPoolGateway5;
                    winterFlowSessionComponent = winterFlowSessionComponent2;
                    r12.WinterFlowArrayFramework(obj2);
                } else {
                    winterFlowCacheException2 = winterFlowCacheException;
                    obj2 = WinterFlowSyntaxSubsystem19;
                    winterFlowSessionComponent = winterFlowSessionComponent2;
                    winterFlowRouterTesting2 = winterFlowRouterTesting3;
                    winterFlowThreadPoolGateway3 = winterFlowThreadPoolGateway5;
                }
                WinterFlowObjectSession winterFlowObjectSession11 = (WinterFlowObjectSession) obj2;
                Object WinterFlowSyntaxSubsystem20 = r12.WinterFlowSyntaxSubsystem();
                if (WinterFlowSyntaxSubsystem20 == obj10) {
                    WinterFlowSyntaxSubsystem20 = new WinterFlowSessionJava(3);
                    r12.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem20);
                }
                WinterFlowHandlerInvoker winterFlowHandlerInvoker3 = winterFlowHandlerInvoker;
                WinterFlowManagerRequest.WinterFlowRouterStructure(winterFlowHandlerInvoker3, winterFlowMapperManager, winterFlowObjectSession11, winterFlowInvokerConsumer, (WinterFlowObjectSession) WinterFlowSyntaxSubsystem20, WinterFlowManagerRequest.WinterFlowSyntaxSubsystem(820763100, new WinterFlowStrategyWorker(winterFlowCacheManagerMicroservice, winterFlowLibrarySessionManager3, WinterFlowSyntax3, winterFlowThreadPoolGateway3, winterFlowBatchCacheManager), r12), r12, ((i4 >> 3) & 112) | 221184 | (i4 & 7168));
                Object WinterFlowSyntax4 = winterFlowHandlerInvoker3.WinterFlowRouterStructure.WinterFlowSyntax();
                Object value3 = winterFlowHandlerInvoker3.WinterFlowArrayNetwork.getValue();
                boolean WinterFlowVariableVersionControl10 = r12.WinterFlowVariableVersionControl(winterFlowHandlerInvoker3) | r12.WinterFlowUnitTestResponse(winterFlowProtocolManager) | r12.WinterFlowUnitTestResponse(winterFlowLibrarySessionManager3) | r12.WinterFlowUnitTestResponse(winterFlowCacheException2) | r12.WinterFlowUnitTestResponse(winterFlowSessionComponent);
                Object WinterFlowSyntaxSubsystem21 = r12.WinterFlowSyntaxSubsystem();
                if (WinterFlowVariableVersionControl10 || WinterFlowSyntaxSubsystem21 == obj10) {
                    WinterFlowControllerSubsystem winterFlowControllerSubsystem = new WinterFlowControllerSubsystem(winterFlowHandlerInvoker3, winterFlowProtocolManager, winterFlowLibrarySessionManager3, winterFlowSessionComponent, winterFlowBatchCacheManager, winterFlowCacheException2, null);
                    r12.WinterFlowArrayFramework(winterFlowControllerSubsystem);
                    WinterFlowSyntaxSubsystem21 = winterFlowControllerSubsystem;
                }
                WinterFlowSoftwareException.WinterFlowVariableVersionControl(WinterFlowSyntax4, value3, (WinterFlowEventEvent) WinterFlowSyntaxSubsystem21, r12);
                r12.WinterFlowBandwidthObject(false);
                winterFlowJavaSubsystem = winterFlowJavaSubsystem2;
            } else {
                winterFlowRouterTesting2 = winterFlowRouterTesting5;
                winterFlowJavaSubsystem = null;
                r12.WinterFlowCompilerDataSource(-1789758886);
                r12.WinterFlowBandwidthObject(false);
            }
            WinterFlowRendererRenderer WinterFlowHookDataSource5 = winterFlowRouterTesting2.WinterFlowHookDataSource("dialog");
            WinterFlowJavaSubsystem winterFlowJavaSubsystem4 = WinterFlowHookDataSource5 instanceof WinterFlowJavaSubsystem ? (WinterFlowJavaSubsystem) WinterFlowHookDataSource5 : winterFlowJavaSubsystem;
            if (winterFlowJavaSubsystem4 == null) {
                WinterFlowStackEngine WinterFlowConcurrencyThread2 = r12.WinterFlowConcurrencyThread();
                if (WinterFlowConcurrencyThread2 != null) {
                    WinterFlowConcurrencyThread2.WinterFlowArrayNetwork = new WinterFlowPipelineResolver(winterFlowProtocolManager, winterFlowSerializerMicroservice, winterFlowMapperManager, winterFlowInvokerConsumer, winterFlowObjectSession, winterFlowObjectSession2, winterFlowObjectSession3, winterFlowObjectSession4, i, 0);
                    return;
                }
                return;
            }
            WinterFlowSoftwareException.WinterFlowRouterStructure(winterFlowJavaSubsystem4, r12, 0);
            winterFlowResolverLibrary2 = r12;
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread3 = winterFlowResolverLibrary2.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread3 != null) {
            WinterFlowConcurrencyThread3.WinterFlowArrayNetwork = new WinterFlowPipelineResolver(winterFlowProtocolManager, winterFlowSerializerMicroservice, winterFlowMapperManager, winterFlowInvokerConsumer, winterFlowObjectSession, winterFlowObjectSession2, winterFlowObjectSession3, winterFlowObjectSession4, i, 1);
        }
    }

    public static final WinterFlowProtocolPlatform WinterFlowUnitTestResponse() {
        return new WinterFlowProtocolPlatform(new Paint(7));
    }

    public static final long WinterFlowUserManagerUserManager(long j) {
        return (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    public static final Paint WinterFlowVariableBandwidth(WinterFlowProtocolPlatform winterFlowProtocolPlatform) {
        if (winterFlowProtocolPlatform == null) {
            WinterFlowThreadSessionManager.WinterFlowRouterStructure("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + WinterFlowListenerProtocol.WinterFlowRouterStructure(winterFlowProtocolPlatform.getClass()).WinterFlowHookDataSource());
        }
        return (Paint) winterFlowProtocolPlatform.WinterFlowHookDataSource;
    }

    public static final void WinterFlowVariableVersionControl(WinterFlowProtocolManager winterFlowProtocolManager, WinterFlowMapperManager winterFlowMapperManager, WinterFlowInvokerConsumer winterFlowInvokerConsumer, WinterFlowObjectSession winterFlowObjectSession, WinterFlowObjectSession winterFlowObjectSession2, WinterFlowObjectSession winterFlowObjectSession3, WinterFlowObjectSession winterFlowObjectSession4, WinterFlowObjectSession winterFlowObjectSession5, WinterFlowResolverLibrary winterFlowResolverLibrary, int i) {
        int i2;
        WinterFlowInvokerConsumer winterFlowInvokerConsumer2;
        WinterFlowObjectSession winterFlowObjectSession6;
        int i3;
        WinterFlowObjectSession winterFlowObjectSession7;
        WinterFlowObjectSession winterFlowObjectSession8;
        char c;
        WinterFlowObjectSession winterFlowObjectSession9;
        WinterFlowInvokerConsumer winterFlowInvokerConsumer3;
        WinterFlowObjectSession winterFlowObjectSession10;
        WinterFlowObjectSession winterFlowObjectSession11;
        winterFlowResolverLibrary.WinterFlowFrameworkTransaction(1840250294);
        int i4 = 2;
        if ((i & 6) == 0) {
            i2 = (winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowProtocolManager) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= winterFlowResolverLibrary.WinterFlowVariableVersionControl("MAIN") ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowMapperManager) ? 256 : 128;
        }
        int i5 = 1797120 | i2;
        if ((12582912 & i) == 0) {
            i5 = 5991424 | i2;
        }
        if ((100663296 & i) == 0) {
            i5 |= 33554432;
        }
        int i6 = 805306368 | i5;
        char c2 = winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowObjectSession5) ? (char) 4 : (char) 2;
        if ((306783379 & i6) == 306783378 && (c2 & 3) == 2 && winterFlowResolverLibrary.WinterFlowBackendCacheManager()) {
            winterFlowResolverLibrary.WinterFlowQueueService();
            winterFlowInvokerConsumer3 = winterFlowInvokerConsumer;
            winterFlowObjectSession8 = winterFlowObjectSession;
            winterFlowObjectSession11 = winterFlowObjectSession2;
            winterFlowObjectSession9 = winterFlowObjectSession3;
            winterFlowObjectSession10 = winterFlowObjectSession4;
        } else {
            winterFlowResolverLibrary.WinterFlowProxyStructure();
            int i7 = i & 1;
            int i8 = 0;
            WinterFlowThreadPoolProcess winterFlowThreadPoolProcess = WinterFlowModuleModule.WinterFlowRouterStructure;
            if (i7 == 0 || winterFlowResolverLibrary.WinterFlowResolverController()) {
                winterFlowInvokerConsumer2 = WinterFlowCacheUtility.WinterFlowUnitTestResponse;
                Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                if (WinterFlowSyntaxSubsystem == winterFlowThreadPoolProcess) {
                    WinterFlowSyntaxSubsystem = new WinterFlowSessionJava(i8);
                    winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
                }
                WinterFlowObjectSession winterFlowObjectSession12 = (WinterFlowObjectSession) WinterFlowSyntaxSubsystem;
                Object WinterFlowSyntaxSubsystem2 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                if (WinterFlowSyntaxSubsystem2 == winterFlowThreadPoolProcess) {
                    WinterFlowSyntaxSubsystem2 = new WinterFlowSessionJava(i4);
                    winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem2);
                }
                winterFlowObjectSession6 = (WinterFlowObjectSession) WinterFlowSyntaxSubsystem2;
                i3 = i6 & (-264241153);
                winterFlowObjectSession7 = winterFlowObjectSession6;
                winterFlowObjectSession8 = winterFlowObjectSession12;
                c = c2;
                winterFlowObjectSession9 = winterFlowObjectSession8;
            } else {
                winterFlowResolverLibrary.WinterFlowQueueService();
                winterFlowInvokerConsumer2 = winterFlowInvokerConsumer;
                winterFlowObjectSession8 = winterFlowObjectSession;
                winterFlowObjectSession6 = winterFlowObjectSession2;
                i3 = i6 & (-264241153);
                c = c2;
                winterFlowObjectSession9 = winterFlowObjectSession3;
                winterFlowObjectSession7 = winterFlowObjectSession4;
            }
            winterFlowResolverLibrary.WinterFlowOrchestrationSubsystem();
            boolean z = ((i3 & 112) == 32) | ((i3 & 57344) == 16384) | ((c & 14) == 4);
            Object WinterFlowSyntaxSubsystem3 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            if (z || WinterFlowSyntaxSubsystem3 == winterFlowThreadPoolProcess) {
                WinterFlowBatchOrchestration winterFlowBatchOrchestration = new WinterFlowBatchOrchestration(winterFlowProtocolManager.WinterFlowHookDataSource.WinterFlowVariableBandwidth);
                winterFlowObjectSession5.WinterFlowUnitTestResponse(winterFlowBatchOrchestration);
                WinterFlowSyntaxSubsystem3 = winterFlowBatchOrchestration.WinterFlowCacheManagerAgent();
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem3);
            }
            WinterFlowSerializerMicroservice winterFlowSerializerMicroservice = (WinterFlowSerializerMicroservice) WinterFlowSyntaxSubsystem3;
            int i9 = i3 & 8078;
            int i10 = i3 >> 3;
            int i11 = (i10 & 234881024) | i9 | (i10 & 57344) | (458752 & i10);
            winterFlowInvokerConsumer3 = winterFlowInvokerConsumer2;
            winterFlowObjectSession10 = winterFlowObjectSession7;
            winterFlowObjectSession11 = winterFlowObjectSession6;
            WinterFlowTransactionManagerStrategy(winterFlowProtocolManager, winterFlowSerializerMicroservice, winterFlowMapperManager, winterFlowInvokerConsumer3, winterFlowObjectSession8, winterFlowObjectSession11, winterFlowObjectSession9, winterFlowObjectSession10, winterFlowResolverLibrary, i11);
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread = winterFlowResolverLibrary.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread != null) {
            WinterFlowConcurrencyThread.WinterFlowArrayNetwork = new WinterFlowPipelineResolver(winterFlowProtocolManager, winterFlowMapperManager, winterFlowInvokerConsumer3, winterFlowObjectSession8, winterFlowObjectSession11, winterFlowObjectSession9, winterFlowObjectSession10, winterFlowObjectSession5, i);
        }
    }
}
