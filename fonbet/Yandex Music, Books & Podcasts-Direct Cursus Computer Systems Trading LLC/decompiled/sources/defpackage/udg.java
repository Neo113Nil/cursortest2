package defpackage;

import android.net.Uri;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* loaded from: classes6.dex */
public final class udg implements k6e {
    public final k6e a;
    public boolean b;
    public final /* synthetic */ vdg c;

    public udg(vdg vdgVar, k6e k6eVar) {
        k6eVar.getClass();
        this.c = vdgVar;
        this.a = k6eVar;
        this.b = true;
    }

    @Override // defpackage.db7
    public final long a(nb7 nb7Var) {
        nb7Var.getClass();
        this.b = true;
        Uri uri = nb7Var.a;
        if (dvt.Q(uri) == 0) {
            if (uri.getQueryParameter("t") != null) {
                Uri.Builder buildUpon = uri.buildUpon();
                buildUpon.clearQuery();
                for (String str : uri.getQueryParameterNames()) {
                    if (!str.equals("t")) {
                        Iterator<String> it = uri.getQueryParameters(str).iterator();
                        while (it.hasNext()) {
                            buildUpon.appendQueryParameter(str, it.next());
                        }
                    }
                }
                Uri build = buildUpon.build();
                build.getClass();
                Uri build2 = build.buildUpon().appendQueryParameter("t", String.valueOf(System.currentTimeMillis())).build();
                mb7 a = nb7Var.a();
                a.a = build2;
                nb7Var = a.a();
            }
            String str2 = this.c.c;
            if (str2 != null) {
                mb7 a2 = nb7Var.a();
                Map map = nb7Var.e;
                map.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                linkedHashMap.put("X-Strm-Session", str2);
                a2.e = linkedHashMap;
                nb7Var = a2.a();
            }
        }
        return this.a.a(nb7Var);
    }

    @Override // defpackage.k6e, defpackage.db7
    public final Map b() {
        return this.a.b();
    }

    @Override // defpackage.db7
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.db7
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.db7
    public final void q(t6t t6tVar) {
        t6tVar.getClass();
        this.a.q(t6tVar);
    }

    @Override // defpackage.ma7
    public final int read(byte[] bArr, int i, int i2) {
        Uri uri;
        bArr.getClass();
        boolean z = this.b;
        k6e k6eVar = this.a;
        if (z && (uri = k6eVar.getUri()) != null) {
            if (dvt.Q(uri) == 0) {
                List list = (List) k6eVar.b().get("X-Strm-Session");
                String X = list != null ? CollectionsKt.X(list, null, null, null, null, 63) : null;
                if (X != null) {
                    this.c.c = X;
                }
            }
            this.b = false;
        }
        return k6eVar.read(bArr, i, i2);
    }
}
