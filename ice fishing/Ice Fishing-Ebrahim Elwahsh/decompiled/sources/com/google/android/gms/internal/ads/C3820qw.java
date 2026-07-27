package com.google.android.gms.internal.ads;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.consent_sdk.C4349k;
import com.google.android.gms.internal.consent_sdk.C4354l0;
import com.google.android.gms.internal.consent_sdk.C4373q;
import com.icefishing.icefishingliveapp.C5284R;
import com.icefishing.icefishingliveapp.MWebActivity;
import g1.C4523c;
import java.util.Locale;
import java.util.Objects;
import q2.C4907p;
import q2.InterfaceC4922x;

/* renamed from: com.google.android.gms.internal.ads.qw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3820qw extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33910a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33911b;

    public C3820qw(C3927sw c3927sw) {
        Objects.requireNonNull(c3927sw);
        this.f33911b = c3927sw;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        switch (this.f33910a) {
            case 1:
                int i = C4373q.f35899w;
                if (str != null && str.startsWith("consent://")) {
                    ((C4373q) this.f33911b).f35901u.e(str);
                    break;
                }
                break;
            default:
                super.onLoadResource(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        switch (this.f33910a) {
            case 1:
                C4373q c4373q = (C4373q) this.f33911b;
                if (!c4373q.f35902v) {
                    Log.d("UserMessagingPlatform", "Wall html loaded.");
                    c4373q.f35902v = true;
                    break;
                }
                break;
            case 2:
                ((MWebActivity) this.f33911b).f36968u.setVisibility(8);
                super.onPageFinished(webView, str);
                break;
            default:
                super.onPageFinished(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        switch (this.f33910a) {
            case 2:
                ((MWebActivity) this.f33911b).f36968u.setVisibility(0);
                super.onPageStarted(webView, str, bitmap);
                break;
            default:
                super.onPageStarted(webView, str, bitmap);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        switch (this.f33910a) {
            case 1:
                C4236yh c4236yh = ((C4373q) this.f33911b).f35901u;
                c4236yh.getClass();
                Locale locale = Locale.US;
                ((C4349k) c4236yh.f35383z).c(new C4354l0(2, "WebResourceError(" + i + ", " + str2 + "): " + str));
                break;
            default:
                super.onReceivedError(webView, i, str, str2);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean didCrash;
        int rendererPriorityAtExit;
        switch (this.f33910a) {
            case 0:
                String obj = renderProcessGoneDetail.toString();
                String valueOf = String.valueOf(webView);
                Log.w("NativeBridge", com.anythink.basead.b.c.i.q(new StringBuilder(String.valueOf(obj).length() + 36 + valueOf.length()), "WebView renderer gone: ", obj, "for WebView: ", valueOf));
                C3927sw c3927sw = (C3927sw) this.f33911b;
                if (c3927sw.c() == webView) {
                    Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                    c3927sw.f33235b = new Bw(null);
                }
                webView.destroy();
                return true;
            case 1:
                if (webView != null) {
                    didCrash = renderProcessGoneDetail.didCrash();
                    String str = true != didCrash ? "was stopped by system" : "crashed";
                    rendererPriorityAtExit = renderProcessGoneDetail.rendererPriorityAtExit();
                    Log.w("UserMessagingPlatform", "WebView render process " + str + ". Renderer priority at exit: " + rendererPriorityAtExit);
                    ViewGroup viewGroup = (ViewGroup) webView.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(webView);
                    }
                    webView.destroy();
                }
                return true;
            default:
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f33910a) {
            case 1:
                String uri = webResourceRequest.getUrl().toString();
                int i = C4373q.f35899w;
                if (uri == null || !uri.startsWith("consent://")) {
                    return false;
                }
                ((C4373q) this.f33911b).f35901u.e(uri);
                return true;
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    public /* synthetic */ C3820qw(C4373q c4373q) {
        Objects.requireNonNull(c4373q);
        this.f33911b = c4373q;
    }

    public C3820qw(p2.i iVar) {
        Objects.requireNonNull(iVar);
        this.f33911b = iVar;
    }

    public C3820qw(MWebActivity mWebActivity) {
        this.f33911b = mWebActivity;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        int i = 0;
        Object obj = this.f33911b;
        switch (this.f33910a) {
            case 1:
                int i4 = C4373q.f35899w;
                if (str == null || !str.startsWith("consent://")) {
                    return false;
                }
                ((C4373q) obj).f35901u.e(str);
                return true;
            case 2:
                Log.e("MWebActivity", "should override (1/2): " + str);
                MWebActivity mWebActivity = (MWebActivity) obj;
                if (!str.contains("googleadservices.com") && !str.contains("adclick.g.doubleclick.net") && !str.contains("youtube.com") && !str.contains("market://") && !str.contains("api.whatsapp.com") && !str.contains("intent://") && !str.contains("play.google.com") && !str.contains("google.com/maps") && !str.contains("facebook.com") && !str.contains("twitter.com") && !str.contains("instagram.com")) {
                    if (str.startsWith("tel:")) {
                        mWebActivity.startActivity(new Intent("android.intent.action.DIAL", Uri.parse(str)));
                    } else if (str.contains("geo:")) {
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                        intent.setPackage("com.google.android.apps.maps");
                        if (intent.resolveActivity(mWebActivity.getPackageManager()) != null) {
                            mWebActivity.startActivity(intent);
                        }
                    } else {
                        webView.loadUrl(str);
                    }
                } else {
                    com.bumptech.glide.manager.n nVar = new com.bumptech.glide.manager.n();
                    ((C4523c) nVar.f23619v).f37856u = Integer.valueOf(E.b.a(mWebActivity, C5284R.color.colorPrimary) | (-16777216));
                    ((Intent) nVar.b().f2910u).setPackage("com.android.chrome");
                    try {
                        new com.bumptech.glide.manager.n().b().q(mWebActivity, Uri.parse(str));
                    } catch (ActivityNotFoundException unused) {
                    }
                }
                return true;
            case 3:
                p2.i iVar = (p2.i) obj;
                if (str.startsWith(iVar.H3())) {
                    return false;
                }
                if (str.startsWith("gmsg://noAdLoaded")) {
                    InterfaceC4922x interfaceC4922x = iVar.f39796y;
                    if (interfaceC4922x != null) {
                        try {
                            interfaceC4922x.h0(AbstractC3217fl.M(3, null, null));
                        } catch (RemoteException e6) {
                            int i9 = t2.C.f40822b;
                            u2.i.i("#007 Could not call remote method.", e6);
                        }
                    }
                    InterfaceC4922x interfaceC4922x2 = iVar.f39796y;
                    if (interfaceC4922x2 != null) {
                        try {
                            interfaceC4922x2.D(3);
                        } catch (RemoteException e9) {
                            int i10 = t2.C.f40822b;
                            u2.i.i("#007 Could not call remote method.", e9);
                        }
                    }
                    iVar.G3(0);
                } else if (str.startsWith("gmsg://scriptLoadFailed")) {
                    InterfaceC4922x interfaceC4922x3 = iVar.f39796y;
                    if (interfaceC4922x3 != null) {
                        try {
                            interfaceC4922x3.h0(AbstractC3217fl.M(1, null, null));
                        } catch (RemoteException e10) {
                            int i11 = t2.C.f40822b;
                            u2.i.i("#007 Could not call remote method.", e10);
                        }
                    }
                    InterfaceC4922x interfaceC4922x4 = iVar.f39796y;
                    if (interfaceC4922x4 != null) {
                        try {
                            interfaceC4922x4.D(0);
                        } catch (RemoteException e11) {
                            int i12 = t2.C.f40822b;
                            u2.i.i("#007 Could not call remote method.", e11);
                        }
                    }
                    iVar.G3(0);
                } else {
                    boolean startsWith = str.startsWith("gmsg://adResized");
                    Context context = iVar.f39793v;
                    if (startsWith) {
                        InterfaceC4922x interfaceC4922x5 = iVar.f39796y;
                        if (interfaceC4922x5 != null) {
                            try {
                                interfaceC4922x5.f();
                            } catch (RemoteException e12) {
                                int i13 = t2.C.f40822b;
                                u2.i.i("#007 Could not call remote method.", e12);
                            }
                        }
                        String queryParameter = Uri.parse(str).getQueryParameter("height");
                        if (!TextUtils.isEmpty(queryParameter)) {
                            try {
                                u2.d dVar = C4907p.f40108g.f40109a;
                                i = u2.d.b(context, Integer.parseInt(queryParameter));
                            } catch (NumberFormatException unused2) {
                            }
                        }
                        iVar.G3(i);
                    } else if (!str.startsWith("gmsg://")) {
                        InterfaceC4922x interfaceC4922x6 = iVar.f39796y;
                        if (interfaceC4922x6 != null) {
                            try {
                                interfaceC4922x6.g();
                                iVar.f39796y.c();
                            } catch (RemoteException e13) {
                                int i14 = t2.C.f40822b;
                                u2.i.i("#007 Could not call remote method.", e13);
                            }
                        }
                        Intent intent2 = new Intent("android.intent.action.VIEW");
                        intent2.setData(Uri.parse(str));
                        context.startActivity(intent2);
                    }
                }
                return true;
            default:
                return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        switch (this.f33910a) {
            case 3:
                p2.i iVar = (p2.i) this.f33911b;
                InterfaceC4922x interfaceC4922x = iVar.f39796y;
                if (interfaceC4922x != null) {
                    try {
                        interfaceC4922x.h0(AbstractC3217fl.M(1, null, null));
                    } catch (RemoteException e6) {
                        int i = t2.C.f40822b;
                        u2.i.i("#007 Could not call remote method.", e6);
                    }
                }
                InterfaceC4922x interfaceC4922x2 = iVar.f39796y;
                if (interfaceC4922x2 != null) {
                    try {
                        interfaceC4922x2.D(0);
                        break;
                    } catch (RemoteException e9) {
                        int i4 = t2.C.f40822b;
                        u2.i.i("#007 Could not call remote method.", e9);
                        return;
                    }
                }
                break;
            default:
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                break;
        }
    }
}
