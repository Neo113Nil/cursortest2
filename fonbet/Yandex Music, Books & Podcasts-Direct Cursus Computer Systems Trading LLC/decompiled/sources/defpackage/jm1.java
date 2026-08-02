package defpackage;

import android.content.Context;
import android.net.Uri;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.text.StringsKt__StringsKt;
import ru.yandex.music.R;
import ru.yandex.music.utils.Preconditions;

/* loaded from: classes6.dex */
public final class jm1 extends pu2 {
    public final /* synthetic */ int f;
    public final jyr g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm1(int i) {
        super(true, f8g.A(), true);
        this.f = i;
        switch (i) {
            case 1:
                super(true, f8g.A(), true);
                this.g = btf.b(new uf3(24));
                break;
            case 2:
                super(false, false, false);
                this.g = l18.b.b(hag.I(c9k.class), true);
                break;
            case 3:
                super(true, f8g.A(), true);
                this.g = l18.b.b(hag.I(b8u.class), true);
                break;
            default:
                this.g = l18.b.b(hag.I(z91.class), true);
                break;
        }
    }

    @Override // defpackage.pu2
    public final kqt b(Context context, ypt yptVar) {
        Continuation continuation = null;
        switch (this.f) {
            case 0:
                im1 im1Var = (im1) yptVar;
                im1Var.getClass();
                String a = im1Var.a(im1Var.b());
                if (a == null) {
                    xq0.x("No artistId provided");
                    return null;
                }
                if (xv7.C(a)) {
                    return new kqt(im1Var, (u51) x97.D(g.a, new l5(this, a, null, 27)));
                }
                xq0.x(hrg.q("Invalid artistId=(", a, ") provided"));
                return null;
            case 1:
                qg4 qg4Var = (qg4) yptVar;
                pf4 pf4Var = (pf4) this.g.getValue();
                pf4Var.getClass();
                rj6 rj6Var = (rj6) x97.D(g.a, new ja4(pf4Var, null, 1));
                if (rj6Var instanceof qj6) {
                    return new kqt(qg4Var, (qe4) ((qj6) rj6Var).a);
                }
                if (rj6Var instanceof nj6) {
                    return new kqt(qg4Var, 5);
                }
                throw ((pj6) rj6Var).a();
            case 2:
                g2c g2cVar = (g2c) yptVar;
                g2cVar.getClass();
                boolean z = g2cVar.b;
                String str = g2cVar.a;
                if (!z) {
                    ssg.a(7, null, "Unsupported deeplink url: " + Uri.parse(str), null);
                    return !((frt) Preconditions.nonNull(this.a)).c().a() ? new kqt(g2cVar, 3) : new kqt(g2cVar, 5);
                }
                String uri = Uri.parse(str).toString();
                uri.getClass();
                hag.x(context, R.string.external_auth_toast, 1);
                String str2 = (String) x97.D(g.a, new fzb(this, uri, (Continuation) null, 1));
                if (str2 != null) {
                    uri = str2;
                }
                return new kqt(new g2c(uri, z, g2cVar.c));
            default:
                dau dauVar = (dau) yptVar;
                dauVar.getClass();
                String Q = dauVar.Q("ids");
                List split$default = Q != null ? StringsKt__StringsKt.split$default(Q, new String[]{StringUtils.COMMA}, false, 0, 6, null) : null;
                if (split$default == null) {
                    split$default = c5b.a;
                }
                List list = (List) x97.D(g.a, new h0t(split$default, this, continuation, 8));
                return (split$default.isEmpty() || !list.isEmpty()) ? new kqt(dauVar, list) : new kqt(dauVar, 5);
        }
    }
}
