package com.miteksystems.misnap.workflow.fragment;

import android.content.DialogInterface;
import com.google.mlkit.vision.text.zzb;
import com.miteksystems.misnap.workflow.fragment.BarcodeAnalysisFragment;
import com.miteksystems.misnap.workflow.fragment.DocumentAnalysisFragment;
import com.miteksystems.misnap.workflow.fragment.FaceAnalysisFragment;
import com.miteksystems.misnap.workflow.fragment.HelpFragment;
import com.squareup.scannerview.TextSetter;

/* loaded from: classes4.dex */
public final /* synthetic */ class HelpFragment$$ExternalSyntheticLambda4 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ HelpFragment$$ExternalSyntheticLambda4(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                HelpFragment.Companion companion = HelpFragment.Companion;
                ((HelpFragment) obj).i.launch("android.permission.CAMERA");
                break;
            case 1:
                BarcodeAnalysisFragment.Companion companion2 = BarcodeAnalysisFragment.Companion;
                ((BarcodeAnalysisFragment) obj).r.launch("android.permission.CAMERA");
                break;
            case 2:
                DocumentAnalysisFragment.Companion companion3 = DocumentAnalysisFragment.Companion;
                ((DocumentAnalysisFragment) obj).v.launch("android.permission.CAMERA");
                break;
            case 3:
                FaceAnalysisFragment.Companion companion4 = FaceAnalysisFragment.Companion;
                ((FaceAnalysisFragment) obj).v.launch("android.permission.CAMERA");
                break;
            case 4:
                zzb zzbVar = VoiceProcessorFragment.Companion;
                ((VoiceProcessorFragment) obj).p.launch("android.permission.RECORD_AUDIO");
                break;
            default:
                ((TextSetter) obj).textSwitcher = null;
                break;
        }
    }
}
