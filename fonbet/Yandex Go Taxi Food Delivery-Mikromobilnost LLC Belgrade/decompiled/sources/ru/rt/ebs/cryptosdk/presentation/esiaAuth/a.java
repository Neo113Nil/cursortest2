package ru.rt.ebs.cryptosdk.presentation.esiaAuth;

import android.view.View;
import android.webkit.WebView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.cma1;
import defpackage.fjn;
import defpackage.ny61;
import defpackage.sch0;
import defpackage.tls;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableHeader;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableLinearLayout;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableProgressBar;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableTextView;

/* loaded from: classes4.dex */
public final /* synthetic */ class a extends FunctionReferenceImpl implements tls {
    public static final a b = new a();

    public a() {
        super(1, 0, fjn.class, "bind", "bind(Landroid/view/View;)Lru/rt/ebs/cryptosdk/databinding/EbsFragEsiaAuthBinding;");
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        View view = (View) obj;
        int i = sch0.ebs_frag_esia_auth_header;
        CustomizableHeader customizableHeader = (CustomizableHeader) cma1.O(i, view);
        if (customizableHeader != null) {
            i = sch0.ebs_frag_esia_auth_progress;
            CustomizableProgressBar customizableProgressBar = (CustomizableProgressBar) cma1.O(i, view);
            if (customizableProgressBar != null) {
                i = sch0.ebs_frag_esia_auth_progress_container;
                CustomizableLinearLayout customizableLinearLayout = (CustomizableLinearLayout) cma1.O(i, view);
                if (customizableLinearLayout != null) {
                    i = sch0.ebs_frag_esia_auth_progress_tv_title;
                    CustomizableTextView customizableTextView = (CustomizableTextView) cma1.O(i, view);
                    if (customizableTextView != null) {
                        i = sch0.ebs_frag_esia_auth_webView;
                        WebView webView = (WebView) cma1.O(i, view);
                        if (webView != null) {
                            return new fjn((ConstraintLayout) view, customizableHeader, customizableProgressBar, customizableLinearLayout, customizableTextView, webView);
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
