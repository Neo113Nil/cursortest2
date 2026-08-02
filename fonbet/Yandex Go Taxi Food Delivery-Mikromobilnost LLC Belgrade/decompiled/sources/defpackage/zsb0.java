package defpackage;

import io.flutter.plugins.camerax.CameraXError;
import io.flutter.plugins.webviewflutter.AndroidWebKitError;
import java.util.List;
import kotlin.Result;

/* loaded from: classes4.dex */
public final /* synthetic */ class zsb0 implements fe5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;

    public /* synthetic */ zsb0(int i, tls tlsVar) {
        this.a = i;
        this.b = tlsVar;
    }

    @Override // defpackage.fe5
    public final void a(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                qd2 qd2Var = (qd2) tlsVar;
                if (!(obj instanceof List)) {
                    qd2Var.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        qd2Var.invoke(new Result(zy11Var));
                        break;
                    } else {
                        qd2Var.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list.get(0), (String) list.get(1), (String) list.get(2)))));
                        break;
                    }
                }
            case 1:
                fu7 fu7Var = (fu7) tlsVar;
                if (!(obj instanceof List)) {
                    fu7Var.invoke(new Result(new Result.Failure(new CameraXError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.UseCase.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        fu7Var.invoke(new Result(zy11Var));
                        break;
                    } else {
                        fu7Var.invoke(new Result(new Result.Failure(new CameraXError((String) list2.get(0), (String) list2.get(1), (String) list2.get(2)))));
                        break;
                    }
                }
            case 2:
                gu7 gu7Var = (gu7) tlsVar;
                if (!(obj instanceof List)) {
                    gu7Var.invoke(new Result(new Result.Failure(new CameraXError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.VideoCapture.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list3 = (List) obj;
                    if (list3.size() <= 1) {
                        gu7Var.invoke(new Result(zy11Var));
                        break;
                    } else {
                        gu7Var.invoke(new Result(new Result.Failure(new CameraXError((String) list3.get(0), (String) list3.get(1), (String) list3.get(2)))));
                        break;
                    }
                }
            case 3:
                gu7 gu7Var2 = (gu7) tlsVar;
                if (!(obj instanceof List)) {
                    gu7Var2.invoke(new Result(new Result.Failure(new CameraXError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.VideoOutput.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list4 = (List) obj;
                    if (list4.size() <= 1) {
                        gu7Var2.invoke(new Result(zy11Var));
                        break;
                    } else {
                        gu7Var2.invoke(new Result(new Result.Failure(new CameraXError((String) list4.get(0), (String) list4.get(1), (String) list4.get(2)))));
                        break;
                    }
                }
            case 4:
                gu7 gu7Var3 = (gu7) tlsVar;
                if (!(obj instanceof List)) {
                    gu7Var3.invoke(new Result(new Result.Failure(new CameraXError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.VideoRecordEvent.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list5 = (List) obj;
                    if (list5.size() <= 1) {
                        gu7Var3.invoke(new Result(zy11Var));
                        break;
                    } else {
                        gu7Var3.invoke(new Result(new Result.Failure(new CameraXError((String) list5.get(0), (String) list5.get(1), (String) list5.get(2)))));
                        break;
                    }
                }
            case 5:
                gu7 gu7Var4 = (gu7) tlsVar;
                if (!(obj instanceof List)) {
                    gu7Var4.invoke(new Result(new Result.Failure(new CameraXError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.VideoRecordEventFinalize.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list6 = (List) obj;
                    if (list6.size() <= 1) {
                        gu7Var4.invoke(new Result(zy11Var));
                        break;
                    } else {
                        gu7Var4.invoke(new Result(new Result.Failure(new CameraXError((String) list6.get(0), (String) list6.get(1), (String) list6.get(2)))));
                        break;
                    }
                }
            case 6:
                fu7 fu7Var2 = (fu7) tlsVar;
                if (!(obj instanceof List)) {
                    fu7Var2.invoke(new Result(new Result.Failure(new CameraXError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.VideoRecordEventStart.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list7 = (List) obj;
                    if (list7.size() <= 1) {
                        fu7Var2.invoke(new Result(zy11Var));
                        break;
                    } else {
                        fu7Var2.invoke(new Result(new Result.Failure(new CameraXError((String) list7.get(0), (String) list7.get(1), (String) list7.get(2)))));
                        break;
                    }
                }
            case 7:
                qd2 qd2Var2 = (qd2) tlsVar;
                if (!(obj instanceof List)) {
                    qd2Var2.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.View.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list8 = (List) obj;
                    if (list8.size() <= 1) {
                        qd2Var2.invoke(new Result(zy11Var));
                        break;
                    } else {
                        qd2Var2.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list8.get(0), (String) list8.get(1), (String) list8.get(2)))));
                        break;
                    }
                }
            case 8:
                r941 r941Var = (r941) tlsVar;
                if (!(obj instanceof List)) {
                    r941Var.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onHideCustomView'.", ""))));
                    break;
                } else {
                    List list9 = (List) obj;
                    if (list9.size() <= 1) {
                        r941Var.invoke(new Result(zy11Var));
                        break;
                    } else {
                        r941Var.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list9.get(0), (String) list9.get(1), (String) list9.get(2)))));
                        break;
                    }
                }
            case 9:
                r941 r941Var2 = (r941) tlsVar;
                if (!(obj instanceof List)) {
                    r941Var2.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onProgressChanged'.", ""))));
                    break;
                } else {
                    List list10 = (List) obj;
                    if (list10.size() <= 1) {
                        r941Var2.invoke(new Result(zy11Var));
                        break;
                    } else {
                        r941Var2.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list10.get(0), (String) list10.get(1), (String) list10.get(2)))));
                        break;
                    }
                }
            case 10:
                r941 r941Var3 = (r941) tlsVar;
                if (!(obj instanceof List)) {
                    r941Var3.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onPermissionRequest'.", ""))));
                    break;
                } else {
                    List list11 = (List) obj;
                    if (list11.size() <= 1) {
                        r941Var3.invoke(new Result(zy11Var));
                        break;
                    } else {
                        r941Var3.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list11.get(0), (String) list11.get(1), (String) list11.get(2)))));
                        break;
                    }
                }
            case 11:
                r941 r941Var4 = (r941) tlsVar;
                if (!(obj instanceof List)) {
                    r941Var4.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowCustomView'.", ""))));
                    break;
                } else {
                    List list12 = (List) obj;
                    if (list12.size() <= 1) {
                        r941Var4.invoke(new Result(zy11Var));
                        break;
                    } else {
                        r941Var4.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list12.get(0), (String) list12.get(1), (String) list12.get(2)))));
                        break;
                    }
                }
            case 12:
                r941 r941Var5 = (r941) tlsVar;
                if (!(obj instanceof List)) {
                    r941Var5.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onConsoleMessage'.", ""))));
                    break;
                } else {
                    List list13 = (List) obj;
                    if (list13.size() <= 1) {
                        r941Var5.invoke(new Result(zy11Var));
                        break;
                    } else {
                        r941Var5.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list13.get(0), (String) list13.get(1), (String) list13.get(2)))));
                        break;
                    }
                }
            case 13:
                r941 r941Var6 = (r941) tlsVar;
                if (!(obj instanceof List)) {
                    r941Var6.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsShowPrompt'.", ""))));
                    break;
                } else {
                    List list14 = (List) obj;
                    if (list14.size() <= 1) {
                        r941Var6.invoke(new Result(zy11Var));
                        break;
                    } else {
                        r941Var6.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list14.get(0), (String) list14.get(1), (String) list14.get(2)))));
                        break;
                    }
                }
            case 14:
                r941 r941Var7 = (r941) tlsVar;
                if (!(obj instanceof List)) {
                    r941Var7.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsHidePrompt'.", ""))));
                    break;
                } else {
                    List list15 = (List) obj;
                    if (list15.size() <= 1) {
                        r941Var7.invoke(new Result(zy11Var));
                        break;
                    } else {
                        r941Var7.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list15.get(0), (String) list15.get(1), (String) list15.get(2)))));
                        break;
                    }
                }
            case 15:
                qd2 qd2Var3 = (qd2) tlsVar;
                if (!(obj instanceof List)) {
                    qd2Var3.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebResourceError.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list16 = (List) obj;
                    if (list16.size() <= 1) {
                        qd2Var3.invoke(new Result(zy11Var));
                        break;
                    } else {
                        qd2Var3.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list16.get(0), (String) list16.get(1), (String) list16.get(2)))));
                        break;
                    }
                }
            case 16:
                qd2 qd2Var4 = (qd2) tlsVar;
                if (!(obj instanceof List)) {
                    qd2Var4.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebResourceErrorCompat.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list17 = (List) obj;
                    if (list17.size() <= 1) {
                        qd2Var4.invoke(new Result(zy11Var));
                        break;
                    } else {
                        qd2Var4.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list17.get(0), (String) list17.get(1), (String) list17.get(2)))));
                        break;
                    }
                }
            case 17:
                qd2 qd2Var5 = (qd2) tlsVar;
                if (!(obj instanceof List)) {
                    qd2Var5.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebResourceRequest.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list18 = (List) obj;
                    if (list18.size() <= 1) {
                        qd2Var5.invoke(new Result(zy11Var));
                        break;
                    } else {
                        qd2Var5.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list18.get(0), (String) list18.get(1), (String) list18.get(2)))));
                        break;
                    }
                }
            case 18:
                qd2 qd2Var6 = (qd2) tlsVar;
                if (!(obj instanceof List)) {
                    qd2Var6.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebResourceResponse.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list19 = (List) obj;
                    if (list19.size() <= 1) {
                        qd2Var6.invoke(new Result(zy11Var));
                        break;
                    } else {
                        qd2Var6.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list19.get(0), (String) list19.get(1), (String) list19.get(2)))));
                        break;
                    }
                }
            case 19:
                qd2 qd2Var7 = (qd2) tlsVar;
                if (!(obj instanceof List)) {
                    qd2Var7.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebSettings.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list20 = (List) obj;
                    if (list20.size() <= 1) {
                        qd2Var7.invoke(new Result(zy11Var));
                        break;
                    } else {
                        qd2Var7.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list20.get(0), (String) list20.get(1), (String) list20.get(2)))));
                        break;
                    }
                }
            case 20:
                qd2 qd2Var8 = (qd2) tlsVar;
                if (!(obj instanceof List)) {
                    qd2Var8.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebStorage.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list21 = (List) obj;
                    if (list21.size() <= 1) {
                        qd2Var8.invoke(new Result(zy11Var));
                        break;
                    } else {
                        qd2Var8.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list21.get(0), (String) list21.get(1), (String) list21.get(2)))));
                        break;
                    }
                }
            case 21:
                js41 js41Var = (js41) tlsVar;
                if (!(obj instanceof List)) {
                    js41Var.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebView.onScrollChanged'.", ""))));
                    break;
                } else {
                    List list22 = (List) obj;
                    if (list22.size() <= 1) {
                        js41Var.invoke(new Result(zy11Var));
                        break;
                    } else {
                        js41Var.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list22.get(0), (String) list22.get(1), (String) list22.get(2)))));
                        break;
                    }
                }
            case 22:
                qd2 qd2Var9 = (qd2) tlsVar;
                if (!(obj instanceof List)) {
                    qd2Var9.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list23 = (List) obj;
                    if (list23.size() <= 1) {
                        qd2Var9.invoke(new Result(zy11Var));
                        break;
                    } else {
                        qd2Var9.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list23.get(0), (String) list23.get(1), (String) list23.get(2)))));
                        break;
                    }
                }
            case 23:
                r941 r941Var8 = (r941) tlsVar;
                if (!(obj instanceof List)) {
                    r941Var8.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.requestLoading'.", ""))));
                    break;
                } else {
                    List list24 = (List) obj;
                    if (list24.size() <= 1) {
                        r941Var8.invoke(new Result(zy11Var));
                        break;
                    } else {
                        r941Var8.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list24.get(0), (String) list24.get(1), (String) list24.get(2)))));
                        break;
                    }
                }
            case 24:
                r941 r941Var9 = (r941) tlsVar;
                if (!(obj instanceof List)) {
                    r941Var9.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onLoadResource'.", ""))));
                    break;
                } else {
                    List list25 = (List) obj;
                    if (list25.size() <= 1) {
                        r941Var9.invoke(new Result(zy11Var));
                        break;
                    } else {
                        r941Var9.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list25.get(0), (String) list25.get(1), (String) list25.get(2)))));
                        break;
                    }
                }
            case 25:
                r941 r941Var10 = (r941) tlsVar;
                if (!(obj instanceof List)) {
                    r941Var10.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedLoginRequest'.", ""))));
                    break;
                } else {
                    List list26 = (List) obj;
                    if (list26.size() <= 1) {
                        r941Var10.invoke(new Result(zy11Var));
                        break;
                    } else {
                        r941Var10.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list26.get(0), (String) list26.get(1), (String) list26.get(2)))));
                        break;
                    }
                }
            case 26:
                r941 r941Var11 = (r941) tlsVar;
                if (!(obj instanceof List)) {
                    r941Var11.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageStarted'.", ""))));
                    break;
                } else {
                    List list27 = (List) obj;
                    if (list27.size() <= 1) {
                        r941Var11.invoke(new Result(zy11Var));
                        break;
                    } else {
                        r941Var11.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list27.get(0), (String) list27.get(1), (String) list27.get(2)))));
                        break;
                    }
                }
            case 27:
                r941 r941Var12 = (r941) tlsVar;
                if (!(obj instanceof List)) {
                    r941Var12.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedClientCertRequest'.", ""))));
                    break;
                } else {
                    List list28 = (List) obj;
                    if (list28.size() <= 1) {
                        r941Var12.invoke(new Result(zy11Var));
                        break;
                    } else {
                        r941Var12.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list28.get(0), (String) list28.get(1), (String) list28.get(2)))));
                        break;
                    }
                }
            case 28:
                qd2 qd2Var10 = (qd2) tlsVar;
                if (!(obj instanceof List)) {
                    qd2Var10.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list29 = (List) obj;
                    if (list29.size() <= 1) {
                        qd2Var10.invoke(new Result(zy11Var));
                        break;
                    } else {
                        qd2Var10.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list29.get(0), (String) list29.get(1), (String) list29.get(2)))));
                        break;
                    }
                }
            default:
                r941 r941Var13 = (r941) tlsVar;
                if (!(obj instanceof List)) {
                    r941Var13.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageCommitVisible'.", ""))));
                    break;
                } else {
                    List list30 = (List) obj;
                    if (list30.size() <= 1) {
                        r941Var13.invoke(new Result(zy11Var));
                        break;
                    } else {
                        r941Var13.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list30.get(0), (String) list30.get(1), (String) list30.get(2)))));
                        break;
                    }
                }
        }
    }
}
