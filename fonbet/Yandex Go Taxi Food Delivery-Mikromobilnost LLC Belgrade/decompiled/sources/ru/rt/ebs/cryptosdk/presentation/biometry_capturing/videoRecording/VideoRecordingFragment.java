package ru.rt.ebs.cryptosdk.presentation.biometry_capturing.videoRecording;

import android.animation.Animator;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.aj31;
import defpackage.ds31;
import defpackage.eg01;
import defpackage.fl31;
import defpackage.fz5;
import defpackage.gl31;
import defpackage.hao;
import defpackage.hl31;
import defpackage.il31;
import defpackage.jl31;
import defpackage.jl40;
import defpackage.kl31;
import defpackage.kn31;
import defpackage.kzh0;
import defpackage.mjn;
import defpackage.mn31;
import defpackage.nn31;
import defpackage.on31;
import defpackage.qn31;
import defpackage.rjn;
import defpackage.rn31;
import defpackage.scc;
import defpackage.sn31;
import defpackage.t5s0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tn31;
import defpackage.tyg0;
import defpackage.u1w;
import defpackage.u2v;
import defpackage.uh91;
import defpackage.un31;
import defpackage.vn31;
import defpackage.w511;
import defpackage.xoh0;
import defpackage.y7z0;
import defpackage.yn31;
import defpackage.ys11;
import defpackage.z2a1;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONObject;
import ru.rt.ebs.cryptosdk.common.webview.EbsSdkJavaScriptInterface$Companion$setEbsSdkJavaScriptInterface$1;
import ru.rt.ebs.cryptosdk.core.common.entities.exceptions.PermissionDeniedEbsException;
import ru.rt.ebs.cryptosdk.presentation.biometry_capturing.base.BaseBiometryCapturingFragment;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableButton;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableHeader;
import ru.rt.ebs.cryptosdk.presentation.customView.TimerIndicatorView;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 /2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00010B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010#\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0014¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\tH\u0016¢\u0006\u0004\b'\u0010\u0006J\u000f\u0010(\u001a\u00020\tH\u0016¢\u0006\u0004\b(\u0010\u0006R&\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020*0)8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00061"}, d2 = {"Lru/rt/ebs/cryptosdk/presentation/biometry_capturing/videoRecording/VideoRecordingFragment;", "Lru/rt/ebs/cryptosdk/presentation/biometry_capturing/base/BaseBiometryCapturingFragment;", "Lvn31;", "Lyn31;", "Lmjn;", "<init>", "()V", "Landroid/graphics/Bitmap;", "bitmap", "Lzy11;", "showCameraPreviewBitmap", "(Landroid/graphics/Bitmap;)V", "", "isVisible", "showContent", "(Z)V", "Lkl31;", ClidProvider.STATE, "setVideoCapturingState", "(Lkl31;)V", "Ljava/lang/Class;", "getViewModelClass", "()Ljava/lang/Class;", "", "Lu2v;", "getCustomizableViews", "()Ljava/util/List;", "Lu1w;", "insets", "updateLayoutWith", "(Lu1w;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "onViewStateChanged", "(Lvn31;)V", "onResume", "onPause", "Lkotlin/Function1;", "Lzo31;", "bindingBinder", "Ltls;", "getBindingBinder", "()Ltls;", "Companion", "un31", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class VideoRecordingFragment extends BaseBiometryCapturingFragment<vn31, yn31, mjn> {
    public static final un31 Companion = new un31();
    private final tls bindingBinder;

    public VideoRecordingFragment() {
        super(xoh0.ebs_frag_video_recording);
        this.bindingBinder = a.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ mjn access$getViewBinding(VideoRecordingFragment videoRecordingFragment) {
        return (mjn) videoRecordingFragment.getViewBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ yn31 access$getViewModel(VideoRecordingFragment videoRecordingFragment) {
        return (yn31) videoRecordingFragment.getViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 initView$lambda$3$lambda$1(VideoRecordingFragment videoRecordingFragment, View view) {
        ((yn31) videoRecordingFragment.getViewModel()).f0(new t5s0(null));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 initView$lambda$3$lambda$2(VideoRecordingFragment videoRecordingFragment, View view) {
        ((yn31) videoRecordingFragment.getViewModel()).f0(rn31.a);
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final zy11 onViewStateChanged$lambda$6(VideoRecordingFragment videoRecordingFragment) {
        ((mjn) videoRecordingFragment.getViewBinding()).d.setVisibility(4);
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setVideoCapturingState(kl31 state) {
        Object obj;
        mjn mjnVar = (mjn) getViewBinding();
        boolean z = state instanceof fl31;
        int i = (z || (state instanceof gl31)) ? kzh0.ebssdk_done_btn_text : kzh0.ebssdk_start_btn_text;
        boolean z2 = state instanceof jl31;
        if (z2) {
            obj = qn31.a;
        } else if (z) {
            obj = mn31.a;
        } else {
            if (!(state instanceof il31) && !jl40.l(state, hl31.a) && !(state instanceof gl31)) {
                w511.b();
                return;
            }
            obj = fz5.b;
        }
        CustomizableHeader customizableHeader = mjnVar.f;
        CustomizableButton customizableButton = mjnVar.c;
        TimerIndicatorView timerIndicatorView = mjnVar.k;
        customizableHeader.showOrHideActionButton(z2);
        timerIndicatorView.stopTimerProgress();
        customizableButton.setText(getString(i));
        customizableButton.setOnClickListener(new y7z0(14, this, obj));
        if (state instanceof il31) {
            mjnVar.l.loadDataWithBaseURL(null, ((il31) state).a, "text/html", "UTF-8", null);
        } else if (z) {
            timerIndicatorView.setTimerProgress(((fl31) state).a, new tn31(this, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setVideoCapturingState$lambda$12$lambda$10(VideoRecordingFragment videoRecordingFragment, ys11 ys11Var, View view) {
        ((yn31) videoRecordingFragment.getViewModel()).f0(ys11Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 setVideoCapturingState$lambda$12$lambda$11(VideoRecordingFragment videoRecordingFragment, Animator animator) {
        ((yn31) videoRecordingFragment.getViewModel()).f0(mn31.a);
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showCameraPreviewBitmap(Bitmap bitmap) {
        ImageView imageView = ((mjn) getViewBinding()).d;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = bitmap.getWidth();
        layoutParams.height = bitmap.getHeight();
        imageView.setLayoutParams(layoutParams);
        imageView.setVisibility(0);
        imageView.setImageBitmap(bitmap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showContent(boolean isVisible) {
        mjn mjnVar = (mjn) getViewBinding();
        uh91.f(mjnVar.l, isVisible);
        uh91.f(mjnVar.c, isVisible);
    }

    @Override // ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public tls getBindingBinder() {
        return this.bindingBinder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.rt.ebs.cryptosdk.presentation.base.EbsSdkBaseFragment
    public List<u2v> getCustomizableViews() {
        mjn mjnVar = (mjn) getViewBinding();
        return scc.g(mjnVar.f, mjnVar.c, mjnVar.h, mjnVar.i);
    }

    @Override // ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public Class<yn31> getViewModelClass() {
        return yn31.class;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.rt.ebs.cryptosdk.presentation.base.EbsSdkBaseFragment, ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        super.initView(view, savedInstanceState);
        yn31 yn31Var = (yn31) getViewModel();
        yn31Var.getClass();
        tje.N(ds31.a(yn31Var), null, null, new e(yn31Var, null), 3);
        tje.N(ds31.a(yn31Var), null, null, new h(yn31Var, null), 3);
        eg01 eg01Var = new eg01(this);
        aj31 aj31Var = new aj31(2, this);
        mjn mjnVar = (mjn) getViewBinding();
        mjnVar.f.setOnCancelButtonClickListener(new tn31(this, 0));
        CustomizableHeader customizableHeader = mjnVar.f;
        customizableHeader.setOnActionButtonClickListener(new tn31(this, 1));
        customizableHeader.setActionButtonIcon(Integer.valueOf(tyg0.ebssdk_ic_update));
        WebView webView = mjnVar.l;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new EbsSdkJavaScriptInterface$Companion$setEbsSdkJavaScriptInterface$1(eg01Var));
        webView.setBackgroundColor(0);
        webView.addJavascriptInterface(new rjn(eg01Var), "Android");
        try {
            ArrayList b = uh91.b(requireContext(), scc.g("android.permission.CAMERA", "android.permission.RECORD_AUDIO"));
            if (!uh91.c(b)) {
                throw new PermissionDeniedEbsException(uh91.e(b));
            }
            ((yn31) getViewModel()).f0(new kn31(aj31Var, z2a1.f(requireContext(), getCryptoSdkDesign()), getVideoResolutionRestrictions()));
        } catch (Exception e) {
            ((yn31) getViewModel()).f0(new hao(e));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        ((mjn) getViewBinding()).c.setOnClickListener(null);
        ((mjn) getViewBinding()).k.stopTimerProgress();
        ((yn31) getViewModel()).f0(sn31.a);
        super.onPause();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ((yn31) getViewModel()).f0(nn31.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public void onViewStateChanged(vn31 state) {
        Bitmap bitmap;
        showContent(state.b);
        kl31 kl31Var = state.a;
        setVideoCapturingState(kl31Var);
        JSONObject jSONObject = state.c;
        if (jSONObject != null) {
            ((mjn) getViewBinding()).l.evaluateJavascript("javascript:init('" + jSONObject + "')", null);
            if (jl40.l(kl31Var, jl31.a)) {
                ((yn31) getViewModel()).f0(on31.a);
            }
        }
        gl31 gl31Var = kl31Var instanceof gl31 ? (gl31) kl31Var : null;
        if (gl31Var != null && (bitmap = gl31Var.a) != null) {
            showCameraPreviewBitmap(bitmap);
        }
        ((mjn) getViewBinding()).c.setEnabled(state.i);
        ((mjn) getViewBinding()).i.setVisibility(state.g ? 0 : 8);
        ((mjn) getViewBinding()).h.setVisibility(state.f ? 0 : 8);
        ((mjn) getViewBinding()).h.setTitleRes(state.h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.rt.ebs.cryptosdk.presentation.biometry_capturing.base.BaseBiometryCapturingFragment, ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public void updateLayoutWith(u1w insets) {
        CustomizableHeader customizableHeader = ((mjn) getViewBinding()).f;
        int i = insets.b;
        customizableHeader.setPadding(customizableHeader.getPaddingLeft(), i, customizableHeader.getPaddingRight(), customizableHeader.getPaddingBottom());
        FrameLayout frameLayout = ((mjn) getViewBinding()).b;
        frameLayout.setPaddingRelative(frameLayout.getPaddingStart(), i, frameLayout.getPaddingEnd(), frameLayout.getPaddingBottom());
        ConstraintLayout constraintLayout = ((mjn) getViewBinding()).e;
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), insets.d);
        super.updateLayoutWith(insets);
    }
}
