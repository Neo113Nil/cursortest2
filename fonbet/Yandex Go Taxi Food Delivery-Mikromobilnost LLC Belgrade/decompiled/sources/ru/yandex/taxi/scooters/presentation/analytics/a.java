package ru.yandex.taxi.scooters.presentation.analytics;

import android.net.Uri;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.ny61;
import defpackage.odn0;
import defpackage.x770;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.domain.q;

/* loaded from: classes6.dex */
public final class a {
    public final x770 a;
    public final q b;

    public a(x770 x770Var, q qVar) {
        this.a = x770Var;
        this.b = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Uri uri, ContinuationImpl continuationImpl) {
        ScootersUriAnalytics$uriOpened$1 scootersUriAnalytics$uriOpened$1;
        int i;
        String uri2;
        String X;
        String str;
        if (continuationImpl instanceof ScootersUriAnalytics$uriOpened$1) {
            scootersUriAnalytics$uriOpened$1 = (ScootersUriAnalytics$uriOpened$1) continuationImpl;
            int i2 = scootersUriAnalytics$uriOpened$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersUriAnalytics$uriOpened$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersUriAnalytics$uriOpened$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersUriAnalytics$uriOpened$1.label;
                if (i != 0) {
                    b.b(obj);
                    scootersUriAnalytics$uriOpened$1.L$0 = uri;
                    scootersUriAnalytics$uriOpened$1.label = 1;
                    obj = this.b.p(uri, scootersUriAnalytics$uriOpened$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uri = (Uri) scootersUriAnalytics$uriOpened$1.L$0;
                    b.b(obj);
                }
                odn0 odn0Var = (odn0) obj;
                uri2 = uri.toString();
                X = odn0Var == null ? kotlin.collections.a.X(odn0Var.f, ",", null, null, null, 62) : null;
                if (X == null) {
                    X = "";
                }
                str = odn0Var != null ? odn0Var.g : null;
                x770 x770Var = this.a;
                x770Var.getClass();
                HashMap hashMap = new HashMap();
                if (str != null) {
                    hashMap.put("scooters_campaign", str);
                }
                hashMap.put("scooters_source", X);
                if (uri2 != null) {
                    hashMap.put(LaunchBrowserActivity.KEY_URI, uri2);
                }
                x770Var.a.a("ScootersURI.Opened", hashMap, 1, new HashMap());
                return zy11.a;
            }
        }
        scootersUriAnalytics$uriOpened$1 = new ScootersUriAnalytics$uriOpened$1(this, continuationImpl);
        Object obj2 = scootersUriAnalytics$uriOpened$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersUriAnalytics$uriOpened$1.label;
        if (i != 0) {
        }
        odn0 odn0Var2 = (odn0) obj2;
        uri2 = uri.toString();
        if (odn0Var2 == null) {
        }
        if (X == null) {
        }
        if (odn0Var2 != null) {
        }
        x770 x770Var2 = this.a;
        x770Var2.getClass();
        HashMap hashMap2 = new HashMap();
        if (str != null) {
        }
        hashMap2.put("scooters_source", X);
        if (uri2 != null) {
        }
        x770Var2.a.a("ScootersURI.Opened", hashMap2, 1, new HashMap());
        return zy11.a;
    }
}
