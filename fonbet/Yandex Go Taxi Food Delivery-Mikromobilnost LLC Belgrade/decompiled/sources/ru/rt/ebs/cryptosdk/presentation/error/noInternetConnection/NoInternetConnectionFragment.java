package ru.rt.ebs.cryptosdk.presentation.error.noInternetConnection;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import defpackage.dc60;
import defpackage.fz5;
import defpackage.hjn;
import defpackage.qc;
import defpackage.scc;
import defpackage.t5s0;
import defpackage.tls;
import defpackage.u1w;
import defpackage.u2v;
import defpackage.ub60;
import defpackage.vb60;
import defpackage.xb60;
import defpackage.xoh0;
import defpackage.zgv;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.presentation.base.EbsSdkBaseFragment;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableConstraintLayout;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableHeader;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 '2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0013\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 R&\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\"0!8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lru/rt/ebs/cryptosdk/presentation/error/noInternetConnection/NoInternetConnectionFragment;", "Lru/rt/ebs/cryptosdk/presentation/base/EbsSdkBaseFragment;", "Lxb60;", "Ldc60;", "Lhjn;", "<init>", "()V", "Lzy11;", "setBackPressedCallback", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getArgumentNoInternetConnectionError", "()Ljava/lang/Exception;", "Ljava/lang/Class;", "getViewModelClass", "()Ljava/lang/Class;", "Lu1w;", "insets", "updateLayoutWith", "(Lu1w;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "Lu2v;", "getCustomizableViews", "()Ljava/util/List;", ClidProvider.STATE, "onViewStateChanged", "(Lxb60;)V", "Lkotlin/Function1;", "Lzo31;", "bindingBinder", "Ltls;", "getBindingBinder", "()Ltls;", "Companion", "vb60", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NoInternetConnectionFragment extends EbsSdkBaseFragment<xb60, dc60, hjn> {
    private static final String ARG_NO_INTERNET_CONNECTION_ERROR_KEY = "ARG_NO_INTERNET_CONNECTION_ERROR";
    public static final vb60 Companion = new vb60();
    private final tls bindingBinder;

    public NoInternetConnectionFragment() {
        super(xoh0.ebs_frag_no_internet_connection);
        this.bindingBinder = a.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ dc60 access$getViewModel(NoInternetConnectionFragment noInternetConnectionFragment) {
        return (dc60) noInternetConnectionFragment.getViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Exception getArgumentNoInternetConnectionError() {
        Object parcelable;
        Exception exc = null;
        if (Build.VERSION.SDK_INT >= 33) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                parcelable = arguments.getParcelable("ARG_NO_INTERNET_CONNECTION_ERROR", Exception.class);
                exc = (Exception) parcelable;
            }
        } else {
            Bundle arguments2 = getArguments();
            exc = (Exception) (arguments2 != null ? arguments2.getParcelable(ARG_NO_INTERNET_CONNECTION_ERROR_KEY) : null);
        }
        return exc == null ? new Exception("No internet connection") : exc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initView$lambda$0(NoInternetConnectionFragment noInternetConnectionFragment, View view) {
        ((dc60) noInternetConnectionFragment.getViewModel()).f0(fz5.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 initView$lambda$1(NoInternetConnectionFragment noInternetConnectionFragment, View view) {
        ((dc60) noInternetConnectionFragment.getViewModel()).f0(new t5s0(noInternetConnectionFragment.getArgumentNoInternetConnectionError()));
        return zy11.a;
    }

    private final void setBackPressedCallback() {
        requireActivity().getOnBackPressedDispatcher().a(this, new qc(14, this));
    }

    @Override // ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public tls getBindingBinder() {
        return this.bindingBinder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.rt.ebs.cryptosdk.presentation.base.EbsSdkBaseFragment
    public List<u2v> getCustomizableViews() {
        hjn hjnVar = (hjn) getViewBinding();
        return scc.g(hjnVar.b, hjnVar.f, hjnVar.g, hjnVar.c, hjnVar.e, hjnVar.d);
    }

    @Override // ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public Class<dc60> getViewModelClass() {
        return dc60.class;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.rt.ebs.cryptosdk.presentation.base.EbsSdkBaseFragment, ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        super.initView(view, savedInstanceState);
        ((hjn) getViewBinding()).g.setOnClickListener(new zgv(22, this));
        ((hjn) getViewBinding()).f.setOnCancelButtonClickListener(new ub60(0, this));
        setBackPressedCallback();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public void updateLayoutWith(u1w insets) {
        CustomizableHeader customizableHeader = ((hjn) getViewBinding()).f;
        customizableHeader.setPadding(customizableHeader.getPaddingLeft(), insets.b, customizableHeader.getPaddingRight(), customizableHeader.getPaddingBottom());
        CustomizableConstraintLayout customizableConstraintLayout = ((hjn) getViewBinding()).b;
        customizableConstraintLayout.setPadding(customizableConstraintLayout.getPaddingLeft(), customizableConstraintLayout.getPaddingTop(), customizableConstraintLayout.getPaddingRight(), insets.d);
        super.updateLayoutWith(insets);
    }

    @Override // ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public void onViewStateChanged(xb60 state) {
    }
}
