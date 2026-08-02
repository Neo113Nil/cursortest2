package defpackage;

import coil3.request.NullRequestDataException;

/* loaded from: classes.dex */
public abstract class ux21 {
    public static final m9o a(gev gevVar, Throwable th) {
        q7v q7vVar;
        if (th instanceof NullRequestDataException) {
            tls tlsVar = gevVar.p;
            cev cevVar = gevVar.v;
            q7vVar = (q7v) tlsVar.invoke(gevVar);
            if (q7vVar == null) {
                q7vVar = (q7v) cevVar.j.invoke(gevVar);
            }
            if (q7vVar == null && (q7vVar = (q7v) gevVar.o.invoke(gevVar)) == null) {
                q7vVar = (q7v) cevVar.i.invoke(gevVar);
            }
        } else {
            q7vVar = (q7v) gevVar.o.invoke(gevVar);
            if (q7vVar == null) {
                q7vVar = (q7v) gevVar.v.i.invoke(gevVar);
            }
        }
        return new m9o(q7vVar, gevVar, th);
    }
}
