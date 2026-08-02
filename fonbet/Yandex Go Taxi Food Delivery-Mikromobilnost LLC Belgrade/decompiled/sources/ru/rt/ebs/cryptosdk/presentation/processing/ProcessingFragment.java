package ru.rt.ebs.cryptosdk.presentation.processing;

import android.os.Bundle;
import android.view.View;
import defpackage.g6f0;
import defpackage.h6f0;
import defpackage.jjn;
import defpackage.k7d0;
import defpackage.n6f0;
import defpackage.p6f0;
import defpackage.scc;
import defpackage.t5s0;
import defpackage.tls;
import defpackage.u1w;
import defpackage.u2v;
import defpackage.xoh0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.presentation.base.EbsSdkBaseFragment;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableHeader;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 #2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u0006R&\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001e0\u001d8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lru/rt/ebs/cryptosdk/presentation/processing/ProcessingFragment;", "Lru/rt/ebs/cryptosdk/presentation/base/EbsSdkBaseFragment;", "Ln6f0;", "Lp6f0;", "Ljjn;", "<init>", "()V", "Ljava/lang/Class;", "getViewModelClass", "()Ljava/lang/Class;", "", "Lu2v;", "getCustomizableViews", "()Ljava/util/List;", "Lu1w;", "insets", "Lzy11;", "updateLayoutWith", "(Lu1w;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", ClidProvider.STATE, "onViewStateChanged", "(Ln6f0;)V", "triggerProcessEvent", "Lkotlin/Function1;", "Lzo31;", "bindingBinder", "Ltls;", "getBindingBinder", "()Ltls;", "Companion", "h6f0", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProcessingFragment extends EbsSdkBaseFragment<n6f0, p6f0, jjn> {
    public static final h6f0 Companion = new h6f0();
    private final tls bindingBinder;

    public ProcessingFragment() {
        super(xoh0.ebs_frag_processing);
        this.bindingBinder = a.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 initView$lambda$1(ProcessingFragment processingFragment, View view) {
        ((p6f0) processingFragment.getViewModel()).f0(new t5s0(null));
        return zy11.a;
    }

    @Override // ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public tls getBindingBinder() {
        return this.bindingBinder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.rt.ebs.cryptosdk.presentation.base.EbsSdkBaseFragment
    public List<u2v> getCustomizableViews() {
        jjn jjnVar = (jjn) getViewBinding();
        return scc.g(jjnVar.c, jjnVar.e, jjnVar.d, jjnVar.b);
    }

    @Override // ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public Class<p6f0> getViewModelClass() {
        return p6f0.class;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.rt.ebs.cryptosdk.presentation.base.EbsSdkBaseFragment, ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        super.initView(view, savedInstanceState);
        ((p6f0) getViewModel()).f0(g6f0.a);
        ((jjn) getViewBinding()).c.setOnCancelButtonClickListener(new k7d0(26, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public void onViewStateChanged(n6f0 state) {
        ((jjn) getViewBinding()).e.setText(state.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void triggerProcessEvent() {
        ((p6f0) getViewModel()).f0(g6f0.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public void updateLayoutWith(u1w insets) {
        CustomizableHeader customizableHeader = ((jjn) getViewBinding()).c;
        customizableHeader.setPadding(customizableHeader.getPaddingLeft(), insets.b, customizableHeader.getPaddingRight(), customizableHeader.getPaddingBottom());
        super.updateLayoutWith(insets);
    }
}
