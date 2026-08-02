package ru.rt.ebs.cryptosdk.presentation.error.accessDenied;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import defpackage.djn;
import defpackage.qc;
import defpackage.rf;
import defpackage.scc;
import defpackage.tf;
import defpackage.tls;
import defpackage.u1w;
import defpackage.u2v;
import defpackage.uf;
import defpackage.vf;
import defpackage.wf;
import defpackage.xoh0;
import java.util.List;
import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.core.common.entities.exceptions.EbsException;
import ru.rt.ebs.cryptosdk.core.verification.esia.entities.exceptions.AccessDeniedEsiaVerificationEbsException;
import ru.rt.ebs.cryptosdk.presentation.base.EbsSdkBaseFragment;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableConstraintLayout;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 '2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001bH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 R&\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\"0!8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lru/rt/ebs/cryptosdk/presentation/error/accessDenied/AccessDeniedFragment;", "Lru/rt/ebs/cryptosdk/presentation/base/EbsSdkBaseFragment;", "Lvf;", "Lwf;", "Ldjn;", "<init>", "()V", "Lzy11;", "setBackPressedCallback", "setReturnEvent", "Lru/rt/ebs/cryptosdk/core/verification/esia/entities/exceptions/AccessDeniedEsiaVerificationEbsException;", "getArgumentAccessDeniedError", "()Lru/rt/ebs/cryptosdk/core/verification/esia/entities/exceptions/AccessDeniedEsiaVerificationEbsException;", "Lu1w;", "insets", "updateLayoutWith", "(Lu1w;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "Lu2v;", "getCustomizableViews", "()Ljava/util/List;", "Ljava/lang/Class;", "getViewModelClass", "()Ljava/lang/Class;", ClidProvider.STATE, "onViewStateChanged", "(Lvf;)V", "Lkotlin/Function1;", "Lzo31;", "bindingBinder", "Ltls;", "getBindingBinder", "()Ltls;", "Companion", "uf", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AccessDeniedFragment extends EbsSdkBaseFragment<vf, wf, djn> {
    private static final String ARG_ACCESS_DENIED_ERROR_KEY = "ARG_ACCESS_DENIED_ERROR";
    public static final uf Companion = new uf();
    private final tls bindingBinder;

    public AccessDeniedFragment() {
        super(xoh0.ebs_frag_access_denied);
        this.bindingBinder = a.b;
    }

    private final AccessDeniedEsiaVerificationEbsException getArgumentAccessDeniedError() {
        AccessDeniedEsiaVerificationEbsException accessDeniedEsiaVerificationEbsException;
        Object parcelable;
        if (Build.VERSION.SDK_INT >= 33) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                parcelable = arguments.getParcelable("ARG_ACCESS_DENIED_ERROR", AccessDeniedEsiaVerificationEbsException.class);
                accessDeniedEsiaVerificationEbsException = (AccessDeniedEsiaVerificationEbsException) parcelable;
            }
            accessDeniedEsiaVerificationEbsException = null;
        } else {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                accessDeniedEsiaVerificationEbsException = (AccessDeniedEsiaVerificationEbsException) arguments2.getParcelable(ARG_ACCESS_DENIED_ERROR_KEY);
            }
            accessDeniedEsiaVerificationEbsException = null;
        }
        if (accessDeniedEsiaVerificationEbsException != null) {
            return accessDeniedEsiaVerificationEbsException;
        }
        AccessDeniedEsiaVerificationEbsException.Companion.getClass();
        return new AccessDeniedEsiaVerificationEbsException(EbsException.ACCESS_DENIED_ERROR_CODE, EbsException.ACCESS_DENIED_ERROR_MESSAGE_DEFAULT);
    }

    private final void setBackPressedCallback() {
        requireActivity().getOnBackPressedDispatcher().a(this, new qc(1, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void setReturnEvent() {
        ((wf) getViewModel()).f0(new rf(getArgumentAccessDeniedError()));
    }

    @Override // ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public tls getBindingBinder() {
        return this.bindingBinder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.rt.ebs.cryptosdk.presentation.base.EbsSdkBaseFragment
    public List<u2v> getCustomizableViews() {
        djn djnVar = (djn) getViewBinding();
        return scc.g(djnVar.b, djnVar.d, djnVar.c, djnVar.f, djnVar.e);
    }

    @Override // ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public Class<wf> getViewModelClass() {
        return wf.class;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.rt.ebs.cryptosdk.presentation.base.EbsSdkBaseFragment, ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        super.initView(view, savedInstanceState);
        ((djn) getViewBinding()).d.setOnClickListener(new tf(0, this));
        setBackPressedCallback();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public void updateLayoutWith(u1w insets) {
        CustomizableConstraintLayout customizableConstraintLayout = ((djn) getViewBinding()).b;
        customizableConstraintLayout.setPadding(customizableConstraintLayout.getPaddingLeft(), customizableConstraintLayout.getPaddingTop(), customizableConstraintLayout.getPaddingRight(), insets.d);
        super.updateLayoutWith(insets);
    }

    @Override // ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public void onViewStateChanged(vf state) {
    }
}
