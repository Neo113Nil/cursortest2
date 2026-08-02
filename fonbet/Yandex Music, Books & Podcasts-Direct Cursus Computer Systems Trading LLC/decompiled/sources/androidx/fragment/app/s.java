package androidx.fragment.app;

import android.view.View;
import android.view.Window;
import androidx.core.app.v0;
import androidx.core.app.w0;
import defpackage.euc;
import defpackage.fi;
import defpackage.hyh;
import defpackage.jfu;
import defpackage.ji;
import defpackage.jxh;
import defpackage.kfu;
import defpackage.nyf;
import defpackage.ptc;
import defpackage.qpj;
import defpackage.rpj;
import defpackage.tpj;
import defpackage.uoo;
import defpackage.woo;
import defpackage.wqj;
import defpackage.xa6;

/* loaded from: classes.dex */
public final class s extends ptc implements tpj, wqj, v0, w0, kfu, rpj, ji, woo, euc, jxh {
    public final /* synthetic */ t e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar) {
        super(tVar);
        this.e = tVar;
    }

    @Override // defpackage.euc
    public final void a(y yVar, o oVar) {
        this.e.onAttachFragment(oVar);
    }

    @Override // defpackage.jxh
    public final void addMenuProvider(hyh hyhVar) {
        this.e.addMenuProvider(hyhVar);
    }

    @Override // defpackage.tpj
    public final void addOnConfigurationChangedListener(xa6 xa6Var) {
        this.e.addOnConfigurationChangedListener(xa6Var);
    }

    @Override // androidx.core.app.v0
    public final void addOnMultiWindowModeChangedListener(xa6 xa6Var) {
        this.e.addOnMultiWindowModeChangedListener(xa6Var);
    }

    @Override // androidx.core.app.w0
    public final void addOnPictureInPictureModeChangedListener(xa6 xa6Var) {
        this.e.addOnPictureInPictureModeChangedListener(xa6Var);
    }

    @Override // defpackage.wqj
    public final void addOnTrimMemoryListener(xa6 xa6Var) {
        this.e.addOnTrimMemoryListener(xa6Var);
    }

    @Override // defpackage.ltc
    public final View b(int i) {
        return this.e.findViewById(i);
    }

    @Override // defpackage.ltc
    public final boolean c() {
        Window window = this.e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.ji
    public final fi getActivityResultRegistry() {
        return this.e.getActivityResultRegistry();
    }

    @Override // defpackage.dzf
    public final nyf getLifecycle() {
        return this.e.mFragmentLifecycleRegistry;
    }

    @Override // defpackage.rpj
    public final qpj getOnBackPressedDispatcher() {
        return this.e.getOnBackPressedDispatcher();
    }

    @Override // defpackage.woo
    public final uoo getSavedStateRegistry() {
        return this.e.getSavedStateRegistry();
    }

    @Override // defpackage.kfu
    public final jfu getViewModelStore() {
        return this.e.getViewModelStore();
    }

    @Override // defpackage.jxh
    public final void removeMenuProvider(hyh hyhVar) {
        this.e.removeMenuProvider(hyhVar);
    }

    @Override // defpackage.tpj
    public final void removeOnConfigurationChangedListener(xa6 xa6Var) {
        this.e.removeOnConfigurationChangedListener(xa6Var);
    }

    @Override // androidx.core.app.v0
    public final void removeOnMultiWindowModeChangedListener(xa6 xa6Var) {
        this.e.removeOnMultiWindowModeChangedListener(xa6Var);
    }

    @Override // androidx.core.app.w0
    public final void removeOnPictureInPictureModeChangedListener(xa6 xa6Var) {
        this.e.removeOnPictureInPictureModeChangedListener(xa6Var);
    }

    @Override // defpackage.wqj
    public final void removeOnTrimMemoryListener(xa6 xa6Var) {
        this.e.removeOnTrimMemoryListener(xa6Var);
    }
}
