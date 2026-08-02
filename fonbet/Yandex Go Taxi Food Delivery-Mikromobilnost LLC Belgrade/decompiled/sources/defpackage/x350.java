package defpackage;

import android.net.Uri;
import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.home.feature.webviews.internal.container.b;
import kotlin.Result;

/* loaded from: classes2.dex */
public final class x350 extends iz4 {
    public final v920 f;
    public final b g;

    public x350(v920 v920Var, b bVar, jse jseVar) {
        super(jseVar, new v350());
        this.f = v920Var;
        this.g = bVar;
    }

    public final void k(String str) {
        Object j = this.f.j(Uri.parse(str));
        if (!(j instanceof Result.Failure)) {
            skd0.b(PlusLogTag.URL, "openLegalUrl(" + str + ')');
            b.b(this.g, (vzg) j, true, null, null, null, null, 60);
        }
        Throwable a = Result.a(j);
        if (a != null) {
            skd0.c(PlusLogTag.URL, "openLegalUrl(" + str + ')', a);
        }
    }
}
