package ru.rt.ebs.cryptosdk.presentation.verification;

import android.os.Bundle;
import defpackage.g3v;
import defpackage.jl40;
import defpackage.o3;
import defpackage.sch0;
import defpackage.tjn;
import defpackage.tls;
import defpackage.ujn;
import defpackage.vjn;
import defpackage.win;
import defpackage.wjn;
import defpackage.xoh0;
import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.presentation.base.BaseActivity;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001e2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R&\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00178\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lru/rt/ebs/cryptosdk/presentation/verification/EbsVerificationActivity;", "Lru/rt/ebs/cryptosdk/presentation/base/BaseActivity;", "Lvjn;", "Lwjn;", "Lwin;", "<init>", "()V", "Ljava/lang/Class;", "getViewModelClass", "()Ljava/lang/Class;", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", ClidProvider.STATE, "onViewStateChanged", "(Lvjn;)V", "Lg3v;", "navigator", "Lg3v;", "getNavigator", "()Lg3v;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "Lzo31;", "bindingBinder", "Ltls;", "getBindingBinder", "()Ltls;", "Companion", "tjn", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EbsVerificationActivity extends BaseActivity<vjn, wjn, win> {
    public static final tjn Companion = new tjn();
    private final tls bindingBinder;
    private final g3v navigator;

    public EbsVerificationActivity() {
        super(xoh0.ebs_act_verification);
        this.navigator = new o3(this, sch0.ebs_act_verification_fl_container);
        this.bindingBinder = a.b;
    }

    @Override // ru.rt.ebs.cryptosdk.presentation.base.BaseActivity
    public tls getBindingBinder() {
        return this.bindingBinder;
    }

    @Override // ru.rt.ebs.cryptosdk.presentation.base.BaseActivity
    public g3v getNavigator() {
        return this.navigator;
    }

    @Override // ru.rt.ebs.cryptosdk.presentation.base.BaseActivity
    public Class<wjn> getViewModelClass() {
        return wjn.class;
    }

    @Override // ru.rt.ebs.cryptosdk.presentation.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        jl40.L(getWindow(), false);
        if (savedInstanceState != null) {
            return;
        }
        getViewModel().f0(ujn.a);
    }

    @Override // ru.rt.ebs.cryptosdk.presentation.base.BaseActivity
    public void onViewStateChanged(vjn state) {
    }
}
