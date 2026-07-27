package androidx.versionedparcelable;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import com.android.installreferrer.api.InstallReferrerClient;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class TitanCloudExecutorAdapterJjR6hcceUOldFVn2oB97581200010760 implements InputConnection {
    public int ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
    public final boolean AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public int LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final WhiteFieldClosureVectorV90NGNIy3LMp3zZnTJ72513326892253 ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
    public RapidLogicSubroutineSubroutineTmaNK3omQFedqzHEyr99497266732760 RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public boolean YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
    public final ArrayList TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = new ArrayList();
    public boolean BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = true;

    public TitanCloudExecutorAdapterJjR6hcceUOldFVn2oB97581200010760(RapidLogicSubroutineSubroutineTmaNK3omQFedqzHEyr99497266732760 rapidLogicSubroutineSubroutineTmaNK3omQFedqzHEyr99497266732760, WhiteFieldClosureVectorV90NGNIy3LMp3zZnTJ72513326892253 whiteFieldClosureVectorV90NGNIy3LMp3zZnTJ72513326892253, boolean z) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = whiteFieldClosureVectorV90NGNIy3LMp3zZnTJ72513326892253;
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = z;
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = rapidLogicSubroutineSubroutineTmaNK3omQFedqzHEyr99497266732760;
    }

    public final void ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    public final boolean AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365() {
        int i = this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 - 1;
        this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = i;
        if (i == 0) {
            ArrayList arrayList = this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
            if (!arrayList.isEmpty()) {
                ((VertexLinkPacketInheritanceQwOMUR6KbY5fsby7fU28687939568592) this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 > 0;
    }

    public final void ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(SolarMeshDelegateAPIBTcxqE0jlAAmKJIvuD72679087675083 solarMeshDelegateAPIBTcxqE0jlAAmKJIvuD72679087675083) {
        this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495++;
        try {
            this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.add(solarMeshDelegateAPIBTcxqE0jlAAmKJIvuD72679087675083);
        } finally {
            AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365();
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
        if (!z) {
            return z;
        }
        this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.clear();
        this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = 0;
        this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = false;
        ArrayList arrayList = ((VertexLinkPacketInheritanceQwOMUR6KbY5fsby7fU28687939568592) this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339;
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
        boolean z = this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
        return z ? this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
        if (z) {
            ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(new WhiteFieldLambdaRegistryHR1i4HfAj67t19HjaD13337098375225(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
        if (!z) {
            return z;
        }
        ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(new TitanCloudRepositoryJSONIRKRT4gC4dvOJE0PU697341501963659(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
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
        boolean z = this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
        if (!z) {
            return z;
        }
        ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(new CrimsonRouteProcessorVirtualizationUepAEuPo2VP8b9yKsl83476958356252());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        RapidLogicSubroutineSubroutineTmaNK3omQFedqzHEyr99497266732760 rapidLogicSubroutineSubroutineTmaNK3omQFedqzHEyr99497266732760 = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        return TextUtils.getCapsMode(rapidLogicSubroutineSubroutineTmaNK3omQFedqzHEyr99497266732760.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119, ArcticByteVectorVariableCFvRC42ks0cpNL3vA973048432965072.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(rapidLogicSubroutineSubroutineTmaNK3omQFedqzHEyr99497266732760.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = z;
        if (z) {
            this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return XenoGridProcessorProcessorNcBZZjQOb3tKNLhyLo99586204685692.XenoGridInheritanceEncoderLUWRDrGQFJijcNZ09l48202102995381(this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (ArcticByteVectorVariableCFvRC42ks0cpNL3vA973048432965072.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365)) {
            return null;
        }
        return QuantumStreamDecoderSchedulerZuSI41Fu32QAmywXDr40521088394502.MysticCacheParserHashmapNCNANojYkqCJuUmK2O16057626810798(this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867).LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return QuantumStreamDecoderSchedulerZuSI41Fu32QAmywXDr40521088394502.GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178(this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867, i).LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return QuantumStreamDecoderSchedulerZuSI41Fu32QAmywXDr40521088394502.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867, i).LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(new BlueKernelMapperTransportU1AucRgupkmsVSFlfK24079619294400(0, this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.length()));
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
        boolean z = this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
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
                ((VertexLinkPacketInheritanceQwOMUR6KbY5fsby7fU28687939568592) this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339(new IronMatrixOverloadingResourceC5d6WximJRfboBvK7163774202806087(i2));
            }
            i2 = 1;
            ((VertexLinkPacketInheritanceQwOMUR6KbY5fsby7fU28687939568592) this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339(new IronMatrixOverloadingResourceC5d6WximJRfboBvK7163774202806087(i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
        if (z) {
            return true;
        }
        return z;
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
        UltraBufferControllerInterpreterKkcnk8VhhOy7rMDjco96243563711651 ultraBufferControllerInterpreterKkcnk8VhhOy7rMDjco96243563711651;
        boolean z4 = this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
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
                ultraBufferControllerInterpreterKkcnk8VhhOy7rMDjco96243563711651 = ((VertexLinkPacketInheritanceQwOMUR6KbY5fsby7fU28687939568592) this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111;
                synchronized (ultraBufferControllerInterpreterKkcnk8VhhOy7rMDjco96243563711651.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495) {
                    try {
                        ultraBufferControllerInterpreterKkcnk8VhhOy7rMDjco96243563711651.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = z2;
                        ultraBufferControllerInterpreterKkcnk8VhhOy7rMDjco96243563711651.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = z3;
                        ultraBufferControllerInterpreterKkcnk8VhhOy7rMDjco96243563711651.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = z5;
                        ultraBufferControllerInterpreterKkcnk8VhhOy7rMDjco96243563711651.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339 = z;
                        if (z6) {
                            ultraBufferControllerInterpreterKkcnk8VhhOy7rMDjco96243563711651.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = true;
                            if (ultraBufferControllerInterpreterKkcnk8VhhOy7rMDjco96243563711651.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480 != null) {
                                ultraBufferControllerInterpreterKkcnk8VhhOy7rMDjco96243563711651.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
                            }
                        }
                        ultraBufferControllerInterpreterKkcnk8VhhOy7rMDjco96243563711651.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = z7;
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
        ultraBufferControllerInterpreterKkcnk8VhhOy7rMDjco96243563711651 = ((VertexLinkPacketInheritanceQwOMUR6KbY5fsby7fU28687939568592) this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111;
        synchronized (ultraBufferControllerInterpreterKkcnk8VhhOy7rMDjco96243563711651.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495) {
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((VertexLinkPacketInheritanceQwOMUR6KbY5fsby7fU28687939568592) this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
        if (z) {
            ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(new CrimsonRouteFrameworkFactoryStyQ8NxSP760eP5C9i85914246261908(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
        if (z) {
            ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(new IronMatrixCoroutineAbstractionS52UmVYCvVM7JhVvOR34125061024603(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
        if (!z) {
            return z;
        }
        ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(new BlueKernelMapperTransportU1AucRgupkmsVSFlfK24079619294400(i, i2));
        return true;
    }
}
