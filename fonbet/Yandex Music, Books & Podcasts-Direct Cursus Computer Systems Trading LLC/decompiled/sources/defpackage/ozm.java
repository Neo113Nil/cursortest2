package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class ozm {
    public final cwf a;

    public ozm(Function0 function0) {
        this.a = new cwf(function0);
    }

    public abstract qzm a(Object obj);

    public vwt b() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final vwt c(qzm qzmVar, vwt vwtVar) {
        yxa yxaVar = null;
        if (vwtVar instanceof yxa) {
            if (qzmVar.d) {
                yxaVar = (yxa) vwtVar;
                yxaVar.a.setValue(qzmVar.a());
            }
        } else if (vwtVar instanceof bgr) {
            if ((qzmVar.b || qzmVar.e != null) && !qzmVar.d) {
                bgr bgrVar = (bgr) vwtVar;
                if (Intrinsics.d(qzmVar.a(), bgrVar.a)) {
                    yxaVar = bgrVar;
                }
            }
        } else if (vwtVar instanceof rs5) {
            qzmVar.getClass();
        }
        if (yxaVar != null) {
            return yxaVar;
        }
        if (!qzmVar.d) {
            return new bgr(qzmVar.a());
        }
        Object obj = qzmVar.e;
        n2r n2rVar = qzmVar.c;
        if (n2rVar == null) {
            n2rVar = ehv.h;
        }
        return new yxa(new x6k(obj, n2rVar));
    }
}
