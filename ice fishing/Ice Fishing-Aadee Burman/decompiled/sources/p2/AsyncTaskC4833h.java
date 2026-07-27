package p2;

import D.y;
import android.net.Uri;
import android.os.AsyncTask;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.AbstractC2514Da;
import java.util.Objects;
import java.util.TreeMap;
import q2.C4896n;

/* renamed from: p2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AsyncTaskC4833h extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BinderC4834i f39722a;

    public /* synthetic */ AsyncTaskC4833h(BinderC4834i binderC4834i) {
        Objects.requireNonNull(binderC4834i);
        this.f39722a = binderC4834i;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        BinderC4834i binderC4834i = this.f39722a;
        binderC4834i.getClass();
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) AbstractC2514Da.f24446d.r());
        C4896n c4896n = binderC4834i.f39726w;
        String str = (String) c4896n.f40192x;
        if (str != null) {
            builder.appendQueryParameter(com.anythink.expressad.a.f17604L, str);
        }
        builder.appendQueryParameter("pubId", (String) c4896n.f40190v);
        builder.appendQueryParameter("mappver", (String) c4896n.f40194z);
        TreeMap treeMap = (TreeMap) c4896n.f40191w;
        for (String str2 : treeMap.keySet()) {
            builder.appendQueryParameter(str2, (String) treeMap.get(str2));
        }
        Uri build = builder.build();
        String V32 = binderC4834i.V3();
        String encodedQuery = build.getEncodedQuery();
        return y.s(new StringBuilder(V32.length() + 1 + String.valueOf(encodedQuery).length()), V32, "#", encodedQuery);
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        WebView webView = this.f39722a.f39727x;
        String str = (String) obj;
        if (webView == null || str == null) {
            return;
        }
        webView.loadUrl(str);
    }
}
