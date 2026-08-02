package com.google.android.material.chip;

import android.widget.CompoundButton;
import androidx.media3.common.util.WakeLockManager;
import coil3.network.NetworkFetcher$fetch$2;
import coil3.request.OneShotDisposable;
import com.google.android.material.internal.MaterialCheckable$OnCheckedChangeListener;
import com.squareup.cash.mooncake.components.MooncakeCheckbox;
import com.squareup.cash.mooncake.components.MooncakeSwitch;
import com.squareup.cash.ui.widget.SwitchSettingView;
import com.squareup.scannerview.TextSetter;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.inquiry.sandbox.SandboxFlags;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCheckboxComponent;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes4.dex */
public final /* synthetic */ class Chip$$ExternalSyntheticLambda0 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Chip$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                Chip chip = (Chip) obj;
                MaterialCheckable$OnCheckedChangeListener materialCheckable$OnCheckedChangeListener = chip.onCheckedChangeListenerInternal;
                if (materialCheckable$OnCheckedChangeListener != null) {
                    WakeLockManager wakeLockManager = (WakeLockManager) ((OneShotDisposable) materialCheckable$OnCheckedChangeListener).job;
                    if (!z ? wakeLockManager.uncheckInternal(chip, wakeLockManager.stayAwake) : wakeLockManager.checkInternal(chip)) {
                        wakeLockManager.onCheckedStateChanged();
                    }
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener2 = chip.onCheckedChangeListener;
                if (onCheckedChangeListener2 != null) {
                    onCheckedChangeListener2.onCheckedChanged(compoundButton, z);
                    break;
                }
                break;
            case 1:
                compoundButton.getClass();
                ((NetworkFetcher$fetch$2) obj).invoke(Boolean.valueOf(z));
                break;
            case 2:
                int i2 = MooncakeCheckbox.$r8$clinit;
                compoundButton.getClass();
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener3 = ((MooncakeCheckbox) obj).internalCheckedChangeListener;
                if (onCheckedChangeListener3 != null) {
                    onCheckedChangeListener3.onCheckedChanged(compoundButton, z);
                    break;
                }
                break;
            case 3:
                int i3 = MooncakeSwitch.$r8$clinit;
                compoundButton.getClass();
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener4 = ((MooncakeSwitch) obj).internalCheckedChangeListener;
                if (onCheckedChangeListener4 != null) {
                    onCheckedChangeListener4.onCheckedChanged(compoundButton, z);
                    break;
                }
                break;
            case 4:
                SwitchSettingView switchSettingView = (SwitchSettingView) obj;
                KProperty[] kPropertyArr = SwitchSettingView.$$delegatedProperties;
                compoundButton.getClass();
                if (!switchSettingView.ignoreChanges && (onCheckedChangeListener = switchSettingView.listener) != null) {
                    onCheckedChangeListener.onCheckedChanged(switchSettingView.buttonView, z);
                    break;
                }
                break;
            case 5:
                KProperty[] kPropertyArr2 = SwitchSettingView.$$delegatedProperties;
                compoundButton.getClass();
                ((Function2) obj).invoke(compoundButton, Boolean.valueOf(z));
                break;
            case 6:
                compoundButton.getClass();
                ((HCaptcha$$ExternalSyntheticLambda2) obj).invoke(Boolean.valueOf(z));
                break;
            case 7:
                compoundButton.getClass();
                ((SandboxFlags) ((TextSetter) obj).textView).simulateGovIdNfc = z;
                break;
            default:
                compoundButton.getClass();
                StateFlowImpl stateFlowImpl = ((InputCheckboxComponent) obj).twoStateViewController._textValue;
                Boolean valueOf = Boolean.valueOf(z);
                stateFlowImpl.getClass();
                stateFlowImpl.updateState(null, valueOf);
                break;
        }
    }
}
