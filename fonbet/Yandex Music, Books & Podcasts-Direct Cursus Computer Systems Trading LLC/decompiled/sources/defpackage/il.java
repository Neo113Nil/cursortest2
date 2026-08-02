package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class il {
    public final mqs a;
    public final dl b;
    public final el c;
    public final xdr d;
    public final ArrayList e;
    public final HashMap f;
    public final LinkedHashSet g;

    public il(mqs mqsVar, dl dlVar, el elVar, mm6 mm6Var) {
        mqsVar.getClass();
        elVar.getClass();
        this.a = mqsVar;
        this.b = dlVar;
        this.c = elVar;
        this.d = ydr.a(kl.a);
        this.e = new ArrayList();
        this.f = new HashMap();
        this.g = new LinkedHashSet();
        x97.y(mm6Var, dm6.b, null, new l5(this, (Continuation) null, 8), 2);
    }

    public static bxl a(evl evlVar, boolean z) {
        String e = evlVar.a.e();
        cvl cvlVar = evlVar.a;
        return new bxl(e, cvlVar.b, vz1.w(op7.c(cvlVar).a), z);
    }
}
