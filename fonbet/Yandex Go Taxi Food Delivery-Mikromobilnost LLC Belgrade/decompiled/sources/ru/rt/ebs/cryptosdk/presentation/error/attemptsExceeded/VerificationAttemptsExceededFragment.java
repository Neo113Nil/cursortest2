package ru.rt.ebs.cryptosdk.presentation.error.attemptsExceeded;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import defpackage.j731;
import defpackage.kjn;
import defpackage.l731;
import defpackage.m731;
import defpackage.n731;
import defpackage.qc;
import defpackage.scc;
import defpackage.tls;
import defpackage.u1w;
import defpackage.u2v;
import defpackage.vmu0;
import defpackage.xoh0;
import java.util.List;
import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.core.common.entities.exceptions.EbsException;
import ru.rt.ebs.cryptosdk.core.verification.esia.entities.exceptions.VerificationAttemptsExceededEbsException;
import ru.rt.ebs.cryptosdk.presentation.base.EbsSdkBaseFragment;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableConstraintLayout;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 '2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 R&\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\"0!8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lru/rt/ebs/cryptosdk/presentation/error/attemptsExceeded/VerificationAttemptsExceededFragment;", "Lru/rt/ebs/cryptosdk/presentation/base/EbsSdkBaseFragment;", "Lm731;", "Ln731;", "Lkjn;", "<init>", "()V", "Lzy11;", "setBackPressedCallback", "setReturnEvent", "Lru/rt/ebs/cryptosdk/core/verification/esia/entities/exceptions/VerificationAttemptsExceededEbsException;", "getArgumentVerificationAttemptsExceededError", "()Lru/rt/ebs/cryptosdk/core/verification/esia/entities/exceptions/VerificationAttemptsExceededEbsException;", "Ljava/lang/Class;", "getViewModelClass", "()Ljava/lang/Class;", "Lu1w;", "insets", "updateLayoutWith", "(Lu1w;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "Lu2v;", "getCustomizableViews", "()Ljava/util/List;", ClidProvider.STATE, "onViewStateChanged", "(Lm731;)V", "Lkotlin/Function1;", "Lzo31;", "bindingBinder", "Ltls;", "getBindingBinder", "()Ltls;", "Companion", "l731", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class VerificationAttemptsExceededFragment extends EbsSdkBaseFragment<m731, n731, kjn> {
    private static final String ARG_VERIFICATION_ATTEMPTS_EXCEEDED_ERROR_KEY = "ARG_VERIFICATION_ATTEMPTS_EXCEEDED_ERROR";
    public static final l731 Companion = new l731();
    private final tls bindingBinder;

    public VerificationAttemptsExceededFragment() {
        super(xoh0.ebs_frag_verification_attempts_exceeded);
        this.bindingBinder = a.b;
    }

    private final VerificationAttemptsExceededEbsException getArgumentVerificationAttemptsExceededError() {
        VerificationAttemptsExceededEbsException verificationAttemptsExceededEbsException;
        Object parcelable;
        if (Build.VERSION.SDK_INT >= 33) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                parcelable = arguments.getParcelable("ARG_VERIFICATION_ATTEMPTS_EXCEEDED_ERROR", VerificationAttemptsExceededEbsException.class);
                verificationAttemptsExceededEbsException = (VerificationAttemptsExceededEbsException) parcelable;
            }
            verificationAttemptsExceededEbsException = null;
        } else {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                verificationAttemptsExceededEbsException = (VerificationAttemptsExceededEbsException) arguments2.getParcelable(ARG_VERIFICATION_ATTEMPTS_EXCEEDED_ERROR_KEY);
            }
            verificationAttemptsExceededEbsException = null;
        }
        if (verificationAttemptsExceededEbsException != null) {
            return verificationAttemptsExceededEbsException;
        }
        VerificationAttemptsExceededEbsException.Companion.getClass();
        return new VerificationAttemptsExceededEbsException(EbsException.VERIFICATION_ATTEMPTS_EXCEEDED_ERROR_CODE_DEFAULT, EbsException.VERIFICATION_ATTEMPTS_EXCEEDED_ERROR_MESSAGE_DEFAULT);
    }

    private final void setBackPressedCallback() {
        requireActivity().getOnBackPressedDispatcher().a(this, new qc(21, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void setReturnEvent() {
        ((n731) getViewModel()).f0(new j731(getArgumentVerificationAttemptsExceededError()));
    }

    @Override // ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public tls getBindingBinder() {
        return this.bindingBinder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.rt.ebs.cryptosdk.presentation.base.EbsSdkBaseFragment
    public List<u2v> getCustomizableViews() {
        kjn kjnVar = (kjn) getViewBinding();
        return scc.g(kjnVar.b, kjnVar.f, kjnVar.c, kjnVar.e, kjnVar.d);
    }

    @Override // ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public Class<n731> getViewModelClass() {
        return n731.class;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.rt.ebs.cryptosdk.presentation.base.EbsSdkBaseFragment, ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        super.initView(view, savedInstanceState);
        ((kjn) getViewBinding()).f.setOnClickListener(new vmu0(28, this));
        setBackPressedCallback();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public void updateLayoutWith(u1w insets) {
        CustomizableConstraintLayout customizableConstraintLayout = ((kjn) getViewBinding()).b;
        customizableConstraintLayout.setPadding(customizableConstraintLayout.getPaddingLeft(), customizableConstraintLayout.getPaddingTop(), customizableConstraintLayout.getPaddingRight(), insets.d);
        super.updateLayoutWith(insets);
    }

    @Override // ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public void onViewStateChanged(m731 state) {
    }
}
