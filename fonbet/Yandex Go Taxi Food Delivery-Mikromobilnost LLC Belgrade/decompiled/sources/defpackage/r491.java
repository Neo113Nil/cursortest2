package defpackage;

import java.util.HashSet;

/* loaded from: classes.dex */
public final class r491 extends sab1 {
    public Long A;
    public Long B;
    public String x;
    public HashSet y;
    public w53 z;

    @Override // defpackage.sab1
    public final void Jg() {
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final java.util.ArrayList Kg(java.lang.String r41, java.util.List r42, java.util.List r43, java.lang.Long r44, java.lang.Long r45, boolean r46) {
        /*
            Method dump skipped, instructions count: 2775
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r491.Kg(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long, boolean):java.util.ArrayList");
    }

    public final zvb1 Lg(Integer num) {
        if (this.z.containsKey(num)) {
            return (zvb1) this.z.get(num);
        }
        zvb1 zvb1Var = new zvb1(this, this.x);
        this.z.put(num, zvb1Var);
        return zvb1Var;
    }
}
