package defpackage;

/* loaded from: classes.dex */
public final class ui {
    public final defpackage.g9 IHQe1A4L2xu;
    public final defpackage.bb oh6vYeIP;

    public ui(defpackage.g9 g9Var, defpackage.bb bbVar) {
        this.IHQe1A4L2xu = g9Var;
        this.oh6vYeIP = bbVar;
    }

    public final java.lang.String toString() {
        defpackage.bb bbVar = this.oh6vYeIP;
        defpackage.qj qjVar = (defpackage.qj) bbVar.riuEU0zW4.cnag84Bm(defpackage.qj.AARZUJiTa);
        java.lang.String str = qjVar != null ? qjVar.xiZrDbcSW0 : null;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Request@");
        int hashCode = hashCode();
        defpackage.x70.G3OKOH3wZRC(16);
        java.lang.String num = java.lang.Integer.toString(hashCode, 16);
        num.getClass();
        sb.append(num);
        sb.append(str != null ? defpackage.fx0.ez2rX8ReCYw("[", str, "](") : "(");
        sb.append("currentBounds()=");
        sb.append(this.IHQe1A4L2xu.IHQe1A4L2xu());
        sb.append(", continuation=");
        sb.append(bbVar);
        sb.append(')');
        return sb.toString();
    }
}
