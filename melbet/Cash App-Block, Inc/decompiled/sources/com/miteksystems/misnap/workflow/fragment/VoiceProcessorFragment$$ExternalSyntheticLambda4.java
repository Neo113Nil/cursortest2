package com.miteksystems.misnap.workflow.fragment;

import android.content.Context;
import android.util.Log;
import android.view.View;
import androidx.navigation.fragment.FragmentKt;
import com.google.mlkit.vision.text.zzb;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.workflow.MiSnapWorkflowError;
import com.squareup.cash.R;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final /* synthetic */ class VoiceProcessorFragment$$ExternalSyntheticLambda4 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ VoiceProcessorFragment f$0;

    public /* synthetic */ VoiceProcessorFragment$$ExternalSyntheticLambda4(VoiceProcessorFragment voiceProcessorFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = voiceProcessorFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Unit unit;
        int i = this.$r8$classId;
        VoiceProcessorFragment voiceProcessorFragment = this.f$0;
        switch (i) {
            case 0:
                zzb zzbVar = VoiceProcessorFragment.Companion;
                voiceProcessorFragment.i = false;
                voiceProcessorFragment.getBinding$workflow_release().e.setVisibility(8);
                voiceProcessorFragment.getBinding$workflow_release().b.setVisibility(0);
                MiSnapSettings miSnapSettings = (MiSnapSettings) voiceProcessorFragment.c$4().f.getValue();
                if (miSnapSettings != null) {
                    voiceProcessorFragment.g = false;
                    voiceProcessorFragment.startSession$workflow_release(miSnapSettings, false);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    MiSnapWorkflowViewModel c$4 = voiceProcessorFragment.c$4();
                    Context requireContext = voiceProcessorFragment.requireContext();
                    requireContext.getClass();
                    c$4.postError$workflow_release(requireContext, MiSnapWorkflowError.SettingState.INSTANCE);
                    break;
                }
                break;
            case 1:
                zzb zzbVar2 = VoiceProcessorFragment.Companion;
                voiceProcessorFragment.e$4();
                break;
            case 2:
                zzb zzbVar3 = VoiceProcessorFragment.Companion;
                try {
                    FragmentKt.findNavController(voiceProcessorFragment).navigate(R.id.navigateSkip);
                } catch (Exception e) {
                    Log.e("VoiceProcessorFragment", "Nav Graph Error", e);
                    voiceProcessorFragment.c$4().postNavigationError$workflow_release(new NavigationError(e, VoiceProcessorFragment.class, voiceProcessorFragment.hashCode(), NavigationAction$VoiceProcessor$NavigateHelp.INSTANCE$1));
                }
                MiSnapWorkflowViewModel c$42 = voiceProcessorFragment.c$4();
                Context requireContext2 = voiceProcessorFragment.requireContext();
                requireContext2.getClass();
                c$42.postError$workflow_release(requireContext2, MiSnapWorkflowError.Voice.Skipped.INSTANCE);
                break;
            default:
                zzb zzbVar4 = VoiceProcessorFragment.Companion;
                voiceProcessorFragment.e$4();
                break;
        }
    }
}
