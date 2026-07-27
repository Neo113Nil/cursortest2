package androidx.versionedparcelable;

import android.R;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import com.android.installreferrer.api.InstallReferrerClient;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class QuantumStreamArrayRequestMXuPIuZC5tKz4hAztt84263341538100 implements InputConnection {
    public final IronMatrixValidationAttributeDVfUu8c1dMYAd99pxl52101498692725 ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
    public final boolean AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public int BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
    public final DeltaSignalBootstrapBinaryN4gOWCUX3nFfeIUuqX55630849864727 LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final IronMatrixLambdaInterpreterAMM06uChcWEtStW0Ed29200995437406 ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
    public final QuantumStreamPipelineLoaderZyGO1RcXhp0DZoYF1q90997512822413 RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public RapidLogicSubroutineSubroutineTmaNK3omQFedqzHEyr99497266732760 TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
    public boolean UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339;
    public int YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
    public final ArrayList NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480 = new ArrayList();
    public boolean ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050 = true;

    public QuantumStreamArrayRequestMXuPIuZC5tKz4hAztt84263341538100(RapidLogicSubroutineSubroutineTmaNK3omQFedqzHEyr99497266732760 rapidLogicSubroutineSubroutineTmaNK3omQFedqzHEyr99497266732760, IronMatrixLambdaInterpreterAMM06uChcWEtStW0Ed29200995437406 ironMatrixLambdaInterpreterAMM06uChcWEtStW0Ed29200995437406, boolean z, IronMatrixValidationAttributeDVfUu8c1dMYAd99pxl52101498692725 ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl52101498692725, QuantumStreamPipelineLoaderZyGO1RcXhp0DZoYF1q90997512822413 quantumStreamPipelineLoaderZyGO1RcXhp0DZoYF1q90997512822413, DeltaSignalBootstrapBinaryN4gOWCUX3nFfeIUuqX55630849864727 deltaSignalBootstrapBinaryN4gOWCUX3nFfeIUuqX55630849864727) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = ironMatrixLambdaInterpreterAMM06uChcWEtStW0Ed29200995437406;
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = z;
        this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl52101498692725;
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = quantumStreamPipelineLoaderZyGO1RcXhp0DZoYF1q90997512822413;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = deltaSignalBootstrapBinaryN4gOWCUX3nFfeIUuqX55630849864727;
        this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = rapidLogicSubroutineSubroutineTmaNK3omQFedqzHEyr99497266732760;
    }

    public final void ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    public final boolean AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365() {
        int i = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 - 1;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = i;
        if (i == 0) {
            ArrayList arrayList = this.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480;
            if (!arrayList.isEmpty()) {
                ((SolarMeshPrefixBinaryB7ogdfuvDl6fjFeD8U65103330587223) this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 > 0;
    }

    public final void ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(SolarMeshDelegateAPIBTcxqE0jlAAmKJIvuD72679087675083 solarMeshDelegateAPIBTcxqE0jlAAmKJIvuD72679087675083) {
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170++;
        try {
            this.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480.add(solarMeshDelegateAPIBTcxqE0jlAAmKJIvuD72679087675083);
        } finally {
            AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365();
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
        if (!z) {
            return z;
        }
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480.clear();
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = 0;
        this.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050 = false;
        ArrayList arrayList = ((SolarMeshPrefixBinaryB7ogdfuvDl6fjFeD8U65103330587223) this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(((WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
        return z ? this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
        if (z) {
            ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(new WhiteFieldLambdaRegistryHR1i4HfAj67t19HjaD13337098375225(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
        if (!z) {
            return z;
        }
        ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(new TitanCloudRepositoryJSONIRKRT4gC4dvOJE0PU697341501963659(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
        if (!z) {
            return z;
        }
        ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(new XenoGridMutexReflectionUPHAG7BE3yeSyziNGI96616227007265(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
        if (!z) {
            return z;
        }
        ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(new CrimsonRouteProcessorVirtualizationUepAEuPo2VP8b9yKsl83476958356252());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        RapidLogicSubroutineSubroutineTmaNK3omQFedqzHEyr99497266732760 rapidLogicSubroutineSubroutineTmaNK3omQFedqzHEyr99497266732760 = this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
        return TextUtils.getCapsMode(rapidLogicSubroutineSubroutineTmaNK3omQFedqzHEyr99497266732760.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119, ArcticByteVectorVariableCFvRC42ks0cpNL3vA973048432965072.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(rapidLogicSubroutineSubroutineTmaNK3omQFedqzHEyr99497266732760.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339 = z;
        if (z) {
            this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return ArcticByteProcessorCompressionLMUCZsNpuPxKIs0RXh87323342817578.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (ArcticByteVectorVariableCFvRC42ks0cpNL3vA973048432965072.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365)) {
            return null;
        }
        return QuantumStreamDecoderSchedulerZuSI41Fu32QAmywXDr40521088394502.MysticCacheParserHashmapNCNANojYkqCJuUmK2O16057626810798(this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333).LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return QuantumStreamDecoderSchedulerZuSI41Fu32QAmywXDr40521088394502.GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178(this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333, i).LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return QuantumStreamDecoderSchedulerZuSI41Fu32QAmywXDr40521088394502.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333, i).LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(new BlueKernelMapperTransportU1AucRgupkmsVSFlfK24079619294400(0, this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.length()));
                    break;
                case R.id.cut:
                    ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(277);
                    return false;
                case R.id.copy:
                    ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(278);
                    return false;
                case R.id.paste:
                    ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(279);
                    return false;
                default:
                    return false;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        boolean z = this.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
        if (z) {
            z = true;
            if (i != 0) {
                switch (i) {
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case InstallReferrerClient.InstallReferrerResponse.PERMISSION_ERROR /* 4 */:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                        i2 = 7;
                        break;
                    case 7:
                        i2 = 5;
                        break;
                }
                ((SolarMeshPrefixBinaryB7ogdfuvDl6fjFeD8U65103330587223) this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339(new IronMatrixOverloadingResourceC5d6WximJRfboBvK7163774202806087(i2));
            }
            i2 = 1;
            ((SolarMeshPrefixBinaryB7ogdfuvDl6fjFeD8U65103330587223) this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339(new IronMatrixOverloadingResourceC5d6WximJRfboBvK7163774202806087(i2));
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02d9  */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [long] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.versionedparcelable.WhiteFieldObjectInterpreterJRwn7W2RhiEDET2fI963391609449981, java.lang.CharSequence] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, final IntConsumer intConsumer) {
        ?? r6;
        PointF startPoint;
        PointF endPoint;
        ?? r16;
        long j;
        ?? r17;
        int i;
        int i2;
        String sb;
        int i3;
        PointF insertionPoint;
        QuantumStreamOperatorHeuristicOomWyjZkFiTF0fF5lc34008316597098 RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        String textToInsert;
        PointF joinOrSplitPoint;
        QuantumStreamOperatorHeuristicOomWyjZkFiTF0fF5lc34008316597098 RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj895146911938672;
        int granularity;
        RectF deletionStartArea;
        RectF deletionEndArea;
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity2;
        int granularity3;
        RectF deletionArea;
        RectF selectionArea;
        int granularity4;
        IronMatrixFactoryCryptographyME8UmIWEtqcOAs9omu59821466153638 ironMatrixFactoryCryptographyME8UmIWEtqcOAs9omu59821466153638;
        if (Build.VERSION.SDK_INT >= 34) {
            MysticCacheResolverResponseFlOGfgK4VLsm4SiGMh61721050159942 mysticCacheResolverResponseFlOGfgK4VLsm4SiGMh61721050159942 = new MysticCacheResolverResponseFlOGfgK4VLsm4SiGMh61721050159942(21, this);
            IronMatrixValidationAttributeDVfUu8c1dMYAd99pxl52101498692725 ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl52101498692725 = this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
            final int i4 = 3;
            if (ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl52101498692725 != null && (r6 = ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl52101498692725.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480) != null) {
                QuantumStreamOperatorHeuristicOomWyjZkFiTF0fF5lc34008316597098 RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj895146911938673 = ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl52101498692725.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867();
                if (r6.equals((RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj895146911938673 == null || (ironMatrixFactoryCryptographyME8UmIWEtqcOAs9omu59821466153638 = RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj895146911938673.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) == null) ? null : ironMatrixFactoryCryptographyME8UmIWEtqcOAs9omu59821466153638.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800)) {
                    boolean SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571 = BlazePulseFactoryHeuristicTsvAsY0A8Lf37Z4n6253201373298677.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571(handwritingGesture);
                    int i5 = 1;
                    QuantumStreamPipelineLoaderZyGO1RcXhp0DZoYF1q90997512822413 quantumStreamPipelineLoaderZyGO1RcXhp0DZoYF1q90997512822413 = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                    if (SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571) {
                        SelectGesture AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = CosmicForgeMultithreadingProcessorNbEBvdugAgPwA6k5Bi10009615733616.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(handwritingGesture);
                        selectionArea = AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.getSelectionArea();
                        CosmicForgeConnectorRepositoryK3toUz9jyCSxcbNksk23919164703399 VertexLinkProviderDependencyKKfth2vVCV2iqzAPu071258294892353 = YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.VertexLinkProviderDependencyKKfth2vVCV2iqzAPu071258294892353(selectionArea);
                        granularity4 = AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.getGranularity();
                        long MysticCacheParserHashmapNCNANojYkqCJuUmK2O16057626810798 = FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.MysticCacheParserHashmapNCNANojYkqCJuUmK2O16057626810798(ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl52101498692725, VertexLinkProviderDependencyKKfth2vVCV2iqzAPu071258294892353, granularity4 == 1 ? 1 : 0);
                        if (ArcticByteVectorVariableCFvRC42ks0cpNL3vA973048432965072.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(MysticCacheParserHashmapNCNANojYkqCJuUmK2O16057626810798)) {
                            i4 = ObsidianEngineTranspilerWorkerEHoOsrsySnsoA9iWxm35468870095129.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571(DragonRouteMutexProviderQVKdcX2qPkagYtjjKg74727371602652.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170(AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365), mysticCacheResolverResponseFlOGfgK4VLsm4SiGMh61721050159942);
                        } else {
                            mysticCacheResolverResponseFlOGfgK4VLsm4SiGMh61721050159942.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339(new BlueKernelMapperTransportU1AucRgupkmsVSFlfK24079619294400((int) (MysticCacheParserHashmapNCNANojYkqCJuUmK2O16057626810798 >> 32), (int) (MysticCacheParserHashmapNCNANojYkqCJuUmK2O16057626810798 & 4294967295L)));
                            if (quantumStreamPipelineLoaderZyGO1RcXhp0DZoYF1q90997512822413 != null) {
                                quantumStreamPipelineLoaderZyGO1RcXhp0DZoYF1q90997512822413.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(true);
                            }
                            i4 = 1;
                        }
                    } else if (DragonRouteMutexProviderQVKdcX2qPkagYtjjKg74727371602652.MysticCacheParserHashmapNCNANojYkqCJuUmK2O16057626810798(handwritingGesture)) {
                        DeleteGesture ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111 = DragonRouteMutexProviderQVKdcX2qPkagYtjjKg74727371602652.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111(handwritingGesture);
                        granularity3 = ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111.getGranularity();
                        int i6 = granularity3 != 1 ? 0 : 1;
                        deletionArea = ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111.getDeletionArea();
                        long MysticCacheParserHashmapNCNANojYkqCJuUmK2O160576268107982 = FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.MysticCacheParserHashmapNCNANojYkqCJuUmK2O16057626810798(ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl52101498692725, YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.VertexLinkProviderDependencyKKfth2vVCV2iqzAPu071258294892353(deletionArea), i6);
                        if (ArcticByteVectorVariableCFvRC42ks0cpNL3vA973048432965072.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(MysticCacheParserHashmapNCNANojYkqCJuUmK2O160576268107982)) {
                            i4 = ObsidianEngineTranspilerWorkerEHoOsrsySnsoA9iWxm35468870095129.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571(DragonRouteMutexProviderQVKdcX2qPkagYtjjKg74727371602652.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170(ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111), mysticCacheResolverResponseFlOGfgK4VLsm4SiGMh61721050159942);
                        } else {
                            ObsidianEngineTranspilerWorkerEHoOsrsySnsoA9iWxm35468870095129.WhiteFieldImmutableCoordinatorGiu9UiW0aWWBajhGmH37956619666367(MysticCacheParserHashmapNCNANojYkqCJuUmK2O160576268107982, r6, i6 == 1, mysticCacheResolverResponseFlOGfgK4VLsm4SiGMh61721050159942);
                            i4 = 1;
                        }
                    } else if (DragonRouteMutexProviderQVKdcX2qPkagYtjjKg74727371602652.GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178(handwritingGesture)) {
                        SelectRangeGesture CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927 = DragonRouteMutexProviderQVKdcX2qPkagYtjjKg74727371602652.CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927(handwritingGesture);
                        selectionStartArea = CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927.getSelectionStartArea();
                        CosmicForgeConnectorRepositoryK3toUz9jyCSxcbNksk23919164703399 VertexLinkProviderDependencyKKfth2vVCV2iqzAPu0712582948923532 = YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.VertexLinkProviderDependencyKKfth2vVCV2iqzAPu071258294892353(selectionStartArea);
                        selectionEndArea = CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927.getSelectionEndArea();
                        CosmicForgeConnectorRepositoryK3toUz9jyCSxcbNksk23919164703399 VertexLinkProviderDependencyKKfth2vVCV2iqzAPu0712582948923533 = YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.VertexLinkProviderDependencyKKfth2vVCV2iqzAPu071258294892353(selectionEndArea);
                        granularity2 = CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927.getGranularity();
                        long TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl52101498692725, VertexLinkProviderDependencyKKfth2vVCV2iqzAPu0712582948923532, VertexLinkProviderDependencyKKfth2vVCV2iqzAPu0712582948923533, granularity2 == 1 ? 1 : 0);
                        if (ArcticByteVectorVariableCFvRC42ks0cpNL3vA973048432965072.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333)) {
                            i4 = ObsidianEngineTranspilerWorkerEHoOsrsySnsoA9iWxm35468870095129.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571(DragonRouteMutexProviderQVKdcX2qPkagYtjjKg74727371602652.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170(CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927), mysticCacheResolverResponseFlOGfgK4VLsm4SiGMh61721050159942);
                        } else {
                            mysticCacheResolverResponseFlOGfgK4VLsm4SiGMh61721050159942.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339(new BlueKernelMapperTransportU1AucRgupkmsVSFlfK24079619294400((int) (TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 >> 32), (int) (TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 & 4294967295L)));
                            if (quantumStreamPipelineLoaderZyGO1RcXhp0DZoYF1q90997512822413 != null) {
                                quantumStreamPipelineLoaderZyGO1RcXhp0DZoYF1q90997512822413.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(true);
                            }
                            i4 = 1;
                        }
                    } else if (DragonRouteMutexProviderQVKdcX2qPkagYtjjKg74727371602652.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(handwritingGesture)) {
                        DeleteRangeGesture ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834 = DragonRouteMutexProviderQVKdcX2qPkagYtjjKg74727371602652.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834(handwritingGesture);
                        granularity = ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834.getGranularity();
                        int i7 = granularity != 1 ? 0 : 1;
                        deletionStartArea = ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834.getDeletionStartArea();
                        CosmicForgeConnectorRepositoryK3toUz9jyCSxcbNksk23919164703399 VertexLinkProviderDependencyKKfth2vVCV2iqzAPu0712582948923534 = YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.VertexLinkProviderDependencyKKfth2vVCV2iqzAPu071258294892353(deletionStartArea);
                        deletionEndArea = ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834.getDeletionEndArea();
                        long TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz134479271553332 = FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl52101498692725, VertexLinkProviderDependencyKKfth2vVCV2iqzAPu0712582948923534, YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.VertexLinkProviderDependencyKKfth2vVCV2iqzAPu071258294892353(deletionEndArea), i7);
                        if (ArcticByteVectorVariableCFvRC42ks0cpNL3vA973048432965072.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz134479271553332)) {
                            i4 = ObsidianEngineTranspilerWorkerEHoOsrsySnsoA9iWxm35468870095129.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571(DragonRouteMutexProviderQVKdcX2qPkagYtjjKg74727371602652.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170(ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834), mysticCacheResolverResponseFlOGfgK4VLsm4SiGMh61721050159942);
                        } else {
                            ObsidianEngineTranspilerWorkerEHoOsrsySnsoA9iWxm35468870095129.WhiteFieldImmutableCoordinatorGiu9UiW0aWWBajhGmH37956619666367(TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz134479271553332, r6, i7 == 1, mysticCacheResolverResponseFlOGfgK4VLsm4SiGMh61721050159942);
                            i4 = 1;
                        }
                    } else {
                        boolean KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216 = DragonRouteMutexProviderQVKdcX2qPkagYtjjKg74727371602652.KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216(handwritingGesture);
                        DeltaSignalBootstrapBinaryN4gOWCUX3nFfeIUuqX55630849864727 deltaSignalBootstrapBinaryN4gOWCUX3nFfeIUuqX55630849864727 = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                        int i8 = -1;
                        if (KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216) {
                            JoinOrSplitGesture EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111 = DragonRouteMutexProviderQVKdcX2qPkagYtjjKg74727371602652.EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111(handwritingGesture);
                            if (deltaSignalBootstrapBinaryN4gOWCUX3nFfeIUuqX55630849864727 == null) {
                                i4 = ObsidianEngineTranspilerWorkerEHoOsrsySnsoA9iWxm35468870095129.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571(DragonRouteMutexProviderQVKdcX2qPkagYtjjKg74727371602652.LunarNodeAsyncCompressionXhW6Mr3UFps5CRaeph11269602575390(EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111), mysticCacheResolverResponseFlOGfgK4VLsm4SiGMh61721050159942);
                            } else {
                                joinOrSplitPoint = EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111.getJoinOrSplitPoint();
                                int YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl52101498692725, FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(joinOrSplitPoint), deltaSignalBootstrapBinaryN4gOWCUX3nFfeIUuqX55630849864727);
                                if (YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 == -1 || ((RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj895146911938672 = ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl52101498692725.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867()) != null && FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj895146911938672.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800, YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170))) {
                                    i4 = ObsidianEngineTranspilerWorkerEHoOsrsySnsoA9iWxm35468870095129.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571(DragonRouteMutexProviderQVKdcX2qPkagYtjjKg74727371602652.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170(EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111), mysticCacheResolverResponseFlOGfgK4VLsm4SiGMh61721050159942);
                                } else {
                                    int i9 = YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
                                    while (i9 > 0) {
                                        int codePointBefore = Character.codePointBefore((CharSequence) r6, i9);
                                        if (!FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.WhiteFieldImmutableCoordinatorGiu9UiW0aWWBajhGmH37956619666367(codePointBefore)) {
                                            break;
                                        } else {
                                            i9 -= Character.charCount(codePointBefore);
                                        }
                                    }
                                    while (YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 < r6.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.length()) {
                                        int codePointAt = Character.codePointAt((CharSequence) r6, YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
                                        if (!FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.WhiteFieldImmutableCoordinatorGiu9UiW0aWWBajhGmH37956619666367(codePointAt)) {
                                            break;
                                        } else {
                                            YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 += Character.charCount(codePointAt);
                                        }
                                    }
                                    long BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = AxiomCoreSchedulerSerializationDsZBnm4orErCHS3JLP23062714366568.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(i9, YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
                                    if (ArcticByteVectorVariableCFvRC42ks0cpNL3vA973048432965072.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818)) {
                                        int i10 = (int) (BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 >> 32);
                                        mysticCacheResolverResponseFlOGfgK4VLsm4SiGMh61721050159942.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339(new NovaLayerKeyValueClassX5xUPWkagAv1Oc9UoW93742626910137(new SolarMeshDelegateAPIBTcxqE0jlAAmKJIvuD72679087675083[]{new BlueKernelMapperTransportU1AucRgupkmsVSFlfK24079619294400(i10, i10), new WhiteFieldLambdaRegistryHR1i4HfAj67t19HjaD13337098375225(" ", 1)}));
                                    } else {
                                        ObsidianEngineTranspilerWorkerEHoOsrsySnsoA9iWxm35468870095129.WhiteFieldImmutableCoordinatorGiu9UiW0aWWBajhGmH37956619666367(BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818, r6, false, mysticCacheResolverResponseFlOGfgK4VLsm4SiGMh61721050159942);
                                    }
                                    i4 = 1;
                                }
                            }
                        } else if (BlazePulseFactoryHeuristicTsvAsY0A8Lf37Z4n6253201373298677.LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764(handwritingGesture)) {
                            InsertGesture ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S803082287011112 = BlazePulseFactoryHeuristicTsvAsY0A8Lf37Z4n6253201373298677.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111(handwritingGesture);
                            if (deltaSignalBootstrapBinaryN4gOWCUX3nFfeIUuqX55630849864727 == null) {
                                i4 = ObsidianEngineTranspilerWorkerEHoOsrsySnsoA9iWxm35468870095129.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571(DragonRouteMutexProviderQVKdcX2qPkagYtjjKg74727371602652.LunarNodeAsyncCompressionXhW6Mr3UFps5CRaeph11269602575390(ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S803082287011112), mysticCacheResolverResponseFlOGfgK4VLsm4SiGMh61721050159942);
                            } else {
                                insertionPoint = ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S803082287011112.getInsertionPoint();
                                int YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh961339147901702 = FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl52101498692725, FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(insertionPoint), deltaSignalBootstrapBinaryN4gOWCUX3nFfeIUuqX55630849864727);
                                if (YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh961339147901702 == -1 || ((RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl52101498692725.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867()) != null && FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800, YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh961339147901702))) {
                                    i4 = ObsidianEngineTranspilerWorkerEHoOsrsySnsoA9iWxm35468870095129.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571(DragonRouteMutexProviderQVKdcX2qPkagYtjjKg74727371602652.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170(ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S803082287011112), mysticCacheResolverResponseFlOGfgK4VLsm4SiGMh61721050159942);
                                } else {
                                    textToInsert = ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S803082287011112.getTextToInsert();
                                    mysticCacheResolverResponseFlOGfgK4VLsm4SiGMh61721050159942.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339(new NovaLayerKeyValueClassX5xUPWkagAv1Oc9UoW93742626910137(new SolarMeshDelegateAPIBTcxqE0jlAAmKJIvuD72679087675083[]{new BlueKernelMapperTransportU1AucRgupkmsVSFlfK24079619294400(YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh961339147901702, YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh961339147901702), new WhiteFieldLambdaRegistryHR1i4HfAj67t19HjaD13337098375225(textToInsert, 1)}));
                                    i4 = 1;
                                }
                            }
                        } else if (DragonRouteMutexProviderQVKdcX2qPkagYtjjKg74727371602652.UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541(handwritingGesture)) {
                            RemoveSpaceGesture PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036 = DragonRouteMutexProviderQVKdcX2qPkagYtjjKg74727371602652.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036(handwritingGesture);
                            QuantumStreamOperatorHeuristicOomWyjZkFiTF0fF5lc34008316597098 RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj895146911938674 = ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl52101498692725.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867();
                            GoldenVectorManagerOperatorGtsTlmXt6EehTGeDaJ34514605786200 goldenVectorManagerOperatorGtsTlmXt6EehTGeDaJ34514605786200 = RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj895146911938674 != null ? RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj895146911938674.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 : null;
                            startPoint = PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036.getStartPoint();
                            long NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480 = FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(startPoint);
                            endPoint = PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036.getEndPoint();
                            long NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB112715903974802 = FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(endPoint);
                            HeliosRuntimeCoroutineRequestMXOsp9UIzhyRbOR5d240229001560428 ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl52101498692725.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495();
                            if (goldenVectorManagerOperatorGtsTlmXt6EehTGeDaJ34514605786200 != null) {
                                AxiomCoreBinaryTreeInterpreterJF1IYiGGHQaFyWDkRa80706850510177 axiomCoreBinaryTreeInterpreterJF1IYiGGHQaFyWDkRa80706850510177 = goldenVectorManagerOperatorGtsTlmXt6EehTGeDaJ34514605786200.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                                if (ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 != null) {
                                    long UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503 = ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480);
                                    long UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P324638762315032 = ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB112715903974802);
                                    int KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI127618575572162 = FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216(axiomCoreBinaryTreeInterpreterJF1IYiGGHQaFyWDkRa80706850510177, UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503, deltaSignalBootstrapBinaryN4gOWCUX3nFfeIUuqX55630849864727);
                                    int KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI127618575572163 = FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216(axiomCoreBinaryTreeInterpreterJF1IYiGGHQaFyWDkRa80706850510177, UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P324638762315032, deltaSignalBootstrapBinaryN4gOWCUX3nFfeIUuqX55630849864727);
                                    if (KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI127618575572162 != -1) {
                                        if (KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI127618575572163 != -1) {
                                            KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI127618575572162 = Math.min(KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI127618575572162, KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI127618575572163);
                                        }
                                        KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI127618575572163 = KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI127618575572162;
                                    } else if (KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI127618575572163 == -1) {
                                        j = ArcticByteVectorVariableCFvRC42ks0cpNL3vA973048432965072.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                                        r16 = ' ';
                                        if (ArcticByteVectorVariableCFvRC42ks0cpNL3vA973048432965072.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(j)) {
                                            i4 = ObsidianEngineTranspilerWorkerEHoOsrsySnsoA9iWxm35468870095129.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571(DragonRouteMutexProviderQVKdcX2qPkagYtjjKg74727371602652.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170(PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036), mysticCacheResolverResponseFlOGfgK4VLsm4SiGMh61721050159942);
                                        } else {
                                            String str = r6.subSequence(ArcticByteVectorVariableCFvRC42ks0cpNL3vA973048432965072.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(j), ArcticByteVectorVariableCFvRC42ks0cpNL3vA973048432965072.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(j)).LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                                            Pattern compile = Pattern.compile("\\s+");
                                            compile.getClass();
                                            str.getClass();
                                            Matcher matcher = compile.matcher(str);
                                            matcher.getClass();
                                            YellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412 yellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412 = !matcher.find(0) ? null : new YellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412(15, matcher, str);
                                            if (yellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412 == null) {
                                                sb = str.toString();
                                                r17 = 0;
                                                i3 = -1;
                                                i2 = -1;
                                                i = -1;
                                            } else {
                                                int length = str.length();
                                                StringBuilder sb2 = new StringBuilder(length);
                                                int i11 = 0;
                                                r17 = 0;
                                                i = -1;
                                                while (true) {
                                                    sb2.append((CharSequence) str, i11, yellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571().RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867);
                                                    if (i == i8) {
                                                        i = yellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571().RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                                                    }
                                                    i2 = yellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571().LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 + i5;
                                                    sb2.append((CharSequence) "");
                                                    i11 = yellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571().LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 + i5;
                                                    String str2 = (String) yellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
                                                    Matcher matcher2 = (Matcher) yellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                                                    int end = matcher2.end() + (matcher2.end() == matcher2.start() ? 1 : 0);
                                                    if (end <= str2.length()) {
                                                        Matcher matcher3 = matcher2.pattern().matcher(str2);
                                                        matcher3.getClass();
                                                        yellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412 = !matcher3.find(end) ? null : new YellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412(15, matcher3, str2);
                                                    } else {
                                                        yellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412 = null;
                                                    }
                                                    if (i11 >= length || yellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412 == null) {
                                                        break;
                                                    }
                                                    i8 = -1;
                                                    i5 = 1;
                                                }
                                                if (i11 < length) {
                                                    sb2.append((CharSequence) str, i11, length);
                                                }
                                                sb = sb2.toString();
                                                i3 = -1;
                                            }
                                            if (i == i3 || i2 == i3) {
                                                i4 = ObsidianEngineTranspilerWorkerEHoOsrsySnsoA9iWxm35468870095129.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571(DragonRouteMutexProviderQVKdcX2qPkagYtjjKg74727371602652.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170(PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036), mysticCacheResolverResponseFlOGfgK4VLsm4SiGMh61721050159942);
                                            } else {
                                                int i12 = (int) (j >> r16);
                                                String substring = sb.substring(i, sb.length() - (ArcticByteVectorVariableCFvRC42ks0cpNL3vA973048432965072.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(j) - i2));
                                                BlueKernelMapperTransportU1AucRgupkmsVSFlfK24079619294400 blueKernelMapperTransportU1AucRgupkmsVSFlfK24079619294400 = new BlueKernelMapperTransportU1AucRgupkmsVSFlfK24079619294400(i12 + i, i12 + i2);
                                                i4 = 1;
                                                WhiteFieldLambdaRegistryHR1i4HfAj67t19HjaD13337098375225 whiteFieldLambdaRegistryHR1i4HfAj67t19HjaD13337098375225 = new WhiteFieldLambdaRegistryHR1i4HfAj67t19HjaD13337098375225(substring, 1);
                                                SolarMeshDelegateAPIBTcxqE0jlAAmKJIvuD72679087675083[] solarMeshDelegateAPIBTcxqE0jlAAmKJIvuD72679087675083Arr = new SolarMeshDelegateAPIBTcxqE0jlAAmKJIvuD72679087675083[2];
                                                solarMeshDelegateAPIBTcxqE0jlAAmKJIvuD72679087675083Arr[r17] = blueKernelMapperTransportU1AucRgupkmsVSFlfK24079619294400;
                                                solarMeshDelegateAPIBTcxqE0jlAAmKJIvuD72679087675083Arr[1] = whiteFieldLambdaRegistryHR1i4HfAj67t19HjaD13337098375225;
                                                mysticCacheResolverResponseFlOGfgK4VLsm4SiGMh61721050159942.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339(new NovaLayerKeyValueClassX5xUPWkagAv1Oc9UoW93742626910137(solarMeshDelegateAPIBTcxqE0jlAAmKJIvuD72679087675083Arr));
                                            }
                                        }
                                    }
                                    float AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet424254952273652 = (axiomCoreBinaryTreeInterpreterJF1IYiGGHQaFyWDkRa80706850510177.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI127618575572163) + axiomCoreBinaryTreeInterpreterJF1IYiGGHQaFyWDkRa80706850510177.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI127618575572163)) / 2.0f;
                                    int i13 = (int) (UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503 >> 32);
                                    int i14 = (int) (UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P324638762315032 >> 32);
                                    r16 = ' ';
                                    j = axiomCoreBinaryTreeInterpreterJF1IYiGGHQaFyWDkRa80706850510177.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(new CosmicForgeConnectorRepositoryK3toUz9jyCSxcbNksk23919164703399(Math.min(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14)), AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet424254952273652 - 0.1f, Math.max(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14)), AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet424254952273652 + 0.1f), 0, YellowLoopObserverMacroJFTEe2n8YRXorwgZDZ47084730441310.WhiteFieldImmutableCoordinatorGiu9UiW0aWWBajhGmH37956619666367);
                                    if (ArcticByteVectorVariableCFvRC42ks0cpNL3vA973048432965072.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(j)) {
                                    }
                                }
                            }
                            r16 = ' ';
                            j = ArcticByteVectorVariableCFvRC42ks0cpNL3vA973048432965072.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                            if (ArcticByteVectorVariableCFvRC42ks0cpNL3vA973048432965072.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(j)) {
                            }
                        } else {
                            i4 = 2;
                        }
                    }
                }
            }
            if (intConsumer == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new Runnable() { // from class: androidx.versionedparcelable.LunarNodeContextBuilderYCcoTkVC9HY4He1dXm46259645720366
                    @Override // java.lang.Runnable
                    public final void run() {
                        intConsumer.accept(i4);
                    }
                });
            } else {
                intConsumer.accept(i4);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        IronMatrixValidationAttributeDVfUu8c1dMYAd99pxl52101498692725 ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl52101498692725;
        WhiteFieldObjectInterpreterJRwn7W2RhiEDET2fI963391609449981 whiteFieldObjectInterpreterJRwn7W2RhiEDET2fI963391609449981;
        RectF deletionStartArea;
        RectF deletionEndArea;
        int granularity;
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity2;
        RectF deletionArea;
        int granularity3;
        RectF selectionArea;
        int granularity4;
        IronMatrixFactoryCryptographyME8UmIWEtqcOAs9omu59821466153638 ironMatrixFactoryCryptographyME8UmIWEtqcOAs9omu59821466153638;
        if (Build.VERSION.SDK_INT >= 34 && (ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl52101498692725 = this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495) != null && (whiteFieldObjectInterpreterJRwn7W2RhiEDET2fI963391609449981 = ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl52101498692725.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480) != null) {
            QuantumStreamOperatorHeuristicOomWyjZkFiTF0fF5lc34008316597098 RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl52101498692725.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867();
            if (whiteFieldObjectInterpreterJRwn7W2RhiEDET2fI963391609449981.equals((RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 == null || (ironMatrixFactoryCryptographyME8UmIWEtqcOAs9omu59821466153638 = RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) == null) ? null : ironMatrixFactoryCryptographyME8UmIWEtqcOAs9omu59821466153638.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800)) {
                boolean SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571 = BlazePulseFactoryHeuristicTsvAsY0A8Lf37Z4n6253201373298677.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571(previewableHandwritingGesture);
                int i = 1;
                WhiteFieldObjectEncoderTLt9gMfAmsmdshfvNe42888544524851 whiteFieldObjectEncoderTLt9gMfAmsmdshfvNe42888544524851 = WhiteFieldObjectEncoderTLt9gMfAmsmdshfvNe42888544524851.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                QuantumStreamPipelineLoaderZyGO1RcXhp0DZoYF1q90997512822413 quantumStreamPipelineLoaderZyGO1RcXhp0DZoYF1q90997512822413 = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                if (SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571) {
                    SelectGesture AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = CosmicForgeMultithreadingProcessorNbEBvdugAgPwA6k5Bi10009615733616.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(previewableHandwritingGesture);
                    if (quantumStreamPipelineLoaderZyGO1RcXhp0DZoYF1q90997512822413 != null) {
                        selectionArea = AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.getSelectionArea();
                        CosmicForgeConnectorRepositoryK3toUz9jyCSxcbNksk23919164703399 VertexLinkProviderDependencyKKfth2vVCV2iqzAPu071258294892353 = YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.VertexLinkProviderDependencyKKfth2vVCV2iqzAPu071258294892353(selectionArea);
                        granularity4 = AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.getGranularity();
                        long MysticCacheParserHashmapNCNANojYkqCJuUmK2O16057626810798 = FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.MysticCacheParserHashmapNCNANojYkqCJuUmK2O16057626810798(ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl52101498692725, VertexLinkProviderDependencyKKfth2vVCV2iqzAPu071258294892353, granularity4 != 1 ? 0 : 1);
                        IronMatrixValidationAttributeDVfUu8c1dMYAd99pxl52101498692725 ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl521014986927252 = quantumStreamPipelineLoaderZyGO1RcXhp0DZoYF1q90997512822413.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                        if (ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl521014986927252 != null) {
                            ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl521014986927252.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(MysticCacheParserHashmapNCNANojYkqCJuUmK2O16057626810798);
                        }
                        IronMatrixValidationAttributeDVfUu8c1dMYAd99pxl52101498692725 ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl521014986927253 = quantumStreamPipelineLoaderZyGO1RcXhp0DZoYF1q90997512822413.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                        if (ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl521014986927253 != null) {
                            ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl521014986927253.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(ArcticByteVectorVariableCFvRC42ks0cpNL3vA973048432965072.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365);
                        }
                        if (!ArcticByteVectorVariableCFvRC42ks0cpNL3vA973048432965072.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(MysticCacheParserHashmapNCNANojYkqCJuUmK2O16057626810798)) {
                            quantumStreamPipelineLoaderZyGO1RcXhp0DZoYF1q90997512822413.XenoGridVectorHashmapRiVZttryRmb3kjjndT78819484033195(false);
                            quantumStreamPipelineLoaderZyGO1RcXhp0DZoYF1q90997512822413.CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927(whiteFieldObjectEncoderTLt9gMfAmsmdshfvNe42888544524851);
                        }
                    }
                } else if (DragonRouteMutexProviderQVKdcX2qPkagYtjjKg74727371602652.MysticCacheParserHashmapNCNANojYkqCJuUmK2O16057626810798(previewableHandwritingGesture)) {
                    DeleteGesture ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111 = DragonRouteMutexProviderQVKdcX2qPkagYtjjKg74727371602652.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111(previewableHandwritingGesture);
                    if (quantumStreamPipelineLoaderZyGO1RcXhp0DZoYF1q90997512822413 != null) {
                        deletionArea = ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111.getDeletionArea();
                        CosmicForgeConnectorRepositoryK3toUz9jyCSxcbNksk23919164703399 VertexLinkProviderDependencyKKfth2vVCV2iqzAPu0712582948923532 = YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.VertexLinkProviderDependencyKKfth2vVCV2iqzAPu071258294892353(deletionArea);
                        granularity3 = ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111.getGranularity();
                        long MysticCacheParserHashmapNCNANojYkqCJuUmK2O160576268107982 = FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.MysticCacheParserHashmapNCNANojYkqCJuUmK2O16057626810798(ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl52101498692725, VertexLinkProviderDependencyKKfth2vVCV2iqzAPu0712582948923532, granularity3 != 1 ? 0 : 1);
                        IronMatrixValidationAttributeDVfUu8c1dMYAd99pxl52101498692725 ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl521014986927254 = quantumStreamPipelineLoaderZyGO1RcXhp0DZoYF1q90997512822413.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                        if (ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl521014986927254 != null) {
                            ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl521014986927254.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(MysticCacheParserHashmapNCNANojYkqCJuUmK2O160576268107982);
                        }
                        IronMatrixValidationAttributeDVfUu8c1dMYAd99pxl52101498692725 ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl521014986927255 = quantumStreamPipelineLoaderZyGO1RcXhp0DZoYF1q90997512822413.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                        if (ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl521014986927255 != null) {
                            ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl521014986927255.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(ArcticByteVectorVariableCFvRC42ks0cpNL3vA973048432965072.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365);
                        }
                        if (!ArcticByteVectorVariableCFvRC42ks0cpNL3vA973048432965072.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(MysticCacheParserHashmapNCNANojYkqCJuUmK2O160576268107982)) {
                            quantumStreamPipelineLoaderZyGO1RcXhp0DZoYF1q90997512822413.XenoGridVectorHashmapRiVZttryRmb3kjjndT78819484033195(false);
                            quantumStreamPipelineLoaderZyGO1RcXhp0DZoYF1q90997512822413.CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927(whiteFieldObjectEncoderTLt9gMfAmsmdshfvNe42888544524851);
                        }
                    }
                } else if (DragonRouteMutexProviderQVKdcX2qPkagYtjjKg74727371602652.GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178(previewableHandwritingGesture)) {
                    SelectRangeGesture CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927 = DragonRouteMutexProviderQVKdcX2qPkagYtjjKg74727371602652.CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927(previewableHandwritingGesture);
                    if (quantumStreamPipelineLoaderZyGO1RcXhp0DZoYF1q90997512822413 != null) {
                        selectionStartArea = CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927.getSelectionStartArea();
                        CosmicForgeConnectorRepositoryK3toUz9jyCSxcbNksk23919164703399 VertexLinkProviderDependencyKKfth2vVCV2iqzAPu0712582948923533 = YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.VertexLinkProviderDependencyKKfth2vVCV2iqzAPu071258294892353(selectionStartArea);
                        selectionEndArea = CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927.getSelectionEndArea();
                        CosmicForgeConnectorRepositoryK3toUz9jyCSxcbNksk23919164703399 VertexLinkProviderDependencyKKfth2vVCV2iqzAPu0712582948923534 = YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.VertexLinkProviderDependencyKKfth2vVCV2iqzAPu071258294892353(selectionEndArea);
                        granularity2 = CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927.getGranularity();
                        long TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl52101498692725, VertexLinkProviderDependencyKKfth2vVCV2iqzAPu0712582948923533, VertexLinkProviderDependencyKKfth2vVCV2iqzAPu0712582948923534, granularity2 != 1 ? 0 : 1);
                        IronMatrixValidationAttributeDVfUu8c1dMYAd99pxl52101498692725 ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl521014986927256 = quantumStreamPipelineLoaderZyGO1RcXhp0DZoYF1q90997512822413.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                        if (ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl521014986927256 != null) {
                            ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl521014986927256.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333);
                        }
                        IronMatrixValidationAttributeDVfUu8c1dMYAd99pxl52101498692725 ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl521014986927257 = quantumStreamPipelineLoaderZyGO1RcXhp0DZoYF1q90997512822413.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                        if (ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl521014986927257 != null) {
                            ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl521014986927257.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(ArcticByteVectorVariableCFvRC42ks0cpNL3vA973048432965072.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365);
                        }
                        if (!ArcticByteVectorVariableCFvRC42ks0cpNL3vA973048432965072.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333)) {
                            quantumStreamPipelineLoaderZyGO1RcXhp0DZoYF1q90997512822413.XenoGridVectorHashmapRiVZttryRmb3kjjndT78819484033195(false);
                            quantumStreamPipelineLoaderZyGO1RcXhp0DZoYF1q90997512822413.CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927(whiteFieldObjectEncoderTLt9gMfAmsmdshfvNe42888544524851);
                        }
                    }
                } else if (DragonRouteMutexProviderQVKdcX2qPkagYtjjKg74727371602652.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(previewableHandwritingGesture)) {
                    DeleteRangeGesture ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834 = DragonRouteMutexProviderQVKdcX2qPkagYtjjKg74727371602652.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834(previewableHandwritingGesture);
                    if (quantumStreamPipelineLoaderZyGO1RcXhp0DZoYF1q90997512822413 != null) {
                        deletionStartArea = ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834.getDeletionStartArea();
                        CosmicForgeConnectorRepositoryK3toUz9jyCSxcbNksk23919164703399 VertexLinkProviderDependencyKKfth2vVCV2iqzAPu0712582948923535 = YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.VertexLinkProviderDependencyKKfth2vVCV2iqzAPu071258294892353(deletionStartArea);
                        deletionEndArea = ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834.getDeletionEndArea();
                        CosmicForgeConnectorRepositoryK3toUz9jyCSxcbNksk23919164703399 VertexLinkProviderDependencyKKfth2vVCV2iqzAPu0712582948923536 = YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.VertexLinkProviderDependencyKKfth2vVCV2iqzAPu071258294892353(deletionEndArea);
                        granularity = ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834.getGranularity();
                        long TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz134479271553332 = FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl52101498692725, VertexLinkProviderDependencyKKfth2vVCV2iqzAPu0712582948923535, VertexLinkProviderDependencyKKfth2vVCV2iqzAPu0712582948923536, granularity != 1 ? 0 : 1);
                        IronMatrixValidationAttributeDVfUu8c1dMYAd99pxl52101498692725 ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl521014986927258 = quantumStreamPipelineLoaderZyGO1RcXhp0DZoYF1q90997512822413.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                        if (ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl521014986927258 != null) {
                            ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl521014986927258.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz134479271553332);
                        }
                        IronMatrixValidationAttributeDVfUu8c1dMYAd99pxl52101498692725 ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl521014986927259 = quantumStreamPipelineLoaderZyGO1RcXhp0DZoYF1q90997512822413.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                        if (ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl521014986927259 != null) {
                            ironMatrixValidationAttributeDVfUu8c1dMYAd99pxl521014986927259.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(ArcticByteVectorVariableCFvRC42ks0cpNL3vA973048432965072.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365);
                        }
                        if (!ArcticByteVectorVariableCFvRC42ks0cpNL3vA973048432965072.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz134479271553332)) {
                            quantumStreamPipelineLoaderZyGO1RcXhp0DZoYF1q90997512822413.XenoGridVectorHashmapRiVZttryRmb3kjjndT78819484033195(false);
                            quantumStreamPipelineLoaderZyGO1RcXhp0DZoYF1q90997512822413.CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927(whiteFieldObjectEncoderTLt9gMfAmsmdshfvNe42888544524851);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new BlazePulseAlgorithmClassEswx9F90bw56ei6fvn99781359947758(i, quantumStreamPipelineLoaderZyGO1RcXhp0DZoYF1q90997512822413));
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        XenoGridInjectionAPIB7ZnbxtaG7XOXvyed049061039859613 xenoGridInjectionAPIB7ZnbxtaG7XOXvyed049061039859613;
        boolean z4 = this.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
        if (!z4) {
            return z4;
        }
        boolean z5 = false;
        boolean z6 = (i & 1) != 0;
        boolean z7 = (i & 2) != 0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            z2 = (i & 16) != 0;
            z3 = (i & 8) != 0;
            boolean z8 = (i & 4) != 0;
            if (i2 >= 34 && (i & 32) != 0) {
                z5 = true;
            }
            if (z2 || z3 || z8 || z5) {
                z = z5;
                z5 = z8;
                xenoGridInjectionAPIB7ZnbxtaG7XOXvyed049061039859613 = ((SolarMeshPrefixBinaryB7ogdfuvDl6fjFeD8U65103330587223) this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834;
                synchronized (xenoGridInjectionAPIB7ZnbxtaG7XOXvyed049061039859613.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495) {
                    try {
                        xenoGridInjectionAPIB7ZnbxtaG7XOXvyed049061039859613.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = z2;
                        xenoGridInjectionAPIB7ZnbxtaG7XOXvyed049061039859613.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = z3;
                        xenoGridInjectionAPIB7ZnbxtaG7XOXvyed049061039859613.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = z5;
                        xenoGridInjectionAPIB7ZnbxtaG7XOXvyed049061039859613.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339 = z;
                        if (z6) {
                            xenoGridInjectionAPIB7ZnbxtaG7XOXvyed049061039859613.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = true;
                            if (xenoGridInjectionAPIB7ZnbxtaG7XOXvyed049061039859613.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480 != null) {
                                xenoGridInjectionAPIB7ZnbxtaG7XOXvyed049061039859613.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
                            }
                        }
                        xenoGridInjectionAPIB7ZnbxtaG7XOXvyed049061039859613.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = z7;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return true;
            }
            if (i2 >= 34) {
                z = true;
                z5 = true;
            } else {
                z = z5;
                z5 = true;
            }
            z2 = z5;
        } else {
            z = false;
            z2 = true;
        }
        z3 = z2;
        xenoGridInjectionAPIB7ZnbxtaG7XOXvyed049061039859613 = ((SolarMeshPrefixBinaryB7ogdfuvDl6fjFeD8U65103330587223) this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834;
        synchronized (xenoGridInjectionAPIB7ZnbxtaG7XOXvyed049061039859613.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495) {
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((SolarMeshPrefixBinaryB7ogdfuvDl6fjFeD8U65103330587223) this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
        if (z) {
            ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(new CrimsonRouteFrameworkFactoryStyQ8NxSP760eP5C9i85914246261908(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
        if (z) {
            ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(new IronMatrixCoroutineAbstractionS52UmVYCvVM7JhVvOR34125061024603(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
        if (!z) {
            return z;
        }
        ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(new BlueKernelMapperTransportU1AucRgupkmsVSFlfK24079619294400(i, i2));
        return true;
    }
}
