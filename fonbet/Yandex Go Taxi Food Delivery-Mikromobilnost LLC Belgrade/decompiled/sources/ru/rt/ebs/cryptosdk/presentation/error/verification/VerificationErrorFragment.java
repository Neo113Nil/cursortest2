package ru.rt.ebs.cryptosdk.presentation.error.verification;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import defpackage.b831;
import defpackage.c831;
import defpackage.d831;
import defpackage.e831;
import defpackage.ljn;
import defpackage.qc;
import defpackage.scc;
import defpackage.tls;
import defpackage.u1w;
import defpackage.u2v;
import defpackage.vmu0;
import defpackage.xoh0;
import java.util.List;
import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.presentation.base.EbsSdkBaseFragment;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableConstraintLayout;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 (2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001)B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0013\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010 \u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0014¢\u0006\u0004\b \u0010!R&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020#0\"8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lru/rt/ebs/cryptosdk/presentation/error/verification/VerificationErrorFragment;", "Lru/rt/ebs/cryptosdk/presentation/base/EbsSdkBaseFragment;", "Ld831;", "Le831;", "Lljn;", "<init>", "()V", "Lzy11;", "setBackPressedCallback", "setReturnEvent", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getArgumentVerificationError", "()Ljava/lang/Exception;", "Lu1w;", "insets", "updateLayoutWith", "(Lu1w;)V", "", "Lu2v;", "getCustomizableViews", "()Ljava/util/List;", "Ljava/lang/Class;", "getViewModelClass", "()Ljava/lang/Class;", ClidProvider.STATE, "onViewStateChanged", "(Ld831;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lkotlin/Function1;", "Lzo31;", "bindingBinder", "Ltls;", "getBindingBinder", "()Ltls;", "Companion", "c831", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class VerificationErrorFragment extends EbsSdkBaseFragment<d831, e831, ljn> {
    private static final String ARG_VERIFICATION_ERROR_KEY = "ARG_VERIFICATION_ERROR";
    public static final c831 Companion = new c831();
    private final tls bindingBinder;

    public VerificationErrorFragment() {
        super(xoh0.ebs_frag_verification_error);
        this.bindingBinder = a.b;
    }

    private final Exception getArgumentVerificationError() {
        Object parcelable;
        Exception exc = null;
        if (Build.VERSION.SDK_INT >= 33) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                parcelable = arguments.getParcelable("ARG_VERIFICATION_ERROR", Exception.class);
                exc = (Exception) parcelable;
            }
        } else {
            Bundle arguments2 = getArguments();
            exc = (Exception) (arguments2 != null ? arguments2.getParcelable(ARG_VERIFICATION_ERROR_KEY) : null);
        }
        return exc == null ? new Exception("Verification error") : exc;
    }

    private final void setBackPressedCallback() {
        requireActivity().getOnBackPressedDispatcher().a(this, new qc(22, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void setReturnEvent() {
        ((e831) getViewModel()).f0(new b831(getArgumentVerificationError()));
    }

    @Override // ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public tls getBindingBinder() {
        return this.bindingBinder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.rt.ebs.cryptosdk.presentation.base.EbsSdkBaseFragment
    public List<u2v> getCustomizableViews() {
        ljn ljnVar = (ljn) getViewBinding();
        return scc.g(ljnVar.b, ljnVar.c, ljnVar.d, ljnVar.f, ljnVar.e);
    }

    @Override // ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public Class<e831> getViewModelClass() {
        return e831.class;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.rt.ebs.cryptosdk.presentation.base.EbsSdkBaseFragment, ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        super.initView(view, savedInstanceState);
        ((ljn) getViewBinding()).d.setOnClickListener(new vmu0(29, this));
        setBackPressedCallback();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public void updateLayoutWith(u1w insets) {
        CustomizableConstraintLayout customizableConstraintLayout = ((ljn) getViewBinding()).b;
        customizableConstraintLayout.setPadding(customizableConstraintLayout.getPaddingLeft(), customizableConstraintLayout.getPaddingTop(), customizableConstraintLayout.getPaddingRight(), insets.d);
        super.updateLayoutWith(insets);
    }

    @Override // ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public void onViewStateChanged(d831 state) {
    }
}
