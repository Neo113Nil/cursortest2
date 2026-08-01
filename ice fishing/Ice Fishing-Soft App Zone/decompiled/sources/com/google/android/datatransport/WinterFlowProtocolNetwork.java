package com.google.android.datatransport;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewParent;
import com.icewinter.flow.winter.icecatch.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowProtocolNetwork {
    public static final long WinterFlowRouterStructure = Long.MIN_VALUE;

    public static final boolean WinterFlowArrayNetwork(float f, float f2, WinterFlowManagerCloud winterFlowManagerCloud) {
        float f3 = f - 0.005f;
        float f4 = f2 - 0.005f;
        float f5 = f + 0.005f;
        float f6 = f2 + 0.005f;
        WinterFlowManagerCloud WinterFlowRouterStructure2 = WinterFlowProviderAgent.WinterFlowRouterStructure();
        if (Float.isNaN(f3) || Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6)) {
            WinterFlowProviderAgent.WinterFlowHookDataSource("Invalid rectangle, make sure no value is NaN");
        }
        RectF rectF = WinterFlowRouterStructure2.WinterFlowHookDataSource;
        if (rectF == null) {
            rectF = new RectF();
            WinterFlowRouterStructure2.WinterFlowHookDataSource = rectF;
        }
        rectF.set(f3, f4, f5, f6);
        Path path = WinterFlowRouterStructure2.WinterFlowRouterStructure;
        RectF rectF2 = WinterFlowRouterStructure2.WinterFlowHookDataSource;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
        WinterFlowManagerCloud WinterFlowRouterStructure3 = WinterFlowProviderAgent.WinterFlowRouterStructure();
        WinterFlowRouterStructure3.WinterFlowArrayNetwork(winterFlowManagerCloud, WinterFlowRouterStructure2, 1);
        boolean isEmpty = WinterFlowRouterStructure3.WinterFlowRouterStructure.isEmpty();
        WinterFlowRouterStructure3.WinterFlowVariableVersionControl();
        WinterFlowRouterStructure2.WinterFlowVariableVersionControl();
        return !isEmpty;
    }

    public static final ViewParent WinterFlowCacheManagerAgent(View view) {
        view.getClass();
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final int WinterFlowHookDataSource(WinterFlowConcurrencyLayer winterFlowConcurrencyLayer, String str) {
        winterFlowConcurrencyLayer.getClass();
        int columnCount = winterFlowConcurrencyLayer.getColumnCount();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= columnCount) {
                i2 = -1;
                break;
            }
            if (str.equals(winterFlowConcurrencyLayer.getColumnName(i2))) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return i2;
        }
        String str2 = "`" + str + '`';
        int columnCount2 = winterFlowConcurrencyLayer.getColumnCount();
        while (true) {
            if (i >= columnCount2) {
                i = -1;
                break;
            }
            if (str2.equals(winterFlowConcurrencyLayer.getColumnName(i))) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return i;
        }
        return -1;
    }

    public static final Rect WinterFlowResponseEngine(WinterFlowLibraryInterface winterFlowLibraryInterface) {
        return new Rect(winterFlowLibraryInterface.WinterFlowRouterStructure, winterFlowLibraryInterface.WinterFlowHookDataSource, winterFlowLibraryInterface.WinterFlowCacheManagerAgent, winterFlowLibraryInterface.WinterFlowArrayNetwork);
    }

    public static final void WinterFlowRouterRouter(WinterFlowResolverLibrary winterFlowResolverLibrary, WinterFlowObjectSession winterFlowObjectSession) {
        winterFlowResolverLibrary.WinterFlowHookDataSource(new WinterFlowSessionManagerSystem(11, winterFlowObjectSession), WinterFlowAlgorithmSession.WinterFlowRouterStructure);
    }

    public static final void WinterFlowRouterStructure(WinterFlowResolverLibrary winterFlowResolverLibrary, WinterFlowMapperManager winterFlowMapperManager) {
        WinterFlowRefactoringSubsystem winterFlowRefactoringSubsystem = WinterFlowRefactoringSubsystem.WinterFlowUnitTestResponse;
        int hashCode = Long.hashCode(winterFlowResolverLibrary.WinterFlowConfiguration);
        WinterFlowMapperManager WinterFlowUserManagerUserManager = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary, winterFlowMapperManager);
        WinterFlowConfigurationProcess WinterFlowTransactionAgent = winterFlowResolverLibrary.WinterFlowTransactionAgent();
        WinterFlowBandwidthAgent.WinterFlowCacheManagerAgent.getClass();
        WinterFlowConfigurationRequest winterFlowConfigurationRequest = WinterFlowEventEmitterDeserialization.WinterFlowHookDataSource;
        winterFlowResolverLibrary.WinterFlowModuleAgent();
        if (winterFlowResolverLibrary.WinterFlowProxyStructure) {
            winterFlowResolverLibrary.WinterFlowResponseEngine(winterFlowConfigurationRequest);
        } else {
            winterFlowResolverLibrary.WinterFlowParserPipeline();
        }
        WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowVariableVersionControl, winterFlowResolverLibrary, winterFlowRefactoringSubsystem);
        WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowArrayNetwork, winterFlowResolverLibrary, WinterFlowTransactionAgent);
        WinterFlowRouterRouter(winterFlowResolverLibrary, WinterFlowEventEmitterDeserialization.WinterFlowUnitTestResponse);
        WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowCacheManagerAgent, winterFlowResolverLibrary, WinterFlowUserManagerUserManager);
        WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowTransactionManagerStrategy, winterFlowResolverLibrary, Integer.valueOf(hashCode));
        winterFlowResolverLibrary.WinterFlowBandwidthObject(true);
    }

    public static void WinterFlowServerProtocol(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? WinterFlowThreadListener("start index", i, i3) : (i2 < 0 || i2 > i3) ? WinterFlowThreadListener("end index", i2, i3) : WinterFlowHookProcessor.WinterFlowSerializerStructure("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static final void WinterFlowSyntax(WinterFlowEventEvent winterFlowEventEvent, WinterFlowResolverLibrary winterFlowResolverLibrary, Object obj) {
        if (winterFlowResolverLibrary.WinterFlowProxyStructure || !WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowResolverLibrary.WinterFlowSyntaxSubsystem(), obj)) {
            winterFlowResolverLibrary.WinterFlowArrayFramework(obj);
            winterFlowResolverLibrary.WinterFlowHookDataSource(winterFlowEventEvent, obj);
        }
    }

    public static String WinterFlowThreadListener(String str, int i, int i2) {
        if (i < 0) {
            return WinterFlowHookProcessor.WinterFlowSerializerStructure("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return WinterFlowHookProcessor.WinterFlowSerializerStructure("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 15);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void WinterFlowTransactionAgent(int i, int i2) {
        String WinterFlowSerializerStructure;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                WinterFlowSerializerStructure = WinterFlowHookProcessor.WinterFlowSerializerStructure("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 15);
                    sb.append("negative size: ");
                    sb.append(i2);
                    throw new IllegalArgumentException(sb.toString());
                }
                WinterFlowSerializerStructure = WinterFlowHookProcessor.WinterFlowSerializerStructure("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(WinterFlowSerializerStructure);
        }
    }

    public static final List WinterFlowTransactionManagerStrategy(WinterFlowConcurrencyLayer winterFlowConcurrencyLayer) {
        int WinterFlowHookDataSource = WinterFlowHookDataSource(winterFlowConcurrencyLayer, "id");
        int WinterFlowHookDataSource2 = WinterFlowHookDataSource(winterFlowConcurrencyLayer, "seq");
        int WinterFlowHookDataSource3 = WinterFlowHookDataSource(winterFlowConcurrencyLayer, "from");
        int WinterFlowHookDataSource4 = WinterFlowHookDataSource(winterFlowConcurrencyLayer, "to");
        WinterFlowUserManagerResolver WinterFlowBatchUI = WinterFlowUnitTestLibrary.WinterFlowBatchUI();
        while (winterFlowConcurrencyLayer.WinterFlowBackendCacheManager()) {
            WinterFlowBatchUI.add(new WinterFlowLoaderService((int) winterFlowConcurrencyLayer.getLong(WinterFlowHookDataSource), (int) winterFlowConcurrencyLayer.getLong(WinterFlowHookDataSource2), winterFlowConcurrencyLayer.WinterFlowVariableVersionControl(WinterFlowHookDataSource3), winterFlowConcurrencyLayer.WinterFlowVariableVersionControl(WinterFlowHookDataSource4)));
        }
        return WinterFlowSerializerUtility.WinterFlowTestingTransactionManager(WinterFlowUnitTestLibrary.WinterFlowServerProtocol(WinterFlowBatchUI));
    }

    public static final WinterFlowGatewayNode WinterFlowUnitTestResponse(WinterFlowDeserializationHandler winterFlowDeserializationHandler, String str, boolean z) {
        WinterFlowConcurrencyLayer WinterFlowArrayHelper = winterFlowDeserializationHandler.WinterFlowArrayHelper("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int WinterFlowHookDataSource = WinterFlowHookDataSource(WinterFlowArrayHelper, "seqno");
            int WinterFlowHookDataSource2 = WinterFlowHookDataSource(WinterFlowArrayHelper, "cid");
            int WinterFlowHookDataSource3 = WinterFlowHookDataSource(WinterFlowArrayHelper, "name");
            int WinterFlowHookDataSource4 = WinterFlowHookDataSource(WinterFlowArrayHelper, "desc");
            if (WinterFlowHookDataSource != -1 && WinterFlowHookDataSource2 != -1 && WinterFlowHookDataSource3 != -1 && WinterFlowHookDataSource4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (WinterFlowArrayHelper.WinterFlowBackendCacheManager()) {
                    if (((int) WinterFlowArrayHelper.getLong(WinterFlowHookDataSource2)) >= 0) {
                        int i = (int) WinterFlowArrayHelper.getLong(WinterFlowHookDataSource);
                        String WinterFlowVariableVersionControl = WinterFlowArrayHelper.WinterFlowVariableVersionControl(WinterFlowHookDataSource3);
                        String str2 = WinterFlowArrayHelper.getLong(WinterFlowHookDataSource4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i), WinterFlowVariableVersionControl);
                        linkedHashMap2.put(Integer.valueOf(i), str2);
                    }
                }
                List WinterFlowUIThreadPool = WinterFlowSerializerUtility.WinterFlowUIThreadPool(linkedHashMap.entrySet(), new WinterFlowClassSystem(8));
                ArrayList arrayList = new ArrayList(WinterFlowModuleThread.WinterFlowModuleAgent(WinterFlowUIThreadPool, 10));
                Iterator it = WinterFlowUIThreadPool.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List WinterFlowProtocolConsumer = WinterFlowSerializerUtility.WinterFlowProtocolConsumer(arrayList);
                List WinterFlowUIThreadPool2 = WinterFlowSerializerUtility.WinterFlowUIThreadPool(linkedHashMap2.entrySet(), new WinterFlowClassSystem(9));
                ArrayList arrayList2 = new ArrayList(WinterFlowModuleThread.WinterFlowModuleAgent(WinterFlowUIThreadPool2, 10));
                Iterator it2 = WinterFlowUIThreadPool2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                WinterFlowGatewayNode winterFlowGatewayNode = new WinterFlowGatewayNode(str, z, WinterFlowProtocolConsumer, WinterFlowSerializerUtility.WinterFlowProtocolConsumer(arrayList2));
                WinterFlowCacheRuntime.WinterFlowThreadListener(WinterFlowArrayHelper, null);
                return winterFlowGatewayNode;
            }
            WinterFlowCacheRuntime.WinterFlowThreadListener(WinterFlowArrayHelper, null);
            return null;
        } finally {
        }
    }

    public static final boolean WinterFlowVariableVersionControl(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (intBitsToFloat2 * intBitsToFloat2)) + ((f5 * f5) / (intBitsToFloat * intBitsToFloat)) <= 1.0f;
    }
}
