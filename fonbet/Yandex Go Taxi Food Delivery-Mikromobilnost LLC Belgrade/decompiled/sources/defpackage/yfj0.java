package defpackage;

import android.content.Context;
import ru.yandex.taxi.requirements.repository.e;
import ru.yandex.taxi.ui.RequirementDetailsModalView;

/* loaded from: classes6.dex */
public final class yfj0 {
    public final Context a;
    public final i130 b;
    public final ufj0 c;
    public final f580 d;
    public final nfj0 e;

    public yfj0(Context context, i130 i130Var, ufj0 ufj0Var, f580 f580Var, nfj0 nfj0Var) {
        this.a = context;
        this.b = i130Var;
        this.c = ufj0Var;
        this.d = f580Var;
        this.e = nfj0Var;
    }

    public final void a(String str, String str2) {
        this.e.getClass();
        fcj0 fcj0Var = this.c.a;
        this.b.a().s(new RequirementDetailsModalView(this.a, new tfj0(str, (ggj0) ((xvf0) fcj0Var.a).get(), (e) ((s3f0) fcj0Var.b).get(), (uq1) ((xvf0) fcj0Var.c).get(), (i130) ((xvf0) fcj0Var.d).get(), (zuj0) ((xvf0) fcj0Var.e).get()), this.d, str2), true);
    }
}
