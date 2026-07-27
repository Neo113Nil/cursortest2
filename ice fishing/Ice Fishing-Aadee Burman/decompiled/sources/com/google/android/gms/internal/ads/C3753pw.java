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
import com.google.android.gms.internal.consent_sdk.C4336k;
import com.google.android.gms.internal.consent_sdk.C4341l0;
import com.google.android.gms.internal.consent_sdk.C4360q;
import com.icefishing.icefishinglive2.C5275R;
import com.icefishing.icefishinglive2.MWebActivity;
import java.util.Locale;
import java.util.Objects;
import l.C4648e;
import p2.BinderC4834i;
import q2.C4900p;
import q2.InterfaceC4915x;

/* renamed from: com.google.android.gms.internal.ads.pw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3753pw extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33161a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33162b;

    public C3753pw(C3860rw c3860rw) {
        Objects.requireNonNull(c3860rw);
        this.f33162b = c3860rw;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        switch (this.f33161a) {
            case 1:
                int i = C4360q.f35736w;
                if (str != null && str.startsWith("consent://")) {
                    ((C4360q) this.f33162b).f35738u.d(str);
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
        switch (this.f33161a) {
            case 1:
                C4360q c4360q = (C4360q) this.f33162b;
                if (!c4360q.f35739v) {
                    Log.d("UserMessagingPlatform", "Wall html loaded.");
                    c4360q.f35739v = true;
                    break;
                }
                break;
            case 2:
                ((MWebActivity) this.f33162b).f36807u.setVisibility(8);
                super.onPageFinished(webView, str);
                break;
            default:
                super.onPageFinished(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        switch (this.f33161a) {
            case 2:
                ((MWebActivity) this.f33162b).f36807u.setVisibility(0);
                super.onPageStarted(webView, str, bitmap);
                break;
            default:
                super.onPageStarted(webView, str, bitmap);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        switch (this.f33161a) {
            case 1:
                C2504Ch c2504Ch = ((C4360q) this.f33162b).f35738u;
                c2504Ch.getClass();
                Locale locale = Locale.US;
                ((C4336k) c2504Ch.f24207z).c(new C4341l0(2, "WebResourceError(" + i + ", " + str2 + "): " + str));
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
        switch (this.f33161a) {
            case 0:
                String obj = renderProcessGoneDetail.toString();
                String valueOf = String.valueOf(webView);
                Log.w("NativeBridge", com.anythink.basead.exoplayer.f.f.o(new StringBuilder(String.valueOf(obj).length() + 36 + valueOf.length()), "WebView renderer gone: ", obj, "for WebView: ", valueOf));
                C3860rw c3860rw = (C3860rw) this.f33162b;
                if (c3860rw.c() == webView) {
                    Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                    c3860rw.f32809b = new Aw(null);
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
        switch (this.f33161a) {
            case 1:
                String uri = webResourceRequest.getUrl().toString();
                int i = C4360q.f35736w;
                if (uri == null || !uri.startsWith("consent://")) {
                    return false;
                }
                ((C4360q) this.f33162b).f35738u.d(uri);
                return true;
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    public /* synthetic */ C3753pw(C4360q c4360q) {
        Objects.requireNonNull(c4360q);
        this.f33162b = c4360q;
    }

    public C3753pw(BinderC4834i binderC4834i) {
        Objects.requireNonNull(binderC4834i);
        this.f33162b = binderC4834i;
    }

    public C3753pw(MWebActivity mWebActivity) {
        this.f33162b = mWebActivity;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        int i = 0;
        Object obj = this.f33162b;
        switch (this.f33161a) {
            case 1:
                int i6 = C4360q.f35736w;
                if (str == null || !str.startsWith("consent://")) {
                    return false;
                }
                ((C4360q) obj).f35738u.d(str);
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
                    com.bumptech.glide.manager.o oVar = new com.bumptech.glide.manager.o();
                    ((C4648e) oVar.f23465v).f38761u = Integer.valueOf(E.b.a(mWebActivity, C5275R.color.colorPrimary) | (-16777216));
                    ((Intent) oVar.b().f39362n).setPackage("com.android.chrome");
                    try {
                        new com.bumptech.glide.manager.o().b().f(mWebActivity, Uri.parse(str));
                    } catch (ActivityNotFoundException unused) {
                    }
                }
                return true;
            case 3:
                BinderC4834i binderC4834i = (BinderC4834i) obj;
                if (str.startsWith(binderC4834i.V3())) {
                    return false;
                }
                if (str.startsWith("gmsg://noAdLoaded")) {
                    InterfaceC4915x interfaceC4915x = binderC4834i.f39728y;
                    if (interfaceC4915x != null) {
                        try {
                            interfaceC4915x.G(SK.F(3, null, null));
                        } catch (RemoteException e9) {
                            int i9 = u2.z.f41319b;
                            v2.i.i("#007 Could not call remote method.", e9);
                        }
                    }
                    InterfaceC4915x interfaceC4915x2 = binderC4834i.f39728y;
                    if (interfaceC4915x2 != null) {
                        try {
                            interfaceC4915x2.x(3);
                        } catch (RemoteException e10) {
                            int i10 = u2.z.f41319b;
                            v2.i.i("#007 Could not call remote method.", e10);
                        }
                    }
                    binderC4834i.U3(0);
                } else if (str.startsWith("gmsg://scriptLoadFailed")) {
                    InterfaceC4915x interfaceC4915x3 = binderC4834i.f39728y;
                    if (interfaceC4915x3 != null) {
                        try {
                            interfaceC4915x3.G(SK.F(1, null, null));
                        } catch (RemoteException e11) {
                            int i11 = u2.z.f41319b;
                            v2.i.i("#007 Could not call remote method.", e11);
                        }
                    }
                    InterfaceC4915x interfaceC4915x4 = binderC4834i.f39728y;
                    if (interfaceC4915x4 != null) {
                        try {
                            interfaceC4915x4.x(0);
                        } catch (RemoteException e12) {
                            int i12 = u2.z.f41319b;
                            v2.i.i("#007 Could not call remote method.", e12);
                        }
                    }
                    binderC4834i.U3(0);
                } else {
                    boolean startsWith = str.startsWith("gmsg://adResized");
                    Context context = binderC4834i.f39725v;
                    if (startsWith) {
                        InterfaceC4915x interfaceC4915x5 = binderC4834i.f39728y;
                        if (interfaceC4915x5 != null) {
                            try {
                                interfaceC4915x5.d();
                            } catch (RemoteException e13) {
                                int i13 = u2.z.f41319b;
                                v2.i.i("#007 Could not call remote method.", e13);
                            }
                        }
                        String queryParameter = Uri.parse(str).getQueryParameter("height");
                        if (!TextUtils.isEmpty(queryParameter)) {
                            try {
                                v2.d dVar = C4900p.f40196g.f40197a;
                                i = v2.d.b(context, Integer.parseInt(queryParameter));
                            } catch (NumberFormatException unused2) {
                            }
                        }
                        binderC4834i.U3(i);
                    } else if (!str.startsWith("gmsg://")) {
                        InterfaceC4915x interfaceC4915x6 = binderC4834i.f39728y;
                        if (interfaceC4915x6 != null) {
                            try {
                                interfaceC4915x6.h();
                                binderC4834i.f39728y.o();
                            } catch (RemoteException e14) {
                                int i14 = u2.z.f41319b;
                                v2.i.i("#007 Could not call remote method.", e14);
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
        switch (this.f33161a) {
            case 3:
                BinderC4834i binderC4834i = (BinderC4834i) this.f33162b;
                InterfaceC4915x interfaceC4915x = binderC4834i.f39728y;
                if (interfaceC4915x != null) {
                    try {
                        interfaceC4915x.G(SK.F(1, null, null));
                    } catch (RemoteException e9) {
                        int i = u2.z.f41319b;
                        v2.i.i("#007 Could not call remote method.", e9);
                    }
                }
                InterfaceC4915x interfaceC4915x2 = binderC4834i.f39728y;
                if (interfaceC4915x2 != null) {
                    try {
                        interfaceC4915x2.x(0);
                        break;
                    } catch (RemoteException e10) {
                        int i6 = u2.z.f41319b;
                        v2.i.i("#007 Could not call remote method.", e10);
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
