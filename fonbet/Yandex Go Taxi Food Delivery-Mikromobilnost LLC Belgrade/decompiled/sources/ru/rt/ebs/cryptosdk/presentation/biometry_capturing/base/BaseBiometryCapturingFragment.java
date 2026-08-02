package ru.rt.ebs.cryptosdk.presentation.biometry_capturing.base;

import androidx.fragment.app.FragmentActivity;
import defpackage.tt11;
import defpackage.u1w;
import defpackage.vc5;
import defpackage.zo31;
import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.presentation.base.BaseActivity;
import ru.rt.ebs.cryptosdk.presentation.base.EbsSdkBaseFragment;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u0003*\b\b\u0002\u0010\u0006*\u00020\u00052\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007B\u0011\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/rt/ebs/cryptosdk/presentation/biometry_capturing/base/BaseBiometryCapturingFragment;", "Ltt11;", "State", "Lvc5;", "VM", "Lzo31;", "VB", "Lru/rt/ebs/cryptosdk/presentation/base/EbsSdkBaseFragment;", "", "layoutRes", "<init>", "(I)V", "Lu1w;", "insets", "Lzy11;", "updateLayoutWith", "(Lu1w;)V", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class BaseBiometryCapturingFragment<State extends tt11, VM extends vc5, VB extends zo31> extends EbsSdkBaseFragment<State, VM, VB> {
    public BaseBiometryCapturingFragment(int i) {
        super(i);
    }

    @Override // ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public void updateLayoutWith(u1w insets) {
        FragmentActivity requireActivity = requireActivity();
        BaseActivity baseActivity = requireActivity instanceof BaseActivity ? (BaseActivity) requireActivity : null;
        if (baseActivity != null) {
            baseActivity.updateBiometryCapturingStatusBarDesign();
        }
    }
}
