package androidx.versionedparcelable;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Trace;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import com.android.installreferrer.api.InstallReferrerClient;
import com.icecatchpuzzle.puzzleicecatch.MainActivity;
import java.nio.MappedByteBuffer;
import java.util.ArrayDeque;
import java.util.Iterator;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final /* synthetic */ class PhotonFrameMultithreadingInterpreterNCf3dsLr3OviOuA8FQ63903107297822 implements Runnable {
    public final /* synthetic */ Object LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final /* synthetic */ int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    public /* synthetic */ PhotonFrameMultithreadingInterpreterNCf3dsLr3OviOuA8FQ63903107297822(int i, Object obj) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = obj;
    }

    private final void ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800() {
        ZenithPathAPINormalizationRG5CHRB3JVnFKdYJQQ65914319636843 zenithPathAPINormalizationRG5CHRB3JVnFKdYJQQ65914319636843 = (ZenithPathAPINormalizationRG5CHRB3JVnFKdYJQQ65914319636843) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        synchronized (((ArrayDeque) zenithPathAPINormalizationRG5CHRB3JVnFKdYJQQ65914319636843.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333)) {
            SharedPreferences.Editor edit = ((SharedPreferences) zenithPathAPINormalizationRG5CHRB3JVnFKdYJQQ65914319636843.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867).edit();
            String str = (String) zenithPathAPINormalizationRG5CHRB3JVnFKdYJQQ65914319636843.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
            StringBuilder sb = new StringBuilder();
            Iterator it = ((ArrayDeque) zenithPathAPINormalizationRG5CHRB3JVnFKdYJQQ65914319636843.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333).iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append((String) zenithPathAPINormalizationRG5CHRB3JVnFKdYJQQ65914319636843.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
            }
            edit.putString(str, sb.toString()).commit();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        View findFocus;
        int i2 = 8;
        Boolean bool = null;
        int i3 = 0;
        switch (this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                HeliosRuntimeJITDataframeMDtdAQHPOdwXeiP1IU90996828313192 heliosRuntimeJITDataframeMDtdAQHPOdwXeiP1IU90996828313192 = (HeliosRuntimeJITDataframeMDtdAQHPOdwXeiP1IU90996828313192) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                Trace.beginSection("measureAndLayout");
                try {
                    heliosRuntimeJITDataframeMDtdAQHPOdwXeiP1IU90996828313192.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.PhotonFrameRuntimeKeyValueRxsctdJg5CGmXPHjuh15556138883942(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        heliosRuntimeJITDataframeMDtdAQHPOdwXeiP1IU90996828313192.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333();
                        Trace.endSection();
                        heliosRuntimeJITDataframeMDtdAQHPOdwXeiP1IU90996828313192.MysticCacheMiddlewareWorkerK74IVCqnn6Bp9c5lOi26227906401854 = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            case 1:
                HeliosRuntimeRepositoryDependencyAGBRvqzIjRCttF1xz152217685650729 heliosRuntimeRepositoryDependencyAGBRvqzIjRCttF1xz152217685650729 = (HeliosRuntimeRepositoryDependencyAGBRvqzIjRCttF1xz152217685650729) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                boolean BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = heliosRuntimeRepositoryDependencyAGBRvqzIjRCttF1xz152217685650729.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818();
                HeliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj36236082094921 heliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj36236082094921 = heliosRuntimeRepositoryDependencyAGBRvqzIjRCttF1xz152217685650729.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                if (BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        heliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj36236082094921.PhotonFrameRuntimeKeyValueRxsctdJg5CGmXPHjuh15556138883942(true);
                        YellowLoopFloatingPointOperatorKlyjAlwPv5t4899pAB35943579541256 yellowLoopFloatingPointOperatorKlyjAlwPv5t4899pAB35943579541256 = heliosRuntimeRepositoryDependencyAGBRvqzIjRCttF1xz152217685650729.EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111;
                        int[] iArr = yellowLoopFloatingPointOperatorKlyjAlwPv5t4899pAB35943579541256.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                        long[] jArr = yellowLoopFloatingPointOperatorKlyjAlwPv5t4899pAB35943579541256.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i4 = 0;
                            while (true) {
                                long j = jArr[i4];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                                    int i6 = i3;
                                    while (i6 < i5) {
                                        if ((255 & j) < 128) {
                                            int i7 = iArr[(i4 << 3) + i6];
                                            if (!heliosRuntimeRepositoryDependencyAGBRvqzIjRCttF1xz152217685650729.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333().ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(i7)) {
                                                i = length;
                                                heliosRuntimeRepositoryDependencyAGBRvqzIjRCttF1xz152217685650729.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.add(new XenoGridProcessorKeyValueK3bswaW411wziRmrBt84572344430517(i7, heliosRuntimeRepositoryDependencyAGBRvqzIjRCttF1xz152217685650729.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170, VertexLinkExceptionJITUUWcrUZhzv7xCBNRyg68472425488276.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119, null));
                                                heliosRuntimeRepositoryDependencyAGBRvqzIjRCttF1xz152217685650729.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036(AxiomCoreResolverAbstractionEJ1gjjFA6j8B9UV1YX42911071710133.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
                                                j >>= 8;
                                                i6++;
                                                length = i;
                                            }
                                        }
                                        i = length;
                                        j >>= 8;
                                        i6++;
                                        length = i;
                                    }
                                    int i8 = length;
                                    if (i5 == 8) {
                                        length = i8;
                                    }
                                }
                                if (i4 != length) {
                                    i4++;
                                    i3 = 0;
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        heliosRuntimeRepositoryDependencyAGBRvqzIjRCttF1xz152217685650729.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(heliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj36236082094921.getSemanticsOwner().ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(), heliosRuntimeRepositoryDependencyAGBRvqzIjRCttF1xz152217685650729.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036);
                        Trace.endSection();
                        heliosRuntimeRepositoryDependencyAGBRvqzIjRCttF1xz152217685650729.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(heliosRuntimeRepositoryDependencyAGBRvqzIjRCttF1xz152217685650729.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333());
                        heliosRuntimeRepositoryDependencyAGBRvqzIjRCttF1xz152217685650729.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170();
                        heliosRuntimeRepositoryDependencyAGBRvqzIjRCttF1xz152217685650729.CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927 = false;
                        return;
                    } catch (Throwable th) {
                        throw th;
                    } finally {
                    }
                }
                return;
            case 2:
                ActionMode actionMode = ((CosmicForgeMiddlewareDispatcherKkRYqWZuKhMDCofZot23829413931415) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            case 3:
                BlueKernelReducerPrimitiveKLB0YORzsG7LUNvD3N62667633692552 blueKernelReducerPrimitiveKLB0YORzsG7LUNvD3N62667633692552 = (BlueKernelReducerPrimitiveKLB0YORzsG7LUNvD3N62667633692552) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                Runnable runnable = blueKernelReducerPrimitiveKLB0YORzsG7LUNvD3N62667633692552.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                if (runnable != null) {
                    runnable.run();
                    blueKernelReducerPrimitiveKLB0YORzsG7LUNvD3N62667633692552.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = null;
                    return;
                }
                return;
            case InstallReferrerClient.InstallReferrerResponse.PERMISSION_ERROR /* 4 */:
                BlueKernelNormalizationSchedulerZpgFIxbYUEYkndsqEa95572808518631 blueKernelNormalizationSchedulerZpgFIxbYUEYkndsqEa95572808518631 = (BlueKernelNormalizationSchedulerZpgFIxbYUEYkndsqEa95572808518631) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                synchronized (blueKernelNormalizationSchedulerZpgFIxbYUEYkndsqEa95572808518631.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
                    try {
                        if (blueKernelNormalizationSchedulerZpgFIxbYUEYkndsqEa95572808518631.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 == null) {
                            return;
                        }
                        try {
                            BlueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673 ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = blueKernelNormalizationSchedulerZpgFIxbYUEYkndsqEa95572808518631.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495();
                            int i9 = ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
                            if (i9 == 2) {
                                synchronized (blueKernelNormalizationSchedulerZpgFIxbYUEYkndsqEa95572808518631.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
                                }
                            }
                            if (i9 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i9 + ")");
                            }
                            try {
                                int i10 = QuantumStreamDecoderUnificationQcf0s5dC0STgWByH4J73680455539869.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                LunarNodeParserPrefixQvvoM9Gn4PS0umBVaE26925484917893 lunarNodeParserPrefixQvvoM9Gn4PS0umBVaE26925484917893 = blueKernelNormalizationSchedulerZpgFIxbYUEYkndsqEa95572808518631.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
                                Context context = blueKernelNormalizationSchedulerZpgFIxbYUEYkndsqEa95572808518631.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                                lunarNodeParserPrefixQvvoM9Gn4PS0umBVaE26925484917893.getClass();
                                BlueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673[] blueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673Arr = {ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495};
                                MysticCacheEngineHashmapZlHyWSU1b4ZjPfmPG583453060494071 mysticCacheEngineHashmapZlHyWSU1b4ZjPfmPG583453060494071 = UltraBufferModuleContextMlhwMKPCmlLPCCyRVv91224359513707.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                                ZenithPathOperatorAnnotationFpbtDiBdeccVHe3K6z54410133485305.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = UltraBufferModuleContextMlhwMKPCmlLPCCyRVv91224359513707.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(context, blueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673Arr);
                                    Trace.endSection();
                                    MappedByteBuffer RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = HeliosRuntimeWorkerBootstrapUWc2dFJfLzkMJ9qkq098166330516090.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800, blueKernelNormalizationSchedulerZpgFIxbYUEYkndsqEa95572808518631.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
                                    if (RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 == null || ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        VertexLinkStorageDecoderLe0HPuUBRRDa4DtrSp69996579254997 vertexLinkStorageDecoderLe0HPuUBRRDa4DtrSp69996579254997 = new VertexLinkStorageDecoderLe0HPuUBRRDa4DtrSp69996579254997(ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800, ArcticByteProcessorCompressionLMUCZsNpuPxKIs0RXh87323342817578.LunarNodeAsyncCompressionXhW6Mr3UFps5CRaeph11269602575390(RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867));
                                        Trace.endSection();
                                        synchronized (blueKernelNormalizationSchedulerZpgFIxbYUEYkndsqEa95572808518631.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
                                            try {
                                                XenoGridProcessorProcessorNcBZZjQOb3tKNLhyLo99586204685692 xenoGridProcessorProcessorNcBZZjQOb3tKNLhyLo99586204685692 = blueKernelNormalizationSchedulerZpgFIxbYUEYkndsqEa95572808518631.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
                                                if (xenoGridProcessorProcessorNcBZZjQOb3tKNLhyLo99586204685692 != null) {
                                                    xenoGridProcessorProcessorNcBZZjQOb3tKNLhyLo99586204685692.ZenithPathListenerVariableGAIJqSOvgAbAzPQzej97019734282160(vertexLinkStorageDecoderLe0HPuUBRRDa4DtrSp69996579254997);
                                                }
                                            } finally {
                                            }
                                        }
                                        blueKernelNormalizationSchedulerZpgFIxbYUEYkndsqEa95572808518631.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365();
                                        return;
                                    } finally {
                                        int i11 = QuantumStreamDecoderUnificationQcf0s5dC0STgWByH4J73680455539869.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        } catch (Throwable th2) {
                            synchronized (blueKernelNormalizationSchedulerZpgFIxbYUEYkndsqEa95572808518631.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
                                try {
                                    XenoGridProcessorProcessorNcBZZjQOb3tKNLhyLo99586204685692 xenoGridProcessorProcessorNcBZZjQOb3tKNLhyLo995862046856922 = blueKernelNormalizationSchedulerZpgFIxbYUEYkndsqEa95572808518631.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
                                    if (xenoGridProcessorProcessorNcBZZjQOb3tKNLhyLo995862046856922 != null) {
                                        xenoGridProcessorProcessorNcBZZjQOb3tKNLhyLo995862046856922.NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj37608534497252(th2);
                                    }
                                    blueKernelNormalizationSchedulerZpgFIxbYUEYkndsqEa95572808518631.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 5:
                Iterator it = ((UltraBufferDataframeBinaryTreeG2COdQR6kRylEpFvSl43478602538178) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333();
                    return;
                }
                return;
            case 6:
                ((MainActivity) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).ZenithPathListenerVariableGAIJqSOvgAbAzPQzej97019734282160.CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927("android.permission.POST_NOTIFICATIONS");
                return;
            case 7:
                ZenithPathRouterAbstractionUS9quqO2RwkW4ZwyUJ11709758150172 zenithPathRouterAbstractionUS9quqO2RwkW4ZwyUJ11709758150172 = (ZenithPathRouterAbstractionUS9quqO2RwkW4ZwyUJ11709758150172) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                UltraBufferStateStorageNHdrfmdKXE6fVf1YnD90269720334250 ultraBufferStateStorageNHdrfmdKXE6fVf1YnD90269720334250 = zenithPathRouterAbstractionUS9quqO2RwkW4ZwyUJ11709758150172.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339;
                if (zenithPathRouterAbstractionUS9quqO2RwkW4ZwyUJ11709758150172.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 == 0) {
                    zenithPathRouterAbstractionUS9quqO2RwkW4ZwyUJ11709758150172.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = true;
                    ultraBufferStateStorageNHdrfmdKXE6fVf1YnD90269720334250.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(NovaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073.ON_PAUSE);
                }
                if (zenithPathRouterAbstractionUS9quqO2RwkW4ZwyUJ11709758150172.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 == 0 && zenithPathRouterAbstractionUS9quqO2RwkW4ZwyUJ11709758150172.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170) {
                    ultraBufferStateStorageNHdrfmdKXE6fVf1YnD90269720334250.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(NovaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073.ON_STOP);
                    zenithPathRouterAbstractionUS9quqO2RwkW4ZwyUJ11709758150172.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = true;
                    return;
                }
                return;
            case 8:
                UltraBufferSingletonSerializationR9Y0155erKXbFICX9r61881675755368.setRippleState$lambda$1((UltraBufferSingletonSerializationR9Y0155erKXbFICX9r61881675755368) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119);
                return;
            case 9:
                ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
                return;
            case 10:
                View view = (View) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            case 11:
                KryptonFlowEncoderContextN4qRVptoT9aHcPYsyu93414980354375 kryptonFlowEncoderContextN4qRVptoT9aHcPYsyu93414980354375 = ((RapidLogicOperatorBufferUEWjeALlGGM158fNXG25570539895780) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                ViewParent parent = kryptonFlowEncoderContextN4qRVptoT9aHcPYsyu93414980354375.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(kryptonFlowEncoderContextN4qRVptoT9aHcPYsyu93414980354375);
                    return;
                }
                return;
            case 12:
                VertexLinkPacketInheritanceQwOMUR6KbY5fsby7fU28687939568592 vertexLinkPacketInheritanceQwOMUR6KbY5fsby7fU28687939568592 = (VertexLinkPacketInheritanceQwOMUR6KbY5fsby7fU28687939568592) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                ZenithPathWorkerAliasSZA0eHfpevYaNTGBat94887047860215 zenithPathWorkerAliasSZA0eHfpevYaNTGBat94887047860215 = vertexLinkPacketInheritanceQwOMUR6KbY5fsby7fU28687939568592.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                vertexLinkPacketInheritanceQwOMUR6KbY5fsby7fU28687939568592.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170 = null;
                GoldenVectorComponentContextTRUkXGjgx9ss0j2d4f91910937845310 goldenVectorComponentContextTRUkXGjgx9ss0j2d4f91910937845310 = vertexLinkPacketInheritanceQwOMUR6KbY5fsby7fU28687939568592.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834;
                View view2 = vertexLinkPacketInheritanceQwOMUR6KbY5fsby7fU28687939568592.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                if (!view2.isFocused() && (findFocus = view2.getRootView().findFocus()) != null && findFocus.onCheckIsTextEditor()) {
                    goldenVectorComponentContextTRUkXGjgx9ss0j2d4f91910937845310.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333();
                    return;
                }
                Object[] objArr = goldenVectorComponentContextTRUkXGjgx9ss0j2d4f91910937845310.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                int i12 = goldenVectorComponentContextTRUkXGjgx9ss0j2d4f91910937845310.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
                Boolean bool2 = null;
                for (int i13 = 0; i13 < i12; i13++) {
                    DragonRouteConstructorSchedulerQSOJwuF4qRO54TwfmR86986423652418 dragonRouteConstructorSchedulerQSOJwuF4qRO54TwfmR86986423652418 = (DragonRouteConstructorSchedulerQSOJwuF4qRO54TwfmR86986423652418) objArr[i13];
                    int ordinal = dragonRouteConstructorSchedulerQSOJwuF4qRO54TwfmR86986423652418.ordinal();
                    if (ordinal == 0) {
                        bool = Boolean.TRUE;
                    } else if (ordinal == 1) {
                        bool = Boolean.FALSE;
                    } else if (ordinal != 2 && ordinal != 3) {
                        CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
                        return;
                    } else {
                        if (!YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(bool, Boolean.FALSE)) {
                            bool2 = Boolean.valueOf(dragonRouteConstructorSchedulerQSOJwuF4qRO54TwfmR86986423652418 == DragonRouteConstructorSchedulerQSOJwuF4qRO54TwfmR86986423652418.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
                        }
                    }
                    bool2 = bool;
                }
                goldenVectorComponentContextTRUkXGjgx9ss0j2d4f91910937845310.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333();
                if (YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(bool, Boolean.TRUE)) {
                    ((InputMethodManager) ((RapidLogicListenerVariableVH8odIXxCAe6WG4YVz40806053584695) zenithPathWorkerAliasSZA0eHfpevYaNTGBat94887047860215.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170).getValue()).restartInput((View) zenithPathWorkerAliasSZA0eHfpevYaNTGBat94887047860215.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119);
                }
                if (bool2 != null) {
                    if (bool2.booleanValue()) {
                        ((WhiteFieldClosureVectorV90NGNIy3LMp3zZnTJ72513326892253) ((WhiteFieldClosureVectorV90NGNIy3LMp3zZnTJ72513326892253) zenithPathWorkerAliasSZA0eHfpevYaNTGBat94887047860215.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333).LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927();
                    } else {
                        ((WhiteFieldClosureVectorV90NGNIy3LMp3zZnTJ72513326892253) ((WhiteFieldClosureVectorV90NGNIy3LMp3zZnTJ72513326892253) zenithPathWorkerAliasSZA0eHfpevYaNTGBat94887047860215.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333).LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111();
                    }
                }
                if (YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(bool, Boolean.FALSE)) {
                    ((InputMethodManager) ((RapidLogicListenerVariableVH8odIXxCAe6WG4YVz40806053584695) zenithPathWorkerAliasSZA0eHfpevYaNTGBat94887047860215.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170).getValue()).restartInput((View) zenithPathWorkerAliasSZA0eHfpevYaNTGBat94887047860215.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119);
                    return;
                }
                return;
            case 13:
                CrimsonRouteChannelBitfieldFEIY9kPvSisDY48pdD13962431973080 crimsonRouteChannelBitfieldFEIY9kPvSisDY48pdD13962431973080 = (CrimsonRouteChannelBitfieldFEIY9kPvSisDY48pdD13962431973080) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                crimsonRouteChannelBitfieldFEIY9kPvSisDY48pdD13962431973080.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.getAction();
                crimsonRouteChannelBitfieldFEIY9kPvSisDY48pdD13962431973080.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(null);
                return;
            default:
                VertexLinkStorageDecoderLe0HPuUBRRDa4DtrSp69996579254997 vertexLinkStorageDecoderLe0HPuUBRRDa4DtrSp699965792549972 = (VertexLinkStorageDecoderLe0HPuUBRRDa4DtrSp69996579254997) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                ((PhotonFrameMapperCoroutineTR0zaTUSdZcXmaKoMY86970278333163) vertexLinkStorageDecoderLe0HPuUBRRDa4DtrSp699965792549972.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333).YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(new KryptonFlowBufferImmutableBWE7TWn4z6Dv2MkZvC31441389142486(i2, vertexLinkStorageDecoderLe0HPuUBRRDa4DtrSp699965792549972));
                return;
        }
    }
}
