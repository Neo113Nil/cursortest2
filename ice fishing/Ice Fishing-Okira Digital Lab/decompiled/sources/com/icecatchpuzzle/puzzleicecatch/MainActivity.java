package com.icecatchpuzzle.puzzleicecatch;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.versionedparcelable.ArcticByteProcessorCompressionLMUCZsNpuPxKIs0RXh87323342817578;
import androidx.versionedparcelable.ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531;
import androidx.versionedparcelable.AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756;
import androidx.versionedparcelable.AxiomCoreInheritanceAPIZHcmtF4l4MdhkOxj7i93986804465714;
import androidx.versionedparcelable.AxiomCoreMonitorWorkerEpOThAFmoCLxMwibdJ72468267872406;
import androidx.versionedparcelable.BlazePulseExecutorVectorX9T7zrg3lwf2GjPHIy93052600711395;
import androidx.versionedparcelable.BlazePulseHeuristicReflectionAjE3uSLXRdITwAE2k393161190765519;
import androidx.versionedparcelable.BlazePulseJITBufferDhczeHe9LbgzIJGhbY42763553946986;
import androidx.versionedparcelable.BlazePulseSerializationPipelineVD0AAtyx4o44r1lN5i33554010509704;
import androidx.versionedparcelable.BlazePulseStreamAlgorithmFFSSndCCEv1yyjbdko74710144599257;
import androidx.versionedparcelable.BlueKernelSessionObjectQswGaxvYDCkmVBjDQ258860156888305;
import androidx.versionedparcelable.CosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998;
import androidx.versionedparcelable.CrimsonRouteProxyParserYwog3BCfcwfHwK4ku572237178265488;
import androidx.versionedparcelable.DeltaSignalAbstractionInterfaceLzONmazZ44ZA6dFPJh97989162054957;
import androidx.versionedparcelable.DeltaSignalControllerExceptionQ9Pcm3xM4vi6ec751145512476237113;
import androidx.versionedparcelable.DragonRouteMultithreadingControllerJZnCtXJgzUmpVbAfL848868216870865;
import androidx.versionedparcelable.DragonRouteUnificationShimP3LM3eprIRK5RQWHiZ43998729050946;
import androidx.versionedparcelable.EmeraldStackMutexModuleMmeEVj3JBK4R4mBWE460656188275230;
import androidx.versionedparcelable.EmeraldStackPacketBufferK3IXt6rgzKL50TDZ3n82540320567786;
import androidx.versionedparcelable.EmeraldStackParserVariableIU5ootxTpy4c9JzhVt33212193585454;
import androidx.versionedparcelable.FrostBridgeOverloadingResourceIxC9Y1qKFbINFw1oCV76442936757458;
import androidx.versionedparcelable.GoldenVectorEngineControllerGNq3IveoiACqcjhw4T82700681823902;
import androidx.versionedparcelable.GoldenVectorLoaderRegistryZGq5hhbhblpJ1mpgXV59878749628960;
import androidx.versionedparcelable.GoldenVectorResponseSemaphoreWzVedXtGkniJ4xYHFb85602063020841;
import androidx.versionedparcelable.GoldenVectorTokenMiddlewareKMQD9BpYD9vtVSPw2I45319750638336;
import androidx.versionedparcelable.HeliosRuntimeAbstractionTemplatingWrwoI0hZ6iTVRnm5jZ49632775168556;
import androidx.versionedparcelable.HeliosRuntimePacketSchedulerK4zUGlHUXSjTQCWrN058938422603063;
import androidx.versionedparcelable.IronMatrixChannelRepositoryIvDj9K48YedSIPZdCQ56534941073990;
import androidx.versionedparcelable.IronMatrixGenericChannelHmHCOhlIewLdBl4k2w70485826352892;
import androidx.versionedparcelable.IronMatrixSessionAbstractionJmKgwVPM9U8IsVnH8Q45846706696547;
import androidx.versionedparcelable.JadeCircuitAbstractionCryptographyWUMediXWHmM8K6hSWg48420148059183;
import androidx.versionedparcelable.KryptonFlowBootstrapGatewayQNOGSTAOo2h2ktykZk23856249376418;
import androidx.versionedparcelable.KryptonFlowStaticInjectionPV4lXh9ffrgFgYPPPd42535495641289;
import androidx.versionedparcelable.LunarNodeKeyValueSemaphoreJtxvTJrOHUepefjNDn91593622795346;
import androidx.versionedparcelable.LunarNodeLoaderForeachI2MuJJZ4Cv5Yyo7UVf97063524372114;
import androidx.versionedparcelable.LunarNodeParserPrefixQvvoM9Gn4PS0umBVaE26925484917893;
import androidx.versionedparcelable.MysticCacheEncryptionFunctionFJtb8gfSYU5aOcdkcI35144081167722;
import androidx.versionedparcelable.MysticCacheRequestMonitorQYA1Ym9CAA7fiSEGwn24597175563594;
import androidx.versionedparcelable.MysticCacheResolverResponseFlOGfgK4VLsm4SiGMh61721050159942;
import androidx.versionedparcelable.NovaLayerDelegateAlgorithmLXMVKmMpPR9Soj24Vm90234110714257;
import androidx.versionedparcelable.ObsidianEngineAbstractionStreamFKfQWwMgmmWPBFRauD96959591755676;
import androidx.versionedparcelable.ObsidianEngineTranspilerWorkerEHoOsrsySnsoA9iWxm35468870095129;
import androidx.versionedparcelable.PhotonFrameMapperDebuggerZGzm7MtvF3ryIcf6sx47707510613523;
import androidx.versionedparcelable.PhotonFrameMultithreadingInterpreterNCf3dsLr3OviOuA8FQ63903107297822;
import androidx.versionedparcelable.QuantumStreamDecoderSchedulerZuSI41Fu32QAmywXDr40521088394502;
import androidx.versionedparcelable.QuantumStreamMutexTransportEBMtyJRZ8mVY0jgB7Q92733453458509;
import androidx.versionedparcelable.QuantumStreamProxyBinaryTreeSNjcHBNvKlwlnYWdx743271547715672;
import androidx.versionedparcelable.RapidLogicBuilderInjectionG7055R0mBgKC1wPjYD96825014282328;
import androidx.versionedparcelable.RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996;
import androidx.versionedparcelable.RapidLogicOverridingVirtualizationUtifAe8EA4wTBfGtnt63688344371657;
import androidx.versionedparcelable.SolarMeshManagerBinaryTreeI2CIvbMBPxS9bJWKdv79052527547104;
import androidx.versionedparcelable.TitanCloudAggregationObserverF9OMXJByJaiNY1ZYwe47325313177068;
import androidx.versionedparcelable.TitanCloudNamespaceFilterFqvELqi23qhuFsnoAT60884039266352;
import androidx.versionedparcelable.UltraBufferAsyncDebuggerYfgwKaMpvJWCQwgt9V45872297094026;
import androidx.versionedparcelable.UltraBufferLibraryInjectionPo2F9kPZDuSGaFZES183405060953321;
import androidx.versionedparcelable.UltraBufferSchedulerTransportB96685neVUKIT4w6UB19066366706022;
import androidx.versionedparcelable.UltraBufferStateStorageNHdrfmdKXE6fVf1YnD90269720334250;
import androidx.versionedparcelable.VertexLinkStorageDecoderLe0HPuUBRRDa4DtrSp69996579254997;
import androidx.versionedparcelable.WhiteFieldConstructorEncoderGxVIv5stSbYc2LSHyg98558419473819;
import androidx.versionedparcelable.XenoGridAttributeProcessorHZI9Vv7yU9wmDNzTnx26006302232746;
import androidx.versionedparcelable.XenoGridDebuggerKeyValueJrsgALoo3F46l6tK9217140939609510;
import androidx.versionedparcelable.XenoGridProcessorProcessorNcBZZjQOb3tKNLhyLo99586204685692;
import androidx.versionedparcelable.XenoGridResolverConstructorImOOYH5wNvUDh6AjR548685783760181;
import androidx.versionedparcelable.XenoGridSubroutineOperatorQLKzia4zga01s02AXJ57943724920879;
import androidx.versionedparcelable.YellowLoopObserverMacroJFTEe2n8YRXorwgZDZ47084730441310;
import androidx.versionedparcelable.YellowLoopRuntimeAsyncFGr0VbomQ1UTvV0ZWO94265197072880;
import androidx.versionedparcelable.YellowLoopSemaphoreBitwiseNZpj9pee16HEvzBHJT78082294724847;
import androidx.versionedparcelable.YellowLoopSessionVectorJTn1fpA0XiptHj6Hjn52504668913037;
import androidx.versionedparcelable.YellowLoopShimDecoderXkhYBA68jpeI5U8DiQ32140551995727;
import androidx.versionedparcelable.YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214;
import androidx.versionedparcelable.YellowLoopTransportAsyncTQmx8PaoJmz6eMx0Mo69982937444783;
import androidx.versionedparcelable.ZenithPathJITAlgorithmMqMvxYPDW3MaAB9zLv79391251965739;
import androidx.versionedparcelable.ZenithPathOperatorProcessorWqZVGhPZVMaza26LFS87964487012654;
import androidx.versionedparcelable.ZenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156;
import androidx.versionedparcelable.ZenithPathVariableReflectionDqPXJ2zatLFDNcxq3R42027699738339;
import androidx.versionedparcelable.ZenithPathWorkerAliasSZA0eHfpevYaNTGBat94887047860215;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.LogLevel;
import com.icecatchpuzzle.puzzleicecatch.MainActivity;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.zip.GZIPOutputStream;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class MainActivity extends ComponentActivity {
    public static final /* synthetic */ int MysticCacheMiddlewareWorkerK74IVCqnn6Bp9c5lOi26227906401854 = 0;
    public final String AxiomCoreFunctionSchedulerPDQvcBbHwsy0ZBVyOb90216604270646;
    public final CrimsonRouteProxyParserYwog3BCfcwfHwK4ku572237178265488 GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178;
    public final ZenithPathWorkerAliasSZA0eHfpevYaNTGBat94887047860215 HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382;
    public final String IronMatrixPipelineVectorCmhq21DucJNfG3zCVW67482589553900;
    public FrameLayout KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216;
    public ValueCallback LunarNodeAsyncCompressionXhW6Mr3UFps5CRaeph11269602575390;
    public PermissionRequest LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764;
    public final int MysticCacheManagerKeyValueImUQudc509DcNu7NkN69464633328808;
    public final LunarNodeKeyValueSemaphoreJtxvTJrOHUepefjNDn91593622795346 MysticCacheParserHashmapNCNANojYkqCJuUmK2O16057626810798;
    public final int NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj37608534497252;
    public volatile AdjustAttribution UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503;
    public final int WhiteFieldImmutableCoordinatorGiu9UiW0aWWBajhGmH37956619666367;
    public final XenoGridAttributeProcessorHZI9Vv7yU9wmDNzTnx26006302232746 WhiteFieldUnificationOverridingEBdwjF0noilpOVdrsu81945136372121;
    public final ZenithPathWorkerAliasSZA0eHfpevYaNTGBat94887047860215 ZenithPathConstructorPrefixQEI28Ir4W3yzE2EuDo23499830707914;
    public final ZenithPathWorkerAliasSZA0eHfpevYaNTGBat94887047860215 ZenithPathListenerVariableGAIJqSOvgAbAzPQzej97019734282160;

    public MainActivity() {
        int i = 1;
        XenoGridAttributeProcessorHZI9Vv7yU9wmDNzTnx26006302232746 xenoGridAttributeProcessorHZI9Vv7yU9wmDNzTnx26006302232746 = new XenoGridAttributeProcessorHZI9Vv7yU9wmDNzTnx26006302232746(true);
        xenoGridAttributeProcessorHZI9Vv7yU9wmDNzTnx26006302232746.ZenithPathClosureStorageLMdP6kbfH2eiEM3KeE77240003825952(null);
        this.WhiteFieldUnificationOverridingEBdwjF0noilpOVdrsu81945136372121 = xenoGridAttributeProcessorHZI9Vv7yU9wmDNzTnx26006302232746;
        this.MysticCacheParserHashmapNCNANojYkqCJuUmK2O16057626810798 = new LunarNodeKeyValueSemaphoreJtxvTJrOHUepefjNDn91593622795346(100);
        this.GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178 = KryptonFlowStaticInjectionPV4lXh9ffrgFgYPPPd42535495641289.MysticCacheParserHashmapNCNANojYkqCJuUmK2O16057626810798(Boolean.FALSE);
        this.IronMatrixPipelineVectorCmhq21DucJNfG3zCVW67482589553900 = "6d3hm3tzwfi8";
        this.MysticCacheManagerKeyValueImUQudc509DcNu7NkN69464633328808 = 15000;
        this.AxiomCoreFunctionSchedulerPDQvcBbHwsy0ZBVyOb90216604270646 = "164.92.203.58";
        this.NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj37608534497252 = 123;
        this.WhiteFieldImmutableCoordinatorGiu9UiW0aWWBajhGmH37956619666367 = 65507;
        int i2 = 0;
        this.ZenithPathListenerVariableGAIJqSOvgAbAzPQzej97019734282160 = UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339(new HeliosRuntimeAbstractionTemplatingWrwoI0hZ6iTVRnm5jZ49632775168556(this, i2), new TitanCloudNamespaceFilterFqvELqi23qhuFsnoAT60884039266352(i2));
        this.ZenithPathConstructorPrefixQEI28Ir4W3yzE2EuDo23499830707914 = UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339(new HeliosRuntimeAbstractionTemplatingWrwoI0hZ6iTVRnm5jZ49632775168556(this, i), new TitanCloudNamespaceFilterFqvELqi23qhuFsnoAT60884039266352(i2));
        this.HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382 = UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339(new HeliosRuntimeAbstractionTemplatingWrwoI0hZ6iTVRnm5jZ49632775168556(this, 2), new TitanCloudNamespaceFilterFqvELqi23qhuFsnoAT60884039266352(i));
    }

    public static void EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111(LinkedHashMap linkedHashMap, String str, String str2) {
        if (str2 == null || QuantumStreamMutexTransportEBMtyJRZ8mVY0jgB7Q92733453458509.JadeCircuitRequestVectorU92hbmiG49qeUp5Zc526346803062437(str2) || str2.equals("0")) {
            return;
        }
        linkedHashMap.put(str, str2);
    }

    public static final byte[] ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(MainActivity mainActivity, YellowLoopSemaphoreBitwiseNZpj9pee16HEvzBHJT78082294724847 yellowLoopSemaphoreBitwiseNZpj9pee16HEvzBHJT78082294724847) {
        List MysticCacheManagerKeyValueImUQudc509DcNu7NkN69464633328808 = ObsidianEngineTranspilerWorkerEHoOsrsySnsoA9iWxm35468870095129.MysticCacheManagerKeyValueImUQudc509DcNu7NkN69464633328808(yellowLoopSemaphoreBitwiseNZpj9pee16HEvzBHJT78082294724847.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800, yellowLoopSemaphoreBitwiseNZpj9pee16HEvzBHJT78082294724847.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365, yellowLoopSemaphoreBitwiseNZpj9pee16HEvzBHJT78082294724847.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495, yellowLoopSemaphoreBitwiseNZpj9pee16HEvzBHJT78082294724847.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867, yellowLoopSemaphoreBitwiseNZpj9pee16HEvzBHJT78082294724847.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119, yellowLoopSemaphoreBitwiseNZpj9pee16HEvzBHJT78082294724847.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170, yellowLoopSemaphoreBitwiseNZpj9pee16HEvzBHJT78082294724847.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333, yellowLoopSemaphoreBitwiseNZpj9pee16HEvzBHJT78082294724847.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818);
        ArrayList arrayList = new ArrayList(AxiomCoreInheritanceAPIZHcmtF4l4MdhkOxj7i93986804465714.CrimsonRouteContainerEncryptionBYDjKqEkgoJPSxosOH53474174893070(MysticCacheManagerKeyValueImUQudc509DcNu7NkN69464633328808));
        Iterator it = MysticCacheManagerKeyValueImUQudc509DcNu7NkN69464633328808.iterator();
        while (it.hasNext()) {
            byte[] bytes = (((String) it.next()) + "\n").getBytes(UltraBufferSchedulerTransportB96685neVUKIT4w6UB19066366706022.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
            bytes.getClass();
            arrayList.add(bytes);
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            i2 += ((byte[]) obj).length + 2;
        }
        ByteBuffer order = ByteBuffer.allocate(i2).order(ByteOrder.BIG_ENDIAN);
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            byte[] bArr = (byte[]) obj2;
            order.putShort((short) bArr.length);
            order.put(bArr);
        }
        byte[] array = order.array();
        array.getClass();
        return array;
    }

    public static final List ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834(MainActivity mainActivity, byte[] bArr) {
        int i;
        if (bArr.length >= 52) {
            int i2 = 48;
            while (true) {
                int i3 = i2 + 4;
                if (i3 > bArr.length) {
                    break;
                }
                int i4 = ((bArr[i2] & 255) << 8) | (bArr[i2 + 1] & 255);
                int i5 = ((bArr[i2 + 2] & 255) << 8) | (bArr[i2 + 3] & 255);
                int i6 = i5 - 4;
                if (i6 <= 0 || (i = i6 + i3) > bArr.length) {
                    break;
                }
                if (i4 == 176) {
                    MysticCacheRequestMonitorQYA1Ym9CAA7fiSEGwn24597175563594.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(i, bArr.length);
                    byte[] copyOfRange = Arrays.copyOfRange(bArr, i3, i);
                    copyOfRange.getClass();
                    ArrayList arrayList = new ArrayList();
                    int i7 = 0;
                    while (true) {
                        int i8 = i7 + 2;
                        if (i8 > copyOfRange.length) {
                            break;
                        }
                        int i9 = (copyOfRange[i7 + 1] & 255) | ((copyOfRange[i7] & 255) << 8);
                        if (i9 != 0) {
                            i7 = i9 + i8;
                            if (i7 > copyOfRange.length) {
                                break;
                            }
                            MysticCacheRequestMonitorQYA1Ym9CAA7fiSEGwn24597175563594.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(i7, copyOfRange.length);
                            byte[] copyOfRange2 = Arrays.copyOfRange(copyOfRange, i8, i7);
                            copyOfRange2.getClass();
                            arrayList.add(new String(copyOfRange2, UltraBufferSchedulerTransportB96685neVUKIT4w6UB19066366706022.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800));
                        } else {
                            i7 = i8;
                        }
                    }
                    return arrayList;
                }
                int i10 = i5 % 4;
                if (i10 != 0) {
                    i5 += 4 - i10;
                }
                i2 += i5;
            }
        } else {
            String obj = QuantumStreamMutexTransportEBMtyJRZ8mVY0jgB7Q92733453458509.YellowLoopSerializationStorageXaJURe2ssvFyfOvhoO67447171248106(new String(bArr, UltraBufferSchedulerTransportB96685neVUKIT4w6UB19066366706022.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800)).toString();
            if (AxiomCoreMonitorWorkerEpOThAFmoCLxMwibdJ72468267872406.BlazePulsePolymorphismOverloadingK3oHWwcZeom5cYPPbU90259265379402(obj, "http://") || obj.startsWith("https://")) {
                return ObsidianEngineTranspilerWorkerEHoOsrsySnsoA9iWxm35468870095129.IronMatrixPipelineVectorCmhq21DucJNfG3zCVW67482589553900(obj);
            }
        }
        return GoldenVectorLoaderRegistryZGq5hhbhblpJ1mpgXV59878749628960.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    }

    public static final byte[] ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111(MainActivity mainActivity, byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                byteArray.getClass();
                int length = byteArray.length + 4;
                int i = ((4 - (length % 4)) % 4) + length;
                ByteBuffer allocate = ByteBuffer.allocate(i);
                ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                ByteBuffer order = allocate.order(byteOrder);
                order.putShort((short) 228);
                order.putShort((short) i);
                order.put(byteArray);
                ByteBuffer order2 = ByteBuffer.allocate(48).order(byteOrder);
                order2.put((byte) 35);
                order2.put((byte) 0);
                order2.put((byte) 6);
                order2.put((byte) -20);
                order2.position(12);
                order2.putInt(1229870147);
                long currentTimeMillis = System.currentTimeMillis();
                order2.position(40);
                order2.putInt((int) ((currentTimeMillis / 1000) + 2208988800L));
                order2.putInt((int) (((currentTimeMillis % 1000) * 4294967295L) / 1000));
                byte[] array = order2.array();
                array.getClass();
                byte[] array2 = order.array();
                array2.getClass();
                int length2 = array.length;
                int length3 = array2.length;
                byte[] copyOf = Arrays.copyOf(array, length2 + length3);
                System.arraycopy(array2, 0, copyOf, length2, length3);
                return copyOf;
            } finally {
            }
        } finally {
        }
    }

    public final WebView CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170() {
        FrameLayout frameLayout = this.KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216;
        if (frameLayout != null) {
            View childAt = frameLayout.getChildAt(frameLayout.getChildCount() - 1);
            if (childAt instanceof WebView) {
                return (WebView) childAt;
            }
        }
        return null;
    }

    public final void NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(final int i, final boolean z, BlazePulseStreamAlgorithmFFSSndCCEv1yyjbdko74710144599257 blazePulseStreamAlgorithmFFSSndCCEv1yyjbdko74710144599257, ZenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156 zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156, int i2) {
        boolean z2;
        IronMatrixGenericChannelHmHCOhlIewLdBl4k2w70485826352892 ironMatrixGenericChannelHmHCOhlIewLdBl4k2w70485826352892;
        RapidLogicBuilderInjectionG7055R0mBgKC1wPjYD96825014282328 rapidLogicBuilderInjectionG7055R0mBgKC1wPjYD96825014282328;
        LunarNodeParserPrefixQvvoM9Gn4PS0umBVaE26925484917893 lunarNodeParserPrefixQvvoM9Gn4PS0umBVaE26925484917893;
        IronMatrixGenericChannelHmHCOhlIewLdBl4k2w70485826352892 ironMatrixGenericChannelHmHCOhlIewLdBl4k2w704858263528922;
        DragonRouteUnificationShimP3LM3eprIRK5RQWHiZ43998729050946 dragonRouteUnificationShimP3LM3eprIRK5RQWHiZ43998729050946;
        IronMatrixGenericChannelHmHCOhlIewLdBl4k2w70485826352892 ironMatrixGenericChannelHmHCOhlIewLdBl4k2w704858263528923;
        UltraBufferLibraryInjectionPo2F9kPZDuSGaFZES183405060953321 ultraBufferLibraryInjectionPo2F9kPZDuSGaFZES183405060953321;
        IronMatrixGenericChannelHmHCOhlIewLdBl4k2w70485826352892 ironMatrixGenericChannelHmHCOhlIewLdBl4k2w704858263528924;
        YellowLoopTransportAsyncTQmx8PaoJmz6eMx0Mo69982937444783 yellowLoopTransportAsyncTQmx8PaoJmz6eMx0Mo69982937444783;
        boolean z3;
        ZenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156 zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562 = zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156;
        zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.DeltaSignalBitfieldObjectCMqXqcyA4RTHNuPUiO99443717390150(-887259911);
        int i3 = i2 | (zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(i) ? 4 : 2) | (zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(z) ? 32 : 16) | (zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(blazePulseStreamAlgorithmFFSSndCCEv1yyjbdko74710144599257) ? 256 : 128);
        if (zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.ZenithPathVectorNormalizationStNnl4OgOjY2uLubQK64607822190606(i3 & 1, (i3 & 147) != 146)) {
            CosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998 CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170 = ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170(EmeraldStackParserVariableIU5ootxTpy4c9JzhVt33212193585454.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(1.0f), ((GoldenVectorTokenMiddlewareKMQD9BpYD9vtVSPw2I45319750638336) zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(MysticCacheEncryptionFunctionFJtb8gfSYU5aOcdkcI35144081167722.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800)).CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170, XenoGridProcessorProcessorNcBZZjQOb3tKNLhyLo99586204685692.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036);
            DragonRouteUnificationShimP3LM3eprIRK5RQWHiZ43998729050946 dragonRouteUnificationShimP3LM3eprIRK5RQWHiZ439987290509462 = YellowLoopObserverMacroJFTEe2n8YRXorwgZDZ47084730441310.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
            GoldenVectorResponseSemaphoreWzVedXtGkniJ4xYHFb85602063020841 RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = BlueKernelSessionObjectQswGaxvYDCkmVBjDQ258860156888305.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(dragonRouteUnificationShimP3LM3eprIRK5RQWHiZ439987290509462, false);
            int hashCode = Long.hashCode(zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.XenoGridInheritanceEncoderLUWRDrGQFJijcNZ09l48202102995381);
            EmeraldStackPacketBufferK3IXt6rgzKL50TDZ3n82540320567786 ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111 = zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111();
            CosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998 NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj37608534497252 = YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj37608534497252(zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562, CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170);
            BlazePulseHeuristicReflectionAjE3uSLXRdITwAE2k393161190765519.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.getClass();
            YellowLoopTransportAsyncTQmx8PaoJmz6eMx0Mo69982937444783 yellowLoopTransportAsyncTQmx8PaoJmz6eMx0Mo699829374447832 = NovaLayerDelegateAlgorithmLXMVKmMpPR9Soj24Vm90234110714257.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
            zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.FrostBridgeProviderPostfixIXYixnTdHOklADz4h935360772170079();
            float f = 1.0f;
            if (zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww42880111075685) {
                zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(yellowLoopTransportAsyncTQmx8PaoJmz6eMx0Mo699829374447832);
            } else {
                zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.PhotonFrameRouterExceptionQjAvXXEXJ8u2ZI6OgX41663540814107();
            }
            IronMatrixGenericChannelHmHCOhlIewLdBl4k2w70485826352892 ironMatrixGenericChannelHmHCOhlIewLdBl4k2w704858263528925 = NovaLayerDelegateAlgorithmLXMVKmMpPR9Soj24Vm90234110714257.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
            ObsidianEngineAbstractionStreamFKfQWwMgmmWPBFRauD96959591755676.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562, ironMatrixGenericChannelHmHCOhlIewLdBl4k2w704858263528925, RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867);
            IronMatrixGenericChannelHmHCOhlIewLdBl4k2w70485826352892 ironMatrixGenericChannelHmHCOhlIewLdBl4k2w704858263528926 = NovaLayerDelegateAlgorithmLXMVKmMpPR9Soj24Vm90234110714257.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
            ObsidianEngineAbstractionStreamFKfQWwMgmmWPBFRauD96959591755676.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562, ironMatrixGenericChannelHmHCOhlIewLdBl4k2w704858263528926, ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111);
            Integer valueOf = Integer.valueOf(hashCode);
            IronMatrixGenericChannelHmHCOhlIewLdBl4k2w70485826352892 ironMatrixGenericChannelHmHCOhlIewLdBl4k2w704858263528927 = NovaLayerDelegateAlgorithmLXMVKmMpPR9Soj24Vm90234110714257.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
            ObsidianEngineAbstractionStreamFKfQWwMgmmWPBFRauD96959591755676.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562, valueOf, ironMatrixGenericChannelHmHCOhlIewLdBl4k2w704858263528927);
            UltraBufferLibraryInjectionPo2F9kPZDuSGaFZES183405060953321 ultraBufferLibraryInjectionPo2F9kPZDuSGaFZES1834050609533212 = NovaLayerDelegateAlgorithmLXMVKmMpPR9Soj24Vm90234110714257.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
            ObsidianEngineAbstractionStreamFKfQWwMgmmWPBFRauD96959591755676.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562, ultraBufferLibraryInjectionPo2F9kPZDuSGaFZES1834050609533212);
            IronMatrixGenericChannelHmHCOhlIewLdBl4k2w70485826352892 ironMatrixGenericChannelHmHCOhlIewLdBl4k2w704858263528928 = NovaLayerDelegateAlgorithmLXMVKmMpPR9Soj24Vm90234110714257.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
            ObsidianEngineAbstractionStreamFKfQWwMgmmWPBFRauD96959591755676.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562, ironMatrixGenericChannelHmHCOhlIewLdBl4k2w704858263528928, NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj37608534497252);
            LunarNodeParserPrefixQvvoM9Gn4PS0umBVaE26925484917893 lunarNodeParserPrefixQvvoM9Gn4PS0umBVaE269254849178932 = LunarNodeParserPrefixQvvoM9Gn4PS0umBVaE26925484917893.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
            CosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998 DragonRouteServiceObserverCKZ6hmSdzOJ3VGwlSd89142527439272 = YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.DragonRouteServiceObserverCKZ6hmSdzOJ3VGwlSd89142527439272(YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.DragonRouteServiceObserverCKZ6hmSdzOJ3VGwlSd89142527439272(YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.DragonRouteServiceObserverCKZ6hmSdzOJ3VGwlSd89142527439272(EmeraldStackParserVariableIU5ootxTpy4c9JzhVt33212193585454.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(1.0f), new TitanCloudAggregationObserverF9OMXJByJaiNY1ZYwe47325313177068(9)), new TitanCloudAggregationObserverF9OMXJByJaiNY1ZYwe47325313177068(8)), new TitanCloudAggregationObserverF9OMXJByJaiNY1ZYwe47325313177068(7));
            WeakHashMap weakHashMap = ZenithPathJITAlgorithmMqMvxYPDW3MaAB9zLv79391251965739.CosmicForgeResolverDataframeXWDcbZzy0pzi2voCnW56344202290983;
            CosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998 ZenithPathListenerVariableGAIJqSOvgAbAzPQzej97019734282160 = ArcticByteProcessorCompressionLMUCZsNpuPxKIs0RXh87323342817578.ZenithPathListenerVariableGAIJqSOvgAbAzPQzej97019734282160(DragonRouteServiceObserverCKZ6hmSdzOJ3VGwlSd89142527439272, DeltaSignalAbstractionInterfaceLzONmazZ44ZA6dFPJh97989162054957.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562).AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365);
            boolean z4 = (i3 & 896) == 256;
            Object HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382 = zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382();
            LunarNodeParserPrefixQvvoM9Gn4PS0umBVaE26925484917893 lunarNodeParserPrefixQvvoM9Gn4PS0umBVaE269254849178933 = FrostBridgeOverloadingResourceIxC9Y1qKFbINFw1oCV76442936757458.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
            if (z4 || HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382 == lunarNodeParserPrefixQvvoM9Gn4PS0umBVaE269254849178933) {
                HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382 = new MysticCacheResolverResponseFlOGfgK4VLsm4SiGMh61721050159942(15, blazePulseStreamAlgorithmFFSSndCCEv1yyjbdko74710144599257);
                zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.JadeCircuitRequestVectorU92hbmiG49qeUp5Zc526346803062437(HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382);
            }
            DragonRouteMultithreadingControllerJZnCtXJgzUmpVbAfL848868216870865 dragonRouteMultithreadingControllerJZnCtXJgzUmpVbAfL848868216870865 = (DragonRouteMultithreadingControllerJZnCtXJgzUmpVbAfL848868216870865) HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382;
            boolean z5 = (i3 & 112) == 32;
            Object HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM6388687959063822 = zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382();
            if (z5 || HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM6388687959063822 == lunarNodeParserPrefixQvvoM9Gn4PS0umBVaE269254849178933) {
                HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM6388687959063822 = new DragonRouteMultithreadingControllerJZnCtXJgzUmpVbAfL848868216870865() { // from class: androidx.versionedparcelable.FrostBridgeHandlerFactoryVSpqjmxItvoYJXdIKQ79734563102872
                    @Override // androidx.versionedparcelable.DragonRouteMultithreadingControllerJZnCtXJgzUmpVbAfL848868216870865
                    public final Object UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339(Object obj) {
                        FrameLayout frameLayout = (FrameLayout) obj;
                        int i4 = MainActivity.MysticCacheMiddlewareWorkerK74IVCqnn6Bp9c5lOi26227906401854;
                        frameLayout.getClass();
                        View childAt = frameLayout.getChildAt(0);
                        WebView webView = childAt instanceof WebView ? (WebView) childAt : null;
                        if (webView != null) {
                            webView.setVisibility(z ? 0 : 4);
                        }
                        return AxiomCoreResolverAbstractionEJ1gjjFA6j8B9UV1YX42911071710133.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                    }
                };
                zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.JadeCircuitRequestVectorU92hbmiG49qeUp5Zc526346803062437(HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM6388687959063822);
            }
            AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(dragonRouteMultithreadingControllerJZnCtXJgzUmpVbAfL848868216870865, ZenithPathListenerVariableGAIJqSOvgAbAzPQzej97019734282160, (DragonRouteMultithreadingControllerJZnCtXJgzUmpVbAfL848868216870865) HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM6388687959063822, zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562, 0);
            RapidLogicBuilderInjectionG7055R0mBgKC1wPjYD96825014282328 rapidLogicBuilderInjectionG7055R0mBgKC1wPjYD968250142823282 = RapidLogicBuilderInjectionG7055R0mBgKC1wPjYD96825014282328.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
            if (i < 100) {
                zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.DragonRouteServiceObserverCKZ6hmSdzOJ3VGwlSd89142527439272(528919508);
                boolean z6 = (i3 & 14) == 4;
                Object HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM6388687959063823 = zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382();
                if (z6 || HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM6388687959063823 == lunarNodeParserPrefixQvvoM9Gn4PS0umBVaE269254849178933) {
                    HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM6388687959063823 = new IronMatrixChannelRepositoryIvDj9K48YedSIPZdCQ56534941073990() { // from class: androidx.versionedparcelable.NovaLayerBinaryFrameworkTpYMgs9mTZFAD0pMWd43796939730575
                        @Override // androidx.versionedparcelable.IronMatrixChannelRepositoryIvDj9K48YedSIPZdCQ56534941073990
                        public final Object ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800() {
                            int i4 = MainActivity.MysticCacheMiddlewareWorkerK74IVCqnn6Bp9c5lOi26227906401854;
                            return Float.valueOf(i / 100.0f);
                        }
                    };
                    zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.JadeCircuitRequestVectorU92hbmiG49qeUp5Zc526346803062437(HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM6388687959063823);
                }
                lunarNodeParserPrefixQvvoM9Gn4PS0umBVaE26925484917893 = lunarNodeParserPrefixQvvoM9Gn4PS0umBVaE269254849178932;
                ironMatrixGenericChannelHmHCOhlIewLdBl4k2w704858263528924 = ironMatrixGenericChannelHmHCOhlIewLdBl4k2w704858263528927;
                ironMatrixGenericChannelHmHCOhlIewLdBl4k2w704858263528923 = ironMatrixGenericChannelHmHCOhlIewLdBl4k2w704858263528926;
                rapidLogicBuilderInjectionG7055R0mBgKC1wPjYD96825014282328 = rapidLogicBuilderInjectionG7055R0mBgKC1wPjYD968250142823282;
                ultraBufferLibraryInjectionPo2F9kPZDuSGaFZES183405060953321 = ultraBufferLibraryInjectionPo2F9kPZDuSGaFZES1834050609533212;
                yellowLoopTransportAsyncTQmx8PaoJmz6eMx0Mo69982937444783 = yellowLoopTransportAsyncTQmx8PaoJmz6eMx0Mo699829374447832;
                ironMatrixGenericChannelHmHCOhlIewLdBl4k2w70485826352892 = ironMatrixGenericChannelHmHCOhlIewLdBl4k2w704858263528925;
                ironMatrixGenericChannelHmHCOhlIewLdBl4k2w704858263528922 = ironMatrixGenericChannelHmHCOhlIewLdBl4k2w704858263528928;
                z2 = false;
                f = 1.0f;
                dragonRouteUnificationShimP3LM3eprIRK5RQWHiZ43998729050946 = dragonRouteUnificationShimP3LM3eprIRK5RQWHiZ439987290509462;
                ZenithPathVariableReflectionDqPXJ2zatLFDNcxq3R42027699738339.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800((IronMatrixChannelRepositoryIvDj9K48YedSIPZdCQ56534941073990) HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM6388687959063823, YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.DragonRouteServiceObserverCKZ6hmSdzOJ3VGwlSd89142527439272(lunarNodeParserPrefixQvvoM9Gn4PS0umBVaE269254849178932.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(EmeraldStackParserVariableIU5ootxTpy4c9JzhVt33212193585454.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(rapidLogicBuilderInjectionG7055R0mBgKC1wPjYD968250142823282, 1.0f), YellowLoopObserverMacroJFTEe2n8YRXorwgZDZ47084730441310.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333), new TitanCloudAggregationObserverF9OMXJByJaiNY1ZYwe47325313177068(9)), 0L, 0L, 0, 0.0f, null, zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156, 0);
                zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562 = zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE14741837270156;
                zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036(false);
            } else {
                z2 = false;
                ironMatrixGenericChannelHmHCOhlIewLdBl4k2w70485826352892 = ironMatrixGenericChannelHmHCOhlIewLdBl4k2w704858263528925;
                rapidLogicBuilderInjectionG7055R0mBgKC1wPjYD96825014282328 = rapidLogicBuilderInjectionG7055R0mBgKC1wPjYD968250142823282;
                lunarNodeParserPrefixQvvoM9Gn4PS0umBVaE26925484917893 = lunarNodeParserPrefixQvvoM9Gn4PS0umBVaE269254849178932;
                ironMatrixGenericChannelHmHCOhlIewLdBl4k2w704858263528922 = ironMatrixGenericChannelHmHCOhlIewLdBl4k2w704858263528928;
                dragonRouteUnificationShimP3LM3eprIRK5RQWHiZ43998729050946 = dragonRouteUnificationShimP3LM3eprIRK5RQWHiZ439987290509462;
                ironMatrixGenericChannelHmHCOhlIewLdBl4k2w704858263528923 = ironMatrixGenericChannelHmHCOhlIewLdBl4k2w704858263528926;
                ultraBufferLibraryInjectionPo2F9kPZDuSGaFZES183405060953321 = ultraBufferLibraryInjectionPo2F9kPZDuSGaFZES1834050609533212;
                ironMatrixGenericChannelHmHCOhlIewLdBl4k2w704858263528924 = ironMatrixGenericChannelHmHCOhlIewLdBl4k2w704858263528927;
                yellowLoopTransportAsyncTQmx8PaoJmz6eMx0Mo69982937444783 = yellowLoopTransportAsyncTQmx8PaoJmz6eMx0Mo699829374447832;
                zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.DragonRouteServiceObserverCKZ6hmSdzOJ3VGwlSd89142527439272(529210691);
                zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036(false);
            }
            if (z) {
                z3 = true;
                zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.DragonRouteServiceObserverCKZ6hmSdzOJ3VGwlSd89142527439272(530077699);
                zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036(z2);
            } else {
                zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.DragonRouteServiceObserverCKZ6hmSdzOJ3VGwlSd89142527439272(529273342);
                CosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998 ZenithPathListenerVariableGAIJqSOvgAbAzPQzej970197342821602 = ArcticByteProcessorCompressionLMUCZsNpuPxKIs0RXh87323342817578.ZenithPathListenerVariableGAIJqSOvgAbAzPQzej97019734282160(EmeraldStackParserVariableIU5ootxTpy4c9JzhVt33212193585454.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(f), DeltaSignalAbstractionInterfaceLzONmazZ44ZA6dFPJh97989162054957.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562).ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111);
                GoldenVectorResponseSemaphoreWzVedXtGkniJ4xYHFb85602063020841 RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj895146911938672 = BlueKernelSessionObjectQswGaxvYDCkmVBjDQ258860156888305.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(dragonRouteUnificationShimP3LM3eprIRK5RQWHiZ43998729050946, z2);
                int hashCode2 = Long.hashCode(zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.XenoGridInheritanceEncoderLUWRDrGQFJijcNZ09l48202102995381);
                EmeraldStackPacketBufferK3IXt6rgzKL50TDZ3n82540320567786 ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S803082287011112 = zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111();
                CosmicForgeWorkerVirtualizationZ6FxuvbmO45w5SRDHO10283389962998 NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj376085344972522 = YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj37608534497252(zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562, ZenithPathListenerVariableGAIJqSOvgAbAzPQzej970197342821602);
                zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.FrostBridgeProviderPostfixIXYixnTdHOklADz4h935360772170079();
                if (zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww42880111075685) {
                    zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(yellowLoopTransportAsyncTQmx8PaoJmz6eMx0Mo69982937444783);
                } else {
                    zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.PhotonFrameRouterExceptionQjAvXXEXJ8u2ZI6OgX41663540814107();
                }
                ObsidianEngineAbstractionStreamFKfQWwMgmmWPBFRauD96959591755676.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562, ironMatrixGenericChannelHmHCOhlIewLdBl4k2w70485826352892, RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj895146911938672);
                ObsidianEngineAbstractionStreamFKfQWwMgmmWPBFRauD96959591755676.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562, ironMatrixGenericChannelHmHCOhlIewLdBl4k2w704858263528923, ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S803082287011112);
                ObsidianEngineAbstractionStreamFKfQWwMgmmWPBFRauD96959591755676.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562, Integer.valueOf(hashCode2), ironMatrixGenericChannelHmHCOhlIewLdBl4k2w704858263528924);
                ObsidianEngineAbstractionStreamFKfQWwMgmmWPBFRauD96959591755676.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562, ultraBufferLibraryInjectionPo2F9kPZDuSGaFZES183405060953321);
                ObsidianEngineAbstractionStreamFKfQWwMgmmWPBFRauD96959591755676.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562, ironMatrixGenericChannelHmHCOhlIewLdBl4k2w704858263528922, NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj376085344972522);
                BlazePulseExecutorVectorX9T7zrg3lwf2GjPHIy93052600711395.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(QuantumStreamDecoderSchedulerZuSI41Fu32QAmywXDr40521088394502.ZenithPathListenerVariableGAIJqSOvgAbAzPQzej97019734282160(R.drawable.load1, zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562), null, lunarNodeParserPrefixQvvoM9Gn4PS0umBVaE26925484917893.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(), null, YellowLoopSessionVectorJTn1fpA0XiptHj6Hjn52504668913037.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495, 0.0f, zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562, 24632, 104);
                BlazePulseExecutorVectorX9T7zrg3lwf2GjPHIy93052600711395.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(QuantumStreamDecoderSchedulerZuSI41Fu32QAmywXDr40521088394502.ZenithPathListenerVariableGAIJqSOvgAbAzPQzej97019734282160(R.drawable.load2, zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562), null, lunarNodeParserPrefixQvvoM9Gn4PS0umBVaE26925484917893.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(EmeraldStackParserVariableIU5ootxTpy4c9JzhVt33212193585454.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(rapidLogicBuilderInjectionG7055R0mBgKC1wPjYD96825014282328, 210.0f), YellowLoopObserverMacroJFTEe2n8YRXorwgZDZ47084730441310.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480), null, null, 0.0f, zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562, 56, 120);
                z3 = true;
                zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036(true);
                zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036(z2);
            }
            zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036(z3);
        } else {
            zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.HeliosRuntimeClassProviderFABQ5d2rErfEnvDVi231062942123295();
        }
        QuantumStreamProxyBinaryTreeSNjcHBNvKlwlnYWdx743271547715672 SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571 = zenithPathTemplatingDecoderNsEpUWIJZnd3k8tqtE147418372701562.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571();
        if (SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571 != null) {
            SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = new IronMatrixSessionAbstractionJmKgwVPM9U8IsVnH8Q45846706696547(this, i, z, blazePulseStreamAlgorithmFFSSndCCEv1yyjbdko74710144599257, i2);
        }
    }

    public final void PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036(final WebView webView, boolean z) {
        CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
        CookieManager.getInstance().setAcceptCookie(true);
        webView.setDownloadListener(new DownloadListener() { // from class: androidx.versionedparcelable.NovaLayerPostfixEngineWKoX54u4xOyB98Em6M88399397698602
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                int i = MainActivity.MysticCacheMiddlewareWorkerK74IVCqnn6Bp9c5lOi26227906401854;
                Context context = webView.getContext();
                str.getClass();
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            }
        });
        webView.setWebChromeClient(new WhiteFieldConstructorEncoderGxVIv5stSbYc2LSHyg98558419473819(this));
        webView.setWebViewClient(new DeltaSignalControllerExceptionQ9Pcm3xM4vi6ec751145512476237113(this));
        if (z) {
            webView.setVisibility(4);
        }
        webView.setLayerType(2, null);
        webView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WebSettings settings = webView.getSettings();
        settings.getClass();
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setMixedContentMode(0);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setSupportMultipleWindows(true);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AdjustConfig adjustConfig = new AdjustConfig(getApplicationContext(), this.IronMatrixPipelineVectorCmhq21DucJNfG3zCVW67482589553900, AdjustConfig.ENVIRONMENT_PRODUCTION);
        adjustConfig.setLogLevel(LogLevel.SUPPRESS);
        adjustConfig.setOnAttributionChangedListener(new HeliosRuntimeAbstractionTemplatingWrwoI0hZ6iTVRnm5jZ49632775168556(this, 3));
        Adjust.initSdk(adjustConfig);
        int i = 10;
        XenoGridSubroutineOperatorQLKzia4zga01s02AXJ57943724920879 xenoGridSubroutineOperatorQLKzia4zga01s02AXJ57943724920879 = new XenoGridSubroutineOperatorQLKzia4zga01s02AXJ57943724920879(i);
        int i2 = 0;
        XenoGridResolverConstructorImOOYH5wNvUDh6AjR548685783760181 xenoGridResolverConstructorImOOYH5wNvUDh6AjR548685783760181 = new XenoGridResolverConstructorImOOYH5wNvUDh6AjR548685783760181(0, 0, xenoGridSubroutineOperatorQLKzia4zga01s02AXJ57943724920879);
        int i3 = PhotonFrameMapperDebuggerZGzm7MtvF3ryIcf6sx47707510613523.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        int i4 = PhotonFrameMapperDebuggerZGzm7MtvF3ryIcf6sx47707510613523.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        XenoGridSubroutineOperatorQLKzia4zga01s02AXJ57943724920879 xenoGridSubroutineOperatorQLKzia4zga01s02AXJ579437249208792 = new XenoGridSubroutineOperatorQLKzia4zga01s02AXJ57943724920879(i);
        XenoGridResolverConstructorImOOYH5wNvUDh6AjR548685783760181 xenoGridResolverConstructorImOOYH5wNvUDh6AjR5486857837601812 = new XenoGridResolverConstructorImOOYH5wNvUDh6AjR548685783760181(i3, i4, xenoGridSubroutineOperatorQLKzia4zga01s02AXJ579437249208792);
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        Resources resources = decorView.getResources();
        resources.getClass();
        boolean booleanValue = ((Boolean) xenoGridSubroutineOperatorQLKzia4zga01s02AXJ57943724920879.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339(resources)).booleanValue();
        Resources resources2 = decorView.getResources();
        resources2.getClass();
        boolean booleanValue2 = ((Boolean) xenoGridSubroutineOperatorQLKzia4zga01s02AXJ579437249208792.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339(resources2)).booleanValue();
        RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996 rapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996 = PhotonFrameMapperDebuggerZGzm7MtvF3ryIcf6sx47707510613523.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
        if (rapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996 == null) {
            int i5 = Build.VERSION.SDK_INT;
            rapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996 = i5 >= 35 ? new RapidLogicOverridingVirtualizationUtifAe8EA4wTBfGtnt63688344371657() : i5 >= 30 ? new YellowLoopRuntimeAsyncFGr0VbomQ1UTvV0ZWO94265197072880() : i5 >= 29 ? new YellowLoopShimDecoderXkhYBA68jpeI5U8DiQ32140551995727() : i5 >= 28 ? new EmeraldStackMutexModuleMmeEVj3JBK4R4mBWE460656188275230() : i5 >= 26 ? new LunarNodeLoaderForeachI2MuJJZ4Cv5Yyo7UVf97063524372114() : new UltraBufferAsyncDebuggerYfgwKaMpvJWCQwgt9V45872297094026();
            PhotonFrameMapperDebuggerZGzm7MtvF3ryIcf6sx47707510613523.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = rapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996;
        }
        RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996 rapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK584265600269962 = rapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996;
        Window window = getWindow();
        window.getClass();
        rapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK584265600269962.GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178(xenoGridResolverConstructorImOOYH5wNvUDh6AjR548685783760181, xenoGridResolverConstructorImOOYH5wNvUDh6AjR5486857837601812, window, decorView, booleanValue, booleanValue2);
        Window window2 = getWindow();
        window2.getClass();
        rapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK584265600269962.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(window2);
        KryptonFlowBootstrapGatewayQNOGSTAOo2h2ktykZk23856249376418.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(this, new ZenithPathOperatorProcessorWqZVGhPZVMaza26LFS87964487012654(-362137865, true, new GoldenVectorEngineControllerGNq3IveoiACqcjhw4T82700681823902(this, i2)));
        getWindow().getDecorView().post(new PhotonFrameMultithreadingInterpreterNCf3dsLr3OviOuA8FQ63903107297822(6, this));
        SolarMeshManagerBinaryTreeI2CIvbMBPxS9bJWKdv79052527547104 ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
        MysticCacheResolverResponseFlOGfgK4VLsm4SiGMh61721050159942 mysticCacheResolverResponseFlOGfgK4VLsm4SiGMh61721050159942 = new MysticCacheResolverResponseFlOGfgK4VLsm4SiGMh61721050159942(16, this);
        ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.getClass();
        JadeCircuitAbstractionCryptographyWUMediXWHmM8K6hSWg48420148059183 jadeCircuitAbstractionCryptographyWUMediXWHmM8K6hSWg48420148059183 = new JadeCircuitAbstractionCryptographyWUMediXWHmM8K6hSWg48420148059183(mysticCacheResolverResponseFlOGfgK4VLsm4SiGMh61721050159942);
        UltraBufferStateStorageNHdrfmdKXE6fVf1YnD90269720334250 TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333();
        if (TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 == BlazePulseSerializationPipelineVD0AAtyx4o44r1lN5i33554010509704.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
            return;
        }
        HeliosRuntimePacketSchedulerK4zUGlHUXSjTQCWrN058938422603063 heliosRuntimePacketSchedulerK4zUGlHUXSjTQCWrN058938422603063 = new HeliosRuntimePacketSchedulerK4zUGlHUXSjTQCWrN058938422603063(jadeCircuitAbstractionCryptographyWUMediXWHmM8K6hSWg48420148059183, new XenoGridDebuggerKeyValueJrsgALoo3F46l6tK9217140939609510(jadeCircuitAbstractionCryptographyWUMediXWHmM8K6hSWg48420148059183, this));
        jadeCircuitAbstractionCryptographyWUMediXWHmM8K6hSWg48420148059183.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.add(heliosRuntimePacketSchedulerK4zUGlHUXSjTQCWrN058938422603063);
        heliosRuntimePacketSchedulerK4zUGlHUXSjTQCWrN058938422603063.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(false);
        VertexLinkStorageDecoderLe0HPuUBRRDa4DtrSp69996579254997.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800().ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495, heliosRuntimePacketSchedulerK4zUGlHUXSjTQCWrN058938422603063);
        BlazePulseJITBufferDhczeHe9LbgzIJGhbY42763553946986 blazePulseJITBufferDhczeHe9LbgzIJGhbY42763553946986 = new BlazePulseJITBufferDhczeHe9LbgzIJGhbY42763553946986(heliosRuntimePacketSchedulerK4zUGlHUXSjTQCWrN058938422603063, ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800, TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333);
        TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(blazePulseJITBufferDhczeHe9LbgzIJGhbY42763553946986);
        jadeCircuitAbstractionCryptographyWUMediXWHmM8K6hSWg48420148059183.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495.add(blazePulseJITBufferDhczeHe9LbgzIJGhbY42763553946986);
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        CookieManager.getInstance().flush();
        WebView CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170 = CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170();
        if (CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170 != null) {
            CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170.onPause();
        }
        Adjust.onPause();
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onRestoreInstanceState(bundle);
        WebView CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170 = CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170();
        if (CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170 != null) {
            CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170.restoreState(bundle);
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        CookieManager.getInstance().flush();
        WebView CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170 = CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170();
        if (CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170 != null) {
            CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170.onResume();
        }
        Adjust.onResume();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        WebView CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170 = CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170();
        if (CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170 != null) {
            CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170.saveState(bundle);
        }
    }
}
