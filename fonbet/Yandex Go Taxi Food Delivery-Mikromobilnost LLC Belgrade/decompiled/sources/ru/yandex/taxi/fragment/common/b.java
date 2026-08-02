package ru.yandex.taxi.fragment.common;

import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebChromeClient;
import defpackage.a60;
import defpackage.jst;
import defpackage.nbh;
import defpackage.ny61;
import defpackage.pwf0;
import defpackage.pzt0;
import defpackage.r40;
import defpackage.tje;
import defpackage.tse;
import defpackage.v7j0;
import defpackage.xby;
import defpackage.y50;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.cprocsp.NGate.tools.Constants;
import ru.yandex.taxi.activity.g;
import ru.yandex.taxi.fragment.common.BaseWebChromeClient;

/* loaded from: classes5.dex */
public final class b implements a {
    public final tse a;
    public final y50 b;
    public final g c;
    public final v7j0 d;
    public pzt0 e;

    public b(tse tseVar, y50 y50Var, g gVar, v7j0 v7j0Var) {
        this.a = tseVar;
        this.b = y50Var;
        this.c = gVar;
        this.d = v7j0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, nbh nbhVar, ContinuationImpl continuationImpl) {
        DefaultFileChooserHandler$ensureReadPermission$1 defaultFileChooserHandler$ensureReadPermission$1;
        int i;
        bVar.getClass();
        if (continuationImpl instanceof DefaultFileChooserHandler$ensureReadPermission$1) {
            defaultFileChooserHandler$ensureReadPermission$1 = (DefaultFileChooserHandler$ensureReadPermission$1) continuationImpl;
            int i2 = defaultFileChooserHandler$ensureReadPermission$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                defaultFileChooserHandler$ensureReadPermission$1.label = i2 - Integer.MIN_VALUE;
                Object obj = defaultFileChooserHandler$ensureReadPermission$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = defaultFileChooserHandler$ensureReadPermission$1.label;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nbh nbhVar2 = (nbh) defaultFileChooserHandler$ensureReadPermission$1.L$0;
                    kotlin.b.b(obj);
                    return nbhVar2;
                }
                kotlin.b.b(obj);
                if (nbhVar.b) {
                    v7j0 v7j0Var = bVar.d;
                    defaultFileChooserHandler$ensureReadPermission$1.L$0 = nbhVar;
                    defaultFileChooserHandler$ensureReadPermission$1.label = 1;
                    if (((com.yandex.go.permission.b) v7j0Var).d(7, defaultFileChooserHandler$ensureReadPermission$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return nbhVar;
            }
        }
        defaultFileChooserHandler$ensureReadPermission$1 = new DefaultFileChooserHandler$ensureReadPermission$1(bVar, continuationImpl);
        Object obj2 = defaultFileChooserHandler$ensureReadPermission$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultFileChooserHandler$ensureReadPermission$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final nbh b(b bVar, r40 r40Var, Uri uri) {
        Uri[] uriArr;
        bVar.getClass();
        int i = r40Var.a;
        Intent intent = r40Var.c;
        boolean z = false;
        if (i == -1 && intent != null) {
            ClipData clipData = intent.getClipData();
            if (clipData != null) {
                int itemCount = clipData.getItemCount();
                uriArr = new Uri[itemCount];
                for (int i2 = 0; i2 < itemCount; i2++) {
                    uriArr[i2] = clipData.getItemAt(i2).getUri();
                }
            } else if (intent.getData() != null) {
                uriArr = WebChromeClient.FileChooserParams.parseResult(i, intent);
            }
            if (uriArr == null && r40Var.a == -1 && uri != null) {
                uriArr = new Uri[]{uri};
            }
            if (uriArr != null) {
                boolean z2 = false;
                for (Uri uri2 : uriArr) {
                    if ("file".equals(uri2.getScheme())) {
                        xby.l(jst.e, "WebViewFileChooser", null, null, "Unexpected uri scheme: file, throwable = instead of expected: content", 6);
                        z2 = true;
                    }
                }
                z = z2;
            }
            return new nbh(uriArr, z);
        }
        uriArr = null;
        if (uriArr == null) {
            uriArr = new Uri[]{uri};
        }
        if (uriArr != null) {
        }
        return new nbh(uriArr, z);
    }

    public final Object c(ContinuationImpl continuationImpl) {
        return ((com.yandex.go.permission.b) this.d).d(3, continuationImpl);
    }

    public final boolean d(Intent intent, Uri uri, BaseWebChromeClient.a aVar) {
        pzt0 pzt0Var = this.e;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        try {
            a60 a60Var = (a60) this.b;
            a60Var.getClass();
            try {
                a60Var.e(Constants.VPN_TRAFFIC, intent);
            } catch (ActivityNotFoundException unused) {
            }
            this.e = tje.N(this.a, null, null, new DefaultFileChooserHandler$startActivityForResult$1(this, uri, (BaseWebChromeClient.a) pwf0.e(BaseWebChromeClient.a.class, aVar), null), 3);
            return true;
        } catch (Exception e) {
            jst.e.k(e, "Failed to start file chooser for intent");
            return false;
        }
    }
}
