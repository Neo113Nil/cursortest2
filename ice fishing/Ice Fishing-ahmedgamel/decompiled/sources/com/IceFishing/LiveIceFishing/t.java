package com.IceFishing.LiveIceFishing;

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
import com.google.android.gms.internal.ads.Aw;
import com.google.android.gms.internal.ads.C2524Ch;
import com.google.android.gms.internal.ads.C3883rw;
import com.google.android.gms.internal.ads.SK;
import com.google.android.gms.internal.consent_sdk.C4359k;
import com.google.android.gms.internal.consent_sdk.C4364l0;
import com.google.android.gms.internal.consent_sdk.C4383q;
import i1.C4586c;
import java.util.Locale;
import java.util.Objects;
import r2.BinderC4905j;
import s2.C4949p;
import s2.InterfaceC4964x;

/* loaded from: classes.dex */
public final class t extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6429a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6430b;

    public t(C3883rw c3883rw) {
        Objects.requireNonNull(c3883rw);
        this.f6430b = c3883rw;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        switch (this.f6429a) {
            case 2:
                int i = C4383q.f36505w;
                if (str != null && str.startsWith("consent://")) {
                    ((C4383q) this.f6430b).f36507u.d(str);
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
        switch (this.f6429a) {
            case 0:
                ((MWebActivity) this.f6430b).f6297u.setVisibility(8);
                super.onPageFinished(webView, str);
                break;
            case 1:
            default:
                super.onPageFinished(webView, str);
                break;
            case 2:
                C4383q c4383q = (C4383q) this.f6430b;
                if (!c4383q.f36508v) {
                    Log.d("UserMessagingPlatform", "Wall html loaded.");
                    c4383q.f36508v = true;
                    break;
                }
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        switch (this.f6429a) {
            case 0:
                ((MWebActivity) this.f6430b).f6297u.setVisibility(0);
                super.onPageStarted(webView, str, bitmap);
                break;
            default:
                super.onPageStarted(webView, str, bitmap);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        switch (this.f6429a) {
            case 2:
                C2524Ch c2524Ch = ((C4383q) this.f6430b).f36507u;
                c2524Ch.getClass();
                Locale locale = Locale.US;
                ((C4359k) c2524Ch.f24942z).c(new C4364l0(2, "WebResourceError(" + i + ", " + str2 + "): " + str));
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
        switch (this.f6429a) {
            case 1:
                String obj = renderProcessGoneDetail.toString();
                String valueOf = String.valueOf(webView);
                Log.w("NativeBridge", k.r(new StringBuilder(String.valueOf(obj).length() + 36 + valueOf.length()), "WebView renderer gone: ", obj, "for WebView: ", valueOf));
                C3883rw c3883rw = (C3883rw) this.f6430b;
                if (c3883rw.c() == webView) {
                    Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                    c3883rw.f33766b = new Aw(null);
                }
                webView.destroy();
                return true;
            case 2:
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
        switch (this.f6429a) {
            case 2:
                String uri = webResourceRequest.getUrl().toString();
                int i = C4383q.f36505w;
                if (uri == null || !uri.startsWith("consent://")) {
                    return false;
                }
                ((C4383q) this.f6430b).f36507u.d(uri);
                return true;
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    public /* synthetic */ t(C4383q c4383q) {
        Objects.requireNonNull(c4383q);
        this.f6430b = c4383q;
    }

    public t(BinderC4905j binderC4905j) {
        Objects.requireNonNull(binderC4905j);
        this.f6430b = binderC4905j;
    }

    public t(MWebActivity mWebActivity) {
        this.f6430b = mWebActivity;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        int i = 0;
        Object obj = this.f6430b;
        switch (this.f6429a) {
            case 0:
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
                    ((C4586c) nVar.f24250v).f38154u = Integer.valueOf(E.b.a(mWebActivity, C5248R.color.colorPrimary) | (-16777216));
                    ((Intent) nVar.b().f26916u).setPackage("com.android.chrome");
                    try {
                        new com.bumptech.glide.manager.n().b().i(mWebActivity, Uri.parse(str));
                    } catch (ActivityNotFoundException unused) {
                    }
                }
                return true;
            case 1:
            default:
                return super.shouldOverrideUrlLoading(webView, str);
            case 2:
                int i4 = C4383q.f36505w;
                if (str == null || !str.startsWith("consent://")) {
                    return false;
                }
                ((C4383q) obj).f36507u.d(str);
                return true;
            case 3:
                BinderC4905j binderC4905j = (BinderC4905j) obj;
                if (str.startsWith(binderC4905j.V3())) {
                    return false;
                }
                if (str.startsWith("gmsg://noAdLoaded")) {
                    InterfaceC4964x interfaceC4964x = binderC4905j.f40184y;
                    if (interfaceC4964x != null) {
                        try {
                            interfaceC4964x.M(SK.F(3, null, null));
                        } catch (RemoteException e9) {
                            int i6 = w2.z.f41712b;
                            x2.i.i("#007 Could not call remote method.", e9);
                        }
                    }
                    InterfaceC4964x interfaceC4964x2 = binderC4905j.f40184y;
                    if (interfaceC4964x2 != null) {
                        try {
                            interfaceC4964x2.x(3);
                        } catch (RemoteException e10) {
                            int i9 = w2.z.f41712b;
                            x2.i.i("#007 Could not call remote method.", e10);
                        }
                    }
                    binderC4905j.U3(0);
                } else if (str.startsWith("gmsg://scriptLoadFailed")) {
                    InterfaceC4964x interfaceC4964x3 = binderC4905j.f40184y;
                    if (interfaceC4964x3 != null) {
                        try {
                            interfaceC4964x3.M(SK.F(1, null, null));
                        } catch (RemoteException e11) {
                            int i10 = w2.z.f41712b;
                            x2.i.i("#007 Could not call remote method.", e11);
                        }
                    }
                    InterfaceC4964x interfaceC4964x4 = binderC4905j.f40184y;
                    if (interfaceC4964x4 != null) {
                        try {
                            interfaceC4964x4.x(0);
                        } catch (RemoteException e12) {
                            int i11 = w2.z.f41712b;
                            x2.i.i("#007 Could not call remote method.", e12);
                        }
                    }
                    binderC4905j.U3(0);
                } else {
                    boolean startsWith = str.startsWith("gmsg://adResized");
                    Context context = binderC4905j.f40181v;
                    if (startsWith) {
                        InterfaceC4964x interfaceC4964x5 = binderC4905j.f40184y;
                        if (interfaceC4964x5 != null) {
                            try {
                                interfaceC4964x5.d();
                            } catch (RemoteException e13) {
                                int i12 = w2.z.f41712b;
                                x2.i.i("#007 Could not call remote method.", e13);
                            }
                        }
                        String queryParameter = Uri.parse(str).getQueryParameter("height");
                        if (!TextUtils.isEmpty(queryParameter)) {
                            try {
                                x2.d dVar = C4949p.f40498g.f40499a;
                                i = x2.d.b(context, Integer.parseInt(queryParameter));
                            } catch (NumberFormatException unused2) {
                            }
                        }
                        binderC4905j.U3(i);
                    } else if (!str.startsWith("gmsg://")) {
                        InterfaceC4964x interfaceC4964x6 = binderC4905j.f40184y;
                        if (interfaceC4964x6 != null) {
                            try {
                                interfaceC4964x6.h();
                                binderC4905j.f40184y.o();
                            } catch (RemoteException e14) {
                                int i13 = w2.z.f41712b;
                                x2.i.i("#007 Could not call remote method.", e14);
                            }
                        }
                        Intent intent2 = new Intent("android.intent.action.VIEW");
                        intent2.setData(Uri.parse(str));
                        context.startActivity(intent2);
                    }
                }
                return true;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        switch (this.f6429a) {
            case 3:
                BinderC4905j binderC4905j = (BinderC4905j) this.f6430b;
                InterfaceC4964x interfaceC4964x = binderC4905j.f40184y;
                if (interfaceC4964x != null) {
                    try {
                        interfaceC4964x.M(SK.F(1, null, null));
                    } catch (RemoteException e9) {
                        int i = w2.z.f41712b;
                        x2.i.i("#007 Could not call remote method.", e9);
                    }
                }
                InterfaceC4964x interfaceC4964x2 = binderC4905j.f40184y;
                if (interfaceC4964x2 != null) {
                    try {
                        interfaceC4964x2.x(0);
                        break;
                    } catch (RemoteException e10) {
                        int i4 = w2.z.f41712b;
                        x2.i.i("#007 Could not call remote method.", e10);
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
