package defpackage;

import android.content.Context;
import com.yandex.go.payments.shared.family.postcard.ui.PostcardView;
import com.yandex.go.payments.shared.family.postcard.ui.a;
import com.yandex.go.payments.shared.family.web.nativeapi.request.PostcardParams;
import java.util.HashMap;

/* loaded from: classes13.dex */
public final class wfe0 {
    public final a a;
    public final w030 b;
    public final Context c;
    public final z9p d;

    public wfe0(a aVar, w030 w030Var, Context context, z9p z9pVar) {
        this.a = aVar;
        this.b = w030Var;
        this.c = context;
        this.d = z9pVar;
    }

    public final void a(String str, PostcardParams postcardParams, kbp kbpVar) {
        ugd0 ugd0Var = new ugd0(2, kbpVar, str);
        a aVar = this.a;
        aVar.D = ugd0Var;
        this.b.k(new PostcardView(this.c, aVar, postcardParams), 3.0f, true);
        y9p y9pVar = this.d.c;
        y9pVar.a.a("FamilyAccount.CreateInvitationPostCard.Shown", tse0.n(y9pVar), 1, new HashMap());
    }
}
