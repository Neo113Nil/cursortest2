package ru.rt.ebs.cryptosdk.presentation.base;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import defpackage.deb1;
import defpackage.f02;
import defpackage.hs31;
import defpackage.i3y;
import defpackage.ls31;
import defpackage.m6;
import defpackage.n751;
import defpackage.o2v;
import defpackage.tls;
import defpackage.tt11;
import defpackage.u1w;
import defpackage.vc5;
import defpackage.xs11;
import defpackage.xx60;
import defpackage.zo31;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.a;
import ru.rt.ebs.cryptosdk.entities.models.CryptoSdkDesign;
import ru.rt.ebs.cryptosdk.entities.models.CustomDesignOptions;
import ru.rt.ebs.cryptosdk.entities.models.DesignOptions;
import ru.rt.ebs.cryptosdk.entities.models.VideoResolutionRestrictions;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u0003*\b\b\u0002\u0010\u0006*\u00020\u00052\u00020\u0007B\u0011\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010H$¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00028\u0000H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\"\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J!\u0010$\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0014¢\u0006\u0004\b$\u0010#J\u000f\u0010%\u001a\u00020\fH\u0016¢\u0006\u0004\b%\u0010\u000eR\"\u0010'\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010.\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00105\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001b\u0010?\u001a\u00028\u00018DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0018\u0010@\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u001a\u0010E\u001a\u00028\u00028DX\u0084\u0004¢\u0006\f\u0012\u0004\bD\u0010\u000e\u001a\u0004\bB\u0010CR\u0016\u0010I\u001a\u0004\u0018\u00010F8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0016\u0010M\u001a\u0004\u0018\u00010J8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR \u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00050N8$X¤\u0004¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006R"}, d2 = {"Lru/rt/ebs/cryptosdk/presentation/base/BaseFragment;", "Ltt11;", "State", "Lvc5;", "VM", "Lzo31;", "VB", "Landroidx/fragment/app/Fragment;", "", "layoutRes", "<init>", "(I)V", "Lzy11;", "setInsetsListener", "()V", "createBinds", "Ljava/lang/Class;", "getViewModelClass", "()Ljava/lang/Class;", ClidProvider.STATE, "onViewStateChanged", "(Ltt11;)V", "Lxs11;", "effect", "onViewEffect", "(Lxs11;)V", "Lu1w;", "insets", "updateLayoutWith", "(Lu1w;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "initView", "onDestroyView", "Lru/rt/ebs/cryptosdk/entities/models/DesignOptions;", "designOptions", "Lru/rt/ebs/cryptosdk/entities/models/DesignOptions;", "getDesignOptions", "()Lru/rt/ebs/cryptosdk/entities/models/DesignOptions;", "setDesignOptions", "(Lru/rt/ebs/cryptosdk/entities/models/DesignOptions;)V", "Lhs31;", "viewModelFactory", "Lhs31;", "getViewModelFactory", "()Lhs31;", "setViewModelFactory", "(Lhs31;)V", "Lru/rt/ebs/cryptosdk/entities/models/VideoResolutionRestrictions;", "videoResolutionRestrictions", "Lru/rt/ebs/cryptosdk/entities/models/VideoResolutionRestrictions;", "getVideoResolutionRestrictions", "()Lru/rt/ebs/cryptosdk/entities/models/VideoResolutionRestrictions;", "setVideoResolutionRestrictions", "(Lru/rt/ebs/cryptosdk/entities/models/VideoResolutionRestrictions;)V", "viewModel$delegate", "Li3y;", "getViewModel", "()Lvc5;", "viewModel", "binding", "Lzo31;", "getViewBinding", "()Lzo31;", "getViewBinding$annotations", "viewBinding", "Lo2v;", "getBaseActivity", "()Lo2v;", "baseActivity", "Lru/rt/ebs/cryptosdk/entities/models/CryptoSdkDesign;", "getCryptoSdkDesign", "()Lru/rt/ebs/cryptosdk/entities/models/CryptoSdkDesign;", "cryptoSdkDesign", "Lkotlin/Function1;", "getBindingBinder", "()Ltls;", "bindingBinder", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class BaseFragment<State extends tt11, VM extends vc5, VB extends zo31> extends Fragment {
    private zo31 binding;
    public DesignOptions designOptions;
    public VideoResolutionRestrictions videoResolutionRestrictions;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel;
    public hs31 viewModelFactory;

    public BaseFragment(int i) {
        super(i);
        this.viewModel = a.a(new f02(23, this));
    }

    private final void createBinds() {
        deb1.c(this, new f(this, null));
        deb1.c(this, new h(this, null));
    }

    public static /* synthetic */ void getViewBinding$annotations() {
    }

    private final void setInsetsListener() {
        View root = getViewBinding().getRoot();
        m6 m6Var = new m6(12, this);
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ViewCompat$Api21Impl.o(root, m6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n751 setInsetsListener$lambda$1(BaseFragment baseFragment, View view, n751 n751Var) {
        baseFragment.updateLayoutWith(n751Var.a.g(519));
        return n751Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vc5 viewModel_delegate$lambda$0(BaseFragment baseFragment) {
        return (vc5) new ls31(baseFragment, baseFragment.getViewModelFactory()).b(baseFragment.getViewModelClass());
    }

    public final o2v getBaseActivity() {
        xx60 activity = getActivity();
        if (activity instanceof o2v) {
            return (o2v) activity;
        }
        return null;
    }

    public abstract tls getBindingBinder();

    public final CryptoSdkDesign getCryptoSdkDesign() {
        DesignOptions designOptions = getDesignOptions();
        CustomDesignOptions customDesignOptions = designOptions instanceof CustomDesignOptions ? (CustomDesignOptions) designOptions : null;
        if (customDesignOptions != null) {
            return customDesignOptions.getCryptoSdkDesign();
        }
        return null;
    }

    public final DesignOptions getDesignOptions() {
        DesignOptions designOptions = this.designOptions;
        if (designOptions != null) {
            return designOptions;
        }
        return null;
    }

    public final VideoResolutionRestrictions getVideoResolutionRestrictions() {
        VideoResolutionRestrictions videoResolutionRestrictions = this.videoResolutionRestrictions;
        if (videoResolutionRestrictions != null) {
            return videoResolutionRestrictions;
        }
        return null;
    }

    public final VB getViewBinding() {
        return (VB) this.binding;
    }

    public final VM getViewModel() {
        return (VM) this.viewModel.getValue();
    }

    public abstract Class<VM> getViewModelClass();

    public final hs31 getViewModelFactory() {
        hs31 hs31Var = this.viewModelFactory;
        if (hs31Var != null) {
            return hs31Var;
        }
        return null;
    }

    public void initView(View view, Bundle savedInstanceState) {
        this.binding = (zo31) getBindingBinder().invoke(view);
        createBinds();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.binding = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        o2v baseActivity = getBaseActivity();
        if (baseActivity != null && baseActivity.injectFragment(this)) {
            initView(view, savedInstanceState);
        }
        setInsetsListener();
    }

    public void onViewEffect(xs11 effect) {
    }

    public abstract void onViewStateChanged(State state);

    public final void setDesignOptions(DesignOptions designOptions) {
        this.designOptions = designOptions;
    }

    public final void setVideoResolutionRestrictions(VideoResolutionRestrictions videoResolutionRestrictions) {
        this.videoResolutionRestrictions = videoResolutionRestrictions;
    }

    public final void setViewModelFactory(hs31 hs31Var) {
        this.viewModelFactory = hs31Var;
    }

    public void updateLayoutWith(u1w insets) {
        FragmentActivity requireActivity = requireActivity();
        BaseActivity baseActivity = requireActivity instanceof BaseActivity ? (BaseActivity) requireActivity : null;
        if (baseActivity != null) {
            baseActivity.updateStatusBarDesign();
        }
    }
}
