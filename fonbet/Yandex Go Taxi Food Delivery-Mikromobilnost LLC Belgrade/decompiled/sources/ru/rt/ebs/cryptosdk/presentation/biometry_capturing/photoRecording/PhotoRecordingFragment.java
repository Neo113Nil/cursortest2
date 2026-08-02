package ru.rt.ebs.cryptosdk.presentation.biometry_capturing.photoRecording;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.bib0;
import defpackage.cj91;
import defpackage.dib0;
import defpackage.ds31;
import defpackage.eib0;
import defpackage.fx00;
import defpackage.gib0;
import defpackage.hao;
import defpackage.hib0;
import defpackage.ijn;
import defpackage.jib0;
import defpackage.jl40;
import defpackage.kib0;
import defpackage.kzh0;
import defpackage.lgb0;
import defpackage.lib0;
import defpackage.ngb0;
import defpackage.ogb0;
import defpackage.oib0;
import defpackage.pgb0;
import defpackage.rjn;
import defpackage.scc;
import defpackage.t5s0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tyg0;
import defpackage.u1w;
import defpackage.u2v;
import defpackage.uh91;
import defpackage.xoh0;
import defpackage.yj70;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.common.webview.EbsSdkJavaScriptInterface$Companion$setEbsSdkJavaScriptInterface$1;
import ru.rt.ebs.cryptosdk.core.common.entities.exceptions.PermissionDeniedEbsException;
import ru.rt.ebs.cryptosdk.presentation.biometry_capturing.base.BaseBiometryCapturingFragment;
import ru.rt.ebs.cryptosdk.presentation.biometry_capturing.photoRecording.PhotoRecordingFragment;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableButton;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableHeader;
import ru.rt.ebs.cryptosdk.presentation.customView.ProcessingWidget;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 #2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u0006R&\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001e0\u001d8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lru/rt/ebs/cryptosdk/presentation/biometry_capturing/photoRecording/PhotoRecordingFragment;", "Lru/rt/ebs/cryptosdk/presentation/biometry_capturing/base/BaseBiometryCapturingFragment;", "Llib0;", "Loib0;", "Lijn;", "<init>", "()V", "Ljava/lang/Class;", "getViewModelClass", "()Ljava/lang/Class;", "", "Lu2v;", "getCustomizableViews", "()Ljava/util/List;", "Lu1w;", "insets", "Lzy11;", "updateLayoutWith", "(Lu1w;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", ClidProvider.STATE, "onViewStateChanged", "(Llib0;)V", "onPause", "Lkotlin/Function1;", "Lzo31;", "bindingBinder", "Ltls;", "getBindingBinder", "()Ltls;", "Companion", "jib0", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PhotoRecordingFragment extends BaseBiometryCapturingFragment<lib0, oib0, ijn> {
    public static final jib0 Companion = new jib0();
    private final tls bindingBinder;

    public PhotoRecordingFragment() {
        super(xoh0.ebs_frag_photo_recording);
        this.bindingBinder = a.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ ijn access$getViewBinding(PhotoRecordingFragment photoRecordingFragment) {
        return (ijn) photoRecordingFragment.getViewBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ oib0 access$getViewModel(PhotoRecordingFragment photoRecordingFragment) {
        return (oib0) photoRecordingFragment.getViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 initView$lambda$5$lambda$1(PhotoRecordingFragment photoRecordingFragment, View view) {
        ((oib0) photoRecordingFragment.getViewModel()).f0(new t5s0(null));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 initView$lambda$5$lambda$2(PhotoRecordingFragment photoRecordingFragment, View view) {
        ((oib0) photoRecordingFragment.getViewModel()).f0(gib0.a);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initView$lambda$5$lambda$3(PhotoRecordingFragment photoRecordingFragment, ijn ijnVar, View view) {
        ((oib0) photoRecordingFragment.getViewModel()).f0(new hib0(ijnVar.f.getBitmap()));
    }

    @Override // ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public tls getBindingBinder() {
        return this.bindingBinder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.rt.ebs.cryptosdk.presentation.base.EbsSdkBaseFragment
    public List<u2v> getCustomizableViews() {
        ijn ijnVar = (ijn) getViewBinding();
        return scc.g(ijnVar.d, ijnVar.b, ijnVar.h, ijnVar.i);
    }

    @Override // ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public Class<oib0> getViewModelClass() {
        return oib0.class;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.rt.ebs.cryptosdk.presentation.base.EbsSdkBaseFragment, ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        super.initView(view, savedInstanceState);
        oib0 oib0Var = (oib0) getViewModel();
        oib0Var.getClass();
        tje.N(ds31.a(oib0Var), null, null, new c(oib0Var, null), 3);
        tje.N(ds31.a(oib0Var), null, null, new f(oib0Var, null), 3);
        yj70 yj70Var = new yj70(this);
        final kib0 kib0Var = new kib0(this);
        ijn ijnVar = (ijn) getViewBinding();
        ijnVar.f.setImplementationMode(PreviewView.ImplementationMode.COMPATIBLE);
        CustomizableButton customizableButton = ijnVar.b;
        customizableButton.setText(getString(kzh0.ebssdk_done_btn_text));
        CustomizableHeader customizableHeader = ijnVar.d;
        final int i = 0;
        customizableHeader.setOnCancelButtonClickListener(new tls(this) { // from class: iib0
            public final /* synthetic */ PhotoRecordingFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zy11 initView$lambda$5$lambda$1;
                zy11 initView$lambda$5$lambda$2;
                int i2 = i;
                PhotoRecordingFragment photoRecordingFragment = this.b;
                View view2 = (View) obj;
                switch (i2) {
                    case 0:
                        initView$lambda$5$lambda$1 = PhotoRecordingFragment.initView$lambda$5$lambda$1(photoRecordingFragment, view2);
                        return initView$lambda$5$lambda$1;
                    default:
                        initView$lambda$5$lambda$2 = PhotoRecordingFragment.initView$lambda$5$lambda$2(photoRecordingFragment, view2);
                        return initView$lambda$5$lambda$2;
                }
            }
        });
        final int i2 = 1;
        customizableHeader.setOnActionButtonClickListener(new tls(this) { // from class: iib0
            public final /* synthetic */ PhotoRecordingFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zy11 initView$lambda$5$lambda$1;
                zy11 initView$lambda$5$lambda$2;
                int i22 = i2;
                PhotoRecordingFragment photoRecordingFragment = this.b;
                View view2 = (View) obj;
                switch (i22) {
                    case 0:
                        initView$lambda$5$lambda$1 = PhotoRecordingFragment.initView$lambda$5$lambda$1(photoRecordingFragment, view2);
                        return initView$lambda$5$lambda$1;
                    default:
                        initView$lambda$5$lambda$2 = PhotoRecordingFragment.initView$lambda$5$lambda$2(photoRecordingFragment, view2);
                        return initView$lambda$5$lambda$2;
                }
            }
        });
        customizableHeader.setActionButtonIcon(Integer.valueOf(tyg0.ebssdk_ic_update));
        customizableButton.setOnClickListener(new fx00(21, this, ijnVar));
        WebView webView = ijnVar.j;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new EbsSdkJavaScriptInterface$Companion$setEbsSdkJavaScriptInterface$1(yj70Var));
        webView.setBackgroundColor(0);
        webView.addJavascriptInterface(new rjn(yj70Var), "Android");
        try {
            ArrayList b = uh91.b(requireContext(), Collections.singletonList("android.permission.CAMERA"));
            if (!uh91.c(b)) {
                throw new PermissionDeniedEbsException(uh91.e(b));
            }
            PreviewView previewView = ((ijn) getViewBinding()).f;
            if (!previewView.isLaidOut() || previewView.isLayoutRequested()) {
                previewView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.rt.ebs.cryptosdk.presentation.biometry_capturing.photoRecording.PhotoRecordingFragment$initView$lambda$5$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        view2.removeOnLayoutChangeListener(this);
                        PhotoRecordingFragment.access$getViewModel(PhotoRecordingFragment.this).f0(new bib0(kib0Var));
                    }
                });
            } else {
                access$getViewModel(this).f0(new bib0(kib0Var));
            }
        } catch (Exception e) {
            ((oib0) getViewModel()).f0(new hao(e));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        ((oib0) getViewModel()).f0(dib0.a);
        super.onPause();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public void onViewStateChanged(lib0 state) {
        ijn ijnVar = (ijn) getViewBinding();
        cj91 cj91Var = state.a;
        boolean z = jl40.l(cj91Var, pgb0.b) || (cj91Var instanceof lgb0);
        WebView webView = ijnVar.j;
        WebView webView2 = ijnVar.j;
        ProcessingWidget processingWidget = ijnVar.h;
        ImageView imageView = ijnVar.e;
        uh91.f(webView, z);
        uh91.f(ijnVar.b, z);
        boolean z2 = cj91Var instanceof lgb0;
        uh91.f(imageView, z2);
        ijnVar.d.showOrHideActionButton(cj91Var instanceof pgb0);
        if (cj91Var instanceof ngb0) {
            webView2.loadDataWithBaseURL(null, ((ngb0) cj91Var).b, "text/html", "UTF-8", null);
        } else if (cj91Var instanceof ogb0) {
            webView2.evaluateJavascript("javascript:init('" + ((ogb0) cj91Var).b + "')", null);
            ((oib0) getViewModel()).f0(eib0.a);
        } else if (z2) {
            imageView.setImageBitmap(((lgb0) cj91Var).b);
        }
        ijnVar.i.setVisibility(state.e ? 0 : 8);
        processingWidget.setVisibility(state.d ? 0 : 8);
        processingWidget.setTitleRes(state.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.rt.ebs.cryptosdk.presentation.biometry_capturing.base.BaseBiometryCapturingFragment, ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public void updateLayoutWith(u1w insets) {
        CustomizableHeader customizableHeader = ((ijn) getViewBinding()).d;
        int i = insets.b;
        customizableHeader.setPadding(customizableHeader.getPaddingLeft(), i, customizableHeader.getPaddingRight(), customizableHeader.getPaddingBottom());
        FrameLayout frameLayout = ((ijn) getViewBinding()).g;
        frameLayout.setPaddingRelative(frameLayout.getPaddingStart(), i, frameLayout.getPaddingEnd(), frameLayout.getPaddingBottom());
        ConstraintLayout constraintLayout = ((ijn) getViewBinding()).c;
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), insets.d);
        super.updateLayoutWith(insets);
    }
}
