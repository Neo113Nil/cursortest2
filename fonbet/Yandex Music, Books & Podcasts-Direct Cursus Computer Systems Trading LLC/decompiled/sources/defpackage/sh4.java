package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.fragment.app.o;
import androidx.fragment.app.t;
import com.yandex.passport.sloth.ui.webview.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class sh4 extends WebChromeClient {
    public final /* synthetic */ int a = 1;
    public Object b;

    public sh4(fi4 fi4Var) {
        this.b = fi4Var;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        switch (this.a) {
            case 1:
                webView.getClass();
                message.getClass();
                String extra = webView.getHitTestResult().getExtra();
                if (extra == null) {
                    return false;
                }
                try {
                    webView.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(extra)));
                    return false;
                } catch (ActivityNotFoundException unused) {
                    webView.loadUrl(extra);
                    return false;
                }
            default:
                return super.onCreateWindow(webView, z, z2, message);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        kcv kcvVar;
        switch (this.a) {
            case 0:
                String[] strArr = gld.a;
                permissionRequest.getClass();
                mmo mmoVar = ((fi4) this.b).u;
                if (mmoVar == null) {
                    permissionRequest.deny();
                    break;
                } else {
                    List list = kcv.b;
                    String[] resources = permissionRequest.getResources();
                    resources.getClass();
                    List list2 = kcv.b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list2) {
                        ((lcv) obj).getClass();
                        if (xz0.u(resources, "android.webkit.resource.AUDIO_CAPTURE")) {
                            arrayList.add(obj);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        kcvVar = null;
                    } else {
                        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((lcv) it.next()).getClass();
                            arrayList2.add("android.permission.RECORD_AUDIO");
                        }
                        ArrayList arrayList3 = new ArrayList(arrayList2.size() + 2);
                        arrayList3.addAll(arrayList2);
                        z75.u(arrayList3, strArr);
                        kcvVar = new kcv((String[]) CollectionsKt.w0(CollectionsKt.z0(arrayList3)).toArray(new String[0]));
                    }
                    if (kcvVar == null) {
                        permissionRequest.deny();
                        break;
                    } else {
                        for (int i = 0; i < 2; i++) {
                            if (etn.z((t) mmoVar.d, strArr[i]) != 0) {
                                ((x0) mmoVar.e).Z(kcvVar.a, new kkp(25, this, mmoVar, permissionRequest, kcvVar, false));
                                break;
                            }
                        }
                        permissionRequest.grant(permissionRequest.getResources());
                        break;
                    }
                }
            default:
                super.onPermissionRequest(permissionRequest);
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        switch (this.a) {
            case 1:
                super.onProgressChanged(webView, i);
                dgv dgvVar = (dgv) this.b;
                if (dgvVar == null) {
                    Intrinsics.j("state");
                    throw null;
                }
                if (((lhg) dgvVar.c.getValue()) instanceof fhg) {
                    return;
                }
                dgv dgvVar2 = (dgv) this.b;
                if (dgvVar2 == null) {
                    Intrinsics.j("state");
                    throw null;
                }
                dgvVar2.c.setValue(new jhg(i / 100.0f));
                return;
            case 2:
                ((i) this.b).a.a.f.canGoBack();
                return;
            default:
                super.onProgressChanged(webView, i);
                return;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        switch (this.a) {
            case 1:
                super.onReceivedIcon(webView, bitmap);
                dgv dgvVar = (dgv) this.b;
                if (dgvVar != null) {
                    dgvVar.e.setValue(bitmap);
                    return;
                } else {
                    Intrinsics.j("state");
                    throw null;
                }
            default:
                super.onReceivedIcon(webView, bitmap);
                return;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        switch (this.a) {
            case 1:
                super.onReceivedTitle(webView, str);
                dgv dgvVar = (dgv) this.b;
                if (dgvVar != null) {
                    dgvVar.d.setValue(str);
                    return;
                } else {
                    Intrinsics.j("state");
                    throw null;
                }
            default:
                super.onReceivedTitle(webView, str);
                return;
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        switch (this.a) {
            case 0:
                mmo mmoVar = ((fi4) this.b).u;
                if (mmoVar == null) {
                    return false;
                }
                nnk nnkVar = (nnk) mmoVar.g;
                if (valueCallback == null) {
                    nnkVar.getClass();
                    return false;
                }
                nnkVar.b = valueCallback;
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setType("*/*");
                ((o) nnkVar.a).startActivityForResult(Intent.createChooser(intent, null), 9797);
                return true;
            default:
                return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
    }

    public /* synthetic */ sh4() {
    }

    public sh4(i iVar) {
        this.b = iVar;
    }
}
