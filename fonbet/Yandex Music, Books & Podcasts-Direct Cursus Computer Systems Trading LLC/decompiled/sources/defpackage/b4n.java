package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.appcompat.widget.Toolbar;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.ui.view.YaRotatingProgress;
import ru.yandex.music.utils.Preconditions;

/* loaded from: classes5.dex */
public class b4n extends bf6 {
    public zh k;
    public a4n l;
    public String m;
    public String n;
    public cr o;

    @Override // defpackage.bf6, defpackage.jnb, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.m = Preconditions.nonEmpty(arguments.getString("arg.concertId"));
        this.n = Preconditions.nonEmpty(arguments.getString("arg.dataSessionId"));
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        if (Intrinsics.d(((ogs) ((byb) qdcVar.C(I)).c(ern.a(ogs.class))).b(), "on")) {
            this.k = requireActivity().registerForActivityResult(new vh(3), new gi(9, this));
            this.l = new a4n(requireActivity(), this.k);
        }
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.general_webview_layout, viewGroup, false);
    }

    @Override // androidx.fragment.app.o
    public final void onDestroyView() {
        super.onDestroyView();
        cr crVar = this.o;
        crVar.d = null;
        ((yiq) crVar.f).V();
    }

    @Override // defpackage.jnb, androidx.fragment.app.o
    public final void onSaveInstanceState(Bundle bundle) {
        WebView webView;
        super.onSaveInstanceState(bundle);
        cr crVar = this.o;
        crVar.getClass();
        iwe iweVar = (iwe) crVar.d;
        if (iweVar == null || (webView = (WebView) iweVar.b) == null) {
            return;
        }
        webView.saveState(bundle);
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.o = new cr(getContext(), this.n);
        Context context = getContext();
        iwe iweVar = new iwe(18, false);
        WebView webView = (WebView) view.findViewById(R.id.web_view);
        iweVar.b = webView;
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        iweVar.c = (YaRotatingProgress) view.findViewById(R.id.progress);
        toolbar.setTitle(R.string.buy_ticket_window_title);
        ((hq0) sj2.F(context)).setSupportActionBar(toolbar);
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        if (Intrinsics.d(((ogs) ((byb) qdcVar.C(I)).c(ern.a(ogs.class))).b(), "on")) {
            webView.setDownloadListener(this.l);
        }
        cr crVar = this.o;
        crVar.getClass();
        crVar.d = iweVar;
        if (bundle != null && webView != null) {
            webView.restoreState(bundle);
        }
        iwe iweVar2 = (iwe) crVar.d;
        iweVar2.getClass();
        WebView webView2 = (WebView) iweVar2.b;
        webView2.getClass();
        webView2.setWebViewClient((d4n) crVar.h);
        WebSettings settings = webView2.getSettings();
        settings.getClass();
        settings.setJavaScriptEnabled(true);
        settings.setBuiltInZoomControls(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        iwe iweVar3 = (iwe) crVar.d;
        if (iweVar3 != null) {
            WebView webView3 = (WebView) iweVar3.b;
            webView3.getClass();
            webView3.setWebViewClient((d4n) crVar.h);
            WebSettings settings2 = webView3.getSettings();
            settings2.getClass();
            settings2.setJavaScriptEnabled(true);
            settings2.setBuiltInZoomControls(true);
            settings2.setDomStorageEnabled(true);
            settings2.setDatabaseEnabled(true);
        }
        iwe iweVar4 = (iwe) crVar.d;
        if (iweVar4 != null) {
            YaRotatingProgress yaRotatingProgress = (YaRotatingProgress) iweVar4.c;
            yaRotatingProgress.d = false;
            yaRotatingProgress.removeCallbacks(yaRotatingProgress.f);
            if (!yaRotatingProgress.c) {
                yaRotatingProgress.b = -1L;
                yaRotatingProgress.c = true;
                yaRotatingProgress.postDelayed(yaRotatingProgress.e, 300L);
            }
        }
        jyr jyrVar = lp.a;
        String uri = lp.a((String) crVar.c).toString();
        uri.getClass();
        x97.y((mm6) crVar.g, null, null, new s1n(crVar, uri, (Continuation) null, 4), 3);
        qdq.d(view, false, true, false, true);
    }

    @Override // defpackage.jnb
    /* renamed from: z */
    public final cvo getK() {
        wjb wjbVar = wjb.ConcertPurchaseScreen;
        hlb hlbVar = hlb.Fullscreen;
        glb glbVar = glb.Fullscreen;
        return new cvo(wjbVar, new dvo(""), new avo(pkb.Concert, this.m));
    }
}
