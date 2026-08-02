package r2;

import D.x;
import android.net.Uri;
import android.os.AsyncTask;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.AbstractC2534Da;
import java.util.Objects;
import java.util.TreeMap;
import s2.C4945n;

/* renamed from: r2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AsyncTaskC4904i extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BinderC4905j f40178a;

    public /* synthetic */ AsyncTaskC4904i(BinderC4905j binderC4905j) {
        Objects.requireNonNull(binderC4905j);
        this.f40178a = binderC4905j;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        BinderC4905j binderC4905j = this.f40178a;
        binderC4905j.getClass();
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) AbstractC2534Da.f25193d.r());
        C4945n c4945n = binderC4905j.f40182w;
        String str = (String) c4945n.f40494x;
        if (str != null) {
            builder.appendQueryParameter(com.anythink.expressad.a.f18391L, str);
        }
        builder.appendQueryParameter("pubId", (String) c4945n.f40492v);
        builder.appendQueryParameter("mappver", (String) c4945n.f40496z);
        TreeMap treeMap = (TreeMap) c4945n.f40493w;
        for (String str2 : treeMap.keySet()) {
            builder.appendQueryParameter(str2, (String) treeMap.get(str2));
        }
        Uri build = builder.build();
        String V32 = binderC4905j.V3();
        String encodedQuery = build.getEncodedQuery();
        return x.p(new StringBuilder(V32.length() + 1 + String.valueOf(encodedQuery).length()), V32, "#", encodedQuery);
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        WebView webView = this.f40178a.f40183x;
        String str = (String) obj;
        if (webView == null || str == null) {
            return;
        }
        webView.loadUrl(str);
    }
}
