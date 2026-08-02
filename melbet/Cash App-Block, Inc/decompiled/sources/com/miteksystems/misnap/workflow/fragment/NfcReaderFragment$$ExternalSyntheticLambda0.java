package com.miteksystems.misnap.workflow.fragment;

import android.content.Context;
import android.view.View;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.workflow.MiSnapWorkflowError;
import com.miteksystems.misnap.workflow.fragment.NfcReaderFragment;
import kotlin.Unit;
import kotlinx.serialization.json.Json;
import okhttp3.MultipartBody;

/* loaded from: classes4.dex */
public final /* synthetic */ class NfcReaderFragment$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ NfcReaderFragment f$0;

    public /* synthetic */ NfcReaderFragment$$ExternalSyntheticLambda0(NfcReaderFragment nfcReaderFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = nfcReaderFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Boolean b;
        String str;
        int i = this.$r8$classId;
        NfcReaderFragment nfcReaderFragment = this.f$0;
        switch (i) {
            case 0:
                NfcReaderFragment.Companion companion = NfcReaderFragment.Companion;
                Object obj = null;
                nfcReaderFragment.e = null;
                MiSnapSettings miSnapSettings = (MiSnapSettings) nfcReaderFragment.c$3().f.getValue();
                if (miSnapSettings != null) {
                    String b$3 = nfcReaderFragment.b$3();
                    if (b$3 != null && (str = miSnapSettings.workflow.get(b$3)) != null) {
                        Json.Default r4 = Json.Default;
                        r4.getClass();
                        obj = r4.decodeFromString(str, NfcReaderFragment.WorkflowSettings.Companion.serializer());
                    }
                    NfcReaderFragment.WorkflowSettings workflowSettings = (NfcReaderFragment.WorkflowSettings) obj;
                    if ((workflowSettings == null || (b = workflowSettings.f) == null) && (b = MultipartBody.Companion.b(nfcReaderFragment.getArguments(), "shouldShowFailoverPopup")) == null) {
                        NfcReaderFragment.Companion companion2 = NfcReaderFragment.Companion;
                        Context requireContext = nfcReaderFragment.requireContext();
                        companion2.getClass();
                        NfcReaderFragment.Companion.getDefaultWorkflowSettings(requireContext, miSnapSettings);
                        b = Boolean.TRUE;
                    }
                    if (b.booleanValue()) {
                        nfcReaderFragment.j();
                    } else {
                        nfcReaderFragment.e$3();
                    }
                    obj = Unit.INSTANCE;
                }
                if (obj == null) {
                    MiSnapWorkflowViewModel c$3 = nfcReaderFragment.c$3();
                    Context requireContext2 = nfcReaderFragment.requireContext();
                    requireContext2.getClass();
                    c$3.postError$workflow_release(requireContext2, MiSnapWorkflowError.SettingState.INSTANCE);
                    break;
                }
                break;
            case 1:
                NfcReaderFragment.a(nfcReaderFragment, view);
                break;
            default:
                NfcReaderFragment.Companion companion3 = NfcReaderFragment.Companion;
                nfcReaderFragment.a$4$1();
                nfcReaderFragment.k();
                break;
        }
    }
}
