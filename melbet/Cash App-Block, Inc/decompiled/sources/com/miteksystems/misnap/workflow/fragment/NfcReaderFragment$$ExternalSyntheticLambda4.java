package com.miteksystems.misnap.workflow.fragment;

import android.content.Context;
import android.content.DialogInterface;
import com.miteksystems.misnap.workflow.MiSnapWorkflowError;
import com.miteksystems.misnap.workflow.fragment.NfcReaderFragment;

/* loaded from: classes4.dex */
public final /* synthetic */ class NfcReaderFragment$$ExternalSyntheticLambda4 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ NfcReaderFragment f$0;

    public /* synthetic */ NfcReaderFragment$$ExternalSyntheticLambda4(NfcReaderFragment nfcReaderFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = nfcReaderFragment;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.$r8$classId;
        NfcReaderFragment nfcReaderFragment = this.f$0;
        switch (i2) {
            case 0:
                NfcReaderFragment.Companion companion = NfcReaderFragment.Companion;
                nfcReaderFragment.getBinding$workflow_release().n.performClick();
                break;
            case 1:
                NfcReaderFragment.e(nfcReaderFragment);
                break;
            case 2:
                NfcReaderFragment.Companion companion2 = NfcReaderFragment.Companion;
                nfcReaderFragment.getClass();
                MiSnapWorkflowViewModel c$3 = nfcReaderFragment.c$3();
                Context requireContext = nfcReaderFragment.requireContext();
                requireContext.getClass();
                c$3.postError$workflow_release(requireContext, MiSnapWorkflowError.Permission.INSTANCE);
                break;
            case 3:
                NfcReaderFragment.Companion companion3 = NfcReaderFragment.Companion;
                nfcReaderFragment.getBinding$workflow_release().h.setVisibility(0);
                nfcReaderFragment.k();
                break;
            case 4:
                NfcReaderFragment.Companion companion4 = NfcReaderFragment.Companion;
                nfcReaderFragment.getBinding$workflow_release().h.setVisibility(0);
                nfcReaderFragment.getBinding$workflow_release().n.performClick();
                break;
            default:
                NfcReaderFragment.Companion companion5 = NfcReaderFragment.Companion;
                nfcReaderFragment.e$3();
                break;
        }
    }
}
