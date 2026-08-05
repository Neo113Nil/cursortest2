package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class a7 {
    public final el MdtA4re8;
    public final i3 NCTxEWno;
    public final Throwable VgvYg0wo;
    public final Object qoPGr6Ce;
    public final Object wxUZMvaN;

    public /* synthetic */ a7(Object obj, i3 i3Var, el elVar, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : i3Var, (i & 4) != 0 ? null : elVar, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static a7 qoPGr6Ce(a7 a7Var, i3 i3Var, CancellationException cancellationException, int i) {
        Object obj = a7Var.qoPGr6Ce;
        if ((i & 2) != 0) {
            i3Var = a7Var.NCTxEWno;
        }
        i3 i3Var2 = i3Var;
        el elVar = a7Var.MdtA4re8;
        Object obj2 = a7Var.wxUZMvaN;
        CancellationException cancellationException2 = cancellationException;
        if ((i & 16) != 0) {
            cancellationException2 = a7Var.VgvYg0wo;
        }
        return new a7(obj, i3Var2, elVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7)) {
            return false;
        }
        a7 a7Var = (a7) obj;
        return fn.qoPGr6Ce(this.qoPGr6Ce, a7Var.qoPGr6Ce) && fn.qoPGr6Ce(this.NCTxEWno, a7Var.NCTxEWno) && fn.qoPGr6Ce(this.MdtA4re8, a7Var.MdtA4re8) && fn.qoPGr6Ce(this.wxUZMvaN, a7Var.wxUZMvaN) && fn.qoPGr6Ce(this.VgvYg0wo, a7Var.VgvYg0wo);
    }

    public final int hashCode() {
        Object obj = this.qoPGr6Ce;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        i3 i3Var = this.NCTxEWno;
        int hashCode2 = (hashCode + (i3Var == null ? 0 : i3Var.hashCode())) * 31;
        el elVar = this.MdtA4re8;
        int hashCode3 = (hashCode2 + (elVar == null ? 0 : elVar.hashCode())) * 31;
        Object obj2 = this.wxUZMvaN;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.VgvYg0wo;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.qoPGr6Ce + ", cancelHandler=" + this.NCTxEWno + ", onCancellation=" + this.MdtA4re8 + ", idempotentResume=" + this.wxUZMvaN + ", cancelCause=" + this.VgvYg0wo + ')';
    }

    public a7(Object obj, i3 i3Var, el elVar, Object obj2, Throwable th) {
        this.qoPGr6Ce = obj;
        this.NCTxEWno = i3Var;
        this.MdtA4re8 = elVar;
        this.wxUZMvaN = obj2;
        this.VgvYg0wo = th;
    }
}
