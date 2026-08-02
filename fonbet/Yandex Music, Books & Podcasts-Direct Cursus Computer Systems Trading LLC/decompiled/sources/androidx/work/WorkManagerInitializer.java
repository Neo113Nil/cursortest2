package androidx.work;

import android.content.Context;
import defpackage.g4w;
import defpackage.jsg;
import defpackage.lme;
import defpackage.qxp;
import defpackage.r46;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements lme {
    public static final String a = jsg.n("WrkMgrInitializer");

    @Override // defpackage.lme
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.lme
    public final Object create(Context context) {
        jsg.j().e(a, "Initializing WorkManager with default configuration.");
        r46 r46Var = new r46(new qxp());
        context.getClass();
        g4w.e(context, r46Var);
        g4w d = g4w.d(context);
        d.getClass();
        return d;
    }
}
