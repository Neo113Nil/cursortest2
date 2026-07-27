package p2;

import D.y;
import android.net.Uri;
import android.os.AsyncTask;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.AbstractC4283za;
import java.util.Objects;
import java.util.TreeMap;
import q2.C4903n;

/* loaded from: classes.dex */
public final class h extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f39790a;

    public /* synthetic */ h(i iVar) {
        Objects.requireNonNull(iVar);
        this.f39790a = iVar;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        i iVar = this.f39790a;
        iVar.getClass();
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) AbstractC4283za.f35553d.r());
        C4903n c4903n = iVar.f39794w;
        String str = (String) c4903n.f40104x;
        if (str != null) {
            builder.appendQueryParameter(com.anythink.expressad.a.f17762L, str);
        }
        builder.appendQueryParameter("pubId", (String) c4903n.f40102v);
        builder.appendQueryParameter("mappver", (String) c4903n.f40106z);
        TreeMap treeMap = (TreeMap) c4903n.f40103w;
        for (String str2 : treeMap.keySet()) {
            builder.appendQueryParameter(str2, (String) treeMap.get(str2));
        }
        Uri build = builder.build();
        String H32 = iVar.H3();
        String encodedQuery = build.getEncodedQuery();
        return y.o(new StringBuilder(H32.length() + 1 + String.valueOf(encodedQuery).length()), H32, "#", encodedQuery);
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        WebView webView = this.f39790a.f39795x;
        String str = (String) obj;
        if (webView == null || str == null) {
            return;
        }
        webView.loadUrl(str);
    }
}
