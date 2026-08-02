package ru.rt.ebs.cryptosdk.presentation.base;

import android.os.Bundle;
import android.view.View;
import defpackage.o2v;
import defpackage.qc;
import defpackage.s5s0;
import defpackage.tt11;
import defpackage.u2v;
import defpackage.vc5;
import defpackage.xs11;
import defpackage.zo31;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.entities.models.CryptoSdkDesign;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u0003*\b\b\u0002\u0010\u0006*\u00020\u00052\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007B\u0011\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH$¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/rt/ebs/cryptosdk/presentation/base/EbsSdkBaseFragment;", "Ltt11;", "State", "Lvc5;", "VM", "Lzo31;", "VB", "Lru/rt/ebs/cryptosdk/presentation/base/BaseFragment;", "", "layoutRes", "<init>", "(I)V", "", "Lu2v;", "getCustomizableViews", "()Ljava/util/List;", "Lru/rt/ebs/cryptosdk/entities/models/CryptoSdkDesign;", "design", "Lzy11;", "customizeScreen", "(Lru/rt/ebs/cryptosdk/entities/models/CryptoSdkDesign;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lxs11;", "effect", "onViewEffect", "(Lxs11;)V", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class EbsSdkBaseFragment<State extends tt11, VM extends vc5, VB extends zo31> extends BaseFragment<State, VM, VB> {
    public EbsSdkBaseFragment(int i) {
        super(i);
    }

    public void customizeScreen(CryptoSdkDesign design) {
        Iterator<T> it = getCustomizableViews().iterator();
        while (it.hasNext()) {
            ((u2v) it.next()).applyDesign(design);
        }
    }

    public abstract List<u2v> getCustomizableViews();

    @Override // ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        super.initView(view, savedInstanceState);
        CryptoSdkDesign cryptoSdkDesign = getCryptoSdkDesign();
        if (cryptoSdkDesign != null) {
            customizeScreen(cryptoSdkDesign);
        }
        requireActivity().getOnBackPressedDispatcher().a(this, new qc(10, this));
    }

    @Override // ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public void onViewEffect(xs11 effect) {
        if (!(effect instanceof s5s0)) {
            super.onViewEffect(effect);
            return;
        }
        o2v baseActivity = getBaseActivity();
        if (baseActivity != null) {
            baseActivity.showCancelVerificationDialog(((s5s0) effect).a);
        }
    }
}
