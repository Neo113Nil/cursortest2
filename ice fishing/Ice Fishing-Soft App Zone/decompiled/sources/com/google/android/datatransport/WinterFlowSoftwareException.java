package com.google.android.datatransport;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import com.android.installreferrer.api.InstallReferrerClient;
import com.icewinter.flow.winter.icecatch.R;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowSoftwareException {
    public static Method WinterFlowRouterRouter;
    public static boolean WinterFlowSyntax;
    public static Method WinterFlowUnitTestResponse;
    public static final Object WinterFlowRouterStructure = new Object();
    public static final WinterFlowSyntaxModule WinterFlowHookDataSource = new WinterFlowSyntaxModule();
    public static final char[] WinterFlowCacheManagerAgent = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final byte[] WinterFlowArrayNetwork = {112, 114, 111, 0};
    public static final byte[] WinterFlowVariableVersionControl = {112, 114, 109, 0};
    public static final WinterFlowSessionManagerAgent WinterFlowTransactionManagerStrategy = new WinterFlowSessionManagerAgent(26);

    public static void WinterFlowAPIFrontend(ByteArrayOutputStream byteArrayOutputStream, WinterFlowNodeNetwork winterFlowNodeNetwork) {
        WinterFlowVersionControlModule(byteArrayOutputStream, winterFlowNodeNetwork);
        int i = winterFlowNodeNetwork.WinterFlowUnitTestResponse;
        int[] iArr = winterFlowNodeNetwork.WinterFlowRouterRouter;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            WinterFlowServerManager.WinterFlowCompilerHandler(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : winterFlowNodeNetwork.WinterFlowSyntax.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i5 = intValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i6 = intValue + i;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static final long WinterFlowArrayHelper(long j) {
        long j2 = (j << 1) + 1;
        WinterFlowAlgorithmProtocol.WinterFlowVariableVersionControl.getClass();
        int i = WinterFlowDataSourceIDE.WinterFlowRouterStructure;
        return j2;
    }

    public static final void WinterFlowArrayNetwork(WinterFlowEventEvent winterFlowEventEvent, WinterFlowResolverLibrary winterFlowResolverLibrary, Object obj) {
        WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice = winterFlowResolverLibrary.WinterFlowCacheTool;
        boolean WinterFlowVariableVersionControl2 = winterFlowResolverLibrary.WinterFlowVariableVersionControl(obj);
        Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
        if (WinterFlowVariableVersionControl2 || WinterFlowSyntaxSubsystem == WinterFlowModuleModule.WinterFlowRouterStructure) {
            WinterFlowSyntaxSubsystem = new WinterFlowServicePlatform(winterFlowEncryptionMicroservice, winterFlowEventEvent);
            winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
        }
    }

    public static byte[] WinterFlowBackendCacheManager(WinterFlowNodeNetwork[] winterFlowNodeNetworkArr, byte[] bArr) {
        int i = 0;
        int i2 = 0;
        for (WinterFlowNodeNetwork winterFlowNodeNetwork : winterFlowNodeNetworkArr) {
            i2 += ((((winterFlowNodeNetwork.WinterFlowUnitTestResponse * 2) + 7) & (-8)) / 8) + (winterFlowNodeNetwork.WinterFlowVariableVersionControl * 2) + WinterFlowCacheManagerListener(winterFlowNodeNetwork.WinterFlowRouterStructure, winterFlowNodeNetwork.WinterFlowHookDataSource, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + winterFlowNodeNetwork.WinterFlowTransactionManagerStrategy;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        if (Arrays.equals(bArr, WinterFlowEncryptionSubsystem.WinterFlowBandwidthObject)) {
            int length = winterFlowNodeNetworkArr.length;
            while (i < length) {
                WinterFlowNodeNetwork winterFlowNodeNetwork2 = winterFlowNodeNetworkArr[i];
                WinterFlowBandwidth(byteArrayOutputStream, winterFlowNodeNetwork2, WinterFlowCacheManagerListener(winterFlowNodeNetwork2.WinterFlowRouterStructure, winterFlowNodeNetwork2.WinterFlowHookDataSource, bArr));
                WinterFlowAPIFrontend(byteArrayOutputStream, winterFlowNodeNetwork2);
                i++;
            }
        } else {
            for (WinterFlowNodeNetwork winterFlowNodeNetwork3 : winterFlowNodeNetworkArr) {
                WinterFlowBandwidth(byteArrayOutputStream, winterFlowNodeNetwork3, WinterFlowCacheManagerListener(winterFlowNodeNetwork3.WinterFlowRouterStructure, winterFlowNodeNetwork3.WinterFlowHookDataSource, bArr));
            }
            int length2 = winterFlowNodeNetworkArr.length;
            while (i < length2) {
                WinterFlowAPIFrontend(byteArrayOutputStream, winterFlowNodeNetworkArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == i2) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i2);
    }

    public static void WinterFlowBandwidth(ByteArrayOutputStream byteArrayOutputStream, WinterFlowNodeNetwork winterFlowNodeNetwork, String str) {
        Charset charset = StandardCharsets.UTF_8;
        WinterFlowServerManager.WinterFlowCompilerHandler(byteArrayOutputStream, str.getBytes(charset).length);
        WinterFlowServerManager.WinterFlowCompilerHandler(byteArrayOutputStream, winterFlowNodeNetwork.WinterFlowVariableVersionControl);
        WinterFlowServerManager.WinterFlowTestingNode(byteArrayOutputStream, winterFlowNodeNetwork.WinterFlowTransactionManagerStrategy, 4);
        WinterFlowServerManager.WinterFlowTestingNode(byteArrayOutputStream, winterFlowNodeNetwork.WinterFlowCacheManagerAgent, 4);
        WinterFlowServerManager.WinterFlowTestingNode(byteArrayOutputStream, winterFlowNodeNetwork.WinterFlowUnitTestResponse, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static WinterFlowMapperManager WinterFlowBandwidthObject(WinterFlowMapperManager winterFlowMapperManager, WinterFlowTransactionConsumer winterFlowTransactionConsumer) {
        return winterFlowMapperManager.WinterFlowCacheManagerAgent(new WinterFlowTransactionCacheManager(0L, winterFlowTransactionConsumer, WinterFlowCacheRuntime.WinterFlowTransactionAgent, 1));
    }

    public static final void WinterFlowCacheManagerAgent(Object obj, Object obj2, WinterFlowObjectSession winterFlowObjectSession, WinterFlowResolverLibrary winterFlowResolverLibrary) {
        boolean WinterFlowVariableVersionControl2 = winterFlowResolverLibrary.WinterFlowVariableVersionControl(obj) | winterFlowResolverLibrary.WinterFlowVariableVersionControl(obj2);
        Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
        if (WinterFlowVariableVersionControl2 || WinterFlowSyntaxSubsystem == WinterFlowModuleModule.WinterFlowRouterStructure) {
            WinterFlowSyntaxSubsystem = new WinterFlowDatabaseSchemaMicroservice(winterFlowObjectSession);
            winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
        }
    }

    public static void WinterFlowCacheManagerException(ByteArrayOutputStream byteArrayOutputStream, int i, WinterFlowNodeNetwork winterFlowNodeNetwork) {
        int i2 = winterFlowNodeNetwork.WinterFlowUnitTestResponse;
        byte[] bArr = new byte[(((Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
        for (Map.Entry entry : winterFlowNodeNetwork.WinterFlowSyntax.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & intValue2) == i4) {
                        int i5 = (i3 * i2) + intValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static String WinterFlowCacheManagerListener(String str, String str2, byte[] bArr) {
        byte[] bArr2 = WinterFlowEncryptionSubsystem.WinterFlowOrchestrationSubsystem;
        byte[] bArr3 = WinterFlowEncryptionSubsystem.WinterFlowConcurrencyThread;
        String str3 = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder(str);
                sb.append((Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!");
                sb.append(str2);
                return sb.toString();
            }
        }
        return str2;
    }

    public static WinterFlowNodeNetwork[] WinterFlowCacheTool(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, WinterFlowNodeNetwork[] winterFlowNodeNetworkArr) {
        WinterFlowNodeNetwork winterFlowNodeNetwork;
        if (byteArrayInputStream.available() == 0) {
            return new WinterFlowNodeNetwork[0];
        }
        if (i != winterFlowNodeNetworkArr.length) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i2 = 0; i2 < i; i2++) {
            WinterFlowServerManager.WinterFlowConfigurationSubsystem(byteArrayInputStream, 2);
            String str = new String(WinterFlowServerManager.WinterFlowArrayHelper(byteArrayInputStream, (int) WinterFlowServerManager.WinterFlowConfigurationSubsystem(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long WinterFlowConfigurationSubsystem = WinterFlowServerManager.WinterFlowConfigurationSubsystem(byteArrayInputStream, 4);
            int WinterFlowConfigurationSubsystem2 = (int) WinterFlowServerManager.WinterFlowConfigurationSubsystem(byteArrayInputStream, 2);
            if (winterFlowNodeNetworkArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                for (int i3 = 0; i3 < winterFlowNodeNetworkArr.length; i3++) {
                    if (winterFlowNodeNetworkArr[i3].WinterFlowHookDataSource.equals(substring)) {
                        winterFlowNodeNetwork = winterFlowNodeNetworkArr[i3];
                        break;
                    }
                }
            }
            winterFlowNodeNetwork = null;
            if (winterFlowNodeNetwork == null) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Missing profile key: ".concat(str));
                return null;
            }
            winterFlowNodeNetwork.WinterFlowArrayNetwork = WinterFlowConfigurationSubsystem;
            int[] WinterFlowCloudMicroservice = WinterFlowCloudMicroservice(byteArrayInputStream, WinterFlowConfigurationSubsystem2);
            if (Arrays.equals(bArr, WinterFlowEncryptionSubsystem.WinterFlowConcurrencyThread)) {
                winterFlowNodeNetwork.WinterFlowVariableVersionControl = WinterFlowConfigurationSubsystem2;
                winterFlowNodeNetwork.WinterFlowRouterRouter = WinterFlowCloudMicroservice;
            }
        }
        return winterFlowNodeNetworkArr;
    }

    public static int[] WinterFlowCloudMicroservice(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += (int) WinterFlowServerManager.WinterFlowConfigurationSubsystem(byteArrayInputStream, 2);
            iArr[i3] = i2;
        }
        return iArr;
    }

    public static final long WinterFlowCompilerDataSource(long j, float f) {
        float max = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f);
        float max2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f);
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
    }

    public static void WinterFlowCompilerVariable(Canvas canvas, boolean z) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (z) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!WinterFlowSyntax) {
            try {
                if (i == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    WinterFlowUnitTestResponse = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    WinterFlowRouterRouter = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    WinterFlowUnitTestResponse = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    WinterFlowRouterRouter = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = WinterFlowUnitTestResponse;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = WinterFlowRouterRouter;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            WinterFlowSyntax = true;
        }
        if (z) {
            try {
                Method method4 = WinterFlowUnitTestResponse;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z || (method = WinterFlowRouterRouter) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static final WinterFlowMapperManager WinterFlowConcurrencyThread(WinterFlowMapperManager winterFlowMapperManager, float f, long j, WinterFlowLoaderHandler winterFlowLoaderHandler) {
        return winterFlowMapperManager.WinterFlowCacheManagerAgent(new WinterFlowSoftwareModule(f, new WinterFlowRouterFramework(j), winterFlowLoaderHandler));
    }

    public static WinterFlowNodeNetwork[] WinterFlowConfiguration(ByteArrayInputStream byteArrayInputStream, String str, int i) {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new WinterFlowNodeNetwork[0];
        }
        WinterFlowNodeNetwork[] winterFlowNodeNetworkArr = new WinterFlowNodeNetwork[i];
        for (int i3 = 0; i3 < i; i3++) {
            int WinterFlowConfigurationSubsystem = (int) WinterFlowServerManager.WinterFlowConfigurationSubsystem(byteArrayInputStream, 2);
            int WinterFlowConfigurationSubsystem2 = (int) WinterFlowServerManager.WinterFlowConfigurationSubsystem(byteArrayInputStream, 2);
            winterFlowNodeNetworkArr[i3] = new WinterFlowNodeNetwork(str, new String(WinterFlowServerManager.WinterFlowArrayHelper(byteArrayInputStream, WinterFlowConfigurationSubsystem), StandardCharsets.UTF_8), WinterFlowServerManager.WinterFlowConfigurationSubsystem(byteArrayInputStream, 4), WinterFlowConfigurationSubsystem2, (int) WinterFlowServerManager.WinterFlowConfigurationSubsystem(byteArrayInputStream, 4), (int) WinterFlowServerManager.WinterFlowConfigurationSubsystem(byteArrayInputStream, 4), new int[WinterFlowConfigurationSubsystem2], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            WinterFlowNodeNetwork winterFlowNodeNetwork = winterFlowNodeNetworkArr[i4];
            int available = byteArrayInputStream.available();
            int i5 = winterFlowNodeNetwork.WinterFlowTransactionManagerStrategy;
            int i6 = winterFlowNodeNetwork.WinterFlowUnitTestResponse;
            TreeMap treeMap = winterFlowNodeNetwork.WinterFlowSyntax;
            int i7 = available - i5;
            int i8 = i2;
            while (byteArrayInputStream.available() > i7) {
                i8 += (int) WinterFlowServerManager.WinterFlowConfigurationSubsystem(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i8), 1);
                int WinterFlowConfigurationSubsystem3 = (int) WinterFlowServerManager.WinterFlowConfigurationSubsystem(byteArrayInputStream, 2);
                while (WinterFlowConfigurationSubsystem3 > 0) {
                    WinterFlowServerManager.WinterFlowConfigurationSubsystem(byteArrayInputStream, 2);
                    int WinterFlowConfigurationSubsystem4 = (int) WinterFlowServerManager.WinterFlowConfigurationSubsystem(byteArrayInputStream, 1);
                    if (WinterFlowConfigurationSubsystem4 != 6 && WinterFlowConfigurationSubsystem4 != 7) {
                        while (WinterFlowConfigurationSubsystem4 > 0) {
                            WinterFlowServerManager.WinterFlowConfigurationSubsystem(byteArrayInputStream, 1);
                            int i9 = i2;
                            int i10 = i4;
                            for (int WinterFlowConfigurationSubsystem5 = (int) WinterFlowServerManager.WinterFlowConfigurationSubsystem(byteArrayInputStream, 1); WinterFlowConfigurationSubsystem5 > 0; WinterFlowConfigurationSubsystem5--) {
                                WinterFlowServerManager.WinterFlowConfigurationSubsystem(byteArrayInputStream, 2);
                            }
                            WinterFlowConfigurationSubsystem4--;
                            i2 = i9;
                            i4 = i10;
                        }
                    }
                    WinterFlowConfigurationSubsystem3--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i11 = i2;
            int i12 = i4;
            if (byteArrayInputStream.available() != i7) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Read too much data during profile line parse");
                return null;
            }
            winterFlowNodeNetwork.WinterFlowRouterRouter = WinterFlowCloudMicroservice(byteArrayInputStream, winterFlowNodeNetwork.WinterFlowVariableVersionControl);
            BitSet valueOf = BitSet.valueOf(WinterFlowServerManager.WinterFlowArrayHelper(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i13 = i11; i13 < i6; i13++) {
                int i14 = valueOf.get(i13) ? 2 : i11;
                if (valueOf.get(i13 + i6)) {
                    i14 |= 4;
                }
                if (i14 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i13));
                    if (num == null) {
                        num = Integer.valueOf(i11);
                    }
                    treeMap.put(Integer.valueOf(i13), Integer.valueOf(i14 | num.intValue()));
                }
            }
            i4 = i12 + 1;
            i2 = i11;
        }
        return winterFlowNodeNetworkArr;
    }

    public static final boolean WinterFlowConfigurationSubsystem(long j, long j2) {
        return j == j2;
    }

    public static final WinterFlowAdapterResponse WinterFlowConsumerUserManager(WinterFlowResolverLibrary winterFlowResolverLibrary) {
        return new WinterFlowRuntimeSessionManager(winterFlowResolverLibrary.WinterFlowCacheTool);
    }

    public static final WinterFlowListenerSyntax WinterFlowEventEmitterController(WinterFlowHandlerInvoker winterFlowHandlerInvoker, WinterFlowCacheManagerVersionControl winterFlowCacheManagerVersionControl, String str, WinterFlowResolverLibrary winterFlowResolverLibrary, int i, int i2) {
        WinterFlowVariableClass winterFlowVariableClass;
        if ((i2 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean WinterFlowVariableVersionControl2 = winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowHandlerInvoker);
        Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
        Object obj = WinterFlowModuleModule.WinterFlowRouterStructure;
        if (WinterFlowVariableVersionControl2 || WinterFlowSyntaxSubsystem == obj) {
            WinterFlowSyntaxSubsystem = new WinterFlowListenerSyntax(winterFlowHandlerInvoker, winterFlowCacheManagerVersionControl, str);
            winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
        }
        WinterFlowListenerSyntax winterFlowListenerSyntax = (WinterFlowListenerSyntax) WinterFlowSyntaxSubsystem;
        boolean WinterFlowVariableVersionControl3 = winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowHandlerInvoker) | winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowListenerSyntax);
        Object WinterFlowSyntaxSubsystem2 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
        if (WinterFlowVariableVersionControl3 || WinterFlowSyntaxSubsystem2 == obj) {
            WinterFlowSyntaxSubsystem2 = new WinterFlowDataSourceVersionControl(3, winterFlowHandlerInvoker, winterFlowListenerSyntax, false);
            winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem2);
        }
        WinterFlowHookDataSource(winterFlowListenerSyntax, (WinterFlowObjectSession) WinterFlowSyntaxSubsystem2, winterFlowResolverLibrary);
        if (winterFlowHandlerInvoker.WinterFlowUnitTestResponse() && (winterFlowVariableClass = (WinterFlowVariableClass) winterFlowListenerSyntax.WinterFlowHookDataSource.getValue()) != null) {
            WinterFlowHandlerInvoker winterFlowHandlerInvoker2 = winterFlowListenerSyntax.WinterFlowCacheManagerAgent;
            winterFlowVariableClass.WinterFlowVariableVersionControl.WinterFlowRouterRouter(winterFlowVariableClass.WinterFlowUnitTestResponse.WinterFlowUnitTestResponse(winterFlowHandlerInvoker2.WinterFlowTransactionManagerStrategy().WinterFlowRouterStructure()), winterFlowVariableClass.WinterFlowUnitTestResponse.WinterFlowUnitTestResponse(winterFlowHandlerInvoker2.WinterFlowTransactionManagerStrategy().WinterFlowCacheManagerAgent()), (WinterFlowProviderView) winterFlowVariableClass.WinterFlowTransactionManagerStrategy.WinterFlowUnitTestResponse(winterFlowHandlerInvoker2.WinterFlowTransactionManagerStrategy()));
        }
        return winterFlowListenerSyntax;
    }

    public static final String WinterFlowFrameworkTransaction(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static final void WinterFlowHookDataSource(Object obj, WinterFlowObjectSession winterFlowObjectSession, WinterFlowResolverLibrary winterFlowResolverLibrary) {
        boolean WinterFlowVariableVersionControl2 = winterFlowResolverLibrary.WinterFlowVariableVersionControl(obj);
        Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
        if (WinterFlowVariableVersionControl2 || WinterFlowSyntaxSubsystem == WinterFlowModuleModule.WinterFlowRouterStructure) {
            WinterFlowSyntaxSubsystem = new WinterFlowDatabaseSchemaMicroservice(winterFlowObjectSession);
            winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
        }
    }

    public static final Object WinterFlowMapperProtocol(WinterFlowEventProvider winterFlowEventProvider, WinterFlowEventEvent winterFlowEventEvent, WinterFlowNodeInheritance winterFlowNodeInheritance) {
        int i = WinterFlowDeploymentPlatform.WinterFlowRouterStructure;
        Object WinterFlowRouterStructure2 = WinterFlowEncryptionSubsystem.WinterFlowRouterRouter(new WinterFlowResponseVersionControl(new WinterFlowCloudProtocol(winterFlowEventEvent, null), winterFlowEventProvider, WinterFlowEventEmitterPackage.WinterFlowVariableVersionControl, -2, WinterFlowDataSourceHandler.WinterFlowVariableVersionControl), 0).WinterFlowRouterStructure(WinterFlowSchedulerService.WinterFlowVariableVersionControl, winterFlowNodeInheritance);
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        if (WinterFlowRouterStructure2 != winterFlowListenerJava) {
            WinterFlowRouterStructure2 = winterFlowAlgorithmSession;
        }
        return WinterFlowRouterStructure2 == winterFlowListenerJava ? WinterFlowRouterStructure2 : winterFlowAlgorithmSession;
    }

    public static final long WinterFlowModuleAgent(int i, WinterFlowCacheManagerSystem winterFlowCacheManagerSystem) {
        if (winterFlowCacheManagerSystem.compareTo(WinterFlowCacheManagerSystem.SECONDS) > 0) {
            return WinterFlowSessionManagerInterface(i, winterFlowCacheManagerSystem);
        }
        long convert = TimeUnit.NANOSECONDS.convert(i, winterFlowCacheManagerSystem.WinterFlowVariableVersionControl);
        WinterFlowAlgorithmDebug winterFlowAlgorithmDebug = WinterFlowAlgorithmProtocol.WinterFlowVariableVersionControl;
        long j = convert << 1;
        int i2 = WinterFlowDataSourceIDE.WinterFlowRouterStructure;
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object WinterFlowOrchestrationConfiguration(int i, Object obj, WinterFlowStrategyBackend winterFlowStrategyBackend, WinterFlowObjectHook winterFlowObjectHook, int i2) {
        Object[] objArr;
        Object[] objArr2;
        Typeface create;
        if (!(obj instanceof Typeface)) {
            return obj;
        }
        boolean z = false;
        int i3 = 0;
        z = false;
        if ((i & 1) != 0 && !WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowStrategyBackend.WinterFlowRouterStructure, winterFlowObjectHook)) {
            WinterFlowObjectHook winterFlowObjectHook2 = WinterFlowObjectHook.WinterFlowRouterRouter;
            if (winterFlowObjectHook.compareTo(winterFlowObjectHook2) >= 0 && WinterFlowManagerRequest.WinterFlowBatchUI(winterFlowStrategyBackend.WinterFlowRouterStructure.WinterFlowVariableVersionControl, winterFlowObjectHook2.WinterFlowVariableVersionControl) < 0) {
                objArr = true;
                if ((i & 2) != 0) {
                    winterFlowStrategyBackend.getClass();
                    if (i2 != 0) {
                        objArr2 = true;
                        if (objArr2 == true && objArr != true) {
                            return obj;
                        }
                        if (Build.VERSION.SDK_INT >= 28) {
                            int i4 = objArr != false ? winterFlowObjectHook.WinterFlowVariableVersionControl : winterFlowStrategyBackend.WinterFlowRouterStructure.WinterFlowVariableVersionControl;
                            if (objArr2 != true) {
                                winterFlowStrategyBackend.getClass();
                            } else if (i2 == 1) {
                                z = true;
                            }
                            create = Typeface.create((Typeface) obj, i4, z);
                            return create;
                        }
                        Object[] objArr3 = objArr2 == true && i2 == 1;
                        if (objArr3 == true && objArr == true) {
                            i3 = 3;
                        } else if (objArr == true) {
                            i3 = 1;
                        } else if (objArr3 != false) {
                            i3 = 2;
                        }
                        return Typeface.create((Typeface) obj, i3);
                    }
                }
                objArr2 = false;
                if (objArr2 == true) {
                }
                if (Build.VERSION.SDK_INT >= 28) {
                }
            }
        }
        objArr = false;
        if ((i & 2) != 0) {
        }
        objArr2 = false;
        if (objArr2 == true) {
        }
        if (Build.VERSION.SDK_INT >= 28) {
        }
    }

    public static final WinterFlowMapperManager WinterFlowOrchestrationSubsystem(WinterFlowMapperManager winterFlowMapperManager, long j, WinterFlowVersionControlUtility winterFlowVersionControlUtility) {
        return winterFlowMapperManager.WinterFlowCacheManagerAgent(new WinterFlowTransactionCacheManager(j, null, winterFlowVersionControlUtility, 2));
    }

    public static String WinterFlowPackageIDE(Class cls) {
        LinkedHashMap linkedHashMap = WinterFlowRouterTesting.WinterFlowHookDataSource;
        String str = (String) linkedHashMap.get(cls);
        if (str == null) {
            WinterFlowJavaHelper winterFlowJavaHelper = (WinterFlowJavaHelper) cls.getAnnotation(WinterFlowJavaHelper.class);
            str = winterFlowJavaHelper != null ? winterFlowJavaHelper.value() : null;
            if (str == null || str.length() <= 0) {
                WinterFlowCompilerMechanism.WinterFlowCacheManagerAgent("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()));
                return null;
            }
            linkedHashMap.put(cls, str);
        }
        str.getClass();
        return str;
    }

    public static WinterFlowNodeNetwork[] WinterFlowProxyStructure(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, WinterFlowEncryptionSubsystem.WinterFlowServiceUtility)) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Unsupported version");
            return null;
        }
        int WinterFlowConfigurationSubsystem = (int) WinterFlowServerManager.WinterFlowConfigurationSubsystem(fileInputStream, 1);
        byte[] WinterFlowCompilerVariable = WinterFlowServerManager.WinterFlowCompilerVariable(fileInputStream, (int) WinterFlowServerManager.WinterFlowConfigurationSubsystem(fileInputStream, 4), (int) WinterFlowServerManager.WinterFlowConfigurationSubsystem(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(WinterFlowCompilerVariable);
        try {
            WinterFlowNodeNetwork[] WinterFlowConfiguration = WinterFlowConfiguration(byteArrayInputStream, str, WinterFlowConfigurationSubsystem);
            byteArrayInputStream.close();
            return WinterFlowConfiguration;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static WinterFlowNodeNetwork[] WinterFlowQueueService(ByteArrayInputStream byteArrayInputStream, int i, WinterFlowNodeNetwork[] winterFlowNodeNetworkArr) {
        if (byteArrayInputStream.available() == 0) {
            return new WinterFlowNodeNetwork[0];
        }
        if (i != winterFlowNodeNetworkArr.length) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int WinterFlowConfigurationSubsystem = (int) WinterFlowServerManager.WinterFlowConfigurationSubsystem(byteArrayInputStream, 2);
            iArr[i2] = (int) WinterFlowServerManager.WinterFlowConfigurationSubsystem(byteArrayInputStream, 2);
            strArr[i2] = new String(WinterFlowServerManager.WinterFlowArrayHelper(byteArrayInputStream, WinterFlowConfigurationSubsystem), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            WinterFlowNodeNetwork winterFlowNodeNetwork = winterFlowNodeNetworkArr[i3];
            if (!winterFlowNodeNetwork.WinterFlowHookDataSource.equals(strArr[i3])) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i4 = iArr[i3];
            winterFlowNodeNetwork.WinterFlowVariableVersionControl = i4;
            winterFlowNodeNetwork.WinterFlowRouterRouter = WinterFlowCloudMicroservice(byteArrayInputStream, i4);
        }
        return winterFlowNodeNetworkArr;
    }

    public static final WinterFlowConfigurationResponse WinterFlowResolverController(WinterFlowConfigurationResponse winterFlowConfigurationResponse) {
        WinterFlowConfigurationResponse WinterFlowCacheManagerAgent2 = winterFlowConfigurationResponse.WinterFlowCacheManagerAgent();
        int WinterFlowHookDataSource2 = WinterFlowCacheManagerAgent2.WinterFlowHookDataSource();
        for (int i = 0; i < WinterFlowHookDataSource2; i++) {
            WinterFlowCacheManagerAgent2.WinterFlowVariableVersionControl(winterFlowConfigurationResponse.WinterFlowRouterStructure(i), i);
        }
        return WinterFlowCacheManagerAgent2;
    }

    public static final void WinterFlowResponseEngine(boolean z, WinterFlowEventEvent winterFlowEventEvent, WinterFlowResolverLibrary winterFlowResolverLibrary, int i) {
        winterFlowResolverLibrary.WinterFlowFrameworkTransaction(1818896922);
        int i2 = (winterFlowResolverLibrary.WinterFlowTransactionManagerStrategy(z) ? 4 : 2) | i | (winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowEventEvent) ? 32 : 16);
        if ((i2 & 19) == 18 && winterFlowResolverLibrary.WinterFlowBackendCacheManager()) {
            winterFlowResolverLibrary.WinterFlowQueueService();
        } else {
            WinterFlowHookProcessor.WinterFlowRouterStructure(z, winterFlowEventEvent, winterFlowResolverLibrary, i2 & 126);
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread = winterFlowResolverLibrary.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread != null) {
            WinterFlowConcurrencyThread.WinterFlowArrayNetwork = new WinterFlowExceptionThreadPool(z, winterFlowEventEvent, i, 1);
        }
    }

    public static final void WinterFlowRouterRouter(int i, WinterFlowObjectSession winterFlowObjectSession, WinterFlowResolverLibrary winterFlowResolverLibrary, WinterFlowMapperManager winterFlowMapperManager) {
        final WinterFlowObjectSession winterFlowObjectSession2;
        final int i2;
        final int i3;
        WinterFlowResolverLibrary winterFlowResolverLibrary2 = winterFlowResolverLibrary;
        winterFlowObjectSession.getClass();
        winterFlowResolverLibrary2.WinterFlowFrameworkTransaction(-181023487);
        int i4 = i | (winterFlowResolverLibrary2.WinterFlowUnitTestResponse(winterFlowObjectSession) ? 32 : 16);
        if (winterFlowResolverLibrary2.WinterFlowFrontendBackend(i4 & 1, (i4 & 19) != 18)) {
            Activity activity = (Activity) winterFlowResolverLibrary2.WinterFlowSyntax(WinterFlowAlgorithm.WinterFlowRouterStructure);
            WinterFlowMapperManager WinterFlowSoftwareEngine = WinterFlowCacheRuntime.WinterFlowSoftwareEngine(WinterFlowServerManager.WinterFlowBackendCacheManager(winterFlowMapperManager, WinterFlowTestingNode(R.drawable.bg, winterFlowResolverLibrary2, 0), WinterFlowThreadConfiguration.WinterFlowCacheManagerAgent, 0.0f, 54), 15.0f);
            WinterFlowInvokerConsumer winterFlowInvokerConsumer = WinterFlowCacheUtility.WinterFlowUnitTestResponse;
            WinterFlowWorkerModule WinterFlowCacheManagerAgent2 = WinterFlowLibrary.WinterFlowCacheManagerAgent(winterFlowInvokerConsumer, false);
            int hashCode = Long.hashCode(winterFlowResolverLibrary2.WinterFlowConfiguration);
            WinterFlowConfigurationProcess WinterFlowTransactionAgent = winterFlowResolverLibrary2.WinterFlowTransactionAgent();
            WinterFlowMapperManager WinterFlowUserManagerUserManager = WinterFlowUserManagerUserManager(winterFlowResolverLibrary2, WinterFlowSoftwareEngine);
            WinterFlowBandwidthAgent.WinterFlowCacheManagerAgent.getClass();
            WinterFlowConfigurationRequest winterFlowConfigurationRequest = WinterFlowEventEmitterDeserialization.WinterFlowHookDataSource;
            winterFlowResolverLibrary2.WinterFlowModuleAgent();
            if (winterFlowResolverLibrary2.WinterFlowProxyStructure) {
                winterFlowResolverLibrary2.WinterFlowResponseEngine(winterFlowConfigurationRequest);
            } else {
                winterFlowResolverLibrary2.WinterFlowParserPipeline();
            }
            WinterFlowExceptionBackend winterFlowExceptionBackend = WinterFlowEventEmitterDeserialization.WinterFlowVariableVersionControl;
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend, winterFlowResolverLibrary2, WinterFlowCacheManagerAgent2);
            WinterFlowExceptionBackend winterFlowExceptionBackend2 = WinterFlowEventEmitterDeserialization.WinterFlowArrayNetwork;
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend2, winterFlowResolverLibrary2, WinterFlowTransactionAgent);
            Integer valueOf = Integer.valueOf(hashCode);
            WinterFlowExceptionBackend winterFlowExceptionBackend3 = WinterFlowEventEmitterDeserialization.WinterFlowTransactionManagerStrategy;
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend3, winterFlowResolverLibrary2, valueOf);
            WinterFlowServiceProviderBatch winterFlowServiceProviderBatch = WinterFlowEventEmitterDeserialization.WinterFlowUnitTestResponse;
            WinterFlowProtocolNetwork.WinterFlowRouterRouter(winterFlowResolverLibrary2, winterFlowServiceProviderBatch);
            WinterFlowExceptionBackend winterFlowExceptionBackend4 = WinterFlowEventEmitterDeserialization.WinterFlowCacheManagerAgent;
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend4, winterFlowResolverLibrary2, WinterFlowUserManagerUserManager);
            WinterFlowSessionManagerProcess winterFlowSessionManagerProcess = WinterFlowSessionManagerProcess.WinterFlowRouterRouter;
            WinterFlowInvokerConsumer winterFlowInvokerConsumer2 = WinterFlowCacheUtility.WinterFlowTransactionAgent;
            WinterFlowValidatorComponent winterFlowValidatorComponent = WinterFlowValidatorComponent.WinterFlowRouterStructure;
            WinterFlowMapperManager WinterFlowOrchestrationConfiguration = WinterFlowInvokerComponent.WinterFlowOrchestrationConfiguration(winterFlowSessionManagerProcess.WinterFlowServerProtocol(winterFlowValidatorComponent, winterFlowInvokerConsumer2), WinterFlowInvokerComponent.WinterFlowQueueService(winterFlowResolverLibrary2));
            WinterFlowConfigurationPipeline winterFlowConfigurationPipeline = WinterFlowCacheUtility.WinterFlowVariableBandwidth;
            WinterFlowRepositoryObject WinterFlowRouterStructure2 = WinterFlowConsumerDataSource.WinterFlowRouterStructure(WinterFlowInvokerComponent.WinterFlowArrayNetwork, winterFlowConfigurationPipeline, winterFlowResolverLibrary2, 48);
            int hashCode2 = Long.hashCode(winterFlowResolverLibrary2.WinterFlowConfiguration);
            WinterFlowConfigurationProcess WinterFlowTransactionAgent2 = winterFlowResolverLibrary2.WinterFlowTransactionAgent();
            WinterFlowMapperManager WinterFlowUserManagerUserManager2 = WinterFlowUserManagerUserManager(winterFlowResolverLibrary2, WinterFlowOrchestrationConfiguration);
            winterFlowResolverLibrary2.WinterFlowModuleAgent();
            if (winterFlowResolverLibrary2.WinterFlowProxyStructure) {
                winterFlowResolverLibrary2.WinterFlowResponseEngine(winterFlowConfigurationRequest);
            } else {
                winterFlowResolverLibrary2.WinterFlowParserPipeline();
            }
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend, winterFlowResolverLibrary2, WinterFlowRouterStructure2);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend2, winterFlowResolverLibrary2, WinterFlowTransactionAgent2);
            WinterFlowResolverBackend.WinterFlowConcurrencyThread(hashCode2, winterFlowResolverLibrary2, winterFlowExceptionBackend3, winterFlowResolverLibrary2, winterFlowServiceProviderBatch);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend4, winterFlowResolverLibrary2, WinterFlowUserManagerUserManager2);
            WinterFlowMapperManager WinterFlowCacheManagerAgent3 = WinterFlowBandwidthObject(WinterFlowManagerRequest.WinterFlowSingletonPlatform(WinterFlowCacheRuntime.WinterFlowOrchestrationConfiguration(winterFlowValidatorComponent, 140.0f), WinterFlowRepositoryProxy.WinterFlowRouterStructure(12.0f)), WinterFlowSessionManagerProcess.WinterFlowBandwidthObject(WinterFlowUnitTestLibrary.WinterFlowPackageIDE(new WinterFlowInheritanceSubsystem(WinterFlowInvokerComponent.WinterFlowVariableVersionControl(98, 210, 253)), new WinterFlowInheritanceSubsystem(WinterFlowInvokerComponent.WinterFlowVariableVersionControl(2, 58, 241))))).WinterFlowCacheManagerAgent(new WinterFlowSoftwareModule(2.0f, WinterFlowSessionManagerProcess.WinterFlowBandwidthObject(WinterFlowUnitTestLibrary.WinterFlowPackageIDE(new WinterFlowInheritanceSubsystem(WinterFlowInvokerComponent.WinterFlowVariableVersionControl(2, 58, 241)), new WinterFlowInheritanceSubsystem(WinterFlowInvokerComponent.WinterFlowVariableVersionControl(98, 210, 253)))), WinterFlowRepositoryProxy.WinterFlowRouterStructure(12.0f)));
            WinterFlowWorkerModule WinterFlowCacheManagerAgent4 = WinterFlowLibrary.WinterFlowCacheManagerAgent(winterFlowInvokerConsumer, false);
            int hashCode3 = Long.hashCode(winterFlowResolverLibrary2.WinterFlowConfiguration);
            WinterFlowConfigurationProcess WinterFlowTransactionAgent3 = winterFlowResolverLibrary2.WinterFlowTransactionAgent();
            WinterFlowMapperManager WinterFlowUserManagerUserManager3 = WinterFlowUserManagerUserManager(winterFlowResolverLibrary2, WinterFlowCacheManagerAgent3);
            winterFlowResolverLibrary2.WinterFlowModuleAgent();
            if (winterFlowResolverLibrary2.WinterFlowProxyStructure) {
                winterFlowResolverLibrary2.WinterFlowResponseEngine(winterFlowConfigurationRequest);
            } else {
                winterFlowResolverLibrary2.WinterFlowParserPipeline();
            }
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend, winterFlowResolverLibrary2, WinterFlowCacheManagerAgent4);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend2, winterFlowResolverLibrary2, WinterFlowTransactionAgent3);
            WinterFlowResolverBackend.WinterFlowConcurrencyThread(hashCode3, winterFlowResolverLibrary2, winterFlowExceptionBackend3, winterFlowResolverLibrary2, winterFlowServiceProviderBatch);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend4, winterFlowResolverLibrary2, WinterFlowUserManagerUserManager3);
            WinterFlowRepositoryObject WinterFlowRouterStructure3 = WinterFlowConsumerDataSource.WinterFlowRouterStructure(WinterFlowInvokerComponent.WinterFlowTransactionManagerStrategy, winterFlowConfigurationPipeline, winterFlowResolverLibrary2, 54);
            int hashCode4 = Long.hashCode(winterFlowResolverLibrary2.WinterFlowConfiguration);
            WinterFlowConfigurationProcess WinterFlowTransactionAgent4 = winterFlowResolverLibrary2.WinterFlowTransactionAgent();
            WinterFlowMapperManager WinterFlowUserManagerUserManager4 = WinterFlowUserManagerUserManager(winterFlowResolverLibrary2, winterFlowValidatorComponent);
            winterFlowResolverLibrary2.WinterFlowModuleAgent();
            if (winterFlowResolverLibrary2.WinterFlowProxyStructure) {
                winterFlowResolverLibrary2.WinterFlowResponseEngine(winterFlowConfigurationRequest);
            } else {
                winterFlowResolverLibrary2.WinterFlowParserPipeline();
            }
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend, winterFlowResolverLibrary2, WinterFlowRouterStructure3);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend2, winterFlowResolverLibrary2, WinterFlowTransactionAgent4);
            WinterFlowResolverBackend.WinterFlowConcurrencyThread(hashCode4, winterFlowResolverLibrary2, winterFlowExceptionBackend3, winterFlowResolverLibrary2, winterFlowServiceProviderBatch);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend4, winterFlowResolverLibrary2, WinterFlowUserManagerUserManager4);
            WinterFlowUnitTestLibrary.WinterFlowVariableVersionControl(WinterFlowTestingNode(R.drawable.app_logo, winterFlowResolverLibrary2, 0), WinterFlowCacheRuntime.WinterFlowConfiguration(winterFlowValidatorComponent, 80.0f), null, null, 0.0f, winterFlowResolverLibrary, 440, 120);
            i2 = 1;
            WinterFlowSingletonRuntime.WinterFlowHookDataSource(((Resources) winterFlowResolverLibrary.WinterFlowSyntax(WinterFlowUnitTestProvider.WinterFlowCacheManagerAgent)).getString(R.string.app_name), WinterFlowCacheRuntime.WinterFlowSoftwareEngine(WinterFlowOrchestrationSubsystem(WinterFlowManagerRequest.WinterFlowSingletonPlatform(WinterFlowCacheRuntime.WinterFlowSoftwareEngine(WinterFlowCacheRuntime.WinterFlowSingletonPlatform(1.0f), 5.0f), WinterFlowRepositoryProxy.WinterFlowRouterStructure(8.0f)), WinterFlowInheritanceSubsystem.WinterFlowHookDataSource(WinterFlowInheritanceSubsystem.WinterFlowHookDataSource, 0.3f), WinterFlowCacheRuntime.WinterFlowTransactionAgent), 5.0f), WinterFlowInheritanceSubsystem.WinterFlowCacheManagerAgent, WinterFlowDecoratorUI.WinterFlowBatchUI(20), null, 0L, new WinterFlowThreadPoolEventEmitter(3), 0L, 0, false, 0, 0, null, winterFlowResolverLibrary, 24960, 261096);
            winterFlowResolverLibrary2 = winterFlowResolverLibrary;
            winterFlowResolverLibrary2.WinterFlowBandwidthObject(true);
            winterFlowResolverLibrary2.WinterFlowBandwidthObject(true);
            WinterFlowProtocolNetwork.WinterFlowRouterStructure(winterFlowResolverLibrary2, WinterFlowCacheRuntime.WinterFlowArrayHelper(25.0f));
            int i5 = i4 & 112;
            boolean z = i5 == 32;
            Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary2.WinterFlowSyntaxSubsystem();
            WinterFlowThreadPoolProcess winterFlowThreadPoolProcess = WinterFlowModuleModule.WinterFlowRouterStructure;
            if (z || WinterFlowSyntaxSubsystem == winterFlowThreadPoolProcess) {
                winterFlowObjectSession2 = winterFlowObjectSession;
                i3 = 0;
                WinterFlowSyntaxSubsystem = new WinterFlowObjectUI() { // from class: com.google.android.datatransport.WinterFlowResolverInterface
                    @Override // com.google.android.datatransport.WinterFlowObjectUI
                    public final Object WinterFlowRouterStructure() {
                        int i6 = i3;
                        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                        WinterFlowObjectSession winterFlowObjectSession3 = winterFlowObjectSession2;
                        switch (i6) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                winterFlowObjectSession3.WinterFlowUnitTestResponse(WinterFlowCompilerUtility.WinterFlowUnitTestResponse);
                                break;
                            case 1:
                                winterFlowObjectSession3.WinterFlowUnitTestResponse(WinterFlowCompilerUtility.WinterFlowTransactionManagerStrategy);
                                break;
                            case 2:
                                winterFlowObjectSession3.WinterFlowUnitTestResponse(WinterFlowCompilerUtility.WinterFlowRouterRouter);
                                break;
                            default:
                                winterFlowObjectSession3.WinterFlowUnitTestResponse(WinterFlowCompilerUtility.WinterFlowVariableVersionControl);
                                break;
                        }
                        return winterFlowAlgorithmSession;
                    }
                };
                winterFlowResolverLibrary2.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
            } else {
                winterFlowObjectSession2 = winterFlowObjectSession;
                i3 = 0;
            }
            WinterFlowServerProtocol(48, 1, (WinterFlowObjectUI) WinterFlowSyntaxSubsystem, winterFlowResolverLibrary2, null, "GO");
            WinterFlowProtocolNetwork.WinterFlowRouterStructure(winterFlowResolverLibrary2, WinterFlowCacheRuntime.WinterFlowArrayHelper(5.0f));
            int i6 = i5 == 32 ? 1 : i3;
            Object WinterFlowSyntaxSubsystem2 = winterFlowResolverLibrary2.WinterFlowSyntaxSubsystem();
            if (i6 != 0 || WinterFlowSyntaxSubsystem2 == winterFlowThreadPoolProcess) {
                WinterFlowSyntaxSubsystem2 = new WinterFlowObjectUI() { // from class: com.google.android.datatransport.WinterFlowResolverInterface
                    @Override // com.google.android.datatransport.WinterFlowObjectUI
                    public final Object WinterFlowRouterStructure() {
                        int i62 = i2;
                        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                        WinterFlowObjectSession winterFlowObjectSession3 = winterFlowObjectSession2;
                        switch (i62) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                winterFlowObjectSession3.WinterFlowUnitTestResponse(WinterFlowCompilerUtility.WinterFlowUnitTestResponse);
                                break;
                            case 1:
                                winterFlowObjectSession3.WinterFlowUnitTestResponse(WinterFlowCompilerUtility.WinterFlowTransactionManagerStrategy);
                                break;
                            case 2:
                                winterFlowObjectSession3.WinterFlowUnitTestResponse(WinterFlowCompilerUtility.WinterFlowRouterRouter);
                                break;
                            default:
                                winterFlowObjectSession3.WinterFlowUnitTestResponse(WinterFlowCompilerUtility.WinterFlowVariableVersionControl);
                                break;
                        }
                        return winterFlowAlgorithmSession;
                    }
                };
                winterFlowResolverLibrary2.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem2);
            }
            WinterFlowServerProtocol(48, 1, (WinterFlowObjectUI) WinterFlowSyntaxSubsystem2, winterFlowResolverLibrary2, null, "Archive");
            WinterFlowProtocolNetwork.WinterFlowRouterStructure(winterFlowResolverLibrary2, WinterFlowCacheRuntime.WinterFlowArrayHelper(5.0f));
            int i7 = i5 == 32 ? 1 : i3;
            Object WinterFlowSyntaxSubsystem3 = winterFlowResolverLibrary2.WinterFlowSyntaxSubsystem();
            if (i7 != 0 || WinterFlowSyntaxSubsystem3 == winterFlowThreadPoolProcess) {
                final int i8 = 2;
                WinterFlowSyntaxSubsystem3 = new WinterFlowObjectUI() { // from class: com.google.android.datatransport.WinterFlowResolverInterface
                    @Override // com.google.android.datatransport.WinterFlowObjectUI
                    public final Object WinterFlowRouterStructure() {
                        int i62 = i8;
                        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                        WinterFlowObjectSession winterFlowObjectSession3 = winterFlowObjectSession2;
                        switch (i62) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                winterFlowObjectSession3.WinterFlowUnitTestResponse(WinterFlowCompilerUtility.WinterFlowUnitTestResponse);
                                break;
                            case 1:
                                winterFlowObjectSession3.WinterFlowUnitTestResponse(WinterFlowCompilerUtility.WinterFlowTransactionManagerStrategy);
                                break;
                            case 2:
                                winterFlowObjectSession3.WinterFlowUnitTestResponse(WinterFlowCompilerUtility.WinterFlowRouterRouter);
                                break;
                            default:
                                winterFlowObjectSession3.WinterFlowUnitTestResponse(WinterFlowCompilerUtility.WinterFlowVariableVersionControl);
                                break;
                        }
                        return winterFlowAlgorithmSession;
                    }
                };
                winterFlowResolverLibrary2.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem3);
            }
            WinterFlowServerProtocol(48, 1, (WinterFlowObjectUI) WinterFlowSyntaxSubsystem3, winterFlowResolverLibrary2, null, "DIFFICULTY");
            winterFlowResolverLibrary2.WinterFlowBandwidthObject(true);
            WinterFlowMapperManager WinterFlowConfiguration = WinterFlowCacheRuntime.WinterFlowConfiguration(winterFlowValidatorComponent, 100.0f);
            if (i5 == 32) {
                i3 = 1;
            }
            Object WinterFlowSyntaxSubsystem4 = winterFlowResolverLibrary2.WinterFlowSyntaxSubsystem();
            if (i3 != 0 || WinterFlowSyntaxSubsystem4 == winterFlowThreadPoolProcess) {
                final int i9 = 3;
                WinterFlowSyntaxSubsystem4 = new WinterFlowObjectUI() { // from class: com.google.android.datatransport.WinterFlowResolverInterface
                    @Override // com.google.android.datatransport.WinterFlowObjectUI
                    public final Object WinterFlowRouterStructure() {
                        int i62 = i9;
                        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                        WinterFlowObjectSession winterFlowObjectSession3 = winterFlowObjectSession2;
                        switch (i62) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                winterFlowObjectSession3.WinterFlowUnitTestResponse(WinterFlowCompilerUtility.WinterFlowUnitTestResponse);
                                break;
                            case 1:
                                winterFlowObjectSession3.WinterFlowUnitTestResponse(WinterFlowCompilerUtility.WinterFlowTransactionManagerStrategy);
                                break;
                            case 2:
                                winterFlowObjectSession3.WinterFlowUnitTestResponse(WinterFlowCompilerUtility.WinterFlowRouterRouter);
                                break;
                            default:
                                winterFlowObjectSession3.WinterFlowUnitTestResponse(WinterFlowCompilerUtility.WinterFlowVariableVersionControl);
                                break;
                        }
                        return winterFlowAlgorithmSession;
                    }
                };
                winterFlowResolverLibrary2.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem4);
            }
            WinterFlowThreadListener(R.drawable.ok, 390, (WinterFlowObjectUI) WinterFlowSyntaxSubsystem4, winterFlowResolverLibrary2, WinterFlowConfiguration, "Rules");
            WinterFlowMapperManager WinterFlowConfiguration2 = WinterFlowCacheRuntime.WinterFlowConfiguration(winterFlowSessionManagerProcess.WinterFlowServerProtocol(winterFlowValidatorComponent, WinterFlowCacheUtility.WinterFlowBandwidthObject), 100.0f);
            boolean WinterFlowUnitTestResponse2 = winterFlowResolverLibrary2.WinterFlowUnitTestResponse(activity);
            Object WinterFlowSyntaxSubsystem5 = winterFlowResolverLibrary2.WinterFlowSyntaxSubsystem();
            if (WinterFlowUnitTestResponse2 || WinterFlowSyntaxSubsystem5 == winterFlowThreadPoolProcess) {
                WinterFlowSyntaxSubsystem5 = new WinterFlowAPISystem(6, activity);
                winterFlowResolverLibrary2.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem5);
            }
            WinterFlowThreadListener(R.drawable.exit, 384, (WinterFlowObjectUI) WinterFlowSyntaxSubsystem5, winterFlowResolverLibrary2, WinterFlowConfiguration2, "Exit");
            winterFlowResolverLibrary2.WinterFlowBandwidthObject(true);
        } else {
            winterFlowObjectSession2 = winterFlowObjectSession;
            i2 = 1;
            winterFlowResolverLibrary2.WinterFlowQueueService();
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread = winterFlowResolverLibrary2.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread != null) {
            WinterFlowConcurrencyThread.WinterFlowArrayNetwork = new WinterFlowSyntaxServer(winterFlowMapperManager, winterFlowObjectSession2, i, i2);
        }
    }

    public static final void WinterFlowRouterStructure(WinterFlowJavaSubsystem winterFlowJavaSubsystem, WinterFlowResolverLibrary winterFlowResolverLibrary, int i) {
        WinterFlowPackageResolver winterFlowPackageResolver;
        winterFlowResolverLibrary.WinterFlowFrameworkTransaction(294589392);
        int i2 = 3;
        if ((((winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowJavaSubsystem) ? 4 : 2) | i) & 3) == 2 && winterFlowResolverLibrary.WinterFlowBackendCacheManager()) {
            winterFlowResolverLibrary.WinterFlowQueueService();
        } else {
            WinterFlowDecoratorPlatform WinterFlowSyntax2 = WinterFlowPackageProcess.WinterFlowSyntax(winterFlowResolverLibrary);
            WinterFlowThreadPoolGateway WinterFlowArrayNetwork2 = WinterFlowFrameworkMechanism.WinterFlowArrayNetwork(winterFlowJavaSubsystem.WinterFlowHookDataSource().WinterFlowVariableVersionControl, winterFlowResolverLibrary);
            List list = (List) WinterFlowArrayNetwork2.getValue();
            boolean booleanValue = ((Boolean) winterFlowResolverLibrary.WinterFlowSyntax(WinterFlowDatabaseSchemaComponent.WinterFlowRouterStructure)).booleanValue();
            boolean WinterFlowVariableVersionControl2 = winterFlowResolverLibrary.WinterFlowVariableVersionControl(list);
            Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            Object obj = WinterFlowModuleModule.WinterFlowRouterStructure;
            Object obj2 = WinterFlowSyntaxSubsystem;
            if (WinterFlowVariableVersionControl2 || WinterFlowSyntaxSubsystem == obj) {
                WinterFlowPackageResolver winterFlowPackageResolver2 = new WinterFlowPackageResolver();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    WinterFlowLibrarySessionManager winterFlowLibrarySessionManager = (WinterFlowLibrarySessionManager) obj3;
                    if (booleanValue || winterFlowLibrarySessionManager.WinterFlowServerProtocol.WinterFlowResponseEngine.WinterFlowSyntax.compareTo(WinterFlowDatabaseProtocol.WinterFlowRouterRouter) >= 0) {
                        arrayList.add(obj3);
                    }
                }
                winterFlowPackageResolver2.addAll(arrayList);
                winterFlowResolverLibrary.WinterFlowArrayFramework(winterFlowPackageResolver2);
                obj2 = winterFlowPackageResolver2;
            }
            WinterFlowPackageResolver winterFlowPackageResolver3 = (WinterFlowPackageResolver) obj2;
            WinterFlowSyntax(winterFlowPackageResolver3, (List) WinterFlowArrayNetwork2.getValue(), winterFlowResolverLibrary, 0);
            WinterFlowThreadPoolGateway WinterFlowArrayNetwork3 = WinterFlowFrameworkMechanism.WinterFlowArrayNetwork(winterFlowJavaSubsystem.WinterFlowHookDataSource().WinterFlowTransactionManagerStrategy, winterFlowResolverLibrary);
            Object WinterFlowSyntaxSubsystem2 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            if (WinterFlowSyntaxSubsystem2 == obj) {
                WinterFlowSyntaxSubsystem2 = new WinterFlowPackageResolver();
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem2);
            }
            WinterFlowPackageResolver winterFlowPackageResolver4 = (WinterFlowPackageResolver) WinterFlowSyntaxSubsystem2;
            winterFlowResolverLibrary.WinterFlowCompilerDataSource(-367418626);
            ListIterator listIterator = winterFlowPackageResolver3.listIterator();
            while (true) {
                WinterFlowClassAlgorithm winterFlowClassAlgorithm = (WinterFlowClassAlgorithm) listIterator;
                if (!winterFlowClassAlgorithm.hasNext()) {
                    break;
                }
                WinterFlowLibrarySessionManager winterFlowLibrarySessionManager2 = (WinterFlowLibrarySessionManager) winterFlowClassAlgorithm.next();
                WinterFlowServerLayer winterFlowServerLayer = winterFlowLibrarySessionManager2.WinterFlowTransactionManagerStrategy;
                winterFlowServerLayer.getClass();
                WinterFlowProxyWidget winterFlowProxyWidget = (WinterFlowProxyWidget) winterFlowServerLayer;
                boolean WinterFlowUnitTestResponse2 = winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowJavaSubsystem) | winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowLibrarySessionManager2);
                Object WinterFlowSyntaxSubsystem3 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                if (WinterFlowUnitTestResponse2 || WinterFlowSyntaxSubsystem3 == obj) {
                    WinterFlowSyntaxSubsystem3 = new WinterFlowRepositoryLayer(i2, winterFlowJavaSubsystem, winterFlowLibrarySessionManager2);
                    winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem3);
                }
                WinterFlowInvokerComponent.WinterFlowUnitTestResponse((WinterFlowObjectUI) WinterFlowSyntaxSubsystem3, winterFlowProxyWidget.WinterFlowResponseEngine, WinterFlowManagerRequest.WinterFlowSyntaxSubsystem(1129586364, new WinterFlowQueryHelper(winterFlowLibrarySessionManager2, winterFlowJavaSubsystem, WinterFlowSyntax2, winterFlowPackageResolver4, winterFlowProxyWidget), winterFlowResolverLibrary), winterFlowResolverLibrary, 384);
            }
            winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
            Set set = (Set) WinterFlowArrayNetwork3.getValue();
            boolean WinterFlowVariableVersionControl3 = winterFlowResolverLibrary.WinterFlowVariableVersionControl(WinterFlowArrayNetwork3) | winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowJavaSubsystem);
            Object WinterFlowSyntaxSubsystem4 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            if (WinterFlowVariableVersionControl3 || WinterFlowSyntaxSubsystem4 == obj) {
                winterFlowPackageResolver = winterFlowPackageResolver4;
                Object winterFlowJSONUtility = new WinterFlowJSONUtility(WinterFlowArrayNetwork3, winterFlowJavaSubsystem, winterFlowPackageResolver, null, 0);
                winterFlowResolverLibrary.WinterFlowArrayFramework(winterFlowJSONUtility);
                WinterFlowSyntaxSubsystem4 = winterFlowJSONUtility;
            } else {
                winterFlowPackageResolver = winterFlowPackageResolver4;
            }
            WinterFlowVariableVersionControl(set, winterFlowPackageResolver, (WinterFlowEventEvent) WinterFlowSyntaxSubsystem4, winterFlowResolverLibrary);
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread = winterFlowResolverLibrary.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread != null) {
            WinterFlowConcurrencyThread.WinterFlowArrayNetwork = new WinterFlowSessionManagerSystem(i, 1, winterFlowJavaSubsystem);
        }
    }

    public static void WinterFlowSerializerStructure(Object obj, String str) {
        if (obj != null) {
            return;
        }
        WinterFlowCompilerMechanism.WinterFlowTransactionManagerStrategy(str);
    }

    public static final void WinterFlowServerProtocol(int i, int i2, WinterFlowObjectUI winterFlowObjectUI, WinterFlowResolverLibrary winterFlowResolverLibrary, WinterFlowMapperManager winterFlowMapperManager, String str) {
        int i3;
        WinterFlowResolverLibrary winterFlowResolverLibrary2;
        WinterFlowMapperManager winterFlowMapperManager2;
        winterFlowObjectUI.getClass();
        winterFlowResolverLibrary.WinterFlowFrameworkTransaction(610967872);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowMapperManager) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= winterFlowResolverLibrary.WinterFlowVariableVersionControl(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowObjectUI) ? 256 : 128;
        }
        if (winterFlowResolverLibrary.WinterFlowFrontendBackend(i3 & 1, (i3 & 147) != 146)) {
            winterFlowMapperManager2 = i4 != 0 ? WinterFlowValidatorComponent.WinterFlowRouterStructure : winterFlowMapperManager;
            WinterFlowMapperManager WinterFlowResponseEngine = WinterFlowCloudStack.WinterFlowResponseEngine(WinterFlowServerManager.WinterFlowBackendCacheManager(winterFlowMapperManager2, WinterFlowTestingNode(R.drawable.button, winterFlowResolverLibrary, 0), WinterFlowThreadConfiguration.WinterFlowCacheManagerAgent, 0.0f, 54), false, winterFlowObjectUI, 15);
            WinterFlowWorkerModule WinterFlowCacheManagerAgent2 = WinterFlowLibrary.WinterFlowCacheManagerAgent(WinterFlowCacheUtility.WinterFlowTransactionAgent, false);
            int hashCode = Long.hashCode(winterFlowResolverLibrary.WinterFlowConfiguration);
            WinterFlowConfigurationProcess WinterFlowTransactionAgent = winterFlowResolverLibrary.WinterFlowTransactionAgent();
            WinterFlowMapperManager WinterFlowUserManagerUserManager = WinterFlowUserManagerUserManager(winterFlowResolverLibrary, WinterFlowResponseEngine);
            WinterFlowBandwidthAgent.WinterFlowCacheManagerAgent.getClass();
            WinterFlowConfigurationRequest winterFlowConfigurationRequest = WinterFlowEventEmitterDeserialization.WinterFlowHookDataSource;
            winterFlowResolverLibrary.WinterFlowModuleAgent();
            if (winterFlowResolverLibrary.WinterFlowProxyStructure) {
                winterFlowResolverLibrary.WinterFlowResponseEngine(winterFlowConfigurationRequest);
            } else {
                winterFlowResolverLibrary.WinterFlowParserPipeline();
            }
            WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowVariableVersionControl, winterFlowResolverLibrary, WinterFlowCacheManagerAgent2);
            WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowArrayNetwork, winterFlowResolverLibrary, WinterFlowTransactionAgent);
            WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowTransactionManagerStrategy, winterFlowResolverLibrary, Integer.valueOf(hashCode));
            WinterFlowProtocolNetwork.WinterFlowRouterRouter(winterFlowResolverLibrary, WinterFlowEventEmitterDeserialization.WinterFlowUnitTestResponse);
            WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowCacheManagerAgent, winterFlowResolverLibrary, WinterFlowUserManagerUserManager);
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            WinterFlowSingletonRuntime.WinterFlowHookDataSource(upperCase, null, WinterFlowInheritanceSubsystem.WinterFlowCacheManagerAgent, WinterFlowDecoratorUI.WinterFlowBatchUI(24), null, 0L, null, 0L, 0, false, 0, 0, null, winterFlowResolverLibrary, 24960, 262122);
            winterFlowResolverLibrary2 = winterFlowResolverLibrary;
            winterFlowResolverLibrary2.WinterFlowBandwidthObject(true);
        } else {
            winterFlowResolverLibrary2 = winterFlowResolverLibrary;
            winterFlowResolverLibrary2.WinterFlowQueueService();
            winterFlowMapperManager2 = winterFlowMapperManager;
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread = winterFlowResolverLibrary2.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread != null) {
            WinterFlowConcurrencyThread.WinterFlowArrayNetwork = new WinterFlowJSONMapper(winterFlowMapperManager2, str, winterFlowObjectUI, i, i2);
        }
    }

    public static final long WinterFlowServiceUtility(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            return (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : WinterFlowDecoratorUI.WinterFlowResponseEngine(j + j2);
        }
        if ((-4611686018427387903L >= j2 || j2 >= 4611686018427387903L) && (j2 ^ j) < 0) {
            return 9223372036854759646L;
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0085, code lost:
    
        if (r8 > 4611686018427387903L) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009f, code lost:
    
        if (r8 > 4611686018427387903L) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long WinterFlowSessionManagerInterface(long j, WinterFlowCacheManagerSystem winterFlowCacheManagerSystem) {
        long j2;
        TimeUnit timeUnit = winterFlowCacheManagerSystem.WinterFlowVariableVersionControl;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long convert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-convert) <= j && j <= convert) {
            long convert2 = timeUnit2.convert(j, timeUnit);
            WinterFlowAlgorithmDebug winterFlowAlgorithmDebug = WinterFlowAlgorithmProtocol.WinterFlowVariableVersionControl;
            long j3 = convert2 << 1;
            int i = WinterFlowDataSourceIDE.WinterFlowRouterStructure;
            return j3;
        }
        if (winterFlowCacheManagerSystem.compareTo(WinterFlowCacheManagerSystem.MILLISECONDS) < 0) {
            return WinterFlowArrayHelper(WinterFlowDecoratorUI.WinterFlowResponseEngine(TimeUnit.MILLISECONDS.convert(j, timeUnit)));
        }
        long signum = Long.signum(j);
        if (j < -9223372036854775807L) {
            j = -9223372036854775807L;
        }
        long abs = Math.abs(j);
        int ordinal = winterFlowCacheManagerSystem.ordinal();
        long j4 = 0;
        if (ordinal == 2) {
            j2 = 1;
        } else if (ordinal == 3) {
            j2 = 1000;
        } else if (ordinal == 4) {
            j2 = 60000;
        } else if (ordinal == 5) {
            j2 = 3600000;
        } else {
            if (ordinal != 6) {
                WinterFlowCompilerMechanism.WinterFlowVariableVersionControl(winterFlowCacheManagerSystem, "Wrong unit for millisMultiplier: ");
                return 0L;
            }
            j2 = 86400000;
        }
        if (abs != 0) {
            j4 = 4611686018427387903L;
            if (abs == 1) {
                if (j2 <= 4611686018427387903L) {
                    abs = j2;
                    return WinterFlowArrayHelper(signum * abs);
                }
            } else if (j2 != 1) {
                int numberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(abs)) - Long.numberOfLeadingZeros(j2);
                if (numberOfLeadingZeros < 63) {
                    abs *= j2;
                } else if (numberOfLeadingZeros <= 63) {
                    abs *= j2;
                }
                return WinterFlowArrayHelper(signum * abs);
            }
        }
        abs = j4;
        return WinterFlowArrayHelper(signum * abs);
    }

    public static final WinterFlowMapperManager WinterFlowSoftwareEngine(WinterFlowDebugEvent winterFlowDebugEvent) {
        return new WinterFlowSingletonPipeline(winterFlowDebugEvent);
    }

    public static final void WinterFlowSoftwareProtocol(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice, Throwable th) {
        try {
            WinterFlowControllerLayer winterFlowControllerLayer = (WinterFlowControllerLayer) winterFlowEncryptionMicroservice.WinterFlowConsumerUserManager(WinterFlowSessionManagerProcess.WinterFlowTransactionAgent);
            if (winterFlowControllerLayer != null) {
                winterFlowControllerLayer.WinterFlowRouterAdapter(winterFlowEncryptionMicroservice, th);
            } else {
                WinterFlowInvokerComponent.WinterFlowConfigurationSubsystem(winterFlowEncryptionMicroservice, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                WinterFlowCloudStack.WinterFlowTransactionManagerStrategy(runtimeException, th);
                th = runtimeException;
            }
            WinterFlowInvokerComponent.WinterFlowConfigurationSubsystem(winterFlowEncryptionMicroservice, th);
        }
    }

    public static final long WinterFlowStrategyTool(long j, boolean z, int i, float f) {
        int WinterFlowRouterRouter2 = ((z || i == 2 || i == 4 || i == 5) && WinterFlowHandlerConsumer.WinterFlowArrayNetwork(j)) ? WinterFlowHandlerConsumer.WinterFlowRouterRouter(j) : Integer.MAX_VALUE;
        if (WinterFlowHandlerConsumer.WinterFlowResponseEngine(j) != WinterFlowRouterRouter2) {
            WinterFlowRouterRouter2 = WinterFlowDecoratorUI.WinterFlowSyntax(WinterFlowNodeVersion.WinterFlowHookDataSource(f), WinterFlowHandlerConsumer.WinterFlowResponseEngine(j), WinterFlowRouterRouter2);
        }
        return WinterFlowCacheRuntime.WinterFlowRouterAdapter(0, WinterFlowRouterRouter2, 0, WinterFlowHandlerConsumer.WinterFlowUnitTestResponse(j));
    }

    public static final void WinterFlowSyntax(final List list, Collection collection, WinterFlowResolverLibrary winterFlowResolverLibrary, int i) {
        winterFlowResolverLibrary.WinterFlowFrameworkTransaction(1537894851);
        int i2 = 2;
        if ((((winterFlowResolverLibrary.WinterFlowUnitTestResponse(list) ? 4 : 2) | i | (winterFlowResolverLibrary.WinterFlowUnitTestResponse(collection) ? 32 : 16)) & 19) == 18 && winterFlowResolverLibrary.WinterFlowBackendCacheManager()) {
            winterFlowResolverLibrary.WinterFlowQueueService();
        } else {
            final boolean booleanValue = ((Boolean) winterFlowResolverLibrary.WinterFlowSyntax(WinterFlowDatabaseSchemaComponent.WinterFlowRouterStructure)).booleanValue();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                final WinterFlowLibrarySessionManager winterFlowLibrarySessionManager = (WinterFlowLibrarySessionManager) it.next();
                WinterFlowDatabaseUtility winterFlowDatabaseUtility = winterFlowLibrarySessionManager.WinterFlowServerProtocol.WinterFlowResponseEngine;
                boolean WinterFlowTransactionManagerStrategy2 = winterFlowResolverLibrary.WinterFlowTransactionManagerStrategy(booleanValue) | winterFlowResolverLibrary.WinterFlowUnitTestResponse(list) | winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowLibrarySessionManager);
                Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                if (WinterFlowTransactionManagerStrategy2 || WinterFlowSyntaxSubsystem == WinterFlowModuleModule.WinterFlowRouterStructure) {
                    WinterFlowSyntaxSubsystem = new WinterFlowObjectSession() { // from class: com.google.android.datatransport.WinterFlowConcurrencyStructure
                        @Override // com.google.android.datatransport.WinterFlowObjectSession
                        public final Object WinterFlowUnitTestResponse(Object obj) {
                            final WinterFlowLibrarySessionManager winterFlowLibrarySessionManager2 = WinterFlowLibrarySessionManager.this;
                            final List list2 = list;
                            final boolean z = booleanValue;
                            WinterFlowNodeProtocol winterFlowNodeProtocol = new WinterFlowNodeProtocol() { // from class: com.google.android.datatransport.WinterFlowHandlerSessionManager
                                @Override // com.google.android.datatransport.WinterFlowNodeProtocol
                                public final void WinterFlowTransactionAgent(WinterFlowDecoratorVersion winterFlowDecoratorVersion, WinterFlowMicroserviceProcess winterFlowMicroserviceProcess) {
                                    boolean z2 = z;
                                    List list3 = list2;
                                    WinterFlowLibrarySessionManager winterFlowLibrarySessionManager3 = winterFlowLibrarySessionManager2;
                                    if (z2 && !list3.contains(winterFlowLibrarySessionManager3)) {
                                        list3.add(winterFlowLibrarySessionManager3);
                                    }
                                    if (winterFlowMicroserviceProcess == WinterFlowMicroserviceProcess.ON_START && !list3.contains(winterFlowLibrarySessionManager3)) {
                                        list3.add(winterFlowLibrarySessionManager3);
                                    }
                                    if (winterFlowMicroserviceProcess == WinterFlowMicroserviceProcess.ON_STOP) {
                                        list3.remove(winterFlowLibrarySessionManager3);
                                    }
                                }
                            };
                            winterFlowLibrarySessionManager2.WinterFlowServerProtocol.WinterFlowResponseEngine.WinterFlowRouterStructure(winterFlowNodeProtocol);
                            return new WinterFlowIDERepository(1, winterFlowLibrarySessionManager2, winterFlowNodeProtocol);
                        }
                    };
                    winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
                }
                WinterFlowHookDataSource(winterFlowDatabaseUtility, (WinterFlowObjectSession) WinterFlowSyntaxSubsystem, winterFlowResolverLibrary);
            }
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread = winterFlowResolverLibrary.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread != null) {
            WinterFlowConcurrencyThread.WinterFlowArrayNetwork = new WinterFlowAPIVersionControl(i, i2, list, collection);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0472 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0495 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0565 A[LOOP:3: B:189:0x055e->B:191:0x0565, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final WinterFlowSoftwareSubsystem WinterFlowTestingNode(int i, WinterFlowResolverLibrary winterFlowResolverLibrary, int i2) {
        TypedValue typedValue;
        int i3;
        WinterFlowProxyValidator winterFlowProxyValidator;
        long j;
        int i4;
        ArrayList arrayList;
        int i5;
        int i6;
        float f;
        int i7;
        TypedArray obtainStyledAttributes;
        int i8;
        TypedArray obtainStyledAttributes2;
        int i9;
        int i10;
        int i11;
        ColorStateList colorStateList;
        Context context = (Context) winterFlowResolverLibrary.WinterFlowSyntax(WinterFlowUnitTestProvider.WinterFlowHookDataSource);
        Resources resources = (Resources) winterFlowResolverLibrary.WinterFlowSyntax(WinterFlowUnitTestProvider.WinterFlowCacheManagerAgent);
        WinterFlowHookProcess winterFlowHookProcess = (WinterFlowHookProcess) winterFlowResolverLibrary.WinterFlowSyntax(WinterFlowUnitTestProvider.WinterFlowVariableVersionControl);
        synchronized (winterFlowHookProcess) {
            typedValue = (TypedValue) winterFlowHookProcess.WinterFlowRouterStructure.WinterFlowHookDataSource(i);
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i, typedValue, true);
                WinterFlowViewSoftware winterFlowViewSoftware = winterFlowHookProcess.WinterFlowRouterStructure;
                int WinterFlowArrayNetwork2 = winterFlowViewSoftware.WinterFlowArrayNetwork(i);
                Object[] objArr = winterFlowViewSoftware.WinterFlowCacheManagerAgent;
                Object obj = objArr[WinterFlowArrayNetwork2];
                winterFlowViewSoftware.WinterFlowHookDataSource[WinterFlowArrayNetwork2] = i;
                objArr[WinterFlowArrayNetwork2] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null) {
            if (charSequence instanceof String ? ((String) charSequence).endsWith(".xml") : WinterFlowFrameworkStrategy.WinterFlowConfigurationSubsystem(charSequence, charSequence.length() - 4, ".xml", 0, 4, false)) {
                winterFlowResolverLibrary.WinterFlowCompilerDataSource(-1771798434);
                Resources.Theme theme = context.getTheme();
                int i12 = typedValue.changingConfigurations;
                WinterFlowStrategyDatabase winterFlowStrategyDatabase = (WinterFlowStrategyDatabase) winterFlowResolverLibrary.WinterFlowSyntax(WinterFlowUnitTestProvider.WinterFlowArrayNetwork);
                WinterFlowInvokerInterface winterFlowInvokerInterface = new WinterFlowInvokerInterface(theme, i);
                WeakReference weakReference = (WeakReference) winterFlowStrategyDatabase.WinterFlowRouterStructure.get(winterFlowInvokerInterface);
                WinterFlowRuntimeSoftware winterFlowRuntimeSoftware = weakReference != null ? (WinterFlowRuntimeSoftware) weakReference.get() : null;
                if (winterFlowRuntimeSoftware == null) {
                    XmlResourceParser xml = resources.getXml(i);
                    int next = xml.next();
                    while (next != 2 && next != 1) {
                        next = xml.next();
                    }
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found");
                    }
                    if (!WinterFlowManagerRequest.WinterFlowThreadListener(xml.getName(), "vector")) {
                        WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                        return null;
                    }
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                    WinterFlowUnitTestDatabase winterFlowUnitTestDatabase = new WinterFlowUnitTestDatabase(xml);
                    int[] iArr = WinterFlowHandlerWebsocket.WinterFlowRouterStructure;
                    TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(asAttributeSet, iArr) : theme.obtainStyledAttributes(asAttributeSet, iArr, 0, 0);
                    winterFlowProxyValidator = null;
                    winterFlowUnitTestDatabase.WinterFlowCacheManagerAgent(obtainAttributes.getChangingConfigurations());
                    boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null ? obtainAttributes.getBoolean(5, false) : false;
                    winterFlowUnitTestDatabase.WinterFlowCacheManagerAgent(obtainAttributes.getChangingConfigurations());
                    float WinterFlowHookDataSource2 = winterFlowUnitTestDatabase.WinterFlowHookDataSource(obtainAttributes, "viewportWidth", 7, 0.0f);
                    float WinterFlowHookDataSource3 = winterFlowUnitTestDatabase.WinterFlowHookDataSource(obtainAttributes, "viewportHeight", 8, 0.0f);
                    if (WinterFlowHookDataSource2 <= 0.0f) {
                        throw new XmlPullParserException(obtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
                    }
                    if (WinterFlowHookDataSource3 <= 0.0f) {
                        throw new XmlPullParserException(obtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
                    }
                    float dimension = obtainAttributes.getDimension(3, 0.0f);
                    winterFlowUnitTestDatabase.WinterFlowCacheManagerAgent(obtainAttributes.getChangingConfigurations());
                    float dimension2 = obtainAttributes.getDimension(2, 0.0f);
                    winterFlowUnitTestDatabase.WinterFlowCacheManagerAgent(obtainAttributes.getChangingConfigurations());
                    if (obtainAttributes.hasValue(1)) {
                        TypedValue typedValue2 = new TypedValue();
                        obtainAttributes.getValue(1, typedValue2);
                        if (typedValue2.type == 2) {
                            j = WinterFlowInheritanceSubsystem.WinterFlowResponseEngine;
                        } else {
                            if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
                                TypedValue typedValue3 = new TypedValue();
                                obtainAttributes.getValue(1, typedValue3);
                                int i13 = typedValue3.type;
                                if (i13 == 2) {
                                    throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue3);
                                }
                                if (i13 < 28 || i13 > 31) {
                                    Resources resources2 = obtainAttributes.getResources();
                                    int resourceId = obtainAttributes.getResourceId(1, 0);
                                    ThreadLocal threadLocal = WinterFlowHandlerUtility.WinterFlowRouterStructure;
                                    try {
                                        colorStateList = WinterFlowHandlerUtility.WinterFlowRouterStructure(resources2, resources2.getXml(resourceId), theme);
                                    } catch (Exception unused) {
                                    }
                                } else {
                                    colorStateList = ColorStateList.valueOf(typedValue3.data);
                                }
                                winterFlowUnitTestDatabase.WinterFlowCacheManagerAgent(obtainAttributes.getChangingConfigurations());
                                j = colorStateList == null ? WinterFlowInvokerComponent.WinterFlowArrayNetwork(colorStateList.getDefaultColor()) : WinterFlowInheritanceSubsystem.WinterFlowResponseEngine;
                            }
                            colorStateList = null;
                            winterFlowUnitTestDatabase.WinterFlowCacheManagerAgent(obtainAttributes.getChangingConfigurations());
                            if (colorStateList == null) {
                            }
                        }
                    } else {
                        j = WinterFlowInheritanceSubsystem.WinterFlowResponseEngine;
                    }
                    int i14 = obtainAttributes.getInt(6, -1);
                    winterFlowUnitTestDatabase.WinterFlowCacheManagerAgent(obtainAttributes.getChangingConfigurations());
                    if (i14 != -1) {
                        if (i14 == 3) {
                            i4 = 3;
                        } else if (i14 != 5) {
                            if (i14 != 9) {
                                switch (i14) {
                                    case 14:
                                        i4 = 13;
                                        break;
                                    case 15:
                                        i4 = 14;
                                        break;
                                    case 16:
                                        i4 = 12;
                                        break;
                                }
                            } else {
                                i4 = 9;
                            }
                        }
                        float f2 = dimension / resources.getDisplayMetrics().density;
                        float f3 = dimension2 / resources.getDisplayMetrics().density;
                        obtainAttributes.recycle();
                        arrayList = new ArrayList();
                        WinterFlowDatabaseService winterFlowDatabaseService = new WinterFlowDatabaseService(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
                        arrayList.add(winterFlowDatabaseService);
                        int i15 = 0;
                        for (i3 = 1; xml.getEventType() != i3; i3 = 1) {
                            if (xml.getDepth() < i3) {
                                i5 = i3;
                                if (xml.getEventType() == 3) {
                                    int i16 = i4;
                                    float f4 = f3;
                                    int i17 = i12 | winterFlowUnitTestDatabase.WinterFlowHookDataSource;
                                    while (arrayList.size() > 1) {
                                        WinterFlowDatabaseService winterFlowDatabaseService2 = (WinterFlowDatabaseService) arrayList.remove(arrayList.size() - 1);
                                        ((WinterFlowDatabaseService) arrayList.get(arrayList.size() - 1)).WinterFlowResponseEngine.add(new WinterFlowRequestTool(winterFlowDatabaseService2.WinterFlowRouterStructure, winterFlowDatabaseService2.WinterFlowHookDataSource, winterFlowDatabaseService2.WinterFlowCacheManagerAgent, winterFlowDatabaseService2.WinterFlowArrayNetwork, winterFlowDatabaseService2.WinterFlowVariableVersionControl, winterFlowDatabaseService2.WinterFlowTransactionManagerStrategy, winterFlowDatabaseService2.WinterFlowUnitTestResponse, winterFlowDatabaseService2.WinterFlowRouterRouter, winterFlowDatabaseService2.WinterFlowSyntax, winterFlowDatabaseService2.WinterFlowResponseEngine));
                                    }
                                    winterFlowRuntimeSoftware = new WinterFlowRuntimeSoftware(new WinterFlowAdapterProtocol(f2, f4, WinterFlowHookDataSource2, WinterFlowHookDataSource3, new WinterFlowRequestTool(winterFlowDatabaseService.WinterFlowRouterStructure, winterFlowDatabaseService.WinterFlowHookDataSource, winterFlowDatabaseService.WinterFlowCacheManagerAgent, winterFlowDatabaseService.WinterFlowArrayNetwork, winterFlowDatabaseService.WinterFlowVariableVersionControl, winterFlowDatabaseService.WinterFlowTransactionManagerStrategy, winterFlowDatabaseService.WinterFlowUnitTestResponse, winterFlowDatabaseService.WinterFlowRouterRouter, winterFlowDatabaseService.WinterFlowSyntax, winterFlowDatabaseService.WinterFlowResponseEngine), j, i16, z), i17);
                                    winterFlowStrategyDatabase.WinterFlowRouterStructure.put(winterFlowInvokerInterface, new WeakReference(winterFlowRuntimeSoftware));
                                }
                            } else {
                                i5 = i3;
                            }
                            List list = WinterFlowDataSourceEngine.WinterFlowVariableVersionControl;
                            XmlPullParser xmlPullParser = winterFlowUnitTestDatabase.WinterFlowRouterStructure;
                            WinterFlowConfigurationModule winterFlowConfigurationModule = winterFlowUnitTestDatabase.WinterFlowCacheManagerAgent;
                            XmlResourceParser xmlResourceParser = xml;
                            int eventType = xmlPullParser.getEventType();
                            int i18 = i4;
                            if (eventType != 2) {
                                if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                                    int i19 = 0;
                                    for (int i20 = i15 + 1; i19 < i20; i20 = i20) {
                                        WinterFlowDatabaseService winterFlowDatabaseService3 = (WinterFlowDatabaseService) arrayList.remove(arrayList.size() - 1);
                                        ((WinterFlowDatabaseService) arrayList.get(arrayList.size() - 1)).WinterFlowResponseEngine.add(new WinterFlowRequestTool(winterFlowDatabaseService3.WinterFlowRouterStructure, winterFlowDatabaseService3.WinterFlowHookDataSource, winterFlowDatabaseService3.WinterFlowCacheManagerAgent, winterFlowDatabaseService3.WinterFlowArrayNetwork, winterFlowDatabaseService3.WinterFlowVariableVersionControl, winterFlowDatabaseService3.WinterFlowTransactionManagerStrategy, winterFlowDatabaseService3.WinterFlowUnitTestResponse, winterFlowDatabaseService3.WinterFlowRouterRouter, winterFlowDatabaseService3.WinterFlowSyntax, winterFlowDatabaseService3.WinterFlowResponseEngine));
                                        i19++;
                                    }
                                    i6 = i12;
                                    f = f3;
                                    i15 = 0;
                                    xmlResourceParser.next();
                                    xml = xmlResourceParser;
                                    i4 = i18;
                                    i12 = i6;
                                    f3 = f;
                                }
                                i6 = i12;
                                f = f3;
                            } else {
                                String name = xmlPullParser.getName();
                                if (name != null) {
                                    int hashCode = name.hashCode();
                                    i6 = i12;
                                    if (hashCode != -1649314686) {
                                        f = f3;
                                        if (hashCode != 3433509) {
                                            if (hashCode == 98629247 && name.equals("group")) {
                                                int[] iArr2 = WinterFlowHandlerWebsocket.WinterFlowHookDataSource;
                                                TypedArray obtainAttributes2 = theme == null ? resources.obtainAttributes(asAttributeSet, iArr2) : theme.obtainStyledAttributes(asAttributeSet, iArr2, 0, 0);
                                                winterFlowUnitTestDatabase.WinterFlowCacheManagerAgent(obtainAttributes2.getChangingConfigurations());
                                                float WinterFlowHookDataSource4 = winterFlowUnitTestDatabase.WinterFlowHookDataSource(obtainAttributes2, "rotation", 5, 0.0f);
                                                float f5 = obtainAttributes2.getFloat(i5, 0.0f);
                                                winterFlowUnitTestDatabase.WinterFlowCacheManagerAgent(obtainAttributes2.getChangingConfigurations());
                                                float f6 = obtainAttributes2.getFloat(2, 0.0f);
                                                winterFlowUnitTestDatabase.WinterFlowCacheManagerAgent(obtainAttributes2.getChangingConfigurations());
                                                float WinterFlowHookDataSource5 = winterFlowUnitTestDatabase.WinterFlowHookDataSource(obtainAttributes2, "scaleX", 3, 1.0f);
                                                float WinterFlowHookDataSource6 = winterFlowUnitTestDatabase.WinterFlowHookDataSource(obtainAttributes2, "scaleY", 4, 1.0f);
                                                float WinterFlowHookDataSource7 = winterFlowUnitTestDatabase.WinterFlowHookDataSource(obtainAttributes2, "translateX", 6, 0.0f);
                                                float WinterFlowHookDataSource8 = winterFlowUnitTestDatabase.WinterFlowHookDataSource(obtainAttributes2, "translateY", 7, 0.0f);
                                                String string = obtainAttributes2.getString(0);
                                                winterFlowUnitTestDatabase.WinterFlowCacheManagerAgent(obtainAttributes2.getChangingConfigurations());
                                                String str = string == null ? "" : string;
                                                obtainAttributes2.recycle();
                                                int i21 = WinterFlowInheritanceThreadPool.WinterFlowRouterStructure;
                                                arrayList.add(new WinterFlowDatabaseService(str, WinterFlowHookDataSource4, f5, f6, WinterFlowHookDataSource5, WinterFlowHookDataSource6, WinterFlowHookDataSource7, WinterFlowHookDataSource8, list, 512));
                                            }
                                        } else if (name.equals("path")) {
                                            int[] iArr3 = WinterFlowHandlerWebsocket.WinterFlowCacheManagerAgent;
                                            if (theme == null) {
                                                obtainStyledAttributes2 = resources.obtainAttributes(asAttributeSet, iArr3);
                                                i8 = 0;
                                            } else {
                                                i8 = 0;
                                                obtainStyledAttributes2 = theme.obtainStyledAttributes(asAttributeSet, iArr3, 0, 0);
                                            }
                                            winterFlowUnitTestDatabase.WinterFlowCacheManagerAgent(obtainStyledAttributes2.getChangingConfigurations());
                                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) {
                                                WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("No path data available");
                                                return null;
                                            }
                                            String string2 = obtainStyledAttributes2.getString(i8);
                                            winterFlowUnitTestDatabase.WinterFlowCacheManagerAgent(obtainStyledAttributes2.getChangingConfigurations());
                                            String str2 = string2 == null ? "" : string2;
                                            String string3 = obtainStyledAttributes2.getString(2);
                                            winterFlowUnitTestDatabase.WinterFlowCacheManagerAgent(obtainStyledAttributes2.getChangingConfigurations());
                                            if (string3 == null) {
                                                int i22 = WinterFlowInheritanceThreadPool.WinterFlowRouterStructure;
                                            } else {
                                                list = WinterFlowConfigurationModule.WinterFlowBandwidthObject(winterFlowConfigurationModule, string3);
                                            }
                                            List list2 = list;
                                            WinterFlowSyntax WinterFlowRouterStructure2 = winterFlowUnitTestDatabase.WinterFlowRouterStructure(obtainStyledAttributes2, theme, "fillColor", 1);
                                            float WinterFlowHookDataSource9 = winterFlowUnitTestDatabase.WinterFlowHookDataSource(obtainStyledAttributes2, "fillAlpha", 12, 1.0f);
                                            int i23 = !WinterFlowFrameworkMechanism.WinterFlowUnitTestResponse(winterFlowUnitTestDatabase.WinterFlowRouterStructure, "strokeLineCap") ? -1 : obtainStyledAttributes2.getInt(8, -1);
                                            winterFlowUnitTestDatabase.WinterFlowCacheManagerAgent(obtainStyledAttributes2.getChangingConfigurations());
                                            if (i23 != 0) {
                                                if (i23 == 1) {
                                                    i9 = 1;
                                                } else if (i23 == 2) {
                                                    i9 = 2;
                                                }
                                                i10 = WinterFlowFrameworkMechanism.WinterFlowUnitTestResponse(winterFlowUnitTestDatabase.WinterFlowRouterStructure, "strokeLineJoin") ? -1 : obtainStyledAttributes2.getInt(9, -1);
                                                winterFlowUnitTestDatabase.WinterFlowCacheManagerAgent(obtainStyledAttributes2.getChangingConfigurations());
                                                if (i10 != 0) {
                                                    if (i10 == 1) {
                                                        i11 = 1;
                                                    } else if (i10 == 2) {
                                                        i11 = 2;
                                                    }
                                                    float WinterFlowHookDataSource10 = winterFlowUnitTestDatabase.WinterFlowHookDataSource(obtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                                    WinterFlowSyntax WinterFlowRouterStructure3 = winterFlowUnitTestDatabase.WinterFlowRouterStructure(obtainStyledAttributes2, theme, "strokeColor", 3);
                                                    float WinterFlowHookDataSource11 = winterFlowUnitTestDatabase.WinterFlowHookDataSource(obtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                                    float WinterFlowHookDataSource12 = winterFlowUnitTestDatabase.WinterFlowHookDataSource(obtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                                    float WinterFlowHookDataSource13 = winterFlowUnitTestDatabase.WinterFlowHookDataSource(obtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                                    float WinterFlowHookDataSource14 = winterFlowUnitTestDatabase.WinterFlowHookDataSource(obtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                                    float WinterFlowHookDataSource15 = winterFlowUnitTestDatabase.WinterFlowHookDataSource(obtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                                    int i24 = !WinterFlowFrameworkMechanism.WinterFlowUnitTestResponse(winterFlowUnitTestDatabase.WinterFlowRouterStructure, "fillType") ? 0 : obtainStyledAttributes2.getInt(13, 0);
                                                    winterFlowUnitTestDatabase.WinterFlowCacheManagerAgent(obtainStyledAttributes2.getChangingConfigurations());
                                                    obtainStyledAttributes2.recycle();
                                                    Shader shader = (Shader) WinterFlowRouterStructure2.WinterFlowHookDataSource;
                                                    int i25 = WinterFlowRouterStructure2.WinterFlowRouterStructure;
                                                    WinterFlowHandlerWebsocket winterFlowProtocolUtility = (shader == null && i25 == 0) ? null : shader != null ? new WinterFlowProtocolUtility(shader) : new WinterFlowRouterFramework(WinterFlowInvokerComponent.WinterFlowArrayNetwork(i25));
                                                    Shader shader2 = (Shader) WinterFlowRouterStructure3.WinterFlowHookDataSource;
                                                    int i26 = WinterFlowRouterStructure3.WinterFlowRouterStructure;
                                                    ((WinterFlowDatabaseService) arrayList.get(arrayList.size() - 1)).WinterFlowResponseEngine.add(new WinterFlowNetworkUnitTest(str2, list2, i24 == 0 ? 0 : 1, winterFlowProtocolUtility, WinterFlowHookDataSource9, (shader2 == null && i26 == 0) ? null : shader2 == null ? new WinterFlowProtocolUtility(shader2) : new WinterFlowRouterFramework(WinterFlowInvokerComponent.WinterFlowArrayNetwork(i26)), WinterFlowHookDataSource11, WinterFlowHookDataSource12, i9, i11, WinterFlowHookDataSource10, WinterFlowHookDataSource15, WinterFlowHookDataSource13, WinterFlowHookDataSource14));
                                                    xmlResourceParser.next();
                                                    xml = xmlResourceParser;
                                                    i4 = i18;
                                                    i12 = i6;
                                                    f3 = f;
                                                }
                                                i11 = 0;
                                                float WinterFlowHookDataSource102 = winterFlowUnitTestDatabase.WinterFlowHookDataSource(obtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                                WinterFlowSyntax WinterFlowRouterStructure32 = winterFlowUnitTestDatabase.WinterFlowRouterStructure(obtainStyledAttributes2, theme, "strokeColor", 3);
                                                float WinterFlowHookDataSource112 = winterFlowUnitTestDatabase.WinterFlowHookDataSource(obtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                                float WinterFlowHookDataSource122 = winterFlowUnitTestDatabase.WinterFlowHookDataSource(obtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                                float WinterFlowHookDataSource132 = winterFlowUnitTestDatabase.WinterFlowHookDataSource(obtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                                float WinterFlowHookDataSource142 = winterFlowUnitTestDatabase.WinterFlowHookDataSource(obtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                                float WinterFlowHookDataSource152 = winterFlowUnitTestDatabase.WinterFlowHookDataSource(obtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                                if (!WinterFlowFrameworkMechanism.WinterFlowUnitTestResponse(winterFlowUnitTestDatabase.WinterFlowRouterStructure, "fillType")) {
                                                }
                                                winterFlowUnitTestDatabase.WinterFlowCacheManagerAgent(obtainStyledAttributes2.getChangingConfigurations());
                                                obtainStyledAttributes2.recycle();
                                                Shader shader3 = (Shader) WinterFlowRouterStructure2.WinterFlowHookDataSource;
                                                int i252 = WinterFlowRouterStructure2.WinterFlowRouterStructure;
                                                if (shader3 == null) {
                                                    Shader shader22 = (Shader) WinterFlowRouterStructure32.WinterFlowHookDataSource;
                                                    int i262 = WinterFlowRouterStructure32.WinterFlowRouterStructure;
                                                    if (shader22 == null) {
                                                        ((WinterFlowDatabaseService) arrayList.get(arrayList.size() - 1)).WinterFlowResponseEngine.add(new WinterFlowNetworkUnitTest(str2, list2, i24 == 0 ? 0 : 1, winterFlowProtocolUtility, WinterFlowHookDataSource9, (shader22 == null && i262 == 0) ? null : shader22 == null ? new WinterFlowProtocolUtility(shader22) : new WinterFlowRouterFramework(WinterFlowInvokerComponent.WinterFlowArrayNetwork(i262)), WinterFlowHookDataSource112, WinterFlowHookDataSource122, i9, i11, WinterFlowHookDataSource102, WinterFlowHookDataSource152, WinterFlowHookDataSource132, WinterFlowHookDataSource142));
                                                        xmlResourceParser.next();
                                                        xml = xmlResourceParser;
                                                        i4 = i18;
                                                        i12 = i6;
                                                        f3 = f;
                                                    }
                                                    ((WinterFlowDatabaseService) arrayList.get(arrayList.size() - 1)).WinterFlowResponseEngine.add(new WinterFlowNetworkUnitTest(str2, list2, i24 == 0 ? 0 : 1, winterFlowProtocolUtility, WinterFlowHookDataSource9, (shader22 == null && i262 == 0) ? null : shader22 == null ? new WinterFlowProtocolUtility(shader22) : new WinterFlowRouterFramework(WinterFlowInvokerComponent.WinterFlowArrayNetwork(i262)), WinterFlowHookDataSource112, WinterFlowHookDataSource122, i9, i11, WinterFlowHookDataSource102, WinterFlowHookDataSource152, WinterFlowHookDataSource132, WinterFlowHookDataSource142));
                                                    xmlResourceParser.next();
                                                    xml = xmlResourceParser;
                                                    i4 = i18;
                                                    i12 = i6;
                                                    f3 = f;
                                                }
                                                Shader shader222 = (Shader) WinterFlowRouterStructure32.WinterFlowHookDataSource;
                                                int i2622 = WinterFlowRouterStructure32.WinterFlowRouterStructure;
                                                ((WinterFlowDatabaseService) arrayList.get(arrayList.size() - 1)).WinterFlowResponseEngine.add(new WinterFlowNetworkUnitTest(str2, list2, i24 == 0 ? 0 : 1, winterFlowProtocolUtility, WinterFlowHookDataSource9, (shader222 == null && i2622 == 0) ? null : shader222 == null ? new WinterFlowProtocolUtility(shader222) : new WinterFlowRouterFramework(WinterFlowInvokerComponent.WinterFlowArrayNetwork(i2622)), WinterFlowHookDataSource112, WinterFlowHookDataSource122, i9, i11, WinterFlowHookDataSource102, WinterFlowHookDataSource152, WinterFlowHookDataSource132, WinterFlowHookDataSource142));
                                                xmlResourceParser.next();
                                                xml = xmlResourceParser;
                                                i4 = i18;
                                                i12 = i6;
                                                f3 = f;
                                            }
                                            i9 = 0;
                                            if (WinterFlowFrameworkMechanism.WinterFlowUnitTestResponse(winterFlowUnitTestDatabase.WinterFlowRouterStructure, "strokeLineJoin")) {
                                            }
                                            winterFlowUnitTestDatabase.WinterFlowCacheManagerAgent(obtainStyledAttributes2.getChangingConfigurations());
                                            if (i10 != 0) {
                                            }
                                            i11 = 0;
                                            float WinterFlowHookDataSource1022 = winterFlowUnitTestDatabase.WinterFlowHookDataSource(obtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                            WinterFlowSyntax WinterFlowRouterStructure322 = winterFlowUnitTestDatabase.WinterFlowRouterStructure(obtainStyledAttributes2, theme, "strokeColor", 3);
                                            float WinterFlowHookDataSource1122 = winterFlowUnitTestDatabase.WinterFlowHookDataSource(obtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                            float WinterFlowHookDataSource1222 = winterFlowUnitTestDatabase.WinterFlowHookDataSource(obtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                            float WinterFlowHookDataSource1322 = winterFlowUnitTestDatabase.WinterFlowHookDataSource(obtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                            float WinterFlowHookDataSource1422 = winterFlowUnitTestDatabase.WinterFlowHookDataSource(obtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                            float WinterFlowHookDataSource1522 = winterFlowUnitTestDatabase.WinterFlowHookDataSource(obtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                            if (!WinterFlowFrameworkMechanism.WinterFlowUnitTestResponse(winterFlowUnitTestDatabase.WinterFlowRouterStructure, "fillType")) {
                                            }
                                            winterFlowUnitTestDatabase.WinterFlowCacheManagerAgent(obtainStyledAttributes2.getChangingConfigurations());
                                            obtainStyledAttributes2.recycle();
                                            Shader shader32 = (Shader) WinterFlowRouterStructure2.WinterFlowHookDataSource;
                                            int i2522 = WinterFlowRouterStructure2.WinterFlowRouterStructure;
                                            if (shader32 == null) {
                                            }
                                            Shader shader2222 = (Shader) WinterFlowRouterStructure322.WinterFlowHookDataSource;
                                            int i26222 = WinterFlowRouterStructure322.WinterFlowRouterStructure;
                                            ((WinterFlowDatabaseService) arrayList.get(arrayList.size() - 1)).WinterFlowResponseEngine.add(new WinterFlowNetworkUnitTest(str2, list2, i24 == 0 ? 0 : 1, winterFlowProtocolUtility, WinterFlowHookDataSource9, (shader2222 == null && i26222 == 0) ? null : shader2222 == null ? new WinterFlowProtocolUtility(shader2222) : new WinterFlowRouterFramework(WinterFlowInvokerComponent.WinterFlowArrayNetwork(i26222)), WinterFlowHookDataSource1122, WinterFlowHookDataSource1222, i9, i11, WinterFlowHookDataSource1022, WinterFlowHookDataSource1522, WinterFlowHookDataSource1322, WinterFlowHookDataSource1422));
                                            xmlResourceParser.next();
                                            xml = xmlResourceParser;
                                            i4 = i18;
                                            i12 = i6;
                                            f3 = f;
                                        }
                                    } else {
                                        f = f3;
                                        if (name.equals("clip-path")) {
                                            int[] iArr4 = WinterFlowHandlerWebsocket.WinterFlowArrayNetwork;
                                            if (theme == null) {
                                                obtainStyledAttributes = resources.obtainAttributes(asAttributeSet, iArr4);
                                                i7 = 0;
                                            } else {
                                                i7 = 0;
                                                obtainStyledAttributes = theme.obtainStyledAttributes(asAttributeSet, iArr4, 0, 0);
                                            }
                                            winterFlowUnitTestDatabase.WinterFlowCacheManagerAgent(obtainStyledAttributes.getChangingConfigurations());
                                            String string4 = obtainStyledAttributes.getString(i7);
                                            winterFlowUnitTestDatabase.WinterFlowCacheManagerAgent(obtainStyledAttributes.getChangingConfigurations());
                                            String str3 = string4 == null ? "" : string4;
                                            String string5 = obtainStyledAttributes.getString(1);
                                            winterFlowUnitTestDatabase.WinterFlowCacheManagerAgent(obtainStyledAttributes.getChangingConfigurations());
                                            if (string5 == null) {
                                                int i27 = WinterFlowInheritanceThreadPool.WinterFlowRouterStructure;
                                            } else {
                                                list = WinterFlowConfigurationModule.WinterFlowBandwidthObject(winterFlowConfigurationModule, string5);
                                            }
                                            List list3 = list;
                                            obtainStyledAttributes.recycle();
                                            arrayList.add(new WinterFlowDatabaseService(str3, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, list3, 512));
                                            i15++;
                                        }
                                        xmlResourceParser.next();
                                        xml = xmlResourceParser;
                                        i4 = i18;
                                        i12 = i6;
                                        f3 = f;
                                    }
                                }
                                i6 = i12;
                                f = f3;
                            }
                            xmlResourceParser.next();
                            xml = xmlResourceParser;
                            i4 = i18;
                            i12 = i6;
                            f3 = f;
                        }
                        int i162 = i4;
                        float f42 = f3;
                        int i172 = i12 | winterFlowUnitTestDatabase.WinterFlowHookDataSource;
                        while (arrayList.size() > 1) {
                        }
                        winterFlowRuntimeSoftware = new WinterFlowRuntimeSoftware(new WinterFlowAdapterProtocol(f2, f42, WinterFlowHookDataSource2, WinterFlowHookDataSource3, new WinterFlowRequestTool(winterFlowDatabaseService.WinterFlowRouterStructure, winterFlowDatabaseService.WinterFlowHookDataSource, winterFlowDatabaseService.WinterFlowCacheManagerAgent, winterFlowDatabaseService.WinterFlowArrayNetwork, winterFlowDatabaseService.WinterFlowVariableVersionControl, winterFlowDatabaseService.WinterFlowTransactionManagerStrategy, winterFlowDatabaseService.WinterFlowUnitTestResponse, winterFlowDatabaseService.WinterFlowRouterRouter, winterFlowDatabaseService.WinterFlowSyntax, winterFlowDatabaseService.WinterFlowResponseEngine), j, i162, z), i172);
                        winterFlowStrategyDatabase.WinterFlowRouterStructure.put(winterFlowInvokerInterface, new WeakReference(winterFlowRuntimeSoftware));
                    }
                    i4 = 5;
                    float f22 = dimension / resources.getDisplayMetrics().density;
                    float f32 = dimension2 / resources.getDisplayMetrics().density;
                    obtainAttributes.recycle();
                    arrayList = new ArrayList();
                    WinterFlowDatabaseService winterFlowDatabaseService4 = new WinterFlowDatabaseService(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
                    arrayList.add(winterFlowDatabaseService4);
                    int i152 = 0;
                    while (xml.getEventType() != i3) {
                    }
                    int i1622 = i4;
                    float f422 = f32;
                    int i1722 = i12 | winterFlowUnitTestDatabase.WinterFlowHookDataSource;
                    while (arrayList.size() > 1) {
                    }
                    winterFlowRuntimeSoftware = new WinterFlowRuntimeSoftware(new WinterFlowAdapterProtocol(f22, f422, WinterFlowHookDataSource2, WinterFlowHookDataSource3, new WinterFlowRequestTool(winterFlowDatabaseService4.WinterFlowRouterStructure, winterFlowDatabaseService4.WinterFlowHookDataSource, winterFlowDatabaseService4.WinterFlowCacheManagerAgent, winterFlowDatabaseService4.WinterFlowArrayNetwork, winterFlowDatabaseService4.WinterFlowVariableVersionControl, winterFlowDatabaseService4.WinterFlowTransactionManagerStrategy, winterFlowDatabaseService4.WinterFlowUnitTestResponse, winterFlowDatabaseService4.WinterFlowRouterRouter, winterFlowDatabaseService4.WinterFlowSyntax, winterFlowDatabaseService4.WinterFlowResponseEngine), j, i1622, z), i1722);
                    winterFlowStrategyDatabase.WinterFlowRouterStructure.put(winterFlowInvokerInterface, new WeakReference(winterFlowRuntimeSoftware));
                } else {
                    winterFlowProxyValidator = null;
                }
                WinterFlowAdapterProtocol winterFlowAdapterProtocol = winterFlowRuntimeSoftware.WinterFlowRouterStructure;
                WinterFlowConcurrencyParser winterFlowConcurrencyParser = (WinterFlowConcurrencyParser) winterFlowResolverLibrary.WinterFlowSyntax(WinterFlowBackendTransactionManager.WinterFlowRouterRouter);
                boolean WinterFlowArrayNetwork3 = winterFlowResolverLibrary.WinterFlowArrayNetwork((Float.floatToRawIntBits(winterFlowConcurrencyParser.WinterFlowHookDataSource()) & 4294967295L) | (Float.floatToRawIntBits(winterFlowAdapterProtocol.WinterFlowSyntax) << 32));
                Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                if (WinterFlowArrayNetwork3 || WinterFlowSyntaxSubsystem == WinterFlowModuleModule.WinterFlowRouterStructure) {
                    WinterFlowMicroserviceHandler winterFlowMicroserviceHandler = new WinterFlowMicroserviceHandler();
                    WinterFlowProviderRouter.WinterFlowRouterRouter(winterFlowMicroserviceHandler, winterFlowAdapterProtocol.WinterFlowVariableVersionControl);
                    long floatToRawIntBits = (Float.floatToRawIntBits(winterFlowConcurrencyParser.WinterFlowSingletonPlatform(winterFlowAdapterProtocol.WinterFlowRouterStructure)) << 32) | (Float.floatToRawIntBits(winterFlowConcurrencyParser.WinterFlowSingletonPlatform(winterFlowAdapterProtocol.WinterFlowHookDataSource)) & 4294967295L);
                    float f7 = winterFlowAdapterProtocol.WinterFlowCacheManagerAgent;
                    float f8 = winterFlowAdapterProtocol.WinterFlowArrayNetwork;
                    if (Float.isNaN(f7)) {
                        f7 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
                    }
                    if (Float.isNaN(f8)) {
                        f8 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
                    }
                    long floatToRawIntBits2 = (Float.floatToRawIntBits(f7) << 32) | (4294967295L & Float.floatToRawIntBits(f8));
                    WinterFlowFrontendQuery winterFlowFrontendQuery = new WinterFlowFrontendQuery(winterFlowMicroserviceHandler);
                    long j2 = winterFlowAdapterProtocol.WinterFlowTransactionManagerStrategy;
                    WinterFlowProxyValidator winterFlowProxyValidator2 = j2 != 16 ? new WinterFlowProxyValidator(winterFlowAdapterProtocol.WinterFlowUnitTestResponse, j2) : winterFlowProxyValidator;
                    boolean z2 = winterFlowAdapterProtocol.WinterFlowRouterRouter;
                    winterFlowFrontendQuery.WinterFlowVariableVersionControl.setValue(new WinterFlowModuleBandwidth(floatToRawIntBits));
                    winterFlowFrontendQuery.WinterFlowTransactionManagerStrategy.setValue(Boolean.valueOf(z2));
                    WinterFlowScriptHandler winterFlowScriptHandler = winterFlowFrontendQuery.WinterFlowUnitTestResponse;
                    winterFlowScriptHandler.WinterFlowTransactionManagerStrategy.setValue(winterFlowProxyValidator2);
                    winterFlowScriptHandler.WinterFlowRouterRouter.setValue(new WinterFlowModuleBandwidth(floatToRawIntBits2));
                    winterFlowResolverLibrary.WinterFlowArrayFramework(winterFlowFrontendQuery);
                    WinterFlowSyntaxSubsystem = winterFlowFrontendQuery;
                }
                WinterFlowFrontendQuery winterFlowFrontendQuery2 = (WinterFlowFrontendQuery) WinterFlowSyntaxSubsystem;
                winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
                return winterFlowFrontendQuery2;
            }
        }
        winterFlowResolverLibrary.WinterFlowCompilerDataSource(-1771643000);
        boolean WinterFlowVariableVersionControl2 = winterFlowResolverLibrary.WinterFlowVariableVersionControl(context.getTheme()) | winterFlowResolverLibrary.WinterFlowVariableVersionControl(charSequence) | ((((i2 & 14) ^ 6) > 4 && winterFlowResolverLibrary.WinterFlowCacheManagerAgent(i)) || (i2 & 6) == 4);
        Object WinterFlowSyntaxSubsystem2 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
        if (WinterFlowVariableVersionControl2 || WinterFlowSyntaxSubsystem2 == WinterFlowModuleModule.WinterFlowRouterStructure) {
            try {
                Drawable drawable = resources.getDrawable(i, null);
                drawable.getClass();
                WinterFlowSyntaxSubsystem2 = new WinterFlowSoftwareUserManager(((BitmapDrawable) drawable).getBitmap());
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem2);
            } catch (Exception e) {
                throw new WinterFlowServerSystem("Error attempting to load resource: " + ((Object) charSequence), e);
            }
        }
        WinterFlowVersionStructure winterFlowVersionStructure = new WinterFlowVersionStructure((WinterFlowSoftwareUserManager) WinterFlowSyntaxSubsystem2);
        winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
        return winterFlowVersionStructure;
    }

    public static final void WinterFlowThreadListener(int i, int i2, WinterFlowObjectUI winterFlowObjectUI, WinterFlowResolverLibrary winterFlowResolverLibrary, WinterFlowMapperManager winterFlowMapperManager, String str) {
        int i3;
        WinterFlowMapperManager winterFlowMapperManager2;
        String str2;
        WinterFlowResolverLibrary winterFlowResolverLibrary2 = winterFlowResolverLibrary;
        winterFlowObjectUI.getClass();
        winterFlowResolverLibrary2.WinterFlowFrameworkTransaction(1990398358);
        if ((i2 & 6) == 0) {
            i3 = i2 | (winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowMapperManager) ? 4 : 2);
        } else {
            i3 = i2;
        }
        int i4 = i3 | (winterFlowResolverLibrary2.WinterFlowCacheManagerAgent(i) ? 32 : 16) | (winterFlowResolverLibrary2.WinterFlowUnitTestResponse(winterFlowObjectUI) ? 2048 : 1024);
        if (winterFlowResolverLibrary2.WinterFlowFrontendBackend(i4 & 1, (i4 & 1171) != 1170)) {
            winterFlowMapperManager2 = winterFlowMapperManager;
            WinterFlowMapperManager WinterFlowResponseEngine = WinterFlowCloudStack.WinterFlowResponseEngine(winterFlowMapperManager2, false, winterFlowObjectUI, 15);
            WinterFlowRepositoryObject WinterFlowRouterStructure2 = WinterFlowConsumerDataSource.WinterFlowRouterStructure(WinterFlowInvokerComponent.WinterFlowArrayNetwork, WinterFlowCacheUtility.WinterFlowVariableBandwidth, winterFlowResolverLibrary2, 48);
            int hashCode = Long.hashCode(winterFlowResolverLibrary2.WinterFlowConfiguration);
            WinterFlowConfigurationProcess WinterFlowTransactionAgent = winterFlowResolverLibrary2.WinterFlowTransactionAgent();
            WinterFlowMapperManager WinterFlowUserManagerUserManager = WinterFlowUserManagerUserManager(winterFlowResolverLibrary2, WinterFlowResponseEngine);
            WinterFlowBandwidthAgent.WinterFlowCacheManagerAgent.getClass();
            WinterFlowConfigurationRequest winterFlowConfigurationRequest = WinterFlowEventEmitterDeserialization.WinterFlowHookDataSource;
            winterFlowResolverLibrary2.WinterFlowModuleAgent();
            if (winterFlowResolverLibrary2.WinterFlowProxyStructure) {
                winterFlowResolverLibrary2.WinterFlowResponseEngine(winterFlowConfigurationRequest);
            } else {
                winterFlowResolverLibrary2.WinterFlowParserPipeline();
            }
            WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowVariableVersionControl, winterFlowResolverLibrary2, WinterFlowRouterStructure2);
            WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowArrayNetwork, winterFlowResolverLibrary2, WinterFlowTransactionAgent);
            WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowTransactionManagerStrategy, winterFlowResolverLibrary2, Integer.valueOf(hashCode));
            WinterFlowProtocolNetwork.WinterFlowRouterRouter(winterFlowResolverLibrary2, WinterFlowEventEmitterDeserialization.WinterFlowUnitTestResponse);
            WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowCacheManagerAgent, winterFlowResolverLibrary2, WinterFlowUserManagerUserManager);
            WinterFlowUnitTestLibrary.WinterFlowVariableVersionControl(WinterFlowTestingNode(i, winterFlowResolverLibrary2, (i4 >> 3) & 14), new WinterFlowHookServer(1.0f, true), null, null, 0.0f, winterFlowResolverLibrary2, 56, 120);
            str2 = str;
            String upperCase = str2.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            WinterFlowSingletonRuntime.WinterFlowHookDataSource(upperCase, null, WinterFlowInheritanceSubsystem.WinterFlowCacheManagerAgent, WinterFlowDecoratorUI.WinterFlowBatchUI(24), null, 0L, null, 0L, 0, false, 0, 0, null, winterFlowResolverLibrary, 24960, 262122);
            winterFlowResolverLibrary2 = winterFlowResolverLibrary;
            winterFlowResolverLibrary2.WinterFlowBandwidthObject(true);
        } else {
            winterFlowMapperManager2 = winterFlowMapperManager;
            str2 = str;
            winterFlowResolverLibrary2.WinterFlowQueueService();
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread = winterFlowResolverLibrary2.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread != null) {
            WinterFlowConcurrencyThread.WinterFlowArrayNetwork = new WinterFlowJSONMapper(winterFlowMapperManager2, i, str2, winterFlowObjectUI, i2, 1);
        }
    }

    public static final void WinterFlowTransactionAgent(WinterFlowObjectUI winterFlowObjectUI, WinterFlowResolverLibrary winterFlowResolverLibrary) {
        WinterFlowConcurrencySubsystem winterFlowConcurrencySubsystem = winterFlowResolverLibrary.WinterFlowCompilerHandler.WinterFlowHookDataSource.WinterFlowOrchestrationSubsystem;
        winterFlowConcurrencySubsystem.WinterFlowModuleAgent(WinterFlowConcurrencyModule.WinterFlowCacheManagerAgent);
        WinterFlowManagerRequest.WinterFlowCompilerHandler(winterFlowConcurrencySubsystem, 0, winterFlowObjectUI);
    }

    public static final void WinterFlowTransactionManagerStrategy(Boolean bool, Object obj, WinterFlowDecoratorVersion winterFlowDecoratorVersion, WinterFlowObjectSession winterFlowObjectSession, WinterFlowResolverLibrary winterFlowResolverLibrary, int i) {
        int i2;
        winterFlowResolverLibrary.WinterFlowFrameworkTransaction(696924721);
        if ((i & 6) == 0) {
            i2 = (winterFlowResolverLibrary.WinterFlowUnitTestResponse(bool) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= winterFlowResolverLibrary.WinterFlowUnitTestResponse(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowObjectSession) ? 2048 : 1024;
        }
        if (winterFlowResolverLibrary.WinterFlowFrontendBackend(i2 & 1, (i2 & 1171) != 1170)) {
            winterFlowResolverLibrary.WinterFlowProxyStructure();
            if ((i & 1) == 0 || winterFlowResolverLibrary.WinterFlowResolverController()) {
                winterFlowDecoratorVersion = (WinterFlowDecoratorVersion) winterFlowResolverLibrary.WinterFlowSyntax(WinterFlowAlgorithmDeployment.WinterFlowRouterStructure);
            } else {
                winterFlowResolverLibrary.WinterFlowQueueService();
            }
            int i3 = i2 & (-897);
            winterFlowResolverLibrary.WinterFlowOrchestrationSubsystem();
            boolean WinterFlowVariableVersionControl2 = winterFlowResolverLibrary.WinterFlowVariableVersionControl(bool) | winterFlowResolverLibrary.WinterFlowVariableVersionControl(obj) | winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowDecoratorVersion);
            Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            if (WinterFlowVariableVersionControl2 || WinterFlowSyntaxSubsystem == WinterFlowModuleModule.WinterFlowRouterStructure) {
                WinterFlowSyntaxSubsystem = new WinterFlowNetworkStrategy(winterFlowDecoratorVersion.WinterFlowUnitTestResponse());
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
            }
            WinterFlowUnitTestResponse(winterFlowDecoratorVersion, (WinterFlowNetworkStrategy) WinterFlowSyntaxSubsystem, winterFlowObjectSession, winterFlowResolverLibrary, (i3 >> 3) & 896);
        } else {
            winterFlowResolverLibrary.WinterFlowQueueService();
        }
        WinterFlowDecoratorVersion winterFlowDecoratorVersion2 = winterFlowDecoratorVersion;
        WinterFlowStackEngine WinterFlowConcurrencyThread = winterFlowResolverLibrary.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread != null) {
            WinterFlowConcurrencyThread.WinterFlowArrayNetwork = new WinterFlowQueueThread(bool, obj, winterFlowDecoratorVersion2, winterFlowObjectSession, i, 0);
        }
    }

    public static WinterFlowNodeNetwork[] WinterFlowUIMiddleware(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, WinterFlowNodeNetwork[] winterFlowNodeNetworkArr) {
        byte[] bArr3 = WinterFlowEncryptionSubsystem.WinterFlowSingletonPlatform;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, WinterFlowEncryptionSubsystem.WinterFlowVariableBandwidth)) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Unsupported meta version");
                return null;
            }
            int WinterFlowConfigurationSubsystem = (int) WinterFlowServerManager.WinterFlowConfigurationSubsystem(fileInputStream, 2);
            byte[] WinterFlowCompilerVariable = WinterFlowServerManager.WinterFlowCompilerVariable(fileInputStream, (int) WinterFlowServerManager.WinterFlowConfigurationSubsystem(fileInputStream, 4), (int) WinterFlowServerManager.WinterFlowConfigurationSubsystem(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(WinterFlowCompilerVariable);
            try {
                WinterFlowNodeNetwork[] WinterFlowCacheTool = WinterFlowCacheTool(byteArrayInputStream, bArr2, WinterFlowConfigurationSubsystem, winterFlowNodeNetworkArr);
                byteArrayInputStream.close();
                return WinterFlowCacheTool;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(WinterFlowEncryptionSubsystem.WinterFlowThreadListener, bArr2)) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Unsupported meta version");
            return null;
        }
        int WinterFlowConfigurationSubsystem2 = (int) WinterFlowServerManager.WinterFlowConfigurationSubsystem(fileInputStream, 1);
        byte[] WinterFlowCompilerVariable2 = WinterFlowServerManager.WinterFlowCompilerVariable(fileInputStream, (int) WinterFlowServerManager.WinterFlowConfigurationSubsystem(fileInputStream, 4), (int) WinterFlowServerManager.WinterFlowConfigurationSubsystem(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(WinterFlowCompilerVariable2);
        try {
            WinterFlowNodeNetwork[] WinterFlowQueueService = WinterFlowQueueService(byteArrayInputStream2, WinterFlowConfigurationSubsystem2, winterFlowNodeNetworkArr);
            byteArrayInputStream2.close();
            return WinterFlowQueueService;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static final void WinterFlowUnitTestResponse(WinterFlowDecoratorVersion winterFlowDecoratorVersion, WinterFlowNetworkStrategy winterFlowNetworkStrategy, WinterFlowObjectSession winterFlowObjectSession, WinterFlowResolverLibrary winterFlowResolverLibrary, int i) {
        int i2;
        winterFlowResolverLibrary.WinterFlowFrameworkTransaction(228371534);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowDecoratorVersion) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowNetworkStrategy) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowObjectSession) ? 256 : 128;
        }
        if (winterFlowResolverLibrary.WinterFlowFrontendBackend(i2 & 1, (i2 & 147) != 146)) {
            boolean WinterFlowUnitTestResponse2 = winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowNetworkStrategy) | ((i2 & 896) == 256) | winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowDecoratorVersion);
            Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            if (WinterFlowUnitTestResponse2 || WinterFlowSyntaxSubsystem == WinterFlowModuleModule.WinterFlowRouterStructure) {
                WinterFlowSyntaxSubsystem = new WinterFlowUserManagerModule(winterFlowDecoratorVersion, winterFlowNetworkStrategy, winterFlowObjectSession, i3);
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
            }
            WinterFlowCacheManagerAgent(winterFlowDecoratorVersion, winterFlowNetworkStrategy, (WinterFlowObjectSession) WinterFlowSyntaxSubsystem, winterFlowResolverLibrary);
        } else {
            winterFlowResolverLibrary.WinterFlowQueueService();
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread = winterFlowResolverLibrary.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread != null) {
            WinterFlowConcurrencyThread.WinterFlowArrayNetwork = new WinterFlowRefactoring(winterFlowDecoratorVersion, winterFlowNetworkStrategy, winterFlowObjectSession, i, 3);
        }
    }

    public static final WinterFlowMapperManager WinterFlowUserManagerUserManager(WinterFlowResolverLibrary winterFlowResolverLibrary, WinterFlowMapperManager winterFlowMapperManager) {
        winterFlowResolverLibrary.WinterFlowCompilerDataSource(439770924);
        if (!winterFlowMapperManager.WinterFlowHookDataSource(WinterFlowServiceProviderBatch.WinterFlowSingletonPlatform)) {
            winterFlowResolverLibrary.WinterFlowCacheTool(1219399079, 0, null, null);
            winterFlowMapperManager = (WinterFlowMapperManager) winterFlowMapperManager.WinterFlowRouterStructure(new WinterFlowUIVersion(2, 6), WinterFlowValidatorComponent.WinterFlowRouterStructure);
            winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
        }
        winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
        return winterFlowMapperManager;
    }

    public static WinterFlowMapperManager WinterFlowValidatorHandler(WinterFlowMapperManager winterFlowMapperManager, WinterFlowNetworkSession winterFlowNetworkSession, WinterFlowBackendBatch winterFlowBackendBatch, WinterFlowDeploymentException winterFlowDeploymentException, boolean z, WinterFlowNetworkWidget winterFlowNetworkWidget, WinterFlowJSONDecorator winterFlowJSONDecorator) {
        WinterFlowBackendBatch winterFlowBackendBatch2 = WinterFlowBackendBatch.WinterFlowVariableVersionControl;
        WinterFlowValidatorComponent winterFlowValidatorComponent = WinterFlowValidatorComponent.WinterFlowRouterStructure;
        return winterFlowMapperManager.WinterFlowCacheManagerAgent(winterFlowBackendBatch == winterFlowBackendBatch2 ? WinterFlowManagerRequest.WinterFlowSingletonPlatform(winterFlowValidatorComponent, WinterFlowProcessorSessionManager.WinterFlowCacheManagerAgent) : WinterFlowManagerRequest.WinterFlowSingletonPlatform(winterFlowValidatorComponent, WinterFlowProcessorSessionManager.WinterFlowHookDataSource)).WinterFlowCacheManagerAgent(new WinterFlowFunctionMechanism(winterFlowDeploymentException, winterFlowNetworkWidget, winterFlowBackendBatch, winterFlowJSONDecorator, winterFlowNetworkSession, z, false));
    }

    /* JADX WARN: Finally extract failed */
    public static boolean WinterFlowVariableInterface(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, WinterFlowNodeNetwork[] winterFlowNodeNetworkArr) {
        int i;
        long j;
        int length;
        byte[] bArr2 = WinterFlowEncryptionSubsystem.WinterFlowConcurrencyThread;
        byte[] bArr3 = WinterFlowEncryptionSubsystem.WinterFlowOrchestrationSubsystem;
        byte[] bArr4 = WinterFlowEncryptionSubsystem.WinterFlowThreadListener;
        int i2 = 0;
        if (!Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = WinterFlowEncryptionSubsystem.WinterFlowServiceUtility;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] WinterFlowBackendCacheManager = WinterFlowBackendCacheManager(winterFlowNodeNetworkArr, bArr5);
                WinterFlowServerManager.WinterFlowTestingNode(byteArrayOutputStream, winterFlowNodeNetworkArr.length, 1);
                WinterFlowServerManager.WinterFlowTestingNode(byteArrayOutputStream, WinterFlowBackendCacheManager.length, 4);
                byte[] WinterFlowResponseEngine = WinterFlowServerManager.WinterFlowResponseEngine(WinterFlowBackendCacheManager);
                WinterFlowServerManager.WinterFlowTestingNode(byteArrayOutputStream, WinterFlowResponseEngine.length, 4);
                byteArrayOutputStream.write(WinterFlowResponseEngine);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                WinterFlowServerManager.WinterFlowTestingNode(byteArrayOutputStream, winterFlowNodeNetworkArr.length, 1);
                for (WinterFlowNodeNetwork winterFlowNodeNetwork : winterFlowNodeNetworkArr) {
                    int size = winterFlowNodeNetwork.WinterFlowSyntax.size() * 4;
                    String WinterFlowCacheManagerListener = WinterFlowCacheManagerListener(winterFlowNodeNetwork.WinterFlowRouterStructure, winterFlowNodeNetwork.WinterFlowHookDataSource, bArr3);
                    Charset charset = StandardCharsets.UTF_8;
                    WinterFlowServerManager.WinterFlowCompilerHandler(byteArrayOutputStream, WinterFlowCacheManagerListener.getBytes(charset).length);
                    WinterFlowServerManager.WinterFlowCompilerHandler(byteArrayOutputStream, winterFlowNodeNetwork.WinterFlowRouterRouter.length);
                    WinterFlowServerManager.WinterFlowTestingNode(byteArrayOutputStream, size, 4);
                    WinterFlowServerManager.WinterFlowTestingNode(byteArrayOutputStream, winterFlowNodeNetwork.WinterFlowCacheManagerAgent, 4);
                    byteArrayOutputStream.write(WinterFlowCacheManagerListener.getBytes(charset));
                    Iterator it = winterFlowNodeNetwork.WinterFlowSyntax.keySet().iterator();
                    while (it.hasNext()) {
                        WinterFlowServerManager.WinterFlowCompilerHandler(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        WinterFlowServerManager.WinterFlowCompilerHandler(byteArrayOutputStream, 0);
                    }
                    for (int i3 : winterFlowNodeNetwork.WinterFlowRouterRouter) {
                        WinterFlowServerManager.WinterFlowCompilerHandler(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr6 = WinterFlowEncryptionSubsystem.WinterFlowBandwidthObject;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] WinterFlowBackendCacheManager2 = WinterFlowBackendCacheManager(winterFlowNodeNetworkArr, bArr6);
                WinterFlowServerManager.WinterFlowTestingNode(byteArrayOutputStream, winterFlowNodeNetworkArr.length, 1);
                WinterFlowServerManager.WinterFlowTestingNode(byteArrayOutputStream, WinterFlowBackendCacheManager2.length, 4);
                byte[] WinterFlowResponseEngine2 = WinterFlowServerManager.WinterFlowResponseEngine(WinterFlowBackendCacheManager2);
                WinterFlowServerManager.WinterFlowTestingNode(byteArrayOutputStream, WinterFlowResponseEngine2.length, 4);
                byteArrayOutputStream.write(WinterFlowResponseEngine2);
                return true;
            }
            if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            WinterFlowServerManager.WinterFlowCompilerHandler(byteArrayOutputStream, winterFlowNodeNetworkArr.length);
            for (WinterFlowNodeNetwork winterFlowNodeNetwork2 : winterFlowNodeNetworkArr) {
                String str = winterFlowNodeNetwork2.WinterFlowRouterStructure;
                TreeMap treeMap = winterFlowNodeNetwork2.WinterFlowSyntax;
                String WinterFlowCacheManagerListener2 = WinterFlowCacheManagerListener(str, winterFlowNodeNetwork2.WinterFlowHookDataSource, bArr2);
                Charset charset2 = StandardCharsets.UTF_8;
                WinterFlowServerManager.WinterFlowCompilerHandler(byteArrayOutputStream, WinterFlowCacheManagerListener2.getBytes(charset2).length);
                WinterFlowServerManager.WinterFlowCompilerHandler(byteArrayOutputStream, treeMap.size());
                WinterFlowServerManager.WinterFlowCompilerHandler(byteArrayOutputStream, winterFlowNodeNetwork2.WinterFlowRouterRouter.length);
                WinterFlowServerManager.WinterFlowTestingNode(byteArrayOutputStream, winterFlowNodeNetwork2.WinterFlowCacheManagerAgent, 4);
                byteArrayOutputStream.write(WinterFlowCacheManagerListener2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    WinterFlowServerManager.WinterFlowCompilerHandler(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i4 : winterFlowNodeNetwork2.WinterFlowRouterRouter) {
                    WinterFlowServerManager.WinterFlowCompilerHandler(byteArrayOutputStream, i4);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            WinterFlowServerManager.WinterFlowCompilerHandler(byteArrayOutputStream2, winterFlowNodeNetworkArr.length);
            int i5 = 2;
            int i6 = 2;
            for (WinterFlowNodeNetwork winterFlowNodeNetwork3 : winterFlowNodeNetworkArr) {
                WinterFlowServerManager.WinterFlowTestingNode(byteArrayOutputStream2, winterFlowNodeNetwork3.WinterFlowCacheManagerAgent, 4);
                WinterFlowServerManager.WinterFlowTestingNode(byteArrayOutputStream2, winterFlowNodeNetwork3.WinterFlowArrayNetwork, 4);
                WinterFlowServerManager.WinterFlowTestingNode(byteArrayOutputStream2, winterFlowNodeNetwork3.WinterFlowUnitTestResponse, 4);
                String WinterFlowCacheManagerListener3 = WinterFlowCacheManagerListener(winterFlowNodeNetwork3.WinterFlowRouterStructure, winterFlowNodeNetwork3.WinterFlowHookDataSource, bArr4);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = WinterFlowCacheManagerListener3.getBytes(charset3).length;
                WinterFlowServerManager.WinterFlowCompilerHandler(byteArrayOutputStream2, length2);
                i6 = i6 + 14 + length2;
                byteArrayOutputStream2.write(WinterFlowCacheManagerListener3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i6 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray.length);
            }
            WinterFlowControllerJava winterFlowControllerJava = new WinterFlowControllerJava(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList.add(winterFlowControllerJava);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i7 = 0;
            int i8 = 0;
            while (i7 < winterFlowNodeNetworkArr.length) {
                try {
                    WinterFlowNodeNetwork winterFlowNodeNetwork4 = winterFlowNodeNetworkArr[i7];
                    WinterFlowServerManager.WinterFlowCompilerHandler(byteArrayOutputStream3, i7);
                    WinterFlowServerManager.WinterFlowCompilerHandler(byteArrayOutputStream3, winterFlowNodeNetwork4.WinterFlowVariableVersionControl);
                    i8 = i8 + 4 + (winterFlowNodeNetwork4.WinterFlowVariableVersionControl * i5);
                    int[] iArr = winterFlowNodeNetwork4.WinterFlowRouterRouter;
                    int length3 = iArr.length;
                    int i9 = i2;
                    while (i2 < length3) {
                        int i10 = iArr[i2];
                        WinterFlowServerManager.WinterFlowCompilerHandler(byteArrayOutputStream3, i10 - i9);
                        i2++;
                        i5 = i5;
                        i9 = i10;
                    }
                    i7++;
                    i2 = 0;
                } catch (Throwable th) {
                }
            }
            int i11 = i5;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i8 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray2.length);
            }
            WinterFlowControllerJava winterFlowControllerJava2 = new WinterFlowControllerJava(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList.add(winterFlowControllerJava2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i12 = 0;
            for (int i13 = 0; i13 < winterFlowNodeNetworkArr.length; i13++) {
                try {
                    WinterFlowNodeNetwork winterFlowNodeNetwork5 = winterFlowNodeNetworkArr[i13];
                    Iterator it3 = winterFlowNodeNetwork5.WinterFlowSyntax.entrySet().iterator();
                    int i14 = 0;
                    while (it3.hasNext()) {
                        i14 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        WinterFlowCacheManagerException(byteArrayOutputStream4, i14, winterFlowNodeNetwork5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            WinterFlowVersionControlModule(byteArrayOutputStream4, winterFlowNodeNetwork5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            WinterFlowServerManager.WinterFlowCompilerHandler(byteArrayOutputStream3, i13);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i15 = i12 + 6;
                            WinterFlowServerManager.WinterFlowTestingNode(byteArrayOutputStream3, length4, 4);
                            WinterFlowServerManager.WinterFlowCompilerHandler(byteArrayOutputStream3, i14);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i12 = i15 + length4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i12 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
            }
            WinterFlowControllerJava winterFlowControllerJava3 = new WinterFlowControllerJava(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList.add(winterFlowControllerJava3);
            long size2 = 12 + (arrayList.size() * 16);
            WinterFlowServerManager.WinterFlowTestingNode(byteArrayOutputStream, arrayList.size(), 4);
            int i16 = 0;
            while (i16 < arrayList.size()) {
                WinterFlowControllerJava winterFlowControllerJava4 = (WinterFlowControllerJava) arrayList.get(i16);
                int i17 = winterFlowControllerJava4.WinterFlowRouterStructure;
                byte[] bArr7 = winterFlowControllerJava4.WinterFlowHookDataSource;
                if (i17 != 1) {
                    i = i11;
                    if (i17 == i) {
                        j = 1;
                    } else if (i17 == 3) {
                        j = 2;
                    } else if (i17 == 4) {
                        j = 3;
                    } else {
                        if (i17 != 5) {
                            throw null;
                        }
                        j = 4;
                    }
                } else {
                    i = i11;
                    j = 0;
                }
                WinterFlowServerManager.WinterFlowTestingNode(byteArrayOutputStream, j, 4);
                WinterFlowServerManager.WinterFlowTestingNode(byteArrayOutputStream, size2, 4);
                if (winterFlowControllerJava4.WinterFlowCacheManagerAgent) {
                    long length5 = bArr7.length;
                    byte[] WinterFlowResponseEngine3 = WinterFlowServerManager.WinterFlowResponseEngine(bArr7);
                    arrayList2.add(WinterFlowResponseEngine3);
                    WinterFlowServerManager.WinterFlowTestingNode(byteArrayOutputStream, WinterFlowResponseEngine3.length, 4);
                    WinterFlowServerManager.WinterFlowTestingNode(byteArrayOutputStream, length5, 4);
                    length = WinterFlowResponseEngine3.length;
                } else {
                    arrayList2.add(bArr7);
                    WinterFlowServerManager.WinterFlowTestingNode(byteArrayOutputStream, bArr7.length, 4);
                    WinterFlowServerManager.WinterFlowTestingNode(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i16++;
                i11 = i;
            }
            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i18));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static final void WinterFlowVariableVersionControl(Object obj, Object obj2, WinterFlowEventEvent winterFlowEventEvent, WinterFlowResolverLibrary winterFlowResolverLibrary) {
        WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice = winterFlowResolverLibrary.WinterFlowCacheTool;
        boolean WinterFlowVariableVersionControl2 = winterFlowResolverLibrary.WinterFlowVariableVersionControl(obj) | winterFlowResolverLibrary.WinterFlowVariableVersionControl(obj2);
        Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
        if (WinterFlowVariableVersionControl2 || WinterFlowSyntaxSubsystem == WinterFlowModuleModule.WinterFlowRouterStructure) {
            WinterFlowSyntaxSubsystem = new WinterFlowServicePlatform(winterFlowEncryptionMicroservice, winterFlowEventEvent);
            winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
        }
    }

    public static void WinterFlowVersionControlModule(ByteArrayOutputStream byteArrayOutputStream, WinterFlowNodeNetwork winterFlowNodeNetwork) {
        int i = 0;
        for (Map.Entry entry : winterFlowNodeNetwork.WinterFlowSyntax.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                WinterFlowServerManager.WinterFlowCompilerHandler(byteArrayOutputStream, intValue - i);
                WinterFlowServerManager.WinterFlowCompilerHandler(byteArrayOutputStream, 0);
                i = intValue;
            }
        }
    }

    public abstract boolean WinterFlowBatchUI(WinterFlowThreadHelper winterFlowThreadHelper, Object obj, Object obj2);

    public abstract void WinterFlowCompilerHandler(WinterFlowTransaction winterFlowTransaction, WinterFlowTransaction winterFlowTransaction2);

    public abstract void WinterFlowFrontendBackend(WinterFlowTransaction winterFlowTransaction, Thread thread);

    public abstract boolean WinterFlowRouterAdapter(WinterFlowThreadHelper winterFlowThreadHelper, WinterFlowTransaction winterFlowTransaction, WinterFlowTransaction winterFlowTransaction2);

    public abstract void WinterFlowSingletonPlatform(int i);

    public abstract void WinterFlowSyntaxSubsystem(int i);

    public abstract boolean WinterFlowVariableBandwidth(WinterFlowThreadHelper winterFlowThreadHelper, WinterFlowProcessorFunction winterFlowProcessorFunction);
}
