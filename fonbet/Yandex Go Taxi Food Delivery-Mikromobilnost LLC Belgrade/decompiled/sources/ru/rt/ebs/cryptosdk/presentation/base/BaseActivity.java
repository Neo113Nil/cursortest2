package ru.rt.ebs.cryptosdk.presentation.base;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import defpackage.deb1;
import defpackage.dz2;
import defpackage.f02;
import defpackage.g3v;
import defpackage.h3v;
import defpackage.hs31;
import defpackage.i3y;
import defpackage.kzh0;
import defpackage.ls31;
import defpackage.mc50;
import defpackage.o2v;
import defpackage.o3;
import defpackage.ow4;
import defpackage.q08;
import defpackage.t1i0;
import defpackage.t2v;
import defpackage.tls;
import defpackage.tt11;
import defpackage.uqb1;
import defpackage.vc5;
import defpackage.w511;
import defpackage.wng0;
import defpackage.xs11;
import defpackage.zka1;
import defpackage.zo31;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.a;
import ru.rt.ebs.cryptosdk.EbsCryptoSdk;
import ru.rt.ebs.cryptosdk.entities.models.CryptoSdkDesign;
import ru.rt.ebs.cryptosdk.entities.models.CustomDesignOptions;
import ru.rt.ebs.cryptosdk.entities.models.DefaultDesignOptions;
import ru.rt.ebs.cryptosdk.entities.models.DesignOptions;
import ru.rt.ebs.cryptosdk.entities.models.ThemeDesignOptions;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u0003*\b\b\u0002\u0010\u0006*\u00020\u00052\u00020\u00072\u00020\bB\u0011\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH$¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00028\u0000H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u001f\u0010\u001dJ#\u0010#\u001a\u00020\"2\u0012\u0010!\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030 H\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u00020\u00112\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\"2\u0006\u0010)\u001a\u00020%H\u0004¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u0011¢\u0006\u0004\b,\u0010\u001dJ\r\u0010-\u001a\u00020\u0011¢\u0006\u0004\b-\u0010\u001dJ\u000f\u0010.\u001a\u00020\u0011H\u0002¢\u0006\u0004\b.\u0010\u001dJ\u000f\u0010/\u001a\u00020\u0011H\u0002¢\u0006\u0004\b/\u0010\u001dR\"\u00101\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u00108\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010?\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010F\u001a\u0004\u0018\u00010E8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001b\u0010P\u001a\u00028\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0018\u0010Q\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010T\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010Y\u001a\u00020V8$X¤\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR \u0010^\u001a\u000e\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020\u00050Z8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u001a\u0010b\u001a\u00028\u00028DX\u0084\u0004¢\u0006\f\u0012\u0004\ba\u0010\u001d\u001a\u0004\b_\u0010`¨\u0006c"}, d2 = {"Lru/rt/ebs/cryptosdk/presentation/base/BaseActivity;", "Ltt11;", "State", "Lvc5;", "VM", "Lzo31;", "VB", "Landroidx/appcompat/app/AppCompatActivity;", "Lo2v;", "", "layoutRes", "<init>", "(I)V", "Ljava/lang/Class;", "getViewModelClass", "()Ljava/lang/Class;", ClidProvider.STATE, "Lzy11;", "onViewStateChanged", "(Ltt11;)V", "Lxs11;", "effect", "onViewEffect", "(Lxs11;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResumeFragments", "()V", "onPause", "onDestroy", "Lru/rt/ebs/cryptosdk/presentation/base/BaseFragment;", "fragment", "", "injectFragment", "(Lru/rt/ebs/cryptosdk/presentation/base/BaseFragment;)Z", "", "value", "showCancelVerificationDialog", "(Ljava/lang/Object;)V", "obj", "inject", "(Ljava/lang/Object;)Z", "updateStatusBarDesign", "updateBiometryCapturingStatusBarDesign", "createBinds", "setTheme", "Lru/rt/ebs/cryptosdk/entities/models/DesignOptions;", "designOptions", "Lru/rt/ebs/cryptosdk/entities/models/DesignOptions;", "getDesignOptions", "()Lru/rt/ebs/cryptosdk/entities/models/DesignOptions;", "setDesignOptions", "(Lru/rt/ebs/cryptosdk/entities/models/DesignOptions;)V", "Lh3v;", "navigatorHolder", "Lh3v;", "getNavigatorHolder", "()Lh3v;", "setNavigatorHolder", "(Lh3v;)V", "Lhs31;", "viewModelFactory", "Lhs31;", "getViewModelFactory", "()Lhs31;", "setViewModelFactory", "(Lhs31;)V", "Lru/rt/ebs/cryptosdk/entities/models/CryptoSdkDesign;", "cryptoSdkDesign", "Lru/rt/ebs/cryptosdk/entities/models/CryptoSdkDesign;", "getCryptoSdkDesign", "()Lru/rt/ebs/cryptosdk/entities/models/CryptoSdkDesign;", "setCryptoSdkDesign", "(Lru/rt/ebs/cryptosdk/entities/models/CryptoSdkDesign;)V", "viewModel$delegate", "Li3y;", "getViewModel", "()Lvc5;", "viewModel", "binding", "Lzo31;", "Landroid/app/AlertDialog;", "alertDialog", "Landroid/app/AlertDialog;", "Lg3v;", "getNavigator", "()Lg3v;", "navigator", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "getBindingBinder", "()Ltls;", "bindingBinder", "getViewBinding", "()Lzo31;", "getViewBinding$annotations", "viewBinding", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class BaseActivity<State extends tt11, VM extends vc5, VB extends zo31> extends AppCompatActivity implements o2v {
    private AlertDialog alertDialog;
    private zo31 binding;
    private CryptoSdkDesign cryptoSdkDesign;
    public DesignOptions designOptions;
    public h3v navigatorHolder;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel;
    public hs31 viewModelFactory;

    public BaseActivity(int i) {
        super(i);
        this.viewModel = a.a(new f02(15, this));
    }

    private final void createBinds() {
        deb1.c(this, new b(this, null));
        deb1.c(this, new d(this, null));
    }

    public static /* synthetic */ void getViewBinding$annotations() {
    }

    private final void setTheme() {
        DesignOptions designOptions = getDesignOptions();
        if (designOptions instanceof ThemeDesignOptions) {
            setTheme(((ThemeDesignOptions) designOptions).getTheme());
            return;
        }
        if (designOptions instanceof CustomDesignOptions) {
            this.cryptoSdkDesign = ((CustomDesignOptions) designOptions).getCryptoSdkDesign();
        } else if (designOptions instanceof DefaultDesignOptions) {
            setTheme(t1i0.EbsTheme);
        } else {
            w511.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCancelVerificationDialog$lambda$2(BaseActivity baseActivity, Object obj, DialogInterface dialogInterface, int i) {
        baseActivity.getViewModel().f0(new q08(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCancelVerificationDialog$lambda$3(DialogInterface dialogInterface, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vc5 viewModel_delegate$lambda$0(BaseActivity baseActivity) {
        return (vc5) new ls31(baseActivity, baseActivity.getViewModelFactory()).b(baseActivity.getViewModelClass());
    }

    public abstract tls getBindingBinder();

    public final CryptoSdkDesign getCryptoSdkDesign() {
        return this.cryptoSdkDesign;
    }

    public final DesignOptions getDesignOptions() {
        DesignOptions designOptions = this.designOptions;
        if (designOptions != null) {
            return designOptions;
        }
        return null;
    }

    public abstract g3v getNavigator();

    public final h3v getNavigatorHolder() {
        h3v h3vVar = this.navigatorHolder;
        if (h3vVar != null) {
            return h3vVar;
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

    public final boolean inject(Object obj) {
        try {
            EbsCryptoSdk.INSTANCE.inject$cryptosdk_prodRelease(obj);
            return true;
        } catch (Exception unused) {
            setResult(-1, null);
            finish();
            return false;
        }
    }

    @Override // defpackage.o2v
    public boolean injectFragment(BaseFragment<?, ?, ?> fragment) {
        return inject(fragment);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        if (inject(this)) {
            setTheme();
            this.binding = (zo31) getBindingBinder().invoke(getLayoutInflater());
            createBinds();
        }
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        AlertDialog alertDialog = this.alertDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this.alertDialog = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        ((mc50) getNavigatorHolder()).a = null;
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void onResumeFragments() {
        super.onResumeFragments();
        h3v navigatorHolder = getNavigatorHolder();
        g3v navigator = getNavigator();
        mc50 mc50Var = (mc50) navigatorHolder;
        mc50Var.a = navigator;
        ArrayList arrayList = mc50Var.b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((o3) navigator).n((t2v[]) it.next());
        }
        arrayList.clear();
    }

    public void onViewEffect(xs11 effect) {
    }

    public abstract void onViewStateChanged(State state);

    public final void setCryptoSdkDesign(CryptoSdkDesign cryptoSdkDesign) {
        this.cryptoSdkDesign = cryptoSdkDesign;
    }

    public final void setDesignOptions(DesignOptions designOptions) {
        this.designOptions = designOptions;
    }

    public final void setNavigatorHolder(h3v h3vVar) {
        this.navigatorHolder = h3vVar;
    }

    public final void setViewModelFactory(hs31 hs31Var) {
        this.viewModelFactory = hs31Var;
    }

    @Override // defpackage.o2v
    public void showCancelVerificationDialog(Object value) {
        CryptoSdkDesign cryptoSdkDesign = this.cryptoSdkDesign;
        this.alertDialog = (cryptoSdkDesign != null ? new AlertDialog.Builder(this, cryptoSdkDesign.getAlertDialogStyle()) : new AlertDialog.Builder(this)).setTitle(kzh0.ebssdk_cancel_verification_title).setMessage(kzh0.ebssdk_cancel_verification_message).setPositiveButton(kzh0.ebssdk_interrupt_btn_text, new ow4(0, this, value)).setNegativeButton(kzh0.ebssdk_cancel_btn_text, new dz2(1)).show();
    }

    public final void updateBiometryCapturingStatusBarDesign() {
        CryptoSdkDesign cryptoSdkDesign = this.cryptoSdkDesign;
        if (cryptoSdkDesign != null) {
            zka1.e(this, cryptoSdkDesign.isBiometryCapturingStatusBarLight());
        } else {
            zka1.e(this, uqb1.c(this, wng0.ebssdkIsBiometryCapturingStatusBarLight));
        }
    }

    public final void updateStatusBarDesign() {
        CryptoSdkDesign cryptoSdkDesign = this.cryptoSdkDesign;
        if (cryptoSdkDesign != null) {
            zka1.e(this, cryptoSdkDesign.isStatusBarLight());
        } else {
            zka1.e(this, uqb1.c(this, wng0.ebssdkIsStatusBarLight));
        }
    }
}
