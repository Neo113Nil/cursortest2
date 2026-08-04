package com.protoclaw.airfishing;

import android.content.SharedPreferences;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.m;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.o;

/* JADX INFO: loaded from: classes.dex */
public final class d extends WebViewClient {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f111b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f112a;

    public d(MainActivity mainActivity) {
        this.f112a = mainActivity;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView view, String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        super.onPageFinished(view, url);
        MainActivity mainActivity = this.f112a;
        String str = mainActivity.privacyCanon;
        if (str == null || o.d(url, "file://") || Intrinsics.a(a.c.a(url), str)) {
            return;
        }
        Intrinsics.checkNotNullParameter(url, "url");
        String[] elements = {"bundle", "afid", "devkey"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setC = m.c(elements);
        try {
            Uri uri = Uri.parse(url);
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
            ArrayList<String> arrayList = new ArrayList();
            for (Object obj : queryParameterNames) {
                if (!setC.contains((String) obj)) {
                    arrayList.add(obj);
                }
            }
            for (String str2 : arrayList) {
                builderClearQuery.appendQueryParameter(str2, uri.getQueryParameter(str2));
            }
            String string = builderClearQuery.build().toString();
            Intrinsics.b(string);
            url = string;
        } catch (Exception unused) {
        }
        SharedPreferences sharedPreferences = a.c.f14c;
        if (sharedPreferences == null) {
            Intrinsics.e("sp");
            throw null;
        }
        sharedPreferences.edit().putString("dl_v", url).apply();
        mainActivity.privacyCanon = null;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        String string = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        Intrinsics.checkNotNullParameter(string, "<this>");
        Intrinsics.checkNotNullParameter("screen-main.html", "suffix");
        boolean zEndsWith = string.endsWith("screen-main.html");
        MainActivity mainActivity = this.f112a;
        if (!zEndsWith) {
            if (o.d(string, "file://")) {
                return false;
            }
            String url = view.getUrl();
            if (url == null) {
                url = "";
            }
            mainActivity.handler.postDelayed(new com.appsflyer.internal.g(view, string, url, 3), 500L);
            return true;
        }
        SharedPreferences sharedPreferences = a.c.f14c;
        if (sharedPreferences == null) {
            Intrinsics.e("sp");
            throw null;
        }
        boolean z = sharedPreferences.getBoolean("st_f", false);
        mainActivity.shwLdr();
        if (z) {
            return false;
        }
        mainActivity.shwCntnt(view);
        return true;
    }
}
