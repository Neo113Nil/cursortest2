package ru.rt.ebs.cryptosdk.presentation.info.biometry;

import android.os.Bundle;
import android.view.View;
import defpackage.ejn;
import defpackage.fz5;
import defpackage.gz5;
import defpackage.hz5;
import defpackage.jz5;
import defpackage.kv5;
import defpackage.scc;
import defpackage.t5s0;
import defpackage.tf;
import defpackage.tls;
import defpackage.u1w;
import defpackage.u2v;
import defpackage.xoh0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.presentation.base.EbsSdkBaseFragment;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableConstraintLayout;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableHeader;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \"2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR&\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001d0\u001c8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lru/rt/ebs/cryptosdk/presentation/info/biometry/BiometryInfoFragment;", "Lru/rt/ebs/cryptosdk/presentation/base/EbsSdkBaseFragment;", "Lhz5;", "Ljz5;", "Lejn;", "<init>", "()V", "", "Lu2v;", "getCustomizableViews", "()Ljava/util/List;", "Lu1w;", "insets", "Lzy11;", "updateLayoutWith", "(Lu1w;)V", "Ljava/lang/Class;", "getViewModelClass", "()Ljava/lang/Class;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", ClidProvider.STATE, "onViewStateChanged", "(Lhz5;)V", "Lkotlin/Function1;", "Lzo31;", "bindingBinder", "Ltls;", "getBindingBinder", "()Ltls;", "Companion", "gz5", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BiometryInfoFragment extends EbsSdkBaseFragment<hz5, jz5, ejn> {
    public static final gz5 Companion = new gz5();
    private final tls bindingBinder;

    public BiometryInfoFragment() {
        super(xoh0.ebs_frag_biometry_info);
        this.bindingBinder = a.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 initView$lambda$3$lambda$1(BiometryInfoFragment biometryInfoFragment, View view) {
        ((jz5) biometryInfoFragment.getViewModel()).f0(new t5s0(null));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initView$lambda$3$lambda$2(BiometryInfoFragment biometryInfoFragment, View view) {
        ((jz5) biometryInfoFragment.getViewModel()).f0(fz5.a);
    }

    @Override // ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public tls getBindingBinder() {
        return this.bindingBinder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.rt.ebs.cryptosdk.presentation.base.EbsSdkBaseFragment
    public List<u2v> getCustomizableViews() {
        ejn ejnVar = (ejn) getViewBinding();
        return scc.g(ejnVar.c, ejnVar.d, ejnVar.h, ejnVar.b, ejnVar.i, ejnVar.e, ejnVar.f, ejnVar.g);
    }

    @Override // ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public Class<jz5> getViewModelClass() {
        return jz5.class;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.rt.ebs.cryptosdk.presentation.base.EbsSdkBaseFragment, ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        super.initView(view, savedInstanceState);
        ejn ejnVar = (ejn) getViewBinding();
        ejnVar.d.setOnCancelButtonClickListener(new kv5(10, this));
        ejnVar.h.setOnClickListener(new tf(24, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public void updateLayoutWith(u1w insets) {
        CustomizableHeader customizableHeader = ((ejn) getViewBinding()).d;
        customizableHeader.setPadding(customizableHeader.getPaddingLeft(), insets.b, customizableHeader.getPaddingRight(), customizableHeader.getPaddingBottom());
        CustomizableConstraintLayout customizableConstraintLayout = ((ejn) getViewBinding()).c;
        customizableConstraintLayout.setPadding(customizableConstraintLayout.getPaddingLeft(), customizableConstraintLayout.getPaddingTop(), customizableConstraintLayout.getPaddingRight(), insets.d);
        super.updateLayoutWith(insets);
    }

    @Override // ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public void onViewStateChanged(hz5 state) {
    }
}
