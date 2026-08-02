package defpackage;

import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.webkit.ClientCertRequest;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import io.flutter.plugins.webviewflutter.AndroidWebKitError;
import io.flutter.plugins.webviewflutter.ConsoleMessageLevel;
import io.flutter.plugins.webviewflutter.FileChooserMode;
import io.flutter.plugins.webviewflutter.MixedContentMode;
import io.flutter.plugins.webviewflutter.OverScrollMode;
import io.flutter.plugins.webviewflutter.SslErrorType;
import io.flutter.plugins.webviewflutter.WebChromeClientProxyApi$WebChromeClientImpl;
import java.nio.ByteBuffer;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.Result;

/* loaded from: classes4.dex */
public final class rd2 extends ld2 {
    public final xv10 d;

    public rd2(xv10 xv10Var) {
        this.d = xv10Var;
    }

    @Override // defpackage.ld2, defpackage.vzt0
    public final Object f(byte b, ByteBuffer byteBuffer) {
        if (b != Byte.MIN_VALUE) {
            return super.f(b, byteBuffer);
        }
        long longValue = ((Long) e(byteBuffer)).longValue();
        Object m = ((w4u) this.d.b).m(longValue);
        if (m == null) {
            Log.e("PigeonProxyApiBaseCodec", "Failed to find instance with identifier: " + longValue);
        }
        return m;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0a1f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0a45  */
    @Override // defpackage.ld2, defpackage.vzt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(ckn cknVar, Object obj) {
        xv10 xv10Var;
        if ((obj instanceof Boolean) || (obj instanceof byte[]) || (obj instanceof Double) || (obj instanceof double[]) || (obj instanceof float[]) || (obj instanceof Integer) || (obj instanceof int[]) || (obj instanceof List) || (obj instanceof Long) || (obj instanceof long[]) || (obj instanceof Map) || (obj instanceof String) || (obj instanceof FileChooserMode) || (obj instanceof ConsoleMessageLevel) || (obj instanceof OverScrollMode) || (obj instanceof SslErrorType) || (obj instanceof MixedContentMode) || obj == null) {
            super.k(cknVar, obj);
            return;
        }
        boolean z = obj instanceof WebResourceRequest;
        xv10 xv10Var2 = this.d;
        zy11 zy11Var = zy11.a;
        if (z) {
            xv10Var2.getClass();
            w4u w4uVar = (w4u) xv10Var2.b;
            WebResourceRequest webResourceRequest = (WebResourceRequest) obj;
            qd2 qd2Var = new qd2(0, obj);
            if (w4uVar.k(webResourceRequest)) {
                qd2Var.invoke(new Result(zy11Var));
            } else {
                new m2v((tt5) xv10Var2.a, "dev.flutter.pigeon.webview_flutter_android.WebResourceRequest.pigeon_newInstance", xv10Var2.f(), null).z(scc.g(Long.valueOf(w4uVar.i(webResourceRequest)), webResourceRequest.getUrl().toString(), Boolean.valueOf(webResourceRequest.isForMainFrame()), Boolean.valueOf(webResourceRequest.isRedirect()), Boolean.valueOf(webResourceRequest.hasGesture()), webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders() == null ? Collections.EMPTY_MAP : webResourceRequest.getRequestHeaders()), new zsb0(17, qd2Var));
            }
        } else if (obj instanceof WebResourceResponse) {
            xv10Var2.getClass();
            w4u w4uVar2 = (w4u) xv10Var2.b;
            WebResourceResponse webResourceResponse = (WebResourceResponse) obj;
            qd2 qd2Var2 = new qd2(26, obj);
            if (w4uVar2.k(webResourceResponse)) {
                qd2Var2.invoke(new Result(zy11Var));
            } else {
                new m2v((tt5) xv10Var2.a, "dev.flutter.pigeon.webview_flutter_android.WebResourceResponse.pigeon_newInstance", xv10Var2.f(), null).z(scc.g(Long.valueOf(w4uVar2.i(webResourceResponse)), Long.valueOf(webResourceResponse.getStatusCode())), new zsb0(18, qd2Var2));
            }
        } else if (obj instanceof WebResourceError) {
            xv10Var2.getClass();
            w4u w4uVar3 = (w4u) xv10Var2.b;
            WebResourceError webResourceError = (WebResourceError) obj;
            qd2 qd2Var3 = new qd2(12, obj);
            if (w4uVar3.k(webResourceError)) {
                qd2Var3.invoke(new Result(zy11Var));
            } else {
                new m2v((tt5) xv10Var2.a, "dev.flutter.pigeon.webview_flutter_android.WebResourceError.pigeon_newInstance", xv10Var2.f(), null).z(scc.g(Long.valueOf(w4uVar3.i(webResourceError)), Long.valueOf(webResourceError.getErrorCode()), webResourceError.getDescription().toString()), new zsb0(15, qd2Var3));
            }
        } else if (obj instanceof qj41) {
            xv10Var2.getClass();
            w4u w4uVar4 = (w4u) xv10Var2.b;
            qj41 qj41Var = (qj41) obj;
            qd2 qd2Var4 = new qd2(13, obj);
            if (w4uVar4.k(qj41Var)) {
                qd2Var4.invoke(new Result(zy11Var));
            } else {
                new m2v((tt5) xv10Var2.a, "dev.flutter.pigeon.webview_flutter_android.WebResourceErrorCompat.pigeon_newInstance", xv10Var2.f(), null).z(scc.g(Long.valueOf(w4uVar4.i(qj41Var)), Long.valueOf(qj41Var.b()), qj41Var.a().toString()), new zsb0(16, qd2Var4));
            }
        } else {
            if (!(obj instanceof ks41)) {
                int i = 3;
                if (obj instanceof ConsoleMessage) {
                    xv10Var2.getClass();
                    w4u w4uVar5 = (w4u) xv10Var2.b;
                    ConsoleMessage consoleMessage = (ConsoleMessage) obj;
                    qd2 qd2Var5 = new qd2(15, obj);
                    if (w4uVar5.k(consoleMessage)) {
                        qd2Var5.invoke(new Result(zy11Var));
                    } else {
                        long i2 = w4uVar5.i(consoleMessage);
                        long lineNumber = consoleMessage.lineNumber();
                        String message = consoleMessage.message();
                        int i3 = n6e.a[consoleMessage.messageLevel().ordinal()];
                        ConsoleMessageLevel consoleMessageLevel = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? ConsoleMessageLevel.UNKNOWN : ConsoleMessageLevel.DEBUG : ConsoleMessageLevel.ERROR : ConsoleMessageLevel.WARNING : ConsoleMessageLevel.LOG : ConsoleMessageLevel.TIP;
                        xv10Var = xv10Var2;
                        new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.ConsoleMessage.pigeon_newInstance", xv10Var.f(), null).z(scc.g(Long.valueOf(i2), Long.valueOf(lineNumber), message, consoleMessageLevel, consoleMessage.sourceId()), new nd2(23, qd2Var5));
                    }
                } else {
                    xv10Var = xv10Var2;
                    int i4 = 24;
                    if (obj instanceof CookieManager) {
                        xv10Var.getClass();
                        w4u w4uVar6 = (w4u) xv10Var.b;
                        CookieManager cookieManager = (CookieManager) obj;
                        qd2 qd2Var6 = new qd2(16, obj);
                        if (w4uVar6.k(cookieManager)) {
                            qd2Var6.invoke(new Result(zy11Var));
                        } else {
                            new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.CookieManager.pigeon_newInstance", xv10Var.f(), null).z(Collections.singletonList(Long.valueOf(w4uVar6.i(cookieManager))), new nd2(i4, qd2Var6));
                        }
                    } else {
                        int i5 = 22;
                        if (obj instanceof WebView) {
                            xv10Var.getClass();
                            w4u w4uVar7 = (w4u) xv10Var.b;
                            WebView webView = (WebView) obj;
                            qd2 qd2Var7 = new qd2(17, obj);
                            if (w4uVar7.k(webView)) {
                                qd2Var7.invoke(new Result(zy11Var));
                            } else {
                                new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_newInstance", xv10Var.f(), null).z(Collections.singletonList(Long.valueOf(w4uVar7.i(webView))), new zsb0(22, qd2Var7));
                            }
                        } else if (obj instanceof WebSettings) {
                            xv10Var.getClass();
                            w4u w4uVar8 = (w4u) xv10Var.b;
                            WebSettings webSettings = (WebSettings) obj;
                            qd2 qd2Var8 = new qd2(18, obj);
                            if (w4uVar8.k(webSettings)) {
                                qd2Var8.invoke(new Result(zy11Var));
                            } else {
                                new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.WebSettings.pigeon_newInstance", xv10Var.f(), null).z(Collections.singletonList(Long.valueOf(w4uVar8.i(webSettings))), new zsb0(19, qd2Var8));
                            }
                        } else if (obj instanceof b7x) {
                            xv10Var.getClass();
                            if (((w4u) xv10Var.b).k((b7x) obj)) {
                                if (new Result(zy11Var).getValue() instanceof Result.Failure) {
                                    Objects.toString(obj);
                                }
                            } else if (new Result(new Result.Failure(new AndroidWebKitError("new-instance-error", "Attempting to create a new Dart instance of JavaScriptChannel, but the class has a nonnull callback method.", ""))).getValue() instanceof Result.Failure) {
                                Objects.toString(obj);
                            }
                        } else if (obj instanceof WebViewClient) {
                            xv10Var.getClass();
                            w4u w4uVar9 = (w4u) xv10Var.b;
                            WebViewClient webViewClient = (WebViewClient) obj;
                            qd2 qd2Var9 = new qd2(11, obj);
                            if (w4uVar9.k(webViewClient)) {
                                qd2Var9.invoke(new Result(zy11Var));
                            } else {
                                new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_newInstance", xv10Var.f(), null).z(Collections.singletonList(Long.valueOf(w4uVar9.i(webViewClient))), new zsb0(28, qd2Var9));
                            }
                        } else if (obj instanceof DownloadListener) {
                            xv10Var.getClass();
                            if (((w4u) xv10Var.b).k((DownloadListener) obj)) {
                                if (new Result(zy11Var).getValue() instanceof Result.Failure) {
                                    Objects.toString(obj);
                                }
                            } else if (new Result(new Result.Failure(new AndroidWebKitError("new-instance-error", "Attempting to create a new Dart instance of DownloadListener, but the class has a nonnull callback method.", ""))).getValue() instanceof Result.Failure) {
                                Objects.toString(obj);
                            }
                        } else if (obj instanceof WebChromeClientProxyApi$WebChromeClientImpl) {
                            xv10Var.getClass();
                            if (((w4u) xv10Var.b).k((WebChromeClientProxyApi$WebChromeClientImpl) obj)) {
                                if (new Result(zy11Var).getValue() instanceof Result.Failure) {
                                    Objects.toString(obj);
                                }
                            } else if (new Result(new Result.Failure(new AndroidWebKitError("new-instance-error", "Attempting to create a new Dart instance of WebChromeClient, but the class has a nonnull callback method.", ""))).getValue() instanceof Result.Failure) {
                                Objects.toString(obj);
                            }
                        } else if (obj instanceof orr) {
                            xv10Var.getClass();
                            w4u w4uVar10 = (w4u) xv10Var.b;
                            orr orrVar = (orr) obj;
                            qd2 qd2Var10 = new qd2(19, obj);
                            if (w4uVar10.k(orrVar)) {
                                qd2Var10.invoke(new Result(zy11Var));
                            } else {
                                new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.pigeon_newInstance", xv10Var.f(), null).z(Collections.singletonList(Long.valueOf(w4uVar10.i(orrVar))), new isb0(1, qd2Var10));
                            }
                        } else if (obj instanceof WebStorage) {
                            xv10Var.getClass();
                            w4u w4uVar11 = (w4u) xv10Var.b;
                            WebStorage webStorage = (WebStorage) obj;
                            qd2 qd2Var11 = new qd2(20, obj);
                            if (w4uVar11.k(webStorage)) {
                                qd2Var11.invoke(new Result(zy11Var));
                            } else {
                                new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.WebStorage.pigeon_newInstance", xv10Var.f(), null).z(Collections.singletonList(Long.valueOf(w4uVar11.i(webStorage))), new zsb0(20, qd2Var11));
                            }
                        } else {
                            int i6 = 21;
                            if (obj instanceof WebChromeClient.FileChooserParams) {
                                xv10Var.getClass();
                                w4u w4uVar12 = (w4u) xv10Var.b;
                                WebChromeClient.FileChooserParams fileChooserParams = (WebChromeClient.FileChooserParams) obj;
                                qd2 qd2Var12 = new qd2(21, obj);
                                if (w4uVar12.k(fileChooserParams)) {
                                    qd2Var12.invoke(new Result(zy11Var));
                                } else {
                                    long i7 = w4uVar12.i(fileChooserParams);
                                    boolean isCaptureEnabled = fileChooserParams.isCaptureEnabled();
                                    List asList = Arrays.asList(fileChooserParams.getAcceptTypes());
                                    int mode = fileChooserParams.getMode();
                                    new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.FileChooserParams.pigeon_newInstance", xv10Var.f(), null).z(scc.g(Long.valueOf(i7), Boolean.valueOf(isCaptureEnabled), asList, mode != 0 ? mode != 1 ? mode != 3 ? FileChooserMode.UNKNOWN : FileChooserMode.SAVE : FileChooserMode.OPEN_MULTIPLE : FileChooserMode.OPEN, fileChooserParams.getFilenameHint()), new isb0(0, qd2Var12));
                                }
                            } else if (obj instanceof PermissionRequest) {
                                xv10Var.getClass();
                                w4u w4uVar13 = (w4u) xv10Var.b;
                                PermissionRequest permissionRequest = (PermissionRequest) obj;
                                qd2 qd2Var13 = new qd2(22, obj);
                                if (w4uVar13.k(permissionRequest)) {
                                    qd2Var13.invoke(new Result(zy11Var));
                                } else {
                                    new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.pigeon_newInstance", xv10Var.f(), null).z(scc.g(Long.valueOf(w4uVar13.i(permissionRequest)), Arrays.asList(permissionRequest.getResources())), new isb0(15, qd2Var13));
                                }
                            } else {
                                int i8 = 25;
                                if (obj instanceof WebChromeClient.CustomViewCallback) {
                                    xv10Var.getClass();
                                    w4u w4uVar14 = (w4u) xv10Var.b;
                                    WebChromeClient.CustomViewCallback customViewCallback = (WebChromeClient.CustomViewCallback) obj;
                                    qd2 qd2Var14 = new qd2(23, obj);
                                    if (w4uVar14.k(customViewCallback)) {
                                        qd2Var14.invoke(new Result(zy11Var));
                                    } else {
                                        new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.pigeon_newInstance", xv10Var.f(), null).z(Collections.singletonList(Long.valueOf(w4uVar14.i(customViewCallback))), new nd2(i8, qd2Var14));
                                    }
                                } else if (obj instanceof View) {
                                    xv10Var.getClass();
                                    w4u w4uVar15 = (w4u) xv10Var.b;
                                    View view = (View) obj;
                                    qd2 qd2Var15 = new qd2(24, obj);
                                    if (w4uVar15.k(view)) {
                                        qd2Var15.invoke(new Result(zy11Var));
                                    } else {
                                        new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.View.pigeon_newInstance", xv10Var.f(), null).z(Collections.singletonList(Long.valueOf(w4uVar15.i(view))), new zsb0(7, qd2Var15));
                                    }
                                } else if (obj instanceof GeolocationPermissions.Callback) {
                                    xv10Var.getClass();
                                    w4u w4uVar16 = (w4u) xv10Var.b;
                                    GeolocationPermissions.Callback callback = (GeolocationPermissions.Callback) obj;
                                    qd2 qd2Var16 = new qd2(25, obj);
                                    if (w4uVar16.k(callback)) {
                                        qd2Var16.invoke(new Result(zy11Var));
                                    } else {
                                        new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.pigeon_newInstance", xv10Var.f(), null).z(Collections.singletonList(Long.valueOf(w4uVar16.i(callback))), new isb0(5, qd2Var16));
                                    }
                                } else if (obj instanceof HttpAuthHandler) {
                                    xv10Var.getClass();
                                    w4u w4uVar17 = (w4u) xv10Var.b;
                                    HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj;
                                    qd2 qd2Var17 = new qd2(1, obj);
                                    if (w4uVar17.k(httpAuthHandler)) {
                                        qd2Var17.invoke(new Result(zy11Var));
                                    } else {
                                        new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.pigeon_newInstance", xv10Var.f(), null).z(Collections.singletonList(Long.valueOf(w4uVar17.i(httpAuthHandler))), new isb0(6, qd2Var17));
                                    }
                                } else if (obj instanceof Message) {
                                    xv10Var.getClass();
                                    w4u w4uVar18 = (w4u) xv10Var.b;
                                    Message message2 = (Message) obj;
                                    qd2 qd2Var18 = new qd2(2, obj);
                                    if (w4uVar18.k(message2)) {
                                        qd2Var18.invoke(new Result(zy11Var));
                                    } else {
                                        new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.AndroidMessage.pigeon_newInstance", xv10Var.f(), null).z(Collections.singletonList(Long.valueOf(w4uVar18.i(message2))), new nd2(i, qd2Var18));
                                    }
                                } else if (obj instanceof ClientCertRequest) {
                                    xv10Var.getClass();
                                    w4u w4uVar19 = (w4u) xv10Var.b;
                                    ClientCertRequest clientCertRequest = (ClientCertRequest) obj;
                                    qd2 qd2Var19 = new qd2(3, obj);
                                    if (w4uVar19.k(clientCertRequest)) {
                                        qd2Var19.invoke(new Result(zy11Var));
                                    } else {
                                        new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.pigeon_newInstance", xv10Var.f(), null).z(Collections.singletonList(Long.valueOf(w4uVar19.i(clientCertRequest))), new nd2(i5, qd2Var19));
                                    }
                                } else if (obj instanceof PrivateKey) {
                                    xv10Var.getClass();
                                    w4u w4uVar20 = (w4u) xv10Var.b;
                                    PrivateKey privateKey = (PrivateKey) obj;
                                    qd2 qd2Var20 = new qd2(4, obj);
                                    if (w4uVar20.k(privateKey)) {
                                        qd2Var20.invoke(new Result(zy11Var));
                                    } else {
                                        new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.PrivateKey.pigeon_newInstance", xv10Var.f(), null).z(Collections.singletonList(Long.valueOf(w4uVar20.i(privateKey))), new isb0(18, qd2Var20));
                                    }
                                } else if (obj instanceof X509Certificate) {
                                    xv10Var.getClass();
                                    w4u w4uVar21 = (w4u) xv10Var.b;
                                    X509Certificate x509Certificate = (X509Certificate) obj;
                                    qd2 qd2Var21 = new qd2(5, obj);
                                    if (w4uVar21.k(x509Certificate)) {
                                        qd2Var21.invoke(new Result(zy11Var));
                                    } else {
                                        new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.X509Certificate.pigeon_newInstance", xv10Var.f(), null).z(Collections.singletonList(Long.valueOf(w4uVar21.i(x509Certificate))), new htb0(9, qd2Var21));
                                    }
                                } else if (obj instanceof SslErrorHandler) {
                                    xv10Var.getClass();
                                    w4u w4uVar22 = (w4u) xv10Var.b;
                                    SslErrorHandler sslErrorHandler = (SslErrorHandler) obj;
                                    qd2 qd2Var22 = new qd2(6, obj);
                                    if (w4uVar22.k(sslErrorHandler)) {
                                        qd2Var22.invoke(new Result(zy11Var));
                                    } else {
                                        new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.pigeon_newInstance", xv10Var.f(), null).z(Collections.singletonList(Long.valueOf(w4uVar22.i(sslErrorHandler))), new zsb0(0, qd2Var22));
                                    }
                                } else if (obj instanceof SslError) {
                                    xv10Var.getClass();
                                    w4u w4uVar23 = (w4u) xv10Var.b;
                                    SslError sslError = (SslError) obj;
                                    qd2 qd2Var23 = new qd2(7, obj);
                                    if (w4uVar23.k(sslError)) {
                                        qd2Var23.invoke(new Result(zy11Var));
                                    } else {
                                        new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.SslError.pigeon_newInstance", xv10Var.f(), null).z(scc.g(Long.valueOf(w4uVar23.i(sslError)), sslError.getCertificate(), sslError.getUrl()), new isb0(29, qd2Var23));
                                    }
                                } else if (obj instanceof SslCertificate.DName) {
                                    xv10Var.getClass();
                                    w4u w4uVar24 = (w4u) xv10Var.b;
                                    SslCertificate.DName dName = (SslCertificate.DName) obj;
                                    qd2 qd2Var24 = new qd2(8, obj);
                                    if (w4uVar24.k(dName)) {
                                        qd2Var24.invoke(new Result(zy11Var));
                                    } else {
                                        new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.pigeon_newInstance", xv10Var.f(), null).z(Collections.singletonList(Long.valueOf(w4uVar24.i(dName))), new isb0(28, qd2Var24));
                                    }
                                } else if (obj instanceof SslCertificate) {
                                    xv10Var.getClass();
                                    w4u w4uVar25 = (w4u) xv10Var.b;
                                    SslCertificate sslCertificate = (SslCertificate) obj;
                                    qd2 qd2Var25 = new qd2(9, obj);
                                    if (w4uVar25.k(sslCertificate)) {
                                        qd2Var25.invoke(new Result(zy11Var));
                                    } else {
                                        new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.pigeon_newInstance", xv10Var.f(), null).z(Collections.singletonList(Long.valueOf(w4uVar25.i(sslCertificate))), new isb0(27, qd2Var25));
                                    }
                                } else if (obj instanceof Certificate) {
                                    xv10Var.getClass();
                                    w4u w4uVar26 = (w4u) xv10Var.b;
                                    Certificate certificate = (Certificate) obj;
                                    qd2 qd2Var26 = new qd2(10, obj);
                                    if (w4uVar26.k(certificate)) {
                                        qd2Var26.invoke(new Result(zy11Var));
                                    } else {
                                        new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.Certificate.pigeon_newInstance", xv10Var.f(), null).z(Collections.singletonList(Long.valueOf(w4uVar26.i(certificate))), new nd2(i6, qd2Var26));
                                    }
                                }
                            }
                        }
                    }
                }
                if (((w4u) xv10Var.b).k(obj)) {
                    yhl.f("Unsupported value: '", obj, "' of type '", obj.getClass().getName(), "'");
                    return;
                }
                cknVar.write(128);
                w4u w4uVar27 = (w4u) xv10Var.b;
                Long l = (Long) ((WeakHashMap) w4uVar27.h).get(new md2(obj, null));
                if (l != null) {
                    ((HashMap) w4uVar27.i).put(l, obj);
                }
                k(cknVar, l);
                return;
            }
            xv10Var2.getClass();
            w4u w4uVar28 = (w4u) xv10Var2.b;
            ks41 ks41Var = (ks41) obj;
            qd2 qd2Var27 = new qd2(14, obj);
            if (w4uVar28.k(ks41Var)) {
                qd2Var27.invoke(new Result(zy11Var));
            } else {
                new m2v((tt5) xv10Var2.a, "dev.flutter.pigeon.webview_flutter_android.WebViewPoint.pigeon_newInstance", xv10Var2.f(), null).z(scc.g(Long.valueOf(w4uVar28.i(ks41Var)), Long.valueOf(ks41Var.a), Long.valueOf(ks41Var.b)), new htb0(8, qd2Var27));
            }
        }
        xv10Var = xv10Var2;
        if (((w4u) xv10Var.b).k(obj)) {
        }
    }
}
