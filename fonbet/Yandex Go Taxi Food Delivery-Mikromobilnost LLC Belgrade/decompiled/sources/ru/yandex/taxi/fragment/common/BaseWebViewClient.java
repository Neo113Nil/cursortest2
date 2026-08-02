package ru.yandex.taxi.fragment.common;

import android.app.Activity;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import defpackage.bgb0;
import defpackage.cvu0;
import defpackage.evu0;
import defpackage.f6u0;
import defpackage.g7u0;
import defpackage.jl40;
import defpackage.k6u0;
import defpackage.o7w0;
import defpackage.q5z;
import defpackage.tig0;
import defpackage.v770;
import defpackage.w6j0;
import defpackage.x5j0;
import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import ru.yandex.taxi.deeplinks.f;
import ru.yandex.video.m3.list_player_manager.impl.image.GlideBitmapDownloader;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H$¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH$¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00140\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001c\u001a\u00020\u00192\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00140\u0017¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0012\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R&\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00140\"8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/yandex/taxi/fragment/common/BaseWebViewClient;", "Landroid/webkit/WebViewClient;", "Lru/yandex/taxi/deeplinks/f;", "deeplinkUtils", "<init>", "(Lru/yandex/taxi/deeplinks/f;)V", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "", "", "supportedDeeplinkSchemes", "()Ljava/util/List;", "Landroid/webkit/WebView;", "view", "Landroid/webkit/WebResourceRequest;", "request", "", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "Landroid/webkit/WebResourceResponse;", "shouldInterceptRequest", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;", "Lw6j0;", "handler", "Lzy11;", "addWebRequestHandler", "(Lw6j0;)V", "removeWebRequestHandler", "url", "(Ljava/lang/String;)Z", "Lru/yandex/taxi/deeplinks/f;", "getDeeplinkUtils", "()Lru/yandex/taxi/deeplinks/f;", "Lx5j0;", "requestDispatcher", "Lx5j0;", "getRequestDispatcher", "()Lx5j0;", "web"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class BaseWebViewClient extends WebViewClient {
    private final f deeplinkUtils;
    private final x5j0 requestDispatcher = new x5j0();

    public BaseWebViewClient(f fVar) {
        this.deeplinkUtils = fVar;
    }

    public final void addWebRequestHandler(w6j0 handler) {
        this.requestDispatcher.a.add(handler);
    }

    public abstract Activity getActivity();

    public final f getDeeplinkUtils() {
        return this.deeplinkUtils;
    }

    public final x5j0 getRequestDispatcher() {
        return this.requestDispatcher;
    }

    public final void removeWebRequestHandler(w6j0 handler) {
        this.requestDispatcher.a.remove(handler);
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0116, code lost:
    
        if (defpackage.evu0.y(r4, "iso-8859-1", false) != false) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0153 A[EDGE_INSN: B:62:0x0153->B:48:0x0153 BREAK  A[LOOP:1: B:42:0x013d->B:61:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0167 A[SYNTHETIC] */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        WebResourceResponse webResourceResponse;
        g7u0 g7u0Var;
        String str;
        String str2;
        Iterator it;
        Object failure;
        Iterator it2 = this.requestDispatcher.a.iterator();
        do {
            webResourceResponse = null;
            Object obj = null;
            webResourceResponse = null;
            webResourceResponse = null;
            if (!it2.hasNext()) {
                break;
            }
            o7w0 o7w0Var = (o7w0) ((w6j0) it2.next());
            o7w0Var.getClass();
            if (jl40.l(request.getMethod(), "GET")) {
                com.yandex.go.external_service.preloader.data.b bVar = o7w0Var.a.e;
                if (bVar != null) {
                    String uri = request.getUrl().toString();
                    Map<String, String> requestHeaders = request.getRequestHeaders();
                    String str3 = bVar.c().a.contains(uri) ? uri : null;
                    if (str3 == null || (g7u0Var = bVar.b.c(new tig0(str3, requestHeaders))) == null) {
                        String str4 = (String) bVar.c().b.get(uri);
                        if (str4 != null) {
                            try {
                                failure = bVar.c.a.open("eatskitstatic/bundle/" + str4);
                            } catch (Throwable th) {
                                failure = new Result.Failure(th);
                            }
                            boolean z = failure instanceof Result.Failure;
                            Object obj2 = failure;
                            if (z) {
                                obj2 = null;
                            }
                            InputStream inputStream = (InputStream) obj2;
                            if (inputStream != null) {
                                g7u0Var = new g7u0("", "", f6u0.b, inputStream);
                            }
                        }
                    }
                    if (g7u0Var == null) {
                        String str5 = g7u0Var.a;
                        Map<String, String> requestHeaders2 = request.getRequestHeaders();
                        String str6 = g7u0Var.b;
                        if (evu0.J(str5)) {
                            String a = k6u0.a(GlideBitmapDownloader.ACCEPT_HEADER, requestHeaders2);
                            if (a != null) {
                                String str7 = "text/html";
                                if (!evu0.y(a, "text/html", false)) {
                                    str7 = "text/css";
                                    if (!evu0.y(a, "text/css", false)) {
                                        str7 = "application/javascript";
                                        if (!evu0.y(a, "application/javascript", false)) {
                                            str7 = "application/json";
                                            if (!evu0.y(a, "application/json", false)) {
                                                str7 = evu0.y(a, "image/", false) ? evu0.g0(a, ",", a) : null;
                                            }
                                        }
                                    }
                                }
                                str5 = str7;
                            } else {
                                str5 = null;
                            }
                            if (str5 == null) {
                                str5 = "";
                            }
                        }
                        if (evu0.J(str6)) {
                            String a2 = k6u0.a("Accept-Charset", requestHeaders2);
                            if (a2 != null) {
                                str6 = "utf-8";
                                if (!evu0.y(a2, "utf-8", false)) {
                                    str6 = "utf-16";
                                    if (!evu0.y(a2, "utf-16", false)) {
                                        str6 = "iso-8859-1";
                                    }
                                }
                                if (str6 == null) {
                                    str = "";
                                    LinkedHashMap linkedHashMap = new LinkedHashMap(g7u0Var.c);
                                    str2 = (String) linkedHashMap.remove("static-source");
                                    if (str2 != null) {
                                        linkedHashMap.put("x-eatskit-static-source", str2);
                                    }
                                    it = linkedHashMap.keySet().iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        if ("Access-Control-Allow-Origin".equalsIgnoreCase((String) next)) {
                                            obj = next;
                                            break;
                                        }
                                    }
                                    if (((String) obj) == null) {
                                        linkedHashMap.put("Access-Control-Allow-Origin", "*");
                                    }
                                    webResourceResponse = new WebResourceResponse(str5, str, 200, "OK", linkedHashMap, g7u0Var.d);
                                }
                            }
                            str6 = null;
                            if (str6 == null) {
                            }
                        }
                        str = str6;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(g7u0Var.c);
                        str2 = (String) linkedHashMap2.remove("static-source");
                        if (str2 != null) {
                        }
                        it = linkedHashMap2.keySet().iterator();
                        while (true) {
                            if (it.hasNext()) {
                            }
                        }
                        if (((String) obj) == null) {
                        }
                        webResourceResponse = new WebResourceResponse(str5, str, 200, "OK", linkedHashMap2, g7u0Var.d);
                    }
                }
                g7u0Var = null;
                if (g7u0Var == null) {
                }
            }
        } while (webResourceResponse == null);
        return webResourceResponse != null ? webResourceResponse : super.shouldInterceptRequest(view, request);
    }

    public boolean shouldOverrideUrlLoading(String url) {
        Activity activity = getActivity();
        if (activity != null) {
            String lowerCase = url.toLowerCase(Locale.US);
            if (cvu0.x(lowerCase, "mailto:", false)) {
                q5z.e0(activity, Uri.parse(url), null, null);
                return true;
            }
            if (cvu0.x(lowerCase, "tel:", false)) {
                bgb0.i(activity, Uri.parse(url));
                return true;
            }
            Iterator<String> it = supportedDeeplinkSchemes().iterator();
            while (it.hasNext()) {
                if (cvu0.x(lowerCase, it.next() + ":", false)) {
                    this.deeplinkUtils.b(activity, url, v770.e);
                    return true;
                }
            }
        }
        return false;
    }

    public abstract List<String> supportedDeeplinkSchemes();

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        return shouldOverrideUrlLoading(request.getUrl().toString());
    }
}
