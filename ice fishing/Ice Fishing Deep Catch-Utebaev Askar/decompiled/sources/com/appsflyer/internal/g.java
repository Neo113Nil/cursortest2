package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.webkit.WebView;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.UnsupportedEncodingException;
import kotlin.Pair;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f83b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f84c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f85d;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, int i2) {
        this.f82a = i2;
        this.f83b = obj;
        this.f84c = obj2;
        this.f85d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() throws UnsupportedEncodingException {
        int i2 = this.f82a;
        Object obj = this.f85d;
        Object obj2 = this.f84c;
        Object obj3 = this.f83b;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((AFb1rSDK) obj3).i_((Context) obj2, (Intent) obj);
                break;
            case 1:
                AFd1iSDK.AFAdRevenueData((AFd1iSDK) obj3, (Throwable) obj2, (String) obj);
                break;
            case 2:
                ((AFj1uSDK) obj3).getMediationNetwork((AFi1eSDK) obj2, (Runnable) obj);
                break;
            default:
                WebView view = (WebView) obj3;
                String url = (String) obj2;
                String referer = (String) obj;
                int i3 = com.protoclaw.airfishing.d.f111b;
                Intrinsics.checkNotNullParameter(view, "$view");
                Intrinsics.checkNotNullParameter(url, "$url");
                Intrinsics.checkNotNullParameter(referer, "$referer");
                view.loadUrl(url, c0.b(new Pair("Referer", referer)));
                break;
        }
    }
}
