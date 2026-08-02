package defpackage;

import android.net.Uri;
import com.yandex.div.json.expressions.Expression;

/* loaded from: classes3.dex */
public final class q6k extends y6k {
    public final bw a;

    public q6k(bw bwVar) {
        this.a = bwVar;
    }

    @Override // defpackage.y6k
    public final boolean handleAction(v3k v3kVar, fpl fplVar, rvo rvoVar) {
        Uri uri;
        Expression expression = v3kVar.k;
        if (expression != null && (uri = (Uri) expression.a(rvoVar)) != null) {
            this.a.a.g(uri);
        }
        return super.handleAction(v3kVar, fplVar, rvoVar);
    }
}
