package ru.rt.ebs.cryptosdk.presentation.esiaAuth;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.bbo;
import defpackage.cbo;
import defpackage.ds31;
import defpackage.dzm;
import defpackage.ebo;
import defpackage.fjn;
import defpackage.jl40;
import defpackage.jm91;
import defpackage.scc;
import defpackage.t5s0;
import defpackage.tje;
import defpackage.tls;
import defpackage.u1w;
import defpackage.u2v;
import defpackage.uh91;
import defpackage.ut41;
import defpackage.vao;
import defpackage.wao;
import defpackage.wt41;
import defpackage.xoh0;
import defpackage.xs11;
import defpackage.xt41;
import defpackage.yao;
import defpackage.zao;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.core.logging.EbsLogger;
import ru.rt.ebs.cryptosdk.core.verification.esia.system.EsiaAuthWebClient;
import ru.rt.ebs.cryptosdk.presentation.base.EbsSdkBaseFragment;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableHeader;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableTextView;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 22\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00013B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010#\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0014¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\f2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+R&\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020-0,8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00064"}, d2 = {"Lru/rt/ebs/cryptosdk/presentation/esiaAuth/EsiaAuthEbsFragment;", "Lru/rt/ebs/cryptosdk/presentation/base/EbsSdkBaseFragment;", "Lcbo;", "Lebo;", "Lfjn;", "<init>", "()V", "", "getIsNeededClearEsiaSessionValue", "()Z", "Landroid/net/Uri;", LaunchBrowserActivity.KEY_URI, "Lzy11;", "openLinkInBrowser", "(Landroid/net/Uri;)V", "", "redirectFrom", "redirectTo", "changeUrlByRedirect", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/Class;", "getViewModelClass", "()Ljava/lang/Class;", "", "Lu2v;", "getCustomizableViews", "()Ljava/util/List;", "Lu1w;", "insets", "updateLayoutWith", "(Lu1w;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", ClidProvider.STATE, "onViewStateChanged", "(Lcbo;)V", "Lxs11;", "effect", "onViewEffect", "(Lxs11;)V", "Lkotlin/Function1;", "Lzo31;", "bindingBinder", "Ltls;", "getBindingBinder", "()Ltls;", "Companion", "bbo", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EsiaAuthEbsFragment extends EbsSdkBaseFragment<cbo, ebo, fjn> {
    private static final String ARG_IS_NEEDED_CLEAR_ESIA_SESSION_KEY = "ARG_IS_NEEDED_CLEAR_ESIA_SESSION";
    public static final bbo Companion = new bbo();
    private final tls bindingBinder;

    public EsiaAuthEbsFragment() {
        super(xoh0.ebs_frag_esia_auth);
        this.bindingBinder = a.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void changeUrlByRedirect(String redirectFrom, String redirectTo) {
        WebView webView = ((fjn) getViewBinding()).f;
        if (jl40.l(webView.getUrl(), redirectFrom)) {
            webView.loadUrl(redirectTo);
        }
    }

    private final boolean getIsNeededClearEsiaSessionValue() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean(ARG_IS_NEEDED_CLEAR_ESIA_SESSION_KEY);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 initView$lambda$1(EsiaAuthEbsFragment esiaAuthEbsFragment, View view) {
        ((ebo) esiaAuthEbsFragment.getViewModel()).f0(new t5s0(null));
        return zy11.a;
    }

    private final void openLinkInBrowser(Uri uri) {
        try {
            startActivity(new Intent("android.intent.action.VIEW", uri));
        } catch (ActivityNotFoundException e) {
            EbsLogger.INSTANCE.error(e);
        }
    }

    @Override // ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public tls getBindingBinder() {
        return this.bindingBinder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.rt.ebs.cryptosdk.presentation.base.EbsSdkBaseFragment
    public List<u2v> getCustomizableViews() {
        fjn fjnVar = (fjn) getViewBinding();
        return scc.g(fjnVar.b, fjnVar.d, fjnVar.c, fjnVar.e);
    }

    @Override // ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public Class<ebo> getViewModelClass() {
        return ebo.class;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.rt.ebs.cryptosdk.presentation.base.EbsSdkBaseFragment, ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        super.initView(view, savedInstanceState);
        ((fjn) getViewBinding()).b.setOnCancelButtonClickListener(new dzm(9, this));
        ((ebo) getViewModel()).f0(yao.a);
        ebo eboVar = (ebo) getViewModel();
        eboVar.getClass();
        tje.N(ds31.a(eboVar), null, null, new c(eboVar, null), 3);
        tje.N(ds31.a(eboVar), null, null, new f(eboVar, null), 3);
    }

    @Override // ru.rt.ebs.cryptosdk.presentation.base.EbsSdkBaseFragment, ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public void onViewEffect(xs11 effect) {
        if (effect instanceof wao) {
            openLinkInBrowser(((wao) effect).a);
        } else if (!(effect instanceof vao)) {
            super.onViewEffect(effect);
        } else {
            vao vaoVar = (vao) effect;
            changeUrlByRedirect(vaoVar.a, vaoVar.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public void onViewStateChanged(cbo state) {
        fjn fjnVar = (fjn) getViewBinding();
        jm91 jm91Var = state.a;
        boolean l = jl40.l(jm91Var, xt41.b);
        CustomizableTextView customizableTextView = fjnVar.e;
        WebView webView = fjnVar.f;
        customizableTextView.setText(state.b);
        fjnVar.d.setVisibility(!l ? 0 : 8);
        uh91.f(webView, l);
        if (jm91Var instanceof ut41) {
            if (getActivity() != null) {
                ut41 ut41Var = (ut41) jm91Var;
                EsiaAuthWebClient.INSTANCE.initWebView(requireContext(), webView, ut41Var.b, ut41Var.c, getIsNeededClearEsiaSessionValue());
                ((ebo) getViewModel()).f0(zao.a);
                return;
            }
            return;
        }
        if (jm91Var instanceof wt41) {
            webView.loadUrl(((wt41) jm91Var).b);
        } else if (jl40.l(jm91Var, xt41.c)) {
            webView.stopLoading();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.rt.ebs.cryptosdk.presentation.base.BaseFragment
    public void updateLayoutWith(u1w insets) {
        CustomizableHeader customizableHeader = ((fjn) getViewBinding()).b;
        customizableHeader.setPadding(customizableHeader.getPaddingLeft(), insets.b, customizableHeader.getPaddingRight(), customizableHeader.getPaddingBottom());
        super.updateLayoutWith(insets);
    }
}
