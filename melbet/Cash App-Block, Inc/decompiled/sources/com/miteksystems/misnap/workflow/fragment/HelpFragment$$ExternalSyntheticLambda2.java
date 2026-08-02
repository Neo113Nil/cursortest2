package com.miteksystems.misnap.workflow.fragment;

import androidx.compose.runtime.MutableState;
import androidx.navigation.NavDestination;
import androidx.navigation.NavHostController;
import com.fillr.e;
import com.google.mlkit.vision.text.zza;
import com.google.mlkit.vision.text.zzb;
import com.google.mlkit.vision.text.zzc;
import com.google.mlkit.vision.text.zzd;
import com.miteksystems.misnap.workflow.fragment.BarcodeAnalysisFragment;
import com.miteksystems.misnap.workflow.fragment.DocumentAnalysisFragment;
import com.miteksystems.misnap.workflow.fragment.FaceAnalysisFragment;
import com.miteksystems.misnap.workflow.fragment.HelpFragment;
import com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment;
import com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment;
import com.miteksystems.misnap.workflow.fragment.NfcReaderFragment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class HelpFragment$$ExternalSyntheticLambda2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ HelpFragment$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    public final void onDestinationChanged(NavHostController navHostController, NavDestination navDestination) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        Integer num8;
        Integer num9;
        Integer num10;
        Integer num11;
        Integer num12;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                HelpFragment helpFragment = (HelpFragment) obj;
                HelpFragment.Companion companion = HelpFragment.Companion;
                navDestination.getClass();
                if (!Intrinsics.areEqual(navDestination.label, helpFragment.b$2()) && !helpFragment.requireActivity().isChangingConfigurations() && (num = helpFragment.d) != null) {
                    helpFragment.requireActivity().setRequestedOrientation(num.intValue());
                    break;
                }
                break;
            case 1:
                BarcodeAnalysisFragment barcodeAnalysisFragment = (BarcodeAnalysisFragment) obj;
                BarcodeAnalysisFragment.Companion companion2 = BarcodeAnalysisFragment.Companion;
                navDestination.getClass();
                if (!Intrinsics.areEqual(navDestination.label, barcodeAnalysisFragment.a$1()) && !barcodeAnalysisFragment.requireActivity().isChangingConfigurations() && (num2 = barcodeAnalysisFragment.f) != null) {
                    barcodeAnalysisFragment.requireActivity().setRequestedOrientation(num2.intValue());
                    break;
                }
                break;
            case 2:
                DocumentAnalysisFragment documentAnalysisFragment = (DocumentAnalysisFragment) obj;
                DocumentAnalysisFragment.Companion companion3 = DocumentAnalysisFragment.Companion;
                navDestination.getClass();
                if (!Intrinsics.areEqual(navDestination.label, documentAnalysisFragment.a$2()) && !documentAnalysisFragment.requireActivity().isChangingConfigurations() && (num3 = documentAnalysisFragment.f) != null) {
                    documentAnalysisFragment.requireActivity().setRequestedOrientation(num3.intValue());
                    break;
                }
                break;
            case 3:
                FaceAnalysisFragment faceAnalysisFragment = (FaceAnalysisFragment) obj;
                FaceAnalysisFragment.Companion companion4 = FaceAnalysisFragment.Companion;
                navDestination.getClass();
                if (!Intrinsics.areEqual(navDestination.label, faceAnalysisFragment.b$1()) && !faceAnalysisFragment.requireActivity().isChangingConfigurations() && (num4 = faceAnalysisFragment.f) != null) {
                    faceAnalysisFragment.requireActivity().setRequestedOrientation(num4.intValue());
                    break;
                }
                break;
            case 4:
                FailoverFragment failoverFragment = (FailoverFragment) obj;
                zzc zzcVar = FailoverFragment.Companion;
                navDestination.getClass();
                if (!Intrinsics.areEqual(navDestination.label, failoverFragment.a$3()) && !failoverFragment.requireActivity().isChangingConfigurations() && (num5 = failoverFragment.d) != null) {
                    failoverFragment.requireActivity().setRequestedOrientation(num5.intValue());
                    break;
                }
                break;
            case 5:
                NfcMrz1LineManualEntryFragment nfcMrz1LineManualEntryFragment = (NfcMrz1LineManualEntryFragment) obj;
                NfcMrz1LineManualEntryFragment.Companion companion5 = NfcMrz1LineManualEntryFragment.Companion;
                navDestination.getClass();
                if (!Intrinsics.areEqual(navDestination.label, (String) nfcMrz1LineManualEntryFragment.d.getValue()) && !nfcMrz1LineManualEntryFragment.requireActivity().isChangingConfigurations() && (num6 = nfcMrz1LineManualEntryFragment.c) != null) {
                    nfcMrz1LineManualEntryFragment.requireActivity().setRequestedOrientation(num6.intValue());
                    break;
                }
                break;
            case 6:
                NfcMrzDataManualEntryFragment nfcMrzDataManualEntryFragment = (NfcMrzDataManualEntryFragment) obj;
                NfcMrzDataManualEntryFragment.Companion companion6 = NfcMrzDataManualEntryFragment.Companion;
                navDestination.getClass();
                if (!Intrinsics.areEqual(navDestination.label, (String) nfcMrzDataManualEntryFragment.d.getValue()) && !nfcMrzDataManualEntryFragment.requireActivity().isChangingConfigurations() && (num7 = nfcMrzDataManualEntryFragment.c) != null) {
                    nfcMrzDataManualEntryFragment.requireActivity().setRequestedOrientation(num7.intValue());
                    break;
                }
                break;
            case 7:
                NfcReaderFragment nfcReaderFragment = (NfcReaderFragment) obj;
                NfcReaderFragment.Companion companion7 = NfcReaderFragment.Companion;
                navDestination.getClass();
                if (!Intrinsics.areEqual(navDestination.label, nfcReaderFragment.b$3()) && !nfcReaderFragment.requireActivity().isChangingConfigurations() && (num8 = nfcReaderFragment.g) != null) {
                    nfcReaderFragment.requireActivity().setRequestedOrientation(num8.intValue());
                    break;
                }
                break;
            case 8:
                NfcSelectionFragment nfcSelectionFragment = (NfcSelectionFragment) obj;
                zzd zzdVar = NfcSelectionFragment.Companion;
                navDestination.getClass();
                if (!Intrinsics.areEqual(navDestination.label, (String) nfcSelectionFragment.d.getValue()) && !nfcSelectionFragment.requireActivity().isChangingConfigurations() && (num9 = nfcSelectionFragment.c) != null) {
                    nfcSelectionFragment.requireActivity().setRequestedOrientation(num9.intValue());
                    break;
                }
                break;
            case 9:
                ReviewFragment reviewFragment = (ReviewFragment) obj;
                e eVar = ReviewFragment.Companion;
                navDestination.getClass();
                if (!Intrinsics.areEqual(navDestination.label, (String) reviewFragment.e.getValue()) && !reviewFragment.requireActivity().isChangingConfigurations() && (num10 = reviewFragment.c) != null) {
                    reviewFragment.requireActivity().setRequestedOrientation(num10.intValue());
                    break;
                }
                break;
            case 10:
                VoicePhraseSelectionFragment voicePhraseSelectionFragment = (VoicePhraseSelectionFragment) obj;
                zza zzaVar = VoicePhraseSelectionFragment.Companion;
                navDestination.getClass();
                if (!Intrinsics.areEqual(navDestination.label, (String) voicePhraseSelectionFragment.d.getValue()) && !voicePhraseSelectionFragment.requireActivity().isChangingConfigurations() && (num11 = voicePhraseSelectionFragment.c) != null) {
                    voicePhraseSelectionFragment.requireActivity().setRequestedOrientation(num11.intValue());
                    break;
                }
                break;
            case 11:
                VoiceProcessorFragment voiceProcessorFragment = (VoiceProcessorFragment) obj;
                zzb zzbVar = VoiceProcessorFragment.Companion;
                navDestination.getClass();
                if (!Intrinsics.areEqual(navDestination.label, voiceProcessorFragment.b$4()) && !voiceProcessorFragment.requireActivity().isChangingConfigurations() && (num12 = voiceProcessorFragment.e) != null) {
                    voiceProcessorFragment.requireActivity().setRequestedOrientation(num12.intValue());
                    break;
                }
                break;
            default:
                MutableState mutableState = (MutableState) obj;
                navDestination.getClass();
                if (!Intrinsics.areEqual(navDestination.navigatorName, "BottomSheetNavigator")) {
                    mutableState.setValue(Boolean.valueOf(navHostController.getPreviousBackStackEntry() != null));
                    break;
                }
                break;
        }
    }
}
